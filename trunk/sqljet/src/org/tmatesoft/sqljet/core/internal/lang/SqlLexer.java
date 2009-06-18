// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 Sql.g 2009-06-18 16:23:49

  package org.tmatesoft.sqljet.core.internal.lang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SqlLexer extends Lexer {
    public static final int ROW=178;
    public static final int BLOB_LITERAL=7;
    public static final int TYPE_PARAMS=30;
    public static final int NOT=38;
    public static final int EXCEPT=115;
    public static final int FOREIGN=158;
    public static final int EOF=-1;
    public static final int TYPE=29;
    public static final int RPAREN=49;
    public static final int CREATE=146;
    public static final int STRING_LITERAL=27;
    public static final int IS_NULL=20;
    public static final int USING=128;
    public static final int BIND=5;
    public static final int BEGIN=136;
    public static final int REGEXP=61;
    public static final int ANALYZE=103;
    public static final int FUNCTION_LITERAL=17;
    public static final int CONFLICT=145;
    public static final int LESS_OR_EQ=64;
    public static final int ATTACH=100;
    public static final int VIRTUAL=147;
    public static final int D=183;
    public static final int E=184;
    public static final int F=185;
    public static final int G=186;
    public static final int BLOB=87;
    public static final int A=180;
    public static final int B=181;
    public static final int ASC=107;
    public static final int C=182;
    public static final int L=191;
    public static final int M=192;
    public static final int N=193;
    public static final int O=194;
    public static final int TRANSACTION=140;
    public static final int KEY=154;
    public static final int H=187;
    public static final int I=188;
    public static final int BIND_NAME=6;
    public static final int ELSE=82;
    public static final int J=189;
    public static final int K=190;
    public static final int U=200;
    public static final int T=199;
    public static final int IN_VALUES=21;
    public static final int W=202;
    public static final int V=201;
    public static final int Q=196;
    public static final int P=195;
    public static final int S=198;
    public static final int R=197;
    public static final int ROLLBACK=96;
    public static final int FAIL=98;
    public static final int RESTRICT=161;
    public static final int Y=204;
    public static final int X=203;
    public static final int Z=205;
    public static final int GROUP=119;
    public static final int INTERSECT=114;
    public static final int DROP_INDEX=14;
    public static final int WS=210;
    public static final int PLAN=33;
    public static final int ALIAS=4;
    public static final int END=83;
    public static final int CONSTRAINT=152;
    public static final int RENAME=166;
    public static final int ALTER=165;
    public static final int ISNULL=50;
    public static final int TABLE=148;
    public static final int FLOAT=42;
    public static final int NOTNULL=51;
    public static final int NOT_EQUALS=57;
    public static final int NOT_NULL=23;
    public static final int LPAREN=47;
    public static final int ASTERISK=71;
    public static final int GREATER_OR_EQ=66;
    public static final int AT=93;
    public static final int DOUBLE_PIPE=74;
    public static final int AS=80;
    public static final int SLASH=72;
    public static final int THEN=85;
    public static final int OFFSET=111;
    public static final int LEFT=122;
    public static final int REPLACE=106;
    public static final int COLUMN=168;
    public static final int PLUS=39;
    public static final int PIPE=70;
    public static final int EXISTS=151;
    public static final int LIKE=59;
    public static final int COLLATE=76;
    public static final int ADD=167;
    public static final int INTEGER=41;
    public static final int OUTER=123;
    public static final int BY=37;
    public static final int DEFERRABLE=162;
    public static final int TO=142;
    public static final int AMPERSAND=69;
    public static final int SET=134;
    public static final int HAVING=120;
    public static final int MINUS=40;
    public static final int IGNORE=95;
    public static final int SEMI=34;
    public static final int UNION=112;
    public static final int COLUMN_CONSTRAINT=8;
    public static final int COLON=92;
    public static final int FLOAT_EXP=207;
    public static final int COLUMNS=10;
    public static final int COMMIT=141;
    public static final int IN_TABLE=22;
    public static final int DATABASE=101;
    public static final int VACUUM=105;
    public static final int DROP=164;
    public static final int DETACH=102;
    public static final int WHEN=84;
    public static final int NATURAL=121;
    public static final int BETWEEN=54;
    public static final int OPTIONS=24;
    public static final int STRING=86;
    public static final int CAST=79;
    public static final int TABLE_CONSTRAINT=28;
    public static final int CURRENT_TIME=88;
    public static final int TRIGGER=171;
    public static final int CASE=81;
    public static final int EQUALS=55;
    public static final int CASCADE=160;
    public static final int RELEASE=144;
    public static final int EXPLAIN=31;
    public static final int GREATER=65;
    public static final int ESCAPE=45;
    public static final int INSERT=129;
    public static final int SAVEPOINT=143;
    public static final int LESS=63;
    public static final int RAISE=94;
    public static final int EACH=177;
    public static final int COMMENT=208;
    public static final int ABORT=97;
    public static final int SELECT=116;
    public static final int INTO=130;
    public static final int UNIQUE=156;
    public static final int GLOB=60;
    public static final int VIEW=169;
    public static final int LINE_COMMENT=209;
    public static final int NULL=53;
    public static final int ON=127;
    public static final int MATCH=62;
    public static final int PRIMARY=153;
    public static final int DELETE=135;
    public static final int OF=175;
    public static final int SHIFT_LEFT=67;
    public static final int SHIFT_RIGHT=68;
    public static final int INTEGER_LITERAL=19;
    public static final int FUNCTION_EXPRESSION=18;
    public static final int OR=43;
    public static final int QUERY=32;
    public static final int CHECK=157;
    public static final int FROM=117;
    public static final int DISTINCT=78;
    public static final int TEMPORARY=149;
    public static final int CURRENT_DATE=89;
    public static final int DOLLAR=179;
    public static final int CONSTRAINTS=11;
    public static final int WHERE=118;
    public static final int COLUMN_EXPRESSION=9;
    public static final int INNER=124;
    public static final int ORDER=109;
    public static final int LIMIT=110;
    public static final int PRAGMA=99;
    public static final int UPDATE=133;
    public static final int DEFERRED=137;
    public static final int FOR=176;
    public static final int SELECT_CORE=26;
    public static final int EXCLUSIVE=139;
    public static final int ID=77;
    public static final int AND=44;
    public static final int CROSS=125;
    public static final int IF=150;
    public static final int INDEX=170;
    public static final int TILDA=75;
    public static final int IN=46;
    public static final int COMMA=48;
    public static final int CREATE_TABLE=13;
    public static final int REFERENCES=159;
    public static final int IS=52;
    public static final int ALL=113;
    public static final int DOT=35;
    public static final int CURRENT_TIMESTAMP=90;
    public static final int INITIALLY=163;
    public static final int REINDEX=104;
    public static final int EQUALS2=56;
    public static final int PERCENT=73;
    public static final int AUTOINCREMENT=155;
    public static final int NOT_EQUALS2=58;
    public static final int DEFAULT=132;
    public static final int VALUES=131;
    public static final int BEFORE=172;
    public static final int AFTER=173;
    public static final int INSTEAD=174;
    public static final int JOIN=126;
    public static final int INDEXED=36;
    public static final int FLOAT_LITERAL=16;
    public static final int CREATE_INDEX=12;
    public static final int QUESTION=91;
    public static final int ORDERING=25;
    public static final int IMMEDIATE=138;
    public static final int DESC=108;
    public static final int DROP_TABLE=15;
    public static final int ID_START=206;

    // delegates
    // delegators

    public SqlLexer() {;} 
    public SqlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SqlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Sql.g"; }

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:654:7: ( '=' )
            // Sql.g:654:16: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUALS"

    // $ANTLR start "EQUALS2"
    public final void mEQUALS2() throws RecognitionException {
        try {
            int _type = EQUALS2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:655:8: ( '==' )
            // Sql.g:655:16: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUALS2"

    // $ANTLR start "NOT_EQUALS"
    public final void mNOT_EQUALS() throws RecognitionException {
        try {
            int _type = NOT_EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:656:11: ( '!=' )
            // Sql.g:656:16: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_EQUALS"

    // $ANTLR start "NOT_EQUALS2"
    public final void mNOT_EQUALS2() throws RecognitionException {
        try {
            int _type = NOT_EQUALS2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:657:12: ( '<>' )
            // Sql.g:657:16: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_EQUALS2"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:658:5: ( '<' )
            // Sql.g:658:16: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "LESS_OR_EQ"
    public final void mLESS_OR_EQ() throws RecognitionException {
        try {
            int _type = LESS_OR_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:659:11: ( '<=' )
            // Sql.g:659:16: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS_OR_EQ"

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:660:8: ( '>' )
            // Sql.g:660:16: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER"

    // $ANTLR start "GREATER_OR_EQ"
    public final void mGREATER_OR_EQ() throws RecognitionException {
        try {
            int _type = GREATER_OR_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:661:14: ( '>=' )
            // Sql.g:661:16: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER_OR_EQ"

    // $ANTLR start "SHIFT_LEFT"
    public final void mSHIFT_LEFT() throws RecognitionException {
        try {
            int _type = SHIFT_LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:662:11: ( '<<' )
            // Sql.g:662:16: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHIFT_LEFT"

    // $ANTLR start "SHIFT_RIGHT"
    public final void mSHIFT_RIGHT() throws RecognitionException {
        try {
            int _type = SHIFT_RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:663:12: ( '>>' )
            // Sql.g:663:16: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHIFT_RIGHT"

    // $ANTLR start "AMPERSAND"
    public final void mAMPERSAND() throws RecognitionException {
        try {
            int _type = AMPERSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:664:10: ( '&' )
            // Sql.g:664:16: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AMPERSAND"

    // $ANTLR start "PIPE"
    public final void mPIPE() throws RecognitionException {
        try {
            int _type = PIPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:665:5: ( '|' )
            // Sql.g:665:16: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PIPE"

    // $ANTLR start "DOUBLE_PIPE"
    public final void mDOUBLE_PIPE() throws RecognitionException {
        try {
            int _type = DOUBLE_PIPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:666:12: ( '||' )
            // Sql.g:666:16: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE_PIPE"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:667:5: ( '+' )
            // Sql.g:667:16: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:668:6: ( '-' )
            // Sql.g:668:16: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "TILDA"
    public final void mTILDA() throws RecognitionException {
        try {
            int _type = TILDA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:669:6: ( '~' )
            // Sql.g:669:16: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TILDA"

    // $ANTLR start "ASTERISK"
    public final void mASTERISK() throws RecognitionException {
        try {
            int _type = ASTERISK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:670:9: ( '*' )
            // Sql.g:670:16: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASTERISK"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:671:6: ( '/' )
            // Sql.g:671:16: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:672:8: ( '%' )
            // Sql.g:672:16: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:673:5: ( ';' )
            // Sql.g:673:16: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:674:4: ( '.' )
            // Sql.g:674:16: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:675:6: ( ',' )
            // Sql.g:675:16: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:676:7: ( '(' )
            // Sql.g:676:16: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:677:7: ( ')' )
            // Sql.g:677:16: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "QUESTION"
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:678:9: ( '?' )
            // Sql.g:678:16: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUESTION"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:679:6: ( ':' )
            // Sql.g:679:16: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:680:3: ( '@' )
            // Sql.g:680:16: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "DOLLAR"
    public final void mDOLLAR() throws RecognitionException {
        try {
            int _type = DOLLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:681:7: ( '$' )
            // Sql.g:681:16: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOLLAR"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // Sql.g:684:11: ( ( 'a' | 'A' ) )
            // Sql.g:684:12: ( 'a' | 'A' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "B"
    public final void mB() throws RecognitionException {
        try {
            // Sql.g:685:11: ( ( 'b' | 'B' ) )
            // Sql.g:685:12: ( 'b' | 'B' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "B"

    // $ANTLR start "C"
    public final void mC() throws RecognitionException {
        try {
            // Sql.g:686:11: ( ( 'c' | 'C' ) )
            // Sql.g:686:12: ( 'c' | 'C' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "C"

    // $ANTLR start "D"
    public final void mD() throws RecognitionException {
        try {
            // Sql.g:687:11: ( ( 'd' | 'D' ) )
            // Sql.g:687:12: ( 'd' | 'D' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "D"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            // Sql.g:688:11: ( ( 'e' | 'E' ) )
            // Sql.g:688:12: ( 'e' | 'E' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            // Sql.g:689:11: ( ( 'f' | 'F' ) )
            // Sql.g:689:12: ( 'f' | 'F' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "F"

    // $ANTLR start "G"
    public final void mG() throws RecognitionException {
        try {
            // Sql.g:690:11: ( ( 'g' | 'G' ) )
            // Sql.g:690:12: ( 'g' | 'G' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "G"

    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            // Sql.g:691:11: ( ( 'h' | 'H' ) )
            // Sql.g:691:12: ( 'h' | 'H' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "H"

    // $ANTLR start "I"
    public final void mI() throws RecognitionException {
        try {
            // Sql.g:692:11: ( ( 'i' | 'I' ) )
            // Sql.g:692:12: ( 'i' | 'I' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "I"

    // $ANTLR start "J"
    public final void mJ() throws RecognitionException {
        try {
            // Sql.g:693:11: ( ( 'j' | 'J' ) )
            // Sql.g:693:12: ( 'j' | 'J' )
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "J"

    // $ANTLR start "K"
    public final void mK() throws RecognitionException {
        try {
            // Sql.g:694:11: ( ( 'k' | 'K' ) )
            // Sql.g:694:12: ( 'k' | 'K' )
            {
            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "K"

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            // Sql.g:695:11: ( ( 'l' | 'L' ) )
            // Sql.g:695:12: ( 'l' | 'L' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "L"

    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            // Sql.g:696:11: ( ( 'm' | 'M' ) )
            // Sql.g:696:12: ( 'm' | 'M' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "M"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            // Sql.g:697:11: ( ( 'n' | 'N' ) )
            // Sql.g:697:12: ( 'n' | 'N' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "O"
    public final void mO() throws RecognitionException {
        try {
            // Sql.g:698:11: ( ( 'o' | 'O' ) )
            // Sql.g:698:12: ( 'o' | 'O' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "O"

    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            // Sql.g:699:11: ( ( 'p' | 'P' ) )
            // Sql.g:699:12: ( 'p' | 'P' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "P"

    // $ANTLR start "Q"
    public final void mQ() throws RecognitionException {
        try {
            // Sql.g:700:11: ( ( 'q' | 'Q' ) )
            // Sql.g:700:12: ( 'q' | 'Q' )
            {
            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Q"

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            // Sql.g:701:11: ( ( 'r' | 'R' ) )
            // Sql.g:701:12: ( 'r' | 'R' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "R"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            // Sql.g:702:11: ( ( 's' | 'S' ) )
            // Sql.g:702:12: ( 's' | 'S' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "S"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            // Sql.g:703:11: ( ( 't' | 'T' ) )
            // Sql.g:703:12: ( 't' | 'T' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "U"
    public final void mU() throws RecognitionException {
        try {
            // Sql.g:704:11: ( ( 'u' | 'U' ) )
            // Sql.g:704:12: ( 'u' | 'U' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "U"

    // $ANTLR start "V"
    public final void mV() throws RecognitionException {
        try {
            // Sql.g:705:11: ( ( 'v' | 'V' ) )
            // Sql.g:705:12: ( 'v' | 'V' )
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "V"

    // $ANTLR start "W"
    public final void mW() throws RecognitionException {
        try {
            // Sql.g:706:11: ( ( 'w' | 'W' ) )
            // Sql.g:706:12: ( 'w' | 'W' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "W"

    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            // Sql.g:707:11: ( ( 'x' | 'X' ) )
            // Sql.g:707:12: ( 'x' | 'X' )
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "X"

    // $ANTLR start "Y"
    public final void mY() throws RecognitionException {
        try {
            // Sql.g:708:11: ( ( 'y' | 'Y' ) )
            // Sql.g:708:12: ( 'y' | 'Y' )
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Y"

    // $ANTLR start "Z"
    public final void mZ() throws RecognitionException {
        try {
            // Sql.g:709:11: ( ( 'z' | 'Z' ) )
            // Sql.g:709:12: ( 'z' | 'Z' )
            {
            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Z"

    // $ANTLR start "ABORT"
    public final void mABORT() throws RecognitionException {
        try {
            int _type = ABORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:711:6: ( A B O R T )
            // Sql.g:711:8: A B O R T
            {
            mA(); 
            mB(); 
            mO(); 
            mR(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ABORT"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:712:4: ( A D D )
            // Sql.g:712:6: A D D
            {
            mA(); 
            mD(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "AFTER"
    public final void mAFTER() throws RecognitionException {
        try {
            int _type = AFTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:713:6: ( A F T E R )
            // Sql.g:713:8: A F T E R
            {
            mA(); 
            mF(); 
            mT(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AFTER"

    // $ANTLR start "ALL"
    public final void mALL() throws RecognitionException {
        try {
            int _type = ALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:714:4: ( A L L )
            // Sql.g:714:6: A L L
            {
            mA(); 
            mL(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ALL"

    // $ANTLR start "ALTER"
    public final void mALTER() throws RecognitionException {
        try {
            int _type = ALTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:715:6: ( A L T E R )
            // Sql.g:715:8: A L T E R
            {
            mA(); 
            mL(); 
            mT(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ALTER"

    // $ANTLR start "ANALYZE"
    public final void mANALYZE() throws RecognitionException {
        try {
            int _type = ANALYZE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:716:8: ( A N A L Y Z E )
            // Sql.g:716:10: A N A L Y Z E
            {
            mA(); 
            mN(); 
            mA(); 
            mL(); 
            mY(); 
            mZ(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ANALYZE"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:717:4: ( A N D )
            // Sql.g:717:6: A N D
            {
            mA(); 
            mN(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:718:3: ( A S )
            // Sql.g:718:5: A S
            {
            mA(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "ASC"
    public final void mASC() throws RecognitionException {
        try {
            int _type = ASC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:719:4: ( A S C )
            // Sql.g:719:6: A S C
            {
            mA(); 
            mS(); 
            mC(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASC"

    // $ANTLR start "ATTACH"
    public final void mATTACH() throws RecognitionException {
        try {
            int _type = ATTACH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:720:7: ( A T T A C H )
            // Sql.g:720:9: A T T A C H
            {
            mA(); 
            mT(); 
            mT(); 
            mA(); 
            mC(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ATTACH"

    // $ANTLR start "AUTOINCREMENT"
    public final void mAUTOINCREMENT() throws RecognitionException {
        try {
            int _type = AUTOINCREMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:721:14: ( A U T O I N C R E M E N T )
            // Sql.g:721:16: A U T O I N C R E M E N T
            {
            mA(); 
            mU(); 
            mT(); 
            mO(); 
            mI(); 
            mN(); 
            mC(); 
            mR(); 
            mE(); 
            mM(); 
            mE(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AUTOINCREMENT"

    // $ANTLR start "BEFORE"
    public final void mBEFORE() throws RecognitionException {
        try {
            int _type = BEFORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:722:7: ( B E F O R E )
            // Sql.g:722:9: B E F O R E
            {
            mB(); 
            mE(); 
            mF(); 
            mO(); 
            mR(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BEFORE"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:723:6: ( B E G I N )
            // Sql.g:723:8: B E G I N
            {
            mB(); 
            mE(); 
            mG(); 
            mI(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BEGIN"

    // $ANTLR start "BETWEEN"
    public final void mBETWEEN() throws RecognitionException {
        try {
            int _type = BETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:724:8: ( B E T W E E N )
            // Sql.g:724:10: B E T W E E N
            {
            mB(); 
            mE(); 
            mT(); 
            mW(); 
            mE(); 
            mE(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BETWEEN"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:725:3: ( B Y )
            // Sql.g:725:5: B Y
            {
            mB(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BY"

    // $ANTLR start "CASCADE"
    public final void mCASCADE() throws RecognitionException {
        try {
            int _type = CASCADE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:726:8: ( C A S C A D E )
            // Sql.g:726:10: C A S C A D E
            {
            mC(); 
            mA(); 
            mS(); 
            mC(); 
            mA(); 
            mD(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CASCADE"

    // $ANTLR start "CASE"
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:727:5: ( C A S E )
            // Sql.g:727:7: C A S E
            {
            mC(); 
            mA(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CASE"

    // $ANTLR start "CAST"
    public final void mCAST() throws RecognitionException {
        try {
            int _type = CAST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:728:5: ( C A S T )
            // Sql.g:728:7: C A S T
            {
            mC(); 
            mA(); 
            mS(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CAST"

    // $ANTLR start "CHECK"
    public final void mCHECK() throws RecognitionException {
        try {
            int _type = CHECK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:729:6: ( C H E C K )
            // Sql.g:729:8: C H E C K
            {
            mC(); 
            mH(); 
            mE(); 
            mC(); 
            mK(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHECK"

    // $ANTLR start "COLLATE"
    public final void mCOLLATE() throws RecognitionException {
        try {
            int _type = COLLATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:730:8: ( C O L L A T E )
            // Sql.g:730:10: C O L L A T E
            {
            mC(); 
            mO(); 
            mL(); 
            mL(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLLATE"

    // $ANTLR start "COLUMN"
    public final void mCOLUMN() throws RecognitionException {
        try {
            int _type = COLUMN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:731:7: ( C O L U M N )
            // Sql.g:731:9: C O L U M N
            {
            mC(); 
            mO(); 
            mL(); 
            mU(); 
            mM(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLUMN"

    // $ANTLR start "COMMIT"
    public final void mCOMMIT() throws RecognitionException {
        try {
            int _type = COMMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:732:7: ( C O M M I T )
            // Sql.g:732:9: C O M M I T
            {
            mC(); 
            mO(); 
            mM(); 
            mM(); 
            mI(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMIT"

    // $ANTLR start "CONFLICT"
    public final void mCONFLICT() throws RecognitionException {
        try {
            int _type = CONFLICT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:733:9: ( C O N F L I C T )
            // Sql.g:733:11: C O N F L I C T
            {
            mC(); 
            mO(); 
            mN(); 
            mF(); 
            mL(); 
            mI(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONFLICT"

    // $ANTLR start "CONSTRAINT"
    public final void mCONSTRAINT() throws RecognitionException {
        try {
            int _type = CONSTRAINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:734:11: ( C O N S T R A I N T )
            // Sql.g:734:13: C O N S T R A I N T
            {
            mC(); 
            mO(); 
            mN(); 
            mS(); 
            mT(); 
            mR(); 
            mA(); 
            mI(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONSTRAINT"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:735:7: ( C R E A T E )
            // Sql.g:735:9: C R E A T E
            {
            mC(); 
            mR(); 
            mE(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "CROSS"
    public final void mCROSS() throws RecognitionException {
        try {
            int _type = CROSS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:736:6: ( C R O S S )
            // Sql.g:736:8: C R O S S
            {
            mC(); 
            mR(); 
            mO(); 
            mS(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CROSS"

    // $ANTLR start "CURRENT_TIME"
    public final void mCURRENT_TIME() throws RecognitionException {
        try {
            int _type = CURRENT_TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:737:13: ( C U R R E N T '_' T I M E )
            // Sql.g:737:15: C U R R E N T '_' T I M E
            {
            mC(); 
            mU(); 
            mR(); 
            mR(); 
            mE(); 
            mN(); 
            mT(); 
            match('_'); 
            mT(); 
            mI(); 
            mM(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CURRENT_TIME"

    // $ANTLR start "CURRENT_DATE"
    public final void mCURRENT_DATE() throws RecognitionException {
        try {
            int _type = CURRENT_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:738:13: ( C U R R E N T '_' D A T E )
            // Sql.g:738:15: C U R R E N T '_' D A T E
            {
            mC(); 
            mU(); 
            mR(); 
            mR(); 
            mE(); 
            mN(); 
            mT(); 
            match('_'); 
            mD(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CURRENT_DATE"

    // $ANTLR start "CURRENT_TIMESTAMP"
    public final void mCURRENT_TIMESTAMP() throws RecognitionException {
        try {
            int _type = CURRENT_TIMESTAMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:739:18: ( C U R R E N T '_' T I M E S T A M P )
            // Sql.g:739:20: C U R R E N T '_' T I M E S T A M P
            {
            mC(); 
            mU(); 
            mR(); 
            mR(); 
            mE(); 
            mN(); 
            mT(); 
            match('_'); 
            mT(); 
            mI(); 
            mM(); 
            mE(); 
            mS(); 
            mT(); 
            mA(); 
            mM(); 
            mP(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CURRENT_TIMESTAMP"

    // $ANTLR start "DATABASE"
    public final void mDATABASE() throws RecognitionException {
        try {
            int _type = DATABASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:740:9: ( D A T A B A S E )
            // Sql.g:740:11: D A T A B A S E
            {
            mD(); 
            mA(); 
            mT(); 
            mA(); 
            mB(); 
            mA(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DATABASE"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:741:8: ( D E F A U L T )
            // Sql.g:741:10: D E F A U L T
            {
            mD(); 
            mE(); 
            mF(); 
            mA(); 
            mU(); 
            mL(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "DEFERRABLE"
    public final void mDEFERRABLE() throws RecognitionException {
        try {
            int _type = DEFERRABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:742:11: ( D E F E R R A B L E )
            // Sql.g:742:13: D E F E R R A B L E
            {
            mD(); 
            mE(); 
            mF(); 
            mE(); 
            mR(); 
            mR(); 
            mA(); 
            mB(); 
            mL(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFERRABLE"

    // $ANTLR start "DEFERRED"
    public final void mDEFERRED() throws RecognitionException {
        try {
            int _type = DEFERRED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:743:9: ( D E F E R R E D )
            // Sql.g:743:11: D E F E R R E D
            {
            mD(); 
            mE(); 
            mF(); 
            mE(); 
            mR(); 
            mR(); 
            mE(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFERRED"

    // $ANTLR start "DELETE"
    public final void mDELETE() throws RecognitionException {
        try {
            int _type = DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:744:7: ( D E L E T E )
            // Sql.g:744:9: D E L E T E
            {
            mD(); 
            mE(); 
            mL(); 
            mE(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DELETE"

    // $ANTLR start "DESC"
    public final void mDESC() throws RecognitionException {
        try {
            int _type = DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:745:5: ( D E S C )
            // Sql.g:745:7: D E S C
            {
            mD(); 
            mE(); 
            mS(); 
            mC(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DESC"

    // $ANTLR start "DETACH"
    public final void mDETACH() throws RecognitionException {
        try {
            int _type = DETACH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:746:7: ( D E T A C H )
            // Sql.g:746:9: D E T A C H
            {
            mD(); 
            mE(); 
            mT(); 
            mA(); 
            mC(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DETACH"

    // $ANTLR start "DISTINCT"
    public final void mDISTINCT() throws RecognitionException {
        try {
            int _type = DISTINCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:747:9: ( D I S T I N C T )
            // Sql.g:747:11: D I S T I N C T
            {
            mD(); 
            mI(); 
            mS(); 
            mT(); 
            mI(); 
            mN(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DISTINCT"

    // $ANTLR start "DROP"
    public final void mDROP() throws RecognitionException {
        try {
            int _type = DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:748:5: ( D R O P )
            // Sql.g:748:7: D R O P
            {
            mD(); 
            mR(); 
            mO(); 
            mP(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DROP"

    // $ANTLR start "EACH"
    public final void mEACH() throws RecognitionException {
        try {
            int _type = EACH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:749:5: ( E A C H )
            // Sql.g:749:7: E A C H
            {
            mE(); 
            mA(); 
            mC(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EACH"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:750:5: ( E L S E )
            // Sql.g:750:7: E L S E
            {
            mE(); 
            mL(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:751:4: ( E N D )
            // Sql.g:751:6: E N D
            {
            mE(); 
            mN(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "ESCAPE"
    public final void mESCAPE() throws RecognitionException {
        try {
            int _type = ESCAPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:752:7: ( E S C A P E )
            // Sql.g:752:9: E S C A P E
            {
            mE(); 
            mS(); 
            mC(); 
            mA(); 
            mP(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ESCAPE"

    // $ANTLR start "EXCEPT"
    public final void mEXCEPT() throws RecognitionException {
        try {
            int _type = EXCEPT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:753:7: ( E X C E P T )
            // Sql.g:753:9: E X C E P T
            {
            mE(); 
            mX(); 
            mC(); 
            mE(); 
            mP(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXCEPT"

    // $ANTLR start "EXCLUSIVE"
    public final void mEXCLUSIVE() throws RecognitionException {
        try {
            int _type = EXCLUSIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:754:10: ( E X C L U S I V E )
            // Sql.g:754:12: E X C L U S I V E
            {
            mE(); 
            mX(); 
            mC(); 
            mL(); 
            mU(); 
            mS(); 
            mI(); 
            mV(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXCLUSIVE"

    // $ANTLR start "EXISTS"
    public final void mEXISTS() throws RecognitionException {
        try {
            int _type = EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:755:7: ( E X I S T S )
            // Sql.g:755:9: E X I S T S
            {
            mE(); 
            mX(); 
            mI(); 
            mS(); 
            mT(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXISTS"

    // $ANTLR start "EXPLAIN"
    public final void mEXPLAIN() throws RecognitionException {
        try {
            int _type = EXPLAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:756:8: ( E X P L A I N )
            // Sql.g:756:10: E X P L A I N
            {
            mE(); 
            mX(); 
            mP(); 
            mL(); 
            mA(); 
            mI(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXPLAIN"

    // $ANTLR start "FAIL"
    public final void mFAIL() throws RecognitionException {
        try {
            int _type = FAIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:757:5: ( F A I L )
            // Sql.g:757:7: F A I L
            {
            mF(); 
            mA(); 
            mI(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FAIL"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:758:4: ( F O R )
            // Sql.g:758:6: F O R
            {
            mF(); 
            mO(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "FOREIGN"
    public final void mFOREIGN() throws RecognitionException {
        try {
            int _type = FOREIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:759:8: ( F O R E I G N )
            // Sql.g:759:10: F O R E I G N
            {
            mF(); 
            mO(); 
            mR(); 
            mE(); 
            mI(); 
            mG(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOREIGN"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:760:5: ( F R O M )
            // Sql.g:760:7: F R O M
            {
            mF(); 
            mR(); 
            mO(); 
            mM(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "GLOB"
    public final void mGLOB() throws RecognitionException {
        try {
            int _type = GLOB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:761:5: ( G L O B )
            // Sql.g:761:7: G L O B
            {
            mG(); 
            mL(); 
            mO(); 
            mB(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GLOB"

    // $ANTLR start "GROUP"
    public final void mGROUP() throws RecognitionException {
        try {
            int _type = GROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:762:6: ( G R O U P )
            // Sql.g:762:8: G R O U P
            {
            mG(); 
            mR(); 
            mO(); 
            mU(); 
            mP(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GROUP"

    // $ANTLR start "HAVING"
    public final void mHAVING() throws RecognitionException {
        try {
            int _type = HAVING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:763:7: ( H A V I N G )
            // Sql.g:763:9: H A V I N G
            {
            mH(); 
            mA(); 
            mV(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HAVING"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:764:3: ( I F )
            // Sql.g:764:5: I F
            {
            mI(); 
            mF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "IGNORE"
    public final void mIGNORE() throws RecognitionException {
        try {
            int _type = IGNORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:765:7: ( I G N O R E )
            // Sql.g:765:9: I G N O R E
            {
            mI(); 
            mG(); 
            mN(); 
            mO(); 
            mR(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IGNORE"

    // $ANTLR start "IMMEDIATE"
    public final void mIMMEDIATE() throws RecognitionException {
        try {
            int _type = IMMEDIATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:766:10: ( I M M E D I A T E )
            // Sql.g:766:12: I M M E D I A T E
            {
            mI(); 
            mM(); 
            mM(); 
            mE(); 
            mD(); 
            mI(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMMEDIATE"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:767:3: ( I N )
            // Sql.g:767:5: I N
            {
            mI(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "INDEX"
    public final void mINDEX() throws RecognitionException {
        try {
            int _type = INDEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:768:6: ( I N D E X )
            // Sql.g:768:8: I N D E X
            {
            mI(); 
            mN(); 
            mD(); 
            mE(); 
            mX(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INDEX"

    // $ANTLR start "INDEXED"
    public final void mINDEXED() throws RecognitionException {
        try {
            int _type = INDEXED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:769:8: ( I N D E X E D )
            // Sql.g:769:10: I N D E X E D
            {
            mI(); 
            mN(); 
            mD(); 
            mE(); 
            mX(); 
            mE(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INDEXED"

    // $ANTLR start "INITIALLY"
    public final void mINITIALLY() throws RecognitionException {
        try {
            int _type = INITIALLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:770:10: ( I N I T I A L L Y )
            // Sql.g:770:12: I N I T I A L L Y
            {
            mI(); 
            mN(); 
            mI(); 
            mT(); 
            mI(); 
            mA(); 
            mL(); 
            mL(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INITIALLY"

    // $ANTLR start "INNER"
    public final void mINNER() throws RecognitionException {
        try {
            int _type = INNER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:771:6: ( I N N E R )
            // Sql.g:771:8: I N N E R
            {
            mI(); 
            mN(); 
            mN(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INNER"

    // $ANTLR start "INSERT"
    public final void mINSERT() throws RecognitionException {
        try {
            int _type = INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:772:7: ( I N S E R T )
            // Sql.g:772:9: I N S E R T
            {
            mI(); 
            mN(); 
            mS(); 
            mE(); 
            mR(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSERT"

    // $ANTLR start "INSTEAD"
    public final void mINSTEAD() throws RecognitionException {
        try {
            int _type = INSTEAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:773:8: ( I N S T E A D )
            // Sql.g:773:10: I N S T E A D
            {
            mI(); 
            mN(); 
            mS(); 
            mT(); 
            mE(); 
            mA(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSTEAD"

    // $ANTLR start "INTERSECT"
    public final void mINTERSECT() throws RecognitionException {
        try {
            int _type = INTERSECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:774:10: ( I N T E R S E C T )
            // Sql.g:774:12: I N T E R S E C T
            {
            mI(); 
            mN(); 
            mT(); 
            mE(); 
            mR(); 
            mS(); 
            mE(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTERSECT"

    // $ANTLR start "INTO"
    public final void mINTO() throws RecognitionException {
        try {
            int _type = INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:775:5: ( I N T O )
            // Sql.g:775:7: I N T O
            {
            mI(); 
            mN(); 
            mT(); 
            mO(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTO"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:776:3: ( I S )
            // Sql.g:776:5: I S
            {
            mI(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "ISNULL"
    public final void mISNULL() throws RecognitionException {
        try {
            int _type = ISNULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:777:7: ( I S N U L L )
            // Sql.g:777:9: I S N U L L
            {
            mI(); 
            mS(); 
            mN(); 
            mU(); 
            mL(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ISNULL"

    // $ANTLR start "JOIN"
    public final void mJOIN() throws RecognitionException {
        try {
            int _type = JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:778:5: ( J O I N )
            // Sql.g:778:7: J O I N
            {
            mJ(); 
            mO(); 
            mI(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JOIN"

    // $ANTLR start "KEY"
    public final void mKEY() throws RecognitionException {
        try {
            int _type = KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:779:4: ( K E Y )
            // Sql.g:779:6: K E Y
            {
            mK(); 
            mE(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY"

    // $ANTLR start "LEFT"
    public final void mLEFT() throws RecognitionException {
        try {
            int _type = LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:780:5: ( L E F T )
            // Sql.g:780:7: L E F T
            {
            mL(); 
            mE(); 
            mF(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFT"

    // $ANTLR start "LIKE"
    public final void mLIKE() throws RecognitionException {
        try {
            int _type = LIKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:781:5: ( L I K E )
            // Sql.g:781:7: L I K E
            {
            mL(); 
            mI(); 
            mK(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIKE"

    // $ANTLR start "LIMIT"
    public final void mLIMIT() throws RecognitionException {
        try {
            int _type = LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:782:6: ( L I M I T )
            // Sql.g:782:8: L I M I T
            {
            mL(); 
            mI(); 
            mM(); 
            mI(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIMIT"

    // $ANTLR start "MATCH"
    public final void mMATCH() throws RecognitionException {
        try {
            int _type = MATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:783:6: ( M A T C H )
            // Sql.g:783:8: M A T C H
            {
            mM(); 
            mA(); 
            mT(); 
            mC(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MATCH"

    // $ANTLR start "NATURAL"
    public final void mNATURAL() throws RecognitionException {
        try {
            int _type = NATURAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:784:8: ( N A T U R A L )
            // Sql.g:784:10: N A T U R A L
            {
            mN(); 
            mA(); 
            mT(); 
            mU(); 
            mR(); 
            mA(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NATURAL"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:785:4: ( N O T )
            // Sql.g:785:6: N O T
            {
            mN(); 
            mO(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "NOTNULL"
    public final void mNOTNULL() throws RecognitionException {
        try {
            int _type = NOTNULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:786:8: ( N O T N U L L )
            // Sql.g:786:10: N O T N U L L
            {
            mN(); 
            mO(); 
            mT(); 
            mN(); 
            mU(); 
            mL(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTNULL"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:787:5: ( N U L L )
            // Sql.g:787:7: N U L L
            {
            mN(); 
            mU(); 
            mL(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "OF"
    public final void mOF() throws RecognitionException {
        try {
            int _type = OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:788:3: ( O F )
            // Sql.g:788:5: O F
            {
            mO(); 
            mF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OF"

    // $ANTLR start "OFFSET"
    public final void mOFFSET() throws RecognitionException {
        try {
            int _type = OFFSET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:789:7: ( O F F S E T )
            // Sql.g:789:9: O F F S E T
            {
            mO(); 
            mF(); 
            mF(); 
            mS(); 
            mE(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OFFSET"

    // $ANTLR start "ON"
    public final void mON() throws RecognitionException {
        try {
            int _type = ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:790:3: ( O N )
            // Sql.g:790:5: O N
            {
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ON"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:791:3: ( O R )
            // Sql.g:791:5: O R
            {
            mO(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "ORDER"
    public final void mORDER() throws RecognitionException {
        try {
            int _type = ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:792:6: ( O R D E R )
            // Sql.g:792:8: O R D E R
            {
            mO(); 
            mR(); 
            mD(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ORDER"

    // $ANTLR start "OUTER"
    public final void mOUTER() throws RecognitionException {
        try {
            int _type = OUTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:793:6: ( O U T E R )
            // Sql.g:793:8: O U T E R
            {
            mO(); 
            mU(); 
            mT(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OUTER"

    // $ANTLR start "PLAN"
    public final void mPLAN() throws RecognitionException {
        try {
            int _type = PLAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:794:5: ( P L A N )
            // Sql.g:794:7: P L A N
            {
            mP(); 
            mL(); 
            mA(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLAN"

    // $ANTLR start "PRAGMA"
    public final void mPRAGMA() throws RecognitionException {
        try {
            int _type = PRAGMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:795:7: ( P R A G M A )
            // Sql.g:795:9: P R A G M A
            {
            mP(); 
            mR(); 
            mA(); 
            mG(); 
            mM(); 
            mA(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRAGMA"

    // $ANTLR start "PRIMARY"
    public final void mPRIMARY() throws RecognitionException {
        try {
            int _type = PRIMARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:796:8: ( P R I M A R Y )
            // Sql.g:796:10: P R I M A R Y
            {
            mP(); 
            mR(); 
            mI(); 
            mM(); 
            mA(); 
            mR(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRIMARY"

    // $ANTLR start "QUERY"
    public final void mQUERY() throws RecognitionException {
        try {
            int _type = QUERY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:797:6: ( Q U E R Y )
            // Sql.g:797:8: Q U E R Y
            {
            mQ(); 
            mU(); 
            mE(); 
            mR(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUERY"

    // $ANTLR start "RAISE"
    public final void mRAISE() throws RecognitionException {
        try {
            int _type = RAISE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:798:6: ( R A I S E )
            // Sql.g:798:8: R A I S E
            {
            mR(); 
            mA(); 
            mI(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RAISE"

    // $ANTLR start "REFERENCES"
    public final void mREFERENCES() throws RecognitionException {
        try {
            int _type = REFERENCES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:799:11: ( R E F E R E N C E S )
            // Sql.g:799:13: R E F E R E N C E S
            {
            mR(); 
            mE(); 
            mF(); 
            mE(); 
            mR(); 
            mE(); 
            mN(); 
            mC(); 
            mE(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REFERENCES"

    // $ANTLR start "REGEXP"
    public final void mREGEXP() throws RecognitionException {
        try {
            int _type = REGEXP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:800:7: ( R E G E X P )
            // Sql.g:800:9: R E G E X P
            {
            mR(); 
            mE(); 
            mG(); 
            mE(); 
            mX(); 
            mP(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REGEXP"

    // $ANTLR start "REINDEX"
    public final void mREINDEX() throws RecognitionException {
        try {
            int _type = REINDEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:801:8: ( R E I N D E X )
            // Sql.g:801:10: R E I N D E X
            {
            mR(); 
            mE(); 
            mI(); 
            mN(); 
            mD(); 
            mE(); 
            mX(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REINDEX"

    // $ANTLR start "RELEASE"
    public final void mRELEASE() throws RecognitionException {
        try {
            int _type = RELEASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:802:8: ( R E L E A S E )
            // Sql.g:802:10: R E L E A S E
            {
            mR(); 
            mE(); 
            mL(); 
            mE(); 
            mA(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RELEASE"

    // $ANTLR start "RENAME"
    public final void mRENAME() throws RecognitionException {
        try {
            int _type = RENAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:803:7: ( R E N A M E )
            // Sql.g:803:9: R E N A M E
            {
            mR(); 
            mE(); 
            mN(); 
            mA(); 
            mM(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RENAME"

    // $ANTLR start "REPLACE"
    public final void mREPLACE() throws RecognitionException {
        try {
            int _type = REPLACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:804:8: ( R E P L A C E )
            // Sql.g:804:10: R E P L A C E
            {
            mR(); 
            mE(); 
            mP(); 
            mL(); 
            mA(); 
            mC(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REPLACE"

    // $ANTLR start "RESTRICT"
    public final void mRESTRICT() throws RecognitionException {
        try {
            int _type = RESTRICT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:805:9: ( R E S T R I C T )
            // Sql.g:805:11: R E S T R I C T
            {
            mR(); 
            mE(); 
            mS(); 
            mT(); 
            mR(); 
            mI(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RESTRICT"

    // $ANTLR start "ROLLBACK"
    public final void mROLLBACK() throws RecognitionException {
        try {
            int _type = ROLLBACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:806:9: ( R O L L B A C K )
            // Sql.g:806:11: R O L L B A C K
            {
            mR(); 
            mO(); 
            mL(); 
            mL(); 
            mB(); 
            mA(); 
            mC(); 
            mK(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ROLLBACK"

    // $ANTLR start "ROW"
    public final void mROW() throws RecognitionException {
        try {
            int _type = ROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:807:4: ( R O W )
            // Sql.g:807:6: R O W
            {
            mR(); 
            mO(); 
            mW(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ROW"

    // $ANTLR start "SAVEPOINT"
    public final void mSAVEPOINT() throws RecognitionException {
        try {
            int _type = SAVEPOINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:808:10: ( S A V E P O I N T )
            // Sql.g:808:12: S A V E P O I N T
            {
            mS(); 
            mA(); 
            mV(); 
            mE(); 
            mP(); 
            mO(); 
            mI(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SAVEPOINT"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:809:7: ( S E L E C T )
            // Sql.g:809:9: S E L E C T
            {
            mS(); 
            mE(); 
            mL(); 
            mE(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:810:4: ( S E T )
            // Sql.g:810:6: S E T
            {
            mS(); 
            mE(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "TABLE"
    public final void mTABLE() throws RecognitionException {
        try {
            int _type = TABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:811:6: ( T A B L E )
            // Sql.g:811:8: T A B L E
            {
            mT(); 
            mA(); 
            mB(); 
            mL(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TABLE"

    // $ANTLR start "TEMPORARY"
    public final void mTEMPORARY() throws RecognitionException {
        try {
            int _type = TEMPORARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:812:10: ( T E M P ( O R A R Y )? )
            // Sql.g:812:12: T E M P ( O R A R Y )?
            {
            mT(); 
            mE(); 
            mM(); 
            mP(); 
            // Sql.g:812:20: ( O R A R Y )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='O'||LA1_0=='o') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Sql.g:812:22: O R A R Y
                    {
                    mO(); 
                    mR(); 
                    mA(); 
                    mR(); 
                    mY(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEMPORARY"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:813:5: ( T H E N )
            // Sql.g:813:7: T H E N
            {
            mT(); 
            mH(); 
            mE(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:814:3: ( T O )
            // Sql.g:814:5: T O
            {
            mT(); 
            mO(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "TRANSACTION"
    public final void mTRANSACTION() throws RecognitionException {
        try {
            int _type = TRANSACTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:815:12: ( T R A N S A C T I O N )
            // Sql.g:815:14: T R A N S A C T I O N
            {
            mT(); 
            mR(); 
            mA(); 
            mN(); 
            mS(); 
            mA(); 
            mC(); 
            mT(); 
            mI(); 
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRANSACTION"

    // $ANTLR start "TRIGGER"
    public final void mTRIGGER() throws RecognitionException {
        try {
            int _type = TRIGGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:816:8: ( T R I G G E R )
            // Sql.g:816:10: T R I G G E R
            {
            mT(); 
            mR(); 
            mI(); 
            mG(); 
            mG(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRIGGER"

    // $ANTLR start "UNION"
    public final void mUNION() throws RecognitionException {
        try {
            int _type = UNION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:817:6: ( U N I O N )
            // Sql.g:817:8: U N I O N
            {
            mU(); 
            mN(); 
            mI(); 
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNION"

    // $ANTLR start "UNIQUE"
    public final void mUNIQUE() throws RecognitionException {
        try {
            int _type = UNIQUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:818:7: ( U N I Q U E )
            // Sql.g:818:9: U N I Q U E
            {
            mU(); 
            mN(); 
            mI(); 
            mQ(); 
            mU(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNIQUE"

    // $ANTLR start "UPDATE"
    public final void mUPDATE() throws RecognitionException {
        try {
            int _type = UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:819:7: ( U P D A T E )
            // Sql.g:819:9: U P D A T E
            {
            mU(); 
            mP(); 
            mD(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UPDATE"

    // $ANTLR start "USING"
    public final void mUSING() throws RecognitionException {
        try {
            int _type = USING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:820:6: ( U S I N G )
            // Sql.g:820:8: U S I N G
            {
            mU(); 
            mS(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USING"

    // $ANTLR start "VACUUM"
    public final void mVACUUM() throws RecognitionException {
        try {
            int _type = VACUUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:821:7: ( V A C U U M )
            // Sql.g:821:9: V A C U U M
            {
            mV(); 
            mA(); 
            mC(); 
            mU(); 
            mU(); 
            mM(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VACUUM"

    // $ANTLR start "VALUES"
    public final void mVALUES() throws RecognitionException {
        try {
            int _type = VALUES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:822:7: ( V A L U E S )
            // Sql.g:822:9: V A L U E S
            {
            mV(); 
            mA(); 
            mL(); 
            mU(); 
            mE(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VALUES"

    // $ANTLR start "VIEW"
    public final void mVIEW() throws RecognitionException {
        try {
            int _type = VIEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:823:5: ( V I E W )
            // Sql.g:823:7: V I E W
            {
            mV(); 
            mI(); 
            mE(); 
            mW(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VIEW"

    // $ANTLR start "VIRTUAL"
    public final void mVIRTUAL() throws RecognitionException {
        try {
            int _type = VIRTUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:824:8: ( V I R T U A L )
            // Sql.g:824:10: V I R T U A L
            {
            mV(); 
            mI(); 
            mR(); 
            mT(); 
            mU(); 
            mA(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VIRTUAL"

    // $ANTLR start "WHEN"
    public final void mWHEN() throws RecognitionException {
        try {
            int _type = WHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:825:5: ( W H E N )
            // Sql.g:825:7: W H E N
            {
            mW(); 
            mH(); 
            mE(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHEN"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:826:6: ( W H E R E )
            // Sql.g:826:8: W H E R E
            {
            mW(); 
            mH(); 
            mE(); 
            mR(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "ID_START"
    public final void mID_START() throws RecognitionException {
        try {
            // Sql.g:828:18: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // Sql.g:828:20: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "ID_START"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:829:3: ( ID_START ( ID_START | '0' .. '9' )* )
            // Sql.g:829:5: ID_START ( ID_START | '0' .. '9' )*
            {
            mID_START(); 
            // Sql.g:829:14: ( ID_START | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Sql.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:831:7: ( '\\'' (~ ( '\\'' ) )* '\\'' )
            // Sql.g:831:9: '\\'' (~ ( '\\'' ) )* '\\''
            {
            match('\''); 
            // Sql.g:831:14: (~ ( '\\'' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Sql.g:831:16: ~ ( '\\'' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:832:8: ( ( '0' .. '9' )+ )
            // Sql.g:832:10: ( '0' .. '9' )+
            {
            // Sql.g:832:10: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Sql.g:832:11: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "FLOAT_EXP"
    public final void mFLOAT_EXP() throws RecognitionException {
        try {
            // Sql.g:833:20: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // Sql.g:833:22: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Sql.g:833:32: ( '+' | '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='+'||LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Sql.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // Sql.g:833:43: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Sql.g:833:44: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "FLOAT_EXP"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:835:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( FLOAT_EXP )? | '.' ( '0' .. '9' )+ ( FLOAT_EXP )? | ( '0' .. '9' )+ FLOAT_EXP )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // Sql.g:835:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( FLOAT_EXP )?
                    {
                    // Sql.g:835:9: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // Sql.g:835:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    match('.'); 
                    // Sql.g:835:25: ( '0' .. '9' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // Sql.g:835:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    // Sql.g:835:37: ( FLOAT_EXP )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // Sql.g:835:37: FLOAT_EXP
                            {
                            mFLOAT_EXP(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Sql.g:836:9: '.' ( '0' .. '9' )+ ( FLOAT_EXP )?
                    {
                    match('.'); 
                    // Sql.g:836:13: ( '0' .. '9' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // Sql.g:836:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    // Sql.g:836:25: ( FLOAT_EXP )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='E'||LA11_0=='e') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // Sql.g:836:25: FLOAT_EXP
                            {
                            mFLOAT_EXP(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // Sql.g:837:9: ( '0' .. '9' )+ FLOAT_EXP
                    {
                    // Sql.g:837:9: ( '0' .. '9' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // Sql.g:837:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    mFLOAT_EXP(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "BLOB"
    public final void mBLOB() throws RecognitionException {
        try {
            int _type = BLOB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:839:5: ( ( 'x' | 'X' ) '\\'' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ '\\'' )
            // Sql.g:839:7: ( 'x' | 'X' ) '\\'' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ '\\''
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('\''); 
            // Sql.g:839:22: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='F')||(LA14_0>='a' && LA14_0<='f')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // Sql.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BLOB"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            // Sql.g:841:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // Sql.g:841:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // Sql.g:841:24: ( options {greedy=false; } : . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='*') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='/') ) {
                        alt15=2;
                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='.')||(LA15_1>='0' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<=')')||(LA15_0>='+' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // Sql.g:841:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match("*/"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            // Sql.g:842:22: ( '--' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' | EOF ) )
            // Sql.g:842:24: '--' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' | EOF )
            {
            match("--"); 

            // Sql.g:842:29: (~ ( '\\n' | '\\r' ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // Sql.g:842:29: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // Sql.g:842:43: ( ( '\\r' )? '\\n' | EOF )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\n'||LA18_0=='\r') ) {
                alt18=1;
            }
            else {
                alt18=2;}
            switch (alt18) {
                case 1 :
                    // Sql.g:842:44: ( '\\r' )? '\\n'
                    {
                    // Sql.g:842:44: ( '\\r' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='\r') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // Sql.g:842:44: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;
                case 2 :
                    // Sql.g:842:55: EOF
                    {
                    match(EOF); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:843:3: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' | COMMENT | LINE_COMMENT ) )
            // Sql.g:843:5: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' | COMMENT | LINE_COMMENT )
            {
            // Sql.g:843:5: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' | COMMENT | LINE_COMMENT )
            int alt19=7;
            switch ( input.LA(1) ) {
            case ' ':
                {
                alt19=1;
                }
                break;
            case '\r':
                {
                alt19=2;
                }
                break;
            case '\t':
                {
                alt19=3;
                }
                break;
            case '\f':
                {
                alt19=4;
                }
                break;
            case '\n':
                {
                alt19=5;
                }
                break;
            case '/':
                {
                alt19=6;
                }
                break;
            case '-':
                {
                alt19=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // Sql.g:843:6: ' '
                    {
                    match(' '); 

                    }
                    break;
                case 2 :
                    // Sql.g:843:10: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Sql.g:843:15: '\\t'
                    {
                    match('\t'); 

                    }
                    break;
                case 4 :
                    // Sql.g:843:20: '\\u000C'
                    {
                    match('\f'); 

                    }
                    break;
                case 5 :
                    // Sql.g:843:29: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 6 :
                    // Sql.g:843:34: COMMENT
                    {
                    mCOMMENT(); 

                    }
                    break;
                case 7 :
                    // Sql.g:843:42: LINE_COMMENT
                    {
                    mLINE_COMMENT(); 

                    }
                    break;

            }

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // Sql.g:1:8: ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 | LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ | SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE | DOUBLE_PIPE | PLUS | MINUS | TILDA | ASTERISK | SLASH | PERCENT | SEMI | DOT | COMMA | LPAREN | RPAREN | QUESTION | COLON | AT | DOLLAR | ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE | ID | STRING | INTEGER | FLOAT | BLOB | WS )
        int alt20=150;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // Sql.g:1:10: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 2 :
                // Sql.g:1:17: EQUALS2
                {
                mEQUALS2(); 

                }
                break;
            case 3 :
                // Sql.g:1:25: NOT_EQUALS
                {
                mNOT_EQUALS(); 

                }
                break;
            case 4 :
                // Sql.g:1:36: NOT_EQUALS2
                {
                mNOT_EQUALS2(); 

                }
                break;
            case 5 :
                // Sql.g:1:48: LESS
                {
                mLESS(); 

                }
                break;
            case 6 :
                // Sql.g:1:53: LESS_OR_EQ
                {
                mLESS_OR_EQ(); 

                }
                break;
            case 7 :
                // Sql.g:1:64: GREATER
                {
                mGREATER(); 

                }
                break;
            case 8 :
                // Sql.g:1:72: GREATER_OR_EQ
                {
                mGREATER_OR_EQ(); 

                }
                break;
            case 9 :
                // Sql.g:1:86: SHIFT_LEFT
                {
                mSHIFT_LEFT(); 

                }
                break;
            case 10 :
                // Sql.g:1:97: SHIFT_RIGHT
                {
                mSHIFT_RIGHT(); 

                }
                break;
            case 11 :
                // Sql.g:1:109: AMPERSAND
                {
                mAMPERSAND(); 

                }
                break;
            case 12 :
                // Sql.g:1:119: PIPE
                {
                mPIPE(); 

                }
                break;
            case 13 :
                // Sql.g:1:124: DOUBLE_PIPE
                {
                mDOUBLE_PIPE(); 

                }
                break;
            case 14 :
                // Sql.g:1:136: PLUS
                {
                mPLUS(); 

                }
                break;
            case 15 :
                // Sql.g:1:141: MINUS
                {
                mMINUS(); 

                }
                break;
            case 16 :
                // Sql.g:1:147: TILDA
                {
                mTILDA(); 

                }
                break;
            case 17 :
                // Sql.g:1:153: ASTERISK
                {
                mASTERISK(); 

                }
                break;
            case 18 :
                // Sql.g:1:162: SLASH
                {
                mSLASH(); 

                }
                break;
            case 19 :
                // Sql.g:1:168: PERCENT
                {
                mPERCENT(); 

                }
                break;
            case 20 :
                // Sql.g:1:176: SEMI
                {
                mSEMI(); 

                }
                break;
            case 21 :
                // Sql.g:1:181: DOT
                {
                mDOT(); 

                }
                break;
            case 22 :
                // Sql.g:1:185: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 23 :
                // Sql.g:1:191: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 24 :
                // Sql.g:1:198: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 25 :
                // Sql.g:1:205: QUESTION
                {
                mQUESTION(); 

                }
                break;
            case 26 :
                // Sql.g:1:214: COLON
                {
                mCOLON(); 

                }
                break;
            case 27 :
                // Sql.g:1:220: AT
                {
                mAT(); 

                }
                break;
            case 28 :
                // Sql.g:1:223: DOLLAR
                {
                mDOLLAR(); 

                }
                break;
            case 29 :
                // Sql.g:1:230: ABORT
                {
                mABORT(); 

                }
                break;
            case 30 :
                // Sql.g:1:236: ADD
                {
                mADD(); 

                }
                break;
            case 31 :
                // Sql.g:1:240: AFTER
                {
                mAFTER(); 

                }
                break;
            case 32 :
                // Sql.g:1:246: ALL
                {
                mALL(); 

                }
                break;
            case 33 :
                // Sql.g:1:250: ALTER
                {
                mALTER(); 

                }
                break;
            case 34 :
                // Sql.g:1:256: ANALYZE
                {
                mANALYZE(); 

                }
                break;
            case 35 :
                // Sql.g:1:264: AND
                {
                mAND(); 

                }
                break;
            case 36 :
                // Sql.g:1:268: AS
                {
                mAS(); 

                }
                break;
            case 37 :
                // Sql.g:1:271: ASC
                {
                mASC(); 

                }
                break;
            case 38 :
                // Sql.g:1:275: ATTACH
                {
                mATTACH(); 

                }
                break;
            case 39 :
                // Sql.g:1:282: AUTOINCREMENT
                {
                mAUTOINCREMENT(); 

                }
                break;
            case 40 :
                // Sql.g:1:296: BEFORE
                {
                mBEFORE(); 

                }
                break;
            case 41 :
                // Sql.g:1:303: BEGIN
                {
                mBEGIN(); 

                }
                break;
            case 42 :
                // Sql.g:1:309: BETWEEN
                {
                mBETWEEN(); 

                }
                break;
            case 43 :
                // Sql.g:1:317: BY
                {
                mBY(); 

                }
                break;
            case 44 :
                // Sql.g:1:320: CASCADE
                {
                mCASCADE(); 

                }
                break;
            case 45 :
                // Sql.g:1:328: CASE
                {
                mCASE(); 

                }
                break;
            case 46 :
                // Sql.g:1:333: CAST
                {
                mCAST(); 

                }
                break;
            case 47 :
                // Sql.g:1:338: CHECK
                {
                mCHECK(); 

                }
                break;
            case 48 :
                // Sql.g:1:344: COLLATE
                {
                mCOLLATE(); 

                }
                break;
            case 49 :
                // Sql.g:1:352: COLUMN
                {
                mCOLUMN(); 

                }
                break;
            case 50 :
                // Sql.g:1:359: COMMIT
                {
                mCOMMIT(); 

                }
                break;
            case 51 :
                // Sql.g:1:366: CONFLICT
                {
                mCONFLICT(); 

                }
                break;
            case 52 :
                // Sql.g:1:375: CONSTRAINT
                {
                mCONSTRAINT(); 

                }
                break;
            case 53 :
                // Sql.g:1:386: CREATE
                {
                mCREATE(); 

                }
                break;
            case 54 :
                // Sql.g:1:393: CROSS
                {
                mCROSS(); 

                }
                break;
            case 55 :
                // Sql.g:1:399: CURRENT_TIME
                {
                mCURRENT_TIME(); 

                }
                break;
            case 56 :
                // Sql.g:1:412: CURRENT_DATE
                {
                mCURRENT_DATE(); 

                }
                break;
            case 57 :
                // Sql.g:1:425: CURRENT_TIMESTAMP
                {
                mCURRENT_TIMESTAMP(); 

                }
                break;
            case 58 :
                // Sql.g:1:443: DATABASE
                {
                mDATABASE(); 

                }
                break;
            case 59 :
                // Sql.g:1:452: DEFAULT
                {
                mDEFAULT(); 

                }
                break;
            case 60 :
                // Sql.g:1:460: DEFERRABLE
                {
                mDEFERRABLE(); 

                }
                break;
            case 61 :
                // Sql.g:1:471: DEFERRED
                {
                mDEFERRED(); 

                }
                break;
            case 62 :
                // Sql.g:1:480: DELETE
                {
                mDELETE(); 

                }
                break;
            case 63 :
                // Sql.g:1:487: DESC
                {
                mDESC(); 

                }
                break;
            case 64 :
                // Sql.g:1:492: DETACH
                {
                mDETACH(); 

                }
                break;
            case 65 :
                // Sql.g:1:499: DISTINCT
                {
                mDISTINCT(); 

                }
                break;
            case 66 :
                // Sql.g:1:508: DROP
                {
                mDROP(); 

                }
                break;
            case 67 :
                // Sql.g:1:513: EACH
                {
                mEACH(); 

                }
                break;
            case 68 :
                // Sql.g:1:518: ELSE
                {
                mELSE(); 

                }
                break;
            case 69 :
                // Sql.g:1:523: END
                {
                mEND(); 

                }
                break;
            case 70 :
                // Sql.g:1:527: ESCAPE
                {
                mESCAPE(); 

                }
                break;
            case 71 :
                // Sql.g:1:534: EXCEPT
                {
                mEXCEPT(); 

                }
                break;
            case 72 :
                // Sql.g:1:541: EXCLUSIVE
                {
                mEXCLUSIVE(); 

                }
                break;
            case 73 :
                // Sql.g:1:551: EXISTS
                {
                mEXISTS(); 

                }
                break;
            case 74 :
                // Sql.g:1:558: EXPLAIN
                {
                mEXPLAIN(); 

                }
                break;
            case 75 :
                // Sql.g:1:566: FAIL
                {
                mFAIL(); 

                }
                break;
            case 76 :
                // Sql.g:1:571: FOR
                {
                mFOR(); 

                }
                break;
            case 77 :
                // Sql.g:1:575: FOREIGN
                {
                mFOREIGN(); 

                }
                break;
            case 78 :
                // Sql.g:1:583: FROM
                {
                mFROM(); 

                }
                break;
            case 79 :
                // Sql.g:1:588: GLOB
                {
                mGLOB(); 

                }
                break;
            case 80 :
                // Sql.g:1:593: GROUP
                {
                mGROUP(); 

                }
                break;
            case 81 :
                // Sql.g:1:599: HAVING
                {
                mHAVING(); 

                }
                break;
            case 82 :
                // Sql.g:1:606: IF
                {
                mIF(); 

                }
                break;
            case 83 :
                // Sql.g:1:609: IGNORE
                {
                mIGNORE(); 

                }
                break;
            case 84 :
                // Sql.g:1:616: IMMEDIATE
                {
                mIMMEDIATE(); 

                }
                break;
            case 85 :
                // Sql.g:1:626: IN
                {
                mIN(); 

                }
                break;
            case 86 :
                // Sql.g:1:629: INDEX
                {
                mINDEX(); 

                }
                break;
            case 87 :
                // Sql.g:1:635: INDEXED
                {
                mINDEXED(); 

                }
                break;
            case 88 :
                // Sql.g:1:643: INITIALLY
                {
                mINITIALLY(); 

                }
                break;
            case 89 :
                // Sql.g:1:653: INNER
                {
                mINNER(); 

                }
                break;
            case 90 :
                // Sql.g:1:659: INSERT
                {
                mINSERT(); 

                }
                break;
            case 91 :
                // Sql.g:1:666: INSTEAD
                {
                mINSTEAD(); 

                }
                break;
            case 92 :
                // Sql.g:1:674: INTERSECT
                {
                mINTERSECT(); 

                }
                break;
            case 93 :
                // Sql.g:1:684: INTO
                {
                mINTO(); 

                }
                break;
            case 94 :
                // Sql.g:1:689: IS
                {
                mIS(); 

                }
                break;
            case 95 :
                // Sql.g:1:692: ISNULL
                {
                mISNULL(); 

                }
                break;
            case 96 :
                // Sql.g:1:699: JOIN
                {
                mJOIN(); 

                }
                break;
            case 97 :
                // Sql.g:1:704: KEY
                {
                mKEY(); 

                }
                break;
            case 98 :
                // Sql.g:1:708: LEFT
                {
                mLEFT(); 

                }
                break;
            case 99 :
                // Sql.g:1:713: LIKE
                {
                mLIKE(); 

                }
                break;
            case 100 :
                // Sql.g:1:718: LIMIT
                {
                mLIMIT(); 

                }
                break;
            case 101 :
                // Sql.g:1:724: MATCH
                {
                mMATCH(); 

                }
                break;
            case 102 :
                // Sql.g:1:730: NATURAL
                {
                mNATURAL(); 

                }
                break;
            case 103 :
                // Sql.g:1:738: NOT
                {
                mNOT(); 

                }
                break;
            case 104 :
                // Sql.g:1:742: NOTNULL
                {
                mNOTNULL(); 

                }
                break;
            case 105 :
                // Sql.g:1:750: NULL
                {
                mNULL(); 

                }
                break;
            case 106 :
                // Sql.g:1:755: OF
                {
                mOF(); 

                }
                break;
            case 107 :
                // Sql.g:1:758: OFFSET
                {
                mOFFSET(); 

                }
                break;
            case 108 :
                // Sql.g:1:765: ON
                {
                mON(); 

                }
                break;
            case 109 :
                // Sql.g:1:768: OR
                {
                mOR(); 

                }
                break;
            case 110 :
                // Sql.g:1:771: ORDER
                {
                mORDER(); 

                }
                break;
            case 111 :
                // Sql.g:1:777: OUTER
                {
                mOUTER(); 

                }
                break;
            case 112 :
                // Sql.g:1:783: PLAN
                {
                mPLAN(); 

                }
                break;
            case 113 :
                // Sql.g:1:788: PRAGMA
                {
                mPRAGMA(); 

                }
                break;
            case 114 :
                // Sql.g:1:795: PRIMARY
                {
                mPRIMARY(); 

                }
                break;
            case 115 :
                // Sql.g:1:803: QUERY
                {
                mQUERY(); 

                }
                break;
            case 116 :
                // Sql.g:1:809: RAISE
                {
                mRAISE(); 

                }
                break;
            case 117 :
                // Sql.g:1:815: REFERENCES
                {
                mREFERENCES(); 

                }
                break;
            case 118 :
                // Sql.g:1:826: REGEXP
                {
                mREGEXP(); 

                }
                break;
            case 119 :
                // Sql.g:1:833: REINDEX
                {
                mREINDEX(); 

                }
                break;
            case 120 :
                // Sql.g:1:841: RELEASE
                {
                mRELEASE(); 

                }
                break;
            case 121 :
                // Sql.g:1:849: RENAME
                {
                mRENAME(); 

                }
                break;
            case 122 :
                // Sql.g:1:856: REPLACE
                {
                mREPLACE(); 

                }
                break;
            case 123 :
                // Sql.g:1:864: RESTRICT
                {
                mRESTRICT(); 

                }
                break;
            case 124 :
                // Sql.g:1:873: ROLLBACK
                {
                mROLLBACK(); 

                }
                break;
            case 125 :
                // Sql.g:1:882: ROW
                {
                mROW(); 

                }
                break;
            case 126 :
                // Sql.g:1:886: SAVEPOINT
                {
                mSAVEPOINT(); 

                }
                break;
            case 127 :
                // Sql.g:1:896: SELECT
                {
                mSELECT(); 

                }
                break;
            case 128 :
                // Sql.g:1:903: SET
                {
                mSET(); 

                }
                break;
            case 129 :
                // Sql.g:1:907: TABLE
                {
                mTABLE(); 

                }
                break;
            case 130 :
                // Sql.g:1:913: TEMPORARY
                {
                mTEMPORARY(); 

                }
                break;
            case 131 :
                // Sql.g:1:923: THEN
                {
                mTHEN(); 

                }
                break;
            case 132 :
                // Sql.g:1:928: TO
                {
                mTO(); 

                }
                break;
            case 133 :
                // Sql.g:1:931: TRANSACTION
                {
                mTRANSACTION(); 

                }
                break;
            case 134 :
                // Sql.g:1:943: TRIGGER
                {
                mTRIGGER(); 

                }
                break;
            case 135 :
                // Sql.g:1:951: UNION
                {
                mUNION(); 

                }
                break;
            case 136 :
                // Sql.g:1:957: UNIQUE
                {
                mUNIQUE(); 

                }
                break;
            case 137 :
                // Sql.g:1:964: UPDATE
                {
                mUPDATE(); 

                }
                break;
            case 138 :
                // Sql.g:1:971: USING
                {
                mUSING(); 

                }
                break;
            case 139 :
                // Sql.g:1:977: VACUUM
                {
                mVACUUM(); 

                }
                break;
            case 140 :
                // Sql.g:1:984: VALUES
                {
                mVALUES(); 

                }
                break;
            case 141 :
                // Sql.g:1:991: VIEW
                {
                mVIEW(); 

                }
                break;
            case 142 :
                // Sql.g:1:996: VIRTUAL
                {
                mVIRTUAL(); 

                }
                break;
            case 143 :
                // Sql.g:1:1004: WHEN
                {
                mWHEN(); 

                }
                break;
            case 144 :
                // Sql.g:1:1009: WHERE
                {
                mWHERE(); 

                }
                break;
            case 145 :
                // Sql.g:1:1015: ID
                {
                mID(); 

                }
                break;
            case 146 :
                // Sql.g:1:1018: STRING
                {
                mSTRING(); 

                }
                break;
            case 147 :
                // Sql.g:1:1025: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 148 :
                // Sql.g:1:1033: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 149 :
                // Sql.g:1:1039: BLOB
                {
                mBLOB(); 

                }
                break;
            case 150 :
                // Sql.g:1:1044: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA13_eotS =
        "\5\uffff";
    static final String DFA13_eofS =
        "\5\uffff";
    static final String DFA13_minS =
        "\2\56\3\uffff";
    static final String DFA13_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA13_specialS =
        "\5\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "834:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( FLOAT_EXP )? | '.' ( '0' .. '9' )+ ( FLOAT_EXP )? | ( '0' .. '9' )+ FLOAT_EXP );";
        }
    }
    static final String DFA20_eotS =
        "\1\uffff\1\63\1\uffff\1\67\1\72\1\uffff\1\74\1\uffff\1\75\2\uffff"+
        "\1\76\2\uffff\1\100\7\uffff\30\60\1\uffff\1\u0084\21\uffff\2\60"+
        "\1\u0089\6\60\1\u0093\24\60\1\u00b0\1\60\1\u00b3\1\u00b4\11\60\1"+
        "\u00c4\1\60\1\u00c7\1\u00c8\11\60\1\u00dd\11\60\2\uffff\1\u00e9"+
        "\1\60\1\u00eb\1\60\1\uffff\1\u00ed\1\60\1\u00ef\6\60\1\uffff\17"+
        "\60\1\u010a\6\60\1\u0112\5\60\1\uffff\2\60\2\uffff\7\60\1\u0124"+
        "\5\60\1\u012a\1\60\1\uffff\2\60\2\uffff\6\60\1\u0135\11\60\1\u013f"+
        "\3\60\1\uffff\13\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff"+
        "\10\60\1\u015b\1\u015c\14\60\1\u0169\1\60\1\u016b\1\60\1\uffff\4"+
        "\60\1\u0171\1\60\1\u0173\1\uffff\1\60\1\u0175\1\u0176\1\60\1\u0178"+
        "\3\60\1\u017c\7\60\1\u0184\1\uffff\1\u0185\1\u0186\2\60\1\u0189"+
        "\1\uffff\5\60\1\u018f\4\60\1\uffff\11\60\1\uffff\3\60\1\u01a0\1"+
        "\60\1\u01a3\6\60\1\u01aa\1\60\1\u01ac\2\60\1\u01af\1\u01b0\2\60"+
        "\1\u01b3\1\u01b4\4\60\2\uffff\5\60\1\u01be\1\60\1\u01c0\4\60\1\uffff"+
        "\1\60\1\uffff\5\60\1\uffff\1\60\1\uffff\1\60\2\uffff\1\u01cd\1\uffff"+
        "\3\60\1\uffff\3\60\1\u01d4\1\60\1\u01d7\1\60\3\uffff\1\u01d9\1\u01da"+
        "\1\uffff\3\60\1\u01de\1\u01df\1\uffff\2\60\1\u01e2\1\u01e3\14\60"+
        "\1\uffff\1\60\1\u01f1\1\uffff\2\60\1\u01f4\1\u01f5\2\60\1\uffff"+
        "\1\60\1\uffff\1\u01f9\1\60\2\uffff\1\u01fb\1\60\2\uffff\1\60\1\u01fe"+
        "\2\60\1\u0201\2\60\1\u0204\1\60\1\uffff\1\u0206\1\uffff\2\60\1\u020a"+
        "\1\u020b\2\60\1\u020e\1\u020f\2\60\1\u0212\1\60\1\uffff\1\u0214"+
        "\1\u0215\3\60\1\u0219\1\uffff\2\60\1\uffff\1\u021c\2\uffff\2\60"+
        "\1\u021f\2\uffff\1\u0220\1\60\2\uffff\1\60\1\u0223\2\60\1\u0226"+
        "\4\60\1\u022b\3\60\1\uffff\1\u022f\1\u0230\2\uffff\1\u0231\1\u0232"+
        "\1\60\1\uffff\1\u0234\1\uffff\1\60\1\u0236\1\uffff\1\60\1\u0238"+
        "\1\uffff\2\60\1\uffff\1\u023b\1\uffff\2\60\1\u023e\2\uffff\2\60"+
        "\2\uffff\1\60\1\u0242\1\uffff\1\u0243\2\uffff\2\60\1\u0246\1\uffff"+
        "\1\u0247\1\60\1\uffff\1\u0249\1\u024a\2\uffff\1\u024b\1\60\1\uffff"+
        "\1\u024d\1\60\1\uffff\1\u024f\1\60\1\u0251\1\60\1\uffff\1\60\1\u0254"+
        "\1\60\4\uffff\1\u0256\1\uffff\1\60\1\uffff\1\60\1\uffff\1\u025a"+
        "\1\60\1\uffff\1\u025c\1\60\1\uffff\1\u025e\1\u025f\1\60\2\uffff"+
        "\2\60\2\uffff\1\60\3\uffff\1\u0264\1\uffff\1\u0265\1\uffff\1\60"+
        "\1\uffff\2\60\1\uffff\1\60\1\uffff\3\60\1\uffff\1\60\1\uffff\1\60"+
        "\2\uffff\1\u026f\1\u0270\1\u0271\1\u0272\2\uffff\1\60\1\u0274\1"+
        "\60\1\u01a0\3\60\1\u0279\1\u027a\4\uffff\1\u027b\1\uffff\4\60\3"+
        "\uffff\1\u0280\1\60\1\u0282\1\u0283\1\uffff\1\u0285\2\uffff\1\60"+
        "\1\uffff\3\60\1\u028a\1\uffff";
    static final String DFA20_eofS =
        "\u028b\uffff";
    static final String DFA20_minS =
        "\1\11\1\75\1\uffff\1\74\1\75\1\uffff\1\174\1\uffff\1\55\2\uffff"+
        "\1\52\2\uffff\1\60\7\uffff\1\102\1\105\4\101\1\114\1\101\1\106\1"+
        "\117\2\105\2\101\1\106\1\114\1\125\3\101\1\116\1\101\1\110\1\47"+
        "\1\uffff\1\56\21\uffff\1\101\1\114\1\60\1\117\1\104\3\124\1\106"+
        "\1\60\1\122\1\123\1\114\2\105\1\106\1\124\1\117\1\123\1\104\3\103"+
        "\1\123\1\122\1\111\3\117\1\126\1\60\1\115\2\60\1\116\1\111\1\131"+
        "\1\106\1\113\1\124\1\114\2\124\1\60\1\124\2\60\2\101\1\105\1\111"+
        "\1\114\1\106\1\126\1\114\1\101\1\60\1\115\1\102\1\105\1\104\2\111"+
        "\1\103\2\105\2\uffff\1\60\1\114\1\60\1\105\1\uffff\1\60\1\122\1"+
        "\60\1\101\1\117\1\105\1\111\1\127\1\117\1\uffff\1\122\1\103\1\115"+
        "\1\106\1\114\1\123\1\101\1\103\2\101\1\105\1\103\1\101\1\120\1\124"+
        "\1\60\1\123\1\105\1\114\1\110\1\101\1\105\1\60\1\114\1\115\1\125"+
        "\1\102\1\111\1\uffff\1\125\1\105\2\uffff\3\105\1\124\1\105\1\117"+
        "\1\116\1\60\1\124\1\105\1\111\1\103\1\114\1\60\1\125\1\uffff\1\123"+
        "\1\105\2\uffff\1\105\1\116\1\107\1\115\1\122\1\123\1\60\1\114\1"+
        "\105\1\114\1\124\1\101\1\116\3\105\1\60\1\105\1\116\1\107\1\uffff"+
        "\1\120\1\114\1\116\1\101\1\117\1\116\2\125\1\127\1\124\1\116\1\uffff"+
        "\1\131\1\uffff\1\122\1\uffff\1\124\1\uffff\1\103\1\111\1\122\1\116"+
        "\1\105\1\122\1\105\1\101\2\60\1\111\1\114\1\124\1\115\1\101\1\123"+
        "\1\124\1\113\1\122\1\125\1\103\1\124\1\60\1\102\1\60\1\111\1\uffff"+
        "\1\124\1\120\1\125\1\101\1\60\1\120\1\60\1\uffff\1\111\2\60\1\120"+
        "\1\60\1\116\1\114\1\104\1\60\1\122\1\105\1\122\1\130\1\111\2\122"+
        "\1\60\1\uffff\2\60\1\124\1\110\1\60\1\uffff\1\125\1\122\1\105\2"+
        "\122\1\60\1\115\1\101\1\131\1\105\1\uffff\1\102\1\130\1\101\1\122"+
        "\1\115\1\104\1\122\1\101\1\120\1\uffff\1\103\1\123\1\107\1\60\1"+
        "\105\1\60\1\124\1\125\1\116\1\107\1\105\1\125\1\60\1\125\1\60\1"+
        "\105\1\132\2\60\1\110\1\116\2\60\2\105\1\116\1\104\2\uffff\1\124"+
        "\1\111\1\122\1\116\1\124\1\60\1\105\1\60\1\122\1\114\1\110\1\105"+
        "\1\uffff\1\101\1\uffff\1\116\1\123\1\124\1\123\1\111\1\uffff\1\105"+
        "\1\uffff\1\107\2\uffff\1\60\1\uffff\1\107\1\114\1\111\1\uffff\1"+
        "\123\1\101\1\124\1\60\1\101\1\60\1\105\3\uffff\2\60\1\uffff\1\114"+
        "\1\101\1\124\2\60\1\uffff\1\101\1\122\2\60\1\101\1\120\1\103\1\111"+
        "\3\105\1\123\1\117\1\124\1\101\1\105\1\uffff\1\122\1\60\1\uffff"+
        "\2\105\2\60\1\123\1\115\1\uffff\1\101\1\uffff\1\60\1\105\2\uffff"+
        "\1\60\1\103\2\uffff\1\116\1\60\1\124\1\105\1\60\1\103\1\101\1\60"+
        "\1\105\1\uffff\1\60\1\uffff\1\101\1\124\2\60\1\123\1\103\2\60\1"+
        "\111\1\116\1\60\1\116\1\uffff\2\60\1\101\1\105\1\104\1\60\1\uffff"+
        "\1\104\1\114\1\uffff\1\60\2\uffff\2\114\1\60\2\uffff\1\60\1\131"+
        "\2\uffff\1\103\1\60\1\105\1\103\1\60\1\130\1\116\1\105\1\111\1\60"+
        "\1\103\1\122\1\101\1\uffff\2\60\2\uffff\2\60\1\114\1\uffff\1\60"+
        "\1\uffff\1\122\1\60\1\uffff\1\137\1\60\1\uffff\1\124\1\111\1\uffff"+
        "\1\60\1\uffff\1\104\1\102\1\60\2\uffff\1\105\1\124\2\uffff\1\126"+
        "\1\60\1\uffff\1\60\2\uffff\1\124\1\103\1\60\1\uffff\1\60\1\114\1"+
        "\uffff\2\60\2\uffff\1\60\1\113\1\uffff\1\60\1\124\1\uffff\1\60\1"+
        "\103\1\60\1\116\1\uffff\1\124\1\60\1\122\4\uffff\1\60\1\uffff\1"+
        "\105\1\uffff\1\104\1\uffff\1\60\1\116\1\uffff\1\60\1\114\1\uffff"+
        "\2\60\1\105\2\uffff\1\105\1\124\2\uffff\1\131\3\uffff\1\60\1\uffff"+
        "\1\60\1\uffff\1\105\1\uffff\1\124\1\111\1\uffff\1\131\1\uffff\1"+
        "\115\1\101\1\111\1\uffff\1\124\1\uffff\1\105\2\uffff\4\60\2\uffff"+
        "\1\123\1\60\1\117\1\60\1\105\1\124\1\115\2\60\4\uffff\1\60\1\uffff"+
        "\2\116\2\105\3\uffff\1\60\1\124\2\60\1\uffff\1\60\2\uffff\1\124"+
        "\1\uffff\1\101\1\115\1\120\1\60\1\uffff";
    static final String DFA20_maxS =
        "\1\176\1\75\1\uffff\2\76\1\uffff\1\174\1\uffff\1\55\2\uffff\1\52"+
        "\2\uffff\1\71\7\uffff\1\165\1\171\1\165\1\162\1\170\2\162\1\141"+
        "\1\163\1\157\1\145\1\151\1\141\2\165\1\162\1\165\1\157\1\145\1\162"+
        "\1\163\1\151\1\150\1\47\1\uffff\1\145\21\uffff\1\144\1\164\1\172"+
        "\1\157\1\144\4\164\1\172\1\162\1\163\1\156\1\157\1\145\2\164\1\157"+
        "\1\163\1\144\1\160\2\143\1\163\1\162\1\151\3\157\1\166\1\172\1\155"+
        "\2\172\1\156\1\151\1\171\1\146\1\155\1\164\1\154\2\164\1\172\1\164"+
        "\2\172\1\141\1\151\1\145\1\151\1\167\1\163\1\166\1\164\1\151\1\172"+
        "\1\155\1\142\1\145\1\144\2\151\1\154\1\162\1\145\2\uffff\1\172\1"+
        "\154\1\172\1\145\1\uffff\1\172\1\162\1\172\1\141\1\157\1\145\1\151"+
        "\1\167\1\157\1\uffff\1\162\1\164\1\155\1\163\1\165\1\163\1\141\1"+
        "\143\1\145\1\141\1\145\1\143\1\141\1\160\1\164\1\172\1\163\2\154"+
        "\1\150\1\141\1\145\1\172\1\154\1\155\1\165\1\142\1\151\1\uffff\1"+
        "\165\1\145\2\uffff\1\157\1\164\1\145\1\164\1\145\1\157\1\156\1\172"+
        "\1\164\1\145\1\151\1\143\1\154\1\172\1\165\1\uffff\1\163\1\145\2"+
        "\uffff\1\145\1\156\1\147\1\155\1\162\1\163\1\172\1\154\1\145\1\154"+
        "\1\164\1\141\1\156\3\145\1\172\1\145\1\156\1\147\1\uffff\1\160\1"+
        "\154\1\156\1\141\1\161\1\156\2\165\1\167\1\164\1\162\1\uffff\1\171"+
        "\1\uffff\1\162\1\uffff\1\164\1\uffff\1\143\1\151\1\162\1\156\1\145"+
        "\1\162\1\145\1\141\2\172\1\151\1\154\1\164\1\155\1\141\1\163\1\164"+
        "\1\153\1\162\1\165\1\143\1\164\1\172\1\142\1\172\1\151\1\uffff\1"+
        "\164\1\160\1\165\1\141\1\172\1\160\1\172\1\uffff\1\151\2\172\1\160"+
        "\1\172\1\156\1\154\1\144\1\172\1\162\1\145\1\162\1\170\1\151\2\162"+
        "\1\172\1\uffff\2\172\1\164\1\150\1\172\1\uffff\1\165\1\162\1\145"+
        "\2\162\1\172\1\155\1\141\1\171\1\145\1\uffff\1\142\1\170\1\141\1"+
        "\162\1\155\1\144\1\162\1\141\1\160\1\uffff\1\143\1\163\1\147\1\172"+
        "\1\145\1\172\1\164\1\165\1\156\1\147\1\145\1\165\1\172\1\165\1\172"+
        "\1\145\3\172\1\150\1\156\2\172\2\145\1\156\1\144\2\uffff\1\164\1"+
        "\151\1\162\1\156\1\164\1\172\1\145\1\172\1\162\1\154\1\150\1\145"+
        "\1\uffff\1\141\1\uffff\1\156\1\163\1\164\1\163\1\151\1\uffff\1\145"+
        "\1\uffff\1\147\2\uffff\1\172\1\uffff\1\147\1\154\1\151\1\uffff\1"+
        "\163\1\141\1\164\1\172\1\141\1\172\1\145\3\uffff\2\172\1\uffff\1"+
        "\154\1\141\1\164\2\172\1\uffff\1\141\1\162\2\172\1\141\1\160\1\143"+
        "\1\151\3\145\1\163\1\157\1\164\1\141\1\145\1\uffff\1\162\1\172\1"+
        "\uffff\2\145\2\172\1\163\1\155\1\uffff\1\141\1\uffff\1\172\1\145"+
        "\2\uffff\1\172\1\143\2\uffff\1\156\1\172\1\164\1\145\1\172\1\143"+
        "\1\141\1\172\1\145\1\uffff\1\172\1\uffff\1\145\1\164\2\172\1\163"+
        "\1\143\2\172\1\151\1\156\1\172\1\156\1\uffff\2\172\1\141\1\145\1"+
        "\144\1\172\1\uffff\1\144\1\154\1\uffff\1\172\2\uffff\2\154\1\172"+
        "\2\uffff\1\172\1\171\2\uffff\1\143\1\172\1\145\1\143\1\172\1\170"+
        "\1\156\1\145\1\151\1\172\1\143\1\162\1\141\1\uffff\2\172\2\uffff"+
        "\2\172\1\154\1\uffff\1\172\1\uffff\1\162\1\172\1\uffff\1\137\1\172"+
        "\1\uffff\1\164\1\151\1\uffff\1\172\1\uffff\1\144\1\142\1\172\2\uffff"+
        "\1\145\1\164\2\uffff\1\166\1\172\1\uffff\1\172\2\uffff\1\164\1\143"+
        "\1\172\1\uffff\1\172\1\154\1\uffff\2\172\2\uffff\1\172\1\153\1\uffff"+
        "\1\172\1\164\1\uffff\1\172\1\143\1\172\1\156\1\uffff\1\164\1\172"+
        "\1\162\4\uffff\1\172\1\uffff\1\145\1\uffff\1\164\1\uffff\1\172\1"+
        "\156\1\uffff\1\172\1\154\1\uffff\2\172\1\145\2\uffff\1\145\1\164"+
        "\2\uffff\1\171\3\uffff\1\172\1\uffff\1\172\1\uffff\1\145\1\uffff"+
        "\1\164\1\151\1\uffff\1\171\1\uffff\1\155\1\141\1\151\1\uffff\1\164"+
        "\1\uffff\1\145\2\uffff\4\172\2\uffff\1\163\1\172\1\157\1\172\1\145"+
        "\1\164\1\155\2\172\4\uffff\1\172\1\uffff\2\156\2\145\3\uffff\1\172"+
        "\1\164\2\172\1\uffff\1\172\2\uffff\1\164\1\uffff\1\141\1\155\1\160"+
        "\1\172\1\uffff";
    static final String DFA20_acceptS =
        "\2\uffff\1\3\2\uffff\1\13\1\uffff\1\16\1\uffff\1\20\1\21\1\uffff"+
        "\1\23\1\24\1\uffff\1\26\1\27\1\30\1\31\1\32\1\33\1\34\30\uffff\1"+
        "\u0092\1\uffff\1\u0091\1\u0096\1\2\1\1\1\4\1\6\1\11\1\5\1\10\1\12"+
        "\1\7\1\15\1\14\1\17\1\22\1\u0094\1\25\102\uffff\1\u0095\1\u0093"+
        "\4\uffff\1\44\11\uffff\1\53\34\uffff\1\136\2\uffff\1\122\1\125\17"+
        "\uffff\1\152\2\uffff\1\154\1\155\24\uffff\1\u0084\13\uffff\1\43"+
        "\1\uffff\1\40\1\uffff\1\45\1\uffff\1\36\32\uffff\1\105\7\uffff\1"+
        "\114\21\uffff\1\141\5\uffff\1\147\12\uffff\1\175\11\uffff\1\u0080"+
        "\33\uffff\1\55\1\56\14\uffff\1\77\1\uffff\1\102\5\uffff\1\103\1"+
        "\uffff\1\104\1\uffff\1\113\1\116\1\uffff\1\117\3\uffff\1\135\7\uffff"+
        "\1\140\1\142\1\143\2\uffff\1\151\5\uffff\1\160\20\uffff\1\u0082"+
        "\2\uffff\1\u0083\6\uffff\1\u008d\1\uffff\1\u008f\2\uffff\1\41\1"+
        "\35\2\uffff\1\37\1\51\11\uffff\1\66\1\uffff\1\57\14\uffff\1\120"+
        "\6\uffff\1\126\2\uffff\1\131\1\uffff\1\144\1\145\3\uffff\1\157\1"+
        "\156\2\uffff\1\163\1\164\15\uffff\1\u0081\2\uffff\1\u0087\1\u008a"+
        "\3\uffff\1\u0090\1\uffff\1\46\2\uffff\1\50\2\uffff\1\62\2\uffff"+
        "\1\61\1\uffff\1\65\3\uffff\1\100\1\76\2\uffff\1\111\1\107\2\uffff"+
        "\1\106\1\uffff\1\121\1\137\3\uffff\1\132\2\uffff\1\123\2\uffff\1"+
        "\153\1\161\2\uffff\1\166\2\uffff\1\171\4\uffff\1\177\3\uffff\1\u0089"+
        "\1\u0088\1\u008c\1\u008b\1\uffff\1\42\1\uffff\1\52\1\uffff\1\54"+
        "\2\uffff\1\60\2\uffff\1\73\3\uffff\1\112\1\115\2\uffff\1\133\1\127"+
        "\1\uffff\1\150\1\146\1\162\1\uffff\1\172\1\uffff\1\167\1\uffff\1"+
        "\170\2\uffff\1\u0086\1\uffff\1\u008e\3\uffff\1\63\1\uffff\1\75\1"+
        "\uffff\1\72\1\101\4\uffff\1\174\1\173\11\uffff\1\110\1\124\1\134"+
        "\1\130\1\uffff\1\176\4\uffff\1\64\1\74\1\165\4\uffff\1\u0085\1\uffff"+
        "\1\70\1\67\1\uffff\1\47\4\uffff\1\71";
    static final String DFA20_specialS =
        "\u028b\uffff}>";
    static final String[] DFA20_transitionS = {
            "\2\61\1\uffff\2\61\22\uffff\1\61\1\2\2\uffff\1\25\1\14\1\5\1"+
            "\56\1\20\1\21\1\12\1\7\1\17\1\10\1\16\1\13\12\57\1\23\1\15\1"+
            "\3\1\1\1\4\1\22\1\24\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
            "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
            "\1\52\1\53\1\54\1\55\2\60\4\uffff\1\60\1\uffff\1\26\1\27\1\30"+
            "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
            "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\2\60\1\uffff\1"+
            "\6\1\uffff\1\11",
            "\1\62",
            "",
            "\1\66\1\65\1\64",
            "\1\70\1\71",
            "",
            "\1\73",
            "",
            "\1\61",
            "",
            "",
            "\1\61",
            "",
            "",
            "\12\77",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\104\1\uffff\1\105\1\uffff\1\110\5\uffff\1\102\1\uffff\1"+
            "\101\4\uffff\1\103\1\106\1\107\14\uffff\1\104\1\uffff\1\105"+
            "\1\uffff\1\110\5\uffff\1\102\1\uffff\1\101\4\uffff\1\103\1\106"+
            "\1\107",
            "\1\111\23\uffff\1\112\13\uffff\1\111\23\uffff\1\112",
            "\1\114\6\uffff\1\117\6\uffff\1\115\2\uffff\1\116\2\uffff\1"+
            "\113\13\uffff\1\114\6\uffff\1\117\6\uffff\1\115\2\uffff\1\116"+
            "\2\uffff\1\113",
            "\1\121\3\uffff\1\120\3\uffff\1\123\10\uffff\1\122\16\uffff"+
            "\1\121\3\uffff\1\120\3\uffff\1\123\10\uffff\1\122",
            "\1\126\12\uffff\1\130\1\uffff\1\124\4\uffff\1\127\4\uffff\1"+
            "\125\10\uffff\1\126\12\uffff\1\130\1\uffff\1\124\4\uffff\1\127"+
            "\4\uffff\1\125",
            "\1\132\15\uffff\1\131\2\uffff\1\133\16\uffff\1\132\15\uffff"+
            "\1\131\2\uffff\1\133",
            "\1\135\5\uffff\1\134\31\uffff\1\135\5\uffff\1\134",
            "\1\136\37\uffff\1\136",
            "\1\141\1\143\5\uffff\1\140\1\142\4\uffff\1\137\22\uffff\1\141"+
            "\1\143\5\uffff\1\140\1\142\4\uffff\1\137",
            "\1\144\37\uffff\1\144",
            "\1\145\37\uffff\1\145",
            "\1\146\3\uffff\1\147\33\uffff\1\146\3\uffff\1\147",
            "\1\150\37\uffff\1\150",
            "\1\153\15\uffff\1\152\5\uffff\1\151\13\uffff\1\153\15\uffff"+
            "\1\152\5\uffff\1\151",
            "\1\154\7\uffff\1\156\3\uffff\1\157\2\uffff\1\155\20\uffff\1"+
            "\154\7\uffff\1\156\3\uffff\1\157\2\uffff\1\155",
            "\1\160\5\uffff\1\161\31\uffff\1\160\5\uffff\1\161",
            "\1\162\37\uffff\1\162",
            "\1\163\3\uffff\1\165\11\uffff\1\164\21\uffff\1\163\3\uffff"+
            "\1\165\11\uffff\1\164",
            "\1\166\3\uffff\1\167\33\uffff\1\166\3\uffff\1\167",
            "\1\173\3\uffff\1\172\2\uffff\1\174\6\uffff\1\171\2\uffff\1"+
            "\170\16\uffff\1\173\3\uffff\1\172\2\uffff\1\174\6\uffff\1\171"+
            "\2\uffff\1\170",
            "\1\176\1\uffff\1\175\2\uffff\1\177\32\uffff\1\176\1\uffff\1"+
            "\175\2\uffff\1\177",
            "\1\u0080\7\uffff\1\u0081\27\uffff\1\u0080\7\uffff\1\u0081",
            "\1\u0082\37\uffff\1\u0082",
            "\1\u0083",
            "",
            "\1\77\1\uffff\12\57\13\uffff\1\77\37\uffff\1\77",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0086\2\uffff\1\u0085\34\uffff\1\u0086\2\uffff\1\u0085",
            "\1\u0087\7\uffff\1\u0088\27\uffff\1\u0087\7\uffff\1\u0088",
            "\12\60\7\uffff\2\60\1\u008a\27\60\4\uffff\1\60\1\uffff\2\60"+
            "\1\u008a\27\60",
            "\1\u008b\37\uffff\1\u008b",
            "\1\u008c\37\uffff\1\u008c",
            "\1\u008d\37\uffff\1\u008d",
            "\1\u008e\37\uffff\1\u008e",
            "\1\u008f\37\uffff\1\u008f",
            "\1\u0092\1\u0090\14\uffff\1\u0091\21\uffff\1\u0092\1\u0090"+
            "\14\uffff\1\u0091",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0094\37\uffff\1\u0094",
            "\1\u0095\37\uffff\1\u0095",
            "\1\u0098\1\u0096\1\u0097\35\uffff\1\u0098\1\u0096\1\u0097",
            "\1\u009a\11\uffff\1\u0099\25\uffff\1\u009a\11\uffff\1\u0099",
            "\1\u009b\37\uffff\1\u009b",
            "\1\u009c\5\uffff\1\u009e\6\uffff\1\u009f\1\u009d\21\uffff\1"+
            "\u009c\5\uffff\1\u009e\6\uffff\1\u009f\1\u009d",
            "\1\u00a0\37\uffff\1\u00a0",
            "\1\u00a1\37\uffff\1\u00a1",
            "\1\u00a2\37\uffff\1\u00a2",
            "\1\u00a3\37\uffff\1\u00a3",
            "\1\u00a5\5\uffff\1\u00a4\6\uffff\1\u00a6\22\uffff\1\u00a5\5"+
            "\uffff\1\u00a4\6\uffff\1\u00a6",
            "\1\u00a7\37\uffff\1\u00a7",
            "\1\u00a8\37\uffff\1\u00a8",
            "\1\u00a9\37\uffff\1\u00a9",
            "\1\u00aa\37\uffff\1\u00aa",
            "\1\u00ab\37\uffff\1\u00ab",
            "\1\u00ac\37\uffff\1\u00ac",
            "\1\u00ad\37\uffff\1\u00ad",
            "\1\u00ae\37\uffff\1\u00ae",
            "\1\u00af\37\uffff\1\u00af",
            "\12\60\7\uffff\15\60\1\u00b1\14\60\4\uffff\1\60\1\uffff\15"+
            "\60\1\u00b1\14\60",
            "\1\u00b2\37\uffff\1\u00b2",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\3\60\1\u00b7\4\60\1\u00b8\4\60\1\u00b9\4\60"+
            "\1\u00b6\1\u00b5\6\60\4\uffff\1\60\1\uffff\3\60\1\u00b7\4\60"+
            "\1\u00b8\4\60\1\u00b9\4\60\1\u00b6\1\u00b5\6\60",
            "\1\u00ba\37\uffff\1\u00ba",
            "\1\u00bb\37\uffff\1\u00bb",
            "\1\u00bc\37\uffff\1\u00bc",
            "\1\u00bd\37\uffff\1\u00bd",
            "\1\u00be\1\uffff\1\u00bf\35\uffff\1\u00be\1\uffff\1\u00bf",
            "\1\u00c0\37\uffff\1\u00c0",
            "\1\u00c1\37\uffff\1\u00c1",
            "\1\u00c2\37\uffff\1\u00c2",
            "\1\u00c3\37\uffff\1\u00c3",
            "\12\60\7\uffff\5\60\1\u00c5\24\60\4\uffff\1\60\1\uffff\5\60"+
            "\1\u00c5\24\60",
            "\1\u00c6\37\uffff\1\u00c6",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\3\60\1\u00c9\26\60\4\uffff\1\60\1\uffff\3\60"+
            "\1\u00c9\26\60",
            "\1\u00ca\37\uffff\1\u00ca",
            "\1\u00cb\7\uffff\1\u00cc\27\uffff\1\u00cb\7\uffff\1\u00cc",
            "\1\u00cd\37\uffff\1\u00cd",
            "\1\u00ce\37\uffff\1\u00ce",
            "\1\u00d0\12\uffff\1\u00cf\24\uffff\1\u00d0\12\uffff\1\u00cf",
            "\1\u00d6\1\u00d1\1\uffff\1\u00d5\2\uffff\1\u00d7\1\uffff\1"+
            "\u00d4\1\uffff\1\u00d2\2\uffff\1\u00d3\22\uffff\1\u00d6\1\u00d1"+
            "\1\uffff\1\u00d5\2\uffff\1\u00d7\1\uffff\1\u00d4\1\uffff\1\u00d2"+
            "\2\uffff\1\u00d3",
            "\1\u00d8\37\uffff\1\u00d8",
            "\1\u00da\7\uffff\1\u00d9\27\uffff\1\u00da\7\uffff\1\u00d9",
            "\1\u00db\7\uffff\1\u00dc\27\uffff\1\u00db\7\uffff\1\u00dc",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00de\37\uffff\1\u00de",
            "\1\u00df\37\uffff\1\u00df",
            "\1\u00e0\37\uffff\1\u00e0",
            "\1\u00e1\37\uffff\1\u00e1",
            "\1\u00e2\37\uffff\1\u00e2",
            "\1\u00e3\37\uffff\1\u00e3",
            "\1\u00e5\10\uffff\1\u00e4\26\uffff\1\u00e5\10\uffff\1\u00e4",
            "\1\u00e6\14\uffff\1\u00e7\22\uffff\1\u00e6\14\uffff\1\u00e7",
            "\1\u00e8\37\uffff\1\u00e8",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00ea\37\uffff\1\u00ea",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00ec\37\uffff\1\u00ec",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00ee\37\uffff\1\u00ee",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00f0\37\uffff\1\u00f0",
            "\1\u00f1\37\uffff\1\u00f1",
            "\1\u00f2\37\uffff\1\u00f2",
            "\1\u00f3\37\uffff\1\u00f3",
            "\1\u00f4\37\uffff\1\u00f4",
            "\1\u00f5\37\uffff\1\u00f5",
            "",
            "\1\u00f6\37\uffff\1\u00f6",
            "\1\u00f7\1\uffff\1\u00f8\16\uffff\1\u00f9\16\uffff\1\u00f7"+
            "\1\uffff\1\u00f8\16\uffff\1\u00f9",
            "\1\u00fa\37\uffff\1\u00fa",
            "\1\u00fb\14\uffff\1\u00fc\22\uffff\1\u00fb\14\uffff\1\u00fc",
            "\1\u00fe\10\uffff\1\u00fd\26\uffff\1\u00fe\10\uffff\1\u00fd",
            "\1\u00ff\37\uffff\1\u00ff",
            "\1\u0100\37\uffff\1\u0100",
            "\1\u0101\37\uffff\1\u0101",
            "\1\u0103\3\uffff\1\u0102\33\uffff\1\u0103\3\uffff\1\u0102",
            "\1\u0104\37\uffff\1\u0104",
            "\1\u0105\37\uffff\1\u0105",
            "\1\u0106\37\uffff\1\u0106",
            "\1\u0107\37\uffff\1\u0107",
            "\1\u0108\37\uffff\1\u0108",
            "\1\u0109\37\uffff\1\u0109",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u010b\37\uffff\1\u010b",
            "\1\u010c\6\uffff\1\u010d\30\uffff\1\u010c\6\uffff\1\u010d",
            "\1\u010e\37\uffff\1\u010e",
            "\1\u010f\37\uffff\1\u010f",
            "\1\u0110\37\uffff\1\u0110",
            "\1\u0111\37\uffff\1\u0111",
            "\12\60\7\uffff\4\60\1\u0113\25\60\4\uffff\1\60\1\uffff\4\60"+
            "\1\u0113\25\60",
            "\1\u0114\37\uffff\1\u0114",
            "\1\u0115\37\uffff\1\u0115",
            "\1\u0116\37\uffff\1\u0116",
            "\1\u0117\37\uffff\1\u0117",
            "\1\u0118\37\uffff\1\u0118",
            "",
            "\1\u0119\37\uffff\1\u0119",
            "\1\u011a\37\uffff\1\u011a",
            "",
            "",
            "\1\u011c\11\uffff\1\u011b\25\uffff\1\u011c\11\uffff\1\u011b",
            "\1\u011e\16\uffff\1\u011d\20\uffff\1\u011e\16\uffff\1\u011d",
            "\1\u011f\37\uffff\1\u011f",
            "\1\u0120\37\uffff\1\u0120",
            "\1\u0121\37\uffff\1\u0121",
            "\1\u0122\37\uffff\1\u0122",
            "\1\u0123\37\uffff\1\u0123",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0125\37\uffff\1\u0125",
            "\1\u0126\37\uffff\1\u0126",
            "\1\u0127\37\uffff\1\u0127",
            "\1\u0128\37\uffff\1\u0128",
            "\1\u0129\37\uffff\1\u0129",
            "\12\60\7\uffff\15\60\1\u012b\14\60\4\uffff\1\60\1\uffff\15"+
            "\60\1\u012b\14\60",
            "\1\u012c\37\uffff\1\u012c",
            "",
            "\1\u012d\37\uffff\1\u012d",
            "\1\u012e\37\uffff\1\u012e",
            "",
            "",
            "\1\u012f\37\uffff\1\u012f",
            "\1\u0130\37\uffff\1\u0130",
            "\1\u0131\37\uffff\1\u0131",
            "\1\u0132\37\uffff\1\u0132",
            "\1\u0133\37\uffff\1\u0133",
            "\1\u0134\37\uffff\1\u0134",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0136\37\uffff\1\u0136",
            "\1\u0137\37\uffff\1\u0137",
            "\1\u0138\37\uffff\1\u0138",
            "\1\u0139\37\uffff\1\u0139",
            "\1\u013a\37\uffff\1\u013a",
            "\1\u013b\37\uffff\1\u013b",
            "\1\u013c\37\uffff\1\u013c",
            "\1\u013d\37\uffff\1\u013d",
            "\1\u013e\37\uffff\1\u013e",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0140\37\uffff\1\u0140",
            "\1\u0141\37\uffff\1\u0141",
            "\1\u0142\37\uffff\1\u0142",
            "",
            "\1\u0143\37\uffff\1\u0143",
            "\1\u0144\37\uffff\1\u0144",
            "\1\u0145\37\uffff\1\u0145",
            "\1\u0146\37\uffff\1\u0146",
            "\1\u0148\1\uffff\1\u0147\35\uffff\1\u0148\1\uffff\1\u0147",
            "\1\u0149\37\uffff\1\u0149",
            "\1\u014a\37\uffff\1\u014a",
            "\1\u014b\37\uffff\1\u014b",
            "\1\u014c\37\uffff\1\u014c",
            "\1\u014d\37\uffff\1\u014d",
            "\1\u014e\3\uffff\1\u014f\33\uffff\1\u014e\3\uffff\1\u014f",
            "",
            "\1\u0150\37\uffff\1\u0150",
            "",
            "\1\u0151\37\uffff\1\u0151",
            "",
            "\1\u0152\37\uffff\1\u0152",
            "",
            "\1\u0153\37\uffff\1\u0153",
            "\1\u0154\37\uffff\1\u0154",
            "\1\u0155\37\uffff\1\u0155",
            "\1\u0156\37\uffff\1\u0156",
            "\1\u0157\37\uffff\1\u0157",
            "\1\u0158\37\uffff\1\u0158",
            "\1\u0159\37\uffff\1\u0159",
            "\1\u015a\37\uffff\1\u015a",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u015d\37\uffff\1\u015d",
            "\1\u015e\37\uffff\1\u015e",
            "\1\u015f\37\uffff\1\u015f",
            "\1\u0160\37\uffff\1\u0160",
            "\1\u0161\37\uffff\1\u0161",
            "\1\u0162\37\uffff\1\u0162",
            "\1\u0163\37\uffff\1\u0163",
            "\1\u0164\37\uffff\1\u0164",
            "\1\u0165\37\uffff\1\u0165",
            "\1\u0166\37\uffff\1\u0166",
            "\1\u0167\37\uffff\1\u0167",
            "\1\u0168\37\uffff\1\u0168",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u016a\37\uffff\1\u016a",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u016c\37\uffff\1\u016c",
            "",
            "\1\u016d\37\uffff\1\u016d",
            "\1\u016e\37\uffff\1\u016e",
            "\1\u016f\37\uffff\1\u016f",
            "\1\u0170\37\uffff\1\u0170",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0172\37\uffff\1\u0172",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0174\37\uffff\1\u0174",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0177\37\uffff\1\u0177",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0179\37\uffff\1\u0179",
            "\1\u017a\37\uffff\1\u017a",
            "\1\u017b\37\uffff\1\u017b",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u017d\37\uffff\1\u017d",
            "\1\u017e\37\uffff\1\u017e",
            "\1\u017f\37\uffff\1\u017f",
            "\1\u0180\37\uffff\1\u0180",
            "\1\u0181\37\uffff\1\u0181",
            "\1\u0182\37\uffff\1\u0182",
            "\1\u0183\37\uffff\1\u0183",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0187\37\uffff\1\u0187",
            "\1\u0188\37\uffff\1\u0188",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u018a\37\uffff\1\u018a",
            "\1\u018b\37\uffff\1\u018b",
            "\1\u018c\37\uffff\1\u018c",
            "\1\u018d\37\uffff\1\u018d",
            "\1\u018e\37\uffff\1\u018e",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0190\37\uffff\1\u0190",
            "\1\u0191\37\uffff\1\u0191",
            "\1\u0192\37\uffff\1\u0192",
            "\1\u0193\37\uffff\1\u0193",
            "",
            "\1\u0194\37\uffff\1\u0194",
            "\1\u0195\37\uffff\1\u0195",
            "\1\u0196\37\uffff\1\u0196",
            "\1\u0197\37\uffff\1\u0197",
            "\1\u0198\37\uffff\1\u0198",
            "\1\u0199\37\uffff\1\u0199",
            "\1\u019a\37\uffff\1\u019a",
            "\1\u019b\37\uffff\1\u019b",
            "\1\u019c\37\uffff\1\u019c",
            "",
            "\1\u019d\37\uffff\1\u019d",
            "\1\u019e\37\uffff\1\u019e",
            "\1\u019f\37\uffff\1\u019f",
            "\12\60\7\uffff\16\60\1\u01a1\13\60\4\uffff\1\60\1\uffff\16"+
            "\60\1\u01a1\13\60",
            "\1\u01a2\37\uffff\1\u01a2",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01a4\37\uffff\1\u01a4",
            "\1\u01a5\37\uffff\1\u01a5",
            "\1\u01a6\37\uffff\1\u01a6",
            "\1\u01a7\37\uffff\1\u01a7",
            "\1\u01a8\37\uffff\1\u01a8",
            "\1\u01a9\37\uffff\1\u01a9",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01ab\37\uffff\1\u01ab",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01ad\37\uffff\1\u01ad",
            "\1\u01ae\37\uffff\1\u01ae",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01b1\37\uffff\1\u01b1",
            "\1\u01b2\37\uffff\1\u01b2",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01b5\37\uffff\1\u01b5",
            "\1\u01b6\37\uffff\1\u01b6",
            "\1\u01b7\37\uffff\1\u01b7",
            "\1\u01b8\37\uffff\1\u01b8",
            "",
            "",
            "\1\u01b9\37\uffff\1\u01b9",
            "\1\u01ba\37\uffff\1\u01ba",
            "\1\u01bb\37\uffff\1\u01bb",
            "\1\u01bc\37\uffff\1\u01bc",
            "\1\u01bd\37\uffff\1\u01bd",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01bf\37\uffff\1\u01bf",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01c1\37\uffff\1\u01c1",
            "\1\u01c2\37\uffff\1\u01c2",
            "\1\u01c3\37\uffff\1\u01c3",
            "\1\u01c4\37\uffff\1\u01c4",
            "",
            "\1\u01c5\37\uffff\1\u01c5",
            "",
            "\1\u01c6\37\uffff\1\u01c6",
            "\1\u01c7\37\uffff\1\u01c7",
            "\1\u01c8\37\uffff\1\u01c8",
            "\1\u01c9\37\uffff\1\u01c9",
            "\1\u01ca\37\uffff\1\u01ca",
            "",
            "\1\u01cb\37\uffff\1\u01cb",
            "",
            "\1\u01cc\37\uffff\1\u01cc",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u01ce\37\uffff\1\u01ce",
            "\1\u01cf\37\uffff\1\u01cf",
            "\1\u01d0\37\uffff\1\u01d0",
            "",
            "\1\u01d1\37\uffff\1\u01d1",
            "\1\u01d2\37\uffff\1\u01d2",
            "\1\u01d3\37\uffff\1\u01d3",
            "\12\60\7\uffff\4\60\1\u01d5\25\60\4\uffff\1\60\1\uffff\4\60"+
            "\1\u01d5\25\60",
            "\1\u01d6\37\uffff\1\u01d6",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01d8\37\uffff\1\u01d8",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u01db\37\uffff\1\u01db",
            "\1\u01dc\37\uffff\1\u01dc",
            "\1\u01dd\37\uffff\1\u01dd",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u01e0\37\uffff\1\u01e0",
            "\1\u01e1\37\uffff\1\u01e1",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01e4\37\uffff\1\u01e4",
            "\1\u01e5\37\uffff\1\u01e5",
            "\1\u01e6\37\uffff\1\u01e6",
            "\1\u01e7\37\uffff\1\u01e7",
            "\1\u01e8\37\uffff\1\u01e8",
            "\1\u01e9\37\uffff\1\u01e9",
            "\1\u01ea\37\uffff\1\u01ea",
            "\1\u01eb\37\uffff\1\u01eb",
            "\1\u01ec\37\uffff\1\u01ec",
            "\1\u01ed\37\uffff\1\u01ed",
            "\1\u01ee\37\uffff\1\u01ee",
            "\1\u01ef\37\uffff\1\u01ef",
            "",
            "\1\u01f0\37\uffff\1\u01f0",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u01f2\37\uffff\1\u01f2",
            "\1\u01f3\37\uffff\1\u01f3",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01f6\37\uffff\1\u01f6",
            "\1\u01f7\37\uffff\1\u01f7",
            "",
            "\1\u01f8\37\uffff\1\u01f8",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01fa\37\uffff\1\u01fa",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01fc\37\uffff\1\u01fc",
            "",
            "",
            "\1\u01fd\37\uffff\1\u01fd",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01ff\37\uffff\1\u01ff",
            "\1\u0200\37\uffff\1\u0200",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0202\37\uffff\1\u0202",
            "\1\u0203\37\uffff\1\u0203",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0205\37\uffff\1\u0205",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0208\3\uffff\1\u0207\33\uffff\1\u0208\3\uffff\1\u0207",
            "\1\u0209\37\uffff\1\u0209",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u020c\37\uffff\1\u020c",
            "\1\u020d\37\uffff\1\u020d",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0210\37\uffff\1\u0210",
            "\1\u0211\37\uffff\1\u0211",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0213\37\uffff\1\u0213",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0216\37\uffff\1\u0216",
            "\1\u0217\37\uffff\1\u0217",
            "\1\u0218\37\uffff\1\u0218",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u021a\37\uffff\1\u021a",
            "\1\u021b\37\uffff\1\u021b",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\u021d\37\uffff\1\u021d",
            "\1\u021e\37\uffff\1\u021e",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0221\37\uffff\1\u0221",
            "",
            "",
            "\1\u0222\37\uffff\1\u0222",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0224\37\uffff\1\u0224",
            "\1\u0225\37\uffff\1\u0225",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0227\37\uffff\1\u0227",
            "\1\u0228\37\uffff\1\u0228",
            "\1\u0229\37\uffff\1\u0229",
            "\1\u022a\37\uffff\1\u022a",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u022c\37\uffff\1\u022c",
            "\1\u022d\37\uffff\1\u022d",
            "\1\u022e\37\uffff\1\u022e",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0233\37\uffff\1\u0233",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0235\37\uffff\1\u0235",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0237",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0239\37\uffff\1\u0239",
            "\1\u023a\37\uffff\1\u023a",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u023c\37\uffff\1\u023c",
            "\1\u023d\37\uffff\1\u023d",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\u023f\37\uffff\1\u023f",
            "\1\u0240\37\uffff\1\u0240",
            "",
            "",
            "\1\u0241\37\uffff\1\u0241",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\u0244\37\uffff\1\u0244",
            "\1\u0245\37\uffff\1\u0245",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0248\37\uffff\1\u0248",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u024c\37\uffff\1\u024c",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u024e\37\uffff\1\u024e",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0250\37\uffff\1\u0250",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0252\37\uffff\1\u0252",
            "",
            "\1\u0253\37\uffff\1\u0253",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0255\37\uffff\1\u0255",
            "",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0257\37\uffff\1\u0257",
            "",
            "\1\u0258\17\uffff\1\u0259\17\uffff\1\u0258\17\uffff\1\u0259",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u025b\37\uffff\1\u025b",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u025d\37\uffff\1\u025d",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0260\37\uffff\1\u0260",
            "",
            "",
            "\1\u0261\37\uffff\1\u0261",
            "\1\u0262\37\uffff\1\u0262",
            "",
            "",
            "\1\u0263\37\uffff\1\u0263",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0266\37\uffff\1\u0266",
            "",
            "\1\u0267\37\uffff\1\u0267",
            "\1\u0268\37\uffff\1\u0268",
            "",
            "\1\u0269\37\uffff\1\u0269",
            "",
            "\1\u026a\37\uffff\1\u026a",
            "\1\u026b\37\uffff\1\u026b",
            "\1\u026c\37\uffff\1\u026c",
            "",
            "\1\u026d\37\uffff\1\u026d",
            "",
            "\1\u026e\37\uffff\1\u026e",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\u0273\37\uffff\1\u0273",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0275\37\uffff\1\u0275",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0276\37\uffff\1\u0276",
            "\1\u0277\37\uffff\1\u0277",
            "\1\u0278\37\uffff\1\u0278",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u027c\37\uffff\1\u027c",
            "\1\u027d\37\uffff\1\u027d",
            "\1\u027e\37\uffff\1\u027e",
            "\1\u027f\37\uffff\1\u027f",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0281\37\uffff\1\u0281",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\22\60\1\u0284\7\60\4\uffff\1\60\1\uffff\22\60"+
            "\1\u0284\7\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\u0286\37\uffff\1\u0286",
            "",
            "\1\u0287\37\uffff\1\u0287",
            "\1\u0288\37\uffff\1\u0288",
            "\1\u0289\37\uffff\1\u0289",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 | LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ | SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE | DOUBLE_PIPE | PLUS | MINUS | TILDA | ASTERISK | SLASH | PERCENT | SEMI | DOT | COMMA | LPAREN | RPAREN | QUESTION | COLON | AT | DOLLAR | ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE | ID | STRING | INTEGER | FLOAT | BLOB | WS );";
        }
    }
 

}