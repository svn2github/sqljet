// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 SqlParser.g 2009-05-06 13:20:33

  package org.tmatesoft.sqljet.core.internal.lang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class SqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "EQUALS", "EQUALS2", "NOT_EQUALS", "NOT_EQUALS2", "LESS", "LESS_OR_EQ", "GREATER", "GREATER_OR_EQ", "SHIFT_LEFT", "SHIFT_RIGHT", "AMPERSAND", "PIPE", "DOUBLE_PIPE", "PLUS", "MINUS", "TILDA", "ASTERISK", "SLASH", "PERCENT", "SEMI", "DOT", "COMMA", "LPAREN", "RPAREN", "QUESTION", "COLON", "AT", "DOLLAR", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "ABORT", "ADD", "AFTER", "ALL", "ALTER", "ANALYZE", "AND", "AS", "ASC", "ATTACH", "AUTOINCREMENT", "BEFORE", "BEGIN", "BETWEEN", "BY", "CASCADE", "CASE", "CAST", "CHECK", "COLLATE", "COLUMN", "COMMIT", "CONFLICT", "CONSTRAINT", "CREATE", "CROSS", "CURRENT_TIME", "CURRENT_DATE", "CURRENT_TIMESTAMP", "DATABASE", "DEFAULT", "DEFERRABLE", "DEFERRED", "DELETE", "DESC", "DETACH", "DISTINCT", "DROP", "EACH", "ELSE", "END", "ESCAPE", "EXCEPT", "EXCLUSIVE", "EXISTS", "EXPLAIN", "FAIL", "FOR", "FOREIGN", "FROM", "GLOB", "GROUP", "HAVING", "IF", "IGNORE", "IMMEDIATE", "IN", "INDEX", "INDEXED", "INITIALLY", "INNER", "INSERT", "INSTEAD", "INTERSECT", "INTO", "IS", "ISNULL", "JOIN", "KEY", "LEFT", "LIKE", "LIMIT", "MATCH", "NATURAL", "NOT", "NOTNULL", "NULL", "OF", "OFFSET", "ON", "OR", "ORDER", "OUTER", "PLAN", "PRAGMA", "PRIMARY", "QUERY", "RAISE", "REFERENCES", "REGEXP", "REINDEX", "RELEASE", "RENAME", "REPLACE", "RESTRICT", "ROLLBACK", "ROW", "SAVEPOINT", "SELECT", "SET", "TABLE", "TEMPORARY", "THEN", "TO", "TRANSACTION", "TRIGGER", "UNION", "UNIQUE", "UPDATE", "USING", "VACUUM", "VALUES", "VIEW", "VIRTUAL", "WHEN", "WHERE", "ID_START", "ID", "TCL_ID", "STRING", "INTEGER", "FLOAT_EXP", "FLOAT", "SIGNED_NUMBER", "BLOB", "COMMENT", "LINE_COMMENT", "WS", "ALIAS", "COLUMN_DEFS", "COLUMN_CONSTRAINT", "CONSTRAINTS", "CREATE_TABLE", "DROP_TABLE", "NOT_NULL", "OPTIONS", "ORDERING", "RESULT_COLUMNS", "SELECT_CORE", "TABLE_CONSTRAINT", "TYPE", "TYPE_PARAMS"
    };
    public static final int ROW=154;
    public static final int TYPE_PARAMS=199;
    public static final int NOT=132;
    public static final int EXCEPT=100;
    public static final int FOREIGN=106;
    public static final int EOF=-1;
    public static final int SIGNED_NUMBER=181;
    public static final int TYPE=198;
    public static final int RPAREN=27;
    public static final int CREATE=82;
    public static final int USING=167;
    public static final int BEGIN=70;
    public static final int REGEXP=147;
    public static final int ANALYZE=63;
    public static final int CONFLICT=80;
    public static final int LESS_OR_EQ=9;
    public static final int ATTACH=67;
    public static final int VIRTUAL=171;
    public static final int D=35;
    public static final int E=36;
    public static final int F=37;
    public static final int G=38;
    public static final int BLOB=182;
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
    public static final int J=41;
    public static final int ELSE=97;
    public static final int K=42;
    public static final int U=52;
    public static final int T=51;
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
    public static final int WS=185;
    public static final int PLAN=141;
    public static final int ALIAS=186;
    public static final int END=98;
    public static final int CONSTRAINT=81;
    public static final int RENAME=150;
    public static final int ALTER=62;
    public static final int ISNULL=124;
    public static final int TABLE=158;
    public static final int FLOAT=180;
    public static final int NOTNULL=133;
    public static final int NOT_EQUALS=6;
    public static final int NOT_NULL=192;
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
    public static final int INTEGER=178;
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
    public static final int FLOAT_EXP=179;
    public static final int COMMIT=79;
    public static final int DATABASE=87;
    public static final int VACUUM=168;
    public static final int DROP=95;
    public static final int DETACH=93;
    public static final int WHEN=172;
    public static final int NATURAL=131;
    public static final int BETWEEN=71;
    public static final int OPTIONS=193;
    public static final int STRING=177;
    public static final int CAST=75;
    public static final int TABLE_CONSTRAINT=197;
    public static final int TRIGGER=163;
    public static final int CURRENT_TIME=84;
    public static final int CASE=74;
    public static final int EQUALS=4;
    public static final int CASCADE=73;
    public static final int RELEASE=149;
    public static final int EXPLAIN=103;
    public static final int GREATER=10;
    public static final int RESULT_COLUMNS=195;
    public static final int INSERT=119;
    public static final int ESCAPE=99;
    public static final int SAVEPOINT=155;
    public static final int LESS=8;
    public static final int RAISE=145;
    public static final int EACH=96;
    public static final int COMMENT=183;
    public static final int ABORT=58;
    public static final int SELECT=156;
    public static final int INTO=122;
    public static final int UNIQUE=165;
    public static final int GLOB=108;
    public static final int VIEW=170;
    public static final int LINE_COMMENT=184;
    public static final int NULL=134;
    public static final int ON=137;
    public static final int MATCH=130;
    public static final int PRIMARY=143;
    public static final int DELETE=91;
    public static final int OF=135;
    public static final int SHIFT_LEFT=12;
    public static final int SHIFT_RIGHT=13;
    public static final int OR=138;
    public static final int QUERY=144;
    public static final int COLUMN_DEFS=187;
    public static final int CHECK=76;
    public static final int FROM=107;
    public static final int TEMPORARY=159;
    public static final int DISTINCT=94;
    public static final int CURRENT_DATE=85;
    public static final int DOLLAR=31;
    public static final int CONSTRAINTS=189;
    public static final int WHERE=173;
    public static final int INNER=118;
    public static final int ORDER=139;
    public static final int LIMIT=129;
    public static final int PRAGMA=142;
    public static final int UPDATE=166;
    public static final int FOR=105;
    public static final int DEFERRED=90;
    public static final int SELECT_CORE=196;
    public static final int EXCLUSIVE=101;
    public static final int ID=175;
    public static final int AND=64;
    public static final int CROSS=83;
    public static final int IF=111;
    public static final int INDEX=115;
    public static final int TILDA=19;
    public static final int IN=114;
    public static final int CREATE_TABLE=190;
    public static final int REFERENCES=146;
    public static final int COMMA=25;
    public static final int IS=123;
    public static final int ALL=61;
    public static final int TCL_ID=176;
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
    public static final int INDEXED=116;
    public static final int QUESTION=28;
    public static final int ORDERING=194;
    public static final int IMMEDIATE=113;
    public static final int DESC=92;
    public static final int DROP_TABLE=191;
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
    // SqlParser.g:48:1: sql_stmt_list : ( sql_stmt )+ ;
    public final SqlParser.sql_stmt_list_return sql_stmt_list() throws RecognitionException {
        SqlParser.sql_stmt_list_return retval = new SqlParser.sql_stmt_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.sql_stmt_return sql_stmt1 = null;



        try {
            // SqlParser.g:48:14: ( ( sql_stmt )+ )
            // SqlParser.g:48:16: ( sql_stmt )+
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:48:16: ( sql_stmt )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // SqlParser.g:48:17: sql_stmt
            	    {
            	    pushFollow(FOLLOW_sql_stmt_in_sql_stmt_list130);
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
    // SqlParser.g:50:1: sql_stmt : ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI ;
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
            // SqlParser.g:50:9: ( ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI )
            // SqlParser.g:50:11: ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:50:11: ( EXPLAIN ( QUERY PLAN )? )?
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // SqlParser.g:50:12: EXPLAIN ( QUERY PLAN )?
                    {
                    EXPLAIN2=(Token)match(input,EXPLAIN,FOLLOW_EXPLAIN_in_sql_stmt140); 
                    EXPLAIN2_tree = (Object)adaptor.create(EXPLAIN2);
                    adaptor.addChild(root_0, EXPLAIN2_tree);

                    // SqlParser.g:50:20: ( QUERY PLAN )?
                    int alt2=2;
                    alt2 = dfa2.predict(input);
                    switch (alt2) {
                        case 1 :
                            // SqlParser.g:50:21: QUERY PLAN
                            {
                            QUERY3=(Token)match(input,QUERY,FOLLOW_QUERY_in_sql_stmt143); 
                            QUERY3_tree = (Object)adaptor.create(QUERY3);
                            adaptor.addChild(root_0, QUERY3_tree);

                            PLAN4=(Token)match(input,PLAN,FOLLOW_PLAN_in_sql_stmt145); 
                            PLAN4_tree = (Object)adaptor.create(PLAN4);
                            adaptor.addChild(root_0, PLAN4_tree);


                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_sql_stmt_core_in_sql_stmt151);
            sql_stmt_core5=sql_stmt_core();

            state._fsp--;

            adaptor.addChild(root_0, sql_stmt_core5.getTree());
            SEMI6=(Token)match(input,SEMI,FOLLOW_SEMI_in_sql_stmt153); 

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
    // SqlParser.g:52:1: sql_stmt_core : ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt );
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
            // SqlParser.g:53:3: ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt )
            int alt4=25;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // SqlParser.g:53:5: pragma_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pragma_stmt_in_sql_stmt_core164);
                    pragma_stmt7=pragma_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_stmt7.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:54:5: attach_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_attach_stmt_in_sql_stmt_core170);
                    attach_stmt8=attach_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, attach_stmt8.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:55:5: detach_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_detach_stmt_in_sql_stmt_core176);
                    detach_stmt9=detach_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, detach_stmt9.getTree());

                    }
                    break;
                case 4 :
                    // SqlParser.g:56:5: analyze_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_analyze_stmt_in_sql_stmt_core182);
                    analyze_stmt10=analyze_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, analyze_stmt10.getTree());

                    }
                    break;
                case 5 :
                    // SqlParser.g:57:5: reindex_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_reindex_stmt_in_sql_stmt_core188);
                    reindex_stmt11=reindex_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, reindex_stmt11.getTree());

                    }
                    break;
                case 6 :
                    // SqlParser.g:58:5: vacuum_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_vacuum_stmt_in_sql_stmt_core194);
                    vacuum_stmt12=vacuum_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, vacuum_stmt12.getTree());

                    }
                    break;
                case 7 :
                    // SqlParser.g:60:5: select_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_select_stmt_in_sql_stmt_core203);
                    select_stmt13=select_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, select_stmt13.getTree());

                    }
                    break;
                case 8 :
                    // SqlParser.g:61:5: insert_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_insert_stmt_in_sql_stmt_core209);
                    insert_stmt14=insert_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, insert_stmt14.getTree());

                    }
                    break;
                case 9 :
                    // SqlParser.g:62:5: update_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_update_stmt_in_sql_stmt_core215);
                    update_stmt15=update_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, update_stmt15.getTree());

                    }
                    break;
                case 10 :
                    // SqlParser.g:63:5: delete_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_delete_stmt_in_sql_stmt_core221);
                    delete_stmt16=delete_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_stmt16.getTree());

                    }
                    break;
                case 11 :
                    // SqlParser.g:64:5: begin_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_begin_stmt_in_sql_stmt_core227);
                    begin_stmt17=begin_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, begin_stmt17.getTree());

                    }
                    break;
                case 12 :
                    // SqlParser.g:65:5: commit_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_commit_stmt_in_sql_stmt_core233);
                    commit_stmt18=commit_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, commit_stmt18.getTree());

                    }
                    break;
                case 13 :
                    // SqlParser.g:66:5: rollback_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_rollback_stmt_in_sql_stmt_core239);
                    rollback_stmt19=rollback_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, rollback_stmt19.getTree());

                    }
                    break;
                case 14 :
                    // SqlParser.g:67:5: savepoint_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_savepoint_stmt_in_sql_stmt_core245);
                    savepoint_stmt20=savepoint_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, savepoint_stmt20.getTree());

                    }
                    break;
                case 15 :
                    // SqlParser.g:68:5: release_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_release_stmt_in_sql_stmt_core251);
                    release_stmt21=release_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, release_stmt21.getTree());

                    }
                    break;
                case 16 :
                    // SqlParser.g:70:5: create_virtual_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_virtual_table_stmt_in_sql_stmt_core260);
                    create_virtual_table_stmt22=create_virtual_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_virtual_table_stmt22.getTree());

                    }
                    break;
                case 17 :
                    // SqlParser.g:71:5: create_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_table_stmt_in_sql_stmt_core266);
                    create_table_stmt23=create_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_table_stmt23.getTree());

                    }
                    break;
                case 18 :
                    // SqlParser.g:72:5: drop_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_table_stmt_in_sql_stmt_core272);
                    drop_table_stmt24=drop_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_table_stmt24.getTree());

                    }
                    break;
                case 19 :
                    // SqlParser.g:73:5: alter_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_alter_table_stmt_in_sql_stmt_core278);
                    alter_table_stmt25=alter_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, alter_table_stmt25.getTree());

                    }
                    break;
                case 20 :
                    // SqlParser.g:74:5: create_view_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_view_stmt_in_sql_stmt_core284);
                    create_view_stmt26=create_view_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_view_stmt26.getTree());

                    }
                    break;
                case 21 :
                    // SqlParser.g:75:5: drop_view_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_view_stmt_in_sql_stmt_core290);
                    drop_view_stmt27=drop_view_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_view_stmt27.getTree());

                    }
                    break;
                case 22 :
                    // SqlParser.g:76:5: create_index_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_index_stmt_in_sql_stmt_core296);
                    create_index_stmt28=create_index_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_index_stmt28.getTree());

                    }
                    break;
                case 23 :
                    // SqlParser.g:77:5: drop_index_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_index_stmt_in_sql_stmt_core302);
                    drop_index_stmt29=drop_index_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_index_stmt29.getTree());

                    }
                    break;
                case 24 :
                    // SqlParser.g:78:5: create_trigger_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_trigger_stmt_in_sql_stmt_core308);
                    create_trigger_stmt30=create_trigger_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_trigger_stmt30.getTree());

                    }
                    break;
                case 25 :
                    // SqlParser.g:79:5: drop_trigger_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_trigger_stmt_in_sql_stmt_core314);
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
    // SqlParser.g:81:1: qualified_table_name : (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )? ;
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
            // SqlParser.g:81:21: ( (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )? )
            // SqlParser.g:81:23: (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )?
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:81:23: (database_name= id DOT )?
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // SqlParser.g:81:24: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_qualified_table_name324);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT32=(Token)match(input,DOT,FOLLOW_DOT_in_qualified_table_name326); 
                    DOT32_tree = (Object)adaptor.create(DOT32);
                    adaptor.addChild(root_0, DOT32_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_qualified_table_name332);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:81:61: ( INDEXED BY index_name= id | NOT INDEXED )?
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
                    // SqlParser.g:81:62: INDEXED BY index_name= id
                    {
                    INDEXED33=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_qualified_table_name335); 
                    INDEXED33_tree = (Object)adaptor.create(INDEXED33);
                    adaptor.addChild(root_0, INDEXED33_tree);

                    BY34=(Token)match(input,BY,FOLLOW_BY_in_qualified_table_name337); 
                    BY34_tree = (Object)adaptor.create(BY34);
                    adaptor.addChild(root_0, BY34_tree);

                    pushFollow(FOLLOW_id_in_qualified_table_name341);
                    index_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, index_name.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:81:89: NOT INDEXED
                    {
                    NOT35=(Token)match(input,NOT,FOLLOW_NOT_in_qualified_table_name345); 
                    NOT35_tree = (Object)adaptor.create(NOT35);
                    adaptor.addChild(root_0, NOT35_tree);

                    INDEXED36=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_qualified_table_name347); 
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

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // SqlParser.g:83:1: expr : or_subexpr ( OR or_subexpr )* ;
    public final SqlParser.expr_return expr() throws RecognitionException {
        SqlParser.expr_return retval = new SqlParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR38=null;
        SqlParser.or_subexpr_return or_subexpr37 = null;

        SqlParser.or_subexpr_return or_subexpr39 = null;


        Object OR38_tree=null;

        try {
            // SqlParser.g:83:5: ( or_subexpr ( OR or_subexpr )* )
            // SqlParser.g:83:7: or_subexpr ( OR or_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_or_subexpr_in_expr356);
            or_subexpr37=or_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, or_subexpr37.getTree());
            // SqlParser.g:83:18: ( OR or_subexpr )*
            loop7:
            do {
                int alt7=2;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // SqlParser.g:83:19: OR or_subexpr
            	    {
            	    OR38=(Token)match(input,OR,FOLLOW_OR_in_expr359); 
            	    OR38_tree = (Object)adaptor.create(OR38);
            	    root_0 = (Object)adaptor.becomeRoot(OR38_tree, root_0);

            	    pushFollow(FOLLOW_or_subexpr_in_expr362);
            	    or_subexpr39=or_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, or_subexpr39.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // SqlParser.g:85:1: or_subexpr : and_subexpr ( AND and_subexpr )* ;
    public final SqlParser.or_subexpr_return or_subexpr() throws RecognitionException {
        SqlParser.or_subexpr_return retval = new SqlParser.or_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND41=null;
        SqlParser.and_subexpr_return and_subexpr40 = null;

        SqlParser.and_subexpr_return and_subexpr42 = null;


        Object AND41_tree=null;

        try {
            // SqlParser.g:85:11: ( and_subexpr ( AND and_subexpr )* )
            // SqlParser.g:85:13: and_subexpr ( AND and_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_and_subexpr_in_or_subexpr371);
            and_subexpr40=and_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, and_subexpr40.getTree());
            // SqlParser.g:85:25: ( AND and_subexpr )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // SqlParser.g:85:26: AND and_subexpr
            	    {
            	    AND41=(Token)match(input,AND,FOLLOW_AND_in_or_subexpr374); 
            	    AND41_tree = (Object)adaptor.create(AND41);
            	    root_0 = (Object)adaptor.becomeRoot(AND41_tree, root_0);

            	    pushFollow(FOLLOW_and_subexpr_in_or_subexpr377);
            	    and_subexpr42=and_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, and_subexpr42.getTree());

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
    // $ANTLR end "or_subexpr"

    public static class and_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "and_subexpr"
    // SqlParser.g:87:1: and_subexpr : ( eq_subexpr ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )* | ( NOT )? ( LIKE | GLOB | REGEXP | MATCH ) eq_subexpr ( ESCAPE eq_subexpr )? | ( NOT )? IN ( LPAREN ( select_stmt | expr ( COMMA expr )* )? RPAREN | (database_name= id DOT )? table_name= id ) | ( ISNULL | NOTNULL | IS NULL | IS NOT NULL ) | ( NOT )? BETWEEN eq_subexpr AND eq_subexpr );
    public final SqlParser.and_subexpr_return and_subexpr() throws RecognitionException {
        SqlParser.and_subexpr_return retval = new SqlParser.and_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set44=null;
        Token NOT46=null;
        Token set47=null;
        Token ESCAPE49=null;
        Token NOT51=null;
        Token IN52=null;
        Token LPAREN53=null;
        Token COMMA56=null;
        Token RPAREN58=null;
        Token DOT59=null;
        Token ISNULL60=null;
        Token NOTNULL61=null;
        Token IS62=null;
        Token NULL63=null;
        Token IS64=null;
        Token NOT65=null;
        Token NULL66=null;
        Token NOT67=null;
        Token BETWEEN68=null;
        Token AND70=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.eq_subexpr_return eq_subexpr43 = null;

        SqlParser.eq_subexpr_return eq_subexpr45 = null;

        SqlParser.eq_subexpr_return eq_subexpr48 = null;

        SqlParser.eq_subexpr_return eq_subexpr50 = null;

        SqlParser.select_stmt_return select_stmt54 = null;

        SqlParser.expr_return expr55 = null;

        SqlParser.expr_return expr57 = null;

        SqlParser.eq_subexpr_return eq_subexpr69 = null;

        SqlParser.eq_subexpr_return eq_subexpr71 = null;


        Object set44_tree=null;
        Object NOT46_tree=null;
        Object set47_tree=null;
        Object ESCAPE49_tree=null;
        Object NOT51_tree=null;
        Object IN52_tree=null;
        Object LPAREN53_tree=null;
        Object COMMA56_tree=null;
        Object RPAREN58_tree=null;
        Object DOT59_tree=null;
        Object ISNULL60_tree=null;
        Object NOTNULL61_tree=null;
        Object IS62_tree=null;
        Object NULL63_tree=null;
        Object IS64_tree=null;
        Object NOT65_tree=null;
        Object NULL66_tree=null;
        Object NOT67_tree=null;
        Object BETWEEN68_tree=null;
        Object AND70_tree=null;

        try {
            // SqlParser.g:87:12: ( eq_subexpr ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )* | ( NOT )? ( LIKE | GLOB | REGEXP | MATCH ) eq_subexpr ( ESCAPE eq_subexpr )? | ( NOT )? IN ( LPAREN ( select_stmt | expr ( COMMA expr )* )? RPAREN | (database_name= id DOT )? table_name= id ) | ( ISNULL | NOTNULL | IS NULL | IS NOT NULL ) | ( NOT )? BETWEEN eq_subexpr AND eq_subexpr )
            int alt19=5;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // SqlParser.g:87:14: eq_subexpr ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr386);
                    eq_subexpr43=eq_subexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, eq_subexpr43.getTree());
                    // SqlParser.g:88:3: ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )*
                    loop9:
                    do {
                        int alt9=2;
                        alt9 = dfa9.predict(input);
                        switch (alt9) {
                    	case 1 :
                    	    // SqlParser.g:88:5: ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr
                    	    {
                    	    set44=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=EQUALS && input.LA(1)<=NOT_EQUALS2) ) {
                    	        input.consume();
                    	        adaptor.addChild(root_0, (Object)adaptor.create(set44));
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr408);
                    	    eq_subexpr45=eq_subexpr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, eq_subexpr45.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // SqlParser.g:89:5: ( NOT )? ( LIKE | GLOB | REGEXP | MATCH ) eq_subexpr ( ESCAPE eq_subexpr )?
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:89:5: ( NOT )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==NOT) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // SqlParser.g:89:6: NOT
                            {
                            NOT46=(Token)match(input,NOT,FOLLOW_NOT_in_and_subexpr417); 
                            NOT46_tree = (Object)adaptor.create(NOT46);
                            adaptor.addChild(root_0, NOT46_tree);


                            }
                            break;

                    }

                    set47=(Token)input.LT(1);
                    if ( input.LA(1)==GLOB||input.LA(1)==LIKE||input.LA(1)==MATCH||input.LA(1)==REGEXP ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set47));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr437);
                    eq_subexpr48=eq_subexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, eq_subexpr48.getTree());
                    // SqlParser.g:89:54: ( ESCAPE eq_subexpr )?
                    int alt11=2;
                    alt11 = dfa11.predict(input);
                    switch (alt11) {
                        case 1 :
                            // SqlParser.g:89:55: ESCAPE eq_subexpr
                            {
                            ESCAPE49=(Token)match(input,ESCAPE,FOLLOW_ESCAPE_in_and_subexpr440); 
                            ESCAPE49_tree = (Object)adaptor.create(ESCAPE49);
                            adaptor.addChild(root_0, ESCAPE49_tree);

                            pushFollow(FOLLOW_eq_subexpr_in_and_subexpr442);
                            eq_subexpr50=eq_subexpr();

                            state._fsp--;

                            adaptor.addChild(root_0, eq_subexpr50.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // SqlParser.g:90:5: ( NOT )? IN ( LPAREN ( select_stmt | expr ( COMMA expr )* )? RPAREN | (database_name= id DOT )? table_name= id )
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:90:5: ( NOT )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==NOT) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // SqlParser.g:90:6: NOT
                            {
                            NOT51=(Token)match(input,NOT,FOLLOW_NOT_in_and_subexpr451); 
                            NOT51_tree = (Object)adaptor.create(NOT51);
                            adaptor.addChild(root_0, NOT51_tree);


                            }
                            break;

                    }

                    IN52=(Token)match(input,IN,FOLLOW_IN_in_and_subexpr455); 
                    IN52_tree = (Object)adaptor.create(IN52);
                    adaptor.addChild(root_0, IN52_tree);

                    // SqlParser.g:90:15: ( LPAREN ( select_stmt | expr ( COMMA expr )* )? RPAREN | (database_name= id DOT )? table_name= id )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==LPAREN) ) {
                        alt16=1;
                    }
                    else if ( ((LA16_0>=ABORT && LA16_0<=WHERE)||LA16_0==ID) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // SqlParser.g:90:16: LPAREN ( select_stmt | expr ( COMMA expr )* )? RPAREN
                            {
                            LPAREN53=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_and_subexpr458); 
                            LPAREN53_tree = (Object)adaptor.create(LPAREN53);
                            adaptor.addChild(root_0, LPAREN53_tree);

                            // SqlParser.g:90:23: ( select_stmt | expr ( COMMA expr )* )?
                            int alt14=3;
                            alt14 = dfa14.predict(input);
                            switch (alt14) {
                                case 1 :
                                    // SqlParser.g:90:24: select_stmt
                                    {
                                    pushFollow(FOLLOW_select_stmt_in_and_subexpr461);
                                    select_stmt54=select_stmt();

                                    state._fsp--;

                                    adaptor.addChild(root_0, select_stmt54.getTree());

                                    }
                                    break;
                                case 2 :
                                    // SqlParser.g:90:38: expr ( COMMA expr )*
                                    {
                                    pushFollow(FOLLOW_expr_in_and_subexpr465);
                                    expr55=expr();

                                    state._fsp--;

                                    adaptor.addChild(root_0, expr55.getTree());
                                    // SqlParser.g:90:43: ( COMMA expr )*
                                    loop13:
                                    do {
                                        int alt13=2;
                                        int LA13_0 = input.LA(1);

                                        if ( (LA13_0==COMMA) ) {
                                            alt13=1;
                                        }


                                        switch (alt13) {
                                    	case 1 :
                                    	    // SqlParser.g:90:44: COMMA expr
                                    	    {
                                    	    COMMA56=(Token)match(input,COMMA,FOLLOW_COMMA_in_and_subexpr468); 
                                    	    COMMA56_tree = (Object)adaptor.create(COMMA56);
                                    	    adaptor.addChild(root_0, COMMA56_tree);

                                    	    pushFollow(FOLLOW_expr_in_and_subexpr470);
                                    	    expr57=expr();

                                    	    state._fsp--;

                                    	    adaptor.addChild(root_0, expr57.getTree());

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop13;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            RPAREN58=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_and_subexpr476); 
                            RPAREN58_tree = (Object)adaptor.create(RPAREN58);
                            adaptor.addChild(root_0, RPAREN58_tree);


                            }
                            break;
                        case 2 :
                            // SqlParser.g:90:68: (database_name= id DOT )? table_name= id
                            {
                            // SqlParser.g:90:68: (database_name= id DOT )?
                            int alt15=2;
                            alt15 = dfa15.predict(input);
                            switch (alt15) {
                                case 1 :
                                    // SqlParser.g:90:69: database_name= id DOT
                                    {
                                    pushFollow(FOLLOW_id_in_and_subexpr483);
                                    database_name=id();

                                    state._fsp--;

                                    adaptor.addChild(root_0, database_name.getTree());
                                    DOT59=(Token)match(input,DOT,FOLLOW_DOT_in_and_subexpr485); 
                                    DOT59_tree = (Object)adaptor.create(DOT59);
                                    adaptor.addChild(root_0, DOT59_tree);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_id_in_and_subexpr491);
                            table_name=id();

                            state._fsp--;

                            adaptor.addChild(root_0, table_name.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // SqlParser.g:91:5: ( ISNULL | NOTNULL | IS NULL | IS NOT NULL )
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:91:5: ( ISNULL | NOTNULL | IS NULL | IS NOT NULL )
                    int alt17=4;
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
                            alt17=4;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }

                    switch (alt17) {
                        case 1 :
                            // SqlParser.g:91:6: ISNULL
                            {
                            ISNULL60=(Token)match(input,ISNULL,FOLLOW_ISNULL_in_and_subexpr499); 
                            ISNULL60_tree = (Object)adaptor.create(ISNULL60);
                            adaptor.addChild(root_0, ISNULL60_tree);


                            }
                            break;
                        case 2 :
                            // SqlParser.g:91:15: NOTNULL
                            {
                            NOTNULL61=(Token)match(input,NOTNULL,FOLLOW_NOTNULL_in_and_subexpr503); 
                            NOTNULL61_tree = (Object)adaptor.create(NOTNULL61);
                            adaptor.addChild(root_0, NOTNULL61_tree);


                            }
                            break;
                        case 3 :
                            // SqlParser.g:91:25: IS NULL
                            {
                            IS62=(Token)match(input,IS,FOLLOW_IS_in_and_subexpr507); 
                            IS62_tree = (Object)adaptor.create(IS62);
                            adaptor.addChild(root_0, IS62_tree);

                            NULL63=(Token)match(input,NULL,FOLLOW_NULL_in_and_subexpr509); 
                            NULL63_tree = (Object)adaptor.create(NULL63);
                            adaptor.addChild(root_0, NULL63_tree);


                            }
                            break;
                        case 4 :
                            // SqlParser.g:91:88: IS NOT NULL
                            {
                            IS64=(Token)match(input,IS,FOLLOW_IS_in_and_subexpr514); 
                            IS64_tree = (Object)adaptor.create(IS64);
                            adaptor.addChild(root_0, IS64_tree);

                            NOT65=(Token)match(input,NOT,FOLLOW_NOT_in_and_subexpr516); 
                            NOT65_tree = (Object)adaptor.create(NOT65);
                            adaptor.addChild(root_0, NOT65_tree);

                            NULL66=(Token)match(input,NULL,FOLLOW_NULL_in_and_subexpr518); 
                            NULL66_tree = (Object)adaptor.create(NULL66);
                            adaptor.addChild(root_0, NULL66_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // SqlParser.g:92:5: ( NOT )? BETWEEN eq_subexpr AND eq_subexpr
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:92:5: ( NOT )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NOT) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // SqlParser.g:92:6: NOT
                            {
                            NOT67=(Token)match(input,NOT,FOLLOW_NOT_in_and_subexpr526); 
                            NOT67_tree = (Object)adaptor.create(NOT67);
                            adaptor.addChild(root_0, NOT67_tree);


                            }
                            break;

                    }

                    BETWEEN68=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_and_subexpr530); 
                    BETWEEN68_tree = (Object)adaptor.create(BETWEEN68);
                    adaptor.addChild(root_0, BETWEEN68_tree);

                    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr532);
                    eq_subexpr69=eq_subexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, eq_subexpr69.getTree());
                    AND70=(Token)match(input,AND,FOLLOW_AND_in_and_subexpr534); 
                    AND70_tree = (Object)adaptor.create(AND70);
                    adaptor.addChild(root_0, AND70_tree);

                    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr536);
                    eq_subexpr71=eq_subexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, eq_subexpr71.getTree());

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
    // $ANTLR end "and_subexpr"

    public static class eq_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eq_subexpr"
    // SqlParser.g:94:1: eq_subexpr : neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )* ;
    public final SqlParser.eq_subexpr_return eq_subexpr() throws RecognitionException {
        SqlParser.eq_subexpr_return retval = new SqlParser.eq_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set73=null;
        SqlParser.neq_subexpr_return neq_subexpr72 = null;

        SqlParser.neq_subexpr_return neq_subexpr74 = null;


        Object set73_tree=null;

        try {
            // SqlParser.g:94:11: ( neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )* )
            // SqlParser.g:94:13: neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_neq_subexpr_in_eq_subexpr543);
            neq_subexpr72=neq_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, neq_subexpr72.getTree());
            // SqlParser.g:94:25: ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )*
            loop20:
            do {
                int alt20=2;
                alt20 = dfa20.predict(input);
                switch (alt20) {
            	case 1 :
            	    // SqlParser.g:94:26: ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr
            	    {
            	    set73=(Token)input.LT(1);
            	    set73=(Token)input.LT(1);
            	    if ( (input.LA(1)>=LESS && input.LA(1)<=GREATER_OR_EQ) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set73), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_neq_subexpr_in_eq_subexpr563);
            	    neq_subexpr74=neq_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, neq_subexpr74.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // SqlParser.g:96:1: neq_subexpr : bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )* ;
    public final SqlParser.neq_subexpr_return neq_subexpr() throws RecognitionException {
        SqlParser.neq_subexpr_return retval = new SqlParser.neq_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set76=null;
        SqlParser.bit_subexpr_return bit_subexpr75 = null;

        SqlParser.bit_subexpr_return bit_subexpr77 = null;


        Object set76_tree=null;

        try {
            // SqlParser.g:96:12: ( bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )* )
            // SqlParser.g:96:14: bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bit_subexpr_in_neq_subexpr572);
            bit_subexpr75=bit_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, bit_subexpr75.getTree());
            // SqlParser.g:96:26: ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )*
            loop21:
            do {
                int alt21=2;
                alt21 = dfa21.predict(input);
                switch (alt21) {
            	case 1 :
            	    // SqlParser.g:96:27: ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr
            	    {
            	    set76=(Token)input.LT(1);
            	    set76=(Token)input.LT(1);
            	    if ( (input.LA(1)>=SHIFT_LEFT && input.LA(1)<=PIPE) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set76), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_bit_subexpr_in_neq_subexpr592);
            	    bit_subexpr77=bit_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bit_subexpr77.getTree());

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
    // $ANTLR end "neq_subexpr"

    public static class bit_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bit_subexpr"
    // SqlParser.g:98:1: bit_subexpr : add_subexpr ( ( PLUS | MINUS ) add_subexpr )* ;
    public final SqlParser.bit_subexpr_return bit_subexpr() throws RecognitionException {
        SqlParser.bit_subexpr_return retval = new SqlParser.bit_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set79=null;
        SqlParser.add_subexpr_return add_subexpr78 = null;

        SqlParser.add_subexpr_return add_subexpr80 = null;


        Object set79_tree=null;

        try {
            // SqlParser.g:98:12: ( add_subexpr ( ( PLUS | MINUS ) add_subexpr )* )
            // SqlParser.g:98:14: add_subexpr ( ( PLUS | MINUS ) add_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_subexpr_in_bit_subexpr601);
            add_subexpr78=add_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, add_subexpr78.getTree());
            // SqlParser.g:98:26: ( ( PLUS | MINUS ) add_subexpr )*
            loop22:
            do {
                int alt22=2;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // SqlParser.g:98:27: ( PLUS | MINUS ) add_subexpr
            	    {
            	    set79=(Token)input.LT(1);
            	    set79=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set79), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_add_subexpr_in_bit_subexpr613);
            	    add_subexpr80=add_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, add_subexpr80.getTree());

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
    // $ANTLR end "bit_subexpr"

    public static class add_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add_subexpr"
    // SqlParser.g:100:1: add_subexpr : mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )* ;
    public final SqlParser.add_subexpr_return add_subexpr() throws RecognitionException {
        SqlParser.add_subexpr_return retval = new SqlParser.add_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set82=null;
        SqlParser.mul_subexpr_return mul_subexpr81 = null;

        SqlParser.mul_subexpr_return mul_subexpr83 = null;


        Object set82_tree=null;

        try {
            // SqlParser.g:100:12: ( mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )* )
            // SqlParser.g:100:14: mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mul_subexpr_in_add_subexpr622);
            mul_subexpr81=mul_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, mul_subexpr81.getTree());
            // SqlParser.g:100:26: ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )*
            loop23:
            do {
                int alt23=2;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // SqlParser.g:100:27: ( ASTERISK | SLASH | PERCENT ) mul_subexpr
            	    {
            	    set82=(Token)input.LT(1);
            	    set82=(Token)input.LT(1);
            	    if ( (input.LA(1)>=ASTERISK && input.LA(1)<=PERCENT) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set82), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mul_subexpr_in_add_subexpr638);
            	    mul_subexpr83=mul_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mul_subexpr83.getTree());

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
    // $ANTLR end "add_subexpr"

    public static class mul_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mul_subexpr"
    // SqlParser.g:102:1: mul_subexpr : con_subexpr ( DOUBLE_PIPE con_subexpr )* ;
    public final SqlParser.mul_subexpr_return mul_subexpr() throws RecognitionException {
        SqlParser.mul_subexpr_return retval = new SqlParser.mul_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOUBLE_PIPE85=null;
        SqlParser.con_subexpr_return con_subexpr84 = null;

        SqlParser.con_subexpr_return con_subexpr86 = null;


        Object DOUBLE_PIPE85_tree=null;

        try {
            // SqlParser.g:102:12: ( con_subexpr ( DOUBLE_PIPE con_subexpr )* )
            // SqlParser.g:102:14: con_subexpr ( DOUBLE_PIPE con_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_con_subexpr_in_mul_subexpr647);
            con_subexpr84=con_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, con_subexpr84.getTree());
            // SqlParser.g:102:26: ( DOUBLE_PIPE con_subexpr )*
            loop24:
            do {
                int alt24=2;
                alt24 = dfa24.predict(input);
                switch (alt24) {
            	case 1 :
            	    // SqlParser.g:102:27: DOUBLE_PIPE con_subexpr
            	    {
            	    DOUBLE_PIPE85=(Token)match(input,DOUBLE_PIPE,FOLLOW_DOUBLE_PIPE_in_mul_subexpr650); 
            	    DOUBLE_PIPE85_tree = (Object)adaptor.create(DOUBLE_PIPE85);
            	    root_0 = (Object)adaptor.becomeRoot(DOUBLE_PIPE85_tree, root_0);

            	    pushFollow(FOLLOW_con_subexpr_in_mul_subexpr653);
            	    con_subexpr86=con_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, con_subexpr86.getTree());

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
    // $ANTLR end "mul_subexpr"

    public static class con_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "con_subexpr"
    // SqlParser.g:104:1: con_subexpr : ( PLUS | MINUS | TILDA | NOT )? unary_subexpr ;
    public final SqlParser.con_subexpr_return con_subexpr() throws RecognitionException {
        SqlParser.con_subexpr_return retval = new SqlParser.con_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set87=null;
        SqlParser.unary_subexpr_return unary_subexpr88 = null;


        Object set87_tree=null;

        try {
            // SqlParser.g:104:12: ( ( PLUS | MINUS | TILDA | NOT )? unary_subexpr )
            // SqlParser.g:104:14: ( PLUS | MINUS | TILDA | NOT )? unary_subexpr
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:104:14: ( PLUS | MINUS | TILDA | NOT )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // SqlParser.g:
                    {
                    set87=(Token)input.LT(1);
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=TILDA)||input.LA(1)==NOT ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set87));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_unary_subexpr_in_con_subexpr679);
            unary_subexpr88=unary_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, unary_subexpr88.getTree());

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
    // SqlParser.g:106:1: unary_subexpr : atom_expr ( COLLATE collation_name= ID )? ;
    public final SqlParser.unary_subexpr_return unary_subexpr() throws RecognitionException {
        SqlParser.unary_subexpr_return retval = new SqlParser.unary_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token collation_name=null;
        Token COLLATE90=null;
        SqlParser.atom_expr_return atom_expr89 = null;


        Object collation_name_tree=null;
        Object COLLATE90_tree=null;

        try {
            // SqlParser.g:106:14: ( atom_expr ( COLLATE collation_name= ID )? )
            // SqlParser.g:106:16: atom_expr ( COLLATE collation_name= ID )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atom_expr_in_unary_subexpr686);
            atom_expr89=atom_expr();

            state._fsp--;

            adaptor.addChild(root_0, atom_expr89.getTree());
            // SqlParser.g:106:26: ( COLLATE collation_name= ID )?
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // SqlParser.g:106:27: COLLATE collation_name= ID
                    {
                    COLLATE90=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_unary_subexpr689); 
                    COLLATE90_tree = (Object)adaptor.create(COLLATE90);
                    root_0 = (Object)adaptor.becomeRoot(COLLATE90_tree, root_0);

                    collation_name=(Token)match(input,ID,FOLLOW_ID_in_unary_subexpr694); 
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
    // SqlParser.g:108:1: atom_expr : ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID | function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN | LPAREN expr RPAREN -> expr | CAST LPAREN expr AS type_name RPAREN | ( EXISTS )? LPAREN select_stmt RPAREN | CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END | raise_function );
    public final SqlParser.atom_expr_return atom_expr() throws RecognitionException {
        SqlParser.atom_expr_return retval = new SqlParser.atom_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token column_name=null;
        Token function_name=null;
        Token DOT93=null;
        Token DOT94=null;
        Token LPAREN95=null;
        Token DISTINCT96=null;
        Token COMMA97=null;
        Token ASTERISK98=null;
        Token RPAREN99=null;
        Token LPAREN100=null;
        Token RPAREN102=null;
        Token CAST103=null;
        Token LPAREN104=null;
        Token AS106=null;
        Token RPAREN108=null;
        Token EXISTS109=null;
        Token LPAREN110=null;
        Token RPAREN112=null;
        Token CASE113=null;
        Token WHEN115=null;
        Token THEN117=null;
        Token ELSE119=null;
        Token END121=null;
        List list_args=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.literal_value_return literal_value91 = null;

        SqlParser.bind_parameter_return bind_parameter92 = null;

        SqlParser.expr_return expr101 = null;

        SqlParser.expr_return expr105 = null;

        SqlParser.type_name_return type_name107 = null;

        SqlParser.select_stmt_return select_stmt111 = null;

        SqlParser.expr_return expr114 = null;

        SqlParser.expr_return expr116 = null;

        SqlParser.expr_return expr118 = null;

        SqlParser.expr_return expr120 = null;

        SqlParser.raise_function_return raise_function122 = null;

        SqlParser.expr_return args = null;
         args = null;
        Object column_name_tree=null;
        Object function_name_tree=null;
        Object DOT93_tree=null;
        Object DOT94_tree=null;
        Object LPAREN95_tree=null;
        Object DISTINCT96_tree=null;
        Object COMMA97_tree=null;
        Object ASTERISK98_tree=null;
        Object RPAREN99_tree=null;
        Object LPAREN100_tree=null;
        Object RPAREN102_tree=null;
        Object CAST103_tree=null;
        Object LPAREN104_tree=null;
        Object AS106_tree=null;
        Object RPAREN108_tree=null;
        Object EXISTS109_tree=null;
        Object LPAREN110_tree=null;
        Object RPAREN112_tree=null;
        Object CASE113_tree=null;
        Object WHEN115_tree=null;
        Object THEN117_tree=null;
        Object ELSE119_tree=null;
        Object END121_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // SqlParser.g:109:3: ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID | function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN | LPAREN expr RPAREN -> expr | CAST LPAREN expr AS type_name RPAREN | ( EXISTS )? LPAREN select_stmt RPAREN | CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END | raise_function )
            int alt36=9;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // SqlParser.g:109:5: literal_value
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_value_in_atom_expr706);
                    literal_value91=literal_value();

                    state._fsp--;

                    adaptor.addChild(root_0, literal_value91.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:110:5: bind_parameter
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_bind_parameter_in_atom_expr712);
                    bind_parameter92=bind_parameter();

                    state._fsp--;

                    adaptor.addChild(root_0, bind_parameter92.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:111:5: ( (database_name= id DOT )? table_name= id DOT )? column_name= ID
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:111:5: ( (database_name= id DOT )? table_name= id DOT )?
                    int alt28=2;
                    alt28 = dfa28.predict(input);
                    switch (alt28) {
                        case 1 :
                            // SqlParser.g:111:6: (database_name= id DOT )? table_name= id DOT
                            {
                            // SqlParser.g:111:6: (database_name= id DOT )?
                            int alt27=2;
                            alt27 = dfa27.predict(input);
                            switch (alt27) {
                                case 1 :
                                    // SqlParser.g:111:7: database_name= id DOT
                                    {
                                    pushFollow(FOLLOW_id_in_atom_expr722);
                                    database_name=id();

                                    state._fsp--;

                                    adaptor.addChild(root_0, database_name.getTree());
                                    DOT93=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expr724); 
                                    DOT93_tree = (Object)adaptor.create(DOT93);
                                    adaptor.addChild(root_0, DOT93_tree);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_id_in_atom_expr730);
                            table_name=id();

                            state._fsp--;

                            adaptor.addChild(root_0, table_name.getTree());
                            DOT94=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expr732); 
                            DOT94_tree = (Object)adaptor.create(DOT94);
                            adaptor.addChild(root_0, DOT94_tree);


                            }
                            break;

                    }

                    column_name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr738); 
                    column_name_tree = (Object)adaptor.create(column_name);
                    adaptor.addChild(root_0, column_name_tree);


                    }
                    break;
                case 4 :
                    // SqlParser.g:112:5: function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    function_name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr746); 
                    function_name_tree = (Object)adaptor.create(function_name);
                    adaptor.addChild(root_0, function_name_tree);

                    LPAREN95=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr748); 
                    LPAREN95_tree = (Object)adaptor.create(LPAREN95);
                    adaptor.addChild(root_0, LPAREN95_tree);

                    // SqlParser.g:112:29: ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )?
                    int alt31=3;
                    alt31 = dfa31.predict(input);
                    switch (alt31) {
                        case 1 :
                            // SqlParser.g:112:30: ( DISTINCT )? args+= expr ( COMMA args+= expr )*
                            {
                            // SqlParser.g:112:30: ( DISTINCT )?
                            int alt29=2;
                            alt29 = dfa29.predict(input);
                            switch (alt29) {
                                case 1 :
                                    // SqlParser.g:112:31: DISTINCT
                                    {
                                    DISTINCT96=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_atom_expr752); 
                                    DISTINCT96_tree = (Object)adaptor.create(DISTINCT96);
                                    adaptor.addChild(root_0, DISTINCT96_tree);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_expr_in_atom_expr758);
                            args=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, args.getTree());
                            if (list_args==null) list_args=new ArrayList();
                            list_args.add(args.getTree());

                            // SqlParser.g:112:53: ( COMMA args+= expr )*
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( (LA30_0==COMMA) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // SqlParser.g:112:54: COMMA args+= expr
                            	    {
                            	    COMMA97=(Token)match(input,COMMA,FOLLOW_COMMA_in_atom_expr761); 
                            	    COMMA97_tree = (Object)adaptor.create(COMMA97);
                            	    adaptor.addChild(root_0, COMMA97_tree);

                            	    pushFollow(FOLLOW_expr_in_atom_expr765);
                            	    args=expr();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, args.getTree());
                            	    if (list_args==null) list_args=new ArrayList();
                            	    list_args.add(args.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop30;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // SqlParser.g:112:75: ASTERISK
                            {
                            ASTERISK98=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_atom_expr771); 
                            ASTERISK98_tree = (Object)adaptor.create(ASTERISK98);
                            adaptor.addChild(root_0, ASTERISK98_tree);


                            }
                            break;

                    }

                    RPAREN99=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr775); 
                    RPAREN99_tree = (Object)adaptor.create(RPAREN99);
                    adaptor.addChild(root_0, RPAREN99_tree);


                    }
                    break;
                case 5 :
                    // SqlParser.g:113:5: LPAREN expr RPAREN
                    {
                    LPAREN100=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr781);  
                    stream_LPAREN.add(LPAREN100);

                    pushFollow(FOLLOW_expr_in_atom_expr783);
                    expr101=expr();

                    state._fsp--;

                    stream_expr.add(expr101.getTree());
                    RPAREN102=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr785);  
                    stream_RPAREN.add(RPAREN102);



                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 113:24: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // SqlParser.g:114:5: CAST LPAREN expr AS type_name RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    CAST103=(Token)match(input,CAST,FOLLOW_CAST_in_atom_expr795); 
                    CAST103_tree = (Object)adaptor.create(CAST103);
                    adaptor.addChild(root_0, CAST103_tree);

                    LPAREN104=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr797); 
                    LPAREN104_tree = (Object)adaptor.create(LPAREN104);
                    adaptor.addChild(root_0, LPAREN104_tree);

                    pushFollow(FOLLOW_expr_in_atom_expr799);
                    expr105=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr105.getTree());
                    AS106=(Token)match(input,AS,FOLLOW_AS_in_atom_expr801); 
                    AS106_tree = (Object)adaptor.create(AS106);
                    adaptor.addChild(root_0, AS106_tree);

                    pushFollow(FOLLOW_type_name_in_atom_expr803);
                    type_name107=type_name();

                    state._fsp--;

                    adaptor.addChild(root_0, type_name107.getTree());
                    RPAREN108=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr805); 
                    RPAREN108_tree = (Object)adaptor.create(RPAREN108);
                    adaptor.addChild(root_0, RPAREN108_tree);


                    }
                    break;
                case 7 :
                    // SqlParser.g:115:5: ( EXISTS )? LPAREN select_stmt RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:115:5: ( EXISTS )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==EXISTS) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // SqlParser.g:115:53: EXISTS
                            {
                            EXISTS109=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_atom_expr814); 
                            EXISTS109_tree = (Object)adaptor.create(EXISTS109);
                            adaptor.addChild(root_0, EXISTS109_tree);


                            }
                            break;

                    }

                    LPAREN110=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr818); 
                    LPAREN110_tree = (Object)adaptor.create(LPAREN110);
                    adaptor.addChild(root_0, LPAREN110_tree);

                    pushFollow(FOLLOW_select_stmt_in_atom_expr820);
                    select_stmt111=select_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, select_stmt111.getTree());
                    RPAREN112=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr822); 
                    RPAREN112_tree = (Object)adaptor.create(RPAREN112);
                    adaptor.addChild(root_0, RPAREN112_tree);


                    }
                    break;
                case 8 :
                    // SqlParser.g:116:5: CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END
                    {
                    root_0 = (Object)adaptor.nil();

                    CASE113=(Token)match(input,CASE,FOLLOW_CASE_in_atom_expr828); 
                    CASE113_tree = (Object)adaptor.create(CASE113);
                    adaptor.addChild(root_0, CASE113_tree);

                    // SqlParser.g:116:10: ( expr )?
                    int alt33=2;
                    alt33 = dfa33.predict(input);
                    switch (alt33) {
                        case 1 :
                            // SqlParser.g:116:11: expr
                            {
                            pushFollow(FOLLOW_expr_in_atom_expr831);
                            expr114=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr114.getTree());

                            }
                            break;

                    }

                    // SqlParser.g:116:18: ( WHEN expr THEN expr )+
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
                    	    // SqlParser.g:116:19: WHEN expr THEN expr
                    	    {
                    	    WHEN115=(Token)match(input,WHEN,FOLLOW_WHEN_in_atom_expr836); 
                    	    WHEN115_tree = (Object)adaptor.create(WHEN115);
                    	    adaptor.addChild(root_0, WHEN115_tree);

                    	    pushFollow(FOLLOW_expr_in_atom_expr838);
                    	    expr116=expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expr116.getTree());
                    	    THEN117=(Token)match(input,THEN,FOLLOW_THEN_in_atom_expr840); 
                    	    THEN117_tree = (Object)adaptor.create(THEN117);
                    	    adaptor.addChild(root_0, THEN117_tree);

                    	    pushFollow(FOLLOW_expr_in_atom_expr842);
                    	    expr118=expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expr118.getTree());

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

                    // SqlParser.g:116:41: ( ELSE expr )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==ELSE) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // SqlParser.g:116:42: ELSE expr
                            {
                            ELSE119=(Token)match(input,ELSE,FOLLOW_ELSE_in_atom_expr847); 
                            ELSE119_tree = (Object)adaptor.create(ELSE119);
                            adaptor.addChild(root_0, ELSE119_tree);

                            pushFollow(FOLLOW_expr_in_atom_expr849);
                            expr120=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr120.getTree());

                            }
                            break;

                    }

                    END121=(Token)match(input,END,FOLLOW_END_in_atom_expr853); 
                    END121_tree = (Object)adaptor.create(END121);
                    adaptor.addChild(root_0, END121_tree);


                    }
                    break;
                case 9 :
                    // SqlParser.g:117:5: raise_function
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_raise_function_in_atom_expr859);
                    raise_function122=raise_function();

                    state._fsp--;

                    adaptor.addChild(root_0, raise_function122.getTree());

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
    // SqlParser.g:119:1: literal_value : ( INTEGER | FLOAT | STRING | BLOB | NULL | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP );
    public final SqlParser.literal_value_return literal_value() throws RecognitionException {
        SqlParser.literal_value_return retval = new SqlParser.literal_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set123=null;

        Object set123_tree=null;

        try {
            // SqlParser.g:119:14: ( INTEGER | FLOAT | STRING | BLOB | NULL | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP )
            // SqlParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set123=(Token)input.LT(1);
            if ( (input.LA(1)>=CURRENT_TIME && input.LA(1)<=CURRENT_TIMESTAMP)||input.LA(1)==NULL||(input.LA(1)>=STRING && input.LA(1)<=INTEGER)||input.LA(1)==FLOAT||input.LA(1)==BLOB ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set123));
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
    // $ANTLR end "literal_value"

    public static class signed_number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "signed_number"
    // SqlParser.g:121:1: signed_number : ( INTEGER | FLOAT | SIGNED_NUMBER );
    public final SqlParser.signed_number_return signed_number() throws RecognitionException {
        SqlParser.signed_number_return retval = new SqlParser.signed_number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set124=null;

        Object set124_tree=null;

        try {
            // SqlParser.g:121:14: ( INTEGER | FLOAT | SIGNED_NUMBER )
            // SqlParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set124=(Token)input.LT(1);
            if ( input.LA(1)==INTEGER||(input.LA(1)>=FLOAT && input.LA(1)<=SIGNED_NUMBER) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set124));
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

    public static class bind_parameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bind_parameter"
    // SqlParser.g:123:1: bind_parameter : ( QUESTION | QUESTION number= INTEGER | COLON id | AT id | DOLLAR name= TCL_ID );
    public final SqlParser.bind_parameter_return bind_parameter() throws RecognitionException {
        SqlParser.bind_parameter_return retval = new SqlParser.bind_parameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token number=null;
        Token name=null;
        Token QUESTION125=null;
        Token QUESTION126=null;
        Token COLON127=null;
        Token AT129=null;
        Token DOLLAR131=null;
        SqlParser.id_return id128 = null;

        SqlParser.id_return id130 = null;


        Object number_tree=null;
        Object name_tree=null;
        Object QUESTION125_tree=null;
        Object QUESTION126_tree=null;
        Object COLON127_tree=null;
        Object AT129_tree=null;
        Object DOLLAR131_tree=null;

        try {
            // SqlParser.g:124:3: ( QUESTION | QUESTION number= INTEGER | COLON id | AT id | DOLLAR name= TCL_ID )
            int alt37=5;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // SqlParser.g:124:5: QUESTION
                    {
                    root_0 = (Object)adaptor.nil();

                    QUESTION125=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_bind_parameter919); 
                    QUESTION125_tree = (Object)adaptor.create(QUESTION125);
                    adaptor.addChild(root_0, QUESTION125_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:125:5: QUESTION number= INTEGER
                    {
                    root_0 = (Object)adaptor.nil();

                    QUESTION126=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_bind_parameter925); 
                    QUESTION126_tree = (Object)adaptor.create(QUESTION126);
                    adaptor.addChild(root_0, QUESTION126_tree);

                    number=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_bind_parameter929); 
                    number_tree = (Object)adaptor.create(number);
                    adaptor.addChild(root_0, number_tree);


                    }
                    break;
                case 3 :
                    // SqlParser.g:126:5: COLON id
                    {
                    root_0 = (Object)adaptor.nil();

                    COLON127=(Token)match(input,COLON,FOLLOW_COLON_in_bind_parameter935); 
                    COLON127_tree = (Object)adaptor.create(COLON127);
                    adaptor.addChild(root_0, COLON127_tree);

                    pushFollow(FOLLOW_id_in_bind_parameter937);
                    id128=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id128.getTree());

                    }
                    break;
                case 4 :
                    // SqlParser.g:127:5: AT id
                    {
                    root_0 = (Object)adaptor.nil();

                    AT129=(Token)match(input,AT,FOLLOW_AT_in_bind_parameter943); 
                    AT129_tree = (Object)adaptor.create(AT129);
                    adaptor.addChild(root_0, AT129_tree);

                    pushFollow(FOLLOW_id_in_bind_parameter945);
                    id130=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id130.getTree());

                    }
                    break;
                case 5 :
                    // SqlParser.g:128:5: DOLLAR name= TCL_ID
                    {
                    root_0 = (Object)adaptor.nil();

                    DOLLAR131=(Token)match(input,DOLLAR,FOLLOW_DOLLAR_in_bind_parameter951); 
                    DOLLAR131_tree = (Object)adaptor.create(DOLLAR131);
                    adaptor.addChild(root_0, DOLLAR131_tree);

                    name=(Token)match(input,TCL_ID,FOLLOW_TCL_ID_in_bind_parameter955); 
                    name_tree = (Object)adaptor.create(name);
                    adaptor.addChild(root_0, name_tree);


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

    public static class type_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type_name"
    // SqlParser.g:130:1: type_name : (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )? -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ ) ;
    public final SqlParser.type_name_return type_name() throws RecognitionException {
        SqlParser.type_name_return retval = new SqlParser.type_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN132=null;
        Token COMMA133=null;
        Token RPAREN134=null;
        Token names=null;
        List list_names=null;
        SqlParser.signed_number_return size1 = null;

        SqlParser.signed_number_return size2 = null;


        Object LPAREN132_tree=null;
        Object COMMA133_tree=null;
        Object RPAREN134_tree=null;
        Object names_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_signed_number=new RewriteRuleSubtreeStream(adaptor,"rule signed_number");
        try {
            // SqlParser.g:130:10: ( (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )? -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ ) )
            // SqlParser.g:130:12: (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )?
            {
            // SqlParser.g:130:17: (names+= ID )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                alt38 = dfa38.predict(input);
                switch (alt38) {
            	case 1 :
            	    // SqlParser.g:130:17: names+= ID
            	    {
            	    names=(Token)match(input,ID,FOLLOW_ID_in_type_name964);  
            	    stream_ID.add(names);

            	    if (list_names==null) list_names=new ArrayList();
            	    list_names.add(names);


            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            // SqlParser.g:130:23: ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )?
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // SqlParser.g:130:24: LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN
                    {
                    LPAREN132=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_type_name968);  
                    stream_LPAREN.add(LPAREN132);

                    pushFollow(FOLLOW_signed_number_in_type_name972);
                    size1=signed_number();

                    state._fsp--;

                    stream_signed_number.add(size1.getTree());
                    // SqlParser.g:130:51: ( COMMA size2= signed_number )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==COMMA) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // SqlParser.g:130:52: COMMA size2= signed_number
                            {
                            COMMA133=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_name975);  
                            stream_COMMA.add(COMMA133);

                            pushFollow(FOLLOW_signed_number_in_type_name979);
                            size2=signed_number();

                            state._fsp--;

                            stream_signed_number.add(size2.getTree());

                            }
                            break;

                    }

                    RPAREN134=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_type_name983);  
                    stream_RPAREN.add(RPAREN134);


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
            // 130:89: -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ )
            {
                // SqlParser.g:130:92: ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_1);

                // SqlParser.g:130:99: ^( TYPE_PARAMS ( $size1)? ( $size2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE_PARAMS, "TYPE_PARAMS"), root_2);

                // SqlParser.g:130:113: ( $size1)?
                if ( stream_size1.hasNext() ) {
                    adaptor.addChild(root_2, stream_size1.nextTree());

                }
                stream_size1.reset();
                // SqlParser.g:130:121: ( $size2)?
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

    public static class raise_function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "raise_function"
    // SqlParser.g:132:1: raise_function : RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN ;
    public final SqlParser.raise_function_return raise_function() throws RecognitionException {
        SqlParser.raise_function_return retval = new SqlParser.raise_function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token error_message=null;
        Token RAISE135=null;
        Token LPAREN136=null;
        Token IGNORE137=null;
        Token set138=null;
        Token COMMA139=null;
        Token RPAREN140=null;

        Object error_message_tree=null;
        Object RAISE135_tree=null;
        Object LPAREN136_tree=null;
        Object IGNORE137_tree=null;
        Object set138_tree=null;
        Object COMMA139_tree=null;
        Object RPAREN140_tree=null;

        try {
            // SqlParser.g:132:15: ( RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN )
            // SqlParser.g:132:17: RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN
            {
            root_0 = (Object)adaptor.nil();

            RAISE135=(Token)match(input,RAISE,FOLLOW_RAISE_in_raise_function1014); 
            RAISE135_tree = (Object)adaptor.create(RAISE135);
            adaptor.addChild(root_0, RAISE135_tree);

            LPAREN136=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_raise_function1016); 
            LPAREN136_tree = (Object)adaptor.create(LPAREN136);
            adaptor.addChild(root_0, LPAREN136_tree);

            // SqlParser.g:132:30: ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==IGNORE) ) {
                alt41=1;
            }
            else if ( (LA41_0==ABORT||LA41_0==FAIL||LA41_0==ROLLBACK) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // SqlParser.g:132:31: IGNORE
                    {
                    IGNORE137=(Token)match(input,IGNORE,FOLLOW_IGNORE_in_raise_function1019); 
                    IGNORE137_tree = (Object)adaptor.create(IGNORE137);
                    adaptor.addChild(root_0, IGNORE137_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:132:40: ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING
                    {
                    set138=(Token)input.LT(1);
                    if ( input.LA(1)==ABORT||input.LA(1)==FAIL||input.LA(1)==ROLLBACK ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set138));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    COMMA139=(Token)match(input,COMMA,FOLLOW_COMMA_in_raise_function1035); 
                    COMMA139_tree = (Object)adaptor.create(COMMA139);
                    adaptor.addChild(root_0, COMMA139_tree);

                    error_message=(Token)match(input,STRING,FOLLOW_STRING_in_raise_function1039); 
                    error_message_tree = (Object)adaptor.create(error_message);
                    adaptor.addChild(root_0, error_message_tree);


                    }
                    break;

            }

            RPAREN140=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_raise_function1042); 
            RPAREN140_tree = (Object)adaptor.create(RPAREN140);
            adaptor.addChild(root_0, RPAREN140_tree);


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

    public static class pragma_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pragma_stmt"
    // SqlParser.g:135:1: pragma_stmt : PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )? ;
    public final SqlParser.pragma_stmt_return pragma_stmt() throws RecognitionException {
        SqlParser.pragma_stmt_return retval = new SqlParser.pragma_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRAGMA141=null;
        Token DOT142=null;
        Token EQUALS143=null;
        Token LPAREN145=null;
        Token RPAREN147=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return pragma_name = null;

        SqlParser.pragma_value_return pragma_value144 = null;

        SqlParser.pragma_value_return pragma_value146 = null;


        Object PRAGMA141_tree=null;
        Object DOT142_tree=null;
        Object EQUALS143_tree=null;
        Object LPAREN145_tree=null;
        Object RPAREN147_tree=null;

        try {
            // SqlParser.g:135:12: ( PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )? )
            // SqlParser.g:135:14: PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            PRAGMA141=(Token)match(input,PRAGMA,FOLLOW_PRAGMA_in_pragma_stmt1050); 
            PRAGMA141_tree = (Object)adaptor.create(PRAGMA141);
            adaptor.addChild(root_0, PRAGMA141_tree);

            // SqlParser.g:135:21: (database_name= id DOT )?
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // SqlParser.g:135:22: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_pragma_stmt1055);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT142=(Token)match(input,DOT,FOLLOW_DOT_in_pragma_stmt1057); 
                    DOT142_tree = (Object)adaptor.create(DOT142);
                    adaptor.addChild(root_0, DOT142_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_pragma_stmt1063);
            pragma_name=id();

            state._fsp--;

            adaptor.addChild(root_0, pragma_name.getTree());
            // SqlParser.g:135:60: ( EQUALS pragma_value | LPAREN pragma_value RPAREN )?
            int alt43=3;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==EQUALS) ) {
                alt43=1;
            }
            else if ( (LA43_0==LPAREN) ) {
                alt43=2;
            }
            switch (alt43) {
                case 1 :
                    // SqlParser.g:135:61: EQUALS pragma_value
                    {
                    EQUALS143=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_pragma_stmt1066); 
                    EQUALS143_tree = (Object)adaptor.create(EQUALS143);
                    adaptor.addChild(root_0, EQUALS143_tree);

                    pushFollow(FOLLOW_pragma_value_in_pragma_stmt1068);
                    pragma_value144=pragma_value();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_value144.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:135:83: LPAREN pragma_value RPAREN
                    {
                    LPAREN145=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_pragma_stmt1072); 
                    LPAREN145_tree = (Object)adaptor.create(LPAREN145);
                    adaptor.addChild(root_0, LPAREN145_tree);

                    pushFollow(FOLLOW_pragma_value_in_pragma_stmt1074);
                    pragma_value146=pragma_value();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_value146.getTree());
                    RPAREN147=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_pragma_stmt1076); 
                    RPAREN147_tree = (Object)adaptor.create(RPAREN147);
                    adaptor.addChild(root_0, RPAREN147_tree);


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
    // SqlParser.g:137:1: pragma_value : ( signed_number | name= id | STRING );
    public final SqlParser.pragma_value_return pragma_value() throws RecognitionException {
        SqlParser.pragma_value_return retval = new SqlParser.pragma_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING149=null;
        SqlParser.id_return name = null;

        SqlParser.signed_number_return signed_number148 = null;


        Object STRING149_tree=null;

        try {
            // SqlParser.g:137:13: ( signed_number | name= id | STRING )
            int alt44=3;
            switch ( input.LA(1) ) {
            case INTEGER:
            case FLOAT:
            case SIGNED_NUMBER:
                {
                alt44=1;
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
            case PRIMARY:
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
                alt44=2;
                }
                break;
            case STRING:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // SqlParser.g:137:15: signed_number
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_signed_number_in_pragma_value1085);
                    signed_number148=signed_number();

                    state._fsp--;

                    adaptor.addChild(root_0, signed_number148.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:137:31: name= id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_in_pragma_value1091);
                    name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, name.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:137:41: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING149=(Token)match(input,STRING,FOLLOW_STRING_in_pragma_value1095); 
                    STRING149_tree = (Object)adaptor.create(STRING149);
                    adaptor.addChild(root_0, STRING149_tree);


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
    // SqlParser.g:140:1: attach_stmt : ATTACH ( DATABASE )? filename= ( STRING | id ) AS database_name= id ;
    public final SqlParser.attach_stmt_return attach_stmt() throws RecognitionException {
        SqlParser.attach_stmt_return retval = new SqlParser.attach_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token filename=null;
        Token ATTACH150=null;
        Token DATABASE151=null;
        Token STRING152=null;
        Token AS154=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return id153 = null;


        Object filename_tree=null;
        Object ATTACH150_tree=null;
        Object DATABASE151_tree=null;
        Object STRING152_tree=null;
        Object AS154_tree=null;

        try {
            // SqlParser.g:140:12: ( ATTACH ( DATABASE )? filename= ( STRING | id ) AS database_name= id )
            // SqlParser.g:140:14: ATTACH ( DATABASE )? filename= ( STRING | id ) AS database_name= id
            {
            root_0 = (Object)adaptor.nil();

            ATTACH150=(Token)match(input,ATTACH,FOLLOW_ATTACH_in_attach_stmt1103); 
            ATTACH150_tree = (Object)adaptor.create(ATTACH150);
            adaptor.addChild(root_0, ATTACH150_tree);

            // SqlParser.g:140:21: ( DATABASE )?
            int alt45=2;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // SqlParser.g:140:22: DATABASE
                    {
                    DATABASE151=(Token)match(input,DATABASE,FOLLOW_DATABASE_in_attach_stmt1106); 
                    DATABASE151_tree = (Object)adaptor.create(DATABASE151);
                    adaptor.addChild(root_0, DATABASE151_tree);


                    }
                    break;

            }

            // SqlParser.g:140:42: ( STRING | id )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==STRING) ) {
                alt46=1;
            }
            else if ( ((LA46_0>=ABORT && LA46_0<=WHERE)||LA46_0==ID) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // SqlParser.g:140:43: STRING
                    {
                    STRING152=(Token)match(input,STRING,FOLLOW_STRING_in_attach_stmt1113); 
                    STRING152_tree = (Object)adaptor.create(STRING152);
                    adaptor.addChild(root_0, STRING152_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:140:52: id
                    {
                    pushFollow(FOLLOW_id_in_attach_stmt1117);
                    id153=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id153.getTree());

                    }
                    break;

            }

            AS154=(Token)match(input,AS,FOLLOW_AS_in_attach_stmt1120); 
            AS154_tree = (Object)adaptor.create(AS154);
            adaptor.addChild(root_0, AS154_tree);

            pushFollow(FOLLOW_id_in_attach_stmt1124);
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
    // SqlParser.g:143:1: detach_stmt : DETACH ( DATABASE )? database_name= id ;
    public final SqlParser.detach_stmt_return detach_stmt() throws RecognitionException {
        SqlParser.detach_stmt_return retval = new SqlParser.detach_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DETACH155=null;
        Token DATABASE156=null;
        SqlParser.id_return database_name = null;


        Object DETACH155_tree=null;
        Object DATABASE156_tree=null;

        try {
            // SqlParser.g:143:12: ( DETACH ( DATABASE )? database_name= id )
            // SqlParser.g:143:14: DETACH ( DATABASE )? database_name= id
            {
            root_0 = (Object)adaptor.nil();

            DETACH155=(Token)match(input,DETACH,FOLLOW_DETACH_in_detach_stmt1132); 
            DETACH155_tree = (Object)adaptor.create(DETACH155);
            adaptor.addChild(root_0, DETACH155_tree);

            // SqlParser.g:143:21: ( DATABASE )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==DATABASE) ) {
                int LA47_1 = input.LA(2);

                if ( ((LA47_1>=ABORT && LA47_1<=WHERE)||LA47_1==ID) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // SqlParser.g:143:22: DATABASE
                    {
                    DATABASE156=(Token)match(input,DATABASE,FOLLOW_DATABASE_in_detach_stmt1135); 
                    DATABASE156_tree = (Object)adaptor.create(DATABASE156);
                    adaptor.addChild(root_0, DATABASE156_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_detach_stmt1141);
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
    // SqlParser.g:146:1: analyze_stmt : ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )? ;
    public final SqlParser.analyze_stmt_return analyze_stmt() throws RecognitionException {
        SqlParser.analyze_stmt_return retval = new SqlParser.analyze_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ANALYZE157=null;
        Token DOT158=null;
        SqlParser.id_return database_or_table_name = null;

        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;


        Object ANALYZE157_tree=null;
        Object DOT158_tree=null;

        try {
            // SqlParser.g:146:13: ( ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )? )
            // SqlParser.g:146:15: ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )?
            {
            root_0 = (Object)adaptor.nil();

            ANALYZE157=(Token)match(input,ANALYZE,FOLLOW_ANALYZE_in_analyze_stmt1149); 
            ANALYZE157_tree = (Object)adaptor.create(ANALYZE157);
            adaptor.addChild(root_0, ANALYZE157_tree);

            // SqlParser.g:146:23: (database_or_table_name= id | database_name= id DOT table_name= id )?
            int alt48=3;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==ID) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==SEMI) ) {
                    alt48=1;
                }
                else if ( (LA48_1==DOT) ) {
                    alt48=2;
                }
            }
            else if ( ((LA48_0>=ABORT && LA48_0<=WHERE)) ) {
                int LA48_2 = input.LA(2);

                if ( (LA48_2==SEMI) ) {
                    alt48=1;
                }
                else if ( (LA48_2==DOT) ) {
                    alt48=2;
                }
            }
            switch (alt48) {
                case 1 :
                    // SqlParser.g:146:24: database_or_table_name= id
                    {
                    pushFollow(FOLLOW_id_in_analyze_stmt1154);
                    database_or_table_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_or_table_name.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:146:52: database_name= id DOT table_name= id
                    {
                    pushFollow(FOLLOW_id_in_analyze_stmt1160);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT158=(Token)match(input,DOT,FOLLOW_DOT_in_analyze_stmt1162); 
                    DOT158_tree = (Object)adaptor.create(DOT158);
                    adaptor.addChild(root_0, DOT158_tree);

                    pushFollow(FOLLOW_id_in_analyze_stmt1166);
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
    // SqlParser.g:149:1: reindex_stmt : REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id ;
    public final SqlParser.reindex_stmt_return reindex_stmt() throws RecognitionException {
        SqlParser.reindex_stmt_return retval = new SqlParser.reindex_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REINDEX159=null;
        Token DOT160=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return collation_or_table_or_index_name = null;


        Object REINDEX159_tree=null;
        Object DOT160_tree=null;

        try {
            // SqlParser.g:149:13: ( REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id )
            // SqlParser.g:149:15: REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id
            {
            root_0 = (Object)adaptor.nil();

            REINDEX159=(Token)match(input,REINDEX,FOLLOW_REINDEX_in_reindex_stmt1176); 
            REINDEX159_tree = (Object)adaptor.create(REINDEX159);
            adaptor.addChild(root_0, REINDEX159_tree);

            // SqlParser.g:149:23: (database_name= id DOT )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==ID) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==DOT) ) {
                    alt49=1;
                }
            }
            else if ( ((LA49_0>=ABORT && LA49_0<=WHERE)) ) {
                int LA49_2 = input.LA(2);

                if ( (LA49_2==DOT) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // SqlParser.g:149:24: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_reindex_stmt1181);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT160=(Token)match(input,DOT,FOLLOW_DOT_in_reindex_stmt1183); 
                    DOT160_tree = (Object)adaptor.create(DOT160);
                    adaptor.addChild(root_0, DOT160_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_reindex_stmt1189);
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
    // SqlParser.g:152:1: vacuum_stmt : VACUUM ;
    public final SqlParser.vacuum_stmt_return vacuum_stmt() throws RecognitionException {
        SqlParser.vacuum_stmt_return retval = new SqlParser.vacuum_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VACUUM161=null;

        Object VACUUM161_tree=null;

        try {
            // SqlParser.g:152:12: ( VACUUM )
            // SqlParser.g:152:14: VACUUM
            {
            root_0 = (Object)adaptor.nil();

            VACUUM161=(Token)match(input,VACUUM,FOLLOW_VACUUM_in_vacuum_stmt1197); 
            VACUUM161_tree = (Object)adaptor.create(VACUUM161);
            adaptor.addChild(root_0, VACUUM161_tree);


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
    // SqlParser.g:158:1: operation_conflict_clause : OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) ;
    public final SqlParser.operation_conflict_clause_return operation_conflict_clause() throws RecognitionException {
        SqlParser.operation_conflict_clause_return retval = new SqlParser.operation_conflict_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR162=null;
        Token set163=null;

        Object OR162_tree=null;
        Object set163_tree=null;

        try {
            // SqlParser.g:158:26: ( OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) )
            // SqlParser.g:158:28: OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE )
            {
            root_0 = (Object)adaptor.nil();

            OR162=(Token)match(input,OR,FOLLOW_OR_in_operation_conflict_clause1208); 
            OR162_tree = (Object)adaptor.create(OR162);
            adaptor.addChild(root_0, OR162_tree);

            set163=(Token)input.LT(1);
            if ( input.LA(1)==ABORT||input.LA(1)==FAIL||input.LA(1)==IGNORE||input.LA(1)==REPLACE||input.LA(1)==ROLLBACK ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set163));
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
    // SqlParser.g:160:1: ordering_term : expr ( ASC | DESC )? -> ^( ORDERING expr ( ASC )? ( DESC )? ) ;
    public final SqlParser.ordering_term_return ordering_term() throws RecognitionException {
        SqlParser.ordering_term_return retval = new SqlParser.ordering_term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASC165=null;
        Token DESC166=null;
        SqlParser.expr_return expr164 = null;


        Object ASC165_tree=null;
        Object DESC166_tree=null;
        RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");
        RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // SqlParser.g:160:14: ( expr ( ASC | DESC )? -> ^( ORDERING expr ( ASC )? ( DESC )? ) )
            // SqlParser.g:160:16: expr ( ASC | DESC )?
            {
            pushFollow(FOLLOW_expr_in_ordering_term1235);
            expr164=expr();

            state._fsp--;

            stream_expr.add(expr164.getTree());
            // SqlParser.g:160:82: ( ASC | DESC )?
            int alt50=3;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // SqlParser.g:160:83: ASC
                    {
                    ASC165=(Token)match(input,ASC,FOLLOW_ASC_in_ordering_term1240);  
                    stream_ASC.add(ASC165);


                    }
                    break;
                case 2 :
                    // SqlParser.g:160:89: DESC
                    {
                    DESC166=(Token)match(input,DESC,FOLLOW_DESC_in_ordering_term1244);  
                    stream_DESC.add(DESC166);


                    }
                    break;

            }



            // AST REWRITE
            // elements: expr, DESC, ASC
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 161:1: -> ^( ORDERING expr ( ASC )? ( DESC )? )
            {
                // SqlParser.g:161:4: ^( ORDERING expr ( ASC )? ( DESC )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ORDERING, "ORDERING"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                // SqlParser.g:161:20: ( ASC )?
                if ( stream_ASC.hasNext() ) {
                    adaptor.addChild(root_1, stream_ASC.nextNode());

                }
                stream_ASC.reset();
                // SqlParser.g:161:27: ( DESC )?
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
    // SqlParser.g:163:1: operation_limited_clause : ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? ;
    public final SqlParser.operation_limited_clause_return operation_limited_clause() throws RecognitionException {
        SqlParser.operation_limited_clause_return retval = new SqlParser.operation_limited_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token limit=null;
        Token offset=null;
        Token ORDER167=null;
        Token BY168=null;
        Token COMMA170=null;
        Token LIMIT172=null;
        Token set173=null;
        SqlParser.ordering_term_return ordering_term169 = null;

        SqlParser.ordering_term_return ordering_term171 = null;


        Object limit_tree=null;
        Object offset_tree=null;
        Object ORDER167_tree=null;
        Object BY168_tree=null;
        Object COMMA170_tree=null;
        Object LIMIT172_tree=null;
        Object set173_tree=null;

        try {
            // SqlParser.g:163:25: ( ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )
            // SqlParser.g:164:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )?
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:164:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ORDER) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // SqlParser.g:164:4: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                    ORDER167=(Token)match(input,ORDER,FOLLOW_ORDER_in_operation_limited_clause1274); 
                    ORDER167_tree = (Object)adaptor.create(ORDER167);
                    adaptor.addChild(root_0, ORDER167_tree);

                    BY168=(Token)match(input,BY,FOLLOW_BY_in_operation_limited_clause1276); 
                    BY168_tree = (Object)adaptor.create(BY168);
                    adaptor.addChild(root_0, BY168_tree);

                    pushFollow(FOLLOW_ordering_term_in_operation_limited_clause1278);
                    ordering_term169=ordering_term();

                    state._fsp--;

                    adaptor.addChild(root_0, ordering_term169.getTree());
                    // SqlParser.g:164:27: ( COMMA ordering_term )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==COMMA) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // SqlParser.g:164:28: COMMA ordering_term
                    	    {
                    	    COMMA170=(Token)match(input,COMMA,FOLLOW_COMMA_in_operation_limited_clause1281); 
                    	    COMMA170_tree = (Object)adaptor.create(COMMA170);
                    	    adaptor.addChild(root_0, COMMA170_tree);

                    	    pushFollow(FOLLOW_ordering_term_in_operation_limited_clause1283);
                    	    ordering_term171=ordering_term();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, ordering_term171.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }

            LIMIT172=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_operation_limited_clause1291); 
            LIMIT172_tree = (Object)adaptor.create(LIMIT172);
            adaptor.addChild(root_0, LIMIT172_tree);

            limit=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation_limited_clause1295); 
            limit_tree = (Object)adaptor.create(limit);
            adaptor.addChild(root_0, limit_tree);

            // SqlParser.g:165:23: ( ( OFFSET | COMMA ) offset= INTEGER )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==COMMA||LA53_0==OFFSET) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // SqlParser.g:165:24: ( OFFSET | COMMA ) offset= INTEGER
                    {
                    set173=(Token)input.LT(1);
                    if ( input.LA(1)==COMMA||input.LA(1)==OFFSET ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set173));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    offset=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation_limited_clause1308); 
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
    // SqlParser.g:168:1: select_stmt : select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )? -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? ) ;
    public final SqlParser.select_stmt_return select_stmt() throws RecognitionException {
        SqlParser.select_stmt_return retval = new SqlParser.select_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token limit=null;
        Token offset=null;
        Token ORDER175=null;
        Token BY176=null;
        Token COMMA178=null;
        Token LIMIT180=null;
        Token OFFSET181=null;
        Token COMMA182=null;
        SqlParser.select_list_return select_list174 = null;

        SqlParser.ordering_term_return ordering_term177 = null;

        SqlParser.ordering_term_return ordering_term179 = null;


        Object limit_tree=null;
        Object offset_tree=null;
        Object ORDER175_tree=null;
        Object BY176_tree=null;
        Object COMMA178_tree=null;
        Object LIMIT180_tree=null;
        Object OFFSET181_tree=null;
        Object COMMA182_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_ORDER=new RewriteRuleTokenStream(adaptor,"token ORDER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
        RewriteRuleTokenStream stream_OFFSET=new RewriteRuleTokenStream(adaptor,"token OFFSET");
        RewriteRuleSubtreeStream stream_select_list=new RewriteRuleSubtreeStream(adaptor,"rule select_list");
        RewriteRuleSubtreeStream stream_ordering_term=new RewriteRuleSubtreeStream(adaptor,"rule ordering_term");
        try {
            // SqlParser.g:168:12: ( select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )? -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? ) )
            // SqlParser.g:168:14: select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )?
            {
            pushFollow(FOLLOW_select_list_in_select_stmt1318);
            select_list174=select_list();

            state._fsp--;

            stream_select_list.add(select_list174.getTree());
            // SqlParser.g:169:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==ORDER) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // SqlParser.g:169:4: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                    ORDER175=(Token)match(input,ORDER,FOLLOW_ORDER_in_select_stmt1323);  
                    stream_ORDER.add(ORDER175);

                    BY176=(Token)match(input,BY,FOLLOW_BY_in_select_stmt1325);  
                    stream_BY.add(BY176);

                    pushFollow(FOLLOW_ordering_term_in_select_stmt1327);
                    ordering_term177=ordering_term();

                    state._fsp--;

                    stream_ordering_term.add(ordering_term177.getTree());
                    // SqlParser.g:169:27: ( COMMA ordering_term )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==COMMA) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // SqlParser.g:169:28: COMMA ordering_term
                    	    {
                    	    COMMA178=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_stmt1330);  
                    	    stream_COMMA.add(COMMA178);

                    	    pushFollow(FOLLOW_ordering_term_in_select_stmt1332);
                    	    ordering_term179=ordering_term();

                    	    state._fsp--;

                    	    stream_ordering_term.add(ordering_term179.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);


                    }
                    break;

            }

            // SqlParser.g:170:3: ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==LIMIT) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // SqlParser.g:170:4: LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )?
                    {
                    LIMIT180=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_select_stmt1341);  
                    stream_LIMIT.add(LIMIT180);

                    limit=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt1345);  
                    stream_INTEGER.add(limit);

                    // SqlParser.g:170:24: ( ( OFFSET | COMMA ) offset= INTEGER )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==COMMA||LA57_0==OFFSET) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // SqlParser.g:170:25: ( OFFSET | COMMA ) offset= INTEGER
                            {
                            // SqlParser.g:170:25: ( OFFSET | COMMA )
                            int alt56=2;
                            int LA56_0 = input.LA(1);

                            if ( (LA56_0==OFFSET) ) {
                                alt56=1;
                            }
                            else if ( (LA56_0==COMMA) ) {
                                alt56=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 56, 0, input);

                                throw nvae;
                            }
                            switch (alt56) {
                                case 1 :
                                    // SqlParser.g:170:26: OFFSET
                                    {
                                    OFFSET181=(Token)match(input,OFFSET,FOLLOW_OFFSET_in_select_stmt1349);  
                                    stream_OFFSET.add(OFFSET181);


                                    }
                                    break;
                                case 2 :
                                    // SqlParser.g:170:35: COMMA
                                    {
                                    COMMA182=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_stmt1353);  
                                    stream_COMMA.add(COMMA182);


                                    }
                                    break;

                            }

                            offset=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt1358);  
                            stream_INTEGER.add(offset);


                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: LIMIT, ORDER, offset, ordering_term, limit, select_list
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
            // 171:1: -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? )
            {
                // SqlParser.g:171:4: ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECT, "SELECT"), root_1);

                adaptor.addChild(root_1, stream_select_list.nextTree());
                // SqlParser.g:172:22: ( ^( ORDER ( ordering_term )+ ) )?
                if ( stream_ORDER.hasNext()||stream_ordering_term.hasNext() ) {
                    // SqlParser.g:172:22: ^( ORDER ( ordering_term )+ )
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
                stream_ORDER.reset();
                stream_ordering_term.reset();
                // SqlParser.g:172:47: ( ^( LIMIT $limit ( $offset)? ) )?
                if ( stream_LIMIT.hasNext()||stream_offset.hasNext()||stream_limit.hasNext() ) {
                    // SqlParser.g:172:47: ^( LIMIT $limit ( $offset)? )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_LIMIT.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_limit.nextNode());
                    // SqlParser.g:172:62: ( $offset)?
                    if ( stream_offset.hasNext() ) {
                        adaptor.addChild(root_2, stream_offset.nextNode());

                    }
                    stream_offset.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_LIMIT.reset();
                stream_offset.reset();
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
    // SqlParser.g:175:1: select_list : select_core ( select_op select_core )* ;
    public final SqlParser.select_list_return select_list() throws RecognitionException {
        SqlParser.select_list_return retval = new SqlParser.select_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.select_core_return select_core183 = null;

        SqlParser.select_op_return select_op184 = null;

        SqlParser.select_core_return select_core185 = null;



        try {
            // SqlParser.g:175:12: ( select_core ( select_op select_core )* )
            // SqlParser.g:176:3: select_core ( select_op select_core )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_select_core_in_select_list1403);
            select_core183=select_core();

            state._fsp--;

            adaptor.addChild(root_0, select_core183.getTree());
            // SqlParser.g:176:15: ( select_op select_core )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==EXCEPT||LA59_0==INTERSECT||LA59_0==UNION) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // SqlParser.g:176:16: select_op select_core
            	    {
            	    pushFollow(FOLLOW_select_op_in_select_list1406);
            	    select_op184=select_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(select_op184.getTree(), root_0);
            	    pushFollow(FOLLOW_select_core_in_select_list1409);
            	    select_core185=select_core();

            	    state._fsp--;

            	    adaptor.addChild(root_0, select_core185.getTree());

            	    }
            	    break;

            	default :
            	    break loop59;
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
    // SqlParser.g:178:1: select_op : ( UNION ( ALL )? | INTERSECT | EXCEPT );
    public final SqlParser.select_op_return select_op() throws RecognitionException {
        SqlParser.select_op_return retval = new SqlParser.select_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNION186=null;
        Token ALL187=null;
        Token INTERSECT188=null;
        Token EXCEPT189=null;

        Object UNION186_tree=null;
        Object ALL187_tree=null;
        Object INTERSECT188_tree=null;
        Object EXCEPT189_tree=null;

        try {
            // SqlParser.g:178:10: ( UNION ( ALL )? | INTERSECT | EXCEPT )
            int alt61=3;
            switch ( input.LA(1) ) {
            case UNION:
                {
                alt61=1;
                }
                break;
            case INTERSECT:
                {
                alt61=2;
                }
                break;
            case EXCEPT:
                {
                alt61=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // SqlParser.g:178:12: UNION ( ALL )?
                    {
                    root_0 = (Object)adaptor.nil();

                    UNION186=(Token)match(input,UNION,FOLLOW_UNION_in_select_op1418); 
                    UNION186_tree = (Object)adaptor.create(UNION186);
                    root_0 = (Object)adaptor.becomeRoot(UNION186_tree, root_0);

                    // SqlParser.g:178:19: ( ALL )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==ALL) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // SqlParser.g:178:20: ALL
                            {
                            ALL187=(Token)match(input,ALL,FOLLOW_ALL_in_select_op1422); 
                            ALL187_tree = (Object)adaptor.create(ALL187);
                            adaptor.addChild(root_0, ALL187_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:178:28: INTERSECT
                    {
                    root_0 = (Object)adaptor.nil();

                    INTERSECT188=(Token)match(input,INTERSECT,FOLLOW_INTERSECT_in_select_op1428); 
                    INTERSECT188_tree = (Object)adaptor.create(INTERSECT188);
                    adaptor.addChild(root_0, INTERSECT188_tree);


                    }
                    break;
                case 3 :
                    // SqlParser.g:178:40: EXCEPT
                    {
                    root_0 = (Object)adaptor.nil();

                    EXCEPT189=(Token)match(input,EXCEPT,FOLLOW_EXCEPT_in_select_op1432); 
                    EXCEPT189_tree = (Object)adaptor.create(EXCEPT189);
                    adaptor.addChild(root_0, EXCEPT189_tree);


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
    // SqlParser.g:180:1: select_core : SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )? -> ^( SELECT_CORE ( DISTINCT )? ^( RESULT_COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? ) ;
    public final SqlParser.select_core_return select_core() throws RecognitionException {
        SqlParser.select_core_return retval = new SqlParser.select_core_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SELECT190=null;
        Token ALL191=null;
        Token DISTINCT192=null;
        Token COMMA194=null;
        Token FROM196=null;
        Token WHERE198=null;
        Token GROUP199=null;
        Token BY200=null;
        Token COMMA202=null;
        Token HAVING204=null;
        SqlParser.expr_return where_expr = null;

        SqlParser.expr_return having_expr = null;

        SqlParser.result_column_return result_column193 = null;

        SqlParser.result_column_return result_column195 = null;

        SqlParser.join_source_return join_source197 = null;

        SqlParser.ordering_term_return ordering_term201 = null;

        SqlParser.ordering_term_return ordering_term203 = null;


        Object SELECT190_tree=null;
        Object ALL191_tree=null;
        Object DISTINCT192_tree=null;
        Object COMMA194_tree=null;
        Object FROM196_tree=null;
        Object WHERE198_tree=null;
        Object GROUP199_tree=null;
        Object BY200_tree=null;
        Object COMMA202_tree=null;
        Object HAVING204_tree=null;
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
            // SqlParser.g:180:12: ( SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )? -> ^( SELECT_CORE ( DISTINCT )? ^( RESULT_COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? ) )
            // SqlParser.g:181:3: SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )?
            {
            SELECT190=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_core1441);  
            stream_SELECT.add(SELECT190);

            // SqlParser.g:181:10: ( ALL | DISTINCT )?
            int alt62=3;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // SqlParser.g:181:11: ALL
                    {
                    ALL191=(Token)match(input,ALL,FOLLOW_ALL_in_select_core1444);  
                    stream_ALL.add(ALL191);


                    }
                    break;
                case 2 :
                    // SqlParser.g:181:17: DISTINCT
                    {
                    DISTINCT192=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_select_core1448);  
                    stream_DISTINCT.add(DISTINCT192);


                    }
                    break;

            }

            pushFollow(FOLLOW_result_column_in_select_core1452);
            result_column193=result_column();

            state._fsp--;

            stream_result_column.add(result_column193.getTree());
            // SqlParser.g:181:42: ( COMMA result_column )*
            loop63:
            do {
                int alt63=2;
                alt63 = dfa63.predict(input);
                switch (alt63) {
            	case 1 :
            	    // SqlParser.g:181:43: COMMA result_column
            	    {
            	    COMMA194=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_core1455);  
            	    stream_COMMA.add(COMMA194);

            	    pushFollow(FOLLOW_result_column_in_select_core1457);
            	    result_column195=result_column();

            	    state._fsp--;

            	    stream_result_column.add(result_column195.getTree());

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            // SqlParser.g:181:65: ( FROM join_source )?
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // SqlParser.g:181:66: FROM join_source
                    {
                    FROM196=(Token)match(input,FROM,FOLLOW_FROM_in_select_core1462);  
                    stream_FROM.add(FROM196);

                    pushFollow(FOLLOW_join_source_in_select_core1464);
                    join_source197=join_source();

                    state._fsp--;

                    stream_join_source.add(join_source197.getTree());

                    }
                    break;

            }

            // SqlParser.g:181:85: ( WHERE where_expr= expr )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // SqlParser.g:181:86: WHERE where_expr= expr
                    {
                    WHERE198=(Token)match(input,WHERE,FOLLOW_WHERE_in_select_core1469);  
                    stream_WHERE.add(WHERE198);

                    pushFollow(FOLLOW_expr_in_select_core1473);
                    where_expr=expr();

                    state._fsp--;

                    stream_expr.add(where_expr.getTree());

                    }
                    break;

            }

            // SqlParser.g:182:3: ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==GROUP) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // SqlParser.g:182:5: GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )?
                    {
                    GROUP199=(Token)match(input,GROUP,FOLLOW_GROUP_in_select_core1481);  
                    stream_GROUP.add(GROUP199);

                    BY200=(Token)match(input,BY,FOLLOW_BY_in_select_core1483);  
                    stream_BY.add(BY200);

                    pushFollow(FOLLOW_ordering_term_in_select_core1485);
                    ordering_term201=ordering_term();

                    state._fsp--;

                    stream_ordering_term.add(ordering_term201.getTree());
                    // SqlParser.g:182:28: ( COMMA ordering_term )*
                    loop66:
                    do {
                        int alt66=2;
                        alt66 = dfa66.predict(input);
                        switch (alt66) {
                    	case 1 :
                    	    // SqlParser.g:182:29: COMMA ordering_term
                    	    {
                    	    COMMA202=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_core1488);  
                    	    stream_COMMA.add(COMMA202);

                    	    pushFollow(FOLLOW_ordering_term_in_select_core1490);
                    	    ordering_term203=ordering_term();

                    	    state._fsp--;

                    	    stream_ordering_term.add(ordering_term203.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);

                    // SqlParser.g:182:51: ( HAVING having_expr= expr )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==HAVING) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // SqlParser.g:182:52: HAVING having_expr= expr
                            {
                            HAVING204=(Token)match(input,HAVING,FOLLOW_HAVING_in_select_core1495);  
                            stream_HAVING.add(HAVING204);

                            pushFollow(FOLLOW_expr_in_select_core1499);
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
            // elements: join_source, result_column, FROM, GROUP, HAVING, DISTINCT, ordering_term, where_expr, WHERE, having_expr
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
            // 183:1: -> ^( SELECT_CORE ( DISTINCT )? ^( RESULT_COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? )
            {
                // SqlParser.g:183:4: ^( SELECT_CORE ( DISTINCT )? ^( RESULT_COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECT_CORE, "SELECT_CORE"), root_1);

                // SqlParser.g:184:15: ( DISTINCT )?
                if ( stream_DISTINCT.hasNext() ) {
                    adaptor.addChild(root_1, stream_DISTINCT.nextNode());

                }
                stream_DISTINCT.reset();
                // SqlParser.g:184:27: ^( RESULT_COLUMNS ( result_column )+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RESULT_COLUMNS, "RESULT_COLUMNS"), root_2);

                if ( !(stream_result_column.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_result_column.hasNext() ) {
                    adaptor.addChild(root_2, stream_result_column.nextTree());

                }
                stream_result_column.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:184:60: ( ^( FROM join_source ) )?
                if ( stream_join_source.hasNext()||stream_FROM.hasNext() ) {
                    // SqlParser.g:184:60: ^( FROM join_source )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_FROM.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_join_source.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_join_source.reset();
                stream_FROM.reset();
                // SqlParser.g:184:81: ( ^( WHERE $where_expr) )?
                if ( stream_where_expr.hasNext()||stream_WHERE.hasNext() ) {
                    // SqlParser.g:184:81: ^( WHERE $where_expr)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_WHERE.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_where_expr.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_where_expr.reset();
                stream_WHERE.reset();
                // SqlParser.g:185:3: ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )?
                if ( stream_GROUP.hasNext()||stream_HAVING.hasNext()||stream_ordering_term.hasNext()||stream_having_expr.hasNext() ) {
                    // SqlParser.g:185:3: ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? )
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
                    // SqlParser.g:185:26: ( ^( HAVING $having_expr) )?
                    if ( stream_HAVING.hasNext()||stream_having_expr.hasNext() ) {
                        // SqlParser.g:185:26: ^( HAVING $having_expr)
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
                stream_GROUP.reset();
                stream_HAVING.reset();
                stream_ordering_term.reset();
                stream_having_expr.reset();

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
    // SqlParser.g:188:1: result_column : ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) );
    public final SqlParser.result_column_return result_column() throws RecognitionException {
        SqlParser.result_column_return retval = new SqlParser.result_column_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASTERISK205=null;
        Token DOT206=null;
        Token ASTERISK207=null;
        Token AS209=null;
        SqlParser.id_return table_name = null;

        SqlParser.id_return column_alias = null;

        SqlParser.expr_return expr208 = null;


        Object ASTERISK205_tree=null;
        Object DOT206_tree=null;
        Object ASTERISK207_tree=null;
        Object AS209_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // SqlParser.g:189:3: ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) )
            int alt71=3;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // SqlParser.g:189:5: ASTERISK
                    {
                    root_0 = (Object)adaptor.nil();

                    ASTERISK205=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_result_column1569); 
                    ASTERISK205_tree = (Object)adaptor.create(ASTERISK205);
                    adaptor.addChild(root_0, ASTERISK205_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:190:5: table_name= id DOT ASTERISK
                    {
                    pushFollow(FOLLOW_id_in_result_column1577);
                    table_name=id();

                    state._fsp--;

                    stream_id.add(table_name.getTree());
                    DOT206=(Token)match(input,DOT,FOLLOW_DOT_in_result_column1579);  
                    stream_DOT.add(DOT206);

                    ASTERISK207=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_result_column1581);  
                    stream_ASTERISK.add(ASTERISK207);



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
                    // 190:32: -> ^( ASTERISK $table_name)
                    {
                        // SqlParser.g:190:35: ^( ASTERISK $table_name)
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
                    // SqlParser.g:191:5: expr ( ( AS )? column_alias= id )?
                    {
                    pushFollow(FOLLOW_expr_in_result_column1596);
                    expr208=expr();

                    state._fsp--;

                    stream_expr.add(expr208.getTree());
                    // SqlParser.g:191:10: ( ( AS )? column_alias= id )?
                    int alt70=2;
                    alt70 = dfa70.predict(input);
                    switch (alt70) {
                        case 1 :
                            // SqlParser.g:191:11: ( AS )? column_alias= id
                            {
                            // SqlParser.g:191:11: ( AS )?
                            int alt69=2;
                            alt69 = dfa69.predict(input);
                            switch (alt69) {
                                case 1 :
                                    // SqlParser.g:191:12: AS
                                    {
                                    AS209=(Token)match(input,AS,FOLLOW_AS_in_result_column1600);  
                                    stream_AS.add(AS209);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_id_in_result_column1606);
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
                    // 191:35: -> ^( ALIAS expr ( $column_alias)? )
                    {
                        // SqlParser.g:191:38: ^( ALIAS expr ( $column_alias)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // SqlParser.g:191:51: ( $column_alias)?
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
    // SqlParser.g:193:1: join_source : single_source ( join_op single_source ( join_constraint )? )* ;
    public final SqlParser.join_source_return join_source() throws RecognitionException {
        SqlParser.join_source_return retval = new SqlParser.join_source_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.single_source_return single_source210 = null;

        SqlParser.join_op_return join_op211 = null;

        SqlParser.single_source_return single_source212 = null;

        SqlParser.join_constraint_return join_constraint213 = null;



        try {
            // SqlParser.g:193:12: ( single_source ( join_op single_source ( join_constraint )? )* )
            // SqlParser.g:193:14: single_source ( join_op single_source ( join_constraint )? )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_single_source_in_join_source1627);
            single_source210=single_source();

            state._fsp--;

            adaptor.addChild(root_0, single_source210.getTree());
            // SqlParser.g:193:28: ( join_op single_source ( join_constraint )? )*
            loop73:
            do {
                int alt73=2;
                alt73 = dfa73.predict(input);
                switch (alt73) {
            	case 1 :
            	    // SqlParser.g:193:29: join_op single_source ( join_constraint )?
            	    {
            	    pushFollow(FOLLOW_join_op_in_join_source1630);
            	    join_op211=join_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(join_op211.getTree(), root_0);
            	    pushFollow(FOLLOW_single_source_in_join_source1633);
            	    single_source212=single_source();

            	    state._fsp--;

            	    adaptor.addChild(root_0, single_source212.getTree());
            	    // SqlParser.g:193:52: ( join_constraint )?
            	    int alt72=2;
            	    alt72 = dfa72.predict(input);
            	    switch (alt72) {
            	        case 1 :
            	            // SqlParser.g:193:53: join_constraint
            	            {
            	            pushFollow(FOLLOW_join_constraint_in_join_source1636);
            	            join_constraint213=join_constraint();

            	            state._fsp--;

            	            adaptor.addChild(root_0, join_constraint213.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
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
    // SqlParser.g:195:1: single_source : ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN );
    public final SqlParser.single_source_return single_source() throws RecognitionException {
        SqlParser.single_source_return retval = new SqlParser.single_source_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token table_name=null;
        Token table_alias=null;
        Token DOT214=null;
        Token AS215=null;
        Token INDEXED216=null;
        Token BY217=null;
        Token NOT218=null;
        Token INDEXED219=null;
        Token LPAREN220=null;
        Token RPAREN222=null;
        Token AS223=null;
        Token LPAREN224=null;
        Token RPAREN226=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return index_name = null;

        SqlParser.select_stmt_return select_stmt221 = null;

        SqlParser.join_source_return join_source225 = null;


        Object table_name_tree=null;
        Object table_alias_tree=null;
        Object DOT214_tree=null;
        Object AS215_tree=null;
        Object INDEXED216_tree=null;
        Object BY217_tree=null;
        Object NOT218_tree=null;
        Object INDEXED219_tree=null;
        Object LPAREN220_tree=null;
        Object RPAREN222_tree=null;
        Object AS223_tree=null;
        Object LPAREN224_tree=null;
        Object RPAREN226_tree=null;
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
            // SqlParser.g:196:3: ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN )
            int alt80=3;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // SqlParser.g:196:5: (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )?
                    {
                    // SqlParser.g:196:5: (database_name= id DOT )?
                    int alt74=2;
                    alt74 = dfa74.predict(input);
                    switch (alt74) {
                        case 1 :
                            // SqlParser.g:196:6: database_name= id DOT
                            {
                            pushFollow(FOLLOW_id_in_single_source1653);
                            database_name=id();

                            state._fsp--;

                            stream_id.add(database_name.getTree());
                            DOT214=(Token)match(input,DOT,FOLLOW_DOT_in_single_source1655);  
                            stream_DOT.add(DOT214);


                            }
                            break;

                    }

                    table_name=(Token)match(input,ID,FOLLOW_ID_in_single_source1661);  
                    stream_ID.add(table_name);

                    // SqlParser.g:196:43: ( ( AS )? table_alias= ID )?
                    int alt76=2;
                    alt76 = dfa76.predict(input);
                    switch (alt76) {
                        case 1 :
                            // SqlParser.g:196:44: ( AS )? table_alias= ID
                            {
                            // SqlParser.g:196:44: ( AS )?
                            int alt75=2;
                            int LA75_0 = input.LA(1);

                            if ( (LA75_0==AS) ) {
                                alt75=1;
                            }
                            switch (alt75) {
                                case 1 :
                                    // SqlParser.g:196:45: AS
                                    {
                                    AS215=(Token)match(input,AS,FOLLOW_AS_in_single_source1665);  
                                    stream_AS.add(AS215);


                                    }
                                    break;

                            }

                            table_alias=(Token)match(input,ID,FOLLOW_ID_in_single_source1671);  
                            stream_ID.add(table_alias);


                            }
                            break;

                    }

                    // SqlParser.g:196:67: ( INDEXED BY index_name= id | NOT INDEXED )?
                    int alt77=3;
                    alt77 = dfa77.predict(input);
                    switch (alt77) {
                        case 1 :
                            // SqlParser.g:196:68: INDEXED BY index_name= id
                            {
                            INDEXED216=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_single_source1676);  
                            stream_INDEXED.add(INDEXED216);

                            BY217=(Token)match(input,BY,FOLLOW_BY_in_single_source1678);  
                            stream_BY.add(BY217);

                            pushFollow(FOLLOW_id_in_single_source1682);
                            index_name=id();

                            state._fsp--;

                            stream_id.add(index_name.getTree());

                            }
                            break;
                        case 2 :
                            // SqlParser.g:196:95: NOT INDEXED
                            {
                            NOT218=(Token)match(input,NOT,FOLLOW_NOT_in_single_source1686);  
                            stream_NOT.add(NOT218);

                            INDEXED219=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_single_source1688);  
                            stream_INDEXED.add(INDEXED219);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: index_name, INDEXED, table_alias, NOT, database_name, table_name
                    // token labels: table_name, table_alias
                    // rule labels: database_name, index_name, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_table_name=new RewriteRuleTokenStream(adaptor,"token table_name",table_name);
                    RewriteRuleTokenStream stream_table_alias=new RewriteRuleTokenStream(adaptor,"token table_alias",table_alias);
                    RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
                    RewriteRuleSubtreeStream stream_index_name=new RewriteRuleSubtreeStream(adaptor,"rule index_name",index_name!=null?index_name.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 197:3: -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? )
                    {
                        // SqlParser.g:197:6: ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        // SqlParser.g:197:14: ^( $table_name ( $database_name)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                        // SqlParser.g:197:28: ( $database_name)?
                        if ( stream_database_name.hasNext() ) {
                            adaptor.addChild(root_2, stream_database_name.nextTree());

                        }
                        stream_database_name.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // SqlParser.g:197:45: ( $table_alias)?
                        if ( stream_table_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_table_alias.nextNode());

                        }
                        stream_table_alias.reset();
                        // SqlParser.g:197:59: ( ^( INDEXED ( NOT )? ( $index_name)? ) )?
                        if ( stream_index_name.hasNext()||stream_INDEXED.hasNext()||stream_NOT.hasNext() ) {
                            // SqlParser.g:197:59: ^( INDEXED ( NOT )? ( $index_name)? )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(stream_INDEXED.nextNode(), root_2);

                            // SqlParser.g:197:69: ( NOT )?
                            if ( stream_NOT.hasNext() ) {
                                adaptor.addChild(root_2, stream_NOT.nextNode());

                            }
                            stream_NOT.reset();
                            // SqlParser.g:197:74: ( $index_name)?
                            if ( stream_index_name.hasNext() ) {
                                adaptor.addChild(root_2, stream_index_name.nextTree());

                            }
                            stream_index_name.reset();

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_index_name.reset();
                        stream_INDEXED.reset();
                        stream_NOT.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // SqlParser.g:198:5: LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )?
                    {
                    LPAREN220=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_single_source1729);  
                    stream_LPAREN.add(LPAREN220);

                    pushFollow(FOLLOW_select_stmt_in_single_source1731);
                    select_stmt221=select_stmt();

                    state._fsp--;

                    stream_select_stmt.add(select_stmt221.getTree());
                    RPAREN222=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_single_source1733);  
                    stream_RPAREN.add(RPAREN222);

                    // SqlParser.g:198:31: ( ( AS )? table_alias= ID )?
                    int alt79=2;
                    alt79 = dfa79.predict(input);
                    switch (alt79) {
                        case 1 :
                            // SqlParser.g:198:32: ( AS )? table_alias= ID
                            {
                            // SqlParser.g:198:32: ( AS )?
                            int alt78=2;
                            int LA78_0 = input.LA(1);

                            if ( (LA78_0==AS) ) {
                                alt78=1;
                            }
                            switch (alt78) {
                                case 1 :
                                    // SqlParser.g:198:33: AS
                                    {
                                    AS223=(Token)match(input,AS,FOLLOW_AS_in_single_source1737);  
                                    stream_AS.add(AS223);


                                    }
                                    break;

                            }

                            table_alias=(Token)match(input,ID,FOLLOW_ID_in_single_source1743);  
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
                    // 199:3: -> ^( ALIAS select_stmt ( $table_alias)? )
                    {
                        // SqlParser.g:199:6: ^( ALIAS select_stmt ( $table_alias)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        adaptor.addChild(root_1, stream_select_stmt.nextTree());
                        // SqlParser.g:199:26: ( $table_alias)?
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
                    // SqlParser.g:200:5: LPAREN join_source RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN224=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_single_source1765); 
                    pushFollow(FOLLOW_join_source_in_single_source1768);
                    join_source225=join_source();

                    state._fsp--;

                    adaptor.addChild(root_0, join_source225.getTree());
                    RPAREN226=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_single_source1770); 

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
    // SqlParser.g:202:1: join_op : ( COMMA | ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN );
    public final SqlParser.join_op_return join_op() throws RecognitionException {
        SqlParser.join_op_return retval = new SqlParser.join_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA227=null;
        Token NATURAL228=null;
        Token LEFT229=null;
        Token OUTER230=null;
        Token INNER231=null;
        Token CROSS232=null;
        Token JOIN233=null;

        Object COMMA227_tree=null;
        Object NATURAL228_tree=null;
        Object LEFT229_tree=null;
        Object OUTER230_tree=null;
        Object INNER231_tree=null;
        Object CROSS232_tree=null;
        Object JOIN233_tree=null;

        try {
            // SqlParser.g:203:3: ( COMMA | ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==COMMA) ) {
                alt85=1;
            }
            else if ( (LA85_0==CROSS||LA85_0==INNER||LA85_0==JOIN||LA85_0==LEFT||LA85_0==NATURAL||LA85_0==OUTER) ) {
                alt85=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // SqlParser.g:203:5: COMMA
                    {
                    root_0 = (Object)adaptor.nil();

                    COMMA227=(Token)match(input,COMMA,FOLLOW_COMMA_in_join_op1781); 
                    COMMA227_tree = (Object)adaptor.create(COMMA227);
                    adaptor.addChild(root_0, COMMA227_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:204:5: ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:204:5: ( NATURAL )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==NATURAL) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // SqlParser.g:204:6: NATURAL
                            {
                            NATURAL228=(Token)match(input,NATURAL,FOLLOW_NATURAL_in_join_op1788); 
                            NATURAL228_tree = (Object)adaptor.create(NATURAL228);
                            adaptor.addChild(root_0, NATURAL228_tree);


                            }
                            break;

                    }

                    // SqlParser.g:204:16: ( ( LEFT )? ( OUTER )? | INNER | CROSS )
                    int alt84=3;
                    switch ( input.LA(1) ) {
                    case JOIN:
                    case LEFT:
                    case OUTER:
                        {
                        alt84=1;
                        }
                        break;
                    case INNER:
                        {
                        alt84=2;
                        }
                        break;
                    case CROSS:
                        {
                        alt84=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 0, input);

                        throw nvae;
                    }

                    switch (alt84) {
                        case 1 :
                            // SqlParser.g:204:17: ( LEFT )? ( OUTER )?
                            {
                            // SqlParser.g:204:17: ( LEFT )?
                            int alt82=2;
                            int LA82_0 = input.LA(1);

                            if ( (LA82_0==LEFT) ) {
                                alt82=1;
                            }
                            switch (alt82) {
                                case 1 :
                                    // SqlParser.g:204:18: LEFT
                                    {
                                    LEFT229=(Token)match(input,LEFT,FOLLOW_LEFT_in_join_op1794); 
                                    LEFT229_tree = (Object)adaptor.create(LEFT229);
                                    adaptor.addChild(root_0, LEFT229_tree);


                                    }
                                    break;

                            }

                            // SqlParser.g:204:25: ( OUTER )?
                            int alt83=2;
                            int LA83_0 = input.LA(1);

                            if ( (LA83_0==OUTER) ) {
                                alt83=1;
                            }
                            switch (alt83) {
                                case 1 :
                                    // SqlParser.g:204:26: OUTER
                                    {
                                    OUTER230=(Token)match(input,OUTER,FOLLOW_OUTER_in_join_op1799); 
                                    OUTER230_tree = (Object)adaptor.create(OUTER230);
                                    adaptor.addChild(root_0, OUTER230_tree);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // SqlParser.g:204:36: INNER
                            {
                            INNER231=(Token)match(input,INNER,FOLLOW_INNER_in_join_op1805); 
                            INNER231_tree = (Object)adaptor.create(INNER231);
                            adaptor.addChild(root_0, INNER231_tree);


                            }
                            break;
                        case 3 :
                            // SqlParser.g:204:44: CROSS
                            {
                            CROSS232=(Token)match(input,CROSS,FOLLOW_CROSS_in_join_op1809); 
                            CROSS232_tree = (Object)adaptor.create(CROSS232);
                            adaptor.addChild(root_0, CROSS232_tree);


                            }
                            break;

                    }

                    JOIN233=(Token)match(input,JOIN,FOLLOW_JOIN_in_join_op1812); 
                    JOIN233_tree = (Object)adaptor.create(JOIN233);
                    root_0 = (Object)adaptor.becomeRoot(JOIN233_tree, root_0);


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
    // SqlParser.g:206:1: join_constraint : ( ON expr | USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN -> ^( USING ( $column_names)+ ) );
    public final SqlParser.join_constraint_return join_constraint() throws RecognitionException {
        SqlParser.join_constraint_return retval = new SqlParser.join_constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ON234=null;
        Token USING236=null;
        Token LPAREN237=null;
        Token COMMA238=null;
        Token RPAREN239=null;
        List list_column_names=null;
        SqlParser.expr_return expr235 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object ON234_tree=null;
        Object USING236_tree=null;
        Object LPAREN237_tree=null;
        Object COMMA238_tree=null;
        Object RPAREN239_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // SqlParser.g:207:3: ( ON expr | USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN -> ^( USING ( $column_names)+ ) )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==ON) ) {
                alt87=1;
            }
            else if ( (LA87_0==USING) ) {
                alt87=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // SqlParser.g:207:5: ON expr
                    {
                    root_0 = (Object)adaptor.nil();

                    ON234=(Token)match(input,ON,FOLLOW_ON_in_join_constraint1823); 
                    ON234_tree = (Object)adaptor.create(ON234);
                    root_0 = (Object)adaptor.becomeRoot(ON234_tree, root_0);

                    pushFollow(FOLLOW_expr_in_join_constraint1826);
                    expr235=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr235.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:208:5: USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                    {
                    USING236=(Token)match(input,USING,FOLLOW_USING_in_join_constraint1832);  
                    stream_USING.add(USING236);

                    LPAREN237=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_join_constraint1834);  
                    stream_LPAREN.add(LPAREN237);

                    pushFollow(FOLLOW_id_in_join_constraint1838);
                    column_names=id();

                    state._fsp--;

                    stream_id.add(column_names.getTree());
                    if (list_column_names==null) list_column_names=new ArrayList();
                    list_column_names.add(column_names.getTree());

                    // SqlParser.g:208:35: ( COMMA column_names+= id )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==COMMA) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // SqlParser.g:208:36: COMMA column_names+= id
                    	    {
                    	    COMMA238=(Token)match(input,COMMA,FOLLOW_COMMA_in_join_constraint1841);  
                    	    stream_COMMA.add(COMMA238);

                    	    pushFollow(FOLLOW_id_in_join_constraint1845);
                    	    column_names=id();

                    	    state._fsp--;

                    	    stream_id.add(column_names.getTree());
                    	    if (list_column_names==null) list_column_names=new ArrayList();
                    	    list_column_names.add(column_names.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop86;
                        }
                    } while (true);

                    RPAREN239=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_join_constraint1849);  
                    stream_RPAREN.add(RPAREN239);



                    // AST REWRITE
                    // elements: column_names, USING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: column_names
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_column_names=new RewriteRuleSubtreeStream(adaptor,"token column_names",list_column_names);
                    root_0 = (Object)adaptor.nil();
                    // 208:68: -> ^( USING ( $column_names)+ )
                    {
                        // SqlParser.g:208:71: ^( USING ( $column_names)+ )
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
    // SqlParser.g:211:1: insert_stmt : ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES ) ;
    public final SqlParser.insert_stmt_return insert_stmt() throws RecognitionException {
        SqlParser.insert_stmt_return retval = new SqlParser.insert_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSERT240=null;
        Token REPLACE242=null;
        Token INTO243=null;
        Token DOT244=null;
        Token LPAREN245=null;
        Token COMMA246=null;
        Token RPAREN247=null;
        Token VALUES248=null;
        Token LPAREN249=null;
        Token COMMA250=null;
        Token RPAREN251=null;
        Token DEFAULT253=null;
        Token VALUES254=null;
        List list_column_names=null;
        List list_values=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.operation_conflict_clause_return operation_conflict_clause241 = null;

        SqlParser.select_stmt_return select_stmt252 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        SqlParser.expr_return values = null;
         values = null;
        Object INSERT240_tree=null;
        Object REPLACE242_tree=null;
        Object INTO243_tree=null;
        Object DOT244_tree=null;
        Object LPAREN245_tree=null;
        Object COMMA246_tree=null;
        Object RPAREN247_tree=null;
        Object VALUES248_tree=null;
        Object LPAREN249_tree=null;
        Object COMMA250_tree=null;
        Object RPAREN251_tree=null;
        Object DEFAULT253_tree=null;
        Object VALUES254_tree=null;

        try {
            // SqlParser.g:211:12: ( ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES ) )
            // SqlParser.g:211:14: ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES )
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:211:14: ( INSERT ( operation_conflict_clause )? | REPLACE )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==INSERT) ) {
                alt89=1;
            }
            else if ( (LA89_0==REPLACE) ) {
                alt89=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // SqlParser.g:211:15: INSERT ( operation_conflict_clause )?
                    {
                    INSERT240=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_stmt1868); 
                    INSERT240_tree = (Object)adaptor.create(INSERT240);
                    adaptor.addChild(root_0, INSERT240_tree);

                    // SqlParser.g:211:22: ( operation_conflict_clause )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==OR) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // SqlParser.g:211:23: operation_conflict_clause
                            {
                            pushFollow(FOLLOW_operation_conflict_clause_in_insert_stmt1871);
                            operation_conflict_clause241=operation_conflict_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, operation_conflict_clause241.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:211:53: REPLACE
                    {
                    REPLACE242=(Token)match(input,REPLACE,FOLLOW_REPLACE_in_insert_stmt1877); 
                    REPLACE242_tree = (Object)adaptor.create(REPLACE242);
                    adaptor.addChild(root_0, REPLACE242_tree);


                    }
                    break;

            }

            INTO243=(Token)match(input,INTO,FOLLOW_INTO_in_insert_stmt1880); 
            INTO243_tree = (Object)adaptor.create(INTO243);
            adaptor.addChild(root_0, INTO243_tree);

            // SqlParser.g:211:67: (database_name= id DOT )?
            int alt90=2;
            alt90 = dfa90.predict(input);
            switch (alt90) {
                case 1 :
                    // SqlParser.g:211:68: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_insert_stmt1885);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT244=(Token)match(input,DOT,FOLLOW_DOT_in_insert_stmt1887); 
                    DOT244_tree = (Object)adaptor.create(DOT244);
                    adaptor.addChild(root_0, DOT244_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_insert_stmt1893);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:212:3: ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==LPAREN||LA95_0==SELECT||LA95_0==VALUES) ) {
                alt95=1;
            }
            else if ( (LA95_0==DEFAULT) ) {
                alt95=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // SqlParser.g:212:5: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt )
                    {
                    // SqlParser.g:212:5: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==LPAREN) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // SqlParser.g:212:6: LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                            {
                            LPAREN245=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt1900); 
                            LPAREN245_tree = (Object)adaptor.create(LPAREN245);
                            adaptor.addChild(root_0, LPAREN245_tree);

                            pushFollow(FOLLOW_id_in_insert_stmt1904);
                            column_names=id();

                            state._fsp--;

                            adaptor.addChild(root_0, column_names.getTree());
                            if (list_column_names==null) list_column_names=new ArrayList();
                            list_column_names.add(column_names.getTree());

                            // SqlParser.g:212:30: ( COMMA column_names+= id )*
                            loop91:
                            do {
                                int alt91=2;
                                int LA91_0 = input.LA(1);

                                if ( (LA91_0==COMMA) ) {
                                    alt91=1;
                                }


                                switch (alt91) {
                            	case 1 :
                            	    // SqlParser.g:212:31: COMMA column_names+= id
                            	    {
                            	    COMMA246=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt1907); 
                            	    COMMA246_tree = (Object)adaptor.create(COMMA246);
                            	    adaptor.addChild(root_0, COMMA246_tree);

                            	    pushFollow(FOLLOW_id_in_insert_stmt1911);
                            	    column_names=id();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, column_names.getTree());
                            	    if (list_column_names==null) list_column_names=new ArrayList();
                            	    list_column_names.add(column_names.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop91;
                                }
                            } while (true);

                            RPAREN247=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt1915); 
                            RPAREN247_tree = (Object)adaptor.create(RPAREN247);
                            adaptor.addChild(root_0, RPAREN247_tree);


                            }
                            break;

                    }

                    // SqlParser.g:213:5: ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt )
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==VALUES) ) {
                        alt94=1;
                    }
                    else if ( (LA94_0==SELECT) ) {
                        alt94=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 94, 0, input);

                        throw nvae;
                    }
                    switch (alt94) {
                        case 1 :
                            // SqlParser.g:213:6: VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN
                            {
                            VALUES248=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt1924); 
                            VALUES248_tree = (Object)adaptor.create(VALUES248);
                            adaptor.addChild(root_0, VALUES248_tree);

                            LPAREN249=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt1926); 
                            LPAREN249_tree = (Object)adaptor.create(LPAREN249);
                            adaptor.addChild(root_0, LPAREN249_tree);

                            pushFollow(FOLLOW_expr_in_insert_stmt1930);
                            values=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, values.getTree());
                            if (list_values==null) list_values=new ArrayList();
                            list_values.add(values.getTree());

                            // SqlParser.g:213:33: ( COMMA values+= expr )*
                            loop93:
                            do {
                                int alt93=2;
                                int LA93_0 = input.LA(1);

                                if ( (LA93_0==COMMA) ) {
                                    alt93=1;
                                }


                                switch (alt93) {
                            	case 1 :
                            	    // SqlParser.g:213:34: COMMA values+= expr
                            	    {
                            	    COMMA250=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt1933); 
                            	    COMMA250_tree = (Object)adaptor.create(COMMA250);
                            	    adaptor.addChild(root_0, COMMA250_tree);

                            	    pushFollow(FOLLOW_expr_in_insert_stmt1937);
                            	    values=expr();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, values.getTree());
                            	    if (list_values==null) list_values=new ArrayList();
                            	    list_values.add(values.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop93;
                                }
                            } while (true);

                            RPAREN251=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt1941); 
                            RPAREN251_tree = (Object)adaptor.create(RPAREN251);
                            adaptor.addChild(root_0, RPAREN251_tree);


                            }
                            break;
                        case 2 :
                            // SqlParser.g:213:64: select_stmt
                            {
                            pushFollow(FOLLOW_select_stmt_in_insert_stmt1945);
                            select_stmt252=select_stmt();

                            state._fsp--;

                            adaptor.addChild(root_0, select_stmt252.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:214:5: DEFAULT VALUES
                    {
                    DEFAULT253=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_insert_stmt1952); 
                    DEFAULT253_tree = (Object)adaptor.create(DEFAULT253);
                    adaptor.addChild(root_0, DEFAULT253_tree);

                    VALUES254=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt1954); 
                    VALUES254_tree = (Object)adaptor.create(VALUES254);
                    adaptor.addChild(root_0, VALUES254_tree);


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
    // SqlParser.g:217:1: update_stmt : UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )? ;
    public final SqlParser.update_stmt_return update_stmt() throws RecognitionException {
        SqlParser.update_stmt_return retval = new SqlParser.update_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UPDATE255=null;
        Token SET258=null;
        Token COMMA259=null;
        Token WHERE260=null;
        List list_values=null;
        SqlParser.operation_conflict_clause_return operation_conflict_clause256 = null;

        SqlParser.qualified_table_name_return qualified_table_name257 = null;

        SqlParser.expr_return expr261 = null;

        SqlParser.operation_limited_clause_return operation_limited_clause262 = null;

        SqlParser.update_set_return values = null;
         values = null;
        Object UPDATE255_tree=null;
        Object SET258_tree=null;
        Object COMMA259_tree=null;
        Object WHERE260_tree=null;

        try {
            // SqlParser.g:217:12: ( UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )? )
            // SqlParser.g:217:14: UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )?
            {
            root_0 = (Object)adaptor.nil();

            UPDATE255=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_update_stmt1964); 
            UPDATE255_tree = (Object)adaptor.create(UPDATE255);
            adaptor.addChild(root_0, UPDATE255_tree);

            // SqlParser.g:217:21: ( operation_conflict_clause )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==OR) ) {
                int LA96_1 = input.LA(2);

                if ( (LA96_1==ABORT||LA96_1==FAIL||LA96_1==IGNORE||LA96_1==REPLACE||LA96_1==ROLLBACK) ) {
                    alt96=1;
                }
            }
            switch (alt96) {
                case 1 :
                    // SqlParser.g:217:22: operation_conflict_clause
                    {
                    pushFollow(FOLLOW_operation_conflict_clause_in_update_stmt1967);
                    operation_conflict_clause256=operation_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_conflict_clause256.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_qualified_table_name_in_update_stmt1971);
            qualified_table_name257=qualified_table_name();

            state._fsp--;

            adaptor.addChild(root_0, qualified_table_name257.getTree());
            SET258=(Token)match(input,SET,FOLLOW_SET_in_update_stmt1975); 
            SET258_tree = (Object)adaptor.create(SET258);
            adaptor.addChild(root_0, SET258_tree);

            pushFollow(FOLLOW_update_set_in_update_stmt1979);
            values=update_set();

            state._fsp--;

            adaptor.addChild(root_0, values.getTree());
            if (list_values==null) list_values=new ArrayList();
            list_values.add(values.getTree());

            // SqlParser.g:218:26: ( COMMA values+= update_set )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==COMMA) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // SqlParser.g:218:27: COMMA values+= update_set
            	    {
            	    COMMA259=(Token)match(input,COMMA,FOLLOW_COMMA_in_update_stmt1982); 
            	    COMMA259_tree = (Object)adaptor.create(COMMA259);
            	    adaptor.addChild(root_0, COMMA259_tree);

            	    pushFollow(FOLLOW_update_set_in_update_stmt1986);
            	    values=update_set();

            	    state._fsp--;

            	    adaptor.addChild(root_0, values.getTree());
            	    if (list_values==null) list_values=new ArrayList();
            	    list_values.add(values.getTree());


            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);

            // SqlParser.g:218:54: ( WHERE expr )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==WHERE) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // SqlParser.g:218:55: WHERE expr
                    {
                    WHERE260=(Token)match(input,WHERE,FOLLOW_WHERE_in_update_stmt1991); 
                    WHERE260_tree = (Object)adaptor.create(WHERE260);
                    adaptor.addChild(root_0, WHERE260_tree);

                    pushFollow(FOLLOW_expr_in_update_stmt1993);
                    expr261=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr261.getTree());

                    }
                    break;

            }

            // SqlParser.g:218:68: ( operation_limited_clause )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==LIMIT||LA99_0==ORDER) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // SqlParser.g:218:69: operation_limited_clause
                    {
                    pushFollow(FOLLOW_operation_limited_clause_in_update_stmt1998);
                    operation_limited_clause262=operation_limited_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_limited_clause262.getTree());

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
    // SqlParser.g:220:1: update_set : column_name= id EQUALS expr ;
    public final SqlParser.update_set_return update_set() throws RecognitionException {
        SqlParser.update_set_return retval = new SqlParser.update_set_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EQUALS263=null;
        SqlParser.id_return column_name = null;

        SqlParser.expr_return expr264 = null;


        Object EQUALS263_tree=null;

        try {
            // SqlParser.g:220:11: (column_name= id EQUALS expr )
            // SqlParser.g:220:13: column_name= id EQUALS expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_update_set2009);
            column_name=id();

            state._fsp--;

            adaptor.addChild(root_0, column_name.getTree());
            EQUALS263=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_update_set2011); 
            EQUALS263_tree = (Object)adaptor.create(EQUALS263);
            adaptor.addChild(root_0, EQUALS263_tree);

            pushFollow(FOLLOW_expr_in_update_set2013);
            expr264=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr264.getTree());

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
    // SqlParser.g:223:1: delete_stmt : DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )? ;
    public final SqlParser.delete_stmt_return delete_stmt() throws RecognitionException {
        SqlParser.delete_stmt_return retval = new SqlParser.delete_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DELETE265=null;
        Token FROM266=null;
        Token WHERE268=null;
        SqlParser.qualified_table_name_return qualified_table_name267 = null;

        SqlParser.expr_return expr269 = null;

        SqlParser.operation_limited_clause_return operation_limited_clause270 = null;


        Object DELETE265_tree=null;
        Object FROM266_tree=null;
        Object WHERE268_tree=null;

        try {
            // SqlParser.g:223:12: ( DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )? )
            // SqlParser.g:223:14: DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )?
            {
            root_0 = (Object)adaptor.nil();

            DELETE265=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_stmt2021); 
            DELETE265_tree = (Object)adaptor.create(DELETE265);
            adaptor.addChild(root_0, DELETE265_tree);

            FROM266=(Token)match(input,FROM,FOLLOW_FROM_in_delete_stmt2023); 
            FROM266_tree = (Object)adaptor.create(FROM266);
            adaptor.addChild(root_0, FROM266_tree);

            pushFollow(FOLLOW_qualified_table_name_in_delete_stmt2025);
            qualified_table_name267=qualified_table_name();

            state._fsp--;

            adaptor.addChild(root_0, qualified_table_name267.getTree());
            // SqlParser.g:223:47: ( WHERE expr )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==WHERE) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // SqlParser.g:223:48: WHERE expr
                    {
                    WHERE268=(Token)match(input,WHERE,FOLLOW_WHERE_in_delete_stmt2028); 
                    WHERE268_tree = (Object)adaptor.create(WHERE268);
                    adaptor.addChild(root_0, WHERE268_tree);

                    pushFollow(FOLLOW_expr_in_delete_stmt2030);
                    expr269=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr269.getTree());

                    }
                    break;

            }

            // SqlParser.g:223:61: ( operation_limited_clause )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==LIMIT||LA101_0==ORDER) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // SqlParser.g:223:62: operation_limited_clause
                    {
                    pushFollow(FOLLOW_operation_limited_clause_in_delete_stmt2035);
                    operation_limited_clause270=operation_limited_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_limited_clause270.getTree());

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
    // SqlParser.g:226:1: begin_stmt : BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )? ;
    public final SqlParser.begin_stmt_return begin_stmt() throws RecognitionException {
        SqlParser.begin_stmt_return retval = new SqlParser.begin_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BEGIN271=null;
        Token set272=null;
        Token TRANSACTION273=null;

        Object BEGIN271_tree=null;
        Object set272_tree=null;
        Object TRANSACTION273_tree=null;

        try {
            // SqlParser.g:226:11: ( BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )? )
            // SqlParser.g:226:13: BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )?
            {
            root_0 = (Object)adaptor.nil();

            BEGIN271=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_begin_stmt2045); 
            BEGIN271_tree = (Object)adaptor.create(BEGIN271);
            adaptor.addChild(root_0, BEGIN271_tree);

            // SqlParser.g:226:19: ( DEFERRED | IMMEDIATE | EXCLUSIVE )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==DEFERRED||LA102_0==EXCLUSIVE||LA102_0==IMMEDIATE) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // SqlParser.g:
                    {
                    set272=(Token)input.LT(1);
                    if ( input.LA(1)==DEFERRED||input.LA(1)==EXCLUSIVE||input.LA(1)==IMMEDIATE ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set272));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            // SqlParser.g:226:55: ( TRANSACTION )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==TRANSACTION) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // SqlParser.g:226:56: TRANSACTION
                    {
                    TRANSACTION273=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_begin_stmt2061); 
                    TRANSACTION273_tree = (Object)adaptor.create(TRANSACTION273);
                    adaptor.addChild(root_0, TRANSACTION273_tree);


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
    // SqlParser.g:229:1: commit_stmt : ( COMMIT | END ) ( TRANSACTION )? ;
    public final SqlParser.commit_stmt_return commit_stmt() throws RecognitionException {
        SqlParser.commit_stmt_return retval = new SqlParser.commit_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set274=null;
        Token TRANSACTION275=null;

        Object set274_tree=null;
        Object TRANSACTION275_tree=null;

        try {
            // SqlParser.g:229:12: ( ( COMMIT | END ) ( TRANSACTION )? )
            // SqlParser.g:229:14: ( COMMIT | END ) ( TRANSACTION )?
            {
            root_0 = (Object)adaptor.nil();

            set274=(Token)input.LT(1);
            if ( input.LA(1)==COMMIT||input.LA(1)==END ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set274));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // SqlParser.g:229:29: ( TRANSACTION )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==TRANSACTION) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // SqlParser.g:229:30: TRANSACTION
                    {
                    TRANSACTION275=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_commit_stmt2080); 
                    TRANSACTION275_tree = (Object)adaptor.create(TRANSACTION275);
                    adaptor.addChild(root_0, TRANSACTION275_tree);


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
    // SqlParser.g:232:1: rollback_stmt : ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )? ;
    public final SqlParser.rollback_stmt_return rollback_stmt() throws RecognitionException {
        SqlParser.rollback_stmt_return retval = new SqlParser.rollback_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ROLLBACK276=null;
        Token TRANSACTION277=null;
        Token TO278=null;
        Token SAVEPOINT279=null;
        SqlParser.id_return savepoint_name = null;


        Object ROLLBACK276_tree=null;
        Object TRANSACTION277_tree=null;
        Object TO278_tree=null;
        Object SAVEPOINT279_tree=null;

        try {
            // SqlParser.g:232:14: ( ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )? )
            // SqlParser.g:232:16: ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )?
            {
            root_0 = (Object)adaptor.nil();

            ROLLBACK276=(Token)match(input,ROLLBACK,FOLLOW_ROLLBACK_in_rollback_stmt2090); 
            ROLLBACK276_tree = (Object)adaptor.create(ROLLBACK276);
            adaptor.addChild(root_0, ROLLBACK276_tree);

            // SqlParser.g:232:25: ( TRANSACTION )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==TRANSACTION) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // SqlParser.g:232:26: TRANSACTION
                    {
                    TRANSACTION277=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_rollback_stmt2093); 
                    TRANSACTION277_tree = (Object)adaptor.create(TRANSACTION277);
                    adaptor.addChild(root_0, TRANSACTION277_tree);


                    }
                    break;

            }

            // SqlParser.g:232:40: ( TO ( SAVEPOINT )? savepoint_name= id )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==TO) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // SqlParser.g:232:41: TO ( SAVEPOINT )? savepoint_name= id
                    {
                    TO278=(Token)match(input,TO,FOLLOW_TO_in_rollback_stmt2098); 
                    TO278_tree = (Object)adaptor.create(TO278);
                    adaptor.addChild(root_0, TO278_tree);

                    // SqlParser.g:232:44: ( SAVEPOINT )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==SAVEPOINT) ) {
                        int LA106_1 = input.LA(2);

                        if ( ((LA106_1>=ABORT && LA106_1<=WHERE)||LA106_1==ID) ) {
                            alt106=1;
                        }
                    }
                    switch (alt106) {
                        case 1 :
                            // SqlParser.g:232:45: SAVEPOINT
                            {
                            SAVEPOINT279=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_rollback_stmt2101); 
                            SAVEPOINT279_tree = (Object)adaptor.create(SAVEPOINT279);
                            adaptor.addChild(root_0, SAVEPOINT279_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_id_in_rollback_stmt2107);
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
    // SqlParser.g:235:1: savepoint_stmt : SAVEPOINT savepoint_name= id ;
    public final SqlParser.savepoint_stmt_return savepoint_stmt() throws RecognitionException {
        SqlParser.savepoint_stmt_return retval = new SqlParser.savepoint_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SAVEPOINT280=null;
        SqlParser.id_return savepoint_name = null;


        Object SAVEPOINT280_tree=null;

        try {
            // SqlParser.g:235:15: ( SAVEPOINT savepoint_name= id )
            // SqlParser.g:235:17: SAVEPOINT savepoint_name= id
            {
            root_0 = (Object)adaptor.nil();

            SAVEPOINT280=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_savepoint_stmt2117); 
            SAVEPOINT280_tree = (Object)adaptor.create(SAVEPOINT280);
            adaptor.addChild(root_0, SAVEPOINT280_tree);

            pushFollow(FOLLOW_id_in_savepoint_stmt2121);
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
    // SqlParser.g:238:1: release_stmt : RELEASE ( SAVEPOINT )? savepoint_name= id ;
    public final SqlParser.release_stmt_return release_stmt() throws RecognitionException {
        SqlParser.release_stmt_return retval = new SqlParser.release_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RELEASE281=null;
        Token SAVEPOINT282=null;
        SqlParser.id_return savepoint_name = null;


        Object RELEASE281_tree=null;
        Object SAVEPOINT282_tree=null;

        try {
            // SqlParser.g:238:13: ( RELEASE ( SAVEPOINT )? savepoint_name= id )
            // SqlParser.g:238:15: RELEASE ( SAVEPOINT )? savepoint_name= id
            {
            root_0 = (Object)adaptor.nil();

            RELEASE281=(Token)match(input,RELEASE,FOLLOW_RELEASE_in_release_stmt2129); 
            RELEASE281_tree = (Object)adaptor.create(RELEASE281);
            adaptor.addChild(root_0, RELEASE281_tree);

            // SqlParser.g:238:23: ( SAVEPOINT )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==SAVEPOINT) ) {
                int LA108_1 = input.LA(2);

                if ( ((LA108_1>=ABORT && LA108_1<=WHERE)||LA108_1==ID) ) {
                    alt108=1;
                }
            }
            switch (alt108) {
                case 1 :
                    // SqlParser.g:238:24: SAVEPOINT
                    {
                    SAVEPOINT282=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_release_stmt2132); 
                    SAVEPOINT282_tree = (Object)adaptor.create(SAVEPOINT282);
                    adaptor.addChild(root_0, SAVEPOINT282_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_release_stmt2138);
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
    // SqlParser.g:245:1: table_conflict_clause : ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) ;
    public final SqlParser.table_conflict_clause_return table_conflict_clause() throws RecognitionException {
        SqlParser.table_conflict_clause_return retval = new SqlParser.table_conflict_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ON283=null;
        Token CONFLICT284=null;
        Token set285=null;

        Object ON283_tree=null;
        Object CONFLICT284_tree=null;
        Object set285_tree=null;

        try {
            // SqlParser.g:245:22: ( ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) )
            // SqlParser.g:245:24: ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE )
            {
            root_0 = (Object)adaptor.nil();

            ON283=(Token)match(input,ON,FOLLOW_ON_in_table_conflict_clause2150); 
            CONFLICT284=(Token)match(input,CONFLICT,FOLLOW_CONFLICT_in_table_conflict_clause2153); 
            CONFLICT284_tree = (Object)adaptor.create(CONFLICT284);
            root_0 = (Object)adaptor.becomeRoot(CONFLICT284_tree, root_0);

            set285=(Token)input.LT(1);
            if ( input.LA(1)==ABORT||input.LA(1)==FAIL||input.LA(1)==IGNORE||input.LA(1)==REPLACE||input.LA(1)==ROLLBACK ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set285));
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
    // SqlParser.g:249:1: create_virtual_table_stmt : CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )? ;
    public final SqlParser.create_virtual_table_stmt_return create_virtual_table_stmt() throws RecognitionException {
        SqlParser.create_virtual_table_stmt_return retval = new SqlParser.create_virtual_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE286=null;
        Token VIRTUAL287=null;
        Token TABLE288=null;
        Token DOT289=null;
        Token USING290=null;
        Token LPAREN291=null;
        Token COMMA293=null;
        Token RPAREN295=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.id_return module_name = null;

        SqlParser.column_def_return column_def292 = null;

        SqlParser.column_def_return column_def294 = null;


        Object CREATE286_tree=null;
        Object VIRTUAL287_tree=null;
        Object TABLE288_tree=null;
        Object DOT289_tree=null;
        Object USING290_tree=null;
        Object LPAREN291_tree=null;
        Object COMMA293_tree=null;
        Object RPAREN295_tree=null;

        try {
            // SqlParser.g:249:26: ( CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )? )
            // SqlParser.g:249:28: CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            CREATE286=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_virtual_table_stmt2183); 
            CREATE286_tree = (Object)adaptor.create(CREATE286);
            adaptor.addChild(root_0, CREATE286_tree);

            VIRTUAL287=(Token)match(input,VIRTUAL,FOLLOW_VIRTUAL_in_create_virtual_table_stmt2185); 
            VIRTUAL287_tree = (Object)adaptor.create(VIRTUAL287);
            adaptor.addChild(root_0, VIRTUAL287_tree);

            TABLE288=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_virtual_table_stmt2187); 
            TABLE288_tree = (Object)adaptor.create(TABLE288);
            adaptor.addChild(root_0, TABLE288_tree);

            // SqlParser.g:249:49: (database_name= id DOT )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==ID) ) {
                int LA109_1 = input.LA(2);

                if ( (LA109_1==DOT) ) {
                    alt109=1;
                }
            }
            else if ( ((LA109_0>=ABORT && LA109_0<=WHERE)) ) {
                int LA109_2 = input.LA(2);

                if ( (LA109_2==DOT) ) {
                    alt109=1;
                }
            }
            switch (alt109) {
                case 1 :
                    // SqlParser.g:249:50: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_virtual_table_stmt2192);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT289=(Token)match(input,DOT,FOLLOW_DOT_in_create_virtual_table_stmt2194); 
                    DOT289_tree = (Object)adaptor.create(DOT289);
                    adaptor.addChild(root_0, DOT289_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_virtual_table_stmt2200);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            USING290=(Token)match(input,USING,FOLLOW_USING_in_create_virtual_table_stmt2204); 
            USING290_tree = (Object)adaptor.create(USING290);
            adaptor.addChild(root_0, USING290_tree);

            pushFollow(FOLLOW_id_in_create_virtual_table_stmt2208);
            module_name=id();

            state._fsp--;

            adaptor.addChild(root_0, module_name.getTree());
            // SqlParser.g:250:24: ( LPAREN column_def ( COMMA column_def )* RPAREN )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==LPAREN) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // SqlParser.g:250:25: LPAREN column_def ( COMMA column_def )* RPAREN
                    {
                    LPAREN291=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_virtual_table_stmt2211); 
                    LPAREN291_tree = (Object)adaptor.create(LPAREN291);
                    adaptor.addChild(root_0, LPAREN291_tree);

                    pushFollow(FOLLOW_column_def_in_create_virtual_table_stmt2213);
                    column_def292=column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, column_def292.getTree());
                    // SqlParser.g:250:43: ( COMMA column_def )*
                    loop110:
                    do {
                        int alt110=2;
                        int LA110_0 = input.LA(1);

                        if ( (LA110_0==COMMA) ) {
                            alt110=1;
                        }


                        switch (alt110) {
                    	case 1 :
                    	    // SqlParser.g:250:44: COMMA column_def
                    	    {
                    	    COMMA293=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_virtual_table_stmt2216); 
                    	    COMMA293_tree = (Object)adaptor.create(COMMA293);
                    	    adaptor.addChild(root_0, COMMA293_tree);

                    	    pushFollow(FOLLOW_column_def_in_create_virtual_table_stmt2218);
                    	    column_def294=column_def();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, column_def294.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop110;
                        }
                    } while (true);

                    RPAREN295=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_virtual_table_stmt2222); 
                    RPAREN295_tree = (Object)adaptor.create(RPAREN295);
                    adaptor.addChild(root_0, RPAREN295_tree);


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
    // SqlParser.g:253:1: create_table_stmt : CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt ) -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMN_DEFS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? ) ;
    public final SqlParser.create_table_stmt_return create_table_stmt() throws RecognitionException {
        SqlParser.create_table_stmt_return retval = new SqlParser.create_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE296=null;
        Token TEMPORARY297=null;
        Token TABLE298=null;
        Token IF299=null;
        Token NOT300=null;
        Token EXISTS301=null;
        Token DOT302=null;
        Token LPAREN303=null;
        Token COMMA305=null;
        Token COMMA307=null;
        Token RPAREN309=null;
        Token AS310=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.column_def_return column_def304 = null;

        SqlParser.column_def_return column_def306 = null;

        SqlParser.table_constraint_return table_constraint308 = null;

        SqlParser.select_stmt_return select_stmt311 = null;


        Object CREATE296_tree=null;
        Object TEMPORARY297_tree=null;
        Object TABLE298_tree=null;
        Object IF299_tree=null;
        Object NOT300_tree=null;
        Object EXISTS301_tree=null;
        Object DOT302_tree=null;
        Object LPAREN303_tree=null;
        Object COMMA305_tree=null;
        Object COMMA307_tree=null;
        Object RPAREN309_tree=null;
        Object AS310_tree=null;
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
            // SqlParser.g:253:18: ( CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt ) -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMN_DEFS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? ) )
            // SqlParser.g:253:20: CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt )
            {
            CREATE296=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_table_stmt2232);  
            stream_CREATE.add(CREATE296);

            // SqlParser.g:253:27: ( TEMPORARY )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==TEMPORARY) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // SqlParser.g:253:27: TEMPORARY
                    {
                    TEMPORARY297=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_table_stmt2234);  
                    stream_TEMPORARY.add(TEMPORARY297);


                    }
                    break;

            }

            TABLE298=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_table_stmt2237);  
            stream_TABLE.add(TABLE298);

            // SqlParser.g:253:44: ( IF NOT EXISTS )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==IF) ) {
                int LA113_1 = input.LA(2);

                if ( (LA113_1==NOT) ) {
                    alt113=1;
                }
            }
            switch (alt113) {
                case 1 :
                    // SqlParser.g:253:45: IF NOT EXISTS
                    {
                    IF299=(Token)match(input,IF,FOLLOW_IF_in_create_table_stmt2240);  
                    stream_IF.add(IF299);

                    NOT300=(Token)match(input,NOT,FOLLOW_NOT_in_create_table_stmt2242);  
                    stream_NOT.add(NOT300);

                    EXISTS301=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_table_stmt2244);  
                    stream_EXISTS.add(EXISTS301);


                    }
                    break;

            }

            // SqlParser.g:253:61: (database_name= id DOT )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==ID) ) {
                int LA114_1 = input.LA(2);

                if ( (LA114_1==DOT) ) {
                    alt114=1;
                }
            }
            else if ( ((LA114_0>=ABORT && LA114_0<=WHERE)) ) {
                int LA114_2 = input.LA(2);

                if ( (LA114_2==DOT) ) {
                    alt114=1;
                }
            }
            switch (alt114) {
                case 1 :
                    // SqlParser.g:253:62: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_table_stmt2251);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT302=(Token)match(input,DOT,FOLLOW_DOT_in_create_table_stmt2253);  
                    stream_DOT.add(DOT302);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_table_stmt2259);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());
            // SqlParser.g:254:3: ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt )
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==LPAREN) ) {
                alt117=1;
            }
            else if ( (LA117_0==AS) ) {
                alt117=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }
            switch (alt117) {
                case 1 :
                    // SqlParser.g:254:5: LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN
                    {
                    LPAREN303=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_table_stmt2265);  
                    stream_LPAREN.add(LPAREN303);

                    pushFollow(FOLLOW_column_def_in_create_table_stmt2267);
                    column_def304=column_def();

                    state._fsp--;

                    stream_column_def.add(column_def304.getTree());
                    // SqlParser.g:254:23: ( COMMA column_def )*
                    loop115:
                    do {
                        int alt115=2;
                        alt115 = dfa115.predict(input);
                        switch (alt115) {
                    	case 1 :
                    	    // SqlParser.g:254:24: COMMA column_def
                    	    {
                    	    COMMA305=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_table_stmt2270);  
                    	    stream_COMMA.add(COMMA305);

                    	    pushFollow(FOLLOW_column_def_in_create_table_stmt2272);
                    	    column_def306=column_def();

                    	    state._fsp--;

                    	    stream_column_def.add(column_def306.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop115;
                        }
                    } while (true);

                    // SqlParser.g:254:43: ( COMMA table_constraint )*
                    loop116:
                    do {
                        int alt116=2;
                        int LA116_0 = input.LA(1);

                        if ( (LA116_0==COMMA) ) {
                            alt116=1;
                        }


                        switch (alt116) {
                    	case 1 :
                    	    // SqlParser.g:254:44: COMMA table_constraint
                    	    {
                    	    COMMA307=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_table_stmt2277);  
                    	    stream_COMMA.add(COMMA307);

                    	    pushFollow(FOLLOW_table_constraint_in_create_table_stmt2279);
                    	    table_constraint308=table_constraint();

                    	    state._fsp--;

                    	    stream_table_constraint.add(table_constraint308.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop116;
                        }
                    } while (true);

                    RPAREN309=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_table_stmt2283);  
                    stream_RPAREN.add(RPAREN309);


                    }
                    break;
                case 2 :
                    // SqlParser.g:255:5: AS select_stmt
                    {
                    AS310=(Token)match(input,AS,FOLLOW_AS_in_create_table_stmt2289);  
                    stream_AS.add(AS310);

                    pushFollow(FOLLOW_select_stmt_in_create_table_stmt2291);
                    select_stmt311=select_stmt();

                    state._fsp--;

                    stream_select_stmt.add(select_stmt311.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: table_name, select_stmt, EXISTS, column_def, database_name, TEMPORARY, table_constraint
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
            // 256:1: -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMN_DEFS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? )
            {
                // SqlParser.g:256:4: ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMN_DEFS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CREATE_TABLE, "CREATE_TABLE"), root_1);

                // SqlParser.g:256:19: ^( OPTIONS ( TEMPORARY )? ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:256:29: ( TEMPORARY )?
                if ( stream_TEMPORARY.hasNext() ) {
                    adaptor.addChild(root_2, stream_TEMPORARY.nextNode());

                }
                stream_TEMPORARY.reset();
                // SqlParser.g:256:40: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:256:49: ^( $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                // SqlParser.g:256:63: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:257:3: ( ^( COLUMN_DEFS ( column_def )+ ) )?
                if ( stream_column_def.hasNext() ) {
                    // SqlParser.g:257:3: ^( COLUMN_DEFS ( column_def )+ )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMN_DEFS, "COLUMN_DEFS"), root_2);

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
                // SqlParser.g:257:31: ( ^( CONSTRAINTS ( table_constraint )* ) )?
                if ( stream_table_constraint.hasNext() ) {
                    // SqlParser.g:257:31: ^( CONSTRAINTS ( table_constraint )* )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRAINTS, "CONSTRAINTS"), root_2);

                    // SqlParser.g:257:45: ( table_constraint )*
                    while ( stream_table_constraint.hasNext() ) {
                        adaptor.addChild(root_2, stream_table_constraint.nextTree());

                    }
                    stream_table_constraint.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_table_constraint.reset();
                // SqlParser.g:257:65: ( select_stmt )?
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
    // SqlParser.g:259:1: column_def : name= id_column_def ( type_name )? ( column_constraint )* -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? ) ;
    public final SqlParser.column_def_return column_def() throws RecognitionException {
        SqlParser.column_def_return retval = new SqlParser.column_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.id_column_def_return name = null;

        SqlParser.type_name_return type_name312 = null;

        SqlParser.column_constraint_return column_constraint313 = null;


        RewriteRuleSubtreeStream stream_column_constraint=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint");
        RewriteRuleSubtreeStream stream_id_column_def=new RewriteRuleSubtreeStream(adaptor,"rule id_column_def");
        RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");
        try {
            // SqlParser.g:259:11: (name= id_column_def ( type_name )? ( column_constraint )* -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? ) )
            // SqlParser.g:259:13: name= id_column_def ( type_name )? ( column_constraint )*
            {
            pushFollow(FOLLOW_id_column_def_in_column_def2347);
            name=id_column_def();

            state._fsp--;

            stream_id_column_def.add(name.getTree());
            // SqlParser.g:259:32: ( type_name )?
            int alt118=2;
            alt118 = dfa118.predict(input);
            switch (alt118) {
                case 1 :
                    // SqlParser.g:259:32: type_name
                    {
                    pushFollow(FOLLOW_type_name_in_column_def2349);
                    type_name312=type_name();

                    state._fsp--;

                    stream_type_name.add(type_name312.getTree());

                    }
                    break;

            }

            // SqlParser.g:259:43: ( column_constraint )*
            loop119:
            do {
                int alt119=2;
                alt119 = dfa119.predict(input);
                switch (alt119) {
            	case 1 :
            	    // SqlParser.g:259:43: column_constraint
            	    {
            	    pushFollow(FOLLOW_column_constraint_in_column_def2352);
            	    column_constraint313=column_constraint();

            	    state._fsp--;

            	    stream_column_constraint.add(column_constraint313.getTree());

            	    }
            	    break;

            	default :
            	    break loop119;
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
            // 259:62: -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? )
            {
                // SqlParser.g:259:65: ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_name.nextNode(), root_1);

                // SqlParser.g:259:73: ^( CONSTRAINTS ( column_constraint )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRAINTS, "CONSTRAINTS"), root_2);

                // SqlParser.g:259:87: ( column_constraint )*
                while ( stream_column_constraint.hasNext() ) {
                    adaptor.addChild(root_2, stream_column_constraint.nextTree());

                }
                stream_column_constraint.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:259:107: ( type_name )?
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
    // SqlParser.g:261:1: column_constraint : ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause ) -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? ) ;
    public final SqlParser.column_constraint_return column_constraint() throws RecognitionException {
        SqlParser.column_constraint_return retval = new SqlParser.column_constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONSTRAINT314=null;
        SqlParser.id_return name = null;

        SqlParser.column_constraint_pk_return column_constraint_pk315 = null;

        SqlParser.column_constraint_not_null_return column_constraint_not_null316 = null;

        SqlParser.column_constraint_unique_return column_constraint_unique317 = null;

        SqlParser.column_constraint_check_return column_constraint_check318 = null;

        SqlParser.column_constraint_default_return column_constraint_default319 = null;

        SqlParser.column_constraint_collate_return column_constraint_collate320 = null;

        SqlParser.fk_clause_return fk_clause321 = null;


        Object CONSTRAINT314_tree=null;
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
            // SqlParser.g:261:18: ( ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause ) -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? ) )
            // SqlParser.g:261:20: ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause )
            {
            // SqlParser.g:261:20: ( CONSTRAINT name= id )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==CONSTRAINT) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // SqlParser.g:261:21: CONSTRAINT name= id
                    {
                    CONSTRAINT314=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_column_constraint2378);  
                    stream_CONSTRAINT.add(CONSTRAINT314);

                    pushFollow(FOLLOW_id_in_column_constraint2382);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());

                    }
                    break;

            }

            // SqlParser.g:262:3: ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause )
            int alt121=7;
            switch ( input.LA(1) ) {
            case PRIMARY:
                {
                alt121=1;
                }
                break;
            case NOT:
                {
                alt121=2;
                }
                break;
            case UNIQUE:
                {
                alt121=3;
                }
                break;
            case CHECK:
                {
                alt121=4;
                }
                break;
            case DEFAULT:
                {
                alt121=5;
                }
                break;
            case COLLATE:
                {
                alt121=6;
                }
                break;
            case REFERENCES:
                {
                alt121=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }

            switch (alt121) {
                case 1 :
                    // SqlParser.g:262:5: column_constraint_pk
                    {
                    pushFollow(FOLLOW_column_constraint_pk_in_column_constraint2390);
                    column_constraint_pk315=column_constraint_pk();

                    state._fsp--;

                    stream_column_constraint_pk.add(column_constraint_pk315.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:263:5: column_constraint_not_null
                    {
                    pushFollow(FOLLOW_column_constraint_not_null_in_column_constraint2396);
                    column_constraint_not_null316=column_constraint_not_null();

                    state._fsp--;

                    stream_column_constraint_not_null.add(column_constraint_not_null316.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:264:5: column_constraint_unique
                    {
                    pushFollow(FOLLOW_column_constraint_unique_in_column_constraint2402);
                    column_constraint_unique317=column_constraint_unique();

                    state._fsp--;

                    stream_column_constraint_unique.add(column_constraint_unique317.getTree());

                    }
                    break;
                case 4 :
                    // SqlParser.g:265:5: column_constraint_check
                    {
                    pushFollow(FOLLOW_column_constraint_check_in_column_constraint2408);
                    column_constraint_check318=column_constraint_check();

                    state._fsp--;

                    stream_column_constraint_check.add(column_constraint_check318.getTree());

                    }
                    break;
                case 5 :
                    // SqlParser.g:266:5: column_constraint_default
                    {
                    pushFollow(FOLLOW_column_constraint_default_in_column_constraint2414);
                    column_constraint_default319=column_constraint_default();

                    state._fsp--;

                    stream_column_constraint_default.add(column_constraint_default319.getTree());

                    }
                    break;
                case 6 :
                    // SqlParser.g:267:5: column_constraint_collate
                    {
                    pushFollow(FOLLOW_column_constraint_collate_in_column_constraint2420);
                    column_constraint_collate320=column_constraint_collate();

                    state._fsp--;

                    stream_column_constraint_collate.add(column_constraint_collate320.getTree());

                    }
                    break;
                case 7 :
                    // SqlParser.g:268:5: fk_clause
                    {
                    pushFollow(FOLLOW_fk_clause_in_column_constraint2426);
                    fk_clause321=fk_clause();

                    state._fsp--;

                    stream_fk_clause.add(fk_clause321.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: column_constraint_not_null, name, column_constraint_collate, column_constraint_unique, column_constraint_check, fk_clause, column_constraint_default, column_constraint_pk
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 269:1: -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? )
            {
                // SqlParser.g:269:4: ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMN_CONSTRAINT, "COLUMN_CONSTRAINT"), root_1);

                // SqlParser.g:270:3: ( column_constraint_pk )?
                if ( stream_column_constraint_pk.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_pk.nextTree());

                }
                stream_column_constraint_pk.reset();
                // SqlParser.g:271:3: ( column_constraint_not_null )?
                if ( stream_column_constraint_not_null.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_not_null.nextTree());

                }
                stream_column_constraint_not_null.reset();
                // SqlParser.g:272:3: ( column_constraint_unique )?
                if ( stream_column_constraint_unique.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_unique.nextTree());

                }
                stream_column_constraint_unique.reset();
                // SqlParser.g:273:3: ( column_constraint_check )?
                if ( stream_column_constraint_check.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_check.nextTree());

                }
                stream_column_constraint_check.reset();
                // SqlParser.g:274:3: ( column_constraint_default )?
                if ( stream_column_constraint_default.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_default.nextTree());

                }
                stream_column_constraint_default.reset();
                // SqlParser.g:275:3: ( column_constraint_collate )?
                if ( stream_column_constraint_collate.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_collate.nextTree());

                }
                stream_column_constraint_collate.reset();
                // SqlParser.g:276:3: ( fk_clause )?
                if ( stream_fk_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_fk_clause.nextTree());

                }
                stream_fk_clause.reset();
                // SqlParser.g:277:3: ( $name)?
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
    // SqlParser.g:279:1: column_constraint_pk : PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )? ;
    public final SqlParser.column_constraint_pk_return column_constraint_pk() throws RecognitionException {
        SqlParser.column_constraint_pk_return retval = new SqlParser.column_constraint_pk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRIMARY322=null;
        Token KEY323=null;
        Token set324=null;
        Token AUTOINCREMENT326=null;
        SqlParser.table_conflict_clause_return table_conflict_clause325 = null;


        Object PRIMARY322_tree=null;
        Object KEY323_tree=null;
        Object set324_tree=null;
        Object AUTOINCREMENT326_tree=null;

        try {
            // SqlParser.g:279:21: ( PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )? )
            // SqlParser.g:279:23: PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )?
            {
            root_0 = (Object)adaptor.nil();

            PRIMARY322=(Token)match(input,PRIMARY,FOLLOW_PRIMARY_in_column_constraint_pk2481); 
            PRIMARY322_tree = (Object)adaptor.create(PRIMARY322);
            root_0 = (Object)adaptor.becomeRoot(PRIMARY322_tree, root_0);

            KEY323=(Token)match(input,KEY,FOLLOW_KEY_in_column_constraint_pk2484); 
            // SqlParser.g:279:37: ( ASC | DESC )?
            int alt122=2;
            alt122 = dfa122.predict(input);
            switch (alt122) {
                case 1 :
                    // SqlParser.g:
                    {
                    set324=(Token)input.LT(1);
                    if ( input.LA(1)==ASC||input.LA(1)==DESC ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set324));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            // SqlParser.g:279:51: ( table_conflict_clause )?
            int alt123=2;
            alt123 = dfa123.predict(input);
            switch (alt123) {
                case 1 :
                    // SqlParser.g:279:51: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_pk2496);
                    table_conflict_clause325=table_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, table_conflict_clause325.getTree());

                    }
                    break;

            }

            // SqlParser.g:279:74: ( AUTOINCREMENT )?
            int alt124=2;
            alt124 = dfa124.predict(input);
            switch (alt124) {
                case 1 :
                    // SqlParser.g:279:75: AUTOINCREMENT
                    {
                    AUTOINCREMENT326=(Token)match(input,AUTOINCREMENT,FOLLOW_AUTOINCREMENT_in_column_constraint_pk2500); 
                    AUTOINCREMENT326_tree = (Object)adaptor.create(AUTOINCREMENT326);
                    adaptor.addChild(root_0, AUTOINCREMENT326_tree);


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
    // SqlParser.g:281:1: column_constraint_not_null : NOT NULL ( table_conflict_clause )? -> ^( NOT_NULL ( table_conflict_clause )? ) ;
    public final SqlParser.column_constraint_not_null_return column_constraint_not_null() throws RecognitionException {
        SqlParser.column_constraint_not_null_return retval = new SqlParser.column_constraint_not_null_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT327=null;
        Token NULL328=null;
        SqlParser.table_conflict_clause_return table_conflict_clause329 = null;


        Object NOT327_tree=null;
        Object NULL328_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // SqlParser.g:281:27: ( NOT NULL ( table_conflict_clause )? -> ^( NOT_NULL ( table_conflict_clause )? ) )
            // SqlParser.g:281:29: NOT NULL ( table_conflict_clause )?
            {
            NOT327=(Token)match(input,NOT,FOLLOW_NOT_in_column_constraint_not_null2509);  
            stream_NOT.add(NOT327);

            NULL328=(Token)match(input,NULL,FOLLOW_NULL_in_column_constraint_not_null2511);  
            stream_NULL.add(NULL328);

            // SqlParser.g:281:38: ( table_conflict_clause )?
            int alt125=2;
            alt125 = dfa125.predict(input);
            switch (alt125) {
                case 1 :
                    // SqlParser.g:281:38: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_not_null2513);
                    table_conflict_clause329=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause329.getTree());

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
            // 281:61: -> ^( NOT_NULL ( table_conflict_clause )? )
            {
                // SqlParser.g:281:64: ^( NOT_NULL ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_NULL, "NOT_NULL"), root_1);

                // SqlParser.g:281:75: ( table_conflict_clause )?
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
    // SqlParser.g:283:1: column_constraint_unique : UNIQUE ( table_conflict_clause )? ;
    public final SqlParser.column_constraint_unique_return column_constraint_unique() throws RecognitionException {
        SqlParser.column_constraint_unique_return retval = new SqlParser.column_constraint_unique_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNIQUE330=null;
        SqlParser.table_conflict_clause_return table_conflict_clause331 = null;


        Object UNIQUE330_tree=null;

        try {
            // SqlParser.g:283:25: ( UNIQUE ( table_conflict_clause )? )
            // SqlParser.g:283:27: UNIQUE ( table_conflict_clause )?
            {
            root_0 = (Object)adaptor.nil();

            UNIQUE330=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_column_constraint_unique2530); 
            UNIQUE330_tree = (Object)adaptor.create(UNIQUE330);
            root_0 = (Object)adaptor.becomeRoot(UNIQUE330_tree, root_0);

            // SqlParser.g:283:35: ( table_conflict_clause )?
            int alt126=2;
            alt126 = dfa126.predict(input);
            switch (alt126) {
                case 1 :
                    // SqlParser.g:283:35: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_unique2533);
                    table_conflict_clause331=table_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, table_conflict_clause331.getTree());

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
    // SqlParser.g:285:1: column_constraint_check : CHECK LPAREN expr RPAREN ;
    public final SqlParser.column_constraint_check_return column_constraint_check() throws RecognitionException {
        SqlParser.column_constraint_check_return retval = new SqlParser.column_constraint_check_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CHECK332=null;
        Token LPAREN333=null;
        Token RPAREN335=null;
        SqlParser.expr_return expr334 = null;


        Object CHECK332_tree=null;
        Object LPAREN333_tree=null;
        Object RPAREN335_tree=null;

        try {
            // SqlParser.g:285:24: ( CHECK LPAREN expr RPAREN )
            // SqlParser.g:285:26: CHECK LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            CHECK332=(Token)match(input,CHECK,FOLLOW_CHECK_in_column_constraint_check2541); 
            CHECK332_tree = (Object)adaptor.create(CHECK332);
            root_0 = (Object)adaptor.becomeRoot(CHECK332_tree, root_0);

            LPAREN333=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_column_constraint_check2544); 
            pushFollow(FOLLOW_expr_in_column_constraint_check2547);
            expr334=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr334.getTree());
            RPAREN335=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_column_constraint_check2549); 

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
    // SqlParser.g:287:1: column_constraint_default : DEFAULT ( SIGNED_NUMBER | literal_value | LPAREN expr RPAREN ) ;
    public final SqlParser.column_constraint_default_return column_constraint_default() throws RecognitionException {
        SqlParser.column_constraint_default_return retval = new SqlParser.column_constraint_default_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT336=null;
        Token SIGNED_NUMBER337=null;
        Token LPAREN339=null;
        Token RPAREN341=null;
        SqlParser.literal_value_return literal_value338 = null;

        SqlParser.expr_return expr340 = null;


        Object DEFAULT336_tree=null;
        Object SIGNED_NUMBER337_tree=null;
        Object LPAREN339_tree=null;
        Object RPAREN341_tree=null;

        try {
            // SqlParser.g:287:26: ( DEFAULT ( SIGNED_NUMBER | literal_value | LPAREN expr RPAREN ) )
            // SqlParser.g:287:28: DEFAULT ( SIGNED_NUMBER | literal_value | LPAREN expr RPAREN )
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT336=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_column_constraint_default2557); 
            DEFAULT336_tree = (Object)adaptor.create(DEFAULT336);
            root_0 = (Object)adaptor.becomeRoot(DEFAULT336_tree, root_0);

            // SqlParser.g:287:37: ( SIGNED_NUMBER | literal_value | LPAREN expr RPAREN )
            int alt127=3;
            switch ( input.LA(1) ) {
            case SIGNED_NUMBER:
                {
                alt127=1;
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
                alt127=2;
                }
                break;
            case LPAREN:
                {
                alt127=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }

            switch (alt127) {
                case 1 :
                    // SqlParser.g:287:38: SIGNED_NUMBER
                    {
                    SIGNED_NUMBER337=(Token)match(input,SIGNED_NUMBER,FOLLOW_SIGNED_NUMBER_in_column_constraint_default2561); 
                    SIGNED_NUMBER337_tree = (Object)adaptor.create(SIGNED_NUMBER337);
                    adaptor.addChild(root_0, SIGNED_NUMBER337_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:287:54: literal_value
                    {
                    pushFollow(FOLLOW_literal_value_in_column_constraint_default2565);
                    literal_value338=literal_value();

                    state._fsp--;

                    adaptor.addChild(root_0, literal_value338.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:287:70: LPAREN expr RPAREN
                    {
                    LPAREN339=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_column_constraint_default2569); 
                    pushFollow(FOLLOW_expr_in_column_constraint_default2572);
                    expr340=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr340.getTree());
                    RPAREN341=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_column_constraint_default2574); 

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
    // SqlParser.g:289:1: column_constraint_collate : COLLATE collation_name= id ;
    public final SqlParser.column_constraint_collate_return column_constraint_collate() throws RecognitionException {
        SqlParser.column_constraint_collate_return retval = new SqlParser.column_constraint_collate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLLATE342=null;
        SqlParser.id_return collation_name = null;


        Object COLLATE342_tree=null;

        try {
            // SqlParser.g:289:26: ( COLLATE collation_name= id )
            // SqlParser.g:289:28: COLLATE collation_name= id
            {
            root_0 = (Object)adaptor.nil();

            COLLATE342=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_column_constraint_collate2583); 
            COLLATE342_tree = (Object)adaptor.create(COLLATE342);
            root_0 = (Object)adaptor.becomeRoot(COLLATE342_tree, root_0);

            pushFollow(FOLLOW_id_in_column_constraint_collate2588);
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
    // SqlParser.g:291:1: table_constraint : ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_check | table_constraint_fk ) ;
    public final SqlParser.table_constraint_return table_constraint() throws RecognitionException {
        SqlParser.table_constraint_return retval = new SqlParser.table_constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONSTRAINT343=null;
        SqlParser.id_return name = null;

        SqlParser.table_constraint_pk_return table_constraint_pk344 = null;

        SqlParser.table_constraint_check_return table_constraint_check345 = null;

        SqlParser.table_constraint_fk_return table_constraint_fk346 = null;


        Object CONSTRAINT343_tree=null;

        try {
            // SqlParser.g:291:17: ( ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_check | table_constraint_fk ) )
            // SqlParser.g:291:19: ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_check | table_constraint_fk )
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:291:19: ( CONSTRAINT name= id )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==CONSTRAINT) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // SqlParser.g:291:20: CONSTRAINT name= id
                    {
                    CONSTRAINT343=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_table_constraint2597); 
                    CONSTRAINT343_tree = (Object)adaptor.create(CONSTRAINT343);
                    adaptor.addChild(root_0, CONSTRAINT343_tree);

                    pushFollow(FOLLOW_id_in_table_constraint2601);
                    name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, name.getTree());

                    }
                    break;

            }

            // SqlParser.g:292:3: ( table_constraint_pk | table_constraint_check | table_constraint_fk )
            int alt129=3;
            switch ( input.LA(1) ) {
            case PRIMARY:
            case UNIQUE:
                {
                alt129=1;
                }
                break;
            case CHECK:
                {
                alt129=2;
                }
                break;
            case FOREIGN:
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
                    // SqlParser.g:292:5: table_constraint_pk
                    {
                    pushFollow(FOLLOW_table_constraint_pk_in_table_constraint2609);
                    table_constraint_pk344=table_constraint_pk();

                    state._fsp--;

                    adaptor.addChild(root_0, table_constraint_pk344.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:293:5: table_constraint_check
                    {
                    pushFollow(FOLLOW_table_constraint_check_in_table_constraint2615);
                    table_constraint_check345=table_constraint_check();

                    state._fsp--;

                    adaptor.addChild(root_0, table_constraint_check345.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:294:5: table_constraint_fk
                    {
                    pushFollow(FOLLOW_table_constraint_fk_in_table_constraint2621);
                    table_constraint_fk346=table_constraint_fk();

                    state._fsp--;

                    adaptor.addChild(root_0, table_constraint_fk346.getTree());

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
    // $ANTLR end "table_constraint"

    public static class table_constraint_pk_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "table_constraint_pk"
    // SqlParser.g:296:1: table_constraint_pk : ( PRIMARY KEY | UNIQUE ) LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? ;
    public final SqlParser.table_constraint_pk_return table_constraint_pk() throws RecognitionException {
        SqlParser.table_constraint_pk_return retval = new SqlParser.table_constraint_pk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRIMARY347=null;
        Token KEY348=null;
        Token UNIQUE349=null;
        Token LPAREN350=null;
        Token COMMA351=null;
        Token RPAREN352=null;
        List list_indexed_columns=null;
        SqlParser.table_conflict_clause_return table_conflict_clause353 = null;

        SqlParser.id_return indexed_columns = null;
         indexed_columns = null;
        Object PRIMARY347_tree=null;
        Object KEY348_tree=null;
        Object UNIQUE349_tree=null;
        Object LPAREN350_tree=null;
        Object COMMA351_tree=null;
        Object RPAREN352_tree=null;

        try {
            // SqlParser.g:296:20: ( ( PRIMARY KEY | UNIQUE ) LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? )
            // SqlParser.g:296:22: ( PRIMARY KEY | UNIQUE ) LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )?
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:296:22: ( PRIMARY KEY | UNIQUE )
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==PRIMARY) ) {
                alt130=1;
            }
            else if ( (LA130_0==UNIQUE) ) {
                alt130=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;
            }
            switch (alt130) {
                case 1 :
                    // SqlParser.g:296:23: PRIMARY KEY
                    {
                    PRIMARY347=(Token)match(input,PRIMARY,FOLLOW_PRIMARY_in_table_constraint_pk2630); 
                    PRIMARY347_tree = (Object)adaptor.create(PRIMARY347);
                    adaptor.addChild(root_0, PRIMARY347_tree);

                    KEY348=(Token)match(input,KEY,FOLLOW_KEY_in_table_constraint_pk2632); 
                    KEY348_tree = (Object)adaptor.create(KEY348);
                    adaptor.addChild(root_0, KEY348_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:296:37: UNIQUE
                    {
                    UNIQUE349=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_table_constraint_pk2636); 
                    UNIQUE349_tree = (Object)adaptor.create(UNIQUE349);
                    adaptor.addChild(root_0, UNIQUE349_tree);


                    }
                    break;

            }

            LPAREN350=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_pk2639); 
            LPAREN350_tree = (Object)adaptor.create(LPAREN350);
            adaptor.addChild(root_0, LPAREN350_tree);

            pushFollow(FOLLOW_id_in_table_constraint_pk2643);
            indexed_columns=id();

            state._fsp--;

            adaptor.addChild(root_0, indexed_columns.getTree());
            if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            list_indexed_columns.add(indexed_columns.getTree());

            // SqlParser.g:296:72: ( COMMA indexed_columns+= id )*
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( (LA131_0==COMMA) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // SqlParser.g:296:73: COMMA indexed_columns+= id
            	    {
            	    COMMA351=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_pk2646); 
            	    COMMA351_tree = (Object)adaptor.create(COMMA351);
            	    adaptor.addChild(root_0, COMMA351_tree);

            	    pushFollow(FOLLOW_id_in_table_constraint_pk2650);
            	    indexed_columns=id();

            	    state._fsp--;

            	    adaptor.addChild(root_0, indexed_columns.getTree());
            	    if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            	    list_indexed_columns.add(indexed_columns.getTree());


            	    }
            	    break;

            	default :
            	    break loop131;
                }
            } while (true);

            RPAREN352=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_pk2654); 
            RPAREN352_tree = (Object)adaptor.create(RPAREN352);
            adaptor.addChild(root_0, RPAREN352_tree);

            // SqlParser.g:297:3: ( table_conflict_clause )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==ON) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // SqlParser.g:297:3: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_table_constraint_pk2658);
                    table_conflict_clause353=table_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, table_conflict_clause353.getTree());

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
    // $ANTLR end "table_constraint_pk"

    public static class table_constraint_check_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "table_constraint_check"
    // SqlParser.g:299:1: table_constraint_check : CHECK LPAREN expr RPAREN ;
    public final SqlParser.table_constraint_check_return table_constraint_check() throws RecognitionException {
        SqlParser.table_constraint_check_return retval = new SqlParser.table_constraint_check_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CHECK354=null;
        Token LPAREN355=null;
        Token RPAREN357=null;
        SqlParser.expr_return expr356 = null;


        Object CHECK354_tree=null;
        Object LPAREN355_tree=null;
        Object RPAREN357_tree=null;

        try {
            // SqlParser.g:299:23: ( CHECK LPAREN expr RPAREN )
            // SqlParser.g:299:25: CHECK LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            CHECK354=(Token)match(input,CHECK,FOLLOW_CHECK_in_table_constraint_check2666); 
            CHECK354_tree = (Object)adaptor.create(CHECK354);
            adaptor.addChild(root_0, CHECK354_tree);

            LPAREN355=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_check2668); 
            LPAREN355_tree = (Object)adaptor.create(LPAREN355);
            adaptor.addChild(root_0, LPAREN355_tree);

            pushFollow(FOLLOW_expr_in_table_constraint_check2670);
            expr356=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr356.getTree());
            RPAREN357=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_check2672); 
            RPAREN357_tree = (Object)adaptor.create(RPAREN357);
            adaptor.addChild(root_0, RPAREN357_tree);


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
    // SqlParser.g:301:1: table_constraint_fk : FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause ;
    public final SqlParser.table_constraint_fk_return table_constraint_fk() throws RecognitionException {
        SqlParser.table_constraint_fk_return retval = new SqlParser.table_constraint_fk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOREIGN358=null;
        Token KEY359=null;
        Token LPAREN360=null;
        Token COMMA361=null;
        Token RPAREN362=null;
        List list_column_names=null;
        SqlParser.fk_clause_return fk_clause363 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object FOREIGN358_tree=null;
        Object KEY359_tree=null;
        Object LPAREN360_tree=null;
        Object COMMA361_tree=null;
        Object RPAREN362_tree=null;

        try {
            // SqlParser.g:301:20: ( FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause )
            // SqlParser.g:301:22: FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause
            {
            root_0 = (Object)adaptor.nil();

            FOREIGN358=(Token)match(input,FOREIGN,FOLLOW_FOREIGN_in_table_constraint_fk2679); 
            FOREIGN358_tree = (Object)adaptor.create(FOREIGN358);
            adaptor.addChild(root_0, FOREIGN358_tree);

            KEY359=(Token)match(input,KEY,FOLLOW_KEY_in_table_constraint_fk2681); 
            KEY359_tree = (Object)adaptor.create(KEY359);
            adaptor.addChild(root_0, KEY359_tree);

            LPAREN360=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_fk2683); 
            LPAREN360_tree = (Object)adaptor.create(LPAREN360);
            adaptor.addChild(root_0, LPAREN360_tree);

            pushFollow(FOLLOW_id_in_table_constraint_fk2687);
            column_names=id();

            state._fsp--;

            adaptor.addChild(root_0, column_names.getTree());
            if (list_column_names==null) list_column_names=new ArrayList();
            list_column_names.add(column_names.getTree());

            // SqlParser.g:301:58: ( COMMA column_names+= id )*
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==COMMA) ) {
                    alt133=1;
                }


                switch (alt133) {
            	case 1 :
            	    // SqlParser.g:301:59: COMMA column_names+= id
            	    {
            	    COMMA361=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_fk2690); 
            	    COMMA361_tree = (Object)adaptor.create(COMMA361);
            	    adaptor.addChild(root_0, COMMA361_tree);

            	    pushFollow(FOLLOW_id_in_table_constraint_fk2694);
            	    column_names=id();

            	    state._fsp--;

            	    adaptor.addChild(root_0, column_names.getTree());
            	    if (list_column_names==null) list_column_names=new ArrayList();
            	    list_column_names.add(column_names.getTree());


            	    }
            	    break;

            	default :
            	    break loop133;
                }
            } while (true);

            RPAREN362=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_fk2698); 
            RPAREN362_tree = (Object)adaptor.create(RPAREN362);
            adaptor.addChild(root_0, RPAREN362_tree);

            pushFollow(FOLLOW_fk_clause_in_table_constraint_fk2700);
            fk_clause363=fk_clause();

            state._fsp--;

            adaptor.addChild(root_0, fk_clause363.getTree());

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
    // SqlParser.g:303:1: fk_clause : REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )? ;
    public final SqlParser.fk_clause_return fk_clause() throws RecognitionException {
        SqlParser.fk_clause_return retval = new SqlParser.fk_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REFERENCES364=null;
        Token LPAREN365=null;
        Token COMMA366=null;
        Token RPAREN367=null;
        List list_column_names=null;
        SqlParser.id_return foreign_table = null;

        SqlParser.fk_clause_action_return fk_clause_action368 = null;

        SqlParser.fk_clause_deferrable_return fk_clause_deferrable369 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object REFERENCES364_tree=null;
        Object LPAREN365_tree=null;
        Object COMMA366_tree=null;
        Object RPAREN367_tree=null;

        try {
            // SqlParser.g:303:10: ( REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )? )
            // SqlParser.g:303:12: REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )?
            {
            root_0 = (Object)adaptor.nil();

            REFERENCES364=(Token)match(input,REFERENCES,FOLLOW_REFERENCES_in_fk_clause2707); 
            REFERENCES364_tree = (Object)adaptor.create(REFERENCES364);
            root_0 = (Object)adaptor.becomeRoot(REFERENCES364_tree, root_0);

            pushFollow(FOLLOW_id_in_fk_clause2712);
            foreign_table=id();

            state._fsp--;

            adaptor.addChild(root_0, foreign_table.getTree());
            // SqlParser.g:303:41: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==LPAREN) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // SqlParser.g:303:42: LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                    {
                    LPAREN365=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_fk_clause2715); 
                    LPAREN365_tree = (Object)adaptor.create(LPAREN365);
                    adaptor.addChild(root_0, LPAREN365_tree);

                    pushFollow(FOLLOW_id_in_fk_clause2719);
                    column_names=id();

                    state._fsp--;

                    adaptor.addChild(root_0, column_names.getTree());
                    if (list_column_names==null) list_column_names=new ArrayList();
                    list_column_names.add(column_names.getTree());

                    // SqlParser.g:303:66: ( COMMA column_names+= id )*
                    loop134:
                    do {
                        int alt134=2;
                        int LA134_0 = input.LA(1);

                        if ( (LA134_0==COMMA) ) {
                            alt134=1;
                        }


                        switch (alt134) {
                    	case 1 :
                    	    // SqlParser.g:303:67: COMMA column_names+= id
                    	    {
                    	    COMMA366=(Token)match(input,COMMA,FOLLOW_COMMA_in_fk_clause2722); 
                    	    COMMA366_tree = (Object)adaptor.create(COMMA366);
                    	    adaptor.addChild(root_0, COMMA366_tree);

                    	    pushFollow(FOLLOW_id_in_fk_clause2726);
                    	    column_names=id();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, column_names.getTree());
                    	    if (list_column_names==null) list_column_names=new ArrayList();
                    	    list_column_names.add(column_names.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop134;
                        }
                    } while (true);

                    RPAREN367=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_fk_clause2730); 
                    RPAREN367_tree = (Object)adaptor.create(RPAREN367);
                    adaptor.addChild(root_0, RPAREN367_tree);


                    }
                    break;

            }

            // SqlParser.g:304:3: ( fk_clause_action )+
            int cnt136=0;
            loop136:
            do {
                int alt136=2;
                alt136 = dfa136.predict(input);
                switch (alt136) {
            	case 1 :
            	    // SqlParser.g:304:3: fk_clause_action
            	    {
            	    pushFollow(FOLLOW_fk_clause_action_in_fk_clause2736);
            	    fk_clause_action368=fk_clause_action();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fk_clause_action368.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt136 >= 1 ) break loop136;
                        EarlyExitException eee =
                            new EarlyExitException(136, input);
                        throw eee;
                }
                cnt136++;
            } while (true);

            // SqlParser.g:304:21: ( fk_clause_deferrable )?
            int alt137=2;
            alt137 = dfa137.predict(input);
            switch (alt137) {
                case 1 :
                    // SqlParser.g:304:21: fk_clause_deferrable
                    {
                    pushFollow(FOLLOW_fk_clause_deferrable_in_fk_clause2739);
                    fk_clause_deferrable369=fk_clause_deferrable();

                    state._fsp--;

                    adaptor.addChild(root_0, fk_clause_deferrable369.getTree());

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
    // $ANTLR end "fk_clause"

    public static class fk_clause_action_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fk_clause_action"
    // SqlParser.g:306:1: fk_clause_action : ( ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT ) | MATCH name= id );
    public final SqlParser.fk_clause_action_return fk_clause_action() throws RecognitionException {
        SqlParser.fk_clause_action_return retval = new SqlParser.fk_clause_action_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ON370=null;
        Token set371=null;
        Token SET372=null;
        Token NULL373=null;
        Token SET374=null;
        Token DEFAULT375=null;
        Token CASCADE376=null;
        Token RESTRICT377=null;
        Token MATCH378=null;
        SqlParser.id_return name = null;


        Object ON370_tree=null;
        Object set371_tree=null;
        Object SET372_tree=null;
        Object NULL373_tree=null;
        Object SET374_tree=null;
        Object DEFAULT375_tree=null;
        Object CASCADE376_tree=null;
        Object RESTRICT377_tree=null;
        Object MATCH378_tree=null;

        try {
            // SqlParser.g:307:3: ( ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT ) | MATCH name= id )
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==ON) ) {
                alt139=1;
            }
            else if ( (LA139_0==MATCH) ) {
                alt139=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 139, 0, input);

                throw nvae;
            }
            switch (alt139) {
                case 1 :
                    // SqlParser.g:307:5: ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT )
                    {
                    root_0 = (Object)adaptor.nil();

                    ON370=(Token)match(input,ON,FOLLOW_ON_in_fk_clause_action2750); 
                    ON370_tree = (Object)adaptor.create(ON370);
                    adaptor.addChild(root_0, ON370_tree);

                    set371=(Token)input.LT(1);
                    if ( input.LA(1)==DELETE||input.LA(1)==INSERT||input.LA(1)==UPDATE ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set371));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // SqlParser.g:307:35: ( SET NULL | SET DEFAULT | CASCADE | RESTRICT )
                    int alt138=4;
                    switch ( input.LA(1) ) {
                    case SET:
                        {
                        int LA138_1 = input.LA(2);

                        if ( (LA138_1==NULL) ) {
                            alt138=1;
                        }
                        else if ( (LA138_1==DEFAULT) ) {
                            alt138=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 138, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case CASCADE:
                        {
                        alt138=3;
                        }
                        break;
                    case RESTRICT:
                        {
                        alt138=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 138, 0, input);

                        throw nvae;
                    }

                    switch (alt138) {
                        case 1 :
                            // SqlParser.g:307:36: SET NULL
                            {
                            SET372=(Token)match(input,SET,FOLLOW_SET_in_fk_clause_action2765); 
                            SET372_tree = (Object)adaptor.create(SET372);
                            adaptor.addChild(root_0, SET372_tree);

                            NULL373=(Token)match(input,NULL,FOLLOW_NULL_in_fk_clause_action2767); 
                            NULL373_tree = (Object)adaptor.create(NULL373);
                            adaptor.addChild(root_0, NULL373_tree);


                            }
                            break;
                        case 2 :
                            // SqlParser.g:307:47: SET DEFAULT
                            {
                            SET374=(Token)match(input,SET,FOLLOW_SET_in_fk_clause_action2771); 
                            SET374_tree = (Object)adaptor.create(SET374);
                            adaptor.addChild(root_0, SET374_tree);

                            DEFAULT375=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_fk_clause_action2773); 
                            DEFAULT375_tree = (Object)adaptor.create(DEFAULT375);
                            adaptor.addChild(root_0, DEFAULT375_tree);


                            }
                            break;
                        case 3 :
                            // SqlParser.g:307:61: CASCADE
                            {
                            CASCADE376=(Token)match(input,CASCADE,FOLLOW_CASCADE_in_fk_clause_action2777); 
                            CASCADE376_tree = (Object)adaptor.create(CASCADE376);
                            adaptor.addChild(root_0, CASCADE376_tree);


                            }
                            break;
                        case 4 :
                            // SqlParser.g:307:71: RESTRICT
                            {
                            RESTRICT377=(Token)match(input,RESTRICT,FOLLOW_RESTRICT_in_fk_clause_action2781); 
                            RESTRICT377_tree = (Object)adaptor.create(RESTRICT377);
                            adaptor.addChild(root_0, RESTRICT377_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:308:5: MATCH name= id
                    {
                    root_0 = (Object)adaptor.nil();

                    MATCH378=(Token)match(input,MATCH,FOLLOW_MATCH_in_fk_clause_action2788); 
                    MATCH378_tree = (Object)adaptor.create(MATCH378);
                    adaptor.addChild(root_0, MATCH378_tree);

                    pushFollow(FOLLOW_id_in_fk_clause_action2792);
                    name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, name.getTree());

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
    // SqlParser.g:310:1: fk_clause_deferrable : ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )? ;
    public final SqlParser.fk_clause_deferrable_return fk_clause_deferrable() throws RecognitionException {
        SqlParser.fk_clause_deferrable_return retval = new SqlParser.fk_clause_deferrable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT379=null;
        Token DEFERRABLE380=null;
        Token INITIALLY381=null;
        Token DEFERRED382=null;
        Token INITIALLY383=null;
        Token IMMEDIATE384=null;

        Object NOT379_tree=null;
        Object DEFERRABLE380_tree=null;
        Object INITIALLY381_tree=null;
        Object DEFERRED382_tree=null;
        Object INITIALLY383_tree=null;
        Object IMMEDIATE384_tree=null;

        try {
            // SqlParser.g:310:21: ( ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )? )
            // SqlParser.g:310:23: ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:310:23: ( NOT )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==NOT) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // SqlParser.g:310:24: NOT
                    {
                    NOT379=(Token)match(input,NOT,FOLLOW_NOT_in_fk_clause_deferrable2800); 
                    NOT379_tree = (Object)adaptor.create(NOT379);
                    adaptor.addChild(root_0, NOT379_tree);


                    }
                    break;

            }

            DEFERRABLE380=(Token)match(input,DEFERRABLE,FOLLOW_DEFERRABLE_in_fk_clause_deferrable2804); 
            DEFERRABLE380_tree = (Object)adaptor.create(DEFERRABLE380);
            adaptor.addChild(root_0, DEFERRABLE380_tree);

            // SqlParser.g:310:41: ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?
            int alt141=3;
            alt141 = dfa141.predict(input);
            switch (alt141) {
                case 1 :
                    // SqlParser.g:310:42: INITIALLY DEFERRED
                    {
                    INITIALLY381=(Token)match(input,INITIALLY,FOLLOW_INITIALLY_in_fk_clause_deferrable2807); 
                    INITIALLY381_tree = (Object)adaptor.create(INITIALLY381);
                    adaptor.addChild(root_0, INITIALLY381_tree);

                    DEFERRED382=(Token)match(input,DEFERRED,FOLLOW_DEFERRED_in_fk_clause_deferrable2809); 
                    DEFERRED382_tree = (Object)adaptor.create(DEFERRED382);
                    adaptor.addChild(root_0, DEFERRED382_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:310:63: INITIALLY IMMEDIATE
                    {
                    INITIALLY383=(Token)match(input,INITIALLY,FOLLOW_INITIALLY_in_fk_clause_deferrable2813); 
                    INITIALLY383_tree = (Object)adaptor.create(INITIALLY383);
                    adaptor.addChild(root_0, INITIALLY383_tree);

                    IMMEDIATE384=(Token)match(input,IMMEDIATE,FOLLOW_IMMEDIATE_in_fk_clause_deferrable2815); 
                    IMMEDIATE384_tree = (Object)adaptor.create(IMMEDIATE384);
                    adaptor.addChild(root_0, IMMEDIATE384_tree);


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
    // SqlParser.g:313:1: drop_table_stmt : DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) ) ;
    public final SqlParser.drop_table_stmt_return drop_table_stmt() throws RecognitionException {
        SqlParser.drop_table_stmt_return retval = new SqlParser.drop_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP385=null;
        Token TABLE386=null;
        Token IF387=null;
        Token EXISTS388=null;
        Token DOT389=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;


        Object DROP385_tree=null;
        Object TABLE386_tree=null;
        Object IF387_tree=null;
        Object EXISTS388_tree=null;
        Object DOT389_tree=null;
        RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // SqlParser.g:313:16: ( DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) ) )
            // SqlParser.g:313:18: DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id
            {
            DROP385=(Token)match(input,DROP,FOLLOW_DROP_in_drop_table_stmt2825);  
            stream_DROP.add(DROP385);

            TABLE386=(Token)match(input,TABLE,FOLLOW_TABLE_in_drop_table_stmt2827);  
            stream_TABLE.add(TABLE386);

            // SqlParser.g:313:29: ( IF EXISTS )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==IF) ) {
                int LA142_1 = input.LA(2);

                if ( (LA142_1==EXISTS) ) {
                    alt142=1;
                }
            }
            switch (alt142) {
                case 1 :
                    // SqlParser.g:313:30: IF EXISTS
                    {
                    IF387=(Token)match(input,IF,FOLLOW_IF_in_drop_table_stmt2830);  
                    stream_IF.add(IF387);

                    EXISTS388=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_table_stmt2832);  
                    stream_EXISTS.add(EXISTS388);


                    }
                    break;

            }

            // SqlParser.g:313:42: (database_name= id DOT )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==ID) ) {
                int LA143_1 = input.LA(2);

                if ( (LA143_1==DOT) ) {
                    alt143=1;
                }
            }
            else if ( ((LA143_0>=ABORT && LA143_0<=WHERE)) ) {
                int LA143_2 = input.LA(2);

                if ( (LA143_2==DOT) ) {
                    alt143=1;
                }
            }
            switch (alt143) {
                case 1 :
                    // SqlParser.g:313:43: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_table_stmt2839);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT389=(Token)match(input,DOT,FOLLOW_DOT_in_drop_table_stmt2841);  
                    stream_DOT.add(DOT389);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_table_stmt2847);
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
            // 314:1: -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) )
            {
                // SqlParser.g:314:4: ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DROP_TABLE, "DROP_TABLE"), root_1);

                // SqlParser.g:314:17: ^( OPTIONS ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:314:27: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:314:36: ^( $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                // SqlParser.g:314:50: ( $database_name)?
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
    // SqlParser.g:317:1: alter_table_stmt : ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def ) ;
    public final SqlParser.alter_table_stmt_return alter_table_stmt() throws RecognitionException {
        SqlParser.alter_table_stmt_return retval = new SqlParser.alter_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ALTER390=null;
        Token TABLE391=null;
        Token DOT392=null;
        Token RENAME393=null;
        Token TO394=null;
        Token ADD395=null;
        Token COLUMN396=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.id_return new_table_name = null;

        SqlParser.column_def_return column_def397 = null;


        Object ALTER390_tree=null;
        Object TABLE391_tree=null;
        Object DOT392_tree=null;
        Object RENAME393_tree=null;
        Object TO394_tree=null;
        Object ADD395_tree=null;
        Object COLUMN396_tree=null;

        try {
            // SqlParser.g:317:17: ( ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def ) )
            // SqlParser.g:317:19: ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def )
            {
            root_0 = (Object)adaptor.nil();

            ALTER390=(Token)match(input,ALTER,FOLLOW_ALTER_in_alter_table_stmt2877); 
            ALTER390_tree = (Object)adaptor.create(ALTER390);
            adaptor.addChild(root_0, ALTER390_tree);

            TABLE391=(Token)match(input,TABLE,FOLLOW_TABLE_in_alter_table_stmt2879); 
            TABLE391_tree = (Object)adaptor.create(TABLE391);
            adaptor.addChild(root_0, TABLE391_tree);

            // SqlParser.g:317:31: (database_name= id DOT )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==ID) ) {
                int LA144_1 = input.LA(2);

                if ( (LA144_1==DOT) ) {
                    alt144=1;
                }
            }
            else if ( ((LA144_0>=ABORT && LA144_0<=WHERE)) ) {
                int LA144_2 = input.LA(2);

                if ( (LA144_2==DOT) ) {
                    alt144=1;
                }
            }
            switch (alt144) {
                case 1 :
                    // SqlParser.g:317:32: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_alter_table_stmt2884);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT392=(Token)match(input,DOT,FOLLOW_DOT_in_alter_table_stmt2886); 
                    DOT392_tree = (Object)adaptor.create(DOT392);
                    adaptor.addChild(root_0, DOT392_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_alter_table_stmt2892);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:317:69: ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def )
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==RENAME) ) {
                alt146=1;
            }
            else if ( (LA146_0==ADD) ) {
                alt146=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 146, 0, input);

                throw nvae;
            }
            switch (alt146) {
                case 1 :
                    // SqlParser.g:317:70: RENAME TO new_table_name= id
                    {
                    RENAME393=(Token)match(input,RENAME,FOLLOW_RENAME_in_alter_table_stmt2895); 
                    RENAME393_tree = (Object)adaptor.create(RENAME393);
                    adaptor.addChild(root_0, RENAME393_tree);

                    TO394=(Token)match(input,TO,FOLLOW_TO_in_alter_table_stmt2897); 
                    TO394_tree = (Object)adaptor.create(TO394);
                    adaptor.addChild(root_0, TO394_tree);

                    pushFollow(FOLLOW_id_in_alter_table_stmt2901);
                    new_table_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, new_table_name.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:317:100: ADD ( COLUMN )? column_def
                    {
                    ADD395=(Token)match(input,ADD,FOLLOW_ADD_in_alter_table_stmt2905); 
                    ADD395_tree = (Object)adaptor.create(ADD395);
                    adaptor.addChild(root_0, ADD395_tree);

                    // SqlParser.g:317:104: ( COLUMN )?
                    int alt145=2;
                    int LA145_0 = input.LA(1);

                    if ( (LA145_0==COLUMN) ) {
                        alt145=1;
                    }
                    switch (alt145) {
                        case 1 :
                            // SqlParser.g:317:105: COLUMN
                            {
                            COLUMN396=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_alter_table_stmt2908); 
                            COLUMN396_tree = (Object)adaptor.create(COLUMN396);
                            adaptor.addChild(root_0, COLUMN396_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_column_def_in_alter_table_stmt2912);
                    column_def397=column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, column_def397.getTree());

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
    // SqlParser.g:320:1: create_view_stmt : CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS select_stmt ;
    public final SqlParser.create_view_stmt_return create_view_stmt() throws RecognitionException {
        SqlParser.create_view_stmt_return retval = new SqlParser.create_view_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE398=null;
        Token TEMPORARY399=null;
        Token VIEW400=null;
        Token IF401=null;
        Token NOT402=null;
        Token EXISTS403=null;
        Token DOT404=null;
        Token AS405=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return view_name = null;

        SqlParser.select_stmt_return select_stmt406 = null;


        Object CREATE398_tree=null;
        Object TEMPORARY399_tree=null;
        Object VIEW400_tree=null;
        Object IF401_tree=null;
        Object NOT402_tree=null;
        Object EXISTS403_tree=null;
        Object DOT404_tree=null;
        Object AS405_tree=null;

        try {
            // SqlParser.g:320:17: ( CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS select_stmt )
            // SqlParser.g:320:19: CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS select_stmt
            {
            root_0 = (Object)adaptor.nil();

            CREATE398=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_view_stmt2921); 
            CREATE398_tree = (Object)adaptor.create(CREATE398);
            adaptor.addChild(root_0, CREATE398_tree);

            // SqlParser.g:320:26: ( TEMPORARY )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==TEMPORARY) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // SqlParser.g:320:26: TEMPORARY
                    {
                    TEMPORARY399=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_view_stmt2923); 
                    TEMPORARY399_tree = (Object)adaptor.create(TEMPORARY399);
                    adaptor.addChild(root_0, TEMPORARY399_tree);


                    }
                    break;

            }

            VIEW400=(Token)match(input,VIEW,FOLLOW_VIEW_in_create_view_stmt2926); 
            VIEW400_tree = (Object)adaptor.create(VIEW400);
            adaptor.addChild(root_0, VIEW400_tree);

            // SqlParser.g:320:42: ( IF NOT EXISTS )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==IF) ) {
                int LA148_1 = input.LA(2);

                if ( (LA148_1==NOT) ) {
                    alt148=1;
                }
            }
            switch (alt148) {
                case 1 :
                    // SqlParser.g:320:43: IF NOT EXISTS
                    {
                    IF401=(Token)match(input,IF,FOLLOW_IF_in_create_view_stmt2929); 
                    IF401_tree = (Object)adaptor.create(IF401);
                    adaptor.addChild(root_0, IF401_tree);

                    NOT402=(Token)match(input,NOT,FOLLOW_NOT_in_create_view_stmt2931); 
                    NOT402_tree = (Object)adaptor.create(NOT402);
                    adaptor.addChild(root_0, NOT402_tree);

                    EXISTS403=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_view_stmt2933); 
                    EXISTS403_tree = (Object)adaptor.create(EXISTS403);
                    adaptor.addChild(root_0, EXISTS403_tree);


                    }
                    break;

            }

            // SqlParser.g:320:59: (database_name= id DOT )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==ID) ) {
                int LA149_1 = input.LA(2);

                if ( (LA149_1==DOT) ) {
                    alt149=1;
                }
            }
            else if ( ((LA149_0>=ABORT && LA149_0<=WHERE)) ) {
                int LA149_2 = input.LA(2);

                if ( (LA149_2==DOT) ) {
                    alt149=1;
                }
            }
            switch (alt149) {
                case 1 :
                    // SqlParser.g:320:60: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_view_stmt2940);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT404=(Token)match(input,DOT,FOLLOW_DOT_in_create_view_stmt2942); 
                    DOT404_tree = (Object)adaptor.create(DOT404);
                    adaptor.addChild(root_0, DOT404_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_view_stmt2948);
            view_name=id();

            state._fsp--;

            adaptor.addChild(root_0, view_name.getTree());
            AS405=(Token)match(input,AS,FOLLOW_AS_in_create_view_stmt2950); 
            AS405_tree = (Object)adaptor.create(AS405);
            adaptor.addChild(root_0, AS405_tree);

            pushFollow(FOLLOW_select_stmt_in_create_view_stmt2952);
            select_stmt406=select_stmt();

            state._fsp--;

            adaptor.addChild(root_0, select_stmt406.getTree());

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
    // SqlParser.g:323:1: drop_view_stmt : DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id ;
    public final SqlParser.drop_view_stmt_return drop_view_stmt() throws RecognitionException {
        SqlParser.drop_view_stmt_return retval = new SqlParser.drop_view_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP407=null;
        Token VIEW408=null;
        Token IF409=null;
        Token EXISTS410=null;
        Token DOT411=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return view_name = null;


        Object DROP407_tree=null;
        Object VIEW408_tree=null;
        Object IF409_tree=null;
        Object EXISTS410_tree=null;
        Object DOT411_tree=null;

        try {
            // SqlParser.g:323:15: ( DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id )
            // SqlParser.g:323:17: DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id
            {
            root_0 = (Object)adaptor.nil();

            DROP407=(Token)match(input,DROP,FOLLOW_DROP_in_drop_view_stmt2960); 
            DROP407_tree = (Object)adaptor.create(DROP407);
            adaptor.addChild(root_0, DROP407_tree);

            VIEW408=(Token)match(input,VIEW,FOLLOW_VIEW_in_drop_view_stmt2962); 
            VIEW408_tree = (Object)adaptor.create(VIEW408);
            adaptor.addChild(root_0, VIEW408_tree);

            // SqlParser.g:323:27: ( IF EXISTS )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==IF) ) {
                int LA150_1 = input.LA(2);

                if ( (LA150_1==EXISTS) ) {
                    alt150=1;
                }
            }
            switch (alt150) {
                case 1 :
                    // SqlParser.g:323:28: IF EXISTS
                    {
                    IF409=(Token)match(input,IF,FOLLOW_IF_in_drop_view_stmt2965); 
                    IF409_tree = (Object)adaptor.create(IF409);
                    adaptor.addChild(root_0, IF409_tree);

                    EXISTS410=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_view_stmt2967); 
                    EXISTS410_tree = (Object)adaptor.create(EXISTS410);
                    adaptor.addChild(root_0, EXISTS410_tree);


                    }
                    break;

            }

            // SqlParser.g:323:40: (database_name= id DOT )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==ID) ) {
                int LA151_1 = input.LA(2);

                if ( (LA151_1==DOT) ) {
                    alt151=1;
                }
            }
            else if ( ((LA151_0>=ABORT && LA151_0<=WHERE)) ) {
                int LA151_2 = input.LA(2);

                if ( (LA151_2==DOT) ) {
                    alt151=1;
                }
            }
            switch (alt151) {
                case 1 :
                    // SqlParser.g:323:41: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_view_stmt2974);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT411=(Token)match(input,DOT,FOLLOW_DOT_in_drop_view_stmt2976); 
                    DOT411_tree = (Object)adaptor.create(DOT411);
                    adaptor.addChild(root_0, DOT411_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_view_stmt2982);
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
    // SqlParser.g:326:1: create_index_stmt : CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN ;
    public final SqlParser.create_index_stmt_return create_index_stmt() throws RecognitionException {
        SqlParser.create_index_stmt_return retval = new SqlParser.create_index_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE412=null;
        Token UNIQUE413=null;
        Token INDEX414=null;
        Token IF415=null;
        Token NOT416=null;
        Token EXISTS417=null;
        Token DOT418=null;
        Token ON419=null;
        Token LPAREN420=null;
        Token COMMA421=null;
        Token RPAREN422=null;
        List list_columns=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return index_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.indexed_column_return columns = null;
         columns = null;
        Object CREATE412_tree=null;
        Object UNIQUE413_tree=null;
        Object INDEX414_tree=null;
        Object IF415_tree=null;
        Object NOT416_tree=null;
        Object EXISTS417_tree=null;
        Object DOT418_tree=null;
        Object ON419_tree=null;
        Object LPAREN420_tree=null;
        Object COMMA421_tree=null;
        Object RPAREN422_tree=null;

        try {
            // SqlParser.g:326:18: ( CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN )
            // SqlParser.g:326:20: CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN
            {
            root_0 = (Object)adaptor.nil();

            CREATE412=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_index_stmt2990); 
            CREATE412_tree = (Object)adaptor.create(CREATE412);
            adaptor.addChild(root_0, CREATE412_tree);

            // SqlParser.g:326:27: ( UNIQUE )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==UNIQUE) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // SqlParser.g:326:28: UNIQUE
                    {
                    UNIQUE413=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_create_index_stmt2993); 
                    UNIQUE413_tree = (Object)adaptor.create(UNIQUE413);
                    adaptor.addChild(root_0, UNIQUE413_tree);


                    }
                    break;

            }

            INDEX414=(Token)match(input,INDEX,FOLLOW_INDEX_in_create_index_stmt2997); 
            INDEX414_tree = (Object)adaptor.create(INDEX414);
            adaptor.addChild(root_0, INDEX414_tree);

            // SqlParser.g:326:43: ( IF NOT EXISTS )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==IF) ) {
                int LA153_1 = input.LA(2);

                if ( (LA153_1==NOT) ) {
                    alt153=1;
                }
            }
            switch (alt153) {
                case 1 :
                    // SqlParser.g:326:44: IF NOT EXISTS
                    {
                    IF415=(Token)match(input,IF,FOLLOW_IF_in_create_index_stmt3000); 
                    IF415_tree = (Object)adaptor.create(IF415);
                    adaptor.addChild(root_0, IF415_tree);

                    NOT416=(Token)match(input,NOT,FOLLOW_NOT_in_create_index_stmt3002); 
                    NOT416_tree = (Object)adaptor.create(NOT416);
                    adaptor.addChild(root_0, NOT416_tree);

                    EXISTS417=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_index_stmt3004); 
                    EXISTS417_tree = (Object)adaptor.create(EXISTS417);
                    adaptor.addChild(root_0, EXISTS417_tree);


                    }
                    break;

            }

            // SqlParser.g:326:60: (database_name= id DOT )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==ID) ) {
                int LA154_1 = input.LA(2);

                if ( (LA154_1==DOT) ) {
                    alt154=1;
                }
            }
            else if ( ((LA154_0>=ABORT && LA154_0<=WHERE)) ) {
                int LA154_2 = input.LA(2);

                if ( (LA154_2==DOT) ) {
                    alt154=1;
                }
            }
            switch (alt154) {
                case 1 :
                    // SqlParser.g:326:61: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_index_stmt3011);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT418=(Token)match(input,DOT,FOLLOW_DOT_in_create_index_stmt3013); 
                    DOT418_tree = (Object)adaptor.create(DOT418);
                    adaptor.addChild(root_0, DOT418_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_index_stmt3019);
            index_name=id();

            state._fsp--;

            adaptor.addChild(root_0, index_name.getTree());
            ON419=(Token)match(input,ON,FOLLOW_ON_in_create_index_stmt3023); 
            ON419_tree = (Object)adaptor.create(ON419);
            adaptor.addChild(root_0, ON419_tree);

            pushFollow(FOLLOW_id_in_create_index_stmt3027);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            LPAREN420=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_index_stmt3029); 
            LPAREN420_tree = (Object)adaptor.create(LPAREN420);
            adaptor.addChild(root_0, LPAREN420_tree);

            pushFollow(FOLLOW_indexed_column_in_create_index_stmt3033);
            columns=indexed_column();

            state._fsp--;

            adaptor.addChild(root_0, columns.getTree());
            if (list_columns==null) list_columns=new ArrayList();
            list_columns.add(columns.getTree());

            // SqlParser.g:327:51: ( COMMA columns+= indexed_column )*
            loop155:
            do {
                int alt155=2;
                int LA155_0 = input.LA(1);

                if ( (LA155_0==COMMA) ) {
                    alt155=1;
                }


                switch (alt155) {
            	case 1 :
            	    // SqlParser.g:327:52: COMMA columns+= indexed_column
            	    {
            	    COMMA421=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_index_stmt3036); 
            	    COMMA421_tree = (Object)adaptor.create(COMMA421);
            	    adaptor.addChild(root_0, COMMA421_tree);

            	    pushFollow(FOLLOW_indexed_column_in_create_index_stmt3040);
            	    columns=indexed_column();

            	    state._fsp--;

            	    adaptor.addChild(root_0, columns.getTree());
            	    if (list_columns==null) list_columns=new ArrayList();
            	    list_columns.add(columns.getTree());


            	    }
            	    break;

            	default :
            	    break loop155;
                }
            } while (true);

            RPAREN422=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_index_stmt3044); 
            RPAREN422_tree = (Object)adaptor.create(RPAREN422);
            adaptor.addChild(root_0, RPAREN422_tree);


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
    // SqlParser.g:329:1: indexed_column : column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )? ;
    public final SqlParser.indexed_column_return indexed_column() throws RecognitionException {
        SqlParser.indexed_column_return retval = new SqlParser.indexed_column_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLLATE423=null;
        Token set424=null;
        SqlParser.id_return column_name = null;

        SqlParser.id_return collation_name = null;


        Object COLLATE423_tree=null;
        Object set424_tree=null;

        try {
            // SqlParser.g:329:15: (column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )? )
            // SqlParser.g:329:17: column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_indexed_column3053);
            column_name=id();

            state._fsp--;

            adaptor.addChild(root_0, column_name.getTree());
            // SqlParser.g:329:32: ( COLLATE collation_name= id )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==COLLATE) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // SqlParser.g:329:33: COLLATE collation_name= id
                    {
                    COLLATE423=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_indexed_column3056); 
                    COLLATE423_tree = (Object)adaptor.create(COLLATE423);
                    adaptor.addChild(root_0, COLLATE423_tree);

                    pushFollow(FOLLOW_id_in_indexed_column3060);
                    collation_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, collation_name.getTree());

                    }
                    break;

            }

            // SqlParser.g:329:61: ( ASC | DESC )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==ASC||LA157_0==DESC) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // SqlParser.g:
                    {
                    set424=(Token)input.LT(1);
                    if ( input.LA(1)==ASC||input.LA(1)==DESC ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set424));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


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
    // $ANTLR end "indexed_column"

    public static class drop_index_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "drop_index_stmt"
    // SqlParser.g:332:1: drop_index_stmt : DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id ;
    public final SqlParser.drop_index_stmt_return drop_index_stmt() throws RecognitionException {
        SqlParser.drop_index_stmt_return retval = new SqlParser.drop_index_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP425=null;
        Token INDEX426=null;
        Token IF427=null;
        Token EXISTS428=null;
        Token DOT429=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return index_name = null;


        Object DROP425_tree=null;
        Object INDEX426_tree=null;
        Object IF427_tree=null;
        Object EXISTS428_tree=null;
        Object DOT429_tree=null;

        try {
            // SqlParser.g:332:16: ( DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id )
            // SqlParser.g:332:18: DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id
            {
            root_0 = (Object)adaptor.nil();

            DROP425=(Token)match(input,DROP,FOLLOW_DROP_in_drop_index_stmt3079); 
            DROP425_tree = (Object)adaptor.create(DROP425);
            adaptor.addChild(root_0, DROP425_tree);

            INDEX426=(Token)match(input,INDEX,FOLLOW_INDEX_in_drop_index_stmt3081); 
            INDEX426_tree = (Object)adaptor.create(INDEX426);
            adaptor.addChild(root_0, INDEX426_tree);

            // SqlParser.g:332:29: ( IF EXISTS )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==IF) ) {
                int LA158_1 = input.LA(2);

                if ( (LA158_1==EXISTS) ) {
                    alt158=1;
                }
            }
            switch (alt158) {
                case 1 :
                    // SqlParser.g:332:30: IF EXISTS
                    {
                    IF427=(Token)match(input,IF,FOLLOW_IF_in_drop_index_stmt3084); 
                    IF427_tree = (Object)adaptor.create(IF427);
                    adaptor.addChild(root_0, IF427_tree);

                    EXISTS428=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_index_stmt3086); 
                    EXISTS428_tree = (Object)adaptor.create(EXISTS428);
                    adaptor.addChild(root_0, EXISTS428_tree);


                    }
                    break;

            }

            // SqlParser.g:332:42: (database_name= id DOT )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==ID) ) {
                int LA159_1 = input.LA(2);

                if ( (LA159_1==DOT) ) {
                    alt159=1;
                }
            }
            else if ( ((LA159_0>=ABORT && LA159_0<=WHERE)) ) {
                int LA159_2 = input.LA(2);

                if ( (LA159_2==DOT) ) {
                    alt159=1;
                }
            }
            switch (alt159) {
                case 1 :
                    // SqlParser.g:332:43: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_index_stmt3093);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT429=(Token)match(input,DOT,FOLLOW_DOT_in_drop_index_stmt3095); 
                    DOT429_tree = (Object)adaptor.create(DOT429);
                    adaptor.addChild(root_0, DOT429_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_index_stmt3101);
            index_name=id();

            state._fsp--;

            adaptor.addChild(root_0, index_name.getTree());

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
    // SqlParser.g:335:1: create_trigger_stmt : CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END ;
    public final SqlParser.create_trigger_stmt_return create_trigger_stmt() throws RecognitionException {
        SqlParser.create_trigger_stmt_return retval = new SqlParser.create_trigger_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE430=null;
        Token TEMPORARY431=null;
        Token TRIGGER432=null;
        Token IF433=null;
        Token NOT434=null;
        Token EXISTS435=null;
        Token DOT436=null;
        Token BEFORE437=null;
        Token AFTER438=null;
        Token INSTEAD439=null;
        Token OF440=null;
        Token DELETE441=null;
        Token INSERT442=null;
        Token UPDATE443=null;
        Token OF444=null;
        Token COMMA445=null;
        Token ON446=null;
        Token FOR447=null;
        Token EACH448=null;
        Token ROW449=null;
        Token WHEN450=null;
        Token BEGIN452=null;
        Token SEMI457=null;
        Token END458=null;
        List list_column_names=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return trigger_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.expr_return expr451 = null;

        SqlParser.update_stmt_return update_stmt453 = null;

        SqlParser.insert_stmt_return insert_stmt454 = null;

        SqlParser.delete_stmt_return delete_stmt455 = null;

        SqlParser.select_stmt_return select_stmt456 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object CREATE430_tree=null;
        Object TEMPORARY431_tree=null;
        Object TRIGGER432_tree=null;
        Object IF433_tree=null;
        Object NOT434_tree=null;
        Object EXISTS435_tree=null;
        Object DOT436_tree=null;
        Object BEFORE437_tree=null;
        Object AFTER438_tree=null;
        Object INSTEAD439_tree=null;
        Object OF440_tree=null;
        Object DELETE441_tree=null;
        Object INSERT442_tree=null;
        Object UPDATE443_tree=null;
        Object OF444_tree=null;
        Object COMMA445_tree=null;
        Object ON446_tree=null;
        Object FOR447_tree=null;
        Object EACH448_tree=null;
        Object ROW449_tree=null;
        Object WHEN450_tree=null;
        Object BEGIN452_tree=null;
        Object SEMI457_tree=null;
        Object END458_tree=null;

        try {
            // SqlParser.g:335:20: ( CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END )
            // SqlParser.g:335:22: CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END
            {
            root_0 = (Object)adaptor.nil();

            CREATE430=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_trigger_stmt3109); 
            CREATE430_tree = (Object)adaptor.create(CREATE430);
            adaptor.addChild(root_0, CREATE430_tree);

            // SqlParser.g:335:29: ( TEMPORARY )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==TEMPORARY) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // SqlParser.g:335:29: TEMPORARY
                    {
                    TEMPORARY431=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_trigger_stmt3111); 
                    TEMPORARY431_tree = (Object)adaptor.create(TEMPORARY431);
                    adaptor.addChild(root_0, TEMPORARY431_tree);


                    }
                    break;

            }

            TRIGGER432=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_create_trigger_stmt3114); 
            TRIGGER432_tree = (Object)adaptor.create(TRIGGER432);
            adaptor.addChild(root_0, TRIGGER432_tree);

            // SqlParser.g:335:48: ( IF NOT EXISTS )?
            int alt161=2;
            alt161 = dfa161.predict(input);
            switch (alt161) {
                case 1 :
                    // SqlParser.g:335:49: IF NOT EXISTS
                    {
                    IF433=(Token)match(input,IF,FOLLOW_IF_in_create_trigger_stmt3117); 
                    IF433_tree = (Object)adaptor.create(IF433);
                    adaptor.addChild(root_0, IF433_tree);

                    NOT434=(Token)match(input,NOT,FOLLOW_NOT_in_create_trigger_stmt3119); 
                    NOT434_tree = (Object)adaptor.create(NOT434);
                    adaptor.addChild(root_0, NOT434_tree);

                    EXISTS435=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_trigger_stmt3121); 
                    EXISTS435_tree = (Object)adaptor.create(EXISTS435);
                    adaptor.addChild(root_0, EXISTS435_tree);


                    }
                    break;

            }

            // SqlParser.g:335:65: (database_name= id DOT )?
            int alt162=2;
            alt162 = dfa162.predict(input);
            switch (alt162) {
                case 1 :
                    // SqlParser.g:335:66: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_trigger_stmt3128);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT436=(Token)match(input,DOT,FOLLOW_DOT_in_create_trigger_stmt3130); 
                    DOT436_tree = (Object)adaptor.create(DOT436);
                    adaptor.addChild(root_0, DOT436_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_trigger_stmt3136);
            trigger_name=id();

            state._fsp--;

            adaptor.addChild(root_0, trigger_name.getTree());
            // SqlParser.g:336:3: ( BEFORE | AFTER | INSTEAD OF )?
            int alt163=4;
            switch ( input.LA(1) ) {
                case BEFORE:
                    {
                    alt163=1;
                    }
                    break;
                case AFTER:
                    {
                    alt163=2;
                    }
                    break;
                case INSTEAD:
                    {
                    alt163=3;
                    }
                    break;
            }

            switch (alt163) {
                case 1 :
                    // SqlParser.g:336:4: BEFORE
                    {
                    BEFORE437=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_create_trigger_stmt3141); 
                    BEFORE437_tree = (Object)adaptor.create(BEFORE437);
                    adaptor.addChild(root_0, BEFORE437_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:336:13: AFTER
                    {
                    AFTER438=(Token)match(input,AFTER,FOLLOW_AFTER_in_create_trigger_stmt3145); 
                    AFTER438_tree = (Object)adaptor.create(AFTER438);
                    adaptor.addChild(root_0, AFTER438_tree);


                    }
                    break;
                case 3 :
                    // SqlParser.g:336:21: INSTEAD OF
                    {
                    INSTEAD439=(Token)match(input,INSTEAD,FOLLOW_INSTEAD_in_create_trigger_stmt3149); 
                    INSTEAD439_tree = (Object)adaptor.create(INSTEAD439);
                    adaptor.addChild(root_0, INSTEAD439_tree);

                    OF440=(Token)match(input,OF,FOLLOW_OF_in_create_trigger_stmt3151); 
                    OF440_tree = (Object)adaptor.create(OF440);
                    adaptor.addChild(root_0, OF440_tree);


                    }
                    break;

            }

            // SqlParser.g:336:34: ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? )
            int alt166=3;
            switch ( input.LA(1) ) {
            case DELETE:
                {
                alt166=1;
                }
                break;
            case INSERT:
                {
                alt166=2;
                }
                break;
            case UPDATE:
                {
                alt166=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 166, 0, input);

                throw nvae;
            }

            switch (alt166) {
                case 1 :
                    // SqlParser.g:336:35: DELETE
                    {
                    DELETE441=(Token)match(input,DELETE,FOLLOW_DELETE_in_create_trigger_stmt3156); 
                    DELETE441_tree = (Object)adaptor.create(DELETE441);
                    adaptor.addChild(root_0, DELETE441_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:336:44: INSERT
                    {
                    INSERT442=(Token)match(input,INSERT,FOLLOW_INSERT_in_create_trigger_stmt3160); 
                    INSERT442_tree = (Object)adaptor.create(INSERT442);
                    adaptor.addChild(root_0, INSERT442_tree);


                    }
                    break;
                case 3 :
                    // SqlParser.g:336:53: UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )?
                    {
                    UPDATE443=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_create_trigger_stmt3164); 
                    UPDATE443_tree = (Object)adaptor.create(UPDATE443);
                    adaptor.addChild(root_0, UPDATE443_tree);

                    // SqlParser.g:336:60: ( OF column_names+= id ( COMMA column_names+= id )* )?
                    int alt165=2;
                    int LA165_0 = input.LA(1);

                    if ( (LA165_0==OF) ) {
                        alt165=1;
                    }
                    switch (alt165) {
                        case 1 :
                            // SqlParser.g:336:61: OF column_names+= id ( COMMA column_names+= id )*
                            {
                            OF444=(Token)match(input,OF,FOLLOW_OF_in_create_trigger_stmt3167); 
                            OF444_tree = (Object)adaptor.create(OF444);
                            adaptor.addChild(root_0, OF444_tree);

                            pushFollow(FOLLOW_id_in_create_trigger_stmt3171);
                            column_names=id();

                            state._fsp--;

                            adaptor.addChild(root_0, column_names.getTree());
                            if (list_column_names==null) list_column_names=new ArrayList();
                            list_column_names.add(column_names.getTree());

                            // SqlParser.g:336:81: ( COMMA column_names+= id )*
                            loop164:
                            do {
                                int alt164=2;
                                int LA164_0 = input.LA(1);

                                if ( (LA164_0==COMMA) ) {
                                    alt164=1;
                                }


                                switch (alt164) {
                            	case 1 :
                            	    // SqlParser.g:336:82: COMMA column_names+= id
                            	    {
                            	    COMMA445=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_trigger_stmt3174); 
                            	    COMMA445_tree = (Object)adaptor.create(COMMA445);
                            	    adaptor.addChild(root_0, COMMA445_tree);

                            	    pushFollow(FOLLOW_id_in_create_trigger_stmt3178);
                            	    column_names=id();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, column_names.getTree());
                            	    if (list_column_names==null) list_column_names=new ArrayList();
                            	    list_column_names.add(column_names.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop164;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            ON446=(Token)match(input,ON,FOLLOW_ON_in_create_trigger_stmt3187); 
            ON446_tree = (Object)adaptor.create(ON446);
            adaptor.addChild(root_0, ON446_tree);

            pushFollow(FOLLOW_id_in_create_trigger_stmt3191);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:337:20: ( FOR EACH ROW )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==FOR) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // SqlParser.g:337:21: FOR EACH ROW
                    {
                    FOR447=(Token)match(input,FOR,FOLLOW_FOR_in_create_trigger_stmt3194); 
                    FOR447_tree = (Object)adaptor.create(FOR447);
                    adaptor.addChild(root_0, FOR447_tree);

                    EACH448=(Token)match(input,EACH,FOLLOW_EACH_in_create_trigger_stmt3196); 
                    EACH448_tree = (Object)adaptor.create(EACH448);
                    adaptor.addChild(root_0, EACH448_tree);

                    ROW449=(Token)match(input,ROW,FOLLOW_ROW_in_create_trigger_stmt3198); 
                    ROW449_tree = (Object)adaptor.create(ROW449);
                    adaptor.addChild(root_0, ROW449_tree);


                    }
                    break;

            }

            // SqlParser.g:337:36: ( WHEN expr )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==WHEN) ) {
                alt168=1;
            }
            switch (alt168) {
                case 1 :
                    // SqlParser.g:337:37: WHEN expr
                    {
                    WHEN450=(Token)match(input,WHEN,FOLLOW_WHEN_in_create_trigger_stmt3203); 
                    WHEN450_tree = (Object)adaptor.create(WHEN450);
                    adaptor.addChild(root_0, WHEN450_tree);

                    pushFollow(FOLLOW_expr_in_create_trigger_stmt3205);
                    expr451=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr451.getTree());

                    }
                    break;

            }

            BEGIN452=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_create_trigger_stmt3211); 
            BEGIN452_tree = (Object)adaptor.create(BEGIN452);
            adaptor.addChild(root_0, BEGIN452_tree);

            // SqlParser.g:338:9: ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+
            int cnt170=0;
            loop170:
            do {
                int alt170=2;
                int LA170_0 = input.LA(1);

                if ( (LA170_0==DELETE||LA170_0==INSERT||LA170_0==REPLACE||LA170_0==SELECT||LA170_0==UPDATE) ) {
                    alt170=1;
                }


                switch (alt170) {
            	case 1 :
            	    // SqlParser.g:338:10: ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI
            	    {
            	    // SqlParser.g:338:10: ( update_stmt | insert_stmt | delete_stmt | select_stmt )
            	    int alt169=4;
            	    switch ( input.LA(1) ) {
            	    case UPDATE:
            	        {
            	        alt169=1;
            	        }
            	        break;
            	    case INSERT:
            	    case REPLACE:
            	        {
            	        alt169=2;
            	        }
            	        break;
            	    case DELETE:
            	        {
            	        alt169=3;
            	        }
            	        break;
            	    case SELECT:
            	        {
            	        alt169=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 169, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt169) {
            	        case 1 :
            	            // SqlParser.g:338:11: update_stmt
            	            {
            	            pushFollow(FOLLOW_update_stmt_in_create_trigger_stmt3215);
            	            update_stmt453=update_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, update_stmt453.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // SqlParser.g:338:25: insert_stmt
            	            {
            	            pushFollow(FOLLOW_insert_stmt_in_create_trigger_stmt3219);
            	            insert_stmt454=insert_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, insert_stmt454.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // SqlParser.g:338:39: delete_stmt
            	            {
            	            pushFollow(FOLLOW_delete_stmt_in_create_trigger_stmt3223);
            	            delete_stmt455=delete_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, delete_stmt455.getTree());

            	            }
            	            break;
            	        case 4 :
            	            // SqlParser.g:338:53: select_stmt
            	            {
            	            pushFollow(FOLLOW_select_stmt_in_create_trigger_stmt3227);
            	            select_stmt456=select_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, select_stmt456.getTree());

            	            }
            	            break;

            	    }

            	    SEMI457=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_trigger_stmt3230); 
            	    SEMI457_tree = (Object)adaptor.create(SEMI457);
            	    adaptor.addChild(root_0, SEMI457_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt170 >= 1 ) break loop170;
                        EarlyExitException eee =
                            new EarlyExitException(170, input);
                        throw eee;
                }
                cnt170++;
            } while (true);

            END458=(Token)match(input,END,FOLLOW_END_in_create_trigger_stmt3234); 
            END458_tree = (Object)adaptor.create(END458);
            adaptor.addChild(root_0, END458_tree);


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
    // SqlParser.g:341:1: drop_trigger_stmt : DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id ;
    public final SqlParser.drop_trigger_stmt_return drop_trigger_stmt() throws RecognitionException {
        SqlParser.drop_trigger_stmt_return retval = new SqlParser.drop_trigger_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP459=null;
        Token TRIGGER460=null;
        Token IF461=null;
        Token EXISTS462=null;
        Token DOT463=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return trigger_name = null;


        Object DROP459_tree=null;
        Object TRIGGER460_tree=null;
        Object IF461_tree=null;
        Object EXISTS462_tree=null;
        Object DOT463_tree=null;

        try {
            // SqlParser.g:341:18: ( DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id )
            // SqlParser.g:341:20: DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id
            {
            root_0 = (Object)adaptor.nil();

            DROP459=(Token)match(input,DROP,FOLLOW_DROP_in_drop_trigger_stmt3242); 
            DROP459_tree = (Object)adaptor.create(DROP459);
            adaptor.addChild(root_0, DROP459_tree);

            TRIGGER460=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_drop_trigger_stmt3244); 
            TRIGGER460_tree = (Object)adaptor.create(TRIGGER460);
            adaptor.addChild(root_0, TRIGGER460_tree);

            // SqlParser.g:341:33: ( IF EXISTS )?
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==IF) ) {
                int LA171_1 = input.LA(2);

                if ( (LA171_1==EXISTS) ) {
                    alt171=1;
                }
            }
            switch (alt171) {
                case 1 :
                    // SqlParser.g:341:34: IF EXISTS
                    {
                    IF461=(Token)match(input,IF,FOLLOW_IF_in_drop_trigger_stmt3247); 
                    IF461_tree = (Object)adaptor.create(IF461);
                    adaptor.addChild(root_0, IF461_tree);

                    EXISTS462=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_trigger_stmt3249); 
                    EXISTS462_tree = (Object)adaptor.create(EXISTS462);
                    adaptor.addChild(root_0, EXISTS462_tree);


                    }
                    break;

            }

            // SqlParser.g:341:46: (database_name= id DOT )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==ID) ) {
                int LA172_1 = input.LA(2);

                if ( (LA172_1==DOT) ) {
                    alt172=1;
                }
            }
            else if ( ((LA172_0>=ABORT && LA172_0<=WHERE)) ) {
                int LA172_2 = input.LA(2);

                if ( (LA172_2==DOT) ) {
                    alt172=1;
                }
            }
            switch (alt172) {
                case 1 :
                    // SqlParser.g:341:47: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_trigger_stmt3256);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT463=(Token)match(input,DOT,FOLLOW_DOT_in_drop_trigger_stmt3258); 
                    DOT463_tree = (Object)adaptor.create(DOT463);
                    adaptor.addChild(root_0, DOT463_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_trigger_stmt3264);
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
    // SqlParser.g:346:1: id : ( ID | keyword );
    public final SqlParser.id_return id() throws RecognitionException {
        SqlParser.id_return retval = new SqlParser.id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID464=null;
        SqlParser.keyword_return keyword465 = null;


        Object ID464_tree=null;

        try {
            // SqlParser.g:346:3: ( ID | keyword )
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==ID) ) {
                alt173=1;
            }
            else if ( ((LA173_0>=ABORT && LA173_0<=WHERE)) ) {
                alt173=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 173, 0, input);

                throw nvae;
            }
            switch (alt173) {
                case 1 :
                    // SqlParser.g:346:5: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID464=(Token)match(input,ID,FOLLOW_ID_in_id3274); 
                    ID464_tree = (Object)adaptor.create(ID464);
                    adaptor.addChild(root_0, ID464_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:346:10: keyword
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_id3278);
                    keyword465=keyword();

                    state._fsp--;

                    adaptor.addChild(root_0, keyword465.getTree());

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
    // SqlParser.g:348:1: keyword : ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) ;
    public final SqlParser.keyword_return keyword() throws RecognitionException {
        SqlParser.keyword_return retval = new SqlParser.keyword_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set466=null;

        Object set466_tree=null;

        try {
            // SqlParser.g:348:8: ( ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) )
            // SqlParser.g:348:10: ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE )
            {
            root_0 = (Object)adaptor.nil();

            set466=(Token)input.LT(1);
            if ( (input.LA(1)>=ABORT && input.LA(1)<=WHERE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set466));
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
    // SqlParser.g:467:1: id_column_def : ( ID | keyword_column_def );
    public final SqlParser.id_column_def_return id_column_def() throws RecognitionException {
        SqlParser.id_column_def_return retval = new SqlParser.id_column_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID467=null;
        SqlParser.keyword_column_def_return keyword_column_def468 = null;


        Object ID467_tree=null;

        try {
            // SqlParser.g:467:14: ( ID | keyword_column_def )
            int alt174=2;
            int LA174_0 = input.LA(1);

            if ( (LA174_0==ID) ) {
                alt174=1;
            }
            else if ( ((LA174_0>=ABORT && LA174_0<=COLLATE)||(LA174_0>=COMMIT && LA174_0<=CONFLICT)||(LA174_0>=CREATE && LA174_0<=WHERE)) ) {
                alt174=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 174, 0, input);

                throw nvae;
            }
            switch (alt174) {
                case 1 :
                    // SqlParser.g:467:16: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID467=(Token)match(input,ID,FOLLOW_ID_in_id_column_def3992); 
                    ID467_tree = (Object)adaptor.create(ID467);
                    adaptor.addChild(root_0, ID467_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:467:21: keyword_column_def
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_keyword_column_def_in_id_column_def3996);
                    keyword_column_def468=keyword_column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, keyword_column_def468.getTree());

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
    // SqlParser.g:469:1: keyword_column_def : ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) ;
    public final SqlParser.keyword_column_def_return keyword_column_def() throws RecognitionException {
        SqlParser.keyword_column_def_return retval = new SqlParser.keyword_column_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set469=null;

        Object set469_tree=null;

        try {
            // SqlParser.g:469:19: ( ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) )
            // SqlParser.g:469:21: ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE )
            {
            root_0 = (Object)adaptor.nil();

            set469=(Token)input.LT(1);
            if ( (input.LA(1)>=ABORT && input.LA(1)<=COLLATE)||(input.LA(1)>=COMMIT && input.LA(1)<=CONFLICT)||(input.LA(1)>=CREATE && input.LA(1)<=WHERE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set469));
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


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA90 dfa90 = new DFA90(this);
    protected DFA115 dfa115 = new DFA115(this);
    protected DFA118 dfa118 = new DFA118(this);
    protected DFA119 dfa119 = new DFA119(this);
    protected DFA122 dfa122 = new DFA122(this);
    protected DFA123 dfa123 = new DFA123(this);
    protected DFA124 dfa124 = new DFA124(this);
    protected DFA125 dfa125 = new DFA125(this);
    protected DFA126 dfa126 = new DFA126(this);
    protected DFA136 dfa136 = new DFA136(this);
    protected DFA137 dfa137 = new DFA137(this);
    protected DFA141 dfa141 = new DFA141(this);
    protected DFA161 dfa161 = new DFA161(this);
    protected DFA162 dfa162 = new DFA162(this);
    static final String DFA1_eotS =
        "\26\uffff";
    static final String DFA1_eofS =
        "\1\1\25\uffff";
    static final String DFA1_minS =
        "\1\76\25\uffff";
    static final String DFA1_maxS =
        "\1\u00a8\25\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\2\1\1\23\uffff";
    static final String DFA1_specialS =
        "\26\uffff}>";
    static final String[] DFA1_transitionS = {
            "\2\2\3\uffff\1\2\2\uffff\1\2\10\uffff\1\2\2\uffff\1\2\10\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2\4\uffff\1\2\17\uffff"+
            "\1\2\26\uffff\1\2\5\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\2\2\11\uffff\1\2\1\uffff\1\2",
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
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "()+ loopback of 48:16: ( sql_stmt )+";
        }
    }
    static final String DFA3_eotS =
        "\25\uffff";
    static final String DFA3_eofS =
        "\25\uffff";
    static final String DFA3_minS =
        "\1\76\24\uffff";
    static final String DFA3_maxS =
        "\1\u00a8\24\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\22\uffff";
    static final String DFA3_specialS =
        "\25\uffff}>";
    static final String[] DFA3_transitionS = {
            "\2\2\3\uffff\1\2\2\uffff\1\2\10\uffff\1\2\2\uffff\1\2\10\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2\4\uffff\1\1\17\uffff"+
            "\1\2\26\uffff\1\2\5\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\2\2\11\uffff\1\2\1\uffff\1\2",
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
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "50:11: ( EXPLAIN ( QUERY PLAN )? )?";
        }
    }
    static final String DFA2_eotS =
        "\25\uffff";
    static final String DFA2_eofS =
        "\25\uffff";
    static final String DFA2_minS =
        "\1\76\24\uffff";
    static final String DFA2_maxS =
        "\1\u00a8\24\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\22\uffff";
    static final String DFA2_specialS =
        "\25\uffff}>";
    static final String[] DFA2_transitionS = {
            "\2\2\3\uffff\1\2\2\uffff\1\2\10\uffff\1\2\2\uffff\1\2\10\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2\24\uffff\1\2\26\uffff"+
            "\1\2\1\uffff\1\1\3\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\2\2\11\uffff\1\2\1\uffff\1\2",
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
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "50:20: ( QUERY PLAN )?";
        }
    }
    static final String DFA4_eotS =
        "\42\uffff";
    static final String DFA4_eofS =
        "\42\uffff";
    static final String DFA4_minS =
        "\1\76\20\uffff\2\163\2\uffff\1\u009e\14\uffff";
    static final String DFA4_maxS =
        "\1\u00a8\20\uffff\1\u00ab\1\u00aa\2\uffff\1\u00aa\14\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\11\1\12\1\13"+
        "\1\14\1\15\1\16\1\17\2\uffff\1\23\1\20\1\uffff\1\24\1\21\1\26\1"+
        "\uffff\1\30\1\22\1\25\1\27\1\31\3\uffff";
    static final String DFA4_specialS =
        "\42\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\23\1\4\3\uffff\1\2\2\uffff\1\14\10\uffff\1\15\2\uffff\1\21"+
            "\10\uffff\1\13\1\uffff\1\3\1\uffff\1\22\2\uffff\1\15\24\uffff"+
            "\1\10\26\uffff\1\1\5\uffff\1\5\1\20\1\uffff\1\10\1\uffff\1\16"+
            "\1\uffff\1\17\1\7\11\uffff\1\12\1\uffff\1\6",
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
            "\1\30\52\uffff\1\27\1\25\3\uffff\1\32\1\uffff\1\30\4\uffff"+
            "\1\26\1\24",
            "\1\35\52\uffff\1\33\4\uffff\1\36\6\uffff\1\34",
            "",
            "",
            "\1\27\4\uffff\1\32\6\uffff\1\26",
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
            return "52:1: sql_stmt_core : ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt );";
        }
    }
    static final String DFA5_eotS =
        "\23\uffff";
    static final String DFA5_eofS =
        "\23\uffff";
    static final String DFA5_minS =
        "\1\72\2\27\20\uffff";
    static final String DFA5_maxS =
        "\1\u00af\2\u00ad\20\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\2\16\uffff";
    static final String DFA5_specialS =
        "\23\uffff}>";
    static final String[] DFA5_transitionS = {
            "\164\2\1\uffff\1\1",
            "\1\4\1\3\133\uffff\1\4\14\uffff\1\4\2\uffff\1\4\6\uffff\1\4"+
            "\21\uffff\1\4\17\uffff\1\4",
            "\1\4\1\3\133\uffff\1\4\14\uffff\1\4\2\uffff\1\4\6\uffff\1\4"+
            "\21\uffff\1\4\17\uffff\1\4",
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
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "81:23: (database_name= id DOT )?";
        }
    }
    static final String DFA7_eotS =
        "\145\uffff";
    static final String DFA7_eofS =
        "\145\uffff";
    static final String DFA7_minS =
        "\1\27\33\uffff\1\21\2\uffff\1\30\1\21\6\30\76\uffff";
    static final String DFA7_maxS =
        "\1\u00af\33\uffff\1\u00b6\2\uffff\1\u00af\1\u00b6\1\110\3\u009c"+
        "\1\110\1\u00b2\76\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\2\47\uffff\1\1\73\uffff";
    static final String DFA7_specialS =
        "\145\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\1\uffff\1\1\1\uffff\1\1\36\uffff\120\1\1\34\43\1\1\uffff"+
            "\1\1",
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
            "\3\51\3\uffff\1\1\1\uffff\1\1\1\51\1\1\4\51\32\uffff\52\51"+
            "\1\44\6\51\1\37\1\51\1\41\13\51\1\43\7\51\1\46\11\51\1\45\30"+
            "\51\1\42\10\51\1\40\1\uffff\1\51\1\uffff\2\51\1\uffff\1\51\1"+
            "\uffff\1\51",
            "",
            "",
            "\1\51\1\uffff\1\1\37\uffff\164\1\1\uffff\1\1",
            "\3\1\4\uffff\1\51\1\uffff\1\1\1\uffff\4\1\32\uffff\164\1\1"+
            "\uffff\1\1\1\uffff\2\1\1\uffff\1\1\1\uffff\1\1",
            "\1\51\57\uffff\1\1",
            "\1\51\44\uffff\1\1\136\uffff\1\1",
            "\1\51\u0083\uffff\1\1",
            "\1\51\u0083\uffff\1\1",
            "\1\51\57\uffff\1\1",
            "\1\51\u0099\uffff\1\1",
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
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "()* loopback of 83:18: ( OR or_subexpr )*";
        }
    }
    static final String DFA8_eotS =
        "\146\uffff";
    static final String DFA8_eofS =
        "\146\uffff";
    static final String DFA8_minS =
        "\1\27\34\uffff\1\21\25\uffff\1\30\1\uffff\1\21\6\30\52\uffff";
    static final String DFA8_maxS =
        "\1\u00af\34\uffff\1\u00b6\25\uffff\1\u00af\1\uffff\1\u00b6\1\110"+
        "\3\u009c\1\110\1\u00b2\52\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\2\35\uffff\1\1\106\uffff";
    static final String DFA8_specialS =
        "\146\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\1\uffff\1\1\1\uffff\1\1\36\uffff\6\1\1\35\155\1\1\uffff"+
            "\1\1",
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
            "\3\37\3\uffff\1\1\1\uffff\1\1\1\37\1\1\4\37\32\uffff\52\37"+
            "\1\71\6\37\1\63\1\37\1\66\13\37\1\70\7\37\1\73\11\37\1\72\30"+
            "\37\1\67\10\37\1\65\1\uffff\1\37\1\uffff\2\37\1\uffff\1\37\1"+
            "\uffff\1\37",
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
            "",
            "",
            "",
            "",
            "\1\37\1\uffff\1\1\37\uffff\164\1\1\uffff\1\1",
            "",
            "\3\1\4\uffff\1\37\1\uffff\1\1\1\uffff\4\1\32\uffff\164\1\1"+
            "\uffff\1\1\1\uffff\2\1\1\uffff\1\1\1\uffff\1\1",
            "\1\37\57\uffff\1\1",
            "\1\37\44\uffff\1\1\136\uffff\1\1",
            "\1\37\u0083\uffff\1\1",
            "\1\37\u0083\uffff\1\1",
            "\1\37\57\uffff\1\1",
            "\1\37\u0099\uffff\1\1",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 85:25: ( AND and_subexpr )*";
        }
    }
    static final String DFA19_eotS =
        "\u00b0\uffff";
    static final String DFA19_eofS =
        "\u00b0\uffff";
    static final String DFA19_minS =
        "\1\21\1\30\15\uffff\1\21\1\30\2\27\1\30\1\21\1\uffff\1\30\1\21\14"+
        "\uffff\1\21\u008b\uffff";
    static final String DFA19_maxS =
        "\2\u00b6\15\uffff\1\u00b6\3\u00af\1\u0086\1\u00b6\1\uffff\1\u00af"+
        "\1\u00b6\14\uffff\1\u00b6\u008b\uffff";
    static final String DFA19_acceptS =
        "\2\uffff\1\1\44\uffff\1\2\20\uffff\1\3\3\uffff\1\4\77\uffff\1\5"+
        "\63\uffff";
    static final String DFA19_specialS =
        "\u00b0\uffff}>";
    static final String[] DFA19_transitionS = {
            "\3\2\6\uffff\1\2\1\uffff\4\2\32\uffff\15\2\1\24\44\2\1\17\5"+
            "\2\1\20\10\2\1\23\1\21\3\2\1\17\1\2\1\17\1\2\1\1\1\22\15\2\1"+
            "\17\32\2\1\uffff\1\2\1\uffff\2\2\1\uffff\1\2\1\uffff\1\2",
            "\1\2\1\uffff\1\2\1\uffff\4\2\32\uffff\15\2\1\44\44\2\1\27\5"+
            "\2\1\26\15\2\1\27\1\2\1\27\20\2\1\27\32\2\1\uffff\1\2\1\uffff"+
            "\2\2\1\uffff\1\2\1\uffff\1\2",
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
            "\3\47\4\uffff\1\2\1\uffff\1\47\1\uffff\4\47\32\uffff\164\47"+
            "\1\uffff\1\47\1\uffff\2\47\1\uffff\1\47\1\uffff\1\47",
            "\1\2\1\uffff\1\70\37\uffff\164\70\1\uffff\1\70",
            "\1\74\1\2\1\74\1\uffff\1\74\36\uffff\164\74\1\uffff\1\74",
            "\1\74\1\2\1\74\1\uffff\1\74\36\uffff\164\74\1\uffff\1\74",
            "\1\2\153\uffff\1\74\1\uffff\1\74",
            "\3\174\4\uffff\1\2\1\uffff\1\174\1\uffff\4\174\32\uffff\164"+
            "\174\1\uffff\1\174\1\uffff\2\174\1\uffff\1\174\1\uffff\1\174",
            "",
            "\1\2\1\uffff\1\70\37\uffff\164\70\1\uffff\1\70",
            "\3\47\4\uffff\1\2\1\uffff\1\47\1\uffff\4\47\32\uffff\164\47"+
            "\1\uffff\1\47\1\uffff\2\47\1\uffff\1\47\1\uffff\1\47",
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
            "\3\174\4\uffff\1\2\1\uffff\1\174\1\uffff\4\174\32\uffff\164"+
            "\174\1\uffff\1\174\1\uffff\2\174\1\uffff\1\174\1\uffff\1\174",
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
            "",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "87:1: and_subexpr : ( eq_subexpr ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )* | ( NOT )? ( LIKE | GLOB | REGEXP | MATCH ) eq_subexpr ( ESCAPE eq_subexpr )? | ( NOT )? IN ( LPAREN ( select_stmt | expr ( COMMA expr )* )? RPAREN | (database_name= id DOT )? table_name= id ) | ( ISNULL | NOTNULL | IS NULL | IS NOT NULL ) | ( NOT )? BETWEEN eq_subexpr AND eq_subexpr );";
        }
    }
    static final String DFA9_eotS =
        "\40\uffff";
    static final String DFA9_eofS =
        "\40\uffff";
    static final String DFA9_minS =
        "\1\4\37\uffff";
    static final String DFA9_maxS =
        "\1\u00af\37\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\2\35\uffff\1\1";
    static final String DFA9_specialS =
        "\40\uffff}>";
    static final String[] DFA9_transitionS = {
            "\4\37\17\uffff\1\1\1\uffff\1\1\1\uffff\1\1\36\uffff\164\1\1"+
            "\uffff\1\1",
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
            ""
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
            return "()* loopback of 88:3: ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )*";
        }
    }
    static final String DFA11_eotS =
        "\141\uffff";
    static final String DFA11_eofS =
        "\141\uffff";
    static final String DFA11_minS =
        "\1\27\1\21\37\uffff\1\30\1\21\6\30\70\uffff";
    static final String DFA11_maxS =
        "\1\u00af\1\u00b6\37\uffff\1\u00af\1\u00b6\1\110\3\u009c\1\110\1"+
        "\u00b2\70\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\50\uffff\1\1\65\uffff";
    static final String DFA11_specialS =
        "\141\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\1\uffff\1\2\1\uffff\1\2\36\uffff\51\2\1\1\112\2\1\uffff"+
            "\1\2",
            "\3\53\3\uffff\1\2\1\uffff\1\2\1\53\1\2\4\53\32\uffff\52\53"+
            "\1\46\6\53\1\41\1\53\1\43\13\53\1\45\7\53\1\50\11\53\1\47\30"+
            "\53\1\44\10\53\1\42\1\uffff\1\53\1\uffff\2\53\1\uffff\1\53\1"+
            "\uffff\1\53",
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
            "\1\53\1\uffff\1\2\37\uffff\164\2\1\uffff\1\2",
            "\3\2\4\uffff\1\53\1\uffff\1\2\1\uffff\4\2\32\uffff\164\2\1"+
            "\uffff\1\2\1\uffff\2\2\1\uffff\1\2\1\uffff\1\2",
            "\1\53\57\uffff\1\2",
            "\1\53\44\uffff\1\2\136\uffff\1\2",
            "\1\53\u0083\uffff\1\2",
            "\1\53\u0083\uffff\1\2",
            "\1\53\57\uffff\1\2",
            "\1\53\u0099\uffff\1\2",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "89:54: ( ESCAPE eq_subexpr )?";
        }
    }
    static final String DFA14_eotS =
        "\61\uffff";
    static final String DFA14_eofS =
        "\61\uffff";
    static final String DFA14_minS =
        "\2\21\57\uffff";
    static final String DFA14_maxS =
        "\2\u00b6\57\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\24\uffff\1\3\1\uffff\1\1\27\uffff";
    static final String DFA14_specialS =
        "\61\uffff}>";
    static final String[] DFA14_transitionS = {
            "\3\2\6\uffff\1\2\1\27\4\2\32\uffff\142\2\1\1\21\2\1\uffff\1"+
            "\2\1\uffff\2\2\1\uffff\1\2\1\uffff\1\2",
            "\4\31\3\uffff\1\2\1\uffff\1\31\1\uffff\4\31\32\uffff\164\31"+
            "\1\uffff\1\31\1\uffff\2\31\1\uffff\1\31\1\uffff\1\31",
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
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "90:23: ( select_stmt | expr ( COMMA expr )* )?";
        }
    }
    static final String DFA15_eotS =
        "\101\uffff";
    static final String DFA15_eofS =
        "\101\uffff";
    static final String DFA15_minS =
        "\1\72\2\27\76\uffff";
    static final String DFA15_maxS =
        "\3\u00af\76\uffff";
    static final String DFA15_acceptS =
        "\3\uffff\1\2\35\uffff\1\1\37\uffff";
    static final String DFA15_specialS =
        "\101\uffff}>";
    static final String[] DFA15_transitionS = {
            "\164\2\1\uffff\1\1",
            "\1\3\1\41\1\3\1\uffff\1\3\36\uffff\164\3\1\uffff\1\3",
            "\1\3\1\41\1\3\1\uffff\1\3\36\uffff\164\3\1\uffff\1\3",
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
            return "90:68: (database_name= id DOT )?";
        }
    }
    static final String DFA20_eotS =
        "\42\uffff";
    static final String DFA20_eofS =
        "\42\uffff";
    static final String DFA20_minS =
        "\1\4\41\uffff";
    static final String DFA20_maxS =
        "\1\u00af\41\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\2\37\uffff\1\1";
    static final String DFA20_specialS =
        "\42\uffff}>";
    static final String[] DFA20_transitionS = {
            "\4\1\4\41\13\uffff\1\1\1\uffff\1\1\1\uffff\1\1\36\uffff\164"+
            "\1\1\uffff\1\1",
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
            return "()* loopback of 94:25: ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )*";
        }
    }
    static final String DFA21_eotS =
        "\43\uffff";
    static final String DFA21_eofS =
        "\43\uffff";
    static final String DFA21_minS =
        "\1\4\42\uffff";
    static final String DFA21_maxS =
        "\1\u00af\42\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\2\40\uffff\1\1";
    static final String DFA21_specialS =
        "\43\uffff}>";
    static final String[] DFA21_transitionS = {
            "\10\1\4\42\7\uffff\1\1\1\uffff\1\1\1\uffff\1\1\36\uffff\164"+
            "\1\1\uffff\1\1",
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
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "()* loopback of 96:26: ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )*";
        }
    }
    static final String DFA22_eotS =
        "\44\uffff";
    static final String DFA22_eofS =
        "\44\uffff";
    static final String DFA22_minS =
        "\1\4\43\uffff";
    static final String DFA22_maxS =
        "\1\u00af\43\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\2\41\uffff\1\1";
    static final String DFA22_specialS =
        "\44\uffff}>";
    static final String[] DFA22_transitionS = {
            "\14\1\1\uffff\2\43\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\36\uffff"+
            "\164\1\1\uffff\1\1",
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
            return "()* loopback of 98:26: ( ( PLUS | MINUS ) add_subexpr )*";
        }
    }
    static final String DFA23_eotS =
        "\45\uffff";
    static final String DFA23_eofS =
        "\45\uffff";
    static final String DFA23_minS =
        "\1\4\44\uffff";
    static final String DFA23_maxS =
        "\1\u00af\44\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\2\42\uffff\1\1";
    static final String DFA23_specialS =
        "\45\uffff}>";
    static final String[] DFA23_transitionS = {
            "\14\1\1\uffff\2\1\1\uffff\3\44\1\1\1\uffff\1\1\1\uffff\1\1\36"+
            "\uffff\164\1\1\uffff\1\1",
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
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "()* loopback of 100:26: ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )*";
        }
    }
    static final String DFA24_eotS =
        "\46\uffff";
    static final String DFA24_eofS =
        "\46\uffff";
    static final String DFA24_minS =
        "\1\4\45\uffff";
    static final String DFA24_maxS =
        "\1\u00af\45\uffff";
    static final String DFA24_acceptS =
        "\1\uffff\1\2\43\uffff\1\1";
    static final String DFA24_specialS =
        "\46\uffff}>";
    static final String[] DFA24_transitionS = {
            "\14\1\1\45\2\1\1\uffff\4\1\1\uffff\1\1\1\uffff\1\1\36\uffff"+
            "\164\1\1\uffff\1\1",
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
            "",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "()* loopback of 102:26: ( DOUBLE_PIPE con_subexpr )*";
        }
    }
    static final String DFA25_eotS =
        "\36\uffff";
    static final String DFA25_eofS =
        "\36\uffff";
    static final String DFA25_minS =
        "\1\21\1\30\34\uffff";
    static final String DFA25_maxS =
        "\2\u00b6\34\uffff";
    static final String DFA25_acceptS =
        "\2\uffff\1\2\5\uffff\1\1\25\uffff";
    static final String DFA25_specialS =
        "\36\uffff}>";
    static final String[] DFA25_transitionS = {
            "\3\10\6\uffff\1\2\1\uffff\4\2\32\uffff\112\2\1\1\51\2\1\uffff"+
            "\1\2\1\uffff\2\2\1\uffff\1\2\1\uffff\1\2",
            "\1\2\1\uffff\1\10\1\uffff\4\10\32\uffff\164\10\1\uffff\1\10"+
            "\1\uffff\2\10\1\uffff\1\10\1\uffff\1\10",
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
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "104:14: ( PLUS | MINUS | TILDA | NOT )?";
        }
    }
    static final String DFA26_eotS =
        "\63\uffff";
    static final String DFA26_eofS =
        "\63\uffff";
    static final String DFA26_minS =
        "\1\4\1\27\61\uffff";
    static final String DFA26_maxS =
        "\2\u00af\61\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\2\44\uffff\1\1\13\uffff";
    static final String DFA26_specialS =
        "\63\uffff}>";
    static final String[] DFA26_transitionS = {
            "\17\2\1\uffff\4\2\1\uffff\1\2\1\uffff\1\2\36\uffff\23\2\1\1"+
            "\140\2\1\uffff\1\2",
            "\1\2\1\uffff\1\2\1\uffff\1\2\110\uffff\1\2\6\uffff\1\2\1\uffff"+
            "\1\2\13\uffff\1\2\7\uffff\1\2\11\uffff\1\2\30\uffff\1\2\10\uffff"+
            "\1\2\1\uffff\1\47",
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
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "106:26: ( COLLATE collation_name= ID )?";
        }
    }
    static final String DFA36_eotS =
        "\u00a9\uffff";
    static final String DFA36_eofS =
        "\u00a9\uffff";
    static final String DFA36_minS =
        "\1\32\1\4\4\uffff\1\4\1\uffff\1\30\1\21\1\30\1\21\1\30\122\uffff"+
        "\1\21\111\uffff";
    static final String DFA36_maxS =
        "\1\u00b6\1\u00af\4\uffff\1\u00af\1\uffff\1\32\1\u00b6\1\32\1\u00b6"+
        "\1\32\122\uffff\1\u00b6\111\uffff";
    static final String DFA36_acceptS =
        "\2\uffff\1\2\4\uffff\1\1\5\uffff\1\3\47\uffff\1\4\47\uffff\1\6\2"+
        "\uffff\1\5\24\uffff\1\7\2\uffff\1\10\25\uffff\1\11\32\uffff";
    static final String DFA36_specialS =
        "\u00a9\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\11\1\uffff\4\2\32\uffff\20\15\1\13\1\10\10\15\3\1\17\15\1"+
            "\12\37\15\1\1\12\15\1\14\34\15\1\uffff\1\6\1\uffff\2\7\1\uffff"+
            "\1\7\1\uffff\1\7",
            "\17\7\1\uffff\4\7\1\15\1\7\1\uffff\1\7\36\uffff\164\7\1\uffff"+
            "\1\7",
            "",
            "",
            "",
            "",
            "\17\15\1\uffff\6\15\1\65\1\15\36\uffff\164\15\1\uffff\1\15",
            "",
            "\1\15\1\uffff\1\135",
            "\3\140\6\uffff\1\140\1\uffff\4\140\32\uffff\142\140\1\137\21"+
            "\140\1\uffff\1\140\1\uffff\2\140\1\uffff\1\140\1\uffff\1\140",
            "\1\15\1\uffff\1\165",
            "\3\170\4\uffff\1\15\1\uffff\1\170\1\uffff\4\170\32\uffff\164"+
            "\170\1\uffff\1\170\1\uffff\2\170\1\uffff\1\170\1\uffff\1\170",
            "\1\15\1\uffff\1\u008e",
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
            "\4\165\3\uffff\1\140\1\uffff\1\165\1\uffff\4\165\32\uffff\164"+
            "\165\1\uffff\1\165\1\uffff\2\165\1\uffff\1\165\1\uffff\1\165",
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
            return "108:1: atom_expr : ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID | function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN | LPAREN expr RPAREN -> expr | CAST LPAREN expr AS type_name RPAREN | ( EXISTS )? LPAREN select_stmt RPAREN | CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END | raise_function );";
        }
    }
    static final String DFA28_eotS =
        "\52\uffff";
    static final String DFA28_eofS =
        "\52\uffff";
    static final String DFA28_minS =
        "\1\72\1\4\50\uffff";
    static final String DFA28_maxS =
        "\2\u00af\50\uffff";
    static final String DFA28_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\45\uffff";
    static final String DFA28_specialS =
        "\52\uffff}>";
    static final String[] DFA28_transitionS = {
            "\164\2\1\uffff\1\1",
            "\17\4\1\uffff\4\4\1\2\1\4\1\uffff\1\4\36\uffff\164\4\1\uffff"+
            "\1\4",
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
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "111:5: ( (database_name= id DOT )? table_name= id DOT )?";
        }
    }
    static final String DFA27_eotS =
        "\127\uffff";
    static final String DFA27_eofS =
        "\127\uffff";
    static final String DFA27_minS =
        "\1\72\2\30\2\72\1\4\1\uffff\1\4\117\uffff";
    static final String DFA27_maxS =
        "\1\u00af\2\30\3\u00af\1\uffff\1\u00af\117\uffff";
    static final String DFA27_acceptS =
        "\6\uffff\1\1\3\uffff\1\2\114\uffff";
    static final String DFA27_specialS =
        "\127\uffff}>";
    static final String[] DFA27_transitionS = {
            "\164\2\1\uffff\1\1",
            "\1\3",
            "\1\4",
            "\164\6\1\uffff\1\5",
            "\164\6\1\uffff\1\7",
            "\17\12\1\uffff\4\12\1\6\1\12\1\uffff\1\12\36\uffff\164\12\1"+
            "\uffff\1\12",
            "",
            "\17\12\1\uffff\4\12\1\6\1\12\1\uffff\1\12\36\uffff\164\12\1"+
            "\uffff\1\12",
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
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "111:6: (database_name= id DOT )?";
        }
    }
    static final String DFA31_eotS =
        "\31\uffff";
    static final String DFA31_eofS =
        "\31\uffff";
    static final String DFA31_minS =
        "\1\21\30\uffff";
    static final String DFA31_maxS =
        "\1\u00b6\30\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\25\uffff\1\2\1\3";
    static final String DFA31_specialS =
        "\31\uffff}>";
    static final String[] DFA31_transitionS = {
            "\3\1\1\27\5\uffff\1\1\1\30\4\1\32\uffff\164\1\1\uffff\1\1\1"+
            "\uffff\2\1\1\uffff\1\1\1\uffff\1\1",
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
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "112:29: ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )?";
        }
    }
    static final String DFA29_eotS =
        "\55\uffff";
    static final String DFA29_eofS =
        "\55\uffff";
    static final String DFA29_minS =
        "\2\21\53\uffff";
    static final String DFA29_maxS =
        "\2\u00b6\53\uffff";
    static final String DFA29_acceptS =
        "\2\uffff\1\2\25\uffff\1\1\24\uffff";
    static final String DFA29_specialS =
        "\55\uffff}>";
    static final String[] DFA29_transitionS = {
            "\3\2\6\uffff\1\2\1\uffff\4\2\32\uffff\44\2\1\1\117\2\1\uffff"+
            "\1\2\1\uffff\2\2\1\uffff\1\2\1\uffff\1\2",
            "\3\30\4\uffff\1\2\1\uffff\1\30\1\uffff\4\30\32\uffff\164\30"+
            "\1\uffff\1\30\1\uffff\2\30\1\uffff\1\30\1\uffff\1\30",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "112:30: ( DISTINCT )?";
        }
    }
    static final String DFA33_eotS =
        "\55\uffff";
    static final String DFA33_eofS =
        "\55\uffff";
    static final String DFA33_minS =
        "\1\21\24\uffff\1\21\27\uffff";
    static final String DFA33_maxS =
        "\1\u00b6\24\uffff\1\u00b6\27\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\26\uffff\1\2\24\uffff";
    static final String DFA33_specialS =
        "\55\uffff}>";
    static final String[] DFA33_transitionS = {
            "\3\1\6\uffff\1\1\1\uffff\4\1\32\uffff\162\1\1\25\1\1\1\uffff"+
            "\1\1\1\uffff\2\1\1\uffff\1\1\1\uffff\1\1",
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
            "",
            "",
            "",
            "\3\30\4\uffff\1\1\1\uffff\1\30\1\uffff\4\30\32\uffff\164\30"+
            "\1\uffff\1\30\1\uffff\2\30\1\uffff\1\30\1\uffff\1\30",
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
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "116:10: ( expr )?";
        }
    }
    static final String DFA37_eotS =
        "\54\uffff";
    static final String DFA37_eofS =
        "\54\uffff";
    static final String DFA37_minS =
        "\1\34\1\4\52\uffff";
    static final String DFA37_maxS =
        "\1\37\1\u00b2\52\uffff";
    static final String DFA37_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\2\1\1\45\uffff";
    static final String DFA37_specialS =
        "\54\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\1\1\2\1\3\1\4",
            "\17\6\1\uffff\4\6\1\uffff\1\6\1\uffff\1\6\36\uffff\164\6\1"+
            "\uffff\1\6\2\uffff\1\5",
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
            "",
            "",
            "",
            "",
            "",
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
            return "123:1: bind_parameter : ( QUESTION | QUESTION number= INTEGER | COLON id | AT id | DOLLAR name= TCL_ID );";
        }
    }
    static final String DFA38_eotS =
        "\16\uffff";
    static final String DFA38_eofS =
        "\16\uffff";
    static final String DFA38_minS =
        "\1\27\15\uffff";
    static final String DFA38_maxS =
        "\1\u00af\15\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\2\13\uffff\1\1";
    static final String DFA38_specialS =
        "\16\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\1\1\uffff\3\1\60\uffff\2\1\3\uffff\1\1\6\uffff\1\1\53\uffff"+
            "\1\1\12\uffff\1\1\2\uffff\1\1\22\uffff\1\1\11\uffff\1\15",
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
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "()+ loopback of 130:17: (names+= ID )+";
        }
    }
    static final String DFA40_eotS =
        "\15\uffff";
    static final String DFA40_eofS =
        "\15\uffff";
    static final String DFA40_minS =
        "\1\27\14\uffff";
    static final String DFA40_maxS =
        "\1\u00a5\14\uffff";
    static final String DFA40_acceptS =
        "\1\uffff\1\1\1\2\12\uffff";
    static final String DFA40_specialS =
        "\15\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\2\1\uffff\1\2\1\1\1\2\60\uffff\2\2\3\uffff\1\2\6\uffff\1"+
            "\2\53\uffff\1\2\12\uffff\1\2\2\uffff\1\2\22\uffff\1\2",
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
            ""
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "130:23: ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )?";
        }
    }
    static final String DFA42_eotS =
        "\13\uffff";
    static final String DFA42_eofS =
        "\13\uffff";
    static final String DFA42_minS =
        "\1\72\2\4\10\uffff";
    static final String DFA42_maxS =
        "\1\u00af\2\32\10\uffff";
    static final String DFA42_acceptS =
        "\3\uffff\1\1\1\2\6\uffff";
    static final String DFA42_specialS =
        "\13\uffff}>";
    static final String[] DFA42_transitionS = {
            "\164\2\1\uffff\1\1",
            "\1\4\22\uffff\1\4\1\3\1\uffff\1\4",
            "\1\4\22\uffff\1\4\1\3\1\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "135:21: (database_name= id DOT )?";
        }
    }
    static final String DFA45_eotS =
        "\17\uffff";
    static final String DFA45_eofS =
        "\17\uffff";
    static final String DFA45_minS =
        "\2\72\3\uffff\1\72\4\uffff\1\27\4\uffff";
    static final String DFA45_maxS =
        "\2\u00b1\3\uffff\1\u00af\4\uffff\1\u00af\4\uffff";
    static final String DFA45_acceptS =
        "\2\uffff\1\2\3\uffff\1\1\10\uffff";
    static final String DFA45_specialS =
        "\17\uffff}>";
    static final String[] DFA45_transitionS = {
            "\35\2\1\1\126\2\1\uffff\1\2\1\uffff\1\2",
            "\7\6\1\5\154\6\1\uffff\1\6\1\uffff\1\6",
            "",
            "",
            "",
            "\7\2\1\12\154\2\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "\1\2\42\uffff\164\6\1\uffff\1\6",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "140:21: ( DATABASE )?";
        }
    }
    static final String DFA50_eotS =
        "\14\uffff";
    static final String DFA50_eofS =
        "\14\uffff";
    static final String DFA50_minS =
        "\1\27\13\uffff";
    static final String DFA50_maxS =
        "\1\u00a4\13\uffff";
    static final String DFA50_acceptS =
        "\1\uffff\1\1\1\2\1\3\10\uffff";
    static final String DFA50_specialS =
        "\14\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\3\1\uffff\1\3\1\uffff\1\3\46\uffff\1\1\31\uffff\1\2\7\uffff"+
            "\1\3\11\uffff\1\3\12\uffff\1\3\7\uffff\1\3\11\uffff\1\3\30\uffff"+
            "\1\3",
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
            ""
    };

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "160:82: ( ASC | DESC )?";
        }
    }
    static final String DFA62_eotS =
        "\107\uffff";
    static final String DFA62_eofS =
        "\107\uffff";
    static final String DFA62_minS =
        "\3\21\104\uffff";
    static final String DFA62_maxS =
        "\3\u00b6\104\uffff";
    static final String DFA62_acceptS =
        "\3\uffff\1\3\26\uffff\1\1\25\uffff\1\2\26\uffff";
    static final String DFA62_specialS =
        "\107\uffff}>";
    static final String[] DFA62_transitionS = {
            "\4\3\5\uffff\1\3\1\uffff\4\3\32\uffff\3\3\1\1\40\3\1\2\117\3"+
            "\1\uffff\1\3\1\uffff\2\3\1\uffff\1\3\1\uffff\1\3",
            "\4\32\3\uffff\1\3\1\uffff\1\32\1\uffff\4\32\32\uffff\164\32"+
            "\1\uffff\1\32\1\uffff\2\32\1\uffff\1\32\1\uffff\1\32",
            "\4\60\3\uffff\1\3\1\uffff\1\60\1\uffff\4\60\32\uffff\164\60"+
            "\1\uffff\1\60\1\uffff\2\60\1\uffff\1\60\1\uffff\1\60",
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
            ""
    };

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "181:10: ( ALL | DISTINCT )?";
        }
    }
    static final String DFA63_eotS =
        "\14\uffff";
    static final String DFA63_eofS =
        "\14\uffff";
    static final String DFA63_minS =
        "\1\27\13\uffff";
    static final String DFA63_maxS =
        "\1\u00ad\13\uffff";
    static final String DFA63_acceptS =
        "\1\uffff\1\2\11\uffff\1\1";
    static final String DFA63_specialS =
        "\14\uffff}>";
    static final String[] DFA63_transitionS = {
            "\1\1\1\uffff\1\13\1\uffff\1\1\110\uffff\1\1\6\uffff\1\1\1\uffff"+
            "\1\1\13\uffff\1\1\7\uffff\1\1\11\uffff\1\1\30\uffff\1\1\10\uffff"+
            "\1\1",
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
            ""
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "()* loopback of 181:42: ( COMMA result_column )*";
        }
    }
    static final String DFA64_eotS =
        "\13\uffff";
    static final String DFA64_eofS =
        "\13\uffff";
    static final String DFA64_minS =
        "\1\27\12\uffff";
    static final String DFA64_maxS =
        "\1\u00ad\12\uffff";
    static final String DFA64_acceptS =
        "\1\uffff\1\1\1\2\10\uffff";
    static final String DFA64_specialS =
        "\13\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\2\3\uffff\1\2\110\uffff\1\2\6\uffff\1\1\1\uffff\1\2\13\uffff"+
            "\1\2\7\uffff\1\2\11\uffff\1\2\30\uffff\1\2\10\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "181:65: ( FROM join_source )?";
        }
    }
    static final String DFA65_eotS =
        "\12\uffff";
    static final String DFA65_eofS =
        "\12\uffff";
    static final String DFA65_minS =
        "\1\27\11\uffff";
    static final String DFA65_maxS =
        "\1\u00ad\11\uffff";
    static final String DFA65_acceptS =
        "\1\uffff\1\1\1\2\7\uffff";
    static final String DFA65_specialS =
        "\12\uffff}>";
    static final String[] DFA65_transitionS = {
            "\1\2\3\uffff\1\2\110\uffff\1\2\10\uffff\1\2\13\uffff\1\2\7\uffff"+
            "\1\2\11\uffff\1\2\30\uffff\1\2\10\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "181:85: ( WHERE where_expr= expr )?";
        }
    }
    static final String DFA66_eotS =
        "\12\uffff";
    static final String DFA66_eofS =
        "\12\uffff";
    static final String DFA66_minS =
        "\1\27\11\uffff";
    static final String DFA66_maxS =
        "\1\u00a4\11\uffff";
    static final String DFA66_acceptS =
        "\1\uffff\1\2\7\uffff\1\1";
    static final String DFA66_specialS =
        "\12\uffff}>";
    static final String[] DFA66_transitionS = {
            "\1\1\1\uffff\1\11\1\uffff\1\1\110\uffff\1\1\11\uffff\1\1\12"+
            "\uffff\1\1\7\uffff\1\1\11\uffff\1\1\30\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "()* loopback of 182:28: ( COMMA ordering_term )*";
        }
    }
    static final String DFA71_eotS =
        "\u00ea\uffff";
    static final String DFA71_eofS =
        "\u00ea\uffff";
    static final String DFA71_minS =
        "\1\21\1\uffff\1\4\1\30\1\4\1\uffff\1\30\6\uffff\1\30\1\21\1\30\1"+
        "\21\1\30\2\27\1\30\1\21\1\30\1\uffff\1\24\30\uffff\1\24\17\uffff"+
        "\1\24\30\uffff\2\24\1\uffff\1\24\27\uffff\2\24\17\uffff\1\24\3\uffff"+
        "\1\24\20\uffff\1\24\22\uffff\2\24\17\uffff\1\24\52\uffff";
    static final String DFA71_maxS =
        "\1\u00b6\1\uffff\1\u00af\1\u00b6\1\u00af\1\uffff\1\32\6\uffff\1"+
        "\32\1\u00b6\1\32\1\u00b6\3\u00af\1\u0086\1\u00b6\1\30\1\uffff\1"+
        "\u00af\30\uffff\1\u00af\17\uffff\1\u00af\30\uffff\2\u00af\1\uffff"+
        "\1\u00af\27\uffff\2\u00af\17\uffff\1\u00af\3\uffff\1\u00af\20\uffff"+
        "\1\u00af\22\uffff\2\u00af\17\uffff\1\u00af\52\uffff";
    static final String DFA71_acceptS =
        "\1\uffff\1\1\3\uffff\1\3\u00ba\uffff\1\2\51\uffff";
    static final String DFA71_specialS =
        "\u00ea\uffff}>";
    static final String[] DFA71_transitionS = {
            "\3\5\1\1\5\uffff\1\5\1\uffff\4\5\32\uffff\15\26\1\25\2\26\1"+
            "\16\1\6\10\26\3\4\17\26\1\15\5\26\1\20\5\26\1\21\10\26\1\24"+
            "\1\22\3\26\1\20\1\26\1\20\1\26\1\3\1\23\1\4\12\26\1\17\1\26"+
            "\1\20\32\26\1\uffff\1\2\1\uffff\2\5\1\uffff\1\5\1\uffff\1\5",
            "",
            "\17\5\1\uffff\4\5\1\30\3\5\36\uffff\164\5\1\uffff\1\5",
            "\1\61\1\uffff\1\5\1\uffff\4\5\32\uffff\164\5\1\uffff\1\5\1"+
            "\uffff\2\5\1\uffff\1\5\1\uffff\1\5",
            "\17\5\1\uffff\4\5\1\101\1\5\1\uffff\1\5\36\uffff\164\5\1\uffff"+
            "\1\5",
            "",
            "\1\132\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\133\1\uffff\1\5",
            "\3\5\4\uffff\1\135\1\uffff\1\5\1\uffff\4\5\32\uffff\164\5\1"+
            "\uffff\1\5\1\uffff\2\5\1\uffff\1\5\1\uffff\1\5",
            "\1\165\1\uffff\1\5",
            "\3\5\4\uffff\1\166\1\uffff\1\5\1\uffff\4\5\32\uffff\164\5\1"+
            "\uffff\1\5\1\uffff\2\5\1\uffff\1\5\1\uffff\1\5",
            "\1\u0086\1\uffff\1\5\37\uffff\164\5\1\uffff\1\5",
            "\1\5\1\u008a\1\5\1\uffff\1\5\36\uffff\164\5\1\uffff\1\5",
            "\1\5\1\u009b\1\5\1\uffff\1\5\36\uffff\164\5\1\uffff\1\5",
            "\1\u00ae\153\uffff\1\5\1\uffff\1\5",
            "\3\5\4\uffff\1\u00af\1\uffff\1\5\1\uffff\4\5\32\uffff\164\5"+
            "\1\uffff\1\5\1\uffff\2\5\1\uffff\1\5\1\uffff\1\5",
            "\1\u00bf",
            "",
            "\1\u00c0\45\uffff\164\5\1\uffff\1\5",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c0\45\uffff\164\5\1\uffff\1\5",
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
            "\1\u00c0\45\uffff\164\5\1\uffff\1\5",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c0\45\uffff\164\5\1\uffff\1\5",
            "\1\u00c0\45\uffff\164\5\1\uffff\1\5",
            "",
            "\1\u00c0\45\uffff\164\5\1\uffff\1\5",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c0\45\uffff\164\5\1\uffff\1\5",
            "\1\u00c0\45\uffff\164\5\1\uffff\1\5",
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
            "\1\u00c0\45\uffff\164\5\1\uffff\1\5",
            "",
            "",
            "",
            "\1\u00c0\45\uffff\164\5\1\uffff\1\5",
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
            "\1\u00c0\45\uffff\164\5\1\uffff\1\5",
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
            "",
            "\1\u00c0\45\uffff\164\5\1\uffff\1\5",
            "\1\u00c0\45\uffff\164\5\1\uffff\1\5",
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
            "\1\u00c0\45\uffff\164\5\1\uffff\1\5",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
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
            return "188:1: result_column : ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) );";
        }
    }
    static final String DFA70_eotS =
        "\u00d4\uffff";
    static final String DFA70_eofS =
        "\u00d4\uffff";
    static final String DFA70_minS =
        "\1\27\2\uffff\1\27\1\uffff\1\21\6\27\4\uffff\1\30\2\uffff\1\21\6"+
        "\30\27\uffff\1\30\1\uffff\1\21\6\30\u009a\uffff";
    static final String DFA70_maxS =
        "\1\u00af\2\uffff\1\u00af\1\uffff\1\u00b6\5\u00ad\1\u00b2\4\uffff"+
        "\1\u00af\2\uffff\1\u00b6\1\110\3\u009c\1\110\1\u00b2\27\uffff\1"+
        "\u00af\1\uffff\1\u00b6\1\110\3\u009c\1\110\1\u00b2\u009a\uffff";
    static final String DFA70_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\u00cf\uffff";
    static final String DFA70_specialS =
        "\u00d4\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\4\1\uffff\1\4\1\uffff\1\4\36\uffff\52\1\1\11\6\1\1\3\1\1"+
            "\1\6\13\1\1\10\7\1\1\13\11\1\1\12\30\1\1\7\10\1\1\5\1\uffff"+
            "\1\1",
            "",
            "",
            "\1\1\1\uffff\1\1\1\4\1\1\36\uffff\52\4\1\27\6\4\1\20\1\4\1"+
            "\24\13\4\1\26\7\4\1\31\11\4\1\30\30\4\1\25\10\4\1\23\1\uffff"+
            "\1\4",
            "",
            "\3\4\3\uffff\1\1\1\uffff\1\1\1\4\1\1\4\4\32\uffff\52\4\1\67"+
            "\6\4\1\61\1\4\1\64\13\4\1\66\7\4\1\71\11\4\1\70\30\4\1\65\10"+
            "\4\1\63\1\uffff\1\4\1\uffff\2\4\1\uffff\1\4\1\uffff\1\4",
            "\1\1\1\uffff\1\1\1\uffff\1\1\54\uffff\1\4\33\uffff\1\1\6\uffff"+
            "\1\1\1\uffff\1\1\13\uffff\1\1\7\uffff\1\1\11\uffff\1\1\30\uffff"+
            "\1\1\10\uffff\1\1",
            "\1\1\1\uffff\1\1\1\uffff\1\1\41\uffff\1\4\46\uffff\1\1\6\uffff"+
            "\1\1\1\uffff\1\1\13\uffff\1\1\7\uffff\1\1\11\uffff\1\1\20\uffff"+
            "\1\4\7\uffff\1\1\10\uffff\1\1",
            "\1\1\1\uffff\1\1\1\uffff\1\1\110\uffff\1\1\6\uffff\1\1\1\uffff"+
            "\1\1\13\uffff\1\1\7\uffff\1\1\11\uffff\1\1\20\uffff\1\4\7\uffff"+
            "\1\1\10\uffff\1\1",
            "\1\1\1\uffff\1\1\1\uffff\1\1\110\uffff\1\1\6\uffff\1\1\1\uffff"+
            "\1\1\13\uffff\1\1\7\uffff\1\1\11\uffff\1\1\20\uffff\1\4\7\uffff"+
            "\1\1\10\uffff\1\1",
            "\1\1\1\uffff\1\1\1\uffff\1\1\54\uffff\1\4\33\uffff\1\1\6\uffff"+
            "\1\1\1\uffff\1\1\13\uffff\1\1\7\uffff\1\1\11\uffff\1\1\30\uffff"+
            "\1\1\10\uffff\1\1",
            "\1\1\1\uffff\1\1\1\uffff\1\1\110\uffff\1\1\6\uffff\1\1\1\uffff"+
            "\1\1\13\uffff\1\1\7\uffff\1\1\11\uffff\1\1\30\uffff\1\1\10\uffff"+
            "\1\1\4\uffff\1\4",
            "",
            "",
            "",
            "",
            "\1\4\1\uffff\1\1\37\uffff\164\1\1\uffff\1\1",
            "",
            "",
            "\3\1\4\uffff\1\4\1\uffff\1\1\1\uffff\4\1\32\uffff\164\1\1\uffff"+
            "\1\1\1\uffff\2\1\1\uffff\1\1\1\uffff\1\1",
            "\1\4\57\uffff\1\1",
            "\1\4\44\uffff\1\1\136\uffff\1\1",
            "\1\4\u0083\uffff\1\1",
            "\1\4\u0083\uffff\1\1",
            "\1\4\57\uffff\1\1",
            "\1\4\u0099\uffff\1\1",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\4\1\uffff\1\1\37\uffff\164\1\1\uffff\1\1",
            "",
            "\3\1\4\uffff\1\4\1\uffff\1\1\1\uffff\4\1\32\uffff\164\1\1\uffff"+
            "\1\1\1\uffff\2\1\1\uffff\1\1\1\uffff\1\1",
            "\1\4\57\uffff\1\1",
            "\1\4\44\uffff\1\1\136\uffff\1\1",
            "\1\4\u0083\uffff\1\1",
            "\1\4\u0083\uffff\1\1",
            "\1\4\57\uffff\1\1",
            "\1\4\u0099\uffff\1\1",
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
            ""
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
            return "191:10: ( ( AS )? column_alias= id )?";
        }
    }
    static final String DFA69_eotS =
        "\u00d6\uffff";
    static final String DFA69_eofS =
        "\u00d6\uffff";
    static final String DFA69_minS =
        "\1\72\1\27\3\uffff\1\27\1\21\6\27\5\uffff\1\30\2\uffff\1\21\6\30"+
        "\4\uffff\1\30\1\21\6\30\u00ae\uffff";
    static final String DFA69_maxS =
        "\2\u00af\3\uffff\1\u00af\1\u00b6\5\u00ad\1\u00b2\5\uffff\1\u00af"+
        "\2\uffff\1\u00b6\1\110\3\u009c\1\110\1\u00b2\4\uffff\1\u00af\1\u00b6"+
        "\1\110\3\u009c\1\110\1\u00b2\u00ae\uffff";
    static final String DFA69_acceptS =
        "\2\uffff\1\2\14\uffff\1\1\u00c6\uffff";
    static final String DFA69_specialS =
        "\u00d6\uffff}>";
    static final String[] DFA69_transitionS = {
            "\7\2\1\1\154\2\1\uffff\1\2",
            "\1\2\1\uffff\1\2\1\uffff\1\2\36\uffff\52\17\1\12\6\17\1\5\1"+
            "\17\1\7\13\17\1\11\7\17\1\14\11\17\1\13\30\17\1\10\10\17\1\6"+
            "\1\uffff\1\17",
            "",
            "",
            "",
            "\1\17\1\uffff\1\17\1\2\1\17\36\uffff\52\2\1\31\6\2\1\22\1\2"+
            "\1\26\13\2\1\30\7\2\1\33\11\2\1\32\30\2\1\27\10\2\1\25\1\uffff"+
            "\1\2",
            "\3\2\3\uffff\1\17\1\uffff\1\17\1\2\1\17\4\2\32\uffff\52\2\1"+
            "\45\6\2\1\40\1\2\1\42\13\2\1\44\7\2\1\47\11\2\1\46\30\2\1\43"+
            "\10\2\1\41\1\uffff\1\2\1\uffff\2\2\1\uffff\1\2\1\uffff\1\2",
            "\1\17\1\uffff\1\17\1\uffff\1\17\54\uffff\1\2\33\uffff\1\17"+
            "\6\uffff\1\17\1\uffff\1\17\13\uffff\1\17\7\uffff\1\17\11\uffff"+
            "\1\17\30\uffff\1\17\10\uffff\1\17",
            "\1\17\1\uffff\1\17\1\uffff\1\17\41\uffff\1\2\46\uffff\1\17"+
            "\6\uffff\1\17\1\uffff\1\17\13\uffff\1\17\7\uffff\1\17\11\uffff"+
            "\1\17\20\uffff\1\2\7\uffff\1\17\10\uffff\1\17",
            "\1\17\1\uffff\1\17\1\uffff\1\17\110\uffff\1\17\6\uffff\1\17"+
            "\1\uffff\1\17\13\uffff\1\17\7\uffff\1\17\11\uffff\1\17\20\uffff"+
            "\1\2\7\uffff\1\17\10\uffff\1\17",
            "\1\17\1\uffff\1\17\1\uffff\1\17\110\uffff\1\17\6\uffff\1\17"+
            "\1\uffff\1\17\13\uffff\1\17\7\uffff\1\17\11\uffff\1\17\20\uffff"+
            "\1\2\7\uffff\1\17\10\uffff\1\17",
            "\1\17\1\uffff\1\17\1\uffff\1\17\54\uffff\1\2\33\uffff\1\17"+
            "\6\uffff\1\17\1\uffff\1\17\13\uffff\1\17\7\uffff\1\17\11\uffff"+
            "\1\17\30\uffff\1\17\10\uffff\1\17",
            "\1\17\1\uffff\1\17\1\uffff\1\17\110\uffff\1\17\6\uffff\1\17"+
            "\1\uffff\1\17\13\uffff\1\17\7\uffff\1\17\11\uffff\1\17\30\uffff"+
            "\1\17\10\uffff\1\17\4\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "\1\2\1\uffff\1\17\37\uffff\164\17\1\uffff\1\17",
            "",
            "",
            "\3\17\4\uffff\1\2\1\uffff\1\17\1\uffff\4\17\32\uffff\164\17"+
            "\1\uffff\1\17\1\uffff\2\17\1\uffff\1\17\1\uffff\1\17",
            "\1\2\57\uffff\1\17",
            "\1\2\44\uffff\1\17\136\uffff\1\17",
            "\1\2\u0083\uffff\1\17",
            "\1\2\u0083\uffff\1\17",
            "\1\2\57\uffff\1\17",
            "\1\2\u0099\uffff\1\17",
            "",
            "",
            "",
            "",
            "\1\2\1\uffff\1\17\37\uffff\164\17\1\uffff\1\17",
            "\3\17\4\uffff\1\2\1\uffff\1\17\1\uffff\4\17\32\uffff\164\17"+
            "\1\uffff\1\17\1\uffff\2\17\1\uffff\1\17\1\uffff\1\17",
            "\1\2\57\uffff\1\17",
            "\1\2\44\uffff\1\17\136\uffff\1\17",
            "\1\2\u0083\uffff\1\17",
            "\1\2\u0083\uffff\1\17",
            "\1\2\57\uffff\1\17",
            "\1\2\u0099\uffff\1\17",
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
            "",
            "",
            "",
            ""
    };

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "191:11: ( AS )?";
        }
    }
    static final String DFA73_eotS =
        "\21\uffff";
    static final String DFA73_eofS =
        "\21\uffff";
    static final String DFA73_minS =
        "\1\27\20\uffff";
    static final String DFA73_maxS =
        "\1\u00ad\20\uffff";
    static final String DFA73_acceptS =
        "\1\uffff\1\2\10\uffff\1\1\6\uffff";
    static final String DFA73_specialS =
        "\21\uffff}>";
    static final String[] DFA73_transitionS = {
            "\1\1\1\uffff\1\12\1\uffff\1\1\67\uffff\1\12\20\uffff\1\1\10"+
            "\uffff\1\1\10\uffff\1\12\2\uffff\1\1\3\uffff\1\12\1\uffff\1"+
            "\12\1\uffff\1\1\1\uffff\1\12\7\uffff\1\1\1\12\27\uffff\1\1\10"+
            "\uffff\1\1",
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
            return "()* loopback of 193:28: ( join_op single_source ( join_constraint )? )*";
        }
    }
    static final String DFA72_eotS =
        "\23\uffff";
    static final String DFA72_eofS =
        "\23\uffff";
    static final String DFA72_minS =
        "\1\27\22\uffff";
    static final String DFA72_maxS =
        "\1\u00ad\22\uffff";
    static final String DFA72_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\17\uffff";
    static final String DFA72_specialS =
        "\23\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\3\1\uffff\1\3\1\uffff\1\3\67\uffff\1\3\20\uffff\1\3\10\uffff"+
            "\1\3\10\uffff\1\3\2\uffff\1\3\3\uffff\1\3\1\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\1\3\5\uffff\1\1\1\uffff\2\3\27\uffff\1\3\2\uffff"+
            "\1\1\5\uffff\1\3",
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
            return "193:52: ( join_constraint )?";
        }
    }
    static final String DFA80_eotS =
        "\41\uffff";
    static final String DFA80_eofS =
        "\41\uffff";
    static final String DFA80_minS =
        "\1\32\2\uffff\1\32\1\21\34\uffff";
    static final String DFA80_maxS =
        "\1\u00af\2\uffff\1\u00af\1\u00b6\34\uffff";
    static final String DFA80_acceptS =
        "\1\uffff\1\1\3\uffff\1\3\3\uffff\1\2\27\uffff";
    static final String DFA80_specialS =
        "\41\uffff}>";
    static final String[] DFA80_transitionS = {
            "\1\3\37\uffff\164\1\1\uffff\1\1",
            "",
            "",
            "\1\5\37\uffff\142\5\1\4\21\5\1\uffff\1\5",
            "\4\11\3\uffff\1\5\1\uffff\1\11\1\uffff\4\11\32\uffff\164\11"+
            "\1\uffff\1\11\1\uffff\2\11\1\uffff\1\11\1\uffff\1\11",
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
            ""
    };

    static final short[] DFA80_eot = DFA.unpackEncodedString(DFA80_eotS);
    static final short[] DFA80_eof = DFA.unpackEncodedString(DFA80_eofS);
    static final char[] DFA80_min = DFA.unpackEncodedStringToUnsignedChars(DFA80_minS);
    static final char[] DFA80_max = DFA.unpackEncodedStringToUnsignedChars(DFA80_maxS);
    static final short[] DFA80_accept = DFA.unpackEncodedString(DFA80_acceptS);
    static final short[] DFA80_special = DFA.unpackEncodedString(DFA80_specialS);
    static final short[][] DFA80_transition;

    static {
        int numStates = DFA80_transitionS.length;
        DFA80_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA80_transition[i] = DFA.unpackEncodedString(DFA80_transitionS[i]);
        }
    }

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = DFA80_eot;
            this.eof = DFA80_eof;
            this.min = DFA80_min;
            this.max = DFA80_max;
            this.accept = DFA80_accept;
            this.special = DFA80_special;
            this.transition = DFA80_transition;
        }
        public String getDescription() {
            return "195:1: single_source : ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN );";
        }
    }
    static final String DFA74_eotS =
        "\32\uffff";
    static final String DFA74_eofS =
        "\32\uffff";
    static final String DFA74_minS =
        "\1\72\1\27\30\uffff";
    static final String DFA74_maxS =
        "\2\u00af\30\uffff";
    static final String DFA74_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\25\uffff";
    static final String DFA74_specialS =
        "\32\uffff}>";
    static final String[] DFA74_transitionS = {
            "\164\2\1\uffff\1\1",
            "\1\4\1\2\1\4\1\uffff\1\4\45\uffff\1\4\21\uffff\1\4\20\uffff"+
            "\1\4\10\uffff\1\4\6\uffff\1\4\1\uffff\1\4\2\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\1\4\1\uffff\1\4\1\uffff\2\4\4\uffff\1\4\1\uffff"+
            "\2\4\27\uffff\1\4\2\uffff\1\4\5\uffff\1\4\1\uffff\1\4",
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
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = DFA74_eot;
            this.eof = DFA74_eof;
            this.min = DFA74_min;
            this.max = DFA74_max;
            this.accept = DFA74_accept;
            this.special = DFA74_special;
            this.transition = DFA74_transition;
        }
        public String getDescription() {
            return "196:5: (database_name= id DOT )?";
        }
    }
    static final String DFA76_eotS =
        "\27\uffff";
    static final String DFA76_eofS =
        "\27\uffff";
    static final String DFA76_minS =
        "\1\27\26\uffff";
    static final String DFA76_maxS =
        "\1\u00af\26\uffff";
    static final String DFA76_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\23\uffff";
    static final String DFA76_specialS =
        "\27\uffff}>";
    static final String[] DFA76_transitionS = {
            "\1\3\1\uffff\1\3\1\uffff\1\3\45\uffff\1\1\21\uffff\1\3\20\uffff"+
            "\1\3\10\uffff\1\3\6\uffff\1\3\1\uffff\1\3\2\uffff\1\3\3\uffff"+
            "\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\2\3\4\uffff\1\3\1\uffff"+
            "\2\3\27\uffff\1\3\2\uffff\1\3\5\uffff\1\3\1\uffff\1\1",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "196:43: ( ( AS )? table_alias= ID )?";
        }
    }
    static final String DFA77_eotS =
        "\25\uffff";
    static final String DFA77_eofS =
        "\25\uffff";
    static final String DFA77_minS =
        "\1\27\24\uffff";
    static final String DFA77_maxS =
        "\1\u00ad\24\uffff";
    static final String DFA77_acceptS =
        "\1\uffff\1\1\1\2\1\3\21\uffff";
    static final String DFA77_specialS =
        "\25\uffff}>";
    static final String[] DFA77_transitionS = {
            "\1\3\1\uffff\1\3\1\uffff\1\3\67\uffff\1\3\20\uffff\1\3\10\uffff"+
            "\1\3\6\uffff\1\1\1\uffff\1\3\2\uffff\1\3\3\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\1\3\1\uffff\1\3\1\2\4\uffff\1\3\1\uffff\2\3\27"+
            "\uffff\1\3\2\uffff\1\3\5\uffff\1\3",
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
            "",
            "",
            ""
    };

    static final short[] DFA77_eot = DFA.unpackEncodedString(DFA77_eotS);
    static final short[] DFA77_eof = DFA.unpackEncodedString(DFA77_eofS);
    static final char[] DFA77_min = DFA.unpackEncodedStringToUnsignedChars(DFA77_minS);
    static final char[] DFA77_max = DFA.unpackEncodedStringToUnsignedChars(DFA77_maxS);
    static final short[] DFA77_accept = DFA.unpackEncodedString(DFA77_acceptS);
    static final short[] DFA77_special = DFA.unpackEncodedString(DFA77_specialS);
    static final short[][] DFA77_transition;

    static {
        int numStates = DFA77_transitionS.length;
        DFA77_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA77_transition[i] = DFA.unpackEncodedString(DFA77_transitionS[i]);
        }
    }

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = DFA77_eot;
            this.eof = DFA77_eof;
            this.min = DFA77_min;
            this.max = DFA77_max;
            this.accept = DFA77_accept;
            this.special = DFA77_special;
            this.transition = DFA77_transition;
        }
        public String getDescription() {
            return "196:67: ( INDEXED BY index_name= id | NOT INDEXED )?";
        }
    }
    static final String DFA79_eotS =
        "\25\uffff";
    static final String DFA79_eofS =
        "\25\uffff";
    static final String DFA79_minS =
        "\1\27\24\uffff";
    static final String DFA79_maxS =
        "\1\u00af\24\uffff";
    static final String DFA79_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\21\uffff";
    static final String DFA79_specialS =
        "\25\uffff}>";
    static final String[] DFA79_transitionS = {
            "\1\3\1\uffff\1\3\1\uffff\1\3\45\uffff\1\1\21\uffff\1\3\20\uffff"+
            "\1\3\10\uffff\1\3\10\uffff\1\3\2\uffff\1\3\3\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\1\3\1\uffff\1\3\5\uffff\1\3\1\uffff\2\3\27\uffff"+
            "\1\3\2\uffff\1\3\5\uffff\1\3\1\uffff\1\1",
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
            "",
            "",
            ""
    };

    static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
    static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
    static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
    static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
    static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
    static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
    static final short[][] DFA79_transition;

    static {
        int numStates = DFA79_transitionS.length;
        DFA79_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = DFA79_eot;
            this.eof = DFA79_eof;
            this.min = DFA79_min;
            this.max = DFA79_max;
            this.accept = DFA79_accept;
            this.special = DFA79_special;
            this.transition = DFA79_transition;
        }
        public String getDescription() {
            return "198:31: ( ( AS )? table_alias= ID )?";
        }
    }
    static final String DFA90_eotS =
        "\15\uffff";
    static final String DFA90_eofS =
        "\15\uffff";
    static final String DFA90_minS =
        "\1\72\2\30\12\uffff";
    static final String DFA90_maxS =
        "\1\u00af\2\u00a9\12\uffff";
    static final String DFA90_acceptS =
        "\3\uffff\1\2\3\uffff\1\1\5\uffff";
    static final String DFA90_specialS =
        "\15\uffff}>";
    static final String[] DFA90_transitionS = {
            "\164\2\1\uffff\1\1",
            "\1\7\1\uffff\1\3\75\uffff\1\3\103\uffff\1\3\14\uffff\1\3",
            "\1\7\1\uffff\1\3\75\uffff\1\3\103\uffff\1\3\14\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA90_eot = DFA.unpackEncodedString(DFA90_eotS);
    static final short[] DFA90_eof = DFA.unpackEncodedString(DFA90_eofS);
    static final char[] DFA90_min = DFA.unpackEncodedStringToUnsignedChars(DFA90_minS);
    static final char[] DFA90_max = DFA.unpackEncodedStringToUnsignedChars(DFA90_maxS);
    static final short[] DFA90_accept = DFA.unpackEncodedString(DFA90_acceptS);
    static final short[] DFA90_special = DFA.unpackEncodedString(DFA90_specialS);
    static final short[][] DFA90_transition;

    static {
        int numStates = DFA90_transitionS.length;
        DFA90_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA90_transition[i] = DFA.unpackEncodedString(DFA90_transitionS[i]);
        }
    }

    class DFA90 extends DFA {

        public DFA90(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 90;
            this.eot = DFA90_eot;
            this.eof = DFA90_eof;
            this.min = DFA90_min;
            this.max = DFA90_max;
            this.accept = DFA90_accept;
            this.special = DFA90_special;
            this.transition = DFA90_transition;
        }
        public String getDescription() {
            return "211:67: (database_name= id DOT )?";
        }
    }
    static final String DFA115_eotS =
        "\72\uffff";
    static final String DFA115_eofS =
        "\72\uffff";
    static final String DFA115_minS =
        "\1\31\1\72\2\uffff\4\31\62\uffff";
    static final String DFA115_maxS =
        "\1\33\1\u00af\2\uffff\4\u00af\62\uffff";
    static final String DFA115_acceptS =
        "\2\uffff\1\2\5\uffff\1\1\61\uffff";
    static final String DFA115_specialS =
        "\72\uffff}>";
    static final String[] DFA115_transitionS = {
            "\1\1\1\uffff\1\2",
            "\22\10\1\6\1\10\1\uffff\2\10\1\2\30\10\1\7\44\10\1\4\25\10"+
            "\1\5\10\10\1\uffff\1\10",
            "",
            "",
            "\1\10\1\uffff\1\10\60\uffff\2\10\3\uffff\1\10\6\uffff\1\10"+
            "\45\uffff\1\2\5\uffff\1\10\12\uffff\1\10\2\uffff\1\10\22\uffff"+
            "\1\10\11\uffff\1\10",
            "\1\10\1\2\1\10\60\uffff\2\10\3\uffff\1\10\6\uffff\1\10\53\uffff"+
            "\1\10\12\uffff\1\10\2\uffff\1\10\22\uffff\1\10\11\uffff\1\10",
            "\1\10\1\2\1\10\60\uffff\2\10\3\uffff\1\10\6\uffff\1\10\53\uffff"+
            "\1\10\12\uffff\1\10\2\uffff\1\10\22\uffff\1\10\11\uffff\1\10",
            "\1\10\1\uffff\1\10\60\uffff\2\10\3\uffff\1\10\6\uffff\1\10"+
            "\45\uffff\1\2\5\uffff\1\10\12\uffff\1\10\2\uffff\1\10\22\uffff"+
            "\1\10\11\uffff\1\10",
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
            ""
    };

    static final short[] DFA115_eot = DFA.unpackEncodedString(DFA115_eotS);
    static final short[] DFA115_eof = DFA.unpackEncodedString(DFA115_eofS);
    static final char[] DFA115_min = DFA.unpackEncodedStringToUnsignedChars(DFA115_minS);
    static final char[] DFA115_max = DFA.unpackEncodedStringToUnsignedChars(DFA115_maxS);
    static final short[] DFA115_accept = DFA.unpackEncodedString(DFA115_acceptS);
    static final short[] DFA115_special = DFA.unpackEncodedString(DFA115_specialS);
    static final short[][] DFA115_transition;

    static {
        int numStates = DFA115_transitionS.length;
        DFA115_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA115_transition[i] = DFA.unpackEncodedString(DFA115_transitionS[i]);
        }
    }

    class DFA115 extends DFA {

        public DFA115(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 115;
            this.eot = DFA115_eot;
            this.eof = DFA115_eof;
            this.min = DFA115_min;
            this.max = DFA115_max;
            this.accept = DFA115_accept;
            this.special = DFA115_special;
            this.transition = DFA115_transition;
        }
        public String getDescription() {
            return "()* loopback of 254:23: ( COMMA column_def )*";
        }
    }
    static final String DFA118_eotS =
        "\15\uffff";
    static final String DFA118_eofS =
        "\15\uffff";
    static final String DFA118_minS =
        "\1\27\14\uffff";
    static final String DFA118_maxS =
        "\1\u00af\14\uffff";
    static final String DFA118_acceptS =
        "\1\uffff\1\1\1\2\12\uffff";
    static final String DFA118_specialS =
        "\15\uffff}>";
    static final String[] DFA118_transitionS = {
            "\1\2\1\uffff\1\2\1\uffff\1\2\60\uffff\2\2\3\uffff\1\2\6\uffff"+
            "\1\2\53\uffff\1\2\12\uffff\1\2\2\uffff\1\2\22\uffff\1\2\11\uffff"+
            "\1\1",
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
            ""
    };

    static final short[] DFA118_eot = DFA.unpackEncodedString(DFA118_eotS);
    static final short[] DFA118_eof = DFA.unpackEncodedString(DFA118_eofS);
    static final char[] DFA118_min = DFA.unpackEncodedStringToUnsignedChars(DFA118_minS);
    static final char[] DFA118_max = DFA.unpackEncodedStringToUnsignedChars(DFA118_maxS);
    static final short[] DFA118_accept = DFA.unpackEncodedString(DFA118_acceptS);
    static final short[] DFA118_special = DFA.unpackEncodedString(DFA118_specialS);
    static final short[][] DFA118_transition;

    static {
        int numStates = DFA118_transitionS.length;
        DFA118_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA118_transition[i] = DFA.unpackEncodedString(DFA118_transitionS[i]);
        }
    }

    class DFA118 extends DFA {

        public DFA118(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 118;
            this.eot = DFA118_eot;
            this.eof = DFA118_eof;
            this.min = DFA118_min;
            this.max = DFA118_max;
            this.accept = DFA118_accept;
            this.special = DFA118_special;
            this.transition = DFA118_transition;
        }
        public String getDescription() {
            return "259:32: ( type_name )?";
        }
    }
    static final String DFA119_eotS =
        "\14\uffff";
    static final String DFA119_eofS =
        "\14\uffff";
    static final String DFA119_minS =
        "\1\27\13\uffff";
    static final String DFA119_maxS =
        "\1\u00a5\13\uffff";
    static final String DFA119_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\7\uffff";
    static final String DFA119_specialS =
        "\14\uffff}>";
    static final String[] DFA119_transitionS = {
            "\1\1\1\uffff\1\1\1\uffff\1\1\60\uffff\2\4\3\uffff\1\4\6\uffff"+
            "\1\4\53\uffff\1\4\12\uffff\1\4\2\uffff\1\4\22\uffff\1\4",
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
            ""
    };

    static final short[] DFA119_eot = DFA.unpackEncodedString(DFA119_eotS);
    static final short[] DFA119_eof = DFA.unpackEncodedString(DFA119_eofS);
    static final char[] DFA119_min = DFA.unpackEncodedStringToUnsignedChars(DFA119_minS);
    static final char[] DFA119_max = DFA.unpackEncodedStringToUnsignedChars(DFA119_maxS);
    static final short[] DFA119_accept = DFA.unpackEncodedString(DFA119_acceptS);
    static final short[] DFA119_special = DFA.unpackEncodedString(DFA119_specialS);
    static final short[][] DFA119_transition;

    static {
        int numStates = DFA119_transitionS.length;
        DFA119_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA119_transition[i] = DFA.unpackEncodedString(DFA119_transitionS[i]);
        }
    }

    class DFA119 extends DFA {

        public DFA119(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 119;
            this.eot = DFA119_eot;
            this.eof = DFA119_eof;
            this.min = DFA119_min;
            this.max = DFA119_max;
            this.accept = DFA119_accept;
            this.special = DFA119_special;
            this.transition = DFA119_transition;
        }
        public String getDescription() {
            return "()* loopback of 259:43: ( column_constraint )*";
        }
    }
    static final String DFA122_eotS =
        "\17\uffff";
    static final String DFA122_eofS =
        "\17\uffff";
    static final String DFA122_minS =
        "\1\27\16\uffff";
    static final String DFA122_maxS =
        "\1\u00a5\16\uffff";
    static final String DFA122_acceptS =
        "\1\uffff\1\1\1\2\14\uffff";
    static final String DFA122_specialS =
        "\17\uffff}>";
    static final String[] DFA122_transitionS = {
            "\1\2\1\uffff\1\2\1\uffff\1\2\46\uffff\1\1\1\uffff\1\2\7\uffff"+
            "\2\2\3\uffff\1\2\6\uffff\1\2\3\uffff\1\1\47\uffff\1\2\4\uffff"+
            "\1\2\5\uffff\1\2\2\uffff\1\2\22\uffff\1\2",
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
            ""
    };

    static final short[] DFA122_eot = DFA.unpackEncodedString(DFA122_eotS);
    static final short[] DFA122_eof = DFA.unpackEncodedString(DFA122_eofS);
    static final char[] DFA122_min = DFA.unpackEncodedStringToUnsignedChars(DFA122_minS);
    static final char[] DFA122_max = DFA.unpackEncodedStringToUnsignedChars(DFA122_maxS);
    static final short[] DFA122_accept = DFA.unpackEncodedString(DFA122_acceptS);
    static final short[] DFA122_special = DFA.unpackEncodedString(DFA122_specialS);
    static final short[][] DFA122_transition;

    static {
        int numStates = DFA122_transitionS.length;
        DFA122_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA122_transition[i] = DFA.unpackEncodedString(DFA122_transitionS[i]);
        }
    }

    class DFA122 extends DFA {

        public DFA122(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 122;
            this.eot = DFA122_eot;
            this.eof = DFA122_eof;
            this.min = DFA122_min;
            this.max = DFA122_max;
            this.accept = DFA122_accept;
            this.special = DFA122_special;
            this.transition = DFA122_transition;
        }
        public String getDescription() {
            return "279:37: ( ASC | DESC )?";
        }
    }
    static final String DFA123_eotS =
        "\16\uffff";
    static final String DFA123_eofS =
        "\16\uffff";
    static final String DFA123_minS =
        "\1\27\15\uffff";
    static final String DFA123_maxS =
        "\1\u00a5\15\uffff";
    static final String DFA123_acceptS =
        "\1\uffff\1\1\1\2\13\uffff";
    static final String DFA123_specialS =
        "\16\uffff}>";
    static final String[] DFA123_transitionS = {
            "\1\2\1\uffff\1\2\1\uffff\1\2\50\uffff\1\2\7\uffff\2\2\3\uffff"+
            "\1\2\6\uffff\1\2\53\uffff\1\2\4\uffff\1\1\5\uffff\1\2\2\uffff"+
            "\1\2\22\uffff\1\2",
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
            ""
    };

    static final short[] DFA123_eot = DFA.unpackEncodedString(DFA123_eotS);
    static final short[] DFA123_eof = DFA.unpackEncodedString(DFA123_eofS);
    static final char[] DFA123_min = DFA.unpackEncodedStringToUnsignedChars(DFA123_minS);
    static final char[] DFA123_max = DFA.unpackEncodedStringToUnsignedChars(DFA123_maxS);
    static final short[] DFA123_accept = DFA.unpackEncodedString(DFA123_acceptS);
    static final short[] DFA123_special = DFA.unpackEncodedString(DFA123_specialS);
    static final short[][] DFA123_transition;

    static {
        int numStates = DFA123_transitionS.length;
        DFA123_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA123_transition[i] = DFA.unpackEncodedString(DFA123_transitionS[i]);
        }
    }

    class DFA123 extends DFA {

        public DFA123(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 123;
            this.eot = DFA123_eot;
            this.eof = DFA123_eof;
            this.min = DFA123_min;
            this.max = DFA123_max;
            this.accept = DFA123_accept;
            this.special = DFA123_special;
            this.transition = DFA123_transition;
        }
        public String getDescription() {
            return "279:51: ( table_conflict_clause )?";
        }
    }
    static final String DFA124_eotS =
        "\15\uffff";
    static final String DFA124_eofS =
        "\15\uffff";
    static final String DFA124_minS =
        "\1\27\14\uffff";
    static final String DFA124_maxS =
        "\1\u00a5\14\uffff";
    static final String DFA124_acceptS =
        "\1\uffff\1\1\1\2\12\uffff";
    static final String DFA124_specialS =
        "\15\uffff}>";
    static final String[] DFA124_transitionS = {
            "\1\2\1\uffff\1\2\1\uffff\1\2\50\uffff\1\1\7\uffff\2\2\3\uffff"+
            "\1\2\6\uffff\1\2\53\uffff\1\2\12\uffff\1\2\2\uffff\1\2\22\uffff"+
            "\1\2",
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
            ""
    };

    static final short[] DFA124_eot = DFA.unpackEncodedString(DFA124_eotS);
    static final short[] DFA124_eof = DFA.unpackEncodedString(DFA124_eofS);
    static final char[] DFA124_min = DFA.unpackEncodedStringToUnsignedChars(DFA124_minS);
    static final char[] DFA124_max = DFA.unpackEncodedStringToUnsignedChars(DFA124_maxS);
    static final short[] DFA124_accept = DFA.unpackEncodedString(DFA124_acceptS);
    static final short[] DFA124_special = DFA.unpackEncodedString(DFA124_specialS);
    static final short[][] DFA124_transition;

    static {
        int numStates = DFA124_transitionS.length;
        DFA124_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA124_transition[i] = DFA.unpackEncodedString(DFA124_transitionS[i]);
        }
    }

    class DFA124 extends DFA {

        public DFA124(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 124;
            this.eot = DFA124_eot;
            this.eof = DFA124_eof;
            this.min = DFA124_min;
            this.max = DFA124_max;
            this.accept = DFA124_accept;
            this.special = DFA124_special;
            this.transition = DFA124_transition;
        }
        public String getDescription() {
            return "279:74: ( AUTOINCREMENT )?";
        }
    }
    static final String DFA125_eotS =
        "\15\uffff";
    static final String DFA125_eofS =
        "\15\uffff";
    static final String DFA125_minS =
        "\1\27\14\uffff";
    static final String DFA125_maxS =
        "\1\u00a5\14\uffff";
    static final String DFA125_acceptS =
        "\1\uffff\1\1\1\2\12\uffff";
    static final String DFA125_specialS =
        "\15\uffff}>";
    static final String[] DFA125_transitionS = {
            "\1\2\1\uffff\1\2\1\uffff\1\2\60\uffff\2\2\3\uffff\1\2\6\uffff"+
            "\1\2\53\uffff\1\2\4\uffff\1\1\5\uffff\1\2\2\uffff\1\2\22\uffff"+
            "\1\2",
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
            ""
    };

    static final short[] DFA125_eot = DFA.unpackEncodedString(DFA125_eotS);
    static final short[] DFA125_eof = DFA.unpackEncodedString(DFA125_eofS);
    static final char[] DFA125_min = DFA.unpackEncodedStringToUnsignedChars(DFA125_minS);
    static final char[] DFA125_max = DFA.unpackEncodedStringToUnsignedChars(DFA125_maxS);
    static final short[] DFA125_accept = DFA.unpackEncodedString(DFA125_acceptS);
    static final short[] DFA125_special = DFA.unpackEncodedString(DFA125_specialS);
    static final short[][] DFA125_transition;

    static {
        int numStates = DFA125_transitionS.length;
        DFA125_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA125_transition[i] = DFA.unpackEncodedString(DFA125_transitionS[i]);
        }
    }

    class DFA125 extends DFA {

        public DFA125(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 125;
            this.eot = DFA125_eot;
            this.eof = DFA125_eof;
            this.min = DFA125_min;
            this.max = DFA125_max;
            this.accept = DFA125_accept;
            this.special = DFA125_special;
            this.transition = DFA125_transition;
        }
        public String getDescription() {
            return "281:38: ( table_conflict_clause )?";
        }
    }
    static final String DFA126_eotS =
        "\15\uffff";
    static final String DFA126_eofS =
        "\15\uffff";
    static final String DFA126_minS =
        "\1\27\14\uffff";
    static final String DFA126_maxS =
        "\1\u00a5\14\uffff";
    static final String DFA126_acceptS =
        "\1\uffff\1\1\1\2\12\uffff";
    static final String DFA126_specialS =
        "\15\uffff}>";
    static final String[] DFA126_transitionS = {
            "\1\2\1\uffff\1\2\1\uffff\1\2\60\uffff\2\2\3\uffff\1\2\6\uffff"+
            "\1\2\53\uffff\1\2\4\uffff\1\1\5\uffff\1\2\2\uffff\1\2\22\uffff"+
            "\1\2",
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
            ""
    };

    static final short[] DFA126_eot = DFA.unpackEncodedString(DFA126_eotS);
    static final short[] DFA126_eof = DFA.unpackEncodedString(DFA126_eofS);
    static final char[] DFA126_min = DFA.unpackEncodedStringToUnsignedChars(DFA126_minS);
    static final char[] DFA126_max = DFA.unpackEncodedStringToUnsignedChars(DFA126_maxS);
    static final short[] DFA126_accept = DFA.unpackEncodedString(DFA126_acceptS);
    static final short[] DFA126_special = DFA.unpackEncodedString(DFA126_specialS);
    static final short[][] DFA126_transition;

    static {
        int numStates = DFA126_transitionS.length;
        DFA126_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA126_transition[i] = DFA.unpackEncodedString(DFA126_transitionS[i]);
        }
    }

    class DFA126 extends DFA {

        public DFA126(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 126;
            this.eot = DFA126_eot;
            this.eof = DFA126_eof;
            this.min = DFA126_min;
            this.max = DFA126_max;
            this.accept = DFA126_accept;
            this.special = DFA126_special;
            this.transition = DFA126_transition;
        }
        public String getDescription() {
            return "283:35: ( table_conflict_clause )?";
        }
    }
    static final String DFA136_eotS =
        "\17\uffff";
    static final String DFA136_eofS =
        "\17\uffff";
    static final String DFA136_minS =
        "\1\27\16\uffff";
    static final String DFA136_maxS =
        "\1\u00a5\16\uffff";
    static final String DFA136_acceptS =
        "\1\uffff\1\2\13\uffff\1\1\1\uffff";
    static final String DFA136_specialS =
        "\17\uffff}>";
    static final String[] DFA136_transitionS = {
            "\1\1\1\uffff\1\1\1\uffff\1\1\60\uffff\2\1\3\uffff\1\1\6\uffff"+
            "\2\1\50\uffff\1\15\1\uffff\1\1\4\uffff\1\15\5\uffff\1\1\2\uffff"+
            "\1\1\22\uffff\1\1",
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
            ""
    };

    static final short[] DFA136_eot = DFA.unpackEncodedString(DFA136_eotS);
    static final short[] DFA136_eof = DFA.unpackEncodedString(DFA136_eofS);
    static final char[] DFA136_min = DFA.unpackEncodedStringToUnsignedChars(DFA136_minS);
    static final char[] DFA136_max = DFA.unpackEncodedStringToUnsignedChars(DFA136_maxS);
    static final short[] DFA136_accept = DFA.unpackEncodedString(DFA136_acceptS);
    static final short[] DFA136_special = DFA.unpackEncodedString(DFA136_specialS);
    static final short[][] DFA136_transition;

    static {
        int numStates = DFA136_transitionS.length;
        DFA136_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA136_transition[i] = DFA.unpackEncodedString(DFA136_transitionS[i]);
        }
    }

    class DFA136 extends DFA {

        public DFA136(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 136;
            this.eot = DFA136_eot;
            this.eof = DFA136_eof;
            this.min = DFA136_min;
            this.max = DFA136_max;
            this.accept = DFA136_accept;
            this.special = DFA136_special;
            this.transition = DFA136_transition;
        }
        public String getDescription() {
            return "()+ loopback of 304:3: ( fk_clause_action )+";
        }
    }
    static final String DFA137_eotS =
        "\17\uffff";
    static final String DFA137_eofS =
        "\17\uffff";
    static final String DFA137_minS =
        "\1\27\1\131\15\uffff";
    static final String DFA137_maxS =
        "\1\u00a5\1\u0086\15\uffff";
    static final String DFA137_acceptS =
        "\2\uffff\1\1\1\2\13\uffff";
    static final String DFA137_specialS =
        "\17\uffff}>";
    static final String[] DFA137_transitionS = {
            "\1\3\1\uffff\1\3\1\uffff\1\3\60\uffff\2\3\3\uffff\1\3\6\uffff"+
            "\1\3\1\2\52\uffff\1\1\12\uffff\1\3\2\uffff\1\3\22\uffff\1\3",
            "\1\2\54\uffff\1\3",
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
            ""
    };

    static final short[] DFA137_eot = DFA.unpackEncodedString(DFA137_eotS);
    static final short[] DFA137_eof = DFA.unpackEncodedString(DFA137_eofS);
    static final char[] DFA137_min = DFA.unpackEncodedStringToUnsignedChars(DFA137_minS);
    static final char[] DFA137_max = DFA.unpackEncodedStringToUnsignedChars(DFA137_maxS);
    static final short[] DFA137_accept = DFA.unpackEncodedString(DFA137_acceptS);
    static final short[] DFA137_special = DFA.unpackEncodedString(DFA137_specialS);
    static final short[][] DFA137_transition;

    static {
        int numStates = DFA137_transitionS.length;
        DFA137_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA137_transition[i] = DFA.unpackEncodedString(DFA137_transitionS[i]);
        }
    }

    class DFA137 extends DFA {

        public DFA137(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 137;
            this.eot = DFA137_eot;
            this.eof = DFA137_eof;
            this.min = DFA137_min;
            this.max = DFA137_max;
            this.accept = DFA137_accept;
            this.special = DFA137_special;
            this.transition = DFA137_transition;
        }
        public String getDescription() {
            return "304:21: ( fk_clause_deferrable )?";
        }
    }
    static final String DFA141_eotS =
        "\17\uffff";
    static final String DFA141_eofS =
        "\17\uffff";
    static final String DFA141_minS =
        "\1\27\1\132\15\uffff";
    static final String DFA141_maxS =
        "\1\u00a5\1\161\15\uffff";
    static final String DFA141_acceptS =
        "\2\uffff\1\3\12\uffff\1\1\1\2";
    static final String DFA141_specialS =
        "\17\uffff}>";
    static final String[] DFA141_transitionS = {
            "\1\2\1\uffff\1\2\1\uffff\1\2\60\uffff\2\2\3\uffff\1\2\6\uffff"+
            "\1\2\34\uffff\1\1\16\uffff\1\2\12\uffff\1\2\2\uffff\1\2\22\uffff"+
            "\1\2",
            "\1\15\26\uffff\1\16",
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
            ""
    };

    static final short[] DFA141_eot = DFA.unpackEncodedString(DFA141_eotS);
    static final short[] DFA141_eof = DFA.unpackEncodedString(DFA141_eofS);
    static final char[] DFA141_min = DFA.unpackEncodedStringToUnsignedChars(DFA141_minS);
    static final char[] DFA141_max = DFA.unpackEncodedStringToUnsignedChars(DFA141_maxS);
    static final short[] DFA141_accept = DFA.unpackEncodedString(DFA141_acceptS);
    static final short[] DFA141_special = DFA.unpackEncodedString(DFA141_specialS);
    static final short[][] DFA141_transition;

    static {
        int numStates = DFA141_transitionS.length;
        DFA141_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA141_transition[i] = DFA.unpackEncodedString(DFA141_transitionS[i]);
        }
    }

    class DFA141 extends DFA {

        public DFA141(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 141;
            this.eot = DFA141_eot;
            this.eof = DFA141_eof;
            this.min = DFA141_min;
            this.max = DFA141_max;
            this.accept = DFA141_accept;
            this.special = DFA141_special;
            this.transition = DFA141_transition;
        }
        public String getDescription() {
            return "310:41: ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?";
        }
    }
    static final String DFA161_eotS =
        "\14\uffff";
    static final String DFA161_eofS =
        "\14\uffff";
    static final String DFA161_minS =
        "\1\72\1\30\12\uffff";
    static final String DFA161_maxS =
        "\1\u00af\1\u00a6\12\uffff";
    static final String DFA161_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\7\uffff";
    static final String DFA161_specialS =
        "\14\uffff}>";
    static final String[] DFA161_transitionS = {
            "\65\2\1\1\76\2\1\uffff\1\2",
            "\1\2\43\uffff\1\2\10\uffff\1\2\25\uffff\1\2\33\uffff\2\2\13"+
            "\uffff\1\4\41\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA161_eot = DFA.unpackEncodedString(DFA161_eotS);
    static final short[] DFA161_eof = DFA.unpackEncodedString(DFA161_eofS);
    static final char[] DFA161_min = DFA.unpackEncodedStringToUnsignedChars(DFA161_minS);
    static final char[] DFA161_max = DFA.unpackEncodedStringToUnsignedChars(DFA161_maxS);
    static final short[] DFA161_accept = DFA.unpackEncodedString(DFA161_acceptS);
    static final short[] DFA161_special = DFA.unpackEncodedString(DFA161_specialS);
    static final short[][] DFA161_transition;

    static {
        int numStates = DFA161_transitionS.length;
        DFA161_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA161_transition[i] = DFA.unpackEncodedString(DFA161_transitionS[i]);
        }
    }

    class DFA161 extends DFA {

        public DFA161(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 161;
            this.eot = DFA161_eot;
            this.eof = DFA161_eof;
            this.min = DFA161_min;
            this.max = DFA161_max;
            this.accept = DFA161_accept;
            this.special = DFA161_special;
            this.transition = DFA161_transition;
        }
        public String getDescription() {
            return "335:48: ( IF NOT EXISTS )?";
        }
    }
    static final String DFA162_eotS =
        "\21\uffff";
    static final String DFA162_eofS =
        "\21\uffff";
    static final String DFA162_minS =
        "\1\72\2\30\16\uffff";
    static final String DFA162_maxS =
        "\1\u00af\2\u00a6\16\uffff";
    static final String DFA162_acceptS =
        "\3\uffff\1\2\5\uffff\1\1\7\uffff";
    static final String DFA162_specialS =
        "\21\uffff}>";
    static final String[] DFA162_transitionS = {
            "\164\2\1\uffff\1\1",
            "\1\11\43\uffff\1\3\10\uffff\1\3\25\uffff\1\3\33\uffff\2\3\55"+
            "\uffff\1\3",
            "\1\11\43\uffff\1\3\10\uffff\1\3\25\uffff\1\3\33\uffff\2\3\55"+
            "\uffff\1\3",
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
            ""
    };

    static final short[] DFA162_eot = DFA.unpackEncodedString(DFA162_eotS);
    static final short[] DFA162_eof = DFA.unpackEncodedString(DFA162_eofS);
    static final char[] DFA162_min = DFA.unpackEncodedStringToUnsignedChars(DFA162_minS);
    static final char[] DFA162_max = DFA.unpackEncodedStringToUnsignedChars(DFA162_maxS);
    static final short[] DFA162_accept = DFA.unpackEncodedString(DFA162_acceptS);
    static final short[] DFA162_special = DFA.unpackEncodedString(DFA162_specialS);
    static final short[][] DFA162_transition;

    static {
        int numStates = DFA162_transitionS.length;
        DFA162_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA162_transition[i] = DFA.unpackEncodedString(DFA162_transitionS[i]);
        }
    }

    class DFA162 extends DFA {

        public DFA162(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 162;
            this.eot = DFA162_eot;
            this.eof = DFA162_eof;
            this.min = DFA162_min;
            this.max = DFA162_max;
            this.accept = DFA162_accept;
            this.special = DFA162_special;
            this.transition = DFA162_transition;
        }
        public String getDescription() {
            return "335:65: (database_name= id DOT )?";
        }
    }
 

    public static final BitSet FOLLOW_sql_stmt_in_sql_stmt_list130 = new BitSet(new long[]{0xC000000000000002L,0x00800084A8048048L,0x000001401AB04000L});
    public static final BitSet FOLLOW_EXPLAIN_in_sql_stmt140 = new BitSet(new long[]{0xC000000000800000L,0x00800084A8048048L,0x000001401AB14000L});
    public static final BitSet FOLLOW_QUERY_in_sql_stmt143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_PLAN_in_sql_stmt145 = new BitSet(new long[]{0xC000000000800000L,0x00800084A8048048L,0x000001401AB04000L});
    public static final BitSet FOLLOW_sql_stmt_core_in_sql_stmt151 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMI_in_sql_stmt153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_stmt_in_sql_stmt_core164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attach_stmt_in_sql_stmt_core170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_detach_stmt_in_sql_stmt_core176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_analyze_stmt_in_sql_stmt_core182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reindex_stmt_in_sql_stmt_core188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vacuum_stmt_in_sql_stmt_core194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_sql_stmt_core203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_stmt_in_sql_stmt_core209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_stmt_in_sql_stmt_core215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_stmt_in_sql_stmt_core221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_stmt_in_sql_stmt_core227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commit_stmt_in_sql_stmt_core233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rollback_stmt_in_sql_stmt_core239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_savepoint_stmt_in_sql_stmt_core245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_release_stmt_in_sql_stmt_core251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_virtual_table_stmt_in_sql_stmt_core260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_table_stmt_in_sql_stmt_core266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_table_stmt_in_sql_stmt_core272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alter_table_stmt_in_sql_stmt_core278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_view_stmt_in_sql_stmt_core284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_view_stmt_in_sql_stmt_core290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_index_stmt_in_sql_stmt_core296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_index_stmt_in_sql_stmt_core302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_trigger_stmt_in_sql_stmt_core308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_trigger_stmt_in_sql_stmt_core314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_qualified_table_name324 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_qualified_table_name326 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_qualified_table_name332 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INDEXED_in_qualified_table_name335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_qualified_table_name337 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_qualified_table_name341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_qualified_table_name345 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_INDEXED_in_qualified_table_name347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_subexpr_in_expr356 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OR_in_expr359 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_or_subexpr_in_expr362 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_and_subexpr_in_or_subexpr371 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_AND_in_or_subexpr374 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_and_subexpr_in_or_subexpr377 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr386 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_set_in_and_subexpr392 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr408 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_NOT_in_and_subexpr417 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000000000080005L});
    public static final BitSet FOLLOW_set_in_and_subexpr421 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr437 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_ESCAPE_in_and_subexpr440 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_and_subexpr451 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_IN_in_and_subexpr455 = new BitSet(new long[]{0xFC00000004000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_LPAREN_in_and_subexpr458 = new BitSet(new long[]{0xFC000000FC0E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_select_stmt_in_and_subexpr461 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_expr_in_and_subexpr465 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_and_subexpr468 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_and_subexpr470 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_and_subexpr476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_and_subexpr483 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_and_subexpr485 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_and_subexpr491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISNULL_in_and_subexpr499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTNULL_in_and_subexpr503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_and_subexpr507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_and_subexpr509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_and_subexpr514 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_and_subexpr516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_and_subexpr518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_and_subexpr526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_BETWEEN_in_and_subexpr530 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_AND_in_and_subexpr534 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_neq_subexpr_in_eq_subexpr543 = new BitSet(new long[]{0x0000000000000F02L});
    public static final BitSet FOLLOW_set_in_eq_subexpr546 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_neq_subexpr_in_eq_subexpr563 = new BitSet(new long[]{0x0000000000000F02L});
    public static final BitSet FOLLOW_bit_subexpr_in_neq_subexpr572 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_set_in_neq_subexpr575 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_bit_subexpr_in_neq_subexpr592 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_add_subexpr_in_bit_subexpr601 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_set_in_bit_subexpr604 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_add_subexpr_in_bit_subexpr613 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_mul_subexpr_in_add_subexpr622 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_set_in_add_subexpr625 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_mul_subexpr_in_add_subexpr638 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_con_subexpr_in_mul_subexpr647 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_DOUBLE_PIPE_in_mul_subexpr650 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_con_subexpr_in_mul_subexpr653 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_set_in_con_subexpr662 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_unary_subexpr_in_con_subexpr679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_expr_in_unary_subexpr686 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_COLLATE_in_unary_subexpr689 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_unary_subexpr694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_value_in_atom_expr706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bind_parameter_in_atom_expr712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_atom_expr722 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_atom_expr724 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_atom_expr730 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_atom_expr732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_atom_expr738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom_expr746 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr748 = new BitSet(new long[]{0xFC000000FC1E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_DISTINCT_in_atom_expr752 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr758 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_atom_expr761 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr765 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_ASTERISK_in_atom_expr771 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr781 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr783 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_atom_expr795 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr797 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_atom_expr801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_type_name_in_atom_expr803 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXISTS_in_atom_expr814 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_atom_expr820 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_atom_expr828 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_WHEN_in_atom_expr836 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_THEN_in_atom_expr840 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr842 = new BitSet(new long[]{0x0000000000000000L,0x0000000600000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_ELSE_in_atom_expr847 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr849 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_END_in_atom_expr853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raise_function_in_atom_expr859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal_value0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_signed_number0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bind_parameter919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bind_parameter925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_bind_parameter929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_bind_parameter935 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_bind_parameter937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_bind_parameter943 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_bind_parameter945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLAR_in_bind_parameter951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_TCL_ID_in_bind_parameter955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_name964 = new BitSet(new long[]{0x0000000004000002L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_LPAREN_in_type_name968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0034000000000000L});
    public static final BitSet FOLLOW_signed_number_in_type_name972 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_type_name975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0034000000000000L});
    public static final BitSet FOLLOW_signed_number_in_type_name979 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_type_name983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAISE_in_raise_function1014 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_raise_function1016 = new BitSet(new long[]{0x0400000000000000L,0x0001010000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_IGNORE_in_raise_function1019 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_set_in_raise_function1023 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COMMA_in_raise_function1035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_STRING_in_raise_function1039 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_raise_function1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_in_pragma_stmt1050 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_pragma_stmt1055 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_pragma_stmt1057 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_pragma_stmt1063 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_EQUALS_in_pragma_stmt1066 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0036BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_pragma_value_in_pragma_stmt1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_pragma_stmt1072 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0036BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_pragma_value_in_pragma_stmt1074 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_pragma_stmt1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signed_number_in_pragma_value1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_pragma_value1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_pragma_value1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTACH_in_attach_stmt1103 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0002BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_DATABASE_in_attach_stmt1106 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0002BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_STRING_in_attach_stmt1113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_attach_stmt1117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_attach_stmt1120 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_attach_stmt1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DETACH_in_detach_stmt1132 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_DATABASE_in_detach_stmt1135 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_detach_stmt1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANALYZE_in_analyze_stmt1149 = new BitSet(new long[]{0xFC00000000000002L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_analyze_stmt1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_analyze_stmt1160 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_analyze_stmt1162 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_analyze_stmt1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REINDEX_in_reindex_stmt1176 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_reindex_stmt1181 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_reindex_stmt1183 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_reindex_stmt1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VACUUM_in_vacuum_stmt1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_operation_conflict_clause1208 = new BitSet(new long[]{0x0400000000000000L,0x0001010000000000L,0x0000000002800000L});
    public static final BitSet FOLLOW_set_in_operation_conflict_clause1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_ordering_term1235 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000004L});
    public static final BitSet FOLLOW_ASC_in_ordering_term1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_ordering_term1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_operation_limited_clause1274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_operation_limited_clause1276 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_operation_limited_clause1278 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_operation_limited_clause1281 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_operation_limited_clause1283 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_operation_limited_clause1291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_operation_limited_clause1295 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_set_in_operation_limited_clause1298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_operation_limited_clause1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_list_in_select_stmt1318 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_ORDER_in_select_stmt1323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_select_stmt1325 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt1327 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt1330 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt1332 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_select_stmt1341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt1345 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_OFFSET_in_select_stmt1349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt1353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_core_in_select_list1403 = new BitSet(new long[]{0x0000000000000002L,0x0200001000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_select_op_in_select_list1406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_core_in_select_list1409 = new BitSet(new long[]{0x0000000000000002L,0x0200001000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_UNION_in_select_op1418 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ALL_in_select_op1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERSECT_in_select_op1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCEPT_in_select_op1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_core1441 = new BitSet(new long[]{0xFC000000F41E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ALL_in_select_core1444 = new BitSet(new long[]{0xFC000000F41E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_DISTINCT_in_select_core1448 = new BitSet(new long[]{0xFC000000F41E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_result_column_in_select_core1452 = new BitSet(new long[]{0x0000000002000002L,0x0000280000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_core1455 = new BitSet(new long[]{0xFC000000F41E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_result_column_in_select_core1457 = new BitSet(new long[]{0x0000000002000002L,0x0000280000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_FROM_in_select_core1462 = new BitSet(new long[]{0xFC00000004000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_join_source_in_select_core1464 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_WHERE_in_select_core1469 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_select_core1473 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_GROUP_in_select_core1481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_select_core1483 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_select_core1485 = new BitSet(new long[]{0x0000000002000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_core1488 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_select_core1490 = new BitSet(new long[]{0x0000000002000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_HAVING_in_select_core1495 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_select_core1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_result_column1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_result_column1577 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_result_column1579 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ASTERISK_in_result_column1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_result_column1596 = new BitSet(new long[]{0xFC00000000000002L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_AS_in_result_column1600 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_result_column1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_source_in_join_source1627 = new BitSet(new long[]{0x0000000002000002L,0xA040000000080000L,0x0000000000001008L});
    public static final BitSet FOLLOW_join_op_in_join_source1630 = new BitSet(new long[]{0xFC00000004000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_single_source_in_join_source1633 = new BitSet(new long[]{0x0000000002000002L,0xA040000000080000L,0x0000008000001208L});
    public static final BitSet FOLLOW_join_constraint_in_join_source1636 = new BitSet(new long[]{0x0000000002000002L,0xA040000000080000L,0x0000000000001008L});
    public static final BitSet FOLLOW_id_in_single_source1653 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_single_source1655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_single_source1661 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000002L,0x0000800000000010L});
    public static final BitSet FOLLOW_AS_in_single_source1665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_single_source1671 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INDEXED_in_single_source1676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_single_source1678 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_single_source1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_single_source1686 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_INDEXED_in_single_source1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_single_source1729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_single_source1731 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_single_source1733 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_AS_in_single_source1737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_single_source1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_single_source1765 = new BitSet(new long[]{0xFC00000004000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_join_source_in_single_source1768 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_single_source1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_join_op1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATURAL_in_join_op1788 = new BitSet(new long[]{0x0000000000000000L,0xA040000000080000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LEFT_in_join_op1794 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_OUTER_in_join_op1799 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_INNER_in_join_op1805 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_CROSS_in_join_op1809 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_JOIN_in_join_op1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_join_constraint1823 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_join_constraint1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_join_constraint1832 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_join_constraint1834 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_join_constraint1838 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_join_constraint1841 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_join_constraint1845 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_join_constraint1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_stmt1868 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_operation_conflict_clause_in_insert_stmt1871 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_REPLACE_in_insert_stmt1877 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_INTO_in_insert_stmt1880 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_insert_stmt1885 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_insert_stmt1887 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_insert_stmt1893 = new BitSet(new long[]{0x0000000004000000L,0x0000000001000000L,0x0000020010000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt1900 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_insert_stmt1904 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt1907 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_insert_stmt1911 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt1915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020010000000L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt1924 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt1926 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_insert_stmt1930 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt1933 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_insert_stmt1937 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_insert_stmt1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_insert_stmt1952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update_stmt1964 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_operation_conflict_clause_in_update_stmt1967 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_qualified_table_name_in_update_stmt1971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_SET_in_update_stmt1975 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_update_set_in_update_stmt1979 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000200000000802L});
    public static final BitSet FOLLOW_COMMA_in_update_stmt1982 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_update_set_in_update_stmt1986 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000200000000802L});
    public static final BitSet FOLLOW_WHERE_in_update_stmt1991 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_update_stmt1993 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_operation_limited_clause_in_update_stmt1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_update_set2009 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQUALS_in_update_set2011 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_update_set2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_stmt2021 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_FROM_in_delete_stmt2023 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_qualified_table_name_in_delete_stmt2025 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000802L});
    public static final BitSet FOLLOW_WHERE_in_delete_stmt2028 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_delete_stmt2030 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_operation_limited_clause_in_delete_stmt2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_begin_stmt2045 = new BitSet(new long[]{0x0000000000000002L,0x0002002004000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_set_in_begin_stmt2047 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_begin_stmt2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_commit_stmt2071 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_commit_stmt2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROLLBACK_in_rollback_stmt2090 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_rollback_stmt2093 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_TO_in_rollback_stmt2098 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_SAVEPOINT_in_rollback_stmt2101 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_rollback_stmt2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVEPOINT_in_savepoint_stmt2117 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_savepoint_stmt2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELEASE_in_release_stmt2129 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_SAVEPOINT_in_release_stmt2132 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_release_stmt2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_table_conflict_clause2150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_CONFLICT_in_table_conflict_clause2153 = new BitSet(new long[]{0x0400000000000000L,0x0001010000000000L,0x0000000002800000L});
    public static final BitSet FOLLOW_set_in_table_conflict_clause2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_virtual_table_stmt2183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_VIRTUAL_in_create_virtual_table_stmt2185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_create_virtual_table_stmt2187 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2192 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_virtual_table_stmt2194 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_USING_in_create_virtual_table_stmt2204 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2208 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_LPAREN_in_create_virtual_table_stmt2211 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_virtual_table_stmt2213 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_virtual_table_stmt2216 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_virtual_table_stmt2218 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_virtual_table_stmt2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_table_stmt2232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_table_stmt2234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_create_table_stmt2237 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_create_table_stmt2240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_table_stmt2242 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_table_stmt2244 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_table_stmt2251 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_table_stmt2253 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_table_stmt2259 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_create_table_stmt2265 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_table_stmt2267 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_table_stmt2270 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_table_stmt2272 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_table_stmt2277 = new BitSet(new long[]{0x0000000000000000L,0x0000040000021000L,0x0000002000008000L});
    public static final BitSet FOLLOW_table_constraint_in_create_table_stmt2279 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_table_stmt2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_create_table_stmt2289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_create_table_stmt2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_column_def_in_column_def2347 = new BitSet(new long[]{0x0000000000000002L,0x0000000001023000L,0x0000802000048010L});
    public static final BitSet FOLLOW_type_name_in_column_def2349 = new BitSet(new long[]{0x0000000000000002L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_column_constraint_in_column_def2352 = new BitSet(new long[]{0x0000000000000002L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_CONSTRAINT_in_column_constraint2378 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_column_constraint2382 = new BitSet(new long[]{0x0000000000000000L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_column_constraint_pk_in_column_constraint2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_not_null_in_column_constraint2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_unique_in_column_constraint2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_check_in_column_constraint2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_default_in_column_constraint2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_collate_in_column_constraint2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fk_clause_in_column_constraint2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_in_column_constraint_pk2481 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_KEY_in_column_constraint_pk2484 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000014L,0x0000000000000200L});
    public static final BitSet FOLLOW_set_in_column_constraint_pk2487 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_pk2496 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_AUTOINCREMENT_in_column_constraint_pk2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_column_constraint_not_null2509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_column_constraint_not_null2511 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_not_null2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_column_constraint_unique2530 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_unique2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECK_in_column_constraint_check2541 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_column_constraint_check2544 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_column_constraint_check2547 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_column_constraint_check2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_column_constraint_default2557 = new BitSet(new long[]{0x0000000004000000L,0x0000000000700000L,0x0076000000000040L});
    public static final BitSet FOLLOW_SIGNED_NUMBER_in_column_constraint_default2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_value_in_column_constraint_default2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_column_constraint_default2569 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_column_constraint_default2572 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_column_constraint_default2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLATE_in_column_constraint_collate2583 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_column_constraint_collate2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRAINT_in_table_constraint2597 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint2601 = new BitSet(new long[]{0x0000000000000000L,0x0000040000021000L,0x0000002000008000L});
    public static final BitSet FOLLOW_table_constraint_pk_in_table_constraint2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_check_in_table_constraint2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_fk_in_table_constraint2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_in_table_constraint_pk2630 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_KEY_in_table_constraint_pk2632 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_UNIQUE_in_table_constraint_pk2636 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_pk2639 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_pk2643 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_pk2646 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_pk2650 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_pk2654 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_table_constraint_pk2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECK_in_table_constraint_check2666 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_check2668 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_table_constraint_check2670 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_check2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREIGN_in_table_constraint_fk2679 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_KEY_in_table_constraint_fk2681 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_fk2683 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_fk2687 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_fk2690 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_fk2694 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_fk2698 = new BitSet(new long[]{0x0000000000000000L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_fk_clause_in_table_constraint_fk2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCES_in_fk_clause2707 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_fk_clause2712 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000204L});
    public static final BitSet FOLLOW_LPAREN_in_fk_clause2715 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_fk_clause2719 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_fk_clause2722 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_fk_clause2726 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_fk_clause2730 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000204L});
    public static final BitSet FOLLOW_fk_clause_action_in_fk_clause2736 = new BitSet(new long[]{0x0000000004000002L,0x0000000002000000L,0x0000000000000214L});
    public static final BitSet FOLLOW_fk_clause_deferrable_in_fk_clause2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_fk_clause_action2750 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_set_in_fk_clause_action2752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L,0x0000000021000000L});
    public static final BitSet FOLLOW_SET_in_fk_clause_action2765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_fk_clause_action2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_fk_clause_action2771 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_DEFAULT_in_fk_clause_action2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASCADE_in_fk_clause_action2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESTRICT_in_fk_clause_action2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCH_in_fk_clause_action2788 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_fk_clause_action2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_fk_clause_deferrable2800 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_DEFERRABLE_in_fk_clause_deferrable2804 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_INITIALLY_in_fk_clause_deferrable2807 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_DEFERRED_in_fk_clause_deferrable2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITIALLY_in_fk_clause_deferrable2813 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IMMEDIATE_in_fk_clause_deferrable2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_table_stmt2825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_drop_table_stmt2827 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_drop_table_stmt2830 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_table_stmt2832 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_table_stmt2839 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_table_stmt2841 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_table_stmt2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALTER_in_alter_table_stmt2877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_alter_table_stmt2879 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt2884 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_alter_table_stmt2886 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt2892 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RENAME_in_alter_table_stmt2895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_TO_in_alter_table_stmt2897 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_alter_table_stmt2905 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_COLUMN_in_alter_table_stmt2908 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_alter_table_stmt2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_view_stmt2921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040080000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_view_stmt2923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_VIEW_in_create_view_stmt2926 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_create_view_stmt2929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_view_stmt2931 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_view_stmt2933 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_view_stmt2940 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_view_stmt2942 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_view_stmt2948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_create_view_stmt2950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_create_view_stmt2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_view_stmt2960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_VIEW_in_drop_view_stmt2962 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_drop_view_stmt2965 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_view_stmt2967 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_view_stmt2974 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_view_stmt2976 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_view_stmt2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_index_stmt2990 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_UNIQUE_in_create_index_stmt2993 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_INDEX_in_create_index_stmt2997 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_create_index_stmt3000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_index_stmt3002 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_index_stmt3004 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3011 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_index_stmt3013 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ON_in_create_index_stmt3023 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3027 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_create_index_stmt3029 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_indexed_column_in_create_index_stmt3033 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_index_stmt3036 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_indexed_column_in_create_index_stmt3040 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_index_stmt3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_indexed_column3053 = new BitSet(new long[]{0x0000000000000002L,0x0000000010002004L});
    public static final BitSet FOLLOW_COLLATE_in_indexed_column3056 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_indexed_column3060 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000004L});
    public static final BitSet FOLLOW_set_in_indexed_column3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_index_stmt3079 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_INDEX_in_drop_index_stmt3081 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_drop_index_stmt3084 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_index_stmt3086 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_index_stmt3093 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_index_stmt3095 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_index_stmt3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_trigger_stmt3109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000880000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_trigger_stmt3111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_TRIGGER_in_create_trigger_stmt3114 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_create_trigger_stmt3117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_trigger_stmt3119 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_trigger_stmt3121 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3128 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_trigger_stmt3130 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3136 = new BitSet(new long[]{0x1000000000000000L,0x0180000008000020L,0x0000004000000000L});
    public static final BitSet FOLLOW_BEFORE_in_create_trigger_stmt3141 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_AFTER_in_create_trigger_stmt3145 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_INSTEAD_in_create_trigger_stmt3149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_OF_in_create_trigger_stmt3151 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_DELETE_in_create_trigger_stmt3156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INSERT_in_create_trigger_stmt3160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_UPDATE_in_create_trigger_stmt3164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_OF_in_create_trigger_stmt3167 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3171 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_create_trigger_stmt3174 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3178 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ON_in_create_trigger_stmt3187 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3191 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000040L,0x0000100000000000L});
    public static final BitSet FOLLOW_FOR_in_create_trigger_stmt3194 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_EACH_in_create_trigger_stmt3196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ROW_in_create_trigger_stmt3198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000100000000000L});
    public static final BitSet FOLLOW_WHEN_in_create_trigger_stmt3203 = new BitSet(new long[]{0xFC000000F40E0000L,0xFFFFFFFFFFFFFFFFL,0x0056BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_create_trigger_stmt3205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_BEGIN_in_create_trigger_stmt3211 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004010800000L});
    public static final BitSet FOLLOW_update_stmt_in_create_trigger_stmt3215 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_insert_stmt_in_create_trigger_stmt3219 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_delete_stmt_in_create_trigger_stmt3223 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_select_stmt_in_create_trigger_stmt3227 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMI_in_create_trigger_stmt3230 = new BitSet(new long[]{0x0000000000000000L,0x0080000408000000L,0x0000004010800000L});
    public static final BitSet FOLLOW_END_in_create_trigger_stmt3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_trigger_stmt3242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_TRIGGER_in_drop_trigger_stmt3244 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_drop_trigger_stmt3247 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_trigger_stmt3249 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_trigger_stmt3256 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_trigger_stmt3258 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_trigger_stmt3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_id3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_column_def3992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_column_def_in_id_column_def3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword_column_def4003 = new BitSet(new long[]{0x0000000000000002L});

}