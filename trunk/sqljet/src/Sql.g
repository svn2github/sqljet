/*
 * Sql.g
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
grammar Sql;

options {
	language = Java;
	output = AST;
}

tokens {
	ALIAS; // replaces AS
	COLUMN_DEFS; // groups all column definitions
	COLUMN_CONSTRAINT; // root for column_constraint
	NOT_NULL; // single token that replaces NOT NULL
	ORDERING; // root for ordering_term
	RESULT_COLUMNS; // groups all result columns within a select
	SELECT_CORE; // root for simple select statement, part of a compound select
	TABLE_CONSTRAINTS; // groups all table constraints
	TABLE_CONSTRAINT; // root for table constraint
	TYPE; // root for type_name
	TYPE_PARAMS; // root for numbers in type_name
}

@header {
  package org.tmatesoft.sqljet.core.internal.lang;
}

@lexer::header {
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
  | drop_trigger_stmt;

qualified_table_name: (database_name=ID DOT)? table_name=ID (INDEXED BY index_name=ID | NOT INDEXED)?;

expr: or_subexpr (OR^ or_subexpr)*;

or_subexpr: and_subexpr (AND^ and_subexpr)*;

and_subexpr: eq_subexpr
  ( ('=' | '==' | '!=' | '<>') eq_subexpr)*
  | (NOT)? (LIKE | GLOB | REGEXP | MATCH) eq_subexpr (ESCAPE eq_subexpr)?
  | (NOT)? IN (LPAREN (select_stmt | expr (COMMA expr)*)? RPAREN | (db_name=ID DOT)? table_name=ID)
  | (ISNULL | NOTNULL | IS NULL /* {ambiguous, parsed as 'NOT literal'} | NOT NULL */| IS NOT NULL)
  | (NOT)? BETWEEN eq_subexpr AND eq_subexpr;

eq_subexpr: neq_subexpr (('<' | '<=' | '>' | '>=')^ neq_subexpr)*;

neq_subexpr: bit_subexpr (('<<' | '>>' | '&' | '|')^ bit_subexpr)*;

bit_subexpr: add_subexpr (('+' | '-')^ add_subexpr)*;

add_subexpr: mul_subexpr (('*' | '/' | '%')^ mul_subexpr)*;

mul_subexpr: con_subexpr ('||'^ con_subexpr)*;

con_subexpr: ('-' | '+' | '~' | NOT)? unary_subexpr;

unary_subexpr: atom_expr (COLLATE^ collation_name=ID)?;

atom_expr
  : literal_value
  | bind_parameter
  | ((database_name=ID DOT)? table_name=ID DOT)? column_name=ID
  | function_name=ID LPAREN ((DISTINCT)? args+=expr (COMMA args+=expr)* | ASTERISK)? RPAREN
  | LPAREN expr RPAREN -> expr
  | CAST LPAREN expr AS type_name RPAREN
  | (/* {ambiguous; parsed as unary expr} (NOT)? */ EXISTS)? LPAREN select_stmt RPAREN
  | CASE (expr)? (WHEN expr THEN expr)+ (ELSE expr)? END
  | raise_function;

literal_value: INTEGER | FLOAT | STRING | BLOB | NULL | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP;

signed_number: INTEGER | FLOAT | SIGNED_NUMBER;

bind_parameter
  : '?'
  | '?' number=INTEGER
  | ':' name=ID
  | '@' name=ID
  | '$' name=TCL_ID;

type_name: ID+ (LPAREN n1=signed_number (COMMA n2=signed_number)? RPAREN)? -> ^(TYPE ID+ ^(TYPE_PARAMS $n1? $n2?));

raise_function: RAISE LPAREN (IGNORE | (ROLLBACK | ABORT | FAIL) COMMA error_message=STRING) RPAREN;

// PRAGMA
pragma_stmt: PRAGMA (database_name=ID DOT)? pragma_name=ID (EQUALS pragma_value | LPAREN pragma_value RPAREN)?;

pragma_value: signed_number | name=ID | STRING;

// ATTACH
attach_stmt: ATTACH (DATABASE)? filename=(STRING | ID) AS database_name=ID;

// DETACH
detach_stmt: DETACH (DATABASE)? database_name=ID;

// ANALYZE
analyze_stmt: ANALYZE (database_or_table_name=ID | database_name=ID DOT table_name=ID)?;

// REINDEX
reindex_stmt: REINDEX (database_name=ID DOT)? collation_or_table_or_index_name=ID;

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
  SELECT_CORE (DISTINCT)? ^(RESULT_COLUMNS result_column+) ^(FROM join_source)? ^(WHERE $where_expr)?
  ^(GROUP ordering_term+ ^(HAVING $having_expr)?)?
);

result_column
  : ASTERISK
  | table_name=ID DOT ASTERISK -> ^(ASTERISK $table_name)
  | expr ((AS)? column_alias=ID)? -> ^(ALIAS expr $column_alias?);

join_source: single_source (join_op^ single_source (join_constraint)?)*;

single_source
  : (database_name=ID DOT)? table_name=ID ((AS)? table_alias=ID)? (INDEXED BY index_name=ID | NOT INDEXED)?
  -> ^(ALIAS ^($table_name $database_name?) $table_alias? ^(INDEXED NOT? $index_name?)?)
  | LPAREN select_stmt RPAREN ((AS)? table_alias=ID)?
  -> ^(ALIAS select_stmt $table_alias?)
  | LPAREN! join_source RPAREN!;

join_op
  : COMMA
  | (NATURAL)? ((LEFT)? (OUTER)? | INNER | CROSS) JOIN^;

join_constraint
  : ON^ expr
  | USING LPAREN column_names+=ID (COMMA column_names+=ID)* RPAREN -> ^(USING $column_names+);

// INSERT
insert_stmt: (INSERT (operation_conflict_clause)? | REPLACE) INTO (database_name=ID DOT)? table_name=ID
  ( (LPAREN column_names+=ID (COMMA column_names+=ID)* RPAREN)?
    (VALUES LPAREN values+=expr (COMMA values+=expr)* RPAREN | select_stmt)
  | DEFAULT VALUES );

// UPDATE
update_stmt: UPDATE (operation_conflict_clause)? qualified_table_name
  SET values+=update_set (COMMA values+=update_set)* (WHERE expr)? (operation_limited_clause)?;

update_set: column_name=ID EQUALS expr;

// DELETE
delete_stmt: DELETE FROM qualified_table_name (WHERE expr)? (operation_limited_clause)?;

// BEGIN TRANSACTION
begin_stmt: BEGIN (DEFERRED | IMMEDIATE | EXCLUSIVE)? (TRANSACTION)?;

// COMMIT TRANSACTION
commit_stmt: (COMMIT | END) (TRANSACTION)?;

// ROLLBACK TRANSACTION
rollback_stmt: ROLLBACK (TRANSACTION)? (TO (SAVEPOINT)? savepoint_name=ID)?;

// SAVEPOINT
savepoint_stmt: SAVEPOINT savepoint_name=ID;

// RELEASE
release_stmt: RELEASE (SAVEPOINT)? savepoint_name=ID;


//
// DDL
//

table_conflict_clause: ON! CONFLICT^ (ROLLBACK | ABORT | FAIL | IGNORE | REPLACE);

// CREATE VIRTUAL TABLE
// TODO: replace column defs by arbitrary text with balanced parens
create_virtual_table_stmt: CREATE VIRTUAL TABLE (database_name=ID DOT)? table_name=ID
  USING module_name=ID (LPAREN column_def (COMMA column_def)* RPAREN)?;

// CREATE TABLE
create_table_stmt: CREATE (TEMP | TEMPORARY)? TABLE (IF NOT EXISTS)? (database_name=ID DOT)? table_name=ID
  ( LPAREN column_def (COMMA column_def)* (COMMA table_constraint)* RPAREN
  | AS select_stmt)
-> ^(TABLE TEMP? TEMPORARY? ^($table_name $database_name?) ^(COLUMN_DEFS column_def+)? ^(TABLE_CONSTRAINTS table_constraint*)? select_stmt?);

column_def: ID^ type_name? (column_constraint)*;

column_constraint: (CONSTRAINT name=ID)?
  ( column_constraint_pk
  | column_constraint_not_null
  | column_constraint_unique
  | column_constraint_check
  | column_constraint_default
  | column_constraint_collate
  | fk_clause)
-> ^(COLUMN_CONSTRAINT ID? 
  column_constraint_pk?
  column_constraint_not_null?
  column_constraint_unique?
  column_constraint_check?
  column_constraint_default?
  column_constraint_collate?
  fk_clause?);

column_constraint_pk: PRIMARY^ KEY! (ASC | DESC)? table_conflict_clause? (AUTOINCREMENT)?;

column_constraint_not_null: NOT NULL table_conflict_clause? -> ^(NOT_NULL table_conflict_clause?);

column_constraint_unique: UNIQUE^ table_conflict_clause?;

column_constraint_check: CHECK^ LPAREN! expr RPAREN!;

column_constraint_default: DEFAULT^ (SIGNED_NUMBER | literal_value | LPAREN! expr RPAREN!);

column_constraint_collate: COLLATE^ collation_name=ID; // collation_name: (BINARY|NOCASE|RTRIM)

table_constraint: (CONSTRAINT name=ID)?
  ( table_constraint_pk
  | table_constraint_check
  | table_constraint_fk);

table_constraint_pk: (PRIMARY KEY | UNIQUE) LPAREN indexed_columns+=ID (COMMA indexed_columns+=ID)* RPAREN
  table_conflict_clause?;

table_constraint_check: CHECK LPAREN expr RPAREN;

table_constraint_fk: FOREIGN KEY LPAREN column_names+=ID (COMMA column_names+=ID)* RPAREN fk_clause;

fk_clause: REFERENCES^ foreign_table=ID (LPAREN column_names+=ID (COMMA column_names+=ID)* RPAREN)?
  fk_clause_action+ fk_clause_deferrable?;

fk_clause_action
  : ON (DELETE | UPDATE | INSERT) (SET NULL | SET DEFAULT | CASCADE | RESTRICT)
  | MATCH name=ID;

fk_clause_deferrable: (NOT)? DEFERRABLE (INITIALLY DEFERRED | INITIALLY IMMEDIATE)?;

// DROP TABLE
drop_table_stmt: DROP TABLE (IF EXISTS)? (database_name=ID DOT)? table_name=ID;

// ALTER TABLE
alter_table_stmt: ALTER TABLE (database_name=ID DOT)? table_name=ID (RENAME TO new_table_name=ID | ADD (COLUMN)? column_def);

// CREATE VIEW
create_view_stmt: CREATE (TEMP | TEMPORARY)? VIEW (IF NOT EXISTS)? (database_name=ID DOT)? view_name=ID AS select_stmt;

// DROP VIEW
drop_view_stmt: DROP VIEW (IF EXISTS)? (database_name=ID DOT)? view_name=ID;

// CREATE INDEX
create_index_stmt: CREATE (UNIQUE)? INDEX (IF NOT EXISTS)? (database_name=ID DOT)? index_name=ID
  ON table_name=ID LPAREN columns+=indexed_column (COMMA columns+=indexed_column)* RPAREN;

indexed_column: column_name=ID (COLLATE collation_name=ID)? (ASC | DESC)?;

// DROP INDEX
drop_index_stmt: DROP INDEX (IF EXISTS)? (database_name=ID DOT)? index_name=ID;

// CREATE TRIGGER
create_trigger_stmt: CREATE (TEMP | TEMPORARY)? TRIGGER (IF NOT EXISTS)? (database_name=ID DOT)? trigger_name=ID
  (BEFORE | AFTER | INSTEAD OF)? (DELETE | INSERT | UPDATE (OF column_names+=ID (COMMA column_names+=ID)*)?)
  ON table_name=ID (FOR EACH ROW)? (WHEN expr)?
  BEGIN ((update_stmt | insert_stmt | delete_stmt | select_stmt) SEMI)+ END;

// DROP TRIGGER
drop_trigger_stmt: DROP TRIGGER (IF EXISTS)? (database_name=ID DOT)? trigger_name=ID;


//
// Tokens
//

EQUALS:   '=';
ASTERISK: '*';
SEMI:     ';';
DOT:      '.';
COMMA:    ',';
LPAREN:   '(';
RPAREN:   ')';

// http://www.antlr.org/wiki/pages/viewpage.action?pageId=1782
fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');

ABORT: A B O R T;
ADD: A D D;
AFTER: A F T E R;
ALL: A L L;
ALTER: A L T E R;
ANALYZE: A N A L Y Z E;
AND: A N D;
AS: A S;
ASC: A S C;
ATTACH: A T T A C H;
AUTOINCREMENT: A U T O I N C R E M E N T;
BEFORE: B E F O R E;
BEGIN: B E G I N;
BETWEEN: B E T W E E N;
BY: B Y;
CASCADE: C A S C A D E;
CASE: C A S E;
CAST: C A S T;
CHECK: C H E C K;
COLLATE: C O L L A T E;
COLUMN: C O L U M N;
COMMIT: C O M M I T;
CONFLICT: C O N F L I C T;
CONSTRAINT: C O N S T R A I N T;
CREATE: C R E A T E;
CROSS: C R O S S;
CURRENT_TIME: C U R R E N T '_' T I M E;
CURRENT_DATE: C U R R E N T '_' D A T E;
CURRENT_TIMESTAMP: C U R R E N T '_' T I M E S T A M P;
DATABASE: D A T A B A S E;
DEFAULT: D E F A U L T;
DEFERRABLE: D E F E R R A B L E;
DEFERRED: D E F E R R E D;
DELETE: D E L E T E;
DESC: D E S C;
DETACH: D E T A C H;
DISTINCT: D I S T I N C T;
DROP: D R O P;
EACH: E A C H;
ELSE: E L S E;
END: E N D;
ESCAPE: E S C A P E;
EXCEPT: E X C E P T;
EXCLUSIVE: E X C L U S I V E;
EXISTS: E X I S T S;
EXPLAIN: E X P L A I N;
FAIL: F A I L;
FOR: F O R;
FOREIGN: F O R E I G N;
FROM: F R O M;
GLOB: G L O B;
GROUP: G R O U P;
HAVING: H A V I N G;
IF: I F;
IGNORE: I G N O R E;
IMMEDIATE: I M M E D I A T E;
IN: I N;
INDEX: I N D E X;
INDEXED: I N D E X E D;
INITIALLY: I N I T I A L L Y;
INNER: I N N E R;
INSERT: I N S E R T;
INSTEAD: I N S T E A D;
INTERSECT: I N T E R S E C T;
INTO: I N T O;
IS: I S;
ISNULL: I S N U L L;
JOIN: J O I N;
KEY: K E Y;
LEFT: L E F T;
LIKE: L I K E;
LIMIT: L I M I T;
MATCH: M A T C H;
NATURAL: N A T U R A L;
NOT: N O T;
NOTNULL: N O T N U L L;
NULL: N U L L;
OF: O F;
OFFSET: O F F S E T;
ON: O N;
OR: O R;
ORDER: O R D E R;
OUTER: O U T E R;
PLAN: P L A N;
PRAGMA: P R A G M A;
PRIMARY: P R I M A R Y;
QUERY: Q U E R Y;
RAISE: R A I S E;
REFERENCES: R E F E R E N C E S;
REGEXP: R E G E X P;
REINDEX: R E I N D E X;
RELEASE: R E L E A S E;
RENAME: R E N A M E;
REPLACE: R E P L A C E;
RESTRICT: R E S T R I C T;
ROLLBACK: R O L L B A C K;
ROW: R O W;
SAVEPOINT: S A V E P O I N T;
SELECT: S E L E C T;
SET: S E T;
TABLE: T A B L E;
TEMP: T E M P;
TEMPORARY: T E M P O R A R Y;
THEN: T H E N;
TO: T O;
TRANSACTION: T R A N S A C T I O N;
TRIGGER: T R I G G E R;
UNION: U N I O N;
UNIQUE: U N I Q U E;
UPDATE: U P D A T E;
USING: U S I N G;
VACUUM: V A C U U M;
VALUES: V A L U E S;
VIEW: V I E W;
VIRTUAL: V I R T U A L;
WHEN: W H E N;
WHERE: W H E R E;

fragment ALPHA: ('a'..'z'|'A'..'Z'|'_');
ID: ALPHA (ALPHA|'0'..'9')*;
TCL_ID: ALPHA (ALPHA|'0'..'9'|'::')* suffix=(LPAREN ( options {greedy=false;} : . )* RPAREN)?;
STRING: '\'' ( ~('\'') )* '\'';
INTEGER: ('0'..'9')+;
fragment FLOAT_EXP : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;
FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* FLOAT_EXP?
    |   '.' ('0'..'9')+ FLOAT_EXP?
    |   ('0'..'9')+ FLOAT_EXP
    ;
SIGNED_NUMBER: ('+'|'-')? (INTEGER | FLOAT);
BLOB: ('x'|'X') '\'' ('0'..'9'|'a'..'f'|'A'..'F')+ '\'';

fragment COMMENT: '/*' ( options {greedy=false;} : . )* '*/';
fragment LINE_COMMENT: '--' ~('\n'|'\r')* ('\r'? '\n'|EOF);
WS: (' '|'\r'|'\t'|'\u000C'|'\n'|COMMENT|LINE_COMMENT) {$channel=HIDDEN;};
