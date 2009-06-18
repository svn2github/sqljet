/*
 * SqlParser.g
 * Copyright (C) 2009 TMate Software Ltd
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * @author TMate Software Ltd.
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
parser grammar SqlParser;

options {
	language = Java;
	output = AST;
	k = 4;
	tokenVocab = SqlLexer;
}

tokens {
	ALIAS; // replaces AS
	BIND; // bind parameter, maybe with position
	BIND_NAME; // bind parameter by name
	BLOB_LITERAL;
	COLUMN_CONSTRAINT; // root for column_constraint
	COLUMN_EXPRESSION;
	COLUMNS;
	CONSTRAINTS; // groups all constraints
	CREATE_INDEX;
	CREATE_TABLE;
	DROP_INDEX;
	DROP_TABLE;
	FLOAT_LITERAL;
	FUNCTION_LITERAL;
	FUNCTION_EXPRESSION;
	INTEGER_LITERAL;
	IS_NULL;
	IN_VALUES;
	IN_TABLE;
	NOT_NULL;
	OPTIONS;
	ORDERING; // root for ordering_term
	SELECT_CORE; // root for simple select statement, part of a compound select
	STRING_LITERAL;
	TABLE_CONSTRAINT; // root for table constraint
	TYPE; // root for type_name
	TYPE_PARAMS; // root for numbers in type_name
}

@header {
  package org.tmatesoft.sqljet.core.internal.lang;
}

// Input is a list of statements.
sql_stmt_list: (sql_stmt)+;

sql_stmt: (EXPLAIN (QUERY PLAN)?)? sql_stmt_core SEMI!;

sql_stmt_core
  : pragma_stmt
  | attach_stmt
  | detach_stmt
  | analyze_stmt
  | reindex_stmt
  | vacuum_stmt
  
  | select_stmt
  | insert_stmt
  | update_stmt
  | delete_stmt
  | begin_stmt
  | commit_stmt
  | rollback_stmt
  | savepoint_stmt
  | release_stmt
  
  | create_virtual_table_stmt
  | create_table_stmt
  | drop_table_stmt
  | alter_table_stmt
  | create_view_stmt
  | drop_view_stmt
  | create_index_stmt
  | drop_index_stmt
  | create_trigger_stmt
  | drop_trigger_stmt
  ;

qualified_table_name: (database_name=id DOT)? table_name=id (INDEXED BY index_name=id | NOT INDEXED)?;

signed_number: (PLUS | MINUS)? (INTEGER | FLOAT);

expr: or_subexpr (OR^ or_subexpr)*;

or_subexpr: and_subexpr (AND^ and_subexpr)*;

and_subexpr: eq_subexpr cond_expr^?;

cond_expr
  : NOT? match_op match_expr=eq_subexpr (ESCAPE escape_expr=eq_subexpr)? -> ^(match_op $match_expr NOT? ^(ESCAPE $escape_expr)?)
  | NOT? IN LPAREN expr (COMMA expr)* RPAREN -> ^(IN_VALUES NOT? ^(IN expr+))
  | NOT? IN (database_name=id DOT)? table_name=id -> ^(IN_TABLE NOT? ^(IN ^($table_name $database_name?)))
// query is not supported for now
//  | NOT? IN^ LPAREN! select_stmt? RPAREN!
  | (ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL)
  | NOT? BETWEEN e1=eq_subexpr AND e2=eq_subexpr -> ^(BETWEEN NOT? ^(AND $e1 $e2))
  | ((EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2)^ eq_subexpr)+ /* order of the eq subexpressions is reversed! */
  ;

match_op: LIKE | GLOB | REGEXP | MATCH;

eq_subexpr: neq_subexpr ((LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ)^ neq_subexpr)*;

neq_subexpr: bit_subexpr ((SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE)^ bit_subexpr)*;

bit_subexpr: add_subexpr ((PLUS | MINUS)^ add_subexpr)*;

add_subexpr: mul_subexpr ((ASTERISK | SLASH | PERCENT)^ mul_subexpr)*;

mul_subexpr: con_subexpr (DOUBLE_PIPE^ con_subexpr)*;

con_subexpr: unary_subexpr | unary_op unary_subexpr -> ^(unary_op unary_subexpr);

unary_op: PLUS | MINUS | TILDA | NOT;

unary_subexpr: atom_expr (COLLATE^ collation_name=ID)?;

atom_expr
  : literal_value
  | bind_parameter
  | ((database_name=id DOT)? table_name=id DOT)? column_name=ID -> ^(COLUMN_EXPRESSION ^($column_name ^($table_name $database_name?)?))
  | name=ID LPAREN (DISTINCT? args+=expr (COMMA args+=expr)* | ASTERISK)? RPAREN -> ^(FUNCTION_EXPRESSION $name DISTINCT? $args* ASTERISK?)
  | LPAREN! expr RPAREN!
  | CAST^ LPAREN! expr AS! type_name RPAREN!
// query is not supported for now
//  | (/* {ambiguous; parsed as unary expr} (NOT)? */ EXISTS)? LPAREN select_stmt RPAREN
  | CASE (case_expr=expr)? when_expr+ (ELSE else_expr=expr)? END -> ^(CASE $case_expr? when_expr+ $else_expr?)
  | raise_function
  ;

when_expr: WHEN e1=expr THEN e2=expr -> ^(WHEN $e1 $e2);

literal_value
  : INTEGER -> ^(INTEGER_LITERAL INTEGER)
  | FLOAT -> ^(FLOAT_LITERAL FLOAT)
  | STRING -> ^(STRING_LITERAL STRING)
  | BLOB -> ^(BLOB_LITERAL BLOB)
  | NULL
  | CURRENT_TIME -> ^(FUNCTION_LITERAL CURRENT_TIME)
  | CURRENT_DATE -> ^(FUNCTION_LITERAL CURRENT_DATE)
  | CURRENT_TIMESTAMP -> ^(FUNCTION_LITERAL CURRENT_TIMESTAMP)
  ;

bind_parameter
  : QUESTION -> BIND
  | QUESTION position=INTEGER -> ^(BIND $position)
  | COLON name=id -> ^(BIND_NAME $name)
  | AT name=id -> ^(BIND_NAME $name)
// tcl bindings are not supported for now
//  | DOLLAR name=TCL_ID
  ;

raise_function: RAISE^ LPAREN! (IGNORE | (ROLLBACK | ABORT | FAIL) COMMA! error_message=STRING) RPAREN!;

type_name: names+=ID+ (LPAREN size1=signed_number (COMMA size2=signed_number)? RPAREN)?
-> ^(TYPE ^(TYPE_PARAMS $size1? $size2?) $names+);

// PRAGMA
pragma_stmt: PRAGMA (database_name=id DOT)? pragma_name=id (EQUALS pragma_value | LPAREN pragma_value RPAREN)?;

pragma_value: signed_number | name=id | STRING;

// ATTACH
attach_stmt: ATTACH (DATABASE)? filename=(STRING | id) AS database_name=id;

// DETACH
detach_stmt: DETACH (DATABASE)? database_name=id;

// ANALYZE
analyze_stmt: ANALYZE (database_or_table_name=id | database_name=id DOT table_name=id)?;

// REINDEX
reindex_stmt: REINDEX (database_name=id DOT)? collation_or_table_or_index_name=id;

// VACUUM
vacuum_stmt: VACUUM;

//
// DML
//

operation_conflict_clause: OR (ROLLBACK | ABORT | FAIL | IGNORE | REPLACE);

ordering_term: expr /* {ambiguous; part of expr} (COLLATE collation_name=ID)? */ (ASC | DESC)?
-> ^(ORDERING expr (ASC)? (DESC)?);

operation_limited_clause:
  (ORDER BY ordering_term (COMMA ordering_term)*)?
  LIMIT limit=INTEGER ((OFFSET | COMMA) offset=INTEGER)?;

// SELECT
select_stmt: select_list
  (ORDER BY ordering_term (COMMA ordering_term)*)?
  (LIMIT limit=INTEGER ((OFFSET | COMMA) offset=INTEGER)?)?
-> ^(
  SELECT select_list ^(ORDER ordering_term+)? ^(LIMIT $limit $offset?)?
);

select_list:
  select_core (select_op^ select_core)*;

select_op: UNION^ (ALL)? | INTERSECT | EXCEPT;

select_core:
  SELECT (ALL | DISTINCT)? result_column (COMMA result_column)* (FROM join_source)? (WHERE where_expr=expr)?
  ( GROUP BY ordering_term (COMMA ordering_term)* (HAVING having_expr=expr)? )?
-> ^(
  SELECT_CORE (DISTINCT)? ^(COLUMNS result_column+) ^(FROM join_source)? ^(WHERE $where_expr)?
  ^(GROUP ordering_term+ ^(HAVING $having_expr)?)?
);

result_column
  : ASTERISK
  | table_name=id DOT ASTERISK -> ^(ASTERISK $table_name)
  | expr ((AS)? column_alias=id)? -> ^(ALIAS expr $column_alias?);

join_source: single_source (join_op^ single_source (join_constraint)?)*;

single_source
  : (database_name=id DOT)? table_name=ID ((AS)? table_alias=ID)? (INDEXED BY index_name=id | NOT INDEXED)?
  -> ^(ALIAS ^($table_name $database_name?) $table_alias? ^(INDEXED NOT? $index_name?)?)
  | LPAREN select_stmt RPAREN ((AS)? table_alias=ID)?
  -> ^(ALIAS select_stmt $table_alias?)
  | LPAREN! join_source RPAREN!;

join_op
  : COMMA
  | (NATURAL)? ((LEFT)? (OUTER)? | INNER | CROSS) JOIN^;

join_constraint
  : ON^ expr
  | USING LPAREN column_names+=id (COMMA column_names+=id)* RPAREN -> ^(USING $column_names+);

// INSERT
insert_stmt: (INSERT (operation_conflict_clause)? | REPLACE) INTO (database_name=id DOT)? table_name=id
  ( (LPAREN column_names+=id (COMMA column_names+=id)* RPAREN)?
    (VALUES LPAREN values+=expr (COMMA values+=expr)* RPAREN | select_stmt)
  | DEFAULT VALUES );

// UPDATE
update_stmt: UPDATE (operation_conflict_clause)? qualified_table_name
  SET values+=update_set (COMMA values+=update_set)* (WHERE expr)? (operation_limited_clause)?;

update_set: column_name=id EQUALS expr;

// DELETE
delete_stmt: DELETE FROM qualified_table_name (WHERE expr)? (operation_limited_clause)?;

// BEGIN TRANSACTION
begin_stmt: BEGIN (DEFERRED | IMMEDIATE | EXCLUSIVE)? (TRANSACTION)?;

// COMMIT TRANSACTION
commit_stmt: (COMMIT | END) (TRANSACTION)?;

// ROLLBACK TRANSACTION
rollback_stmt: ROLLBACK (TRANSACTION)? (TO (SAVEPOINT)? savepoint_name=id)?;

// SAVEPOINT
savepoint_stmt: SAVEPOINT savepoint_name=id;

// RELEASE
release_stmt: RELEASE (SAVEPOINT)? savepoint_name=id;


//
// DDL
//

table_conflict_clause: ON! CONFLICT^ (ROLLBACK | ABORT | FAIL | IGNORE | REPLACE);

// CREATE VIRTUAL TABLE
// TODO: replace column defs by arbitrary text with balanced parens
create_virtual_table_stmt: CREATE VIRTUAL TABLE (database_name=id DOT)? table_name=id
  USING module_name=id (LPAREN column_def (COMMA column_def)* RPAREN)?;

// CREATE TABLE
create_table_stmt: CREATE TEMPORARY? TABLE (IF NOT EXISTS)? (database_name=id DOT)? table_name=id
  ( LPAREN column_def (COMMA column_def)* (COMMA table_constraint)* RPAREN
  | AS select_stmt)
-> ^(CREATE_TABLE ^(OPTIONS TEMPORARY? EXISTS?) ^($table_name $database_name?)
  ^(COLUMNS column_def+)? ^(CONSTRAINTS table_constraint*)? select_stmt?);

column_def: name=id_column_def type_name? column_constraint*
-> ^($name ^(CONSTRAINTS column_constraint*) type_name?);

column_constraint: (CONSTRAINT name=id)?
  ( column_constraint_pk
  | column_constraint_not_null
  | column_constraint_unique
  | column_constraint_check
  | column_constraint_default
  | column_constraint_collate
  | fk_clause)
-> ^(COLUMN_CONSTRAINT
  column_constraint_pk?
  column_constraint_not_null?
  column_constraint_unique?
  column_constraint_check?
  column_constraint_default?
  column_constraint_collate?
  fk_clause?
  $name?);

column_constraint_pk: PRIMARY^ KEY! (ASC | DESC)? table_conflict_clause? (AUTOINCREMENT)?;

column_constraint_not_null: NOT NULL table_conflict_clause? -> ^(NOT_NULL table_conflict_clause?);

column_constraint_unique: UNIQUE^ table_conflict_clause?;

column_constraint_check: CHECK^ LPAREN! expr RPAREN!;

// Expand signed_number to avoid collisions with literal_value
column_constraint_default: DEFAULT^ ((PLUS | MINUS) (INTEGER | FLOAT) | literal_value | LPAREN! expr RPAREN!);

column_constraint_collate: COLLATE^ collation_name=id; // collation_name: (BINARY|NOCASE|RTRIM)

table_constraint: (CONSTRAINT name=id)?
  ( table_constraint_pk
  | table_constraint_unique
  | table_constraint_check
  | table_constraint_fk)
-> ^(TABLE_CONSTRAINT
  table_constraint_pk?
  table_constraint_unique?
  table_constraint_check?
  table_constraint_fk?
  $name?);

table_constraint_pk: PRIMARY KEY
  LPAREN indexed_columns+=id (COMMA indexed_columns+=id)* RPAREN table_conflict_clause?
-> ^(PRIMARY ^(COLUMNS $indexed_columns+) table_conflict_clause?);

table_constraint_unique: UNIQUE
  LPAREN indexed_columns+=id (COMMA indexed_columns+=id)* RPAREN table_conflict_clause?
-> ^(UNIQUE ^(COLUMNS $indexed_columns+) table_conflict_clause?);

table_constraint_check: CHECK^ LPAREN! expr RPAREN!;

table_constraint_fk: FOREIGN KEY LPAREN column_names+=id (COMMA column_names+=id)* RPAREN fk_clause
-> ^(FOREIGN ^(COLUMNS $column_names+) fk_clause);

fk_clause: REFERENCES foreign_table=id (LPAREN column_names+=id (COMMA column_names+=id)* RPAREN)?
  fk_clause_action+ fk_clause_deferrable?
-> ^(REFERENCES $foreign_table ^(COLUMNS $column_names+) fk_clause_action+ fk_clause_deferrable?);

fk_clause_action
  : ON^ (DELETE | UPDATE | INSERT) (SET! NULL | SET! DEFAULT | CASCADE | RESTRICT)
  | MATCH^ id;

fk_clause_deferrable: (NOT)? DEFERRABLE^ (INITIALLY! DEFERRED | INITIALLY! IMMEDIATE)?;

// DROP TABLE
drop_table_stmt: DROP TABLE (IF EXISTS)? (database_name=id DOT)? table_name=id
-> ^(DROP_TABLE ^(OPTIONS EXISTS?) ^($table_name $database_name?));

// ALTER TABLE
alter_table_stmt: ALTER TABLE (database_name=id DOT)? table_name=id (RENAME TO new_table_name=id | ADD (COLUMN)? column_def);

// CREATE VIEW
create_view_stmt: CREATE TEMPORARY? VIEW (IF NOT EXISTS)? (database_name=id DOT)? view_name=id AS select_stmt;

// DROP VIEW
drop_view_stmt: DROP VIEW (IF EXISTS)? (database_name=id DOT)? view_name=id;

// CREATE INDEX
create_index_stmt: CREATE (UNIQUE)? INDEX (IF NOT EXISTS)? (database_name=id DOT)? index_name=id
  ON table_name=id LPAREN columns+=indexed_column (COMMA columns+=indexed_column)* RPAREN
-> ^(CREATE_INDEX ^(OPTIONS UNIQUE? EXISTS?) ^($index_name $database_name?) $table_name ^(COLUMNS $columns+)?);

indexed_column: column_name=id (COLLATE collation_name=id)? (ASC | DESC)?
-> ^($column_name ^(COLLATE $collation_name)? ASC? DESC?);

// DROP INDEX
drop_index_stmt: DROP INDEX (IF EXISTS)? (database_name=id DOT)? index_name=id
-> ^(DROP_INDEX ^(OPTIONS EXISTS?) ^($index_name $database_name?));

// CREATE TRIGGER
create_trigger_stmt: CREATE TEMPORARY? TRIGGER (IF NOT EXISTS)? (database_name=id DOT)? trigger_name=id
  (BEFORE | AFTER | INSTEAD OF)? (DELETE | INSERT | UPDATE (OF column_names+=id (COMMA column_names+=id)*)?)
  ON table_name=id (FOR EACH ROW)? (WHEN expr)?
  BEGIN ((update_stmt | insert_stmt | delete_stmt | select_stmt) SEMI)+ END;

// DROP TRIGGER
drop_trigger_stmt: DROP TRIGGER (IF EXISTS)? (database_name=id DOT)? trigger_name=id;


// Special rules that allow to use certain keywords as identifiers.

id: ID | keyword;

keyword: (
    ABORT
  | ADD
  | AFTER
  | ALL
  | ALTER
  | ANALYZE
  | AND
  | AS
  | ASC
  | ATTACH
  | AUTOINCREMENT
  | BEFORE
  | BEGIN
  | BETWEEN
  | BY
  | CASCADE
  | CASE
  | CAST
  | CHECK
  | COLLATE
  | COLUMN
  | COMMIT
  | CONFLICT
  | CONSTRAINT
  | CREATE
  | CROSS
  | CURRENT_TIME
  | CURRENT_DATE
  | CURRENT_TIMESTAMP
  | DATABASE
  | DEFAULT
  | DEFERRABLE
  | DEFERRED
  | DELETE
  | DESC
  | DETACH
  | DISTINCT
  | DROP
  | EACH
  | ELSE
  | END
  | ESCAPE
  | EXCEPT
  | EXCLUSIVE
  | EXISTS
  | EXPLAIN
  | FAIL
  | FOR
  | FOREIGN
  | FROM
//  | GLOB
  | GROUP
  | HAVING
  | IF
  | IGNORE
  | IMMEDIATE
//  | IN
  | INDEX
  | INDEXED
  | INITIALLY
  | INNER
  | INSERT
  | INSTEAD
  | INTERSECT
  | INTO
  | IS
//  | ISNULL
  | JOIN
  | KEY
  | LEFT
//  | LIKE
  | LIMIT
//  | MATCH
  | NATURAL
//  | NOT
//  | NOTNULL
  | NULL
  | OF
  | OFFSET
  | ON
  | OR
  | ORDER
  | OUTER
  | PLAN
  | PRAGMA
  | PRIMARY
  | QUERY
  | RAISE
  | REFERENCES
//  | REGEXP
  | REINDEX
  | RELEASE
  | RENAME
  | REPLACE
  | RESTRICT
  | ROLLBACK
  | ROW
  | SAVEPOINT
  | SELECT
  | SET
  | TABLE
  | TEMPORARY
  | THEN
  | TO
  | TRANSACTION
  | TRIGGER
  | UNION
  | UNIQUE
  | UPDATE
  | USING
  | VACUUM
  | VALUES
  | VIEW
  | VIRTUAL
  | WHEN
  | WHERE
  );

id_column_def: ID | keyword_column_def;

keyword_column_def: (
    ABORT
  | ADD
  | AFTER
  | ALL
  | ALTER
  | ANALYZE
  | AND
  | AS
  | ASC
  | ATTACH
  | AUTOINCREMENT
  | BEFORE
  | BEGIN
  | BETWEEN
  | BY
  | CASCADE
  | CASE
  | CAST
  | CHECK
  | COLLATE
//  | COLUMN
  | COMMIT
  | CONFLICT
//  | CONSTRAINT
  | CREATE
  | CROSS
  | CURRENT_TIME
  | CURRENT_DATE
  | CURRENT_TIMESTAMP
  | DATABASE
  | DEFAULT
  | DEFERRABLE
  | DEFERRED
  | DELETE
  | DESC
  | DETACH
  | DISTINCT
  | DROP
  | EACH
  | ELSE
  | END
  | ESCAPE
  | EXCEPT
  | EXCLUSIVE
  | EXISTS
  | EXPLAIN
  | FAIL
  | FOR
  | FOREIGN
  | FROM
  | GLOB
  | GROUP
  | HAVING
  | IF
  | IGNORE
  | IMMEDIATE
  | IN
  | INDEX
  | INDEXED
  | INITIALLY
  | INNER
  | INSERT
  | INSTEAD
  | INTERSECT
  | INTO
  | IS
  | ISNULL
  | JOIN
  | KEY
  | LEFT
  | LIKE
  | LIMIT
  | MATCH
  | NATURAL
  | NOT
  | NOTNULL
  | NULL
  | OF
  | OFFSET
  | ON
  | OR
  | ORDER
  | OUTER
  | PLAN
  | PRAGMA
  | PRIMARY
  | QUERY
  | RAISE
  | REFERENCES
  | REGEXP
  | REINDEX
  | RELEASE
  | RENAME
  | REPLACE
  | RESTRICT
  | ROLLBACK
  | ROW
  | SAVEPOINT
  | SELECT
  | SET
  | TABLE
  | TEMPORARY
  | THEN
  | TO
  | TRANSACTION
  | TRIGGER
  | UNION
  | UNIQUE
  | UPDATE
  | USING
  | VACUUM
  | VALUES
  | VIEW
  | VIRTUAL
  | WHEN
  | WHERE
  );
