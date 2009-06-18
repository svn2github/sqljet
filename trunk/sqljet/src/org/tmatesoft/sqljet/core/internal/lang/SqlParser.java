// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 SqlParser.g 2009-06-18 13:39:49

  package org.tmatesoft.sqljet.core.internal.lang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class SqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "EQUALS", "EQUALS2", "NOT_EQUALS", "NOT_EQUALS2", "LESS", "LESS_OR_EQ", "GREATER", "GREATER_OR_EQ", "SHIFT_LEFT", "SHIFT_RIGHT", "AMPERSAND", "PIPE", "DOUBLE_PIPE", "PLUS", "MINUS", "TILDA", "ASTERISK", "SLASH", "PERCENT", "SEMI", "DOT", "COMMA", "LPAREN", "RPAREN", "QUESTION", "COLON", "AT", "DOLLAR", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "ABORT", "ADD", "AFTER", "ALL", "ALTER", "ANALYZE", "AND", "AS", "ASC", "ATTACH", "AUTOINCREMENT", "BEFORE", "BEGIN", "BETWEEN", "BY", "CASCADE", "CASE", "CAST", "CHECK", "COLLATE", "COLUMN", "COMMIT", "CONFLICT", "CONSTRAINT", "CREATE", "CROSS", "CURRENT_TIME", "CURRENT_DATE", "CURRENT_TIMESTAMP", "DATABASE", "DEFAULT", "DEFERRABLE", "DEFERRED", "DELETE", "DESC", "DETACH", "DISTINCT", "DROP", "EACH", "ELSE", "END", "ESCAPE", "EXCEPT", "EXCLUSIVE", "EXISTS", "EXPLAIN", "FAIL", "FOR", "FOREIGN", "FROM", "GLOB", "GROUP", "HAVING", "IF", "IGNORE", "IMMEDIATE", "IN", "INDEX", "INDEXED", "INITIALLY", "INNER", "INSERT", "INSTEAD", "INTERSECT", "INTO", "IS", "ISNULL", "JOIN", "KEY", "LEFT", "LIKE", "LIMIT", "MATCH", "NATURAL", "NOT", "NOTNULL", "NULL", "OF", "OFFSET", "ON", "OR", "ORDER", "OUTER", "PLAN", "PRAGMA", "PRIMARY", "QUERY", "RAISE", "REFERENCES", "REGEXP", "REINDEX", "RELEASE", "RENAME", "REPLACE", "RESTRICT", "ROLLBACK", "ROW", "SAVEPOINT", "SELECT", "SET", "TABLE", "TEMPORARY", "THEN", "TO", "TRANSACTION", "TRIGGER", "UNION", "UNIQUE", "UPDATE", "USING", "VACUUM", "VALUES", "VIEW", "VIRTUAL", "WHEN", "WHERE", "ID_START", "ID", "STRING", "INTEGER", "FLOAT_EXP", "FLOAT", "BLOB", "COMMENT", "LINE_COMMENT", "WS", "ALIAS", "BIND", "BIND_NAME", "BLOB_LITERAL", "COLUMN_CONSTRAINT", "COLUMN_EXPRESSION", "COLUMNS", "CONSTRAINTS", "CREATE_INDEX", "CREATE_TABLE", "DROP_INDEX", "DROP_TABLE", "FLOAT_LITERAL", "FUNCTION_LITERAL", "FUNCTION_EXPRESSION", "INTEGER_LITERAL", "IS_NULL", "IN_VALUES", "IN_TABLE", "NOT_NULL", "OPTIONS", "ORDERING", "SELECT_CORE", "STRING_LITERAL", "TABLE_CONSTRAINT", "TYPE", "TYPE_PARAMS"
    };
    public static final int ROW=154;
    public static final int BLOB_LITERAL=187;
    public static final int TYPE_PARAMS=210;
    public static final int NOT=132;
    public static final int EXCEPT=100;
    public static final int FOREIGN=106;
    public static final int EOF=-1;
    public static final int TYPE=209;
    public static final int RPAREN=27;
    public static final int CREATE=82;
    public static final int STRING_LITERAL=207;
    public static final int IS_NULL=200;
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
    public static final int IN_VALUES=201;
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
    public static final int NOT_NULL=203;
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
    public static final int IN_TABLE=202;
    public static final int DATABASE=87;
    public static final int VACUUM=168;
    public static final int DROP=95;
    public static final int DETACH=93;
    public static final int WHEN=172;
    public static final int NATURAL=131;
    public static final int BETWEEN=71;
    public static final int OPTIONS=204;
    public static final int STRING=176;
    public static final int CAST=75;
    public static final int TABLE_CONSTRAINT=208;
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
    public static final int INTEGER_LITERAL=199;
    public static final int FUNCTION_EXPRESSION=198;
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
    public static final int SELECT_CORE=206;
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
    public static final int ORDERING=205;
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
    // SqlParser.g:61:1: sql_stmt_list : ( sql_stmt )+ ;
    public final SqlParser.sql_stmt_list_return sql_stmt_list() throws RecognitionException {
        SqlParser.sql_stmt_list_return retval = new SqlParser.sql_stmt_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.sql_stmt_return sql_stmt1 = null;



        try {
            // SqlParser.g:61:14: ( ( sql_stmt )+ )
            // SqlParser.g:61:16: ( sql_stmt )+
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:61:16: ( sql_stmt )+
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
            	    // SqlParser.g:61:17: sql_stmt
            	    {
            	    pushFollow(FOLLOW_sql_stmt_in_sql_stmt_list175);
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
    // SqlParser.g:63:1: sql_stmt : ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI ;
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
            // SqlParser.g:63:9: ( ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI )
            // SqlParser.g:63:11: ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:63:11: ( EXPLAIN ( QUERY PLAN )? )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EXPLAIN) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // SqlParser.g:63:12: EXPLAIN ( QUERY PLAN )?
                    {
                    EXPLAIN2=(Token)match(input,EXPLAIN,FOLLOW_EXPLAIN_in_sql_stmt185); 
                    EXPLAIN2_tree = (Object)adaptor.create(EXPLAIN2);
                    adaptor.addChild(root_0, EXPLAIN2_tree);

                    // SqlParser.g:63:20: ( QUERY PLAN )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==QUERY) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // SqlParser.g:63:21: QUERY PLAN
                            {
                            QUERY3=(Token)match(input,QUERY,FOLLOW_QUERY_in_sql_stmt188); 
                            QUERY3_tree = (Object)adaptor.create(QUERY3);
                            adaptor.addChild(root_0, QUERY3_tree);

                            PLAN4=(Token)match(input,PLAN,FOLLOW_PLAN_in_sql_stmt190); 
                            PLAN4_tree = (Object)adaptor.create(PLAN4);
                            adaptor.addChild(root_0, PLAN4_tree);


                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_sql_stmt_core_in_sql_stmt196);
            sql_stmt_core5=sql_stmt_core();

            state._fsp--;

            adaptor.addChild(root_0, sql_stmt_core5.getTree());
            SEMI6=(Token)match(input,SEMI,FOLLOW_SEMI_in_sql_stmt198); 

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
    // SqlParser.g:65:1: sql_stmt_core : ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt );
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
            // SqlParser.g:66:3: ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt )
            int alt4=25;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // SqlParser.g:66:5: pragma_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pragma_stmt_in_sql_stmt_core209);
                    pragma_stmt7=pragma_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_stmt7.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:67:5: attach_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_attach_stmt_in_sql_stmt_core215);
                    attach_stmt8=attach_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, attach_stmt8.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:68:5: detach_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_detach_stmt_in_sql_stmt_core221);
                    detach_stmt9=detach_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, detach_stmt9.getTree());

                    }
                    break;
                case 4 :
                    // SqlParser.g:69:5: analyze_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_analyze_stmt_in_sql_stmt_core227);
                    analyze_stmt10=analyze_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, analyze_stmt10.getTree());

                    }
                    break;
                case 5 :
                    // SqlParser.g:70:5: reindex_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_reindex_stmt_in_sql_stmt_core233);
                    reindex_stmt11=reindex_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, reindex_stmt11.getTree());

                    }
                    break;
                case 6 :
                    // SqlParser.g:71:5: vacuum_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_vacuum_stmt_in_sql_stmt_core239);
                    vacuum_stmt12=vacuum_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, vacuum_stmt12.getTree());

                    }
                    break;
                case 7 :
                    // SqlParser.g:73:5: select_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_select_stmt_in_sql_stmt_core248);
                    select_stmt13=select_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, select_stmt13.getTree());

                    }
                    break;
                case 8 :
                    // SqlParser.g:74:5: insert_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_insert_stmt_in_sql_stmt_core254);
                    insert_stmt14=insert_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, insert_stmt14.getTree());

                    }
                    break;
                case 9 :
                    // SqlParser.g:75:5: update_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_update_stmt_in_sql_stmt_core260);
                    update_stmt15=update_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, update_stmt15.getTree());

                    }
                    break;
                case 10 :
                    // SqlParser.g:76:5: delete_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_delete_stmt_in_sql_stmt_core266);
                    delete_stmt16=delete_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_stmt16.getTree());

                    }
                    break;
                case 11 :
                    // SqlParser.g:77:5: begin_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_begin_stmt_in_sql_stmt_core272);
                    begin_stmt17=begin_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, begin_stmt17.getTree());

                    }
                    break;
                case 12 :
                    // SqlParser.g:78:5: commit_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_commit_stmt_in_sql_stmt_core278);
                    commit_stmt18=commit_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, commit_stmt18.getTree());

                    }
                    break;
                case 13 :
                    // SqlParser.g:79:5: rollback_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_rollback_stmt_in_sql_stmt_core284);
                    rollback_stmt19=rollback_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, rollback_stmt19.getTree());

                    }
                    break;
                case 14 :
                    // SqlParser.g:80:5: savepoint_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_savepoint_stmt_in_sql_stmt_core290);
                    savepoint_stmt20=savepoint_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, savepoint_stmt20.getTree());

                    }
                    break;
                case 15 :
                    // SqlParser.g:81:5: release_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_release_stmt_in_sql_stmt_core296);
                    release_stmt21=release_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, release_stmt21.getTree());

                    }
                    break;
                case 16 :
                    // SqlParser.g:83:5: create_virtual_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_virtual_table_stmt_in_sql_stmt_core305);
                    create_virtual_table_stmt22=create_virtual_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_virtual_table_stmt22.getTree());

                    }
                    break;
                case 17 :
                    // SqlParser.g:84:5: create_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_table_stmt_in_sql_stmt_core311);
                    create_table_stmt23=create_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_table_stmt23.getTree());

                    }
                    break;
                case 18 :
                    // SqlParser.g:85:5: drop_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_table_stmt_in_sql_stmt_core317);
                    drop_table_stmt24=drop_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_table_stmt24.getTree());

                    }
                    break;
                case 19 :
                    // SqlParser.g:86:5: alter_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_alter_table_stmt_in_sql_stmt_core323);
                    alter_table_stmt25=alter_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, alter_table_stmt25.getTree());

                    }
                    break;
                case 20 :
                    // SqlParser.g:87:5: create_view_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_view_stmt_in_sql_stmt_core329);
                    create_view_stmt26=create_view_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_view_stmt26.getTree());

                    }
                    break;
                case 21 :
                    // SqlParser.g:88:5: drop_view_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_view_stmt_in_sql_stmt_core335);
                    drop_view_stmt27=drop_view_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_view_stmt27.getTree());

                    }
                    break;
                case 22 :
                    // SqlParser.g:89:5: create_index_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_index_stmt_in_sql_stmt_core341);
                    create_index_stmt28=create_index_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_index_stmt28.getTree());

                    }
                    break;
                case 23 :
                    // SqlParser.g:90:5: drop_index_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_index_stmt_in_sql_stmt_core347);
                    drop_index_stmt29=drop_index_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_index_stmt29.getTree());

                    }
                    break;
                case 24 :
                    // SqlParser.g:91:5: create_trigger_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_trigger_stmt_in_sql_stmt_core353);
                    create_trigger_stmt30=create_trigger_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_trigger_stmt30.getTree());

                    }
                    break;
                case 25 :
                    // SqlParser.g:92:5: drop_trigger_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_trigger_stmt_in_sql_stmt_core359);
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
    // SqlParser.g:95:1: qualified_table_name : (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )? ;
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
            // SqlParser.g:95:21: ( (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )? )
            // SqlParser.g:95:23: (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )?
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:95:23: (database_name= id DOT )?
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
                    // SqlParser.g:95:24: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_qualified_table_name372);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT32=(Token)match(input,DOT,FOLLOW_DOT_in_qualified_table_name374); 
                    DOT32_tree = (Object)adaptor.create(DOT32);
                    adaptor.addChild(root_0, DOT32_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_qualified_table_name380);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:95:61: ( INDEXED BY index_name= id | NOT INDEXED )?
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
                    // SqlParser.g:95:62: INDEXED BY index_name= id
                    {
                    INDEXED33=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_qualified_table_name383); 
                    INDEXED33_tree = (Object)adaptor.create(INDEXED33);
                    adaptor.addChild(root_0, INDEXED33_tree);

                    BY34=(Token)match(input,BY,FOLLOW_BY_in_qualified_table_name385); 
                    BY34_tree = (Object)adaptor.create(BY34);
                    adaptor.addChild(root_0, BY34_tree);

                    pushFollow(FOLLOW_id_in_qualified_table_name389);
                    index_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, index_name.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:95:89: NOT INDEXED
                    {
                    NOT35=(Token)match(input,NOT,FOLLOW_NOT_in_qualified_table_name393); 
                    NOT35_tree = (Object)adaptor.create(NOT35);
                    adaptor.addChild(root_0, NOT35_tree);

                    INDEXED36=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_qualified_table_name395); 
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
    // SqlParser.g:97:1: signed_number : ( PLUS | MINUS )? ( INTEGER | FLOAT ) ;
    public final SqlParser.signed_number_return signed_number() throws RecognitionException {
        SqlParser.signed_number_return retval = new SqlParser.signed_number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set37=null;
        Token set38=null;

        Object set37_tree=null;
        Object set38_tree=null;

        try {
            // SqlParser.g:97:14: ( ( PLUS | MINUS )? ( INTEGER | FLOAT ) )
            // SqlParser.g:97:16: ( PLUS | MINUS )? ( INTEGER | FLOAT )
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:97:16: ( PLUS | MINUS )?
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
    // SqlParser.g:99:1: expr : or_subexpr ( OR or_subexpr )* ;
    public final SqlParser.expr_return expr() throws RecognitionException {
        SqlParser.expr_return retval = new SqlParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR40=null;
        SqlParser.or_subexpr_return or_subexpr39 = null;

        SqlParser.or_subexpr_return or_subexpr41 = null;


        Object OR40_tree=null;

        try {
            // SqlParser.g:99:5: ( or_subexpr ( OR or_subexpr )* )
            // SqlParser.g:99:7: or_subexpr ( OR or_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_or_subexpr_in_expr426);
            or_subexpr39=or_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, or_subexpr39.getTree());
            // SqlParser.g:99:18: ( OR or_subexpr )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // SqlParser.g:99:19: OR or_subexpr
            	    {
            	    OR40=(Token)match(input,OR,FOLLOW_OR_in_expr429); 
            	    OR40_tree = (Object)adaptor.create(OR40);
            	    root_0 = (Object)adaptor.becomeRoot(OR40_tree, root_0);

            	    pushFollow(FOLLOW_or_subexpr_in_expr432);
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
    // SqlParser.g:101:1: or_subexpr : and_subexpr ( AND and_subexpr )* ;
    public final SqlParser.or_subexpr_return or_subexpr() throws RecognitionException {
        SqlParser.or_subexpr_return retval = new SqlParser.or_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND43=null;
        SqlParser.and_subexpr_return and_subexpr42 = null;

        SqlParser.and_subexpr_return and_subexpr44 = null;


        Object AND43_tree=null;

        try {
            // SqlParser.g:101:11: ( and_subexpr ( AND and_subexpr )* )
            // SqlParser.g:101:13: and_subexpr ( AND and_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_and_subexpr_in_or_subexpr441);
            and_subexpr42=and_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, and_subexpr42.getTree());
            // SqlParser.g:101:25: ( AND and_subexpr )*
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // SqlParser.g:101:26: AND and_subexpr
            	    {
            	    AND43=(Token)match(input,AND,FOLLOW_AND_in_or_subexpr444); 
            	    AND43_tree = (Object)adaptor.create(AND43);
            	    root_0 = (Object)adaptor.becomeRoot(AND43_tree, root_0);

            	    pushFollow(FOLLOW_and_subexpr_in_or_subexpr447);
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
    // SqlParser.g:103:1: and_subexpr : eq_subexpr ( cond_expr )? ;
    public final SqlParser.and_subexpr_return and_subexpr() throws RecognitionException {
        SqlParser.and_subexpr_return retval = new SqlParser.and_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.eq_subexpr_return eq_subexpr45 = null;

        SqlParser.cond_expr_return cond_expr46 = null;



        try {
            // SqlParser.g:103:12: ( eq_subexpr ( cond_expr )? )
            // SqlParser.g:103:14: eq_subexpr ( cond_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_eq_subexpr_in_and_subexpr456);
            eq_subexpr45=eq_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, eq_subexpr45.getTree());
            // SqlParser.g:103:34: ( cond_expr )?
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // SqlParser.g:103:34: cond_expr
                    {
                    pushFollow(FOLLOW_cond_expr_in_and_subexpr458);
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
    // SqlParser.g:105:1: cond_expr : ( ( NOT )? match_op match_expr= eq_subexpr ( ESCAPE escape_expr= eq_subexpr )? -> ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? ) | ( NOT )? IN LPAREN expr ( COMMA expr )* RPAREN -> ^( IN_VALUES ( NOT )? ^( IN ( expr )+ ) ) | ( NOT )? IN (database_name= id DOT )? table_name= id -> ^( IN_TABLE ( NOT )? ^( IN ^( $table_name ( $database_name)? ) ) ) | ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL ) | ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr -> ^( BETWEEN ( NOT )? ^( AND $e1 $e2) ) | ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )+ );
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
            // SqlParser.g:106:3: ( ( NOT )? match_op match_expr= eq_subexpr ( ESCAPE escape_expr= eq_subexpr )? -> ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? ) | ( NOT )? IN LPAREN expr ( COMMA expr )* RPAREN -> ^( IN_VALUES ( NOT )? ^( IN ( expr )+ ) ) | ( NOT )? IN (database_name= id DOT )? table_name= id -> ^( IN_TABLE ( NOT )? ^( IN ^( $table_name ( $database_name)? ) ) ) | ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL ) | ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr -> ^( BETWEEN ( NOT )? ^( AND $e1 $e2) ) | ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )+ )
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
                    // SqlParser.g:106:5: ( NOT )? match_op match_expr= eq_subexpr ( ESCAPE escape_expr= eq_subexpr )?
                    {
                    // SqlParser.g:106:5: ( NOT )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==NOT) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // SqlParser.g:106:5: NOT
                            {
                            NOT47=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr470);  
                            stream_NOT.add(NOT47);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_match_op_in_cond_expr473);
                    match_op48=match_op();

                    state._fsp--;

                    stream_match_op.add(match_op48.getTree());
                    pushFollow(FOLLOW_eq_subexpr_in_cond_expr477);
                    match_expr=eq_subexpr();

                    state._fsp--;

                    stream_eq_subexpr.add(match_expr.getTree());
                    // SqlParser.g:106:41: ( ESCAPE escape_expr= eq_subexpr )?
                    int alt12=2;
                    alt12 = dfa12.predict(input);
                    switch (alt12) {
                        case 1 :
                            // SqlParser.g:106:42: ESCAPE escape_expr= eq_subexpr
                            {
                            ESCAPE49=(Token)match(input,ESCAPE,FOLLOW_ESCAPE_in_cond_expr480);  
                            stream_ESCAPE.add(ESCAPE49);

                            pushFollow(FOLLOW_eq_subexpr_in_cond_expr484);
                            escape_expr=eq_subexpr();

                            state._fsp--;

                            stream_eq_subexpr.add(escape_expr.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: match_expr, ESCAPE, NOT, match_op, escape_expr
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
                    // 106:74: -> ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? )
                    {
                        // SqlParser.g:106:77: ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_match_op.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_match_expr.nextTree());
                        // SqlParser.g:106:100: ( NOT )?
                        if ( stream_NOT.hasNext() ) {
                            adaptor.addChild(root_1, stream_NOT.nextNode());

                        }
                        stream_NOT.reset();
                        // SqlParser.g:106:105: ( ^( ESCAPE $escape_expr) )?
                        if ( stream_ESCAPE.hasNext()||stream_escape_expr.hasNext() ) {
                            // SqlParser.g:106:105: ^( ESCAPE $escape_expr)
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(stream_ESCAPE.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_escape_expr.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_ESCAPE.reset();
                        stream_escape_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // SqlParser.g:107:5: ( NOT )? IN LPAREN expr ( COMMA expr )* RPAREN
                    {
                    // SqlParser.g:107:5: ( NOT )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==NOT) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // SqlParser.g:107:5: NOT
                            {
                            NOT50=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr512);  
                            stream_NOT.add(NOT50);


                            }
                            break;

                    }

                    IN51=(Token)match(input,IN,FOLLOW_IN_in_cond_expr515);  
                    stream_IN.add(IN51);

                    LPAREN52=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cond_expr517);  
                    stream_LPAREN.add(LPAREN52);

                    pushFollow(FOLLOW_expr_in_cond_expr519);
                    expr53=expr();

                    state._fsp--;

                    stream_expr.add(expr53.getTree());
                    // SqlParser.g:107:25: ( COMMA expr )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==COMMA) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // SqlParser.g:107:26: COMMA expr
                    	    {
                    	    COMMA54=(Token)match(input,COMMA,FOLLOW_COMMA_in_cond_expr522);  
                    	    stream_COMMA.add(COMMA54);

                    	    pushFollow(FOLLOW_expr_in_cond_expr524);
                    	    expr55=expr();

                    	    state._fsp--;

                    	    stream_expr.add(expr55.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    RPAREN56=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cond_expr528);  
                    stream_RPAREN.add(RPAREN56);



                    // AST REWRITE
                    // elements: expr, IN, NOT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 107:46: -> ^( IN_VALUES ( NOT )? ^( IN ( expr )+ ) )
                    {
                        // SqlParser.g:107:49: ^( IN_VALUES ( NOT )? ^( IN ( expr )+ ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN_VALUES, "IN_VALUES"), root_1);

                        // SqlParser.g:107:61: ( NOT )?
                        if ( stream_NOT.hasNext() ) {
                            adaptor.addChild(root_1, stream_NOT.nextNode());

                        }
                        stream_NOT.reset();
                        // SqlParser.g:107:66: ^( IN ( expr )+ )
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
                    // SqlParser.g:108:5: ( NOT )? IN (database_name= id DOT )? table_name= id
                    {
                    // SqlParser.g:108:5: ( NOT )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==NOT) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // SqlParser.g:108:5: NOT
                            {
                            NOT57=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr550);  
                            stream_NOT.add(NOT57);


                            }
                            break;

                    }

                    IN58=(Token)match(input,IN,FOLLOW_IN_in_cond_expr553);  
                    stream_IN.add(IN58);

                    // SqlParser.g:108:13: (database_name= id DOT )?
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
                            // SqlParser.g:108:14: database_name= id DOT
                            {
                            pushFollow(FOLLOW_id_in_cond_expr558);
                            database_name=id();

                            state._fsp--;

                            stream_id.add(database_name.getTree());
                            DOT59=(Token)match(input,DOT,FOLLOW_DOT_in_cond_expr560);  
                            stream_DOT.add(DOT59);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_id_in_cond_expr566);
                    table_name=id();

                    state._fsp--;

                    stream_id.add(table_name.getTree());


                    // AST REWRITE
                    // elements: NOT, table_name, database_name, IN
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
                    // 108:51: -> ^( IN_TABLE ( NOT )? ^( IN ^( $table_name ( $database_name)? ) ) )
                    {
                        // SqlParser.g:108:54: ^( IN_TABLE ( NOT )? ^( IN ^( $table_name ( $database_name)? ) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN_TABLE, "IN_TABLE"), root_1);

                        // SqlParser.g:108:65: ( NOT )?
                        if ( stream_NOT.hasNext() ) {
                            adaptor.addChild(root_1, stream_NOT.nextNode());

                        }
                        stream_NOT.reset();
                        // SqlParser.g:108:70: ^( IN ^( $table_name ( $database_name)? ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_IN.nextNode(), root_2);

                        // SqlParser.g:108:75: ^( $table_name ( $database_name)? )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_3);

                        // SqlParser.g:108:89: ( $database_name)?
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
                    // SqlParser.g:111:5: ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL )
                    {
                    // SqlParser.g:111:5: ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL )
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
                            // SqlParser.g:111:6: ISNULL
                            {
                            ISNULL60=(Token)match(input,ISNULL,FOLLOW_ISNULL_in_cond_expr597);  
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
                            // 111:13: -> IS_NULL
                            {
                                adaptor.addChild(root_0, (Object)adaptor.create(IS_NULL, "IS_NULL"));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 2 :
                            // SqlParser.g:111:26: NOTNULL
                            {
                            NOTNULL61=(Token)match(input,NOTNULL,FOLLOW_NOTNULL_in_cond_expr605);  
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
                            // 111:34: -> NOT_NULL
                            {
                                adaptor.addChild(root_0, (Object)adaptor.create(NOT_NULL, "NOT_NULL"));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 3 :
                            // SqlParser.g:111:48: IS NULL
                            {
                            IS62=(Token)match(input,IS,FOLLOW_IS_in_cond_expr613);  
                            stream_IS.add(IS62);

                            NULL63=(Token)match(input,NULL,FOLLOW_NULL_in_cond_expr615);  
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
                            // 111:56: -> IS_NULL
                            {
                                adaptor.addChild(root_0, (Object)adaptor.create(IS_NULL, "IS_NULL"));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 4 :
                            // SqlParser.g:111:69: NOT NULL
                            {
                            NOT64=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr623);  
                            stream_NOT.add(NOT64);

                            NULL65=(Token)match(input,NULL,FOLLOW_NULL_in_cond_expr625);  
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
                            // 111:78: -> NOT_NULL
                            {
                                adaptor.addChild(root_0, (Object)adaptor.create(NOT_NULL, "NOT_NULL"));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 5 :
                            // SqlParser.g:111:92: IS NOT NULL
                            {
                            IS66=(Token)match(input,IS,FOLLOW_IS_in_cond_expr633);  
                            stream_IS.add(IS66);

                            NOT67=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr635);  
                            stream_NOT.add(NOT67);

                            NULL68=(Token)match(input,NULL,FOLLOW_NULL_in_cond_expr637);  
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
                            // 111:104: -> NOT_NULL
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
                    // SqlParser.g:112:5: ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr
                    {
                    // SqlParser.g:112:5: ( NOT )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NOT) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // SqlParser.g:112:5: NOT
                            {
                            NOT69=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr648);  
                            stream_NOT.add(NOT69);


                            }
                            break;

                    }

                    BETWEEN70=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_cond_expr651);  
                    stream_BETWEEN.add(BETWEEN70);

                    pushFollow(FOLLOW_eq_subexpr_in_cond_expr655);
                    e1=eq_subexpr();

                    state._fsp--;

                    stream_eq_subexpr.add(e1.getTree());
                    AND71=(Token)match(input,AND,FOLLOW_AND_in_cond_expr657);  
                    stream_AND.add(AND71);

                    pushFollow(FOLLOW_eq_subexpr_in_cond_expr661);
                    e2=eq_subexpr();

                    state._fsp--;

                    stream_eq_subexpr.add(e2.getTree());


                    // AST REWRITE
                    // elements: AND, BETWEEN, e1, e2, NOT
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
                    // 112:50: -> ^( BETWEEN ( NOT )? ^( AND $e1 $e2) )
                    {
                        // SqlParser.g:112:53: ^( BETWEEN ( NOT )? ^( AND $e1 $e2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_BETWEEN.nextNode(), root_1);

                        // SqlParser.g:112:63: ( NOT )?
                        if ( stream_NOT.hasNext() ) {
                            adaptor.addChild(root_1, stream_NOT.nextNode());

                        }
                        stream_NOT.reset();
                        // SqlParser.g:112:68: ^( AND $e1 $e2)
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
                    // SqlParser.g:113:5: ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )+
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:113:5: ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )+
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
                    	    // SqlParser.g:113:6: ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr
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

                    	    pushFollow(FOLLOW_eq_subexpr_in_cond_expr704);
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
    // SqlParser.g:116:1: match_op : ( LIKE | GLOB | REGEXP | MATCH );
    public final SqlParser.match_op_return match_op() throws RecognitionException {
        SqlParser.match_op_return retval = new SqlParser.match_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set74=null;

        Object set74_tree=null;

        try {
            // SqlParser.g:116:9: ( LIKE | GLOB | REGEXP | MATCH )
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
    // SqlParser.g:118:1: eq_subexpr : neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )* ;
    public final SqlParser.eq_subexpr_return eq_subexpr() throws RecognitionException {
        SqlParser.eq_subexpr_return retval = new SqlParser.eq_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set76=null;
        SqlParser.neq_subexpr_return neq_subexpr75 = null;

        SqlParser.neq_subexpr_return neq_subexpr77 = null;


        Object set76_tree=null;

        try {
            // SqlParser.g:118:11: ( neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )* )
            // SqlParser.g:118:13: neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_neq_subexpr_in_eq_subexpr737);
            neq_subexpr75=neq_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, neq_subexpr75.getTree());
            // SqlParser.g:118:25: ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=LESS && LA21_0<=GREATER_OR_EQ)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // SqlParser.g:118:26: ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr
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

            	    pushFollow(FOLLOW_neq_subexpr_in_eq_subexpr757);
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
    // SqlParser.g:120:1: neq_subexpr : bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )* ;
    public final SqlParser.neq_subexpr_return neq_subexpr() throws RecognitionException {
        SqlParser.neq_subexpr_return retval = new SqlParser.neq_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set79=null;
        SqlParser.bit_subexpr_return bit_subexpr78 = null;

        SqlParser.bit_subexpr_return bit_subexpr80 = null;


        Object set79_tree=null;

        try {
            // SqlParser.g:120:12: ( bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )* )
            // SqlParser.g:120:14: bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bit_subexpr_in_neq_subexpr766);
            bit_subexpr78=bit_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, bit_subexpr78.getTree());
            // SqlParser.g:120:26: ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=SHIFT_LEFT && LA22_0<=PIPE)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // SqlParser.g:120:27: ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr
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

            	    pushFollow(FOLLOW_bit_subexpr_in_neq_subexpr786);
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
    // SqlParser.g:122:1: bit_subexpr : add_subexpr ( ( PLUS | MINUS ) add_subexpr )* ;
    public final SqlParser.bit_subexpr_return bit_subexpr() throws RecognitionException {
        SqlParser.bit_subexpr_return retval = new SqlParser.bit_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set82=null;
        SqlParser.add_subexpr_return add_subexpr81 = null;

        SqlParser.add_subexpr_return add_subexpr83 = null;


        Object set82_tree=null;

        try {
            // SqlParser.g:122:12: ( add_subexpr ( ( PLUS | MINUS ) add_subexpr )* )
            // SqlParser.g:122:14: add_subexpr ( ( PLUS | MINUS ) add_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_subexpr_in_bit_subexpr795);
            add_subexpr81=add_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, add_subexpr81.getTree());
            // SqlParser.g:122:26: ( ( PLUS | MINUS ) add_subexpr )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=PLUS && LA23_0<=MINUS)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // SqlParser.g:122:27: ( PLUS | MINUS ) add_subexpr
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

            	    pushFollow(FOLLOW_add_subexpr_in_bit_subexpr807);
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
    // SqlParser.g:124:1: add_subexpr : mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )* ;
    public final SqlParser.add_subexpr_return add_subexpr() throws RecognitionException {
        SqlParser.add_subexpr_return retval = new SqlParser.add_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set85=null;
        SqlParser.mul_subexpr_return mul_subexpr84 = null;

        SqlParser.mul_subexpr_return mul_subexpr86 = null;


        Object set85_tree=null;

        try {
            // SqlParser.g:124:12: ( mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )* )
            // SqlParser.g:124:14: mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mul_subexpr_in_add_subexpr816);
            mul_subexpr84=mul_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, mul_subexpr84.getTree());
            // SqlParser.g:124:26: ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=ASTERISK && LA24_0<=PERCENT)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // SqlParser.g:124:27: ( ASTERISK | SLASH | PERCENT ) mul_subexpr
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

            	    pushFollow(FOLLOW_mul_subexpr_in_add_subexpr832);
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
    // SqlParser.g:126:1: mul_subexpr : con_subexpr ( DOUBLE_PIPE con_subexpr )* ;
    public final SqlParser.mul_subexpr_return mul_subexpr() throws RecognitionException {
        SqlParser.mul_subexpr_return retval = new SqlParser.mul_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOUBLE_PIPE88=null;
        SqlParser.con_subexpr_return con_subexpr87 = null;

        SqlParser.con_subexpr_return con_subexpr89 = null;


        Object DOUBLE_PIPE88_tree=null;

        try {
            // SqlParser.g:126:12: ( con_subexpr ( DOUBLE_PIPE con_subexpr )* )
            // SqlParser.g:126:14: con_subexpr ( DOUBLE_PIPE con_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_con_subexpr_in_mul_subexpr841);
            con_subexpr87=con_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, con_subexpr87.getTree());
            // SqlParser.g:126:26: ( DOUBLE_PIPE con_subexpr )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==DOUBLE_PIPE) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // SqlParser.g:126:27: DOUBLE_PIPE con_subexpr
            	    {
            	    DOUBLE_PIPE88=(Token)match(input,DOUBLE_PIPE,FOLLOW_DOUBLE_PIPE_in_mul_subexpr844); 
            	    DOUBLE_PIPE88_tree = (Object)adaptor.create(DOUBLE_PIPE88);
            	    root_0 = (Object)adaptor.becomeRoot(DOUBLE_PIPE88_tree, root_0);

            	    pushFollow(FOLLOW_con_subexpr_in_mul_subexpr847);
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
    // SqlParser.g:128:1: con_subexpr : ( PLUS | MINUS | TILDA | NOT )? unary_subexpr ;
    public final SqlParser.con_subexpr_return con_subexpr() throws RecognitionException {
        SqlParser.con_subexpr_return retval = new SqlParser.con_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set90=null;
        SqlParser.unary_subexpr_return unary_subexpr91 = null;


        Object set90_tree=null;

        try {
            // SqlParser.g:128:12: ( ( PLUS | MINUS | TILDA | NOT )? unary_subexpr )
            // SqlParser.g:128:14: ( PLUS | MINUS | TILDA | NOT )? unary_subexpr
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:128:14: ( PLUS | MINUS | TILDA | NOT )?
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

            pushFollow(FOLLOW_unary_subexpr_in_con_subexpr873);
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
    // SqlParser.g:130:1: unary_subexpr : atom_expr ( COLLATE collation_name= ID )? ;
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
            // SqlParser.g:130:14: ( atom_expr ( COLLATE collation_name= ID )? )
            // SqlParser.g:130:16: atom_expr ( COLLATE collation_name= ID )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atom_expr_in_unary_subexpr880);
            atom_expr92=atom_expr();

            state._fsp--;

            adaptor.addChild(root_0, atom_expr92.getTree());
            // SqlParser.g:130:26: ( COLLATE collation_name= ID )?
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
                    // SqlParser.g:130:27: COLLATE collation_name= ID
                    {
                    COLLATE93=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_unary_subexpr883); 
                    COLLATE93_tree = (Object)adaptor.create(COLLATE93);
                    root_0 = (Object)adaptor.becomeRoot(COLLATE93_tree, root_0);

                    collation_name=(Token)match(input,ID,FOLLOW_ID_in_unary_subexpr888); 
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
    // SqlParser.g:132:1: atom_expr : ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) | name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN -> ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? ) | LPAREN expr RPAREN | CAST LPAREN expr AS type_name RPAREN | CASE (case_expr= expr )? ( when_expr )+ ( ELSE else_expr= expr )? END -> ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? ) | raise_function );
    public final SqlParser.atom_expr_return atom_expr() throws RecognitionException {
        SqlParser.atom_expr_return retval = new SqlParser.atom_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token column_name=null;
        Token name=null;
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
        Token CASE112=null;
        Token ELSE114=null;
        Token END115=null;
        List list_args=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.expr_return case_expr = null;

        SqlParser.expr_return else_expr = null;

        SqlParser.literal_value_return literal_value94 = null;

        SqlParser.bind_parameter_return bind_parameter95 = null;

        SqlParser.expr_return expr104 = null;

        SqlParser.expr_return expr108 = null;

        SqlParser.type_name_return type_name110 = null;

        SqlParser.when_expr_return when_expr113 = null;

        SqlParser.raise_function_return raise_function116 = null;

        SqlParser.expr_return args = null;
         args = null;
        Object column_name_tree=null;
        Object name_tree=null;
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
        Object CASE112_tree=null;
        Object ELSE114_tree=null;
        Object END115_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_DISTINCT=new RewriteRuleTokenStream(adaptor,"token DISTINCT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_CASE=new RewriteRuleTokenStream(adaptor,"token CASE");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_when_expr=new RewriteRuleSubtreeStream(adaptor,"rule when_expr");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // SqlParser.g:133:3: ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) | name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN -> ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? ) | LPAREN expr RPAREN | CAST LPAREN expr AS type_name RPAREN | CASE (case_expr= expr )? ( when_expr )+ ( ELSE else_expr= expr )? END -> ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? ) | raise_function )
            int alt36=8;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // SqlParser.g:133:5: literal_value
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_value_in_atom_expr900);
                    literal_value94=literal_value();

                    state._fsp--;

                    adaptor.addChild(root_0, literal_value94.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:134:5: bind_parameter
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_bind_parameter_in_atom_expr906);
                    bind_parameter95=bind_parameter();

                    state._fsp--;

                    adaptor.addChild(root_0, bind_parameter95.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:135:5: ( (database_name= id DOT )? table_name= id DOT )? column_name= ID
                    {
                    // SqlParser.g:135:5: ( (database_name= id DOT )? table_name= id DOT )?
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
                            // SqlParser.g:135:6: (database_name= id DOT )? table_name= id DOT
                            {
                            // SqlParser.g:135:6: (database_name= id DOT )?
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
                                    // SqlParser.g:135:7: database_name= id DOT
                                    {
                                    pushFollow(FOLLOW_id_in_atom_expr916);
                                    database_name=id();

                                    state._fsp--;

                                    stream_id.add(database_name.getTree());
                                    DOT96=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expr918);  
                                    stream_DOT.add(DOT96);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_id_in_atom_expr924);
                            table_name=id();

                            state._fsp--;

                            stream_id.add(table_name.getTree());
                            DOT97=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expr926);  
                            stream_DOT.add(DOT97);


                            }
                            break;

                    }

                    column_name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr932);  
                    stream_ID.add(column_name);



                    // AST REWRITE
                    // elements: column_name, table_name, database_name
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
                    // 135:65: -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) )
                    {
                        // SqlParser.g:135:68: ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMN_EXPRESSION, "COLUMN_EXPRESSION"), root_1);

                        // SqlParser.g:135:88: ^( $column_name ( ^( $table_name ( $database_name)? ) )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_column_name.nextNode(), root_2);

                        // SqlParser.g:135:103: ( ^( $table_name ( $database_name)? ) )?
                        if ( stream_table_name.hasNext()||stream_database_name.hasNext() ) {
                            // SqlParser.g:135:103: ^( $table_name ( $database_name)? )
                            {
                            Object root_3 = (Object)adaptor.nil();
                            root_3 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_3);

                            // SqlParser.g:135:117: ( $database_name)?
                            if ( stream_database_name.hasNext() ) {
                                adaptor.addChild(root_3, stream_database_name.nextTree());

                            }
                            stream_database_name.reset();

                            adaptor.addChild(root_2, root_3);
                            }

                        }
                        stream_table_name.reset();
                        stream_database_name.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // SqlParser.g:136:5: name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN
                    {
                    name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr961);  
                    stream_ID.add(name);

                    LPAREN98=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr963);  
                    stream_LPAREN.add(LPAREN98);

                    // SqlParser.g:136:20: ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )?
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
                            // SqlParser.g:136:21: ( DISTINCT )? args+= expr ( COMMA args+= expr )*
                            {
                            // SqlParser.g:136:21: ( DISTINCT )?
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
                                    // SqlParser.g:136:21: DISTINCT
                                    {
                                    DISTINCT99=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_atom_expr966);  
                                    stream_DISTINCT.add(DISTINCT99);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_expr_in_atom_expr971);
                            args=expr();

                            state._fsp--;

                            stream_expr.add(args.getTree());
                            if (list_args==null) list_args=new ArrayList();
                            list_args.add(args.getTree());

                            // SqlParser.g:136:42: ( COMMA args+= expr )*
                            loop31:
                            do {
                                int alt31=2;
                                int LA31_0 = input.LA(1);

                                if ( (LA31_0==COMMA) ) {
                                    alt31=1;
                                }


                                switch (alt31) {
                            	case 1 :
                            	    // SqlParser.g:136:43: COMMA args+= expr
                            	    {
                            	    COMMA100=(Token)match(input,COMMA,FOLLOW_COMMA_in_atom_expr974);  
                            	    stream_COMMA.add(COMMA100);

                            	    pushFollow(FOLLOW_expr_in_atom_expr978);
                            	    args=expr();

                            	    state._fsp--;

                            	    stream_expr.add(args.getTree());
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
                            // SqlParser.g:136:64: ASTERISK
                            {
                            ASTERISK101=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_atom_expr984);  
                            stream_ASTERISK.add(ASTERISK101);


                            }
                            break;

                    }

                    RPAREN102=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr988);  
                    stream_RPAREN.add(RPAREN102);



                    // AST REWRITE
                    // elements: DISTINCT, args, name, ASTERISK
                    // token labels: name
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: args
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"token args",list_args);
                    root_0 = (Object)adaptor.nil();
                    // 136:82: -> ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? )
                    {
                        // SqlParser.g:136:85: ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION_EXPRESSION, "FUNCTION_EXPRESSION"), root_1);

                        adaptor.addChild(root_1, stream_name.nextNode());
                        // SqlParser.g:136:113: ( DISTINCT )?
                        if ( stream_DISTINCT.hasNext() ) {
                            adaptor.addChild(root_1, stream_DISTINCT.nextNode());

                        }
                        stream_DISTINCT.reset();
                        // SqlParser.g:136:123: ( $args)*
                        while ( stream_args.hasNext() ) {
                            adaptor.addChild(root_1, stream_args.nextTree());

                        }
                        stream_args.reset();
                        // SqlParser.g:136:130: ( ASTERISK )?
                        if ( stream_ASTERISK.hasNext() ) {
                            adaptor.addChild(root_1, stream_ASTERISK.nextNode());

                        }
                        stream_ASTERISK.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // SqlParser.g:137:5: LPAREN expr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN103=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr1013); 
                    pushFollow(FOLLOW_expr_in_atom_expr1016);
                    expr104=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr104.getTree());
                    RPAREN105=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr1018); 

                    }
                    break;
                case 6 :
                    // SqlParser.g:138:5: CAST LPAREN expr AS type_name RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    CAST106=(Token)match(input,CAST,FOLLOW_CAST_in_atom_expr1025); 
                    CAST106_tree = (Object)adaptor.create(CAST106);
                    root_0 = (Object)adaptor.becomeRoot(CAST106_tree, root_0);

                    LPAREN107=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr1028); 
                    pushFollow(FOLLOW_expr_in_atom_expr1031);
                    expr108=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr108.getTree());
                    AS109=(Token)match(input,AS,FOLLOW_AS_in_atom_expr1033); 
                    pushFollow(FOLLOW_type_name_in_atom_expr1036);
                    type_name110=type_name();

                    state._fsp--;

                    adaptor.addChild(root_0, type_name110.getTree());
                    RPAREN111=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr1038); 

                    }
                    break;
                case 7 :
                    // SqlParser.g:141:5: CASE (case_expr= expr )? ( when_expr )+ ( ELSE else_expr= expr )? END
                    {
                    CASE112=(Token)match(input,CASE,FOLLOW_CASE_in_atom_expr1047);  
                    stream_CASE.add(CASE112);

                    // SqlParser.g:141:10: (case_expr= expr )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=PLUS && LA33_0<=TILDA)||LA33_0==LPAREN||(LA33_0>=QUESTION && LA33_0<=AT)||(LA33_0>=ABORT && LA33_0<=FROM)||(LA33_0>=GROUP && LA33_0<=IMMEDIATE)||(LA33_0>=INDEX && LA33_0<=IS)||(LA33_0>=JOIN && LA33_0<=LEFT)||LA33_0==LIMIT||(LA33_0>=NATURAL && LA33_0<=NOT)||(LA33_0>=NULL && LA33_0<=REFERENCES)||(LA33_0>=REINDEX && LA33_0<=VIRTUAL)||LA33_0==WHERE||(LA33_0>=ID && LA33_0<=INTEGER)||(LA33_0>=FLOAT && LA33_0<=BLOB)) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==WHEN) ) {
                        int LA33_2 = input.LA(2);

                        if ( (LA33_2==DOT) ) {
                            alt33=1;
                        }
                    }
                    switch (alt33) {
                        case 1 :
                            // SqlParser.g:141:11: case_expr= expr
                            {
                            pushFollow(FOLLOW_expr_in_atom_expr1052);
                            case_expr=expr();

                            state._fsp--;

                            stream_expr.add(case_expr.getTree());

                            }
                            break;

                    }

                    // SqlParser.g:141:28: ( when_expr )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==WHEN) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // SqlParser.g:141:28: when_expr
                    	    {
                    	    pushFollow(FOLLOW_when_expr_in_atom_expr1056);
                    	    when_expr113=when_expr();

                    	    state._fsp--;

                    	    stream_when_expr.add(when_expr113.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);

                    // SqlParser.g:141:39: ( ELSE else_expr= expr )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==ELSE) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // SqlParser.g:141:40: ELSE else_expr= expr
                            {
                            ELSE114=(Token)match(input,ELSE,FOLLOW_ELSE_in_atom_expr1060);  
                            stream_ELSE.add(ELSE114);

                            pushFollow(FOLLOW_expr_in_atom_expr1064);
                            else_expr=expr();

                            state._fsp--;

                            stream_expr.add(else_expr.getTree());

                            }
                            break;

                    }

                    END115=(Token)match(input,END,FOLLOW_END_in_atom_expr1068);  
                    stream_END.add(END115);



                    // AST REWRITE
                    // elements: when_expr, CASE, case_expr, else_expr
                    // token labels: 
                    // rule labels: retval, case_expr, else_expr
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_case_expr=new RewriteRuleSubtreeStream(adaptor,"rule case_expr",case_expr!=null?case_expr.tree:null);
                    RewriteRuleSubtreeStream stream_else_expr=new RewriteRuleSubtreeStream(adaptor,"rule else_expr",else_expr!=null?else_expr.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 141:66: -> ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? )
                    {
                        // SqlParser.g:141:69: ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CASE.nextNode(), root_1);

                        // SqlParser.g:141:76: ( $case_expr)?
                        if ( stream_case_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_case_expr.nextTree());

                        }
                        stream_case_expr.reset();
                        if ( !(stream_when_expr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_when_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_when_expr.nextTree());

                        }
                        stream_when_expr.reset();
                        // SqlParser.g:141:99: ( $else_expr)?
                        if ( stream_else_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_else_expr.nextTree());

                        }
                        stream_else_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // SqlParser.g:142:5: raise_function
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_raise_function_in_atom_expr1091);
                    raise_function116=raise_function();

                    state._fsp--;

                    adaptor.addChild(root_0, raise_function116.getTree());

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

    public static class when_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "when_expr"
    // SqlParser.g:145:1: when_expr : WHEN e1= expr THEN e2= expr -> ^( WHEN $e1 $e2) ;
    public final SqlParser.when_expr_return when_expr() throws RecognitionException {
        SqlParser.when_expr_return retval = new SqlParser.when_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHEN117=null;
        Token THEN118=null;
        SqlParser.expr_return e1 = null;

        SqlParser.expr_return e2 = null;


        Object WHEN117_tree=null;
        Object THEN118_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_WHEN=new RewriteRuleTokenStream(adaptor,"token WHEN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // SqlParser.g:145:10: ( WHEN e1= expr THEN e2= expr -> ^( WHEN $e1 $e2) )
            // SqlParser.g:145:12: WHEN e1= expr THEN e2= expr
            {
            WHEN117=(Token)match(input,WHEN,FOLLOW_WHEN_in_when_expr1101);  
            stream_WHEN.add(WHEN117);

            pushFollow(FOLLOW_expr_in_when_expr1105);
            e1=expr();

            state._fsp--;

            stream_expr.add(e1.getTree());
            THEN118=(Token)match(input,THEN,FOLLOW_THEN_in_when_expr1107);  
            stream_THEN.add(THEN118);

            pushFollow(FOLLOW_expr_in_when_expr1111);
            e2=expr();

            state._fsp--;

            stream_expr.add(e2.getTree());


            // AST REWRITE
            // elements: e1, WHEN, e2
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
            // 145:38: -> ^( WHEN $e1 $e2)
            {
                // SqlParser.g:145:41: ^( WHEN $e1 $e2)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_WHEN.nextNode(), root_1);

                adaptor.addChild(root_1, stream_e1.nextTree());
                adaptor.addChild(root_1, stream_e2.nextTree());

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
    // $ANTLR end "when_expr"

    public static class literal_value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal_value"
    // SqlParser.g:147:1: literal_value : ( INTEGER -> ^( INTEGER_LITERAL INTEGER ) | FLOAT -> ^( FLOAT_LITERAL FLOAT ) | STRING -> ^( STRING_LITERAL STRING ) | BLOB -> ^( BLOB_LITERAL BLOB ) | NULL | CURRENT_TIME -> ^( FUNCTION_LITERAL CURRENT_TIME ) | CURRENT_DATE -> ^( FUNCTION_LITERAL CURRENT_DATE ) | CURRENT_TIMESTAMP -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP ) );
    public final SqlParser.literal_value_return literal_value() throws RecognitionException {
        SqlParser.literal_value_return retval = new SqlParser.literal_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INTEGER119=null;
        Token FLOAT120=null;
        Token STRING121=null;
        Token BLOB122=null;
        Token NULL123=null;
        Token CURRENT_TIME124=null;
        Token CURRENT_DATE125=null;
        Token CURRENT_TIMESTAMP126=null;

        Object INTEGER119_tree=null;
        Object FLOAT120_tree=null;
        Object STRING121_tree=null;
        Object BLOB122_tree=null;
        Object NULL123_tree=null;
        Object CURRENT_TIME124_tree=null;
        Object CURRENT_DATE125_tree=null;
        Object CURRENT_TIMESTAMP126_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_BLOB=new RewriteRuleTokenStream(adaptor,"token BLOB");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_CURRENT_TIMESTAMP=new RewriteRuleTokenStream(adaptor,"token CURRENT_TIMESTAMP");
        RewriteRuleTokenStream stream_CURRENT_DATE=new RewriteRuleTokenStream(adaptor,"token CURRENT_DATE");
        RewriteRuleTokenStream stream_CURRENT_TIME=new RewriteRuleTokenStream(adaptor,"token CURRENT_TIME");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // SqlParser.g:148:3: ( INTEGER -> ^( INTEGER_LITERAL INTEGER ) | FLOAT -> ^( FLOAT_LITERAL FLOAT ) | STRING -> ^( STRING_LITERAL STRING ) | BLOB -> ^( BLOB_LITERAL BLOB ) | NULL | CURRENT_TIME -> ^( FUNCTION_LITERAL CURRENT_TIME ) | CURRENT_DATE -> ^( FUNCTION_LITERAL CURRENT_DATE ) | CURRENT_TIMESTAMP -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP ) )
            int alt37=8;
            switch ( input.LA(1) ) {
            case INTEGER:
                {
                alt37=1;
                }
                break;
            case FLOAT:
                {
                alt37=2;
                }
                break;
            case STRING:
                {
                alt37=3;
                }
                break;
            case BLOB:
                {
                alt37=4;
                }
                break;
            case NULL:
                {
                alt37=5;
                }
                break;
            case CURRENT_TIME:
                {
                alt37=6;
                }
                break;
            case CURRENT_DATE:
                {
                alt37=7;
                }
                break;
            case CURRENT_TIMESTAMP:
                {
                alt37=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // SqlParser.g:148:5: INTEGER
                    {
                    INTEGER119=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_literal_value1133);  
                    stream_INTEGER.add(INTEGER119);



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
                    // 148:13: -> ^( INTEGER_LITERAL INTEGER )
                    {
                        // SqlParser.g:148:16: ^( INTEGER_LITERAL INTEGER )
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
                    // SqlParser.g:149:5: FLOAT
                    {
                    FLOAT120=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_literal_value1147);  
                    stream_FLOAT.add(FLOAT120);



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
                    // 149:11: -> ^( FLOAT_LITERAL FLOAT )
                    {
                        // SqlParser.g:149:14: ^( FLOAT_LITERAL FLOAT )
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
                    // SqlParser.g:150:5: STRING
                    {
                    STRING121=(Token)match(input,STRING,FOLLOW_STRING_in_literal_value1161);  
                    stream_STRING.add(STRING121);



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
                    // 150:12: -> ^( STRING_LITERAL STRING )
                    {
                        // SqlParser.g:150:15: ^( STRING_LITERAL STRING )
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
                    // SqlParser.g:151:5: BLOB
                    {
                    BLOB122=(Token)match(input,BLOB,FOLLOW_BLOB_in_literal_value1175);  
                    stream_BLOB.add(BLOB122);



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
                    // 151:10: -> ^( BLOB_LITERAL BLOB )
                    {
                        // SqlParser.g:151:13: ^( BLOB_LITERAL BLOB )
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
                    // SqlParser.g:152:5: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL123=(Token)match(input,NULL,FOLLOW_NULL_in_literal_value1189); 
                    NULL123_tree = (Object)adaptor.create(NULL123);
                    adaptor.addChild(root_0, NULL123_tree);


                    }
                    break;
                case 6 :
                    // SqlParser.g:153:5: CURRENT_TIME
                    {
                    CURRENT_TIME124=(Token)match(input,CURRENT_TIME,FOLLOW_CURRENT_TIME_in_literal_value1195);  
                    stream_CURRENT_TIME.add(CURRENT_TIME124);



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
                    // 153:18: -> ^( FUNCTION_LITERAL CURRENT_TIME )
                    {
                        // SqlParser.g:153:21: ^( FUNCTION_LITERAL CURRENT_TIME )
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
                    // SqlParser.g:154:5: CURRENT_DATE
                    {
                    CURRENT_DATE125=(Token)match(input,CURRENT_DATE,FOLLOW_CURRENT_DATE_in_literal_value1209);  
                    stream_CURRENT_DATE.add(CURRENT_DATE125);



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
                    // 154:18: -> ^( FUNCTION_LITERAL CURRENT_DATE )
                    {
                        // SqlParser.g:154:21: ^( FUNCTION_LITERAL CURRENT_DATE )
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
                    // SqlParser.g:155:5: CURRENT_TIMESTAMP
                    {
                    CURRENT_TIMESTAMP126=(Token)match(input,CURRENT_TIMESTAMP,FOLLOW_CURRENT_TIMESTAMP_in_literal_value1223);  
                    stream_CURRENT_TIMESTAMP.add(CURRENT_TIMESTAMP126);



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
                    // 155:23: -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP )
                    {
                        // SqlParser.g:155:26: ^( FUNCTION_LITERAL CURRENT_TIMESTAMP )
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
    // SqlParser.g:158:1: bind_parameter : ( QUESTION -> BIND | QUESTION position= INTEGER -> ^( BIND $position) | COLON name= id -> ^( BIND_NAME $name) | AT name= id -> ^( BIND_NAME $name) );
    public final SqlParser.bind_parameter_return bind_parameter() throws RecognitionException {
        SqlParser.bind_parameter_return retval = new SqlParser.bind_parameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token position=null;
        Token QUESTION127=null;
        Token QUESTION128=null;
        Token COLON129=null;
        Token AT130=null;
        SqlParser.id_return name = null;


        Object position_tree=null;
        Object QUESTION127_tree=null;
        Object QUESTION128_tree=null;
        Object COLON129_tree=null;
        Object AT130_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // SqlParser.g:159:3: ( QUESTION -> BIND | QUESTION position= INTEGER -> ^( BIND $position) | COLON name= id -> ^( BIND_NAME $name) | AT name= id -> ^( BIND_NAME $name) )
            int alt38=4;
            switch ( input.LA(1) ) {
            case QUESTION:
                {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==INTEGER) ) {
                    alt38=2;
                }
                else if ( ((LA38_1>=EQUALS && LA38_1<=MINUS)||(LA38_1>=ASTERISK && LA38_1<=SEMI)||LA38_1==COMMA||LA38_1==RPAREN||(LA38_1>=ABORT && LA38_1<=WHERE)||LA38_1==ID) ) {
                    alt38=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
                }
                break;
            case COLON:
                {
                alt38=3;
                }
                break;
            case AT:
                {
                alt38=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // SqlParser.g:159:5: QUESTION
                    {
                    QUESTION127=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_bind_parameter1244);  
                    stream_QUESTION.add(QUESTION127);



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
                    // 159:14: -> BIND
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(BIND, "BIND"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // SqlParser.g:160:5: QUESTION position= INTEGER
                    {
                    QUESTION128=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_bind_parameter1254);  
                    stream_QUESTION.add(QUESTION128);

                    position=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_bind_parameter1258);  
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
                    // 160:31: -> ^( BIND $position)
                    {
                        // SqlParser.g:160:34: ^( BIND $position)
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
                    // SqlParser.g:161:5: COLON name= id
                    {
                    COLON129=(Token)match(input,COLON,FOLLOW_COLON_in_bind_parameter1273);  
                    stream_COLON.add(COLON129);

                    pushFollow(FOLLOW_id_in_bind_parameter1277);
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
                    // 161:19: -> ^( BIND_NAME $name)
                    {
                        // SqlParser.g:161:22: ^( BIND_NAME $name)
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
                    // SqlParser.g:162:5: AT name= id
                    {
                    AT130=(Token)match(input,AT,FOLLOW_AT_in_bind_parameter1292);  
                    stream_AT.add(AT130);

                    pushFollow(FOLLOW_id_in_bind_parameter1296);
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
                    // 162:16: -> ^( BIND_NAME $name)
                    {
                        // SqlParser.g:162:19: ^( BIND_NAME $name)
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
    // SqlParser.g:167:1: raise_function : RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN ;
    public final SqlParser.raise_function_return raise_function() throws RecognitionException {
        SqlParser.raise_function_return retval = new SqlParser.raise_function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token error_message=null;
        Token RAISE131=null;
        Token LPAREN132=null;
        Token IGNORE133=null;
        Token set134=null;
        Token COMMA135=null;
        Token RPAREN136=null;

        Object error_message_tree=null;
        Object RAISE131_tree=null;
        Object LPAREN132_tree=null;
        Object IGNORE133_tree=null;
        Object set134_tree=null;
        Object COMMA135_tree=null;
        Object RPAREN136_tree=null;

        try {
            // SqlParser.g:167:15: ( RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN )
            // SqlParser.g:167:17: RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN
            {
            root_0 = (Object)adaptor.nil();

            RAISE131=(Token)match(input,RAISE,FOLLOW_RAISE_in_raise_function1317); 
            RAISE131_tree = (Object)adaptor.create(RAISE131);
            root_0 = (Object)adaptor.becomeRoot(RAISE131_tree, root_0);

            LPAREN132=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_raise_function1320); 
            // SqlParser.g:167:32: ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==IGNORE) ) {
                alt39=1;
            }
            else if ( (LA39_0==ABORT||LA39_0==FAIL||LA39_0==ROLLBACK) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // SqlParser.g:167:33: IGNORE
                    {
                    IGNORE133=(Token)match(input,IGNORE,FOLLOW_IGNORE_in_raise_function1324); 
                    IGNORE133_tree = (Object)adaptor.create(IGNORE133);
                    adaptor.addChild(root_0, IGNORE133_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:167:42: ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING
                    {
                    set134=(Token)input.LT(1);
                    if ( input.LA(1)==ABORT||input.LA(1)==FAIL||input.LA(1)==ROLLBACK ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set134));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    COMMA135=(Token)match(input,COMMA,FOLLOW_COMMA_in_raise_function1340); 
                    error_message=(Token)match(input,STRING,FOLLOW_STRING_in_raise_function1345); 
                    error_message_tree = (Object)adaptor.create(error_message);
                    adaptor.addChild(root_0, error_message_tree);


                    }
                    break;

            }

            RPAREN136=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_raise_function1348); 

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
    // SqlParser.g:169:1: type_name : (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )? -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ ) ;
    public final SqlParser.type_name_return type_name() throws RecognitionException {
        SqlParser.type_name_return retval = new SqlParser.type_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN137=null;
        Token COMMA138=null;
        Token RPAREN139=null;
        Token names=null;
        List list_names=null;
        SqlParser.signed_number_return size1 = null;

        SqlParser.signed_number_return size2 = null;


        Object LPAREN137_tree=null;
        Object COMMA138_tree=null;
        Object RPAREN139_tree=null;
        Object names_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_signed_number=new RewriteRuleSubtreeStream(adaptor,"rule signed_number");
        try {
            // SqlParser.g:169:10: ( (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )? -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ ) )
            // SqlParser.g:169:12: (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )?
            {
            // SqlParser.g:169:17: (names+= ID )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==ID) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // SqlParser.g:169:17: names+= ID
            	    {
            	    names=(Token)match(input,ID,FOLLOW_ID_in_type_name1358);  
            	    stream_ID.add(names);

            	    if (list_names==null) list_names=new ArrayList();
            	    list_names.add(names);


            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);

            // SqlParser.g:169:23: ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==LPAREN) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // SqlParser.g:169:24: LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN
                    {
                    LPAREN137=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_type_name1362);  
                    stream_LPAREN.add(LPAREN137);

                    pushFollow(FOLLOW_signed_number_in_type_name1366);
                    size1=signed_number();

                    state._fsp--;

                    stream_signed_number.add(size1.getTree());
                    // SqlParser.g:169:51: ( COMMA size2= signed_number )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==COMMA) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // SqlParser.g:169:52: COMMA size2= signed_number
                            {
                            COMMA138=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_name1369);  
                            stream_COMMA.add(COMMA138);

                            pushFollow(FOLLOW_signed_number_in_type_name1373);
                            size2=signed_number();

                            state._fsp--;

                            stream_signed_number.add(size2.getTree());

                            }
                            break;

                    }

                    RPAREN139=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_type_name1377);  
                    stream_RPAREN.add(RPAREN139);


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
            // 170:1: -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ )
            {
                // SqlParser.g:170:4: ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_1);

                // SqlParser.g:170:11: ^( TYPE_PARAMS ( $size1)? ( $size2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE_PARAMS, "TYPE_PARAMS"), root_2);

                // SqlParser.g:170:25: ( $size1)?
                if ( stream_size1.hasNext() ) {
                    adaptor.addChild(root_2, stream_size1.nextTree());

                }
                stream_size1.reset();
                // SqlParser.g:170:33: ( $size2)?
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
    // SqlParser.g:173:1: pragma_stmt : PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )? ;
    public final SqlParser.pragma_stmt_return pragma_stmt() throws RecognitionException {
        SqlParser.pragma_stmt_return retval = new SqlParser.pragma_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRAGMA140=null;
        Token DOT141=null;
        Token EQUALS142=null;
        Token LPAREN144=null;
        Token RPAREN146=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return pragma_name = null;

        SqlParser.pragma_value_return pragma_value143 = null;

        SqlParser.pragma_value_return pragma_value145 = null;


        Object PRAGMA140_tree=null;
        Object DOT141_tree=null;
        Object EQUALS142_tree=null;
        Object LPAREN144_tree=null;
        Object RPAREN146_tree=null;

        try {
            // SqlParser.g:173:12: ( PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )? )
            // SqlParser.g:173:14: PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            PRAGMA140=(Token)match(input,PRAGMA,FOLLOW_PRAGMA_in_pragma_stmt1409); 
            PRAGMA140_tree = (Object)adaptor.create(PRAGMA140);
            adaptor.addChild(root_0, PRAGMA140_tree);

            // SqlParser.g:173:21: (database_name= id DOT )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==ID) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==DOT) ) {
                    alt43=1;
                }
            }
            else if ( ((LA43_0>=ABORT && LA43_0<=FROM)||(LA43_0>=GROUP && LA43_0<=IMMEDIATE)||(LA43_0>=INDEX && LA43_0<=IS)||(LA43_0>=JOIN && LA43_0<=LEFT)||LA43_0==LIMIT||LA43_0==NATURAL||(LA43_0>=NULL && LA43_0<=REFERENCES)||(LA43_0>=REINDEX && LA43_0<=WHERE)) ) {
                int LA43_2 = input.LA(2);

                if ( (LA43_2==DOT) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // SqlParser.g:173:22: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_pragma_stmt1414);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT141=(Token)match(input,DOT,FOLLOW_DOT_in_pragma_stmt1416); 
                    DOT141_tree = (Object)adaptor.create(DOT141);
                    adaptor.addChild(root_0, DOT141_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_pragma_stmt1422);
            pragma_name=id();

            state._fsp--;

            adaptor.addChild(root_0, pragma_name.getTree());
            // SqlParser.g:173:60: ( EQUALS pragma_value | LPAREN pragma_value RPAREN )?
            int alt44=3;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==EQUALS) ) {
                alt44=1;
            }
            else if ( (LA44_0==LPAREN) ) {
                alt44=2;
            }
            switch (alt44) {
                case 1 :
                    // SqlParser.g:173:61: EQUALS pragma_value
                    {
                    EQUALS142=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_pragma_stmt1425); 
                    EQUALS142_tree = (Object)adaptor.create(EQUALS142);
                    adaptor.addChild(root_0, EQUALS142_tree);

                    pushFollow(FOLLOW_pragma_value_in_pragma_stmt1427);
                    pragma_value143=pragma_value();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_value143.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:173:83: LPAREN pragma_value RPAREN
                    {
                    LPAREN144=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_pragma_stmt1431); 
                    LPAREN144_tree = (Object)adaptor.create(LPAREN144);
                    adaptor.addChild(root_0, LPAREN144_tree);

                    pushFollow(FOLLOW_pragma_value_in_pragma_stmt1433);
                    pragma_value145=pragma_value();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_value145.getTree());
                    RPAREN146=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_pragma_stmt1435); 
                    RPAREN146_tree = (Object)adaptor.create(RPAREN146);
                    adaptor.addChild(root_0, RPAREN146_tree);


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
    // SqlParser.g:175:1: pragma_value : ( signed_number | name= id | STRING );
    public final SqlParser.pragma_value_return pragma_value() throws RecognitionException {
        SqlParser.pragma_value_return retval = new SqlParser.pragma_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING148=null;
        SqlParser.id_return name = null;

        SqlParser.signed_number_return signed_number147 = null;


        Object STRING148_tree=null;

        try {
            // SqlParser.g:175:13: ( signed_number | name= id | STRING )
            int alt45=3;
            switch ( input.LA(1) ) {
            case PLUS:
            case MINUS:
            case INTEGER:
            case FLOAT:
                {
                alt45=1;
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
                alt45=2;
                }
                break;
            case STRING:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // SqlParser.g:175:15: signed_number
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_signed_number_in_pragma_value1444);
                    signed_number147=signed_number();

                    state._fsp--;

                    adaptor.addChild(root_0, signed_number147.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:175:31: name= id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_in_pragma_value1450);
                    name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, name.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:175:41: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING148=(Token)match(input,STRING,FOLLOW_STRING_in_pragma_value1454); 
                    STRING148_tree = (Object)adaptor.create(STRING148);
                    adaptor.addChild(root_0, STRING148_tree);


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
    // SqlParser.g:178:1: attach_stmt : ATTACH ( DATABASE )? filename= ( STRING | id ) AS database_name= id ;
    public final SqlParser.attach_stmt_return attach_stmt() throws RecognitionException {
        SqlParser.attach_stmt_return retval = new SqlParser.attach_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token filename=null;
        Token ATTACH149=null;
        Token DATABASE150=null;
        Token STRING151=null;
        Token AS153=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return id152 = null;


        Object filename_tree=null;
        Object ATTACH149_tree=null;
        Object DATABASE150_tree=null;
        Object STRING151_tree=null;
        Object AS153_tree=null;

        try {
            // SqlParser.g:178:12: ( ATTACH ( DATABASE )? filename= ( STRING | id ) AS database_name= id )
            // SqlParser.g:178:14: ATTACH ( DATABASE )? filename= ( STRING | id ) AS database_name= id
            {
            root_0 = (Object)adaptor.nil();

            ATTACH149=(Token)match(input,ATTACH,FOLLOW_ATTACH_in_attach_stmt1462); 
            ATTACH149_tree = (Object)adaptor.create(ATTACH149);
            adaptor.addChild(root_0, ATTACH149_tree);

            // SqlParser.g:178:21: ( DATABASE )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==DATABASE) ) {
                int LA46_1 = input.LA(2);

                if ( ((LA46_1>=ABORT && LA46_1<=AND)||(LA46_1>=ASC && LA46_1<=FROM)||(LA46_1>=GROUP && LA46_1<=IMMEDIATE)||(LA46_1>=INDEX && LA46_1<=IS)||(LA46_1>=JOIN && LA46_1<=LEFT)||LA46_1==LIMIT||LA46_1==NATURAL||(LA46_1>=NULL && LA46_1<=REFERENCES)||(LA46_1>=REINDEX && LA46_1<=WHERE)||(LA46_1>=ID && LA46_1<=STRING)) ) {
                    alt46=1;
                }
                else if ( (LA46_1==AS) ) {
                    int LA46_4 = input.LA(3);

                    if ( (LA46_4==AS) ) {
                        int LA46_5 = input.LA(4);

                        if ( ((LA46_5>=ABORT && LA46_5<=FROM)||(LA46_5>=GROUP && LA46_5<=IMMEDIATE)||(LA46_5>=INDEX && LA46_5<=IS)||(LA46_5>=JOIN && LA46_5<=LEFT)||LA46_5==LIMIT||LA46_5==NATURAL||(LA46_5>=NULL && LA46_5<=REFERENCES)||(LA46_5>=REINDEX && LA46_5<=WHERE)||LA46_5==ID) ) {
                            alt46=1;
                        }
                    }
                }
            }
            switch (alt46) {
                case 1 :
                    // SqlParser.g:178:22: DATABASE
                    {
                    DATABASE150=(Token)match(input,DATABASE,FOLLOW_DATABASE_in_attach_stmt1465); 
                    DATABASE150_tree = (Object)adaptor.create(DATABASE150);
                    adaptor.addChild(root_0, DATABASE150_tree);


                    }
                    break;

            }

            // SqlParser.g:178:42: ( STRING | id )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==STRING) ) {
                alt47=1;
            }
            else if ( ((LA47_0>=ABORT && LA47_0<=FROM)||(LA47_0>=GROUP && LA47_0<=IMMEDIATE)||(LA47_0>=INDEX && LA47_0<=IS)||(LA47_0>=JOIN && LA47_0<=LEFT)||LA47_0==LIMIT||LA47_0==NATURAL||(LA47_0>=NULL && LA47_0<=REFERENCES)||(LA47_0>=REINDEX && LA47_0<=WHERE)||LA47_0==ID) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // SqlParser.g:178:43: STRING
                    {
                    STRING151=(Token)match(input,STRING,FOLLOW_STRING_in_attach_stmt1472); 
                    STRING151_tree = (Object)adaptor.create(STRING151);
                    adaptor.addChild(root_0, STRING151_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:178:52: id
                    {
                    pushFollow(FOLLOW_id_in_attach_stmt1476);
                    id152=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id152.getTree());

                    }
                    break;

            }

            AS153=(Token)match(input,AS,FOLLOW_AS_in_attach_stmt1479); 
            AS153_tree = (Object)adaptor.create(AS153);
            adaptor.addChild(root_0, AS153_tree);

            pushFollow(FOLLOW_id_in_attach_stmt1483);
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
    // SqlParser.g:181:1: detach_stmt : DETACH ( DATABASE )? database_name= id ;
    public final SqlParser.detach_stmt_return detach_stmt() throws RecognitionException {
        SqlParser.detach_stmt_return retval = new SqlParser.detach_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DETACH154=null;
        Token DATABASE155=null;
        SqlParser.id_return database_name = null;


        Object DETACH154_tree=null;
        Object DATABASE155_tree=null;

        try {
            // SqlParser.g:181:12: ( DETACH ( DATABASE )? database_name= id )
            // SqlParser.g:181:14: DETACH ( DATABASE )? database_name= id
            {
            root_0 = (Object)adaptor.nil();

            DETACH154=(Token)match(input,DETACH,FOLLOW_DETACH_in_detach_stmt1491); 
            DETACH154_tree = (Object)adaptor.create(DETACH154);
            adaptor.addChild(root_0, DETACH154_tree);

            // SqlParser.g:181:21: ( DATABASE )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==DATABASE) ) {
                int LA48_1 = input.LA(2);

                if ( ((LA48_1>=ABORT && LA48_1<=FROM)||(LA48_1>=GROUP && LA48_1<=IMMEDIATE)||(LA48_1>=INDEX && LA48_1<=IS)||(LA48_1>=JOIN && LA48_1<=LEFT)||LA48_1==LIMIT||LA48_1==NATURAL||(LA48_1>=NULL && LA48_1<=REFERENCES)||(LA48_1>=REINDEX && LA48_1<=WHERE)||LA48_1==ID) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // SqlParser.g:181:22: DATABASE
                    {
                    DATABASE155=(Token)match(input,DATABASE,FOLLOW_DATABASE_in_detach_stmt1494); 
                    DATABASE155_tree = (Object)adaptor.create(DATABASE155);
                    adaptor.addChild(root_0, DATABASE155_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_detach_stmt1500);
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
    // SqlParser.g:184:1: analyze_stmt : ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )? ;
    public final SqlParser.analyze_stmt_return analyze_stmt() throws RecognitionException {
        SqlParser.analyze_stmt_return retval = new SqlParser.analyze_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ANALYZE156=null;
        Token DOT157=null;
        SqlParser.id_return database_or_table_name = null;

        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;


        Object ANALYZE156_tree=null;
        Object DOT157_tree=null;

        try {
            // SqlParser.g:184:13: ( ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )? )
            // SqlParser.g:184:15: ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )?
            {
            root_0 = (Object)adaptor.nil();

            ANALYZE156=(Token)match(input,ANALYZE,FOLLOW_ANALYZE_in_analyze_stmt1508); 
            ANALYZE156_tree = (Object)adaptor.create(ANALYZE156);
            adaptor.addChild(root_0, ANALYZE156_tree);

            // SqlParser.g:184:23: (database_or_table_name= id | database_name= id DOT table_name= id )?
            int alt49=3;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==ID) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==DOT) ) {
                    alt49=2;
                }
                else if ( (LA49_1==SEMI) ) {
                    alt49=1;
                }
            }
            else if ( ((LA49_0>=ABORT && LA49_0<=FROM)||(LA49_0>=GROUP && LA49_0<=IMMEDIATE)||(LA49_0>=INDEX && LA49_0<=IS)||(LA49_0>=JOIN && LA49_0<=LEFT)||LA49_0==LIMIT||LA49_0==NATURAL||(LA49_0>=NULL && LA49_0<=REFERENCES)||(LA49_0>=REINDEX && LA49_0<=WHERE)) ) {
                int LA49_2 = input.LA(2);

                if ( (LA49_2==DOT) ) {
                    alt49=2;
                }
                else if ( (LA49_2==SEMI) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // SqlParser.g:184:24: database_or_table_name= id
                    {
                    pushFollow(FOLLOW_id_in_analyze_stmt1513);
                    database_or_table_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_or_table_name.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:184:52: database_name= id DOT table_name= id
                    {
                    pushFollow(FOLLOW_id_in_analyze_stmt1519);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT157=(Token)match(input,DOT,FOLLOW_DOT_in_analyze_stmt1521); 
                    DOT157_tree = (Object)adaptor.create(DOT157);
                    adaptor.addChild(root_0, DOT157_tree);

                    pushFollow(FOLLOW_id_in_analyze_stmt1525);
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
    // SqlParser.g:187:1: reindex_stmt : REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id ;
    public final SqlParser.reindex_stmt_return reindex_stmt() throws RecognitionException {
        SqlParser.reindex_stmt_return retval = new SqlParser.reindex_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REINDEX158=null;
        Token DOT159=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return collation_or_table_or_index_name = null;


        Object REINDEX158_tree=null;
        Object DOT159_tree=null;

        try {
            // SqlParser.g:187:13: ( REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id )
            // SqlParser.g:187:15: REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id
            {
            root_0 = (Object)adaptor.nil();

            REINDEX158=(Token)match(input,REINDEX,FOLLOW_REINDEX_in_reindex_stmt1535); 
            REINDEX158_tree = (Object)adaptor.create(REINDEX158);
            adaptor.addChild(root_0, REINDEX158_tree);

            // SqlParser.g:187:23: (database_name= id DOT )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==ID) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==DOT) ) {
                    alt50=1;
                }
            }
            else if ( ((LA50_0>=ABORT && LA50_0<=FROM)||(LA50_0>=GROUP && LA50_0<=IMMEDIATE)||(LA50_0>=INDEX && LA50_0<=IS)||(LA50_0>=JOIN && LA50_0<=LEFT)||LA50_0==LIMIT||LA50_0==NATURAL||(LA50_0>=NULL && LA50_0<=REFERENCES)||(LA50_0>=REINDEX && LA50_0<=WHERE)) ) {
                int LA50_2 = input.LA(2);

                if ( (LA50_2==DOT) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // SqlParser.g:187:24: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_reindex_stmt1540);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT159=(Token)match(input,DOT,FOLLOW_DOT_in_reindex_stmt1542); 
                    DOT159_tree = (Object)adaptor.create(DOT159);
                    adaptor.addChild(root_0, DOT159_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_reindex_stmt1548);
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
    // SqlParser.g:190:1: vacuum_stmt : VACUUM ;
    public final SqlParser.vacuum_stmt_return vacuum_stmt() throws RecognitionException {
        SqlParser.vacuum_stmt_return retval = new SqlParser.vacuum_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VACUUM160=null;

        Object VACUUM160_tree=null;

        try {
            // SqlParser.g:190:12: ( VACUUM )
            // SqlParser.g:190:14: VACUUM
            {
            root_0 = (Object)adaptor.nil();

            VACUUM160=(Token)match(input,VACUUM,FOLLOW_VACUUM_in_vacuum_stmt1556); 
            VACUUM160_tree = (Object)adaptor.create(VACUUM160);
            adaptor.addChild(root_0, VACUUM160_tree);


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
    // SqlParser.g:196:1: operation_conflict_clause : OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) ;
    public final SqlParser.operation_conflict_clause_return operation_conflict_clause() throws RecognitionException {
        SqlParser.operation_conflict_clause_return retval = new SqlParser.operation_conflict_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR161=null;
        Token set162=null;

        Object OR161_tree=null;
        Object set162_tree=null;

        try {
            // SqlParser.g:196:26: ( OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) )
            // SqlParser.g:196:28: OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE )
            {
            root_0 = (Object)adaptor.nil();

            OR161=(Token)match(input,OR,FOLLOW_OR_in_operation_conflict_clause1567); 
            OR161_tree = (Object)adaptor.create(OR161);
            adaptor.addChild(root_0, OR161_tree);

            set162=(Token)input.LT(1);
            if ( input.LA(1)==ABORT||input.LA(1)==FAIL||input.LA(1)==IGNORE||input.LA(1)==REPLACE||input.LA(1)==ROLLBACK ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set162));
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
    // SqlParser.g:198:1: ordering_term : expr ( ASC | DESC )? -> ^( ORDERING expr ( ASC )? ( DESC )? ) ;
    public final SqlParser.ordering_term_return ordering_term() throws RecognitionException {
        SqlParser.ordering_term_return retval = new SqlParser.ordering_term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASC164=null;
        Token DESC165=null;
        SqlParser.expr_return expr163 = null;


        Object ASC164_tree=null;
        Object DESC165_tree=null;
        RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");
        RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // SqlParser.g:198:14: ( expr ( ASC | DESC )? -> ^( ORDERING expr ( ASC )? ( DESC )? ) )
            // SqlParser.g:198:16: expr ( ASC | DESC )?
            {
            pushFollow(FOLLOW_expr_in_ordering_term1594);
            expr163=expr();

            state._fsp--;

            stream_expr.add(expr163.getTree());
            // SqlParser.g:198:82: ( ASC | DESC )?
            int alt51=3;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==ASC) ) {
                alt51=1;
            }
            else if ( (LA51_0==DESC) ) {
                alt51=2;
            }
            switch (alt51) {
                case 1 :
                    // SqlParser.g:198:83: ASC
                    {
                    ASC164=(Token)match(input,ASC,FOLLOW_ASC_in_ordering_term1599);  
                    stream_ASC.add(ASC164);


                    }
                    break;
                case 2 :
                    // SqlParser.g:198:89: DESC
                    {
                    DESC165=(Token)match(input,DESC,FOLLOW_DESC_in_ordering_term1603);  
                    stream_DESC.add(DESC165);


                    }
                    break;

            }



            // AST REWRITE
            // elements: DESC, ASC, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 199:1: -> ^( ORDERING expr ( ASC )? ( DESC )? )
            {
                // SqlParser.g:199:4: ^( ORDERING expr ( ASC )? ( DESC )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ORDERING, "ORDERING"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                // SqlParser.g:199:20: ( ASC )?
                if ( stream_ASC.hasNext() ) {
                    adaptor.addChild(root_1, stream_ASC.nextNode());

                }
                stream_ASC.reset();
                // SqlParser.g:199:27: ( DESC )?
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
    // SqlParser.g:201:1: operation_limited_clause : ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? ;
    public final SqlParser.operation_limited_clause_return operation_limited_clause() throws RecognitionException {
        SqlParser.operation_limited_clause_return retval = new SqlParser.operation_limited_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token limit=null;
        Token offset=null;
        Token ORDER166=null;
        Token BY167=null;
        Token COMMA169=null;
        Token LIMIT171=null;
        Token set172=null;
        SqlParser.ordering_term_return ordering_term168 = null;

        SqlParser.ordering_term_return ordering_term170 = null;


        Object limit_tree=null;
        Object offset_tree=null;
        Object ORDER166_tree=null;
        Object BY167_tree=null;
        Object COMMA169_tree=null;
        Object LIMIT171_tree=null;
        Object set172_tree=null;

        try {
            // SqlParser.g:201:25: ( ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )
            // SqlParser.g:202:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )?
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:202:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==ORDER) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // SqlParser.g:202:4: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                    ORDER166=(Token)match(input,ORDER,FOLLOW_ORDER_in_operation_limited_clause1633); 
                    ORDER166_tree = (Object)adaptor.create(ORDER166);
                    adaptor.addChild(root_0, ORDER166_tree);

                    BY167=(Token)match(input,BY,FOLLOW_BY_in_operation_limited_clause1635); 
                    BY167_tree = (Object)adaptor.create(BY167);
                    adaptor.addChild(root_0, BY167_tree);

                    pushFollow(FOLLOW_ordering_term_in_operation_limited_clause1637);
                    ordering_term168=ordering_term();

                    state._fsp--;

                    adaptor.addChild(root_0, ordering_term168.getTree());
                    // SqlParser.g:202:27: ( COMMA ordering_term )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==COMMA) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // SqlParser.g:202:28: COMMA ordering_term
                    	    {
                    	    COMMA169=(Token)match(input,COMMA,FOLLOW_COMMA_in_operation_limited_clause1640); 
                    	    COMMA169_tree = (Object)adaptor.create(COMMA169);
                    	    adaptor.addChild(root_0, COMMA169_tree);

                    	    pushFollow(FOLLOW_ordering_term_in_operation_limited_clause1642);
                    	    ordering_term170=ordering_term();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, ordering_term170.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);


                    }
                    break;

            }

            LIMIT171=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_operation_limited_clause1650); 
            LIMIT171_tree = (Object)adaptor.create(LIMIT171);
            adaptor.addChild(root_0, LIMIT171_tree);

            limit=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation_limited_clause1654); 
            limit_tree = (Object)adaptor.create(limit);
            adaptor.addChild(root_0, limit_tree);

            // SqlParser.g:203:23: ( ( OFFSET | COMMA ) offset= INTEGER )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==COMMA||LA54_0==OFFSET) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // SqlParser.g:203:24: ( OFFSET | COMMA ) offset= INTEGER
                    {
                    set172=(Token)input.LT(1);
                    if ( input.LA(1)==COMMA||input.LA(1)==OFFSET ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set172));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    offset=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation_limited_clause1667); 
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
    // SqlParser.g:206:1: select_stmt : select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )? -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? ) ;
    public final SqlParser.select_stmt_return select_stmt() throws RecognitionException {
        SqlParser.select_stmt_return retval = new SqlParser.select_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token limit=null;
        Token offset=null;
        Token ORDER174=null;
        Token BY175=null;
        Token COMMA177=null;
        Token LIMIT179=null;
        Token OFFSET180=null;
        Token COMMA181=null;
        SqlParser.select_list_return select_list173 = null;

        SqlParser.ordering_term_return ordering_term176 = null;

        SqlParser.ordering_term_return ordering_term178 = null;


        Object limit_tree=null;
        Object offset_tree=null;
        Object ORDER174_tree=null;
        Object BY175_tree=null;
        Object COMMA177_tree=null;
        Object LIMIT179_tree=null;
        Object OFFSET180_tree=null;
        Object COMMA181_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_ORDER=new RewriteRuleTokenStream(adaptor,"token ORDER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
        RewriteRuleTokenStream stream_OFFSET=new RewriteRuleTokenStream(adaptor,"token OFFSET");
        RewriteRuleSubtreeStream stream_select_list=new RewriteRuleSubtreeStream(adaptor,"rule select_list");
        RewriteRuleSubtreeStream stream_ordering_term=new RewriteRuleSubtreeStream(adaptor,"rule ordering_term");
        try {
            // SqlParser.g:206:12: ( select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )? -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? ) )
            // SqlParser.g:206:14: select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )?
            {
            pushFollow(FOLLOW_select_list_in_select_stmt1677);
            select_list173=select_list();

            state._fsp--;

            stream_select_list.add(select_list173.getTree());
            // SqlParser.g:207:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==ORDER) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // SqlParser.g:207:4: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                    ORDER174=(Token)match(input,ORDER,FOLLOW_ORDER_in_select_stmt1682);  
                    stream_ORDER.add(ORDER174);

                    BY175=(Token)match(input,BY,FOLLOW_BY_in_select_stmt1684);  
                    stream_BY.add(BY175);

                    pushFollow(FOLLOW_ordering_term_in_select_stmt1686);
                    ordering_term176=ordering_term();

                    state._fsp--;

                    stream_ordering_term.add(ordering_term176.getTree());
                    // SqlParser.g:207:27: ( COMMA ordering_term )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==COMMA) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // SqlParser.g:207:28: COMMA ordering_term
                    	    {
                    	    COMMA177=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_stmt1689);  
                    	    stream_COMMA.add(COMMA177);

                    	    pushFollow(FOLLOW_ordering_term_in_select_stmt1691);
                    	    ordering_term178=ordering_term();

                    	    state._fsp--;

                    	    stream_ordering_term.add(ordering_term178.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);


                    }
                    break;

            }

            // SqlParser.g:208:3: ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==LIMIT) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // SqlParser.g:208:4: LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )?
                    {
                    LIMIT179=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_select_stmt1700);  
                    stream_LIMIT.add(LIMIT179);

                    limit=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt1704);  
                    stream_INTEGER.add(limit);

                    // SqlParser.g:208:24: ( ( OFFSET | COMMA ) offset= INTEGER )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==COMMA||LA58_0==OFFSET) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // SqlParser.g:208:25: ( OFFSET | COMMA ) offset= INTEGER
                            {
                            // SqlParser.g:208:25: ( OFFSET | COMMA )
                            int alt57=2;
                            int LA57_0 = input.LA(1);

                            if ( (LA57_0==OFFSET) ) {
                                alt57=1;
                            }
                            else if ( (LA57_0==COMMA) ) {
                                alt57=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 57, 0, input);

                                throw nvae;
                            }
                            switch (alt57) {
                                case 1 :
                                    // SqlParser.g:208:26: OFFSET
                                    {
                                    OFFSET180=(Token)match(input,OFFSET,FOLLOW_OFFSET_in_select_stmt1708);  
                                    stream_OFFSET.add(OFFSET180);


                                    }
                                    break;
                                case 2 :
                                    // SqlParser.g:208:35: COMMA
                                    {
                                    COMMA181=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_stmt1712);  
                                    stream_COMMA.add(COMMA181);


                                    }
                                    break;

                            }

                            offset=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt1717);  
                            stream_INTEGER.add(offset);


                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: limit, ordering_term, select_list, ORDER, LIMIT, offset
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
            // 209:1: -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? )
            {
                // SqlParser.g:209:4: ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECT, "SELECT"), root_1);

                adaptor.addChild(root_1, stream_select_list.nextTree());
                // SqlParser.g:210:22: ( ^( ORDER ( ordering_term )+ ) )?
                if ( stream_ordering_term.hasNext()||stream_ORDER.hasNext() ) {
                    // SqlParser.g:210:22: ^( ORDER ( ordering_term )+ )
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
                // SqlParser.g:210:47: ( ^( LIMIT $limit ( $offset)? ) )?
                if ( stream_limit.hasNext()||stream_LIMIT.hasNext()||stream_offset.hasNext() ) {
                    // SqlParser.g:210:47: ^( LIMIT $limit ( $offset)? )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_LIMIT.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_limit.nextNode());
                    // SqlParser.g:210:62: ( $offset)?
                    if ( stream_offset.hasNext() ) {
                        adaptor.addChild(root_2, stream_offset.nextNode());

                    }
                    stream_offset.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_limit.reset();
                stream_LIMIT.reset();
                stream_offset.reset();

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
    // SqlParser.g:213:1: select_list : select_core ( select_op select_core )* ;
    public final SqlParser.select_list_return select_list() throws RecognitionException {
        SqlParser.select_list_return retval = new SqlParser.select_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.select_core_return select_core182 = null;

        SqlParser.select_op_return select_op183 = null;

        SqlParser.select_core_return select_core184 = null;



        try {
            // SqlParser.g:213:12: ( select_core ( select_op select_core )* )
            // SqlParser.g:214:3: select_core ( select_op select_core )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_select_core_in_select_list1762);
            select_core182=select_core();

            state._fsp--;

            adaptor.addChild(root_0, select_core182.getTree());
            // SqlParser.g:214:15: ( select_op select_core )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==EXCEPT||LA60_0==INTERSECT||LA60_0==UNION) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // SqlParser.g:214:16: select_op select_core
            	    {
            	    pushFollow(FOLLOW_select_op_in_select_list1765);
            	    select_op183=select_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(select_op183.getTree(), root_0);
            	    pushFollow(FOLLOW_select_core_in_select_list1768);
            	    select_core184=select_core();

            	    state._fsp--;

            	    adaptor.addChild(root_0, select_core184.getTree());

            	    }
            	    break;

            	default :
            	    break loop60;
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
    // SqlParser.g:216:1: select_op : ( UNION ( ALL )? | INTERSECT | EXCEPT );
    public final SqlParser.select_op_return select_op() throws RecognitionException {
        SqlParser.select_op_return retval = new SqlParser.select_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNION185=null;
        Token ALL186=null;
        Token INTERSECT187=null;
        Token EXCEPT188=null;

        Object UNION185_tree=null;
        Object ALL186_tree=null;
        Object INTERSECT187_tree=null;
        Object EXCEPT188_tree=null;

        try {
            // SqlParser.g:216:10: ( UNION ( ALL )? | INTERSECT | EXCEPT )
            int alt62=3;
            switch ( input.LA(1) ) {
            case UNION:
                {
                alt62=1;
                }
                break;
            case INTERSECT:
                {
                alt62=2;
                }
                break;
            case EXCEPT:
                {
                alt62=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // SqlParser.g:216:12: UNION ( ALL )?
                    {
                    root_0 = (Object)adaptor.nil();

                    UNION185=(Token)match(input,UNION,FOLLOW_UNION_in_select_op1777); 
                    UNION185_tree = (Object)adaptor.create(UNION185);
                    root_0 = (Object)adaptor.becomeRoot(UNION185_tree, root_0);

                    // SqlParser.g:216:19: ( ALL )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==ALL) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // SqlParser.g:216:20: ALL
                            {
                            ALL186=(Token)match(input,ALL,FOLLOW_ALL_in_select_op1781); 
                            ALL186_tree = (Object)adaptor.create(ALL186);
                            adaptor.addChild(root_0, ALL186_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:216:28: INTERSECT
                    {
                    root_0 = (Object)adaptor.nil();

                    INTERSECT187=(Token)match(input,INTERSECT,FOLLOW_INTERSECT_in_select_op1787); 
                    INTERSECT187_tree = (Object)adaptor.create(INTERSECT187);
                    adaptor.addChild(root_0, INTERSECT187_tree);


                    }
                    break;
                case 3 :
                    // SqlParser.g:216:40: EXCEPT
                    {
                    root_0 = (Object)adaptor.nil();

                    EXCEPT188=(Token)match(input,EXCEPT,FOLLOW_EXCEPT_in_select_op1791); 
                    EXCEPT188_tree = (Object)adaptor.create(EXCEPT188);
                    adaptor.addChild(root_0, EXCEPT188_tree);


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
    // SqlParser.g:218:1: select_core : SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )? -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? ) ;
    public final SqlParser.select_core_return select_core() throws RecognitionException {
        SqlParser.select_core_return retval = new SqlParser.select_core_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SELECT189=null;
        Token ALL190=null;
        Token DISTINCT191=null;
        Token COMMA193=null;
        Token FROM195=null;
        Token WHERE197=null;
        Token GROUP198=null;
        Token BY199=null;
        Token COMMA201=null;
        Token HAVING203=null;
        SqlParser.expr_return where_expr = null;

        SqlParser.expr_return having_expr = null;

        SqlParser.result_column_return result_column192 = null;

        SqlParser.result_column_return result_column194 = null;

        SqlParser.join_source_return join_source196 = null;

        SqlParser.ordering_term_return ordering_term200 = null;

        SqlParser.ordering_term_return ordering_term202 = null;


        Object SELECT189_tree=null;
        Object ALL190_tree=null;
        Object DISTINCT191_tree=null;
        Object COMMA193_tree=null;
        Object FROM195_tree=null;
        Object WHERE197_tree=null;
        Object GROUP198_tree=null;
        Object BY199_tree=null;
        Object COMMA201_tree=null;
        Object HAVING203_tree=null;
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
            // SqlParser.g:218:12: ( SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )? -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? ) )
            // SqlParser.g:219:3: SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )?
            {
            SELECT189=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_core1800);  
            stream_SELECT.add(SELECT189);

            // SqlParser.g:219:10: ( ALL | DISTINCT )?
            int alt63=3;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==ALL) ) {
                int LA63_1 = input.LA(2);

                if ( ((LA63_1>=PLUS && LA63_1<=ASTERISK)||LA63_1==LPAREN||(LA63_1>=QUESTION && LA63_1<=AT)||(LA63_1>=ABORT && LA63_1<=FROM)||(LA63_1>=GROUP && LA63_1<=IMMEDIATE)||(LA63_1>=INDEX && LA63_1<=IS)||(LA63_1>=JOIN && LA63_1<=LEFT)||LA63_1==LIMIT||(LA63_1>=NATURAL && LA63_1<=NOT)||(LA63_1>=NULL && LA63_1<=REFERENCES)||(LA63_1>=REINDEX && LA63_1<=WHERE)||(LA63_1>=ID && LA63_1<=INTEGER)||(LA63_1>=FLOAT && LA63_1<=BLOB)) ) {
                    alt63=1;
                }
            }
            else if ( (LA63_0==DISTINCT) ) {
                int LA63_2 = input.LA(2);

                if ( ((LA63_2>=PLUS && LA63_2<=ASTERISK)||LA63_2==LPAREN||(LA63_2>=QUESTION && LA63_2<=AT)||(LA63_2>=ABORT && LA63_2<=FROM)||(LA63_2>=GROUP && LA63_2<=IMMEDIATE)||(LA63_2>=INDEX && LA63_2<=IS)||(LA63_2>=JOIN && LA63_2<=LEFT)||LA63_2==LIMIT||(LA63_2>=NATURAL && LA63_2<=NOT)||(LA63_2>=NULL && LA63_2<=REFERENCES)||(LA63_2>=REINDEX && LA63_2<=WHERE)||(LA63_2>=ID && LA63_2<=INTEGER)||(LA63_2>=FLOAT && LA63_2<=BLOB)) ) {
                    alt63=2;
                }
            }
            switch (alt63) {
                case 1 :
                    // SqlParser.g:219:11: ALL
                    {
                    ALL190=(Token)match(input,ALL,FOLLOW_ALL_in_select_core1803);  
                    stream_ALL.add(ALL190);


                    }
                    break;
                case 2 :
                    // SqlParser.g:219:17: DISTINCT
                    {
                    DISTINCT191=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_select_core1807);  
                    stream_DISTINCT.add(DISTINCT191);


                    }
                    break;

            }

            pushFollow(FOLLOW_result_column_in_select_core1811);
            result_column192=result_column();

            state._fsp--;

            stream_result_column.add(result_column192.getTree());
            // SqlParser.g:219:42: ( COMMA result_column )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==COMMA) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // SqlParser.g:219:43: COMMA result_column
            	    {
            	    COMMA193=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_core1814);  
            	    stream_COMMA.add(COMMA193);

            	    pushFollow(FOLLOW_result_column_in_select_core1816);
            	    result_column194=result_column();

            	    state._fsp--;

            	    stream_result_column.add(result_column194.getTree());

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            // SqlParser.g:219:65: ( FROM join_source )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==FROM) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // SqlParser.g:219:66: FROM join_source
                    {
                    FROM195=(Token)match(input,FROM,FOLLOW_FROM_in_select_core1821);  
                    stream_FROM.add(FROM195);

                    pushFollow(FOLLOW_join_source_in_select_core1823);
                    join_source196=join_source();

                    state._fsp--;

                    stream_join_source.add(join_source196.getTree());

                    }
                    break;

            }

            // SqlParser.g:219:85: ( WHERE where_expr= expr )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==WHERE) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // SqlParser.g:219:86: WHERE where_expr= expr
                    {
                    WHERE197=(Token)match(input,WHERE,FOLLOW_WHERE_in_select_core1828);  
                    stream_WHERE.add(WHERE197);

                    pushFollow(FOLLOW_expr_in_select_core1832);
                    where_expr=expr();

                    state._fsp--;

                    stream_expr.add(where_expr.getTree());

                    }
                    break;

            }

            // SqlParser.g:220:3: ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==GROUP) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // SqlParser.g:220:5: GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )?
                    {
                    GROUP198=(Token)match(input,GROUP,FOLLOW_GROUP_in_select_core1840);  
                    stream_GROUP.add(GROUP198);

                    BY199=(Token)match(input,BY,FOLLOW_BY_in_select_core1842);  
                    stream_BY.add(BY199);

                    pushFollow(FOLLOW_ordering_term_in_select_core1844);
                    ordering_term200=ordering_term();

                    state._fsp--;

                    stream_ordering_term.add(ordering_term200.getTree());
                    // SqlParser.g:220:28: ( COMMA ordering_term )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==COMMA) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // SqlParser.g:220:29: COMMA ordering_term
                    	    {
                    	    COMMA201=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_core1847);  
                    	    stream_COMMA.add(COMMA201);

                    	    pushFollow(FOLLOW_ordering_term_in_select_core1849);
                    	    ordering_term202=ordering_term();

                    	    state._fsp--;

                    	    stream_ordering_term.add(ordering_term202.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    // SqlParser.g:220:51: ( HAVING having_expr= expr )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==HAVING) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // SqlParser.g:220:52: HAVING having_expr= expr
                            {
                            HAVING203=(Token)match(input,HAVING,FOLLOW_HAVING_in_select_core1854);  
                            stream_HAVING.add(HAVING203);

                            pushFollow(FOLLOW_expr_in_select_core1858);
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
            // elements: FROM, join_source, ordering_term, having_expr, DISTINCT, GROUP, HAVING, result_column, WHERE, where_expr
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
            // 221:1: -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? )
            {
                // SqlParser.g:221:4: ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECT_CORE, "SELECT_CORE"), root_1);

                // SqlParser.g:222:15: ( DISTINCT )?
                if ( stream_DISTINCT.hasNext() ) {
                    adaptor.addChild(root_1, stream_DISTINCT.nextNode());

                }
                stream_DISTINCT.reset();
                // SqlParser.g:222:27: ^( COLUMNS ( result_column )+ )
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
                // SqlParser.g:222:53: ( ^( FROM join_source ) )?
                if ( stream_FROM.hasNext()||stream_join_source.hasNext() ) {
                    // SqlParser.g:222:53: ^( FROM join_source )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_FROM.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_join_source.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_FROM.reset();
                stream_join_source.reset();
                // SqlParser.g:222:74: ( ^( WHERE $where_expr) )?
                if ( stream_WHERE.hasNext()||stream_where_expr.hasNext() ) {
                    // SqlParser.g:222:74: ^( WHERE $where_expr)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_WHERE.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_where_expr.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_WHERE.reset();
                stream_where_expr.reset();
                // SqlParser.g:223:3: ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )?
                if ( stream_ordering_term.hasNext()||stream_having_expr.hasNext()||stream_GROUP.hasNext()||stream_HAVING.hasNext() ) {
                    // SqlParser.g:223:3: ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? )
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
                    // SqlParser.g:223:26: ( ^( HAVING $having_expr) )?
                    if ( stream_having_expr.hasNext()||stream_HAVING.hasNext() ) {
                        // SqlParser.g:223:26: ^( HAVING $having_expr)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_HAVING.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_having_expr.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                    }
                    stream_having_expr.reset();
                    stream_HAVING.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_ordering_term.reset();
                stream_having_expr.reset();
                stream_GROUP.reset();
                stream_HAVING.reset();

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
    // SqlParser.g:226:1: result_column : ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) );
    public final SqlParser.result_column_return result_column() throws RecognitionException {
        SqlParser.result_column_return retval = new SqlParser.result_column_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASTERISK204=null;
        Token DOT205=null;
        Token ASTERISK206=null;
        Token AS208=null;
        SqlParser.id_return table_name = null;

        SqlParser.id_return column_alias = null;

        SqlParser.expr_return expr207 = null;


        Object ASTERISK204_tree=null;
        Object DOT205_tree=null;
        Object ASTERISK206_tree=null;
        Object AS208_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // SqlParser.g:227:3: ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) )
            int alt72=3;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // SqlParser.g:227:5: ASTERISK
                    {
                    root_0 = (Object)adaptor.nil();

                    ASTERISK204=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_result_column1928); 
                    ASTERISK204_tree = (Object)adaptor.create(ASTERISK204);
                    adaptor.addChild(root_0, ASTERISK204_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:228:5: table_name= id DOT ASTERISK
                    {
                    pushFollow(FOLLOW_id_in_result_column1936);
                    table_name=id();

                    state._fsp--;

                    stream_id.add(table_name.getTree());
                    DOT205=(Token)match(input,DOT,FOLLOW_DOT_in_result_column1938);  
                    stream_DOT.add(DOT205);

                    ASTERISK206=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_result_column1940);  
                    stream_ASTERISK.add(ASTERISK206);



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
                    // 228:32: -> ^( ASTERISK $table_name)
                    {
                        // SqlParser.g:228:35: ^( ASTERISK $table_name)
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
                    // SqlParser.g:229:5: expr ( ( AS )? column_alias= id )?
                    {
                    pushFollow(FOLLOW_expr_in_result_column1955);
                    expr207=expr();

                    state._fsp--;

                    stream_expr.add(expr207.getTree());
                    // SqlParser.g:229:10: ( ( AS )? column_alias= id )?
                    int alt71=2;
                    alt71 = dfa71.predict(input);
                    switch (alt71) {
                        case 1 :
                            // SqlParser.g:229:11: ( AS )? column_alias= id
                            {
                            // SqlParser.g:229:11: ( AS )?
                            int alt70=2;
                            alt70 = dfa70.predict(input);
                            switch (alt70) {
                                case 1 :
                                    // SqlParser.g:229:12: AS
                                    {
                                    AS208=(Token)match(input,AS,FOLLOW_AS_in_result_column1959);  
                                    stream_AS.add(AS208);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_id_in_result_column1965);
                            column_alias=id();

                            state._fsp--;

                            stream_id.add(column_alias.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: expr, column_alias
                    // token labels: 
                    // rule labels: retval, column_alias
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_column_alias=new RewriteRuleSubtreeStream(adaptor,"rule column_alias",column_alias!=null?column_alias.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 229:35: -> ^( ALIAS expr ( $column_alias)? )
                    {
                        // SqlParser.g:229:38: ^( ALIAS expr ( $column_alias)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // SqlParser.g:229:51: ( $column_alias)?
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
    // SqlParser.g:231:1: join_source : single_source ( join_op single_source ( join_constraint )? )* ;
    public final SqlParser.join_source_return join_source() throws RecognitionException {
        SqlParser.join_source_return retval = new SqlParser.join_source_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.single_source_return single_source209 = null;

        SqlParser.join_op_return join_op210 = null;

        SqlParser.single_source_return single_source211 = null;

        SqlParser.join_constraint_return join_constraint212 = null;



        try {
            // SqlParser.g:231:12: ( single_source ( join_op single_source ( join_constraint )? )* )
            // SqlParser.g:231:14: single_source ( join_op single_source ( join_constraint )? )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_single_source_in_join_source1986);
            single_source209=single_source();

            state._fsp--;

            adaptor.addChild(root_0, single_source209.getTree());
            // SqlParser.g:231:28: ( join_op single_source ( join_constraint )? )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==COMMA||LA74_0==CROSS||LA74_0==INNER||LA74_0==JOIN||LA74_0==LEFT||LA74_0==NATURAL||LA74_0==OUTER) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // SqlParser.g:231:29: join_op single_source ( join_constraint )?
            	    {
            	    pushFollow(FOLLOW_join_op_in_join_source1989);
            	    join_op210=join_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(join_op210.getTree(), root_0);
            	    pushFollow(FOLLOW_single_source_in_join_source1992);
            	    single_source211=single_source();

            	    state._fsp--;

            	    adaptor.addChild(root_0, single_source211.getTree());
            	    // SqlParser.g:231:52: ( join_constraint )?
            	    int alt73=2;
            	    int LA73_0 = input.LA(1);

            	    if ( (LA73_0==ON||LA73_0==USING) ) {
            	        alt73=1;
            	    }
            	    switch (alt73) {
            	        case 1 :
            	            // SqlParser.g:231:53: join_constraint
            	            {
            	            pushFollow(FOLLOW_join_constraint_in_join_source1995);
            	            join_constraint212=join_constraint();

            	            state._fsp--;

            	            adaptor.addChild(root_0, join_constraint212.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
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
    // SqlParser.g:233:1: single_source : ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN );
    public final SqlParser.single_source_return single_source() throws RecognitionException {
        SqlParser.single_source_return retval = new SqlParser.single_source_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token table_name=null;
        Token table_alias=null;
        Token DOT213=null;
        Token AS214=null;
        Token INDEXED215=null;
        Token BY216=null;
        Token NOT217=null;
        Token INDEXED218=null;
        Token LPAREN219=null;
        Token RPAREN221=null;
        Token AS222=null;
        Token LPAREN223=null;
        Token RPAREN225=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return index_name = null;

        SqlParser.select_stmt_return select_stmt220 = null;

        SqlParser.join_source_return join_source224 = null;


        Object table_name_tree=null;
        Object table_alias_tree=null;
        Object DOT213_tree=null;
        Object AS214_tree=null;
        Object INDEXED215_tree=null;
        Object BY216_tree=null;
        Object NOT217_tree=null;
        Object INDEXED218_tree=null;
        Object LPAREN219_tree=null;
        Object RPAREN221_tree=null;
        Object AS222_tree=null;
        Object LPAREN223_tree=null;
        Object RPAREN225_tree=null;
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
            // SqlParser.g:234:3: ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN )
            int alt81=3;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=ABORT && LA81_0<=FROM)||(LA81_0>=GROUP && LA81_0<=IMMEDIATE)||(LA81_0>=INDEX && LA81_0<=IS)||(LA81_0>=JOIN && LA81_0<=LEFT)||LA81_0==LIMIT||LA81_0==NATURAL||(LA81_0>=NULL && LA81_0<=REFERENCES)||(LA81_0>=REINDEX && LA81_0<=WHERE)||LA81_0==ID) ) {
                alt81=1;
            }
            else if ( (LA81_0==LPAREN) ) {
                int LA81_2 = input.LA(2);

                if ( (LA81_2==SELECT) ) {
                    int LA81_3 = input.LA(3);

                    if ( ((LA81_3>=PLUS && LA81_3<=ASTERISK)||LA81_3==LPAREN||(LA81_3>=QUESTION && LA81_3<=AT)||(LA81_3>=ABORT && LA81_3<=FROM)||(LA81_3>=GROUP && LA81_3<=IMMEDIATE)||(LA81_3>=INDEX && LA81_3<=IS)||(LA81_3>=JOIN && LA81_3<=LEFT)||LA81_3==LIMIT||(LA81_3>=NATURAL && LA81_3<=NOT)||(LA81_3>=NULL && LA81_3<=REFERENCES)||(LA81_3>=REINDEX && LA81_3<=WHERE)||(LA81_3>=ID && LA81_3<=INTEGER)||(LA81_3>=FLOAT && LA81_3<=BLOB)) ) {
                        alt81=2;
                    }
                    else if ( (LA81_3==DOT) ) {
                        alt81=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA81_2==LPAREN||(LA81_2>=ABORT && LA81_2<=FROM)||(LA81_2>=GROUP && LA81_2<=IMMEDIATE)||(LA81_2>=INDEX && LA81_2<=IS)||(LA81_2>=JOIN && LA81_2<=LEFT)||LA81_2==LIMIT||LA81_2==NATURAL||(LA81_2>=NULL && LA81_2<=REFERENCES)||(LA81_2>=REINDEX && LA81_2<=SAVEPOINT)||(LA81_2>=SET && LA81_2<=WHERE)||LA81_2==ID) ) {
                    alt81=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // SqlParser.g:234:5: (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )?
                    {
                    // SqlParser.g:234:5: (database_name= id DOT )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==ID) ) {
                        int LA75_1 = input.LA(2);

                        if ( (LA75_1==DOT) ) {
                            alt75=1;
                        }
                    }
                    else if ( ((LA75_0>=ABORT && LA75_0<=FROM)||(LA75_0>=GROUP && LA75_0<=IMMEDIATE)||(LA75_0>=INDEX && LA75_0<=IS)||(LA75_0>=JOIN && LA75_0<=LEFT)||LA75_0==LIMIT||LA75_0==NATURAL||(LA75_0>=NULL && LA75_0<=REFERENCES)||(LA75_0>=REINDEX && LA75_0<=WHERE)) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // SqlParser.g:234:6: database_name= id DOT
                            {
                            pushFollow(FOLLOW_id_in_single_source2012);
                            database_name=id();

                            state._fsp--;

                            stream_id.add(database_name.getTree());
                            DOT213=(Token)match(input,DOT,FOLLOW_DOT_in_single_source2014);  
                            stream_DOT.add(DOT213);


                            }
                            break;

                    }

                    table_name=(Token)match(input,ID,FOLLOW_ID_in_single_source2020);  
                    stream_ID.add(table_name);

                    // SqlParser.g:234:43: ( ( AS )? table_alias= ID )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==AS||LA77_0==ID) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // SqlParser.g:234:44: ( AS )? table_alias= ID
                            {
                            // SqlParser.g:234:44: ( AS )?
                            int alt76=2;
                            int LA76_0 = input.LA(1);

                            if ( (LA76_0==AS) ) {
                                alt76=1;
                            }
                            switch (alt76) {
                                case 1 :
                                    // SqlParser.g:234:45: AS
                                    {
                                    AS214=(Token)match(input,AS,FOLLOW_AS_in_single_source2024);  
                                    stream_AS.add(AS214);


                                    }
                                    break;

                            }

                            table_alias=(Token)match(input,ID,FOLLOW_ID_in_single_source2030);  
                            stream_ID.add(table_alias);


                            }
                            break;

                    }

                    // SqlParser.g:234:67: ( INDEXED BY index_name= id | NOT INDEXED )?
                    int alt78=3;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==INDEXED) ) {
                        alt78=1;
                    }
                    else if ( (LA78_0==NOT) ) {
                        alt78=2;
                    }
                    switch (alt78) {
                        case 1 :
                            // SqlParser.g:234:68: INDEXED BY index_name= id
                            {
                            INDEXED215=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_single_source2035);  
                            stream_INDEXED.add(INDEXED215);

                            BY216=(Token)match(input,BY,FOLLOW_BY_in_single_source2037);  
                            stream_BY.add(BY216);

                            pushFollow(FOLLOW_id_in_single_source2041);
                            index_name=id();

                            state._fsp--;

                            stream_id.add(index_name.getTree());

                            }
                            break;
                        case 2 :
                            // SqlParser.g:234:95: NOT INDEXED
                            {
                            NOT217=(Token)match(input,NOT,FOLLOW_NOT_in_single_source2045);  
                            stream_NOT.add(NOT217);

                            INDEXED218=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_single_source2047);  
                            stream_INDEXED.add(INDEXED218);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: NOT, database_name, table_name, table_alias, INDEXED, index_name
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
                    // 235:3: -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? )
                    {
                        // SqlParser.g:235:6: ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        // SqlParser.g:235:14: ^( $table_name ( $database_name)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                        // SqlParser.g:235:28: ( $database_name)?
                        if ( stream_database_name.hasNext() ) {
                            adaptor.addChild(root_2, stream_database_name.nextTree());

                        }
                        stream_database_name.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // SqlParser.g:235:45: ( $table_alias)?
                        if ( stream_table_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_table_alias.nextNode());

                        }
                        stream_table_alias.reset();
                        // SqlParser.g:235:59: ( ^( INDEXED ( NOT )? ( $index_name)? ) )?
                        if ( stream_NOT.hasNext()||stream_INDEXED.hasNext()||stream_index_name.hasNext() ) {
                            // SqlParser.g:235:59: ^( INDEXED ( NOT )? ( $index_name)? )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(stream_INDEXED.nextNode(), root_2);

                            // SqlParser.g:235:69: ( NOT )?
                            if ( stream_NOT.hasNext() ) {
                                adaptor.addChild(root_2, stream_NOT.nextNode());

                            }
                            stream_NOT.reset();
                            // SqlParser.g:235:74: ( $index_name)?
                            if ( stream_index_name.hasNext() ) {
                                adaptor.addChild(root_2, stream_index_name.nextTree());

                            }
                            stream_index_name.reset();

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_NOT.reset();
                        stream_INDEXED.reset();
                        stream_index_name.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // SqlParser.g:236:5: LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )?
                    {
                    LPAREN219=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_single_source2088);  
                    stream_LPAREN.add(LPAREN219);

                    pushFollow(FOLLOW_select_stmt_in_single_source2090);
                    select_stmt220=select_stmt();

                    state._fsp--;

                    stream_select_stmt.add(select_stmt220.getTree());
                    RPAREN221=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_single_source2092);  
                    stream_RPAREN.add(RPAREN221);

                    // SqlParser.g:236:31: ( ( AS )? table_alias= ID )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==AS||LA80_0==ID) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // SqlParser.g:236:32: ( AS )? table_alias= ID
                            {
                            // SqlParser.g:236:32: ( AS )?
                            int alt79=2;
                            int LA79_0 = input.LA(1);

                            if ( (LA79_0==AS) ) {
                                alt79=1;
                            }
                            switch (alt79) {
                                case 1 :
                                    // SqlParser.g:236:33: AS
                                    {
                                    AS222=(Token)match(input,AS,FOLLOW_AS_in_single_source2096);  
                                    stream_AS.add(AS222);


                                    }
                                    break;

                            }

                            table_alias=(Token)match(input,ID,FOLLOW_ID_in_single_source2102);  
                            stream_ID.add(table_alias);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: select_stmt, table_alias
                    // token labels: table_alias
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_table_alias=new RewriteRuleTokenStream(adaptor,"token table_alias",table_alias);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 237:3: -> ^( ALIAS select_stmt ( $table_alias)? )
                    {
                        // SqlParser.g:237:6: ^( ALIAS select_stmt ( $table_alias)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        adaptor.addChild(root_1, stream_select_stmt.nextTree());
                        // SqlParser.g:237:26: ( $table_alias)?
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
                    // SqlParser.g:238:5: LPAREN join_source RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN223=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_single_source2124); 
                    pushFollow(FOLLOW_join_source_in_single_source2127);
                    join_source224=join_source();

                    state._fsp--;

                    adaptor.addChild(root_0, join_source224.getTree());
                    RPAREN225=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_single_source2129); 

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
    // SqlParser.g:240:1: join_op : ( COMMA | ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN );
    public final SqlParser.join_op_return join_op() throws RecognitionException {
        SqlParser.join_op_return retval = new SqlParser.join_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA226=null;
        Token NATURAL227=null;
        Token LEFT228=null;
        Token OUTER229=null;
        Token INNER230=null;
        Token CROSS231=null;
        Token JOIN232=null;

        Object COMMA226_tree=null;
        Object NATURAL227_tree=null;
        Object LEFT228_tree=null;
        Object OUTER229_tree=null;
        Object INNER230_tree=null;
        Object CROSS231_tree=null;
        Object JOIN232_tree=null;

        try {
            // SqlParser.g:241:3: ( COMMA | ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==COMMA) ) {
                alt86=1;
            }
            else if ( (LA86_0==CROSS||LA86_0==INNER||LA86_0==JOIN||LA86_0==LEFT||LA86_0==NATURAL||LA86_0==OUTER) ) {
                alt86=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // SqlParser.g:241:5: COMMA
                    {
                    root_0 = (Object)adaptor.nil();

                    COMMA226=(Token)match(input,COMMA,FOLLOW_COMMA_in_join_op2140); 
                    COMMA226_tree = (Object)adaptor.create(COMMA226);
                    adaptor.addChild(root_0, COMMA226_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:242:5: ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:242:5: ( NATURAL )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==NATURAL) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // SqlParser.g:242:6: NATURAL
                            {
                            NATURAL227=(Token)match(input,NATURAL,FOLLOW_NATURAL_in_join_op2147); 
                            NATURAL227_tree = (Object)adaptor.create(NATURAL227);
                            adaptor.addChild(root_0, NATURAL227_tree);


                            }
                            break;

                    }

                    // SqlParser.g:242:16: ( ( LEFT )? ( OUTER )? | INNER | CROSS )
                    int alt85=3;
                    switch ( input.LA(1) ) {
                    case JOIN:
                    case LEFT:
                    case OUTER:
                        {
                        alt85=1;
                        }
                        break;
                    case INNER:
                        {
                        alt85=2;
                        }
                        break;
                    case CROSS:
                        {
                        alt85=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 85, 0, input);

                        throw nvae;
                    }

                    switch (alt85) {
                        case 1 :
                            // SqlParser.g:242:17: ( LEFT )? ( OUTER )?
                            {
                            // SqlParser.g:242:17: ( LEFT )?
                            int alt83=2;
                            int LA83_0 = input.LA(1);

                            if ( (LA83_0==LEFT) ) {
                                alt83=1;
                            }
                            switch (alt83) {
                                case 1 :
                                    // SqlParser.g:242:18: LEFT
                                    {
                                    LEFT228=(Token)match(input,LEFT,FOLLOW_LEFT_in_join_op2153); 
                                    LEFT228_tree = (Object)adaptor.create(LEFT228);
                                    adaptor.addChild(root_0, LEFT228_tree);


                                    }
                                    break;

                            }

                            // SqlParser.g:242:25: ( OUTER )?
                            int alt84=2;
                            int LA84_0 = input.LA(1);

                            if ( (LA84_0==OUTER) ) {
                                alt84=1;
                            }
                            switch (alt84) {
                                case 1 :
                                    // SqlParser.g:242:26: OUTER
                                    {
                                    OUTER229=(Token)match(input,OUTER,FOLLOW_OUTER_in_join_op2158); 
                                    OUTER229_tree = (Object)adaptor.create(OUTER229);
                                    adaptor.addChild(root_0, OUTER229_tree);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // SqlParser.g:242:36: INNER
                            {
                            INNER230=(Token)match(input,INNER,FOLLOW_INNER_in_join_op2164); 
                            INNER230_tree = (Object)adaptor.create(INNER230);
                            adaptor.addChild(root_0, INNER230_tree);


                            }
                            break;
                        case 3 :
                            // SqlParser.g:242:44: CROSS
                            {
                            CROSS231=(Token)match(input,CROSS,FOLLOW_CROSS_in_join_op2168); 
                            CROSS231_tree = (Object)adaptor.create(CROSS231);
                            adaptor.addChild(root_0, CROSS231_tree);


                            }
                            break;

                    }

                    JOIN232=(Token)match(input,JOIN,FOLLOW_JOIN_in_join_op2171); 
                    JOIN232_tree = (Object)adaptor.create(JOIN232);
                    root_0 = (Object)adaptor.becomeRoot(JOIN232_tree, root_0);


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
    // SqlParser.g:244:1: join_constraint : ( ON expr | USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN -> ^( USING ( $column_names)+ ) );
    public final SqlParser.join_constraint_return join_constraint() throws RecognitionException {
        SqlParser.join_constraint_return retval = new SqlParser.join_constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ON233=null;
        Token USING235=null;
        Token LPAREN236=null;
        Token COMMA237=null;
        Token RPAREN238=null;
        List list_column_names=null;
        SqlParser.expr_return expr234 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object ON233_tree=null;
        Object USING235_tree=null;
        Object LPAREN236_tree=null;
        Object COMMA237_tree=null;
        Object RPAREN238_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // SqlParser.g:245:3: ( ON expr | USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN -> ^( USING ( $column_names)+ ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==ON) ) {
                alt88=1;
            }
            else if ( (LA88_0==USING) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // SqlParser.g:245:5: ON expr
                    {
                    root_0 = (Object)adaptor.nil();

                    ON233=(Token)match(input,ON,FOLLOW_ON_in_join_constraint2182); 
                    ON233_tree = (Object)adaptor.create(ON233);
                    root_0 = (Object)adaptor.becomeRoot(ON233_tree, root_0);

                    pushFollow(FOLLOW_expr_in_join_constraint2185);
                    expr234=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr234.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:246:5: USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                    {
                    USING235=(Token)match(input,USING,FOLLOW_USING_in_join_constraint2191);  
                    stream_USING.add(USING235);

                    LPAREN236=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_join_constraint2193);  
                    stream_LPAREN.add(LPAREN236);

                    pushFollow(FOLLOW_id_in_join_constraint2197);
                    column_names=id();

                    state._fsp--;

                    stream_id.add(column_names.getTree());
                    if (list_column_names==null) list_column_names=new ArrayList();
                    list_column_names.add(column_names.getTree());

                    // SqlParser.g:246:35: ( COMMA column_names+= id )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==COMMA) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // SqlParser.g:246:36: COMMA column_names+= id
                    	    {
                    	    COMMA237=(Token)match(input,COMMA,FOLLOW_COMMA_in_join_constraint2200);  
                    	    stream_COMMA.add(COMMA237);

                    	    pushFollow(FOLLOW_id_in_join_constraint2204);
                    	    column_names=id();

                    	    state._fsp--;

                    	    stream_id.add(column_names.getTree());
                    	    if (list_column_names==null) list_column_names=new ArrayList();
                    	    list_column_names.add(column_names.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);

                    RPAREN238=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_join_constraint2208);  
                    stream_RPAREN.add(RPAREN238);



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
                    // 246:68: -> ^( USING ( $column_names)+ )
                    {
                        // SqlParser.g:246:71: ^( USING ( $column_names)+ )
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
    // SqlParser.g:249:1: insert_stmt : ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES ) ;
    public final SqlParser.insert_stmt_return insert_stmt() throws RecognitionException {
        SqlParser.insert_stmt_return retval = new SqlParser.insert_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSERT239=null;
        Token REPLACE241=null;
        Token INTO242=null;
        Token DOT243=null;
        Token LPAREN244=null;
        Token COMMA245=null;
        Token RPAREN246=null;
        Token VALUES247=null;
        Token LPAREN248=null;
        Token COMMA249=null;
        Token RPAREN250=null;
        Token DEFAULT252=null;
        Token VALUES253=null;
        List list_column_names=null;
        List list_values=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.operation_conflict_clause_return operation_conflict_clause240 = null;

        SqlParser.select_stmt_return select_stmt251 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        SqlParser.expr_return values = null;
         values = null;
        Object INSERT239_tree=null;
        Object REPLACE241_tree=null;
        Object INTO242_tree=null;
        Object DOT243_tree=null;
        Object LPAREN244_tree=null;
        Object COMMA245_tree=null;
        Object RPAREN246_tree=null;
        Object VALUES247_tree=null;
        Object LPAREN248_tree=null;
        Object COMMA249_tree=null;
        Object RPAREN250_tree=null;
        Object DEFAULT252_tree=null;
        Object VALUES253_tree=null;

        try {
            // SqlParser.g:249:12: ( ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES ) )
            // SqlParser.g:249:14: ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES )
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:249:14: ( INSERT ( operation_conflict_clause )? | REPLACE )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==INSERT) ) {
                alt90=1;
            }
            else if ( (LA90_0==REPLACE) ) {
                alt90=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // SqlParser.g:249:15: INSERT ( operation_conflict_clause )?
                    {
                    INSERT239=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_stmt2227); 
                    INSERT239_tree = (Object)adaptor.create(INSERT239);
                    adaptor.addChild(root_0, INSERT239_tree);

                    // SqlParser.g:249:22: ( operation_conflict_clause )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==OR) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // SqlParser.g:249:23: operation_conflict_clause
                            {
                            pushFollow(FOLLOW_operation_conflict_clause_in_insert_stmt2230);
                            operation_conflict_clause240=operation_conflict_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, operation_conflict_clause240.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:249:53: REPLACE
                    {
                    REPLACE241=(Token)match(input,REPLACE,FOLLOW_REPLACE_in_insert_stmt2236); 
                    REPLACE241_tree = (Object)adaptor.create(REPLACE241);
                    adaptor.addChild(root_0, REPLACE241_tree);


                    }
                    break;

            }

            INTO242=(Token)match(input,INTO,FOLLOW_INTO_in_insert_stmt2239); 
            INTO242_tree = (Object)adaptor.create(INTO242);
            adaptor.addChild(root_0, INTO242_tree);

            // SqlParser.g:249:67: (database_name= id DOT )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==ID) ) {
                int LA91_1 = input.LA(2);

                if ( (LA91_1==DOT) ) {
                    alt91=1;
                }
            }
            else if ( ((LA91_0>=ABORT && LA91_0<=FROM)||(LA91_0>=GROUP && LA91_0<=IMMEDIATE)||(LA91_0>=INDEX && LA91_0<=IS)||(LA91_0>=JOIN && LA91_0<=LEFT)||LA91_0==LIMIT||LA91_0==NATURAL||(LA91_0>=NULL && LA91_0<=REFERENCES)||(LA91_0>=REINDEX && LA91_0<=WHERE)) ) {
                int LA91_2 = input.LA(2);

                if ( (LA91_2==DOT) ) {
                    alt91=1;
                }
            }
            switch (alt91) {
                case 1 :
                    // SqlParser.g:249:68: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_insert_stmt2244);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT243=(Token)match(input,DOT,FOLLOW_DOT_in_insert_stmt2246); 
                    DOT243_tree = (Object)adaptor.create(DOT243);
                    adaptor.addChild(root_0, DOT243_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_insert_stmt2252);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:250:3: ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==LPAREN||LA96_0==SELECT||LA96_0==VALUES) ) {
                alt96=1;
            }
            else if ( (LA96_0==DEFAULT) ) {
                alt96=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // SqlParser.g:250:5: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt )
                    {
                    // SqlParser.g:250:5: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==LPAREN) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // SqlParser.g:250:6: LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                            {
                            LPAREN244=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt2259); 
                            LPAREN244_tree = (Object)adaptor.create(LPAREN244);
                            adaptor.addChild(root_0, LPAREN244_tree);

                            pushFollow(FOLLOW_id_in_insert_stmt2263);
                            column_names=id();

                            state._fsp--;

                            adaptor.addChild(root_0, column_names.getTree());
                            if (list_column_names==null) list_column_names=new ArrayList();
                            list_column_names.add(column_names.getTree());

                            // SqlParser.g:250:30: ( COMMA column_names+= id )*
                            loop92:
                            do {
                                int alt92=2;
                                int LA92_0 = input.LA(1);

                                if ( (LA92_0==COMMA) ) {
                                    alt92=1;
                                }


                                switch (alt92) {
                            	case 1 :
                            	    // SqlParser.g:250:31: COMMA column_names+= id
                            	    {
                            	    COMMA245=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt2266); 
                            	    COMMA245_tree = (Object)adaptor.create(COMMA245);
                            	    adaptor.addChild(root_0, COMMA245_tree);

                            	    pushFollow(FOLLOW_id_in_insert_stmt2270);
                            	    column_names=id();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, column_names.getTree());
                            	    if (list_column_names==null) list_column_names=new ArrayList();
                            	    list_column_names.add(column_names.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop92;
                                }
                            } while (true);

                            RPAREN246=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt2274); 
                            RPAREN246_tree = (Object)adaptor.create(RPAREN246);
                            adaptor.addChild(root_0, RPAREN246_tree);


                            }
                            break;

                    }

                    // SqlParser.g:251:5: ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt )
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==VALUES) ) {
                        alt95=1;
                    }
                    else if ( (LA95_0==SELECT) ) {
                        alt95=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 95, 0, input);

                        throw nvae;
                    }
                    switch (alt95) {
                        case 1 :
                            // SqlParser.g:251:6: VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN
                            {
                            VALUES247=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt2283); 
                            VALUES247_tree = (Object)adaptor.create(VALUES247);
                            adaptor.addChild(root_0, VALUES247_tree);

                            LPAREN248=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt2285); 
                            LPAREN248_tree = (Object)adaptor.create(LPAREN248);
                            adaptor.addChild(root_0, LPAREN248_tree);

                            pushFollow(FOLLOW_expr_in_insert_stmt2289);
                            values=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, values.getTree());
                            if (list_values==null) list_values=new ArrayList();
                            list_values.add(values.getTree());

                            // SqlParser.g:251:33: ( COMMA values+= expr )*
                            loop94:
                            do {
                                int alt94=2;
                                int LA94_0 = input.LA(1);

                                if ( (LA94_0==COMMA) ) {
                                    alt94=1;
                                }


                                switch (alt94) {
                            	case 1 :
                            	    // SqlParser.g:251:34: COMMA values+= expr
                            	    {
                            	    COMMA249=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt2292); 
                            	    COMMA249_tree = (Object)adaptor.create(COMMA249);
                            	    adaptor.addChild(root_0, COMMA249_tree);

                            	    pushFollow(FOLLOW_expr_in_insert_stmt2296);
                            	    values=expr();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, values.getTree());
                            	    if (list_values==null) list_values=new ArrayList();
                            	    list_values.add(values.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop94;
                                }
                            } while (true);

                            RPAREN250=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt2300); 
                            RPAREN250_tree = (Object)adaptor.create(RPAREN250);
                            adaptor.addChild(root_0, RPAREN250_tree);


                            }
                            break;
                        case 2 :
                            // SqlParser.g:251:64: select_stmt
                            {
                            pushFollow(FOLLOW_select_stmt_in_insert_stmt2304);
                            select_stmt251=select_stmt();

                            state._fsp--;

                            adaptor.addChild(root_0, select_stmt251.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:252:5: DEFAULT VALUES
                    {
                    DEFAULT252=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_insert_stmt2311); 
                    DEFAULT252_tree = (Object)adaptor.create(DEFAULT252);
                    adaptor.addChild(root_0, DEFAULT252_tree);

                    VALUES253=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt2313); 
                    VALUES253_tree = (Object)adaptor.create(VALUES253);
                    adaptor.addChild(root_0, VALUES253_tree);


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
    // SqlParser.g:255:1: update_stmt : UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )? ;
    public final SqlParser.update_stmt_return update_stmt() throws RecognitionException {
        SqlParser.update_stmt_return retval = new SqlParser.update_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UPDATE254=null;
        Token SET257=null;
        Token COMMA258=null;
        Token WHERE259=null;
        List list_values=null;
        SqlParser.operation_conflict_clause_return operation_conflict_clause255 = null;

        SqlParser.qualified_table_name_return qualified_table_name256 = null;

        SqlParser.expr_return expr260 = null;

        SqlParser.operation_limited_clause_return operation_limited_clause261 = null;

        SqlParser.update_set_return values = null;
         values = null;
        Object UPDATE254_tree=null;
        Object SET257_tree=null;
        Object COMMA258_tree=null;
        Object WHERE259_tree=null;

        try {
            // SqlParser.g:255:12: ( UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )? )
            // SqlParser.g:255:14: UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )?
            {
            root_0 = (Object)adaptor.nil();

            UPDATE254=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_update_stmt2323); 
            UPDATE254_tree = (Object)adaptor.create(UPDATE254);
            adaptor.addChild(root_0, UPDATE254_tree);

            // SqlParser.g:255:21: ( operation_conflict_clause )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==OR) ) {
                int LA97_1 = input.LA(2);

                if ( (LA97_1==ABORT||LA97_1==FAIL||LA97_1==IGNORE||LA97_1==REPLACE||LA97_1==ROLLBACK) ) {
                    alt97=1;
                }
            }
            switch (alt97) {
                case 1 :
                    // SqlParser.g:255:22: operation_conflict_clause
                    {
                    pushFollow(FOLLOW_operation_conflict_clause_in_update_stmt2326);
                    operation_conflict_clause255=operation_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_conflict_clause255.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_qualified_table_name_in_update_stmt2330);
            qualified_table_name256=qualified_table_name();

            state._fsp--;

            adaptor.addChild(root_0, qualified_table_name256.getTree());
            SET257=(Token)match(input,SET,FOLLOW_SET_in_update_stmt2334); 
            SET257_tree = (Object)adaptor.create(SET257);
            adaptor.addChild(root_0, SET257_tree);

            pushFollow(FOLLOW_update_set_in_update_stmt2338);
            values=update_set();

            state._fsp--;

            adaptor.addChild(root_0, values.getTree());
            if (list_values==null) list_values=new ArrayList();
            list_values.add(values.getTree());

            // SqlParser.g:256:26: ( COMMA values+= update_set )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==COMMA) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // SqlParser.g:256:27: COMMA values+= update_set
            	    {
            	    COMMA258=(Token)match(input,COMMA,FOLLOW_COMMA_in_update_stmt2341); 
            	    COMMA258_tree = (Object)adaptor.create(COMMA258);
            	    adaptor.addChild(root_0, COMMA258_tree);

            	    pushFollow(FOLLOW_update_set_in_update_stmt2345);
            	    values=update_set();

            	    state._fsp--;

            	    adaptor.addChild(root_0, values.getTree());
            	    if (list_values==null) list_values=new ArrayList();
            	    list_values.add(values.getTree());


            	    }
            	    break;

            	default :
            	    break loop98;
                }
            } while (true);

            // SqlParser.g:256:54: ( WHERE expr )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==WHERE) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // SqlParser.g:256:55: WHERE expr
                    {
                    WHERE259=(Token)match(input,WHERE,FOLLOW_WHERE_in_update_stmt2350); 
                    WHERE259_tree = (Object)adaptor.create(WHERE259);
                    adaptor.addChild(root_0, WHERE259_tree);

                    pushFollow(FOLLOW_expr_in_update_stmt2352);
                    expr260=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr260.getTree());

                    }
                    break;

            }

            // SqlParser.g:256:68: ( operation_limited_clause )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==LIMIT||LA100_0==ORDER) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // SqlParser.g:256:69: operation_limited_clause
                    {
                    pushFollow(FOLLOW_operation_limited_clause_in_update_stmt2357);
                    operation_limited_clause261=operation_limited_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_limited_clause261.getTree());

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
    // SqlParser.g:258:1: update_set : column_name= id EQUALS expr ;
    public final SqlParser.update_set_return update_set() throws RecognitionException {
        SqlParser.update_set_return retval = new SqlParser.update_set_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EQUALS262=null;
        SqlParser.id_return column_name = null;

        SqlParser.expr_return expr263 = null;


        Object EQUALS262_tree=null;

        try {
            // SqlParser.g:258:11: (column_name= id EQUALS expr )
            // SqlParser.g:258:13: column_name= id EQUALS expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_update_set2368);
            column_name=id();

            state._fsp--;

            adaptor.addChild(root_0, column_name.getTree());
            EQUALS262=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_update_set2370); 
            EQUALS262_tree = (Object)adaptor.create(EQUALS262);
            adaptor.addChild(root_0, EQUALS262_tree);

            pushFollow(FOLLOW_expr_in_update_set2372);
            expr263=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr263.getTree());

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
    // SqlParser.g:261:1: delete_stmt : DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )? ;
    public final SqlParser.delete_stmt_return delete_stmt() throws RecognitionException {
        SqlParser.delete_stmt_return retval = new SqlParser.delete_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DELETE264=null;
        Token FROM265=null;
        Token WHERE267=null;
        SqlParser.qualified_table_name_return qualified_table_name266 = null;

        SqlParser.expr_return expr268 = null;

        SqlParser.operation_limited_clause_return operation_limited_clause269 = null;


        Object DELETE264_tree=null;
        Object FROM265_tree=null;
        Object WHERE267_tree=null;

        try {
            // SqlParser.g:261:12: ( DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )? )
            // SqlParser.g:261:14: DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )?
            {
            root_0 = (Object)adaptor.nil();

            DELETE264=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_stmt2380); 
            DELETE264_tree = (Object)adaptor.create(DELETE264);
            adaptor.addChild(root_0, DELETE264_tree);

            FROM265=(Token)match(input,FROM,FOLLOW_FROM_in_delete_stmt2382); 
            FROM265_tree = (Object)adaptor.create(FROM265);
            adaptor.addChild(root_0, FROM265_tree);

            pushFollow(FOLLOW_qualified_table_name_in_delete_stmt2384);
            qualified_table_name266=qualified_table_name();

            state._fsp--;

            adaptor.addChild(root_0, qualified_table_name266.getTree());
            // SqlParser.g:261:47: ( WHERE expr )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==WHERE) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // SqlParser.g:261:48: WHERE expr
                    {
                    WHERE267=(Token)match(input,WHERE,FOLLOW_WHERE_in_delete_stmt2387); 
                    WHERE267_tree = (Object)adaptor.create(WHERE267);
                    adaptor.addChild(root_0, WHERE267_tree);

                    pushFollow(FOLLOW_expr_in_delete_stmt2389);
                    expr268=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr268.getTree());

                    }
                    break;

            }

            // SqlParser.g:261:61: ( operation_limited_clause )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==LIMIT||LA102_0==ORDER) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // SqlParser.g:261:62: operation_limited_clause
                    {
                    pushFollow(FOLLOW_operation_limited_clause_in_delete_stmt2394);
                    operation_limited_clause269=operation_limited_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_limited_clause269.getTree());

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
    // SqlParser.g:264:1: begin_stmt : BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )? ;
    public final SqlParser.begin_stmt_return begin_stmt() throws RecognitionException {
        SqlParser.begin_stmt_return retval = new SqlParser.begin_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BEGIN270=null;
        Token set271=null;
        Token TRANSACTION272=null;

        Object BEGIN270_tree=null;
        Object set271_tree=null;
        Object TRANSACTION272_tree=null;

        try {
            // SqlParser.g:264:11: ( BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )? )
            // SqlParser.g:264:13: BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )?
            {
            root_0 = (Object)adaptor.nil();

            BEGIN270=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_begin_stmt2404); 
            BEGIN270_tree = (Object)adaptor.create(BEGIN270);
            adaptor.addChild(root_0, BEGIN270_tree);

            // SqlParser.g:264:19: ( DEFERRED | IMMEDIATE | EXCLUSIVE )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==DEFERRED||LA103_0==EXCLUSIVE||LA103_0==IMMEDIATE) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // SqlParser.g:
                    {
                    set271=(Token)input.LT(1);
                    if ( input.LA(1)==DEFERRED||input.LA(1)==EXCLUSIVE||input.LA(1)==IMMEDIATE ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set271));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            // SqlParser.g:264:55: ( TRANSACTION )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==TRANSACTION) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // SqlParser.g:264:56: TRANSACTION
                    {
                    TRANSACTION272=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_begin_stmt2420); 
                    TRANSACTION272_tree = (Object)adaptor.create(TRANSACTION272);
                    adaptor.addChild(root_0, TRANSACTION272_tree);


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
    // SqlParser.g:267:1: commit_stmt : ( COMMIT | END ) ( TRANSACTION )? ;
    public final SqlParser.commit_stmt_return commit_stmt() throws RecognitionException {
        SqlParser.commit_stmt_return retval = new SqlParser.commit_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set273=null;
        Token TRANSACTION274=null;

        Object set273_tree=null;
        Object TRANSACTION274_tree=null;

        try {
            // SqlParser.g:267:12: ( ( COMMIT | END ) ( TRANSACTION )? )
            // SqlParser.g:267:14: ( COMMIT | END ) ( TRANSACTION )?
            {
            root_0 = (Object)adaptor.nil();

            set273=(Token)input.LT(1);
            if ( input.LA(1)==COMMIT||input.LA(1)==END ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set273));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // SqlParser.g:267:29: ( TRANSACTION )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==TRANSACTION) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // SqlParser.g:267:30: TRANSACTION
                    {
                    TRANSACTION274=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_commit_stmt2439); 
                    TRANSACTION274_tree = (Object)adaptor.create(TRANSACTION274);
                    adaptor.addChild(root_0, TRANSACTION274_tree);


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
    // SqlParser.g:270:1: rollback_stmt : ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )? ;
    public final SqlParser.rollback_stmt_return rollback_stmt() throws RecognitionException {
        SqlParser.rollback_stmt_return retval = new SqlParser.rollback_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ROLLBACK275=null;
        Token TRANSACTION276=null;
        Token TO277=null;
        Token SAVEPOINT278=null;
        SqlParser.id_return savepoint_name = null;


        Object ROLLBACK275_tree=null;
        Object TRANSACTION276_tree=null;
        Object TO277_tree=null;
        Object SAVEPOINT278_tree=null;

        try {
            // SqlParser.g:270:14: ( ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )? )
            // SqlParser.g:270:16: ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )?
            {
            root_0 = (Object)adaptor.nil();

            ROLLBACK275=(Token)match(input,ROLLBACK,FOLLOW_ROLLBACK_in_rollback_stmt2449); 
            ROLLBACK275_tree = (Object)adaptor.create(ROLLBACK275);
            adaptor.addChild(root_0, ROLLBACK275_tree);

            // SqlParser.g:270:25: ( TRANSACTION )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==TRANSACTION) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // SqlParser.g:270:26: TRANSACTION
                    {
                    TRANSACTION276=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_rollback_stmt2452); 
                    TRANSACTION276_tree = (Object)adaptor.create(TRANSACTION276);
                    adaptor.addChild(root_0, TRANSACTION276_tree);


                    }
                    break;

            }

            // SqlParser.g:270:40: ( TO ( SAVEPOINT )? savepoint_name= id )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==TO) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // SqlParser.g:270:41: TO ( SAVEPOINT )? savepoint_name= id
                    {
                    TO277=(Token)match(input,TO,FOLLOW_TO_in_rollback_stmt2457); 
                    TO277_tree = (Object)adaptor.create(TO277);
                    adaptor.addChild(root_0, TO277_tree);

                    // SqlParser.g:270:44: ( SAVEPOINT )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==SAVEPOINT) ) {
                        int LA107_1 = input.LA(2);

                        if ( ((LA107_1>=ABORT && LA107_1<=FROM)||(LA107_1>=GROUP && LA107_1<=IMMEDIATE)||(LA107_1>=INDEX && LA107_1<=IS)||(LA107_1>=JOIN && LA107_1<=LEFT)||LA107_1==LIMIT||LA107_1==NATURAL||(LA107_1>=NULL && LA107_1<=REFERENCES)||(LA107_1>=REINDEX && LA107_1<=WHERE)||LA107_1==ID) ) {
                            alt107=1;
                        }
                    }
                    switch (alt107) {
                        case 1 :
                            // SqlParser.g:270:45: SAVEPOINT
                            {
                            SAVEPOINT278=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_rollback_stmt2460); 
                            SAVEPOINT278_tree = (Object)adaptor.create(SAVEPOINT278);
                            adaptor.addChild(root_0, SAVEPOINT278_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_id_in_rollback_stmt2466);
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
    // SqlParser.g:273:1: savepoint_stmt : SAVEPOINT savepoint_name= id ;
    public final SqlParser.savepoint_stmt_return savepoint_stmt() throws RecognitionException {
        SqlParser.savepoint_stmt_return retval = new SqlParser.savepoint_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SAVEPOINT279=null;
        SqlParser.id_return savepoint_name = null;


        Object SAVEPOINT279_tree=null;

        try {
            // SqlParser.g:273:15: ( SAVEPOINT savepoint_name= id )
            // SqlParser.g:273:17: SAVEPOINT savepoint_name= id
            {
            root_0 = (Object)adaptor.nil();

            SAVEPOINT279=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_savepoint_stmt2476); 
            SAVEPOINT279_tree = (Object)adaptor.create(SAVEPOINT279);
            adaptor.addChild(root_0, SAVEPOINT279_tree);

            pushFollow(FOLLOW_id_in_savepoint_stmt2480);
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
    // SqlParser.g:276:1: release_stmt : RELEASE ( SAVEPOINT )? savepoint_name= id ;
    public final SqlParser.release_stmt_return release_stmt() throws RecognitionException {
        SqlParser.release_stmt_return retval = new SqlParser.release_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RELEASE280=null;
        Token SAVEPOINT281=null;
        SqlParser.id_return savepoint_name = null;


        Object RELEASE280_tree=null;
        Object SAVEPOINT281_tree=null;

        try {
            // SqlParser.g:276:13: ( RELEASE ( SAVEPOINT )? savepoint_name= id )
            // SqlParser.g:276:15: RELEASE ( SAVEPOINT )? savepoint_name= id
            {
            root_0 = (Object)adaptor.nil();

            RELEASE280=(Token)match(input,RELEASE,FOLLOW_RELEASE_in_release_stmt2488); 
            RELEASE280_tree = (Object)adaptor.create(RELEASE280);
            adaptor.addChild(root_0, RELEASE280_tree);

            // SqlParser.g:276:23: ( SAVEPOINT )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==SAVEPOINT) ) {
                int LA109_1 = input.LA(2);

                if ( ((LA109_1>=ABORT && LA109_1<=FROM)||(LA109_1>=GROUP && LA109_1<=IMMEDIATE)||(LA109_1>=INDEX && LA109_1<=IS)||(LA109_1>=JOIN && LA109_1<=LEFT)||LA109_1==LIMIT||LA109_1==NATURAL||(LA109_1>=NULL && LA109_1<=REFERENCES)||(LA109_1>=REINDEX && LA109_1<=WHERE)||LA109_1==ID) ) {
                    alt109=1;
                }
            }
            switch (alt109) {
                case 1 :
                    // SqlParser.g:276:24: SAVEPOINT
                    {
                    SAVEPOINT281=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_release_stmt2491); 
                    SAVEPOINT281_tree = (Object)adaptor.create(SAVEPOINT281);
                    adaptor.addChild(root_0, SAVEPOINT281_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_release_stmt2497);
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
    // SqlParser.g:283:1: table_conflict_clause : ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) ;
    public final SqlParser.table_conflict_clause_return table_conflict_clause() throws RecognitionException {
        SqlParser.table_conflict_clause_return retval = new SqlParser.table_conflict_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ON282=null;
        Token CONFLICT283=null;
        Token set284=null;

        Object ON282_tree=null;
        Object CONFLICT283_tree=null;
        Object set284_tree=null;

        try {
            // SqlParser.g:283:22: ( ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) )
            // SqlParser.g:283:24: ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE )
            {
            root_0 = (Object)adaptor.nil();

            ON282=(Token)match(input,ON,FOLLOW_ON_in_table_conflict_clause2509); 
            CONFLICT283=(Token)match(input,CONFLICT,FOLLOW_CONFLICT_in_table_conflict_clause2512); 
            CONFLICT283_tree = (Object)adaptor.create(CONFLICT283);
            root_0 = (Object)adaptor.becomeRoot(CONFLICT283_tree, root_0);

            set284=(Token)input.LT(1);
            if ( input.LA(1)==ABORT||input.LA(1)==FAIL||input.LA(1)==IGNORE||input.LA(1)==REPLACE||input.LA(1)==ROLLBACK ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set284));
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
    // SqlParser.g:287:1: create_virtual_table_stmt : CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )? ;
    public final SqlParser.create_virtual_table_stmt_return create_virtual_table_stmt() throws RecognitionException {
        SqlParser.create_virtual_table_stmt_return retval = new SqlParser.create_virtual_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE285=null;
        Token VIRTUAL286=null;
        Token TABLE287=null;
        Token DOT288=null;
        Token USING289=null;
        Token LPAREN290=null;
        Token COMMA292=null;
        Token RPAREN294=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.id_return module_name = null;

        SqlParser.column_def_return column_def291 = null;

        SqlParser.column_def_return column_def293 = null;


        Object CREATE285_tree=null;
        Object VIRTUAL286_tree=null;
        Object TABLE287_tree=null;
        Object DOT288_tree=null;
        Object USING289_tree=null;
        Object LPAREN290_tree=null;
        Object COMMA292_tree=null;
        Object RPAREN294_tree=null;

        try {
            // SqlParser.g:287:26: ( CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )? )
            // SqlParser.g:287:28: CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            CREATE285=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_virtual_table_stmt2542); 
            CREATE285_tree = (Object)adaptor.create(CREATE285);
            adaptor.addChild(root_0, CREATE285_tree);

            VIRTUAL286=(Token)match(input,VIRTUAL,FOLLOW_VIRTUAL_in_create_virtual_table_stmt2544); 
            VIRTUAL286_tree = (Object)adaptor.create(VIRTUAL286);
            adaptor.addChild(root_0, VIRTUAL286_tree);

            TABLE287=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_virtual_table_stmt2546); 
            TABLE287_tree = (Object)adaptor.create(TABLE287);
            adaptor.addChild(root_0, TABLE287_tree);

            // SqlParser.g:287:49: (database_name= id DOT )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==ID) ) {
                int LA110_1 = input.LA(2);

                if ( (LA110_1==DOT) ) {
                    alt110=1;
                }
            }
            else if ( ((LA110_0>=ABORT && LA110_0<=FROM)||(LA110_0>=GROUP && LA110_0<=IMMEDIATE)||(LA110_0>=INDEX && LA110_0<=IS)||(LA110_0>=JOIN && LA110_0<=LEFT)||LA110_0==LIMIT||LA110_0==NATURAL||(LA110_0>=NULL && LA110_0<=REFERENCES)||(LA110_0>=REINDEX && LA110_0<=WHERE)) ) {
                int LA110_2 = input.LA(2);

                if ( (LA110_2==DOT) ) {
                    alt110=1;
                }
            }
            switch (alt110) {
                case 1 :
                    // SqlParser.g:287:50: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_virtual_table_stmt2551);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT288=(Token)match(input,DOT,FOLLOW_DOT_in_create_virtual_table_stmt2553); 
                    DOT288_tree = (Object)adaptor.create(DOT288);
                    adaptor.addChild(root_0, DOT288_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_virtual_table_stmt2559);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            USING289=(Token)match(input,USING,FOLLOW_USING_in_create_virtual_table_stmt2563); 
            USING289_tree = (Object)adaptor.create(USING289);
            adaptor.addChild(root_0, USING289_tree);

            pushFollow(FOLLOW_id_in_create_virtual_table_stmt2567);
            module_name=id();

            state._fsp--;

            adaptor.addChild(root_0, module_name.getTree());
            // SqlParser.g:288:24: ( LPAREN column_def ( COMMA column_def )* RPAREN )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==LPAREN) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // SqlParser.g:288:25: LPAREN column_def ( COMMA column_def )* RPAREN
                    {
                    LPAREN290=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_virtual_table_stmt2570); 
                    LPAREN290_tree = (Object)adaptor.create(LPAREN290);
                    adaptor.addChild(root_0, LPAREN290_tree);

                    pushFollow(FOLLOW_column_def_in_create_virtual_table_stmt2572);
                    column_def291=column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, column_def291.getTree());
                    // SqlParser.g:288:43: ( COMMA column_def )*
                    loop111:
                    do {
                        int alt111=2;
                        int LA111_0 = input.LA(1);

                        if ( (LA111_0==COMMA) ) {
                            alt111=1;
                        }


                        switch (alt111) {
                    	case 1 :
                    	    // SqlParser.g:288:44: COMMA column_def
                    	    {
                    	    COMMA292=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_virtual_table_stmt2575); 
                    	    COMMA292_tree = (Object)adaptor.create(COMMA292);
                    	    adaptor.addChild(root_0, COMMA292_tree);

                    	    pushFollow(FOLLOW_column_def_in_create_virtual_table_stmt2577);
                    	    column_def293=column_def();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, column_def293.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop111;
                        }
                    } while (true);

                    RPAREN294=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_virtual_table_stmt2581); 
                    RPAREN294_tree = (Object)adaptor.create(RPAREN294);
                    adaptor.addChild(root_0, RPAREN294_tree);


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
    // SqlParser.g:291:1: create_table_stmt : CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt ) -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? ) ;
    public final SqlParser.create_table_stmt_return create_table_stmt() throws RecognitionException {
        SqlParser.create_table_stmt_return retval = new SqlParser.create_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE295=null;
        Token TEMPORARY296=null;
        Token TABLE297=null;
        Token IF298=null;
        Token NOT299=null;
        Token EXISTS300=null;
        Token DOT301=null;
        Token LPAREN302=null;
        Token COMMA304=null;
        Token COMMA306=null;
        Token RPAREN308=null;
        Token AS309=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.column_def_return column_def303 = null;

        SqlParser.column_def_return column_def305 = null;

        SqlParser.table_constraint_return table_constraint307 = null;

        SqlParser.select_stmt_return select_stmt310 = null;


        Object CREATE295_tree=null;
        Object TEMPORARY296_tree=null;
        Object TABLE297_tree=null;
        Object IF298_tree=null;
        Object NOT299_tree=null;
        Object EXISTS300_tree=null;
        Object DOT301_tree=null;
        Object LPAREN302_tree=null;
        Object COMMA304_tree=null;
        Object COMMA306_tree=null;
        Object RPAREN308_tree=null;
        Object AS309_tree=null;
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
            // SqlParser.g:291:18: ( CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt ) -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? ) )
            // SqlParser.g:291:20: CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt )
            {
            CREATE295=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_table_stmt2591);  
            stream_CREATE.add(CREATE295);

            // SqlParser.g:291:27: ( TEMPORARY )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==TEMPORARY) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // SqlParser.g:291:27: TEMPORARY
                    {
                    TEMPORARY296=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_table_stmt2593);  
                    stream_TEMPORARY.add(TEMPORARY296);


                    }
                    break;

            }

            TABLE297=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_table_stmt2596);  
            stream_TABLE.add(TABLE297);

            // SqlParser.g:291:44: ( IF NOT EXISTS )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==IF) ) {
                int LA114_1 = input.LA(2);

                if ( (LA114_1==NOT) ) {
                    alt114=1;
                }
            }
            switch (alt114) {
                case 1 :
                    // SqlParser.g:291:45: IF NOT EXISTS
                    {
                    IF298=(Token)match(input,IF,FOLLOW_IF_in_create_table_stmt2599);  
                    stream_IF.add(IF298);

                    NOT299=(Token)match(input,NOT,FOLLOW_NOT_in_create_table_stmt2601);  
                    stream_NOT.add(NOT299);

                    EXISTS300=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_table_stmt2603);  
                    stream_EXISTS.add(EXISTS300);


                    }
                    break;

            }

            // SqlParser.g:291:61: (database_name= id DOT )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==ID) ) {
                int LA115_1 = input.LA(2);

                if ( (LA115_1==DOT) ) {
                    alt115=1;
                }
            }
            else if ( ((LA115_0>=ABORT && LA115_0<=FROM)||(LA115_0>=GROUP && LA115_0<=IMMEDIATE)||(LA115_0>=INDEX && LA115_0<=IS)||(LA115_0>=JOIN && LA115_0<=LEFT)||LA115_0==LIMIT||LA115_0==NATURAL||(LA115_0>=NULL && LA115_0<=REFERENCES)||(LA115_0>=REINDEX && LA115_0<=WHERE)) ) {
                int LA115_2 = input.LA(2);

                if ( (LA115_2==DOT) ) {
                    alt115=1;
                }
            }
            switch (alt115) {
                case 1 :
                    // SqlParser.g:291:62: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_table_stmt2610);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT301=(Token)match(input,DOT,FOLLOW_DOT_in_create_table_stmt2612);  
                    stream_DOT.add(DOT301);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_table_stmt2618);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());
            // SqlParser.g:292:3: ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt )
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==LPAREN) ) {
                alt118=1;
            }
            else if ( (LA118_0==AS) ) {
                alt118=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }
            switch (alt118) {
                case 1 :
                    // SqlParser.g:292:5: LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN
                    {
                    LPAREN302=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_table_stmt2624);  
                    stream_LPAREN.add(LPAREN302);

                    pushFollow(FOLLOW_column_def_in_create_table_stmt2626);
                    column_def303=column_def();

                    state._fsp--;

                    stream_column_def.add(column_def303.getTree());
                    // SqlParser.g:292:23: ( COMMA column_def )*
                    loop116:
                    do {
                        int alt116=2;
                        int LA116_0 = input.LA(1);

                        if ( (LA116_0==COMMA) ) {
                            switch ( input.LA(2) ) {
                            case PRIMARY:
                                {
                                int LA116_3 = input.LA(3);

                                if ( (LA116_3==COMMA||LA116_3==RPAREN||(LA116_3>=CHECK && LA116_3<=COLLATE)||LA116_3==CONSTRAINT||LA116_3==DEFAULT||LA116_3==NOT||LA116_3==PRIMARY||LA116_3==REFERENCES||LA116_3==UNIQUE||LA116_3==ID) ) {
                                    alt116=1;
                                }


                                }
                                break;
                            case UNIQUE:
                                {
                                int LA116_4 = input.LA(3);

                                if ( (LA116_4==COMMA||LA116_4==RPAREN||(LA116_4>=CHECK && LA116_4<=COLLATE)||LA116_4==CONSTRAINT||LA116_4==DEFAULT||LA116_4==NOT||LA116_4==PRIMARY||LA116_4==REFERENCES||LA116_4==UNIQUE||LA116_4==ID) ) {
                                    alt116=1;
                                }


                                }
                                break;
                            case CHECK:
                                {
                                int LA116_5 = input.LA(3);

                                if ( (LA116_5==COMMA||LA116_5==RPAREN||(LA116_5>=CHECK && LA116_5<=COLLATE)||LA116_5==CONSTRAINT||LA116_5==DEFAULT||LA116_5==NOT||LA116_5==PRIMARY||LA116_5==REFERENCES||LA116_5==UNIQUE||LA116_5==ID) ) {
                                    alt116=1;
                                }


                                }
                                break;
                            case FOREIGN:
                                {
                                int LA116_6 = input.LA(3);

                                if ( (LA116_6==COMMA||LA116_6==RPAREN||(LA116_6>=CHECK && LA116_6<=COLLATE)||LA116_6==CONSTRAINT||LA116_6==DEFAULT||LA116_6==NOT||LA116_6==PRIMARY||LA116_6==REFERENCES||LA116_6==UNIQUE||LA116_6==ID) ) {
                                    alt116=1;
                                }


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
                                alt116=1;
                                }
                                break;

                            }

                        }


                        switch (alt116) {
                    	case 1 :
                    	    // SqlParser.g:292:24: COMMA column_def
                    	    {
                    	    COMMA304=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_table_stmt2629);  
                    	    stream_COMMA.add(COMMA304);

                    	    pushFollow(FOLLOW_column_def_in_create_table_stmt2631);
                    	    column_def305=column_def();

                    	    state._fsp--;

                    	    stream_column_def.add(column_def305.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop116;
                        }
                    } while (true);

                    // SqlParser.g:292:43: ( COMMA table_constraint )*
                    loop117:
                    do {
                        int alt117=2;
                        int LA117_0 = input.LA(1);

                        if ( (LA117_0==COMMA) ) {
                            alt117=1;
                        }


                        switch (alt117) {
                    	case 1 :
                    	    // SqlParser.g:292:44: COMMA table_constraint
                    	    {
                    	    COMMA306=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_table_stmt2636);  
                    	    stream_COMMA.add(COMMA306);

                    	    pushFollow(FOLLOW_table_constraint_in_create_table_stmt2638);
                    	    table_constraint307=table_constraint();

                    	    state._fsp--;

                    	    stream_table_constraint.add(table_constraint307.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop117;
                        }
                    } while (true);

                    RPAREN308=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_table_stmt2642);  
                    stream_RPAREN.add(RPAREN308);


                    }
                    break;
                case 2 :
                    // SqlParser.g:293:5: AS select_stmt
                    {
                    AS309=(Token)match(input,AS,FOLLOW_AS_in_create_table_stmt2648);  
                    stream_AS.add(AS309);

                    pushFollow(FOLLOW_select_stmt_in_create_table_stmt2650);
                    select_stmt310=select_stmt();

                    state._fsp--;

                    stream_select_stmt.add(select_stmt310.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: table_name, table_constraint, column_def, select_stmt, database_name, TEMPORARY, EXISTS
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
            // 294:1: -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? )
            {
                // SqlParser.g:294:4: ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CREATE_TABLE, "CREATE_TABLE"), root_1);

                // SqlParser.g:294:19: ^( OPTIONS ( TEMPORARY )? ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:294:29: ( TEMPORARY )?
                if ( stream_TEMPORARY.hasNext() ) {
                    adaptor.addChild(root_2, stream_TEMPORARY.nextNode());

                }
                stream_TEMPORARY.reset();
                // SqlParser.g:294:40: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:294:49: ^( $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                // SqlParser.g:294:63: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:295:3: ( ^( COLUMNS ( column_def )+ ) )?
                if ( stream_column_def.hasNext() ) {
                    // SqlParser.g:295:3: ^( COLUMNS ( column_def )+ )
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
                // SqlParser.g:295:27: ( ^( CONSTRAINTS ( table_constraint )* ) )?
                if ( stream_table_constraint.hasNext() ) {
                    // SqlParser.g:295:27: ^( CONSTRAINTS ( table_constraint )* )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRAINTS, "CONSTRAINTS"), root_2);

                    // SqlParser.g:295:41: ( table_constraint )*
                    while ( stream_table_constraint.hasNext() ) {
                        adaptor.addChild(root_2, stream_table_constraint.nextTree());

                    }
                    stream_table_constraint.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_table_constraint.reset();
                // SqlParser.g:295:61: ( select_stmt )?
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
    // SqlParser.g:297:1: column_def : name= id_column_def ( type_name )? ( column_constraint )* -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? ) ;
    public final SqlParser.column_def_return column_def() throws RecognitionException {
        SqlParser.column_def_return retval = new SqlParser.column_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.id_column_def_return name = null;

        SqlParser.type_name_return type_name311 = null;

        SqlParser.column_constraint_return column_constraint312 = null;


        RewriteRuleSubtreeStream stream_column_constraint=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint");
        RewriteRuleSubtreeStream stream_id_column_def=new RewriteRuleSubtreeStream(adaptor,"rule id_column_def");
        RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");
        try {
            // SqlParser.g:297:11: (name= id_column_def ( type_name )? ( column_constraint )* -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? ) )
            // SqlParser.g:297:13: name= id_column_def ( type_name )? ( column_constraint )*
            {
            pushFollow(FOLLOW_id_column_def_in_column_def2706);
            name=id_column_def();

            state._fsp--;

            stream_id_column_def.add(name.getTree());
            // SqlParser.g:297:32: ( type_name )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==ID) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // SqlParser.g:297:32: type_name
                    {
                    pushFollow(FOLLOW_type_name_in_column_def2708);
                    type_name311=type_name();

                    state._fsp--;

                    stream_type_name.add(type_name311.getTree());

                    }
                    break;

            }

            // SqlParser.g:297:43: ( column_constraint )*
            loop120:
            do {
                int alt120=2;
                int LA120_0 = input.LA(1);

                if ( ((LA120_0>=CHECK && LA120_0<=COLLATE)||LA120_0==CONSTRAINT||LA120_0==DEFAULT||LA120_0==NOT||LA120_0==PRIMARY||LA120_0==REFERENCES||LA120_0==UNIQUE) ) {
                    alt120=1;
                }


                switch (alt120) {
            	case 1 :
            	    // SqlParser.g:297:43: column_constraint
            	    {
            	    pushFollow(FOLLOW_column_constraint_in_column_def2711);
            	    column_constraint312=column_constraint();

            	    state._fsp--;

            	    stream_column_constraint.add(column_constraint312.getTree());

            	    }
            	    break;

            	default :
            	    break loop120;
                }
            } while (true);



            // AST REWRITE
            // elements: column_constraint, type_name, name
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 298:1: -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? )
            {
                // SqlParser.g:298:4: ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_name.nextNode(), root_1);

                // SqlParser.g:298:12: ^( CONSTRAINTS ( column_constraint )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRAINTS, "CONSTRAINTS"), root_2);

                // SqlParser.g:298:26: ( column_constraint )*
                while ( stream_column_constraint.hasNext() ) {
                    adaptor.addChild(root_2, stream_column_constraint.nextTree());

                }
                stream_column_constraint.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:298:46: ( type_name )?
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
    // SqlParser.g:300:1: column_constraint : ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause ) -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? ) ;
    public final SqlParser.column_constraint_return column_constraint() throws RecognitionException {
        SqlParser.column_constraint_return retval = new SqlParser.column_constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONSTRAINT313=null;
        SqlParser.id_return name = null;

        SqlParser.column_constraint_pk_return column_constraint_pk314 = null;

        SqlParser.column_constraint_not_null_return column_constraint_not_null315 = null;

        SqlParser.column_constraint_unique_return column_constraint_unique316 = null;

        SqlParser.column_constraint_check_return column_constraint_check317 = null;

        SqlParser.column_constraint_default_return column_constraint_default318 = null;

        SqlParser.column_constraint_collate_return column_constraint_collate319 = null;

        SqlParser.fk_clause_return fk_clause320 = null;


        Object CONSTRAINT313_tree=null;
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
            // SqlParser.g:300:18: ( ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause ) -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? ) )
            // SqlParser.g:300:20: ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause )
            {
            // SqlParser.g:300:20: ( CONSTRAINT name= id )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==CONSTRAINT) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // SqlParser.g:300:21: CONSTRAINT name= id
                    {
                    CONSTRAINT313=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_column_constraint2737);  
                    stream_CONSTRAINT.add(CONSTRAINT313);

                    pushFollow(FOLLOW_id_in_column_constraint2741);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());

                    }
                    break;

            }

            // SqlParser.g:301:3: ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause )
            int alt122=7;
            switch ( input.LA(1) ) {
            case PRIMARY:
                {
                alt122=1;
                }
                break;
            case NOT:
                {
                alt122=2;
                }
                break;
            case UNIQUE:
                {
                alt122=3;
                }
                break;
            case CHECK:
                {
                alt122=4;
                }
                break;
            case DEFAULT:
                {
                alt122=5;
                }
                break;
            case COLLATE:
                {
                alt122=6;
                }
                break;
            case REFERENCES:
                {
                alt122=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }

            switch (alt122) {
                case 1 :
                    // SqlParser.g:301:5: column_constraint_pk
                    {
                    pushFollow(FOLLOW_column_constraint_pk_in_column_constraint2749);
                    column_constraint_pk314=column_constraint_pk();

                    state._fsp--;

                    stream_column_constraint_pk.add(column_constraint_pk314.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:302:5: column_constraint_not_null
                    {
                    pushFollow(FOLLOW_column_constraint_not_null_in_column_constraint2755);
                    column_constraint_not_null315=column_constraint_not_null();

                    state._fsp--;

                    stream_column_constraint_not_null.add(column_constraint_not_null315.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:303:5: column_constraint_unique
                    {
                    pushFollow(FOLLOW_column_constraint_unique_in_column_constraint2761);
                    column_constraint_unique316=column_constraint_unique();

                    state._fsp--;

                    stream_column_constraint_unique.add(column_constraint_unique316.getTree());

                    }
                    break;
                case 4 :
                    // SqlParser.g:304:5: column_constraint_check
                    {
                    pushFollow(FOLLOW_column_constraint_check_in_column_constraint2767);
                    column_constraint_check317=column_constraint_check();

                    state._fsp--;

                    stream_column_constraint_check.add(column_constraint_check317.getTree());

                    }
                    break;
                case 5 :
                    // SqlParser.g:305:5: column_constraint_default
                    {
                    pushFollow(FOLLOW_column_constraint_default_in_column_constraint2773);
                    column_constraint_default318=column_constraint_default();

                    state._fsp--;

                    stream_column_constraint_default.add(column_constraint_default318.getTree());

                    }
                    break;
                case 6 :
                    // SqlParser.g:306:5: column_constraint_collate
                    {
                    pushFollow(FOLLOW_column_constraint_collate_in_column_constraint2779);
                    column_constraint_collate319=column_constraint_collate();

                    state._fsp--;

                    stream_column_constraint_collate.add(column_constraint_collate319.getTree());

                    }
                    break;
                case 7 :
                    // SqlParser.g:307:5: fk_clause
                    {
                    pushFollow(FOLLOW_fk_clause_in_column_constraint2785);
                    fk_clause320=fk_clause();

                    state._fsp--;

                    stream_fk_clause.add(fk_clause320.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: name, column_constraint_unique, column_constraint_default, column_constraint_check, column_constraint_collate, fk_clause, column_constraint_not_null, column_constraint_pk
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 308:1: -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? )
            {
                // SqlParser.g:308:4: ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMN_CONSTRAINT, "COLUMN_CONSTRAINT"), root_1);

                // SqlParser.g:309:3: ( column_constraint_pk )?
                if ( stream_column_constraint_pk.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_pk.nextTree());

                }
                stream_column_constraint_pk.reset();
                // SqlParser.g:310:3: ( column_constraint_not_null )?
                if ( stream_column_constraint_not_null.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_not_null.nextTree());

                }
                stream_column_constraint_not_null.reset();
                // SqlParser.g:311:3: ( column_constraint_unique )?
                if ( stream_column_constraint_unique.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_unique.nextTree());

                }
                stream_column_constraint_unique.reset();
                // SqlParser.g:312:3: ( column_constraint_check )?
                if ( stream_column_constraint_check.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_check.nextTree());

                }
                stream_column_constraint_check.reset();
                // SqlParser.g:313:3: ( column_constraint_default )?
                if ( stream_column_constraint_default.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_default.nextTree());

                }
                stream_column_constraint_default.reset();
                // SqlParser.g:314:3: ( column_constraint_collate )?
                if ( stream_column_constraint_collate.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_collate.nextTree());

                }
                stream_column_constraint_collate.reset();
                // SqlParser.g:315:3: ( fk_clause )?
                if ( stream_fk_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_fk_clause.nextTree());

                }
                stream_fk_clause.reset();
                // SqlParser.g:316:3: ( $name)?
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
    // SqlParser.g:318:1: column_constraint_pk : PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )? ;
    public final SqlParser.column_constraint_pk_return column_constraint_pk() throws RecognitionException {
        SqlParser.column_constraint_pk_return retval = new SqlParser.column_constraint_pk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRIMARY321=null;
        Token KEY322=null;
        Token set323=null;
        Token AUTOINCREMENT325=null;
        SqlParser.table_conflict_clause_return table_conflict_clause324 = null;


        Object PRIMARY321_tree=null;
        Object KEY322_tree=null;
        Object set323_tree=null;
        Object AUTOINCREMENT325_tree=null;

        try {
            // SqlParser.g:318:21: ( PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )? )
            // SqlParser.g:318:23: PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )?
            {
            root_0 = (Object)adaptor.nil();

            PRIMARY321=(Token)match(input,PRIMARY,FOLLOW_PRIMARY_in_column_constraint_pk2840); 
            PRIMARY321_tree = (Object)adaptor.create(PRIMARY321);
            root_0 = (Object)adaptor.becomeRoot(PRIMARY321_tree, root_0);

            KEY322=(Token)match(input,KEY,FOLLOW_KEY_in_column_constraint_pk2843); 
            // SqlParser.g:318:37: ( ASC | DESC )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==ASC||LA123_0==DESC) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // SqlParser.g:
                    {
                    set323=(Token)input.LT(1);
                    if ( input.LA(1)==ASC||input.LA(1)==DESC ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set323));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            // SqlParser.g:318:51: ( table_conflict_clause )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==ON) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // SqlParser.g:318:51: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_pk2855);
                    table_conflict_clause324=table_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, table_conflict_clause324.getTree());

                    }
                    break;

            }

            // SqlParser.g:318:74: ( AUTOINCREMENT )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==AUTOINCREMENT) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // SqlParser.g:318:75: AUTOINCREMENT
                    {
                    AUTOINCREMENT325=(Token)match(input,AUTOINCREMENT,FOLLOW_AUTOINCREMENT_in_column_constraint_pk2859); 
                    AUTOINCREMENT325_tree = (Object)adaptor.create(AUTOINCREMENT325);
                    adaptor.addChild(root_0, AUTOINCREMENT325_tree);


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
    // SqlParser.g:320:1: column_constraint_not_null : NOT NULL ( table_conflict_clause )? -> ^( NOT_NULL ( table_conflict_clause )? ) ;
    public final SqlParser.column_constraint_not_null_return column_constraint_not_null() throws RecognitionException {
        SqlParser.column_constraint_not_null_return retval = new SqlParser.column_constraint_not_null_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT326=null;
        Token NULL327=null;
        SqlParser.table_conflict_clause_return table_conflict_clause328 = null;


        Object NOT326_tree=null;
        Object NULL327_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // SqlParser.g:320:27: ( NOT NULL ( table_conflict_clause )? -> ^( NOT_NULL ( table_conflict_clause )? ) )
            // SqlParser.g:320:29: NOT NULL ( table_conflict_clause )?
            {
            NOT326=(Token)match(input,NOT,FOLLOW_NOT_in_column_constraint_not_null2868);  
            stream_NOT.add(NOT326);

            NULL327=(Token)match(input,NULL,FOLLOW_NULL_in_column_constraint_not_null2870);  
            stream_NULL.add(NULL327);

            // SqlParser.g:320:38: ( table_conflict_clause )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==ON) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // SqlParser.g:320:38: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_not_null2872);
                    table_conflict_clause328=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause328.getTree());

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
            // 320:61: -> ^( NOT_NULL ( table_conflict_clause )? )
            {
                // SqlParser.g:320:64: ^( NOT_NULL ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_NULL, "NOT_NULL"), root_1);

                // SqlParser.g:320:75: ( table_conflict_clause )?
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
    // SqlParser.g:322:1: column_constraint_unique : UNIQUE ( table_conflict_clause )? ;
    public final SqlParser.column_constraint_unique_return column_constraint_unique() throws RecognitionException {
        SqlParser.column_constraint_unique_return retval = new SqlParser.column_constraint_unique_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNIQUE329=null;
        SqlParser.table_conflict_clause_return table_conflict_clause330 = null;


        Object UNIQUE329_tree=null;

        try {
            // SqlParser.g:322:25: ( UNIQUE ( table_conflict_clause )? )
            // SqlParser.g:322:27: UNIQUE ( table_conflict_clause )?
            {
            root_0 = (Object)adaptor.nil();

            UNIQUE329=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_column_constraint_unique2889); 
            UNIQUE329_tree = (Object)adaptor.create(UNIQUE329);
            root_0 = (Object)adaptor.becomeRoot(UNIQUE329_tree, root_0);

            // SqlParser.g:322:35: ( table_conflict_clause )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==ON) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // SqlParser.g:322:35: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_unique2892);
                    table_conflict_clause330=table_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, table_conflict_clause330.getTree());

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
    // SqlParser.g:324:1: column_constraint_check : CHECK LPAREN expr RPAREN ;
    public final SqlParser.column_constraint_check_return column_constraint_check() throws RecognitionException {
        SqlParser.column_constraint_check_return retval = new SqlParser.column_constraint_check_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CHECK331=null;
        Token LPAREN332=null;
        Token RPAREN334=null;
        SqlParser.expr_return expr333 = null;


        Object CHECK331_tree=null;
        Object LPAREN332_tree=null;
        Object RPAREN334_tree=null;

        try {
            // SqlParser.g:324:24: ( CHECK LPAREN expr RPAREN )
            // SqlParser.g:324:26: CHECK LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            CHECK331=(Token)match(input,CHECK,FOLLOW_CHECK_in_column_constraint_check2900); 
            CHECK331_tree = (Object)adaptor.create(CHECK331);
            root_0 = (Object)adaptor.becomeRoot(CHECK331_tree, root_0);

            LPAREN332=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_column_constraint_check2903); 
            pushFollow(FOLLOW_expr_in_column_constraint_check2906);
            expr333=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr333.getTree());
            RPAREN334=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_column_constraint_check2908); 

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
    // SqlParser.g:327:1: column_constraint_default : DEFAULT ( ( PLUS | MINUS ) ( INTEGER | FLOAT ) | literal_value | LPAREN expr RPAREN ) ;
    public final SqlParser.column_constraint_default_return column_constraint_default() throws RecognitionException {
        SqlParser.column_constraint_default_return retval = new SqlParser.column_constraint_default_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT335=null;
        Token set336=null;
        Token set337=null;
        Token LPAREN339=null;
        Token RPAREN341=null;
        SqlParser.literal_value_return literal_value338 = null;

        SqlParser.expr_return expr340 = null;


        Object DEFAULT335_tree=null;
        Object set336_tree=null;
        Object set337_tree=null;
        Object LPAREN339_tree=null;
        Object RPAREN341_tree=null;

        try {
            // SqlParser.g:327:26: ( DEFAULT ( ( PLUS | MINUS ) ( INTEGER | FLOAT ) | literal_value | LPAREN expr RPAREN ) )
            // SqlParser.g:327:28: DEFAULT ( ( PLUS | MINUS ) ( INTEGER | FLOAT ) | literal_value | LPAREN expr RPAREN )
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT335=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_column_constraint_default2917); 
            DEFAULT335_tree = (Object)adaptor.create(DEFAULT335);
            root_0 = (Object)adaptor.becomeRoot(DEFAULT335_tree, root_0);

            // SqlParser.g:327:37: ( ( PLUS | MINUS ) ( INTEGER | FLOAT ) | literal_value | LPAREN expr RPAREN )
            int alt128=3;
            switch ( input.LA(1) ) {
            case PLUS:
            case MINUS:
                {
                alt128=1;
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
                alt128=2;
                }
                break;
            case LPAREN:
                {
                alt128=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }

            switch (alt128) {
                case 1 :
                    // SqlParser.g:327:38: ( PLUS | MINUS ) ( INTEGER | FLOAT )
                    {
                    set336=(Token)input.LT(1);
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set336));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    set337=(Token)input.LT(1);
                    if ( input.LA(1)==INTEGER||input.LA(1)==FLOAT ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set337));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:327:73: literal_value
                    {
                    pushFollow(FOLLOW_literal_value_in_column_constraint_default2939);
                    literal_value338=literal_value();

                    state._fsp--;

                    adaptor.addChild(root_0, literal_value338.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:327:89: LPAREN expr RPAREN
                    {
                    LPAREN339=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_column_constraint_default2943); 
                    pushFollow(FOLLOW_expr_in_column_constraint_default2946);
                    expr340=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr340.getTree());
                    RPAREN341=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_column_constraint_default2948); 

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
    // SqlParser.g:329:1: column_constraint_collate : COLLATE collation_name= id ;
    public final SqlParser.column_constraint_collate_return column_constraint_collate() throws RecognitionException {
        SqlParser.column_constraint_collate_return retval = new SqlParser.column_constraint_collate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLLATE342=null;
        SqlParser.id_return collation_name = null;


        Object COLLATE342_tree=null;

        try {
            // SqlParser.g:329:26: ( COLLATE collation_name= id )
            // SqlParser.g:329:28: COLLATE collation_name= id
            {
            root_0 = (Object)adaptor.nil();

            COLLATE342=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_column_constraint_collate2957); 
            COLLATE342_tree = (Object)adaptor.create(COLLATE342);
            root_0 = (Object)adaptor.becomeRoot(COLLATE342_tree, root_0);

            pushFollow(FOLLOW_id_in_column_constraint_collate2962);
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
    // SqlParser.g:331:1: table_constraint : ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk ) -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? ) ;
    public final SqlParser.table_constraint_return table_constraint() throws RecognitionException {
        SqlParser.table_constraint_return retval = new SqlParser.table_constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONSTRAINT343=null;
        SqlParser.id_return name = null;

        SqlParser.table_constraint_pk_return table_constraint_pk344 = null;

        SqlParser.table_constraint_unique_return table_constraint_unique345 = null;

        SqlParser.table_constraint_check_return table_constraint_check346 = null;

        SqlParser.table_constraint_fk_return table_constraint_fk347 = null;


        Object CONSTRAINT343_tree=null;
        RewriteRuleTokenStream stream_CONSTRAINT=new RewriteRuleTokenStream(adaptor,"token CONSTRAINT");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_table_constraint_pk=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_pk");
        RewriteRuleSubtreeStream stream_table_constraint_fk=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_fk");
        RewriteRuleSubtreeStream stream_table_constraint_unique=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_unique");
        RewriteRuleSubtreeStream stream_table_constraint_check=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_check");
        try {
            // SqlParser.g:331:17: ( ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk ) -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? ) )
            // SqlParser.g:331:19: ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk )
            {
            // SqlParser.g:331:19: ( CONSTRAINT name= id )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==CONSTRAINT) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // SqlParser.g:331:20: CONSTRAINT name= id
                    {
                    CONSTRAINT343=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_table_constraint2971);  
                    stream_CONSTRAINT.add(CONSTRAINT343);

                    pushFollow(FOLLOW_id_in_table_constraint2975);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());

                    }
                    break;

            }

            // SqlParser.g:332:3: ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk )
            int alt130=4;
            switch ( input.LA(1) ) {
            case PRIMARY:
                {
                alt130=1;
                }
                break;
            case UNIQUE:
                {
                alt130=2;
                }
                break;
            case CHECK:
                {
                alt130=3;
                }
                break;
            case FOREIGN:
                {
                alt130=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;
            }

            switch (alt130) {
                case 1 :
                    // SqlParser.g:332:5: table_constraint_pk
                    {
                    pushFollow(FOLLOW_table_constraint_pk_in_table_constraint2983);
                    table_constraint_pk344=table_constraint_pk();

                    state._fsp--;

                    stream_table_constraint_pk.add(table_constraint_pk344.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:333:5: table_constraint_unique
                    {
                    pushFollow(FOLLOW_table_constraint_unique_in_table_constraint2989);
                    table_constraint_unique345=table_constraint_unique();

                    state._fsp--;

                    stream_table_constraint_unique.add(table_constraint_unique345.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:334:5: table_constraint_check
                    {
                    pushFollow(FOLLOW_table_constraint_check_in_table_constraint2995);
                    table_constraint_check346=table_constraint_check();

                    state._fsp--;

                    stream_table_constraint_check.add(table_constraint_check346.getTree());

                    }
                    break;
                case 4 :
                    // SqlParser.g:335:5: table_constraint_fk
                    {
                    pushFollow(FOLLOW_table_constraint_fk_in_table_constraint3001);
                    table_constraint_fk347=table_constraint_fk();

                    state._fsp--;

                    stream_table_constraint_fk.add(table_constraint_fk347.getTree());

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
            // 336:1: -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? )
            {
                // SqlParser.g:336:4: ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TABLE_CONSTRAINT, "TABLE_CONSTRAINT"), root_1);

                // SqlParser.g:337:3: ( table_constraint_pk )?
                if ( stream_table_constraint_pk.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_pk.nextTree());

                }
                stream_table_constraint_pk.reset();
                // SqlParser.g:338:3: ( table_constraint_unique )?
                if ( stream_table_constraint_unique.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_unique.nextTree());

                }
                stream_table_constraint_unique.reset();
                // SqlParser.g:339:3: ( table_constraint_check )?
                if ( stream_table_constraint_check.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_check.nextTree());

                }
                stream_table_constraint_check.reset();
                // SqlParser.g:340:3: ( table_constraint_fk )?
                if ( stream_table_constraint_fk.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_fk.nextTree());

                }
                stream_table_constraint_fk.reset();
                // SqlParser.g:341:3: ( $name)?
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
    // SqlParser.g:343:1: table_constraint_pk : PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) ;
    public final SqlParser.table_constraint_pk_return table_constraint_pk() throws RecognitionException {
        SqlParser.table_constraint_pk_return retval = new SqlParser.table_constraint_pk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRIMARY348=null;
        Token KEY349=null;
        Token LPAREN350=null;
        Token COMMA351=null;
        Token RPAREN352=null;
        List list_indexed_columns=null;
        SqlParser.table_conflict_clause_return table_conflict_clause353 = null;

        SqlParser.id_return indexed_columns = null;
         indexed_columns = null;
        Object PRIMARY348_tree=null;
        Object KEY349_tree=null;
        Object LPAREN350_tree=null;
        Object COMMA351_tree=null;
        Object RPAREN352_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_PRIMARY=new RewriteRuleTokenStream(adaptor,"token PRIMARY");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // SqlParser.g:343:20: ( PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) )
            // SqlParser.g:343:22: PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )?
            {
            PRIMARY348=(Token)match(input,PRIMARY,FOLLOW_PRIMARY_in_table_constraint_pk3041);  
            stream_PRIMARY.add(PRIMARY348);

            KEY349=(Token)match(input,KEY,FOLLOW_KEY_in_table_constraint_pk3043);  
            stream_KEY.add(KEY349);

            LPAREN350=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_pk3047);  
            stream_LPAREN.add(LPAREN350);

            pushFollow(FOLLOW_id_in_table_constraint_pk3051);
            indexed_columns=id();

            state._fsp--;

            stream_id.add(indexed_columns.getTree());
            if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            list_indexed_columns.add(indexed_columns.getTree());

            // SqlParser.g:344:30: ( COMMA indexed_columns+= id )*
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( (LA131_0==COMMA) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // SqlParser.g:344:31: COMMA indexed_columns+= id
            	    {
            	    COMMA351=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_pk3054);  
            	    stream_COMMA.add(COMMA351);

            	    pushFollow(FOLLOW_id_in_table_constraint_pk3058);
            	    indexed_columns=id();

            	    state._fsp--;

            	    stream_id.add(indexed_columns.getTree());
            	    if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            	    list_indexed_columns.add(indexed_columns.getTree());


            	    }
            	    break;

            	default :
            	    break loop131;
                }
            } while (true);

            RPAREN352=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_pk3062);  
            stream_RPAREN.add(RPAREN352);

            // SqlParser.g:344:66: ( table_conflict_clause )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==ON) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // SqlParser.g:344:66: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_table_constraint_pk3064);
                    table_conflict_clause353=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause353.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: table_conflict_clause, indexed_columns, PRIMARY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: indexed_columns
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_indexed_columns=new RewriteRuleSubtreeStream(adaptor,"token indexed_columns",list_indexed_columns);
            root_0 = (Object)adaptor.nil();
            // 345:1: -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
            {
                // SqlParser.g:345:4: ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_PRIMARY.nextNode(), root_1);

                // SqlParser.g:345:14: ^( COLUMNS ( $indexed_columns)+ )
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
                // SqlParser.g:345:43: ( table_conflict_clause )?
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
    // SqlParser.g:347:1: table_constraint_unique : UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) ;
    public final SqlParser.table_constraint_unique_return table_constraint_unique() throws RecognitionException {
        SqlParser.table_constraint_unique_return retval = new SqlParser.table_constraint_unique_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNIQUE354=null;
        Token LPAREN355=null;
        Token COMMA356=null;
        Token RPAREN357=null;
        List list_indexed_columns=null;
        SqlParser.table_conflict_clause_return table_conflict_clause358 = null;

        SqlParser.id_return indexed_columns = null;
         indexed_columns = null;
        Object UNIQUE354_tree=null;
        Object LPAREN355_tree=null;
        Object COMMA356_tree=null;
        Object RPAREN357_tree=null;
        RewriteRuleTokenStream stream_UNIQUE=new RewriteRuleTokenStream(adaptor,"token UNIQUE");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // SqlParser.g:347:24: ( UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) )
            // SqlParser.g:347:26: UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )?
            {
            UNIQUE354=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_table_constraint_unique3089);  
            stream_UNIQUE.add(UNIQUE354);

            LPAREN355=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_unique3093);  
            stream_LPAREN.add(LPAREN355);

            pushFollow(FOLLOW_id_in_table_constraint_unique3097);
            indexed_columns=id();

            state._fsp--;

            stream_id.add(indexed_columns.getTree());
            if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            list_indexed_columns.add(indexed_columns.getTree());

            // SqlParser.g:348:30: ( COMMA indexed_columns+= id )*
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==COMMA) ) {
                    alt133=1;
                }


                switch (alt133) {
            	case 1 :
            	    // SqlParser.g:348:31: COMMA indexed_columns+= id
            	    {
            	    COMMA356=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_unique3100);  
            	    stream_COMMA.add(COMMA356);

            	    pushFollow(FOLLOW_id_in_table_constraint_unique3104);
            	    indexed_columns=id();

            	    state._fsp--;

            	    stream_id.add(indexed_columns.getTree());
            	    if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            	    list_indexed_columns.add(indexed_columns.getTree());


            	    }
            	    break;

            	default :
            	    break loop133;
                }
            } while (true);

            RPAREN357=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_unique3108);  
            stream_RPAREN.add(RPAREN357);

            // SqlParser.g:348:66: ( table_conflict_clause )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==ON) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // SqlParser.g:348:66: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_table_constraint_unique3110);
                    table_conflict_clause358=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause358.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: table_conflict_clause, indexed_columns, UNIQUE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: indexed_columns
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_indexed_columns=new RewriteRuleSubtreeStream(adaptor,"token indexed_columns",list_indexed_columns);
            root_0 = (Object)adaptor.nil();
            // 349:1: -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
            {
                // SqlParser.g:349:4: ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_UNIQUE.nextNode(), root_1);

                // SqlParser.g:349:13: ^( COLUMNS ( $indexed_columns)+ )
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
                // SqlParser.g:349:42: ( table_conflict_clause )?
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
    // SqlParser.g:351:1: table_constraint_check : CHECK LPAREN expr RPAREN ;
    public final SqlParser.table_constraint_check_return table_constraint_check() throws RecognitionException {
        SqlParser.table_constraint_check_return retval = new SqlParser.table_constraint_check_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CHECK359=null;
        Token LPAREN360=null;
        Token RPAREN362=null;
        SqlParser.expr_return expr361 = null;


        Object CHECK359_tree=null;
        Object LPAREN360_tree=null;
        Object RPAREN362_tree=null;

        try {
            // SqlParser.g:351:23: ( CHECK LPAREN expr RPAREN )
            // SqlParser.g:351:25: CHECK LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            CHECK359=(Token)match(input,CHECK,FOLLOW_CHECK_in_table_constraint_check3135); 
            CHECK359_tree = (Object)adaptor.create(CHECK359);
            root_0 = (Object)adaptor.becomeRoot(CHECK359_tree, root_0);

            LPAREN360=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_check3138); 
            pushFollow(FOLLOW_expr_in_table_constraint_check3141);
            expr361=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr361.getTree());
            RPAREN362=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_check3143); 

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
    // SqlParser.g:353:1: table_constraint_fk : FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause ) ;
    public final SqlParser.table_constraint_fk_return table_constraint_fk() throws RecognitionException {
        SqlParser.table_constraint_fk_return retval = new SqlParser.table_constraint_fk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOREIGN363=null;
        Token KEY364=null;
        Token LPAREN365=null;
        Token COMMA366=null;
        Token RPAREN367=null;
        List list_column_names=null;
        SqlParser.fk_clause_return fk_clause368 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object FOREIGN363_tree=null;
        Object KEY364_tree=null;
        Object LPAREN365_tree=null;
        Object COMMA366_tree=null;
        Object RPAREN367_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_FOREIGN=new RewriteRuleTokenStream(adaptor,"token FOREIGN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_fk_clause=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause");
        try {
            // SqlParser.g:353:20: ( FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause ) )
            // SqlParser.g:353:22: FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause
            {
            FOREIGN363=(Token)match(input,FOREIGN,FOLLOW_FOREIGN_in_table_constraint_fk3151);  
            stream_FOREIGN.add(FOREIGN363);

            KEY364=(Token)match(input,KEY,FOLLOW_KEY_in_table_constraint_fk3153);  
            stream_KEY.add(KEY364);

            LPAREN365=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_fk3155);  
            stream_LPAREN.add(LPAREN365);

            pushFollow(FOLLOW_id_in_table_constraint_fk3159);
            column_names=id();

            state._fsp--;

            stream_id.add(column_names.getTree());
            if (list_column_names==null) list_column_names=new ArrayList();
            list_column_names.add(column_names.getTree());

            // SqlParser.g:353:58: ( COMMA column_names+= id )*
            loop135:
            do {
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( (LA135_0==COMMA) ) {
                    alt135=1;
                }


                switch (alt135) {
            	case 1 :
            	    // SqlParser.g:353:59: COMMA column_names+= id
            	    {
            	    COMMA366=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_fk3162);  
            	    stream_COMMA.add(COMMA366);

            	    pushFollow(FOLLOW_id_in_table_constraint_fk3166);
            	    column_names=id();

            	    state._fsp--;

            	    stream_id.add(column_names.getTree());
            	    if (list_column_names==null) list_column_names=new ArrayList();
            	    list_column_names.add(column_names.getTree());


            	    }
            	    break;

            	default :
            	    break loop135;
                }
            } while (true);

            RPAREN367=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_fk3170);  
            stream_RPAREN.add(RPAREN367);

            pushFollow(FOLLOW_fk_clause_in_table_constraint_fk3172);
            fk_clause368=fk_clause();

            state._fsp--;

            stream_fk_clause.add(fk_clause368.getTree());


            // AST REWRITE
            // elements: FOREIGN, fk_clause, column_names
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: column_names
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_column_names=new RewriteRuleSubtreeStream(adaptor,"token column_names",list_column_names);
            root_0 = (Object)adaptor.nil();
            // 354:1: -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause )
            {
                // SqlParser.g:354:4: ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FOREIGN.nextNode(), root_1);

                // SqlParser.g:354:14: ^( COLUMNS ( $column_names)+ )
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
    // SqlParser.g:356:1: fk_clause : REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )? -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )+ ( fk_clause_deferrable )? ) ;
    public final SqlParser.fk_clause_return fk_clause() throws RecognitionException {
        SqlParser.fk_clause_return retval = new SqlParser.fk_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REFERENCES369=null;
        Token LPAREN370=null;
        Token COMMA371=null;
        Token RPAREN372=null;
        List list_column_names=null;
        SqlParser.id_return foreign_table = null;

        SqlParser.fk_clause_action_return fk_clause_action373 = null;

        SqlParser.fk_clause_deferrable_return fk_clause_deferrable374 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object REFERENCES369_tree=null;
        Object LPAREN370_tree=null;
        Object COMMA371_tree=null;
        Object RPAREN372_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_REFERENCES=new RewriteRuleTokenStream(adaptor,"token REFERENCES");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_fk_clause_action=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause_action");
        RewriteRuleSubtreeStream stream_fk_clause_deferrable=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause_deferrable");
        try {
            // SqlParser.g:356:10: ( REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )? -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )+ ( fk_clause_deferrable )? ) )
            // SqlParser.g:356:12: REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )?
            {
            REFERENCES369=(Token)match(input,REFERENCES,FOLLOW_REFERENCES_in_fk_clause3195);  
            stream_REFERENCES.add(REFERENCES369);

            pushFollow(FOLLOW_id_in_fk_clause3199);
            foreign_table=id();

            state._fsp--;

            stream_id.add(foreign_table.getTree());
            // SqlParser.g:356:40: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==LPAREN) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // SqlParser.g:356:41: LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                    {
                    LPAREN370=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_fk_clause3202);  
                    stream_LPAREN.add(LPAREN370);

                    pushFollow(FOLLOW_id_in_fk_clause3206);
                    column_names=id();

                    state._fsp--;

                    stream_id.add(column_names.getTree());
                    if (list_column_names==null) list_column_names=new ArrayList();
                    list_column_names.add(column_names.getTree());

                    // SqlParser.g:356:65: ( COMMA column_names+= id )*
                    loop136:
                    do {
                        int alt136=2;
                        int LA136_0 = input.LA(1);

                        if ( (LA136_0==COMMA) ) {
                            alt136=1;
                        }


                        switch (alt136) {
                    	case 1 :
                    	    // SqlParser.g:356:66: COMMA column_names+= id
                    	    {
                    	    COMMA371=(Token)match(input,COMMA,FOLLOW_COMMA_in_fk_clause3209);  
                    	    stream_COMMA.add(COMMA371);

                    	    pushFollow(FOLLOW_id_in_fk_clause3213);
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

                    RPAREN372=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_fk_clause3217);  
                    stream_RPAREN.add(RPAREN372);


                    }
                    break;

            }

            // SqlParser.g:357:3: ( fk_clause_action )+
            int cnt138=0;
            loop138:
            do {
                int alt138=2;
                int LA138_0 = input.LA(1);

                if ( (LA138_0==MATCH||LA138_0==ON) ) {
                    alt138=1;
                }


                switch (alt138) {
            	case 1 :
            	    // SqlParser.g:357:3: fk_clause_action
            	    {
            	    pushFollow(FOLLOW_fk_clause_action_in_fk_clause3223);
            	    fk_clause_action373=fk_clause_action();

            	    state._fsp--;

            	    stream_fk_clause_action.add(fk_clause_action373.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt138 >= 1 ) break loop138;
                        EarlyExitException eee =
                            new EarlyExitException(138, input);
                        throw eee;
                }
                cnt138++;
            } while (true);

            // SqlParser.g:357:21: ( fk_clause_deferrable )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==NOT) ) {
                int LA139_1 = input.LA(2);

                if ( (LA139_1==DEFERRABLE) ) {
                    alt139=1;
                }
            }
            else if ( (LA139_0==DEFERRABLE) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // SqlParser.g:357:21: fk_clause_deferrable
                    {
                    pushFollow(FOLLOW_fk_clause_deferrable_in_fk_clause3226);
                    fk_clause_deferrable374=fk_clause_deferrable();

                    state._fsp--;

                    stream_fk_clause_deferrable.add(fk_clause_deferrable374.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: fk_clause_deferrable, fk_clause_action, column_names, foreign_table, REFERENCES
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
            // 358:1: -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )+ ( fk_clause_deferrable )? )
            {
                // SqlParser.g:358:4: ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )+ ( fk_clause_deferrable )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_REFERENCES.nextNode(), root_1);

                adaptor.addChild(root_1, stream_foreign_table.nextTree());
                // SqlParser.g:358:32: ^( COLUMNS ( $column_names)+ )
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
                // SqlParser.g:358:76: ( fk_clause_deferrable )?
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
    // SqlParser.g:360:1: fk_clause_action : ( ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT ) | MATCH id );
    public final SqlParser.fk_clause_action_return fk_clause_action() throws RecognitionException {
        SqlParser.fk_clause_action_return retval = new SqlParser.fk_clause_action_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ON375=null;
        Token set376=null;
        Token SET377=null;
        Token NULL378=null;
        Token SET379=null;
        Token DEFAULT380=null;
        Token CASCADE381=null;
        Token RESTRICT382=null;
        Token MATCH383=null;
        SqlParser.id_return id384 = null;


        Object ON375_tree=null;
        Object set376_tree=null;
        Object SET377_tree=null;
        Object NULL378_tree=null;
        Object SET379_tree=null;
        Object DEFAULT380_tree=null;
        Object CASCADE381_tree=null;
        Object RESTRICT382_tree=null;
        Object MATCH383_tree=null;

        try {
            // SqlParser.g:361:3: ( ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT ) | MATCH id )
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==ON) ) {
                alt141=1;
            }
            else if ( (LA141_0==MATCH) ) {
                alt141=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 141, 0, input);

                throw nvae;
            }
            switch (alt141) {
                case 1 :
                    // SqlParser.g:361:5: ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT )
                    {
                    root_0 = (Object)adaptor.nil();

                    ON375=(Token)match(input,ON,FOLLOW_ON_in_fk_clause_action3260); 
                    ON375_tree = (Object)adaptor.create(ON375);
                    root_0 = (Object)adaptor.becomeRoot(ON375_tree, root_0);

                    set376=(Token)input.LT(1);
                    if ( input.LA(1)==DELETE||input.LA(1)==INSERT||input.LA(1)==UPDATE ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set376));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // SqlParser.g:361:36: ( SET NULL | SET DEFAULT | CASCADE | RESTRICT )
                    int alt140=4;
                    switch ( input.LA(1) ) {
                    case SET:
                        {
                        int LA140_1 = input.LA(2);

                        if ( (LA140_1==NULL) ) {
                            alt140=1;
                        }
                        else if ( (LA140_1==DEFAULT) ) {
                            alt140=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 140, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case CASCADE:
                        {
                        alt140=3;
                        }
                        break;
                    case RESTRICT:
                        {
                        alt140=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 140, 0, input);

                        throw nvae;
                    }

                    switch (alt140) {
                        case 1 :
                            // SqlParser.g:361:37: SET NULL
                            {
                            SET377=(Token)match(input,SET,FOLLOW_SET_in_fk_clause_action3276); 
                            NULL378=(Token)match(input,NULL,FOLLOW_NULL_in_fk_clause_action3279); 
                            NULL378_tree = (Object)adaptor.create(NULL378);
                            adaptor.addChild(root_0, NULL378_tree);


                            }
                            break;
                        case 2 :
                            // SqlParser.g:361:49: SET DEFAULT
                            {
                            SET379=(Token)match(input,SET,FOLLOW_SET_in_fk_clause_action3283); 
                            DEFAULT380=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_fk_clause_action3286); 
                            DEFAULT380_tree = (Object)adaptor.create(DEFAULT380);
                            adaptor.addChild(root_0, DEFAULT380_tree);


                            }
                            break;
                        case 3 :
                            // SqlParser.g:361:64: CASCADE
                            {
                            CASCADE381=(Token)match(input,CASCADE,FOLLOW_CASCADE_in_fk_clause_action3290); 
                            CASCADE381_tree = (Object)adaptor.create(CASCADE381);
                            adaptor.addChild(root_0, CASCADE381_tree);


                            }
                            break;
                        case 4 :
                            // SqlParser.g:361:74: RESTRICT
                            {
                            RESTRICT382=(Token)match(input,RESTRICT,FOLLOW_RESTRICT_in_fk_clause_action3294); 
                            RESTRICT382_tree = (Object)adaptor.create(RESTRICT382);
                            adaptor.addChild(root_0, RESTRICT382_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:362:5: MATCH id
                    {
                    root_0 = (Object)adaptor.nil();

                    MATCH383=(Token)match(input,MATCH,FOLLOW_MATCH_in_fk_clause_action3301); 
                    MATCH383_tree = (Object)adaptor.create(MATCH383);
                    root_0 = (Object)adaptor.becomeRoot(MATCH383_tree, root_0);

                    pushFollow(FOLLOW_id_in_fk_clause_action3304);
                    id384=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id384.getTree());

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
    // SqlParser.g:364:1: fk_clause_deferrable : ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )? ;
    public final SqlParser.fk_clause_deferrable_return fk_clause_deferrable() throws RecognitionException {
        SqlParser.fk_clause_deferrable_return retval = new SqlParser.fk_clause_deferrable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT385=null;
        Token DEFERRABLE386=null;
        Token INITIALLY387=null;
        Token DEFERRED388=null;
        Token INITIALLY389=null;
        Token IMMEDIATE390=null;

        Object NOT385_tree=null;
        Object DEFERRABLE386_tree=null;
        Object INITIALLY387_tree=null;
        Object DEFERRED388_tree=null;
        Object INITIALLY389_tree=null;
        Object IMMEDIATE390_tree=null;

        try {
            // SqlParser.g:364:21: ( ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )? )
            // SqlParser.g:364:23: ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:364:23: ( NOT )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==NOT) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // SqlParser.g:364:24: NOT
                    {
                    NOT385=(Token)match(input,NOT,FOLLOW_NOT_in_fk_clause_deferrable3312); 
                    NOT385_tree = (Object)adaptor.create(NOT385);
                    adaptor.addChild(root_0, NOT385_tree);


                    }
                    break;

            }

            DEFERRABLE386=(Token)match(input,DEFERRABLE,FOLLOW_DEFERRABLE_in_fk_clause_deferrable3316); 
            DEFERRABLE386_tree = (Object)adaptor.create(DEFERRABLE386);
            root_0 = (Object)adaptor.becomeRoot(DEFERRABLE386_tree, root_0);

            // SqlParser.g:364:42: ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?
            int alt143=3;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==INITIALLY) ) {
                int LA143_1 = input.LA(2);

                if ( (LA143_1==DEFERRED) ) {
                    alt143=1;
                }
                else if ( (LA143_1==IMMEDIATE) ) {
                    alt143=2;
                }
            }
            switch (alt143) {
                case 1 :
                    // SqlParser.g:364:43: INITIALLY DEFERRED
                    {
                    INITIALLY387=(Token)match(input,INITIALLY,FOLLOW_INITIALLY_in_fk_clause_deferrable3320); 
                    DEFERRED388=(Token)match(input,DEFERRED,FOLLOW_DEFERRED_in_fk_clause_deferrable3323); 
                    DEFERRED388_tree = (Object)adaptor.create(DEFERRED388);
                    adaptor.addChild(root_0, DEFERRED388_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:364:65: INITIALLY IMMEDIATE
                    {
                    INITIALLY389=(Token)match(input,INITIALLY,FOLLOW_INITIALLY_in_fk_clause_deferrable3327); 
                    IMMEDIATE390=(Token)match(input,IMMEDIATE,FOLLOW_IMMEDIATE_in_fk_clause_deferrable3330); 
                    IMMEDIATE390_tree = (Object)adaptor.create(IMMEDIATE390);
                    adaptor.addChild(root_0, IMMEDIATE390_tree);


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
    // SqlParser.g:367:1: drop_table_stmt : DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) ) ;
    public final SqlParser.drop_table_stmt_return drop_table_stmt() throws RecognitionException {
        SqlParser.drop_table_stmt_return retval = new SqlParser.drop_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP391=null;
        Token TABLE392=null;
        Token IF393=null;
        Token EXISTS394=null;
        Token DOT395=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;


        Object DROP391_tree=null;
        Object TABLE392_tree=null;
        Object IF393_tree=null;
        Object EXISTS394_tree=null;
        Object DOT395_tree=null;
        RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // SqlParser.g:367:16: ( DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) ) )
            // SqlParser.g:367:18: DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id
            {
            DROP391=(Token)match(input,DROP,FOLLOW_DROP_in_drop_table_stmt3340);  
            stream_DROP.add(DROP391);

            TABLE392=(Token)match(input,TABLE,FOLLOW_TABLE_in_drop_table_stmt3342);  
            stream_TABLE.add(TABLE392);

            // SqlParser.g:367:29: ( IF EXISTS )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==IF) ) {
                int LA144_1 = input.LA(2);

                if ( (LA144_1==EXISTS) ) {
                    alt144=1;
                }
            }
            switch (alt144) {
                case 1 :
                    // SqlParser.g:367:30: IF EXISTS
                    {
                    IF393=(Token)match(input,IF,FOLLOW_IF_in_drop_table_stmt3345);  
                    stream_IF.add(IF393);

                    EXISTS394=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_table_stmt3347);  
                    stream_EXISTS.add(EXISTS394);


                    }
                    break;

            }

            // SqlParser.g:367:42: (database_name= id DOT )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==ID) ) {
                int LA145_1 = input.LA(2);

                if ( (LA145_1==DOT) ) {
                    alt145=1;
                }
            }
            else if ( ((LA145_0>=ABORT && LA145_0<=FROM)||(LA145_0>=GROUP && LA145_0<=IMMEDIATE)||(LA145_0>=INDEX && LA145_0<=IS)||(LA145_0>=JOIN && LA145_0<=LEFT)||LA145_0==LIMIT||LA145_0==NATURAL||(LA145_0>=NULL && LA145_0<=REFERENCES)||(LA145_0>=REINDEX && LA145_0<=WHERE)) ) {
                int LA145_2 = input.LA(2);

                if ( (LA145_2==DOT) ) {
                    alt145=1;
                }
            }
            switch (alt145) {
                case 1 :
                    // SqlParser.g:367:43: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_table_stmt3354);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT395=(Token)match(input,DOT,FOLLOW_DOT_in_drop_table_stmt3356);  
                    stream_DOT.add(DOT395);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_table_stmt3362);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());


            // AST REWRITE
            // elements: database_name, EXISTS, table_name
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
            // 368:1: -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) )
            {
                // SqlParser.g:368:4: ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DROP_TABLE, "DROP_TABLE"), root_1);

                // SqlParser.g:368:17: ^( OPTIONS ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:368:27: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:368:36: ^( $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                // SqlParser.g:368:50: ( $database_name)?
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
    // SqlParser.g:371:1: alter_table_stmt : ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def ) ;
    public final SqlParser.alter_table_stmt_return alter_table_stmt() throws RecognitionException {
        SqlParser.alter_table_stmt_return retval = new SqlParser.alter_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ALTER396=null;
        Token TABLE397=null;
        Token DOT398=null;
        Token RENAME399=null;
        Token TO400=null;
        Token ADD401=null;
        Token COLUMN402=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.id_return new_table_name = null;

        SqlParser.column_def_return column_def403 = null;


        Object ALTER396_tree=null;
        Object TABLE397_tree=null;
        Object DOT398_tree=null;
        Object RENAME399_tree=null;
        Object TO400_tree=null;
        Object ADD401_tree=null;
        Object COLUMN402_tree=null;

        try {
            // SqlParser.g:371:17: ( ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def ) )
            // SqlParser.g:371:19: ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def )
            {
            root_0 = (Object)adaptor.nil();

            ALTER396=(Token)match(input,ALTER,FOLLOW_ALTER_in_alter_table_stmt3392); 
            ALTER396_tree = (Object)adaptor.create(ALTER396);
            adaptor.addChild(root_0, ALTER396_tree);

            TABLE397=(Token)match(input,TABLE,FOLLOW_TABLE_in_alter_table_stmt3394); 
            TABLE397_tree = (Object)adaptor.create(TABLE397);
            adaptor.addChild(root_0, TABLE397_tree);

            // SqlParser.g:371:31: (database_name= id DOT )?
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
                    // SqlParser.g:371:32: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_alter_table_stmt3399);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT398=(Token)match(input,DOT,FOLLOW_DOT_in_alter_table_stmt3401); 
                    DOT398_tree = (Object)adaptor.create(DOT398);
                    adaptor.addChild(root_0, DOT398_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_alter_table_stmt3407);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:371:69: ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def )
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==RENAME) ) {
                alt148=1;
            }
            else if ( (LA148_0==ADD) ) {
                alt148=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 148, 0, input);

                throw nvae;
            }
            switch (alt148) {
                case 1 :
                    // SqlParser.g:371:70: RENAME TO new_table_name= id
                    {
                    RENAME399=(Token)match(input,RENAME,FOLLOW_RENAME_in_alter_table_stmt3410); 
                    RENAME399_tree = (Object)adaptor.create(RENAME399);
                    adaptor.addChild(root_0, RENAME399_tree);

                    TO400=(Token)match(input,TO,FOLLOW_TO_in_alter_table_stmt3412); 
                    TO400_tree = (Object)adaptor.create(TO400);
                    adaptor.addChild(root_0, TO400_tree);

                    pushFollow(FOLLOW_id_in_alter_table_stmt3416);
                    new_table_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, new_table_name.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:371:100: ADD ( COLUMN )? column_def
                    {
                    ADD401=(Token)match(input,ADD,FOLLOW_ADD_in_alter_table_stmt3420); 
                    ADD401_tree = (Object)adaptor.create(ADD401);
                    adaptor.addChild(root_0, ADD401_tree);

                    // SqlParser.g:371:104: ( COLUMN )?
                    int alt147=2;
                    int LA147_0 = input.LA(1);

                    if ( (LA147_0==COLUMN) ) {
                        alt147=1;
                    }
                    switch (alt147) {
                        case 1 :
                            // SqlParser.g:371:105: COLUMN
                            {
                            COLUMN402=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_alter_table_stmt3423); 
                            COLUMN402_tree = (Object)adaptor.create(COLUMN402);
                            adaptor.addChild(root_0, COLUMN402_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_column_def_in_alter_table_stmt3427);
                    column_def403=column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, column_def403.getTree());

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
    // SqlParser.g:374:1: create_view_stmt : CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS select_stmt ;
    public final SqlParser.create_view_stmt_return create_view_stmt() throws RecognitionException {
        SqlParser.create_view_stmt_return retval = new SqlParser.create_view_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE404=null;
        Token TEMPORARY405=null;
        Token VIEW406=null;
        Token IF407=null;
        Token NOT408=null;
        Token EXISTS409=null;
        Token DOT410=null;
        Token AS411=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return view_name = null;

        SqlParser.select_stmt_return select_stmt412 = null;


        Object CREATE404_tree=null;
        Object TEMPORARY405_tree=null;
        Object VIEW406_tree=null;
        Object IF407_tree=null;
        Object NOT408_tree=null;
        Object EXISTS409_tree=null;
        Object DOT410_tree=null;
        Object AS411_tree=null;

        try {
            // SqlParser.g:374:17: ( CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS select_stmt )
            // SqlParser.g:374:19: CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS select_stmt
            {
            root_0 = (Object)adaptor.nil();

            CREATE404=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_view_stmt3436); 
            CREATE404_tree = (Object)adaptor.create(CREATE404);
            adaptor.addChild(root_0, CREATE404_tree);

            // SqlParser.g:374:26: ( TEMPORARY )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==TEMPORARY) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // SqlParser.g:374:26: TEMPORARY
                    {
                    TEMPORARY405=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_view_stmt3438); 
                    TEMPORARY405_tree = (Object)adaptor.create(TEMPORARY405);
                    adaptor.addChild(root_0, TEMPORARY405_tree);


                    }
                    break;

            }

            VIEW406=(Token)match(input,VIEW,FOLLOW_VIEW_in_create_view_stmt3441); 
            VIEW406_tree = (Object)adaptor.create(VIEW406);
            adaptor.addChild(root_0, VIEW406_tree);

            // SqlParser.g:374:42: ( IF NOT EXISTS )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==IF) ) {
                int LA150_1 = input.LA(2);

                if ( (LA150_1==NOT) ) {
                    alt150=1;
                }
            }
            switch (alt150) {
                case 1 :
                    // SqlParser.g:374:43: IF NOT EXISTS
                    {
                    IF407=(Token)match(input,IF,FOLLOW_IF_in_create_view_stmt3444); 
                    IF407_tree = (Object)adaptor.create(IF407);
                    adaptor.addChild(root_0, IF407_tree);

                    NOT408=(Token)match(input,NOT,FOLLOW_NOT_in_create_view_stmt3446); 
                    NOT408_tree = (Object)adaptor.create(NOT408);
                    adaptor.addChild(root_0, NOT408_tree);

                    EXISTS409=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_view_stmt3448); 
                    EXISTS409_tree = (Object)adaptor.create(EXISTS409);
                    adaptor.addChild(root_0, EXISTS409_tree);


                    }
                    break;

            }

            // SqlParser.g:374:59: (database_name= id DOT )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==ID) ) {
                int LA151_1 = input.LA(2);

                if ( (LA151_1==DOT) ) {
                    alt151=1;
                }
            }
            else if ( ((LA151_0>=ABORT && LA151_0<=FROM)||(LA151_0>=GROUP && LA151_0<=IMMEDIATE)||(LA151_0>=INDEX && LA151_0<=IS)||(LA151_0>=JOIN && LA151_0<=LEFT)||LA151_0==LIMIT||LA151_0==NATURAL||(LA151_0>=NULL && LA151_0<=REFERENCES)||(LA151_0>=REINDEX && LA151_0<=WHERE)) ) {
                int LA151_2 = input.LA(2);

                if ( (LA151_2==DOT) ) {
                    alt151=1;
                }
            }
            switch (alt151) {
                case 1 :
                    // SqlParser.g:374:60: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_view_stmt3455);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT410=(Token)match(input,DOT,FOLLOW_DOT_in_create_view_stmt3457); 
                    DOT410_tree = (Object)adaptor.create(DOT410);
                    adaptor.addChild(root_0, DOT410_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_view_stmt3463);
            view_name=id();

            state._fsp--;

            adaptor.addChild(root_0, view_name.getTree());
            AS411=(Token)match(input,AS,FOLLOW_AS_in_create_view_stmt3465); 
            AS411_tree = (Object)adaptor.create(AS411);
            adaptor.addChild(root_0, AS411_tree);

            pushFollow(FOLLOW_select_stmt_in_create_view_stmt3467);
            select_stmt412=select_stmt();

            state._fsp--;

            adaptor.addChild(root_0, select_stmt412.getTree());

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
    // SqlParser.g:377:1: drop_view_stmt : DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id ;
    public final SqlParser.drop_view_stmt_return drop_view_stmt() throws RecognitionException {
        SqlParser.drop_view_stmt_return retval = new SqlParser.drop_view_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP413=null;
        Token VIEW414=null;
        Token IF415=null;
        Token EXISTS416=null;
        Token DOT417=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return view_name = null;


        Object DROP413_tree=null;
        Object VIEW414_tree=null;
        Object IF415_tree=null;
        Object EXISTS416_tree=null;
        Object DOT417_tree=null;

        try {
            // SqlParser.g:377:15: ( DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id )
            // SqlParser.g:377:17: DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id
            {
            root_0 = (Object)adaptor.nil();

            DROP413=(Token)match(input,DROP,FOLLOW_DROP_in_drop_view_stmt3475); 
            DROP413_tree = (Object)adaptor.create(DROP413);
            adaptor.addChild(root_0, DROP413_tree);

            VIEW414=(Token)match(input,VIEW,FOLLOW_VIEW_in_drop_view_stmt3477); 
            VIEW414_tree = (Object)adaptor.create(VIEW414);
            adaptor.addChild(root_0, VIEW414_tree);

            // SqlParser.g:377:27: ( IF EXISTS )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==IF) ) {
                int LA152_1 = input.LA(2);

                if ( (LA152_1==EXISTS) ) {
                    alt152=1;
                }
            }
            switch (alt152) {
                case 1 :
                    // SqlParser.g:377:28: IF EXISTS
                    {
                    IF415=(Token)match(input,IF,FOLLOW_IF_in_drop_view_stmt3480); 
                    IF415_tree = (Object)adaptor.create(IF415);
                    adaptor.addChild(root_0, IF415_tree);

                    EXISTS416=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_view_stmt3482); 
                    EXISTS416_tree = (Object)adaptor.create(EXISTS416);
                    adaptor.addChild(root_0, EXISTS416_tree);


                    }
                    break;

            }

            // SqlParser.g:377:40: (database_name= id DOT )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==ID) ) {
                int LA153_1 = input.LA(2);

                if ( (LA153_1==DOT) ) {
                    alt153=1;
                }
            }
            else if ( ((LA153_0>=ABORT && LA153_0<=FROM)||(LA153_0>=GROUP && LA153_0<=IMMEDIATE)||(LA153_0>=INDEX && LA153_0<=IS)||(LA153_0>=JOIN && LA153_0<=LEFT)||LA153_0==LIMIT||LA153_0==NATURAL||(LA153_0>=NULL && LA153_0<=REFERENCES)||(LA153_0>=REINDEX && LA153_0<=WHERE)) ) {
                int LA153_2 = input.LA(2);

                if ( (LA153_2==DOT) ) {
                    alt153=1;
                }
            }
            switch (alt153) {
                case 1 :
                    // SqlParser.g:377:41: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_view_stmt3489);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT417=(Token)match(input,DOT,FOLLOW_DOT_in_drop_view_stmt3491); 
                    DOT417_tree = (Object)adaptor.create(DOT417);
                    adaptor.addChild(root_0, DOT417_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_view_stmt3497);
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
    // SqlParser.g:380:1: create_index_stmt : CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? ) ;
    public final SqlParser.create_index_stmt_return create_index_stmt() throws RecognitionException {
        SqlParser.create_index_stmt_return retval = new SqlParser.create_index_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE418=null;
        Token UNIQUE419=null;
        Token INDEX420=null;
        Token IF421=null;
        Token NOT422=null;
        Token EXISTS423=null;
        Token DOT424=null;
        Token ON425=null;
        Token LPAREN426=null;
        Token COMMA427=null;
        Token RPAREN428=null;
        List list_columns=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return index_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.indexed_column_return columns = null;
         columns = null;
        Object CREATE418_tree=null;
        Object UNIQUE419_tree=null;
        Object INDEX420_tree=null;
        Object IF421_tree=null;
        Object NOT422_tree=null;
        Object EXISTS423_tree=null;
        Object DOT424_tree=null;
        Object ON425_tree=null;
        Object LPAREN426_tree=null;
        Object COMMA427_tree=null;
        Object RPAREN428_tree=null;
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
            // SqlParser.g:380:18: ( CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? ) )
            // SqlParser.g:380:20: CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN
            {
            CREATE418=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_index_stmt3505);  
            stream_CREATE.add(CREATE418);

            // SqlParser.g:380:27: ( UNIQUE )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==UNIQUE) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // SqlParser.g:380:28: UNIQUE
                    {
                    UNIQUE419=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_create_index_stmt3508);  
                    stream_UNIQUE.add(UNIQUE419);


                    }
                    break;

            }

            INDEX420=(Token)match(input,INDEX,FOLLOW_INDEX_in_create_index_stmt3512);  
            stream_INDEX.add(INDEX420);

            // SqlParser.g:380:43: ( IF NOT EXISTS )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==IF) ) {
                int LA155_1 = input.LA(2);

                if ( (LA155_1==NOT) ) {
                    alt155=1;
                }
            }
            switch (alt155) {
                case 1 :
                    // SqlParser.g:380:44: IF NOT EXISTS
                    {
                    IF421=(Token)match(input,IF,FOLLOW_IF_in_create_index_stmt3515);  
                    stream_IF.add(IF421);

                    NOT422=(Token)match(input,NOT,FOLLOW_NOT_in_create_index_stmt3517);  
                    stream_NOT.add(NOT422);

                    EXISTS423=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_index_stmt3519);  
                    stream_EXISTS.add(EXISTS423);


                    }
                    break;

            }

            // SqlParser.g:380:60: (database_name= id DOT )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==ID) ) {
                int LA156_1 = input.LA(2);

                if ( (LA156_1==DOT) ) {
                    alt156=1;
                }
            }
            else if ( ((LA156_0>=ABORT && LA156_0<=FROM)||(LA156_0>=GROUP && LA156_0<=IMMEDIATE)||(LA156_0>=INDEX && LA156_0<=IS)||(LA156_0>=JOIN && LA156_0<=LEFT)||LA156_0==LIMIT||LA156_0==NATURAL||(LA156_0>=NULL && LA156_0<=REFERENCES)||(LA156_0>=REINDEX && LA156_0<=WHERE)) ) {
                int LA156_2 = input.LA(2);

                if ( (LA156_2==DOT) ) {
                    alt156=1;
                }
            }
            switch (alt156) {
                case 1 :
                    // SqlParser.g:380:61: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_index_stmt3526);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT424=(Token)match(input,DOT,FOLLOW_DOT_in_create_index_stmt3528);  
                    stream_DOT.add(DOT424);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_index_stmt3534);
            index_name=id();

            state._fsp--;

            stream_id.add(index_name.getTree());
            ON425=(Token)match(input,ON,FOLLOW_ON_in_create_index_stmt3538);  
            stream_ON.add(ON425);

            pushFollow(FOLLOW_id_in_create_index_stmt3542);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());
            LPAREN426=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_index_stmt3544);  
            stream_LPAREN.add(LPAREN426);

            pushFollow(FOLLOW_indexed_column_in_create_index_stmt3548);
            columns=indexed_column();

            state._fsp--;

            stream_indexed_column.add(columns.getTree());
            if (list_columns==null) list_columns=new ArrayList();
            list_columns.add(columns.getTree());

            // SqlParser.g:381:51: ( COMMA columns+= indexed_column )*
            loop157:
            do {
                int alt157=2;
                int LA157_0 = input.LA(1);

                if ( (LA157_0==COMMA) ) {
                    alt157=1;
                }


                switch (alt157) {
            	case 1 :
            	    // SqlParser.g:381:52: COMMA columns+= indexed_column
            	    {
            	    COMMA427=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_index_stmt3551);  
            	    stream_COMMA.add(COMMA427);

            	    pushFollow(FOLLOW_indexed_column_in_create_index_stmt3555);
            	    columns=indexed_column();

            	    state._fsp--;

            	    stream_indexed_column.add(columns.getTree());
            	    if (list_columns==null) list_columns=new ArrayList();
            	    list_columns.add(columns.getTree());


            	    }
            	    break;

            	default :
            	    break loop157;
                }
            } while (true);

            RPAREN428=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_index_stmt3559);  
            stream_RPAREN.add(RPAREN428);



            // AST REWRITE
            // elements: columns, UNIQUE, index_name, table_name, database_name, EXISTS
            // token labels: 
            // rule labels: database_name, index_name, retval, table_name
            // token list labels: 
            // rule list labels: columns
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_index_name=new RewriteRuleSubtreeStream(adaptor,"rule index_name",index_name!=null?index_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);
            RewriteRuleSubtreeStream stream_columns=new RewriteRuleSubtreeStream(adaptor,"token columns",list_columns);
            root_0 = (Object)adaptor.nil();
            // 382:1: -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? )
            {
                // SqlParser.g:382:4: ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CREATE_INDEX, "CREATE_INDEX"), root_1);

                // SqlParser.g:382:19: ^( OPTIONS ( UNIQUE )? ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:382:29: ( UNIQUE )?
                if ( stream_UNIQUE.hasNext() ) {
                    adaptor.addChild(root_2, stream_UNIQUE.nextNode());

                }
                stream_UNIQUE.reset();
                // SqlParser.g:382:37: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:382:46: ^( $index_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_index_name.nextNode(), root_2);

                // SqlParser.g:382:60: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_table_name.nextTree());
                // SqlParser.g:382:89: ( ^( COLUMNS ( $columns)+ ) )?
                if ( stream_columns.hasNext() ) {
                    // SqlParser.g:382:89: ^( COLUMNS ( $columns)+ )
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
    // SqlParser.g:384:1: indexed_column : column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )? -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? ) ;
    public final SqlParser.indexed_column_return indexed_column() throws RecognitionException {
        SqlParser.indexed_column_return retval = new SqlParser.indexed_column_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLLATE429=null;
        Token ASC430=null;
        Token DESC431=null;
        SqlParser.id_return column_name = null;

        SqlParser.id_return collation_name = null;


        Object COLLATE429_tree=null;
        Object ASC430_tree=null;
        Object DESC431_tree=null;
        RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");
        RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
        RewriteRuleTokenStream stream_COLLATE=new RewriteRuleTokenStream(adaptor,"token COLLATE");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // SqlParser.g:384:15: (column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )? -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? ) )
            // SqlParser.g:384:17: column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )?
            {
            pushFollow(FOLLOW_id_in_indexed_column3605);
            column_name=id();

            state._fsp--;

            stream_id.add(column_name.getTree());
            // SqlParser.g:384:32: ( COLLATE collation_name= id )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==COLLATE) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // SqlParser.g:384:33: COLLATE collation_name= id
                    {
                    COLLATE429=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_indexed_column3608);  
                    stream_COLLATE.add(COLLATE429);

                    pushFollow(FOLLOW_id_in_indexed_column3612);
                    collation_name=id();

                    state._fsp--;

                    stream_id.add(collation_name.getTree());

                    }
                    break;

            }

            // SqlParser.g:384:61: ( ASC | DESC )?
            int alt159=3;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==ASC) ) {
                alt159=1;
            }
            else if ( (LA159_0==DESC) ) {
                alt159=2;
            }
            switch (alt159) {
                case 1 :
                    // SqlParser.g:384:62: ASC
                    {
                    ASC430=(Token)match(input,ASC,FOLLOW_ASC_in_indexed_column3617);  
                    stream_ASC.add(ASC430);


                    }
                    break;
                case 2 :
                    // SqlParser.g:384:68: DESC
                    {
                    DESC431=(Token)match(input,DESC,FOLLOW_DESC_in_indexed_column3621);  
                    stream_DESC.add(DESC431);


                    }
                    break;

            }



            // AST REWRITE
            // elements: COLLATE, DESC, column_name, collation_name, ASC
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
            // 385:1: -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? )
            {
                // SqlParser.g:385:4: ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_column_name.nextNode(), root_1);

                // SqlParser.g:385:19: ( ^( COLLATE $collation_name) )?
                if ( stream_COLLATE.hasNext()||stream_collation_name.hasNext() ) {
                    // SqlParser.g:385:19: ^( COLLATE $collation_name)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_COLLATE.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_collation_name.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_COLLATE.reset();
                stream_collation_name.reset();
                // SqlParser.g:385:47: ( ASC )?
                if ( stream_ASC.hasNext() ) {
                    adaptor.addChild(root_1, stream_ASC.nextNode());

                }
                stream_ASC.reset();
                // SqlParser.g:385:52: ( DESC )?
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
    // SqlParser.g:388:1: drop_index_stmt : DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) ) ;
    public final SqlParser.drop_index_stmt_return drop_index_stmt() throws RecognitionException {
        SqlParser.drop_index_stmt_return retval = new SqlParser.drop_index_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP432=null;
        Token INDEX433=null;
        Token IF434=null;
        Token EXISTS435=null;
        Token DOT436=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return index_name = null;


        Object DROP432_tree=null;
        Object INDEX433_tree=null;
        Object IF434_tree=null;
        Object EXISTS435_tree=null;
        Object DOT436_tree=null;
        RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // SqlParser.g:388:16: ( DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) ) )
            // SqlParser.g:388:18: DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id
            {
            DROP432=(Token)match(input,DROP,FOLLOW_DROP_in_drop_index_stmt3652);  
            stream_DROP.add(DROP432);

            INDEX433=(Token)match(input,INDEX,FOLLOW_INDEX_in_drop_index_stmt3654);  
            stream_INDEX.add(INDEX433);

            // SqlParser.g:388:29: ( IF EXISTS )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==IF) ) {
                int LA160_1 = input.LA(2);

                if ( (LA160_1==EXISTS) ) {
                    alt160=1;
                }
            }
            switch (alt160) {
                case 1 :
                    // SqlParser.g:388:30: IF EXISTS
                    {
                    IF434=(Token)match(input,IF,FOLLOW_IF_in_drop_index_stmt3657);  
                    stream_IF.add(IF434);

                    EXISTS435=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_index_stmt3659);  
                    stream_EXISTS.add(EXISTS435);


                    }
                    break;

            }

            // SqlParser.g:388:42: (database_name= id DOT )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==ID) ) {
                int LA161_1 = input.LA(2);

                if ( (LA161_1==DOT) ) {
                    alt161=1;
                }
            }
            else if ( ((LA161_0>=ABORT && LA161_0<=FROM)||(LA161_0>=GROUP && LA161_0<=IMMEDIATE)||(LA161_0>=INDEX && LA161_0<=IS)||(LA161_0>=JOIN && LA161_0<=LEFT)||LA161_0==LIMIT||LA161_0==NATURAL||(LA161_0>=NULL && LA161_0<=REFERENCES)||(LA161_0>=REINDEX && LA161_0<=WHERE)) ) {
                int LA161_2 = input.LA(2);

                if ( (LA161_2==DOT) ) {
                    alt161=1;
                }
            }
            switch (alt161) {
                case 1 :
                    // SqlParser.g:388:43: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_index_stmt3666);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT436=(Token)match(input,DOT,FOLLOW_DOT_in_drop_index_stmt3668);  
                    stream_DOT.add(DOT436);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_index_stmt3674);
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
            // 389:1: -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) )
            {
                // SqlParser.g:389:4: ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DROP_INDEX, "DROP_INDEX"), root_1);

                // SqlParser.g:389:17: ^( OPTIONS ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:389:27: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:389:36: ^( $index_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_index_name.nextNode(), root_2);

                // SqlParser.g:389:50: ( $database_name)?
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
    // SqlParser.g:392:1: create_trigger_stmt : CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END ;
    public final SqlParser.create_trigger_stmt_return create_trigger_stmt() throws RecognitionException {
        SqlParser.create_trigger_stmt_return retval = new SqlParser.create_trigger_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE437=null;
        Token TEMPORARY438=null;
        Token TRIGGER439=null;
        Token IF440=null;
        Token NOT441=null;
        Token EXISTS442=null;
        Token DOT443=null;
        Token BEFORE444=null;
        Token AFTER445=null;
        Token INSTEAD446=null;
        Token OF447=null;
        Token DELETE448=null;
        Token INSERT449=null;
        Token UPDATE450=null;
        Token OF451=null;
        Token COMMA452=null;
        Token ON453=null;
        Token FOR454=null;
        Token EACH455=null;
        Token ROW456=null;
        Token WHEN457=null;
        Token BEGIN459=null;
        Token SEMI464=null;
        Token END465=null;
        List list_column_names=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return trigger_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.expr_return expr458 = null;

        SqlParser.update_stmt_return update_stmt460 = null;

        SqlParser.insert_stmt_return insert_stmt461 = null;

        SqlParser.delete_stmt_return delete_stmt462 = null;

        SqlParser.select_stmt_return select_stmt463 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object CREATE437_tree=null;
        Object TEMPORARY438_tree=null;
        Object TRIGGER439_tree=null;
        Object IF440_tree=null;
        Object NOT441_tree=null;
        Object EXISTS442_tree=null;
        Object DOT443_tree=null;
        Object BEFORE444_tree=null;
        Object AFTER445_tree=null;
        Object INSTEAD446_tree=null;
        Object OF447_tree=null;
        Object DELETE448_tree=null;
        Object INSERT449_tree=null;
        Object UPDATE450_tree=null;
        Object OF451_tree=null;
        Object COMMA452_tree=null;
        Object ON453_tree=null;
        Object FOR454_tree=null;
        Object EACH455_tree=null;
        Object ROW456_tree=null;
        Object WHEN457_tree=null;
        Object BEGIN459_tree=null;
        Object SEMI464_tree=null;
        Object END465_tree=null;

        try {
            // SqlParser.g:392:20: ( CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END )
            // SqlParser.g:392:22: CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END
            {
            root_0 = (Object)adaptor.nil();

            CREATE437=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_trigger_stmt3704); 
            CREATE437_tree = (Object)adaptor.create(CREATE437);
            adaptor.addChild(root_0, CREATE437_tree);

            // SqlParser.g:392:29: ( TEMPORARY )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==TEMPORARY) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // SqlParser.g:392:29: TEMPORARY
                    {
                    TEMPORARY438=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_trigger_stmt3706); 
                    TEMPORARY438_tree = (Object)adaptor.create(TEMPORARY438);
                    adaptor.addChild(root_0, TEMPORARY438_tree);


                    }
                    break;

            }

            TRIGGER439=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_create_trigger_stmt3709); 
            TRIGGER439_tree = (Object)adaptor.create(TRIGGER439);
            adaptor.addChild(root_0, TRIGGER439_tree);

            // SqlParser.g:392:48: ( IF NOT EXISTS )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==IF) ) {
                int LA163_1 = input.LA(2);

                if ( (LA163_1==NOT) ) {
                    alt163=1;
                }
            }
            switch (alt163) {
                case 1 :
                    // SqlParser.g:392:49: IF NOT EXISTS
                    {
                    IF440=(Token)match(input,IF,FOLLOW_IF_in_create_trigger_stmt3712); 
                    IF440_tree = (Object)adaptor.create(IF440);
                    adaptor.addChild(root_0, IF440_tree);

                    NOT441=(Token)match(input,NOT,FOLLOW_NOT_in_create_trigger_stmt3714); 
                    NOT441_tree = (Object)adaptor.create(NOT441);
                    adaptor.addChild(root_0, NOT441_tree);

                    EXISTS442=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_trigger_stmt3716); 
                    EXISTS442_tree = (Object)adaptor.create(EXISTS442);
                    adaptor.addChild(root_0, EXISTS442_tree);


                    }
                    break;

            }

            // SqlParser.g:392:65: (database_name= id DOT )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==ID) ) {
                int LA164_1 = input.LA(2);

                if ( (LA164_1==DOT) ) {
                    alt164=1;
                }
            }
            else if ( ((LA164_0>=ABORT && LA164_0<=FROM)||(LA164_0>=GROUP && LA164_0<=IMMEDIATE)||(LA164_0>=INDEX && LA164_0<=IS)||(LA164_0>=JOIN && LA164_0<=LEFT)||LA164_0==LIMIT||LA164_0==NATURAL||(LA164_0>=NULL && LA164_0<=REFERENCES)||(LA164_0>=REINDEX && LA164_0<=WHERE)) ) {
                int LA164_2 = input.LA(2);

                if ( (LA164_2==DOT) ) {
                    alt164=1;
                }
            }
            switch (alt164) {
                case 1 :
                    // SqlParser.g:392:66: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_trigger_stmt3723);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT443=(Token)match(input,DOT,FOLLOW_DOT_in_create_trigger_stmt3725); 
                    DOT443_tree = (Object)adaptor.create(DOT443);
                    adaptor.addChild(root_0, DOT443_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_trigger_stmt3731);
            trigger_name=id();

            state._fsp--;

            adaptor.addChild(root_0, trigger_name.getTree());
            // SqlParser.g:393:3: ( BEFORE | AFTER | INSTEAD OF )?
            int alt165=4;
            switch ( input.LA(1) ) {
                case BEFORE:
                    {
                    alt165=1;
                    }
                    break;
                case AFTER:
                    {
                    alt165=2;
                    }
                    break;
                case INSTEAD:
                    {
                    alt165=3;
                    }
                    break;
            }

            switch (alt165) {
                case 1 :
                    // SqlParser.g:393:4: BEFORE
                    {
                    BEFORE444=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_create_trigger_stmt3736); 
                    BEFORE444_tree = (Object)adaptor.create(BEFORE444);
                    adaptor.addChild(root_0, BEFORE444_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:393:13: AFTER
                    {
                    AFTER445=(Token)match(input,AFTER,FOLLOW_AFTER_in_create_trigger_stmt3740); 
                    AFTER445_tree = (Object)adaptor.create(AFTER445);
                    adaptor.addChild(root_0, AFTER445_tree);


                    }
                    break;
                case 3 :
                    // SqlParser.g:393:21: INSTEAD OF
                    {
                    INSTEAD446=(Token)match(input,INSTEAD,FOLLOW_INSTEAD_in_create_trigger_stmt3744); 
                    INSTEAD446_tree = (Object)adaptor.create(INSTEAD446);
                    adaptor.addChild(root_0, INSTEAD446_tree);

                    OF447=(Token)match(input,OF,FOLLOW_OF_in_create_trigger_stmt3746); 
                    OF447_tree = (Object)adaptor.create(OF447);
                    adaptor.addChild(root_0, OF447_tree);


                    }
                    break;

            }

            // SqlParser.g:393:34: ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? )
            int alt168=3;
            switch ( input.LA(1) ) {
            case DELETE:
                {
                alt168=1;
                }
                break;
            case INSERT:
                {
                alt168=2;
                }
                break;
            case UPDATE:
                {
                alt168=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 168, 0, input);

                throw nvae;
            }

            switch (alt168) {
                case 1 :
                    // SqlParser.g:393:35: DELETE
                    {
                    DELETE448=(Token)match(input,DELETE,FOLLOW_DELETE_in_create_trigger_stmt3751); 
                    DELETE448_tree = (Object)adaptor.create(DELETE448);
                    adaptor.addChild(root_0, DELETE448_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:393:44: INSERT
                    {
                    INSERT449=(Token)match(input,INSERT,FOLLOW_INSERT_in_create_trigger_stmt3755); 
                    INSERT449_tree = (Object)adaptor.create(INSERT449);
                    adaptor.addChild(root_0, INSERT449_tree);


                    }
                    break;
                case 3 :
                    // SqlParser.g:393:53: UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )?
                    {
                    UPDATE450=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_create_trigger_stmt3759); 
                    UPDATE450_tree = (Object)adaptor.create(UPDATE450);
                    adaptor.addChild(root_0, UPDATE450_tree);

                    // SqlParser.g:393:60: ( OF column_names+= id ( COMMA column_names+= id )* )?
                    int alt167=2;
                    int LA167_0 = input.LA(1);

                    if ( (LA167_0==OF) ) {
                        alt167=1;
                    }
                    switch (alt167) {
                        case 1 :
                            // SqlParser.g:393:61: OF column_names+= id ( COMMA column_names+= id )*
                            {
                            OF451=(Token)match(input,OF,FOLLOW_OF_in_create_trigger_stmt3762); 
                            OF451_tree = (Object)adaptor.create(OF451);
                            adaptor.addChild(root_0, OF451_tree);

                            pushFollow(FOLLOW_id_in_create_trigger_stmt3766);
                            column_names=id();

                            state._fsp--;

                            adaptor.addChild(root_0, column_names.getTree());
                            if (list_column_names==null) list_column_names=new ArrayList();
                            list_column_names.add(column_names.getTree());

                            // SqlParser.g:393:81: ( COMMA column_names+= id )*
                            loop166:
                            do {
                                int alt166=2;
                                int LA166_0 = input.LA(1);

                                if ( (LA166_0==COMMA) ) {
                                    alt166=1;
                                }


                                switch (alt166) {
                            	case 1 :
                            	    // SqlParser.g:393:82: COMMA column_names+= id
                            	    {
                            	    COMMA452=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_trigger_stmt3769); 
                            	    COMMA452_tree = (Object)adaptor.create(COMMA452);
                            	    adaptor.addChild(root_0, COMMA452_tree);

                            	    pushFollow(FOLLOW_id_in_create_trigger_stmt3773);
                            	    column_names=id();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, column_names.getTree());
                            	    if (list_column_names==null) list_column_names=new ArrayList();
                            	    list_column_names.add(column_names.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop166;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            ON453=(Token)match(input,ON,FOLLOW_ON_in_create_trigger_stmt3782); 
            ON453_tree = (Object)adaptor.create(ON453);
            adaptor.addChild(root_0, ON453_tree);

            pushFollow(FOLLOW_id_in_create_trigger_stmt3786);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:394:20: ( FOR EACH ROW )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==FOR) ) {
                alt169=1;
            }
            switch (alt169) {
                case 1 :
                    // SqlParser.g:394:21: FOR EACH ROW
                    {
                    FOR454=(Token)match(input,FOR,FOLLOW_FOR_in_create_trigger_stmt3789); 
                    FOR454_tree = (Object)adaptor.create(FOR454);
                    adaptor.addChild(root_0, FOR454_tree);

                    EACH455=(Token)match(input,EACH,FOLLOW_EACH_in_create_trigger_stmt3791); 
                    EACH455_tree = (Object)adaptor.create(EACH455);
                    adaptor.addChild(root_0, EACH455_tree);

                    ROW456=(Token)match(input,ROW,FOLLOW_ROW_in_create_trigger_stmt3793); 
                    ROW456_tree = (Object)adaptor.create(ROW456);
                    adaptor.addChild(root_0, ROW456_tree);


                    }
                    break;

            }

            // SqlParser.g:394:36: ( WHEN expr )?
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==WHEN) ) {
                alt170=1;
            }
            switch (alt170) {
                case 1 :
                    // SqlParser.g:394:37: WHEN expr
                    {
                    WHEN457=(Token)match(input,WHEN,FOLLOW_WHEN_in_create_trigger_stmt3798); 
                    WHEN457_tree = (Object)adaptor.create(WHEN457);
                    adaptor.addChild(root_0, WHEN457_tree);

                    pushFollow(FOLLOW_expr_in_create_trigger_stmt3800);
                    expr458=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr458.getTree());

                    }
                    break;

            }

            BEGIN459=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_create_trigger_stmt3806); 
            BEGIN459_tree = (Object)adaptor.create(BEGIN459);
            adaptor.addChild(root_0, BEGIN459_tree);

            // SqlParser.g:395:9: ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+
            int cnt172=0;
            loop172:
            do {
                int alt172=2;
                int LA172_0 = input.LA(1);

                if ( (LA172_0==DELETE||LA172_0==INSERT||LA172_0==REPLACE||LA172_0==SELECT||LA172_0==UPDATE) ) {
                    alt172=1;
                }


                switch (alt172) {
            	case 1 :
            	    // SqlParser.g:395:10: ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI
            	    {
            	    // SqlParser.g:395:10: ( update_stmt | insert_stmt | delete_stmt | select_stmt )
            	    int alt171=4;
            	    switch ( input.LA(1) ) {
            	    case UPDATE:
            	        {
            	        alt171=1;
            	        }
            	        break;
            	    case INSERT:
            	    case REPLACE:
            	        {
            	        alt171=2;
            	        }
            	        break;
            	    case DELETE:
            	        {
            	        alt171=3;
            	        }
            	        break;
            	    case SELECT:
            	        {
            	        alt171=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 171, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt171) {
            	        case 1 :
            	            // SqlParser.g:395:11: update_stmt
            	            {
            	            pushFollow(FOLLOW_update_stmt_in_create_trigger_stmt3810);
            	            update_stmt460=update_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, update_stmt460.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // SqlParser.g:395:25: insert_stmt
            	            {
            	            pushFollow(FOLLOW_insert_stmt_in_create_trigger_stmt3814);
            	            insert_stmt461=insert_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, insert_stmt461.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // SqlParser.g:395:39: delete_stmt
            	            {
            	            pushFollow(FOLLOW_delete_stmt_in_create_trigger_stmt3818);
            	            delete_stmt462=delete_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, delete_stmt462.getTree());

            	            }
            	            break;
            	        case 4 :
            	            // SqlParser.g:395:53: select_stmt
            	            {
            	            pushFollow(FOLLOW_select_stmt_in_create_trigger_stmt3822);
            	            select_stmt463=select_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, select_stmt463.getTree());

            	            }
            	            break;

            	    }

            	    SEMI464=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_trigger_stmt3825); 
            	    SEMI464_tree = (Object)adaptor.create(SEMI464);
            	    adaptor.addChild(root_0, SEMI464_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt172 >= 1 ) break loop172;
                        EarlyExitException eee =
                            new EarlyExitException(172, input);
                        throw eee;
                }
                cnt172++;
            } while (true);

            END465=(Token)match(input,END,FOLLOW_END_in_create_trigger_stmt3829); 
            END465_tree = (Object)adaptor.create(END465);
            adaptor.addChild(root_0, END465_tree);


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
    // SqlParser.g:398:1: drop_trigger_stmt : DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id ;
    public final SqlParser.drop_trigger_stmt_return drop_trigger_stmt() throws RecognitionException {
        SqlParser.drop_trigger_stmt_return retval = new SqlParser.drop_trigger_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP466=null;
        Token TRIGGER467=null;
        Token IF468=null;
        Token EXISTS469=null;
        Token DOT470=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return trigger_name = null;


        Object DROP466_tree=null;
        Object TRIGGER467_tree=null;
        Object IF468_tree=null;
        Object EXISTS469_tree=null;
        Object DOT470_tree=null;

        try {
            // SqlParser.g:398:18: ( DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id )
            // SqlParser.g:398:20: DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id
            {
            root_0 = (Object)adaptor.nil();

            DROP466=(Token)match(input,DROP,FOLLOW_DROP_in_drop_trigger_stmt3837); 
            DROP466_tree = (Object)adaptor.create(DROP466);
            adaptor.addChild(root_0, DROP466_tree);

            TRIGGER467=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_drop_trigger_stmt3839); 
            TRIGGER467_tree = (Object)adaptor.create(TRIGGER467);
            adaptor.addChild(root_0, TRIGGER467_tree);

            // SqlParser.g:398:33: ( IF EXISTS )?
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==IF) ) {
                int LA173_1 = input.LA(2);

                if ( (LA173_1==EXISTS) ) {
                    alt173=1;
                }
            }
            switch (alt173) {
                case 1 :
                    // SqlParser.g:398:34: IF EXISTS
                    {
                    IF468=(Token)match(input,IF,FOLLOW_IF_in_drop_trigger_stmt3842); 
                    IF468_tree = (Object)adaptor.create(IF468);
                    adaptor.addChild(root_0, IF468_tree);

                    EXISTS469=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_trigger_stmt3844); 
                    EXISTS469_tree = (Object)adaptor.create(EXISTS469);
                    adaptor.addChild(root_0, EXISTS469_tree);


                    }
                    break;

            }

            // SqlParser.g:398:46: (database_name= id DOT )?
            int alt174=2;
            int LA174_0 = input.LA(1);

            if ( (LA174_0==ID) ) {
                int LA174_1 = input.LA(2);

                if ( (LA174_1==DOT) ) {
                    alt174=1;
                }
            }
            else if ( ((LA174_0>=ABORT && LA174_0<=FROM)||(LA174_0>=GROUP && LA174_0<=IMMEDIATE)||(LA174_0>=INDEX && LA174_0<=IS)||(LA174_0>=JOIN && LA174_0<=LEFT)||LA174_0==LIMIT||LA174_0==NATURAL||(LA174_0>=NULL && LA174_0<=REFERENCES)||(LA174_0>=REINDEX && LA174_0<=WHERE)) ) {
                int LA174_2 = input.LA(2);

                if ( (LA174_2==DOT) ) {
                    alt174=1;
                }
            }
            switch (alt174) {
                case 1 :
                    // SqlParser.g:398:47: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_trigger_stmt3851);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT470=(Token)match(input,DOT,FOLLOW_DOT_in_drop_trigger_stmt3853); 
                    DOT470_tree = (Object)adaptor.create(DOT470);
                    adaptor.addChild(root_0, DOT470_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_trigger_stmt3859);
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
    // SqlParser.g:403:1: id : ( ID | keyword );
    public final SqlParser.id_return id() throws RecognitionException {
        SqlParser.id_return retval = new SqlParser.id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID471=null;
        SqlParser.keyword_return keyword472 = null;


        Object ID471_tree=null;

        try {
            // SqlParser.g:403:3: ( ID | keyword )
            int alt175=2;
            int LA175_0 = input.LA(1);

            if ( (LA175_0==ID) ) {
                alt175=1;
            }
            else if ( ((LA175_0>=ABORT && LA175_0<=FROM)||(LA175_0>=GROUP && LA175_0<=IMMEDIATE)||(LA175_0>=INDEX && LA175_0<=IS)||(LA175_0>=JOIN && LA175_0<=LEFT)||LA175_0==LIMIT||LA175_0==NATURAL||(LA175_0>=NULL && LA175_0<=REFERENCES)||(LA175_0>=REINDEX && LA175_0<=WHERE)) ) {
                alt175=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 175, 0, input);

                throw nvae;
            }
            switch (alt175) {
                case 1 :
                    // SqlParser.g:403:5: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID471=(Token)match(input,ID,FOLLOW_ID_in_id3869); 
                    ID471_tree = (Object)adaptor.create(ID471);
                    adaptor.addChild(root_0, ID471_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:403:10: keyword
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_id3873);
                    keyword472=keyword();

                    state._fsp--;

                    adaptor.addChild(root_0, keyword472.getTree());

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
    // SqlParser.g:405:1: keyword : ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GROUP | HAVING | IF | IGNORE | IMMEDIATE | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | JOIN | KEY | LEFT | LIMIT | NATURAL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) ;
    public final SqlParser.keyword_return keyword() throws RecognitionException {
        SqlParser.keyword_return retval = new SqlParser.keyword_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set473=null;

        Object set473_tree=null;

        try {
            // SqlParser.g:405:8: ( ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GROUP | HAVING | IF | IGNORE | IMMEDIATE | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | JOIN | KEY | LEFT | LIMIT | NATURAL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) )
            // SqlParser.g:405:10: ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GROUP | HAVING | IF | IGNORE | IMMEDIATE | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | JOIN | KEY | LEFT | LIMIT | NATURAL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE )
            {
            root_0 = (Object)adaptor.nil();

            set473=(Token)input.LT(1);
            if ( (input.LA(1)>=ABORT && input.LA(1)<=FROM)||(input.LA(1)>=GROUP && input.LA(1)<=IMMEDIATE)||(input.LA(1)>=INDEX && input.LA(1)<=IS)||(input.LA(1)>=JOIN && input.LA(1)<=LEFT)||input.LA(1)==LIMIT||input.LA(1)==NATURAL||(input.LA(1)>=NULL && input.LA(1)<=REFERENCES)||(input.LA(1)>=REINDEX && input.LA(1)<=WHERE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set473));
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
    // SqlParser.g:524:1: id_column_def : ( ID | keyword_column_def );
    public final SqlParser.id_column_def_return id_column_def() throws RecognitionException {
        SqlParser.id_column_def_return retval = new SqlParser.id_column_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID474=null;
        SqlParser.keyword_column_def_return keyword_column_def475 = null;


        Object ID474_tree=null;

        try {
            // SqlParser.g:524:14: ( ID | keyword_column_def )
            int alt176=2;
            int LA176_0 = input.LA(1);

            if ( (LA176_0==ID) ) {
                alt176=1;
            }
            else if ( ((LA176_0>=ABORT && LA176_0<=COLLATE)||(LA176_0>=COMMIT && LA176_0<=CONFLICT)||(LA176_0>=CREATE && LA176_0<=WHERE)) ) {
                alt176=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 176, 0, input);

                throw nvae;
            }
            switch (alt176) {
                case 1 :
                    // SqlParser.g:524:16: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID474=(Token)match(input,ID,FOLLOW_ID_in_id_column_def4547); 
                    ID474_tree = (Object)adaptor.create(ID474);
                    adaptor.addChild(root_0, ID474_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:524:21: keyword_column_def
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_keyword_column_def_in_id_column_def4551);
                    keyword_column_def475=keyword_column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, keyword_column_def475.getTree());

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
    // SqlParser.g:526:1: keyword_column_def : ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) ;
    public final SqlParser.keyword_column_def_return keyword_column_def() throws RecognitionException {
        SqlParser.keyword_column_def_return retval = new SqlParser.keyword_column_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set476=null;

        Object set476_tree=null;

        try {
            // SqlParser.g:526:19: ( ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) )
            // SqlParser.g:526:21: ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE )
            {
            root_0 = (Object)adaptor.nil();

            set476=(Token)input.LT(1);
            if ( (input.LA(1)>=ABORT && input.LA(1)<=COLLATE)||(input.LA(1)>=COMMIT && input.LA(1)<=CONFLICT)||(input.LA(1)>=CREATE && input.LA(1)<=WHERE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set476));
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
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA70 dfa70 = new DFA70(this);
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
        "\15\1\16\1\17\2\uffff\1\23\1\20\1\uffff\1\21\1\24\1\26\1\30\1\22"+
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
            "\1\27\52\uffff\1\25\1\24\3\uffff\1\30\1\uffff\1\27\4\uffff"+
            "\1\26\1\23",
            "\1\33\52\uffff\1\31\4\uffff\1\34\6\uffff\1\32",
            "",
            "",
            "\1\25\4\uffff\1\30\6\uffff\1\26",
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
            return "65:1: sql_stmt_core : ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt );";
        }
    }
    static final String DFA8_eotS =
        "\14\uffff";
    static final String DFA8_eofS =
        "\14\uffff";
    static final String DFA8_minS =
        "\1\27\1\uffff\1\21\1\30\1\21\6\30\1\uffff";
    static final String DFA8_maxS =
        "\1\u00af\1\uffff\1\u00b4\1\u00af\1\u00b4\1\110\3\u009c\1\110\1\u00b1"+
        "\1\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\2\11\uffff\1\1";
    static final String DFA8_specialS =
        "\14\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\1\uffff\1\1\1\uffff\1\1\36\uffff\62\1\1\uffff\5\1\1\uffff"+
            "\11\1\1\uffff\3\1\1\uffff\1\1\1\uffff\1\1\2\uffff\4\1\1\2\10"+
            "\1\1\uffff\32\1\1\uffff\1\1",
            "",
            "\3\13\3\uffff\1\1\1\uffff\1\1\1\13\1\1\3\13\33\uffff\52\13"+
            "\1\10\6\13\1\3\1\uffff\1\5\4\13\1\uffff\6\13\1\7\2\13\1\uffff"+
            "\3\13\1\uffff\1\12\1\uffff\2\13\1\uffff\5\13\1\11\7\13\1\uffff"+
            "\20\13\1\6\10\13\1\4\1\uffff\3\13\1\uffff\2\13",
            "\1\13\1\uffff\1\1\37\uffff\62\1\1\uffff\5\1\1\uffff\11\1\1"+
            "\uffff\3\1\1\uffff\1\1\1\uffff\1\1\2\uffff\15\1\1\uffff\32\1"+
            "\1\uffff\1\1",
            "\3\1\4\uffff\1\13\1\uffff\1\1\1\uffff\3\1\33\uffff\62\1\1\uffff"+
            "\5\1\1\uffff\11\1\1\uffff\3\1\1\uffff\1\1\1\uffff\2\1\1\uffff"+
            "\15\1\1\uffff\32\1\1\uffff\3\1\1\uffff\2\1",
            "\1\13\57\uffff\1\1",
            "\1\13\44\uffff\1\1\136\uffff\1\1",
            "\1\13\u0083\uffff\1\1",
            "\1\13\u0083\uffff\1\1",
            "\1\13\57\uffff\1\1",
            "\1\13\u0098\uffff\1\1",
            ""
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
            return "()* loopback of 99:18: ( OR or_subexpr )*";
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
            return "()* loopback of 101:25: ( AND and_subexpr )*";
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
            return "103:34: ( cond_expr )?";
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
            return "106:41: ( ESCAPE escape_expr= eq_subexpr )?";
        }
    }
    static final String DFA36_eotS =
        "\21\uffff";
    static final String DFA36_eofS =
        "\21\uffff";
    static final String DFA36_minS =
        "\1\32\1\uffff\4\4\1\uffff\1\4\1\30\1\uffff\1\21\1\30\5\uffff";
    static final String DFA36_maxS =
        "\1\u00b4\1\uffff\4\u00af\1\uffff\1\u00af\1\32\1\uffff\1\u00b4\1"+
        "\32\5\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\1\1\4\uffff\1\2\2\uffff\1\5\2\uffff\1\3\1\4\1\6\1\7\1\10";
    static final String DFA36_specialS =
        "\21\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\11\1\uffff\3\6\33\uffff\20\14\1\12\1\10\10\14\1\3\1\4\1\5"+
            "\25\14\1\uffff\5\14\1\uffff\11\14\1\uffff\3\14\1\uffff\1\14"+
            "\1\uffff\1\14\2\uffff\1\2\12\14\1\13\1\14\1\uffff\32\14\1\uffff"+
            "\1\7\2\1\1\uffff\2\1",
            "",
            "\17\1\1\uffff\4\1\1\14\1\1\1\uffff\1\1\36\uffff\164\1\1\uffff"+
            "\1\1",
            "\17\1\1\uffff\4\1\1\14\1\1\1\uffff\1\1\36\uffff\164\1\1\uffff"+
            "\1\1",
            "\17\1\1\uffff\4\1\1\14\1\1\1\uffff\1\1\36\uffff\164\1\1\uffff"+
            "\1\1",
            "\17\1\1\uffff\4\1\1\14\1\1\1\uffff\1\1\36\uffff\164\1\1\uffff"+
            "\1\1",
            "",
            "\17\14\1\uffff\6\14\1\15\1\14\36\uffff\164\14\1\uffff\1\14",
            "\1\14\1\uffff\1\16",
            "",
            "\3\17\4\uffff\1\14\1\uffff\1\17\1\uffff\3\17\33\uffff\62\17"+
            "\1\uffff\5\17\1\uffff\11\17\1\uffff\3\17\1\uffff\1\17\1\uffff"+
            "\2\17\1\uffff\15\17\1\uffff\32\17\1\uffff\3\17\1\uffff\2\17",
            "\1\14\1\uffff\1\20",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "132:1: atom_expr : ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) | name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN -> ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? ) | LPAREN expr RPAREN | CAST LPAREN expr AS type_name RPAREN | CASE (case_expr= expr )? ( when_expr )+ ( ELSE else_expr= expr )? END -> ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? ) | raise_function );";
        }
    }
    static final String DFA72_eotS =
        "\16\uffff";
    static final String DFA72_eofS =
        "\16\uffff";
    static final String DFA72_minS =
        "\1\21\1\uffff\2\4\1\uffff\3\4\1\30\1\21\2\30\1\24\1\uffff";
    static final String DFA72_maxS =
        "\1\u00b4\1\uffff\2\u00af\1\uffff\3\u00af\1\32\1\u00b4\1\32\1\30"+
        "\1\u00af\1\uffff";
    static final String DFA72_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\10\uffff\1\2";
    static final String DFA72_specialS =
        "\16\uffff}>";
    static final String[] DFA72_transitionS = {
            "\3\4\1\1\5\uffff\1\4\1\uffff\3\4\33\uffff\20\13\1\11\1\10\10"+
            "\13\1\5\1\6\1\7\25\13\1\uffff\5\13\1\uffff\11\13\1\uffff\3\13"+
            "\1\uffff\1\13\1\uffff\1\13\1\4\1\uffff\1\3\12\13\1\12\1\13\1"+
            "\uffff\32\13\1\uffff\1\2\2\4\1\uffff\2\4",
            "",
            "\17\4\1\uffff\4\4\1\14\3\4\36\uffff\164\4\1\uffff\1\4",
            "\17\4\1\uffff\4\4\1\14\1\4\1\uffff\1\4\36\uffff\164\4\1\uffff"+
            "\1\4",
            "",
            "\17\4\1\uffff\4\4\1\14\1\4\1\uffff\1\4\36\uffff\164\4\1\uffff"+
            "\1\4",
            "\17\4\1\uffff\4\4\1\14\1\4\1\uffff\1\4\36\uffff\164\4\1\uffff"+
            "\1\4",
            "\17\4\1\uffff\4\4\1\14\1\4\1\uffff\1\4\36\uffff\164\4\1\uffff"+
            "\1\4",
            "\1\14\1\uffff\1\4",
            "\3\4\4\uffff\1\14\1\uffff\1\4\1\uffff\3\4\33\uffff\62\4\1\uffff"+
            "\5\4\1\uffff\11\4\1\uffff\3\4\1\uffff\1\4\1\uffff\2\4\1\uffff"+
            "\15\4\1\uffff\32\4\1\uffff\3\4\1\uffff\2\4",
            "\1\14\1\uffff\1\4",
            "\1\14",
            "\1\15\45\uffff\62\4\1\uffff\5\4\1\uffff\11\4\1\uffff\3\4\1"+
            "\uffff\1\4\1\uffff\1\4\2\uffff\15\4\1\uffff\32\4\1\uffff\1\4",
            ""
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
            return "226:1: result_column : ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) );";
        }
    }
    static final String DFA71_eotS =
        "\33\uffff";
    static final String DFA71_eofS =
        "\33\uffff";
    static final String DFA71_minS =
        "\1\27\1\uffff\1\27\1\uffff\1\21\6\27\1\30\1\21\7\30\1\21\6\30";
    static final String DFA71_maxS =
        "\1\u00af\1\uffff\1\u00af\1\uffff\1\u00b4\5\u00ad\1\u00b1\1\u00af"+
        "\1\u00b4\1\110\3\u009c\1\110\1\u00b1\1\u00af\1\u00b4\1\110\3\u009c"+
        "\1\110\1\u00b1";
    static final String DFA71_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\27\uffff";
    static final String DFA71_specialS =
        "\33\uffff}>";
    static final String[] DFA71_transitionS = {
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
            return "229:10: ( ( AS )? column_alias= id )?";
        }
    }
    static final String DFA70_eotS =
        "\34\uffff";
    static final String DFA70_eofS =
        "\34\uffff";
    static final String DFA70_minS =
        "\1\72\1\27\1\uffff\1\27\1\21\6\27\1\uffff\1\30\1\21\7\30\1\21\6"+
        "\30";
    static final String DFA70_maxS =
        "\2\u00af\1\uffff\1\u00af\1\u00b4\5\u00ad\1\u00b1\1\uffff\1\u00af"+
        "\1\u00b4\1\110\3\u009c\1\110\1\u00b1\1\u00af\1\u00b4\1\110\3\u009c"+
        "\1\110\1\u00b1";
    static final String DFA70_acceptS =
        "\2\uffff\1\2\10\uffff\1\1\20\uffff";
    static final String DFA70_specialS =
        "\34\uffff}>";
    static final String[] DFA70_transitionS = {
            "\7\2\1\1\52\2\1\uffff\5\2\1\uffff\11\2\1\uffff\3\2\1\uffff\1"+
            "\2\1\uffff\1\2\2\uffff\15\2\1\uffff\32\2\1\uffff\1\2",
            "\1\2\1\uffff\1\2\1\uffff\1\2\36\uffff\52\13\1\10\6\13\1\3\1"+
            "\uffff\1\5\4\13\1\uffff\6\13\1\7\2\13\1\uffff\3\13\1\uffff\1"+
            "\12\1\uffff\1\13\2\uffff\5\13\1\11\7\13\1\uffff\20\13\1\6\10"+
            "\13\1\4\1\uffff\1\13",
            "",
            "\1\13\1\uffff\1\13\1\2\1\13\36\uffff\52\2\1\21\6\2\1\14\1\uffff"+
            "\1\16\4\2\1\uffff\6\2\1\20\2\2\1\uffff\3\2\1\uffff\1\23\1\uffff"+
            "\1\2\2\uffff\5\2\1\22\7\2\1\uffff\20\2\1\17\10\2\1\15\1\uffff"+
            "\1\2",
            "\3\2\3\uffff\1\13\1\uffff\1\13\1\2\1\13\3\2\33\uffff\52\2\1"+
            "\31\6\2\1\24\1\uffff\1\26\4\2\1\uffff\6\2\1\30\2\2\1\uffff\3"+
            "\2\1\uffff\1\33\1\uffff\2\2\1\uffff\5\2\1\32\7\2\1\uffff\20"+
            "\2\1\27\10\2\1\25\1\uffff\3\2\1\uffff\2\2",
            "\1\13\1\uffff\1\13\1\uffff\1\13\54\uffff\1\2\33\uffff\1\13"+
            "\6\uffff\1\13\1\uffff\1\13\13\uffff\1\13\7\uffff\1\13\11\uffff"+
            "\1\13\30\uffff\1\13\10\uffff\1\13",
            "\1\13\1\uffff\1\13\1\uffff\1\13\41\uffff\1\2\46\uffff\1\13"+
            "\6\uffff\1\13\1\uffff\1\13\13\uffff\1\13\7\uffff\1\13\11\uffff"+
            "\1\13\20\uffff\1\2\7\uffff\1\13\10\uffff\1\13",
            "\1\13\1\uffff\1\13\1\uffff\1\13\110\uffff\1\13\6\uffff\1\13"+
            "\1\uffff\1\13\13\uffff\1\13\7\uffff\1\13\11\uffff\1\13\20\uffff"+
            "\1\2\7\uffff\1\13\10\uffff\1\13",
            "\1\13\1\uffff\1\13\1\uffff\1\13\110\uffff\1\13\6\uffff\1\13"+
            "\1\uffff\1\13\13\uffff\1\13\7\uffff\1\13\11\uffff\1\13\20\uffff"+
            "\1\2\7\uffff\1\13\10\uffff\1\13",
            "\1\13\1\uffff\1\13\1\uffff\1\13\54\uffff\1\2\33\uffff\1\13"+
            "\6\uffff\1\13\1\uffff\1\13\13\uffff\1\13\7\uffff\1\13\11\uffff"+
            "\1\13\30\uffff\1\13\10\uffff\1\13",
            "\1\13\1\uffff\1\13\1\uffff\1\13\110\uffff\1\13\6\uffff\1\13"+
            "\1\uffff\1\13\13\uffff\1\13\7\uffff\1\13\11\uffff\1\13\30\uffff"+
            "\1\13\10\uffff\1\13\3\uffff\1\2",
            "",
            "\1\2\1\uffff\1\13\37\uffff\62\13\1\uffff\5\13\1\uffff\11\13"+
            "\1\uffff\3\13\1\uffff\1\13\1\uffff\1\13\2\uffff\15\13\1\uffff"+
            "\32\13\1\uffff\1\13",
            "\3\13\4\uffff\1\2\1\uffff\1\13\1\uffff\3\13\33\uffff\62\13"+
            "\1\uffff\5\13\1\uffff\11\13\1\uffff\3\13\1\uffff\1\13\1\uffff"+
            "\2\13\1\uffff\15\13\1\uffff\32\13\1\uffff\3\13\1\uffff\2\13",
            "\1\2\57\uffff\1\13",
            "\1\2\44\uffff\1\13\136\uffff\1\13",
            "\1\2\u0083\uffff\1\13",
            "\1\2\u0083\uffff\1\13",
            "\1\2\57\uffff\1\13",
            "\1\2\u0098\uffff\1\13",
            "\1\2\1\uffff\1\13\37\uffff\62\13\1\uffff\5\13\1\uffff\11\13"+
            "\1\uffff\3\13\1\uffff\1\13\1\uffff\1\13\2\uffff\15\13\1\uffff"+
            "\32\13\1\uffff\1\13",
            "\3\13\4\uffff\1\2\1\uffff\1\13\1\uffff\3\13\33\uffff\62\13"+
            "\1\uffff\5\13\1\uffff\11\13\1\uffff\3\13\1\uffff\1\13\1\uffff"+
            "\2\13\1\uffff\15\13\1\uffff\32\13\1\uffff\3\13\1\uffff\2\13",
            "\1\2\57\uffff\1\13",
            "\1\2\44\uffff\1\13\136\uffff\1\13",
            "\1\2\u0083\uffff\1\13",
            "\1\2\u0083\uffff\1\13",
            "\1\2\57\uffff\1\13",
            "\1\2\u0098\uffff\1\13"
    };

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "229:11: ( AS )?";
        }
    }
 

    public static final BitSet FOLLOW_sql_stmt_in_sql_stmt_list175 = new BitSet(new long[]{0xC000000000000002L,0x00800084A8048048L,0x000001401AB04000L});
    public static final BitSet FOLLOW_EXPLAIN_in_sql_stmt185 = new BitSet(new long[]{0xC000000000800000L,0x00800084A8048048L,0x000001401AB14000L});
    public static final BitSet FOLLOW_QUERY_in_sql_stmt188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_PLAN_in_sql_stmt190 = new BitSet(new long[]{0xC000000000800000L,0x00800084A8048048L,0x000001401AB04000L});
    public static final BitSet FOLLOW_sql_stmt_core_in_sql_stmt196 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMI_in_sql_stmt198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_stmt_in_sql_stmt_core209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attach_stmt_in_sql_stmt_core215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_detach_stmt_in_sql_stmt_core221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_analyze_stmt_in_sql_stmt_core227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reindex_stmt_in_sql_stmt_core233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vacuum_stmt_in_sql_stmt_core239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_sql_stmt_core248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_stmt_in_sql_stmt_core254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_stmt_in_sql_stmt_core260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_stmt_in_sql_stmt_core266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_stmt_in_sql_stmt_core272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commit_stmt_in_sql_stmt_core278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rollback_stmt_in_sql_stmt_core284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_savepoint_stmt_in_sql_stmt_core290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_release_stmt_in_sql_stmt_core296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_virtual_table_stmt_in_sql_stmt_core305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_table_stmt_in_sql_stmt_core311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_table_stmt_in_sql_stmt_core317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alter_table_stmt_in_sql_stmt_core323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_view_stmt_in_sql_stmt_core329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_view_stmt_in_sql_stmt_core335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_index_stmt_in_sql_stmt_core341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_index_stmt_in_sql_stmt_core347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_trigger_stmt_in_sql_stmt_core353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_trigger_stmt_in_sql_stmt_core359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_qualified_table_name372 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_qualified_table_name374 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_qualified_table_name380 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INDEXED_in_qualified_table_name383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_qualified_table_name385 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_qualified_table_name389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_qualified_table_name393 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_INDEXED_in_qualified_table_name395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_signed_number404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000A000000000000L});
    public static final BitSet FOLLOW_set_in_signed_number413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_subexpr_in_expr426 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OR_in_expr429 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_or_subexpr_in_expr432 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_and_subexpr_in_or_subexpr441 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_AND_in_or_subexpr444 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_and_subexpr_in_or_subexpr447 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr456 = new BitSet(new long[]{0x00000000000000F2L,0x1804100000000080L,0x0000000000080035L});
    public static final BitSet FOLLOW_cond_expr_in_and_subexpr458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr470 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000000000080015L});
    public static final BitSet FOLLOW_match_op_in_cond_expr473 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr477 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_ESCAPE_in_cond_expr480 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr512 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_IN_in_cond_expr515 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_cond_expr517 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_cond_expr519 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_cond_expr522 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_cond_expr524 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_cond_expr528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr550 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_IN_in_cond_expr553 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_cond_expr558 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_cond_expr560 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_cond_expr566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISNULL_in_cond_expr597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTNULL_in_cond_expr605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_cond_expr613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_cond_expr615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_cond_expr625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_cond_expr633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_cond_expr635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_cond_expr637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_BETWEEN_in_cond_expr651 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_AND_in_cond_expr657 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_cond_expr687 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr704 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_set_in_match_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_neq_subexpr_in_eq_subexpr737 = new BitSet(new long[]{0x0000000000000F02L});
    public static final BitSet FOLLOW_set_in_eq_subexpr740 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_neq_subexpr_in_eq_subexpr757 = new BitSet(new long[]{0x0000000000000F02L});
    public static final BitSet FOLLOW_bit_subexpr_in_neq_subexpr766 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_set_in_neq_subexpr769 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_bit_subexpr_in_neq_subexpr786 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_add_subexpr_in_bit_subexpr795 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_set_in_bit_subexpr798 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_add_subexpr_in_bit_subexpr807 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_mul_subexpr_in_add_subexpr816 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_set_in_add_subexpr819 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_mul_subexpr_in_add_subexpr832 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_con_subexpr_in_mul_subexpr841 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_DOUBLE_PIPE_in_mul_subexpr844 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_con_subexpr_in_mul_subexpr847 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_set_in_con_subexpr856 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_unary_subexpr_in_con_subexpr873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_expr_in_unary_subexpr880 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_COLLATE_in_unary_subexpr883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_unary_subexpr888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_value_in_atom_expr900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bind_parameter_in_atom_expr906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_atom_expr916 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_atom_expr918 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_atom_expr924 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_atom_expr926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_atom_expr932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom_expr961 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr963 = new BitSet(new long[]{0xFC0000007C1E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_DISTINCT_in_atom_expr966 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_atom_expr971 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_atom_expr974 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_atom_expr978 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_ASTERISK_in_atom_expr984 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr1013 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_atom_expr1016 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_atom_expr1025 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr1028 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_atom_expr1031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_atom_expr1033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_type_name_in_atom_expr1036 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_atom_expr1047 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_atom_expr1052 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_when_expr_in_atom_expr1056 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ELSE_in_atom_expr1060 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_atom_expr1064 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_END_in_atom_expr1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raise_function_in_atom_expr1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHEN_in_when_expr1101 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_when_expr1105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_THEN_in_when_expr1107 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_when_expr1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_literal_value1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal_value1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal_value1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOB_in_literal_value1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal_value1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_TIME_in_literal_value1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_DATE_in_literal_value1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_TIMESTAMP_in_literal_value1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bind_parameter1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bind_parameter1254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_bind_parameter1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_bind_parameter1273 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_bind_parameter1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_bind_parameter1292 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_bind_parameter1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAISE_in_raise_function1317 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_raise_function1320 = new BitSet(new long[]{0x0400000000000000L,0x0001010000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_IGNORE_in_raise_function1324 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_set_in_raise_function1328 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COMMA_in_raise_function1340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_STRING_in_raise_function1345 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_raise_function1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_name1358 = new BitSet(new long[]{0x0000000004000002L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_LPAREN_in_type_name1362 = new BitSet(new long[]{0x0000000000060000L,0x0000000000000000L,0x000A000000000000L});
    public static final BitSet FOLLOW_signed_number_in_type_name1366 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_type_name1369 = new BitSet(new long[]{0x0000000000060000L,0x0000000000000000L,0x000A000000000000L});
    public static final BitSet FOLLOW_signed_number_in_type_name1373 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_type_name1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_in_pragma_stmt1409 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_pragma_stmt1414 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_pragma_stmt1416 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_pragma_stmt1422 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_EQUALS_in_pragma_stmt1425 = new BitSet(new long[]{0xFC00000000060000L,0xEFFBEFFFFFFFFFFFL,0x000BBFFFFFF7FFCAL});
    public static final BitSet FOLLOW_pragma_value_in_pragma_stmt1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_pragma_stmt1431 = new BitSet(new long[]{0xFC00000000060000L,0xEFFBEFFFFFFFFFFFL,0x000BBFFFFFF7FFCAL});
    public static final BitSet FOLLOW_pragma_value_in_pragma_stmt1433 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_pragma_stmt1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signed_number_in_pragma_value1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_pragma_value1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_pragma_value1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTACH_in_attach_stmt1462 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0001BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_DATABASE_in_attach_stmt1465 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0001BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_STRING_in_attach_stmt1472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_attach_stmt1476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_attach_stmt1479 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_attach_stmt1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DETACH_in_detach_stmt1491 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_DATABASE_in_detach_stmt1494 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_detach_stmt1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANALYZE_in_analyze_stmt1508 = new BitSet(new long[]{0xFC00000000000002L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_analyze_stmt1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_analyze_stmt1519 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_analyze_stmt1521 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_analyze_stmt1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REINDEX_in_reindex_stmt1535 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_reindex_stmt1540 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_reindex_stmt1542 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_reindex_stmt1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VACUUM_in_vacuum_stmt1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_operation_conflict_clause1567 = new BitSet(new long[]{0x0400000000000000L,0x0001010000000000L,0x0000000002800000L});
    public static final BitSet FOLLOW_set_in_operation_conflict_clause1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_ordering_term1594 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000004L});
    public static final BitSet FOLLOW_ASC_in_ordering_term1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_ordering_term1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_operation_limited_clause1633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_operation_limited_clause1635 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ordering_term_in_operation_limited_clause1637 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_operation_limited_clause1640 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ordering_term_in_operation_limited_clause1642 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_operation_limited_clause1650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_operation_limited_clause1654 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_set_in_operation_limited_clause1657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_operation_limited_clause1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_list_in_select_stmt1677 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_ORDER_in_select_stmt1682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_select_stmt1684 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt1686 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt1689 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt1691 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_select_stmt1700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt1704 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_OFFSET_in_select_stmt1708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt1712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_core_in_select_list1762 = new BitSet(new long[]{0x0000000000000002L,0x0200001000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_select_op_in_select_list1765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_core_in_select_list1768 = new BitSet(new long[]{0x0000000000000002L,0x0200001000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_UNION_in_select_op1777 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ALL_in_select_op1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERSECT_in_select_op1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCEPT_in_select_op1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_core1800 = new BitSet(new long[]{0xFC000000741E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ALL_in_select_core1803 = new BitSet(new long[]{0xFC000000741E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_DISTINCT_in_select_core1807 = new BitSet(new long[]{0xFC000000741E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_result_column_in_select_core1811 = new BitSet(new long[]{0x0000000002000002L,0x0000280000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_core1814 = new BitSet(new long[]{0xFC000000741E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_result_column_in_select_core1816 = new BitSet(new long[]{0x0000000002000002L,0x0000280000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_FROM_in_select_core1821 = new BitSet(new long[]{0xFC00000004000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_join_source_in_select_core1823 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_WHERE_in_select_core1828 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_select_core1832 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_GROUP_in_select_core1840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_select_core1842 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ordering_term_in_select_core1844 = new BitSet(new long[]{0x0000000002000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_core1847 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ordering_term_in_select_core1849 = new BitSet(new long[]{0x0000000002000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_HAVING_in_select_core1854 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_select_core1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_result_column1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_result_column1936 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_result_column1938 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ASTERISK_in_result_column1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_result_column1955 = new BitSet(new long[]{0xFC00000000000002L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_AS_in_result_column1959 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_result_column1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_source_in_join_source1986 = new BitSet(new long[]{0x0000000002000002L,0xA040000000080000L,0x0000000000001008L});
    public static final BitSet FOLLOW_join_op_in_join_source1989 = new BitSet(new long[]{0xFC00000004000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_single_source_in_join_source1992 = new BitSet(new long[]{0x0000000002000002L,0xA040000000080000L,0x0000008000001208L});
    public static final BitSet FOLLOW_join_constraint_in_join_source1995 = new BitSet(new long[]{0x0000000002000002L,0xA040000000080000L,0x0000000000001008L});
    public static final BitSet FOLLOW_id_in_single_source2012 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_single_source2014 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_single_source2020 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000002L,0x0000800000000010L});
    public static final BitSet FOLLOW_AS_in_single_source2024 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_single_source2030 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INDEXED_in_single_source2035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_single_source2037 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_single_source2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_single_source2045 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_INDEXED_in_single_source2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_single_source2088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_single_source2090 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_single_source2092 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_AS_in_single_source2096 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_single_source2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_single_source2124 = new BitSet(new long[]{0xFC00000004000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_join_source_in_single_source2127 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_single_source2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_join_op2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATURAL_in_join_op2147 = new BitSet(new long[]{0x0000000000000000L,0xA040000000080000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LEFT_in_join_op2153 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_OUTER_in_join_op2158 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_INNER_in_join_op2164 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_CROSS_in_join_op2168 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_JOIN_in_join_op2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_join_constraint2182 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_join_constraint2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_join_constraint2191 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_join_constraint2193 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_join_constraint2197 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_join_constraint2200 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_join_constraint2204 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_join_constraint2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_stmt2227 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_operation_conflict_clause_in_insert_stmt2230 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_REPLACE_in_insert_stmt2236 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_INTO_in_insert_stmt2239 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_insert_stmt2244 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_insert_stmt2246 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_insert_stmt2252 = new BitSet(new long[]{0x0000000004000000L,0x0000000001000000L,0x0000020010000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt2259 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_insert_stmt2263 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt2266 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_insert_stmt2270 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt2274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020010000000L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt2283 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt2285 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_insert_stmt2289 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt2292 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_insert_stmt2296 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_insert_stmt2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_insert_stmt2311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update_stmt2323 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_operation_conflict_clause_in_update_stmt2326 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_qualified_table_name_in_update_stmt2330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_SET_in_update_stmt2334 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_update_set_in_update_stmt2338 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000200000000802L});
    public static final BitSet FOLLOW_COMMA_in_update_stmt2341 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_update_set_in_update_stmt2345 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000200000000802L});
    public static final BitSet FOLLOW_WHERE_in_update_stmt2350 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_update_stmt2352 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_operation_limited_clause_in_update_stmt2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_update_set2368 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQUALS_in_update_set2370 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_update_set2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_stmt2380 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_FROM_in_delete_stmt2382 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_qualified_table_name_in_delete_stmt2384 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000802L});
    public static final BitSet FOLLOW_WHERE_in_delete_stmt2387 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_delete_stmt2389 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_operation_limited_clause_in_delete_stmt2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_begin_stmt2404 = new BitSet(new long[]{0x0000000000000002L,0x0002002004000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_set_in_begin_stmt2406 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_begin_stmt2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_commit_stmt2430 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_commit_stmt2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROLLBACK_in_rollback_stmt2449 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_rollback_stmt2452 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_TO_in_rollback_stmt2457 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_SAVEPOINT_in_rollback_stmt2460 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_rollback_stmt2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVEPOINT_in_savepoint_stmt2476 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_savepoint_stmt2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELEASE_in_release_stmt2488 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_SAVEPOINT_in_release_stmt2491 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_release_stmt2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_table_conflict_clause2509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_CONFLICT_in_table_conflict_clause2512 = new BitSet(new long[]{0x0400000000000000L,0x0001010000000000L,0x0000000002800000L});
    public static final BitSet FOLLOW_set_in_table_conflict_clause2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_virtual_table_stmt2542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_VIRTUAL_in_create_virtual_table_stmt2544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_create_virtual_table_stmt2546 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2551 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_virtual_table_stmt2553 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_USING_in_create_virtual_table_stmt2563 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2567 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_LPAREN_in_create_virtual_table_stmt2570 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_virtual_table_stmt2572 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_virtual_table_stmt2575 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_virtual_table_stmt2577 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_virtual_table_stmt2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_table_stmt2591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_table_stmt2593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_create_table_stmt2596 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_create_table_stmt2599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_table_stmt2601 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_table_stmt2603 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_table_stmt2610 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_table_stmt2612 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_table_stmt2618 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_create_table_stmt2624 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_table_stmt2626 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_table_stmt2629 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_table_stmt2631 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_table_stmt2636 = new BitSet(new long[]{0x0000000000000000L,0x0000040000021000L,0x0000002000008000L});
    public static final BitSet FOLLOW_table_constraint_in_create_table_stmt2638 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_table_stmt2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_create_table_stmt2648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_create_table_stmt2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_column_def_in_column_def2706 = new BitSet(new long[]{0x0000000000000002L,0x0000000001023000L,0x0000802000048010L});
    public static final BitSet FOLLOW_type_name_in_column_def2708 = new BitSet(new long[]{0x0000000000000002L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_column_constraint_in_column_def2711 = new BitSet(new long[]{0x0000000000000002L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_CONSTRAINT_in_column_constraint2737 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_column_constraint2741 = new BitSet(new long[]{0x0000000000000000L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_column_constraint_pk_in_column_constraint2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_not_null_in_column_constraint2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_unique_in_column_constraint2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_check_in_column_constraint2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_default_in_column_constraint2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_collate_in_column_constraint2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fk_clause_in_column_constraint2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_in_column_constraint_pk2840 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_KEY_in_column_constraint_pk2843 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000014L,0x0000000000000200L});
    public static final BitSet FOLLOW_set_in_column_constraint_pk2846 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_pk2855 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_AUTOINCREMENT_in_column_constraint_pk2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_column_constraint_not_null2868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_column_constraint_not_null2870 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_not_null2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_column_constraint_unique2889 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_unique2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECK_in_column_constraint_check2900 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_column_constraint_check2903 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_column_constraint_check2906 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_column_constraint_check2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_column_constraint_default2917 = new BitSet(new long[]{0x0000000004060000L,0x0000000000700000L,0x001B000000000040L});
    public static final BitSet FOLLOW_set_in_column_constraint_default2921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000A000000000000L});
    public static final BitSet FOLLOW_set_in_column_constraint_default2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_value_in_column_constraint_default2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_column_constraint_default2943 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_column_constraint_default2946 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_column_constraint_default2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLATE_in_column_constraint_collate2957 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_column_constraint_collate2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRAINT_in_table_constraint2971 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_table_constraint2975 = new BitSet(new long[]{0x0000000000000000L,0x0000040000021000L,0x0000002000008000L});
    public static final BitSet FOLLOW_table_constraint_pk_in_table_constraint2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_unique_in_table_constraint2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_check_in_table_constraint2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_fk_in_table_constraint3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_in_table_constraint_pk3041 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_KEY_in_table_constraint_pk3043 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_pk3047 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_table_constraint_pk3051 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_pk3054 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_table_constraint_pk3058 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_pk3062 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_table_constraint_pk3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_table_constraint_unique3089 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_unique3093 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_table_constraint_unique3097 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_unique3100 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_table_constraint_unique3104 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_unique3108 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_table_constraint_unique3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECK_in_table_constraint_check3135 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_check3138 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_table_constraint_check3141 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_check3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREIGN_in_table_constraint_fk3151 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_KEY_in_table_constraint_fk3153 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_fk3155 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_table_constraint_fk3159 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_fk3162 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_table_constraint_fk3166 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_fk3170 = new BitSet(new long[]{0x0000000000000000L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_fk_clause_in_table_constraint_fk3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCES_in_fk_clause3195 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_fk_clause3199 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000204L});
    public static final BitSet FOLLOW_LPAREN_in_fk_clause3202 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_fk_clause3206 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_fk_clause3209 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_fk_clause3213 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_fk_clause3217 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000204L});
    public static final BitSet FOLLOW_fk_clause_action_in_fk_clause3223 = new BitSet(new long[]{0x0000000004000002L,0x0000000002000000L,0x0000000000000214L});
    public static final BitSet FOLLOW_fk_clause_deferrable_in_fk_clause3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_fk_clause_action3260 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_set_in_fk_clause_action3263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L,0x0000000021000000L});
    public static final BitSet FOLLOW_SET_in_fk_clause_action3276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_fk_clause_action3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_fk_clause_action3283 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_DEFAULT_in_fk_clause_action3286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASCADE_in_fk_clause_action3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESTRICT_in_fk_clause_action3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCH_in_fk_clause_action3301 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_fk_clause_action3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_fk_clause_deferrable3312 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_DEFERRABLE_in_fk_clause_deferrable3316 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_INITIALLY_in_fk_clause_deferrable3320 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_DEFERRED_in_fk_clause_deferrable3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITIALLY_in_fk_clause_deferrable3327 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IMMEDIATE_in_fk_clause_deferrable3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_table_stmt3340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_drop_table_stmt3342 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_drop_table_stmt3345 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_table_stmt3347 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_table_stmt3354 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_table_stmt3356 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_table_stmt3362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALTER_in_alter_table_stmt3392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_alter_table_stmt3394 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3399 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_alter_table_stmt3401 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3407 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RENAME_in_alter_table_stmt3410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_TO_in_alter_table_stmt3412 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_alter_table_stmt3420 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_COLUMN_in_alter_table_stmt3423 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_alter_table_stmt3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_view_stmt3436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040080000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_view_stmt3438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_VIEW_in_create_view_stmt3441 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_create_view_stmt3444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_view_stmt3446 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_view_stmt3448 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_view_stmt3455 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_view_stmt3457 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_view_stmt3463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_create_view_stmt3465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_create_view_stmt3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_view_stmt3475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_VIEW_in_drop_view_stmt3477 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_drop_view_stmt3480 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_view_stmt3482 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_view_stmt3489 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_view_stmt3491 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_view_stmt3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_index_stmt3505 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_UNIQUE_in_create_index_stmt3508 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_INDEX_in_create_index_stmt3512 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_create_index_stmt3515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_index_stmt3517 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_index_stmt3519 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3526 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_index_stmt3528 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ON_in_create_index_stmt3538 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3542 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_create_index_stmt3544 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_indexed_column_in_create_index_stmt3548 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_index_stmt3551 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_indexed_column_in_create_index_stmt3555 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_index_stmt3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_indexed_column3605 = new BitSet(new long[]{0x0000000000000002L,0x0000000010002004L});
    public static final BitSet FOLLOW_COLLATE_in_indexed_column3608 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_indexed_column3612 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000004L});
    public static final BitSet FOLLOW_ASC_in_indexed_column3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_indexed_column3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_index_stmt3652 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_INDEX_in_drop_index_stmt3654 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_drop_index_stmt3657 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_index_stmt3659 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_index_stmt3666 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_index_stmt3668 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_index_stmt3674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_trigger_stmt3704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000880000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_trigger_stmt3706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_TRIGGER_in_create_trigger_stmt3709 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_create_trigger_stmt3712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_trigger_stmt3714 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_trigger_stmt3716 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3723 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_trigger_stmt3725 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3731 = new BitSet(new long[]{0x1000000000000000L,0x0180000008000020L,0x0000004000000000L});
    public static final BitSet FOLLOW_BEFORE_in_create_trigger_stmt3736 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_AFTER_in_create_trigger_stmt3740 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_INSTEAD_in_create_trigger_stmt3744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_OF_in_create_trigger_stmt3746 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_DELETE_in_create_trigger_stmt3751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INSERT_in_create_trigger_stmt3755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_UPDATE_in_create_trigger_stmt3759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_OF_in_create_trigger_stmt3762 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3766 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_create_trigger_stmt3769 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3773 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ON_in_create_trigger_stmt3782 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3786 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000040L,0x0000100000000000L});
    public static final BitSet FOLLOW_FOR_in_create_trigger_stmt3789 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_EACH_in_create_trigger_stmt3791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ROW_in_create_trigger_stmt3793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000100000000000L});
    public static final BitSet FOLLOW_WHEN_in_create_trigger_stmt3798 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_create_trigger_stmt3800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_BEGIN_in_create_trigger_stmt3806 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004010800000L});
    public static final BitSet FOLLOW_update_stmt_in_create_trigger_stmt3810 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_insert_stmt_in_create_trigger_stmt3814 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_delete_stmt_in_create_trigger_stmt3818 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_select_stmt_in_create_trigger_stmt3822 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMI_in_create_trigger_stmt3825 = new BitSet(new long[]{0x0000000000000000L,0x0080000408000000L,0x0000004010800000L});
    public static final BitSet FOLLOW_END_in_create_trigger_stmt3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_trigger_stmt3837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_TRIGGER_in_drop_trigger_stmt3839 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_drop_trigger_stmt3842 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_trigger_stmt3844 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_trigger_stmt3851 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_trigger_stmt3853 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_trigger_stmt3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id3869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_id3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword3880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_column_def4547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_column_def_in_id_column_def4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword_column_def4558 = new BitSet(new long[]{0x0000000000000002L});

}