// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 SqlLexer.g 2009-05-21 10:32:57

  package org.tmatesoft.sqljet.core.internal.lang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SqlLexer extends Lexer {
    public static final int CAST=75;
    public static final int ROW=154;
    public static final int TRIGGER=163;
    public static final int CURRENT_TIME=84;
    public static final int CASE=74;
    public static final int EQUALS=4;
    public static final int NOT=132;
    public static final int EXCEPT=100;
    public static final int CASCADE=73;
    public static final int FOREIGN=106;
    public static final int EOF=-1;
    public static final int RELEASE=149;
    public static final int SIGNED_NUMBER=180;
    public static final int EXPLAIN=103;
    public static final int RPAREN=27;
    public static final int CREATE=82;
    public static final int GREATER=10;
    public static final int INSERT=119;
    public static final int ESCAPE=99;
    public static final int USING=167;
    public static final int BEGIN=70;
    public static final int SAVEPOINT=155;
    public static final int LESS=8;
    public static final int REGEXP=147;
    public static final int ANALYZE=63;
    public static final int CONFLICT=80;
    public static final int RAISE=145;
    public static final int EACH=96;
    public static final int COMMENT=182;
    public static final int ABORT=58;
    public static final int SELECT=156;
    public static final int LESS_OR_EQ=9;
    public static final int ATTACH=67;
    public static final int VIRTUAL=171;
    public static final int INTO=122;
    public static final int D=35;
    public static final int E=36;
    public static final int UNIQUE=165;
    public static final int F=37;
    public static final int G=38;
    public static final int BLOB=181;
    public static final int GLOB=108;
    public static final int A=32;
    public static final int VIEW=170;
    public static final int B=33;
    public static final int C=34;
    public static final int ASC=66;
    public static final int LINE_COMMENT=183;
    public static final int L=43;
    public static final int M=44;
    public static final int N=45;
    public static final int TRANSACTION=162;
    public static final int KEY=126;
    public static final int O=46;
    public static final int H=39;
    public static final int NULL=134;
    public static final int I=40;
    public static final int ELSE=97;
    public static final int J=41;
    public static final int K=42;
    public static final int U=52;
    public static final int ON=137;
    public static final int T=51;
    public static final int W=54;
    public static final int MATCH=130;
    public static final int V=53;
    public static final int PRIMARY=143;
    public static final int Q=48;
    public static final int P=47;
    public static final int DELETE=91;
    public static final int S=50;
    public static final int R=49;
    public static final int ROLLBACK=153;
    public static final int OF=135;
    public static final int FAIL=104;
    public static final int RESTRICT=152;
    public static final int Y=56;
    public static final int X=55;
    public static final int Z=57;
    public static final int SHIFT_LEFT=12;
    public static final int INTERSECT=121;
    public static final int GROUP=109;
    public static final int WS=184;
    public static final int SHIFT_RIGHT=13;
    public static final int PLAN=141;
    public static final int OR=138;
    public static final int QUERY=144;
    public static final int CHECK=76;
    public static final int FROM=107;
    public static final int END=98;
    public static final int TEMPORARY=159;
    public static final int DISTINCT=94;
    public static final int CONSTRAINT=81;
    public static final int CURRENT_DATE=85;
    public static final int RENAME=150;
    public static final int DOLLAR=31;
    public static final int WHERE=173;
    public static final int ALTER=62;
    public static final int INNER=118;
    public static final int ORDER=139;
    public static final int LIMIT=129;
    public static final int PRAGMA=142;
    public static final int ISNULL=124;
    public static final int UPDATE=166;
    public static final int TABLE=158;
    public static final int FOR=105;
    public static final int DEFERRED=90;
    public static final int FLOAT=179;
    public static final int EXCLUSIVE=101;
    public static final int ID=175;
    public static final int NOTNULL=133;
    public static final int AND=64;
    public static final int NOT_EQUALS=6;
    public static final int CROSS=83;
    public static final int LPAREN=26;
    public static final int ASTERISK=20;
    public static final int IF=111;
    public static final int GREATER_OR_EQ=11;
    public static final int AT=30;
    public static final int DOUBLE_PIPE=16;
    public static final int INDEX=115;
    public static final int AS=65;
    public static final int TILDA=19;
    public static final int SLASH=21;
    public static final int THEN=160;
    public static final int IN=114;
    public static final int REFERENCES=146;
    public static final int COMMA=25;
    public static final int OFFSET=136;
    public static final int IS=123;
    public static final int REPLACE=151;
    public static final int LEFT=127;
    public static final int ALL=61;
    public static final int COLUMN=78;
    public static final int PIPE=15;
    public static final int PLUS=17;
    public static final int EXISTS=102;
    public static final int DOT=24;
    public static final int CURRENT_TIMESTAMP=86;
    public static final int LIKE=128;
    public static final int INITIALLY=117;
    public static final int ADD=59;
    public static final int COLLATE=77;
    public static final int INTEGER=177;
    public static final int REINDEX=148;
    public static final int OUTER=140;
    public static final int BY=72;
    public static final int DEFERRABLE=89;
    public static final int EQUALS2=5;
    public static final int PERCENT=22;
    public static final int AUTOINCREMENT=68;
    public static final int TO=161;
    public static final int NOT_EQUALS2=7;
    public static final int DEFAULT=88;
    public static final int VALUES=169;
    public static final int AMPERSAND=14;
    public static final int SET=157;
    public static final int BEFORE=69;
    public static final int HAVING=110;
    public static final int IGNORE=112;
    public static final int MINUS=18;
    public static final int AFTER=60;
    public static final int INSTEAD=120;
    public static final int SEMI=23;
    public static final int JOIN=125;
    public static final int UNION=164;
    public static final int INDEXED=116;
    public static final int COLON=29;
    public static final int FLOAT_EXP=178;
    public static final int COMMIT=79;
    public static final int QUESTION=28;
    public static final int DATABASE=87;
    public static final int VACUUM=168;
    public static final int DROP=95;
    public static final int DETACH=93;
    public static final int WHEN=172;
    public static final int IMMEDIATE=113;
    public static final int NATURAL=131;
    public static final int DESC=92;
    public static final int ID_START=174;
    public static final int BETWEEN=71;
    public static final int STRING=176;

    // delegates
    // delegators

    public SqlLexer() {;} 
    public SqlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SqlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "SqlLexer.g"; }

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SqlLexer.g:27:7: ( '=' )
            // SqlLexer.g:27:16: '='
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
            // SqlLexer.g:28:8: ( '==' )
            // SqlLexer.g:28:16: '=='
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
            // SqlLexer.g:29:11: ( '!=' )
            // SqlLexer.g:29:16: '!='
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
            // SqlLexer.g:30:12: ( '<>' )
            // SqlLexer.g:30:16: '<>'
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
            // SqlLexer.g:31:5: ( '<' )
            // SqlLexer.g:31:16: '<'
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
            // SqlLexer.g:32:11: ( '<=' )
            // SqlLexer.g:32:16: '<='
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
            // SqlLexer.g:33:8: ( '>' )
            // SqlLexer.g:33:16: '>'
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
            // SqlLexer.g:34:14: ( '>=' )
            // SqlLexer.g:34:16: '>='
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
            // SqlLexer.g:35:11: ( '<<' )
            // SqlLexer.g:35:16: '<<'
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
            // SqlLexer.g:36:12: ( '>>' )
            // SqlLexer.g:36:16: '>>'
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
            // SqlLexer.g:37:10: ( '&' )
            // SqlLexer.g:37:16: '&'
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
            // SqlLexer.g:38:5: ( '|' )
            // SqlLexer.g:38:16: '|'
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
            // SqlLexer.g:39:12: ( '||' )
            // SqlLexer.g:39:16: '||'
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
            // SqlLexer.g:40:5: ( '+' )
            // SqlLexer.g:40:16: '+'
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
            // SqlLexer.g:41:6: ( '-' )
            // SqlLexer.g:41:16: '-'
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
            // SqlLexer.g:42:6: ( '~' )
            // SqlLexer.g:42:16: '~'
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
            // SqlLexer.g:43:9: ( '*' )
            // SqlLexer.g:43:16: '*'
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
            // SqlLexer.g:44:6: ( '/' )
            // SqlLexer.g:44:16: '/'
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
            // SqlLexer.g:45:8: ( '%' )
            // SqlLexer.g:45:16: '%'
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
            // SqlLexer.g:46:5: ( ';' )
            // SqlLexer.g:46:16: ';'
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
            // SqlLexer.g:47:4: ( '.' )
            // SqlLexer.g:47:16: '.'
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
            // SqlLexer.g:48:6: ( ',' )
            // SqlLexer.g:48:16: ','
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
            // SqlLexer.g:49:7: ( '(' )
            // SqlLexer.g:49:16: '('
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
            // SqlLexer.g:50:7: ( ')' )
            // SqlLexer.g:50:16: ')'
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
            // SqlLexer.g:51:9: ( '?' )
            // SqlLexer.g:51:16: '?'
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
            // SqlLexer.g:52:6: ( ':' )
            // SqlLexer.g:52:16: ':'
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
            // SqlLexer.g:53:3: ( '@' )
            // SqlLexer.g:53:16: '@'
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
            // SqlLexer.g:54:7: ( '$' )
            // SqlLexer.g:54:16: '$'
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
            // SqlLexer.g:57:11: ( ( 'a' | 'A' ) )
            // SqlLexer.g:57:12: ( 'a' | 'A' )
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
            // SqlLexer.g:58:11: ( ( 'b' | 'B' ) )
            // SqlLexer.g:58:12: ( 'b' | 'B' )
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
            // SqlLexer.g:59:11: ( ( 'c' | 'C' ) )
            // SqlLexer.g:59:12: ( 'c' | 'C' )
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
            // SqlLexer.g:60:11: ( ( 'd' | 'D' ) )
            // SqlLexer.g:60:12: ( 'd' | 'D' )
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
            // SqlLexer.g:61:11: ( ( 'e' | 'E' ) )
            // SqlLexer.g:61:12: ( 'e' | 'E' )
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
            // SqlLexer.g:62:11: ( ( 'f' | 'F' ) )
            // SqlLexer.g:62:12: ( 'f' | 'F' )
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
            // SqlLexer.g:63:11: ( ( 'g' | 'G' ) )
            // SqlLexer.g:63:12: ( 'g' | 'G' )
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
            // SqlLexer.g:64:11: ( ( 'h' | 'H' ) )
            // SqlLexer.g:64:12: ( 'h' | 'H' )
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
            // SqlLexer.g:65:11: ( ( 'i' | 'I' ) )
            // SqlLexer.g:65:12: ( 'i' | 'I' )
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
            // SqlLexer.g:66:11: ( ( 'j' | 'J' ) )
            // SqlLexer.g:66:12: ( 'j' | 'J' )
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
            // SqlLexer.g:67:11: ( ( 'k' | 'K' ) )
            // SqlLexer.g:67:12: ( 'k' | 'K' )
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
            // SqlLexer.g:68:11: ( ( 'l' | 'L' ) )
            // SqlLexer.g:68:12: ( 'l' | 'L' )
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
            // SqlLexer.g:69:11: ( ( 'm' | 'M' ) )
            // SqlLexer.g:69:12: ( 'm' | 'M' )
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
            // SqlLexer.g:70:11: ( ( 'n' | 'N' ) )
            // SqlLexer.g:70:12: ( 'n' | 'N' )
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
            // SqlLexer.g:71:11: ( ( 'o' | 'O' ) )
            // SqlLexer.g:71:12: ( 'o' | 'O' )
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
            // SqlLexer.g:72:11: ( ( 'p' | 'P' ) )
            // SqlLexer.g:72:12: ( 'p' | 'P' )
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
            // SqlLexer.g:73:11: ( ( 'q' | 'Q' ) )
            // SqlLexer.g:73:12: ( 'q' | 'Q' )
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
            // SqlLexer.g:74:11: ( ( 'r' | 'R' ) )
            // SqlLexer.g:74:12: ( 'r' | 'R' )
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
            // SqlLexer.g:75:11: ( ( 's' | 'S' ) )
            // SqlLexer.g:75:12: ( 's' | 'S' )
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
            // SqlLexer.g:76:11: ( ( 't' | 'T' ) )
            // SqlLexer.g:76:12: ( 't' | 'T' )
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
            // SqlLexer.g:77:11: ( ( 'u' | 'U' ) )
            // SqlLexer.g:77:12: ( 'u' | 'U' )
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
            // SqlLexer.g:78:11: ( ( 'v' | 'V' ) )
            // SqlLexer.g:78:12: ( 'v' | 'V' )
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
            // SqlLexer.g:79:11: ( ( 'w' | 'W' ) )
            // SqlLexer.g:79:12: ( 'w' | 'W' )
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
            // SqlLexer.g:80:11: ( ( 'x' | 'X' ) )
            // SqlLexer.g:80:12: ( 'x' | 'X' )
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
            // SqlLexer.g:81:11: ( ( 'y' | 'Y' ) )
            // SqlLexer.g:81:12: ( 'y' | 'Y' )
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
            // SqlLexer.g:82:11: ( ( 'z' | 'Z' ) )
            // SqlLexer.g:82:12: ( 'z' | 'Z' )
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
            // SqlLexer.g:84:6: ( A B O R T )
            // SqlLexer.g:84:8: A B O R T
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
            // SqlLexer.g:85:4: ( A D D )
            // SqlLexer.g:85:6: A D D
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
            // SqlLexer.g:86:6: ( A F T E R )
            // SqlLexer.g:86:8: A F T E R
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
            // SqlLexer.g:87:4: ( A L L )
            // SqlLexer.g:87:6: A L L
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
            // SqlLexer.g:88:6: ( A L T E R )
            // SqlLexer.g:88:8: A L T E R
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
            // SqlLexer.g:89:8: ( A N A L Y Z E )
            // SqlLexer.g:89:10: A N A L Y Z E
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
            // SqlLexer.g:90:4: ( A N D )
            // SqlLexer.g:90:6: A N D
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
            // SqlLexer.g:91:3: ( A S )
            // SqlLexer.g:91:5: A S
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
            // SqlLexer.g:92:4: ( A S C )
            // SqlLexer.g:92:6: A S C
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
            // SqlLexer.g:93:7: ( A T T A C H )
            // SqlLexer.g:93:9: A T T A C H
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
            // SqlLexer.g:94:14: ( A U T O I N C R E M E N T )
            // SqlLexer.g:94:16: A U T O I N C R E M E N T
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
            // SqlLexer.g:95:7: ( B E F O R E )
            // SqlLexer.g:95:9: B E F O R E
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
            // SqlLexer.g:96:6: ( B E G I N )
            // SqlLexer.g:96:8: B E G I N
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
            // SqlLexer.g:97:8: ( B E T W E E N )
            // SqlLexer.g:97:10: B E T W E E N
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
            // SqlLexer.g:98:3: ( B Y )
            // SqlLexer.g:98:5: B Y
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
            // SqlLexer.g:99:8: ( C A S C A D E )
            // SqlLexer.g:99:10: C A S C A D E
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
            // SqlLexer.g:100:5: ( C A S E )
            // SqlLexer.g:100:7: C A S E
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
            // SqlLexer.g:101:5: ( C A S T )
            // SqlLexer.g:101:7: C A S T
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
            // SqlLexer.g:102:6: ( C H E C K )
            // SqlLexer.g:102:8: C H E C K
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
            // SqlLexer.g:103:8: ( C O L L A T E )
            // SqlLexer.g:103:10: C O L L A T E
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
            // SqlLexer.g:104:7: ( C O L U M N )
            // SqlLexer.g:104:9: C O L U M N
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
            // SqlLexer.g:105:7: ( C O M M I T )
            // SqlLexer.g:105:9: C O M M I T
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
            // SqlLexer.g:106:9: ( C O N F L I C T )
            // SqlLexer.g:106:11: C O N F L I C T
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
            // SqlLexer.g:107:11: ( C O N S T R A I N T )
            // SqlLexer.g:107:13: C O N S T R A I N T
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
            // SqlLexer.g:108:7: ( C R E A T E )
            // SqlLexer.g:108:9: C R E A T E
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
            // SqlLexer.g:109:6: ( C R O S S )
            // SqlLexer.g:109:8: C R O S S
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
            // SqlLexer.g:110:13: ( C U R R E N T '_' T I M E )
            // SqlLexer.g:110:15: C U R R E N T '_' T I M E
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
            // SqlLexer.g:111:13: ( C U R R E N T '_' D A T E )
            // SqlLexer.g:111:15: C U R R E N T '_' D A T E
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
            // SqlLexer.g:112:18: ( C U R R E N T '_' T I M E S T A M P )
            // SqlLexer.g:112:20: C U R R E N T '_' T I M E S T A M P
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
            // SqlLexer.g:113:9: ( D A T A B A S E )
            // SqlLexer.g:113:11: D A T A B A S E
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
            // SqlLexer.g:114:8: ( D E F A U L T )
            // SqlLexer.g:114:10: D E F A U L T
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
            // SqlLexer.g:115:11: ( D E F E R R A B L E )
            // SqlLexer.g:115:13: D E F E R R A B L E
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
            // SqlLexer.g:116:9: ( D E F E R R E D )
            // SqlLexer.g:116:11: D E F E R R E D
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
            // SqlLexer.g:117:7: ( D E L E T E )
            // SqlLexer.g:117:9: D E L E T E
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
            // SqlLexer.g:118:5: ( D E S C )
            // SqlLexer.g:118:7: D E S C
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
            // SqlLexer.g:119:7: ( D E T A C H )
            // SqlLexer.g:119:9: D E T A C H
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
            // SqlLexer.g:120:9: ( D I S T I N C T )
            // SqlLexer.g:120:11: D I S T I N C T
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
            // SqlLexer.g:121:5: ( D R O P )
            // SqlLexer.g:121:7: D R O P
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
            // SqlLexer.g:122:5: ( E A C H )
            // SqlLexer.g:122:7: E A C H
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
            // SqlLexer.g:123:5: ( E L S E )
            // SqlLexer.g:123:7: E L S E
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
            // SqlLexer.g:124:4: ( E N D )
            // SqlLexer.g:124:6: E N D
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
            // SqlLexer.g:125:7: ( E S C A P E )
            // SqlLexer.g:125:9: E S C A P E
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
            // SqlLexer.g:126:7: ( E X C E P T )
            // SqlLexer.g:126:9: E X C E P T
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
            // SqlLexer.g:127:10: ( E X C L U S I V E )
            // SqlLexer.g:127:12: E X C L U S I V E
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
            // SqlLexer.g:128:7: ( E X I S T S )
            // SqlLexer.g:128:9: E X I S T S
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
            // SqlLexer.g:129:8: ( E X P L A I N )
            // SqlLexer.g:129:10: E X P L A I N
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
            // SqlLexer.g:130:5: ( F A I L )
            // SqlLexer.g:130:7: F A I L
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
            // SqlLexer.g:131:4: ( F O R )
            // SqlLexer.g:131:6: F O R
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
            // SqlLexer.g:132:8: ( F O R E I G N )
            // SqlLexer.g:132:10: F O R E I G N
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
            // SqlLexer.g:133:5: ( F R O M )
            // SqlLexer.g:133:7: F R O M
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
            // SqlLexer.g:134:5: ( G L O B )
            // SqlLexer.g:134:7: G L O B
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
            // SqlLexer.g:135:6: ( G R O U P )
            // SqlLexer.g:135:8: G R O U P
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
            // SqlLexer.g:136:7: ( H A V I N G )
            // SqlLexer.g:136:9: H A V I N G
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
            // SqlLexer.g:137:3: ( I F )
            // SqlLexer.g:137:5: I F
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
            // SqlLexer.g:138:7: ( I G N O R E )
            // SqlLexer.g:138:9: I G N O R E
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
            // SqlLexer.g:139:10: ( I M M E D I A T E )
            // SqlLexer.g:139:12: I M M E D I A T E
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
            // SqlLexer.g:140:3: ( I N )
            // SqlLexer.g:140:5: I N
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
            // SqlLexer.g:141:6: ( I N D E X )
            // SqlLexer.g:141:8: I N D E X
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
            // SqlLexer.g:142:8: ( I N D E X E D )
            // SqlLexer.g:142:10: I N D E X E D
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
            // SqlLexer.g:143:10: ( I N I T I A L L Y )
            // SqlLexer.g:143:12: I N I T I A L L Y
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
            // SqlLexer.g:144:6: ( I N N E R )
            // SqlLexer.g:144:8: I N N E R
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
            // SqlLexer.g:145:7: ( I N S E R T )
            // SqlLexer.g:145:9: I N S E R T
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
            // SqlLexer.g:146:8: ( I N S T E A D )
            // SqlLexer.g:146:10: I N S T E A D
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
            // SqlLexer.g:147:10: ( I N T E R S E C T )
            // SqlLexer.g:147:12: I N T E R S E C T
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
            // SqlLexer.g:148:5: ( I N T O )
            // SqlLexer.g:148:7: I N T O
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
            // SqlLexer.g:149:3: ( I S )
            // SqlLexer.g:149:5: I S
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
            // SqlLexer.g:150:7: ( I S N U L L )
            // SqlLexer.g:150:9: I S N U L L
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
            // SqlLexer.g:151:5: ( J O I N )
            // SqlLexer.g:151:7: J O I N
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
            // SqlLexer.g:152:4: ( K E Y )
            // SqlLexer.g:152:6: K E Y
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
            // SqlLexer.g:153:5: ( L E F T )
            // SqlLexer.g:153:7: L E F T
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
            // SqlLexer.g:154:5: ( L I K E )
            // SqlLexer.g:154:7: L I K E
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
            // SqlLexer.g:155:6: ( L I M I T )
            // SqlLexer.g:155:8: L I M I T
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
            // SqlLexer.g:156:6: ( M A T C H )
            // SqlLexer.g:156:8: M A T C H
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
            // SqlLexer.g:157:8: ( N A T U R A L )
            // SqlLexer.g:157:10: N A T U R A L
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
            // SqlLexer.g:158:4: ( N O T )
            // SqlLexer.g:158:6: N O T
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
            // SqlLexer.g:159:8: ( N O T N U L L )
            // SqlLexer.g:159:10: N O T N U L L
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
            // SqlLexer.g:160:5: ( N U L L )
            // SqlLexer.g:160:7: N U L L
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
            // SqlLexer.g:161:3: ( O F )
            // SqlLexer.g:161:5: O F
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
            // SqlLexer.g:162:7: ( O F F S E T )
            // SqlLexer.g:162:9: O F F S E T
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
            // SqlLexer.g:163:3: ( O N )
            // SqlLexer.g:163:5: O N
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
            // SqlLexer.g:164:3: ( O R )
            // SqlLexer.g:164:5: O R
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
            // SqlLexer.g:165:6: ( O R D E R )
            // SqlLexer.g:165:8: O R D E R
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
            // SqlLexer.g:166:6: ( O U T E R )
            // SqlLexer.g:166:8: O U T E R
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
            // SqlLexer.g:167:5: ( P L A N )
            // SqlLexer.g:167:7: P L A N
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
            // SqlLexer.g:168:7: ( P R A G M A )
            // SqlLexer.g:168:9: P R A G M A
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
            // SqlLexer.g:169:8: ( P R I M A R Y )
            // SqlLexer.g:169:10: P R I M A R Y
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
            // SqlLexer.g:170:6: ( Q U E R Y )
            // SqlLexer.g:170:8: Q U E R Y
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
            // SqlLexer.g:171:6: ( R A I S E )
            // SqlLexer.g:171:8: R A I S E
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
            // SqlLexer.g:172:11: ( R E F E R E N C E S )
            // SqlLexer.g:172:13: R E F E R E N C E S
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
            // SqlLexer.g:173:7: ( R E G E X P )
            // SqlLexer.g:173:9: R E G E X P
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
            // SqlLexer.g:174:8: ( R E I N D E X )
            // SqlLexer.g:174:10: R E I N D E X
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
            // SqlLexer.g:175:8: ( R E L E A S E )
            // SqlLexer.g:175:10: R E L E A S E
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
            // SqlLexer.g:176:7: ( R E N A M E )
            // SqlLexer.g:176:9: R E N A M E
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
            // SqlLexer.g:177:8: ( R E P L A C E )
            // SqlLexer.g:177:10: R E P L A C E
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
            // SqlLexer.g:178:9: ( R E S T R I C T )
            // SqlLexer.g:178:11: R E S T R I C T
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
            // SqlLexer.g:179:9: ( R O L L B A C K )
            // SqlLexer.g:179:11: R O L L B A C K
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
            // SqlLexer.g:180:4: ( R O W )
            // SqlLexer.g:180:6: R O W
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
            // SqlLexer.g:181:10: ( S A V E P O I N T )
            // SqlLexer.g:181:12: S A V E P O I N T
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
            // SqlLexer.g:182:7: ( S E L E C T )
            // SqlLexer.g:182:9: S E L E C T
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
            // SqlLexer.g:183:4: ( S E T )
            // SqlLexer.g:183:6: S E T
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
            // SqlLexer.g:184:6: ( T A B L E )
            // SqlLexer.g:184:8: T A B L E
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
            // SqlLexer.g:185:10: ( T E M P ( O R A R Y )? )
            // SqlLexer.g:185:12: T E M P ( O R A R Y )?
            {
            mT(); 
            mE(); 
            mM(); 
            mP(); 
            // SqlLexer.g:185:20: ( O R A R Y )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='O'||LA1_0=='o') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // SqlLexer.g:185:22: O R A R Y
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
            // SqlLexer.g:186:5: ( T H E N )
            // SqlLexer.g:186:7: T H E N
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
            // SqlLexer.g:187:3: ( T O )
            // SqlLexer.g:187:5: T O
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
            // SqlLexer.g:188:12: ( T R A N S A C T I O N )
            // SqlLexer.g:188:14: T R A N S A C T I O N
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
            // SqlLexer.g:189:8: ( T R I G G E R )
            // SqlLexer.g:189:10: T R I G G E R
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
            // SqlLexer.g:190:6: ( U N I O N )
            // SqlLexer.g:190:8: U N I O N
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
            // SqlLexer.g:191:7: ( U N I Q U E )
            // SqlLexer.g:191:9: U N I Q U E
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
            // SqlLexer.g:192:7: ( U P D A T E )
            // SqlLexer.g:192:9: U P D A T E
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
            // SqlLexer.g:193:6: ( U S I N G )
            // SqlLexer.g:193:8: U S I N G
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
            // SqlLexer.g:194:7: ( V A C U U M )
            // SqlLexer.g:194:9: V A C U U M
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
            // SqlLexer.g:195:7: ( V A L U E S )
            // SqlLexer.g:195:9: V A L U E S
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
            // SqlLexer.g:196:5: ( V I E W )
            // SqlLexer.g:196:7: V I E W
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
            // SqlLexer.g:197:8: ( V I R T U A L )
            // SqlLexer.g:197:10: V I R T U A L
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
            // SqlLexer.g:198:5: ( W H E N )
            // SqlLexer.g:198:7: W H E N
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
            // SqlLexer.g:199:6: ( W H E R E )
            // SqlLexer.g:199:8: W H E R E
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
            // SqlLexer.g:201:18: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // SqlLexer.g:201:20: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
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
            // SqlLexer.g:202:3: ( ID_START ( ID_START | '0' .. '9' )* )
            // SqlLexer.g:202:5: ID_START ( ID_START | '0' .. '9' )*
            {
            mID_START(); 
            // SqlLexer.g:202:14: ( ID_START | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // SqlLexer.g:
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
            // SqlLexer.g:204:7: ( '\\'' (~ ( '\\'' ) )* '\\'' )
            // SqlLexer.g:204:9: '\\'' (~ ( '\\'' ) )* '\\''
            {
            match('\''); 
            // SqlLexer.g:204:14: (~ ( '\\'' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // SqlLexer.g:204:16: ~ ( '\\'' )
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
            // SqlLexer.g:205:8: ( ( '0' .. '9' )+ )
            // SqlLexer.g:205:10: ( '0' .. '9' )+
            {
            // SqlLexer.g:205:10: ( '0' .. '9' )+
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
            	    // SqlLexer.g:205:11: '0' .. '9'
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
            // SqlLexer.g:206:20: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // SqlLexer.g:206:22: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // SqlLexer.g:206:32: ( '+' | '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='+'||LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // SqlLexer.g:
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

            // SqlLexer.g:206:43: ( '0' .. '9' )+
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
            	    // SqlLexer.g:206:44: '0' .. '9'
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
            // SqlLexer.g:208:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( FLOAT_EXP )? | '.' ( '0' .. '9' )+ ( FLOAT_EXP )? | ( '0' .. '9' )+ FLOAT_EXP )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // SqlLexer.g:208:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( FLOAT_EXP )?
                    {
                    // SqlLexer.g:208:9: ( '0' .. '9' )+
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
                    	    // SqlLexer.g:208:10: '0' .. '9'
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
                    // SqlLexer.g:208:25: ( '0' .. '9' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // SqlLexer.g:208:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    // SqlLexer.g:208:37: ( FLOAT_EXP )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // SqlLexer.g:208:37: FLOAT_EXP
                            {
                            mFLOAT_EXP(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlLexer.g:209:9: '.' ( '0' .. '9' )+ ( FLOAT_EXP )?
                    {
                    match('.'); 
                    // SqlLexer.g:209:13: ( '0' .. '9' )+
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
                    	    // SqlLexer.g:209:14: '0' .. '9'
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

                    // SqlLexer.g:209:25: ( FLOAT_EXP )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='E'||LA11_0=='e') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // SqlLexer.g:209:25: FLOAT_EXP
                            {
                            mFLOAT_EXP(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // SqlLexer.g:210:9: ( '0' .. '9' )+ FLOAT_EXP
                    {
                    // SqlLexer.g:210:9: ( '0' .. '9' )+
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
                    	    // SqlLexer.g:210:10: '0' .. '9'
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

    // $ANTLR start "SIGNED_NUMBER"
    public final void mSIGNED_NUMBER() throws RecognitionException {
        try {
            int _type = SIGNED_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SqlLexer.g:212:14: ( ( '+' | '-' )? ( INTEGER | FLOAT ) )
            // SqlLexer.g:212:16: ( '+' | '-' )? ( INTEGER | FLOAT )
            {
            // SqlLexer.g:212:16: ( '+' | '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='+'||LA14_0=='-') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // SqlLexer.g:
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

            // SqlLexer.g:212:27: ( INTEGER | FLOAT )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // SqlLexer.g:212:28: INTEGER
                    {
                    mINTEGER(); 

                    }
                    break;
                case 2 :
                    // SqlLexer.g:212:38: FLOAT
                    {
                    mFLOAT(); 

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
    // $ANTLR end "SIGNED_NUMBER"

    // $ANTLR start "BLOB"
    public final void mBLOB() throws RecognitionException {
        try {
            int _type = BLOB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SqlLexer.g:213:5: ( ( 'x' | 'X' ) '\\'' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ '\\'' )
            // SqlLexer.g:213:7: ( 'x' | 'X' ) '\\'' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ '\\''
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('\''); 
            // SqlLexer.g:213:22: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='F')||(LA16_0>='a' && LA16_0<='f')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // SqlLexer.g:
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
            // SqlLexer.g:215:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // SqlLexer.g:215:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // SqlLexer.g:215:24: ( options {greedy=false; } : . )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='*') ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1=='/') ) {
                        alt17=2;
                    }
                    else if ( ((LA17_1>='\u0000' && LA17_1<='.')||(LA17_1>='0' && LA17_1<='\uFFFF')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<=')')||(LA17_0>='+' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // SqlLexer.g:215:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop17;
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
            // SqlLexer.g:216:22: ( '--' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' | EOF ) )
            // SqlLexer.g:216:24: '--' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' | EOF )
            {
            match("--"); 

            // SqlLexer.g:216:29: (~ ( '\\n' | '\\r' ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // SqlLexer.g:216:29: ~ ( '\\n' | '\\r' )
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
            	    break loop18;
                }
            } while (true);

            // SqlLexer.g:216:43: ( ( '\\r' )? '\\n' | EOF )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\n'||LA20_0=='\r') ) {
                alt20=1;
            }
            else {
                alt20=2;}
            switch (alt20) {
                case 1 :
                    // SqlLexer.g:216:44: ( '\\r' )? '\\n'
                    {
                    // SqlLexer.g:216:44: ( '\\r' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\r') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // SqlLexer.g:216:44: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;
                case 2 :
                    // SqlLexer.g:216:55: EOF
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
            // SqlLexer.g:217:3: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' | COMMENT | LINE_COMMENT ) )
            // SqlLexer.g:217:5: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' | COMMENT | LINE_COMMENT )
            {
            // SqlLexer.g:217:5: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' | COMMENT | LINE_COMMENT )
            int alt21=7;
            switch ( input.LA(1) ) {
            case ' ':
                {
                alt21=1;
                }
                break;
            case '\r':
                {
                alt21=2;
                }
                break;
            case '\t':
                {
                alt21=3;
                }
                break;
            case '\f':
                {
                alt21=4;
                }
                break;
            case '\n':
                {
                alt21=5;
                }
                break;
            case '/':
                {
                alt21=6;
                }
                break;
            case '-':
                {
                alt21=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // SqlLexer.g:217:6: ' '
                    {
                    match(' '); 

                    }
                    break;
                case 2 :
                    // SqlLexer.g:217:10: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // SqlLexer.g:217:15: '\\t'
                    {
                    match('\t'); 

                    }
                    break;
                case 4 :
                    // SqlLexer.g:217:20: '\\u000C'
                    {
                    match('\f'); 

                    }
                    break;
                case 5 :
                    // SqlLexer.g:217:29: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 6 :
                    // SqlLexer.g:217:34: COMMENT
                    {
                    mCOMMENT(); 

                    }
                    break;
                case 7 :
                    // SqlLexer.g:217:42: LINE_COMMENT
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
        // SqlLexer.g:1:8: ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 | LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ | SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE | DOUBLE_PIPE | PLUS | MINUS | TILDA | ASTERISK | SLASH | PERCENT | SEMI | DOT | COMMA | LPAREN | RPAREN | QUESTION | COLON | AT | DOLLAR | ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE | ID | STRING | INTEGER | FLOAT | SIGNED_NUMBER | BLOB | WS )
        int alt22=151;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // SqlLexer.g:1:10: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 2 :
                // SqlLexer.g:1:17: EQUALS2
                {
                mEQUALS2(); 

                }
                break;
            case 3 :
                // SqlLexer.g:1:25: NOT_EQUALS
                {
                mNOT_EQUALS(); 

                }
                break;
            case 4 :
                // SqlLexer.g:1:36: NOT_EQUALS2
                {
                mNOT_EQUALS2(); 

                }
                break;
            case 5 :
                // SqlLexer.g:1:48: LESS
                {
                mLESS(); 

                }
                break;
            case 6 :
                // SqlLexer.g:1:53: LESS_OR_EQ
                {
                mLESS_OR_EQ(); 

                }
                break;
            case 7 :
                // SqlLexer.g:1:64: GREATER
                {
                mGREATER(); 

                }
                break;
            case 8 :
                // SqlLexer.g:1:72: GREATER_OR_EQ
                {
                mGREATER_OR_EQ(); 

                }
                break;
            case 9 :
                // SqlLexer.g:1:86: SHIFT_LEFT
                {
                mSHIFT_LEFT(); 

                }
                break;
            case 10 :
                // SqlLexer.g:1:97: SHIFT_RIGHT
                {
                mSHIFT_RIGHT(); 

                }
                break;
            case 11 :
                // SqlLexer.g:1:109: AMPERSAND
                {
                mAMPERSAND(); 

                }
                break;
            case 12 :
                // SqlLexer.g:1:119: PIPE
                {
                mPIPE(); 

                }
                break;
            case 13 :
                // SqlLexer.g:1:124: DOUBLE_PIPE
                {
                mDOUBLE_PIPE(); 

                }
                break;
            case 14 :
                // SqlLexer.g:1:136: PLUS
                {
                mPLUS(); 

                }
                break;
            case 15 :
                // SqlLexer.g:1:141: MINUS
                {
                mMINUS(); 

                }
                break;
            case 16 :
                // SqlLexer.g:1:147: TILDA
                {
                mTILDA(); 

                }
                break;
            case 17 :
                // SqlLexer.g:1:153: ASTERISK
                {
                mASTERISK(); 

                }
                break;
            case 18 :
                // SqlLexer.g:1:162: SLASH
                {
                mSLASH(); 

                }
                break;
            case 19 :
                // SqlLexer.g:1:168: PERCENT
                {
                mPERCENT(); 

                }
                break;
            case 20 :
                // SqlLexer.g:1:176: SEMI
                {
                mSEMI(); 

                }
                break;
            case 21 :
                // SqlLexer.g:1:181: DOT
                {
                mDOT(); 

                }
                break;
            case 22 :
                // SqlLexer.g:1:185: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 23 :
                // SqlLexer.g:1:191: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 24 :
                // SqlLexer.g:1:198: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 25 :
                // SqlLexer.g:1:205: QUESTION
                {
                mQUESTION(); 

                }
                break;
            case 26 :
                // SqlLexer.g:1:214: COLON
                {
                mCOLON(); 

                }
                break;
            case 27 :
                // SqlLexer.g:1:220: AT
                {
                mAT(); 

                }
                break;
            case 28 :
                // SqlLexer.g:1:223: DOLLAR
                {
                mDOLLAR(); 

                }
                break;
            case 29 :
                // SqlLexer.g:1:230: ABORT
                {
                mABORT(); 

                }
                break;
            case 30 :
                // SqlLexer.g:1:236: ADD
                {
                mADD(); 

                }
                break;
            case 31 :
                // SqlLexer.g:1:240: AFTER
                {
                mAFTER(); 

                }
                break;
            case 32 :
                // SqlLexer.g:1:246: ALL
                {
                mALL(); 

                }
                break;
            case 33 :
                // SqlLexer.g:1:250: ALTER
                {
                mALTER(); 

                }
                break;
            case 34 :
                // SqlLexer.g:1:256: ANALYZE
                {
                mANALYZE(); 

                }
                break;
            case 35 :
                // SqlLexer.g:1:264: AND
                {
                mAND(); 

                }
                break;
            case 36 :
                // SqlLexer.g:1:268: AS
                {
                mAS(); 

                }
                break;
            case 37 :
                // SqlLexer.g:1:271: ASC
                {
                mASC(); 

                }
                break;
            case 38 :
                // SqlLexer.g:1:275: ATTACH
                {
                mATTACH(); 

                }
                break;
            case 39 :
                // SqlLexer.g:1:282: AUTOINCREMENT
                {
                mAUTOINCREMENT(); 

                }
                break;
            case 40 :
                // SqlLexer.g:1:296: BEFORE
                {
                mBEFORE(); 

                }
                break;
            case 41 :
                // SqlLexer.g:1:303: BEGIN
                {
                mBEGIN(); 

                }
                break;
            case 42 :
                // SqlLexer.g:1:309: BETWEEN
                {
                mBETWEEN(); 

                }
                break;
            case 43 :
                // SqlLexer.g:1:317: BY
                {
                mBY(); 

                }
                break;
            case 44 :
                // SqlLexer.g:1:320: CASCADE
                {
                mCASCADE(); 

                }
                break;
            case 45 :
                // SqlLexer.g:1:328: CASE
                {
                mCASE(); 

                }
                break;
            case 46 :
                // SqlLexer.g:1:333: CAST
                {
                mCAST(); 

                }
                break;
            case 47 :
                // SqlLexer.g:1:338: CHECK
                {
                mCHECK(); 

                }
                break;
            case 48 :
                // SqlLexer.g:1:344: COLLATE
                {
                mCOLLATE(); 

                }
                break;
            case 49 :
                // SqlLexer.g:1:352: COLUMN
                {
                mCOLUMN(); 

                }
                break;
            case 50 :
                // SqlLexer.g:1:359: COMMIT
                {
                mCOMMIT(); 

                }
                break;
            case 51 :
                // SqlLexer.g:1:366: CONFLICT
                {
                mCONFLICT(); 

                }
                break;
            case 52 :
                // SqlLexer.g:1:375: CONSTRAINT
                {
                mCONSTRAINT(); 

                }
                break;
            case 53 :
                // SqlLexer.g:1:386: CREATE
                {
                mCREATE(); 

                }
                break;
            case 54 :
                // SqlLexer.g:1:393: CROSS
                {
                mCROSS(); 

                }
                break;
            case 55 :
                // SqlLexer.g:1:399: CURRENT_TIME
                {
                mCURRENT_TIME(); 

                }
                break;
            case 56 :
                // SqlLexer.g:1:412: CURRENT_DATE
                {
                mCURRENT_DATE(); 

                }
                break;
            case 57 :
                // SqlLexer.g:1:425: CURRENT_TIMESTAMP
                {
                mCURRENT_TIMESTAMP(); 

                }
                break;
            case 58 :
                // SqlLexer.g:1:443: DATABASE
                {
                mDATABASE(); 

                }
                break;
            case 59 :
                // SqlLexer.g:1:452: DEFAULT
                {
                mDEFAULT(); 

                }
                break;
            case 60 :
                // SqlLexer.g:1:460: DEFERRABLE
                {
                mDEFERRABLE(); 

                }
                break;
            case 61 :
                // SqlLexer.g:1:471: DEFERRED
                {
                mDEFERRED(); 

                }
                break;
            case 62 :
                // SqlLexer.g:1:480: DELETE
                {
                mDELETE(); 

                }
                break;
            case 63 :
                // SqlLexer.g:1:487: DESC
                {
                mDESC(); 

                }
                break;
            case 64 :
                // SqlLexer.g:1:492: DETACH
                {
                mDETACH(); 

                }
                break;
            case 65 :
                // SqlLexer.g:1:499: DISTINCT
                {
                mDISTINCT(); 

                }
                break;
            case 66 :
                // SqlLexer.g:1:508: DROP
                {
                mDROP(); 

                }
                break;
            case 67 :
                // SqlLexer.g:1:513: EACH
                {
                mEACH(); 

                }
                break;
            case 68 :
                // SqlLexer.g:1:518: ELSE
                {
                mELSE(); 

                }
                break;
            case 69 :
                // SqlLexer.g:1:523: END
                {
                mEND(); 

                }
                break;
            case 70 :
                // SqlLexer.g:1:527: ESCAPE
                {
                mESCAPE(); 

                }
                break;
            case 71 :
                // SqlLexer.g:1:534: EXCEPT
                {
                mEXCEPT(); 

                }
                break;
            case 72 :
                // SqlLexer.g:1:541: EXCLUSIVE
                {
                mEXCLUSIVE(); 

                }
                break;
            case 73 :
                // SqlLexer.g:1:551: EXISTS
                {
                mEXISTS(); 

                }
                break;
            case 74 :
                // SqlLexer.g:1:558: EXPLAIN
                {
                mEXPLAIN(); 

                }
                break;
            case 75 :
                // SqlLexer.g:1:566: FAIL
                {
                mFAIL(); 

                }
                break;
            case 76 :
                // SqlLexer.g:1:571: FOR
                {
                mFOR(); 

                }
                break;
            case 77 :
                // SqlLexer.g:1:575: FOREIGN
                {
                mFOREIGN(); 

                }
                break;
            case 78 :
                // SqlLexer.g:1:583: FROM
                {
                mFROM(); 

                }
                break;
            case 79 :
                // SqlLexer.g:1:588: GLOB
                {
                mGLOB(); 

                }
                break;
            case 80 :
                // SqlLexer.g:1:593: GROUP
                {
                mGROUP(); 

                }
                break;
            case 81 :
                // SqlLexer.g:1:599: HAVING
                {
                mHAVING(); 

                }
                break;
            case 82 :
                // SqlLexer.g:1:606: IF
                {
                mIF(); 

                }
                break;
            case 83 :
                // SqlLexer.g:1:609: IGNORE
                {
                mIGNORE(); 

                }
                break;
            case 84 :
                // SqlLexer.g:1:616: IMMEDIATE
                {
                mIMMEDIATE(); 

                }
                break;
            case 85 :
                // SqlLexer.g:1:626: IN
                {
                mIN(); 

                }
                break;
            case 86 :
                // SqlLexer.g:1:629: INDEX
                {
                mINDEX(); 

                }
                break;
            case 87 :
                // SqlLexer.g:1:635: INDEXED
                {
                mINDEXED(); 

                }
                break;
            case 88 :
                // SqlLexer.g:1:643: INITIALLY
                {
                mINITIALLY(); 

                }
                break;
            case 89 :
                // SqlLexer.g:1:653: INNER
                {
                mINNER(); 

                }
                break;
            case 90 :
                // SqlLexer.g:1:659: INSERT
                {
                mINSERT(); 

                }
                break;
            case 91 :
                // SqlLexer.g:1:666: INSTEAD
                {
                mINSTEAD(); 

                }
                break;
            case 92 :
                // SqlLexer.g:1:674: INTERSECT
                {
                mINTERSECT(); 

                }
                break;
            case 93 :
                // SqlLexer.g:1:684: INTO
                {
                mINTO(); 

                }
                break;
            case 94 :
                // SqlLexer.g:1:689: IS
                {
                mIS(); 

                }
                break;
            case 95 :
                // SqlLexer.g:1:692: ISNULL
                {
                mISNULL(); 

                }
                break;
            case 96 :
                // SqlLexer.g:1:699: JOIN
                {
                mJOIN(); 

                }
                break;
            case 97 :
                // SqlLexer.g:1:704: KEY
                {
                mKEY(); 

                }
                break;
            case 98 :
                // SqlLexer.g:1:708: LEFT
                {
                mLEFT(); 

                }
                break;
            case 99 :
                // SqlLexer.g:1:713: LIKE
                {
                mLIKE(); 

                }
                break;
            case 100 :
                // SqlLexer.g:1:718: LIMIT
                {
                mLIMIT(); 

                }
                break;
            case 101 :
                // SqlLexer.g:1:724: MATCH
                {
                mMATCH(); 

                }
                break;
            case 102 :
                // SqlLexer.g:1:730: NATURAL
                {
                mNATURAL(); 

                }
                break;
            case 103 :
                // SqlLexer.g:1:738: NOT
                {
                mNOT(); 

                }
                break;
            case 104 :
                // SqlLexer.g:1:742: NOTNULL
                {
                mNOTNULL(); 

                }
                break;
            case 105 :
                // SqlLexer.g:1:750: NULL
                {
                mNULL(); 

                }
                break;
            case 106 :
                // SqlLexer.g:1:755: OF
                {
                mOF(); 

                }
                break;
            case 107 :
                // SqlLexer.g:1:758: OFFSET
                {
                mOFFSET(); 

                }
                break;
            case 108 :
                // SqlLexer.g:1:765: ON
                {
                mON(); 

                }
                break;
            case 109 :
                // SqlLexer.g:1:768: OR
                {
                mOR(); 

                }
                break;
            case 110 :
                // SqlLexer.g:1:771: ORDER
                {
                mORDER(); 

                }
                break;
            case 111 :
                // SqlLexer.g:1:777: OUTER
                {
                mOUTER(); 

                }
                break;
            case 112 :
                // SqlLexer.g:1:783: PLAN
                {
                mPLAN(); 

                }
                break;
            case 113 :
                // SqlLexer.g:1:788: PRAGMA
                {
                mPRAGMA(); 

                }
                break;
            case 114 :
                // SqlLexer.g:1:795: PRIMARY
                {
                mPRIMARY(); 

                }
                break;
            case 115 :
                // SqlLexer.g:1:803: QUERY
                {
                mQUERY(); 

                }
                break;
            case 116 :
                // SqlLexer.g:1:809: RAISE
                {
                mRAISE(); 

                }
                break;
            case 117 :
                // SqlLexer.g:1:815: REFERENCES
                {
                mREFERENCES(); 

                }
                break;
            case 118 :
                // SqlLexer.g:1:826: REGEXP
                {
                mREGEXP(); 

                }
                break;
            case 119 :
                // SqlLexer.g:1:833: REINDEX
                {
                mREINDEX(); 

                }
                break;
            case 120 :
                // SqlLexer.g:1:841: RELEASE
                {
                mRELEASE(); 

                }
                break;
            case 121 :
                // SqlLexer.g:1:849: RENAME
                {
                mRENAME(); 

                }
                break;
            case 122 :
                // SqlLexer.g:1:856: REPLACE
                {
                mREPLACE(); 

                }
                break;
            case 123 :
                // SqlLexer.g:1:864: RESTRICT
                {
                mRESTRICT(); 

                }
                break;
            case 124 :
                // SqlLexer.g:1:873: ROLLBACK
                {
                mROLLBACK(); 

                }
                break;
            case 125 :
                // SqlLexer.g:1:882: ROW
                {
                mROW(); 

                }
                break;
            case 126 :
                // SqlLexer.g:1:886: SAVEPOINT
                {
                mSAVEPOINT(); 

                }
                break;
            case 127 :
                // SqlLexer.g:1:896: SELECT
                {
                mSELECT(); 

                }
                break;
            case 128 :
                // SqlLexer.g:1:903: SET
                {
                mSET(); 

                }
                break;
            case 129 :
                // SqlLexer.g:1:907: TABLE
                {
                mTABLE(); 

                }
                break;
            case 130 :
                // SqlLexer.g:1:913: TEMPORARY
                {
                mTEMPORARY(); 

                }
                break;
            case 131 :
                // SqlLexer.g:1:923: THEN
                {
                mTHEN(); 

                }
                break;
            case 132 :
                // SqlLexer.g:1:928: TO
                {
                mTO(); 

                }
                break;
            case 133 :
                // SqlLexer.g:1:931: TRANSACTION
                {
                mTRANSACTION(); 

                }
                break;
            case 134 :
                // SqlLexer.g:1:943: TRIGGER
                {
                mTRIGGER(); 

                }
                break;
            case 135 :
                // SqlLexer.g:1:951: UNION
                {
                mUNION(); 

                }
                break;
            case 136 :
                // SqlLexer.g:1:957: UNIQUE
                {
                mUNIQUE(); 

                }
                break;
            case 137 :
                // SqlLexer.g:1:964: UPDATE
                {
                mUPDATE(); 

                }
                break;
            case 138 :
                // SqlLexer.g:1:971: USING
                {
                mUSING(); 

                }
                break;
            case 139 :
                // SqlLexer.g:1:977: VACUUM
                {
                mVACUUM(); 

                }
                break;
            case 140 :
                // SqlLexer.g:1:984: VALUES
                {
                mVALUES(); 

                }
                break;
            case 141 :
                // SqlLexer.g:1:991: VIEW
                {
                mVIEW(); 

                }
                break;
            case 142 :
                // SqlLexer.g:1:996: VIRTUAL
                {
                mVIRTUAL(); 

                }
                break;
            case 143 :
                // SqlLexer.g:1:1004: WHEN
                {
                mWHEN(); 

                }
                break;
            case 144 :
                // SqlLexer.g:1:1009: WHERE
                {
                mWHERE(); 

                }
                break;
            case 145 :
                // SqlLexer.g:1:1015: ID
                {
                mID(); 

                }
                break;
            case 146 :
                // SqlLexer.g:1:1018: STRING
                {
                mSTRING(); 

                }
                break;
            case 147 :
                // SqlLexer.g:1:1025: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 148 :
                // SqlLexer.g:1:1033: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 149 :
                // SqlLexer.g:1:1039: SIGNED_NUMBER
                {
                mSIGNED_NUMBER(); 

                }
                break;
            case 150 :
                // SqlLexer.g:1:1053: BLOB
                {
                mBLOB(); 

                }
                break;
            case 151 :
                // SqlLexer.g:1:1058: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA22 dfa22 = new DFA22(this);
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
            return "207:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( FLOAT_EXP )? | '.' ( '0' .. '9' )+ ( FLOAT_EXP )? | ( '0' .. '9' )+ FLOAT_EXP );";
        }
    }
    static final String DFA15_eotS =
        "\1\uffff\1\3\2\uffff";
    static final String DFA15_eofS =
        "\4\uffff";
    static final String DFA15_minS =
        "\2\56\2\uffff";
    static final String DFA15_maxS =
        "\1\71\1\145\2\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA15_specialS =
        "\4\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\2\1\uffff\12\1\13\uffff\1\2\37\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "212:27: ( INTEGER | FLOAT )";
        }
    }
    static final String DFA22_eotS =
        "\1\uffff\1\63\1\uffff\1\67\1\72\1\uffff\1\74\1\76\1\77\2\uffff\1"+
        "\100\2\uffff\1\102\7\uffff\30\60\1\uffff\1\u0088\21\uffff\1\u008a"+
        "\1\uffff\1\60\1\u008d\7\60\1\u0099\25\60\1\u00b7\1\u00bd\1\60\1"+
        "\u00c0\11\60\1\u00cb\1\u00cc\1\u00ce\10\60\1\u00e1\12\60\2\uffff"+
        "\1\u008a\3\uffff\1\60\1\u00f6\1\uffff\1\u00f7\1\60\1\u00f9\1\u00fa"+
        "\7\60\1\uffff\23\60\1\u011b\3\60\1\u011f\5\60\1\uffff\5\60\1\uffff"+
        "\2\60\1\uffff\1\60\1\u0130\4\60\1\u0135\3\60\2\uffff\1\60\1\uffff"+
        "\15\60\1\u0148\3\60\1\u014c\1\uffff\15\60\1\uffff\2\u008a\2\uffff"+
        "\1\u008a\1\60\2\uffff\1\60\2\uffff\7\60\1\u0167\1\u0168\13\60\1"+
        "\u0174\3\60\1\u0178\7\60\1\uffff\1\u0180\1\u0181\1\u0182\1\uffff"+
        "\1\60\1\u0184\1\60\1\u0186\3\60\1\u018a\7\60\1\u0192\1\uffff\1\u0193"+
        "\1\60\1\u0195\1\60\1\uffff\1\60\1\u0198\4\60\1\u019d\13\60\1\uffff"+
        "\3\60\1\uffff\1\u01ac\2\60\1\u01b0\5\60\1\u01b6\3\60\1\u01ba\1\60"+
        "\1\uffff\1\u008a\1\60\1\u01bd\1\u01be\1\u01bf\3\60\1\u01c3\1\60"+
        "\2\uffff\2\60\1\u01c7\1\u01c8\7\60\1\uffff\3\60\1\uffff\7\60\3\uffff"+
        "\1\60\1\uffff\1\u01db\1\uffff\3\60\1\uffff\1\u01df\3\60\1\u01e4"+
        "\2\60\2\uffff\1\u01e7\1\uffff\1\u01e8\1\60\1\uffff\1\60\1\u01eb"+
        "\1\60\1\u01ed\1\uffff\2\60\1\u01f0\7\60\1\u01f8\3\60\1\uffff\3\60"+
        "\1\uffff\1\u01ff\1\u0200\2\60\1\u0203\1\uffff\3\60\1\uffff\1\u0207"+
        "\1\60\3\uffff\1\60\1\u020a\1\60\1\uffff\1\u020c\2\60\2\uffff\1\u020f"+
        "\1\60\1\u0211\2\60\1\u0214\3\60\1\u0219\1\u021a\1\60\1\u021c\1\60"+
        "\1\u021e\1\60\1\u0220\1\60\1\uffff\1\u0222\1\u0223\1\60\1\uffff"+
        "\3\60\1\u0228\1\uffff\1\u0229\1\60\2\uffff\2\60\1\uffff\1\u022d"+
        "\1\uffff\1\60\1\u022f\1\uffff\2\60\1\u0232\1\60\1\u0234\2\60\1\uffff"+
        "\2\60\1\u0239\3\60\2\uffff\1\u023d\1\u023e\1\uffff\1\60\1\u0240"+
        "\1\u0241\1\uffff\1\u0242\1\60\1\uffff\1\u0244\1\uffff\1\u0245\1"+
        "\60\1\uffff\1\u0247\1\uffff\2\60\1\uffff\3\60\1\u024d\2\uffff\1"+
        "\60\1\uffff\1\60\1\uffff\1\u0250\1\uffff\1\u0251\2\uffff\1\60\1"+
        "\u0253\1\60\1\u0255\2\uffff\1\60\1\u0257\1\u0258\1\uffff\1\u0259"+
        "\1\uffff\1\u025a\1\u025b\1\uffff\1\60\1\uffff\1\60\1\u025e\2\60"+
        "\1\uffff\1\60\1\u0262\1\60\2\uffff\1\u0264\3\uffff\1\60\2\uffff"+
        "\1\60\1\uffff\1\u0268\1\60\1\u026a\1\u026b\1\60\1\uffff\1\u026d"+
        "\1\60\2\uffff\1\60\1\uffff\1\60\1\uffff\1\60\5\uffff\1\60\1\u0273"+
        "\1\uffff\1\u0274\2\60\1\uffff\1\60\1\uffff\3\60\1\uffff\1\60\2\uffff"+
        "\1\60\1\uffff\1\u027d\1\u027e\1\u027f\1\u0280\1\60\2\uffff\1\u0282"+
        "\1\u01ac\4\60\1\u0287\1\u0288\4\uffff\1\u0289\1\uffff\4\60\3\uffff"+
        "\1\u028e\1\60\1\u0290\1\u0291\1\uffff\1\u0293\2\uffff\1\60\1\uffff"+
        "\3\60\1\u0298\1\uffff";
    static final String DFA22_eofS =
        "\u0299\uffff";
    static final String DFA22_minS =
        "\1\11\1\75\1\uffff\1\74\1\75\1\uffff\1\174\1\56\1\55\2\uffff\1\52"+
        "\2\uffff\1\60\7\uffff\1\102\1\105\4\101\1\114\1\101\1\106\1\117"+
        "\2\105\2\101\1\106\1\114\1\125\3\101\1\116\1\101\1\110\1\47\1\uffff"+
        "\1\56\21\uffff\1\60\1\uffff\1\101\1\60\1\124\1\104\1\114\1\117\2"+
        "\124\1\106\1\60\1\123\1\122\2\105\1\114\1\124\1\117\1\106\1\123"+
        "\2\103\1\104\1\123\1\103\1\111\1\122\3\117\1\126\1\116\2\60\1\115"+
        "\1\60\1\111\1\131\1\106\1\113\2\124\1\114\2\124\3\60\2\101\1\105"+
        "\1\106\1\111\1\114\1\126\1\114\1\60\1\115\1\101\1\105\1\102\1\111"+
        "\1\104\1\111\1\105\1\103\1\105\1\uffff\1\53\1\60\1\uffff\1\53\1"+
        "\uffff\1\114\1\60\1\uffff\1\60\1\105\2\60\1\105\1\122\1\117\1\101"+
        "\1\127\1\111\1\117\1\uffff\1\103\1\122\1\103\1\123\1\101\1\114\1"+
        "\106\1\115\1\101\1\120\2\101\1\103\1\105\1\124\1\105\1\123\1\114"+
        "\1\101\1\60\1\105\1\110\1\114\1\60\1\115\1\125\1\102\1\111\1\117"+
        "\1\uffff\2\105\1\124\2\105\1\uffff\1\125\1\105\1\uffff\1\116\1\60"+
        "\1\124\1\111\1\105\1\103\1\60\1\114\1\125\1\105\2\uffff\1\123\1"+
        "\uffff\1\105\1\116\1\115\1\107\1\122\1\105\1\114\2\105\1\101\1\124"+
        "\1\116\1\123\1\60\1\114\2\105\1\60\1\uffff\1\120\1\107\2\116\1\114"+
        "\1\116\1\101\1\117\1\127\1\124\2\125\1\116\3\60\1\53\2\60\1\131"+
        "\2\uffff\1\122\2\uffff\1\122\1\124\1\111\1\103\1\105\1\116\1\122"+
        "\2\60\1\101\1\105\1\113\1\123\1\124\1\101\1\115\1\114\1\124\1\111"+
        "\1\102\1\60\1\122\1\125\1\103\1\60\1\124\1\111\1\120\1\125\1\124"+
        "\1\101\1\120\1\uffff\3\60\1\uffff\1\111\1\60\1\120\1\60\1\116\2"+
        "\122\1\60\1\130\1\111\1\105\2\122\1\114\1\104\1\60\1\uffff\1\60"+
        "\1\124\1\60\1\110\1\uffff\1\125\1\60\2\122\1\105\1\122\1\60\1\101"+
        "\1\115\1\131\2\101\1\130\1\122\1\115\1\122\1\104\1\105\1\uffff\1"+
        "\102\1\120\1\103\1\uffff\1\60\1\107\1\123\1\60\1\105\1\107\1\124"+
        "\1\125\1\116\1\60\2\125\1\105\1\60\1\105\2\60\1\132\3\60\1\116\1"+
        "\110\1\105\1\60\1\105\2\uffff\1\104\1\116\2\60\1\105\1\124\1\116"+
        "\1\111\1\122\1\124\1\101\1\uffff\1\122\1\114\1\110\1\uffff\1\105"+
        "\1\116\1\124\2\123\1\111\1\105\3\uffff\1\107\1\uffff\1\60\1\uffff"+
        "\1\107\1\105\1\123\1\uffff\1\60\2\101\1\124\1\60\1\114\1\111\2\uffff"+
        "\1\60\1\uffff\1\60\1\114\1\uffff\1\101\1\60\1\124\1\60\1\uffff\1"+
        "\122\1\101\1\60\1\123\1\103\1\120\2\105\1\111\1\105\1\60\1\101\1"+
        "\117\1\124\1\uffff\1\122\1\105\1\101\1\uffff\2\60\2\105\1\60\1\uffff"+
        "\1\101\1\115\1\123\1\uffff\1\60\1\105\3\uffff\1\103\1\60\1\116\1"+
        "\uffff\1\60\1\105\1\124\2\uffff\1\60\1\105\1\60\1\103\1\101\1\60"+
        "\1\123\1\101\1\124\2\60\1\103\1\60\1\111\1\60\1\116\1\60\1\116\1"+
        "\uffff\2\60\1\105\1\uffff\1\104\1\114\1\104\1\60\1\uffff\1\60\1"+
        "\101\2\uffff\2\114\1\uffff\1\60\1\uffff\1\131\1\60\1\uffff\2\105"+
        "\1\60\1\116\1\60\1\103\1\130\1\uffff\1\103\1\111\1\60\1\101\1\122"+
        "\1\103\2\uffff\2\60\1\uffff\1\114\2\60\1\uffff\1\60\1\122\1\uffff"+
        "\1\60\1\uffff\1\60\1\137\1\uffff\1\60\1\uffff\1\124\1\111\1\uffff"+
        "\1\105\1\104\1\102\1\60\2\uffff\1\124\1\uffff\1\126\1\uffff\1\60"+
        "\1\uffff\1\60\2\uffff\1\103\1\60\1\114\1\60\2\uffff\1\124\2\60\1"+
        "\uffff\1\60\1\uffff\2\60\1\uffff\1\103\1\uffff\1\124\1\60\1\113"+
        "\1\116\1\uffff\1\122\1\60\1\124\2\uffff\1\60\3\uffff\1\105\2\uffff"+
        "\1\104\1\uffff\1\60\1\116\2\60\1\114\1\uffff\1\60\1\105\2\uffff"+
        "\1\124\1\uffff\1\131\1\uffff\1\105\5\uffff\1\105\1\60\1\uffff\1"+
        "\60\1\124\1\131\1\uffff\1\111\1\uffff\1\115\1\101\1\111\1\uffff"+
        "\1\124\2\uffff\1\105\1\uffff\4\60\1\123\2\uffff\2\60\1\117\1\105"+
        "\1\124\1\115\2\60\4\uffff\1\60\1\uffff\2\116\2\105\3\uffff\1\60"+
        "\1\124\2\60\1\uffff\1\60\2\uffff\1\124\1\uffff\1\101\1\115\1\120"+
        "\1\60\1\uffff";
    static final String DFA22_maxS =
        "\1\176\1\75\1\uffff\2\76\1\uffff\1\174\2\71\2\uffff\1\52\2\uffff"+
        "\1\71\7\uffff\1\165\1\171\1\165\1\162\1\170\2\162\1\141\1\163\1"+
        "\157\1\145\1\151\1\141\2\165\1\162\1\165\1\157\1\145\1\162\1\163"+
        "\1\151\1\150\1\47\1\uffff\1\145\21\uffff\1\145\1\uffff\1\144\1\172"+
        "\1\164\1\144\1\164\1\157\3\164\1\172\1\163\1\162\1\145\1\157\1\156"+
        "\1\164\1\157\1\164\1\163\1\160\1\143\1\144\1\163\1\143\1\151\1\162"+
        "\3\157\1\166\1\156\2\172\1\155\1\172\1\151\1\171\1\146\1\155\2\164"+
        "\1\154\2\164\3\172\1\141\1\151\1\145\1\163\1\151\1\167\1\166\1\164"+
        "\1\172\1\155\1\151\1\145\1\142\1\151\1\144\1\151\1\162\1\154\1\145"+
        "\1\uffff\1\71\1\145\1\uffff\1\71\1\uffff\1\154\1\172\1\uffff\1\172"+
        "\1\145\2\172\1\145\1\162\1\157\1\141\1\167\1\151\1\157\1\uffff\1"+
        "\164\1\162\1\143\1\163\1\141\1\165\1\163\1\155\1\141\1\160\1\145"+
        "\1\141\1\143\1\145\1\164\1\154\1\163\1\154\1\141\1\172\1\145\1\150"+
        "\1\154\1\172\1\155\1\165\1\142\1\151\1\157\1\uffff\1\157\1\145\2"+
        "\164\1\145\1\uffff\1\165\1\145\1\uffff\1\156\1\172\1\164\1\151\1"+
        "\145\1\143\1\172\1\154\1\165\1\145\2\uffff\1\163\1\uffff\1\145\1"+
        "\156\1\155\1\147\1\162\1\145\1\154\2\145\1\141\1\164\1\156\1\163"+
        "\1\172\1\154\2\145\1\172\1\uffff\1\160\1\147\2\156\1\154\1\156\1"+
        "\141\1\161\1\167\1\164\2\165\1\162\2\71\1\145\3\71\1\171\2\uffff"+
        "\1\162\2\uffff\1\162\1\164\1\151\1\143\1\145\1\156\1\162\2\172\1"+
        "\141\1\145\1\153\1\163\1\164\1\141\1\155\1\154\1\164\1\151\1\142"+
        "\1\172\1\162\1\165\1\143\1\172\1\164\1\151\1\160\1\165\1\164\1\141"+
        "\1\160\1\uffff\3\172\1\uffff\1\151\1\172\1\160\1\172\1\156\2\162"+
        "\1\172\1\170\1\151\1\145\2\162\1\154\1\144\1\172\1\uffff\1\172\1"+
        "\164\1\172\1\150\1\uffff\1\165\1\172\2\162\1\145\1\162\1\172\1\141"+
        "\1\155\1\171\2\141\1\170\1\162\1\155\1\162\1\144\1\145\1\uffff\1"+
        "\142\1\160\1\143\1\uffff\1\172\1\147\1\163\1\172\1\145\1\147\1\164"+
        "\1\165\1\156\1\172\2\165\1\145\1\172\1\145\2\71\4\172\1\156\1\150"+
        "\1\145\1\172\1\145\2\uffff\1\144\1\156\2\172\1\145\1\164\1\156\1"+
        "\151\1\162\1\164\1\141\1\uffff\1\162\1\154\1\150\1\uffff\1\145\1"+
        "\156\1\164\2\163\1\151\1\145\3\uffff\1\147\1\uffff\1\172\1\uffff"+
        "\1\147\1\145\1\163\1\uffff\1\172\2\141\1\164\1\172\1\154\1\151\2"+
        "\uffff\1\172\1\uffff\1\172\1\154\1\uffff\1\141\1\172\1\164\1\172"+
        "\1\uffff\1\162\1\141\1\172\1\163\1\143\1\160\2\145\1\151\1\145\1"+
        "\172\1\141\1\157\1\164\1\uffff\1\162\1\145\1\141\1\uffff\2\172\2"+
        "\145\1\172\1\uffff\1\141\1\155\1\163\1\uffff\1\172\1\145\3\uffff"+
        "\1\143\1\172\1\156\1\uffff\1\172\1\145\1\164\2\uffff\1\172\1\145"+
        "\1\172\1\143\1\141\1\172\1\163\1\145\1\164\2\172\1\143\1\172\1\151"+
        "\1\172\1\156\1\172\1\156\1\uffff\2\172\1\145\1\uffff\1\144\1\154"+
        "\1\144\1\172\1\uffff\1\172\1\141\2\uffff\2\154\1\uffff\1\172\1\uffff"+
        "\1\171\1\172\1\uffff\2\145\1\172\1\156\1\172\1\143\1\170\1\uffff"+
        "\1\143\1\151\1\172\1\141\1\162\1\143\2\uffff\2\172\1\uffff\1\154"+
        "\2\172\1\uffff\1\172\1\162\1\uffff\1\172\1\uffff\1\172\1\137\1\uffff"+
        "\1\172\1\uffff\1\164\1\151\1\uffff\1\145\1\144\1\142\1\172\2\uffff"+
        "\1\164\1\uffff\1\166\1\uffff\1\172\1\uffff\1\172\2\uffff\1\143\1"+
        "\172\1\154\1\172\2\uffff\1\164\2\172\1\uffff\1\172\1\uffff\2\172"+
        "\1\uffff\1\143\1\uffff\1\164\1\172\1\153\1\156\1\uffff\1\162\1\172"+
        "\1\164\2\uffff\1\172\3\uffff\1\145\2\uffff\1\164\1\uffff\1\172\1"+
        "\156\2\172\1\154\1\uffff\1\172\1\145\2\uffff\1\164\1\uffff\1\171"+
        "\1\uffff\1\145\5\uffff\1\145\1\172\1\uffff\1\172\1\164\1\171\1\uffff"+
        "\1\151\1\uffff\1\155\1\141\1\151\1\uffff\1\164\2\uffff\1\145\1\uffff"+
        "\4\172\1\163\2\uffff\2\172\1\157\1\145\1\164\1\155\2\172\4\uffff"+
        "\1\172\1\uffff\2\156\2\145\3\uffff\1\172\1\164\2\172\1\uffff\1\172"+
        "\2\uffff\1\164\1\uffff\1\141\1\155\1\160\1\172\1\uffff";
    static final String DFA22_acceptS =
        "\2\uffff\1\3\2\uffff\1\13\3\uffff\1\20\1\21\1\uffff\1\23\1\24\1"+
        "\uffff\1\26\1\27\1\30\1\31\1\32\1\33\1\34\30\uffff\1\u0092\1\uffff"+
        "\1\u0091\1\u0097\1\2\1\1\1\4\1\6\1\11\1\5\1\10\1\12\1\7\1\15\1\14"+
        "\1\u0095\1\16\1\17\1\22\1\uffff\1\25\102\uffff\1\u0096\2\uffff\1"+
        "\u0093\1\uffff\1\u0094\2\uffff\1\44\13\uffff\1\53\35\uffff\1\125"+
        "\5\uffff\1\136\2\uffff\1\122\12\uffff\1\154\1\152\1\uffff\1\155"+
        "\22\uffff\1\u0084\24\uffff\1\43\1\45\1\uffff\1\36\1\40\40\uffff"+
        "\1\105\3\uffff\1\114\20\uffff\1\141\4\uffff\1\147\22\uffff\1\175"+
        "\3\uffff\1\u0080\32\uffff\1\55\1\56\13\uffff\1\102\3\uffff\1\77"+
        "\7\uffff\1\104\1\103\1\113\1\uffff\1\116\1\uffff\1\117\3\uffff\1"+
        "\135\7\uffff\1\140\1\142\1\uffff\1\143\2\uffff\1\151\4\uffff\1\160"+
        "\16\uffff\1\u0082\3\uffff\1\u0083\5\uffff\1\u008d\3\uffff\1\u008f"+
        "\2\uffff\1\37\1\41\1\35\3\uffff\1\51\3\uffff\1\57\1\66\22\uffff"+
        "\1\120\3\uffff\1\126\4\uffff\1\131\2\uffff\1\144\1\145\2\uffff\1"+
        "\157\1\uffff\1\156\2\uffff\1\163\7\uffff\1\164\6\uffff\1\u0081\1"+
        "\u008a\2\uffff\1\u0087\3\uffff\1\u0090\2\uffff\1\46\1\uffff\1\50"+
        "\2\uffff\1\65\1\uffff\1\61\2\uffff\1\62\4\uffff\1\100\1\76\1\uffff"+
        "\1\107\1\uffff\1\111\1\uffff\1\106\1\uffff\1\121\1\123\4\uffff\1"+
        "\132\1\137\3\uffff\1\153\1\uffff\1\161\2\uffff\1\166\1\uffff\1\171"+
        "\4\uffff\1\177\3\uffff\1\u0089\1\u0088\1\uffff\1\u008b\1\u008c\1"+
        "\42\1\uffff\1\52\1\54\1\uffff\1\60\5\uffff\1\73\2\uffff\1\112\1"+
        "\115\1\uffff\1\127\1\uffff\1\133\1\uffff\1\150\1\146\1\162\1\170"+
        "\1\172\2\uffff\1\167\3\uffff\1\u0086\1\uffff\1\u008e\3\uffff\1\63"+
        "\1\uffff\1\72\1\75\1\uffff\1\101\5\uffff\1\173\1\174\10\uffff\1"+
        "\110\1\134\1\130\1\124\1\uffff\1\176\4\uffff\1\64\1\74\1\165\4\uffff"+
        "\1\u0085\1\uffff\1\70\1\67\1\uffff\1\47\4\uffff\1\71";
    static final String DFA22_specialS =
        "\u0299\uffff}>";
    static final String[] DFA22_transitionS = {
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
            "\1\75\1\uffff\12\75",
            "\1\61\1\75\1\uffff\12\75",
            "",
            "",
            "\1\61",
            "",
            "",
            "\12\101",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\110\1\uffff\1\106\1\uffff\1\105\5\uffff\1\107\1\uffff\1"+
            "\103\4\uffff\1\104\1\112\1\111\14\uffff\1\110\1\uffff\1\106"+
            "\1\uffff\1\105\5\uffff\1\107\1\uffff\1\103\4\uffff\1\104\1\112"+
            "\1\111",
            "\1\113\23\uffff\1\114\13\uffff\1\113\23\uffff\1\114",
            "\1\115\6\uffff\1\117\6\uffff\1\121\2\uffff\1\120\2\uffff\1"+
            "\116\13\uffff\1\115\6\uffff\1\117\6\uffff\1\121\2\uffff\1\120"+
            "\2\uffff\1\116",
            "\1\122\3\uffff\1\124\3\uffff\1\125\10\uffff\1\123\16\uffff"+
            "\1\122\3\uffff\1\124\3\uffff\1\125\10\uffff\1\123",
            "\1\132\12\uffff\1\131\1\uffff\1\130\4\uffff\1\127\4\uffff\1"+
            "\126\10\uffff\1\132\12\uffff\1\131\1\uffff\1\130\4\uffff\1\127"+
            "\4\uffff\1\126",
            "\1\133\15\uffff\1\134\2\uffff\1\135\16\uffff\1\133\15\uffff"+
            "\1\134\2\uffff\1\135",
            "\1\137\5\uffff\1\136\31\uffff\1\137\5\uffff\1\136",
            "\1\140\37\uffff\1\140",
            "\1\145\1\141\5\uffff\1\144\1\142\4\uffff\1\143\22\uffff\1\145"+
            "\1\141\5\uffff\1\144\1\142\4\uffff\1\143",
            "\1\146\37\uffff\1\146",
            "\1\147\37\uffff\1\147",
            "\1\150\3\uffff\1\151\33\uffff\1\150\3\uffff\1\151",
            "\1\152\37\uffff\1\152",
            "\1\155\15\uffff\1\153\5\uffff\1\154\13\uffff\1\155\15\uffff"+
            "\1\153\5\uffff\1\154",
            "\1\160\7\uffff\1\157\3\uffff\1\161\2\uffff\1\156\20\uffff\1"+
            "\160\7\uffff\1\157\3\uffff\1\161\2\uffff\1\156",
            "\1\162\5\uffff\1\163\31\uffff\1\162\5\uffff\1\163",
            "\1\164\37\uffff\1\164",
            "\1\166\3\uffff\1\165\11\uffff\1\167\21\uffff\1\166\3\uffff"+
            "\1\165\11\uffff\1\167",
            "\1\170\3\uffff\1\171\33\uffff\1\170\3\uffff\1\171",
            "\1\176\3\uffff\1\173\2\uffff\1\175\6\uffff\1\172\2\uffff\1"+
            "\174\16\uffff\1\176\3\uffff\1\173\2\uffff\1\175\6\uffff\1\172"+
            "\2\uffff\1\174",
            "\1\u0081\1\uffff\1\u0080\2\uffff\1\177\32\uffff\1\u0081\1\uffff"+
            "\1\u0080\2\uffff\1\177",
            "\1\u0083\7\uffff\1\u0082\27\uffff\1\u0083\7\uffff\1\u0082",
            "\1\u0084\37\uffff\1\u0084",
            "\1\u0085",
            "",
            "\1\u0087\1\uffff\12\57\13\uffff\1\u0086\37\uffff\1\u0086",
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
            "\12\101\13\uffff\1\u0089\37\uffff\1\u0089",
            "",
            "\1\u008b\2\uffff\1\u008c\34\uffff\1\u008b\2\uffff\1\u008c",
            "\12\60\7\uffff\2\60\1\u008e\27\60\4\uffff\1\60\1\uffff\2\60"+
            "\1\u008e\27\60",
            "\1\u008f\37\uffff\1\u008f",
            "\1\u0090\37\uffff\1\u0090",
            "\1\u0091\7\uffff\1\u0092\27\uffff\1\u0091\7\uffff\1\u0092",
            "\1\u0093\37\uffff\1\u0093",
            "\1\u0094\37\uffff\1\u0094",
            "\1\u0095\37\uffff\1\u0095",
            "\1\u0098\1\u0097\14\uffff\1\u0096\21\uffff\1\u0098\1\u0097"+
            "\14\uffff\1\u0096",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u009a\37\uffff\1\u009a",
            "\1\u009b\37\uffff\1\u009b",
            "\1\u009c\37\uffff\1\u009c",
            "\1\u009e\11\uffff\1\u009d\25\uffff\1\u009e\11\uffff\1\u009d",
            "\1\u009f\1\u00a1\1\u00a0\35\uffff\1\u009f\1\u00a1\1\u00a0",
            "\1\u00a2\37\uffff\1\u00a2",
            "\1\u00a3\37\uffff\1\u00a3",
            "\1\u00a4\5\uffff\1\u00a7\6\uffff\1\u00a6\1\u00a5\21\uffff\1"+
            "\u00a4\5\uffff\1\u00a7\6\uffff\1\u00a6\1\u00a5",
            "\1\u00a8\37\uffff\1\u00a8",
            "\1\u00a9\5\uffff\1\u00aa\6\uffff\1\u00ab\22\uffff\1\u00a9\5"+
            "\uffff\1\u00aa\6\uffff\1\u00ab",
            "\1\u00ac\37\uffff\1\u00ac",
            "\1\u00ad\37\uffff\1\u00ad",
            "\1\u00ae\37\uffff\1\u00ae",
            "\1\u00af\37\uffff\1\u00af",
            "\1\u00b0\37\uffff\1\u00b0",
            "\1\u00b1\37\uffff\1\u00b1",
            "\1\u00b2\37\uffff\1\u00b2",
            "\1\u00b3\37\uffff\1\u00b3",
            "\1\u00b4\37\uffff\1\u00b4",
            "\1\u00b5\37\uffff\1\u00b5",
            "\1\u00b6\37\uffff\1\u00b6",
            "\12\60\7\uffff\3\60\1\u00b9\4\60\1\u00ba\4\60\1\u00bc\4\60"+
            "\1\u00bb\1\u00b8\6\60\4\uffff\1\60\1\uffff\3\60\1\u00b9\4\60"+
            "\1\u00ba\4\60\1\u00bc\4\60\1\u00bb\1\u00b8\6\60",
            "\12\60\7\uffff\15\60\1\u00be\14\60\4\uffff\1\60\1\uffff\15"+
            "\60\1\u00be\14\60",
            "\1\u00bf\37\uffff\1\u00bf",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00c1\37\uffff\1\u00c1",
            "\1\u00c2\37\uffff\1\u00c2",
            "\1\u00c3\37\uffff\1\u00c3",
            "\1\u00c5\1\uffff\1\u00c4\35\uffff\1\u00c5\1\uffff\1\u00c4",
            "\1\u00c6\37\uffff\1\u00c6",
            "\1\u00c7\37\uffff\1\u00c7",
            "\1\u00c8\37\uffff\1\u00c8",
            "\1\u00c9\37\uffff\1\u00c9",
            "\1\u00ca\37\uffff\1\u00ca",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\5\60\1\u00cd\24\60\4\uffff\1\60\1\uffff\5\60"+
            "\1\u00cd\24\60",
            "\12\60\7\uffff\3\60\1\u00cf\26\60\4\uffff\1\60\1\uffff\3\60"+
            "\1\u00cf\26\60",
            "\1\u00d0\37\uffff\1\u00d0",
            "\1\u00d2\7\uffff\1\u00d1\27\uffff\1\u00d2\7\uffff\1\u00d1",
            "\1\u00d3\37\uffff\1\u00d3",
            "\1\u00d7\1\u00d6\1\uffff\1\u00da\2\uffff\1\u00d4\1\uffff\1"+
            "\u00d8\1\uffff\1\u00d5\2\uffff\1\u00d9\22\uffff\1\u00d7\1\u00d6"+
            "\1\uffff\1\u00da\2\uffff\1\u00d4\1\uffff\1\u00d8\1\uffff\1\u00d5"+
            "\2\uffff\1\u00d9",
            "\1\u00db\37\uffff\1\u00db",
            "\1\u00dd\12\uffff\1\u00dc\24\uffff\1\u00dd\12\uffff\1\u00dc",
            "\1\u00de\37\uffff\1\u00de",
            "\1\u00df\7\uffff\1\u00e0\27\uffff\1\u00df\7\uffff\1\u00e0",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00e2\37\uffff\1\u00e2",
            "\1\u00e4\7\uffff\1\u00e3\27\uffff\1\u00e4\7\uffff\1\u00e3",
            "\1\u00e5\37\uffff\1\u00e5",
            "\1\u00e6\37\uffff\1\u00e6",
            "\1\u00e7\37\uffff\1\u00e7",
            "\1\u00e8\37\uffff\1\u00e8",
            "\1\u00e9\37\uffff\1\u00e9",
            "\1\u00ea\14\uffff\1\u00eb\22\uffff\1\u00ea\14\uffff\1\u00eb",
            "\1\u00ec\10\uffff\1\u00ed\26\uffff\1\u00ec\10\uffff\1\u00ed",
            "\1\u00ee\37\uffff\1\u00ee",
            "",
            "\1\u00ef\1\uffff\1\u00ef\2\uffff\12\u00f0",
            "\12\u00f1\13\uffff\1\u00f2\37\uffff\1\u00f2",
            "",
            "\1\u00f3\1\uffff\1\u00f3\2\uffff\12\u00f4",
            "",
            "\1\u00f5\37\uffff\1\u00f5",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00f8\37\uffff\1\u00f8",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00fb\37\uffff\1\u00fb",
            "\1\u00fc\37\uffff\1\u00fc",
            "\1\u00fd\37\uffff\1\u00fd",
            "\1\u00fe\37\uffff\1\u00fe",
            "\1\u00ff\37\uffff\1\u00ff",
            "\1\u0100\37\uffff\1\u0100",
            "\1\u0101\37\uffff\1\u0101",
            "",
            "\1\u0104\1\uffff\1\u0102\16\uffff\1\u0103\16\uffff\1\u0104"+
            "\1\uffff\1\u0102\16\uffff\1\u0103",
            "\1\u0105\37\uffff\1\u0105",
            "\1\u0106\37\uffff\1\u0106",
            "\1\u0107\37\uffff\1\u0107",
            "\1\u0108\37\uffff\1\u0108",
            "\1\u0109\10\uffff\1\u010a\26\uffff\1\u0109\10\uffff\1\u010a",
            "\1\u010b\14\uffff\1\u010c\22\uffff\1\u010b\14\uffff\1\u010c",
            "\1\u010d\37\uffff\1\u010d",
            "\1\u010e\37\uffff\1\u010e",
            "\1\u010f\37\uffff\1\u010f",
            "\1\u0111\3\uffff\1\u0110\33\uffff\1\u0111\3\uffff\1\u0110",
            "\1\u0112\37\uffff\1\u0112",
            "\1\u0113\37\uffff\1\u0113",
            "\1\u0114\37\uffff\1\u0114",
            "\1\u0115\37\uffff\1\u0115",
            "\1\u0116\6\uffff\1\u0117\30\uffff\1\u0116\6\uffff\1\u0117",
            "\1\u0118\37\uffff\1\u0118",
            "\1\u0119\37\uffff\1\u0119",
            "\1\u011a\37\uffff\1\u011a",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u011c\37\uffff\1\u011c",
            "\1\u011d\37\uffff\1\u011d",
            "\1\u011e\37\uffff\1\u011e",
            "\12\60\7\uffff\4\60\1\u0120\25\60\4\uffff\1\60\1\uffff\4\60"+
            "\1\u0120\25\60",
            "\1\u0121\37\uffff\1\u0121",
            "\1\u0122\37\uffff\1\u0122",
            "\1\u0123\37\uffff\1\u0123",
            "\1\u0124\37\uffff\1\u0124",
            "\1\u0125\37\uffff\1\u0125",
            "",
            "\1\u0126\11\uffff\1\u0127\25\uffff\1\u0126\11\uffff\1\u0127",
            "\1\u0128\37\uffff\1\u0128",
            "\1\u0129\37\uffff\1\u0129",
            "\1\u012b\16\uffff\1\u012a\20\uffff\1\u012b\16\uffff\1\u012a",
            "\1\u012c\37\uffff\1\u012c",
            "",
            "\1\u012d\37\uffff\1\u012d",
            "\1\u012e\37\uffff\1\u012e",
            "",
            "\1\u012f\37\uffff\1\u012f",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0131\37\uffff\1\u0131",
            "\1\u0132\37\uffff\1\u0132",
            "\1\u0133\37\uffff\1\u0133",
            "\1\u0134\37\uffff\1\u0134",
            "\12\60\7\uffff\15\60\1\u0136\14\60\4\uffff\1\60\1\uffff\15"+
            "\60\1\u0136\14\60",
            "\1\u0137\37\uffff\1\u0137",
            "\1\u0138\37\uffff\1\u0138",
            "\1\u0139\37\uffff\1\u0139",
            "",
            "",
            "\1\u013a\37\uffff\1\u013a",
            "",
            "\1\u013b\37\uffff\1\u013b",
            "\1\u013c\37\uffff\1\u013c",
            "\1\u013d\37\uffff\1\u013d",
            "\1\u013e\37\uffff\1\u013e",
            "\1\u013f\37\uffff\1\u013f",
            "\1\u0140\37\uffff\1\u0140",
            "\1\u0141\37\uffff\1\u0141",
            "\1\u0142\37\uffff\1\u0142",
            "\1\u0143\37\uffff\1\u0143",
            "\1\u0144\37\uffff\1\u0144",
            "\1\u0145\37\uffff\1\u0145",
            "\1\u0146\37\uffff\1\u0146",
            "\1\u0147\37\uffff\1\u0147",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0149\37\uffff\1\u0149",
            "\1\u014a\37\uffff\1\u014a",
            "\1\u014b\37\uffff\1\u014b",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u014d\37\uffff\1\u014d",
            "\1\u014e\37\uffff\1\u014e",
            "\1\u014f\37\uffff\1\u014f",
            "\1\u0150\37\uffff\1\u0150",
            "\1\u0151\37\uffff\1\u0151",
            "\1\u0152\37\uffff\1\u0152",
            "\1\u0153\37\uffff\1\u0153",
            "\1\u0155\1\uffff\1\u0154\35\uffff\1\u0155\1\uffff\1\u0154",
            "\1\u0156\37\uffff\1\u0156",
            "\1\u0157\37\uffff\1\u0157",
            "\1\u0158\37\uffff\1\u0158",
            "\1\u0159\37\uffff\1\u0159",
            "\1\u015a\3\uffff\1\u015b\33\uffff\1\u015a\3\uffff\1\u015b",
            "\12\u00f0",
            "\12\u00f0",
            "\12\u00f1\13\uffff\1\u00f2\37\uffff\1\u00f2",
            "\1\u015c\1\uffff\1\u015c\2\uffff\12\u015d",
            "\12\u00f4",
            "\12\u00f4",
            "\1\u015e\37\uffff\1\u015e",
            "",
            "",
            "\1\u015f\37\uffff\1\u015f",
            "",
            "",
            "\1\u0160\37\uffff\1\u0160",
            "\1\u0161\37\uffff\1\u0161",
            "\1\u0162\37\uffff\1\u0162",
            "\1\u0163\37\uffff\1\u0163",
            "\1\u0164\37\uffff\1\u0164",
            "\1\u0165\37\uffff\1\u0165",
            "\1\u0166\37\uffff\1\u0166",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0169\37\uffff\1\u0169",
            "\1\u016a\37\uffff\1\u016a",
            "\1\u016b\37\uffff\1\u016b",
            "\1\u016c\37\uffff\1\u016c",
            "\1\u016d\37\uffff\1\u016d",
            "\1\u016e\37\uffff\1\u016e",
            "\1\u016f\37\uffff\1\u016f",
            "\1\u0170\37\uffff\1\u0170",
            "\1\u0171\37\uffff\1\u0171",
            "\1\u0172\37\uffff\1\u0172",
            "\1\u0173\37\uffff\1\u0173",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0175\37\uffff\1\u0175",
            "\1\u0176\37\uffff\1\u0176",
            "\1\u0177\37\uffff\1\u0177",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0179\37\uffff\1\u0179",
            "\1\u017a\37\uffff\1\u017a",
            "\1\u017b\37\uffff\1\u017b",
            "\1\u017c\37\uffff\1\u017c",
            "\1\u017d\37\uffff\1\u017d",
            "\1\u017e\37\uffff\1\u017e",
            "\1\u017f\37\uffff\1\u017f",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0183\37\uffff\1\u0183",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0185\37\uffff\1\u0185",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0187\37\uffff\1\u0187",
            "\1\u0188\37\uffff\1\u0188",
            "\1\u0189\37\uffff\1\u0189",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u018b\37\uffff\1\u018b",
            "\1\u018c\37\uffff\1\u018c",
            "\1\u018d\37\uffff\1\u018d",
            "\1\u018e\37\uffff\1\u018e",
            "\1\u018f\37\uffff\1\u018f",
            "\1\u0190\37\uffff\1\u0190",
            "\1\u0191\37\uffff\1\u0191",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0194\37\uffff\1\u0194",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0196\37\uffff\1\u0196",
            "",
            "\1\u0197\37\uffff\1\u0197",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0199\37\uffff\1\u0199",
            "\1\u019a\37\uffff\1\u019a",
            "\1\u019b\37\uffff\1\u019b",
            "\1\u019c\37\uffff\1\u019c",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u019e\37\uffff\1\u019e",
            "\1\u019f\37\uffff\1\u019f",
            "\1\u01a0\37\uffff\1\u01a0",
            "\1\u01a1\37\uffff\1\u01a1",
            "\1\u01a2\37\uffff\1\u01a2",
            "\1\u01a3\37\uffff\1\u01a3",
            "\1\u01a4\37\uffff\1\u01a4",
            "\1\u01a5\37\uffff\1\u01a5",
            "\1\u01a6\37\uffff\1\u01a6",
            "\1\u01a7\37\uffff\1\u01a7",
            "\1\u01a8\37\uffff\1\u01a8",
            "",
            "\1\u01a9\37\uffff\1\u01a9",
            "\1\u01aa\37\uffff\1\u01aa",
            "\1\u01ab\37\uffff\1\u01ab",
            "",
            "\12\60\7\uffff\16\60\1\u01ad\13\60\4\uffff\1\60\1\uffff\16"+
            "\60\1\u01ad\13\60",
            "\1\u01ae\37\uffff\1\u01ae",
            "\1\u01af\37\uffff\1\u01af",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01b1\37\uffff\1\u01b1",
            "\1\u01b2\37\uffff\1\u01b2",
            "\1\u01b3\37\uffff\1\u01b3",
            "\1\u01b4\37\uffff\1\u01b4",
            "\1\u01b5\37\uffff\1\u01b5",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01b7\37\uffff\1\u01b7",
            "\1\u01b8\37\uffff\1\u01b8",
            "\1\u01b9\37\uffff\1\u01b9",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01bb\37\uffff\1\u01bb",
            "\12\u015d",
            "\12\u015d",
            "\1\u01bc\37\uffff\1\u01bc",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01c0\37\uffff\1\u01c0",
            "\1\u01c1\37\uffff\1\u01c1",
            "\1\u01c2\37\uffff\1\u01c2",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01c4\37\uffff\1\u01c4",
            "",
            "",
            "\1\u01c5\37\uffff\1\u01c5",
            "\1\u01c6\37\uffff\1\u01c6",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01c9\37\uffff\1\u01c9",
            "\1\u01ca\37\uffff\1\u01ca",
            "\1\u01cb\37\uffff\1\u01cb",
            "\1\u01cc\37\uffff\1\u01cc",
            "\1\u01cd\37\uffff\1\u01cd",
            "\1\u01ce\37\uffff\1\u01ce",
            "\1\u01cf\37\uffff\1\u01cf",
            "",
            "\1\u01d0\37\uffff\1\u01d0",
            "\1\u01d1\37\uffff\1\u01d1",
            "\1\u01d2\37\uffff\1\u01d2",
            "",
            "\1\u01d3\37\uffff\1\u01d3",
            "\1\u01d4\37\uffff\1\u01d4",
            "\1\u01d5\37\uffff\1\u01d5",
            "\1\u01d6\37\uffff\1\u01d6",
            "\1\u01d7\37\uffff\1\u01d7",
            "\1\u01d8\37\uffff\1\u01d8",
            "\1\u01d9\37\uffff\1\u01d9",
            "",
            "",
            "",
            "\1\u01da\37\uffff\1\u01da",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u01dc\37\uffff\1\u01dc",
            "\1\u01dd\37\uffff\1\u01dd",
            "\1\u01de\37\uffff\1\u01de",
            "",
            "\12\60\7\uffff\4\60\1\u01e0\25\60\4\uffff\1\60\1\uffff\4\60"+
            "\1\u01e0\25\60",
            "\1\u01e1\37\uffff\1\u01e1",
            "\1\u01e2\37\uffff\1\u01e2",
            "\1\u01e3\37\uffff\1\u01e3",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01e5\37\uffff\1\u01e5",
            "\1\u01e6\37\uffff\1\u01e6",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01e9\37\uffff\1\u01e9",
            "",
            "\1\u01ea\37\uffff\1\u01ea",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01ec\37\uffff\1\u01ec",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u01ee\37\uffff\1\u01ee",
            "\1\u01ef\37\uffff\1\u01ef",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01f1\37\uffff\1\u01f1",
            "\1\u01f2\37\uffff\1\u01f2",
            "\1\u01f3\37\uffff\1\u01f3",
            "\1\u01f4\37\uffff\1\u01f4",
            "\1\u01f5\37\uffff\1\u01f5",
            "\1\u01f6\37\uffff\1\u01f6",
            "\1\u01f7\37\uffff\1\u01f7",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01f9\37\uffff\1\u01f9",
            "\1\u01fa\37\uffff\1\u01fa",
            "\1\u01fb\37\uffff\1\u01fb",
            "",
            "\1\u01fc\37\uffff\1\u01fc",
            "\1\u01fd\37\uffff\1\u01fd",
            "\1\u01fe\37\uffff\1\u01fe",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0201\37\uffff\1\u0201",
            "\1\u0202\37\uffff\1\u0202",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0204\37\uffff\1\u0204",
            "\1\u0205\37\uffff\1\u0205",
            "\1\u0206\37\uffff\1\u0206",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0208\37\uffff\1\u0208",
            "",
            "",
            "",
            "\1\u0209\37\uffff\1\u0209",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u020b\37\uffff\1\u020b",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u020d\37\uffff\1\u020d",
            "\1\u020e\37\uffff\1\u020e",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0210\37\uffff\1\u0210",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0212\37\uffff\1\u0212",
            "\1\u0213\37\uffff\1\u0213",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0215\37\uffff\1\u0215",
            "\1\u0217\3\uffff\1\u0216\33\uffff\1\u0217\3\uffff\1\u0216",
            "\1\u0218\37\uffff\1\u0218",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u021b\37\uffff\1\u021b",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u021d\37\uffff\1\u021d",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u021f\37\uffff\1\u021f",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0221\37\uffff\1\u0221",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0224\37\uffff\1\u0224",
            "",
            "\1\u0225\37\uffff\1\u0225",
            "\1\u0226\37\uffff\1\u0226",
            "\1\u0227\37\uffff\1\u0227",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u022a\37\uffff\1\u022a",
            "",
            "",
            "\1\u022b\37\uffff\1\u022b",
            "\1\u022c\37\uffff\1\u022c",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u022e\37\uffff\1\u022e",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0230\37\uffff\1\u0230",
            "\1\u0231\37\uffff\1\u0231",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0233\37\uffff\1\u0233",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0235\37\uffff\1\u0235",
            "\1\u0236\37\uffff\1\u0236",
            "",
            "\1\u0237\37\uffff\1\u0237",
            "\1\u0238\37\uffff\1\u0238",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u023a\37\uffff\1\u023a",
            "\1\u023b\37\uffff\1\u023b",
            "\1\u023c\37\uffff\1\u023c",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u023f\37\uffff\1\u023f",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0243\37\uffff\1\u0243",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0246",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0248\37\uffff\1\u0248",
            "\1\u0249\37\uffff\1\u0249",
            "",
            "\1\u024a\37\uffff\1\u024a",
            "\1\u024b\37\uffff\1\u024b",
            "\1\u024c\37\uffff\1\u024c",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\u024e\37\uffff\1\u024e",
            "",
            "\1\u024f\37\uffff\1\u024f",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\u0252\37\uffff\1\u0252",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0254\37\uffff\1\u0254",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\u0256\37\uffff\1\u0256",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u025c\37\uffff\1\u025c",
            "",
            "\1\u025d\37\uffff\1\u025d",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u025f\37\uffff\1\u025f",
            "\1\u0260\37\uffff\1\u0260",
            "",
            "\1\u0261\37\uffff\1\u0261",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0263\37\uffff\1\u0263",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "\1\u0265\37\uffff\1\u0265",
            "",
            "",
            "\1\u0266\17\uffff\1\u0267\17\uffff\1\u0266\17\uffff\1\u0267",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0269\37\uffff\1\u0269",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u026c\37\uffff\1\u026c",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u026e\37\uffff\1\u026e",
            "",
            "",
            "\1\u026f\37\uffff\1\u026f",
            "",
            "\1\u0270\37\uffff\1\u0270",
            "",
            "\1\u0271\37\uffff\1\u0271",
            "",
            "",
            "",
            "",
            "",
            "\1\u0272\37\uffff\1\u0272",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0275\37\uffff\1\u0275",
            "\1\u0276\37\uffff\1\u0276",
            "",
            "\1\u0277\37\uffff\1\u0277",
            "",
            "\1\u0278\37\uffff\1\u0278",
            "\1\u0279\37\uffff\1\u0279",
            "\1\u027a\37\uffff\1\u027a",
            "",
            "\1\u027b\37\uffff\1\u027b",
            "",
            "",
            "\1\u027c\37\uffff\1\u027c",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0281\37\uffff\1\u0281",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0283\37\uffff\1\u0283",
            "\1\u0284\37\uffff\1\u0284",
            "\1\u0285\37\uffff\1\u0285",
            "\1\u0286\37\uffff\1\u0286",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u028a\37\uffff\1\u028a",
            "\1\u028b\37\uffff\1\u028b",
            "\1\u028c\37\uffff\1\u028c",
            "\1\u028d\37\uffff\1\u028d",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u028f\37\uffff\1\u028f",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\22\60\1\u0292\7\60\4\uffff\1\60\1\uffff\22\60"+
            "\1\u0292\7\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\u0294\37\uffff\1\u0294",
            "",
            "\1\u0295\37\uffff\1\u0295",
            "\1\u0296\37\uffff\1\u0296",
            "\1\u0297\37\uffff\1\u0297",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 | LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ | SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE | DOUBLE_PIPE | PLUS | MINUS | TILDA | ASTERISK | SLASH | PERCENT | SEMI | DOT | COMMA | LPAREN | RPAREN | QUESTION | COLON | AT | DOLLAR | ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE | ID | STRING | INTEGER | FLOAT | SIGNED_NUMBER | BLOB | WS );";
        }
    }
 

}