// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 SqlParser.g 2009-06-18 10:24:57

  package org.tmatesoft.sqljet.core.internal.lang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class SqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "EQUALS", "EQUALS2", "NOT_EQUALS", "NOT_EQUALS2", "LESS", "LESS_OR_EQ", "GREATER", "GREATER_OR_EQ", "SHIFT_LEFT", "SHIFT_RIGHT", "AMPERSAND", "PIPE", "DOUBLE_PIPE", "PLUS", "MINUS", "TILDA", "ASTERISK", "SLASH", "PERCENT", "SEMI", "DOT", "COMMA", "LPAREN", "RPAREN", "QUESTION", "COLON", "AT", "DOLLAR", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "ABORT", "ADD", "AFTER", "ALL", "ALTER", "ANALYZE", "AND", "AS", "ASC", "ATTACH", "AUTOINCREMENT", "BEFORE", "BEGIN", "BETWEEN", "BY", "CASCADE", "CASE", "CAST", "CHECK", "COLLATE", "COLUMN", "COMMIT", "CONFLICT", "CONSTRAINT", "CREATE", "CROSS", "CURRENT_TIME", "CURRENT_DATE", "CURRENT_TIMESTAMP", "DATABASE", "DEFAULT", "DEFERRABLE", "DEFERRED", "DELETE", "DESC", "DETACH", "DISTINCT", "DROP", "EACH", "ELSE", "END", "ESCAPE", "EXCEPT", "EXCLUSIVE", "EXISTS", "EXPLAIN", "FAIL", "FOR", "FOREIGN", "FROM", "GLOB", "GROUP", "HAVING", "IF", "IGNORE", "IMMEDIATE", "IN", "INDEX", "INDEXED", "INITIALLY", "INNER", "INSERT", "INSTEAD", "INTERSECT", "INTO", "IS", "ISNULL", "JOIN", "KEY", "LEFT", "LIKE", "LIMIT", "MATCH", "NATURAL", "NOT", "NOTNULL", "NULL", "OF", "OFFSET", "ON", "OR", "ORDER", "OUTER", "PLAN", "PRAGMA", "PRIMARY", "QUERY", "RAISE", "REFERENCES", "REGEXP", "REINDEX", "RELEASE", "RENAME", "REPLACE", "RESTRICT", "ROLLBACK", "ROW", "SAVEPOINT", "SELECT", "SET", "TABLE", "TEMPORARY", "THEN", "TO", "TRANSACTION", "TRIGGER", "UNION", "UNIQUE", "UPDATE", "USING", "VACUUM", "VALUES", "VIEW", "VIRTUAL", "WHEN", "WHERE", "ID_START", "ID", "STRING", "INTEGER", "FLOAT_EXP", "FLOAT", "BLOB", "COMMENT", "LINE_COMMENT", "WS", "ALIAS", "BIND", "BIND_NAME", "BLOB_LITERAL", "COLUMN_CONSTRAINT", "COLUMN_EXPRESSION", "COLUMNS", "CONSTRAINTS", "CREATE_INDEX", "CREATE_TABLE", "DROP_INDEX", "DROP_TABLE", "FLOAT_LITERAL", "FUNCTION_LITERAL", "INTEGER_LITERAL", "IS_NULL", "IN_VALUES", "IN_TABLE", "NOT_NULL", "OPTIONS", "ORDERING", "SELECT_CORE", "STRING_LITERAL", "TABLE_CONSTRAINT", "TYPE", "TYPE_PARAMS"
    };
    public static final int ROW=154;
    public static final int BLOB_LITERAL=187;
    public static final int TYPE_PARAMS=209;
    public static final int NOT=132;
    public static final int EXCEPT=100;
    public static final int FOREIGN=106;
    public static final int EOF=-1;
    public static final int TYPE=208;
    public static final int RPAREN=27;
    public static final int CREATE=82;
    public static final int STRING_LITERAL=206;
    public static final int IS_NULL=199;
    public static final int USING=167;
    public static final int BIND=185;
    public static final int BEGIN=70;
    public static final int REGEXP=147;
    public static final int ANALYZE=63;
    public static final int FUNCTION_LITERAL=197;
    public static final int CONFLICT=80;
    public static final int LESS_OR_EQ=9;
    public static final int ATTACH=67;
    public static final int VIRTUAL=171;
    public static final int D=35;
    public static final int E=36;
    public static final int F=37;
    public static final int G=38;
    public static final int BLOB=180;
    public static final int A=32;
    public static final int B=33;
    public static final int ASC=66;
    public static final int C=34;
    public static final int L=43;
    public static final int M=44;
    public static final int N=45;
    public static final int O=46;
    public static final int KEY=126;
    public static final int TRANSACTION=162;
    public static final int H=39;
    public static final int I=40;
    public static final int BIND_NAME=186;
    public static final int J=41;
    public static final int ELSE=97;
    public static final int K=42;
    public static final int U=52;
    public static final int T=51;
    public static final int IN_VALUES=200;
    public static final int W=54;
    public static final int V=53;
    public static final int Q=48;
    public static final int P=47;
    public static final int S=50;
    public static final int R=49;
    public static final int ROLLBACK=153;
    public static final int FAIL=104;
    public static final int Y=56;
    public static final int RESTRICT=152;
    public static final int X=55;
    public static final int Z=57;
    public static final int GROUP=109;
    public static final int INTERSECT=121;
    public static final int DROP_INDEX=194;
    public static final int WS=183;
    public static final int PLAN=141;
    public static final int ALIAS=184;
    public static final int END=98;
    public static final int CONSTRAINT=81;
    public static final int RENAME=150;
    public static final int ALTER=62;
    public static final int ISNULL=124;
    public static final int TABLE=158;
    public static final int FLOAT=179;
    public static final int NOTNULL=133;
    public static final int NOT_EQUALS=6;
    public static final int NOT_NULL=202;
    public static final int LPAREN=26;
    public static final int ASTERISK=20;
    public static final int GREATER_OR_EQ=11;
    public static final int AT=30;
    public static final int DOUBLE_PIPE=16;
    public static final int AS=65;
    public static final int SLASH=21;
    public static final int THEN=160;
    public static final int OFFSET=136;
    public static final int REPLACE=151;
    public static final int LEFT=127;
    public static final int COLUMN=78;
    public static final int PIPE=15;
    public static final int PLUS=17;
    public static final int EXISTS=102;
    public static final int LIKE=128;
    public static final int ADD=59;
    public static final int COLLATE=77;
    public static final int INTEGER=177;
    public static final int OUTER=140;
    public static final int BY=72;
    public static final int DEFERRABLE=89;
    public static final int TO=161;
    public static final int AMPERSAND=14;
    public static final int SET=157;
    public static final int HAVING=110;
    public static final int IGNORE=112;
    public static final int MINUS=18;
    public static final int SEMI=23;
    public static final int UNION=164;
    public static final int COLUMN_CONSTRAINT=188;
    public static final int COLON=29;
    public static final int COLUMNS=190;
    public static final int FLOAT_EXP=178;
    public static final int COMMIT=79;
    public static final int IN_TABLE=201;
    public static final int DATABASE=87;
    public static final int VACUUM=168;
    public static final int DROP=95;
    public static final int DETACH=93;
    public static final int WHEN=172;
    public static final int NATURAL=131;
    public static final int BETWEEN=71;
    public static final int OPTIONS=203;
    public static final int STRING=176;
    public static final int CAST=75;
    public static final int TABLE_CONSTRAINT=207;
    public static final int TRIGGER=163;
    public static final int CURRENT_TIME=84;
    public static final int CASE=74;
    public static final int EQUALS=4;
    public static final int CASCADE=73;
    public static final int RELEASE=149;
    public static final int EXPLAIN=103;
    public static final int GREATER=10;
    public static final int INSERT=119;
    public static final int ESCAPE=99;
    public static final int SAVEPOINT=155;
    public static final int LESS=8;
    public static final int RAISE=145;
    public static final int EACH=96;
    public static final int COMMENT=181;
    public static final int ABORT=58;
    public static final int SELECT=156;
    public static final int INTO=122;
    public static final int UNIQUE=165;
    public static final int GLOB=108;
    public static final int VIEW=170;
    public static final int LINE_COMMENT=182;
    public static final int NULL=134;
    public static final int ON=137;
    public static final int MATCH=130;
    public static final int PRIMARY=143;
    public static final int DELETE=91;
    public static final int OF=135;
    public static final int SHIFT_LEFT=12;
    public static final int SHIFT_RIGHT=13;
    public static final int INTEGER_LITERAL=198;
    public static final int OR=138;
    public static final int QUERY=144;
    public static final int CHECK=76;
    public static final int FROM=107;
    public static final int TEMPORARY=159;
    public static final int DISTINCT=94;
    public static final int CURRENT_DATE=85;
    public static final int DOLLAR=31;
    public static final int CONSTRAINTS=191;
    public static final int WHERE=173;
    public static final int COLUMN_EXPRESSION=189;
    public static final int INNER=118;
    public static final int ORDER=139;
    public static final int LIMIT=129;
    public static final int PRAGMA=142;
    public static final int UPDATE=166;
    public static final int FOR=105;
    public static final int DEFERRED=90;
    public static final int SELECT_CORE=205;
    public static final int EXCLUSIVE=101;
    public static final int ID=175;
    public static final int AND=64;
    public static final int CROSS=83;
    public static final int IF=111;
    public static final int INDEX=115;
    public static final int TILDA=19;
    public static final int IN=114;
    public static final int CREATE_TABLE=193;
    public static final int REFERENCES=146;
    public static final int COMMA=25;
    public static final int IS=123;
    public static final int ALL=61;
    public static final int DOT=24;
    public static final int CURRENT_TIMESTAMP=86;
    public static final int INITIALLY=117;
    public static final int REINDEX=148;
    public static final int EQUALS2=5;
    public static final int PERCENT=22;
    public static final int AUTOINCREMENT=68;
    public static final int NOT_EQUALS2=7;
    public static final int DEFAULT=88;
    public static final int VALUES=169;
    public static final int BEFORE=69;
    public static final int AFTER=60;
    public static final int INSTEAD=120;
    public static final int JOIN=125;
    public static final int FLOAT_LITERAL=196;
    public static final int INDEXED=116;
    public static final int CREATE_INDEX=192;
    public static final int QUESTION=28;
    public static final int ORDERING=204;
    public static final int IMMEDIATE=113;
    public static final int DESC=92;
    public static final int DROP_TABLE=195;
    public static final int ID_START=174;

    // delegates
    // delegators


        public SqlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SqlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return SqlParser.tokenNames; }
    public String getGrammarFileName() { return "SqlParser.g"; }


    public static class sql_stmt_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sql_stmt_list"
    // SqlParser.g:60:1: sql_stmt_list : ( sql_stmt )+ ;
    public final SqlParser.sql_stmt_list_return sql_stmt_list() throws RecognitionException {
        SqlParser.sql_stmt_list_return retval = new SqlParser.sql_stmt_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.sql_stmt_return sql_stmt1 = null;



        try {
            // SqlParser.g:60:14: ( ( sql_stmt )+ )
            // SqlParser.g:60:16: ( sql_stmt )+
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:60:16: ( sql_stmt )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=ALTER && LA1_0<=ANALYZE)||LA1_0==ATTACH||LA1_0==BEGIN||LA1_0==COMMIT||LA1_0==CREATE||LA1_0==DELETE||LA1_0==DETACH||LA1_0==DROP||LA1_0==END||LA1_0==EXPLAIN||LA1_0==INSERT||LA1_0==PRAGMA||(LA1_0>=REINDEX && LA1_0<=RELEASE)||LA1_0==REPLACE||LA1_0==ROLLBACK||(LA1_0>=SAVEPOINT && LA1_0<=SELECT)||LA1_0==UPDATE||LA1_0==VACUUM) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // SqlParser.g:60:17: sql_stmt
            	    {
            	    pushFollow(FOLLOW_sql_stmt_in_sql_stmt_list171);
            	    sql_stmt1=sql_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, sql_stmt1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sql_stmt_list"

    public static class sql_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sql_stmt"
    // SqlParser.g:62:1: sql_stmt : ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI ;
    public final SqlParser.sql_stmt_return sql_stmt() throws RecognitionException {
        SqlParser.sql_stmt_return retval = new SqlParser.sql_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EXPLAIN2=null;
        Token QUERY3=null;
        Token PLAN4=null;
        Token SEMI6=null;
        SqlParser.sql_stmt_core_return sql_stmt_core5 = null;


        Object EXPLAIN2_tree=null;
        Object QUERY3_tree=null;
        Object PLAN4_tree=null;
        Object SEMI6_tree=null;

        try {
            // SqlParser.g:62:9: ( ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI )
            // SqlParser.g:62:11: ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:62:11: ( EXPLAIN ( QUERY PLAN )? )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EXPLAIN) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // SqlParser.g:62:12: EXPLAIN ( QUERY PLAN )?
                    {
                    EXPLAIN2=(Token)match(input,EXPLAIN,FOLLOW_EXPLAIN_in_sql_stmt181); 
                    EXPLAIN2_tree = (Object)adaptor.create(EXPLAIN2);
                    adaptor.addChild(root_0, EXPLAIN2_tree);

                    // SqlParser.g:62:20: ( QUERY PLAN )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==QUERY) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // SqlParser.g:62:21: QUERY PLAN
                            {
                            QUERY3=(Token)match(input,QUERY,FOLLOW_QUERY_in_sql_stmt184); 
                            QUERY3_tree = (Object)adaptor.create(QUERY3);
                            adaptor.addChild(root_0, QUERY3_tree);

                            PLAN4=(Token)match(input,PLAN,FOLLOW_PLAN_in_sql_stmt186); 
                            PLAN4_tree = (Object)adaptor.create(PLAN4);
                            adaptor.addChild(root_0, PLAN4_tree);


                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_sql_stmt_core_in_sql_stmt192);
            sql_stmt_core5=sql_stmt_core();

            state._fsp--;

            adaptor.addChild(root_0, sql_stmt_core5.getTree());
            SEMI6=(Token)match(input,SEMI,FOLLOW_SEMI_in_sql_stmt194); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sql_stmt"

    public static class sql_stmt_core_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sql_stmt_core"
    // SqlParser.g:64:1: sql_stmt_core : ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt );
    public final SqlParser.sql_stmt_core_return sql_stmt_core() throws RecognitionException {
        SqlParser.sql_stmt_core_return retval = new SqlParser.sql_stmt_core_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.pragma_stmt_return pragma_stmt7 = null;

        SqlParser.attach_stmt_return attach_stmt8 = null;

        SqlParser.detach_stmt_return detach_stmt9 = null;

        SqlParser.analyze_stmt_return analyze_stmt10 = null;

        SqlParser.reindex_stmt_return reindex_stmt11 = null;

        SqlParser.vacuum_stmt_return vacuum_stmt12 = null;

        SqlParser.select_stmt_return select_stmt13 = null;

        SqlParser.insert_stmt_return insert_stmt14 = null;

        SqlParser.update_stmt_return update_stmt15 = null;

        SqlParser.delete_stmt_return delete_stmt16 = null;

        SqlParser.begin_stmt_return begin_stmt17 = null;

        SqlParser.commit_stmt_return commit_stmt18 = null;

        SqlParser.rollback_stmt_return rollback_stmt19 = null;

        SqlParser.savepoint_stmt_return savepoint_stmt20 = null;

        SqlParser.release_stmt_return release_stmt21 = null;

        SqlParser.create_virtual_table_stmt_return create_virtual_table_stmt22 = null;

        SqlParser.create_table_stmt_return create_table_stmt23 = null;

        SqlParser.drop_table_stmt_return drop_table_stmt24 = null;

        SqlParser.alter_table_stmt_return alter_table_stmt25 = null;

        SqlParser.create_view_stmt_return create_view_stmt26 = null;

        SqlParser.drop_view_stmt_return drop_view_stmt27 = null;

        SqlParser.create_index_stmt_return create_index_stmt28 = null;

        SqlParser.drop_index_stmt_return drop_index_stmt29 = null;

        SqlParser.create_trigger_stmt_return create_trigger_stmt30 = null;

        SqlParser.drop_trigger_stmt_return drop_trigger_stmt31 = null;



        try {
            // SqlParser.g:65:3: ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt )
            int alt4=25;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // SqlParser.g:65:5: pragma_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pragma_stmt_in_sql_stmt_core205);
                    pragma_stmt7=pragma_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_stmt7.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:66:5: attach_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_attach_stmt_in_sql_stmt_core211);
                    attach_stmt8=attach_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, attach_stmt8.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:67:5: detach_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_detach_stmt_in_sql_stmt_core217);
                    detach_stmt9=detach_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, detach_stmt9.getTree());

                    }
                    break;
                case 4 :
                    // SqlParser.g:68:5: analyze_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_analyze_stmt_in_sql_stmt_core223);
                    analyze_stmt10=analyze_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, analyze_stmt10.getTree());

                    }
                    break;
                case 5 :
                    // SqlParser.g:69:5: reindex_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_reindex_stmt_in_sql_stmt_core229);
                    reindex_stmt11=reindex_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, reindex_stmt11.getTree());

                    }
                    break;
                case 6 :
                    // SqlParser.g:70:5: vacuum_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_vacuum_stmt_in_sql_stmt_core235);
                    vacuum_stmt12=vacuum_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, vacuum_stmt12.getTree());

                    }
                    break;
                case 7 :
                    // SqlParser.g:72:5: select_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_select_stmt_in_sql_stmt_core244);
                    select_stmt13=select_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, select_stmt13.getTree());

                    }
                    break;
                case 8 :
                    // SqlParser.g:73:5: insert_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_insert_stmt_in_sql_stmt_core250);
                    insert_stmt14=insert_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, insert_stmt14.getTree());

                    }
                    break;
                case 9 :
                    // SqlParser.g:74:5: update_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_update_stmt_in_sql_stmt_core256);
                    update_stmt15=update_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, update_stmt15.getTree());

                    }
                    break;
                case 10 :
                    // SqlParser.g:75:5: delete_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_delete_stmt_in_sql_stmt_core262);
                    delete_stmt16=delete_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_stmt16.getTree());

                    }
                    break;
                case 11 :
                    // SqlParser.g:76:5: begin_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_begin_stmt_in_sql_stmt_core268);
                    begin_stmt17=begin_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, begin_stmt17.getTree());

                    }
                    break;
                case 12 :
                    // SqlParser.g:77:5: commit_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_commit_stmt_in_sql_stmt_core274);
                    commit_stmt18=commit_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, commit_stmt18.getTree());

                    }
                    break;
                case 13 :
                    // SqlParser.g:78:5: rollback_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_rollback_stmt_in_sql_stmt_core280);
                    rollback_stmt19=rollback_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, rollback_stmt19.getTree());

                    }
                    break;
                case 14 :
                    // SqlParser.g:79:5: savepoint_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_savepoint_stmt_in_sql_stmt_core286);
                    savepoint_stmt20=savepoint_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, savepoint_stmt20.getTree());

                    }
                    break;
                case 15 :
                    // SqlParser.g:80:5: release_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_release_stmt_in_sql_stmt_core292);
                    release_stmt21=release_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, release_stmt21.getTree());

                    }
                    break;
                case 16 :
                    // SqlParser.g:82:5: create_virtual_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_virtual_table_stmt_in_sql_stmt_core301);
                    create_virtual_table_stmt22=create_virtual_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_virtual_table_stmt22.getTree());

                    }
                    break;
                case 17 :
                    // SqlParser.g:83:5: create_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_table_stmt_in_sql_stmt_core307);
                    create_table_stmt23=create_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_table_stmt23.getTree());

                    }
                    break;
                case 18 :
                    // SqlParser.g:84:5: drop_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_table_stmt_in_sql_stmt_core313);
                    drop_table_stmt24=drop_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_table_stmt24.getTree());

                    }
                    break;
                case 19 :
                    // SqlParser.g:85:5: alter_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_alter_table_stmt_in_sql_stmt_core319);
                    alter_table_stmt25=alter_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, alter_table_stmt25.getTree());

                    }
                    break;
                case 20 :
                    // SqlParser.g:86:5: create_view_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_view_stmt_in_sql_stmt_core325);
                    create_view_stmt26=create_view_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_view_stmt26.getTree());

                    }
                    break;
                case 21 :
                    // SqlParser.g:87:5: drop_view_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_view_stmt_in_sql_stmt_core331);
                    drop_view_stmt27=drop_view_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_view_stmt27.getTree());

                    }
                    break;
                case 22 :
                    // SqlParser.g:88:5: create_index_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_index_stmt_in_sql_stmt_core337);
                    create_index_stmt28=create_index_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_index_stmt28.getTree());

                    }
                    break;
                case 23 :
                    // SqlParser.g:89:5: drop_index_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_index_stmt_in_sql_stmt_core343);
                    drop_index_stmt29=drop_index_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_index_stmt29.getTree());

                    }
                    break;
                case 24 :
                    // SqlParser.g:90:5: create_trigger_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_trigger_stmt_in_sql_stmt_core349);
                    create_trigger_stmt30=create_trigger_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_trigger_stmt30.getTree());

                    }
                    break;
                case 25 :
                    // SqlParser.g:91:5: drop_trigger_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_trigger_stmt_in_sql_stmt_core355);
                    drop_trigger_stmt31=drop_trigger_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_trigger_stmt31.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sql_stmt_core"

    public static class qualified_table_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qualified_table_name"
    // SqlParser.g:94:1: qualified_table_name : (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )? ;
    public final SqlParser.qualified_table_name_return qualified_table_name() throws RecognitionException {
        SqlParser.qualified_table_name_return retval = new SqlParser.qualified_table_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT32=null;
        Token INDEXED33=null;
        Token BY34=null;
        Token NOT35=null;
        Token INDEXED36=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.id_return index_name = null;


        Object DOT32_tree=null;
        Object INDEXED33_tree=null;
        Object BY34_tree=null;
        Object NOT35_tree=null;
        Object INDEXED36_tree=null;

        try {
            // SqlParser.g:94:21: ( (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )? )
            // SqlParser.g:94:23: (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )?
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:94:23: (database_name= id DOT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==DOT) ) {
                    alt5=1;
                }
            }
            else if ( ((LA5_0>=ABORT && LA5_0<=FROM)||(LA5_0>=GROUP && LA5_0<=IMMEDIATE)||(LA5_0>=INDEX && LA5_0<=IS)||(LA5_0>=JOIN && LA5_0<=LEFT)||LA5_0==LIMIT||LA5_0==NATURAL||(LA5_0>=NULL && LA5_0<=REFERENCES)||(LA5_0>=REINDEX && LA5_0<=WHERE)) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==DOT) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // SqlParser.g:94:24: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_qualified_table_name368);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT32=(Token)match(input,DOT,FOLLOW_DOT_in_qualified_table_name370); 
                    DOT32_tree = (Object)adaptor.create(DOT32);
                    adaptor.addChild(root_0, DOT32_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_qualified_table_name376);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:94:61: ( INDEXED BY index_name= id | NOT INDEXED )?
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==INDEXED) ) {
                alt6=1;
            }
            else if ( (LA6_0==NOT) ) {
                alt6=2;
            }
            switch (alt6) {
                case 1 :
                    // SqlParser.g:94:62: INDEXED BY index_name= id
                    {
                    INDEXED33=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_qualified_table_name379); 
                    INDEXED33_tree = (Object)adaptor.create(INDEXED33);
                    adaptor.addChild(root_0, INDEXED33_tree);

                    BY34=(Token)match(input,BY,FOLLOW_BY_in_qualified_table_name381); 
                    BY34_tree = (Object)adaptor.create(BY34);
                    adaptor.addChild(root_0, BY34_tree);

                    pushFollow(FOLLOW_id_in_qualified_table_name385);
                    index_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, index_name.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:94:89: NOT INDEXED
                    {
                    NOT35=(Token)match(input,NOT,FOLLOW_NOT_in_qualified_table_name389); 
                    NOT35_tree = (Object)adaptor.create(NOT35);
                    adaptor.addChild(root_0, NOT35_tree);

                    INDEXED36=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_qualified_table_name391); 
                    INDEXED36_tree = (Object)adaptor.create(INDEXED36);
                    adaptor.addChild(root_0, INDEXED36_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "qualified_table_name"

    public static class signed_number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "signed_number"
    // SqlParser.g:96:1: signed_number : ( PLUS | MINUS )? ( INTEGER | FLOAT ) ;
    public final SqlParser.signed_number_return signed_number() throws RecognitionException {
        SqlParser.signed_number_return retval = new SqlParser.signed_number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set37=null;
        Token set38=null;

        Object set37_tree=null;
        Object set38_tree=null;

        try {
            // SqlParser.g:96:14: ( ( PLUS | MINUS )? ( INTEGER | FLOAT ) )
            // SqlParser.g:96:16: ( PLUS | MINUS )? ( INTEGER | FLOAT )
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:96:16: ( PLUS | MINUS )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=PLUS && LA7_0<=MINUS)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // SqlParser.g:
                    {
                    set37=(Token)input.LT(1);
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set37));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            set38=(Token)input.LT(1);
            if ( input.LA(1)==INTEGER||input.LA(1)==FLOAT ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set38));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "signed_number"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // SqlParser.g:98:1: expr : or_subexpr ( OR or_subexpr )* ;
    public final SqlParser.expr_return expr() throws RecognitionException {
        SqlParser.expr_return retval = new SqlParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR40=null;
        SqlParser.or_subexpr_return or_subexpr39 = null;

        SqlParser.or_subexpr_return or_subexpr41 = null;


        Object OR40_tree=null;

        try {
            // SqlParser.g:98:5: ( or_subexpr ( OR or_subexpr )* )
            // SqlParser.g:98:7: or_subexpr ( OR or_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_or_subexpr_in_expr422);
            or_subexpr39=or_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, or_subexpr39.getTree());
            // SqlParser.g:98:18: ( OR or_subexpr )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // SqlParser.g:98:19: OR or_subexpr
            	    {
            	    OR40=(Token)match(input,OR,FOLLOW_OR_in_expr425); 
            	    OR40_tree = (Object)adaptor.create(OR40);
            	    root_0 = (Object)adaptor.becomeRoot(OR40_tree, root_0);

            	    pushFollow(FOLLOW_or_subexpr_in_expr428);
            	    or_subexpr41=or_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, or_subexpr41.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class or_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "or_subexpr"
    // SqlParser.g:100:1: or_subexpr : and_subexpr ( AND and_subexpr )* ;
    public final SqlParser.or_subexpr_return or_subexpr() throws RecognitionException {
        SqlParser.or_subexpr_return retval = new SqlParser.or_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND43=null;
        SqlParser.and_subexpr_return and_subexpr42 = null;

        SqlParser.and_subexpr_return and_subexpr44 = null;


        Object AND43_tree=null;

        try {
            // SqlParser.g:100:11: ( and_subexpr ( AND and_subexpr )* )
            // SqlParser.g:100:13: and_subexpr ( AND and_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_and_subexpr_in_or_subexpr437);
            and_subexpr42=and_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, and_subexpr42.getTree());
            // SqlParser.g:100:25: ( AND and_subexpr )*
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // SqlParser.g:100:26: AND and_subexpr
            	    {
            	    AND43=(Token)match(input,AND,FOLLOW_AND_in_or_subexpr440); 
            	    AND43_tree = (Object)adaptor.create(AND43);
            	    root_0 = (Object)adaptor.becomeRoot(AND43_tree, root_0);

            	    pushFollow(FOLLOW_and_subexpr_in_or_subexpr443);
            	    and_subexpr44=and_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, and_subexpr44.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "or_subexpr"

    public static class and_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "and_subexpr"
    // SqlParser.g:102:1: and_subexpr : eq_subexpr ( cond_expr )? ;
    public final SqlParser.and_subexpr_return and_subexpr() throws RecognitionException {
        SqlParser.and_subexpr_return retval = new SqlParser.and_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.eq_subexpr_return eq_subexpr45 = null;

        SqlParser.cond_expr_return cond_expr46 = null;



        try {
            // SqlParser.g:102:12: ( eq_subexpr ( cond_expr )? )
            // SqlParser.g:102:14: eq_subexpr ( cond_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_eq_subexpr_in_and_subexpr452);
            eq_subexpr45=eq_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, eq_subexpr45.getTree());
            // SqlParser.g:102:34: ( cond_expr )?
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // SqlParser.g:102:34: cond_expr
                    {
                    pushFollow(FOLLOW_cond_expr_in_and_subexpr454);
                    cond_expr46=cond_expr();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(cond_expr46.getTree(), root_0);

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "and_subexpr"

    public static class cond_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cond_expr"
    // SqlParser.g:104:1: cond_expr : ( ( NOT )? match_op match_expr= eq_subexpr ( ESCAPE escape_expr= eq_subexpr )? -> ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? ) | ( NOT )? IN LPAREN expr ( COMMA expr )* RPAREN -> ^( IN_VALUES ( NOT )? ^( IN ( expr )+ ) ) | ( NOT )? IN (database_name= id DOT )? table_name= id -> ^( IN_TABLE ( NOT )? ^( IN ^( $table_name ( $database_name)? ) ) ) | ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL ) | ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr -> ^( BETWEEN ( NOT )? ^( AND $e1 $e2) ) | ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )+ );
    public final SqlParser.cond_expr_return cond_expr() throws RecognitionException {
        SqlParser.cond_expr_return retval = new SqlParser.cond_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT47=null;
        Token ESCAPE49=null;
        Token NOT50=null;
        Token IN51=null;
        Token LPAREN52=null;
        Token COMMA54=null;
        Token RPAREN56=null;
        Token NOT57=null;
        Token IN58=null;
        Token DOT59=null;
        Token ISNULL60=null;
        Token NOTNULL61=null;
        Token IS62=null;
        Token NULL63=null;
        Token NOT64=null;
        Token NULL65=null;
        Token IS66=null;
        Token NOT67=null;
        Token NULL68=null;
        Token NOT69=null;
        Token BETWEEN70=null;
        Token AND71=null;
        Token set72=null;
        SqlParser.eq_subexpr_return match_expr = null;

        SqlParser.eq_subexpr_return escape_expr = null;

        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.eq_subexpr_return e1 = null;

        SqlParser.eq_subexpr_return e2 = null;

        SqlParser.match_op_return match_op48 = null;

        SqlParser.expr_return expr53 = null;

        SqlParser.expr_return expr55 = null;

        SqlParser.eq_subexpr_return eq_subexpr73 = null;


        Object NOT47_tree=null;
        Object ESCAPE49_tree=null;
        Object NOT50_tree=null;
        Object IN51_tree=null;
        Object LPAREN52_tree=null;
        Object COMMA54_tree=null;
        Object RPAREN56_tree=null;
        Object NOT57_tree=null;
        Object IN58_tree=null;
        Object DOT59_tree=null;
        Object ISNULL60_tree=null;
        Object NOTNULL61_tree=null;
        Object IS62_tree=null;
        Object NULL63_tree=null;
        Object NOT64_tree=null;
        Object NULL65_tree=null;
        Object IS66_tree=null;
        Object NOT67_tree=null;
        Object NULL68_tree=null;
        Object NOT69_tree=null;
        Object BETWEEN70_tree=null;
        Object AND71_tree=null;
        Object set72_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_ESCAPE=new RewriteRuleTokenStream(adaptor,"token ESCAPE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleTokenStream stream_ISNULL=new RewriteRuleTokenStream(adaptor,"token ISNULL");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_NOTNULL=new RewriteRuleTokenStream(adaptor,"token NOTNULL");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_BETWEEN=new RewriteRuleTokenStream(adaptor,"token BETWEEN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_match_op=new RewriteRuleSubtreeStream(adaptor,"rule match_op");
        RewriteRuleSubtreeStream stream_eq_subexpr=new RewriteRuleSubtreeStream(adaptor,"rule eq_subexpr");
        try {
            // SqlParser.g:105:3: ( ( NOT )? match_op match_expr= eq_subexpr ( ESCAPE escape_expr= eq_subexpr )? -> ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? ) | ( NOT )? IN LPAREN expr ( COMMA expr )* RPAREN -> ^( IN_VALUES ( NOT )? ^( IN ( expr )+ ) ) | ( NOT )? IN (database_name= id DOT )? table_name= id -> ^( IN_TABLE ( NOT )? ^( IN ^( $table_name ( $database_name)? ) ) ) | ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL ) | ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr -> ^( BETWEEN ( NOT )? ^( AND $e1 $e2) ) | ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )+ )
            int alt20=6;
            switch ( input.LA(1) ) {
            case NOT:
                {
                switch ( input.LA(2) ) {
                case NULL:
                    {
                    alt20=4;
                    }
                    break;
                case IN:
                    {
                    int LA20_3 = input.LA(3);

                    if ( (LA20_3==LPAREN) ) {
                        alt20=2;
                    }
                    else if ( ((LA20_3>=ABORT && LA20_3<=FROM)||(LA20_3>=GROUP && LA20_3<=IMMEDIATE)||(LA20_3>=INDEX && LA20_3<=IS)||(LA20_3>=JOIN && LA20_3<=LEFT)||LA20_3==LIMIT||LA20_3==NATURAL||(LA20_3>=NULL && LA20_3<=REFERENCES)||(LA20_3>=REINDEX && LA20_3<=WHERE)||LA20_3==ID) ) {
                        alt20=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case BETWEEN:
                    {
                    alt20=5;
                    }
                    break;
                case GLOB:
                case LIKE:
                case MATCH:
                case REGEXP:
                    {
                    alt20=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }

                }
                break;
            case GLOB:
            case LIKE:
            case MATCH:
            case REGEXP:
                {
                alt20=1;
                }
                break;
            case IN:
                {
                int LA20_3 = input.LA(2);

                if ( (LA20_3==LPAREN) ) {
                    alt20=2;
                }
                else if ( ((LA20_3>=ABORT && LA20_3<=FROM)||(LA20_3>=GROUP && LA20_3<=IMMEDIATE)||(LA20_3>=INDEX && LA20_3<=IS)||(LA20_3>=JOIN && LA20_3<=LEFT)||LA20_3==LIMIT||LA20_3==NATURAL||(LA20_3>=NULL && LA20_3<=REFERENCES)||(LA20_3>=REINDEX && LA20_3<=WHERE)||LA20_3==ID) ) {
                    alt20=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 3, input);

                    throw nvae;
                }
                }
                break;
            case IS:
            case ISNULL:
            case NOTNULL:
                {
                alt20=4;
                }
                break;
            case BETWEEN:
                {
                alt20=5;
                }
                break;
            case EQUALS:
            case EQUALS2:
            case NOT_EQUALS:
            case NOT_EQUALS2:
                {
                alt20=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // SqlParser.g:105:5: ( NOT )? match_op match_expr= eq_subexpr ( ESCAPE escape_expr= eq_subexpr )?
                    {
                    // SqlParser.g:105:5: ( NOT )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==NOT) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // SqlParser.g:105:5: NOT
                            {
                            NOT47=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr466);  
                            stream_NOT.add(NOT47);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_match_op_in_cond_expr469);
                    match_op48=match_op();

                    state._fsp--;

                    stream_match_op.add(match_op48.getTree());
                    pushFollow(FOLLOW_eq_subexpr_in_cond_expr473);
                    match_expr=eq_subexpr();

                    state._fsp--;

                    stream_eq_subexpr.add(match_expr.getTree());
                    // SqlParser.g:105:41: ( ESCAPE escape_expr= eq_subexpr )?
                    int alt12=2;
                    alt12 = dfa12.predict(input);
                    switch (alt12) {
                        case 1 :
                            // SqlParser.g:105:42: ESCAPE escape_expr= eq_subexpr
                            {
                            ESCAPE49=(Token)match(input,ESCAPE,FOLLOW_ESCAPE_in_cond_expr476);  
                            stream_ESCAPE.add(ESCAPE49);

                            pushFollow(FOLLOW_eq_subexpr_in_cond_expr480);
                            escape_expr=eq_subexpr();

                            state._fsp--;

                            stream_eq_subexpr.add(escape_expr.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: match_op, escape_expr, NOT, match_expr, ESCAPE
                    // token labels: 
                    // rule labels: retval, match_expr, escape_expr
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_match_expr=new RewriteRuleSubtreeStream(adaptor,"rule match_expr",match_expr!=null?match_expr.tree:null);
                    RewriteRuleSubtreeStream stream_escape_expr=new RewriteRuleSubtreeStream(adaptor,"rule escape_expr",escape_expr!=null?escape_expr.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 105:74: -> ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? )
                    {
                        // SqlParser.g:105:77: ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_match_op.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_match_expr.nextTree());
                        // SqlParser.g:105:100: ( NOT )?
                        if ( stream_NOT.hasNext() ) {
                            adaptor.addChild(root_1, stream_NOT.nextNode());

                        }
                        stream_NOT.reset();
                        // SqlParser.g:105:105: ( ^( ESCAPE $escape_expr) )?
                        if ( stream_escape_expr.hasNext()||stream_ESCAPE.hasNext() ) {
                            // SqlParser.g:105:105: ^( ESCAPE $escape_expr)
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(stream_ESCAPE.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_escape_expr.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_escape_expr.reset();
                        stream_ESCAPE.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // SqlParser.g:106:5: ( NOT )? IN LPAREN expr ( COMMA expr )* RPAREN
                    {
                    // SqlParser.g:106:5: ( NOT )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==NOT) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // SqlParser.g:106:5: NOT
                            {
                            NOT50=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr508);  
                            stream_NOT.add(NOT50);


                            }
                            break;

                    }

                    IN51=(Token)match(input,IN,FOLLOW_IN_in_cond_expr511);  
                    stream_IN.add(IN51);

                    LPAREN52=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cond_expr513);  
                    stream_LPAREN.add(LPAREN52);

                    pushFollow(FOLLOW_expr_in_cond_expr515);
                    expr53=expr();

                    state._fsp--;

                    stream_expr.add(expr53.getTree());
                    // SqlParser.g:106:25: ( COMMA expr )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==COMMA) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // SqlParser.g:106:26: COMMA expr
                    	    {
                    	    COMMA54=(Token)match(input,COMMA,FOLLOW_COMMA_in_cond_expr518);  
                    	    stream_COMMA.add(COMMA54);

                    	    pushFollow(FOLLOW_expr_in_cond_expr520);
                    	    expr55=expr();

                    	    state._fsp--;

                    	    stream_expr.add(expr55.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    RPAREN56=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cond_expr524);  
                    stream_RPAREN.add(RPAREN56);



                    // AST REWRITE
                    // elements: IN, expr, NOT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 106:46: -> ^( IN_VALUES ( NOT )? ^( IN ( expr )+ ) )
                    {
                        // SqlParser.g:106:49: ^( IN_VALUES ( NOT )? ^( IN ( expr )+ ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN_VALUES, "IN_VALUES"), root_1);

                        // SqlParser.g:106:61: ( NOT )?
                        if ( stream_NOT.hasNext() ) {
                            adaptor.addChild(root_1, stream_NOT.nextNode());

                        }
                        stream_NOT.reset();
                        // SqlParser.g:106:66: ^( IN ( expr )+ )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_IN.nextNode(), root_2);

                        if ( !(stream_expr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_2, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // SqlParser.g:107:5: ( NOT )? IN (database_name= id DOT )? table_name= id
                    {
                    // SqlParser.g:107:5: ( NOT )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==NOT) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // SqlParser.g:107:5: NOT
                            {
                            NOT57=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr546);  
                            stream_NOT.add(NOT57);


                            }
                            break;

                    }

                    IN58=(Token)match(input,IN,FOLLOW_IN_in_cond_expr549);  
                    stream_IN.add(IN58);

                    // SqlParser.g:107:13: (database_name= id DOT )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==ID) ) {
                        int LA16_1 = input.LA(2);

                        if ( (LA16_1==DOT) ) {
                            alt16=1;
                        }
                    }
                    else if ( ((LA16_0>=ABORT && LA16_0<=FROM)||(LA16_0>=GROUP && LA16_0<=IMMEDIATE)||(LA16_0>=INDEX && LA16_0<=IS)||(LA16_0>=JOIN && LA16_0<=LEFT)||LA16_0==LIMIT||LA16_0==NATURAL||(LA16_0>=NULL && LA16_0<=REFERENCES)||(LA16_0>=REINDEX && LA16_0<=WHERE)) ) {
                        int LA16_2 = input.LA(2);

                        if ( (LA16_2==DOT) ) {
                            alt16=1;
                        }
                    }
                    switch (alt16) {
                        case 1 :
                            // SqlParser.g:107:14: database_name= id DOT
                            {
                            pushFollow(FOLLOW_id_in_cond_expr554);
                            database_name=id();

                            state._fsp--;

                            stream_id.add(database_name.getTree());
                            DOT59=(Token)match(input,DOT,FOLLOW_DOT_in_cond_expr556);  
                            stream_DOT.add(DOT59);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_id_in_cond_expr562);
                    table_name=id();

                    state._fsp--;

                    stream_id.add(table_name.getTree());


                    // AST REWRITE
                    // elements: database_name, IN, table_name, NOT
                    // token labels: 
                    // rule labels: database_name, retval, table_name
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 107:51: -> ^( IN_TABLE ( NOT )? ^( IN ^( $table_name ( $database_name)? ) ) )
                    {
                        // SqlParser.g:107:54: ^( IN_TABLE ( NOT )? ^( IN ^( $table_name ( $database_name)? ) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN_TABLE, "IN_TABLE"), root_1);

                        // SqlParser.g:107:65: ( NOT )?
                        if ( stream_NOT.hasNext() ) {
                            adaptor.addChild(root_1, stream_NOT.nextNode());

                        }
                        stream_NOT.reset();
                        // SqlParser.g:107:70: ^( IN ^( $table_name ( $database_name)? ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_IN.nextNode(), root_2);

                        // SqlParser.g:107:75: ^( $table_name ( $database_name)? )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_3);

                        // SqlParser.g:107:89: ( $database_name)?
                        if ( stream_database_name.hasNext() ) {
                            adaptor.addChild(root_3, stream_database_name.nextTree());

                        }
                        stream_database_name.reset();

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // SqlParser.g:110:5: ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL )
                    {
                    // SqlParser.g:110:5: ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL )
                    int alt17=5;
                    switch ( input.LA(1) ) {
                    case ISNULL:
                        {
                        alt17=1;
                        }
                        break;
                    case NOTNULL:
                        {
                        alt17=2;
                        }
                        break;
                    case IS:
                        {
                        int LA17_3 = input.LA(2);

                        if ( (LA17_3==NULL) ) {
                            alt17=3;
                        }
                        else if ( (LA17_3==NOT) ) {
                            alt17=5;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case NOT:
                        {
                        alt17=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }

                    switch (alt17) {
                        case 1 :
                            // SqlParser.g:110:6: ISNULL
                            {
                            ISNULL60=(Token)match(input,ISNULL,FOLLOW_ISNULL_in_cond_expr593);  
                            stream_ISNULL.add(ISNULL60);



                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 110:13: -> IS_NULL
                            {
                                adaptor.addChild(root_0, (Object)adaptor.create(IS_NULL, "IS_NULL"));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 2 :
                            // SqlParser.g:110:26: NOTNULL
                            {
                            NOTNULL61=(Token)match(input,NOTNULL,FOLLOW_NOTNULL_in_cond_expr601);  
                            stream_NOTNULL.add(NOTNULL61);



                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 110:34: -> NOT_NULL
                            {
                                adaptor.addChild(root_0, (Object)adaptor.create(NOT_NULL, "NOT_NULL"));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 3 :
                            // SqlParser.g:110:48: IS NULL
                            {
                            IS62=(Token)match(input,IS,FOLLOW_IS_in_cond_expr609);  
                            stream_IS.add(IS62);

                            NULL63=(Token)match(input,NULL,FOLLOW_NULL_in_cond_expr611);  
                            stream_NULL.add(NULL63);



                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 110:56: -> IS_NULL
                            {
                                adaptor.addChild(root_0, (Object)adaptor.create(IS_NULL, "IS_NULL"));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 4 :
                            // SqlParser.g:110:69: NOT NULL
                            {
                            NOT64=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr619);  
                            stream_NOT.add(NOT64);

                            NULL65=(Token)match(input,NULL,FOLLOW_NULL_in_cond_expr621);  
                            stream_NULL.add(NULL65);



                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 110:78: -> NOT_NULL
                            {
                                adaptor.addChild(root_0, (Object)adaptor.create(NOT_NULL, "NOT_NULL"));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 5 :
                            // SqlParser.g:110:92: IS NOT NULL
                            {
                            IS66=(Token)match(input,IS,FOLLOW_IS_in_cond_expr629);  
                            stream_IS.add(IS66);

                            NOT67=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr631);  
                            stream_NOT.add(NOT67);

                            NULL68=(Token)match(input,NULL,FOLLOW_NULL_in_cond_expr633);  
                            stream_NULL.add(NULL68);



                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 110:104: -> NOT_NULL
                            {
                                adaptor.addChild(root_0, (Object)adaptor.create(NOT_NULL, "NOT_NULL"));

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // SqlParser.g:111:5: ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr
                    {
                    // SqlParser.g:111:5: ( NOT )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NOT) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // SqlParser.g:111:5: NOT
                            {
                            NOT69=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr644);  
                            stream_NOT.add(NOT69);


                            }
                            break;

                    }

                    BETWEEN70=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_cond_expr647);  
                    stream_BETWEEN.add(BETWEEN70);

                    pushFollow(FOLLOW_eq_subexpr_in_cond_expr651);
                    e1=eq_subexpr();

                    state._fsp--;

                    stream_eq_subexpr.add(e1.getTree());
                    AND71=(Token)match(input,AND,FOLLOW_AND_in_cond_expr653);  
                    stream_AND.add(AND71);

                    pushFollow(FOLLOW_eq_subexpr_in_cond_expr657);
                    e2=eq_subexpr();

                    state._fsp--;

                    stream_eq_subexpr.add(e2.getTree());


                    // AST REWRITE
                    // elements: NOT, BETWEEN, e1, AND, e2
                    // token labels: 
                    // rule labels: retval, e1, e2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);
                    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 111:50: -> ^( BETWEEN ( NOT )? ^( AND $e1 $e2) )
                    {
                        // SqlParser.g:111:53: ^( BETWEEN ( NOT )? ^( AND $e1 $e2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_BETWEEN.nextNode(), root_1);

                        // SqlParser.g:111:63: ( NOT )?
                        if ( stream_NOT.hasNext() ) {
                            adaptor.addChild(root_1, stream_NOT.nextNode());

                        }
                        stream_NOT.reset();
                        // SqlParser.g:111:68: ^( AND $e1 $e2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_e1.nextTree());
                        adaptor.addChild(root_2, stream_e2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // SqlParser.g:112:5: ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )+
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:112:5: ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>=EQUALS && LA19_0<=NOT_EQUALS2)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // SqlParser.g:112:6: ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr
                    	    {
                    	    set72=(Token)input.LT(1);
                    	    set72=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=EQUALS && input.LA(1)<=NOT_EQUALS2) ) {
                    	        input.consume();
                    	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set72), root_0);
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_eq_subexpr_in_cond_expr700);
                    	    eq_subexpr73=eq_subexpr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, eq_subexpr73.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cond_expr"

    public static class match_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "match_op"
    // SqlParser.g:115:1: match_op : ( LIKE | GLOB | REGEXP | MATCH );
    public final SqlParser.match_op_return match_op() throws RecognitionException {
        SqlParser.match_op_return retval = new SqlParser.match_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set74=null;

        Object set74_tree=null;

        try {
            // SqlParser.g:115:9: ( LIKE | GLOB | REGEXP | MATCH )
            // SqlParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set74=(Token)input.LT(1);
            if ( input.LA(1)==GLOB||input.LA(1)==LIKE||input.LA(1)==MATCH||input.LA(1)==REGEXP ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set74));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "match_op"

    public static class eq_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eq_subexpr"
    // SqlParser.g:117:1: eq_subexpr : neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )* ;
    public final SqlParser.eq_subexpr_return eq_subexpr() throws RecognitionException {
        SqlParser.eq_subexpr_return retval = new SqlParser.eq_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set76=null;
        SqlParser.neq_subexpr_return neq_subexpr75 = null;

        SqlParser.neq_subexpr_return neq_subexpr77 = null;


        Object set76_tree=null;

        try {
            // SqlParser.g:117:11: ( neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )* )
            // SqlParser.g:117:13: neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_neq_subexpr_in_eq_subexpr733);
            neq_subexpr75=neq_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, neq_subexpr75.getTree());
            // SqlParser.g:117:25: ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=LESS && LA21_0<=GREATER_OR_EQ)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // SqlParser.g:117:26: ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr
            	    {
            	    set76=(Token)input.LT(1);
            	    set76=(Token)input.LT(1);
            	    if ( (input.LA(1)>=LESS && input.LA(1)<=GREATER_OR_EQ) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set76), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_neq_subexpr_in_eq_subexpr753);
            	    neq_subexpr77=neq_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, neq_subexpr77.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "eq_subexpr"

    public static class neq_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "neq_subexpr"
    // SqlParser.g:119:1: neq_subexpr : bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )* ;
    public final SqlParser.neq_subexpr_return neq_subexpr() throws RecognitionException {
        SqlParser.neq_subexpr_return retval = new SqlParser.neq_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set79=null;
        SqlParser.bit_subexpr_return bit_subexpr78 = null;

        SqlParser.bit_subexpr_return bit_subexpr80 = null;


        Object set79_tree=null;

        try {
            // SqlParser.g:119:12: ( bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )* )
            // SqlParser.g:119:14: bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bit_subexpr_in_neq_subexpr762);
            bit_subexpr78=bit_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, bit_subexpr78.getTree());
            // SqlParser.g:119:26: ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=SHIFT_LEFT && LA22_0<=PIPE)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // SqlParser.g:119:27: ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr
            	    {
            	    set79=(Token)input.LT(1);
            	    set79=(Token)input.LT(1);
            	    if ( (input.LA(1)>=SHIFT_LEFT && input.LA(1)<=PIPE) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set79), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_bit_subexpr_in_neq_subexpr782);
            	    bit_subexpr80=bit_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bit_subexpr80.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "neq_subexpr"

    public static class bit_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bit_subexpr"
    // SqlParser.g:121:1: bit_subexpr : add_subexpr ( ( PLUS | MINUS ) add_subexpr )* ;
    public final SqlParser.bit_subexpr_return bit_subexpr() throws RecognitionException {
        SqlParser.bit_subexpr_return retval = new SqlParser.bit_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set82=null;
        SqlParser.add_subexpr_return add_subexpr81 = null;

        SqlParser.add_subexpr_return add_subexpr83 = null;


        Object set82_tree=null;

        try {
            // SqlParser.g:121:12: ( add_subexpr ( ( PLUS | MINUS ) add_subexpr )* )
            // SqlParser.g:121:14: add_subexpr ( ( PLUS | MINUS ) add_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_subexpr_in_bit_subexpr791);
            add_subexpr81=add_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, add_subexpr81.getTree());
            // SqlParser.g:121:26: ( ( PLUS | MINUS ) add_subexpr )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=PLUS && LA23_0<=MINUS)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // SqlParser.g:121:27: ( PLUS | MINUS ) add_subexpr
            	    {
            	    set82=(Token)input.LT(1);
            	    set82=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set82), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_add_subexpr_in_bit_subexpr803);
            	    add_subexpr83=add_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, add_subexpr83.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bit_subexpr"

    public static class add_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add_subexpr"
    // SqlParser.g:123:1: add_subexpr : mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )* ;
    public final SqlParser.add_subexpr_return add_subexpr() throws RecognitionException {
        SqlParser.add_subexpr_return retval = new SqlParser.add_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set85=null;
        SqlParser.mul_subexpr_return mul_subexpr84 = null;

        SqlParser.mul_subexpr_return mul_subexpr86 = null;


        Object set85_tree=null;

        try {
            // SqlParser.g:123:12: ( mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )* )
            // SqlParser.g:123:14: mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mul_subexpr_in_add_subexpr812);
            mul_subexpr84=mul_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, mul_subexpr84.getTree());
            // SqlParser.g:123:26: ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=ASTERISK && LA24_0<=PERCENT)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // SqlParser.g:123:27: ( ASTERISK | SLASH | PERCENT ) mul_subexpr
            	    {
            	    set85=(Token)input.LT(1);
            	    set85=(Token)input.LT(1);
            	    if ( (input.LA(1)>=ASTERISK && input.LA(1)<=PERCENT) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set85), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mul_subexpr_in_add_subexpr828);
            	    mul_subexpr86=mul_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mul_subexpr86.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "add_subexpr"

    public static class mul_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mul_subexpr"
    // SqlParser.g:125:1: mul_subexpr : con_subexpr ( DOUBLE_PIPE con_subexpr )* ;
    public final SqlParser.mul_subexpr_return mul_subexpr() throws RecognitionException {
        SqlParser.mul_subexpr_return retval = new SqlParser.mul_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOUBLE_PIPE88=null;
        SqlParser.con_subexpr_return con_subexpr87 = null;

        SqlParser.con_subexpr_return con_subexpr89 = null;


        Object DOUBLE_PIPE88_tree=null;

        try {
            // SqlParser.g:125:12: ( con_subexpr ( DOUBLE_PIPE con_subexpr )* )
            // SqlParser.g:125:14: con_subexpr ( DOUBLE_PIPE con_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_con_subexpr_in_mul_subexpr837);
            con_subexpr87=con_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, con_subexpr87.getTree());
            // SqlParser.g:125:26: ( DOUBLE_PIPE con_subexpr )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==DOUBLE_PIPE) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // SqlParser.g:125:27: DOUBLE_PIPE con_subexpr
            	    {
            	    DOUBLE_PIPE88=(Token)match(input,DOUBLE_PIPE,FOLLOW_DOUBLE_PIPE_in_mul_subexpr840); 
            	    DOUBLE_PIPE88_tree = (Object)adaptor.create(DOUBLE_PIPE88);
            	    root_0 = (Object)adaptor.becomeRoot(DOUBLE_PIPE88_tree, root_0);

            	    pushFollow(FOLLOW_con_subexpr_in_mul_subexpr843);
            	    con_subexpr89=con_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, con_subexpr89.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mul_subexpr"

    public static class con_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "con_subexpr"
    // SqlParser.g:127:1: con_subexpr : ( PLUS | MINUS | TILDA | NOT )? unary_subexpr ;
    public final SqlParser.con_subexpr_return con_subexpr() throws RecognitionException {
        SqlParser.con_subexpr_return retval = new SqlParser.con_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set90=null;
        SqlParser.unary_subexpr_return unary_subexpr91 = null;


        Object set90_tree=null;

        try {
            // SqlParser.g:127:12: ( ( PLUS | MINUS | TILDA | NOT )? unary_subexpr )
            // SqlParser.g:127:14: ( PLUS | MINUS | TILDA | NOT )? unary_subexpr
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:127:14: ( PLUS | MINUS | TILDA | NOT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=PLUS && LA26_0<=TILDA)||LA26_0==NOT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // SqlParser.g:
                    {
                    set90=(Token)input.LT(1);
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=TILDA)||input.LA(1)==NOT ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set90));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_unary_subexpr_in_con_subexpr869);
            unary_subexpr91=unary_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, unary_subexpr91.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "con_subexpr"

    public static class unary_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_subexpr"
    // SqlParser.g:129:1: unary_subexpr : atom_expr ( COLLATE collation_name= ID )? ;
    public final SqlParser.unary_subexpr_return unary_subexpr() throws RecognitionException {
        SqlParser.unary_subexpr_return retval = new SqlParser.unary_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token collation_name=null;
        Token COLLATE93=null;
        SqlParser.atom_expr_return atom_expr92 = null;


        Object collation_name_tree=null;
        Object COLLATE93_tree=null;

        try {
            // SqlParser.g:129:14: ( atom_expr ( COLLATE collation_name= ID )? )
            // SqlParser.g:129:16: atom_expr ( COLLATE collation_name= ID )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atom_expr_in_unary_subexpr876);
            atom_expr92=atom_expr();

            state._fsp--;

            adaptor.addChild(root_0, atom_expr92.getTree());
            // SqlParser.g:129:26: ( COLLATE collation_name= ID )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==COLLATE) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==ID) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // SqlParser.g:129:27: COLLATE collation_name= ID
                    {
                    COLLATE93=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_unary_subexpr879); 
                    COLLATE93_tree = (Object)adaptor.create(COLLATE93);
                    root_0 = (Object)adaptor.becomeRoot(COLLATE93_tree, root_0);

                    collation_name=(Token)match(input,ID,FOLLOW_ID_in_unary_subexpr884); 
                    collation_name_tree = (Object)adaptor.create(collation_name);
                    adaptor.addChild(root_0, collation_name_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unary_subexpr"

    public static class atom_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom_expr"
    // SqlParser.g:131:1: atom_expr : ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) | function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN | LPAREN expr RPAREN | CAST LPAREN expr AS type_name RPAREN | ( EXISTS )? LPAREN select_stmt RPAREN | CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END | raise_function );
    public final SqlParser.atom_expr_return atom_expr() throws RecognitionException {
        SqlParser.atom_expr_return retval = new SqlParser.atom_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token column_name=null;
        Token function_name=null;
        Token DOT96=null;
        Token DOT97=null;
        Token LPAREN98=null;
        Token DISTINCT99=null;
        Token COMMA100=null;
        Token ASTERISK101=null;
        Token RPAREN102=null;
        Token LPAREN103=null;
        Token RPAREN105=null;
        Token CAST106=null;
        Token LPAREN107=null;
        Token AS109=null;
        Token RPAREN111=null;
        Token EXISTS112=null;
        Token LPAREN113=null;
        Token RPAREN115=null;
        Token CASE116=null;
        Token WHEN118=null;
        Token THEN120=null;
        Token ELSE122=null;
        Token END124=null;
        List list_args=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.literal_value_return literal_value94 = null;

        SqlParser.bind_parameter_return bind_parameter95 = null;

        SqlParser.expr_return expr104 = null;

        SqlParser.expr_return expr108 = null;

        SqlParser.type_name_return type_name110 = null;

        SqlParser.select_stmt_return select_stmt114 = null;

        SqlParser.expr_return expr117 = null;

        SqlParser.expr_return expr119 = null;

        SqlParser.expr_return expr121 = null;

        SqlParser.expr_return expr123 = null;

        SqlParser.raise_function_return raise_function125 = null;

        SqlParser.expr_return args = null;
         args = null;
        Object column_name_tree=null;
        Object function_name_tree=null;
        Object DOT96_tree=null;
        Object DOT97_tree=null;
        Object LPAREN98_tree=null;
        Object DISTINCT99_tree=null;
        Object COMMA100_tree=null;
        Object ASTERISK101_tree=null;
        Object RPAREN102_tree=null;
        Object LPAREN103_tree=null;
        Object RPAREN105_tree=null;
        Object CAST106_tree=null;
        Object LPAREN107_tree=null;
        Object AS109_tree=null;
        Object RPAREN111_tree=null;
        Object EXISTS112_tree=null;
        Object LPAREN113_tree=null;
        Object RPAREN115_tree=null;
        Object CASE116_tree=null;
        Object WHEN118_tree=null;
        Object THEN120_tree=null;
        Object ELSE122_tree=null;
        Object END124_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // SqlParser.g:132:3: ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) | function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN | LPAREN expr RPAREN | CAST LPAREN expr AS type_name RPAREN | ( EXISTS )? LPAREN select_stmt RPAREN | CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END | raise_function )
            int alt37=9;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // SqlParser.g:132:5: literal_value
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_value_in_atom_expr896);
                    literal_value94=literal_value();

                    state._fsp--;

                    adaptor.addChild(root_0, literal_value94.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:133:5: bind_parameter
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_bind_parameter_in_atom_expr902);
                    bind_parameter95=bind_parameter();

                    state._fsp--;

                    adaptor.addChild(root_0, bind_parameter95.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:134:5: ( (database_name= id DOT )? table_name= id DOT )? column_name= ID
                    {
                    // SqlParser.g:134:5: ( (database_name= id DOT )? table_name= id DOT )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==ID) ) {
                        int LA29_1 = input.LA(2);

                        if ( (LA29_1==DOT) ) {
                            alt29=1;
                        }
                    }
                    else if ( ((LA29_0>=ABORT && LA29_0<=FROM)||(LA29_0>=GROUP && LA29_0<=IMMEDIATE)||(LA29_0>=INDEX && LA29_0<=IS)||(LA29_0>=JOIN && LA29_0<=LEFT)||LA29_0==LIMIT||LA29_0==NATURAL||(LA29_0>=NULL && LA29_0<=REFERENCES)||(LA29_0>=REINDEX && LA29_0<=WHERE)) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // SqlParser.g:134:6: (database_name= id DOT )? table_name= id DOT
                            {
                            // SqlParser.g:134:6: (database_name= id DOT )?
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0==ID) ) {
                                int LA28_1 = input.LA(2);

                                if ( (LA28_1==DOT) ) {
                                    int LA28_3 = input.LA(3);

                                    if ( (LA28_3==ID) ) {
                                        int LA28_4 = input.LA(4);

                                        if ( (LA28_4==DOT) ) {
                                            alt28=1;
                                        }
                                    }
                                    else if ( ((LA28_3>=ABORT && LA28_3<=FROM)||(LA28_3>=GROUP && LA28_3<=IMMEDIATE)||(LA28_3>=INDEX && LA28_3<=IS)||(LA28_3>=JOIN && LA28_3<=LEFT)||LA28_3==LIMIT||LA28_3==NATURAL||(LA28_3>=NULL && LA28_3<=REFERENCES)||(LA28_3>=REINDEX && LA28_3<=WHERE)) ) {
                                        alt28=1;
                                    }
                                }
                            }
                            else if ( ((LA28_0>=ABORT && LA28_0<=FROM)||(LA28_0>=GROUP && LA28_0<=IMMEDIATE)||(LA28_0>=INDEX && LA28_0<=IS)||(LA28_0>=JOIN && LA28_0<=LEFT)||LA28_0==LIMIT||LA28_0==NATURAL||(LA28_0>=NULL && LA28_0<=REFERENCES)||(LA28_0>=REINDEX && LA28_0<=WHERE)) ) {
                                int LA28_2 = input.LA(2);

                                if ( (LA28_2==DOT) ) {
                                    int LA28_3 = input.LA(3);

                                    if ( (LA28_3==ID) ) {
                                        int LA28_4 = input.LA(4);

                                        if ( (LA28_4==DOT) ) {
                                            alt28=1;
                                        }
                                    }
                                    else if ( ((LA28_3>=ABORT && LA28_3<=FROM)||(LA28_3>=GROUP && LA28_3<=IMMEDIATE)||(LA28_3>=INDEX && LA28_3<=IS)||(LA28_3>=JOIN && LA28_3<=LEFT)||LA28_3==LIMIT||LA28_3==NATURAL||(LA28_3>=NULL && LA28_3<=REFERENCES)||(LA28_3>=REINDEX && LA28_3<=WHERE)) ) {
                                        alt28=1;
                                    }
                                }
                            }
                            switch (alt28) {
                                case 1 :
                                    // SqlParser.g:134:7: database_name= id DOT
                                    {
                                    pushFollow(FOLLOW_id_in_atom_expr912);
                                    database_name=id();

                                    state._fsp--;

                                    stream_id.add(database_name.getTree());
                                    DOT96=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expr914);  
                                    stream_DOT.add(DOT96);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_id_in_atom_expr920);
                            table_name=id();

                            state._fsp--;

                            stream_id.add(table_name.getTree());
                            DOT97=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expr922);  
                            stream_DOT.add(DOT97);


                            }
                            break;

                    }

                    column_name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr928);  
                    stream_ID.add(column_name);



                    // AST REWRITE
                    // elements: database_name, table_name, column_name
                    // token labels: column_name
                    // rule labels: database_name, retval, table_name
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_column_name=new RewriteRuleTokenStream(adaptor,"token column_name",column_name);
                    RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 134:65: -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) )
                    {
                        // SqlParser.g:134:68: ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMN_EXPRESSION, "COLUMN_EXPRESSION"), root_1);

                        // SqlParser.g:134:88: ^( $column_name ( ^( $table_name ( $database_name)? ) )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_column_name.nextNode(), root_2);

                        // SqlParser.g:134:103: ( ^( $table_name ( $database_name)? ) )?
                        if ( stream_database_name.hasNext()||stream_table_name.hasNext() ) {
                            // SqlParser.g:134:103: ^( $table_name ( $database_name)? )
                            {
                            Object root_3 = (Object)adaptor.nil();
                            root_3 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_3);

                            // SqlParser.g:134:117: ( $database_name)?
                            if ( stream_database_name.hasNext() ) {
                                adaptor.addChild(root_3, stream_database_name.nextTree());

                            }
                            stream_database_name.reset();

                            adaptor.addChild(root_2, root_3);
                            }

                        }
                        stream_database_name.reset();
                        stream_table_name.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // SqlParser.g:135:5: function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    function_name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr957); 
                    function_name_tree = (Object)adaptor.create(function_name);
                    adaptor.addChild(root_0, function_name_tree);

                    LPAREN98=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr959); 
                    LPAREN98_tree = (Object)adaptor.create(LPAREN98);
                    adaptor.addChild(root_0, LPAREN98_tree);

                    // SqlParser.g:135:29: ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )?
                    int alt32=3;
                    int LA32_0 = input.LA(1);

                    if ( ((LA32_0>=PLUS && LA32_0<=TILDA)||LA32_0==LPAREN||(LA32_0>=QUESTION && LA32_0<=AT)||(LA32_0>=ABORT && LA32_0<=FROM)||(LA32_0>=GROUP && LA32_0<=IMMEDIATE)||(LA32_0>=INDEX && LA32_0<=IS)||(LA32_0>=JOIN && LA32_0<=LEFT)||LA32_0==LIMIT||(LA32_0>=NATURAL && LA32_0<=NOT)||(LA32_0>=NULL && LA32_0<=REFERENCES)||(LA32_0>=REINDEX && LA32_0<=WHERE)||(LA32_0>=ID && LA32_0<=INTEGER)||(LA32_0>=FLOAT && LA32_0<=BLOB)) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==ASTERISK) ) {
                        alt32=2;
                    }
                    switch (alt32) {
                        case 1 :
                            // SqlParser.g:135:30: ( DISTINCT )? args+= expr ( COMMA args+= expr )*
                            {
                            // SqlParser.g:135:30: ( DISTINCT )?
                            int alt30=2;
                            int LA30_0 = input.LA(1);

                            if ( (LA30_0==DISTINCT) ) {
                                int LA30_1 = input.LA(2);

                                if ( ((LA30_1>=PLUS && LA30_1<=TILDA)||LA30_1==LPAREN||(LA30_1>=QUESTION && LA30_1<=AT)||(LA30_1>=ABORT && LA30_1<=FROM)||(LA30_1>=GROUP && LA30_1<=IMMEDIATE)||(LA30_1>=INDEX && LA30_1<=IS)||(LA30_1>=JOIN && LA30_1<=LEFT)||LA30_1==LIMIT||(LA30_1>=NATURAL && LA30_1<=NOT)||(LA30_1>=NULL && LA30_1<=REFERENCES)||(LA30_1>=REINDEX && LA30_1<=WHERE)||(LA30_1>=ID && LA30_1<=INTEGER)||(LA30_1>=FLOAT && LA30_1<=BLOB)) ) {
                                    alt30=1;
                                }
                            }
                            switch (alt30) {
                                case 1 :
                                    // SqlParser.g:135:31: DISTINCT
                                    {
                                    DISTINCT99=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_atom_expr963); 
                                    DISTINCT99_tree = (Object)adaptor.create(DISTINCT99);
                                    adaptor.addChild(root_0, DISTINCT99_tree);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_expr_in_atom_expr969);
                            args=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, args.getTree());
                            if (list_args==null) list_args=new ArrayList();
                            list_args.add(args.getTree());

                            // SqlParser.g:135:53: ( COMMA args+= expr )*
                            loop31:
                            do {
                                int alt31=2;
                                int LA31_0 = input.LA(1);

                                if ( (LA31_0==COMMA) ) {
                                    alt31=1;
                                }


                                switch (alt31) {
                            	case 1 :
                            	    // SqlParser.g:135:54: COMMA args+= expr
                            	    {
                            	    COMMA100=(Token)match(input,COMMA,FOLLOW_COMMA_in_atom_expr972); 
                            	    COMMA100_tree = (Object)adaptor.create(COMMA100);
                            	    adaptor.addChild(root_0, COMMA100_tree);

                            	    pushFollow(FOLLOW_expr_in_atom_expr976);
                            	    args=expr();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, args.getTree());
                            	    if (list_args==null) list_args=new ArrayList();
                            	    list_args.add(args.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop31;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // SqlParser.g:135:75: ASTERISK
                            {
                            ASTERISK101=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_atom_expr982); 
                            ASTERISK101_tree = (Object)adaptor.create(ASTERISK101);
                            adaptor.addChild(root_0, ASTERISK101_tree);


                            }
                            break;

                    }

                    RPAREN102=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr986); 
                    RPAREN102_tree = (Object)adaptor.create(RPAREN102);
                    adaptor.addChild(root_0, RPAREN102_tree);


                    }
                    break;
                case 5 :
                    // SqlParser.g:136:5: LPAREN expr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN103=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr992); 
                    pushFollow(FOLLOW_expr_in_atom_expr995);
                    expr104=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr104.getTree());
                    RPAREN105=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr997); 

                    }
                    break;
                case 6 :
                    // SqlParser.g:137:5: CAST LPAREN expr AS type_name RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    CAST106=(Token)match(input,CAST,FOLLOW_CAST_in_atom_expr1004); 
                    CAST106_tree = (Object)adaptor.create(CAST106);
                    adaptor.addChild(root_0, CAST106_tree);

                    LPAREN107=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr1006); 
                    LPAREN107_tree = (Object)adaptor.create(LPAREN107);
                    adaptor.addChild(root_0, LPAREN107_tree);

                    pushFollow(FOLLOW_expr_in_atom_expr1008);
                    expr108=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr108.getTree());
                    AS109=(Token)match(input,AS,FOLLOW_AS_in_atom_expr1010); 
                    AS109_tree = (Object)adaptor.create(AS109);
                    adaptor.addChild(root_0, AS109_tree);

                    pushFollow(FOLLOW_type_name_in_atom_expr1012);
                    type_name110=type_name();

                    state._fsp--;

                    adaptor.addChild(root_0, type_name110.getTree());
                    RPAREN111=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr1014); 
                    RPAREN111_tree = (Object)adaptor.create(RPAREN111);
                    adaptor.addChild(root_0, RPAREN111_tree);


                    }
                    break;
                case 7 :
                    // SqlParser.g:138:5: ( EXISTS )? LPAREN select_stmt RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:138:5: ( EXISTS )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==EXISTS) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // SqlParser.g:138:53: EXISTS
                            {
                            EXISTS112=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_atom_expr1023); 
                            EXISTS112_tree = (Object)adaptor.create(EXISTS112);
                            adaptor.addChild(root_0, EXISTS112_tree);


                            }
                            break;

                    }

                    LPAREN113=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr1027); 
                    LPAREN113_tree = (Object)adaptor.create(LPAREN113);
                    adaptor.addChild(root_0, LPAREN113_tree);

                    pushFollow(FOLLOW_select_stmt_in_atom_expr1029);
                    select_stmt114=select_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, select_stmt114.getTree());
                    RPAREN115=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr1031); 
                    RPAREN115_tree = (Object)adaptor.create(RPAREN115);
                    adaptor.addChild(root_0, RPAREN115_tree);


                    }
                    break;
                case 8 :
                    // SqlParser.g:139:5: CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END
                    {
                    root_0 = (Object)adaptor.nil();

                    CASE116=(Token)match(input,CASE,FOLLOW_CASE_in_atom_expr1037); 
                    CASE116_tree = (Object)adaptor.create(CASE116);
                    adaptor.addChild(root_0, CASE116_tree);

                    // SqlParser.g:139:10: ( expr )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>=PLUS && LA34_0<=TILDA)||LA34_0==LPAREN||(LA34_0>=QUESTION && LA34_0<=AT)||(LA34_0>=ABORT && LA34_0<=FROM)||(LA34_0>=GROUP && LA34_0<=IMMEDIATE)||(LA34_0>=INDEX && LA34_0<=IS)||(LA34_0>=JOIN && LA34_0<=LEFT)||LA34_0==LIMIT||(LA34_0>=NATURAL && LA34_0<=NOT)||(LA34_0>=NULL && LA34_0<=REFERENCES)||(LA34_0>=REINDEX && LA34_0<=VIRTUAL)||LA34_0==WHERE||(LA34_0>=ID && LA34_0<=INTEGER)||(LA34_0>=FLOAT && LA34_0<=BLOB)) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==WHEN) ) {
                        int LA34_2 = input.LA(2);

                        if ( (LA34_2==DOT) ) {
                            alt34=1;
                        }
                    }
                    switch (alt34) {
                        case 1 :
                            // SqlParser.g:139:11: expr
                            {
                            pushFollow(FOLLOW_expr_in_atom_expr1040);
                            expr117=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr117.getTree());

                            }
                            break;

                    }

                    // SqlParser.g:139:18: ( WHEN expr THEN expr )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==WHEN) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // SqlParser.g:139:19: WHEN expr THEN expr
                    	    {
                    	    WHEN118=(Token)match(input,WHEN,FOLLOW_WHEN_in_atom_expr1045); 
                    	    WHEN118_tree = (Object)adaptor.create(WHEN118);
                    	    adaptor.addChild(root_0, WHEN118_tree);

                    	    pushFollow(FOLLOW_expr_in_atom_expr1047);
                    	    expr119=expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expr119.getTree());
                    	    THEN120=(Token)match(input,THEN,FOLLOW_THEN_in_atom_expr1049); 
                    	    THEN120_tree = (Object)adaptor.create(THEN120);
                    	    adaptor.addChild(root_0, THEN120_tree);

                    	    pushFollow(FOLLOW_expr_in_atom_expr1051);
                    	    expr121=expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expr121.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt35 >= 1 ) break loop35;
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);

                    // SqlParser.g:139:41: ( ELSE expr )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==ELSE) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // SqlParser.g:139:42: ELSE expr
                            {
                            ELSE122=(Token)match(input,ELSE,FOLLOW_ELSE_in_atom_expr1056); 
                            ELSE122_tree = (Object)adaptor.create(ELSE122);
                            adaptor.addChild(root_0, ELSE122_tree);

                            pushFollow(FOLLOW_expr_in_atom_expr1058);
                            expr123=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr123.getTree());

                            }
                            break;

                    }

                    END124=(Token)match(input,END,FOLLOW_END_in_atom_expr1062); 
                    END124_tree = (Object)adaptor.create(END124);
                    adaptor.addChild(root_0, END124_tree);


                    }
                    break;
                case 9 :
                    // SqlParser.g:140:5: raise_function
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_raise_function_in_atom_expr1068);
                    raise_function125=raise_function();

                    state._fsp--;

                    adaptor.addChild(root_0, raise_function125.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom_expr"

    public static class literal_value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal_value"
    // SqlParser.g:143:1: literal_value : ( INTEGER -> ^( INTEGER_LITERAL INTEGER ) | FLOAT -> ^( FLOAT_LITERAL FLOAT ) | STRING -> ^( STRING_LITERAL STRING ) | BLOB -> ^( BLOB_LITERAL BLOB ) | NULL | CURRENT_TIME -> ^( FUNCTION_LITERAL CURRENT_TIME ) | CURRENT_DATE -> ^( FUNCTION_LITERAL CURRENT_DATE ) | CURRENT_TIMESTAMP -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP ) );
    public final SqlParser.literal_value_return literal_value() throws RecognitionException {
        SqlParser.literal_value_return retval = new SqlParser.literal_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INTEGER126=null;
        Token FLOAT127=null;
        Token STRING128=null;
        Token BLOB129=null;
        Token NULL130=null;
        Token CURRENT_TIME131=null;
        Token CURRENT_DATE132=null;
        Token CURRENT_TIMESTAMP133=null;

        Object INTEGER126_tree=null;
        Object FLOAT127_tree=null;
        Object STRING128_tree=null;
        Object BLOB129_tree=null;
        Object NULL130_tree=null;
        Object CURRENT_TIME131_tree=null;
        Object CURRENT_DATE132_tree=null;
        Object CURRENT_TIMESTAMP133_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_BLOB=new RewriteRuleTokenStream(adaptor,"token BLOB");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_CURRENT_TIMESTAMP=new RewriteRuleTokenStream(adaptor,"token CURRENT_TIMESTAMP");
        RewriteRuleTokenStream stream_CURRENT_DATE=new RewriteRuleTokenStream(adaptor,"token CURRENT_DATE");
        RewriteRuleTokenStream stream_CURRENT_TIME=new RewriteRuleTokenStream(adaptor,"token CURRENT_TIME");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // SqlParser.g:144:3: ( INTEGER -> ^( INTEGER_LITERAL INTEGER ) | FLOAT -> ^( FLOAT_LITERAL FLOAT ) | STRING -> ^( STRING_LITERAL STRING ) | BLOB -> ^( BLOB_LITERAL BLOB ) | NULL | CURRENT_TIME -> ^( FUNCTION_LITERAL CURRENT_TIME ) | CURRENT_DATE -> ^( FUNCTION_LITERAL CURRENT_DATE ) | CURRENT_TIMESTAMP -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP ) )
            int alt38=8;
            switch ( input.LA(1) ) {
            case INTEGER:
                {
                alt38=1;
                }
                break;
            case FLOAT:
                {
                alt38=2;
                }
                break;
            case STRING:
                {
                alt38=3;
                }
                break;
            case BLOB:
                {
                alt38=4;
                }
                break;
            case NULL:
                {
                alt38=5;
                }
                break;
            case CURRENT_TIME:
                {
                alt38=6;
                }
                break;
            case CURRENT_DATE:
                {
                alt38=7;
                }
                break;
            case CURRENT_TIMESTAMP:
                {
                alt38=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // SqlParser.g:144:5: INTEGER
                    {
                    INTEGER126=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_literal_value1081);  
                    stream_INTEGER.add(INTEGER126);



                    // AST REWRITE
                    // elements: INTEGER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 144:13: -> ^( INTEGER_LITERAL INTEGER )
                    {
                        // SqlParser.g:144:16: ^( INTEGER_LITERAL INTEGER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INTEGER_LITERAL, "INTEGER_LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_INTEGER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // SqlParser.g:145:5: FLOAT
                    {
                    FLOAT127=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_literal_value1095);  
                    stream_FLOAT.add(FLOAT127);



                    // AST REWRITE
                    // elements: FLOAT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 145:11: -> ^( FLOAT_LITERAL FLOAT )
                    {
                        // SqlParser.g:145:14: ^( FLOAT_LITERAL FLOAT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FLOAT_LITERAL, "FLOAT_LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_FLOAT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // SqlParser.g:146:5: STRING
                    {
                    STRING128=(Token)match(input,STRING,FOLLOW_STRING_in_literal_value1109);  
                    stream_STRING.add(STRING128);



                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 146:12: -> ^( STRING_LITERAL STRING )
                    {
                        // SqlParser.g:146:15: ^( STRING_LITERAL STRING )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STRING_LITERAL, "STRING_LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_STRING.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // SqlParser.g:147:5: BLOB
                    {
                    BLOB129=(Token)match(input,BLOB,FOLLOW_BLOB_in_literal_value1123);  
                    stream_BLOB.add(BLOB129);



                    // AST REWRITE
                    // elements: BLOB
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 147:10: -> ^( BLOB_LITERAL BLOB )
                    {
                        // SqlParser.g:147:13: ^( BLOB_LITERAL BLOB )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOB_LITERAL, "BLOB_LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_BLOB.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // SqlParser.g:148:5: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL130=(Token)match(input,NULL,FOLLOW_NULL_in_literal_value1137); 
                    NULL130_tree = (Object)adaptor.create(NULL130);
                    adaptor.addChild(root_0, NULL130_tree);


                    }
                    break;
                case 6 :
                    // SqlParser.g:149:5: CURRENT_TIME
                    {
                    CURRENT_TIME131=(Token)match(input,CURRENT_TIME,FOLLOW_CURRENT_TIME_in_literal_value1143);  
                    stream_CURRENT_TIME.add(CURRENT_TIME131);



                    // AST REWRITE
                    // elements: CURRENT_TIME
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 149:18: -> ^( FUNCTION_LITERAL CURRENT_TIME )
                    {
                        // SqlParser.g:149:21: ^( FUNCTION_LITERAL CURRENT_TIME )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION_LITERAL, "FUNCTION_LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_CURRENT_TIME.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // SqlParser.g:150:5: CURRENT_DATE
                    {
                    CURRENT_DATE132=(Token)match(input,CURRENT_DATE,FOLLOW_CURRENT_DATE_in_literal_value1157);  
                    stream_CURRENT_DATE.add(CURRENT_DATE132);



                    // AST REWRITE
                    // elements: CURRENT_DATE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 150:18: -> ^( FUNCTION_LITERAL CURRENT_DATE )
                    {
                        // SqlParser.g:150:21: ^( FUNCTION_LITERAL CURRENT_DATE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION_LITERAL, "FUNCTION_LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_CURRENT_DATE.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // SqlParser.g:151:5: CURRENT_TIMESTAMP
                    {
                    CURRENT_TIMESTAMP133=(Token)match(input,CURRENT_TIMESTAMP,FOLLOW_CURRENT_TIMESTAMP_in_literal_value1171);  
                    stream_CURRENT_TIMESTAMP.add(CURRENT_TIMESTAMP133);



                    // AST REWRITE
                    // elements: CURRENT_TIMESTAMP
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 151:23: -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP )
                    {
                        // SqlParser.g:151:26: ^( FUNCTION_LITERAL CURRENT_TIMESTAMP )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION_LITERAL, "FUNCTION_LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_CURRENT_TIMESTAMP.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literal_value"

    public static class bind_parameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bind_parameter"
    // SqlParser.g:154:1: bind_parameter : ( QUESTION -> BIND | QUESTION position= INTEGER -> ^( BIND $position) | COLON name= id -> ^( BIND_NAME $name) | AT name= id -> ^( BIND_NAME $name) );
    public final SqlParser.bind_parameter_return bind_parameter() throws RecognitionException {
        SqlParser.bind_parameter_return retval = new SqlParser.bind_parameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token position=null;
        Token QUESTION134=null;
        Token QUESTION135=null;
        Token COLON136=null;
        Token AT137=null;
        SqlParser.id_return name = null;


        Object position_tree=null;
        Object QUESTION134_tree=null;
        Object QUESTION135_tree=null;
        Object COLON136_tree=null;
        Object AT137_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // SqlParser.g:155:3: ( QUESTION -> BIND | QUESTION position= INTEGER -> ^( BIND $position) | COLON name= id -> ^( BIND_NAME $name) | AT name= id -> ^( BIND_NAME $name) )
            int alt39=4;
            switch ( input.LA(1) ) {
            case QUESTION:
                {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==INTEGER) ) {
                    alt39=2;
                }
                else if ( ((LA39_1>=EQUALS && LA39_1<=MINUS)||(LA39_1>=ASTERISK && LA39_1<=SEMI)||LA39_1==COMMA||LA39_1==RPAREN||(LA39_1>=ABORT && LA39_1<=WHERE)||LA39_1==ID) ) {
                    alt39=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;
                }
                }
                break;
            case COLON:
                {
                alt39=3;
                }
                break;
            case AT:
                {
                alt39=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // SqlParser.g:155:5: QUESTION
                    {
                    QUESTION134=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_bind_parameter1192);  
                    stream_QUESTION.add(QUESTION134);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 155:14: -> BIND
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(BIND, "BIND"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // SqlParser.g:156:5: QUESTION position= INTEGER
                    {
                    QUESTION135=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_bind_parameter1202);  
                    stream_QUESTION.add(QUESTION135);

                    position=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_bind_parameter1206);  
                    stream_INTEGER.add(position);



                    // AST REWRITE
                    // elements: position
                    // token labels: position
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_position=new RewriteRuleTokenStream(adaptor,"token position",position);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 156:31: -> ^( BIND $position)
                    {
                        // SqlParser.g:156:34: ^( BIND $position)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BIND, "BIND"), root_1);

                        adaptor.addChild(root_1, stream_position.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // SqlParser.g:157:5: COLON name= id
                    {
                    COLON136=(Token)match(input,COLON,FOLLOW_COLON_in_bind_parameter1221);  
                    stream_COLON.add(COLON136);

                    pushFollow(FOLLOW_id_in_bind_parameter1225);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());


                    // AST REWRITE
                    // elements: name
                    // token labels: 
                    // rule labels: retval, name
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 157:19: -> ^( BIND_NAME $name)
                    {
                        // SqlParser.g:157:22: ^( BIND_NAME $name)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BIND_NAME, "BIND_NAME"), root_1);

                        adaptor.addChild(root_1, stream_name.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // SqlParser.g:158:5: AT name= id
                    {
                    AT137=(Token)match(input,AT,FOLLOW_AT_in_bind_parameter1240);  
                    stream_AT.add(AT137);

                    pushFollow(FOLLOW_id_in_bind_parameter1244);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());


                    // AST REWRITE
                    // elements: name
                    // token labels: 
                    // rule labels: retval, name
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 158:16: -> ^( BIND_NAME $name)
                    {
                        // SqlParser.g:158:19: ^( BIND_NAME $name)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BIND_NAME, "BIND_NAME"), root_1);

                        adaptor.addChild(root_1, stream_name.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bind_parameter"

    public static class raise_function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "raise_function"
    // SqlParser.g:162:1: raise_function : RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN ;
    public final SqlParser.raise_function_return raise_function() throws RecognitionException {
        SqlParser.raise_function_return retval = new SqlParser.raise_function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token error_message=null;
        Token RAISE138=null;
        Token LPAREN139=null;
        Token IGNORE140=null;
        Token set141=null;
        Token COMMA142=null;
        Token RPAREN143=null;

        Object error_message_tree=null;
        Object RAISE138_tree=null;
        Object LPAREN139_tree=null;
        Object IGNORE140_tree=null;
        Object set141_tree=null;
        Object COMMA142_tree=null;
        Object RPAREN143_tree=null;

        try {
            // SqlParser.g:162:15: ( RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN )
            // SqlParser.g:162:17: RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN
            {
            root_0 = (Object)adaptor.nil();

            RAISE138=(Token)match(input,RAISE,FOLLOW_RAISE_in_raise_function1264); 
            RAISE138_tree = (Object)adaptor.create(RAISE138);
            root_0 = (Object)adaptor.becomeRoot(RAISE138_tree, root_0);

            LPAREN139=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_raise_function1267); 
            // SqlParser.g:162:32: ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==IGNORE) ) {
                alt40=1;
            }
            else if ( (LA40_0==ABORT||LA40_0==FAIL||LA40_0==ROLLBACK) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // SqlParser.g:162:33: IGNORE
                    {
                    IGNORE140=(Token)match(input,IGNORE,FOLLOW_IGNORE_in_raise_function1271); 
                    IGNORE140_tree = (Object)adaptor.create(IGNORE140);
                    adaptor.addChild(root_0, IGNORE140_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:162:42: ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING
                    {
                    set141=(Token)input.LT(1);
                    if ( input.LA(1)==ABORT||input.LA(1)==FAIL||input.LA(1)==ROLLBACK ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set141));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    COMMA142=(Token)match(input,COMMA,FOLLOW_COMMA_in_raise_function1287); 
                    error_message=(Token)match(input,STRING,FOLLOW_STRING_in_raise_function1292); 
                    error_message_tree = (Object)adaptor.create(error_message);
                    adaptor.addChild(root_0, error_message_tree);


                    }
                    break;

            }

            RPAREN143=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_raise_function1295); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "raise_function"

    public static class type_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type_name"
    // SqlParser.g:164:1: type_name : (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )? -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ ) ;
    public final SqlParser.type_name_return type_name() throws RecognitionException {
        SqlParser.type_name_return retval = new SqlParser.type_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN144=null;
        Token COMMA145=null;
        Token RPAREN146=null;
        Token names=null;
        List list_names=null;
        SqlParser.signed_number_return size1 = null;

        SqlParser.signed_number_return size2 = null;


        Object LPAREN144_tree=null;
        Object COMMA145_tree=null;
        Object RPAREN146_tree=null;
        Object names_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_signed_number=new RewriteRuleSubtreeStream(adaptor,"rule signed_number");
        try {
            // SqlParser.g:164:10: ( (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )? -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ ) )
            // SqlParser.g:164:12: (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )?
            {
            // SqlParser.g:164:17: (names+= ID )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // SqlParser.g:164:17: names+= ID
            	    {
            	    names=(Token)match(input,ID,FOLLOW_ID_in_type_name1305);  
            	    stream_ID.add(names);

            	    if (list_names==null) list_names=new ArrayList();
            	    list_names.add(names);


            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);

            // SqlParser.g:164:23: ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==LPAREN) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // SqlParser.g:164:24: LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN
                    {
                    LPAREN144=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_type_name1309);  
                    stream_LPAREN.add(LPAREN144);

                    pushFollow(FOLLOW_signed_number_in_type_name1313);
                    size1=signed_number();

                    state._fsp--;

                    stream_signed_number.add(size1.getTree());
                    // SqlParser.g:164:51: ( COMMA size2= signed_number )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==COMMA) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // SqlParser.g:164:52: COMMA size2= signed_number
                            {
                            COMMA145=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_name1316);  
                            stream_COMMA.add(COMMA145);

                            pushFollow(FOLLOW_signed_number_in_type_name1320);
                            size2=signed_number();

                            state._fsp--;

                            stream_signed_number.add(size2.getTree());

                            }
                            break;

                    }

                    RPAREN146=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_type_name1324);  
                    stream_RPAREN.add(RPAREN146);


                    }
                    break;

            }



            // AST REWRITE
            // elements: names, size2, size1
            // token labels: 
            // rule labels: retval, size2, size1
            // token list labels: names
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_names=new RewriteRuleTokenStream(adaptor,"token names", list_names);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_size2=new RewriteRuleSubtreeStream(adaptor,"rule size2",size2!=null?size2.tree:null);
            RewriteRuleSubtreeStream stream_size1=new RewriteRuleSubtreeStream(adaptor,"rule size1",size1!=null?size1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 165:1: -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ )
            {
                // SqlParser.g:165:4: ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_1);

                // SqlParser.g:165:11: ^( TYPE_PARAMS ( $size1)? ( $size2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE_PARAMS, "TYPE_PARAMS"), root_2);

                // SqlParser.g:165:25: ( $size1)?
                if ( stream_size1.hasNext() ) {
                    adaptor.addChild(root_2, stream_size1.nextTree());

                }
                stream_size1.reset();
                // SqlParser.g:165:33: ( $size2)?
                if ( stream_size2.hasNext() ) {
                    adaptor.addChild(root_2, stream_size2.nextTree());

                }
                stream_size2.reset();

                adaptor.addChild(root_1, root_2);
                }
                if ( !(stream_names.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_names.hasNext() ) {
                    adaptor.addChild(root_1, stream_names.nextNode());

                }
                stream_names.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type_name"

    public static class pragma_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pragma_stmt"
    // SqlParser.g:168:1: pragma_stmt : PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )? ;
    public final SqlParser.pragma_stmt_return pragma_stmt() throws RecognitionException {
        SqlParser.pragma_stmt_return retval = new SqlParser.pragma_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRAGMA147=null;
        Token DOT148=null;
        Token EQUALS149=null;
        Token LPAREN151=null;
        Token RPAREN153=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return pragma_name = null;

        SqlParser.pragma_value_return pragma_value150 = null;

        SqlParser.pragma_value_return pragma_value152 = null;


        Object PRAGMA147_tree=null;
        Object DOT148_tree=null;
        Object EQUALS149_tree=null;
        Object LPAREN151_tree=null;
        Object RPAREN153_tree=null;

        try {
            // SqlParser.g:168:12: ( PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )? )
            // SqlParser.g:168:14: PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            PRAGMA147=(Token)match(input,PRAGMA,FOLLOW_PRAGMA_in_pragma_stmt1356); 
            PRAGMA147_tree = (Object)adaptor.create(PRAGMA147);
            adaptor.addChild(root_0, PRAGMA147_tree);

            // SqlParser.g:168:21: (database_name= id DOT )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==ID) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==DOT) ) {
                    alt44=1;
                }
            }
            else if ( ((LA44_0>=ABORT && LA44_0<=FROM)||(LA44_0>=GROUP && LA44_0<=IMMEDIATE)||(LA44_0>=INDEX && LA44_0<=IS)||(LA44_0>=JOIN && LA44_0<=LEFT)||LA44_0==LIMIT||LA44_0==NATURAL||(LA44_0>=NULL && LA44_0<=REFERENCES)||(LA44_0>=REINDEX && LA44_0<=WHERE)) ) {
                int LA44_2 = input.LA(2);

                if ( (LA44_2==DOT) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // SqlParser.g:168:22: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_pragma_stmt1361);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT148=(Token)match(input,DOT,FOLLOW_DOT_in_pragma_stmt1363); 
                    DOT148_tree = (Object)adaptor.create(DOT148);
                    adaptor.addChild(root_0, DOT148_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_pragma_stmt1369);
            pragma_name=id();

            state._fsp--;

            adaptor.addChild(root_0, pragma_name.getTree());
            // SqlParser.g:168:60: ( EQUALS pragma_value | LPAREN pragma_value RPAREN )?
            int alt45=3;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==EQUALS) ) {
                alt45=1;
            }
            else if ( (LA45_0==LPAREN) ) {
                alt45=2;
            }
            switch (alt45) {
                case 1 :
                    // SqlParser.g:168:61: EQUALS pragma_value
                    {
                    EQUALS149=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_pragma_stmt1372); 
                    EQUALS149_tree = (Object)adaptor.create(EQUALS149);
                    adaptor.addChild(root_0, EQUALS149_tree);

                    pushFollow(FOLLOW_pragma_value_in_pragma_stmt1374);
                    pragma_value150=pragma_value();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_value150.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:168:83: LPAREN pragma_value RPAREN
                    {
                    LPAREN151=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_pragma_stmt1378); 
                    LPAREN151_tree = (Object)adaptor.create(LPAREN151);
                    adaptor.addChild(root_0, LPAREN151_tree);

                    pushFollow(FOLLOW_pragma_value_in_pragma_stmt1380);
                    pragma_value152=pragma_value();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_value152.getTree());
                    RPAREN153=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_pragma_stmt1382); 
                    RPAREN153_tree = (Object)adaptor.create(RPAREN153);
                    adaptor.addChild(root_0, RPAREN153_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pragma_stmt"

    public static class pragma_value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pragma_value"
    // SqlParser.g:170:1: pragma_value : ( signed_number | name= id | STRING );
    public final SqlParser.pragma_value_return pragma_value() throws RecognitionException {
        SqlParser.pragma_value_return retval = new SqlParser.pragma_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING155=null;
        SqlParser.id_return name = null;

        SqlParser.signed_number_return signed_number154 = null;


        Object STRING155_tree=null;

        try {
            // SqlParser.g:170:13: ( signed_number | name= id | STRING )
            int alt46=3;
            switch ( input.LA(1) ) {
            case PLUS:
            case MINUS:
            case INTEGER:
            case FLOAT:
                {
                alt46=1;
                }
                break;
            case ABORT:
            case ADD:
            case AFTER:
            case ALL:
            case ALTER:
            case ANALYZE:
            case AND:
            case AS:
            case ASC:
            case ATTACH:
            case AUTOINCREMENT:
            case BEFORE:
            case BEGIN:
            case BETWEEN:
            case BY:
            case CASCADE:
            case CASE:
            case CAST:
            case CHECK:
            case COLLATE:
            case COLUMN:
            case COMMIT:
            case CONFLICT:
            case CONSTRAINT:
            case CREATE:
            case CROSS:
            case CURRENT_TIME:
            case CURRENT_DATE:
            case CURRENT_TIMESTAMP:
            case DATABASE:
            case DEFAULT:
            case DEFERRABLE:
            case DEFERRED:
            case DELETE:
            case DESC:
            case DETACH:
            case DISTINCT:
            case DROP:
            case EACH:
            case ELSE:
            case END:
            case ESCAPE:
            case EXCEPT:
            case EXCLUSIVE:
            case EXISTS:
            case EXPLAIN:
            case FAIL:
            case FOR:
            case FOREIGN:
            case FROM:
            case GROUP:
            case HAVING:
            case IF:
            case IGNORE:
            case IMMEDIATE:
            case INDEX:
            case INDEXED:
            case INITIALLY:
            case INNER:
            case INSERT:
            case INSTEAD:
            case INTERSECT:
            case INTO:
            case IS:
            case JOIN:
            case KEY:
            case LEFT:
            case LIMIT:
            case NATURAL:
            case NULL:
            case OF:
            case OFFSET:
            case ON:
            case OR:
            case ORDER:
            case OUTER:
            case PLAN:
            case PRAGMA:
            case PRIMARY:
            case QUERY:
            case RAISE:
            case REFERENCES:
            case REINDEX:
            case RELEASE:
            case RENAME:
            case REPLACE:
            case RESTRICT:
            case ROLLBACK:
            case ROW:
            case SAVEPOINT:
            case SELECT:
            case SET:
            case TABLE:
            case TEMPORARY:
            case THEN:
            case TO:
            case TRANSACTION:
            case TRIGGER:
            case UNION:
            case UNIQUE:
            case UPDATE:
            case USING:
            case VACUUM:
            case VALUES:
            case VIEW:
            case VIRTUAL:
            case WHEN:
            case WHERE:
            case ID:
                {
                alt46=2;
                }
                break;
            case STRING:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // SqlParser.g:170:15: signed_number
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_signed_number_in_pragma_value1391);
                    signed_number154=signed_number();

                    state._fsp--;

                    adaptor.addChild(root_0, signed_number154.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:170:31: name= id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_in_pragma_value1397);
                    name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, name.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:170:41: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING155=(Token)match(input,STRING,FOLLOW_STRING_in_pragma_value1401); 
                    STRING155_tree = (Object)adaptor.create(STRING155);
                    adaptor.addChild(root_0, STRING155_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pragma_value"

    public static class attach_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attach_stmt"
    // SqlParser.g:173:1: attach_stmt : ATTACH ( DATABASE )? filename= ( STRING | id ) AS database_name= id ;
    public final SqlParser.attach_stmt_return attach_stmt() throws RecognitionException {
        SqlParser.attach_stmt_return retval = new SqlParser.attach_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token filename=null;
        Token ATTACH156=null;
        Token DATABASE157=null;
        Token STRING158=null;
        Token AS160=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return id159 = null;


        Object filename_tree=null;
        Object ATTACH156_tree=null;
        Object DATABASE157_tree=null;
        Object STRING158_tree=null;
        Object AS160_tree=null;

        try {
            // SqlParser.g:173:12: ( ATTACH ( DATABASE )? filename= ( STRING | id ) AS database_name= id )
            // SqlParser.g:173:14: ATTACH ( DATABASE )? filename= ( STRING | id ) AS database_name= id
            {
            root_0 = (Object)adaptor.nil();

            ATTACH156=(Token)match(input,ATTACH,FOLLOW_ATTACH_in_attach_stmt1409); 
            ATTACH156_tree = (Object)adaptor.create(ATTACH156);
            adaptor.addChild(root_0, ATTACH156_tree);

            // SqlParser.g:173:21: ( DATABASE )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==DATABASE) ) {
                int LA47_1 = input.LA(2);

                if ( ((LA47_1>=ABORT && LA47_1<=AND)||(LA47_1>=ASC && LA47_1<=FROM)||(LA47_1>=GROUP && LA47_1<=IMMEDIATE)||(LA47_1>=INDEX && LA47_1<=IS)||(LA47_1>=JOIN && LA47_1<=LEFT)||LA47_1==LIMIT||LA47_1==NATURAL||(LA47_1>=NULL && LA47_1<=REFERENCES)||(LA47_1>=REINDEX && LA47_1<=WHERE)||(LA47_1>=ID && LA47_1<=STRING)) ) {
                    alt47=1;
                }
                else if ( (LA47_1==AS) ) {
                    int LA47_4 = input.LA(3);

                    if ( (LA47_4==AS) ) {
                        int LA47_5 = input.LA(4);

                        if ( ((LA47_5>=ABORT && LA47_5<=FROM)||(LA47_5>=GROUP && LA47_5<=IMMEDIATE)||(LA47_5>=INDEX && LA47_5<=IS)||(LA47_5>=JOIN && LA47_5<=LEFT)||LA47_5==LIMIT||LA47_5==NATURAL||(LA47_5>=NULL && LA47_5<=REFERENCES)||(LA47_5>=REINDEX && LA47_5<=WHERE)||LA47_5==ID) ) {
                            alt47=1;
                        }
                    }
                }
            }
            switch (alt47) {
                case 1 :
                    // SqlParser.g:173:22: DATABASE
                    {
                    DATABASE157=(Token)match(input,DATABASE,FOLLOW_DATABASE_in_attach_stmt1412); 
                    DATABASE157_tree = (Object)adaptor.create(DATABASE157);
                    adaptor.addChild(root_0, DATABASE157_tree);


                    }
                    break;

            }

            // SqlParser.g:173:42: ( STRING | id )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==STRING) ) {
                alt48=1;
            }
            else if ( ((LA48_0>=ABORT && LA48_0<=FROM)||(LA48_0>=GROUP && LA48_0<=IMMEDIATE)||(LA48_0>=INDEX && LA48_0<=IS)||(LA48_0>=JOIN && LA48_0<=LEFT)||LA48_0==LIMIT||LA48_0==NATURAL||(LA48_0>=NULL && LA48_0<=REFERENCES)||(LA48_0>=REINDEX && LA48_0<=WHERE)||LA48_0==ID) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // SqlParser.g:173:43: STRING
                    {
                    STRING158=(Token)match(input,STRING,FOLLOW_STRING_in_attach_stmt1419); 
                    STRING158_tree = (Object)adaptor.create(STRING158);
                    adaptor.addChild(root_0, STRING158_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:173:52: id
                    {
                    pushFollow(FOLLOW_id_in_attach_stmt1423);
                    id159=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id159.getTree());

                    }
                    break;

            }

            AS160=(Token)match(input,AS,FOLLOW_AS_in_attach_stmt1426); 
            AS160_tree = (Object)adaptor.create(AS160);
            adaptor.addChild(root_0, AS160_tree);

            pushFollow(FOLLOW_id_in_attach_stmt1430);
            database_name=id();

            state._fsp--;

            adaptor.addChild(root_0, database_name.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attach_stmt"

    public static class detach_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "detach_stmt"
    // SqlParser.g:176:1: detach_stmt : DETACH ( DATABASE )? database_name= id ;
    public final SqlParser.detach_stmt_return detach_stmt() throws RecognitionException {
        SqlParser.detach_stmt_return retval = new SqlParser.detach_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DETACH161=null;
        Token DATABASE162=null;
        SqlParser.id_return database_name = null;


        Object DETACH161_tree=null;
        Object DATABASE162_tree=null;

        try {
            // SqlParser.g:176:12: ( DETACH ( DATABASE )? database_name= id )
            // SqlParser.g:176:14: DETACH ( DATABASE )? database_name= id
            {
            root_0 = (Object)adaptor.nil();

            DETACH161=(Token)match(input,DETACH,FOLLOW_DETACH_in_detach_stmt1438); 
            DETACH161_tree = (Object)adaptor.create(DETACH161);
            adaptor.addChild(root_0, DETACH161_tree);

            // SqlParser.g:176:21: ( DATABASE )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==DATABASE) ) {
                int LA49_1 = input.LA(2);

                if ( ((LA49_1>=ABORT && LA49_1<=FROM)||(LA49_1>=GROUP && LA49_1<=IMMEDIATE)||(LA49_1>=INDEX && LA49_1<=IS)||(LA49_1>=JOIN && LA49_1<=LEFT)||LA49_1==LIMIT||LA49_1==NATURAL||(LA49_1>=NULL && LA49_1<=REFERENCES)||(LA49_1>=REINDEX && LA49_1<=WHERE)||LA49_1==ID) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // SqlParser.g:176:22: DATABASE
                    {
                    DATABASE162=(Token)match(input,DATABASE,FOLLOW_DATABASE_in_detach_stmt1441); 
                    DATABASE162_tree = (Object)adaptor.create(DATABASE162);
                    adaptor.addChild(root_0, DATABASE162_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_detach_stmt1447);
            database_name=id();

            state._fsp--;

            adaptor.addChild(root_0, database_name.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "detach_stmt"

    public static class analyze_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "analyze_stmt"
    // SqlParser.g:179:1: analyze_stmt : ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )? ;
    public final SqlParser.analyze_stmt_return analyze_stmt() throws RecognitionException {
        SqlParser.analyze_stmt_return retval = new SqlParser.analyze_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ANALYZE163=null;
        Token DOT164=null;
        SqlParser.id_return database_or_table_name = null;

        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;


        Object ANALYZE163_tree=null;
        Object DOT164_tree=null;

        try {
            // SqlParser.g:179:13: ( ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )? )
            // SqlParser.g:179:15: ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )?
            {
            root_0 = (Object)adaptor.nil();

            ANALYZE163=(Token)match(input,ANALYZE,FOLLOW_ANALYZE_in_analyze_stmt1455); 
            ANALYZE163_tree = (Object)adaptor.create(ANALYZE163);
            adaptor.addChild(root_0, ANALYZE163_tree);

            // SqlParser.g:179:23: (database_or_table_name= id | database_name= id DOT table_name= id )?
            int alt50=3;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==ID) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==DOT) ) {
                    alt50=2;
                }
                else if ( (LA50_1==SEMI) ) {
                    alt50=1;
                }
            }
            else if ( ((LA50_0>=ABORT && LA50_0<=FROM)||(LA50_0>=GROUP && LA50_0<=IMMEDIATE)||(LA50_0>=INDEX && LA50_0<=IS)||(LA50_0>=JOIN && LA50_0<=LEFT)||LA50_0==LIMIT||LA50_0==NATURAL||(LA50_0>=NULL && LA50_0<=REFERENCES)||(LA50_0>=REINDEX && LA50_0<=WHERE)) ) {
                int LA50_2 = input.LA(2);

                if ( (LA50_2==SEMI) ) {
                    alt50=1;
                }
                else if ( (LA50_2==DOT) ) {
                    alt50=2;
                }
            }
            switch (alt50) {
                case 1 :
                    // SqlParser.g:179:24: database_or_table_name= id
                    {
                    pushFollow(FOLLOW_id_in_analyze_stmt1460);
                    database_or_table_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_or_table_name.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:179:52: database_name= id DOT table_name= id
                    {
                    pushFollow(FOLLOW_id_in_analyze_stmt1466);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT164=(Token)match(input,DOT,FOLLOW_DOT_in_analyze_stmt1468); 
                    DOT164_tree = (Object)adaptor.create(DOT164);
                    adaptor.addChild(root_0, DOT164_tree);

                    pushFollow(FOLLOW_id_in_analyze_stmt1472);
                    table_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, table_name.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "analyze_stmt"

    public static class reindex_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reindex_stmt"
    // SqlParser.g:182:1: reindex_stmt : REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id ;
    public final SqlParser.reindex_stmt_return reindex_stmt() throws RecognitionException {
        SqlParser.reindex_stmt_return retval = new SqlParser.reindex_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REINDEX165=null;
        Token DOT166=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return collation_or_table_or_index_name = null;


        Object REINDEX165_tree=null;
        Object DOT166_tree=null;

        try {
            // SqlParser.g:182:13: ( REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id )
            // SqlParser.g:182:15: REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id
            {
            root_0 = (Object)adaptor.nil();

            REINDEX165=(Token)match(input,REINDEX,FOLLOW_REINDEX_in_reindex_stmt1482); 
            REINDEX165_tree = (Object)adaptor.create(REINDEX165);
            adaptor.addChild(root_0, REINDEX165_tree);

            // SqlParser.g:182:23: (database_name= id DOT )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==ID) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==DOT) ) {
                    alt51=1;
                }
            }
            else if ( ((LA51_0>=ABORT && LA51_0<=FROM)||(LA51_0>=GROUP && LA51_0<=IMMEDIATE)||(LA51_0>=INDEX && LA51_0<=IS)||(LA51_0>=JOIN && LA51_0<=LEFT)||LA51_0==LIMIT||LA51_0==NATURAL||(LA51_0>=NULL && LA51_0<=REFERENCES)||(LA51_0>=REINDEX && LA51_0<=WHERE)) ) {
                int LA51_2 = input.LA(2);

                if ( (LA51_2==DOT) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // SqlParser.g:182:24: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_reindex_stmt1487);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT166=(Token)match(input,DOT,FOLLOW_DOT_in_reindex_stmt1489); 
                    DOT166_tree = (Object)adaptor.create(DOT166);
                    adaptor.addChild(root_0, DOT166_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_reindex_stmt1495);
            collation_or_table_or_index_name=id();

            state._fsp--;

            adaptor.addChild(root_0, collation_or_table_or_index_name.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "reindex_stmt"

    public static class vacuum_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vacuum_stmt"
    // SqlParser.g:185:1: vacuum_stmt : VACUUM ;
    public final SqlParser.vacuum_stmt_return vacuum_stmt() throws RecognitionException {
        SqlParser.vacuum_stmt_return retval = new SqlParser.vacuum_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VACUUM167=null;

        Object VACUUM167_tree=null;

        try {
            // SqlParser.g:185:12: ( VACUUM )
            // SqlParser.g:185:14: VACUUM
            {
            root_0 = (Object)adaptor.nil();

            VACUUM167=(Token)match(input,VACUUM,FOLLOW_VACUUM_in_vacuum_stmt1503); 
            VACUUM167_tree = (Object)adaptor.create(VACUUM167);
            adaptor.addChild(root_0, VACUUM167_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "vacuum_stmt"

    public static class operation_conflict_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operation_conflict_clause"
    // SqlParser.g:191:1: operation_conflict_clause : OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) ;
    public final SqlParser.operation_conflict_clause_return operation_conflict_clause() throws RecognitionException {
        SqlParser.operation_conflict_clause_return retval = new SqlParser.operation_conflict_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR168=null;
        Token set169=null;

        Object OR168_tree=null;
        Object set169_tree=null;

        try {
            // SqlParser.g:191:26: ( OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) )
            // SqlParser.g:191:28: OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE )
            {
            root_0 = (Object)adaptor.nil();

            OR168=(Token)match(input,OR,FOLLOW_OR_in_operation_conflict_clause1514); 
            OR168_tree = (Object)adaptor.create(OR168);
            adaptor.addChild(root_0, OR168_tree);

            set169=(Token)input.LT(1);
            if ( input.LA(1)==ABORT||input.LA(1)==FAIL||input.LA(1)==IGNORE||input.LA(1)==REPLACE||input.LA(1)==ROLLBACK ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set169));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operation_conflict_clause"

    public static class ordering_term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ordering_term"
    // SqlParser.g:193:1: ordering_term : expr ( ASC | DESC )? -> ^( ORDERING expr ( ASC )? ( DESC )? ) ;
    public final SqlParser.ordering_term_return ordering_term() throws RecognitionException {
        SqlParser.ordering_term_return retval = new SqlParser.ordering_term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASC171=null;
        Token DESC172=null;
        SqlParser.expr_return expr170 = null;


        Object ASC171_tree=null;
        Object DESC172_tree=null;
        RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");
        RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // SqlParser.g:193:14: ( expr ( ASC | DESC )? -> ^( ORDERING expr ( ASC )? ( DESC )? ) )
            // SqlParser.g:193:16: expr ( ASC | DESC )?
            {
            pushFollow(FOLLOW_expr_in_ordering_term1541);
            expr170=expr();

            state._fsp--;

            stream_expr.add(expr170.getTree());
            // SqlParser.g:193:82: ( ASC | DESC )?
            int alt52=3;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ASC) ) {
                alt52=1;
            }
            else if ( (LA52_0==DESC) ) {
                alt52=2;
            }
            switch (alt52) {
                case 1 :
                    // SqlParser.g:193:83: ASC
                    {
                    ASC171=(Token)match(input,ASC,FOLLOW_ASC_in_ordering_term1546);  
                    stream_ASC.add(ASC171);


                    }
                    break;
                case 2 :
                    // SqlParser.g:193:89: DESC
                    {
                    DESC172=(Token)match(input,DESC,FOLLOW_DESC_in_ordering_term1550);  
                    stream_DESC.add(DESC172);


                    }
                    break;

            }



            // AST REWRITE
            // elements: expr, ASC, DESC
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 194:1: -> ^( ORDERING expr ( ASC )? ( DESC )? )
            {
                // SqlParser.g:194:4: ^( ORDERING expr ( ASC )? ( DESC )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ORDERING, "ORDERING"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                // SqlParser.g:194:20: ( ASC )?
                if ( stream_ASC.hasNext() ) {
                    adaptor.addChild(root_1, stream_ASC.nextNode());

                }
                stream_ASC.reset();
                // SqlParser.g:194:27: ( DESC )?
                if ( stream_DESC.hasNext() ) {
                    adaptor.addChild(root_1, stream_DESC.nextNode());

                }
                stream_DESC.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ordering_term"

    public static class operation_limited_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operation_limited_clause"
    // SqlParser.g:196:1: operation_limited_clause : ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? ;
    public final SqlParser.operation_limited_clause_return operation_limited_clause() throws RecognitionException {
        SqlParser.operation_limited_clause_return retval = new SqlParser.operation_limited_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token limit=null;
        Token offset=null;
        Token ORDER173=null;
        Token BY174=null;
        Token COMMA176=null;
        Token LIMIT178=null;
        Token set179=null;
        SqlParser.ordering_term_return ordering_term175 = null;

        SqlParser.ordering_term_return ordering_term177 = null;


        Object limit_tree=null;
        Object offset_tree=null;
        Object ORDER173_tree=null;
        Object BY174_tree=null;
        Object COMMA176_tree=null;
        Object LIMIT178_tree=null;
        Object set179_tree=null;

        try {
            // SqlParser.g:196:25: ( ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )
            // SqlParser.g:197:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )?
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:197:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==ORDER) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // SqlParser.g:197:4: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                    ORDER173=(Token)match(input,ORDER,FOLLOW_ORDER_in_operation_limited_clause1580); 
                    ORDER173_tree = (Object)adaptor.create(ORDER173);
                    adaptor.addChild(root_0, ORDER173_tree);

                    BY174=(Token)match(input,BY,FOLLOW_BY_in_operation_limited_clause1582); 
                    BY174_tree = (Object)adaptor.create(BY174);
                    adaptor.addChild(root_0, BY174_tree);

                    pushFollow(FOLLOW_ordering_term_in_operation_limited_clause1584);
                    ordering_term175=ordering_term();

                    state._fsp--;

                    adaptor.addChild(root_0, ordering_term175.getTree());
                    // SqlParser.g:197:27: ( COMMA ordering_term )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==COMMA) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // SqlParser.g:197:28: COMMA ordering_term
                    	    {
                    	    COMMA176=(Token)match(input,COMMA,FOLLOW_COMMA_in_operation_limited_clause1587); 
                    	    COMMA176_tree = (Object)adaptor.create(COMMA176);
                    	    adaptor.addChild(root_0, COMMA176_tree);

                    	    pushFollow(FOLLOW_ordering_term_in_operation_limited_clause1589);
                    	    ordering_term177=ordering_term();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, ordering_term177.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);


                    }
                    break;

            }

            LIMIT178=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_operation_limited_clause1597); 
            LIMIT178_tree = (Object)adaptor.create(LIMIT178);
            adaptor.addChild(root_0, LIMIT178_tree);

            limit=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation_limited_clause1601); 
            limit_tree = (Object)adaptor.create(limit);
            adaptor.addChild(root_0, limit_tree);

            // SqlParser.g:198:23: ( ( OFFSET | COMMA ) offset= INTEGER )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==COMMA||LA55_0==OFFSET) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // SqlParser.g:198:24: ( OFFSET | COMMA ) offset= INTEGER
                    {
                    set179=(Token)input.LT(1);
                    if ( input.LA(1)==COMMA||input.LA(1)==OFFSET ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set179));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    offset=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation_limited_clause1614); 
                    offset_tree = (Object)adaptor.create(offset);
                    adaptor.addChild(root_0, offset_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operation_limited_clause"

    public static class select_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "select_stmt"
    // SqlParser.g:201:1: select_stmt : select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )? -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? ) ;
    public final SqlParser.select_stmt_return select_stmt() throws RecognitionException {
        SqlParser.select_stmt_return retval = new SqlParser.select_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token limit=null;
        Token offset=null;
        Token ORDER181=null;
        Token BY182=null;
        Token COMMA184=null;
        Token LIMIT186=null;
        Token OFFSET187=null;
        Token COMMA188=null;
        SqlParser.select_list_return select_list180 = null;

        SqlParser.ordering_term_return ordering_term183 = null;

        SqlParser.ordering_term_return ordering_term185 = null;


        Object limit_tree=null;
        Object offset_tree=null;
        Object ORDER181_tree=null;
        Object BY182_tree=null;
        Object COMMA184_tree=null;
        Object LIMIT186_tree=null;
        Object OFFSET187_tree=null;
        Object COMMA188_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_ORDER=new RewriteRuleTokenStream(adaptor,"token ORDER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
        RewriteRuleTokenStream stream_OFFSET=new RewriteRuleTokenStream(adaptor,"token OFFSET");
        RewriteRuleSubtreeStream stream_select_list=new RewriteRuleSubtreeStream(adaptor,"rule select_list");
        RewriteRuleSubtreeStream stream_ordering_term=new RewriteRuleSubtreeStream(adaptor,"rule ordering_term");
        try {
            // SqlParser.g:201:12: ( select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )? -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? ) )
            // SqlParser.g:201:14: select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )?
            {
            pushFollow(FOLLOW_select_list_in_select_stmt1624);
            select_list180=select_list();

            state._fsp--;

            stream_select_list.add(select_list180.getTree());
            // SqlParser.g:202:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==ORDER) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // SqlParser.g:202:4: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                    ORDER181=(Token)match(input,ORDER,FOLLOW_ORDER_in_select_stmt1629);  
                    stream_ORDER.add(ORDER181);

                    BY182=(Token)match(input,BY,FOLLOW_BY_in_select_stmt1631);  
                    stream_BY.add(BY182);

                    pushFollow(FOLLOW_ordering_term_in_select_stmt1633);
                    ordering_term183=ordering_term();

                    state._fsp--;

                    stream_ordering_term.add(ordering_term183.getTree());
                    // SqlParser.g:202:27: ( COMMA ordering_term )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==COMMA) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // SqlParser.g:202:28: COMMA ordering_term
                    	    {
                    	    COMMA184=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_stmt1636);  
                    	    stream_COMMA.add(COMMA184);

                    	    pushFollow(FOLLOW_ordering_term_in_select_stmt1638);
                    	    ordering_term185=ordering_term();

                    	    state._fsp--;

                    	    stream_ordering_term.add(ordering_term185.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);


                    }
                    break;

            }

            // SqlParser.g:203:3: ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==LIMIT) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // SqlParser.g:203:4: LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )?
                    {
                    LIMIT186=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_select_stmt1647);  
                    stream_LIMIT.add(LIMIT186);

                    limit=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt1651);  
                    stream_INTEGER.add(limit);

                    // SqlParser.g:203:24: ( ( OFFSET | COMMA ) offset= INTEGER )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==COMMA||LA59_0==OFFSET) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // SqlParser.g:203:25: ( OFFSET | COMMA ) offset= INTEGER
                            {
                            // SqlParser.g:203:25: ( OFFSET | COMMA )
                            int alt58=2;
                            int LA58_0 = input.LA(1);

                            if ( (LA58_0==OFFSET) ) {
                                alt58=1;
                            }
                            else if ( (LA58_0==COMMA) ) {
                                alt58=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 58, 0, input);

                                throw nvae;
                            }
                            switch (alt58) {
                                case 1 :
                                    // SqlParser.g:203:26: OFFSET
                                    {
                                    OFFSET187=(Token)match(input,OFFSET,FOLLOW_OFFSET_in_select_stmt1655);  
                                    stream_OFFSET.add(OFFSET187);


                                    }
                                    break;
                                case 2 :
                                    // SqlParser.g:203:35: COMMA
                                    {
                                    COMMA188=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_stmt1659);  
                                    stream_COMMA.add(COMMA188);


                                    }
                                    break;

                            }

                            offset=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt1664);  
                            stream_INTEGER.add(offset);


                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: offset, ordering_term, select_list, LIMIT, ORDER, limit
            // token labels: limit, offset
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_limit=new RewriteRuleTokenStream(adaptor,"token limit",limit);
            RewriteRuleTokenStream stream_offset=new RewriteRuleTokenStream(adaptor,"token offset",offset);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 204:1: -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? )
            {
                // SqlParser.g:204:4: ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECT, "SELECT"), root_1);

                adaptor.addChild(root_1, stream_select_list.nextTree());
                // SqlParser.g:205:22: ( ^( ORDER ( ordering_term )+ ) )?
                if ( stream_ordering_term.hasNext()||stream_ORDER.hasNext() ) {
                    // SqlParser.g:205:22: ^( ORDER ( ordering_term )+ )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_ORDER.nextNode(), root_2);

                    if ( !(stream_ordering_term.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_ordering_term.hasNext() ) {
                        adaptor.addChild(root_2, stream_ordering_term.nextTree());

                    }
                    stream_ordering_term.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_ordering_term.reset();
                stream_ORDER.reset();
                // SqlParser.g:205:47: ( ^( LIMIT $limit ( $offset)? ) )?
                if ( stream_offset.hasNext()||stream_LIMIT.hasNext()||stream_limit.hasNext() ) {
                    // SqlParser.g:205:47: ^( LIMIT $limit ( $offset)? )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_LIMIT.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_limit.nextNode());
                    // SqlParser.g:205:62: ( $offset)?
                    if ( stream_offset.hasNext() ) {
                        adaptor.addChild(root_2, stream_offset.nextNode());

                    }
                    stream_offset.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_offset.reset();
                stream_LIMIT.reset();
                stream_limit.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "select_stmt"

    public static class select_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "select_list"
    // SqlParser.g:208:1: select_list : select_core ( select_op select_core )* ;
    public final SqlParser.select_list_return select_list() throws RecognitionException {
        SqlParser.select_list_return retval = new SqlParser.select_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.select_core_return select_core189 = null;

        SqlParser.select_op_return select_op190 = null;

        SqlParser.select_core_return select_core191 = null;



        try {
            // SqlParser.g:208:12: ( select_core ( select_op select_core )* )
            // SqlParser.g:209:3: select_core ( select_op select_core )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_select_core_in_select_list1709);
            select_core189=select_core();

            state._fsp--;

            adaptor.addChild(root_0, select_core189.getTree());
            // SqlParser.g:209:15: ( select_op select_core )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==EXCEPT||LA61_0==INTERSECT||LA61_0==UNION) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // SqlParser.g:209:16: select_op select_core
            	    {
            	    pushFollow(FOLLOW_select_op_in_select_list1712);
            	    select_op190=select_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(select_op190.getTree(), root_0);
            	    pushFollow(FOLLOW_select_core_in_select_list1715);
            	    select_core191=select_core();

            	    state._fsp--;

            	    adaptor.addChild(root_0, select_core191.getTree());

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "select_list"

    public static class select_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "select_op"
    // SqlParser.g:211:1: select_op : ( UNION ( ALL )? | INTERSECT | EXCEPT );
    public final SqlParser.select_op_return select_op() throws RecognitionException {
        SqlParser.select_op_return retval = new SqlParser.select_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNION192=null;
        Token ALL193=null;
        Token INTERSECT194=null;
        Token EXCEPT195=null;

        Object UNION192_tree=null;
        Object ALL193_tree=null;
        Object INTERSECT194_tree=null;
        Object EXCEPT195_tree=null;

        try {
            // SqlParser.g:211:10: ( UNION ( ALL )? | INTERSECT | EXCEPT )
            int alt63=3;
            switch ( input.LA(1) ) {
            case UNION:
                {
                alt63=1;
                }
                break;
            case INTERSECT:
                {
                alt63=2;
                }
                break;
            case EXCEPT:
                {
                alt63=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // SqlParser.g:211:12: UNION ( ALL )?
                    {
                    root_0 = (Object)adaptor.nil();

                    UNION192=(Token)match(input,UNION,FOLLOW_UNION_in_select_op1724); 
                    UNION192_tree = (Object)adaptor.create(UNION192);
                    root_0 = (Object)adaptor.becomeRoot(UNION192_tree, root_0);

                    // SqlParser.g:211:19: ( ALL )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==ALL) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // SqlParser.g:211:20: ALL
                            {
                            ALL193=(Token)match(input,ALL,FOLLOW_ALL_in_select_op1728); 
                            ALL193_tree = (Object)adaptor.create(ALL193);
                            adaptor.addChild(root_0, ALL193_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:211:28: INTERSECT
                    {
                    root_0 = (Object)adaptor.nil();

                    INTERSECT194=(Token)match(input,INTERSECT,FOLLOW_INTERSECT_in_select_op1734); 
                    INTERSECT194_tree = (Object)adaptor.create(INTERSECT194);
                    adaptor.addChild(root_0, INTERSECT194_tree);


                    }
                    break;
                case 3 :
                    // SqlParser.g:211:40: EXCEPT
                    {
                    root_0 = (Object)adaptor.nil();

                    EXCEPT195=(Token)match(input,EXCEPT,FOLLOW_EXCEPT_in_select_op1738); 
                    EXCEPT195_tree = (Object)adaptor.create(EXCEPT195);
                    adaptor.addChild(root_0, EXCEPT195_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "select_op"

    public static class select_core_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "select_core"
    // SqlParser.g:213:1: select_core : SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )? -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? ) ;
    public final SqlParser.select_core_return select_core() throws RecognitionException {
        SqlParser.select_core_return retval = new SqlParser.select_core_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SELECT196=null;
        Token ALL197=null;
        Token DISTINCT198=null;
        Token COMMA200=null;
        Token FROM202=null;
        Token WHERE204=null;
        Token GROUP205=null;
        Token BY206=null;
        Token COMMA208=null;
        Token HAVING210=null;
        SqlParser.expr_return where_expr = null;

        SqlParser.expr_return having_expr = null;

        SqlParser.result_column_return result_column199 = null;

        SqlParser.result_column_return result_column201 = null;

        SqlParser.join_source_return join_source203 = null;

        SqlParser.ordering_term_return ordering_term207 = null;

        SqlParser.ordering_term_return ordering_term209 = null;


        Object SELECT196_tree=null;
        Object ALL197_tree=null;
        Object DISTINCT198_tree=null;
        Object COMMA200_tree=null;
        Object FROM202_tree=null;
        Object WHERE204_tree=null;
        Object GROUP205_tree=null;
        Object BY206_tree=null;
        Object COMMA208_tree=null;
        Object HAVING210_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleTokenStream stream_GROUP=new RewriteRuleTokenStream(adaptor,"token GROUP");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_HAVING=new RewriteRuleTokenStream(adaptor,"token HAVING");
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_SELECT=new RewriteRuleTokenStream(adaptor,"token SELECT");
        RewriteRuleTokenStream stream_DISTINCT=new RewriteRuleTokenStream(adaptor,"token DISTINCT");
        RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");
        RewriteRuleSubtreeStream stream_ordering_term=new RewriteRuleSubtreeStream(adaptor,"rule ordering_term");
        RewriteRuleSubtreeStream stream_result_column=new RewriteRuleSubtreeStream(adaptor,"rule result_column");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_join_source=new RewriteRuleSubtreeStream(adaptor,"rule join_source");
        try {
            // SqlParser.g:213:12: ( SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )? -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? ) )
            // SqlParser.g:214:3: SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )?
            {
            SELECT196=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_core1747);  
            stream_SELECT.add(SELECT196);

            // SqlParser.g:214:10: ( ALL | DISTINCT )?
            int alt64=3;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==ALL) ) {
                int LA64_1 = input.LA(2);

                if ( ((LA64_1>=PLUS && LA64_1<=ASTERISK)||LA64_1==LPAREN||(LA64_1>=QUESTION && LA64_1<=AT)||(LA64_1>=ABORT && LA64_1<=FROM)||(LA64_1>=GROUP && LA64_1<=IMMEDIATE)||(LA64_1>=INDEX && LA64_1<=IS)||(LA64_1>=JOIN && LA64_1<=LEFT)||LA64_1==LIMIT||(LA64_1>=NATURAL && LA64_1<=NOT)||(LA64_1>=NULL && LA64_1<=REFERENCES)||(LA64_1>=REINDEX && LA64_1<=WHERE)||(LA64_1>=ID && LA64_1<=INTEGER)||(LA64_1>=FLOAT && LA64_1<=BLOB)) ) {
                    alt64=1;
                }
            }
            else if ( (LA64_0==DISTINCT) ) {
                int LA64_2 = input.LA(2);

                if ( ((LA64_2>=PLUS && LA64_2<=ASTERISK)||LA64_2==LPAREN||(LA64_2>=QUESTION && LA64_2<=AT)||(LA64_2>=ABORT && LA64_2<=FROM)||(LA64_2>=GROUP && LA64_2<=IMMEDIATE)||(LA64_2>=INDEX && LA64_2<=IS)||(LA64_2>=JOIN && LA64_2<=LEFT)||LA64_2==LIMIT||(LA64_2>=NATURAL && LA64_2<=NOT)||(LA64_2>=NULL && LA64_2<=REFERENCES)||(LA64_2>=REINDEX && LA64_2<=WHERE)||(LA64_2>=ID && LA64_2<=INTEGER)||(LA64_2>=FLOAT && LA64_2<=BLOB)) ) {
                    alt64=2;
                }
            }
            switch (alt64) {
                case 1 :
                    // SqlParser.g:214:11: ALL
                    {
                    ALL197=(Token)match(input,ALL,FOLLOW_ALL_in_select_core1750);  
                    stream_ALL.add(ALL197);


                    }
                    break;
                case 2 :
                    // SqlParser.g:214:17: DISTINCT
                    {
                    DISTINCT198=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_select_core1754);  
                    stream_DISTINCT.add(DISTINCT198);


                    }
                    break;

            }

            pushFollow(FOLLOW_result_column_in_select_core1758);
            result_column199=result_column();

            state._fsp--;

            stream_result_column.add(result_column199.getTree());
            // SqlParser.g:214:42: ( COMMA result_column )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==COMMA) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // SqlParser.g:214:43: COMMA result_column
            	    {
            	    COMMA200=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_core1761);  
            	    stream_COMMA.add(COMMA200);

            	    pushFollow(FOLLOW_result_column_in_select_core1763);
            	    result_column201=result_column();

            	    state._fsp--;

            	    stream_result_column.add(result_column201.getTree());

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            // SqlParser.g:214:65: ( FROM join_source )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==FROM) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // SqlParser.g:214:66: FROM join_source
                    {
                    FROM202=(Token)match(input,FROM,FOLLOW_FROM_in_select_core1768);  
                    stream_FROM.add(FROM202);

                    pushFollow(FOLLOW_join_source_in_select_core1770);
                    join_source203=join_source();

                    state._fsp--;

                    stream_join_source.add(join_source203.getTree());

                    }
                    break;

            }

            // SqlParser.g:214:85: ( WHERE where_expr= expr )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==WHERE) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // SqlParser.g:214:86: WHERE where_expr= expr
                    {
                    WHERE204=(Token)match(input,WHERE,FOLLOW_WHERE_in_select_core1775);  
                    stream_WHERE.add(WHERE204);

                    pushFollow(FOLLOW_expr_in_select_core1779);
                    where_expr=expr();

                    state._fsp--;

                    stream_expr.add(where_expr.getTree());

                    }
                    break;

            }

            // SqlParser.g:215:3: ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==GROUP) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // SqlParser.g:215:5: GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )?
                    {
                    GROUP205=(Token)match(input,GROUP,FOLLOW_GROUP_in_select_core1787);  
                    stream_GROUP.add(GROUP205);

                    BY206=(Token)match(input,BY,FOLLOW_BY_in_select_core1789);  
                    stream_BY.add(BY206);

                    pushFollow(FOLLOW_ordering_term_in_select_core1791);
                    ordering_term207=ordering_term();

                    state._fsp--;

                    stream_ordering_term.add(ordering_term207.getTree());
                    // SqlParser.g:215:28: ( COMMA ordering_term )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==COMMA) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // SqlParser.g:215:29: COMMA ordering_term
                    	    {
                    	    COMMA208=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_core1794);  
                    	    stream_COMMA.add(COMMA208);

                    	    pushFollow(FOLLOW_ordering_term_in_select_core1796);
                    	    ordering_term209=ordering_term();

                    	    state._fsp--;

                    	    stream_ordering_term.add(ordering_term209.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);

                    // SqlParser.g:215:51: ( HAVING having_expr= expr )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==HAVING) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // SqlParser.g:215:52: HAVING having_expr= expr
                            {
                            HAVING210=(Token)match(input,HAVING,FOLLOW_HAVING_in_select_core1801);  
                            stream_HAVING.add(HAVING210);

                            pushFollow(FOLLOW_expr_in_select_core1805);
                            having_expr=expr();

                            state._fsp--;

                            stream_expr.add(having_expr.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: DISTINCT, HAVING, ordering_term, FROM, join_source, WHERE, where_expr, result_column, having_expr, GROUP
            // token labels: 
            // rule labels: retval, having_expr, where_expr
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_having_expr=new RewriteRuleSubtreeStream(adaptor,"rule having_expr",having_expr!=null?having_expr.tree:null);
            RewriteRuleSubtreeStream stream_where_expr=new RewriteRuleSubtreeStream(adaptor,"rule where_expr",where_expr!=null?where_expr.tree:null);

            root_0 = (Object)adaptor.nil();
            // 216:1: -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? )
            {
                // SqlParser.g:216:4: ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECT_CORE, "SELECT_CORE"), root_1);

                // SqlParser.g:217:15: ( DISTINCT )?
                if ( stream_DISTINCT.hasNext() ) {
                    adaptor.addChild(root_1, stream_DISTINCT.nextNode());

                }
                stream_DISTINCT.reset();
                // SqlParser.g:217:27: ^( COLUMNS ( result_column )+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMNS, "COLUMNS"), root_2);

                if ( !(stream_result_column.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_result_column.hasNext() ) {
                    adaptor.addChild(root_2, stream_result_column.nextTree());

                }
                stream_result_column.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:217:53: ( ^( FROM join_source ) )?
                if ( stream_FROM.hasNext()||stream_join_source.hasNext() ) {
                    // SqlParser.g:217:53: ^( FROM join_source )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_FROM.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_join_source.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_FROM.reset();
                stream_join_source.reset();
                // SqlParser.g:217:74: ( ^( WHERE $where_expr) )?
                if ( stream_WHERE.hasNext()||stream_where_expr.hasNext() ) {
                    // SqlParser.g:217:74: ^( WHERE $where_expr)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_WHERE.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_where_expr.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_WHERE.reset();
                stream_where_expr.reset();
                // SqlParser.g:218:3: ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )?
                if ( stream_HAVING.hasNext()||stream_ordering_term.hasNext()||stream_having_expr.hasNext()||stream_GROUP.hasNext() ) {
                    // SqlParser.g:218:3: ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_GROUP.nextNode(), root_2);

                    if ( !(stream_ordering_term.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_ordering_term.hasNext() ) {
                        adaptor.addChild(root_2, stream_ordering_term.nextTree());

                    }
                    stream_ordering_term.reset();
                    // SqlParser.g:218:26: ( ^( HAVING $having_expr) )?
                    if ( stream_HAVING.hasNext()||stream_having_expr.hasNext() ) {
                        // SqlParser.g:218:26: ^( HAVING $having_expr)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_HAVING.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_having_expr.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                    }
                    stream_HAVING.reset();
                    stream_having_expr.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_HAVING.reset();
                stream_ordering_term.reset();
                stream_having_expr.reset();
                stream_GROUP.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "select_core"

    public static class result_column_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "result_column"
    // SqlParser.g:221:1: result_column : ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) );
    public final SqlParser.result_column_return result_column() throws RecognitionException {
        SqlParser.result_column_return retval = new SqlParser.result_column_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASTERISK211=null;
        Token DOT212=null;
        Token ASTERISK213=null;
        Token AS215=null;
        SqlParser.id_return table_name = null;

        SqlParser.id_return column_alias = null;

        SqlParser.expr_return expr214 = null;


        Object ASTERISK211_tree=null;
        Object DOT212_tree=null;
        Object ASTERISK213_tree=null;
        Object AS215_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // SqlParser.g:222:3: ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) )
            int alt73=3;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // SqlParser.g:222:5: ASTERISK
                    {
                    root_0 = (Object)adaptor.nil();

                    ASTERISK211=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_result_column1875); 
                    ASTERISK211_tree = (Object)adaptor.create(ASTERISK211);
                    adaptor.addChild(root_0, ASTERISK211_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:223:5: table_name= id DOT ASTERISK
                    {
                    pushFollow(FOLLOW_id_in_result_column1883);
                    table_name=id();

                    state._fsp--;

                    stream_id.add(table_name.getTree());
                    DOT212=(Token)match(input,DOT,FOLLOW_DOT_in_result_column1885);  
                    stream_DOT.add(DOT212);

                    ASTERISK213=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_result_column1887);  
                    stream_ASTERISK.add(ASTERISK213);



                    // AST REWRITE
                    // elements: table_name, ASTERISK
                    // token labels: 
                    // rule labels: retval, table_name
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 223:32: -> ^( ASTERISK $table_name)
                    {
                        // SqlParser.g:223:35: ^( ASTERISK $table_name)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_ASTERISK.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_table_name.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // SqlParser.g:224:5: expr ( ( AS )? column_alias= id )?
                    {
                    pushFollow(FOLLOW_expr_in_result_column1902);
                    expr214=expr();

                    state._fsp--;

                    stream_expr.add(expr214.getTree());
                    // SqlParser.g:224:10: ( ( AS )? column_alias= id )?
                    int alt72=2;
                    alt72 = dfa72.predict(input);
                    switch (alt72) {
                        case 1 :
                            // SqlParser.g:224:11: ( AS )? column_alias= id
                            {
                            // SqlParser.g:224:11: ( AS )?
                            int alt71=2;
                            alt71 = dfa71.predict(input);
                            switch (alt71) {
                                case 1 :
                                    // SqlParser.g:224:12: AS
                                    {
                                    AS215=(Token)match(input,AS,FOLLOW_AS_in_result_column1906);  
                                    stream_AS.add(AS215);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_id_in_result_column1912);
                            column_alias=id();

                            state._fsp--;

                            stream_id.add(column_alias.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: column_alias, expr
                    // token labels: 
                    // rule labels: retval, column_alias
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_column_alias=new RewriteRuleSubtreeStream(adaptor,"rule column_alias",column_alias!=null?column_alias.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 224:35: -> ^( ALIAS expr ( $column_alias)? )
                    {
                        // SqlParser.g:224:38: ^( ALIAS expr ( $column_alias)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // SqlParser.g:224:51: ( $column_alias)?
                        if ( stream_column_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_column_alias.nextTree());

                        }
                        stream_column_alias.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "result_column"

    public static class join_source_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "join_source"
    // SqlParser.g:226:1: join_source : single_source ( join_op single_source ( join_constraint )? )* ;
    public final SqlParser.join_source_return join_source() throws RecognitionException {
        SqlParser.join_source_return retval = new SqlParser.join_source_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.single_source_return single_source216 = null;

        SqlParser.join_op_return join_op217 = null;

        SqlParser.single_source_return single_source218 = null;

        SqlParser.join_constraint_return join_constraint219 = null;



        try {
            // SqlParser.g:226:12: ( single_source ( join_op single_source ( join_constraint )? )* )
            // SqlParser.g:226:14: single_source ( join_op single_source ( join_constraint )? )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_single_source_in_join_source1933);
            single_source216=single_source();

            state._fsp--;

            adaptor.addChild(root_0, single_source216.getTree());
            // SqlParser.g:226:28: ( join_op single_source ( join_constraint )? )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==COMMA||LA75_0==CROSS||LA75_0==INNER||LA75_0==JOIN||LA75_0==LEFT||LA75_0==NATURAL||LA75_0==OUTER) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // SqlParser.g:226:29: join_op single_source ( join_constraint )?
            	    {
            	    pushFollow(FOLLOW_join_op_in_join_source1936);
            	    join_op217=join_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(join_op217.getTree(), root_0);
            	    pushFollow(FOLLOW_single_source_in_join_source1939);
            	    single_source218=single_source();

            	    state._fsp--;

            	    adaptor.addChild(root_0, single_source218.getTree());
            	    // SqlParser.g:226:52: ( join_constraint )?
            	    int alt74=2;
            	    int LA74_0 = input.LA(1);

            	    if ( (LA74_0==ON||LA74_0==USING) ) {
            	        alt74=1;
            	    }
            	    switch (alt74) {
            	        case 1 :
            	            // SqlParser.g:226:53: join_constraint
            	            {
            	            pushFollow(FOLLOW_join_constraint_in_join_source1942);
            	            join_constraint219=join_constraint();

            	            state._fsp--;

            	            adaptor.addChild(root_0, join_constraint219.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "join_source"

    public static class single_source_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "single_source"
    // SqlParser.g:228:1: single_source : ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN );
    public final SqlParser.single_source_return single_source() throws RecognitionException {
        SqlParser.single_source_return retval = new SqlParser.single_source_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token table_name=null;
        Token table_alias=null;
        Token DOT220=null;
        Token AS221=null;
        Token INDEXED222=null;
        Token BY223=null;
        Token NOT224=null;
        Token INDEXED225=null;
        Token LPAREN226=null;
        Token RPAREN228=null;
        Token AS229=null;
        Token LPAREN230=null;
        Token RPAREN232=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return index_name = null;

        SqlParser.select_stmt_return select_stmt227 = null;

        SqlParser.join_source_return join_source231 = null;


        Object table_name_tree=null;
        Object table_alias_tree=null;
        Object DOT220_tree=null;
        Object AS221_tree=null;
        Object INDEXED222_tree=null;
        Object BY223_tree=null;
        Object NOT224_tree=null;
        Object INDEXED225_tree=null;
        Object LPAREN226_tree=null;
        Object RPAREN228_tree=null;
        Object AS229_tree=null;
        Object LPAREN230_tree=null;
        Object RPAREN232_tree=null;
        RewriteRuleTokenStream stream_INDEXED=new RewriteRuleTokenStream(adaptor,"token INDEXED");
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_select_stmt=new RewriteRuleSubtreeStream(adaptor,"rule select_stmt");
        try {
            // SqlParser.g:229:3: ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN )
            int alt82=3;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=ABORT && LA82_0<=FROM)||(LA82_0>=GROUP && LA82_0<=IMMEDIATE)||(LA82_0>=INDEX && LA82_0<=IS)||(LA82_0>=JOIN && LA82_0<=LEFT)||LA82_0==LIMIT||LA82_0==NATURAL||(LA82_0>=NULL && LA82_0<=REFERENCES)||(LA82_0>=REINDEX && LA82_0<=WHERE)||LA82_0==ID) ) {
                alt82=1;
            }
            else if ( (LA82_0==LPAREN) ) {
                int LA82_2 = input.LA(2);

                if ( (LA82_2==SELECT) ) {
                    int LA82_3 = input.LA(3);

                    if ( ((LA82_3>=PLUS && LA82_3<=ASTERISK)||LA82_3==LPAREN||(LA82_3>=QUESTION && LA82_3<=AT)||(LA82_3>=ABORT && LA82_3<=FROM)||(LA82_3>=GROUP && LA82_3<=IMMEDIATE)||(LA82_3>=INDEX && LA82_3<=IS)||(LA82_3>=JOIN && LA82_3<=LEFT)||LA82_3==LIMIT||(LA82_3>=NATURAL && LA82_3<=NOT)||(LA82_3>=NULL && LA82_3<=REFERENCES)||(LA82_3>=REINDEX && LA82_3<=WHERE)||(LA82_3>=ID && LA82_3<=INTEGER)||(LA82_3>=FLOAT && LA82_3<=BLOB)) ) {
                        alt82=2;
                    }
                    else if ( (LA82_3==DOT) ) {
                        alt82=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 82, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA82_2==LPAREN||(LA82_2>=ABORT && LA82_2<=FROM)||(LA82_2>=GROUP && LA82_2<=IMMEDIATE)||(LA82_2>=INDEX && LA82_2<=IS)||(LA82_2>=JOIN && LA82_2<=LEFT)||LA82_2==LIMIT||LA82_2==NATURAL||(LA82_2>=NULL && LA82_2<=REFERENCES)||(LA82_2>=REINDEX && LA82_2<=SAVEPOINT)||(LA82_2>=SET && LA82_2<=WHERE)||LA82_2==ID) ) {
                    alt82=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // SqlParser.g:229:5: (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )?
                    {
                    // SqlParser.g:229:5: (database_name= id DOT )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==ID) ) {
                        int LA76_1 = input.LA(2);

                        if ( (LA76_1==DOT) ) {
                            alt76=1;
                        }
                    }
                    else if ( ((LA76_0>=ABORT && LA76_0<=FROM)||(LA76_0>=GROUP && LA76_0<=IMMEDIATE)||(LA76_0>=INDEX && LA76_0<=IS)||(LA76_0>=JOIN && LA76_0<=LEFT)||LA76_0==LIMIT||LA76_0==NATURAL||(LA76_0>=NULL && LA76_0<=REFERENCES)||(LA76_0>=REINDEX && LA76_0<=WHERE)) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // SqlParser.g:229:6: database_name= id DOT
                            {
                            pushFollow(FOLLOW_id_in_single_source1959);
                            database_name=id();

                            state._fsp--;

                            stream_id.add(database_name.getTree());
                            DOT220=(Token)match(input,DOT,FOLLOW_DOT_in_single_source1961);  
                            stream_DOT.add(DOT220);


                            }
                            break;

                    }

                    table_name=(Token)match(input,ID,FOLLOW_ID_in_single_source1967);  
                    stream_ID.add(table_name);

                    // SqlParser.g:229:43: ( ( AS )? table_alias= ID )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==AS||LA78_0==ID) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // SqlParser.g:229:44: ( AS )? table_alias= ID
                            {
                            // SqlParser.g:229:44: ( AS )?
                            int alt77=2;
                            int LA77_0 = input.LA(1);

                            if ( (LA77_0==AS) ) {
                                alt77=1;
                            }
                            switch (alt77) {
                                case 1 :
                                    // SqlParser.g:229:45: AS
                                    {
                                    AS221=(Token)match(input,AS,FOLLOW_AS_in_single_source1971);  
                                    stream_AS.add(AS221);


                                    }
                                    break;

                            }

                            table_alias=(Token)match(input,ID,FOLLOW_ID_in_single_source1977);  
                            stream_ID.add(table_alias);


                            }
                            break;

                    }

                    // SqlParser.g:229:67: ( INDEXED BY index_name= id | NOT INDEXED )?
                    int alt79=3;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==INDEXED) ) {
                        alt79=1;
                    }
                    else if ( (LA79_0==NOT) ) {
                        alt79=2;
                    }
                    switch (alt79) {
                        case 1 :
                            // SqlParser.g:229:68: INDEXED BY index_name= id
                            {
                            INDEXED222=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_single_source1982);  
                            stream_INDEXED.add(INDEXED222);

                            BY223=(Token)match(input,BY,FOLLOW_BY_in_single_source1984);  
                            stream_BY.add(BY223);

                            pushFollow(FOLLOW_id_in_single_source1988);
                            index_name=id();

                            state._fsp--;

                            stream_id.add(index_name.getTree());

                            }
                            break;
                        case 2 :
                            // SqlParser.g:229:95: NOT INDEXED
                            {
                            NOT224=(Token)match(input,NOT,FOLLOW_NOT_in_single_source1992);  
                            stream_NOT.add(NOT224);

                            INDEXED225=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_single_source1994);  
                            stream_INDEXED.add(INDEXED225);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: database_name, table_name, NOT, table_alias, index_name, INDEXED
                    // token labels: table_name, table_alias
                    // rule labels: index_name, database_name, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_table_name=new RewriteRuleTokenStream(adaptor,"token table_name",table_name);
                    RewriteRuleTokenStream stream_table_alias=new RewriteRuleTokenStream(adaptor,"token table_alias",table_alias);
                    RewriteRuleSubtreeStream stream_index_name=new RewriteRuleSubtreeStream(adaptor,"rule index_name",index_name!=null?index_name.tree:null);
                    RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 230:3: -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? )
                    {
                        // SqlParser.g:230:6: ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        // SqlParser.g:230:14: ^( $table_name ( $database_name)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                        // SqlParser.g:230:28: ( $database_name)?
                        if ( stream_database_name.hasNext() ) {
                            adaptor.addChild(root_2, stream_database_name.nextTree());

                        }
                        stream_database_name.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // SqlParser.g:230:45: ( $table_alias)?
                        if ( stream_table_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_table_alias.nextNode());

                        }
                        stream_table_alias.reset();
                        // SqlParser.g:230:59: ( ^( INDEXED ( NOT )? ( $index_name)? ) )?
                        if ( stream_NOT.hasNext()||stream_index_name.hasNext()||stream_INDEXED.hasNext() ) {
                            // SqlParser.g:230:59: ^( INDEXED ( NOT )? ( $index_name)? )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(stream_INDEXED.nextNode(), root_2);

                            // SqlParser.g:230:69: ( NOT )?
                            if ( stream_NOT.hasNext() ) {
                                adaptor.addChild(root_2, stream_NOT.nextNode());

                            }
                            stream_NOT.reset();
                            // SqlParser.g:230:74: ( $index_name)?
                            if ( stream_index_name.hasNext() ) {
                                adaptor.addChild(root_2, stream_index_name.nextTree());

                            }
                            stream_index_name.reset();

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_NOT.reset();
                        stream_index_name.reset();
                        stream_INDEXED.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // SqlParser.g:231:5: LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )?
                    {
                    LPAREN226=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_single_source2035);  
                    stream_LPAREN.add(LPAREN226);

                    pushFollow(FOLLOW_select_stmt_in_single_source2037);
                    select_stmt227=select_stmt();

                    state._fsp--;

                    stream_select_stmt.add(select_stmt227.getTree());
                    RPAREN228=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_single_source2039);  
                    stream_RPAREN.add(RPAREN228);

                    // SqlParser.g:231:31: ( ( AS )? table_alias= ID )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==AS||LA81_0==ID) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // SqlParser.g:231:32: ( AS )? table_alias= ID
                            {
                            // SqlParser.g:231:32: ( AS )?
                            int alt80=2;
                            int LA80_0 = input.LA(1);

                            if ( (LA80_0==AS) ) {
                                alt80=1;
                            }
                            switch (alt80) {
                                case 1 :
                                    // SqlParser.g:231:33: AS
                                    {
                                    AS229=(Token)match(input,AS,FOLLOW_AS_in_single_source2043);  
                                    stream_AS.add(AS229);


                                    }
                                    break;

                            }

                            table_alias=(Token)match(input,ID,FOLLOW_ID_in_single_source2049);  
                            stream_ID.add(table_alias);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: table_alias, select_stmt
                    // token labels: table_alias
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_table_alias=new RewriteRuleTokenStream(adaptor,"token table_alias",table_alias);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 232:3: -> ^( ALIAS select_stmt ( $table_alias)? )
                    {
                        // SqlParser.g:232:6: ^( ALIAS select_stmt ( $table_alias)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        adaptor.addChild(root_1, stream_select_stmt.nextTree());
                        // SqlParser.g:232:26: ( $table_alias)?
                        if ( stream_table_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_table_alias.nextNode());

                        }
                        stream_table_alias.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // SqlParser.g:233:5: LPAREN join_source RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN230=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_single_source2071); 
                    pushFollow(FOLLOW_join_source_in_single_source2074);
                    join_source231=join_source();

                    state._fsp--;

                    adaptor.addChild(root_0, join_source231.getTree());
                    RPAREN232=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_single_source2076); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "single_source"

    public static class join_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "join_op"
    // SqlParser.g:235:1: join_op : ( COMMA | ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN );
    public final SqlParser.join_op_return join_op() throws RecognitionException {
        SqlParser.join_op_return retval = new SqlParser.join_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA233=null;
        Token NATURAL234=null;
        Token LEFT235=null;
        Token OUTER236=null;
        Token INNER237=null;
        Token CROSS238=null;
        Token JOIN239=null;

        Object COMMA233_tree=null;
        Object NATURAL234_tree=null;
        Object LEFT235_tree=null;
        Object OUTER236_tree=null;
        Object INNER237_tree=null;
        Object CROSS238_tree=null;
        Object JOIN239_tree=null;

        try {
            // SqlParser.g:236:3: ( COMMA | ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==COMMA) ) {
                alt87=1;
            }
            else if ( (LA87_0==CROSS||LA87_0==INNER||LA87_0==JOIN||LA87_0==LEFT||LA87_0==NATURAL||LA87_0==OUTER) ) {
                alt87=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // SqlParser.g:236:5: COMMA
                    {
                    root_0 = (Object)adaptor.nil();

                    COMMA233=(Token)match(input,COMMA,FOLLOW_COMMA_in_join_op2087); 
                    COMMA233_tree = (Object)adaptor.create(COMMA233);
                    adaptor.addChild(root_0, COMMA233_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:237:5: ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:237:5: ( NATURAL )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==NATURAL) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // SqlParser.g:237:6: NATURAL
                            {
                            NATURAL234=(Token)match(input,NATURAL,FOLLOW_NATURAL_in_join_op2094); 
                            NATURAL234_tree = (Object)adaptor.create(NATURAL234);
                            adaptor.addChild(root_0, NATURAL234_tree);


                            }
                            break;

                    }

                    // SqlParser.g:237:16: ( ( LEFT )? ( OUTER )? | INNER | CROSS )
                    int alt86=3;
                    switch ( input.LA(1) ) {
                    case JOIN:
                    case LEFT:
                    case OUTER:
                        {
                        alt86=1;
                        }
                        break;
                    case INNER:
                        {
                        alt86=2;
                        }
                        break;
                    case CROSS:
                        {
                        alt86=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 86, 0, input);

                        throw nvae;
                    }

                    switch (alt86) {
                        case 1 :
                            // SqlParser.g:237:17: ( LEFT )? ( OUTER )?
                            {
                            // SqlParser.g:237:17: ( LEFT )?
                            int alt84=2;
                            int LA84_0 = input.LA(1);

                            if ( (LA84_0==LEFT) ) {
                                alt84=1;
                            }
                            switch (alt84) {
                                case 1 :
                                    // SqlParser.g:237:18: LEFT
                                    {
                                    LEFT235=(Token)match(input,LEFT,FOLLOW_LEFT_in_join_op2100); 
                                    LEFT235_tree = (Object)adaptor.create(LEFT235);
                                    adaptor.addChild(root_0, LEFT235_tree);


                                    }
                                    break;

                            }

                            // SqlParser.g:237:25: ( OUTER )?
                            int alt85=2;
                            int LA85_0 = input.LA(1);

                            if ( (LA85_0==OUTER) ) {
                                alt85=1;
                            }
                            switch (alt85) {
                                case 1 :
                                    // SqlParser.g:237:26: OUTER
                                    {
                                    OUTER236=(Token)match(input,OUTER,FOLLOW_OUTER_in_join_op2105); 
                                    OUTER236_tree = (Object)adaptor.create(OUTER236);
                                    adaptor.addChild(root_0, OUTER236_tree);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // SqlParser.g:237:36: INNER
                            {
                            INNER237=(Token)match(input,INNER,FOLLOW_INNER_in_join_op2111); 
                            INNER237_tree = (Object)adaptor.create(INNER237);
                            adaptor.addChild(root_0, INNER237_tree);


                            }
                            break;
                        case 3 :
                            // SqlParser.g:237:44: CROSS
                            {
                            CROSS238=(Token)match(input,CROSS,FOLLOW_CROSS_in_join_op2115); 
                            CROSS238_tree = (Object)adaptor.create(CROSS238);
                            adaptor.addChild(root_0, CROSS238_tree);


                            }
                            break;

                    }

                    JOIN239=(Token)match(input,JOIN,FOLLOW_JOIN_in_join_op2118); 
                    JOIN239_tree = (Object)adaptor.create(JOIN239);
                    root_0 = (Object)adaptor.becomeRoot(JOIN239_tree, root_0);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "join_op"

    public static class join_constraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "join_constraint"
    // SqlParser.g:239:1: join_constraint : ( ON expr | USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN -> ^( USING ( $column_names)+ ) );
    public final SqlParser.join_constraint_return join_constraint() throws RecognitionException {
        SqlParser.join_constraint_return retval = new SqlParser.join_constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ON240=null;
        Token USING242=null;
        Token LPAREN243=null;
        Token COMMA244=null;
        Token RPAREN245=null;
        List list_column_names=null;
        SqlParser.expr_return expr241 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object ON240_tree=null;
        Object USING242_tree=null;
        Object LPAREN243_tree=null;
        Object COMMA244_tree=null;
        Object RPAREN245_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // SqlParser.g:240:3: ( ON expr | USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN -> ^( USING ( $column_names)+ ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==ON) ) {
                alt89=1;
            }
            else if ( (LA89_0==USING) ) {
                alt89=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // SqlParser.g:240:5: ON expr
                    {
                    root_0 = (Object)adaptor.nil();

                    ON240=(Token)match(input,ON,FOLLOW_ON_in_join_constraint2129); 
                    ON240_tree = (Object)adaptor.create(ON240);
                    root_0 = (Object)adaptor.becomeRoot(ON240_tree, root_0);

                    pushFollow(FOLLOW_expr_in_join_constraint2132);
                    expr241=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr241.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:241:5: USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                    {
                    USING242=(Token)match(input,USING,FOLLOW_USING_in_join_constraint2138);  
                    stream_USING.add(USING242);

                    LPAREN243=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_join_constraint2140);  
                    stream_LPAREN.add(LPAREN243);

                    pushFollow(FOLLOW_id_in_join_constraint2144);
                    column_names=id();

                    state._fsp--;

                    stream_id.add(column_names.getTree());
                    if (list_column_names==null) list_column_names=new ArrayList();
                    list_column_names.add(column_names.getTree());

                    // SqlParser.g:241:35: ( COMMA column_names+= id )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==COMMA) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // SqlParser.g:241:36: COMMA column_names+= id
                    	    {
                    	    COMMA244=(Token)match(input,COMMA,FOLLOW_COMMA_in_join_constraint2147);  
                    	    stream_COMMA.add(COMMA244);

                    	    pushFollow(FOLLOW_id_in_join_constraint2151);
                    	    column_names=id();

                    	    state._fsp--;

                    	    stream_id.add(column_names.getTree());
                    	    if (list_column_names==null) list_column_names=new ArrayList();
                    	    list_column_names.add(column_names.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);

                    RPAREN245=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_join_constraint2155);  
                    stream_RPAREN.add(RPAREN245);



                    // AST REWRITE
                    // elements: USING, column_names
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: column_names
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_column_names=new RewriteRuleSubtreeStream(adaptor,"token column_names",list_column_names);
                    root_0 = (Object)adaptor.nil();
                    // 241:68: -> ^( USING ( $column_names)+ )
                    {
                        // SqlParser.g:241:71: ^( USING ( $column_names)+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_USING.nextNode(), root_1);

                        if ( !(stream_column_names.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_column_names.hasNext() ) {
                            adaptor.addChild(root_1, stream_column_names.nextTree());

                        }
                        stream_column_names.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "join_constraint"

    public static class insert_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "insert_stmt"
    // SqlParser.g:244:1: insert_stmt : ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES ) ;
    public final SqlParser.insert_stmt_return insert_stmt() throws RecognitionException {
        SqlParser.insert_stmt_return retval = new SqlParser.insert_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSERT246=null;
        Token REPLACE248=null;
        Token INTO249=null;
        Token DOT250=null;
        Token LPAREN251=null;
        Token COMMA252=null;
        Token RPAREN253=null;
        Token VALUES254=null;
        Token LPAREN255=null;
        Token COMMA256=null;
        Token RPAREN257=null;
        Token DEFAULT259=null;
        Token VALUES260=null;
        List list_column_names=null;
        List list_values=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.operation_conflict_clause_return operation_conflict_clause247 = null;

        SqlParser.select_stmt_return select_stmt258 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        SqlParser.expr_return values = null;
         values = null;
        Object INSERT246_tree=null;
        Object REPLACE248_tree=null;
        Object INTO249_tree=null;
        Object DOT250_tree=null;
        Object LPAREN251_tree=null;
        Object COMMA252_tree=null;
        Object RPAREN253_tree=null;
        Object VALUES254_tree=null;
        Object LPAREN255_tree=null;
        Object COMMA256_tree=null;
        Object RPAREN257_tree=null;
        Object DEFAULT259_tree=null;
        Object VALUES260_tree=null;

        try {
            // SqlParser.g:244:12: ( ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES ) )
            // SqlParser.g:244:14: ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES )
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:244:14: ( INSERT ( operation_conflict_clause )? | REPLACE )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==INSERT) ) {
                alt91=1;
            }
            else if ( (LA91_0==REPLACE) ) {
                alt91=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // SqlParser.g:244:15: INSERT ( operation_conflict_clause )?
                    {
                    INSERT246=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_stmt2174); 
                    INSERT246_tree = (Object)adaptor.create(INSERT246);
                    adaptor.addChild(root_0, INSERT246_tree);

                    // SqlParser.g:244:22: ( operation_conflict_clause )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==OR) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // SqlParser.g:244:23: operation_conflict_clause
                            {
                            pushFollow(FOLLOW_operation_conflict_clause_in_insert_stmt2177);
                            operation_conflict_clause247=operation_conflict_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, operation_conflict_clause247.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:244:53: REPLACE
                    {
                    REPLACE248=(Token)match(input,REPLACE,FOLLOW_REPLACE_in_insert_stmt2183); 
                    REPLACE248_tree = (Object)adaptor.create(REPLACE248);
                    adaptor.addChild(root_0, REPLACE248_tree);


                    }
                    break;

            }

            INTO249=(Token)match(input,INTO,FOLLOW_INTO_in_insert_stmt2186); 
            INTO249_tree = (Object)adaptor.create(INTO249);
            adaptor.addChild(root_0, INTO249_tree);

            // SqlParser.g:244:67: (database_name= id DOT )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==ID) ) {
                int LA92_1 = input.LA(2);

                if ( (LA92_1==DOT) ) {
                    alt92=1;
                }
            }
            else if ( ((LA92_0>=ABORT && LA92_0<=FROM)||(LA92_0>=GROUP && LA92_0<=IMMEDIATE)||(LA92_0>=INDEX && LA92_0<=IS)||(LA92_0>=JOIN && LA92_0<=LEFT)||LA92_0==LIMIT||LA92_0==NATURAL||(LA92_0>=NULL && LA92_0<=REFERENCES)||(LA92_0>=REINDEX && LA92_0<=WHERE)) ) {
                int LA92_2 = input.LA(2);

                if ( (LA92_2==DOT) ) {
                    alt92=1;
                }
            }
            switch (alt92) {
                case 1 :
                    // SqlParser.g:244:68: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_insert_stmt2191);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT250=(Token)match(input,DOT,FOLLOW_DOT_in_insert_stmt2193); 
                    DOT250_tree = (Object)adaptor.create(DOT250);
                    adaptor.addChild(root_0, DOT250_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_insert_stmt2199);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:245:3: ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==LPAREN||LA97_0==SELECT||LA97_0==VALUES) ) {
                alt97=1;
            }
            else if ( (LA97_0==DEFAULT) ) {
                alt97=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // SqlParser.g:245:5: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt )
                    {
                    // SqlParser.g:245:5: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==LPAREN) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // SqlParser.g:245:6: LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                            {
                            LPAREN251=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt2206); 
                            LPAREN251_tree = (Object)adaptor.create(LPAREN251);
                            adaptor.addChild(root_0, LPAREN251_tree);

                            pushFollow(FOLLOW_id_in_insert_stmt2210);
                            column_names=id();

                            state._fsp--;

                            adaptor.addChild(root_0, column_names.getTree());
                            if (list_column_names==null) list_column_names=new ArrayList();
                            list_column_names.add(column_names.getTree());

                            // SqlParser.g:245:30: ( COMMA column_names+= id )*
                            loop93:
                            do {
                                int alt93=2;
                                int LA93_0 = input.LA(1);

                                if ( (LA93_0==COMMA) ) {
                                    alt93=1;
                                }


                                switch (alt93) {
                            	case 1 :
                            	    // SqlParser.g:245:31: COMMA column_names+= id
                            	    {
                            	    COMMA252=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt2213); 
                            	    COMMA252_tree = (Object)adaptor.create(COMMA252);
                            	    adaptor.addChild(root_0, COMMA252_tree);

                            	    pushFollow(FOLLOW_id_in_insert_stmt2217);
                            	    column_names=id();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, column_names.getTree());
                            	    if (list_column_names==null) list_column_names=new ArrayList();
                            	    list_column_names.add(column_names.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop93;
                                }
                            } while (true);

                            RPAREN253=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt2221); 
                            RPAREN253_tree = (Object)adaptor.create(RPAREN253);
                            adaptor.addChild(root_0, RPAREN253_tree);


                            }
                            break;

                    }

                    // SqlParser.g:246:5: ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt )
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==VALUES) ) {
                        alt96=1;
                    }
                    else if ( (LA96_0==SELECT) ) {
                        alt96=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 96, 0, input);

                        throw nvae;
                    }
                    switch (alt96) {
                        case 1 :
                            // SqlParser.g:246:6: VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN
                            {
                            VALUES254=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt2230); 
                            VALUES254_tree = (Object)adaptor.create(VALUES254);
                            adaptor.addChild(root_0, VALUES254_tree);

                            LPAREN255=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt2232); 
                            LPAREN255_tree = (Object)adaptor.create(LPAREN255);
                            adaptor.addChild(root_0, LPAREN255_tree);

                            pushFollow(FOLLOW_expr_in_insert_stmt2236);
                            values=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, values.getTree());
                            if (list_values==null) list_values=new ArrayList();
                            list_values.add(values.getTree());

                            // SqlParser.g:246:33: ( COMMA values+= expr )*
                            loop95:
                            do {
                                int alt95=2;
                                int LA95_0 = input.LA(1);

                                if ( (LA95_0==COMMA) ) {
                                    alt95=1;
                                }


                                switch (alt95) {
                            	case 1 :
                            	    // SqlParser.g:246:34: COMMA values+= expr
                            	    {
                            	    COMMA256=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt2239); 
                            	    COMMA256_tree = (Object)adaptor.create(COMMA256);
                            	    adaptor.addChild(root_0, COMMA256_tree);

                            	    pushFollow(FOLLOW_expr_in_insert_stmt2243);
                            	    values=expr();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, values.getTree());
                            	    if (list_values==null) list_values=new ArrayList();
                            	    list_values.add(values.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop95;
                                }
                            } while (true);

                            RPAREN257=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt2247); 
                            RPAREN257_tree = (Object)adaptor.create(RPAREN257);
                            adaptor.addChild(root_0, RPAREN257_tree);


                            }
                            break;
                        case 2 :
                            // SqlParser.g:246:64: select_stmt
                            {
                            pushFollow(FOLLOW_select_stmt_in_insert_stmt2251);
                            select_stmt258=select_stmt();

                            state._fsp--;

                            adaptor.addChild(root_0, select_stmt258.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:247:5: DEFAULT VALUES
                    {
                    DEFAULT259=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_insert_stmt2258); 
                    DEFAULT259_tree = (Object)adaptor.create(DEFAULT259);
                    adaptor.addChild(root_0, DEFAULT259_tree);

                    VALUES260=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt2260); 
                    VALUES260_tree = (Object)adaptor.create(VALUES260);
                    adaptor.addChild(root_0, VALUES260_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "insert_stmt"

    public static class update_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "update_stmt"
    // SqlParser.g:250:1: update_stmt : UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )? ;
    public final SqlParser.update_stmt_return update_stmt() throws RecognitionException {
        SqlParser.update_stmt_return retval = new SqlParser.update_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UPDATE261=null;
        Token SET264=null;
        Token COMMA265=null;
        Token WHERE266=null;
        List list_values=null;
        SqlParser.operation_conflict_clause_return operation_conflict_clause262 = null;

        SqlParser.qualified_table_name_return qualified_table_name263 = null;

        SqlParser.expr_return expr267 = null;

        SqlParser.operation_limited_clause_return operation_limited_clause268 = null;

        SqlParser.update_set_return values = null;
         values = null;
        Object UPDATE261_tree=null;
        Object SET264_tree=null;
        Object COMMA265_tree=null;
        Object WHERE266_tree=null;

        try {
            // SqlParser.g:250:12: ( UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )? )
            // SqlParser.g:250:14: UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )?
            {
            root_0 = (Object)adaptor.nil();

            UPDATE261=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_update_stmt2270); 
            UPDATE261_tree = (Object)adaptor.create(UPDATE261);
            adaptor.addChild(root_0, UPDATE261_tree);

            // SqlParser.g:250:21: ( operation_conflict_clause )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==OR) ) {
                int LA98_1 = input.LA(2);

                if ( (LA98_1==ABORT||LA98_1==FAIL||LA98_1==IGNORE||LA98_1==REPLACE||LA98_1==ROLLBACK) ) {
                    alt98=1;
                }
            }
            switch (alt98) {
                case 1 :
                    // SqlParser.g:250:22: operation_conflict_clause
                    {
                    pushFollow(FOLLOW_operation_conflict_clause_in_update_stmt2273);
                    operation_conflict_clause262=operation_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_conflict_clause262.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_qualified_table_name_in_update_stmt2277);
            qualified_table_name263=qualified_table_name();

            state._fsp--;

            adaptor.addChild(root_0, qualified_table_name263.getTree());
            SET264=(Token)match(input,SET,FOLLOW_SET_in_update_stmt2281); 
            SET264_tree = (Object)adaptor.create(SET264);
            adaptor.addChild(root_0, SET264_tree);

            pushFollow(FOLLOW_update_set_in_update_stmt2285);
            values=update_set();

            state._fsp--;

            adaptor.addChild(root_0, values.getTree());
            if (list_values==null) list_values=new ArrayList();
            list_values.add(values.getTree());

            // SqlParser.g:251:26: ( COMMA values+= update_set )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==COMMA) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // SqlParser.g:251:27: COMMA values+= update_set
            	    {
            	    COMMA265=(Token)match(input,COMMA,FOLLOW_COMMA_in_update_stmt2288); 
            	    COMMA265_tree = (Object)adaptor.create(COMMA265);
            	    adaptor.addChild(root_0, COMMA265_tree);

            	    pushFollow(FOLLOW_update_set_in_update_stmt2292);
            	    values=update_set();

            	    state._fsp--;

            	    adaptor.addChild(root_0, values.getTree());
            	    if (list_values==null) list_values=new ArrayList();
            	    list_values.add(values.getTree());


            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);

            // SqlParser.g:251:54: ( WHERE expr )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==WHERE) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // SqlParser.g:251:55: WHERE expr
                    {
                    WHERE266=(Token)match(input,WHERE,FOLLOW_WHERE_in_update_stmt2297); 
                    WHERE266_tree = (Object)adaptor.create(WHERE266);
                    adaptor.addChild(root_0, WHERE266_tree);

                    pushFollow(FOLLOW_expr_in_update_stmt2299);
                    expr267=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr267.getTree());

                    }
                    break;

            }

            // SqlParser.g:251:68: ( operation_limited_clause )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==LIMIT||LA101_0==ORDER) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // SqlParser.g:251:69: operation_limited_clause
                    {
                    pushFollow(FOLLOW_operation_limited_clause_in_update_stmt2304);
                    operation_limited_clause268=operation_limited_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_limited_clause268.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "update_stmt"

    public static class update_set_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "update_set"
    // SqlParser.g:253:1: update_set : column_name= id EQUALS expr ;
    public final SqlParser.update_set_return update_set() throws RecognitionException {
        SqlParser.update_set_return retval = new SqlParser.update_set_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EQUALS269=null;
        SqlParser.id_return column_name = null;

        SqlParser.expr_return expr270 = null;


        Object EQUALS269_tree=null;

        try {
            // SqlParser.g:253:11: (column_name= id EQUALS expr )
            // SqlParser.g:253:13: column_name= id EQUALS expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_update_set2315);
            column_name=id();

            state._fsp--;

            adaptor.addChild(root_0, column_name.getTree());
            EQUALS269=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_update_set2317); 
            EQUALS269_tree = (Object)adaptor.create(EQUALS269);
            adaptor.addChild(root_0, EQUALS269_tree);

            pushFollow(FOLLOW_expr_in_update_set2319);
            expr270=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr270.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "update_set"

    public static class delete_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delete_stmt"
    // SqlParser.g:256:1: delete_stmt : DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )? ;
    public final SqlParser.delete_stmt_return delete_stmt() throws RecognitionException {
        SqlParser.delete_stmt_return retval = new SqlParser.delete_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DELETE271=null;
        Token FROM272=null;
        Token WHERE274=null;
        SqlParser.qualified_table_name_return qualified_table_name273 = null;

        SqlParser.expr_return expr275 = null;

        SqlParser.operation_limited_clause_return operation_limited_clause276 = null;


        Object DELETE271_tree=null;
        Object FROM272_tree=null;
        Object WHERE274_tree=null;

        try {
            // SqlParser.g:256:12: ( DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )? )
            // SqlParser.g:256:14: DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )?
            {
            root_0 = (Object)adaptor.nil();

            DELETE271=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_stmt2327); 
            DELETE271_tree = (Object)adaptor.create(DELETE271);
            adaptor.addChild(root_0, DELETE271_tree);

            FROM272=(Token)match(input,FROM,FOLLOW_FROM_in_delete_stmt2329); 
            FROM272_tree = (Object)adaptor.create(FROM272);
            adaptor.addChild(root_0, FROM272_tree);

            pushFollow(FOLLOW_qualified_table_name_in_delete_stmt2331);
            qualified_table_name273=qualified_table_name();

            state._fsp--;

            adaptor.addChild(root_0, qualified_table_name273.getTree());
            // SqlParser.g:256:47: ( WHERE expr )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==WHERE) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // SqlParser.g:256:48: WHERE expr
                    {
                    WHERE274=(Token)match(input,WHERE,FOLLOW_WHERE_in_delete_stmt2334); 
                    WHERE274_tree = (Object)adaptor.create(WHERE274);
                    adaptor.addChild(root_0, WHERE274_tree);

                    pushFollow(FOLLOW_expr_in_delete_stmt2336);
                    expr275=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr275.getTree());

                    }
                    break;

            }

            // SqlParser.g:256:61: ( operation_limited_clause )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==LIMIT||LA103_0==ORDER) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // SqlParser.g:256:62: operation_limited_clause
                    {
                    pushFollow(FOLLOW_operation_limited_clause_in_delete_stmt2341);
                    operation_limited_clause276=operation_limited_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_limited_clause276.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "delete_stmt"

    public static class begin_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "begin_stmt"
    // SqlParser.g:259:1: begin_stmt : BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )? ;
    public final SqlParser.begin_stmt_return begin_stmt() throws RecognitionException {
        SqlParser.begin_stmt_return retval = new SqlParser.begin_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BEGIN277=null;
        Token set278=null;
        Token TRANSACTION279=null;

        Object BEGIN277_tree=null;
        Object set278_tree=null;
        Object TRANSACTION279_tree=null;

        try {
            // SqlParser.g:259:11: ( BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )? )
            // SqlParser.g:259:13: BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )?
            {
            root_0 = (Object)adaptor.nil();

            BEGIN277=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_begin_stmt2351); 
            BEGIN277_tree = (Object)adaptor.create(BEGIN277);
            adaptor.addChild(root_0, BEGIN277_tree);

            // SqlParser.g:259:19: ( DEFERRED | IMMEDIATE | EXCLUSIVE )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==DEFERRED||LA104_0==EXCLUSIVE||LA104_0==IMMEDIATE) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // SqlParser.g:
                    {
                    set278=(Token)input.LT(1);
                    if ( input.LA(1)==DEFERRED||input.LA(1)==EXCLUSIVE||input.LA(1)==IMMEDIATE ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set278));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            // SqlParser.g:259:55: ( TRANSACTION )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==TRANSACTION) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // SqlParser.g:259:56: TRANSACTION
                    {
                    TRANSACTION279=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_begin_stmt2367); 
                    TRANSACTION279_tree = (Object)adaptor.create(TRANSACTION279);
                    adaptor.addChild(root_0, TRANSACTION279_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "begin_stmt"

    public static class commit_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commit_stmt"
    // SqlParser.g:262:1: commit_stmt : ( COMMIT | END ) ( TRANSACTION )? ;
    public final SqlParser.commit_stmt_return commit_stmt() throws RecognitionException {
        SqlParser.commit_stmt_return retval = new SqlParser.commit_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set280=null;
        Token TRANSACTION281=null;

        Object set280_tree=null;
        Object TRANSACTION281_tree=null;

        try {
            // SqlParser.g:262:12: ( ( COMMIT | END ) ( TRANSACTION )? )
            // SqlParser.g:262:14: ( COMMIT | END ) ( TRANSACTION )?
            {
            root_0 = (Object)adaptor.nil();

            set280=(Token)input.LT(1);
            if ( input.LA(1)==COMMIT||input.LA(1)==END ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set280));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // SqlParser.g:262:29: ( TRANSACTION )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==TRANSACTION) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // SqlParser.g:262:30: TRANSACTION
                    {
                    TRANSACTION281=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_commit_stmt2386); 
                    TRANSACTION281_tree = (Object)adaptor.create(TRANSACTION281);
                    adaptor.addChild(root_0, TRANSACTION281_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "commit_stmt"

    public static class rollback_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rollback_stmt"
    // SqlParser.g:265:1: rollback_stmt : ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )? ;
    public final SqlParser.rollback_stmt_return rollback_stmt() throws RecognitionException {
        SqlParser.rollback_stmt_return retval = new SqlParser.rollback_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ROLLBACK282=null;
        Token TRANSACTION283=null;
        Token TO284=null;
        Token SAVEPOINT285=null;
        SqlParser.id_return savepoint_name = null;


        Object ROLLBACK282_tree=null;
        Object TRANSACTION283_tree=null;
        Object TO284_tree=null;
        Object SAVEPOINT285_tree=null;

        try {
            // SqlParser.g:265:14: ( ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )? )
            // SqlParser.g:265:16: ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )?
            {
            root_0 = (Object)adaptor.nil();

            ROLLBACK282=(Token)match(input,ROLLBACK,FOLLOW_ROLLBACK_in_rollback_stmt2396); 
            ROLLBACK282_tree = (Object)adaptor.create(ROLLBACK282);
            adaptor.addChild(root_0, ROLLBACK282_tree);

            // SqlParser.g:265:25: ( TRANSACTION )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==TRANSACTION) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // SqlParser.g:265:26: TRANSACTION
                    {
                    TRANSACTION283=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_rollback_stmt2399); 
                    TRANSACTION283_tree = (Object)adaptor.create(TRANSACTION283);
                    adaptor.addChild(root_0, TRANSACTION283_tree);


                    }
                    break;

            }

            // SqlParser.g:265:40: ( TO ( SAVEPOINT )? savepoint_name= id )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==TO) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // SqlParser.g:265:41: TO ( SAVEPOINT )? savepoint_name= id
                    {
                    TO284=(Token)match(input,TO,FOLLOW_TO_in_rollback_stmt2404); 
                    TO284_tree = (Object)adaptor.create(TO284);
                    adaptor.addChild(root_0, TO284_tree);

                    // SqlParser.g:265:44: ( SAVEPOINT )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==SAVEPOINT) ) {
                        int LA108_1 = input.LA(2);

                        if ( ((LA108_1>=ABORT && LA108_1<=FROM)||(LA108_1>=GROUP && LA108_1<=IMMEDIATE)||(LA108_1>=INDEX && LA108_1<=IS)||(LA108_1>=JOIN && LA108_1<=LEFT)||LA108_1==LIMIT||LA108_1==NATURAL||(LA108_1>=NULL && LA108_1<=REFERENCES)||(LA108_1>=REINDEX && LA108_1<=WHERE)||LA108_1==ID) ) {
                            alt108=1;
                        }
                    }
                    switch (alt108) {
                        case 1 :
                            // SqlParser.g:265:45: SAVEPOINT
                            {
                            SAVEPOINT285=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_rollback_stmt2407); 
                            SAVEPOINT285_tree = (Object)adaptor.create(SAVEPOINT285);
                            adaptor.addChild(root_0, SAVEPOINT285_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_id_in_rollback_stmt2413);
                    savepoint_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, savepoint_name.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rollback_stmt"

    public static class savepoint_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "savepoint_stmt"
    // SqlParser.g:268:1: savepoint_stmt : SAVEPOINT savepoint_name= id ;
    public final SqlParser.savepoint_stmt_return savepoint_stmt() throws RecognitionException {
        SqlParser.savepoint_stmt_return retval = new SqlParser.savepoint_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SAVEPOINT286=null;
        SqlParser.id_return savepoint_name = null;


        Object SAVEPOINT286_tree=null;

        try {
            // SqlParser.g:268:15: ( SAVEPOINT savepoint_name= id )
            // SqlParser.g:268:17: SAVEPOINT savepoint_name= id
            {
            root_0 = (Object)adaptor.nil();

            SAVEPOINT286=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_savepoint_stmt2423); 
            SAVEPOINT286_tree = (Object)adaptor.create(SAVEPOINT286);
            adaptor.addChild(root_0, SAVEPOINT286_tree);

            pushFollow(FOLLOW_id_in_savepoint_stmt2427);
            savepoint_name=id();

            state._fsp--;

            adaptor.addChild(root_0, savepoint_name.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "savepoint_stmt"

    public static class release_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "release_stmt"
    // SqlParser.g:271:1: release_stmt : RELEASE ( SAVEPOINT )? savepoint_name= id ;
    public final SqlParser.release_stmt_return release_stmt() throws RecognitionException {
        SqlParser.release_stmt_return retval = new SqlParser.release_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RELEASE287=null;
        Token SAVEPOINT288=null;
        SqlParser.id_return savepoint_name = null;


        Object RELEASE287_tree=null;
        Object SAVEPOINT288_tree=null;

        try {
            // SqlParser.g:271:13: ( RELEASE ( SAVEPOINT )? savepoint_name= id )
            // SqlParser.g:271:15: RELEASE ( SAVEPOINT )? savepoint_name= id
            {
            root_0 = (Object)adaptor.nil();

            RELEASE287=(Token)match(input,RELEASE,FOLLOW_RELEASE_in_release_stmt2435); 
            RELEASE287_tree = (Object)adaptor.create(RELEASE287);
            adaptor.addChild(root_0, RELEASE287_tree);

            // SqlParser.g:271:23: ( SAVEPOINT )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==SAVEPOINT) ) {
                int LA110_1 = input.LA(2);

                if ( ((LA110_1>=ABORT && LA110_1<=FROM)||(LA110_1>=GROUP && LA110_1<=IMMEDIATE)||(LA110_1>=INDEX && LA110_1<=IS)||(LA110_1>=JOIN && LA110_1<=LEFT)||LA110_1==LIMIT||LA110_1==NATURAL||(LA110_1>=NULL && LA110_1<=REFERENCES)||(LA110_1>=REINDEX && LA110_1<=WHERE)||LA110_1==ID) ) {
                    alt110=1;
                }
            }
            switch (alt110) {
                case 1 :
                    // SqlParser.g:271:24: SAVEPOINT
                    {
                    SAVEPOINT288=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_release_stmt2438); 
                    SAVEPOINT288_tree = (Object)adaptor.create(SAVEPOINT288);
                    adaptor.addChild(root_0, SAVEPOINT288_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_release_stmt2444);
            savepoint_name=id();

            state._fsp--;

            adaptor.addChild(root_0, savepoint_name.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "release_stmt"

    public static class table_conflict_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "table_conflict_clause"
    // SqlParser.g:278:1: table_conflict_clause : ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) ;
    public final SqlParser.table_conflict_clause_return table_conflict_clause() throws RecognitionException {
        SqlParser.table_conflict_clause_return retval = new SqlParser.table_conflict_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ON289=null;
        Token CONFLICT290=null;
        Token set291=null;

        Object ON289_tree=null;
        Object CONFLICT290_tree=null;
        Object set291_tree=null;

        try {
            // SqlParser.g:278:22: ( ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) )
            // SqlParser.g:278:24: ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE )
            {
            root_0 = (Object)adaptor.nil();

            ON289=(Token)match(input,ON,FOLLOW_ON_in_table_conflict_clause2456); 
            CONFLICT290=(Token)match(input,CONFLICT,FOLLOW_CONFLICT_in_table_conflict_clause2459); 
            CONFLICT290_tree = (Object)adaptor.create(CONFLICT290);
            root_0 = (Object)adaptor.becomeRoot(CONFLICT290_tree, root_0);

            set291=(Token)input.LT(1);
            if ( input.LA(1)==ABORT||input.LA(1)==FAIL||input.LA(1)==IGNORE||input.LA(1)==REPLACE||input.LA(1)==ROLLBACK ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set291));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "table_conflict_clause"

    public static class create_virtual_table_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_virtual_table_stmt"
    // SqlParser.g:282:1: create_virtual_table_stmt : CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )? ;
    public final SqlParser.create_virtual_table_stmt_return create_virtual_table_stmt() throws RecognitionException {
        SqlParser.create_virtual_table_stmt_return retval = new SqlParser.create_virtual_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE292=null;
        Token VIRTUAL293=null;
        Token TABLE294=null;
        Token DOT295=null;
        Token USING296=null;
        Token LPAREN297=null;
        Token COMMA299=null;
        Token RPAREN301=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.id_return module_name = null;

        SqlParser.column_def_return column_def298 = null;

        SqlParser.column_def_return column_def300 = null;


        Object CREATE292_tree=null;
        Object VIRTUAL293_tree=null;
        Object TABLE294_tree=null;
        Object DOT295_tree=null;
        Object USING296_tree=null;
        Object LPAREN297_tree=null;
        Object COMMA299_tree=null;
        Object RPAREN301_tree=null;

        try {
            // SqlParser.g:282:26: ( CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )? )
            // SqlParser.g:282:28: CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            CREATE292=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_virtual_table_stmt2489); 
            CREATE292_tree = (Object)adaptor.create(CREATE292);
            adaptor.addChild(root_0, CREATE292_tree);

            VIRTUAL293=(Token)match(input,VIRTUAL,FOLLOW_VIRTUAL_in_create_virtual_table_stmt2491); 
            VIRTUAL293_tree = (Object)adaptor.create(VIRTUAL293);
            adaptor.addChild(root_0, VIRTUAL293_tree);

            TABLE294=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_virtual_table_stmt2493); 
            TABLE294_tree = (Object)adaptor.create(TABLE294);
            adaptor.addChild(root_0, TABLE294_tree);

            // SqlParser.g:282:49: (database_name= id DOT )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==ID) ) {
                int LA111_1 = input.LA(2);

                if ( (LA111_1==DOT) ) {
                    alt111=1;
                }
            }
            else if ( ((LA111_0>=ABORT && LA111_0<=FROM)||(LA111_0>=GROUP && LA111_0<=IMMEDIATE)||(LA111_0>=INDEX && LA111_0<=IS)||(LA111_0>=JOIN && LA111_0<=LEFT)||LA111_0==LIMIT||LA111_0==NATURAL||(LA111_0>=NULL && LA111_0<=REFERENCES)||(LA111_0>=REINDEX && LA111_0<=WHERE)) ) {
                int LA111_2 = input.LA(2);

                if ( (LA111_2==DOT) ) {
                    alt111=1;
                }
            }
            switch (alt111) {
                case 1 :
                    // SqlParser.g:282:50: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_virtual_table_stmt2498);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT295=(Token)match(input,DOT,FOLLOW_DOT_in_create_virtual_table_stmt2500); 
                    DOT295_tree = (Object)adaptor.create(DOT295);
                    adaptor.addChild(root_0, DOT295_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_virtual_table_stmt2506);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            USING296=(Token)match(input,USING,FOLLOW_USING_in_create_virtual_table_stmt2510); 
            USING296_tree = (Object)adaptor.create(USING296);
            adaptor.addChild(root_0, USING296_tree);

            pushFollow(FOLLOW_id_in_create_virtual_table_stmt2514);
            module_name=id();

            state._fsp--;

            adaptor.addChild(root_0, module_name.getTree());
            // SqlParser.g:283:24: ( LPAREN column_def ( COMMA column_def )* RPAREN )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==LPAREN) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // SqlParser.g:283:25: LPAREN column_def ( COMMA column_def )* RPAREN
                    {
                    LPAREN297=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_virtual_table_stmt2517); 
                    LPAREN297_tree = (Object)adaptor.create(LPAREN297);
                    adaptor.addChild(root_0, LPAREN297_tree);

                    pushFollow(FOLLOW_column_def_in_create_virtual_table_stmt2519);
                    column_def298=column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, column_def298.getTree());
                    // SqlParser.g:283:43: ( COMMA column_def )*
                    loop112:
                    do {
                        int alt112=2;
                        int LA112_0 = input.LA(1);

                        if ( (LA112_0==COMMA) ) {
                            alt112=1;
                        }


                        switch (alt112) {
                    	case 1 :
                    	    // SqlParser.g:283:44: COMMA column_def
                    	    {
                    	    COMMA299=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_virtual_table_stmt2522); 
                    	    COMMA299_tree = (Object)adaptor.create(COMMA299);
                    	    adaptor.addChild(root_0, COMMA299_tree);

                    	    pushFollow(FOLLOW_column_def_in_create_virtual_table_stmt2524);
                    	    column_def300=column_def();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, column_def300.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop112;
                        }
                    } while (true);

                    RPAREN301=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_virtual_table_stmt2528); 
                    RPAREN301_tree = (Object)adaptor.create(RPAREN301);
                    adaptor.addChild(root_0, RPAREN301_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "create_virtual_table_stmt"

    public static class create_table_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_table_stmt"
    // SqlParser.g:286:1: create_table_stmt : CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt ) -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? ) ;
    public final SqlParser.create_table_stmt_return create_table_stmt() throws RecognitionException {
        SqlParser.create_table_stmt_return retval = new SqlParser.create_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE302=null;
        Token TEMPORARY303=null;
        Token TABLE304=null;
        Token IF305=null;
        Token NOT306=null;
        Token EXISTS307=null;
        Token DOT308=null;
        Token LPAREN309=null;
        Token COMMA311=null;
        Token COMMA313=null;
        Token RPAREN315=null;
        Token AS316=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.column_def_return column_def310 = null;

        SqlParser.column_def_return column_def312 = null;

        SqlParser.table_constraint_return table_constraint314 = null;

        SqlParser.select_stmt_return select_stmt317 = null;


        Object CREATE302_tree=null;
        Object TEMPORARY303_tree=null;
        Object TABLE304_tree=null;
        Object IF305_tree=null;
        Object NOT306_tree=null;
        Object EXISTS307_tree=null;
        Object DOT308_tree=null;
        Object LPAREN309_tree=null;
        Object COMMA311_tree=null;
        Object COMMA313_tree=null;
        Object RPAREN315_tree=null;
        Object AS316_tree=null;
        RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_TEMPORARY=new RewriteRuleTokenStream(adaptor,"token TEMPORARY");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_select_stmt=new RewriteRuleSubtreeStream(adaptor,"rule select_stmt");
        RewriteRuleSubtreeStream stream_column_def=new RewriteRuleSubtreeStream(adaptor,"rule column_def");
        RewriteRuleSubtreeStream stream_table_constraint=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint");
        try {
            // SqlParser.g:286:18: ( CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt ) -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? ) )
            // SqlParser.g:286:20: CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt )
            {
            CREATE302=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_table_stmt2538);  
            stream_CREATE.add(CREATE302);

            // SqlParser.g:286:27: ( TEMPORARY )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==TEMPORARY) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // SqlParser.g:286:27: TEMPORARY
                    {
                    TEMPORARY303=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_table_stmt2540);  
                    stream_TEMPORARY.add(TEMPORARY303);


                    }
                    break;

            }

            TABLE304=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_table_stmt2543);  
            stream_TABLE.add(TABLE304);

            // SqlParser.g:286:44: ( IF NOT EXISTS )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==IF) ) {
                int LA115_1 = input.LA(2);

                if ( (LA115_1==NOT) ) {
                    alt115=1;
                }
            }
            switch (alt115) {
                case 1 :
                    // SqlParser.g:286:45: IF NOT EXISTS
                    {
                    IF305=(Token)match(input,IF,FOLLOW_IF_in_create_table_stmt2546);  
                    stream_IF.add(IF305);

                    NOT306=(Token)match(input,NOT,FOLLOW_NOT_in_create_table_stmt2548);  
                    stream_NOT.add(NOT306);

                    EXISTS307=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_table_stmt2550);  
                    stream_EXISTS.add(EXISTS307);


                    }
                    break;

            }

            // SqlParser.g:286:61: (database_name= id DOT )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==ID) ) {
                int LA116_1 = input.LA(2);

                if ( (LA116_1==DOT) ) {
                    alt116=1;
                }
            }
            else if ( ((LA116_0>=ABORT && LA116_0<=FROM)||(LA116_0>=GROUP && LA116_0<=IMMEDIATE)||(LA116_0>=INDEX && LA116_0<=IS)||(LA116_0>=JOIN && LA116_0<=LEFT)||LA116_0==LIMIT||LA116_0==NATURAL||(LA116_0>=NULL && LA116_0<=REFERENCES)||(LA116_0>=REINDEX && LA116_0<=WHERE)) ) {
                int LA116_2 = input.LA(2);

                if ( (LA116_2==DOT) ) {
                    alt116=1;
                }
            }
            switch (alt116) {
                case 1 :
                    // SqlParser.g:286:62: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_table_stmt2557);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT308=(Token)match(input,DOT,FOLLOW_DOT_in_create_table_stmt2559);  
                    stream_DOT.add(DOT308);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_table_stmt2565);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());
            // SqlParser.g:287:3: ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt )
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==LPAREN) ) {
                alt119=1;
            }
            else if ( (LA119_0==AS) ) {
                alt119=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }
            switch (alt119) {
                case 1 :
                    // SqlParser.g:287:5: LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN
                    {
                    LPAREN309=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_table_stmt2571);  
                    stream_LPAREN.add(LPAREN309);

                    pushFollow(FOLLOW_column_def_in_create_table_stmt2573);
                    column_def310=column_def();

                    state._fsp--;

                    stream_column_def.add(column_def310.getTree());
                    // SqlParser.g:287:23: ( COMMA column_def )*
                    loop117:
                    do {
                        int alt117=2;
                        int LA117_0 = input.LA(1);

                        if ( (LA117_0==COMMA) ) {
                            switch ( input.LA(2) ) {
                            case ABORT:
                            case ADD:
                            case AFTER:
                            case ALL:
                            case ALTER:
                            case ANALYZE:
                            case AND:
                            case AS:
                            case ASC:
                            case ATTACH:
                            case AUTOINCREMENT:
                            case BEFORE:
                            case BEGIN:
                            case BETWEEN:
                            case BY:
                            case CASCADE:
                            case CASE:
                            case CAST:
                            case COLLATE:
                            case COMMIT:
                            case CONFLICT:
                            case CREATE:
                            case CROSS:
                            case CURRENT_TIME:
                            case CURRENT_DATE:
                            case CURRENT_TIMESTAMP:
                            case DATABASE:
                            case DEFAULT:
                            case DEFERRABLE:
                            case DEFERRED:
                            case DELETE:
                            case DESC:
                            case DETACH:
                            case DISTINCT:
                            case DROP:
                            case EACH:
                            case ELSE:
                            case END:
                            case ESCAPE:
                            case EXCEPT:
                            case EXCLUSIVE:
                            case EXISTS:
                            case EXPLAIN:
                            case FAIL:
                            case FOR:
                            case FROM:
                            case GLOB:
                            case GROUP:
                            case HAVING:
                            case IF:
                            case IGNORE:
                            case IMMEDIATE:
                            case IN:
                            case INDEX:
                            case INDEXED:
                            case INITIALLY:
                            case INNER:
                            case INSERT:
                            case INSTEAD:
                            case INTERSECT:
                            case INTO:
                            case IS:
                            case ISNULL:
                            case JOIN:
                            case KEY:
                            case LEFT:
                            case LIKE:
                            case LIMIT:
                            case MATCH:
                            case NATURAL:
                            case NOT:
                            case NOTNULL:
                            case NULL:
                            case OF:
                            case OFFSET:
                            case ON:
                            case OR:
                            case ORDER:
                            case OUTER:
                            case PLAN:
                            case PRAGMA:
                            case QUERY:
                            case RAISE:
                            case REFERENCES:
                            case REGEXP:
                            case REINDEX:
                            case RELEASE:
                            case RENAME:
                            case REPLACE:
                            case RESTRICT:
                            case ROLLBACK:
                            case ROW:
                            case SAVEPOINT:
                            case SELECT:
                            case SET:
                            case TABLE:
                            case TEMPORARY:
                            case THEN:
                            case TO:
                            case TRANSACTION:
                            case TRIGGER:
                            case UNION:
                            case UPDATE:
                            case USING:
                            case VACUUM:
                            case VALUES:
                            case VIEW:
                            case VIRTUAL:
                            case WHEN:
                            case WHERE:
                            case ID:
                                {
                                alt117=1;
                                }
                                break;
                            case PRIMARY:
                                {
                                int LA117_4 = input.LA(3);

                                if ( (LA117_4==COMMA||LA117_4==RPAREN||(LA117_4>=CHECK && LA117_4<=COLLATE)||LA117_4==CONSTRAINT||LA117_4==DEFAULT||LA117_4==NOT||LA117_4==PRIMARY||LA117_4==REFERENCES||LA117_4==UNIQUE||LA117_4==ID) ) {
                                    alt117=1;
                                }


                                }
                                break;
                            case UNIQUE:
                                {
                                int LA117_5 = input.LA(3);

                                if ( (LA117_5==COMMA||LA117_5==RPAREN||(LA117_5>=CHECK && LA117_5<=COLLATE)||LA117_5==CONSTRAINT||LA117_5==DEFAULT||LA117_5==NOT||LA117_5==PRIMARY||LA117_5==REFERENCES||LA117_5==UNIQUE||LA117_5==ID) ) {
                                    alt117=1;
                                }


                                }
                                break;
                            case CHECK:
                                {
                                int LA117_6 = input.LA(3);

                                if ( (LA117_6==COMMA||LA117_6==RPAREN||(LA117_6>=CHECK && LA117_6<=COLLATE)||LA117_6==CONSTRAINT||LA117_6==DEFAULT||LA117_6==NOT||LA117_6==PRIMARY||LA117_6==REFERENCES||LA117_6==UNIQUE||LA117_6==ID) ) {
                                    alt117=1;
                                }


                                }
                                break;
                            case FOREIGN:
                                {
                                int LA117_7 = input.LA(3);

                                if ( (LA117_7==COMMA||LA117_7==RPAREN||(LA117_7>=CHECK && LA117_7<=COLLATE)||LA117_7==CONSTRAINT||LA117_7==DEFAULT||LA117_7==NOT||LA117_7==PRIMARY||LA117_7==REFERENCES||LA117_7==UNIQUE||LA117_7==ID) ) {
                                    alt117=1;
                                }


                                }
                                break;

                            }

                        }


                        switch (alt117) {
                    	case 1 :
                    	    // SqlParser.g:287:24: COMMA column_def
                    	    {
                    	    COMMA311=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_table_stmt2576);  
                    	    stream_COMMA.add(COMMA311);

                    	    pushFollow(FOLLOW_column_def_in_create_table_stmt2578);
                    	    column_def312=column_def();

                    	    state._fsp--;

                    	    stream_column_def.add(column_def312.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop117;
                        }
                    } while (true);

                    // SqlParser.g:287:43: ( COMMA table_constraint )*
                    loop118:
                    do {
                        int alt118=2;
                        int LA118_0 = input.LA(1);

                        if ( (LA118_0==COMMA) ) {
                            alt118=1;
                        }


                        switch (alt118) {
                    	case 1 :
                    	    // SqlParser.g:287:44: COMMA table_constraint
                    	    {
                    	    COMMA313=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_table_stmt2583);  
                    	    stream_COMMA.add(COMMA313);

                    	    pushFollow(FOLLOW_table_constraint_in_create_table_stmt2585);
                    	    table_constraint314=table_constraint();

                    	    state._fsp--;

                    	    stream_table_constraint.add(table_constraint314.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop118;
                        }
                    } while (true);

                    RPAREN315=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_table_stmt2589);  
                    stream_RPAREN.add(RPAREN315);


                    }
                    break;
                case 2 :
                    // SqlParser.g:288:5: AS select_stmt
                    {
                    AS316=(Token)match(input,AS,FOLLOW_AS_in_create_table_stmt2595);  
                    stream_AS.add(AS316);

                    pushFollow(FOLLOW_select_stmt_in_create_table_stmt2597);
                    select_stmt317=select_stmt();

                    state._fsp--;

                    stream_select_stmt.add(select_stmt317.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: EXISTS, select_stmt, database_name, TEMPORARY, table_name, table_constraint, column_def
            // token labels: 
            // rule labels: database_name, retval, table_name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 289:1: -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? )
            {
                // SqlParser.g:289:4: ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CREATE_TABLE, "CREATE_TABLE"), root_1);

                // SqlParser.g:289:19: ^( OPTIONS ( TEMPORARY )? ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:289:29: ( TEMPORARY )?
                if ( stream_TEMPORARY.hasNext() ) {
                    adaptor.addChild(root_2, stream_TEMPORARY.nextNode());

                }
                stream_TEMPORARY.reset();
                // SqlParser.g:289:40: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:289:49: ^( $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                // SqlParser.g:289:63: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:290:3: ( ^( COLUMNS ( column_def )+ ) )?
                if ( stream_column_def.hasNext() ) {
                    // SqlParser.g:290:3: ^( COLUMNS ( column_def )+ )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMNS, "COLUMNS"), root_2);

                    if ( !(stream_column_def.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_column_def.hasNext() ) {
                        adaptor.addChild(root_2, stream_column_def.nextTree());

                    }
                    stream_column_def.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_column_def.reset();
                // SqlParser.g:290:27: ( ^( CONSTRAINTS ( table_constraint )* ) )?
                if ( stream_table_constraint.hasNext() ) {
                    // SqlParser.g:290:27: ^( CONSTRAINTS ( table_constraint )* )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRAINTS, "CONSTRAINTS"), root_2);

                    // SqlParser.g:290:41: ( table_constraint )*
                    while ( stream_table_constraint.hasNext() ) {
                        adaptor.addChild(root_2, stream_table_constraint.nextTree());

                    }
                    stream_table_constraint.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_table_constraint.reset();
                // SqlParser.g:290:61: ( select_stmt )?
                if ( stream_select_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_select_stmt.nextTree());

                }
                stream_select_stmt.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "create_table_stmt"

    public static class column_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "column_def"
    // SqlParser.g:292:1: column_def : name= id_column_def ( type_name )? ( column_constraint )* -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? ) ;
    public final SqlParser.column_def_return column_def() throws RecognitionException {
        SqlParser.column_def_return retval = new SqlParser.column_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.id_column_def_return name = null;

        SqlParser.type_name_return type_name318 = null;

        SqlParser.column_constraint_return column_constraint319 = null;


        RewriteRuleSubtreeStream stream_column_constraint=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint");
        RewriteRuleSubtreeStream stream_id_column_def=new RewriteRuleSubtreeStream(adaptor,"rule id_column_def");
        RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");
        try {
            // SqlParser.g:292:11: (name= id_column_def ( type_name )? ( column_constraint )* -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? ) )
            // SqlParser.g:292:13: name= id_column_def ( type_name )? ( column_constraint )*
            {
            pushFollow(FOLLOW_id_column_def_in_column_def2653);
            name=id_column_def();

            state._fsp--;

            stream_id_column_def.add(name.getTree());
            // SqlParser.g:292:32: ( type_name )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==ID) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // SqlParser.g:292:32: type_name
                    {
                    pushFollow(FOLLOW_type_name_in_column_def2655);
                    type_name318=type_name();

                    state._fsp--;

                    stream_type_name.add(type_name318.getTree());

                    }
                    break;

            }

            // SqlParser.g:292:43: ( column_constraint )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( ((LA121_0>=CHECK && LA121_0<=COLLATE)||LA121_0==CONSTRAINT||LA121_0==DEFAULT||LA121_0==NOT||LA121_0==PRIMARY||LA121_0==REFERENCES||LA121_0==UNIQUE) ) {
                    alt121=1;
                }


                switch (alt121) {
            	case 1 :
            	    // SqlParser.g:292:43: column_constraint
            	    {
            	    pushFollow(FOLLOW_column_constraint_in_column_def2658);
            	    column_constraint319=column_constraint();

            	    state._fsp--;

            	    stream_column_constraint.add(column_constraint319.getTree());

            	    }
            	    break;

            	default :
            	    break loop121;
                }
            } while (true);



            // AST REWRITE
            // elements: type_name, column_constraint, name
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 293:1: -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? )
            {
                // SqlParser.g:293:4: ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_name.nextNode(), root_1);

                // SqlParser.g:293:12: ^( CONSTRAINTS ( column_constraint )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRAINTS, "CONSTRAINTS"), root_2);

                // SqlParser.g:293:26: ( column_constraint )*
                while ( stream_column_constraint.hasNext() ) {
                    adaptor.addChild(root_2, stream_column_constraint.nextTree());

                }
                stream_column_constraint.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:293:46: ( type_name )?
                if ( stream_type_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_type_name.nextTree());

                }
                stream_type_name.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "column_def"

    public static class column_constraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "column_constraint"
    // SqlParser.g:295:1: column_constraint : ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause ) -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? ) ;
    public final SqlParser.column_constraint_return column_constraint() throws RecognitionException {
        SqlParser.column_constraint_return retval = new SqlParser.column_constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONSTRAINT320=null;
        SqlParser.id_return name = null;

        SqlParser.column_constraint_pk_return column_constraint_pk321 = null;

        SqlParser.column_constraint_not_null_return column_constraint_not_null322 = null;

        SqlParser.column_constraint_unique_return column_constraint_unique323 = null;

        SqlParser.column_constraint_check_return column_constraint_check324 = null;

        SqlParser.column_constraint_default_return column_constraint_default325 = null;

        SqlParser.column_constraint_collate_return column_constraint_collate326 = null;

        SqlParser.fk_clause_return fk_clause327 = null;


        Object CONSTRAINT320_tree=null;
        RewriteRuleTokenStream stream_CONSTRAINT=new RewriteRuleTokenStream(adaptor,"token CONSTRAINT");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_column_constraint_default=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_default");
        RewriteRuleSubtreeStream stream_column_constraint_check=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_check");
        RewriteRuleSubtreeStream stream_column_constraint_pk=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_pk");
        RewriteRuleSubtreeStream stream_column_constraint_collate=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_collate");
        RewriteRuleSubtreeStream stream_column_constraint_unique=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_unique");
        RewriteRuleSubtreeStream stream_fk_clause=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause");
        RewriteRuleSubtreeStream stream_column_constraint_not_null=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_not_null");
        try {
            // SqlParser.g:295:18: ( ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause ) -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? ) )
            // SqlParser.g:295:20: ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause )
            {
            // SqlParser.g:295:20: ( CONSTRAINT name= id )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==CONSTRAINT) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // SqlParser.g:295:21: CONSTRAINT name= id
                    {
                    CONSTRAINT320=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_column_constraint2684);  
                    stream_CONSTRAINT.add(CONSTRAINT320);

                    pushFollow(FOLLOW_id_in_column_constraint2688);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());

                    }
                    break;

            }

            // SqlParser.g:296:3: ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause )
            int alt123=7;
            switch ( input.LA(1) ) {
            case PRIMARY:
                {
                alt123=1;
                }
                break;
            case NOT:
                {
                alt123=2;
                }
                break;
            case UNIQUE:
                {
                alt123=3;
                }
                break;
            case CHECK:
                {
                alt123=4;
                }
                break;
            case DEFAULT:
                {
                alt123=5;
                }
                break;
            case COLLATE:
                {
                alt123=6;
                }
                break;
            case REFERENCES:
                {
                alt123=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }

            switch (alt123) {
                case 1 :
                    // SqlParser.g:296:5: column_constraint_pk
                    {
                    pushFollow(FOLLOW_column_constraint_pk_in_column_constraint2696);
                    column_constraint_pk321=column_constraint_pk();

                    state._fsp--;

                    stream_column_constraint_pk.add(column_constraint_pk321.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:297:5: column_constraint_not_null
                    {
                    pushFollow(FOLLOW_column_constraint_not_null_in_column_constraint2702);
                    column_constraint_not_null322=column_constraint_not_null();

                    state._fsp--;

                    stream_column_constraint_not_null.add(column_constraint_not_null322.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:298:5: column_constraint_unique
                    {
                    pushFollow(FOLLOW_column_constraint_unique_in_column_constraint2708);
                    column_constraint_unique323=column_constraint_unique();

                    state._fsp--;

                    stream_column_constraint_unique.add(column_constraint_unique323.getTree());

                    }
                    break;
                case 4 :
                    // SqlParser.g:299:5: column_constraint_check
                    {
                    pushFollow(FOLLOW_column_constraint_check_in_column_constraint2714);
                    column_constraint_check324=column_constraint_check();

                    state._fsp--;

                    stream_column_constraint_check.add(column_constraint_check324.getTree());

                    }
                    break;
                case 5 :
                    // SqlParser.g:300:5: column_constraint_default
                    {
                    pushFollow(FOLLOW_column_constraint_default_in_column_constraint2720);
                    column_constraint_default325=column_constraint_default();

                    state._fsp--;

                    stream_column_constraint_default.add(column_constraint_default325.getTree());

                    }
                    break;
                case 6 :
                    // SqlParser.g:301:5: column_constraint_collate
                    {
                    pushFollow(FOLLOW_column_constraint_collate_in_column_constraint2726);
                    column_constraint_collate326=column_constraint_collate();

                    state._fsp--;

                    stream_column_constraint_collate.add(column_constraint_collate326.getTree());

                    }
                    break;
                case 7 :
                    // SqlParser.g:302:5: fk_clause
                    {
                    pushFollow(FOLLOW_fk_clause_in_column_constraint2732);
                    fk_clause327=fk_clause();

                    state._fsp--;

                    stream_fk_clause.add(fk_clause327.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: column_constraint_check, name, fk_clause, column_constraint_default, column_constraint_unique, column_constraint_not_null, column_constraint_collate, column_constraint_pk
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 303:1: -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? )
            {
                // SqlParser.g:303:4: ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMN_CONSTRAINT, "COLUMN_CONSTRAINT"), root_1);

                // SqlParser.g:304:3: ( column_constraint_pk )?
                if ( stream_column_constraint_pk.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_pk.nextTree());

                }
                stream_column_constraint_pk.reset();
                // SqlParser.g:305:3: ( column_constraint_not_null )?
                if ( stream_column_constraint_not_null.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_not_null.nextTree());

                }
                stream_column_constraint_not_null.reset();
                // SqlParser.g:306:3: ( column_constraint_unique )?
                if ( stream_column_constraint_unique.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_unique.nextTree());

                }
                stream_column_constraint_unique.reset();
                // SqlParser.g:307:3: ( column_constraint_check )?
                if ( stream_column_constraint_check.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_check.nextTree());

                }
                stream_column_constraint_check.reset();
                // SqlParser.g:308:3: ( column_constraint_default )?
                if ( stream_column_constraint_default.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_default.nextTree());

                }
                stream_column_constraint_default.reset();
                // SqlParser.g:309:3: ( column_constraint_collate )?
                if ( stream_column_constraint_collate.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_collate.nextTree());

                }
                stream_column_constraint_collate.reset();
                // SqlParser.g:310:3: ( fk_clause )?
                if ( stream_fk_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_fk_clause.nextTree());

                }
                stream_fk_clause.reset();
                // SqlParser.g:311:3: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextTree());

                }
                stream_name.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "column_constraint"

    public static class column_constraint_pk_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "column_constraint_pk"
    // SqlParser.g:313:1: column_constraint_pk : PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )? ;
    public final SqlParser.column_constraint_pk_return column_constraint_pk() throws RecognitionException {
        SqlParser.column_constraint_pk_return retval = new SqlParser.column_constraint_pk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRIMARY328=null;
        Token KEY329=null;
        Token set330=null;
        Token AUTOINCREMENT332=null;
        SqlParser.table_conflict_clause_return table_conflict_clause331 = null;


        Object PRIMARY328_tree=null;
        Object KEY329_tree=null;
        Object set330_tree=null;
        Object AUTOINCREMENT332_tree=null;

        try {
            // SqlParser.g:313:21: ( PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )? )
            // SqlParser.g:313:23: PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )?
            {
            root_0 = (Object)adaptor.nil();

            PRIMARY328=(Token)match(input,PRIMARY,FOLLOW_PRIMARY_in_column_constraint_pk2787); 
            PRIMARY328_tree = (Object)adaptor.create(PRIMARY328);
            root_0 = (Object)adaptor.becomeRoot(PRIMARY328_tree, root_0);

            KEY329=(Token)match(input,KEY,FOLLOW_KEY_in_column_constraint_pk2790); 
            // SqlParser.g:313:37: ( ASC | DESC )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==ASC||LA124_0==DESC) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // SqlParser.g:
                    {
                    set330=(Token)input.LT(1);
                    if ( input.LA(1)==ASC||input.LA(1)==DESC ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set330));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            // SqlParser.g:313:51: ( table_conflict_clause )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==ON) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // SqlParser.g:313:51: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_pk2802);
                    table_conflict_clause331=table_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, table_conflict_clause331.getTree());

                    }
                    break;

            }

            // SqlParser.g:313:74: ( AUTOINCREMENT )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==AUTOINCREMENT) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // SqlParser.g:313:75: AUTOINCREMENT
                    {
                    AUTOINCREMENT332=(Token)match(input,AUTOINCREMENT,FOLLOW_AUTOINCREMENT_in_column_constraint_pk2806); 
                    AUTOINCREMENT332_tree = (Object)adaptor.create(AUTOINCREMENT332);
                    adaptor.addChild(root_0, AUTOINCREMENT332_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "column_constraint_pk"

    public static class column_constraint_not_null_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "column_constraint_not_null"
    // SqlParser.g:315:1: column_constraint_not_null : NOT NULL ( table_conflict_clause )? -> ^( NOT_NULL ( table_conflict_clause )? ) ;
    public final SqlParser.column_constraint_not_null_return column_constraint_not_null() throws RecognitionException {
        SqlParser.column_constraint_not_null_return retval = new SqlParser.column_constraint_not_null_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT333=null;
        Token NULL334=null;
        SqlParser.table_conflict_clause_return table_conflict_clause335 = null;


        Object NOT333_tree=null;
        Object NULL334_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // SqlParser.g:315:27: ( NOT NULL ( table_conflict_clause )? -> ^( NOT_NULL ( table_conflict_clause )? ) )
            // SqlParser.g:315:29: NOT NULL ( table_conflict_clause )?
            {
            NOT333=(Token)match(input,NOT,FOLLOW_NOT_in_column_constraint_not_null2815);  
            stream_NOT.add(NOT333);

            NULL334=(Token)match(input,NULL,FOLLOW_NULL_in_column_constraint_not_null2817);  
            stream_NULL.add(NULL334);

            // SqlParser.g:315:38: ( table_conflict_clause )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==ON) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // SqlParser.g:315:38: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_not_null2819);
                    table_conflict_clause335=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause335.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: table_conflict_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 315:61: -> ^( NOT_NULL ( table_conflict_clause )? )
            {
                // SqlParser.g:315:64: ^( NOT_NULL ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_NULL, "NOT_NULL"), root_1);

                // SqlParser.g:315:75: ( table_conflict_clause )?
                if ( stream_table_conflict_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_conflict_clause.nextTree());

                }
                stream_table_conflict_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "column_constraint_not_null"

    public static class column_constraint_unique_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "column_constraint_unique"
    // SqlParser.g:317:1: column_constraint_unique : UNIQUE ( table_conflict_clause )? ;
    public final SqlParser.column_constraint_unique_return column_constraint_unique() throws RecognitionException {
        SqlParser.column_constraint_unique_return retval = new SqlParser.column_constraint_unique_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNIQUE336=null;
        SqlParser.table_conflict_clause_return table_conflict_clause337 = null;


        Object UNIQUE336_tree=null;

        try {
            // SqlParser.g:317:25: ( UNIQUE ( table_conflict_clause )? )
            // SqlParser.g:317:27: UNIQUE ( table_conflict_clause )?
            {
            root_0 = (Object)adaptor.nil();

            UNIQUE336=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_column_constraint_unique2836); 
            UNIQUE336_tree = (Object)adaptor.create(UNIQUE336);
            root_0 = (Object)adaptor.becomeRoot(UNIQUE336_tree, root_0);

            // SqlParser.g:317:35: ( table_conflict_clause )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==ON) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // SqlParser.g:317:35: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_unique2839);
                    table_conflict_clause337=table_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, table_conflict_clause337.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "column_constraint_unique"

    public static class column_constraint_check_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "column_constraint_check"
    // SqlParser.g:319:1: column_constraint_check : CHECK LPAREN expr RPAREN ;
    public final SqlParser.column_constraint_check_return column_constraint_check() throws RecognitionException {
        SqlParser.column_constraint_check_return retval = new SqlParser.column_constraint_check_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CHECK338=null;
        Token LPAREN339=null;
        Token RPAREN341=null;
        SqlParser.expr_return expr340 = null;


        Object CHECK338_tree=null;
        Object LPAREN339_tree=null;
        Object RPAREN341_tree=null;

        try {
            // SqlParser.g:319:24: ( CHECK LPAREN expr RPAREN )
            // SqlParser.g:319:26: CHECK LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            CHECK338=(Token)match(input,CHECK,FOLLOW_CHECK_in_column_constraint_check2847); 
            CHECK338_tree = (Object)adaptor.create(CHECK338);
            root_0 = (Object)adaptor.becomeRoot(CHECK338_tree, root_0);

            LPAREN339=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_column_constraint_check2850); 
            pushFollow(FOLLOW_expr_in_column_constraint_check2853);
            expr340=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr340.getTree());
            RPAREN341=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_column_constraint_check2855); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "column_constraint_check"

    public static class column_constraint_default_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "column_constraint_default"
    // SqlParser.g:322:1: column_constraint_default : DEFAULT ( ( PLUS | MINUS ) ( INTEGER | FLOAT ) | literal_value | LPAREN expr RPAREN ) ;
    public final SqlParser.column_constraint_default_return column_constraint_default() throws RecognitionException {
        SqlParser.column_constraint_default_return retval = new SqlParser.column_constraint_default_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT342=null;
        Token set343=null;
        Token set344=null;
        Token LPAREN346=null;
        Token RPAREN348=null;
        SqlParser.literal_value_return literal_value345 = null;

        SqlParser.expr_return expr347 = null;


        Object DEFAULT342_tree=null;
        Object set343_tree=null;
        Object set344_tree=null;
        Object LPAREN346_tree=null;
        Object RPAREN348_tree=null;

        try {
            // SqlParser.g:322:26: ( DEFAULT ( ( PLUS | MINUS ) ( INTEGER | FLOAT ) | literal_value | LPAREN expr RPAREN ) )
            // SqlParser.g:322:28: DEFAULT ( ( PLUS | MINUS ) ( INTEGER | FLOAT ) | literal_value | LPAREN expr RPAREN )
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT342=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_column_constraint_default2864); 
            DEFAULT342_tree = (Object)adaptor.create(DEFAULT342);
            root_0 = (Object)adaptor.becomeRoot(DEFAULT342_tree, root_0);

            // SqlParser.g:322:37: ( ( PLUS | MINUS ) ( INTEGER | FLOAT ) | literal_value | LPAREN expr RPAREN )
            int alt129=3;
            switch ( input.LA(1) ) {
            case PLUS:
            case MINUS:
                {
                alt129=1;
                }
                break;
            case CURRENT_TIME:
            case CURRENT_DATE:
            case CURRENT_TIMESTAMP:
            case NULL:
            case STRING:
            case INTEGER:
            case FLOAT:
            case BLOB:
                {
                alt129=2;
                }
                break;
            case LPAREN:
                {
                alt129=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }

            switch (alt129) {
                case 1 :
                    // SqlParser.g:322:38: ( PLUS | MINUS ) ( INTEGER | FLOAT )
                    {
                    set343=(Token)input.LT(1);
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set343));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    set344=(Token)input.LT(1);
                    if ( input.LA(1)==INTEGER||input.LA(1)==FLOAT ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set344));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:322:73: literal_value
                    {
                    pushFollow(FOLLOW_literal_value_in_column_constraint_default2886);
                    literal_value345=literal_value();

                    state._fsp--;

                    adaptor.addChild(root_0, literal_value345.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:322:89: LPAREN expr RPAREN
                    {
                    LPAREN346=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_column_constraint_default2890); 
                    pushFollow(FOLLOW_expr_in_column_constraint_default2893);
                    expr347=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr347.getTree());
                    RPAREN348=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_column_constraint_default2895); 

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "column_constraint_default"

    public static class column_constraint_collate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "column_constraint_collate"
    // SqlParser.g:324:1: column_constraint_collate : COLLATE collation_name= id ;
    public final SqlParser.column_constraint_collate_return column_constraint_collate() throws RecognitionException {
        SqlParser.column_constraint_collate_return retval = new SqlParser.column_constraint_collate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLLATE349=null;
        SqlParser.id_return collation_name = null;


        Object COLLATE349_tree=null;

        try {
            // SqlParser.g:324:26: ( COLLATE collation_name= id )
            // SqlParser.g:324:28: COLLATE collation_name= id
            {
            root_0 = (Object)adaptor.nil();

            COLLATE349=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_column_constraint_collate2904); 
            COLLATE349_tree = (Object)adaptor.create(COLLATE349);
            root_0 = (Object)adaptor.becomeRoot(COLLATE349_tree, root_0);

            pushFollow(FOLLOW_id_in_column_constraint_collate2909);
            collation_name=id();

            state._fsp--;

            adaptor.addChild(root_0, collation_name.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "column_constraint_collate"

    public static class table_constraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "table_constraint"
    // SqlParser.g:326:1: table_constraint : ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk ) -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? ) ;
    public final SqlParser.table_constraint_return table_constraint() throws RecognitionException {
        SqlParser.table_constraint_return retval = new SqlParser.table_constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONSTRAINT350=null;
        SqlParser.id_return name = null;

        SqlParser.table_constraint_pk_return table_constraint_pk351 = null;

        SqlParser.table_constraint_unique_return table_constraint_unique352 = null;

        SqlParser.table_constraint_check_return table_constraint_check353 = null;

        SqlParser.table_constraint_fk_return table_constraint_fk354 = null;


        Object CONSTRAINT350_tree=null;
        RewriteRuleTokenStream stream_CONSTRAINT=new RewriteRuleTokenStream(adaptor,"token CONSTRAINT");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_table_constraint_pk=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_pk");
        RewriteRuleSubtreeStream stream_table_constraint_fk=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_fk");
        RewriteRuleSubtreeStream stream_table_constraint_unique=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_unique");
        RewriteRuleSubtreeStream stream_table_constraint_check=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_check");
        try {
            // SqlParser.g:326:17: ( ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk ) -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? ) )
            // SqlParser.g:326:19: ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk )
            {
            // SqlParser.g:326:19: ( CONSTRAINT name= id )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==CONSTRAINT) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // SqlParser.g:326:20: CONSTRAINT name= id
                    {
                    CONSTRAINT350=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_table_constraint2918);  
                    stream_CONSTRAINT.add(CONSTRAINT350);

                    pushFollow(FOLLOW_id_in_table_constraint2922);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());

                    }
                    break;

            }

            // SqlParser.g:327:3: ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk )
            int alt131=4;
            switch ( input.LA(1) ) {
            case PRIMARY:
                {
                alt131=1;
                }
                break;
            case UNIQUE:
                {
                alt131=2;
                }
                break;
            case CHECK:
                {
                alt131=3;
                }
                break;
            case FOREIGN:
                {
                alt131=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 131, 0, input);

                throw nvae;
            }

            switch (alt131) {
                case 1 :
                    // SqlParser.g:327:5: table_constraint_pk
                    {
                    pushFollow(FOLLOW_table_constraint_pk_in_table_constraint2930);
                    table_constraint_pk351=table_constraint_pk();

                    state._fsp--;

                    stream_table_constraint_pk.add(table_constraint_pk351.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:328:5: table_constraint_unique
                    {
                    pushFollow(FOLLOW_table_constraint_unique_in_table_constraint2936);
                    table_constraint_unique352=table_constraint_unique();

                    state._fsp--;

                    stream_table_constraint_unique.add(table_constraint_unique352.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:329:5: table_constraint_check
                    {
                    pushFollow(FOLLOW_table_constraint_check_in_table_constraint2942);
                    table_constraint_check353=table_constraint_check();

                    state._fsp--;

                    stream_table_constraint_check.add(table_constraint_check353.getTree());

                    }
                    break;
                case 4 :
                    // SqlParser.g:330:5: table_constraint_fk
                    {
                    pushFollow(FOLLOW_table_constraint_fk_in_table_constraint2948);
                    table_constraint_fk354=table_constraint_fk();

                    state._fsp--;

                    stream_table_constraint_fk.add(table_constraint_fk354.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: table_constraint_fk, table_constraint_check, table_constraint_unique, table_constraint_pk, name
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 331:1: -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? )
            {
                // SqlParser.g:331:4: ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TABLE_CONSTRAINT, "TABLE_CONSTRAINT"), root_1);

                // SqlParser.g:332:3: ( table_constraint_pk )?
                if ( stream_table_constraint_pk.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_pk.nextTree());

                }
                stream_table_constraint_pk.reset();
                // SqlParser.g:333:3: ( table_constraint_unique )?
                if ( stream_table_constraint_unique.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_unique.nextTree());

                }
                stream_table_constraint_unique.reset();
                // SqlParser.g:334:3: ( table_constraint_check )?
                if ( stream_table_constraint_check.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_check.nextTree());

                }
                stream_table_constraint_check.reset();
                // SqlParser.g:335:3: ( table_constraint_fk )?
                if ( stream_table_constraint_fk.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_fk.nextTree());

                }
                stream_table_constraint_fk.reset();
                // SqlParser.g:336:3: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextTree());

                }
                stream_name.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "table_constraint"

    public static class table_constraint_pk_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "table_constraint_pk"
    // SqlParser.g:338:1: table_constraint_pk : PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) ;
    public final SqlParser.table_constraint_pk_return table_constraint_pk() throws RecognitionException {
        SqlParser.table_constraint_pk_return retval = new SqlParser.table_constraint_pk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRIMARY355=null;
        Token KEY356=null;
        Token LPAREN357=null;
        Token COMMA358=null;
        Token RPAREN359=null;
        List list_indexed_columns=null;
        SqlParser.table_conflict_clause_return table_conflict_clause360 = null;

        SqlParser.id_return indexed_columns = null;
         indexed_columns = null;
        Object PRIMARY355_tree=null;
        Object KEY356_tree=null;
        Object LPAREN357_tree=null;
        Object COMMA358_tree=null;
        Object RPAREN359_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_PRIMARY=new RewriteRuleTokenStream(adaptor,"token PRIMARY");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // SqlParser.g:338:20: ( PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) )
            // SqlParser.g:338:22: PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )?
            {
            PRIMARY355=(Token)match(input,PRIMARY,FOLLOW_PRIMARY_in_table_constraint_pk2988);  
            stream_PRIMARY.add(PRIMARY355);

            KEY356=(Token)match(input,KEY,FOLLOW_KEY_in_table_constraint_pk2990);  
            stream_KEY.add(KEY356);

            LPAREN357=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_pk2994);  
            stream_LPAREN.add(LPAREN357);

            pushFollow(FOLLOW_id_in_table_constraint_pk2998);
            indexed_columns=id();

            state._fsp--;

            stream_id.add(indexed_columns.getTree());
            if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            list_indexed_columns.add(indexed_columns.getTree());

            // SqlParser.g:339:30: ( COMMA indexed_columns+= id )*
            loop132:
            do {
                int alt132=2;
                int LA132_0 = input.LA(1);

                if ( (LA132_0==COMMA) ) {
                    alt132=1;
                }


                switch (alt132) {
            	case 1 :
            	    // SqlParser.g:339:31: COMMA indexed_columns+= id
            	    {
            	    COMMA358=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_pk3001);  
            	    stream_COMMA.add(COMMA358);

            	    pushFollow(FOLLOW_id_in_table_constraint_pk3005);
            	    indexed_columns=id();

            	    state._fsp--;

            	    stream_id.add(indexed_columns.getTree());
            	    if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            	    list_indexed_columns.add(indexed_columns.getTree());


            	    }
            	    break;

            	default :
            	    break loop132;
                }
            } while (true);

            RPAREN359=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_pk3009);  
            stream_RPAREN.add(RPAREN359);

            // SqlParser.g:339:66: ( table_conflict_clause )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==ON) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // SqlParser.g:339:66: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_table_constraint_pk3011);
                    table_conflict_clause360=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause360.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: PRIMARY, table_conflict_clause, indexed_columns
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: indexed_columns
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_indexed_columns=new RewriteRuleSubtreeStream(adaptor,"token indexed_columns",list_indexed_columns);
            root_0 = (Object)adaptor.nil();
            // 340:1: -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
            {
                // SqlParser.g:340:4: ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_PRIMARY.nextNode(), root_1);

                // SqlParser.g:340:14: ^( COLUMNS ( $indexed_columns)+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMNS, "COLUMNS"), root_2);

                if ( !(stream_indexed_columns.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_indexed_columns.hasNext() ) {
                    adaptor.addChild(root_2, stream_indexed_columns.nextTree());

                }
                stream_indexed_columns.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:340:43: ( table_conflict_clause )?
                if ( stream_table_conflict_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_conflict_clause.nextTree());

                }
                stream_table_conflict_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "table_constraint_pk"

    public static class table_constraint_unique_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "table_constraint_unique"
    // SqlParser.g:342:1: table_constraint_unique : UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) ;
    public final SqlParser.table_constraint_unique_return table_constraint_unique() throws RecognitionException {
        SqlParser.table_constraint_unique_return retval = new SqlParser.table_constraint_unique_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNIQUE361=null;
        Token LPAREN362=null;
        Token COMMA363=null;
        Token RPAREN364=null;
        List list_indexed_columns=null;
        SqlParser.table_conflict_clause_return table_conflict_clause365 = null;

        SqlParser.id_return indexed_columns = null;
         indexed_columns = null;
        Object UNIQUE361_tree=null;
        Object LPAREN362_tree=null;
        Object COMMA363_tree=null;
        Object RPAREN364_tree=null;
        RewriteRuleTokenStream stream_UNIQUE=new RewriteRuleTokenStream(adaptor,"token UNIQUE");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // SqlParser.g:342:24: ( UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) )
            // SqlParser.g:342:26: UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )?
            {
            UNIQUE361=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_table_constraint_unique3036);  
            stream_UNIQUE.add(UNIQUE361);

            LPAREN362=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_unique3040);  
            stream_LPAREN.add(LPAREN362);

            pushFollow(FOLLOW_id_in_table_constraint_unique3044);
            indexed_columns=id();

            state._fsp--;

            stream_id.add(indexed_columns.getTree());
            if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            list_indexed_columns.add(indexed_columns.getTree());

            // SqlParser.g:343:30: ( COMMA indexed_columns+= id )*
            loop134:
            do {
                int alt134=2;
                int LA134_0 = input.LA(1);

                if ( (LA134_0==COMMA) ) {
                    alt134=1;
                }


                switch (alt134) {
            	case 1 :
            	    // SqlParser.g:343:31: COMMA indexed_columns+= id
            	    {
            	    COMMA363=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_unique3047);  
            	    stream_COMMA.add(COMMA363);

            	    pushFollow(FOLLOW_id_in_table_constraint_unique3051);
            	    indexed_columns=id();

            	    state._fsp--;

            	    stream_id.add(indexed_columns.getTree());
            	    if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            	    list_indexed_columns.add(indexed_columns.getTree());


            	    }
            	    break;

            	default :
            	    break loop134;
                }
            } while (true);

            RPAREN364=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_unique3055);  
            stream_RPAREN.add(RPAREN364);

            // SqlParser.g:343:66: ( table_conflict_clause )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==ON) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // SqlParser.g:343:66: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_table_constraint_unique3057);
                    table_conflict_clause365=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause365.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: indexed_columns, table_conflict_clause, UNIQUE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: indexed_columns
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_indexed_columns=new RewriteRuleSubtreeStream(adaptor,"token indexed_columns",list_indexed_columns);
            root_0 = (Object)adaptor.nil();
            // 344:1: -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
            {
                // SqlParser.g:344:4: ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_UNIQUE.nextNode(), root_1);

                // SqlParser.g:344:13: ^( COLUMNS ( $indexed_columns)+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMNS, "COLUMNS"), root_2);

                if ( !(stream_indexed_columns.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_indexed_columns.hasNext() ) {
                    adaptor.addChild(root_2, stream_indexed_columns.nextTree());

                }
                stream_indexed_columns.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:344:42: ( table_conflict_clause )?
                if ( stream_table_conflict_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_conflict_clause.nextTree());

                }
                stream_table_conflict_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "table_constraint_unique"

    public static class table_constraint_check_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "table_constraint_check"
    // SqlParser.g:346:1: table_constraint_check : CHECK LPAREN expr RPAREN ;
    public final SqlParser.table_constraint_check_return table_constraint_check() throws RecognitionException {
        SqlParser.table_constraint_check_return retval = new SqlParser.table_constraint_check_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CHECK366=null;
        Token LPAREN367=null;
        Token RPAREN369=null;
        SqlParser.expr_return expr368 = null;


        Object CHECK366_tree=null;
        Object LPAREN367_tree=null;
        Object RPAREN369_tree=null;

        try {
            // SqlParser.g:346:23: ( CHECK LPAREN expr RPAREN )
            // SqlParser.g:346:25: CHECK LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            CHECK366=(Token)match(input,CHECK,FOLLOW_CHECK_in_table_constraint_check3082); 
            CHECK366_tree = (Object)adaptor.create(CHECK366);
            root_0 = (Object)adaptor.becomeRoot(CHECK366_tree, root_0);

            LPAREN367=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_check3085); 
            pushFollow(FOLLOW_expr_in_table_constraint_check3088);
            expr368=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr368.getTree());
            RPAREN369=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_check3090); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "table_constraint_check"

    public static class table_constraint_fk_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "table_constraint_fk"
    // SqlParser.g:348:1: table_constraint_fk : FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause ) ;
    public final SqlParser.table_constraint_fk_return table_constraint_fk() throws RecognitionException {
        SqlParser.table_constraint_fk_return retval = new SqlParser.table_constraint_fk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOREIGN370=null;
        Token KEY371=null;
        Token LPAREN372=null;
        Token COMMA373=null;
        Token RPAREN374=null;
        List list_column_names=null;
        SqlParser.fk_clause_return fk_clause375 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object FOREIGN370_tree=null;
        Object KEY371_tree=null;
        Object LPAREN372_tree=null;
        Object COMMA373_tree=null;
        Object RPAREN374_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_FOREIGN=new RewriteRuleTokenStream(adaptor,"token FOREIGN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_fk_clause=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause");
        try {
            // SqlParser.g:348:20: ( FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause ) )
            // SqlParser.g:348:22: FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause
            {
            FOREIGN370=(Token)match(input,FOREIGN,FOLLOW_FOREIGN_in_table_constraint_fk3098);  
            stream_FOREIGN.add(FOREIGN370);

            KEY371=(Token)match(input,KEY,FOLLOW_KEY_in_table_constraint_fk3100);  
            stream_KEY.add(KEY371);

            LPAREN372=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_fk3102);  
            stream_LPAREN.add(LPAREN372);

            pushFollow(FOLLOW_id_in_table_constraint_fk3106);
            column_names=id();

            state._fsp--;

            stream_id.add(column_names.getTree());
            if (list_column_names==null) list_column_names=new ArrayList();
            list_column_names.add(column_names.getTree());

            // SqlParser.g:348:58: ( COMMA column_names+= id )*
            loop136:
            do {
                int alt136=2;
                int LA136_0 = input.LA(1);

                if ( (LA136_0==COMMA) ) {
                    alt136=1;
                }


                switch (alt136) {
            	case 1 :
            	    // SqlParser.g:348:59: COMMA column_names+= id
            	    {
            	    COMMA373=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_fk3109);  
            	    stream_COMMA.add(COMMA373);

            	    pushFollow(FOLLOW_id_in_table_constraint_fk3113);
            	    column_names=id();

            	    state._fsp--;

            	    stream_id.add(column_names.getTree());
            	    if (list_column_names==null) list_column_names=new ArrayList();
            	    list_column_names.add(column_names.getTree());


            	    }
            	    break;

            	default :
            	    break loop136;
                }
            } while (true);

            RPAREN374=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_fk3117);  
            stream_RPAREN.add(RPAREN374);

            pushFollow(FOLLOW_fk_clause_in_table_constraint_fk3119);
            fk_clause375=fk_clause();

            state._fsp--;

            stream_fk_clause.add(fk_clause375.getTree());


            // AST REWRITE
            // elements: fk_clause, column_names, FOREIGN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: column_names
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_column_names=new RewriteRuleSubtreeStream(adaptor,"token column_names",list_column_names);
            root_0 = (Object)adaptor.nil();
            // 349:1: -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause )
            {
                // SqlParser.g:349:4: ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FOREIGN.nextNode(), root_1);

                // SqlParser.g:349:14: ^( COLUMNS ( $column_names)+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMNS, "COLUMNS"), root_2);

                if ( !(stream_column_names.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_column_names.hasNext() ) {
                    adaptor.addChild(root_2, stream_column_names.nextTree());

                }
                stream_column_names.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_fk_clause.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "table_constraint_fk"

    public static class fk_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fk_clause"
    // SqlParser.g:351:1: fk_clause : REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )? -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )+ ( fk_clause_deferrable )? ) ;
    public final SqlParser.fk_clause_return fk_clause() throws RecognitionException {
        SqlParser.fk_clause_return retval = new SqlParser.fk_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REFERENCES376=null;
        Token LPAREN377=null;
        Token COMMA378=null;
        Token RPAREN379=null;
        List list_column_names=null;
        SqlParser.id_return foreign_table = null;

        SqlParser.fk_clause_action_return fk_clause_action380 = null;

        SqlParser.fk_clause_deferrable_return fk_clause_deferrable381 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object REFERENCES376_tree=null;
        Object LPAREN377_tree=null;
        Object COMMA378_tree=null;
        Object RPAREN379_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_REFERENCES=new RewriteRuleTokenStream(adaptor,"token REFERENCES");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_fk_clause_action=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause_action");
        RewriteRuleSubtreeStream stream_fk_clause_deferrable=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause_deferrable");
        try {
            // SqlParser.g:351:10: ( REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )? -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )+ ( fk_clause_deferrable )? ) )
            // SqlParser.g:351:12: REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )?
            {
            REFERENCES376=(Token)match(input,REFERENCES,FOLLOW_REFERENCES_in_fk_clause3142);  
            stream_REFERENCES.add(REFERENCES376);

            pushFollow(FOLLOW_id_in_fk_clause3146);
            foreign_table=id();

            state._fsp--;

            stream_id.add(foreign_table.getTree());
            // SqlParser.g:351:40: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==LPAREN) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // SqlParser.g:351:41: LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                    {
                    LPAREN377=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_fk_clause3149);  
                    stream_LPAREN.add(LPAREN377);

                    pushFollow(FOLLOW_id_in_fk_clause3153);
                    column_names=id();

                    state._fsp--;

                    stream_id.add(column_names.getTree());
                    if (list_column_names==null) list_column_names=new ArrayList();
                    list_column_names.add(column_names.getTree());

                    // SqlParser.g:351:65: ( COMMA column_names+= id )*
                    loop137:
                    do {
                        int alt137=2;
                        int LA137_0 = input.LA(1);

                        if ( (LA137_0==COMMA) ) {
                            alt137=1;
                        }


                        switch (alt137) {
                    	case 1 :
                    	    // SqlParser.g:351:66: COMMA column_names+= id
                    	    {
                    	    COMMA378=(Token)match(input,COMMA,FOLLOW_COMMA_in_fk_clause3156);  
                    	    stream_COMMA.add(COMMA378);

                    	    pushFollow(FOLLOW_id_in_fk_clause3160);
                    	    column_names=id();

                    	    state._fsp--;

                    	    stream_id.add(column_names.getTree());
                    	    if (list_column_names==null) list_column_names=new ArrayList();
                    	    list_column_names.add(column_names.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop137;
                        }
                    } while (true);

                    RPAREN379=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_fk_clause3164);  
                    stream_RPAREN.add(RPAREN379);


                    }
                    break;

            }

            // SqlParser.g:352:3: ( fk_clause_action )+
            int cnt139=0;
            loop139:
            do {
                int alt139=2;
                int LA139_0 = input.LA(1);

                if ( (LA139_0==MATCH||LA139_0==ON) ) {
                    alt139=1;
                }


                switch (alt139) {
            	case 1 :
            	    // SqlParser.g:352:3: fk_clause_action
            	    {
            	    pushFollow(FOLLOW_fk_clause_action_in_fk_clause3170);
            	    fk_clause_action380=fk_clause_action();

            	    state._fsp--;

            	    stream_fk_clause_action.add(fk_clause_action380.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt139 >= 1 ) break loop139;
                        EarlyExitException eee =
                            new EarlyExitException(139, input);
                        throw eee;
                }
                cnt139++;
            } while (true);

            // SqlParser.g:352:21: ( fk_clause_deferrable )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==NOT) ) {
                int LA140_1 = input.LA(2);

                if ( (LA140_1==DEFERRABLE) ) {
                    alt140=1;
                }
            }
            else if ( (LA140_0==DEFERRABLE) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // SqlParser.g:352:21: fk_clause_deferrable
                    {
                    pushFollow(FOLLOW_fk_clause_deferrable_in_fk_clause3173);
                    fk_clause_deferrable381=fk_clause_deferrable();

                    state._fsp--;

                    stream_fk_clause_deferrable.add(fk_clause_deferrable381.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: foreign_table, column_names, REFERENCES, fk_clause_deferrable, fk_clause_action
            // token labels: 
            // rule labels: retval, foreign_table
            // token list labels: 
            // rule list labels: column_names
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_foreign_table=new RewriteRuleSubtreeStream(adaptor,"rule foreign_table",foreign_table!=null?foreign_table.tree:null);
            RewriteRuleSubtreeStream stream_column_names=new RewriteRuleSubtreeStream(adaptor,"token column_names",list_column_names);
            root_0 = (Object)adaptor.nil();
            // 353:1: -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )+ ( fk_clause_deferrable )? )
            {
                // SqlParser.g:353:4: ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )+ ( fk_clause_deferrable )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_REFERENCES.nextNode(), root_1);

                adaptor.addChild(root_1, stream_foreign_table.nextTree());
                // SqlParser.g:353:32: ^( COLUMNS ( $column_names)+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMNS, "COLUMNS"), root_2);

                if ( !(stream_column_names.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_column_names.hasNext() ) {
                    adaptor.addChild(root_2, stream_column_names.nextTree());

                }
                stream_column_names.reset();

                adaptor.addChild(root_1, root_2);
                }
                if ( !(stream_fk_clause_action.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_fk_clause_action.hasNext() ) {
                    adaptor.addChild(root_1, stream_fk_clause_action.nextTree());

                }
                stream_fk_clause_action.reset();
                // SqlParser.g:353:76: ( fk_clause_deferrable )?
                if ( stream_fk_clause_deferrable.hasNext() ) {
                    adaptor.addChild(root_1, stream_fk_clause_deferrable.nextTree());

                }
                stream_fk_clause_deferrable.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fk_clause"

    public static class fk_clause_action_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fk_clause_action"
    // SqlParser.g:355:1: fk_clause_action : ( ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT ) | MATCH id );
    public final SqlParser.fk_clause_action_return fk_clause_action() throws RecognitionException {
        SqlParser.fk_clause_action_return retval = new SqlParser.fk_clause_action_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ON382=null;
        Token set383=null;
        Token SET384=null;
        Token NULL385=null;
        Token SET386=null;
        Token DEFAULT387=null;
        Token CASCADE388=null;
        Token RESTRICT389=null;
        Token MATCH390=null;
        SqlParser.id_return id391 = null;


        Object ON382_tree=null;
        Object set383_tree=null;
        Object SET384_tree=null;
        Object NULL385_tree=null;
        Object SET386_tree=null;
        Object DEFAULT387_tree=null;
        Object CASCADE388_tree=null;
        Object RESTRICT389_tree=null;
        Object MATCH390_tree=null;

        try {
            // SqlParser.g:356:3: ( ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT ) | MATCH id )
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==ON) ) {
                alt142=1;
            }
            else if ( (LA142_0==MATCH) ) {
                alt142=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;
            }
            switch (alt142) {
                case 1 :
                    // SqlParser.g:356:5: ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT )
                    {
                    root_0 = (Object)adaptor.nil();

                    ON382=(Token)match(input,ON,FOLLOW_ON_in_fk_clause_action3207); 
                    ON382_tree = (Object)adaptor.create(ON382);
                    root_0 = (Object)adaptor.becomeRoot(ON382_tree, root_0);

                    set383=(Token)input.LT(1);
                    if ( input.LA(1)==DELETE||input.LA(1)==INSERT||input.LA(1)==UPDATE ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set383));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // SqlParser.g:356:36: ( SET NULL | SET DEFAULT | CASCADE | RESTRICT )
                    int alt141=4;
                    switch ( input.LA(1) ) {
                    case SET:
                        {
                        int LA141_1 = input.LA(2);

                        if ( (LA141_1==NULL) ) {
                            alt141=1;
                        }
                        else if ( (LA141_1==DEFAULT) ) {
                            alt141=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 141, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case CASCADE:
                        {
                        alt141=3;
                        }
                        break;
                    case RESTRICT:
                        {
                        alt141=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 141, 0, input);

                        throw nvae;
                    }

                    switch (alt141) {
                        case 1 :
                            // SqlParser.g:356:37: SET NULL
                            {
                            SET384=(Token)match(input,SET,FOLLOW_SET_in_fk_clause_action3223); 
                            NULL385=(Token)match(input,NULL,FOLLOW_NULL_in_fk_clause_action3226); 
                            NULL385_tree = (Object)adaptor.create(NULL385);
                            adaptor.addChild(root_0, NULL385_tree);


                            }
                            break;
                        case 2 :
                            // SqlParser.g:356:49: SET DEFAULT
                            {
                            SET386=(Token)match(input,SET,FOLLOW_SET_in_fk_clause_action3230); 
                            DEFAULT387=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_fk_clause_action3233); 
                            DEFAULT387_tree = (Object)adaptor.create(DEFAULT387);
                            adaptor.addChild(root_0, DEFAULT387_tree);


                            }
                            break;
                        case 3 :
                            // SqlParser.g:356:64: CASCADE
                            {
                            CASCADE388=(Token)match(input,CASCADE,FOLLOW_CASCADE_in_fk_clause_action3237); 
                            CASCADE388_tree = (Object)adaptor.create(CASCADE388);
                            adaptor.addChild(root_0, CASCADE388_tree);


                            }
                            break;
                        case 4 :
                            // SqlParser.g:356:74: RESTRICT
                            {
                            RESTRICT389=(Token)match(input,RESTRICT,FOLLOW_RESTRICT_in_fk_clause_action3241); 
                            RESTRICT389_tree = (Object)adaptor.create(RESTRICT389);
                            adaptor.addChild(root_0, RESTRICT389_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:357:5: MATCH id
                    {
                    root_0 = (Object)adaptor.nil();

                    MATCH390=(Token)match(input,MATCH,FOLLOW_MATCH_in_fk_clause_action3248); 
                    MATCH390_tree = (Object)adaptor.create(MATCH390);
                    root_0 = (Object)adaptor.becomeRoot(MATCH390_tree, root_0);

                    pushFollow(FOLLOW_id_in_fk_clause_action3251);
                    id391=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id391.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fk_clause_action"

    public static class fk_clause_deferrable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fk_clause_deferrable"
    // SqlParser.g:359:1: fk_clause_deferrable : ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )? ;
    public final SqlParser.fk_clause_deferrable_return fk_clause_deferrable() throws RecognitionException {
        SqlParser.fk_clause_deferrable_return retval = new SqlParser.fk_clause_deferrable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT392=null;
        Token DEFERRABLE393=null;
        Token INITIALLY394=null;
        Token DEFERRED395=null;
        Token INITIALLY396=null;
        Token IMMEDIATE397=null;

        Object NOT392_tree=null;
        Object DEFERRABLE393_tree=null;
        Object INITIALLY394_tree=null;
        Object DEFERRED395_tree=null;
        Object INITIALLY396_tree=null;
        Object IMMEDIATE397_tree=null;

        try {
            // SqlParser.g:359:21: ( ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )? )
            // SqlParser.g:359:23: ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:359:23: ( NOT )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==NOT) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // SqlParser.g:359:24: NOT
                    {
                    NOT392=(Token)match(input,NOT,FOLLOW_NOT_in_fk_clause_deferrable3259); 
                    NOT392_tree = (Object)adaptor.create(NOT392);
                    adaptor.addChild(root_0, NOT392_tree);


                    }
                    break;

            }

            DEFERRABLE393=(Token)match(input,DEFERRABLE,FOLLOW_DEFERRABLE_in_fk_clause_deferrable3263); 
            DEFERRABLE393_tree = (Object)adaptor.create(DEFERRABLE393);
            root_0 = (Object)adaptor.becomeRoot(DEFERRABLE393_tree, root_0);

            // SqlParser.g:359:42: ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?
            int alt144=3;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==INITIALLY) ) {
                int LA144_1 = input.LA(2);

                if ( (LA144_1==DEFERRED) ) {
                    alt144=1;
                }
                else if ( (LA144_1==IMMEDIATE) ) {
                    alt144=2;
                }
            }
            switch (alt144) {
                case 1 :
                    // SqlParser.g:359:43: INITIALLY DEFERRED
                    {
                    INITIALLY394=(Token)match(input,INITIALLY,FOLLOW_INITIALLY_in_fk_clause_deferrable3267); 
                    DEFERRED395=(Token)match(input,DEFERRED,FOLLOW_DEFERRED_in_fk_clause_deferrable3270); 
                    DEFERRED395_tree = (Object)adaptor.create(DEFERRED395);
                    adaptor.addChild(root_0, DEFERRED395_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:359:65: INITIALLY IMMEDIATE
                    {
                    INITIALLY396=(Token)match(input,INITIALLY,FOLLOW_INITIALLY_in_fk_clause_deferrable3274); 
                    IMMEDIATE397=(Token)match(input,IMMEDIATE,FOLLOW_IMMEDIATE_in_fk_clause_deferrable3277); 
                    IMMEDIATE397_tree = (Object)adaptor.create(IMMEDIATE397);
                    adaptor.addChild(root_0, IMMEDIATE397_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fk_clause_deferrable"

    public static class drop_table_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "drop_table_stmt"
    // SqlParser.g:362:1: drop_table_stmt : DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) ) ;
    public final SqlParser.drop_table_stmt_return drop_table_stmt() throws RecognitionException {
        SqlParser.drop_table_stmt_return retval = new SqlParser.drop_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP398=null;
        Token TABLE399=null;
        Token IF400=null;
        Token EXISTS401=null;
        Token DOT402=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;


        Object DROP398_tree=null;
        Object TABLE399_tree=null;
        Object IF400_tree=null;
        Object EXISTS401_tree=null;
        Object DOT402_tree=null;
        RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // SqlParser.g:362:16: ( DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) ) )
            // SqlParser.g:362:18: DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id
            {
            DROP398=(Token)match(input,DROP,FOLLOW_DROP_in_drop_table_stmt3287);  
            stream_DROP.add(DROP398);

            TABLE399=(Token)match(input,TABLE,FOLLOW_TABLE_in_drop_table_stmt3289);  
            stream_TABLE.add(TABLE399);

            // SqlParser.g:362:29: ( IF EXISTS )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==IF) ) {
                int LA145_1 = input.LA(2);

                if ( (LA145_1==EXISTS) ) {
                    alt145=1;
                }
            }
            switch (alt145) {
                case 1 :
                    // SqlParser.g:362:30: IF EXISTS
                    {
                    IF400=(Token)match(input,IF,FOLLOW_IF_in_drop_table_stmt3292);  
                    stream_IF.add(IF400);

                    EXISTS401=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_table_stmt3294);  
                    stream_EXISTS.add(EXISTS401);


                    }
                    break;

            }

            // SqlParser.g:362:42: (database_name= id DOT )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==ID) ) {
                int LA146_1 = input.LA(2);

                if ( (LA146_1==DOT) ) {
                    alt146=1;
                }
            }
            else if ( ((LA146_0>=ABORT && LA146_0<=FROM)||(LA146_0>=GROUP && LA146_0<=IMMEDIATE)||(LA146_0>=INDEX && LA146_0<=IS)||(LA146_0>=JOIN && LA146_0<=LEFT)||LA146_0==LIMIT||LA146_0==NATURAL||(LA146_0>=NULL && LA146_0<=REFERENCES)||(LA146_0>=REINDEX && LA146_0<=WHERE)) ) {
                int LA146_2 = input.LA(2);

                if ( (LA146_2==DOT) ) {
                    alt146=1;
                }
            }
            switch (alt146) {
                case 1 :
                    // SqlParser.g:362:43: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_table_stmt3301);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT402=(Token)match(input,DOT,FOLLOW_DOT_in_drop_table_stmt3303);  
                    stream_DOT.add(DOT402);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_table_stmt3309);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());


            // AST REWRITE
            // elements: EXISTS, database_name, table_name
            // token labels: 
            // rule labels: database_name, retval, table_name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 363:1: -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) )
            {
                // SqlParser.g:363:4: ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DROP_TABLE, "DROP_TABLE"), root_1);

                // SqlParser.g:363:17: ^( OPTIONS ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:363:27: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:363:36: ^( $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                // SqlParser.g:363:50: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "drop_table_stmt"

    public static class alter_table_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "alter_table_stmt"
    // SqlParser.g:366:1: alter_table_stmt : ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def ) ;
    public final SqlParser.alter_table_stmt_return alter_table_stmt() throws RecognitionException {
        SqlParser.alter_table_stmt_return retval = new SqlParser.alter_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ALTER403=null;
        Token TABLE404=null;
        Token DOT405=null;
        Token RENAME406=null;
        Token TO407=null;
        Token ADD408=null;
        Token COLUMN409=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.id_return new_table_name = null;

        SqlParser.column_def_return column_def410 = null;


        Object ALTER403_tree=null;
        Object TABLE404_tree=null;
        Object DOT405_tree=null;
        Object RENAME406_tree=null;
        Object TO407_tree=null;
        Object ADD408_tree=null;
        Object COLUMN409_tree=null;

        try {
            // SqlParser.g:366:17: ( ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def ) )
            // SqlParser.g:366:19: ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def )
            {
            root_0 = (Object)adaptor.nil();

            ALTER403=(Token)match(input,ALTER,FOLLOW_ALTER_in_alter_table_stmt3339); 
            ALTER403_tree = (Object)adaptor.create(ALTER403);
            adaptor.addChild(root_0, ALTER403_tree);

            TABLE404=(Token)match(input,TABLE,FOLLOW_TABLE_in_alter_table_stmt3341); 
            TABLE404_tree = (Object)adaptor.create(TABLE404);
            adaptor.addChild(root_0, TABLE404_tree);

            // SqlParser.g:366:31: (database_name= id DOT )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==ID) ) {
                int LA147_1 = input.LA(2);

                if ( (LA147_1==DOT) ) {
                    alt147=1;
                }
            }
            else if ( ((LA147_0>=ABORT && LA147_0<=FROM)||(LA147_0>=GROUP && LA147_0<=IMMEDIATE)||(LA147_0>=INDEX && LA147_0<=IS)||(LA147_0>=JOIN && LA147_0<=LEFT)||LA147_0==LIMIT||LA147_0==NATURAL||(LA147_0>=NULL && LA147_0<=REFERENCES)||(LA147_0>=REINDEX && LA147_0<=WHERE)) ) {
                int LA147_2 = input.LA(2);

                if ( (LA147_2==DOT) ) {
                    alt147=1;
                }
            }
            switch (alt147) {
                case 1 :
                    // SqlParser.g:366:32: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_alter_table_stmt3346);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT405=(Token)match(input,DOT,FOLLOW_DOT_in_alter_table_stmt3348); 
                    DOT405_tree = (Object)adaptor.create(DOT405);
                    adaptor.addChild(root_0, DOT405_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_alter_table_stmt3354);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:366:69: ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def )
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==RENAME) ) {
                alt149=1;
            }
            else if ( (LA149_0==ADD) ) {
                alt149=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 149, 0, input);

                throw nvae;
            }
            switch (alt149) {
                case 1 :
                    // SqlParser.g:366:70: RENAME TO new_table_name= id
                    {
                    RENAME406=(Token)match(input,RENAME,FOLLOW_RENAME_in_alter_table_stmt3357); 
                    RENAME406_tree = (Object)adaptor.create(RENAME406);
                    adaptor.addChild(root_0, RENAME406_tree);

                    TO407=(Token)match(input,TO,FOLLOW_TO_in_alter_table_stmt3359); 
                    TO407_tree = (Object)adaptor.create(TO407);
                    adaptor.addChild(root_0, TO407_tree);

                    pushFollow(FOLLOW_id_in_alter_table_stmt3363);
                    new_table_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, new_table_name.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:366:100: ADD ( COLUMN )? column_def
                    {
                    ADD408=(Token)match(input,ADD,FOLLOW_ADD_in_alter_table_stmt3367); 
                    ADD408_tree = (Object)adaptor.create(ADD408);
                    adaptor.addChild(root_0, ADD408_tree);

                    // SqlParser.g:366:104: ( COLUMN )?
                    int alt148=2;
                    int LA148_0 = input.LA(1);

                    if ( (LA148_0==COLUMN) ) {
                        alt148=1;
                    }
                    switch (alt148) {
                        case 1 :
                            // SqlParser.g:366:105: COLUMN
                            {
                            COLUMN409=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_alter_table_stmt3370); 
                            COLUMN409_tree = (Object)adaptor.create(COLUMN409);
                            adaptor.addChild(root_0, COLUMN409_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_column_def_in_alter_table_stmt3374);
                    column_def410=column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, column_def410.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "alter_table_stmt"

    public static class create_view_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_view_stmt"
    // SqlParser.g:369:1: create_view_stmt : CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS select_stmt ;
    public final SqlParser.create_view_stmt_return create_view_stmt() throws RecognitionException {
        SqlParser.create_view_stmt_return retval = new SqlParser.create_view_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE411=null;
        Token TEMPORARY412=null;
        Token VIEW413=null;
        Token IF414=null;
        Token NOT415=null;
        Token EXISTS416=null;
        Token DOT417=null;
        Token AS418=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return view_name = null;

        SqlParser.select_stmt_return select_stmt419 = null;


        Object CREATE411_tree=null;
        Object TEMPORARY412_tree=null;
        Object VIEW413_tree=null;
        Object IF414_tree=null;
        Object NOT415_tree=null;
        Object EXISTS416_tree=null;
        Object DOT417_tree=null;
        Object AS418_tree=null;

        try {
            // SqlParser.g:369:17: ( CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS select_stmt )
            // SqlParser.g:369:19: CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS select_stmt
            {
            root_0 = (Object)adaptor.nil();

            CREATE411=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_view_stmt3383); 
            CREATE411_tree = (Object)adaptor.create(CREATE411);
            adaptor.addChild(root_0, CREATE411_tree);

            // SqlParser.g:369:26: ( TEMPORARY )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==TEMPORARY) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // SqlParser.g:369:26: TEMPORARY
                    {
                    TEMPORARY412=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_view_stmt3385); 
                    TEMPORARY412_tree = (Object)adaptor.create(TEMPORARY412);
                    adaptor.addChild(root_0, TEMPORARY412_tree);


                    }
                    break;

            }

            VIEW413=(Token)match(input,VIEW,FOLLOW_VIEW_in_create_view_stmt3388); 
            VIEW413_tree = (Object)adaptor.create(VIEW413);
            adaptor.addChild(root_0, VIEW413_tree);

            // SqlParser.g:369:42: ( IF NOT EXISTS )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==IF) ) {
                int LA151_1 = input.LA(2);

                if ( (LA151_1==NOT) ) {
                    alt151=1;
                }
            }
            switch (alt151) {
                case 1 :
                    // SqlParser.g:369:43: IF NOT EXISTS
                    {
                    IF414=(Token)match(input,IF,FOLLOW_IF_in_create_view_stmt3391); 
                    IF414_tree = (Object)adaptor.create(IF414);
                    adaptor.addChild(root_0, IF414_tree);

                    NOT415=(Token)match(input,NOT,FOLLOW_NOT_in_create_view_stmt3393); 
                    NOT415_tree = (Object)adaptor.create(NOT415);
                    adaptor.addChild(root_0, NOT415_tree);

                    EXISTS416=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_view_stmt3395); 
                    EXISTS416_tree = (Object)adaptor.create(EXISTS416);
                    adaptor.addChild(root_0, EXISTS416_tree);


                    }
                    break;

            }

            // SqlParser.g:369:59: (database_name= id DOT )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==ID) ) {
                int LA152_1 = input.LA(2);

                if ( (LA152_1==DOT) ) {
                    alt152=1;
                }
            }
            else if ( ((LA152_0>=ABORT && LA152_0<=FROM)||(LA152_0>=GROUP && LA152_0<=IMMEDIATE)||(LA152_0>=INDEX && LA152_0<=IS)||(LA152_0>=JOIN && LA152_0<=LEFT)||LA152_0==LIMIT||LA152_0==NATURAL||(LA152_0>=NULL && LA152_0<=REFERENCES)||(LA152_0>=REINDEX && LA152_0<=WHERE)) ) {
                int LA152_2 = input.LA(2);

                if ( (LA152_2==DOT) ) {
                    alt152=1;
                }
            }
            switch (alt152) {
                case 1 :
                    // SqlParser.g:369:60: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_view_stmt3402);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT417=(Token)match(input,DOT,FOLLOW_DOT_in_create_view_stmt3404); 
                    DOT417_tree = (Object)adaptor.create(DOT417);
                    adaptor.addChild(root_0, DOT417_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_view_stmt3410);
            view_name=id();

            state._fsp--;

            adaptor.addChild(root_0, view_name.getTree());
            AS418=(Token)match(input,AS,FOLLOW_AS_in_create_view_stmt3412); 
            AS418_tree = (Object)adaptor.create(AS418);
            adaptor.addChild(root_0, AS418_tree);

            pushFollow(FOLLOW_select_stmt_in_create_view_stmt3414);
            select_stmt419=select_stmt();

            state._fsp--;

            adaptor.addChild(root_0, select_stmt419.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "create_view_stmt"

    public static class drop_view_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "drop_view_stmt"
    // SqlParser.g:372:1: drop_view_stmt : DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id ;
    public final SqlParser.drop_view_stmt_return drop_view_stmt() throws RecognitionException {
        SqlParser.drop_view_stmt_return retval = new SqlParser.drop_view_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP420=null;
        Token VIEW421=null;
        Token IF422=null;
        Token EXISTS423=null;
        Token DOT424=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return view_name = null;


        Object DROP420_tree=null;
        Object VIEW421_tree=null;
        Object IF422_tree=null;
        Object EXISTS423_tree=null;
        Object DOT424_tree=null;

        try {
            // SqlParser.g:372:15: ( DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id )
            // SqlParser.g:372:17: DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id
            {
            root_0 = (Object)adaptor.nil();

            DROP420=(Token)match(input,DROP,FOLLOW_DROP_in_drop_view_stmt3422); 
            DROP420_tree = (Object)adaptor.create(DROP420);
            adaptor.addChild(root_0, DROP420_tree);

            VIEW421=(Token)match(input,VIEW,FOLLOW_VIEW_in_drop_view_stmt3424); 
            VIEW421_tree = (Object)adaptor.create(VIEW421);
            adaptor.addChild(root_0, VIEW421_tree);

            // SqlParser.g:372:27: ( IF EXISTS )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==IF) ) {
                int LA153_1 = input.LA(2);

                if ( (LA153_1==EXISTS) ) {
                    alt153=1;
                }
            }
            switch (alt153) {
                case 1 :
                    // SqlParser.g:372:28: IF EXISTS
                    {
                    IF422=(Token)match(input,IF,FOLLOW_IF_in_drop_view_stmt3427); 
                    IF422_tree = (Object)adaptor.create(IF422);
                    adaptor.addChild(root_0, IF422_tree);

                    EXISTS423=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_view_stmt3429); 
                    EXISTS423_tree = (Object)adaptor.create(EXISTS423);
                    adaptor.addChild(root_0, EXISTS423_tree);


                    }
                    break;

            }

            // SqlParser.g:372:40: (database_name= id DOT )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==ID) ) {
                int LA154_1 = input.LA(2);

                if ( (LA154_1==DOT) ) {
                    alt154=1;
                }
            }
            else if ( ((LA154_0>=ABORT && LA154_0<=FROM)||(LA154_0>=GROUP && LA154_0<=IMMEDIATE)||(LA154_0>=INDEX && LA154_0<=IS)||(LA154_0>=JOIN && LA154_0<=LEFT)||LA154_0==LIMIT||LA154_0==NATURAL||(LA154_0>=NULL && LA154_0<=REFERENCES)||(LA154_0>=REINDEX && LA154_0<=WHERE)) ) {
                int LA154_2 = input.LA(2);

                if ( (LA154_2==DOT) ) {
                    alt154=1;
                }
            }
            switch (alt154) {
                case 1 :
                    // SqlParser.g:372:41: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_view_stmt3436);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT424=(Token)match(input,DOT,FOLLOW_DOT_in_drop_view_stmt3438); 
                    DOT424_tree = (Object)adaptor.create(DOT424);
                    adaptor.addChild(root_0, DOT424_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_view_stmt3444);
            view_name=id();

            state._fsp--;

            adaptor.addChild(root_0, view_name.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "drop_view_stmt"

    public static class create_index_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_index_stmt"
    // SqlParser.g:375:1: create_index_stmt : CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? ) ;
    public final SqlParser.create_index_stmt_return create_index_stmt() throws RecognitionException {
        SqlParser.create_index_stmt_return retval = new SqlParser.create_index_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE425=null;
        Token UNIQUE426=null;
        Token INDEX427=null;
        Token IF428=null;
        Token NOT429=null;
        Token EXISTS430=null;
        Token DOT431=null;
        Token ON432=null;
        Token LPAREN433=null;
        Token COMMA434=null;
        Token RPAREN435=null;
        List list_columns=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return index_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.indexed_column_return columns = null;
         columns = null;
        Object CREATE425_tree=null;
        Object UNIQUE426_tree=null;
        Object INDEX427_tree=null;
        Object IF428_tree=null;
        Object NOT429_tree=null;
        Object EXISTS430_tree=null;
        Object DOT431_tree=null;
        Object ON432_tree=null;
        Object LPAREN433_tree=null;
        Object COMMA434_tree=null;
        Object RPAREN435_tree=null;
        RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
        RewriteRuleTokenStream stream_ON=new RewriteRuleTokenStream(adaptor,"token ON");
        RewriteRuleTokenStream stream_UNIQUE=new RewriteRuleTokenStream(adaptor,"token UNIQUE");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_indexed_column=new RewriteRuleSubtreeStream(adaptor,"rule indexed_column");
        try {
            // SqlParser.g:375:18: ( CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? ) )
            // SqlParser.g:375:20: CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN
            {
            CREATE425=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_index_stmt3452);  
            stream_CREATE.add(CREATE425);

            // SqlParser.g:375:27: ( UNIQUE )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==UNIQUE) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // SqlParser.g:375:28: UNIQUE
                    {
                    UNIQUE426=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_create_index_stmt3455);  
                    stream_UNIQUE.add(UNIQUE426);


                    }
                    break;

            }

            INDEX427=(Token)match(input,INDEX,FOLLOW_INDEX_in_create_index_stmt3459);  
            stream_INDEX.add(INDEX427);

            // SqlParser.g:375:43: ( IF NOT EXISTS )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==IF) ) {
                int LA156_1 = input.LA(2);

                if ( (LA156_1==NOT) ) {
                    alt156=1;
                }
            }
            switch (alt156) {
                case 1 :
                    // SqlParser.g:375:44: IF NOT EXISTS
                    {
                    IF428=(Token)match(input,IF,FOLLOW_IF_in_create_index_stmt3462);  
                    stream_IF.add(IF428);

                    NOT429=(Token)match(input,NOT,FOLLOW_NOT_in_create_index_stmt3464);  
                    stream_NOT.add(NOT429);

                    EXISTS430=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_index_stmt3466);  
                    stream_EXISTS.add(EXISTS430);


                    }
                    break;

            }

            // SqlParser.g:375:60: (database_name= id DOT )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==ID) ) {
                int LA157_1 = input.LA(2);

                if ( (LA157_1==DOT) ) {
                    alt157=1;
                }
            }
            else if ( ((LA157_0>=ABORT && LA157_0<=FROM)||(LA157_0>=GROUP && LA157_0<=IMMEDIATE)||(LA157_0>=INDEX && LA157_0<=IS)||(LA157_0>=JOIN && LA157_0<=LEFT)||LA157_0==LIMIT||LA157_0==NATURAL||(LA157_0>=NULL && LA157_0<=REFERENCES)||(LA157_0>=REINDEX && LA157_0<=WHERE)) ) {
                int LA157_2 = input.LA(2);

                if ( (LA157_2==DOT) ) {
                    alt157=1;
                }
            }
            switch (alt157) {
                case 1 :
                    // SqlParser.g:375:61: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_index_stmt3473);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT431=(Token)match(input,DOT,FOLLOW_DOT_in_create_index_stmt3475);  
                    stream_DOT.add(DOT431);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_index_stmt3481);
            index_name=id();

            state._fsp--;

            stream_id.add(index_name.getTree());
            ON432=(Token)match(input,ON,FOLLOW_ON_in_create_index_stmt3485);  
            stream_ON.add(ON432);

            pushFollow(FOLLOW_id_in_create_index_stmt3489);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());
            LPAREN433=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_index_stmt3491);  
            stream_LPAREN.add(LPAREN433);

            pushFollow(FOLLOW_indexed_column_in_create_index_stmt3495);
            columns=indexed_column();

            state._fsp--;

            stream_indexed_column.add(columns.getTree());
            if (list_columns==null) list_columns=new ArrayList();
            list_columns.add(columns.getTree());

            // SqlParser.g:376:51: ( COMMA columns+= indexed_column )*
            loop158:
            do {
                int alt158=2;
                int LA158_0 = input.LA(1);

                if ( (LA158_0==COMMA) ) {
                    alt158=1;
                }


                switch (alt158) {
            	case 1 :
            	    // SqlParser.g:376:52: COMMA columns+= indexed_column
            	    {
            	    COMMA434=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_index_stmt3498);  
            	    stream_COMMA.add(COMMA434);

            	    pushFollow(FOLLOW_indexed_column_in_create_index_stmt3502);
            	    columns=indexed_column();

            	    state._fsp--;

            	    stream_indexed_column.add(columns.getTree());
            	    if (list_columns==null) list_columns=new ArrayList();
            	    list_columns.add(columns.getTree());


            	    }
            	    break;

            	default :
            	    break loop158;
                }
            } while (true);

            RPAREN435=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_index_stmt3506);  
            stream_RPAREN.add(RPAREN435);



            // AST REWRITE
            // elements: database_name, index_name, UNIQUE, columns, table_name, EXISTS
            // token labels: 
            // rule labels: index_name, database_name, retval, table_name
            // token list labels: 
            // rule list labels: columns
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_index_name=new RewriteRuleSubtreeStream(adaptor,"rule index_name",index_name!=null?index_name.tree:null);
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);
            RewriteRuleSubtreeStream stream_columns=new RewriteRuleSubtreeStream(adaptor,"token columns",list_columns);
            root_0 = (Object)adaptor.nil();
            // 377:1: -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? )
            {
                // SqlParser.g:377:4: ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CREATE_INDEX, "CREATE_INDEX"), root_1);

                // SqlParser.g:377:19: ^( OPTIONS ( UNIQUE )? ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:377:29: ( UNIQUE )?
                if ( stream_UNIQUE.hasNext() ) {
                    adaptor.addChild(root_2, stream_UNIQUE.nextNode());

                }
                stream_UNIQUE.reset();
                // SqlParser.g:377:37: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:377:46: ^( $index_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_index_name.nextNode(), root_2);

                // SqlParser.g:377:60: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_table_name.nextTree());
                // SqlParser.g:377:89: ( ^( COLUMNS ( $columns)+ ) )?
                if ( stream_columns.hasNext() ) {
                    // SqlParser.g:377:89: ^( COLUMNS ( $columns)+ )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMNS, "COLUMNS"), root_2);

                    if ( !(stream_columns.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_columns.hasNext() ) {
                        adaptor.addChild(root_2, stream_columns.nextTree());

                    }
                    stream_columns.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_columns.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "create_index_stmt"

    public static class indexed_column_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "indexed_column"
    // SqlParser.g:379:1: indexed_column : column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )? -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? ) ;
    public final SqlParser.indexed_column_return indexed_column() throws RecognitionException {
        SqlParser.indexed_column_return retval = new SqlParser.indexed_column_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLLATE436=null;
        Token ASC437=null;
        Token DESC438=null;
        SqlParser.id_return column_name = null;

        SqlParser.id_return collation_name = null;


        Object COLLATE436_tree=null;
        Object ASC437_tree=null;
        Object DESC438_tree=null;
        RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");
        RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
        RewriteRuleTokenStream stream_COLLATE=new RewriteRuleTokenStream(adaptor,"token COLLATE");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // SqlParser.g:379:15: (column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )? -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? ) )
            // SqlParser.g:379:17: column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )?
            {
            pushFollow(FOLLOW_id_in_indexed_column3552);
            column_name=id();

            state._fsp--;

            stream_id.add(column_name.getTree());
            // SqlParser.g:379:32: ( COLLATE collation_name= id )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==COLLATE) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // SqlParser.g:379:33: COLLATE collation_name= id
                    {
                    COLLATE436=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_indexed_column3555);  
                    stream_COLLATE.add(COLLATE436);

                    pushFollow(FOLLOW_id_in_indexed_column3559);
                    collation_name=id();

                    state._fsp--;

                    stream_id.add(collation_name.getTree());

                    }
                    break;

            }

            // SqlParser.g:379:61: ( ASC | DESC )?
            int alt160=3;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==ASC) ) {
                alt160=1;
            }
            else if ( (LA160_0==DESC) ) {
                alt160=2;
            }
            switch (alt160) {
                case 1 :
                    // SqlParser.g:379:62: ASC
                    {
                    ASC437=(Token)match(input,ASC,FOLLOW_ASC_in_indexed_column3564);  
                    stream_ASC.add(ASC437);


                    }
                    break;
                case 2 :
                    // SqlParser.g:379:68: DESC
                    {
                    DESC438=(Token)match(input,DESC,FOLLOW_DESC_in_indexed_column3568);  
                    stream_DESC.add(DESC438);


                    }
                    break;

            }



            // AST REWRITE
            // elements: column_name, COLLATE, ASC, DESC, collation_name
            // token labels: 
            // rule labels: retval, collation_name, column_name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_collation_name=new RewriteRuleSubtreeStream(adaptor,"rule collation_name",collation_name!=null?collation_name.tree:null);
            RewriteRuleSubtreeStream stream_column_name=new RewriteRuleSubtreeStream(adaptor,"rule column_name",column_name!=null?column_name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 380:1: -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? )
            {
                // SqlParser.g:380:4: ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_column_name.nextNode(), root_1);

                // SqlParser.g:380:19: ( ^( COLLATE $collation_name) )?
                if ( stream_COLLATE.hasNext()||stream_collation_name.hasNext() ) {
                    // SqlParser.g:380:19: ^( COLLATE $collation_name)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_COLLATE.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_collation_name.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_COLLATE.reset();
                stream_collation_name.reset();
                // SqlParser.g:380:47: ( ASC )?
                if ( stream_ASC.hasNext() ) {
                    adaptor.addChild(root_1, stream_ASC.nextNode());

                }
                stream_ASC.reset();
                // SqlParser.g:380:52: ( DESC )?
                if ( stream_DESC.hasNext() ) {
                    adaptor.addChild(root_1, stream_DESC.nextNode());

                }
                stream_DESC.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "indexed_column"

    public static class drop_index_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "drop_index_stmt"
    // SqlParser.g:383:1: drop_index_stmt : DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) ) ;
    public final SqlParser.drop_index_stmt_return drop_index_stmt() throws RecognitionException {
        SqlParser.drop_index_stmt_return retval = new SqlParser.drop_index_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP439=null;
        Token INDEX440=null;
        Token IF441=null;
        Token EXISTS442=null;
        Token DOT443=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return index_name = null;


        Object DROP439_tree=null;
        Object INDEX440_tree=null;
        Object IF441_tree=null;
        Object EXISTS442_tree=null;
        Object DOT443_tree=null;
        RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // SqlParser.g:383:16: ( DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) ) )
            // SqlParser.g:383:18: DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id
            {
            DROP439=(Token)match(input,DROP,FOLLOW_DROP_in_drop_index_stmt3599);  
            stream_DROP.add(DROP439);

            INDEX440=(Token)match(input,INDEX,FOLLOW_INDEX_in_drop_index_stmt3601);  
            stream_INDEX.add(INDEX440);

            // SqlParser.g:383:29: ( IF EXISTS )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==IF) ) {
                int LA161_1 = input.LA(2);

                if ( (LA161_1==EXISTS) ) {
                    alt161=1;
                }
            }
            switch (alt161) {
                case 1 :
                    // SqlParser.g:383:30: IF EXISTS
                    {
                    IF441=(Token)match(input,IF,FOLLOW_IF_in_drop_index_stmt3604);  
                    stream_IF.add(IF441);

                    EXISTS442=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_index_stmt3606);  
                    stream_EXISTS.add(EXISTS442);


                    }
                    break;

            }

            // SqlParser.g:383:42: (database_name= id DOT )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==ID) ) {
                int LA162_1 = input.LA(2);

                if ( (LA162_1==DOT) ) {
                    alt162=1;
                }
            }
            else if ( ((LA162_0>=ABORT && LA162_0<=FROM)||(LA162_0>=GROUP && LA162_0<=IMMEDIATE)||(LA162_0>=INDEX && LA162_0<=IS)||(LA162_0>=JOIN && LA162_0<=LEFT)||LA162_0==LIMIT||LA162_0==NATURAL||(LA162_0>=NULL && LA162_0<=REFERENCES)||(LA162_0>=REINDEX && LA162_0<=WHERE)) ) {
                int LA162_2 = input.LA(2);

                if ( (LA162_2==DOT) ) {
                    alt162=1;
                }
            }
            switch (alt162) {
                case 1 :
                    // SqlParser.g:383:43: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_index_stmt3613);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT443=(Token)match(input,DOT,FOLLOW_DOT_in_drop_index_stmt3615);  
                    stream_DOT.add(DOT443);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_index_stmt3621);
            index_name=id();

            state._fsp--;

            stream_id.add(index_name.getTree());


            // AST REWRITE
            // elements: index_name, EXISTS, database_name
            // token labels: 
            // rule labels: database_name, index_name, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_index_name=new RewriteRuleSubtreeStream(adaptor,"rule index_name",index_name!=null?index_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 384:1: -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) )
            {
                // SqlParser.g:384:4: ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DROP_INDEX, "DROP_INDEX"), root_1);

                // SqlParser.g:384:17: ^( OPTIONS ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:384:27: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:384:36: ^( $index_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_index_name.nextNode(), root_2);

                // SqlParser.g:384:50: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "drop_index_stmt"

    public static class create_trigger_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_trigger_stmt"
    // SqlParser.g:387:1: create_trigger_stmt : CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END ;
    public final SqlParser.create_trigger_stmt_return create_trigger_stmt() throws RecognitionException {
        SqlParser.create_trigger_stmt_return retval = new SqlParser.create_trigger_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE444=null;
        Token TEMPORARY445=null;
        Token TRIGGER446=null;
        Token IF447=null;
        Token NOT448=null;
        Token EXISTS449=null;
        Token DOT450=null;
        Token BEFORE451=null;
        Token AFTER452=null;
        Token INSTEAD453=null;
        Token OF454=null;
        Token DELETE455=null;
        Token INSERT456=null;
        Token UPDATE457=null;
        Token OF458=null;
        Token COMMA459=null;
        Token ON460=null;
        Token FOR461=null;
        Token EACH462=null;
        Token ROW463=null;
        Token WHEN464=null;
        Token BEGIN466=null;
        Token SEMI471=null;
        Token END472=null;
        List list_column_names=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return trigger_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.expr_return expr465 = null;

        SqlParser.update_stmt_return update_stmt467 = null;

        SqlParser.insert_stmt_return insert_stmt468 = null;

        SqlParser.delete_stmt_return delete_stmt469 = null;

        SqlParser.select_stmt_return select_stmt470 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object CREATE444_tree=null;
        Object TEMPORARY445_tree=null;
        Object TRIGGER446_tree=null;
        Object IF447_tree=null;
        Object NOT448_tree=null;
        Object EXISTS449_tree=null;
        Object DOT450_tree=null;
        Object BEFORE451_tree=null;
        Object AFTER452_tree=null;
        Object INSTEAD453_tree=null;
        Object OF454_tree=null;
        Object DELETE455_tree=null;
        Object INSERT456_tree=null;
        Object UPDATE457_tree=null;
        Object OF458_tree=null;
        Object COMMA459_tree=null;
        Object ON460_tree=null;
        Object FOR461_tree=null;
        Object EACH462_tree=null;
        Object ROW463_tree=null;
        Object WHEN464_tree=null;
        Object BEGIN466_tree=null;
        Object SEMI471_tree=null;
        Object END472_tree=null;

        try {
            // SqlParser.g:387:20: ( CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END )
            // SqlParser.g:387:22: CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END
            {
            root_0 = (Object)adaptor.nil();

            CREATE444=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_trigger_stmt3651); 
            CREATE444_tree = (Object)adaptor.create(CREATE444);
            adaptor.addChild(root_0, CREATE444_tree);

            // SqlParser.g:387:29: ( TEMPORARY )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==TEMPORARY) ) {
                alt163=1;
            }
            switch (alt163) {
                case 1 :
                    // SqlParser.g:387:29: TEMPORARY
                    {
                    TEMPORARY445=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_trigger_stmt3653); 
                    TEMPORARY445_tree = (Object)adaptor.create(TEMPORARY445);
                    adaptor.addChild(root_0, TEMPORARY445_tree);


                    }
                    break;

            }

            TRIGGER446=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_create_trigger_stmt3656); 
            TRIGGER446_tree = (Object)adaptor.create(TRIGGER446);
            adaptor.addChild(root_0, TRIGGER446_tree);

            // SqlParser.g:387:48: ( IF NOT EXISTS )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==IF) ) {
                int LA164_1 = input.LA(2);

                if ( (LA164_1==NOT) ) {
                    alt164=1;
                }
            }
            switch (alt164) {
                case 1 :
                    // SqlParser.g:387:49: IF NOT EXISTS
                    {
                    IF447=(Token)match(input,IF,FOLLOW_IF_in_create_trigger_stmt3659); 
                    IF447_tree = (Object)adaptor.create(IF447);
                    adaptor.addChild(root_0, IF447_tree);

                    NOT448=(Token)match(input,NOT,FOLLOW_NOT_in_create_trigger_stmt3661); 
                    NOT448_tree = (Object)adaptor.create(NOT448);
                    adaptor.addChild(root_0, NOT448_tree);

                    EXISTS449=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_trigger_stmt3663); 
                    EXISTS449_tree = (Object)adaptor.create(EXISTS449);
                    adaptor.addChild(root_0, EXISTS449_tree);


                    }
                    break;

            }

            // SqlParser.g:387:65: (database_name= id DOT )?
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==ID) ) {
                int LA165_1 = input.LA(2);

                if ( (LA165_1==DOT) ) {
                    alt165=1;
                }
            }
            else if ( ((LA165_0>=ABORT && LA165_0<=FROM)||(LA165_0>=GROUP && LA165_0<=IMMEDIATE)||(LA165_0>=INDEX && LA165_0<=IS)||(LA165_0>=JOIN && LA165_0<=LEFT)||LA165_0==LIMIT||LA165_0==NATURAL||(LA165_0>=NULL && LA165_0<=REFERENCES)||(LA165_0>=REINDEX && LA165_0<=WHERE)) ) {
                int LA165_2 = input.LA(2);

                if ( (LA165_2==DOT) ) {
                    alt165=1;
                }
            }
            switch (alt165) {
                case 1 :
                    // SqlParser.g:387:66: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_trigger_stmt3670);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT450=(Token)match(input,DOT,FOLLOW_DOT_in_create_trigger_stmt3672); 
                    DOT450_tree = (Object)adaptor.create(DOT450);
                    adaptor.addChild(root_0, DOT450_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_trigger_stmt3678);
            trigger_name=id();

            state._fsp--;

            adaptor.addChild(root_0, trigger_name.getTree());
            // SqlParser.g:388:3: ( BEFORE | AFTER | INSTEAD OF )?
            int alt166=4;
            switch ( input.LA(1) ) {
                case BEFORE:
                    {
                    alt166=1;
                    }
                    break;
                case AFTER:
                    {
                    alt166=2;
                    }
                    break;
                case INSTEAD:
                    {
                    alt166=3;
                    }
                    break;
            }

            switch (alt166) {
                case 1 :
                    // SqlParser.g:388:4: BEFORE
                    {
                    BEFORE451=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_create_trigger_stmt3683); 
                    BEFORE451_tree = (Object)adaptor.create(BEFORE451);
                    adaptor.addChild(root_0, BEFORE451_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:388:13: AFTER
                    {
                    AFTER452=(Token)match(input,AFTER,FOLLOW_AFTER_in_create_trigger_stmt3687); 
                    AFTER452_tree = (Object)adaptor.create(AFTER452);
                    adaptor.addChild(root_0, AFTER452_tree);


                    }
                    break;
                case 3 :
                    // SqlParser.g:388:21: INSTEAD OF
                    {
                    INSTEAD453=(Token)match(input,INSTEAD,FOLLOW_INSTEAD_in_create_trigger_stmt3691); 
                    INSTEAD453_tree = (Object)adaptor.create(INSTEAD453);
                    adaptor.addChild(root_0, INSTEAD453_tree);

                    OF454=(Token)match(input,OF,FOLLOW_OF_in_create_trigger_stmt3693); 
                    OF454_tree = (Object)adaptor.create(OF454);
                    adaptor.addChild(root_0, OF454_tree);


                    }
                    break;

            }

            // SqlParser.g:388:34: ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? )
            int alt169=3;
            switch ( input.LA(1) ) {
            case DELETE:
                {
                alt169=1;
                }
                break;
            case INSERT:
                {
                alt169=2;
                }
                break;
            case UPDATE:
                {
                alt169=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 169, 0, input);

                throw nvae;
            }

            switch (alt169) {
                case 1 :
                    // SqlParser.g:388:35: DELETE
                    {
                    DELETE455=(Token)match(input,DELETE,FOLLOW_DELETE_in_create_trigger_stmt3698); 
                    DELETE455_tree = (Object)adaptor.create(DELETE455);
                    adaptor.addChild(root_0, DELETE455_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:388:44: INSERT
                    {
                    INSERT456=(Token)match(input,INSERT,FOLLOW_INSERT_in_create_trigger_stmt3702); 
                    INSERT456_tree = (Object)adaptor.create(INSERT456);
                    adaptor.addChild(root_0, INSERT456_tree);


                    }
                    break;
                case 3 :
                    // SqlParser.g:388:53: UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )?
                    {
                    UPDATE457=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_create_trigger_stmt3706); 
                    UPDATE457_tree = (Object)adaptor.create(UPDATE457);
                    adaptor.addChild(root_0, UPDATE457_tree);

                    // SqlParser.g:388:60: ( OF column_names+= id ( COMMA column_names+= id )* )?
                    int alt168=2;
                    int LA168_0 = input.LA(1);

                    if ( (LA168_0==OF) ) {
                        alt168=1;
                    }
                    switch (alt168) {
                        case 1 :
                            // SqlParser.g:388:61: OF column_names+= id ( COMMA column_names+= id )*
                            {
                            OF458=(Token)match(input,OF,FOLLOW_OF_in_create_trigger_stmt3709); 
                            OF458_tree = (Object)adaptor.create(OF458);
                            adaptor.addChild(root_0, OF458_tree);

                            pushFollow(FOLLOW_id_in_create_trigger_stmt3713);
                            column_names=id();

                            state._fsp--;

                            adaptor.addChild(root_0, column_names.getTree());
                            if (list_column_names==null) list_column_names=new ArrayList();
                            list_column_names.add(column_names.getTree());

                            // SqlParser.g:388:81: ( COMMA column_names+= id )*
                            loop167:
                            do {
                                int alt167=2;
                                int LA167_0 = input.LA(1);

                                if ( (LA167_0==COMMA) ) {
                                    alt167=1;
                                }


                                switch (alt167) {
                            	case 1 :
                            	    // SqlParser.g:388:82: COMMA column_names+= id
                            	    {
                            	    COMMA459=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_trigger_stmt3716); 
                            	    COMMA459_tree = (Object)adaptor.create(COMMA459);
                            	    adaptor.addChild(root_0, COMMA459_tree);

                            	    pushFollow(FOLLOW_id_in_create_trigger_stmt3720);
                            	    column_names=id();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, column_names.getTree());
                            	    if (list_column_names==null) list_column_names=new ArrayList();
                            	    list_column_names.add(column_names.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop167;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            ON460=(Token)match(input,ON,FOLLOW_ON_in_create_trigger_stmt3729); 
            ON460_tree = (Object)adaptor.create(ON460);
            adaptor.addChild(root_0, ON460_tree);

            pushFollow(FOLLOW_id_in_create_trigger_stmt3733);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:389:20: ( FOR EACH ROW )?
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==FOR) ) {
                alt170=1;
            }
            switch (alt170) {
                case 1 :
                    // SqlParser.g:389:21: FOR EACH ROW
                    {
                    FOR461=(Token)match(input,FOR,FOLLOW_FOR_in_create_trigger_stmt3736); 
                    FOR461_tree = (Object)adaptor.create(FOR461);
                    adaptor.addChild(root_0, FOR461_tree);

                    EACH462=(Token)match(input,EACH,FOLLOW_EACH_in_create_trigger_stmt3738); 
                    EACH462_tree = (Object)adaptor.create(EACH462);
                    adaptor.addChild(root_0, EACH462_tree);

                    ROW463=(Token)match(input,ROW,FOLLOW_ROW_in_create_trigger_stmt3740); 
                    ROW463_tree = (Object)adaptor.create(ROW463);
                    adaptor.addChild(root_0, ROW463_tree);


                    }
                    break;

            }

            // SqlParser.g:389:36: ( WHEN expr )?
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==WHEN) ) {
                alt171=1;
            }
            switch (alt171) {
                case 1 :
                    // SqlParser.g:389:37: WHEN expr
                    {
                    WHEN464=(Token)match(input,WHEN,FOLLOW_WHEN_in_create_trigger_stmt3745); 
                    WHEN464_tree = (Object)adaptor.create(WHEN464);
                    adaptor.addChild(root_0, WHEN464_tree);

                    pushFollow(FOLLOW_expr_in_create_trigger_stmt3747);
                    expr465=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr465.getTree());

                    }
                    break;

            }

            BEGIN466=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_create_trigger_stmt3753); 
            BEGIN466_tree = (Object)adaptor.create(BEGIN466);
            adaptor.addChild(root_0, BEGIN466_tree);

            // SqlParser.g:390:9: ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+
            int cnt173=0;
            loop173:
            do {
                int alt173=2;
                int LA173_0 = input.LA(1);

                if ( (LA173_0==DELETE||LA173_0==INSERT||LA173_0==REPLACE||LA173_0==SELECT||LA173_0==UPDATE) ) {
                    alt173=1;
                }


                switch (alt173) {
            	case 1 :
            	    // SqlParser.g:390:10: ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI
            	    {
            	    // SqlParser.g:390:10: ( update_stmt | insert_stmt | delete_stmt | select_stmt )
            	    int alt172=4;
            	    switch ( input.LA(1) ) {
            	    case UPDATE:
            	        {
            	        alt172=1;
            	        }
            	        break;
            	    case INSERT:
            	    case REPLACE:
            	        {
            	        alt172=2;
            	        }
            	        break;
            	    case DELETE:
            	        {
            	        alt172=3;
            	        }
            	        break;
            	    case SELECT:
            	        {
            	        alt172=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 172, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt172) {
            	        case 1 :
            	            // SqlParser.g:390:11: update_stmt
            	            {
            	            pushFollow(FOLLOW_update_stmt_in_create_trigger_stmt3757);
            	            update_stmt467=update_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, update_stmt467.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // SqlParser.g:390:25: insert_stmt
            	            {
            	            pushFollow(FOLLOW_insert_stmt_in_create_trigger_stmt3761);
            	            insert_stmt468=insert_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, insert_stmt468.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // SqlParser.g:390:39: delete_stmt
            	            {
            	            pushFollow(FOLLOW_delete_stmt_in_create_trigger_stmt3765);
            	            delete_stmt469=delete_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, delete_stmt469.getTree());

            	            }
            	            break;
            	        case 4 :
            	            // SqlParser.g:390:53: select_stmt
            	            {
            	            pushFollow(FOLLOW_select_stmt_in_create_trigger_stmt3769);
            	            select_stmt470=select_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, select_stmt470.getTree());

            	            }
            	            break;

            	    }

            	    SEMI471=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_trigger_stmt3772); 
            	    SEMI471_tree = (Object)adaptor.create(SEMI471);
            	    adaptor.addChild(root_0, SEMI471_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt173 >= 1 ) break loop173;
                        EarlyExitException eee =
                            new EarlyExitException(173, input);
                        throw eee;
                }
                cnt173++;
            } while (true);

            END472=(Token)match(input,END,FOLLOW_END_in_create_trigger_stmt3776); 
            END472_tree = (Object)adaptor.create(END472);
            adaptor.addChild(root_0, END472_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "create_trigger_stmt"

    public static class drop_trigger_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "drop_trigger_stmt"
    // SqlParser.g:393:1: drop_trigger_stmt : DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id ;
    public final SqlParser.drop_trigger_stmt_return drop_trigger_stmt() throws RecognitionException {
        SqlParser.drop_trigger_stmt_return retval = new SqlParser.drop_trigger_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP473=null;
        Token TRIGGER474=null;
        Token IF475=null;
        Token EXISTS476=null;
        Token DOT477=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return trigger_name = null;


        Object DROP473_tree=null;
        Object TRIGGER474_tree=null;
        Object IF475_tree=null;
        Object EXISTS476_tree=null;
        Object DOT477_tree=null;

        try {
            // SqlParser.g:393:18: ( DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id )
            // SqlParser.g:393:20: DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id
            {
            root_0 = (Object)adaptor.nil();

            DROP473=(Token)match(input,DROP,FOLLOW_DROP_in_drop_trigger_stmt3784); 
            DROP473_tree = (Object)adaptor.create(DROP473);
            adaptor.addChild(root_0, DROP473_tree);

            TRIGGER474=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_drop_trigger_stmt3786); 
            TRIGGER474_tree = (Object)adaptor.create(TRIGGER474);
            adaptor.addChild(root_0, TRIGGER474_tree);

            // SqlParser.g:393:33: ( IF EXISTS )?
            int alt174=2;
            int LA174_0 = input.LA(1);

            if ( (LA174_0==IF) ) {
                int LA174_1 = input.LA(2);

                if ( (LA174_1==EXISTS) ) {
                    alt174=1;
                }
            }
            switch (alt174) {
                case 1 :
                    // SqlParser.g:393:34: IF EXISTS
                    {
                    IF475=(Token)match(input,IF,FOLLOW_IF_in_drop_trigger_stmt3789); 
                    IF475_tree = (Object)adaptor.create(IF475);
                    adaptor.addChild(root_0, IF475_tree);

                    EXISTS476=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_trigger_stmt3791); 
                    EXISTS476_tree = (Object)adaptor.create(EXISTS476);
                    adaptor.addChild(root_0, EXISTS476_tree);


                    }
                    break;

            }

            // SqlParser.g:393:46: (database_name= id DOT )?
            int alt175=2;
            int LA175_0 = input.LA(1);

            if ( (LA175_0==ID) ) {
                int LA175_1 = input.LA(2);

                if ( (LA175_1==DOT) ) {
                    alt175=1;
                }
            }
            else if ( ((LA175_0>=ABORT && LA175_0<=FROM)||(LA175_0>=GROUP && LA175_0<=IMMEDIATE)||(LA175_0>=INDEX && LA175_0<=IS)||(LA175_0>=JOIN && LA175_0<=LEFT)||LA175_0==LIMIT||LA175_0==NATURAL||(LA175_0>=NULL && LA175_0<=REFERENCES)||(LA175_0>=REINDEX && LA175_0<=WHERE)) ) {
                int LA175_2 = input.LA(2);

                if ( (LA175_2==DOT) ) {
                    alt175=1;
                }
            }
            switch (alt175) {
                case 1 :
                    // SqlParser.g:393:47: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_trigger_stmt3798);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT477=(Token)match(input,DOT,FOLLOW_DOT_in_drop_trigger_stmt3800); 
                    DOT477_tree = (Object)adaptor.create(DOT477);
                    adaptor.addChild(root_0, DOT477_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_trigger_stmt3806);
            trigger_name=id();

            state._fsp--;

            adaptor.addChild(root_0, trigger_name.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "drop_trigger_stmt"

    public static class id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "id"
    // SqlParser.g:398:1: id : ( ID | keyword );
    public final SqlParser.id_return id() throws RecognitionException {
        SqlParser.id_return retval = new SqlParser.id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID478=null;
        SqlParser.keyword_return keyword479 = null;


        Object ID478_tree=null;

        try {
            // SqlParser.g:398:3: ( ID | keyword )
            int alt176=2;
            int LA176_0 = input.LA(1);

            if ( (LA176_0==ID) ) {
                alt176=1;
            }
            else if ( ((LA176_0>=ABORT && LA176_0<=FROM)||(LA176_0>=GROUP && LA176_0<=IMMEDIATE)||(LA176_0>=INDEX && LA176_0<=IS)||(LA176_0>=JOIN && LA176_0<=LEFT)||LA176_0==LIMIT||LA176_0==NATURAL||(LA176_0>=NULL && LA176_0<=REFERENCES)||(LA176_0>=REINDEX && LA176_0<=WHERE)) ) {
                alt176=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 176, 0, input);

                throw nvae;
            }
            switch (alt176) {
                case 1 :
                    // SqlParser.g:398:5: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID478=(Token)match(input,ID,FOLLOW_ID_in_id3816); 
                    ID478_tree = (Object)adaptor.create(ID478);
                    adaptor.addChild(root_0, ID478_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:398:10: keyword
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_id3820);
                    keyword479=keyword();

                    state._fsp--;

                    adaptor.addChild(root_0, keyword479.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "id"

    public static class keyword_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyword"
    // SqlParser.g:400:1: keyword : ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GROUP | HAVING | IF | IGNORE | IMMEDIATE | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | JOIN | KEY | LEFT | LIMIT | NATURAL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) ;
    public final SqlParser.keyword_return keyword() throws RecognitionException {
        SqlParser.keyword_return retval = new SqlParser.keyword_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set480=null;

        Object set480_tree=null;

        try {
            // SqlParser.g:400:8: ( ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GROUP | HAVING | IF | IGNORE | IMMEDIATE | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | JOIN | KEY | LEFT | LIMIT | NATURAL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) )
            // SqlParser.g:400:10: ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GROUP | HAVING | IF | IGNORE | IMMEDIATE | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | JOIN | KEY | LEFT | LIMIT | NATURAL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE )
            {
            root_0 = (Object)adaptor.nil();

            set480=(Token)input.LT(1);
            if ( (input.LA(1)>=ABORT && input.LA(1)<=FROM)||(input.LA(1)>=GROUP && input.LA(1)<=IMMEDIATE)||(input.LA(1)>=INDEX && input.LA(1)<=IS)||(input.LA(1)>=JOIN && input.LA(1)<=LEFT)||input.LA(1)==LIMIT||input.LA(1)==NATURAL||(input.LA(1)>=NULL && input.LA(1)<=REFERENCES)||(input.LA(1)>=REINDEX && input.LA(1)<=WHERE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set480));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyword"

    public static class id_column_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "id_column_def"
    // SqlParser.g:519:1: id_column_def : ( ID | keyword_column_def );
    public final SqlParser.id_column_def_return id_column_def() throws RecognitionException {
        SqlParser.id_column_def_return retval = new SqlParser.id_column_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID481=null;
        SqlParser.keyword_column_def_return keyword_column_def482 = null;


        Object ID481_tree=null;

        try {
            // SqlParser.g:519:14: ( ID | keyword_column_def )
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( (LA177_0==ID) ) {
                alt177=1;
            }
            else if ( ((LA177_0>=ABORT && LA177_0<=COLLATE)||(LA177_0>=COMMIT && LA177_0<=CONFLICT)||(LA177_0>=CREATE && LA177_0<=WHERE)) ) {
                alt177=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 177, 0, input);

                throw nvae;
            }
            switch (alt177) {
                case 1 :
                    // SqlParser.g:519:16: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID481=(Token)match(input,ID,FOLLOW_ID_in_id_column_def4494); 
                    ID481_tree = (Object)adaptor.create(ID481);
                    adaptor.addChild(root_0, ID481_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:519:21: keyword_column_def
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_keyword_column_def_in_id_column_def4498);
                    keyword_column_def482=keyword_column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, keyword_column_def482.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "id_column_def"

    public static class keyword_column_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyword_column_def"
    // SqlParser.g:521:1: keyword_column_def : ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) ;
    public final SqlParser.keyword_column_def_return keyword_column_def() throws RecognitionException {
        SqlParser.keyword_column_def_return retval = new SqlParser.keyword_column_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set483=null;

        Object set483_tree=null;

        try {
            // SqlParser.g:521:19: ( ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) )
            // SqlParser.g:521:21: ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE )
            {
            root_0 = (Object)adaptor.nil();

            set483=(Token)input.LT(1);
            if ( (input.LA(1)>=ABORT && input.LA(1)<=COLLATE)||(input.LA(1)>=COMMIT && input.LA(1)<=CONFLICT)||(input.LA(1)>=CREATE && input.LA(1)<=WHERE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set483));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyword_column_def"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA71 dfa71 = new DFA71(this);
    static final String DFA4_eotS =
        "\35\uffff";
    static final String DFA4_eofS =
        "\35\uffff";
    static final String DFA4_minS =
        "\1\76\17\uffff\2\163\2\uffff\1\u009e\10\uffff";
    static final String DFA4_maxS =
        "\1\u00a8\17\uffff\1\u00ab\1\u00aa\2\uffff\1\u00aa\10\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\2\uffff\1\23\1\20\1\uffff\1\24\1\30\1\26\1\21\1\22"+
        "\1\25\1\27\1\31";
    static final String DFA4_specialS =
        "\35\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\22\1\4\3\uffff\1\2\2\uffff\1\13\10\uffff\1\14\2\uffff\1\20"+
            "\10\uffff\1\12\1\uffff\1\3\1\uffff\1\21\2\uffff\1\14\24\uffff"+
            "\1\10\26\uffff\1\1\5\uffff\1\5\1\17\1\uffff\1\10\1\uffff\1\15"+
            "\1\uffff\1\16\1\7\11\uffff\1\11\1\uffff\1\6",
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
            "\1\27\52\uffff\1\30\1\24\3\uffff\1\26\1\uffff\1\27\4\uffff"+
            "\1\25\1\23",
            "\1\33\52\uffff\1\31\4\uffff\1\34\6\uffff\1\32",
            "",
            "",
            "\1\30\4\uffff\1\26\6\uffff\1\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "64:1: sql_stmt_core : ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt );";
        }
    }
    static final String DFA8_eotS =
        "\14\uffff";
    static final String DFA8_eofS =
        "\14\uffff";
    static final String DFA8_minS =
        "\1\27\1\uffff\1\21\1\uffff\1\30\1\21\6\30";
    static final String DFA8_maxS =
        "\1\u00af\1\uffff\1\u00b4\1\uffff\1\u00af\1\u00b4\1\110\3\u009c\1"+
        "\110\1\u00b1";
    static final String DFA8_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\10\uffff";
    static final String DFA8_specialS =
        "\14\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\1\uffff\1\1\1\uffff\1\1\36\uffff\62\1\1\uffff\5\1\1\uffff"+
            "\11\1\1\uffff\3\1\1\uffff\1\1\1\uffff\1\1\2\uffff\4\1\1\2\10"+
            "\1\1\uffff\32\1\1\uffff\1\1",
            "",
            "\3\3\3\uffff\1\1\1\uffff\1\1\1\3\1\1\3\3\33\uffff\52\3\1\11"+
            "\6\3\1\4\1\uffff\1\6\4\3\1\uffff\6\3\1\10\2\3\1\uffff\3\3\1"+
            "\uffff\1\13\1\uffff\2\3\1\uffff\5\3\1\12\7\3\1\uffff\20\3\1"+
            "\7\10\3\1\5\1\uffff\3\3\1\uffff\2\3",
            "",
            "\1\3\1\uffff\1\1\37\uffff\62\1\1\uffff\5\1\1\uffff\11\1\1\uffff"+
            "\3\1\1\uffff\1\1\1\uffff\1\1\2\uffff\15\1\1\uffff\32\1\1\uffff"+
            "\1\1",
            "\3\1\4\uffff\1\3\1\uffff\1\1\1\uffff\3\1\33\uffff\62\1\1\uffff"+
            "\5\1\1\uffff\11\1\1\uffff\3\1\1\uffff\1\1\1\uffff\2\1\1\uffff"+
            "\15\1\1\uffff\32\1\1\uffff\3\1\1\uffff\2\1",
            "\1\3\57\uffff\1\1",
            "\1\3\44\uffff\1\1\136\uffff\1\1",
            "\1\3\u0083\uffff\1\1",
            "\1\3\u0083\uffff\1\1",
            "\1\3\57\uffff\1\1",
            "\1\3\u0098\uffff\1\1"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "()* loopback of 98:18: ( OR or_subexpr )*";
        }
    }
    static final String DFA9_eotS =
        "\14\uffff";
    static final String DFA9_eofS =
        "\14\uffff";
    static final String DFA9_minS =
        "\1\27\1\uffff\1\21\1\uffff\1\30\1\21\6\30";
    static final String DFA9_maxS =
        "\1\u00af\1\uffff\1\u00b4\1\uffff\1\u00af\1\u00b4\1\110\3\u009c\1"+
        "\110\1\u00b1";
    static final String DFA9_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\10\uffff";
    static final String DFA9_specialS =
        "\14\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\1\uffff\1\1\1\uffff\1\1\36\uffff\6\1\1\2\53\1\1\uffff\5"+
            "\1\1\uffff\11\1\1\uffff\3\1\1\uffff\1\1\1\uffff\1\1\2\uffff"+
            "\15\1\1\uffff\32\1\1\uffff\1\1",
            "",
            "\3\3\3\uffff\1\1\1\uffff\1\1\1\3\1\1\3\3\33\uffff\52\3\1\11"+
            "\6\3\1\4\1\uffff\1\6\4\3\1\uffff\6\3\1\10\2\3\1\uffff\3\3\1"+
            "\uffff\1\13\1\uffff\2\3\1\uffff\5\3\1\12\7\3\1\uffff\20\3\1"+
            "\7\10\3\1\5\1\uffff\3\3\1\uffff\2\3",
            "",
            "\1\3\1\uffff\1\1\37\uffff\62\1\1\uffff\5\1\1\uffff\11\1\1\uffff"+
            "\3\1\1\uffff\1\1\1\uffff\1\1\2\uffff\15\1\1\uffff\32\1\1\uffff"+
            "\1\1",
            "\3\1\4\uffff\1\3\1\uffff\1\1\1\uffff\3\1\33\uffff\62\1\1\uffff"+
            "\5\1\1\uffff\11\1\1\uffff\3\1\1\uffff\1\1\1\uffff\2\1\1\uffff"+
            "\15\1\1\uffff\32\1\1\uffff\3\1\1\uffff\2\1",
            "\1\3\57\uffff\1\1",
            "\1\3\44\uffff\1\1\136\uffff\1\1",
            "\1\3\u0083\uffff\1\1",
            "\1\3\u0083\uffff\1\1",
            "\1\3\57\uffff\1\1",
            "\1\3\u0098\uffff\1\1"
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "()* loopback of 100:25: ( AND and_subexpr )*";
        }
    }
    static final String DFA10_eotS =
        "\15\uffff";
    static final String DFA10_eofS =
        "\15\uffff";
    static final String DFA10_minS =
        "\1\4\1\uffff\1\27\1\21\1\uffff\1\30\1\21\6\30";
    static final String DFA10_maxS =
        "\1\u00af\1\uffff\1\u00ad\1\u00b4\1\uffff\1\u00af\1\u00b4\1\110\3"+
        "\u009c\1\110\1\u00b1";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\10\uffff";
    static final String DFA10_specialS =
        "\15\uffff}>";
    static final String[] DFA10_transitionS = {
            "\4\1\17\uffff\1\4\1\uffff\1\4\1\uffff\1\4\36\uffff\15\4\1\3"+
            "\44\4\1\1\5\4\1\1\10\4\1\2\1\1\3\4\1\1\1\4\1\1\1\4\2\1\15\4"+
            "\1\1\32\4\1\uffff\1\4",
            "",
            "\1\4\1\uffff\1\4\1\uffff\1\4\110\uffff\1\4\6\uffff\1\4\1\uffff"+
            "\1\4\13\uffff\1\4\7\uffff\1\4\2\uffff\1\1\1\uffff\1\1\4\uffff"+
            "\1\4\30\uffff\1\4\10\uffff\1\4",
            "\3\1\3\uffff\1\4\1\uffff\1\4\1\1\1\4\3\1\33\uffff\52\1\1\12"+
            "\6\1\1\5\1\uffff\1\7\4\1\1\uffff\6\1\1\11\2\1\1\uffff\3\1\1"+
            "\uffff\1\14\1\uffff\2\1\1\uffff\5\1\1\13\7\1\1\uffff\20\1\1"+
            "\10\10\1\1\6\1\uffff\3\1\1\uffff\2\1",
            "",
            "\1\1\1\uffff\1\4\37\uffff\62\4\1\uffff\5\4\1\uffff\11\4\1\uffff"+
            "\3\4\1\uffff\1\4\1\uffff\1\4\2\uffff\15\4\1\uffff\32\4\1\uffff"+
            "\1\4",
            "\3\4\4\uffff\1\1\1\uffff\1\4\1\uffff\3\4\33\uffff\62\4\1\uffff"+
            "\5\4\1\uffff\11\4\1\uffff\3\4\1\uffff\1\4\1\uffff\2\4\1\uffff"+
            "\15\4\1\uffff\32\4\1\uffff\3\4\1\uffff\2\4",
            "\1\1\57\uffff\1\4",
            "\1\1\44\uffff\1\4\136\uffff\1\4",
            "\1\1\u0083\uffff\1\4",
            "\1\1\u0083\uffff\1\4",
            "\1\1\57\uffff\1\4",
            "\1\1\u0098\uffff\1\4"
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "102:34: ( cond_expr )?";
        }
    }
    static final String DFA12_eotS =
        "\14\uffff";
    static final String DFA12_eofS =
        "\14\uffff";
    static final String DFA12_minS =
        "\1\27\1\21\2\uffff\1\30\1\21\6\30";
    static final String DFA12_maxS =
        "\1\u00af\1\u00b4\2\uffff\1\u00af\1\u00b4\1\110\3\u009c\1\110\1\u00b1";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\1\10\uffff";
    static final String DFA12_specialS =
        "\14\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\2\1\uffff\1\2\1\uffff\1\2\36\uffff\51\2\1\1\10\2\1\uffff"+
            "\5\2\1\uffff\11\2\1\uffff\3\2\1\uffff\1\2\1\uffff\1\2\2\uffff"+
            "\15\2\1\uffff\32\2\1\uffff\1\2",
            "\3\3\3\uffff\1\2\1\uffff\1\2\1\3\1\2\3\3\33\uffff\52\3\1\11"+
            "\6\3\1\4\1\uffff\1\6\4\3\1\uffff\6\3\1\10\2\3\1\uffff\3\3\1"+
            "\uffff\1\13\1\uffff\2\3\1\uffff\5\3\1\12\7\3\1\uffff\20\3\1"+
            "\7\10\3\1\5\1\uffff\3\3\1\uffff\2\3",
            "",
            "",
            "\1\3\1\uffff\1\2\37\uffff\62\2\1\uffff\5\2\1\uffff\11\2\1\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2\2\uffff\15\2\1\uffff\32\2\1\uffff"+
            "\1\2",
            "\3\2\4\uffff\1\3\1\uffff\1\2\1\uffff\3\2\33\uffff\62\2\1\uffff"+
            "\5\2\1\uffff\11\2\1\uffff\3\2\1\uffff\1\2\1\uffff\2\2\1\uffff"+
            "\15\2\1\uffff\32\2\1\uffff\3\2\1\uffff\2\2",
            "\1\3\57\uffff\1\2",
            "\1\3\44\uffff\1\2\136\uffff\1\2",
            "\1\3\u0083\uffff\1\2",
            "\1\3\u0083\uffff\1\2",
            "\1\3\57\uffff\1\2",
            "\1\3\u0098\uffff\1\2"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "105:41: ( ESCAPE escape_expr= eq_subexpr )?";
        }
    }
    static final String DFA37_eotS =
        "\25\uffff";
    static final String DFA37_eofS =
        "\25\uffff";
    static final String DFA37_minS =
        "\1\32\1\uffff\4\4\1\uffff\1\4\1\30\1\21\1\30\1\21\1\30\4\uffff\1"+
        "\21\3\uffff";
    static final String DFA37_maxS =
        "\1\u00b4\1\uffff\4\u00af\1\uffff\1\u00af\1\32\1\u00b4\1\32\1\u00b4"+
        "\1\32\4\uffff\1\u00b4\3\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\1\4\uffff\1\2\6\uffff\1\3\1\4\1\6\1\5\1\uffff\1\7\1\10"+
        "\1\11";
    static final String DFA37_specialS =
        "\25\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\11\1\uffff\3\6\33\uffff\20\15\1\13\1\10\10\15\1\3\1\4\1\5"+
            "\17\15\1\12\5\15\1\uffff\5\15\1\uffff\11\15\1\uffff\3\15\1\uffff"+
            "\1\15\1\uffff\1\15\2\uffff\1\2\12\15\1\14\1\15\1\uffff\32\15"+
            "\1\uffff\1\7\2\1\1\uffff\2\1",
            "",
            "\17\1\1\uffff\4\1\1\15\1\1\1\uffff\1\1\36\uffff\164\1\1\uffff"+
            "\1\1",
            "\17\1\1\uffff\4\1\1\15\1\1\1\uffff\1\1\36\uffff\164\1\1\uffff"+
            "\1\1",
            "\17\1\1\uffff\4\1\1\15\1\1\1\uffff\1\1\36\uffff\164\1\1\uffff"+
            "\1\1",
            "\17\1\1\uffff\4\1\1\15\1\1\1\uffff\1\1\36\uffff\164\1\1\uffff"+
            "\1\1",
            "",
            "\17\15\1\uffff\6\15\1\16\1\15\36\uffff\164\15\1\uffff\1\15",
            "\1\15\1\uffff\1\17",
            "\3\20\6\uffff\1\20\1\uffff\3\20\33\uffff\62\20\1\uffff\5\20"+
            "\1\uffff\11\20\1\uffff\3\20\1\uffff\1\20\1\uffff\2\20\1\uffff"+
            "\15\20\1\uffff\10\20\1\21\21\20\1\uffff\3\20\1\uffff\2\20",
            "\1\15\1\uffff\1\22",
            "\3\23\4\uffff\1\15\1\uffff\1\23\1\uffff\3\23\33\uffff\62\23"+
            "\1\uffff\5\23\1\uffff\11\23\1\uffff\3\23\1\uffff\1\23\1\uffff"+
            "\2\23\1\uffff\15\23\1\uffff\32\23\1\uffff\3\23\1\uffff\2\23",
            "\1\15\1\uffff\1\24",
            "",
            "",
            "",
            "",
            "\4\22\3\uffff\1\20\1\uffff\1\22\1\uffff\3\22\33\uffff\62\22"+
            "\1\uffff\5\22\1\uffff\11\22\1\uffff\3\22\1\uffff\1\22\1\uffff"+
            "\2\22\1\uffff\15\22\1\uffff\32\22\1\uffff\3\22\1\uffff\2\22",
            "",
            "",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "131:1: atom_expr : ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) | function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN | LPAREN expr RPAREN | CAST LPAREN expr AS type_name RPAREN | ( EXISTS )? LPAREN select_stmt RPAREN | CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END | raise_function );";
        }
    }
    static final String DFA73_eotS =
        "\17\uffff";
    static final String DFA73_eofS =
        "\17\uffff";
    static final String DFA73_minS =
        "\1\21\1\uffff\2\4\1\uffff\3\4\2\30\1\21\2\30\1\24\1\uffff";
    static final String DFA73_maxS =
        "\1\u00b4\1\uffff\2\u00af\1\uffff\3\u00af\2\32\1\u00b4\1\32\1\30"+
        "\1\u00af\1\uffff";
    static final String DFA73_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\11\uffff\1\2";
    static final String DFA73_specialS =
        "\17\uffff}>";
    static final String[] DFA73_transitionS = {
            "\3\4\1\1\5\uffff\1\4\1\uffff\3\4\33\uffff\20\14\1\12\1\10\10"+
            "\14\1\5\1\6\1\7\17\14\1\11\5\14\1\uffff\5\14\1\uffff\11\14\1"+
            "\uffff\3\14\1\uffff\1\14\1\uffff\1\14\1\4\1\uffff\1\3\12\14"+
            "\1\13\1\14\1\uffff\32\14\1\uffff\1\2\2\4\1\uffff\2\4",
            "",
            "\17\4\1\uffff\4\4\1\15\3\4\36\uffff\164\4\1\uffff\1\4",
            "\17\4\1\uffff\4\4\1\15\1\4\1\uffff\1\4\36\uffff\164\4\1\uffff"+
            "\1\4",
            "",
            "\17\4\1\uffff\4\4\1\15\1\4\1\uffff\1\4\36\uffff\164\4\1\uffff"+
            "\1\4",
            "\17\4\1\uffff\4\4\1\15\1\4\1\uffff\1\4\36\uffff\164\4\1\uffff"+
            "\1\4",
            "\17\4\1\uffff\4\4\1\15\1\4\1\uffff\1\4\36\uffff\164\4\1\uffff"+
            "\1\4",
            "\1\15\1\uffff\1\4",
            "\1\15\1\uffff\1\4",
            "\3\4\4\uffff\1\15\1\uffff\1\4\1\uffff\3\4\33\uffff\62\4\1\uffff"+
            "\5\4\1\uffff\11\4\1\uffff\3\4\1\uffff\1\4\1\uffff\2\4\1\uffff"+
            "\15\4\1\uffff\32\4\1\uffff\3\4\1\uffff\2\4",
            "\1\15\1\uffff\1\4",
            "\1\15",
            "\1\16\45\uffff\62\4\1\uffff\5\4\1\uffff\11\4\1\uffff\3\4\1"+
            "\uffff\1\4\1\uffff\1\4\2\uffff\15\4\1\uffff\32\4\1\uffff\1\4",
            ""
    };

    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = DFA73_eot;
            this.eof = DFA73_eof;
            this.min = DFA73_min;
            this.max = DFA73_max;
            this.accept = DFA73_accept;
            this.special = DFA73_special;
            this.transition = DFA73_transition;
        }
        public String getDescription() {
            return "221:1: result_column : ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) );";
        }
    }
    static final String DFA72_eotS =
        "\33\uffff";
    static final String DFA72_eofS =
        "\33\uffff";
    static final String DFA72_minS =
        "\1\27\1\uffff\1\27\1\uffff\1\21\6\27\1\30\1\21\7\30\1\21\6\30";
    static final String DFA72_maxS =
        "\1\u00af\1\uffff\1\u00af\1\uffff\1\u00b4\5\u00ad\1\u00b1\1\u00af"+
        "\1\u00b4\1\110\3\u009c\1\110\1\u00b1\1\u00af\1\u00b4\1\110\3\u009c"+
        "\1\110\1\u00b1";
    static final String DFA72_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\27\uffff";
    static final String DFA72_specialS =
        "\33\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\3\1\uffff\1\3\1\uffff\1\3\36\uffff\52\1\1\10\6\1\1\2\1\uffff"+
            "\1\5\4\1\1\uffff\6\1\1\7\2\1\1\uffff\3\1\1\uffff\1\12\1\uffff"+
            "\1\1\2\uffff\5\1\1\11\7\1\1\uffff\20\1\1\6\10\1\1\4\1\uffff"+
            "\1\1",
            "",
            "\1\1\1\uffff\1\1\1\3\1\1\36\uffff\52\3\1\20\6\3\1\13\1\uffff"+
            "\1\15\4\3\1\uffff\6\3\1\17\2\3\1\uffff\3\3\1\uffff\1\22\1\uffff"+
            "\1\3\2\uffff\5\3\1\21\7\3\1\uffff\20\3\1\16\10\3\1\14\1\uffff"+
            "\1\3",
            "",
            "\3\3\3\uffff\1\1\1\uffff\1\1\1\3\1\1\3\3\33\uffff\52\3\1\30"+
            "\6\3\1\23\1\uffff\1\25\4\3\1\uffff\6\3\1\27\2\3\1\uffff\3\3"+
            "\1\uffff\1\32\1\uffff\2\3\1\uffff\5\3\1\31\7\3\1\uffff\20\3"+
            "\1\26\10\3\1\24\1\uffff\3\3\1\uffff\2\3",
            "\1\1\1\uffff\1\1\1\uffff\1\1\54\uffff\1\3\33\uffff\1\1\6\uffff"+
            "\1\1\1\uffff\1\1\13\uffff\1\1\7\uffff\1\1\11\uffff\1\1\30\uffff"+
            "\1\1\10\uffff\1\1",
            "\1\1\1\uffff\1\1\1\uffff\1\1\41\uffff\1\3\46\uffff\1\1\6\uffff"+
            "\1\1\1\uffff\1\1\13\uffff\1\1\7\uffff\1\1\11\uffff\1\1\20\uffff"+
            "\1\3\7\uffff\1\1\10\uffff\1\1",
            "\1\1\1\uffff\1\1\1\uffff\1\1\110\uffff\1\1\6\uffff\1\1\1\uffff"+
            "\1\1\13\uffff\1\1\7\uffff\1\1\11\uffff\1\1\20\uffff\1\3\7\uffff"+
            "\1\1\10\uffff\1\1",
            "\1\1\1\uffff\1\1\1\uffff\1\1\110\uffff\1\1\6\uffff\1\1\1\uffff"+
            "\1\1\13\uffff\1\1\7\uffff\1\1\11\uffff\1\1\20\uffff\1\3\7\uffff"+
            "\1\1\10\uffff\1\1",
            "\1\1\1\uffff\1\1\1\uffff\1\1\54\uffff\1\3\33\uffff\1\1\6\uffff"+
            "\1\1\1\uffff\1\1\13\uffff\1\1\7\uffff\1\1\11\uffff\1\1\30\uffff"+
            "\1\1\10\uffff\1\1",
            "\1\1\1\uffff\1\1\1\uffff\1\1\110\uffff\1\1\6\uffff\1\1\1\uffff"+
            "\1\1\13\uffff\1\1\7\uffff\1\1\11\uffff\1\1\30\uffff\1\1\10\uffff"+
            "\1\1\3\uffff\1\3",
            "\1\3\1\uffff\1\1\37\uffff\62\1\1\uffff\5\1\1\uffff\11\1\1\uffff"+
            "\3\1\1\uffff\1\1\1\uffff\1\1\2\uffff\15\1\1\uffff\32\1\1\uffff"+
            "\1\1",
            "\3\1\4\uffff\1\3\1\uffff\1\1\1\uffff\3\1\33\uffff\62\1\1\uffff"+
            "\5\1\1\uffff\11\1\1\uffff\3\1\1\uffff\1\1\1\uffff\2\1\1\uffff"+
            "\15\1\1\uffff\32\1\1\uffff\3\1\1\uffff\2\1",
            "\1\3\57\uffff\1\1",
            "\1\3\44\uffff\1\1\136\uffff\1\1",
            "\1\3\u0083\uffff\1\1",
            "\1\3\u0083\uffff\1\1",
            "\1\3\57\uffff\1\1",
            "\1\3\u0098\uffff\1\1",
            "\1\3\1\uffff\1\1\37\uffff\62\1\1\uffff\5\1\1\uffff\11\1\1\uffff"+
            "\3\1\1\uffff\1\1\1\uffff\1\1\2\uffff\15\1\1\uffff\32\1\1\uffff"+
            "\1\1",
            "\3\1\4\uffff\1\3\1\uffff\1\1\1\uffff\3\1\33\uffff\62\1\1\uffff"+
            "\5\1\1\uffff\11\1\1\uffff\3\1\1\uffff\1\1\1\uffff\2\1\1\uffff"+
            "\15\1\1\uffff\32\1\1\uffff\3\1\1\uffff\2\1",
            "\1\3\57\uffff\1\1",
            "\1\3\44\uffff\1\1\136\uffff\1\1",
            "\1\3\u0083\uffff\1\1",
            "\1\3\u0083\uffff\1\1",
            "\1\3\57\uffff\1\1",
            "\1\3\u0098\uffff\1\1"
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "224:10: ( ( AS )? column_alias= id )?";
        }
    }
    static final String DFA71_eotS =
        "\34\uffff";
    static final String DFA71_eofS =
        "\34\uffff";
    static final String DFA71_minS =
        "\1\72\1\27\2\uffff\1\27\1\21\6\27\1\30\1\21\7\30\1\21\6\30";
    static final String DFA71_maxS =
        "\2\u00af\2\uffff\1\u00af\1\u00b4\5\u00ad\1\u00b1\1\u00af\1\u00b4"+
        "\1\110\3\u009c\1\110\1\u00b1\1\u00af\1\u00b4\1\110\3\u009c\1\110"+
        "\1\u00b1";
    static final String DFA71_acceptS =
        "\2\uffff\1\2\1\1\30\uffff";
    static final String DFA71_specialS =
        "\34\uffff}>";
    static final String[] DFA71_transitionS = {
            "\7\2\1\1\52\2\1\uffff\5\2\1\uffff\11\2\1\uffff\3\2\1\uffff\1"+
            "\2\1\uffff\1\2\2\uffff\15\2\1\uffff\32\2\1\uffff\1\2",
            "\1\2\1\uffff\1\2\1\uffff\1\2\36\uffff\52\3\1\11\6\3\1\4\1\uffff"+
            "\1\6\4\3\1\uffff\6\3\1\10\2\3\1\uffff\3\3\1\uffff\1\13\1\uffff"+
            "\1\3\2\uffff\5\3\1\12\7\3\1\uffff\20\3\1\7\10\3\1\5\1\uffff"+
            "\1\3",
            "",
            "",
            "\1\3\1\uffff\1\3\1\2\1\3\36\uffff\52\2\1\21\6\2\1\14\1\uffff"+
            "\1\16\4\2\1\uffff\6\2\1\20\2\2\1\uffff\3\2\1\uffff\1\23\1\uffff"+
            "\1\2\2\uffff\5\2\1\22\7\2\1\uffff\20\2\1\17\10\2\1\15\1\uffff"+
            "\1\2",
            "\3\2\3\uffff\1\3\1\uffff\1\3\1\2\1\3\3\2\33\uffff\52\2\1\31"+
            "\6\2\1\24\1\uffff\1\26\4\2\1\uffff\6\2\1\30\2\2\1\uffff\3\2"+
            "\1\uffff\1\33\1\uffff\2\2\1\uffff\5\2\1\32\7\2\1\uffff\20\2"+
            "\1\27\10\2\1\25\1\uffff\3\2\1\uffff\2\2",
            "\1\3\1\uffff\1\3\1\uffff\1\3\54\uffff\1\2\33\uffff\1\3\6\uffff"+
            "\1\3\1\uffff\1\3\13\uffff\1\3\7\uffff\1\3\11\uffff\1\3\30\uffff"+
            "\1\3\10\uffff\1\3",
            "\1\3\1\uffff\1\3\1\uffff\1\3\41\uffff\1\2\46\uffff\1\3\6\uffff"+
            "\1\3\1\uffff\1\3\13\uffff\1\3\7\uffff\1\3\11\uffff\1\3\20\uffff"+
            "\1\2\7\uffff\1\3\10\uffff\1\3",
            "\1\3\1\uffff\1\3\1\uffff\1\3\110\uffff\1\3\6\uffff\1\3\1\uffff"+
            "\1\3\13\uffff\1\3\7\uffff\1\3\11\uffff\1\3\20\uffff\1\2\7\uffff"+
            "\1\3\10\uffff\1\3",
            "\1\3\1\uffff\1\3\1\uffff\1\3\110\uffff\1\3\6\uffff\1\3\1\uffff"+
            "\1\3\13\uffff\1\3\7\uffff\1\3\11\uffff\1\3\20\uffff\1\2\7\uffff"+
            "\1\3\10\uffff\1\3",
            "\1\3\1\uffff\1\3\1\uffff\1\3\54\uffff\1\2\33\uffff\1\3\6\uffff"+
            "\1\3\1\uffff\1\3\13\uffff\1\3\7\uffff\1\3\11\uffff\1\3\30\uffff"+
            "\1\3\10\uffff\1\3",
            "\1\3\1\uffff\1\3\1\uffff\1\3\110\uffff\1\3\6\uffff\1\3\1\uffff"+
            "\1\3\13\uffff\1\3\7\uffff\1\3\11\uffff\1\3\30\uffff\1\3\10\uffff"+
            "\1\3\3\uffff\1\2",
            "\1\2\1\uffff\1\3\37\uffff\62\3\1\uffff\5\3\1\uffff\11\3\1\uffff"+
            "\3\3\1\uffff\1\3\1\uffff\1\3\2\uffff\15\3\1\uffff\32\3\1\uffff"+
            "\1\3",
            "\3\3\4\uffff\1\2\1\uffff\1\3\1\uffff\3\3\33\uffff\62\3\1\uffff"+
            "\5\3\1\uffff\11\3\1\uffff\3\3\1\uffff\1\3\1\uffff\2\3\1\uffff"+
            "\15\3\1\uffff\32\3\1\uffff\3\3\1\uffff\2\3",
            "\1\2\57\uffff\1\3",
            "\1\2\44\uffff\1\3\136\uffff\1\3",
            "\1\2\u0083\uffff\1\3",
            "\1\2\u0083\uffff\1\3",
            "\1\2\57\uffff\1\3",
            "\1\2\u0098\uffff\1\3",
            "\1\2\1\uffff\1\3\37\uffff\62\3\1\uffff\5\3\1\uffff\11\3\1\uffff"+
            "\3\3\1\uffff\1\3\1\uffff\1\3\2\uffff\15\3\1\uffff\32\3\1\uffff"+
            "\1\3",
            "\3\3\4\uffff\1\2\1\uffff\1\3\1\uffff\3\3\33\uffff\62\3\1\uffff"+
            "\5\3\1\uffff\11\3\1\uffff\3\3\1\uffff\1\3\1\uffff\2\3\1\uffff"+
            "\15\3\1\uffff\32\3\1\uffff\3\3\1\uffff\2\3",
            "\1\2\57\uffff\1\3",
            "\1\2\44\uffff\1\3\136\uffff\1\3",
            "\1\2\u0083\uffff\1\3",
            "\1\2\u0083\uffff\1\3",
            "\1\2\57\uffff\1\3",
            "\1\2\u0098\uffff\1\3"
    };

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "224:11: ( AS )?";
        }
    }
 

    public static final BitSet FOLLOW_sql_stmt_in_sql_stmt_list171 = new BitSet(new long[]{0xC000000000000002L,0x00800084A8048048L,0x000001401AB04000L});
    public static final BitSet FOLLOW_EXPLAIN_in_sql_stmt181 = new BitSet(new long[]{0xC000000000800000L,0x00800084A8048048L,0x000001401AB14000L});
    public static final BitSet FOLLOW_QUERY_in_sql_stmt184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_PLAN_in_sql_stmt186 = new BitSet(new long[]{0xC000000000800000L,0x00800084A8048048L,0x000001401AB04000L});
    public static final BitSet FOLLOW_sql_stmt_core_in_sql_stmt192 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMI_in_sql_stmt194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_stmt_in_sql_stmt_core205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attach_stmt_in_sql_stmt_core211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_detach_stmt_in_sql_stmt_core217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_analyze_stmt_in_sql_stmt_core223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reindex_stmt_in_sql_stmt_core229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vacuum_stmt_in_sql_stmt_core235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_sql_stmt_core244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_stmt_in_sql_stmt_core250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_stmt_in_sql_stmt_core256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_stmt_in_sql_stmt_core262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_stmt_in_sql_stmt_core268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commit_stmt_in_sql_stmt_core274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rollback_stmt_in_sql_stmt_core280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_savepoint_stmt_in_sql_stmt_core286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_release_stmt_in_sql_stmt_core292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_virtual_table_stmt_in_sql_stmt_core301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_table_stmt_in_sql_stmt_core307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_table_stmt_in_sql_stmt_core313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alter_table_stmt_in_sql_stmt_core319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_view_stmt_in_sql_stmt_core325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_view_stmt_in_sql_stmt_core331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_index_stmt_in_sql_stmt_core337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_index_stmt_in_sql_stmt_core343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_trigger_stmt_in_sql_stmt_core349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_trigger_stmt_in_sql_stmt_core355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_qualified_table_name368 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_qualified_table_name370 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_qualified_table_name376 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INDEXED_in_qualified_table_name379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_qualified_table_name381 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_qualified_table_name385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_qualified_table_name389 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_INDEXED_in_qualified_table_name391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_signed_number400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000A000000000000L});
    public static final BitSet FOLLOW_set_in_signed_number409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_subexpr_in_expr422 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OR_in_expr425 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_or_subexpr_in_expr428 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_and_subexpr_in_or_subexpr437 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_AND_in_or_subexpr440 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_and_subexpr_in_or_subexpr443 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr452 = new BitSet(new long[]{0x00000000000000F2L,0x1804100000000080L,0x0000000000080035L});
    public static final BitSet FOLLOW_cond_expr_in_and_subexpr454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr466 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000000000080015L});
    public static final BitSet FOLLOW_match_op_in_cond_expr469 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr473 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_ESCAPE_in_cond_expr476 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr508 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_IN_in_cond_expr511 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_cond_expr513 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_cond_expr515 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_cond_expr518 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_cond_expr520 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_cond_expr524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr546 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_IN_in_cond_expr549 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_cond_expr554 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_cond_expr556 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_cond_expr562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISNULL_in_cond_expr593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTNULL_in_cond_expr601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_cond_expr609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_cond_expr611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_cond_expr621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_cond_expr629 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_cond_expr631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_cond_expr633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_BETWEEN_in_cond_expr647 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_AND_in_cond_expr653 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_cond_expr683 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr700 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_set_in_match_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_neq_subexpr_in_eq_subexpr733 = new BitSet(new long[]{0x0000000000000F02L});
    public static final BitSet FOLLOW_set_in_eq_subexpr736 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_neq_subexpr_in_eq_subexpr753 = new BitSet(new long[]{0x0000000000000F02L});
    public static final BitSet FOLLOW_bit_subexpr_in_neq_subexpr762 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_set_in_neq_subexpr765 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_bit_subexpr_in_neq_subexpr782 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_add_subexpr_in_bit_subexpr791 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_set_in_bit_subexpr794 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_add_subexpr_in_bit_subexpr803 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_mul_subexpr_in_add_subexpr812 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_set_in_add_subexpr815 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_mul_subexpr_in_add_subexpr828 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_con_subexpr_in_mul_subexpr837 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_DOUBLE_PIPE_in_mul_subexpr840 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_con_subexpr_in_mul_subexpr843 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_set_in_con_subexpr852 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_unary_subexpr_in_con_subexpr869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_expr_in_unary_subexpr876 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_COLLATE_in_unary_subexpr879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_unary_subexpr884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_value_in_atom_expr896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bind_parameter_in_atom_expr902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_atom_expr912 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_atom_expr914 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_atom_expr920 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_atom_expr922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_atom_expr928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom_expr957 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr959 = new BitSet(new long[]{0xFC0000007C1E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_DISTINCT_in_atom_expr963 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_atom_expr969 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_atom_expr972 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_atom_expr976 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_ASTERISK_in_atom_expr982 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr992 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_atom_expr995 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_atom_expr1004 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr1006 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_atom_expr1008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_atom_expr1010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_type_name_in_atom_expr1012 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXISTS_in_atom_expr1023 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr1027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_atom_expr1029 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_atom_expr1037 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_atom_expr1040 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_WHEN_in_atom_expr1045 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_atom_expr1047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_THEN_in_atom_expr1049 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_atom_expr1051 = new BitSet(new long[]{0x0000000000000000L,0x0000000600000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_ELSE_in_atom_expr1056 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_atom_expr1058 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_END_in_atom_expr1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raise_function_in_atom_expr1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_literal_value1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal_value1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal_value1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOB_in_literal_value1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal_value1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_TIME_in_literal_value1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_DATE_in_literal_value1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_TIMESTAMP_in_literal_value1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bind_parameter1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bind_parameter1202 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_bind_parameter1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_bind_parameter1221 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_bind_parameter1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_bind_parameter1240 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_bind_parameter1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAISE_in_raise_function1264 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_raise_function1267 = new BitSet(new long[]{0x0400000000000000L,0x0001010000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_IGNORE_in_raise_function1271 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_set_in_raise_function1275 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COMMA_in_raise_function1287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_STRING_in_raise_function1292 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_raise_function1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_name1305 = new BitSet(new long[]{0x0000000004000002L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_LPAREN_in_type_name1309 = new BitSet(new long[]{0x0000000000060000L,0x0000000000000000L,0x000A000000000000L});
    public static final BitSet FOLLOW_signed_number_in_type_name1313 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_type_name1316 = new BitSet(new long[]{0x0000000000060000L,0x0000000000000000L,0x000A000000000000L});
    public static final BitSet FOLLOW_signed_number_in_type_name1320 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_type_name1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_in_pragma_stmt1356 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_pragma_stmt1361 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_pragma_stmt1363 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_pragma_stmt1369 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_EQUALS_in_pragma_stmt1372 = new BitSet(new long[]{0xFC00000000060000L,0xEFFBEFFFFFFFFFFFL,0x000BBFFFFFF7FFCAL});
    public static final BitSet FOLLOW_pragma_value_in_pragma_stmt1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_pragma_stmt1378 = new BitSet(new long[]{0xFC00000000060000L,0xEFFBEFFFFFFFFFFFL,0x000BBFFFFFF7FFCAL});
    public static final BitSet FOLLOW_pragma_value_in_pragma_stmt1380 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_pragma_stmt1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signed_number_in_pragma_value1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_pragma_value1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_pragma_value1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTACH_in_attach_stmt1409 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0001BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_DATABASE_in_attach_stmt1412 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0001BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_STRING_in_attach_stmt1419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_attach_stmt1423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_attach_stmt1426 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_attach_stmt1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DETACH_in_detach_stmt1438 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_DATABASE_in_detach_stmt1441 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_detach_stmt1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANALYZE_in_analyze_stmt1455 = new BitSet(new long[]{0xFC00000000000002L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_analyze_stmt1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_analyze_stmt1466 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_analyze_stmt1468 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_analyze_stmt1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REINDEX_in_reindex_stmt1482 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_reindex_stmt1487 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_reindex_stmt1489 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_reindex_stmt1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VACUUM_in_vacuum_stmt1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_operation_conflict_clause1514 = new BitSet(new long[]{0x0400000000000000L,0x0001010000000000L,0x0000000002800000L});
    public static final BitSet FOLLOW_set_in_operation_conflict_clause1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_ordering_term1541 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000004L});
    public static final BitSet FOLLOW_ASC_in_ordering_term1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_ordering_term1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_operation_limited_clause1580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_operation_limited_clause1582 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ordering_term_in_operation_limited_clause1584 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_operation_limited_clause1587 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ordering_term_in_operation_limited_clause1589 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_operation_limited_clause1597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_operation_limited_clause1601 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_set_in_operation_limited_clause1604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_operation_limited_clause1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_list_in_select_stmt1624 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_ORDER_in_select_stmt1629 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_select_stmt1631 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt1633 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt1636 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt1638 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_select_stmt1647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt1651 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_OFFSET_in_select_stmt1655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt1659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_core_in_select_list1709 = new BitSet(new long[]{0x0000000000000002L,0x0200001000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_select_op_in_select_list1712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_core_in_select_list1715 = new BitSet(new long[]{0x0000000000000002L,0x0200001000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_UNION_in_select_op1724 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ALL_in_select_op1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERSECT_in_select_op1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCEPT_in_select_op1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_core1747 = new BitSet(new long[]{0xFC000000741E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ALL_in_select_core1750 = new BitSet(new long[]{0xFC000000741E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_DISTINCT_in_select_core1754 = new BitSet(new long[]{0xFC000000741E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_result_column_in_select_core1758 = new BitSet(new long[]{0x0000000002000002L,0x0000280000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_core1761 = new BitSet(new long[]{0xFC000000741E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_result_column_in_select_core1763 = new BitSet(new long[]{0x0000000002000002L,0x0000280000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_FROM_in_select_core1768 = new BitSet(new long[]{0xFC00000004000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_join_source_in_select_core1770 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_WHERE_in_select_core1775 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_select_core1779 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_GROUP_in_select_core1787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_select_core1789 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ordering_term_in_select_core1791 = new BitSet(new long[]{0x0000000002000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_core1794 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ordering_term_in_select_core1796 = new BitSet(new long[]{0x0000000002000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_HAVING_in_select_core1801 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_select_core1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_result_column1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_result_column1883 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_result_column1885 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ASTERISK_in_result_column1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_result_column1902 = new BitSet(new long[]{0xFC00000000000002L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_AS_in_result_column1906 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_result_column1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_source_in_join_source1933 = new BitSet(new long[]{0x0000000002000002L,0xA040000000080000L,0x0000000000001008L});
    public static final BitSet FOLLOW_join_op_in_join_source1936 = new BitSet(new long[]{0xFC00000004000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_single_source_in_join_source1939 = new BitSet(new long[]{0x0000000002000002L,0xA040000000080000L,0x0000008000001208L});
    public static final BitSet FOLLOW_join_constraint_in_join_source1942 = new BitSet(new long[]{0x0000000002000002L,0xA040000000080000L,0x0000000000001008L});
    public static final BitSet FOLLOW_id_in_single_source1959 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_single_source1961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_single_source1967 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000002L,0x0000800000000010L});
    public static final BitSet FOLLOW_AS_in_single_source1971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_single_source1977 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INDEXED_in_single_source1982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_single_source1984 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_single_source1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_single_source1992 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_INDEXED_in_single_source1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_single_source2035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_single_source2037 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_single_source2039 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_AS_in_single_source2043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_single_source2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_single_source2071 = new BitSet(new long[]{0xFC00000004000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_join_source_in_single_source2074 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_single_source2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_join_op2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATURAL_in_join_op2094 = new BitSet(new long[]{0x0000000000000000L,0xA040000000080000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LEFT_in_join_op2100 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_OUTER_in_join_op2105 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_INNER_in_join_op2111 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_CROSS_in_join_op2115 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_JOIN_in_join_op2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_join_constraint2129 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_join_constraint2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_join_constraint2138 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_join_constraint2140 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_join_constraint2144 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_join_constraint2147 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_join_constraint2151 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_join_constraint2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_stmt2174 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_operation_conflict_clause_in_insert_stmt2177 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_REPLACE_in_insert_stmt2183 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_INTO_in_insert_stmt2186 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_insert_stmt2191 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_insert_stmt2193 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_insert_stmt2199 = new BitSet(new long[]{0x0000000004000000L,0x0000000001000000L,0x0000020010000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt2206 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_insert_stmt2210 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt2213 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_insert_stmt2217 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt2221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020010000000L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt2230 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt2232 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_insert_stmt2236 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt2239 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_insert_stmt2243 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_insert_stmt2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_insert_stmt2258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update_stmt2270 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_operation_conflict_clause_in_update_stmt2273 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_qualified_table_name_in_update_stmt2277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_SET_in_update_stmt2281 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_update_set_in_update_stmt2285 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000200000000802L});
    public static final BitSet FOLLOW_COMMA_in_update_stmt2288 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_update_set_in_update_stmt2292 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000200000000802L});
    public static final BitSet FOLLOW_WHERE_in_update_stmt2297 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_update_stmt2299 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_operation_limited_clause_in_update_stmt2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_update_set2315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQUALS_in_update_set2317 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_update_set2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_stmt2327 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_FROM_in_delete_stmt2329 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_qualified_table_name_in_delete_stmt2331 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000802L});
    public static final BitSet FOLLOW_WHERE_in_delete_stmt2334 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_delete_stmt2336 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_operation_limited_clause_in_delete_stmt2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_begin_stmt2351 = new BitSet(new long[]{0x0000000000000002L,0x0002002004000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_set_in_begin_stmt2353 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_begin_stmt2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_commit_stmt2377 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_commit_stmt2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROLLBACK_in_rollback_stmt2396 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_rollback_stmt2399 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_TO_in_rollback_stmt2404 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_SAVEPOINT_in_rollback_stmt2407 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_rollback_stmt2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVEPOINT_in_savepoint_stmt2423 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_savepoint_stmt2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELEASE_in_release_stmt2435 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_SAVEPOINT_in_release_stmt2438 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_release_stmt2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_table_conflict_clause2456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_CONFLICT_in_table_conflict_clause2459 = new BitSet(new long[]{0x0400000000000000L,0x0001010000000000L,0x0000000002800000L});
    public static final BitSet FOLLOW_set_in_table_conflict_clause2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_virtual_table_stmt2489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_VIRTUAL_in_create_virtual_table_stmt2491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_create_virtual_table_stmt2493 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2498 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_virtual_table_stmt2500 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_USING_in_create_virtual_table_stmt2510 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2514 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_LPAREN_in_create_virtual_table_stmt2517 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_virtual_table_stmt2519 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_virtual_table_stmt2522 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_virtual_table_stmt2524 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_virtual_table_stmt2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_table_stmt2538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_table_stmt2540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_create_table_stmt2543 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_create_table_stmt2546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_table_stmt2548 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_table_stmt2550 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_table_stmt2557 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_table_stmt2559 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_table_stmt2565 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_create_table_stmt2571 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_table_stmt2573 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_table_stmt2576 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_table_stmt2578 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_table_stmt2583 = new BitSet(new long[]{0x0000000000000000L,0x0000040000021000L,0x0000002000008000L});
    public static final BitSet FOLLOW_table_constraint_in_create_table_stmt2585 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_table_stmt2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_create_table_stmt2595 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_create_table_stmt2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_column_def_in_column_def2653 = new BitSet(new long[]{0x0000000000000002L,0x0000000001023000L,0x0000802000048010L});
    public static final BitSet FOLLOW_type_name_in_column_def2655 = new BitSet(new long[]{0x0000000000000002L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_column_constraint_in_column_def2658 = new BitSet(new long[]{0x0000000000000002L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_CONSTRAINT_in_column_constraint2684 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_column_constraint2688 = new BitSet(new long[]{0x0000000000000000L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_column_constraint_pk_in_column_constraint2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_not_null_in_column_constraint2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_unique_in_column_constraint2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_check_in_column_constraint2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_default_in_column_constraint2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_collate_in_column_constraint2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fk_clause_in_column_constraint2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_in_column_constraint_pk2787 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_KEY_in_column_constraint_pk2790 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000014L,0x0000000000000200L});
    public static final BitSet FOLLOW_set_in_column_constraint_pk2793 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_pk2802 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_AUTOINCREMENT_in_column_constraint_pk2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_column_constraint_not_null2815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_column_constraint_not_null2817 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_not_null2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_column_constraint_unique2836 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_unique2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECK_in_column_constraint_check2847 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_column_constraint_check2850 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_column_constraint_check2853 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_column_constraint_check2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_column_constraint_default2864 = new BitSet(new long[]{0x0000000004060000L,0x0000000000700000L,0x001B000000000040L});
    public static final BitSet FOLLOW_set_in_column_constraint_default2868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000A000000000000L});
    public static final BitSet FOLLOW_set_in_column_constraint_default2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_value_in_column_constraint_default2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_column_constraint_default2890 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_column_constraint_default2893 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_column_constraint_default2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLATE_in_column_constraint_collate2904 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_column_constraint_collate2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRAINT_in_table_constraint2918 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_table_constraint2922 = new BitSet(new long[]{0x0000000000000000L,0x0000040000021000L,0x0000002000008000L});
    public static final BitSet FOLLOW_table_constraint_pk_in_table_constraint2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_unique_in_table_constraint2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_check_in_table_constraint2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_fk_in_table_constraint2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_in_table_constraint_pk2988 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_KEY_in_table_constraint_pk2990 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_pk2994 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_table_constraint_pk2998 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_pk3001 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_table_constraint_pk3005 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_pk3009 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_table_constraint_pk3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_table_constraint_unique3036 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_unique3040 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_table_constraint_unique3044 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_unique3047 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_table_constraint_unique3051 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_unique3055 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_table_constraint_unique3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECK_in_table_constraint_check3082 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_check3085 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_table_constraint_check3088 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_check3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREIGN_in_table_constraint_fk3098 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_KEY_in_table_constraint_fk3100 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_fk3102 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_table_constraint_fk3106 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_fk3109 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_table_constraint_fk3113 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_fk3117 = new BitSet(new long[]{0x0000000000000000L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_fk_clause_in_table_constraint_fk3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCES_in_fk_clause3142 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_fk_clause3146 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000204L});
    public static final BitSet FOLLOW_LPAREN_in_fk_clause3149 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_fk_clause3153 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_fk_clause3156 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_fk_clause3160 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_fk_clause3164 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000204L});
    public static final BitSet FOLLOW_fk_clause_action_in_fk_clause3170 = new BitSet(new long[]{0x0000000004000002L,0x0000000002000000L,0x0000000000000214L});
    public static final BitSet FOLLOW_fk_clause_deferrable_in_fk_clause3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_fk_clause_action3207 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_set_in_fk_clause_action3210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L,0x0000000021000000L});
    public static final BitSet FOLLOW_SET_in_fk_clause_action3223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_fk_clause_action3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_fk_clause_action3230 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_DEFAULT_in_fk_clause_action3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASCADE_in_fk_clause_action3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESTRICT_in_fk_clause_action3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCH_in_fk_clause_action3248 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_fk_clause_action3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_fk_clause_deferrable3259 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_DEFERRABLE_in_fk_clause_deferrable3263 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_INITIALLY_in_fk_clause_deferrable3267 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_DEFERRED_in_fk_clause_deferrable3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITIALLY_in_fk_clause_deferrable3274 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IMMEDIATE_in_fk_clause_deferrable3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_table_stmt3287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_drop_table_stmt3289 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_drop_table_stmt3292 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_table_stmt3294 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_table_stmt3301 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_table_stmt3303 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_table_stmt3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALTER_in_alter_table_stmt3339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_alter_table_stmt3341 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3346 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_alter_table_stmt3348 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3354 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RENAME_in_alter_table_stmt3357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_TO_in_alter_table_stmt3359 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_alter_table_stmt3367 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_COLUMN_in_alter_table_stmt3370 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_alter_table_stmt3374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_view_stmt3383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040080000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_view_stmt3385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_VIEW_in_create_view_stmt3388 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_create_view_stmt3391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_view_stmt3393 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_view_stmt3395 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_view_stmt3402 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_view_stmt3404 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_view_stmt3410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_create_view_stmt3412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_create_view_stmt3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_view_stmt3422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_VIEW_in_drop_view_stmt3424 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_drop_view_stmt3427 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_view_stmt3429 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_view_stmt3436 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_view_stmt3438 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_view_stmt3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_index_stmt3452 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_UNIQUE_in_create_index_stmt3455 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_INDEX_in_create_index_stmt3459 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_create_index_stmt3462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_index_stmt3464 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_index_stmt3466 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3473 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_index_stmt3475 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ON_in_create_index_stmt3485 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3489 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_create_index_stmt3491 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_indexed_column_in_create_index_stmt3495 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_index_stmt3498 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_indexed_column_in_create_index_stmt3502 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_index_stmt3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_indexed_column3552 = new BitSet(new long[]{0x0000000000000002L,0x0000000010002004L});
    public static final BitSet FOLLOW_COLLATE_in_indexed_column3555 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_indexed_column3559 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000004L});
    public static final BitSet FOLLOW_ASC_in_indexed_column3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_indexed_column3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_index_stmt3599 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_INDEX_in_drop_index_stmt3601 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_drop_index_stmt3604 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_index_stmt3606 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_index_stmt3613 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_index_stmt3615 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_index_stmt3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_trigger_stmt3651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000880000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_trigger_stmt3653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_TRIGGER_in_create_trigger_stmt3656 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_create_trigger_stmt3659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_trigger_stmt3661 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_trigger_stmt3663 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3670 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_trigger_stmt3672 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3678 = new BitSet(new long[]{0x1000000000000000L,0x0180000008000020L,0x0000004000000000L});
    public static final BitSet FOLLOW_BEFORE_in_create_trigger_stmt3683 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_AFTER_in_create_trigger_stmt3687 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_INSTEAD_in_create_trigger_stmt3691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_OF_in_create_trigger_stmt3693 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_DELETE_in_create_trigger_stmt3698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INSERT_in_create_trigger_stmt3702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_UPDATE_in_create_trigger_stmt3706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_OF_in_create_trigger_stmt3709 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3713 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_create_trigger_stmt3716 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3720 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ON_in_create_trigger_stmt3729 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3733 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000040L,0x0000100000000000L});
    public static final BitSet FOLLOW_FOR_in_create_trigger_stmt3736 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_EACH_in_create_trigger_stmt3738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ROW_in_create_trigger_stmt3740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000100000000000L});
    public static final BitSet FOLLOW_WHEN_in_create_trigger_stmt3745 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_create_trigger_stmt3747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_BEGIN_in_create_trigger_stmt3753 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004010800000L});
    public static final BitSet FOLLOW_update_stmt_in_create_trigger_stmt3757 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_insert_stmt_in_create_trigger_stmt3761 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_delete_stmt_in_create_trigger_stmt3765 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_select_stmt_in_create_trigger_stmt3769 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMI_in_create_trigger_stmt3772 = new BitSet(new long[]{0x0000000000000000L,0x0080000408000000L,0x0000004010800000L});
    public static final BitSet FOLLOW_END_in_create_trigger_stmt3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_trigger_stmt3784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_TRIGGER_in_drop_trigger_stmt3786 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_drop_trigger_stmt3789 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_trigger_stmt3791 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_trigger_stmt3798 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_trigger_stmt3800 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_trigger_stmt3806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_id3820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_column_def4494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_column_def_in_id_column_def4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword_column_def4505 = new BitSet(new long[]{0x0000000000000002L});

}