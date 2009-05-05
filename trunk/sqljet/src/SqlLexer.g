/*
 * SqlLexer.g
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
lexer grammar SqlLexer;

options {
	language = Java;
}

@header {
  package org.tmatesoft.sqljet.core.internal.lang;
}

EQUALS:        '=';
EQUALS2:       '==';
NOT_EQUALS:    '!=';
NOT_EQUALS2:   '<>';
LESS:          '<';
LESS_OR_EQ:    '<=';
GREATER:       '>';
GREATER_OR_EQ: '>=';
SHIFT_LEFT:    '<<';
SHIFT_RIGHT:   '>>';
AMPERSAND:     '&';
PIPE:          '|';
DOUBLE_PIPE:   '||';
PLUS:          '+';
MINUS:         '-';
TILDA:         '~';
ASTERISK:      '*';
SLASH:         '/';
PERCENT:       '%';
SEMI:          ';';
DOT:           '.';
COMMA:         ',';
LPAREN:        '(';
RPAREN:        ')';
QUESTION:      '?';
COLON:         ':';
AT:            '@';
DOLLAR:        '$';

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
TEMPORARY: T E M P ( O R A R Y )?;
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

fragment ID_START: ('a'..'z'|'A'..'Z'|'_');
ID: ID_START (ID_START|'0'..'9')*;
TCL_ID: ID_START (ID_START|'0'..'9'|'::')* (LPAREN ( options {greedy=false;} : . )* RPAREN)?;
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
