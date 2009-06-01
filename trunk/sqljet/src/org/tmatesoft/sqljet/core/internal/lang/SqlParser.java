// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 SqlParser.g 2009-06-01 13:47:20

  package org.tmatesoft.sqljet.core.internal.lang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class SqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "EQUALS", "EQUALS2", "NOT_EQUALS", "NOT_EQUALS2", "LESS", "LESS_OR_EQ", "GREATER", "GREATER_OR_EQ", "SHIFT_LEFT", "SHIFT_RIGHT", "AMPERSAND", "PIPE", "DOUBLE_PIPE", "PLUS", "MINUS", "TILDA", "ASTERISK", "SLASH", "PERCENT", "SEMI", "DOT", "COMMA", "LPAREN", "RPAREN", "QUESTION", "COLON", "AT", "DOLLAR", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "ABORT", "ADD", "AFTER", "ALL", "ALTER", "ANALYZE", "AND", "AS", "ASC", "ATTACH", "AUTOINCREMENT", "BEFORE", "BEGIN", "BETWEEN", "BY", "CASCADE", "CASE", "CAST", "CHECK", "COLLATE", "COLUMN", "COMMIT", "CONFLICT", "CONSTRAINT", "CREATE", "CROSS", "CURRENT_TIME", "CURRENT_DATE", "CURRENT_TIMESTAMP", "DATABASE", "DEFAULT", "DEFERRABLE", "DEFERRED", "DELETE", "DESC", "DETACH", "DISTINCT", "DROP", "EACH", "ELSE", "END", "ESCAPE", "EXCEPT", "EXCLUSIVE", "EXISTS", "EXPLAIN", "FAIL", "FOR", "FOREIGN", "FROM", "GLOB", "GROUP", "HAVING", "IF", "IGNORE", "IMMEDIATE", "IN", "INDEX", "INDEXED", "INITIALLY", "INNER", "INSERT", "INSTEAD", "INTERSECT", "INTO", "IS", "ISNULL", "JOIN", "KEY", "LEFT", "LIKE", "LIMIT", "MATCH", "NATURAL", "NOT", "NOTNULL", "NULL", "OF", "OFFSET", "ON", "OR", "ORDER", "OUTER", "PLAN", "PRAGMA", "PRIMARY", "QUERY", "RAISE", "REFERENCES", "REGEXP", "REINDEX", "RELEASE", "RENAME", "REPLACE", "RESTRICT", "ROLLBACK", "ROW", "SAVEPOINT", "SELECT", "SET", "TABLE", "TEMPORARY", "THEN", "TO", "TRANSACTION", "TRIGGER", "UNION", "UNIQUE", "UPDATE", "USING", "VACUUM", "VALUES", "VIEW", "VIRTUAL", "WHEN", "WHERE", "ID_START", "ID", "STRING", "INTEGER", "FLOAT_EXP", "FLOAT", "SIGNED_NUMBER", "BLOB", "COMMENT", "LINE_COMMENT", "WS", "ALIAS", "COLUMN_CONSTRAINT", "COLUMNS", "CONSTRAINTS", "CREATE_INDEX", "CREATE_TABLE", "DROP_INDEX", "DROP_TABLE", "NOT_NULL", "OPTIONS", "ORDERING", "SELECT_CORE", "TABLE_CONSTRAINT", "TYPE", "TYPE_PARAMS"
    };
    public static final int ROW=154;
    public static final int TYPE_PARAMS=199;
    public static final int NOT=132;
    public static final int EXCEPT=100;
    public static final int FOREIGN=106;
    public static final int EOF=-1;
    public static final int SIGNED_NUMBER=180;
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
    public static final int BLOB=181;
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
    public static final int DROP_INDEX=191;
    public static final int WS=184;
    public static final int PLAN=141;
    public static final int ALIAS=185;
    public static final int END=98;
    public static final int CONSTRAINT=81;
    public static final int RENAME=150;
    public static final int ALTER=62;
    public static final int ISNULL=124;
    public static final int TABLE=158;
    public static final int FLOAT=179;
    public static final int NOTNULL=133;
    public static final int NOT_EQUALS=6;
    public static final int NOT_NULL=193;
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
    public static final int COLUMN_CONSTRAINT=186;
    public static final int COLON=29;
    public static final int FLOAT_EXP=178;
    public static final int COLUMNS=187;
    public static final int COMMIT=79;
    public static final int DATABASE=87;
    public static final int VACUUM=168;
    public static final int DROP=95;
    public static final int DETACH=93;
    public static final int WHEN=172;
    public static final int NATURAL=131;
    public static final int BETWEEN=71;
    public static final int OPTIONS=194;
    public static final int STRING=176;
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
    public static final int INSERT=119;
    public static final int ESCAPE=99;
    public static final int SAVEPOINT=155;
    public static final int LESS=8;
    public static final int RAISE=145;
    public static final int EACH=96;
    public static final int COMMENT=182;
    public static final int ABORT=58;
    public static final int SELECT=156;
    public static final int INTO=122;
    public static final int UNIQUE=165;
    public static final int GLOB=108;
    public static final int VIEW=170;
    public static final int LINE_COMMENT=183;
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
    public static final int CHECK=76;
    public static final int FROM=107;
    public static final int TEMPORARY=159;
    public static final int DISTINCT=94;
    public static final int CURRENT_DATE=85;
    public static final int DOLLAR=31;
    public static final int CONSTRAINTS=188;
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
    public static final int CREATE_INDEX=189;
    public static final int QUESTION=28;
    public static final int ORDERING=195;
    public static final int IMMEDIATE=113;
    public static final int DESC=92;
    public static final int DROP_TABLE=192;
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
    // SqlParser.g:49:1: sql_stmt_list : ( sql_stmt )+ ;
    public final SqlParser.sql_stmt_list_return sql_stmt_list() throws RecognitionException {
        SqlParser.sql_stmt_list_return retval = new SqlParser.sql_stmt_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.sql_stmt_return sql_stmt1 = null;



        try {
            // SqlParser.g:49:14: ( ( sql_stmt )+ )
            // SqlParser.g:49:16: ( sql_stmt )+
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:49:16: ( sql_stmt )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // SqlParser.g:49:17: sql_stmt
            	    {
            	    pushFollow(FOLLOW_sql_stmt_in_sql_stmt_list132);
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
    // SqlParser.g:51:1: sql_stmt : ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI ;
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
            // SqlParser.g:51:9: ( ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI )
            // SqlParser.g:51:11: ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:51:11: ( EXPLAIN ( QUERY PLAN )? )?
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // SqlParser.g:51:12: EXPLAIN ( QUERY PLAN )?
                    {
                    EXPLAIN2=(Token)match(input,EXPLAIN,FOLLOW_EXPLAIN_in_sql_stmt142); 
                    EXPLAIN2_tree = (Object)adaptor.create(EXPLAIN2);
                    adaptor.addChild(root_0, EXPLAIN2_tree);

                    // SqlParser.g:51:20: ( QUERY PLAN )?
                    int alt2=2;
                    alt2 = dfa2.predict(input);
                    switch (alt2) {
                        case 1 :
                            // SqlParser.g:51:21: QUERY PLAN
                            {
                            QUERY3=(Token)match(input,QUERY,FOLLOW_QUERY_in_sql_stmt145); 
                            QUERY3_tree = (Object)adaptor.create(QUERY3);
                            adaptor.addChild(root_0, QUERY3_tree);

                            PLAN4=(Token)match(input,PLAN,FOLLOW_PLAN_in_sql_stmt147); 
                            PLAN4_tree = (Object)adaptor.create(PLAN4);
                            adaptor.addChild(root_0, PLAN4_tree);


                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_sql_stmt_core_in_sql_stmt153);
            sql_stmt_core5=sql_stmt_core();

            state._fsp--;

            adaptor.addChild(root_0, sql_stmt_core5.getTree());
            SEMI6=(Token)match(input,SEMI,FOLLOW_SEMI_in_sql_stmt155); 

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
    // SqlParser.g:53:1: sql_stmt_core : ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt );
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
            // SqlParser.g:54:3: ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt )
            int alt4=25;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // SqlParser.g:54:5: pragma_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pragma_stmt_in_sql_stmt_core166);
                    pragma_stmt7=pragma_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_stmt7.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:55:5: attach_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_attach_stmt_in_sql_stmt_core172);
                    attach_stmt8=attach_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, attach_stmt8.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:56:5: detach_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_detach_stmt_in_sql_stmt_core178);
                    detach_stmt9=detach_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, detach_stmt9.getTree());

                    }
                    break;
                case 4 :
                    // SqlParser.g:57:5: analyze_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_analyze_stmt_in_sql_stmt_core184);
                    analyze_stmt10=analyze_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, analyze_stmt10.getTree());

                    }
                    break;
                case 5 :
                    // SqlParser.g:58:5: reindex_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_reindex_stmt_in_sql_stmt_core190);
                    reindex_stmt11=reindex_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, reindex_stmt11.getTree());

                    }
                    break;
                case 6 :
                    // SqlParser.g:59:5: vacuum_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_vacuum_stmt_in_sql_stmt_core196);
                    vacuum_stmt12=vacuum_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, vacuum_stmt12.getTree());

                    }
                    break;
                case 7 :
                    // SqlParser.g:61:5: select_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_select_stmt_in_sql_stmt_core205);
                    select_stmt13=select_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, select_stmt13.getTree());

                    }
                    break;
                case 8 :
                    // SqlParser.g:62:5: insert_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_insert_stmt_in_sql_stmt_core211);
                    insert_stmt14=insert_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, insert_stmt14.getTree());

                    }
                    break;
                case 9 :
                    // SqlParser.g:63:5: update_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_update_stmt_in_sql_stmt_core217);
                    update_stmt15=update_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, update_stmt15.getTree());

                    }
                    break;
                case 10 :
                    // SqlParser.g:64:5: delete_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_delete_stmt_in_sql_stmt_core223);
                    delete_stmt16=delete_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_stmt16.getTree());

                    }
                    break;
                case 11 :
                    // SqlParser.g:65:5: begin_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_begin_stmt_in_sql_stmt_core229);
                    begin_stmt17=begin_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, begin_stmt17.getTree());

                    }
                    break;
                case 12 :
                    // SqlParser.g:66:5: commit_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_commit_stmt_in_sql_stmt_core235);
                    commit_stmt18=commit_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, commit_stmt18.getTree());

                    }
                    break;
                case 13 :
                    // SqlParser.g:67:5: rollback_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_rollback_stmt_in_sql_stmt_core241);
                    rollback_stmt19=rollback_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, rollback_stmt19.getTree());

                    }
                    break;
                case 14 :
                    // SqlParser.g:68:5: savepoint_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_savepoint_stmt_in_sql_stmt_core247);
                    savepoint_stmt20=savepoint_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, savepoint_stmt20.getTree());

                    }
                    break;
                case 15 :
                    // SqlParser.g:69:5: release_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_release_stmt_in_sql_stmt_core253);
                    release_stmt21=release_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, release_stmt21.getTree());

                    }
                    break;
                case 16 :
                    // SqlParser.g:71:5: create_virtual_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_virtual_table_stmt_in_sql_stmt_core262);
                    create_virtual_table_stmt22=create_virtual_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_virtual_table_stmt22.getTree());

                    }
                    break;
                case 17 :
                    // SqlParser.g:72:5: create_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_table_stmt_in_sql_stmt_core268);
                    create_table_stmt23=create_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_table_stmt23.getTree());

                    }
                    break;
                case 18 :
                    // SqlParser.g:73:5: drop_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_table_stmt_in_sql_stmt_core274);
                    drop_table_stmt24=drop_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_table_stmt24.getTree());

                    }
                    break;
                case 19 :
                    // SqlParser.g:74:5: alter_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_alter_table_stmt_in_sql_stmt_core280);
                    alter_table_stmt25=alter_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, alter_table_stmt25.getTree());

                    }
                    break;
                case 20 :
                    // SqlParser.g:75:5: create_view_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_view_stmt_in_sql_stmt_core286);
                    create_view_stmt26=create_view_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_view_stmt26.getTree());

                    }
                    break;
                case 21 :
                    // SqlParser.g:76:5: drop_view_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_view_stmt_in_sql_stmt_core292);
                    drop_view_stmt27=drop_view_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_view_stmt27.getTree());

                    }
                    break;
                case 22 :
                    // SqlParser.g:77:5: create_index_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_index_stmt_in_sql_stmt_core298);
                    create_index_stmt28=create_index_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_index_stmt28.getTree());

                    }
                    break;
                case 23 :
                    // SqlParser.g:78:5: drop_index_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_index_stmt_in_sql_stmt_core304);
                    drop_index_stmt29=drop_index_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_index_stmt29.getTree());

                    }
                    break;
                case 24 :
                    // SqlParser.g:79:5: create_trigger_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_trigger_stmt_in_sql_stmt_core310);
                    create_trigger_stmt30=create_trigger_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_trigger_stmt30.getTree());

                    }
                    break;
                case 25 :
                    // SqlParser.g:80:5: drop_trigger_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_trigger_stmt_in_sql_stmt_core316);
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
    // SqlParser.g:82:1: qualified_table_name : (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )? ;
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
            // SqlParser.g:82:21: ( (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )? )
            // SqlParser.g:82:23: (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )?
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:82:23: (database_name= id DOT )?
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // SqlParser.g:82:24: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_qualified_table_name326);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT32=(Token)match(input,DOT,FOLLOW_DOT_in_qualified_table_name328); 
                    DOT32_tree = (Object)adaptor.create(DOT32);
                    adaptor.addChild(root_0, DOT32_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_qualified_table_name334);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:82:61: ( INDEXED BY index_name= id | NOT INDEXED )?
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
                    // SqlParser.g:82:62: INDEXED BY index_name= id
                    {
                    INDEXED33=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_qualified_table_name337); 
                    INDEXED33_tree = (Object)adaptor.create(INDEXED33);
                    adaptor.addChild(root_0, INDEXED33_tree);

                    BY34=(Token)match(input,BY,FOLLOW_BY_in_qualified_table_name339); 
                    BY34_tree = (Object)adaptor.create(BY34);
                    adaptor.addChild(root_0, BY34_tree);

                    pushFollow(FOLLOW_id_in_qualified_table_name343);
                    index_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, index_name.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:82:89: NOT INDEXED
                    {
                    NOT35=(Token)match(input,NOT,FOLLOW_NOT_in_qualified_table_name347); 
                    NOT35_tree = (Object)adaptor.create(NOT35);
                    adaptor.addChild(root_0, NOT35_tree);

                    INDEXED36=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_qualified_table_name349); 
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
    // SqlParser.g:84:1: expr : or_subexpr ( OR or_subexpr )* ;
    public final SqlParser.expr_return expr() throws RecognitionException {
        SqlParser.expr_return retval = new SqlParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR38=null;
        SqlParser.or_subexpr_return or_subexpr37 = null;

        SqlParser.or_subexpr_return or_subexpr39 = null;


        Object OR38_tree=null;

        try {
            // SqlParser.g:84:5: ( or_subexpr ( OR or_subexpr )* )
            // SqlParser.g:84:7: or_subexpr ( OR or_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_or_subexpr_in_expr358);
            or_subexpr37=or_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, or_subexpr37.getTree());
            // SqlParser.g:84:18: ( OR or_subexpr )*
            loop7:
            do {
                int alt7=2;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // SqlParser.g:84:19: OR or_subexpr
            	    {
            	    OR38=(Token)match(input,OR,FOLLOW_OR_in_expr361); 
            	    OR38_tree = (Object)adaptor.create(OR38);
            	    root_0 = (Object)adaptor.becomeRoot(OR38_tree, root_0);

            	    pushFollow(FOLLOW_or_subexpr_in_expr364);
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
    // SqlParser.g:86:1: or_subexpr : and_subexpr ( AND and_subexpr )* ;
    public final SqlParser.or_subexpr_return or_subexpr() throws RecognitionException {
        SqlParser.or_subexpr_return retval = new SqlParser.or_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND41=null;
        SqlParser.and_subexpr_return and_subexpr40 = null;

        SqlParser.and_subexpr_return and_subexpr42 = null;


        Object AND41_tree=null;

        try {
            // SqlParser.g:86:11: ( and_subexpr ( AND and_subexpr )* )
            // SqlParser.g:86:13: and_subexpr ( AND and_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_and_subexpr_in_or_subexpr373);
            and_subexpr40=and_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, and_subexpr40.getTree());
            // SqlParser.g:86:25: ( AND and_subexpr )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // SqlParser.g:86:26: AND and_subexpr
            	    {
            	    AND41=(Token)match(input,AND,FOLLOW_AND_in_or_subexpr376); 
            	    AND41_tree = (Object)adaptor.create(AND41);
            	    root_0 = (Object)adaptor.becomeRoot(AND41_tree, root_0);

            	    pushFollow(FOLLOW_and_subexpr_in_or_subexpr379);
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
    // SqlParser.g:88:1: and_subexpr : ( eq_subexpr ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )* | ( NOT )? ( LIKE | GLOB | REGEXP | MATCH ) eq_subexpr ( ESCAPE eq_subexpr )? | ( NOT )? IN ( LPAREN ( select_stmt | expr ( COMMA expr )* )? RPAREN | (database_name= id DOT )? table_name= id ) | ( ISNULL | NOTNULL | IS NULL | IS NOT NULL ) | ( NOT )? BETWEEN eq_subexpr AND eq_subexpr );
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
            // SqlParser.g:88:12: ( eq_subexpr ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )* | ( NOT )? ( LIKE | GLOB | REGEXP | MATCH ) eq_subexpr ( ESCAPE eq_subexpr )? | ( NOT )? IN ( LPAREN ( select_stmt | expr ( COMMA expr )* )? RPAREN | (database_name= id DOT )? table_name= id ) | ( ISNULL | NOTNULL | IS NULL | IS NOT NULL ) | ( NOT )? BETWEEN eq_subexpr AND eq_subexpr )
            int alt19=5;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // SqlParser.g:88:14: eq_subexpr ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr388);
                    eq_subexpr43=eq_subexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, eq_subexpr43.getTree());
                    // SqlParser.g:89:3: ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )*
                    loop9:
                    do {
                        int alt9=2;
                        alt9 = dfa9.predict(input);
                        switch (alt9) {
                    	case 1 :
                    	    // SqlParser.g:89:5: ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr
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

                    	    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr410);
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
                    // SqlParser.g:90:5: ( NOT )? ( LIKE | GLOB | REGEXP | MATCH ) eq_subexpr ( ESCAPE eq_subexpr )?
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:90:5: ( NOT )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==NOT) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // SqlParser.g:90:6: NOT
                            {
                            NOT46=(Token)match(input,NOT,FOLLOW_NOT_in_and_subexpr419); 
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

                    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr439);
                    eq_subexpr48=eq_subexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, eq_subexpr48.getTree());
                    // SqlParser.g:90:54: ( ESCAPE eq_subexpr )?
                    int alt11=2;
                    alt11 = dfa11.predict(input);
                    switch (alt11) {
                        case 1 :
                            // SqlParser.g:90:55: ESCAPE eq_subexpr
                            {
                            ESCAPE49=(Token)match(input,ESCAPE,FOLLOW_ESCAPE_in_and_subexpr442); 
                            ESCAPE49_tree = (Object)adaptor.create(ESCAPE49);
                            adaptor.addChild(root_0, ESCAPE49_tree);

                            pushFollow(FOLLOW_eq_subexpr_in_and_subexpr444);
                            eq_subexpr50=eq_subexpr();

                            state._fsp--;

                            adaptor.addChild(root_0, eq_subexpr50.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // SqlParser.g:91:5: ( NOT )? IN ( LPAREN ( select_stmt | expr ( COMMA expr )* )? RPAREN | (database_name= id DOT )? table_name= id )
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:91:5: ( NOT )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==NOT) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // SqlParser.g:91:6: NOT
                            {
                            NOT51=(Token)match(input,NOT,FOLLOW_NOT_in_and_subexpr453); 
                            NOT51_tree = (Object)adaptor.create(NOT51);
                            adaptor.addChild(root_0, NOT51_tree);


                            }
                            break;

                    }

                    IN52=(Token)match(input,IN,FOLLOW_IN_in_and_subexpr457); 
                    IN52_tree = (Object)adaptor.create(IN52);
                    adaptor.addChild(root_0, IN52_tree);

                    // SqlParser.g:91:15: ( LPAREN ( select_stmt | expr ( COMMA expr )* )? RPAREN | (database_name= id DOT )? table_name= id )
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
                            // SqlParser.g:91:16: LPAREN ( select_stmt | expr ( COMMA expr )* )? RPAREN
                            {
                            LPAREN53=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_and_subexpr460); 
                            LPAREN53_tree = (Object)adaptor.create(LPAREN53);
                            adaptor.addChild(root_0, LPAREN53_tree);

                            // SqlParser.g:91:23: ( select_stmt | expr ( COMMA expr )* )?
                            int alt14=3;
                            alt14 = dfa14.predict(input);
                            switch (alt14) {
                                case 1 :
                                    // SqlParser.g:91:24: select_stmt
                                    {
                                    pushFollow(FOLLOW_select_stmt_in_and_subexpr463);
                                    select_stmt54=select_stmt();

                                    state._fsp--;

                                    adaptor.addChild(root_0, select_stmt54.getTree());

                                    }
                                    break;
                                case 2 :
                                    // SqlParser.g:91:38: expr ( COMMA expr )*
                                    {
                                    pushFollow(FOLLOW_expr_in_and_subexpr467);
                                    expr55=expr();

                                    state._fsp--;

                                    adaptor.addChild(root_0, expr55.getTree());
                                    // SqlParser.g:91:43: ( COMMA expr )*
                                    loop13:
                                    do {
                                        int alt13=2;
                                        int LA13_0 = input.LA(1);

                                        if ( (LA13_0==COMMA) ) {
                                            alt13=1;
                                        }


                                        switch (alt13) {
                                    	case 1 :
                                    	    // SqlParser.g:91:44: COMMA expr
                                    	    {
                                    	    COMMA56=(Token)match(input,COMMA,FOLLOW_COMMA_in_and_subexpr470); 
                                    	    COMMA56_tree = (Object)adaptor.create(COMMA56);
                                    	    adaptor.addChild(root_0, COMMA56_tree);

                                    	    pushFollow(FOLLOW_expr_in_and_subexpr472);
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

                            RPAREN58=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_and_subexpr478); 
                            RPAREN58_tree = (Object)adaptor.create(RPAREN58);
                            adaptor.addChild(root_0, RPAREN58_tree);


                            }
                            break;
                        case 2 :
                            // SqlParser.g:91:68: (database_name= id DOT )? table_name= id
                            {
                            // SqlParser.g:91:68: (database_name= id DOT )?
                            int alt15=2;
                            alt15 = dfa15.predict(input);
                            switch (alt15) {
                                case 1 :
                                    // SqlParser.g:91:69: database_name= id DOT
                                    {
                                    pushFollow(FOLLOW_id_in_and_subexpr485);
                                    database_name=id();

                                    state._fsp--;

                                    adaptor.addChild(root_0, database_name.getTree());
                                    DOT59=(Token)match(input,DOT,FOLLOW_DOT_in_and_subexpr487); 
                                    DOT59_tree = (Object)adaptor.create(DOT59);
                                    adaptor.addChild(root_0, DOT59_tree);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_id_in_and_subexpr493);
                            table_name=id();

                            state._fsp--;

                            adaptor.addChild(root_0, table_name.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // SqlParser.g:92:5: ( ISNULL | NOTNULL | IS NULL | IS NOT NULL )
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:92:5: ( ISNULL | NOTNULL | IS NULL | IS NOT NULL )
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
                            // SqlParser.g:92:6: ISNULL
                            {
                            ISNULL60=(Token)match(input,ISNULL,FOLLOW_ISNULL_in_and_subexpr501); 
                            ISNULL60_tree = (Object)adaptor.create(ISNULL60);
                            adaptor.addChild(root_0, ISNULL60_tree);


                            }
                            break;
                        case 2 :
                            // SqlParser.g:92:15: NOTNULL
                            {
                            NOTNULL61=(Token)match(input,NOTNULL,FOLLOW_NOTNULL_in_and_subexpr505); 
                            NOTNULL61_tree = (Object)adaptor.create(NOTNULL61);
                            adaptor.addChild(root_0, NOTNULL61_tree);


                            }
                            break;
                        case 3 :
                            // SqlParser.g:92:25: IS NULL
                            {
                            IS62=(Token)match(input,IS,FOLLOW_IS_in_and_subexpr509); 
                            IS62_tree = (Object)adaptor.create(IS62);
                            adaptor.addChild(root_0, IS62_tree);

                            NULL63=(Token)match(input,NULL,FOLLOW_NULL_in_and_subexpr511); 
                            NULL63_tree = (Object)adaptor.create(NULL63);
                            adaptor.addChild(root_0, NULL63_tree);


                            }
                            break;
                        case 4 :
                            // SqlParser.g:92:88: IS NOT NULL
                            {
                            IS64=(Token)match(input,IS,FOLLOW_IS_in_and_subexpr516); 
                            IS64_tree = (Object)adaptor.create(IS64);
                            adaptor.addChild(root_0, IS64_tree);

                            NOT65=(Token)match(input,NOT,FOLLOW_NOT_in_and_subexpr518); 
                            NOT65_tree = (Object)adaptor.create(NOT65);
                            adaptor.addChild(root_0, NOT65_tree);

                            NULL66=(Token)match(input,NULL,FOLLOW_NULL_in_and_subexpr520); 
                            NULL66_tree = (Object)adaptor.create(NULL66);
                            adaptor.addChild(root_0, NULL66_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // SqlParser.g:93:5: ( NOT )? BETWEEN eq_subexpr AND eq_subexpr
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:93:5: ( NOT )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NOT) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // SqlParser.g:93:6: NOT
                            {
                            NOT67=(Token)match(input,NOT,FOLLOW_NOT_in_and_subexpr528); 
                            NOT67_tree = (Object)adaptor.create(NOT67);
                            adaptor.addChild(root_0, NOT67_tree);


                            }
                            break;

                    }

                    BETWEEN68=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_and_subexpr532); 
                    BETWEEN68_tree = (Object)adaptor.create(BETWEEN68);
                    adaptor.addChild(root_0, BETWEEN68_tree);

                    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr534);
                    eq_subexpr69=eq_subexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, eq_subexpr69.getTree());
                    AND70=(Token)match(input,AND,FOLLOW_AND_in_and_subexpr536); 
                    AND70_tree = (Object)adaptor.create(AND70);
                    adaptor.addChild(root_0, AND70_tree);

                    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr538);
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
    // SqlParser.g:95:1: eq_subexpr : neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )* ;
    public final SqlParser.eq_subexpr_return eq_subexpr() throws RecognitionException {
        SqlParser.eq_subexpr_return retval = new SqlParser.eq_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set73=null;
        SqlParser.neq_subexpr_return neq_subexpr72 = null;

        SqlParser.neq_subexpr_return neq_subexpr74 = null;


        Object set73_tree=null;

        try {
            // SqlParser.g:95:11: ( neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )* )
            // SqlParser.g:95:13: neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_neq_subexpr_in_eq_subexpr545);
            neq_subexpr72=neq_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, neq_subexpr72.getTree());
            // SqlParser.g:95:25: ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )*
            loop20:
            do {
                int alt20=2;
                alt20 = dfa20.predict(input);
                switch (alt20) {
            	case 1 :
            	    // SqlParser.g:95:26: ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr
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

            	    pushFollow(FOLLOW_neq_subexpr_in_eq_subexpr565);
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
    // SqlParser.g:97:1: neq_subexpr : bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )* ;
    public final SqlParser.neq_subexpr_return neq_subexpr() throws RecognitionException {
        SqlParser.neq_subexpr_return retval = new SqlParser.neq_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set76=null;
        SqlParser.bit_subexpr_return bit_subexpr75 = null;

        SqlParser.bit_subexpr_return bit_subexpr77 = null;


        Object set76_tree=null;

        try {
            // SqlParser.g:97:12: ( bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )* )
            // SqlParser.g:97:14: bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bit_subexpr_in_neq_subexpr574);
            bit_subexpr75=bit_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, bit_subexpr75.getTree());
            // SqlParser.g:97:26: ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )*
            loop21:
            do {
                int alt21=2;
                alt21 = dfa21.predict(input);
                switch (alt21) {
            	case 1 :
            	    // SqlParser.g:97:27: ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr
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

            	    pushFollow(FOLLOW_bit_subexpr_in_neq_subexpr594);
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
    // SqlParser.g:99:1: bit_subexpr : add_subexpr ( ( PLUS | MINUS ) add_subexpr )* ;
    public final SqlParser.bit_subexpr_return bit_subexpr() throws RecognitionException {
        SqlParser.bit_subexpr_return retval = new SqlParser.bit_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set79=null;
        SqlParser.add_subexpr_return add_subexpr78 = null;

        SqlParser.add_subexpr_return add_subexpr80 = null;


        Object set79_tree=null;

        try {
            // SqlParser.g:99:12: ( add_subexpr ( ( PLUS | MINUS ) add_subexpr )* )
            // SqlParser.g:99:14: add_subexpr ( ( PLUS | MINUS ) add_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_subexpr_in_bit_subexpr603);
            add_subexpr78=add_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, add_subexpr78.getTree());
            // SqlParser.g:99:26: ( ( PLUS | MINUS ) add_subexpr )*
            loop22:
            do {
                int alt22=2;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // SqlParser.g:99:27: ( PLUS | MINUS ) add_subexpr
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

            	    pushFollow(FOLLOW_add_subexpr_in_bit_subexpr615);
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
    // SqlParser.g:101:1: add_subexpr : mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )* ;
    public final SqlParser.add_subexpr_return add_subexpr() throws RecognitionException {
        SqlParser.add_subexpr_return retval = new SqlParser.add_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set82=null;
        SqlParser.mul_subexpr_return mul_subexpr81 = null;

        SqlParser.mul_subexpr_return mul_subexpr83 = null;


        Object set82_tree=null;

        try {
            // SqlParser.g:101:12: ( mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )* )
            // SqlParser.g:101:14: mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mul_subexpr_in_add_subexpr624);
            mul_subexpr81=mul_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, mul_subexpr81.getTree());
            // SqlParser.g:101:26: ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )*
            loop23:
            do {
                int alt23=2;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // SqlParser.g:101:27: ( ASTERISK | SLASH | PERCENT ) mul_subexpr
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

            	    pushFollow(FOLLOW_mul_subexpr_in_add_subexpr640);
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
    // SqlParser.g:103:1: mul_subexpr : con_subexpr ( DOUBLE_PIPE con_subexpr )* ;
    public final SqlParser.mul_subexpr_return mul_subexpr() throws RecognitionException {
        SqlParser.mul_subexpr_return retval = new SqlParser.mul_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOUBLE_PIPE85=null;
        SqlParser.con_subexpr_return con_subexpr84 = null;

        SqlParser.con_subexpr_return con_subexpr86 = null;


        Object DOUBLE_PIPE85_tree=null;

        try {
            // SqlParser.g:103:12: ( con_subexpr ( DOUBLE_PIPE con_subexpr )* )
            // SqlParser.g:103:14: con_subexpr ( DOUBLE_PIPE con_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_con_subexpr_in_mul_subexpr649);
            con_subexpr84=con_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, con_subexpr84.getTree());
            // SqlParser.g:103:26: ( DOUBLE_PIPE con_subexpr )*
            loop24:
            do {
                int alt24=2;
                alt24 = dfa24.predict(input);
                switch (alt24) {
            	case 1 :
            	    // SqlParser.g:103:27: DOUBLE_PIPE con_subexpr
            	    {
            	    DOUBLE_PIPE85=(Token)match(input,DOUBLE_PIPE,FOLLOW_DOUBLE_PIPE_in_mul_subexpr652); 
            	    DOUBLE_PIPE85_tree = (Object)adaptor.create(DOUBLE_PIPE85);
            	    root_0 = (Object)adaptor.becomeRoot(DOUBLE_PIPE85_tree, root_0);

            	    pushFollow(FOLLOW_con_subexpr_in_mul_subexpr655);
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
    // SqlParser.g:105:1: con_subexpr : ( PLUS | MINUS | TILDA | NOT )? unary_subexpr ;
    public final SqlParser.con_subexpr_return con_subexpr() throws RecognitionException {
        SqlParser.con_subexpr_return retval = new SqlParser.con_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set87=null;
        SqlParser.unary_subexpr_return unary_subexpr88 = null;


        Object set87_tree=null;

        try {
            // SqlParser.g:105:12: ( ( PLUS | MINUS | TILDA | NOT )? unary_subexpr )
            // SqlParser.g:105:14: ( PLUS | MINUS | TILDA | NOT )? unary_subexpr
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:105:14: ( PLUS | MINUS | TILDA | NOT )?
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

            pushFollow(FOLLOW_unary_subexpr_in_con_subexpr681);
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
    // SqlParser.g:107:1: unary_subexpr : atom_expr ( COLLATE collation_name= ID )? ;
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
            // SqlParser.g:107:14: ( atom_expr ( COLLATE collation_name= ID )? )
            // SqlParser.g:107:16: atom_expr ( COLLATE collation_name= ID )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atom_expr_in_unary_subexpr688);
            atom_expr89=atom_expr();

            state._fsp--;

            adaptor.addChild(root_0, atom_expr89.getTree());
            // SqlParser.g:107:26: ( COLLATE collation_name= ID )?
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // SqlParser.g:107:27: COLLATE collation_name= ID
                    {
                    COLLATE90=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_unary_subexpr691); 
                    COLLATE90_tree = (Object)adaptor.create(COLLATE90);
                    root_0 = (Object)adaptor.becomeRoot(COLLATE90_tree, root_0);

                    collation_name=(Token)match(input,ID,FOLLOW_ID_in_unary_subexpr696); 
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
    // SqlParser.g:109:1: atom_expr : ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID | function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN | LPAREN expr RPAREN -> expr | CAST LPAREN expr AS type_name RPAREN | ( EXISTS )? LPAREN select_stmt RPAREN | CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END | raise_function );
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
            // SqlParser.g:110:3: ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID | function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN | LPAREN expr RPAREN -> expr | CAST LPAREN expr AS type_name RPAREN | ( EXISTS )? LPAREN select_stmt RPAREN | CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END | raise_function )
            int alt36=9;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // SqlParser.g:110:5: literal_value
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_value_in_atom_expr708);
                    literal_value91=literal_value();

                    state._fsp--;

                    adaptor.addChild(root_0, literal_value91.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:111:5: bind_parameter
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_bind_parameter_in_atom_expr714);
                    bind_parameter92=bind_parameter();

                    state._fsp--;

                    adaptor.addChild(root_0, bind_parameter92.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:112:5: ( (database_name= id DOT )? table_name= id DOT )? column_name= ID
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:112:5: ( (database_name= id DOT )? table_name= id DOT )?
                    int alt28=2;
                    alt28 = dfa28.predict(input);
                    switch (alt28) {
                        case 1 :
                            // SqlParser.g:112:6: (database_name= id DOT )? table_name= id DOT
                            {
                            // SqlParser.g:112:6: (database_name= id DOT )?
                            int alt27=2;
                            alt27 = dfa27.predict(input);
                            switch (alt27) {
                                case 1 :
                                    // SqlParser.g:112:7: database_name= id DOT
                                    {
                                    pushFollow(FOLLOW_id_in_atom_expr724);
                                    database_name=id();

                                    state._fsp--;

                                    adaptor.addChild(root_0, database_name.getTree());
                                    DOT93=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expr726); 
                                    DOT93_tree = (Object)adaptor.create(DOT93);
                                    adaptor.addChild(root_0, DOT93_tree);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_id_in_atom_expr732);
                            table_name=id();

                            state._fsp--;

                            adaptor.addChild(root_0, table_name.getTree());
                            DOT94=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expr734); 
                            DOT94_tree = (Object)adaptor.create(DOT94);
                            adaptor.addChild(root_0, DOT94_tree);


                            }
                            break;

                    }

                    column_name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr740); 
                    column_name_tree = (Object)adaptor.create(column_name);
                    adaptor.addChild(root_0, column_name_tree);


                    }
                    break;
                case 4 :
                    // SqlParser.g:113:5: function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    function_name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr748); 
                    function_name_tree = (Object)adaptor.create(function_name);
                    adaptor.addChild(root_0, function_name_tree);

                    LPAREN95=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr750); 
                    LPAREN95_tree = (Object)adaptor.create(LPAREN95);
                    adaptor.addChild(root_0, LPAREN95_tree);

                    // SqlParser.g:113:29: ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )?
                    int alt31=3;
                    alt31 = dfa31.predict(input);
                    switch (alt31) {
                        case 1 :
                            // SqlParser.g:113:30: ( DISTINCT )? args+= expr ( COMMA args+= expr )*
                            {
                            // SqlParser.g:113:30: ( DISTINCT )?
                            int alt29=2;
                            alt29 = dfa29.predict(input);
                            switch (alt29) {
                                case 1 :
                                    // SqlParser.g:113:31: DISTINCT
                                    {
                                    DISTINCT96=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_atom_expr754); 
                                    DISTINCT96_tree = (Object)adaptor.create(DISTINCT96);
                                    adaptor.addChild(root_0, DISTINCT96_tree);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_expr_in_atom_expr760);
                            args=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, args.getTree());
                            if (list_args==null) list_args=new ArrayList();
                            list_args.add(args.getTree());

                            // SqlParser.g:113:53: ( COMMA args+= expr )*
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( (LA30_0==COMMA) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // SqlParser.g:113:54: COMMA args+= expr
                            	    {
                            	    COMMA97=(Token)match(input,COMMA,FOLLOW_COMMA_in_atom_expr763); 
                            	    COMMA97_tree = (Object)adaptor.create(COMMA97);
                            	    adaptor.addChild(root_0, COMMA97_tree);

                            	    pushFollow(FOLLOW_expr_in_atom_expr767);
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
                            // SqlParser.g:113:75: ASTERISK
                            {
                            ASTERISK98=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_atom_expr773); 
                            ASTERISK98_tree = (Object)adaptor.create(ASTERISK98);
                            adaptor.addChild(root_0, ASTERISK98_tree);


                            }
                            break;

                    }

                    RPAREN99=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr777); 
                    RPAREN99_tree = (Object)adaptor.create(RPAREN99);
                    adaptor.addChild(root_0, RPAREN99_tree);


                    }
                    break;
                case 5 :
                    // SqlParser.g:114:5: LPAREN expr RPAREN
                    {
                    LPAREN100=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr783);  
                    stream_LPAREN.add(LPAREN100);

                    pushFollow(FOLLOW_expr_in_atom_expr785);
                    expr101=expr();

                    state._fsp--;

                    stream_expr.add(expr101.getTree());
                    RPAREN102=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr787);  
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
                    // 114:24: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // SqlParser.g:115:5: CAST LPAREN expr AS type_name RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    CAST103=(Token)match(input,CAST,FOLLOW_CAST_in_atom_expr797); 
                    CAST103_tree = (Object)adaptor.create(CAST103);
                    adaptor.addChild(root_0, CAST103_tree);

                    LPAREN104=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr799); 
                    LPAREN104_tree = (Object)adaptor.create(LPAREN104);
                    adaptor.addChild(root_0, LPAREN104_tree);

                    pushFollow(FOLLOW_expr_in_atom_expr801);
                    expr105=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr105.getTree());
                    AS106=(Token)match(input,AS,FOLLOW_AS_in_atom_expr803); 
                    AS106_tree = (Object)adaptor.create(AS106);
                    adaptor.addChild(root_0, AS106_tree);

                    pushFollow(FOLLOW_type_name_in_atom_expr805);
                    type_name107=type_name();

                    state._fsp--;

                    adaptor.addChild(root_0, type_name107.getTree());
                    RPAREN108=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr807); 
                    RPAREN108_tree = (Object)adaptor.create(RPAREN108);
                    adaptor.addChild(root_0, RPAREN108_tree);


                    }
                    break;
                case 7 :
                    // SqlParser.g:116:5: ( EXISTS )? LPAREN select_stmt RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:116:5: ( EXISTS )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==EXISTS) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // SqlParser.g:116:53: EXISTS
                            {
                            EXISTS109=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_atom_expr816); 
                            EXISTS109_tree = (Object)adaptor.create(EXISTS109);
                            adaptor.addChild(root_0, EXISTS109_tree);


                            }
                            break;

                    }

                    LPAREN110=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr820); 
                    LPAREN110_tree = (Object)adaptor.create(LPAREN110);
                    adaptor.addChild(root_0, LPAREN110_tree);

                    pushFollow(FOLLOW_select_stmt_in_atom_expr822);
                    select_stmt111=select_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, select_stmt111.getTree());
                    RPAREN112=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr824); 
                    RPAREN112_tree = (Object)adaptor.create(RPAREN112);
                    adaptor.addChild(root_0, RPAREN112_tree);


                    }
                    break;
                case 8 :
                    // SqlParser.g:117:5: CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END
                    {
                    root_0 = (Object)adaptor.nil();

                    CASE113=(Token)match(input,CASE,FOLLOW_CASE_in_atom_expr830); 
                    CASE113_tree = (Object)adaptor.create(CASE113);
                    adaptor.addChild(root_0, CASE113_tree);

                    // SqlParser.g:117:10: ( expr )?
                    int alt33=2;
                    alt33 = dfa33.predict(input);
                    switch (alt33) {
                        case 1 :
                            // SqlParser.g:117:11: expr
                            {
                            pushFollow(FOLLOW_expr_in_atom_expr833);
                            expr114=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr114.getTree());

                            }
                            break;

                    }

                    // SqlParser.g:117:18: ( WHEN expr THEN expr )+
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
                    	    // SqlParser.g:117:19: WHEN expr THEN expr
                    	    {
                    	    WHEN115=(Token)match(input,WHEN,FOLLOW_WHEN_in_atom_expr838); 
                    	    WHEN115_tree = (Object)adaptor.create(WHEN115);
                    	    adaptor.addChild(root_0, WHEN115_tree);

                    	    pushFollow(FOLLOW_expr_in_atom_expr840);
                    	    expr116=expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expr116.getTree());
                    	    THEN117=(Token)match(input,THEN,FOLLOW_THEN_in_atom_expr842); 
                    	    THEN117_tree = (Object)adaptor.create(THEN117);
                    	    adaptor.addChild(root_0, THEN117_tree);

                    	    pushFollow(FOLLOW_expr_in_atom_expr844);
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

                    // SqlParser.g:117:41: ( ELSE expr )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==ELSE) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // SqlParser.g:117:42: ELSE expr
                            {
                            ELSE119=(Token)match(input,ELSE,FOLLOW_ELSE_in_atom_expr849); 
                            ELSE119_tree = (Object)adaptor.create(ELSE119);
                            adaptor.addChild(root_0, ELSE119_tree);

                            pushFollow(FOLLOW_expr_in_atom_expr851);
                            expr120=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr120.getTree());

                            }
                            break;

                    }

                    END121=(Token)match(input,END,FOLLOW_END_in_atom_expr855); 
                    END121_tree = (Object)adaptor.create(END121);
                    adaptor.addChild(root_0, END121_tree);


                    }
                    break;
                case 9 :
                    // SqlParser.g:118:5: raise_function
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_raise_function_in_atom_expr861);
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
    // SqlParser.g:120:1: literal_value : ( INTEGER | FLOAT | STRING | BLOB | NULL | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP );
    public final SqlParser.literal_value_return literal_value() throws RecognitionException {
        SqlParser.literal_value_return retval = new SqlParser.literal_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set123=null;

        Object set123_tree=null;

        try {
            // SqlParser.g:120:14: ( INTEGER | FLOAT | STRING | BLOB | NULL | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP )
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
    // SqlParser.g:122:1: signed_number : ( INTEGER | FLOAT | SIGNED_NUMBER );
    public final SqlParser.signed_number_return signed_number() throws RecognitionException {
        SqlParser.signed_number_return retval = new SqlParser.signed_number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set124=null;

        Object set124_tree=null;

        try {
            // SqlParser.g:122:14: ( INTEGER | FLOAT | SIGNED_NUMBER )
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
    // SqlParser.g:124:1: bind_parameter : ( QUESTION | QUESTION number= INTEGER | COLON id | AT id );
    public final SqlParser.bind_parameter_return bind_parameter() throws RecognitionException {
        SqlParser.bind_parameter_return retval = new SqlParser.bind_parameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token number=null;
        Token QUESTION125=null;
        Token QUESTION126=null;
        Token COLON127=null;
        Token AT129=null;
        SqlParser.id_return id128 = null;

        SqlParser.id_return id130 = null;


        Object number_tree=null;
        Object QUESTION125_tree=null;
        Object QUESTION126_tree=null;
        Object COLON127_tree=null;
        Object AT129_tree=null;

        try {
            // SqlParser.g:125:3: ( QUESTION | QUESTION number= INTEGER | COLON id | AT id )
            int alt37=4;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // SqlParser.g:125:5: QUESTION
                    {
                    root_0 = (Object)adaptor.nil();

                    QUESTION125=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_bind_parameter921); 
                    QUESTION125_tree = (Object)adaptor.create(QUESTION125);
                    adaptor.addChild(root_0, QUESTION125_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:126:5: QUESTION number= INTEGER
                    {
                    root_0 = (Object)adaptor.nil();

                    QUESTION126=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_bind_parameter927); 
                    QUESTION126_tree = (Object)adaptor.create(QUESTION126);
                    adaptor.addChild(root_0, QUESTION126_tree);

                    number=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_bind_parameter931); 
                    number_tree = (Object)adaptor.create(number);
                    adaptor.addChild(root_0, number_tree);


                    }
                    break;
                case 3 :
                    // SqlParser.g:127:5: COLON id
                    {
                    root_0 = (Object)adaptor.nil();

                    COLON127=(Token)match(input,COLON,FOLLOW_COLON_in_bind_parameter937); 
                    COLON127_tree = (Object)adaptor.create(COLON127);
                    adaptor.addChild(root_0, COLON127_tree);

                    pushFollow(FOLLOW_id_in_bind_parameter939);
                    id128=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id128.getTree());

                    }
                    break;
                case 4 :
                    // SqlParser.g:128:5: AT id
                    {
                    root_0 = (Object)adaptor.nil();

                    AT129=(Token)match(input,AT,FOLLOW_AT_in_bind_parameter945); 
                    AT129_tree = (Object)adaptor.create(AT129);
                    adaptor.addChild(root_0, AT129_tree);

                    pushFollow(FOLLOW_id_in_bind_parameter947);
                    id130=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id130.getTree());

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
    // SqlParser.g:131:1: type_name : (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )? -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ ) ;
    public final SqlParser.type_name_return type_name() throws RecognitionException {
        SqlParser.type_name_return retval = new SqlParser.type_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN131=null;
        Token COMMA132=null;
        Token RPAREN133=null;
        Token names=null;
        List list_names=null;
        SqlParser.signed_number_return size1 = null;

        SqlParser.signed_number_return size2 = null;


        Object LPAREN131_tree=null;
        Object COMMA132_tree=null;
        Object RPAREN133_tree=null;
        Object names_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_signed_number=new RewriteRuleSubtreeStream(adaptor,"rule signed_number");
        try {
            // SqlParser.g:131:10: ( (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )? -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ ) )
            // SqlParser.g:131:12: (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )?
            {
            // SqlParser.g:131:17: (names+= ID )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                alt38 = dfa38.predict(input);
                switch (alt38) {
            	case 1 :
            	    // SqlParser.g:131:17: names+= ID
            	    {
            	    names=(Token)match(input,ID,FOLLOW_ID_in_type_name957);  
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

            // SqlParser.g:131:23: ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )?
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // SqlParser.g:131:24: LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN
                    {
                    LPAREN131=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_type_name961);  
                    stream_LPAREN.add(LPAREN131);

                    pushFollow(FOLLOW_signed_number_in_type_name965);
                    size1=signed_number();

                    state._fsp--;

                    stream_signed_number.add(size1.getTree());
                    // SqlParser.g:131:51: ( COMMA size2= signed_number )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==COMMA) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // SqlParser.g:131:52: COMMA size2= signed_number
                            {
                            COMMA132=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_name968);  
                            stream_COMMA.add(COMMA132);

                            pushFollow(FOLLOW_signed_number_in_type_name972);
                            size2=signed_number();

                            state._fsp--;

                            stream_signed_number.add(size2.getTree());

                            }
                            break;

                    }

                    RPAREN133=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_type_name976);  
                    stream_RPAREN.add(RPAREN133);


                    }
                    break;

            }



            // AST REWRITE
            // elements: size1, names, size2
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
            // 132:1: -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ )
            {
                // SqlParser.g:132:4: ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_1);

                // SqlParser.g:132:11: ^( TYPE_PARAMS ( $size1)? ( $size2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE_PARAMS, "TYPE_PARAMS"), root_2);

                // SqlParser.g:132:25: ( $size1)?
                if ( stream_size1.hasNext() ) {
                    adaptor.addChild(root_2, stream_size1.nextTree());

                }
                stream_size1.reset();
                // SqlParser.g:132:33: ( $size2)?
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
    // SqlParser.g:134:1: raise_function : RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN ;
    public final SqlParser.raise_function_return raise_function() throws RecognitionException {
        SqlParser.raise_function_return retval = new SqlParser.raise_function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token error_message=null;
        Token RAISE134=null;
        Token LPAREN135=null;
        Token IGNORE136=null;
        Token set137=null;
        Token COMMA138=null;
        Token RPAREN139=null;

        Object error_message_tree=null;
        Object RAISE134_tree=null;
        Object LPAREN135_tree=null;
        Object IGNORE136_tree=null;
        Object set137_tree=null;
        Object COMMA138_tree=null;
        Object RPAREN139_tree=null;

        try {
            // SqlParser.g:134:15: ( RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN )
            // SqlParser.g:134:17: RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN
            {
            root_0 = (Object)adaptor.nil();

            RAISE134=(Token)match(input,RAISE,FOLLOW_RAISE_in_raise_function1007); 
            RAISE134_tree = (Object)adaptor.create(RAISE134);
            adaptor.addChild(root_0, RAISE134_tree);

            LPAREN135=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_raise_function1009); 
            LPAREN135_tree = (Object)adaptor.create(LPAREN135);
            adaptor.addChild(root_0, LPAREN135_tree);

            // SqlParser.g:134:30: ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING )
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
                    // SqlParser.g:134:31: IGNORE
                    {
                    IGNORE136=(Token)match(input,IGNORE,FOLLOW_IGNORE_in_raise_function1012); 
                    IGNORE136_tree = (Object)adaptor.create(IGNORE136);
                    adaptor.addChild(root_0, IGNORE136_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:134:40: ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING
                    {
                    set137=(Token)input.LT(1);
                    if ( input.LA(1)==ABORT||input.LA(1)==FAIL||input.LA(1)==ROLLBACK ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set137));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    COMMA138=(Token)match(input,COMMA,FOLLOW_COMMA_in_raise_function1028); 
                    COMMA138_tree = (Object)adaptor.create(COMMA138);
                    adaptor.addChild(root_0, COMMA138_tree);

                    error_message=(Token)match(input,STRING,FOLLOW_STRING_in_raise_function1032); 
                    error_message_tree = (Object)adaptor.create(error_message);
                    adaptor.addChild(root_0, error_message_tree);


                    }
                    break;

            }

            RPAREN139=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_raise_function1035); 
            RPAREN139_tree = (Object)adaptor.create(RPAREN139);
            adaptor.addChild(root_0, RPAREN139_tree);


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
    // SqlParser.g:137:1: pragma_stmt : PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )? ;
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
            // SqlParser.g:137:12: ( PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )? )
            // SqlParser.g:137:14: PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            PRAGMA140=(Token)match(input,PRAGMA,FOLLOW_PRAGMA_in_pragma_stmt1043); 
            PRAGMA140_tree = (Object)adaptor.create(PRAGMA140);
            adaptor.addChild(root_0, PRAGMA140_tree);

            // SqlParser.g:137:21: (database_name= id DOT )?
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // SqlParser.g:137:22: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_pragma_stmt1048);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT141=(Token)match(input,DOT,FOLLOW_DOT_in_pragma_stmt1050); 
                    DOT141_tree = (Object)adaptor.create(DOT141);
                    adaptor.addChild(root_0, DOT141_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_pragma_stmt1056);
            pragma_name=id();

            state._fsp--;

            adaptor.addChild(root_0, pragma_name.getTree());
            // SqlParser.g:137:60: ( EQUALS pragma_value | LPAREN pragma_value RPAREN )?
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
                    // SqlParser.g:137:61: EQUALS pragma_value
                    {
                    EQUALS142=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_pragma_stmt1059); 
                    EQUALS142_tree = (Object)adaptor.create(EQUALS142);
                    adaptor.addChild(root_0, EQUALS142_tree);

                    pushFollow(FOLLOW_pragma_value_in_pragma_stmt1061);
                    pragma_value143=pragma_value();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_value143.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:137:83: LPAREN pragma_value RPAREN
                    {
                    LPAREN144=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_pragma_stmt1065); 
                    LPAREN144_tree = (Object)adaptor.create(LPAREN144);
                    adaptor.addChild(root_0, LPAREN144_tree);

                    pushFollow(FOLLOW_pragma_value_in_pragma_stmt1067);
                    pragma_value145=pragma_value();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_value145.getTree());
                    RPAREN146=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_pragma_stmt1069); 
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
    // SqlParser.g:139:1: pragma_value : ( signed_number | name= id | STRING );
    public final SqlParser.pragma_value_return pragma_value() throws RecognitionException {
        SqlParser.pragma_value_return retval = new SqlParser.pragma_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING148=null;
        SqlParser.id_return name = null;

        SqlParser.signed_number_return signed_number147 = null;


        Object STRING148_tree=null;

        try {
            // SqlParser.g:139:13: ( signed_number | name= id | STRING )
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
                    // SqlParser.g:139:15: signed_number
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_signed_number_in_pragma_value1078);
                    signed_number147=signed_number();

                    state._fsp--;

                    adaptor.addChild(root_0, signed_number147.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:139:31: name= id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_in_pragma_value1084);
                    name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, name.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:139:41: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING148=(Token)match(input,STRING,FOLLOW_STRING_in_pragma_value1088); 
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
    // SqlParser.g:142:1: attach_stmt : ATTACH ( DATABASE )? filename= ( STRING | id ) AS database_name= id ;
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
            // SqlParser.g:142:12: ( ATTACH ( DATABASE )? filename= ( STRING | id ) AS database_name= id )
            // SqlParser.g:142:14: ATTACH ( DATABASE )? filename= ( STRING | id ) AS database_name= id
            {
            root_0 = (Object)adaptor.nil();

            ATTACH149=(Token)match(input,ATTACH,FOLLOW_ATTACH_in_attach_stmt1096); 
            ATTACH149_tree = (Object)adaptor.create(ATTACH149);
            adaptor.addChild(root_0, ATTACH149_tree);

            // SqlParser.g:142:21: ( DATABASE )?
            int alt45=2;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // SqlParser.g:142:22: DATABASE
                    {
                    DATABASE150=(Token)match(input,DATABASE,FOLLOW_DATABASE_in_attach_stmt1099); 
                    DATABASE150_tree = (Object)adaptor.create(DATABASE150);
                    adaptor.addChild(root_0, DATABASE150_tree);


                    }
                    break;

            }

            // SqlParser.g:142:42: ( STRING | id )
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
                    // SqlParser.g:142:43: STRING
                    {
                    STRING151=(Token)match(input,STRING,FOLLOW_STRING_in_attach_stmt1106); 
                    STRING151_tree = (Object)adaptor.create(STRING151);
                    adaptor.addChild(root_0, STRING151_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:142:52: id
                    {
                    pushFollow(FOLLOW_id_in_attach_stmt1110);
                    id152=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id152.getTree());

                    }
                    break;

            }

            AS153=(Token)match(input,AS,FOLLOW_AS_in_attach_stmt1113); 
            AS153_tree = (Object)adaptor.create(AS153);
            adaptor.addChild(root_0, AS153_tree);

            pushFollow(FOLLOW_id_in_attach_stmt1117);
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
    // SqlParser.g:145:1: detach_stmt : DETACH ( DATABASE )? database_name= id ;
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
            // SqlParser.g:145:12: ( DETACH ( DATABASE )? database_name= id )
            // SqlParser.g:145:14: DETACH ( DATABASE )? database_name= id
            {
            root_0 = (Object)adaptor.nil();

            DETACH154=(Token)match(input,DETACH,FOLLOW_DETACH_in_detach_stmt1125); 
            DETACH154_tree = (Object)adaptor.create(DETACH154);
            adaptor.addChild(root_0, DETACH154_tree);

            // SqlParser.g:145:21: ( DATABASE )?
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
                    // SqlParser.g:145:22: DATABASE
                    {
                    DATABASE155=(Token)match(input,DATABASE,FOLLOW_DATABASE_in_detach_stmt1128); 
                    DATABASE155_tree = (Object)adaptor.create(DATABASE155);
                    adaptor.addChild(root_0, DATABASE155_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_detach_stmt1134);
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
    // SqlParser.g:148:1: analyze_stmt : ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )? ;
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
            // SqlParser.g:148:13: ( ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )? )
            // SqlParser.g:148:15: ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )?
            {
            root_0 = (Object)adaptor.nil();

            ANALYZE156=(Token)match(input,ANALYZE,FOLLOW_ANALYZE_in_analyze_stmt1142); 
            ANALYZE156_tree = (Object)adaptor.create(ANALYZE156);
            adaptor.addChild(root_0, ANALYZE156_tree);

            // SqlParser.g:148:23: (database_or_table_name= id | database_name= id DOT table_name= id )?
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
                    // SqlParser.g:148:24: database_or_table_name= id
                    {
                    pushFollow(FOLLOW_id_in_analyze_stmt1147);
                    database_or_table_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_or_table_name.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:148:52: database_name= id DOT table_name= id
                    {
                    pushFollow(FOLLOW_id_in_analyze_stmt1153);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT157=(Token)match(input,DOT,FOLLOW_DOT_in_analyze_stmt1155); 
                    DOT157_tree = (Object)adaptor.create(DOT157);
                    adaptor.addChild(root_0, DOT157_tree);

                    pushFollow(FOLLOW_id_in_analyze_stmt1159);
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
    // SqlParser.g:151:1: reindex_stmt : REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id ;
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
            // SqlParser.g:151:13: ( REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id )
            // SqlParser.g:151:15: REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id
            {
            root_0 = (Object)adaptor.nil();

            REINDEX158=(Token)match(input,REINDEX,FOLLOW_REINDEX_in_reindex_stmt1169); 
            REINDEX158_tree = (Object)adaptor.create(REINDEX158);
            adaptor.addChild(root_0, REINDEX158_tree);

            // SqlParser.g:151:23: (database_name= id DOT )?
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
                    // SqlParser.g:151:24: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_reindex_stmt1174);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT159=(Token)match(input,DOT,FOLLOW_DOT_in_reindex_stmt1176); 
                    DOT159_tree = (Object)adaptor.create(DOT159);
                    adaptor.addChild(root_0, DOT159_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_reindex_stmt1182);
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
    // SqlParser.g:154:1: vacuum_stmt : VACUUM ;
    public final SqlParser.vacuum_stmt_return vacuum_stmt() throws RecognitionException {
        SqlParser.vacuum_stmt_return retval = new SqlParser.vacuum_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VACUUM160=null;

        Object VACUUM160_tree=null;

        try {
            // SqlParser.g:154:12: ( VACUUM )
            // SqlParser.g:154:14: VACUUM
            {
            root_0 = (Object)adaptor.nil();

            VACUUM160=(Token)match(input,VACUUM,FOLLOW_VACUUM_in_vacuum_stmt1190); 
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
    // SqlParser.g:160:1: operation_conflict_clause : OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) ;
    public final SqlParser.operation_conflict_clause_return operation_conflict_clause() throws RecognitionException {
        SqlParser.operation_conflict_clause_return retval = new SqlParser.operation_conflict_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR161=null;
        Token set162=null;

        Object OR161_tree=null;
        Object set162_tree=null;

        try {
            // SqlParser.g:160:26: ( OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) )
            // SqlParser.g:160:28: OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE )
            {
            root_0 = (Object)adaptor.nil();

            OR161=(Token)match(input,OR,FOLLOW_OR_in_operation_conflict_clause1201); 
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
    // SqlParser.g:162:1: ordering_term : expr ( ASC | DESC )? -> ^( ORDERING expr ( ASC )? ( DESC )? ) ;
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
            // SqlParser.g:162:14: ( expr ( ASC | DESC )? -> ^( ORDERING expr ( ASC )? ( DESC )? ) )
            // SqlParser.g:162:16: expr ( ASC | DESC )?
            {
            pushFollow(FOLLOW_expr_in_ordering_term1228);
            expr163=expr();

            state._fsp--;

            stream_expr.add(expr163.getTree());
            // SqlParser.g:162:82: ( ASC | DESC )?
            int alt50=3;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // SqlParser.g:162:83: ASC
                    {
                    ASC164=(Token)match(input,ASC,FOLLOW_ASC_in_ordering_term1233);  
                    stream_ASC.add(ASC164);


                    }
                    break;
                case 2 :
                    // SqlParser.g:162:89: DESC
                    {
                    DESC165=(Token)match(input,DESC,FOLLOW_DESC_in_ordering_term1237);  
                    stream_DESC.add(DESC165);


                    }
                    break;

            }



            // AST REWRITE
            // elements: DESC, expr, ASC
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 163:1: -> ^( ORDERING expr ( ASC )? ( DESC )? )
            {
                // SqlParser.g:163:4: ^( ORDERING expr ( ASC )? ( DESC )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ORDERING, "ORDERING"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                // SqlParser.g:163:20: ( ASC )?
                if ( stream_ASC.hasNext() ) {
                    adaptor.addChild(root_1, stream_ASC.nextNode());

                }
                stream_ASC.reset();
                // SqlParser.g:163:27: ( DESC )?
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
    // SqlParser.g:165:1: operation_limited_clause : ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? ;
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
            // SqlParser.g:165:25: ( ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )
            // SqlParser.g:166:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )?
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:166:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ORDER) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // SqlParser.g:166:4: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                    ORDER166=(Token)match(input,ORDER,FOLLOW_ORDER_in_operation_limited_clause1267); 
                    ORDER166_tree = (Object)adaptor.create(ORDER166);
                    adaptor.addChild(root_0, ORDER166_tree);

                    BY167=(Token)match(input,BY,FOLLOW_BY_in_operation_limited_clause1269); 
                    BY167_tree = (Object)adaptor.create(BY167);
                    adaptor.addChild(root_0, BY167_tree);

                    pushFollow(FOLLOW_ordering_term_in_operation_limited_clause1271);
                    ordering_term168=ordering_term();

                    state._fsp--;

                    adaptor.addChild(root_0, ordering_term168.getTree());
                    // SqlParser.g:166:27: ( COMMA ordering_term )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==COMMA) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // SqlParser.g:166:28: COMMA ordering_term
                    	    {
                    	    COMMA169=(Token)match(input,COMMA,FOLLOW_COMMA_in_operation_limited_clause1274); 
                    	    COMMA169_tree = (Object)adaptor.create(COMMA169);
                    	    adaptor.addChild(root_0, COMMA169_tree);

                    	    pushFollow(FOLLOW_ordering_term_in_operation_limited_clause1276);
                    	    ordering_term170=ordering_term();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, ordering_term170.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }

            LIMIT171=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_operation_limited_clause1284); 
            LIMIT171_tree = (Object)adaptor.create(LIMIT171);
            adaptor.addChild(root_0, LIMIT171_tree);

            limit=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation_limited_clause1288); 
            limit_tree = (Object)adaptor.create(limit);
            adaptor.addChild(root_0, limit_tree);

            // SqlParser.g:167:23: ( ( OFFSET | COMMA ) offset= INTEGER )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==COMMA||LA53_0==OFFSET) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // SqlParser.g:167:24: ( OFFSET | COMMA ) offset= INTEGER
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

                    offset=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation_limited_clause1301); 
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
    // SqlParser.g:170:1: select_stmt : select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )? -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? ) ;
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
            // SqlParser.g:170:12: ( select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )? -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? ) )
            // SqlParser.g:170:14: select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )?
            {
            pushFollow(FOLLOW_select_list_in_select_stmt1311);
            select_list173=select_list();

            state._fsp--;

            stream_select_list.add(select_list173.getTree());
            // SqlParser.g:171:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==ORDER) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // SqlParser.g:171:4: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                    ORDER174=(Token)match(input,ORDER,FOLLOW_ORDER_in_select_stmt1316);  
                    stream_ORDER.add(ORDER174);

                    BY175=(Token)match(input,BY,FOLLOW_BY_in_select_stmt1318);  
                    stream_BY.add(BY175);

                    pushFollow(FOLLOW_ordering_term_in_select_stmt1320);
                    ordering_term176=ordering_term();

                    state._fsp--;

                    stream_ordering_term.add(ordering_term176.getTree());
                    // SqlParser.g:171:27: ( COMMA ordering_term )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==COMMA) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // SqlParser.g:171:28: COMMA ordering_term
                    	    {
                    	    COMMA177=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_stmt1323);  
                    	    stream_COMMA.add(COMMA177);

                    	    pushFollow(FOLLOW_ordering_term_in_select_stmt1325);
                    	    ordering_term178=ordering_term();

                    	    state._fsp--;

                    	    stream_ordering_term.add(ordering_term178.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);


                    }
                    break;

            }

            // SqlParser.g:172:3: ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==LIMIT) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // SqlParser.g:172:4: LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )?
                    {
                    LIMIT179=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_select_stmt1334);  
                    stream_LIMIT.add(LIMIT179);

                    limit=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt1338);  
                    stream_INTEGER.add(limit);

                    // SqlParser.g:172:24: ( ( OFFSET | COMMA ) offset= INTEGER )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==COMMA||LA57_0==OFFSET) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // SqlParser.g:172:25: ( OFFSET | COMMA ) offset= INTEGER
                            {
                            // SqlParser.g:172:25: ( OFFSET | COMMA )
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
                                    // SqlParser.g:172:26: OFFSET
                                    {
                                    OFFSET180=(Token)match(input,OFFSET,FOLLOW_OFFSET_in_select_stmt1342);  
                                    stream_OFFSET.add(OFFSET180);


                                    }
                                    break;
                                case 2 :
                                    // SqlParser.g:172:35: COMMA
                                    {
                                    COMMA181=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_stmt1346);  
                                    stream_COMMA.add(COMMA181);


                                    }
                                    break;

                            }

                            offset=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt1351);  
                            stream_INTEGER.add(offset);


                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: LIMIT, ORDER, select_list, limit, ordering_term, offset
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
            // 173:1: -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? )
            {
                // SqlParser.g:173:4: ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECT, "SELECT"), root_1);

                adaptor.addChild(root_1, stream_select_list.nextTree());
                // SqlParser.g:174:22: ( ^( ORDER ( ordering_term )+ ) )?
                if ( stream_ORDER.hasNext()||stream_ordering_term.hasNext() ) {
                    // SqlParser.g:174:22: ^( ORDER ( ordering_term )+ )
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
                // SqlParser.g:174:47: ( ^( LIMIT $limit ( $offset)? ) )?
                if ( stream_LIMIT.hasNext()||stream_limit.hasNext()||stream_offset.hasNext() ) {
                    // SqlParser.g:174:47: ^( LIMIT $limit ( $offset)? )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_LIMIT.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_limit.nextNode());
                    // SqlParser.g:174:62: ( $offset)?
                    if ( stream_offset.hasNext() ) {
                        adaptor.addChild(root_2, stream_offset.nextNode());

                    }
                    stream_offset.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_LIMIT.reset();
                stream_limit.reset();
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
    // SqlParser.g:177:1: select_list : select_core ( select_op select_core )* ;
    public final SqlParser.select_list_return select_list() throws RecognitionException {
        SqlParser.select_list_return retval = new SqlParser.select_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.select_core_return select_core182 = null;

        SqlParser.select_op_return select_op183 = null;

        SqlParser.select_core_return select_core184 = null;



        try {
            // SqlParser.g:177:12: ( select_core ( select_op select_core )* )
            // SqlParser.g:178:3: select_core ( select_op select_core )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_select_core_in_select_list1396);
            select_core182=select_core();

            state._fsp--;

            adaptor.addChild(root_0, select_core182.getTree());
            // SqlParser.g:178:15: ( select_op select_core )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==EXCEPT||LA59_0==INTERSECT||LA59_0==UNION) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // SqlParser.g:178:16: select_op select_core
            	    {
            	    pushFollow(FOLLOW_select_op_in_select_list1399);
            	    select_op183=select_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(select_op183.getTree(), root_0);
            	    pushFollow(FOLLOW_select_core_in_select_list1402);
            	    select_core184=select_core();

            	    state._fsp--;

            	    adaptor.addChild(root_0, select_core184.getTree());

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
    // SqlParser.g:180:1: select_op : ( UNION ( ALL )? | INTERSECT | EXCEPT );
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
            // SqlParser.g:180:10: ( UNION ( ALL )? | INTERSECT | EXCEPT )
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
                    // SqlParser.g:180:12: UNION ( ALL )?
                    {
                    root_0 = (Object)adaptor.nil();

                    UNION185=(Token)match(input,UNION,FOLLOW_UNION_in_select_op1411); 
                    UNION185_tree = (Object)adaptor.create(UNION185);
                    root_0 = (Object)adaptor.becomeRoot(UNION185_tree, root_0);

                    // SqlParser.g:180:19: ( ALL )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==ALL) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // SqlParser.g:180:20: ALL
                            {
                            ALL186=(Token)match(input,ALL,FOLLOW_ALL_in_select_op1415); 
                            ALL186_tree = (Object)adaptor.create(ALL186);
                            adaptor.addChild(root_0, ALL186_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:180:28: INTERSECT
                    {
                    root_0 = (Object)adaptor.nil();

                    INTERSECT187=(Token)match(input,INTERSECT,FOLLOW_INTERSECT_in_select_op1421); 
                    INTERSECT187_tree = (Object)adaptor.create(INTERSECT187);
                    adaptor.addChild(root_0, INTERSECT187_tree);


                    }
                    break;
                case 3 :
                    // SqlParser.g:180:40: EXCEPT
                    {
                    root_0 = (Object)adaptor.nil();

                    EXCEPT188=(Token)match(input,EXCEPT,FOLLOW_EXCEPT_in_select_op1425); 
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
    // SqlParser.g:182:1: select_core : SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )? -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? ) ;
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
            // SqlParser.g:182:12: ( SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )? -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? ) )
            // SqlParser.g:183:3: SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )?
            {
            SELECT189=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_core1434);  
            stream_SELECT.add(SELECT189);

            // SqlParser.g:183:10: ( ALL | DISTINCT )?
            int alt62=3;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // SqlParser.g:183:11: ALL
                    {
                    ALL190=(Token)match(input,ALL,FOLLOW_ALL_in_select_core1437);  
                    stream_ALL.add(ALL190);


                    }
                    break;
                case 2 :
                    // SqlParser.g:183:17: DISTINCT
                    {
                    DISTINCT191=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_select_core1441);  
                    stream_DISTINCT.add(DISTINCT191);


                    }
                    break;

            }

            pushFollow(FOLLOW_result_column_in_select_core1445);
            result_column192=result_column();

            state._fsp--;

            stream_result_column.add(result_column192.getTree());
            // SqlParser.g:183:42: ( COMMA result_column )*
            loop63:
            do {
                int alt63=2;
                alt63 = dfa63.predict(input);
                switch (alt63) {
            	case 1 :
            	    // SqlParser.g:183:43: COMMA result_column
            	    {
            	    COMMA193=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_core1448);  
            	    stream_COMMA.add(COMMA193);

            	    pushFollow(FOLLOW_result_column_in_select_core1450);
            	    result_column194=result_column();

            	    state._fsp--;

            	    stream_result_column.add(result_column194.getTree());

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            // SqlParser.g:183:65: ( FROM join_source )?
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // SqlParser.g:183:66: FROM join_source
                    {
                    FROM195=(Token)match(input,FROM,FOLLOW_FROM_in_select_core1455);  
                    stream_FROM.add(FROM195);

                    pushFollow(FOLLOW_join_source_in_select_core1457);
                    join_source196=join_source();

                    state._fsp--;

                    stream_join_source.add(join_source196.getTree());

                    }
                    break;

            }

            // SqlParser.g:183:85: ( WHERE where_expr= expr )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // SqlParser.g:183:86: WHERE where_expr= expr
                    {
                    WHERE197=(Token)match(input,WHERE,FOLLOW_WHERE_in_select_core1462);  
                    stream_WHERE.add(WHERE197);

                    pushFollow(FOLLOW_expr_in_select_core1466);
                    where_expr=expr();

                    state._fsp--;

                    stream_expr.add(where_expr.getTree());

                    }
                    break;

            }

            // SqlParser.g:184:3: ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==GROUP) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // SqlParser.g:184:5: GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )?
                    {
                    GROUP198=(Token)match(input,GROUP,FOLLOW_GROUP_in_select_core1474);  
                    stream_GROUP.add(GROUP198);

                    BY199=(Token)match(input,BY,FOLLOW_BY_in_select_core1476);  
                    stream_BY.add(BY199);

                    pushFollow(FOLLOW_ordering_term_in_select_core1478);
                    ordering_term200=ordering_term();

                    state._fsp--;

                    stream_ordering_term.add(ordering_term200.getTree());
                    // SqlParser.g:184:28: ( COMMA ordering_term )*
                    loop66:
                    do {
                        int alt66=2;
                        alt66 = dfa66.predict(input);
                        switch (alt66) {
                    	case 1 :
                    	    // SqlParser.g:184:29: COMMA ordering_term
                    	    {
                    	    COMMA201=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_core1481);  
                    	    stream_COMMA.add(COMMA201);

                    	    pushFollow(FOLLOW_ordering_term_in_select_core1483);
                    	    ordering_term202=ordering_term();

                    	    state._fsp--;

                    	    stream_ordering_term.add(ordering_term202.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);

                    // SqlParser.g:184:51: ( HAVING having_expr= expr )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==HAVING) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // SqlParser.g:184:52: HAVING having_expr= expr
                            {
                            HAVING203=(Token)match(input,HAVING,FOLLOW_HAVING_in_select_core1488);  
                            stream_HAVING.add(HAVING203);

                            pushFollow(FOLLOW_expr_in_select_core1492);
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
            // elements: DISTINCT, where_expr, join_source, WHERE, HAVING, GROUP, result_column, ordering_term, FROM, having_expr
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
            // 185:1: -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? )
            {
                // SqlParser.g:185:4: ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECT_CORE, "SELECT_CORE"), root_1);

                // SqlParser.g:186:15: ( DISTINCT )?
                if ( stream_DISTINCT.hasNext() ) {
                    adaptor.addChild(root_1, stream_DISTINCT.nextNode());

                }
                stream_DISTINCT.reset();
                // SqlParser.g:186:27: ^( COLUMNS ( result_column )+ )
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
                // SqlParser.g:186:53: ( ^( FROM join_source ) )?
                if ( stream_join_source.hasNext()||stream_FROM.hasNext() ) {
                    // SqlParser.g:186:53: ^( FROM join_source )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_FROM.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_join_source.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_join_source.reset();
                stream_FROM.reset();
                // SqlParser.g:186:74: ( ^( WHERE $where_expr) )?
                if ( stream_where_expr.hasNext()||stream_WHERE.hasNext() ) {
                    // SqlParser.g:186:74: ^( WHERE $where_expr)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_WHERE.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_where_expr.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_where_expr.reset();
                stream_WHERE.reset();
                // SqlParser.g:187:3: ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )?
                if ( stream_HAVING.hasNext()||stream_GROUP.hasNext()||stream_ordering_term.hasNext()||stream_having_expr.hasNext() ) {
                    // SqlParser.g:187:3: ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? )
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
                    // SqlParser.g:187:26: ( ^( HAVING $having_expr) )?
                    if ( stream_HAVING.hasNext()||stream_having_expr.hasNext() ) {
                        // SqlParser.g:187:26: ^( HAVING $having_expr)
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
                stream_GROUP.reset();
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
    // SqlParser.g:190:1: result_column : ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) );
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
            // SqlParser.g:191:3: ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) )
            int alt71=3;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // SqlParser.g:191:5: ASTERISK
                    {
                    root_0 = (Object)adaptor.nil();

                    ASTERISK204=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_result_column1562); 
                    ASTERISK204_tree = (Object)adaptor.create(ASTERISK204);
                    adaptor.addChild(root_0, ASTERISK204_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:192:5: table_name= id DOT ASTERISK
                    {
                    pushFollow(FOLLOW_id_in_result_column1570);
                    table_name=id();

                    state._fsp--;

                    stream_id.add(table_name.getTree());
                    DOT205=(Token)match(input,DOT,FOLLOW_DOT_in_result_column1572);  
                    stream_DOT.add(DOT205);

                    ASTERISK206=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_result_column1574);  
                    stream_ASTERISK.add(ASTERISK206);



                    // AST REWRITE
                    // elements: ASTERISK, table_name
                    // token labels: 
                    // rule labels: retval, table_name
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 192:32: -> ^( ASTERISK $table_name)
                    {
                        // SqlParser.g:192:35: ^( ASTERISK $table_name)
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
                    // SqlParser.g:193:5: expr ( ( AS )? column_alias= id )?
                    {
                    pushFollow(FOLLOW_expr_in_result_column1589);
                    expr207=expr();

                    state._fsp--;

                    stream_expr.add(expr207.getTree());
                    // SqlParser.g:193:10: ( ( AS )? column_alias= id )?
                    int alt70=2;
                    alt70 = dfa70.predict(input);
                    switch (alt70) {
                        case 1 :
                            // SqlParser.g:193:11: ( AS )? column_alias= id
                            {
                            // SqlParser.g:193:11: ( AS )?
                            int alt69=2;
                            alt69 = dfa69.predict(input);
                            switch (alt69) {
                                case 1 :
                                    // SqlParser.g:193:12: AS
                                    {
                                    AS208=(Token)match(input,AS,FOLLOW_AS_in_result_column1593);  
                                    stream_AS.add(AS208);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_id_in_result_column1599);
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
                    // 193:35: -> ^( ALIAS expr ( $column_alias)? )
                    {
                        // SqlParser.g:193:38: ^( ALIAS expr ( $column_alias)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // SqlParser.g:193:51: ( $column_alias)?
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
    // SqlParser.g:195:1: join_source : single_source ( join_op single_source ( join_constraint )? )* ;
    public final SqlParser.join_source_return join_source() throws RecognitionException {
        SqlParser.join_source_return retval = new SqlParser.join_source_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.single_source_return single_source209 = null;

        SqlParser.join_op_return join_op210 = null;

        SqlParser.single_source_return single_source211 = null;

        SqlParser.join_constraint_return join_constraint212 = null;



        try {
            // SqlParser.g:195:12: ( single_source ( join_op single_source ( join_constraint )? )* )
            // SqlParser.g:195:14: single_source ( join_op single_source ( join_constraint )? )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_single_source_in_join_source1620);
            single_source209=single_source();

            state._fsp--;

            adaptor.addChild(root_0, single_source209.getTree());
            // SqlParser.g:195:28: ( join_op single_source ( join_constraint )? )*
            loop73:
            do {
                int alt73=2;
                alt73 = dfa73.predict(input);
                switch (alt73) {
            	case 1 :
            	    // SqlParser.g:195:29: join_op single_source ( join_constraint )?
            	    {
            	    pushFollow(FOLLOW_join_op_in_join_source1623);
            	    join_op210=join_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(join_op210.getTree(), root_0);
            	    pushFollow(FOLLOW_single_source_in_join_source1626);
            	    single_source211=single_source();

            	    state._fsp--;

            	    adaptor.addChild(root_0, single_source211.getTree());
            	    // SqlParser.g:195:52: ( join_constraint )?
            	    int alt72=2;
            	    alt72 = dfa72.predict(input);
            	    switch (alt72) {
            	        case 1 :
            	            // SqlParser.g:195:53: join_constraint
            	            {
            	            pushFollow(FOLLOW_join_constraint_in_join_source1629);
            	            join_constraint212=join_constraint();

            	            state._fsp--;

            	            adaptor.addChild(root_0, join_constraint212.getTree());

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
    // SqlParser.g:197:1: single_source : ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN );
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
            // SqlParser.g:198:3: ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN )
            int alt80=3;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // SqlParser.g:198:5: (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )?
                    {
                    // SqlParser.g:198:5: (database_name= id DOT )?
                    int alt74=2;
                    alt74 = dfa74.predict(input);
                    switch (alt74) {
                        case 1 :
                            // SqlParser.g:198:6: database_name= id DOT
                            {
                            pushFollow(FOLLOW_id_in_single_source1646);
                            database_name=id();

                            state._fsp--;

                            stream_id.add(database_name.getTree());
                            DOT213=(Token)match(input,DOT,FOLLOW_DOT_in_single_source1648);  
                            stream_DOT.add(DOT213);


                            }
                            break;

                    }

                    table_name=(Token)match(input,ID,FOLLOW_ID_in_single_source1654);  
                    stream_ID.add(table_name);

                    // SqlParser.g:198:43: ( ( AS )? table_alias= ID )?
                    int alt76=2;
                    alt76 = dfa76.predict(input);
                    switch (alt76) {
                        case 1 :
                            // SqlParser.g:198:44: ( AS )? table_alias= ID
                            {
                            // SqlParser.g:198:44: ( AS )?
                            int alt75=2;
                            int LA75_0 = input.LA(1);

                            if ( (LA75_0==AS) ) {
                                alt75=1;
                            }
                            switch (alt75) {
                                case 1 :
                                    // SqlParser.g:198:45: AS
                                    {
                                    AS214=(Token)match(input,AS,FOLLOW_AS_in_single_source1658);  
                                    stream_AS.add(AS214);


                                    }
                                    break;

                            }

                            table_alias=(Token)match(input,ID,FOLLOW_ID_in_single_source1664);  
                            stream_ID.add(table_alias);


                            }
                            break;

                    }

                    // SqlParser.g:198:67: ( INDEXED BY index_name= id | NOT INDEXED )?
                    int alt77=3;
                    alt77 = dfa77.predict(input);
                    switch (alt77) {
                        case 1 :
                            // SqlParser.g:198:68: INDEXED BY index_name= id
                            {
                            INDEXED215=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_single_source1669);  
                            stream_INDEXED.add(INDEXED215);

                            BY216=(Token)match(input,BY,FOLLOW_BY_in_single_source1671);  
                            stream_BY.add(BY216);

                            pushFollow(FOLLOW_id_in_single_source1675);
                            index_name=id();

                            state._fsp--;

                            stream_id.add(index_name.getTree());

                            }
                            break;
                        case 2 :
                            // SqlParser.g:198:95: NOT INDEXED
                            {
                            NOT217=(Token)match(input,NOT,FOLLOW_NOT_in_single_source1679);  
                            stream_NOT.add(NOT217);

                            INDEXED218=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_single_source1681);  
                            stream_INDEXED.add(INDEXED218);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: index_name, NOT, INDEXED, table_alias, database_name, table_name
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
                    // 199:3: -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? )
                    {
                        // SqlParser.g:199:6: ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        // SqlParser.g:199:14: ^( $table_name ( $database_name)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                        // SqlParser.g:199:28: ( $database_name)?
                        if ( stream_database_name.hasNext() ) {
                            adaptor.addChild(root_2, stream_database_name.nextTree());

                        }
                        stream_database_name.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // SqlParser.g:199:45: ( $table_alias)?
                        if ( stream_table_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_table_alias.nextNode());

                        }
                        stream_table_alias.reset();
                        // SqlParser.g:199:59: ( ^( INDEXED ( NOT )? ( $index_name)? ) )?
                        if ( stream_index_name.hasNext()||stream_NOT.hasNext()||stream_INDEXED.hasNext() ) {
                            // SqlParser.g:199:59: ^( INDEXED ( NOT )? ( $index_name)? )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(stream_INDEXED.nextNode(), root_2);

                            // SqlParser.g:199:69: ( NOT )?
                            if ( stream_NOT.hasNext() ) {
                                adaptor.addChild(root_2, stream_NOT.nextNode());

                            }
                            stream_NOT.reset();
                            // SqlParser.g:199:74: ( $index_name)?
                            if ( stream_index_name.hasNext() ) {
                                adaptor.addChild(root_2, stream_index_name.nextTree());

                            }
                            stream_index_name.reset();

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_index_name.reset();
                        stream_NOT.reset();
                        stream_INDEXED.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // SqlParser.g:200:5: LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )?
                    {
                    LPAREN219=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_single_source1722);  
                    stream_LPAREN.add(LPAREN219);

                    pushFollow(FOLLOW_select_stmt_in_single_source1724);
                    select_stmt220=select_stmt();

                    state._fsp--;

                    stream_select_stmt.add(select_stmt220.getTree());
                    RPAREN221=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_single_source1726);  
                    stream_RPAREN.add(RPAREN221);

                    // SqlParser.g:200:31: ( ( AS )? table_alias= ID )?
                    int alt79=2;
                    alt79 = dfa79.predict(input);
                    switch (alt79) {
                        case 1 :
                            // SqlParser.g:200:32: ( AS )? table_alias= ID
                            {
                            // SqlParser.g:200:32: ( AS )?
                            int alt78=2;
                            int LA78_0 = input.LA(1);

                            if ( (LA78_0==AS) ) {
                                alt78=1;
                            }
                            switch (alt78) {
                                case 1 :
                                    // SqlParser.g:200:33: AS
                                    {
                                    AS222=(Token)match(input,AS,FOLLOW_AS_in_single_source1730);  
                                    stream_AS.add(AS222);


                                    }
                                    break;

                            }

                            table_alias=(Token)match(input,ID,FOLLOW_ID_in_single_source1736);  
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
                    // 201:3: -> ^( ALIAS select_stmt ( $table_alias)? )
                    {
                        // SqlParser.g:201:6: ^( ALIAS select_stmt ( $table_alias)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        adaptor.addChild(root_1, stream_select_stmt.nextTree());
                        // SqlParser.g:201:26: ( $table_alias)?
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
                    // SqlParser.g:202:5: LPAREN join_source RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN223=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_single_source1758); 
                    pushFollow(FOLLOW_join_source_in_single_source1761);
                    join_source224=join_source();

                    state._fsp--;

                    adaptor.addChild(root_0, join_source224.getTree());
                    RPAREN225=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_single_source1763); 

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
    // SqlParser.g:204:1: join_op : ( COMMA | ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN );
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
            // SqlParser.g:205:3: ( COMMA | ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN )
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
                    // SqlParser.g:205:5: COMMA
                    {
                    root_0 = (Object)adaptor.nil();

                    COMMA226=(Token)match(input,COMMA,FOLLOW_COMMA_in_join_op1774); 
                    COMMA226_tree = (Object)adaptor.create(COMMA226);
                    adaptor.addChild(root_0, COMMA226_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:206:5: ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:206:5: ( NATURAL )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==NATURAL) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // SqlParser.g:206:6: NATURAL
                            {
                            NATURAL227=(Token)match(input,NATURAL,FOLLOW_NATURAL_in_join_op1781); 
                            NATURAL227_tree = (Object)adaptor.create(NATURAL227);
                            adaptor.addChild(root_0, NATURAL227_tree);


                            }
                            break;

                    }

                    // SqlParser.g:206:16: ( ( LEFT )? ( OUTER )? | INNER | CROSS )
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
                            // SqlParser.g:206:17: ( LEFT )? ( OUTER )?
                            {
                            // SqlParser.g:206:17: ( LEFT )?
                            int alt82=2;
                            int LA82_0 = input.LA(1);

                            if ( (LA82_0==LEFT) ) {
                                alt82=1;
                            }
                            switch (alt82) {
                                case 1 :
                                    // SqlParser.g:206:18: LEFT
                                    {
                                    LEFT228=(Token)match(input,LEFT,FOLLOW_LEFT_in_join_op1787); 
                                    LEFT228_tree = (Object)adaptor.create(LEFT228);
                                    adaptor.addChild(root_0, LEFT228_tree);


                                    }
                                    break;

                            }

                            // SqlParser.g:206:25: ( OUTER )?
                            int alt83=2;
                            int LA83_0 = input.LA(1);

                            if ( (LA83_0==OUTER) ) {
                                alt83=1;
                            }
                            switch (alt83) {
                                case 1 :
                                    // SqlParser.g:206:26: OUTER
                                    {
                                    OUTER229=(Token)match(input,OUTER,FOLLOW_OUTER_in_join_op1792); 
                                    OUTER229_tree = (Object)adaptor.create(OUTER229);
                                    adaptor.addChild(root_0, OUTER229_tree);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // SqlParser.g:206:36: INNER
                            {
                            INNER230=(Token)match(input,INNER,FOLLOW_INNER_in_join_op1798); 
                            INNER230_tree = (Object)adaptor.create(INNER230);
                            adaptor.addChild(root_0, INNER230_tree);


                            }
                            break;
                        case 3 :
                            // SqlParser.g:206:44: CROSS
                            {
                            CROSS231=(Token)match(input,CROSS,FOLLOW_CROSS_in_join_op1802); 
                            CROSS231_tree = (Object)adaptor.create(CROSS231);
                            adaptor.addChild(root_0, CROSS231_tree);


                            }
                            break;

                    }

                    JOIN232=(Token)match(input,JOIN,FOLLOW_JOIN_in_join_op1805); 
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
    // SqlParser.g:208:1: join_constraint : ( ON expr | USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN -> ^( USING ( $column_names)+ ) );
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
            // SqlParser.g:209:3: ( ON expr | USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN -> ^( USING ( $column_names)+ ) )
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
                    // SqlParser.g:209:5: ON expr
                    {
                    root_0 = (Object)adaptor.nil();

                    ON233=(Token)match(input,ON,FOLLOW_ON_in_join_constraint1816); 
                    ON233_tree = (Object)adaptor.create(ON233);
                    root_0 = (Object)adaptor.becomeRoot(ON233_tree, root_0);

                    pushFollow(FOLLOW_expr_in_join_constraint1819);
                    expr234=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr234.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:210:5: USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                    {
                    USING235=(Token)match(input,USING,FOLLOW_USING_in_join_constraint1825);  
                    stream_USING.add(USING235);

                    LPAREN236=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_join_constraint1827);  
                    stream_LPAREN.add(LPAREN236);

                    pushFollow(FOLLOW_id_in_join_constraint1831);
                    column_names=id();

                    state._fsp--;

                    stream_id.add(column_names.getTree());
                    if (list_column_names==null) list_column_names=new ArrayList();
                    list_column_names.add(column_names.getTree());

                    // SqlParser.g:210:35: ( COMMA column_names+= id )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==COMMA) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // SqlParser.g:210:36: COMMA column_names+= id
                    	    {
                    	    COMMA237=(Token)match(input,COMMA,FOLLOW_COMMA_in_join_constraint1834);  
                    	    stream_COMMA.add(COMMA237);

                    	    pushFollow(FOLLOW_id_in_join_constraint1838);
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

                    RPAREN238=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_join_constraint1842);  
                    stream_RPAREN.add(RPAREN238);



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
                    // 210:68: -> ^( USING ( $column_names)+ )
                    {
                        // SqlParser.g:210:71: ^( USING ( $column_names)+ )
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
    // SqlParser.g:213:1: insert_stmt : ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES ) ;
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
            // SqlParser.g:213:12: ( ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES ) )
            // SqlParser.g:213:14: ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES )
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:213:14: ( INSERT ( operation_conflict_clause )? | REPLACE )
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
                    // SqlParser.g:213:15: INSERT ( operation_conflict_clause )?
                    {
                    INSERT239=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_stmt1861); 
                    INSERT239_tree = (Object)adaptor.create(INSERT239);
                    adaptor.addChild(root_0, INSERT239_tree);

                    // SqlParser.g:213:22: ( operation_conflict_clause )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==OR) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // SqlParser.g:213:23: operation_conflict_clause
                            {
                            pushFollow(FOLLOW_operation_conflict_clause_in_insert_stmt1864);
                            operation_conflict_clause240=operation_conflict_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, operation_conflict_clause240.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:213:53: REPLACE
                    {
                    REPLACE241=(Token)match(input,REPLACE,FOLLOW_REPLACE_in_insert_stmt1870); 
                    REPLACE241_tree = (Object)adaptor.create(REPLACE241);
                    adaptor.addChild(root_0, REPLACE241_tree);


                    }
                    break;

            }

            INTO242=(Token)match(input,INTO,FOLLOW_INTO_in_insert_stmt1873); 
            INTO242_tree = (Object)adaptor.create(INTO242);
            adaptor.addChild(root_0, INTO242_tree);

            // SqlParser.g:213:67: (database_name= id DOT )?
            int alt90=2;
            alt90 = dfa90.predict(input);
            switch (alt90) {
                case 1 :
                    // SqlParser.g:213:68: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_insert_stmt1878);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT243=(Token)match(input,DOT,FOLLOW_DOT_in_insert_stmt1880); 
                    DOT243_tree = (Object)adaptor.create(DOT243);
                    adaptor.addChild(root_0, DOT243_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_insert_stmt1886);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:214:3: ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES )
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
                    // SqlParser.g:214:5: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt )
                    {
                    // SqlParser.g:214:5: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==LPAREN) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // SqlParser.g:214:6: LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                            {
                            LPAREN244=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt1893); 
                            LPAREN244_tree = (Object)adaptor.create(LPAREN244);
                            adaptor.addChild(root_0, LPAREN244_tree);

                            pushFollow(FOLLOW_id_in_insert_stmt1897);
                            column_names=id();

                            state._fsp--;

                            adaptor.addChild(root_0, column_names.getTree());
                            if (list_column_names==null) list_column_names=new ArrayList();
                            list_column_names.add(column_names.getTree());

                            // SqlParser.g:214:30: ( COMMA column_names+= id )*
                            loop91:
                            do {
                                int alt91=2;
                                int LA91_0 = input.LA(1);

                                if ( (LA91_0==COMMA) ) {
                                    alt91=1;
                                }


                                switch (alt91) {
                            	case 1 :
                            	    // SqlParser.g:214:31: COMMA column_names+= id
                            	    {
                            	    COMMA245=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt1900); 
                            	    COMMA245_tree = (Object)adaptor.create(COMMA245);
                            	    adaptor.addChild(root_0, COMMA245_tree);

                            	    pushFollow(FOLLOW_id_in_insert_stmt1904);
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

                            RPAREN246=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt1908); 
                            RPAREN246_tree = (Object)adaptor.create(RPAREN246);
                            adaptor.addChild(root_0, RPAREN246_tree);


                            }
                            break;

                    }

                    // SqlParser.g:215:5: ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt )
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
                            // SqlParser.g:215:6: VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN
                            {
                            VALUES247=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt1917); 
                            VALUES247_tree = (Object)adaptor.create(VALUES247);
                            adaptor.addChild(root_0, VALUES247_tree);

                            LPAREN248=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt1919); 
                            LPAREN248_tree = (Object)adaptor.create(LPAREN248);
                            adaptor.addChild(root_0, LPAREN248_tree);

                            pushFollow(FOLLOW_expr_in_insert_stmt1923);
                            values=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, values.getTree());
                            if (list_values==null) list_values=new ArrayList();
                            list_values.add(values.getTree());

                            // SqlParser.g:215:33: ( COMMA values+= expr )*
                            loop93:
                            do {
                                int alt93=2;
                                int LA93_0 = input.LA(1);

                                if ( (LA93_0==COMMA) ) {
                                    alt93=1;
                                }


                                switch (alt93) {
                            	case 1 :
                            	    // SqlParser.g:215:34: COMMA values+= expr
                            	    {
                            	    COMMA249=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt1926); 
                            	    COMMA249_tree = (Object)adaptor.create(COMMA249);
                            	    adaptor.addChild(root_0, COMMA249_tree);

                            	    pushFollow(FOLLOW_expr_in_insert_stmt1930);
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

                            RPAREN250=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt1934); 
                            RPAREN250_tree = (Object)adaptor.create(RPAREN250);
                            adaptor.addChild(root_0, RPAREN250_tree);


                            }
                            break;
                        case 2 :
                            // SqlParser.g:215:64: select_stmt
                            {
                            pushFollow(FOLLOW_select_stmt_in_insert_stmt1938);
                            select_stmt251=select_stmt();

                            state._fsp--;

                            adaptor.addChild(root_0, select_stmt251.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:216:5: DEFAULT VALUES
                    {
                    DEFAULT252=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_insert_stmt1945); 
                    DEFAULT252_tree = (Object)adaptor.create(DEFAULT252);
                    adaptor.addChild(root_0, DEFAULT252_tree);

                    VALUES253=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt1947); 
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
    // SqlParser.g:219:1: update_stmt : UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )? ;
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
            // SqlParser.g:219:12: ( UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )? )
            // SqlParser.g:219:14: UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )?
            {
            root_0 = (Object)adaptor.nil();

            UPDATE254=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_update_stmt1957); 
            UPDATE254_tree = (Object)adaptor.create(UPDATE254);
            adaptor.addChild(root_0, UPDATE254_tree);

            // SqlParser.g:219:21: ( operation_conflict_clause )?
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
                    // SqlParser.g:219:22: operation_conflict_clause
                    {
                    pushFollow(FOLLOW_operation_conflict_clause_in_update_stmt1960);
                    operation_conflict_clause255=operation_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_conflict_clause255.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_qualified_table_name_in_update_stmt1964);
            qualified_table_name256=qualified_table_name();

            state._fsp--;

            adaptor.addChild(root_0, qualified_table_name256.getTree());
            SET257=(Token)match(input,SET,FOLLOW_SET_in_update_stmt1968); 
            SET257_tree = (Object)adaptor.create(SET257);
            adaptor.addChild(root_0, SET257_tree);

            pushFollow(FOLLOW_update_set_in_update_stmt1972);
            values=update_set();

            state._fsp--;

            adaptor.addChild(root_0, values.getTree());
            if (list_values==null) list_values=new ArrayList();
            list_values.add(values.getTree());

            // SqlParser.g:220:26: ( COMMA values+= update_set )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==COMMA) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // SqlParser.g:220:27: COMMA values+= update_set
            	    {
            	    COMMA258=(Token)match(input,COMMA,FOLLOW_COMMA_in_update_stmt1975); 
            	    COMMA258_tree = (Object)adaptor.create(COMMA258);
            	    adaptor.addChild(root_0, COMMA258_tree);

            	    pushFollow(FOLLOW_update_set_in_update_stmt1979);
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

            // SqlParser.g:220:54: ( WHERE expr )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==WHERE) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // SqlParser.g:220:55: WHERE expr
                    {
                    WHERE259=(Token)match(input,WHERE,FOLLOW_WHERE_in_update_stmt1984); 
                    WHERE259_tree = (Object)adaptor.create(WHERE259);
                    adaptor.addChild(root_0, WHERE259_tree);

                    pushFollow(FOLLOW_expr_in_update_stmt1986);
                    expr260=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr260.getTree());

                    }
                    break;

            }

            // SqlParser.g:220:68: ( operation_limited_clause )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==LIMIT||LA99_0==ORDER) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // SqlParser.g:220:69: operation_limited_clause
                    {
                    pushFollow(FOLLOW_operation_limited_clause_in_update_stmt1991);
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
    // SqlParser.g:222:1: update_set : column_name= id EQUALS expr ;
    public final SqlParser.update_set_return update_set() throws RecognitionException {
        SqlParser.update_set_return retval = new SqlParser.update_set_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EQUALS262=null;
        SqlParser.id_return column_name = null;

        SqlParser.expr_return expr263 = null;


        Object EQUALS262_tree=null;

        try {
            // SqlParser.g:222:11: (column_name= id EQUALS expr )
            // SqlParser.g:222:13: column_name= id EQUALS expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_update_set2002);
            column_name=id();

            state._fsp--;

            adaptor.addChild(root_0, column_name.getTree());
            EQUALS262=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_update_set2004); 
            EQUALS262_tree = (Object)adaptor.create(EQUALS262);
            adaptor.addChild(root_0, EQUALS262_tree);

            pushFollow(FOLLOW_expr_in_update_set2006);
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
    // SqlParser.g:225:1: delete_stmt : DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )? ;
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
            // SqlParser.g:225:12: ( DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )? )
            // SqlParser.g:225:14: DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )?
            {
            root_0 = (Object)adaptor.nil();

            DELETE264=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_stmt2014); 
            DELETE264_tree = (Object)adaptor.create(DELETE264);
            adaptor.addChild(root_0, DELETE264_tree);

            FROM265=(Token)match(input,FROM,FOLLOW_FROM_in_delete_stmt2016); 
            FROM265_tree = (Object)adaptor.create(FROM265);
            adaptor.addChild(root_0, FROM265_tree);

            pushFollow(FOLLOW_qualified_table_name_in_delete_stmt2018);
            qualified_table_name266=qualified_table_name();

            state._fsp--;

            adaptor.addChild(root_0, qualified_table_name266.getTree());
            // SqlParser.g:225:47: ( WHERE expr )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==WHERE) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // SqlParser.g:225:48: WHERE expr
                    {
                    WHERE267=(Token)match(input,WHERE,FOLLOW_WHERE_in_delete_stmt2021); 
                    WHERE267_tree = (Object)adaptor.create(WHERE267);
                    adaptor.addChild(root_0, WHERE267_tree);

                    pushFollow(FOLLOW_expr_in_delete_stmt2023);
                    expr268=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr268.getTree());

                    }
                    break;

            }

            // SqlParser.g:225:61: ( operation_limited_clause )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==LIMIT||LA101_0==ORDER) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // SqlParser.g:225:62: operation_limited_clause
                    {
                    pushFollow(FOLLOW_operation_limited_clause_in_delete_stmt2028);
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
    // SqlParser.g:228:1: begin_stmt : BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )? ;
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
            // SqlParser.g:228:11: ( BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )? )
            // SqlParser.g:228:13: BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )?
            {
            root_0 = (Object)adaptor.nil();

            BEGIN270=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_begin_stmt2038); 
            BEGIN270_tree = (Object)adaptor.create(BEGIN270);
            adaptor.addChild(root_0, BEGIN270_tree);

            // SqlParser.g:228:19: ( DEFERRED | IMMEDIATE | EXCLUSIVE )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==DEFERRED||LA102_0==EXCLUSIVE||LA102_0==IMMEDIATE) ) {
                alt102=1;
            }
            switch (alt102) {
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

            // SqlParser.g:228:55: ( TRANSACTION )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==TRANSACTION) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // SqlParser.g:228:56: TRANSACTION
                    {
                    TRANSACTION272=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_begin_stmt2054); 
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
    // SqlParser.g:231:1: commit_stmt : ( COMMIT | END ) ( TRANSACTION )? ;
    public final SqlParser.commit_stmt_return commit_stmt() throws RecognitionException {
        SqlParser.commit_stmt_return retval = new SqlParser.commit_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set273=null;
        Token TRANSACTION274=null;

        Object set273_tree=null;
        Object TRANSACTION274_tree=null;

        try {
            // SqlParser.g:231:12: ( ( COMMIT | END ) ( TRANSACTION )? )
            // SqlParser.g:231:14: ( COMMIT | END ) ( TRANSACTION )?
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

            // SqlParser.g:231:29: ( TRANSACTION )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==TRANSACTION) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // SqlParser.g:231:30: TRANSACTION
                    {
                    TRANSACTION274=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_commit_stmt2073); 
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
    // SqlParser.g:234:1: rollback_stmt : ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )? ;
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
            // SqlParser.g:234:14: ( ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )? )
            // SqlParser.g:234:16: ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )?
            {
            root_0 = (Object)adaptor.nil();

            ROLLBACK275=(Token)match(input,ROLLBACK,FOLLOW_ROLLBACK_in_rollback_stmt2083); 
            ROLLBACK275_tree = (Object)adaptor.create(ROLLBACK275);
            adaptor.addChild(root_0, ROLLBACK275_tree);

            // SqlParser.g:234:25: ( TRANSACTION )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==TRANSACTION) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // SqlParser.g:234:26: TRANSACTION
                    {
                    TRANSACTION276=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_rollback_stmt2086); 
                    TRANSACTION276_tree = (Object)adaptor.create(TRANSACTION276);
                    adaptor.addChild(root_0, TRANSACTION276_tree);


                    }
                    break;

            }

            // SqlParser.g:234:40: ( TO ( SAVEPOINT )? savepoint_name= id )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==TO) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // SqlParser.g:234:41: TO ( SAVEPOINT )? savepoint_name= id
                    {
                    TO277=(Token)match(input,TO,FOLLOW_TO_in_rollback_stmt2091); 
                    TO277_tree = (Object)adaptor.create(TO277);
                    adaptor.addChild(root_0, TO277_tree);

                    // SqlParser.g:234:44: ( SAVEPOINT )?
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
                            // SqlParser.g:234:45: SAVEPOINT
                            {
                            SAVEPOINT278=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_rollback_stmt2094); 
                            SAVEPOINT278_tree = (Object)adaptor.create(SAVEPOINT278);
                            adaptor.addChild(root_0, SAVEPOINT278_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_id_in_rollback_stmt2100);
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
    // SqlParser.g:237:1: savepoint_stmt : SAVEPOINT savepoint_name= id ;
    public final SqlParser.savepoint_stmt_return savepoint_stmt() throws RecognitionException {
        SqlParser.savepoint_stmt_return retval = new SqlParser.savepoint_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SAVEPOINT279=null;
        SqlParser.id_return savepoint_name = null;


        Object SAVEPOINT279_tree=null;

        try {
            // SqlParser.g:237:15: ( SAVEPOINT savepoint_name= id )
            // SqlParser.g:237:17: SAVEPOINT savepoint_name= id
            {
            root_0 = (Object)adaptor.nil();

            SAVEPOINT279=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_savepoint_stmt2110); 
            SAVEPOINT279_tree = (Object)adaptor.create(SAVEPOINT279);
            adaptor.addChild(root_0, SAVEPOINT279_tree);

            pushFollow(FOLLOW_id_in_savepoint_stmt2114);
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
    // SqlParser.g:240:1: release_stmt : RELEASE ( SAVEPOINT )? savepoint_name= id ;
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
            // SqlParser.g:240:13: ( RELEASE ( SAVEPOINT )? savepoint_name= id )
            // SqlParser.g:240:15: RELEASE ( SAVEPOINT )? savepoint_name= id
            {
            root_0 = (Object)adaptor.nil();

            RELEASE280=(Token)match(input,RELEASE,FOLLOW_RELEASE_in_release_stmt2122); 
            RELEASE280_tree = (Object)adaptor.create(RELEASE280);
            adaptor.addChild(root_0, RELEASE280_tree);

            // SqlParser.g:240:23: ( SAVEPOINT )?
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
                    // SqlParser.g:240:24: SAVEPOINT
                    {
                    SAVEPOINT281=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_release_stmt2125); 
                    SAVEPOINT281_tree = (Object)adaptor.create(SAVEPOINT281);
                    adaptor.addChild(root_0, SAVEPOINT281_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_release_stmt2131);
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
    // SqlParser.g:247:1: table_conflict_clause : ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) ;
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
            // SqlParser.g:247:22: ( ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) )
            // SqlParser.g:247:24: ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE )
            {
            root_0 = (Object)adaptor.nil();

            ON282=(Token)match(input,ON,FOLLOW_ON_in_table_conflict_clause2143); 
            CONFLICT283=(Token)match(input,CONFLICT,FOLLOW_CONFLICT_in_table_conflict_clause2146); 
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
    // SqlParser.g:251:1: create_virtual_table_stmt : CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )? ;
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
            // SqlParser.g:251:26: ( CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )? )
            // SqlParser.g:251:28: CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            CREATE285=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_virtual_table_stmt2176); 
            CREATE285_tree = (Object)adaptor.create(CREATE285);
            adaptor.addChild(root_0, CREATE285_tree);

            VIRTUAL286=(Token)match(input,VIRTUAL,FOLLOW_VIRTUAL_in_create_virtual_table_stmt2178); 
            VIRTUAL286_tree = (Object)adaptor.create(VIRTUAL286);
            adaptor.addChild(root_0, VIRTUAL286_tree);

            TABLE287=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_virtual_table_stmt2180); 
            TABLE287_tree = (Object)adaptor.create(TABLE287);
            adaptor.addChild(root_0, TABLE287_tree);

            // SqlParser.g:251:49: (database_name= id DOT )?
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
                    // SqlParser.g:251:50: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_virtual_table_stmt2185);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT288=(Token)match(input,DOT,FOLLOW_DOT_in_create_virtual_table_stmt2187); 
                    DOT288_tree = (Object)adaptor.create(DOT288);
                    adaptor.addChild(root_0, DOT288_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_virtual_table_stmt2193);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            USING289=(Token)match(input,USING,FOLLOW_USING_in_create_virtual_table_stmt2197); 
            USING289_tree = (Object)adaptor.create(USING289);
            adaptor.addChild(root_0, USING289_tree);

            pushFollow(FOLLOW_id_in_create_virtual_table_stmt2201);
            module_name=id();

            state._fsp--;

            adaptor.addChild(root_0, module_name.getTree());
            // SqlParser.g:252:24: ( LPAREN column_def ( COMMA column_def )* RPAREN )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==LPAREN) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // SqlParser.g:252:25: LPAREN column_def ( COMMA column_def )* RPAREN
                    {
                    LPAREN290=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_virtual_table_stmt2204); 
                    LPAREN290_tree = (Object)adaptor.create(LPAREN290);
                    adaptor.addChild(root_0, LPAREN290_tree);

                    pushFollow(FOLLOW_column_def_in_create_virtual_table_stmt2206);
                    column_def291=column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, column_def291.getTree());
                    // SqlParser.g:252:43: ( COMMA column_def )*
                    loop110:
                    do {
                        int alt110=2;
                        int LA110_0 = input.LA(1);

                        if ( (LA110_0==COMMA) ) {
                            alt110=1;
                        }


                        switch (alt110) {
                    	case 1 :
                    	    // SqlParser.g:252:44: COMMA column_def
                    	    {
                    	    COMMA292=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_virtual_table_stmt2209); 
                    	    COMMA292_tree = (Object)adaptor.create(COMMA292);
                    	    adaptor.addChild(root_0, COMMA292_tree);

                    	    pushFollow(FOLLOW_column_def_in_create_virtual_table_stmt2211);
                    	    column_def293=column_def();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, column_def293.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop110;
                        }
                    } while (true);

                    RPAREN294=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_virtual_table_stmt2215); 
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
    // SqlParser.g:255:1: create_table_stmt : CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt ) -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? ) ;
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
            // SqlParser.g:255:18: ( CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt ) -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? ) )
            // SqlParser.g:255:20: CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt )
            {
            CREATE295=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_table_stmt2225);  
            stream_CREATE.add(CREATE295);

            // SqlParser.g:255:27: ( TEMPORARY )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==TEMPORARY) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // SqlParser.g:255:27: TEMPORARY
                    {
                    TEMPORARY296=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_table_stmt2227);  
                    stream_TEMPORARY.add(TEMPORARY296);


                    }
                    break;

            }

            TABLE297=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_table_stmt2230);  
            stream_TABLE.add(TABLE297);

            // SqlParser.g:255:44: ( IF NOT EXISTS )?
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
                    // SqlParser.g:255:45: IF NOT EXISTS
                    {
                    IF298=(Token)match(input,IF,FOLLOW_IF_in_create_table_stmt2233);  
                    stream_IF.add(IF298);

                    NOT299=(Token)match(input,NOT,FOLLOW_NOT_in_create_table_stmt2235);  
                    stream_NOT.add(NOT299);

                    EXISTS300=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_table_stmt2237);  
                    stream_EXISTS.add(EXISTS300);


                    }
                    break;

            }

            // SqlParser.g:255:61: (database_name= id DOT )?
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
                    // SqlParser.g:255:62: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_table_stmt2244);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT301=(Token)match(input,DOT,FOLLOW_DOT_in_create_table_stmt2246);  
                    stream_DOT.add(DOT301);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_table_stmt2252);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());
            // SqlParser.g:256:3: ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt )
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
                    // SqlParser.g:256:5: LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN
                    {
                    LPAREN302=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_table_stmt2258);  
                    stream_LPAREN.add(LPAREN302);

                    pushFollow(FOLLOW_column_def_in_create_table_stmt2260);
                    column_def303=column_def();

                    state._fsp--;

                    stream_column_def.add(column_def303.getTree());
                    // SqlParser.g:256:23: ( COMMA column_def )*
                    loop115:
                    do {
                        int alt115=2;
                        alt115 = dfa115.predict(input);
                        switch (alt115) {
                    	case 1 :
                    	    // SqlParser.g:256:24: COMMA column_def
                    	    {
                    	    COMMA304=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_table_stmt2263);  
                    	    stream_COMMA.add(COMMA304);

                    	    pushFollow(FOLLOW_column_def_in_create_table_stmt2265);
                    	    column_def305=column_def();

                    	    state._fsp--;

                    	    stream_column_def.add(column_def305.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop115;
                        }
                    } while (true);

                    // SqlParser.g:256:43: ( COMMA table_constraint )*
                    loop116:
                    do {
                        int alt116=2;
                        int LA116_0 = input.LA(1);

                        if ( (LA116_0==COMMA) ) {
                            alt116=1;
                        }


                        switch (alt116) {
                    	case 1 :
                    	    // SqlParser.g:256:44: COMMA table_constraint
                    	    {
                    	    COMMA306=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_table_stmt2270);  
                    	    stream_COMMA.add(COMMA306);

                    	    pushFollow(FOLLOW_table_constraint_in_create_table_stmt2272);
                    	    table_constraint307=table_constraint();

                    	    state._fsp--;

                    	    stream_table_constraint.add(table_constraint307.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop116;
                        }
                    } while (true);

                    RPAREN308=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_table_stmt2276);  
                    stream_RPAREN.add(RPAREN308);


                    }
                    break;
                case 2 :
                    // SqlParser.g:257:5: AS select_stmt
                    {
                    AS309=(Token)match(input,AS,FOLLOW_AS_in_create_table_stmt2282);  
                    stream_AS.add(AS309);

                    pushFollow(FOLLOW_select_stmt_in_create_table_stmt2284);
                    select_stmt310=select_stmt();

                    state._fsp--;

                    stream_select_stmt.add(select_stmt310.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: column_def, EXISTS, table_name, database_name, table_constraint, select_stmt, TEMPORARY
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
            // 258:1: -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? )
            {
                // SqlParser.g:258:4: ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CREATE_TABLE, "CREATE_TABLE"), root_1);

                // SqlParser.g:258:19: ^( OPTIONS ( TEMPORARY )? ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:258:29: ( TEMPORARY )?
                if ( stream_TEMPORARY.hasNext() ) {
                    adaptor.addChild(root_2, stream_TEMPORARY.nextNode());

                }
                stream_TEMPORARY.reset();
                // SqlParser.g:258:40: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:258:49: ^( $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                // SqlParser.g:258:63: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:259:3: ( ^( COLUMNS ( column_def )+ ) )?
                if ( stream_column_def.hasNext() ) {
                    // SqlParser.g:259:3: ^( COLUMNS ( column_def )+ )
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
                // SqlParser.g:259:27: ( ^( CONSTRAINTS ( table_constraint )* ) )?
                if ( stream_table_constraint.hasNext() ) {
                    // SqlParser.g:259:27: ^( CONSTRAINTS ( table_constraint )* )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRAINTS, "CONSTRAINTS"), root_2);

                    // SqlParser.g:259:41: ( table_constraint )*
                    while ( stream_table_constraint.hasNext() ) {
                        adaptor.addChild(root_2, stream_table_constraint.nextTree());

                    }
                    stream_table_constraint.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_table_constraint.reset();
                // SqlParser.g:259:61: ( select_stmt )?
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
    // SqlParser.g:261:1: column_def : name= id_column_def ( type_name )? ( column_constraint )* -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? ) ;
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
            // SqlParser.g:261:11: (name= id_column_def ( type_name )? ( column_constraint )* -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? ) )
            // SqlParser.g:261:13: name= id_column_def ( type_name )? ( column_constraint )*
            {
            pushFollow(FOLLOW_id_column_def_in_column_def2340);
            name=id_column_def();

            state._fsp--;

            stream_id_column_def.add(name.getTree());
            // SqlParser.g:261:32: ( type_name )?
            int alt118=2;
            alt118 = dfa118.predict(input);
            switch (alt118) {
                case 1 :
                    // SqlParser.g:261:32: type_name
                    {
                    pushFollow(FOLLOW_type_name_in_column_def2342);
                    type_name311=type_name();

                    state._fsp--;

                    stream_type_name.add(type_name311.getTree());

                    }
                    break;

            }

            // SqlParser.g:261:43: ( column_constraint )*
            loop119:
            do {
                int alt119=2;
                alt119 = dfa119.predict(input);
                switch (alt119) {
            	case 1 :
            	    // SqlParser.g:261:43: column_constraint
            	    {
            	    pushFollow(FOLLOW_column_constraint_in_column_def2345);
            	    column_constraint312=column_constraint();

            	    state._fsp--;

            	    stream_column_constraint.add(column_constraint312.getTree());

            	    }
            	    break;

            	default :
            	    break loop119;
                }
            } while (true);



            // AST REWRITE
            // elements: column_constraint, name, type_name
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 262:1: -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? )
            {
                // SqlParser.g:262:4: ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_name.nextNode(), root_1);

                // SqlParser.g:262:12: ^( CONSTRAINTS ( column_constraint )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRAINTS, "CONSTRAINTS"), root_2);

                // SqlParser.g:262:26: ( column_constraint )*
                while ( stream_column_constraint.hasNext() ) {
                    adaptor.addChild(root_2, stream_column_constraint.nextTree());

                }
                stream_column_constraint.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:262:46: ( type_name )?
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
    // SqlParser.g:264:1: column_constraint : ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause ) -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? ) ;
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
            // SqlParser.g:264:18: ( ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause ) -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? ) )
            // SqlParser.g:264:20: ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause )
            {
            // SqlParser.g:264:20: ( CONSTRAINT name= id )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==CONSTRAINT) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // SqlParser.g:264:21: CONSTRAINT name= id
                    {
                    CONSTRAINT313=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_column_constraint2371);  
                    stream_CONSTRAINT.add(CONSTRAINT313);

                    pushFollow(FOLLOW_id_in_column_constraint2375);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());

                    }
                    break;

            }

            // SqlParser.g:265:3: ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause )
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
                    // SqlParser.g:265:5: column_constraint_pk
                    {
                    pushFollow(FOLLOW_column_constraint_pk_in_column_constraint2383);
                    column_constraint_pk314=column_constraint_pk();

                    state._fsp--;

                    stream_column_constraint_pk.add(column_constraint_pk314.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:266:5: column_constraint_not_null
                    {
                    pushFollow(FOLLOW_column_constraint_not_null_in_column_constraint2389);
                    column_constraint_not_null315=column_constraint_not_null();

                    state._fsp--;

                    stream_column_constraint_not_null.add(column_constraint_not_null315.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:267:5: column_constraint_unique
                    {
                    pushFollow(FOLLOW_column_constraint_unique_in_column_constraint2395);
                    column_constraint_unique316=column_constraint_unique();

                    state._fsp--;

                    stream_column_constraint_unique.add(column_constraint_unique316.getTree());

                    }
                    break;
                case 4 :
                    // SqlParser.g:268:5: column_constraint_check
                    {
                    pushFollow(FOLLOW_column_constraint_check_in_column_constraint2401);
                    column_constraint_check317=column_constraint_check();

                    state._fsp--;

                    stream_column_constraint_check.add(column_constraint_check317.getTree());

                    }
                    break;
                case 5 :
                    // SqlParser.g:269:5: column_constraint_default
                    {
                    pushFollow(FOLLOW_column_constraint_default_in_column_constraint2407);
                    column_constraint_default318=column_constraint_default();

                    state._fsp--;

                    stream_column_constraint_default.add(column_constraint_default318.getTree());

                    }
                    break;
                case 6 :
                    // SqlParser.g:270:5: column_constraint_collate
                    {
                    pushFollow(FOLLOW_column_constraint_collate_in_column_constraint2413);
                    column_constraint_collate319=column_constraint_collate();

                    state._fsp--;

                    stream_column_constraint_collate.add(column_constraint_collate319.getTree());

                    }
                    break;
                case 7 :
                    // SqlParser.g:271:5: fk_clause
                    {
                    pushFollow(FOLLOW_fk_clause_in_column_constraint2419);
                    fk_clause320=fk_clause();

                    state._fsp--;

                    stream_fk_clause.add(fk_clause320.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: column_constraint_not_null, column_constraint_pk, fk_clause, column_constraint_unique, column_constraint_collate, name, column_constraint_check, column_constraint_default
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 272:1: -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? )
            {
                // SqlParser.g:272:4: ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMN_CONSTRAINT, "COLUMN_CONSTRAINT"), root_1);

                // SqlParser.g:273:3: ( column_constraint_pk )?
                if ( stream_column_constraint_pk.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_pk.nextTree());

                }
                stream_column_constraint_pk.reset();
                // SqlParser.g:274:3: ( column_constraint_not_null )?
                if ( stream_column_constraint_not_null.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_not_null.nextTree());

                }
                stream_column_constraint_not_null.reset();
                // SqlParser.g:275:3: ( column_constraint_unique )?
                if ( stream_column_constraint_unique.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_unique.nextTree());

                }
                stream_column_constraint_unique.reset();
                // SqlParser.g:276:3: ( column_constraint_check )?
                if ( stream_column_constraint_check.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_check.nextTree());

                }
                stream_column_constraint_check.reset();
                // SqlParser.g:277:3: ( column_constraint_default )?
                if ( stream_column_constraint_default.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_default.nextTree());

                }
                stream_column_constraint_default.reset();
                // SqlParser.g:278:3: ( column_constraint_collate )?
                if ( stream_column_constraint_collate.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_collate.nextTree());

                }
                stream_column_constraint_collate.reset();
                // SqlParser.g:279:3: ( fk_clause )?
                if ( stream_fk_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_fk_clause.nextTree());

                }
                stream_fk_clause.reset();
                // SqlParser.g:280:3: ( $name)?
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
    // SqlParser.g:282:1: column_constraint_pk : PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )? ;
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
            // SqlParser.g:282:21: ( PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )? )
            // SqlParser.g:282:23: PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )?
            {
            root_0 = (Object)adaptor.nil();

            PRIMARY321=(Token)match(input,PRIMARY,FOLLOW_PRIMARY_in_column_constraint_pk2474); 
            PRIMARY321_tree = (Object)adaptor.create(PRIMARY321);
            root_0 = (Object)adaptor.becomeRoot(PRIMARY321_tree, root_0);

            KEY322=(Token)match(input,KEY,FOLLOW_KEY_in_column_constraint_pk2477); 
            // SqlParser.g:282:37: ( ASC | DESC )?
            int alt122=2;
            alt122 = dfa122.predict(input);
            switch (alt122) {
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

            // SqlParser.g:282:51: ( table_conflict_clause )?
            int alt123=2;
            alt123 = dfa123.predict(input);
            switch (alt123) {
                case 1 :
                    // SqlParser.g:282:51: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_pk2489);
                    table_conflict_clause324=table_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, table_conflict_clause324.getTree());

                    }
                    break;

            }

            // SqlParser.g:282:74: ( AUTOINCREMENT )?
            int alt124=2;
            alt124 = dfa124.predict(input);
            switch (alt124) {
                case 1 :
                    // SqlParser.g:282:75: AUTOINCREMENT
                    {
                    AUTOINCREMENT325=(Token)match(input,AUTOINCREMENT,FOLLOW_AUTOINCREMENT_in_column_constraint_pk2493); 
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
    // SqlParser.g:284:1: column_constraint_not_null : NOT NULL ( table_conflict_clause )? -> ^( NOT_NULL ( table_conflict_clause )? ) ;
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
            // SqlParser.g:284:27: ( NOT NULL ( table_conflict_clause )? -> ^( NOT_NULL ( table_conflict_clause )? ) )
            // SqlParser.g:284:29: NOT NULL ( table_conflict_clause )?
            {
            NOT326=(Token)match(input,NOT,FOLLOW_NOT_in_column_constraint_not_null2502);  
            stream_NOT.add(NOT326);

            NULL327=(Token)match(input,NULL,FOLLOW_NULL_in_column_constraint_not_null2504);  
            stream_NULL.add(NULL327);

            // SqlParser.g:284:38: ( table_conflict_clause )?
            int alt125=2;
            alt125 = dfa125.predict(input);
            switch (alt125) {
                case 1 :
                    // SqlParser.g:284:38: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_not_null2506);
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
            // 284:61: -> ^( NOT_NULL ( table_conflict_clause )? )
            {
                // SqlParser.g:284:64: ^( NOT_NULL ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_NULL, "NOT_NULL"), root_1);

                // SqlParser.g:284:75: ( table_conflict_clause )?
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
    // SqlParser.g:286:1: column_constraint_unique : UNIQUE ( table_conflict_clause )? ;
    public final SqlParser.column_constraint_unique_return column_constraint_unique() throws RecognitionException {
        SqlParser.column_constraint_unique_return retval = new SqlParser.column_constraint_unique_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNIQUE329=null;
        SqlParser.table_conflict_clause_return table_conflict_clause330 = null;


        Object UNIQUE329_tree=null;

        try {
            // SqlParser.g:286:25: ( UNIQUE ( table_conflict_clause )? )
            // SqlParser.g:286:27: UNIQUE ( table_conflict_clause )?
            {
            root_0 = (Object)adaptor.nil();

            UNIQUE329=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_column_constraint_unique2523); 
            UNIQUE329_tree = (Object)adaptor.create(UNIQUE329);
            root_0 = (Object)adaptor.becomeRoot(UNIQUE329_tree, root_0);

            // SqlParser.g:286:35: ( table_conflict_clause )?
            int alt126=2;
            alt126 = dfa126.predict(input);
            switch (alt126) {
                case 1 :
                    // SqlParser.g:286:35: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_unique2526);
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
    // SqlParser.g:288:1: column_constraint_check : CHECK LPAREN expr RPAREN ;
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
            // SqlParser.g:288:24: ( CHECK LPAREN expr RPAREN )
            // SqlParser.g:288:26: CHECK LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            CHECK331=(Token)match(input,CHECK,FOLLOW_CHECK_in_column_constraint_check2534); 
            CHECK331_tree = (Object)adaptor.create(CHECK331);
            root_0 = (Object)adaptor.becomeRoot(CHECK331_tree, root_0);

            LPAREN332=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_column_constraint_check2537); 
            pushFollow(FOLLOW_expr_in_column_constraint_check2540);
            expr333=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr333.getTree());
            RPAREN334=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_column_constraint_check2542); 

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
    // SqlParser.g:290:1: column_constraint_default : DEFAULT ( SIGNED_NUMBER | literal_value | LPAREN expr RPAREN ) ;
    public final SqlParser.column_constraint_default_return column_constraint_default() throws RecognitionException {
        SqlParser.column_constraint_default_return retval = new SqlParser.column_constraint_default_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT335=null;
        Token SIGNED_NUMBER336=null;
        Token LPAREN338=null;
        Token RPAREN340=null;
        SqlParser.literal_value_return literal_value337 = null;

        SqlParser.expr_return expr339 = null;


        Object DEFAULT335_tree=null;
        Object SIGNED_NUMBER336_tree=null;
        Object LPAREN338_tree=null;
        Object RPAREN340_tree=null;

        try {
            // SqlParser.g:290:26: ( DEFAULT ( SIGNED_NUMBER | literal_value | LPAREN expr RPAREN ) )
            // SqlParser.g:290:28: DEFAULT ( SIGNED_NUMBER | literal_value | LPAREN expr RPAREN )
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT335=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_column_constraint_default2550); 
            DEFAULT335_tree = (Object)adaptor.create(DEFAULT335);
            root_0 = (Object)adaptor.becomeRoot(DEFAULT335_tree, root_0);

            // SqlParser.g:290:37: ( SIGNED_NUMBER | literal_value | LPAREN expr RPAREN )
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
                    // SqlParser.g:290:38: SIGNED_NUMBER
                    {
                    SIGNED_NUMBER336=(Token)match(input,SIGNED_NUMBER,FOLLOW_SIGNED_NUMBER_in_column_constraint_default2554); 
                    SIGNED_NUMBER336_tree = (Object)adaptor.create(SIGNED_NUMBER336);
                    adaptor.addChild(root_0, SIGNED_NUMBER336_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:290:54: literal_value
                    {
                    pushFollow(FOLLOW_literal_value_in_column_constraint_default2558);
                    literal_value337=literal_value();

                    state._fsp--;

                    adaptor.addChild(root_0, literal_value337.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:290:70: LPAREN expr RPAREN
                    {
                    LPAREN338=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_column_constraint_default2562); 
                    pushFollow(FOLLOW_expr_in_column_constraint_default2565);
                    expr339=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr339.getTree());
                    RPAREN340=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_column_constraint_default2567); 

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
    // SqlParser.g:292:1: column_constraint_collate : COLLATE collation_name= id ;
    public final SqlParser.column_constraint_collate_return column_constraint_collate() throws RecognitionException {
        SqlParser.column_constraint_collate_return retval = new SqlParser.column_constraint_collate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLLATE341=null;
        SqlParser.id_return collation_name = null;


        Object COLLATE341_tree=null;

        try {
            // SqlParser.g:292:26: ( COLLATE collation_name= id )
            // SqlParser.g:292:28: COLLATE collation_name= id
            {
            root_0 = (Object)adaptor.nil();

            COLLATE341=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_column_constraint_collate2576); 
            COLLATE341_tree = (Object)adaptor.create(COLLATE341);
            root_0 = (Object)adaptor.becomeRoot(COLLATE341_tree, root_0);

            pushFollow(FOLLOW_id_in_column_constraint_collate2581);
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
    // SqlParser.g:294:1: table_constraint : ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk ) -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? ) ;
    public final SqlParser.table_constraint_return table_constraint() throws RecognitionException {
        SqlParser.table_constraint_return retval = new SqlParser.table_constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONSTRAINT342=null;
        SqlParser.id_return name = null;

        SqlParser.table_constraint_pk_return table_constraint_pk343 = null;

        SqlParser.table_constraint_unique_return table_constraint_unique344 = null;

        SqlParser.table_constraint_check_return table_constraint_check345 = null;

        SqlParser.table_constraint_fk_return table_constraint_fk346 = null;


        Object CONSTRAINT342_tree=null;
        RewriteRuleTokenStream stream_CONSTRAINT=new RewriteRuleTokenStream(adaptor,"token CONSTRAINT");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_table_constraint_pk=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_pk");
        RewriteRuleSubtreeStream stream_table_constraint_fk=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_fk");
        RewriteRuleSubtreeStream stream_table_constraint_unique=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_unique");
        RewriteRuleSubtreeStream stream_table_constraint_check=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_check");
        try {
            // SqlParser.g:294:17: ( ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk ) -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? ) )
            // SqlParser.g:294:19: ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk )
            {
            // SqlParser.g:294:19: ( CONSTRAINT name= id )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==CONSTRAINT) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // SqlParser.g:294:20: CONSTRAINT name= id
                    {
                    CONSTRAINT342=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_table_constraint2590);  
                    stream_CONSTRAINT.add(CONSTRAINT342);

                    pushFollow(FOLLOW_id_in_table_constraint2594);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());

                    }
                    break;

            }

            // SqlParser.g:295:3: ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk )
            int alt129=4;
            switch ( input.LA(1) ) {
            case PRIMARY:
                {
                alt129=1;
                }
                break;
            case UNIQUE:
                {
                alt129=2;
                }
                break;
            case CHECK:
                {
                alt129=3;
                }
                break;
            case FOREIGN:
                {
                alt129=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }

            switch (alt129) {
                case 1 :
                    // SqlParser.g:295:5: table_constraint_pk
                    {
                    pushFollow(FOLLOW_table_constraint_pk_in_table_constraint2602);
                    table_constraint_pk343=table_constraint_pk();

                    state._fsp--;

                    stream_table_constraint_pk.add(table_constraint_pk343.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:296:5: table_constraint_unique
                    {
                    pushFollow(FOLLOW_table_constraint_unique_in_table_constraint2608);
                    table_constraint_unique344=table_constraint_unique();

                    state._fsp--;

                    stream_table_constraint_unique.add(table_constraint_unique344.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:297:5: table_constraint_check
                    {
                    pushFollow(FOLLOW_table_constraint_check_in_table_constraint2614);
                    table_constraint_check345=table_constraint_check();

                    state._fsp--;

                    stream_table_constraint_check.add(table_constraint_check345.getTree());

                    }
                    break;
                case 4 :
                    // SqlParser.g:298:5: table_constraint_fk
                    {
                    pushFollow(FOLLOW_table_constraint_fk_in_table_constraint2620);
                    table_constraint_fk346=table_constraint_fk();

                    state._fsp--;

                    stream_table_constraint_fk.add(table_constraint_fk346.getTree());

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
            // 299:1: -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? )
            {
                // SqlParser.g:299:4: ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TABLE_CONSTRAINT, "TABLE_CONSTRAINT"), root_1);

                // SqlParser.g:300:3: ( table_constraint_pk )?
                if ( stream_table_constraint_pk.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_pk.nextTree());

                }
                stream_table_constraint_pk.reset();
                // SqlParser.g:301:3: ( table_constraint_unique )?
                if ( stream_table_constraint_unique.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_unique.nextTree());

                }
                stream_table_constraint_unique.reset();
                // SqlParser.g:302:3: ( table_constraint_check )?
                if ( stream_table_constraint_check.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_check.nextTree());

                }
                stream_table_constraint_check.reset();
                // SqlParser.g:303:3: ( table_constraint_fk )?
                if ( stream_table_constraint_fk.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_fk.nextTree());

                }
                stream_table_constraint_fk.reset();
                // SqlParser.g:304:3: ( $name)?
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
    // SqlParser.g:306:1: table_constraint_pk : PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) ;
    public final SqlParser.table_constraint_pk_return table_constraint_pk() throws RecognitionException {
        SqlParser.table_constraint_pk_return retval = new SqlParser.table_constraint_pk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRIMARY347=null;
        Token KEY348=null;
        Token LPAREN349=null;
        Token COMMA350=null;
        Token RPAREN351=null;
        List list_indexed_columns=null;
        SqlParser.table_conflict_clause_return table_conflict_clause352 = null;

        SqlParser.id_return indexed_columns = null;
         indexed_columns = null;
        Object PRIMARY347_tree=null;
        Object KEY348_tree=null;
        Object LPAREN349_tree=null;
        Object COMMA350_tree=null;
        Object RPAREN351_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_PRIMARY=new RewriteRuleTokenStream(adaptor,"token PRIMARY");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // SqlParser.g:306:20: ( PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) )
            // SqlParser.g:306:22: PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )?
            {
            PRIMARY347=(Token)match(input,PRIMARY,FOLLOW_PRIMARY_in_table_constraint_pk2660);  
            stream_PRIMARY.add(PRIMARY347);

            KEY348=(Token)match(input,KEY,FOLLOW_KEY_in_table_constraint_pk2662);  
            stream_KEY.add(KEY348);

            LPAREN349=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_pk2666);  
            stream_LPAREN.add(LPAREN349);

            pushFollow(FOLLOW_id_in_table_constraint_pk2670);
            indexed_columns=id();

            state._fsp--;

            stream_id.add(indexed_columns.getTree());
            if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            list_indexed_columns.add(indexed_columns.getTree());

            // SqlParser.g:307:30: ( COMMA indexed_columns+= id )*
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( (LA130_0==COMMA) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // SqlParser.g:307:31: COMMA indexed_columns+= id
            	    {
            	    COMMA350=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_pk2673);  
            	    stream_COMMA.add(COMMA350);

            	    pushFollow(FOLLOW_id_in_table_constraint_pk2677);
            	    indexed_columns=id();

            	    state._fsp--;

            	    stream_id.add(indexed_columns.getTree());
            	    if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            	    list_indexed_columns.add(indexed_columns.getTree());


            	    }
            	    break;

            	default :
            	    break loop130;
                }
            } while (true);

            RPAREN351=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_pk2681);  
            stream_RPAREN.add(RPAREN351);

            // SqlParser.g:307:66: ( table_conflict_clause )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==ON) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // SqlParser.g:307:66: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_table_constraint_pk2683);
                    table_conflict_clause352=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause352.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: PRIMARY, indexed_columns, table_conflict_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: indexed_columns
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_indexed_columns=new RewriteRuleSubtreeStream(adaptor,"token indexed_columns",list_indexed_columns);
            root_0 = (Object)adaptor.nil();
            // 308:1: -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
            {
                // SqlParser.g:308:4: ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_PRIMARY.nextNode(), root_1);

                // SqlParser.g:308:14: ^( COLUMNS ( $indexed_columns)+ )
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
                // SqlParser.g:308:43: ( table_conflict_clause )?
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
    // SqlParser.g:310:1: table_constraint_unique : UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) ;
    public final SqlParser.table_constraint_unique_return table_constraint_unique() throws RecognitionException {
        SqlParser.table_constraint_unique_return retval = new SqlParser.table_constraint_unique_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNIQUE353=null;
        Token LPAREN354=null;
        Token COMMA355=null;
        Token RPAREN356=null;
        List list_indexed_columns=null;
        SqlParser.table_conflict_clause_return table_conflict_clause357 = null;

        SqlParser.id_return indexed_columns = null;
         indexed_columns = null;
        Object UNIQUE353_tree=null;
        Object LPAREN354_tree=null;
        Object COMMA355_tree=null;
        Object RPAREN356_tree=null;
        RewriteRuleTokenStream stream_UNIQUE=new RewriteRuleTokenStream(adaptor,"token UNIQUE");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // SqlParser.g:310:24: ( UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) )
            // SqlParser.g:310:26: UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )?
            {
            UNIQUE353=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_table_constraint_unique2708);  
            stream_UNIQUE.add(UNIQUE353);

            LPAREN354=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_unique2712);  
            stream_LPAREN.add(LPAREN354);

            pushFollow(FOLLOW_id_in_table_constraint_unique2716);
            indexed_columns=id();

            state._fsp--;

            stream_id.add(indexed_columns.getTree());
            if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            list_indexed_columns.add(indexed_columns.getTree());

            // SqlParser.g:311:30: ( COMMA indexed_columns+= id )*
            loop132:
            do {
                int alt132=2;
                int LA132_0 = input.LA(1);

                if ( (LA132_0==COMMA) ) {
                    alt132=1;
                }


                switch (alt132) {
            	case 1 :
            	    // SqlParser.g:311:31: COMMA indexed_columns+= id
            	    {
            	    COMMA355=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_unique2719);  
            	    stream_COMMA.add(COMMA355);

            	    pushFollow(FOLLOW_id_in_table_constraint_unique2723);
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

            RPAREN356=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_unique2727);  
            stream_RPAREN.add(RPAREN356);

            // SqlParser.g:311:66: ( table_conflict_clause )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==ON) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // SqlParser.g:311:66: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_table_constraint_unique2729);
                    table_conflict_clause357=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause357.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: UNIQUE, indexed_columns, table_conflict_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: indexed_columns
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_indexed_columns=new RewriteRuleSubtreeStream(adaptor,"token indexed_columns",list_indexed_columns);
            root_0 = (Object)adaptor.nil();
            // 312:1: -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
            {
                // SqlParser.g:312:4: ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_UNIQUE.nextNode(), root_1);

                // SqlParser.g:312:13: ^( COLUMNS ( $indexed_columns)+ )
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
                // SqlParser.g:312:42: ( table_conflict_clause )?
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
    // SqlParser.g:314:1: table_constraint_check : CHECK LPAREN expr RPAREN ;
    public final SqlParser.table_constraint_check_return table_constraint_check() throws RecognitionException {
        SqlParser.table_constraint_check_return retval = new SqlParser.table_constraint_check_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CHECK358=null;
        Token LPAREN359=null;
        Token RPAREN361=null;
        SqlParser.expr_return expr360 = null;


        Object CHECK358_tree=null;
        Object LPAREN359_tree=null;
        Object RPAREN361_tree=null;

        try {
            // SqlParser.g:314:23: ( CHECK LPAREN expr RPAREN )
            // SqlParser.g:314:25: CHECK LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            CHECK358=(Token)match(input,CHECK,FOLLOW_CHECK_in_table_constraint_check2754); 
            CHECK358_tree = (Object)adaptor.create(CHECK358);
            root_0 = (Object)adaptor.becomeRoot(CHECK358_tree, root_0);

            LPAREN359=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_check2757); 
            pushFollow(FOLLOW_expr_in_table_constraint_check2760);
            expr360=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr360.getTree());
            RPAREN361=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_check2762); 

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
    // SqlParser.g:316:1: table_constraint_fk : FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause ) ;
    public final SqlParser.table_constraint_fk_return table_constraint_fk() throws RecognitionException {
        SqlParser.table_constraint_fk_return retval = new SqlParser.table_constraint_fk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOREIGN362=null;
        Token KEY363=null;
        Token LPAREN364=null;
        Token COMMA365=null;
        Token RPAREN366=null;
        List list_column_names=null;
        SqlParser.fk_clause_return fk_clause367 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object FOREIGN362_tree=null;
        Object KEY363_tree=null;
        Object LPAREN364_tree=null;
        Object COMMA365_tree=null;
        Object RPAREN366_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_FOREIGN=new RewriteRuleTokenStream(adaptor,"token FOREIGN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_fk_clause=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause");
        try {
            // SqlParser.g:316:20: ( FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause ) )
            // SqlParser.g:316:22: FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause
            {
            FOREIGN362=(Token)match(input,FOREIGN,FOLLOW_FOREIGN_in_table_constraint_fk2770);  
            stream_FOREIGN.add(FOREIGN362);

            KEY363=(Token)match(input,KEY,FOLLOW_KEY_in_table_constraint_fk2772);  
            stream_KEY.add(KEY363);

            LPAREN364=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_fk2774);  
            stream_LPAREN.add(LPAREN364);

            pushFollow(FOLLOW_id_in_table_constraint_fk2778);
            column_names=id();

            state._fsp--;

            stream_id.add(column_names.getTree());
            if (list_column_names==null) list_column_names=new ArrayList();
            list_column_names.add(column_names.getTree());

            // SqlParser.g:316:58: ( COMMA column_names+= id )*
            loop134:
            do {
                int alt134=2;
                int LA134_0 = input.LA(1);

                if ( (LA134_0==COMMA) ) {
                    alt134=1;
                }


                switch (alt134) {
            	case 1 :
            	    // SqlParser.g:316:59: COMMA column_names+= id
            	    {
            	    COMMA365=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_fk2781);  
            	    stream_COMMA.add(COMMA365);

            	    pushFollow(FOLLOW_id_in_table_constraint_fk2785);
            	    column_names=id();

            	    state._fsp--;

            	    stream_id.add(column_names.getTree());
            	    if (list_column_names==null) list_column_names=new ArrayList();
            	    list_column_names.add(column_names.getTree());


            	    }
            	    break;

            	default :
            	    break loop134;
                }
            } while (true);

            RPAREN366=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_fk2789);  
            stream_RPAREN.add(RPAREN366);

            pushFollow(FOLLOW_fk_clause_in_table_constraint_fk2791);
            fk_clause367=fk_clause();

            state._fsp--;

            stream_fk_clause.add(fk_clause367.getTree());


            // AST REWRITE
            // elements: FOREIGN, column_names, fk_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: column_names
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_column_names=new RewriteRuleSubtreeStream(adaptor,"token column_names",list_column_names);
            root_0 = (Object)adaptor.nil();
            // 317:1: -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause )
            {
                // SqlParser.g:317:4: ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FOREIGN.nextNode(), root_1);

                // SqlParser.g:317:14: ^( COLUMNS ( $column_names)+ )
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
    // SqlParser.g:319:1: fk_clause : REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )? ;
    public final SqlParser.fk_clause_return fk_clause() throws RecognitionException {
        SqlParser.fk_clause_return retval = new SqlParser.fk_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REFERENCES368=null;
        Token LPAREN369=null;
        Token COMMA370=null;
        Token RPAREN371=null;
        List list_column_names=null;
        SqlParser.id_return foreign_table = null;

        SqlParser.fk_clause_action_return fk_clause_action372 = null;

        SqlParser.fk_clause_deferrable_return fk_clause_deferrable373 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object REFERENCES368_tree=null;
        Object LPAREN369_tree=null;
        Object COMMA370_tree=null;
        Object RPAREN371_tree=null;

        try {
            // SqlParser.g:319:10: ( REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )? )
            // SqlParser.g:319:12: REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )?
            {
            root_0 = (Object)adaptor.nil();

            REFERENCES368=(Token)match(input,REFERENCES,FOLLOW_REFERENCES_in_fk_clause2814); 
            REFERENCES368_tree = (Object)adaptor.create(REFERENCES368);
            root_0 = (Object)adaptor.becomeRoot(REFERENCES368_tree, root_0);

            pushFollow(FOLLOW_id_in_fk_clause2819);
            foreign_table=id();

            state._fsp--;

            adaptor.addChild(root_0, foreign_table.getTree());
            // SqlParser.g:319:41: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==LPAREN) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // SqlParser.g:319:42: LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                    {
                    LPAREN369=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_fk_clause2822); 
                    LPAREN369_tree = (Object)adaptor.create(LPAREN369);
                    adaptor.addChild(root_0, LPAREN369_tree);

                    pushFollow(FOLLOW_id_in_fk_clause2826);
                    column_names=id();

                    state._fsp--;

                    adaptor.addChild(root_0, column_names.getTree());
                    if (list_column_names==null) list_column_names=new ArrayList();
                    list_column_names.add(column_names.getTree());

                    // SqlParser.g:319:66: ( COMMA column_names+= id )*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==COMMA) ) {
                            alt135=1;
                        }


                        switch (alt135) {
                    	case 1 :
                    	    // SqlParser.g:319:67: COMMA column_names+= id
                    	    {
                    	    COMMA370=(Token)match(input,COMMA,FOLLOW_COMMA_in_fk_clause2829); 
                    	    COMMA370_tree = (Object)adaptor.create(COMMA370);
                    	    adaptor.addChild(root_0, COMMA370_tree);

                    	    pushFollow(FOLLOW_id_in_fk_clause2833);
                    	    column_names=id();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, column_names.getTree());
                    	    if (list_column_names==null) list_column_names=new ArrayList();
                    	    list_column_names.add(column_names.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop135;
                        }
                    } while (true);

                    RPAREN371=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_fk_clause2837); 
                    RPAREN371_tree = (Object)adaptor.create(RPAREN371);
                    adaptor.addChild(root_0, RPAREN371_tree);


                    }
                    break;

            }

            // SqlParser.g:320:3: ( fk_clause_action )+
            int cnt137=0;
            loop137:
            do {
                int alt137=2;
                alt137 = dfa137.predict(input);
                switch (alt137) {
            	case 1 :
            	    // SqlParser.g:320:3: fk_clause_action
            	    {
            	    pushFollow(FOLLOW_fk_clause_action_in_fk_clause2843);
            	    fk_clause_action372=fk_clause_action();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fk_clause_action372.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt137 >= 1 ) break loop137;
                        EarlyExitException eee =
                            new EarlyExitException(137, input);
                        throw eee;
                }
                cnt137++;
            } while (true);

            // SqlParser.g:320:21: ( fk_clause_deferrable )?
            int alt138=2;
            alt138 = dfa138.predict(input);
            switch (alt138) {
                case 1 :
                    // SqlParser.g:320:21: fk_clause_deferrable
                    {
                    pushFollow(FOLLOW_fk_clause_deferrable_in_fk_clause2846);
                    fk_clause_deferrable373=fk_clause_deferrable();

                    state._fsp--;

                    adaptor.addChild(root_0, fk_clause_deferrable373.getTree());

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
    // SqlParser.g:322:1: fk_clause_action : ( ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT ) | MATCH name= id );
    public final SqlParser.fk_clause_action_return fk_clause_action() throws RecognitionException {
        SqlParser.fk_clause_action_return retval = new SqlParser.fk_clause_action_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ON374=null;
        Token set375=null;
        Token SET376=null;
        Token NULL377=null;
        Token SET378=null;
        Token DEFAULT379=null;
        Token CASCADE380=null;
        Token RESTRICT381=null;
        Token MATCH382=null;
        SqlParser.id_return name = null;


        Object ON374_tree=null;
        Object set375_tree=null;
        Object SET376_tree=null;
        Object NULL377_tree=null;
        Object SET378_tree=null;
        Object DEFAULT379_tree=null;
        Object CASCADE380_tree=null;
        Object RESTRICT381_tree=null;
        Object MATCH382_tree=null;

        try {
            // SqlParser.g:323:3: ( ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT ) | MATCH name= id )
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==ON) ) {
                alt140=1;
            }
            else if ( (LA140_0==MATCH) ) {
                alt140=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 140, 0, input);

                throw nvae;
            }
            switch (alt140) {
                case 1 :
                    // SqlParser.g:323:5: ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT )
                    {
                    root_0 = (Object)adaptor.nil();

                    ON374=(Token)match(input,ON,FOLLOW_ON_in_fk_clause_action2857); 
                    ON374_tree = (Object)adaptor.create(ON374);
                    adaptor.addChild(root_0, ON374_tree);

                    set375=(Token)input.LT(1);
                    if ( input.LA(1)==DELETE||input.LA(1)==INSERT||input.LA(1)==UPDATE ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set375));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // SqlParser.g:323:35: ( SET NULL | SET DEFAULT | CASCADE | RESTRICT )
                    int alt139=4;
                    switch ( input.LA(1) ) {
                    case SET:
                        {
                        int LA139_1 = input.LA(2);

                        if ( (LA139_1==NULL) ) {
                            alt139=1;
                        }
                        else if ( (LA139_1==DEFAULT) ) {
                            alt139=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 139, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case CASCADE:
                        {
                        alt139=3;
                        }
                        break;
                    case RESTRICT:
                        {
                        alt139=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 139, 0, input);

                        throw nvae;
                    }

                    switch (alt139) {
                        case 1 :
                            // SqlParser.g:323:36: SET NULL
                            {
                            SET376=(Token)match(input,SET,FOLLOW_SET_in_fk_clause_action2872); 
                            SET376_tree = (Object)adaptor.create(SET376);
                            adaptor.addChild(root_0, SET376_tree);

                            NULL377=(Token)match(input,NULL,FOLLOW_NULL_in_fk_clause_action2874); 
                            NULL377_tree = (Object)adaptor.create(NULL377);
                            adaptor.addChild(root_0, NULL377_tree);


                            }
                            break;
                        case 2 :
                            // SqlParser.g:323:47: SET DEFAULT
                            {
                            SET378=(Token)match(input,SET,FOLLOW_SET_in_fk_clause_action2878); 
                            SET378_tree = (Object)adaptor.create(SET378);
                            adaptor.addChild(root_0, SET378_tree);

                            DEFAULT379=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_fk_clause_action2880); 
                            DEFAULT379_tree = (Object)adaptor.create(DEFAULT379);
                            adaptor.addChild(root_0, DEFAULT379_tree);


                            }
                            break;
                        case 3 :
                            // SqlParser.g:323:61: CASCADE
                            {
                            CASCADE380=(Token)match(input,CASCADE,FOLLOW_CASCADE_in_fk_clause_action2884); 
                            CASCADE380_tree = (Object)adaptor.create(CASCADE380);
                            adaptor.addChild(root_0, CASCADE380_tree);


                            }
                            break;
                        case 4 :
                            // SqlParser.g:323:71: RESTRICT
                            {
                            RESTRICT381=(Token)match(input,RESTRICT,FOLLOW_RESTRICT_in_fk_clause_action2888); 
                            RESTRICT381_tree = (Object)adaptor.create(RESTRICT381);
                            adaptor.addChild(root_0, RESTRICT381_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:324:5: MATCH name= id
                    {
                    root_0 = (Object)adaptor.nil();

                    MATCH382=(Token)match(input,MATCH,FOLLOW_MATCH_in_fk_clause_action2895); 
                    MATCH382_tree = (Object)adaptor.create(MATCH382);
                    adaptor.addChild(root_0, MATCH382_tree);

                    pushFollow(FOLLOW_id_in_fk_clause_action2899);
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
    // SqlParser.g:326:1: fk_clause_deferrable : ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )? ;
    public final SqlParser.fk_clause_deferrable_return fk_clause_deferrable() throws RecognitionException {
        SqlParser.fk_clause_deferrable_return retval = new SqlParser.fk_clause_deferrable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT383=null;
        Token DEFERRABLE384=null;
        Token INITIALLY385=null;
        Token DEFERRED386=null;
        Token INITIALLY387=null;
        Token IMMEDIATE388=null;

        Object NOT383_tree=null;
        Object DEFERRABLE384_tree=null;
        Object INITIALLY385_tree=null;
        Object DEFERRED386_tree=null;
        Object INITIALLY387_tree=null;
        Object IMMEDIATE388_tree=null;

        try {
            // SqlParser.g:326:21: ( ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )? )
            // SqlParser.g:326:23: ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:326:23: ( NOT )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==NOT) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // SqlParser.g:326:24: NOT
                    {
                    NOT383=(Token)match(input,NOT,FOLLOW_NOT_in_fk_clause_deferrable2907); 
                    NOT383_tree = (Object)adaptor.create(NOT383);
                    adaptor.addChild(root_0, NOT383_tree);


                    }
                    break;

            }

            DEFERRABLE384=(Token)match(input,DEFERRABLE,FOLLOW_DEFERRABLE_in_fk_clause_deferrable2911); 
            DEFERRABLE384_tree = (Object)adaptor.create(DEFERRABLE384);
            adaptor.addChild(root_0, DEFERRABLE384_tree);

            // SqlParser.g:326:41: ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?
            int alt142=3;
            alt142 = dfa142.predict(input);
            switch (alt142) {
                case 1 :
                    // SqlParser.g:326:42: INITIALLY DEFERRED
                    {
                    INITIALLY385=(Token)match(input,INITIALLY,FOLLOW_INITIALLY_in_fk_clause_deferrable2914); 
                    INITIALLY385_tree = (Object)adaptor.create(INITIALLY385);
                    adaptor.addChild(root_0, INITIALLY385_tree);

                    DEFERRED386=(Token)match(input,DEFERRED,FOLLOW_DEFERRED_in_fk_clause_deferrable2916); 
                    DEFERRED386_tree = (Object)adaptor.create(DEFERRED386);
                    adaptor.addChild(root_0, DEFERRED386_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:326:63: INITIALLY IMMEDIATE
                    {
                    INITIALLY387=(Token)match(input,INITIALLY,FOLLOW_INITIALLY_in_fk_clause_deferrable2920); 
                    INITIALLY387_tree = (Object)adaptor.create(INITIALLY387);
                    adaptor.addChild(root_0, INITIALLY387_tree);

                    IMMEDIATE388=(Token)match(input,IMMEDIATE,FOLLOW_IMMEDIATE_in_fk_clause_deferrable2922); 
                    IMMEDIATE388_tree = (Object)adaptor.create(IMMEDIATE388);
                    adaptor.addChild(root_0, IMMEDIATE388_tree);


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
    // SqlParser.g:329:1: drop_table_stmt : DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) ) ;
    public final SqlParser.drop_table_stmt_return drop_table_stmt() throws RecognitionException {
        SqlParser.drop_table_stmt_return retval = new SqlParser.drop_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP389=null;
        Token TABLE390=null;
        Token IF391=null;
        Token EXISTS392=null;
        Token DOT393=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;


        Object DROP389_tree=null;
        Object TABLE390_tree=null;
        Object IF391_tree=null;
        Object EXISTS392_tree=null;
        Object DOT393_tree=null;
        RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // SqlParser.g:329:16: ( DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) ) )
            // SqlParser.g:329:18: DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id
            {
            DROP389=(Token)match(input,DROP,FOLLOW_DROP_in_drop_table_stmt2932);  
            stream_DROP.add(DROP389);

            TABLE390=(Token)match(input,TABLE,FOLLOW_TABLE_in_drop_table_stmt2934);  
            stream_TABLE.add(TABLE390);

            // SqlParser.g:329:29: ( IF EXISTS )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==IF) ) {
                int LA143_1 = input.LA(2);

                if ( (LA143_1==EXISTS) ) {
                    alt143=1;
                }
            }
            switch (alt143) {
                case 1 :
                    // SqlParser.g:329:30: IF EXISTS
                    {
                    IF391=(Token)match(input,IF,FOLLOW_IF_in_drop_table_stmt2937);  
                    stream_IF.add(IF391);

                    EXISTS392=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_table_stmt2939);  
                    stream_EXISTS.add(EXISTS392);


                    }
                    break;

            }

            // SqlParser.g:329:42: (database_name= id DOT )?
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
                    // SqlParser.g:329:43: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_table_stmt2946);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT393=(Token)match(input,DOT,FOLLOW_DOT_in_drop_table_stmt2948);  
                    stream_DOT.add(DOT393);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_table_stmt2954);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());


            // AST REWRITE
            // elements: table_name, EXISTS, database_name
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
            // 330:1: -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) )
            {
                // SqlParser.g:330:4: ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DROP_TABLE, "DROP_TABLE"), root_1);

                // SqlParser.g:330:17: ^( OPTIONS ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:330:27: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:330:36: ^( $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                // SqlParser.g:330:50: ( $database_name)?
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
    // SqlParser.g:333:1: alter_table_stmt : ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def ) ;
    public final SqlParser.alter_table_stmt_return alter_table_stmt() throws RecognitionException {
        SqlParser.alter_table_stmt_return retval = new SqlParser.alter_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ALTER394=null;
        Token TABLE395=null;
        Token DOT396=null;
        Token RENAME397=null;
        Token TO398=null;
        Token ADD399=null;
        Token COLUMN400=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.id_return new_table_name = null;

        SqlParser.column_def_return column_def401 = null;


        Object ALTER394_tree=null;
        Object TABLE395_tree=null;
        Object DOT396_tree=null;
        Object RENAME397_tree=null;
        Object TO398_tree=null;
        Object ADD399_tree=null;
        Object COLUMN400_tree=null;

        try {
            // SqlParser.g:333:17: ( ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def ) )
            // SqlParser.g:333:19: ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def )
            {
            root_0 = (Object)adaptor.nil();

            ALTER394=(Token)match(input,ALTER,FOLLOW_ALTER_in_alter_table_stmt2984); 
            ALTER394_tree = (Object)adaptor.create(ALTER394);
            adaptor.addChild(root_0, ALTER394_tree);

            TABLE395=(Token)match(input,TABLE,FOLLOW_TABLE_in_alter_table_stmt2986); 
            TABLE395_tree = (Object)adaptor.create(TABLE395);
            adaptor.addChild(root_0, TABLE395_tree);

            // SqlParser.g:333:31: (database_name= id DOT )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==ID) ) {
                int LA145_1 = input.LA(2);

                if ( (LA145_1==DOT) ) {
                    alt145=1;
                }
            }
            else if ( ((LA145_0>=ABORT && LA145_0<=WHERE)) ) {
                int LA145_2 = input.LA(2);

                if ( (LA145_2==DOT) ) {
                    alt145=1;
                }
            }
            switch (alt145) {
                case 1 :
                    // SqlParser.g:333:32: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_alter_table_stmt2991);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT396=(Token)match(input,DOT,FOLLOW_DOT_in_alter_table_stmt2993); 
                    DOT396_tree = (Object)adaptor.create(DOT396);
                    adaptor.addChild(root_0, DOT396_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_alter_table_stmt2999);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:333:69: ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def )
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==RENAME) ) {
                alt147=1;
            }
            else if ( (LA147_0==ADD) ) {
                alt147=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 147, 0, input);

                throw nvae;
            }
            switch (alt147) {
                case 1 :
                    // SqlParser.g:333:70: RENAME TO new_table_name= id
                    {
                    RENAME397=(Token)match(input,RENAME,FOLLOW_RENAME_in_alter_table_stmt3002); 
                    RENAME397_tree = (Object)adaptor.create(RENAME397);
                    adaptor.addChild(root_0, RENAME397_tree);

                    TO398=(Token)match(input,TO,FOLLOW_TO_in_alter_table_stmt3004); 
                    TO398_tree = (Object)adaptor.create(TO398);
                    adaptor.addChild(root_0, TO398_tree);

                    pushFollow(FOLLOW_id_in_alter_table_stmt3008);
                    new_table_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, new_table_name.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:333:100: ADD ( COLUMN )? column_def
                    {
                    ADD399=(Token)match(input,ADD,FOLLOW_ADD_in_alter_table_stmt3012); 
                    ADD399_tree = (Object)adaptor.create(ADD399);
                    adaptor.addChild(root_0, ADD399_tree);

                    // SqlParser.g:333:104: ( COLUMN )?
                    int alt146=2;
                    int LA146_0 = input.LA(1);

                    if ( (LA146_0==COLUMN) ) {
                        alt146=1;
                    }
                    switch (alt146) {
                        case 1 :
                            // SqlParser.g:333:105: COLUMN
                            {
                            COLUMN400=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_alter_table_stmt3015); 
                            COLUMN400_tree = (Object)adaptor.create(COLUMN400);
                            adaptor.addChild(root_0, COLUMN400_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_column_def_in_alter_table_stmt3019);
                    column_def401=column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, column_def401.getTree());

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
    // SqlParser.g:336:1: create_view_stmt : CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS select_stmt ;
    public final SqlParser.create_view_stmt_return create_view_stmt() throws RecognitionException {
        SqlParser.create_view_stmt_return retval = new SqlParser.create_view_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE402=null;
        Token TEMPORARY403=null;
        Token VIEW404=null;
        Token IF405=null;
        Token NOT406=null;
        Token EXISTS407=null;
        Token DOT408=null;
        Token AS409=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return view_name = null;

        SqlParser.select_stmt_return select_stmt410 = null;


        Object CREATE402_tree=null;
        Object TEMPORARY403_tree=null;
        Object VIEW404_tree=null;
        Object IF405_tree=null;
        Object NOT406_tree=null;
        Object EXISTS407_tree=null;
        Object DOT408_tree=null;
        Object AS409_tree=null;

        try {
            // SqlParser.g:336:17: ( CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS select_stmt )
            // SqlParser.g:336:19: CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS select_stmt
            {
            root_0 = (Object)adaptor.nil();

            CREATE402=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_view_stmt3028); 
            CREATE402_tree = (Object)adaptor.create(CREATE402);
            adaptor.addChild(root_0, CREATE402_tree);

            // SqlParser.g:336:26: ( TEMPORARY )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==TEMPORARY) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // SqlParser.g:336:26: TEMPORARY
                    {
                    TEMPORARY403=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_view_stmt3030); 
                    TEMPORARY403_tree = (Object)adaptor.create(TEMPORARY403);
                    adaptor.addChild(root_0, TEMPORARY403_tree);


                    }
                    break;

            }

            VIEW404=(Token)match(input,VIEW,FOLLOW_VIEW_in_create_view_stmt3033); 
            VIEW404_tree = (Object)adaptor.create(VIEW404);
            adaptor.addChild(root_0, VIEW404_tree);

            // SqlParser.g:336:42: ( IF NOT EXISTS )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==IF) ) {
                int LA149_1 = input.LA(2);

                if ( (LA149_1==NOT) ) {
                    alt149=1;
                }
            }
            switch (alt149) {
                case 1 :
                    // SqlParser.g:336:43: IF NOT EXISTS
                    {
                    IF405=(Token)match(input,IF,FOLLOW_IF_in_create_view_stmt3036); 
                    IF405_tree = (Object)adaptor.create(IF405);
                    adaptor.addChild(root_0, IF405_tree);

                    NOT406=(Token)match(input,NOT,FOLLOW_NOT_in_create_view_stmt3038); 
                    NOT406_tree = (Object)adaptor.create(NOT406);
                    adaptor.addChild(root_0, NOT406_tree);

                    EXISTS407=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_view_stmt3040); 
                    EXISTS407_tree = (Object)adaptor.create(EXISTS407);
                    adaptor.addChild(root_0, EXISTS407_tree);


                    }
                    break;

            }

            // SqlParser.g:336:59: (database_name= id DOT )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==ID) ) {
                int LA150_1 = input.LA(2);

                if ( (LA150_1==DOT) ) {
                    alt150=1;
                }
            }
            else if ( ((LA150_0>=ABORT && LA150_0<=WHERE)) ) {
                int LA150_2 = input.LA(2);

                if ( (LA150_2==DOT) ) {
                    alt150=1;
                }
            }
            switch (alt150) {
                case 1 :
                    // SqlParser.g:336:60: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_view_stmt3047);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT408=(Token)match(input,DOT,FOLLOW_DOT_in_create_view_stmt3049); 
                    DOT408_tree = (Object)adaptor.create(DOT408);
                    adaptor.addChild(root_0, DOT408_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_view_stmt3055);
            view_name=id();

            state._fsp--;

            adaptor.addChild(root_0, view_name.getTree());
            AS409=(Token)match(input,AS,FOLLOW_AS_in_create_view_stmt3057); 
            AS409_tree = (Object)adaptor.create(AS409);
            adaptor.addChild(root_0, AS409_tree);

            pushFollow(FOLLOW_select_stmt_in_create_view_stmt3059);
            select_stmt410=select_stmt();

            state._fsp--;

            adaptor.addChild(root_0, select_stmt410.getTree());

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
    // SqlParser.g:339:1: drop_view_stmt : DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id ;
    public final SqlParser.drop_view_stmt_return drop_view_stmt() throws RecognitionException {
        SqlParser.drop_view_stmt_return retval = new SqlParser.drop_view_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP411=null;
        Token VIEW412=null;
        Token IF413=null;
        Token EXISTS414=null;
        Token DOT415=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return view_name = null;


        Object DROP411_tree=null;
        Object VIEW412_tree=null;
        Object IF413_tree=null;
        Object EXISTS414_tree=null;
        Object DOT415_tree=null;

        try {
            // SqlParser.g:339:15: ( DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id )
            // SqlParser.g:339:17: DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id
            {
            root_0 = (Object)adaptor.nil();

            DROP411=(Token)match(input,DROP,FOLLOW_DROP_in_drop_view_stmt3067); 
            DROP411_tree = (Object)adaptor.create(DROP411);
            adaptor.addChild(root_0, DROP411_tree);

            VIEW412=(Token)match(input,VIEW,FOLLOW_VIEW_in_drop_view_stmt3069); 
            VIEW412_tree = (Object)adaptor.create(VIEW412);
            adaptor.addChild(root_0, VIEW412_tree);

            // SqlParser.g:339:27: ( IF EXISTS )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==IF) ) {
                int LA151_1 = input.LA(2);

                if ( (LA151_1==EXISTS) ) {
                    alt151=1;
                }
            }
            switch (alt151) {
                case 1 :
                    // SqlParser.g:339:28: IF EXISTS
                    {
                    IF413=(Token)match(input,IF,FOLLOW_IF_in_drop_view_stmt3072); 
                    IF413_tree = (Object)adaptor.create(IF413);
                    adaptor.addChild(root_0, IF413_tree);

                    EXISTS414=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_view_stmt3074); 
                    EXISTS414_tree = (Object)adaptor.create(EXISTS414);
                    adaptor.addChild(root_0, EXISTS414_tree);


                    }
                    break;

            }

            // SqlParser.g:339:40: (database_name= id DOT )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==ID) ) {
                int LA152_1 = input.LA(2);

                if ( (LA152_1==DOT) ) {
                    alt152=1;
                }
            }
            else if ( ((LA152_0>=ABORT && LA152_0<=WHERE)) ) {
                int LA152_2 = input.LA(2);

                if ( (LA152_2==DOT) ) {
                    alt152=1;
                }
            }
            switch (alt152) {
                case 1 :
                    // SqlParser.g:339:41: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_view_stmt3081);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT415=(Token)match(input,DOT,FOLLOW_DOT_in_drop_view_stmt3083); 
                    DOT415_tree = (Object)adaptor.create(DOT415);
                    adaptor.addChild(root_0, DOT415_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_view_stmt3089);
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
    // SqlParser.g:342:1: create_index_stmt : CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? ) ;
    public final SqlParser.create_index_stmt_return create_index_stmt() throws RecognitionException {
        SqlParser.create_index_stmt_return retval = new SqlParser.create_index_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE416=null;
        Token UNIQUE417=null;
        Token INDEX418=null;
        Token IF419=null;
        Token NOT420=null;
        Token EXISTS421=null;
        Token DOT422=null;
        Token ON423=null;
        Token LPAREN424=null;
        Token COMMA425=null;
        Token RPAREN426=null;
        List list_columns=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return index_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.indexed_column_return columns = null;
         columns = null;
        Object CREATE416_tree=null;
        Object UNIQUE417_tree=null;
        Object INDEX418_tree=null;
        Object IF419_tree=null;
        Object NOT420_tree=null;
        Object EXISTS421_tree=null;
        Object DOT422_tree=null;
        Object ON423_tree=null;
        Object LPAREN424_tree=null;
        Object COMMA425_tree=null;
        Object RPAREN426_tree=null;
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
            // SqlParser.g:342:18: ( CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? ) )
            // SqlParser.g:342:20: CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN
            {
            CREATE416=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_index_stmt3097);  
            stream_CREATE.add(CREATE416);

            // SqlParser.g:342:27: ( UNIQUE )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==UNIQUE) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // SqlParser.g:342:28: UNIQUE
                    {
                    UNIQUE417=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_create_index_stmt3100);  
                    stream_UNIQUE.add(UNIQUE417);


                    }
                    break;

            }

            INDEX418=(Token)match(input,INDEX,FOLLOW_INDEX_in_create_index_stmt3104);  
            stream_INDEX.add(INDEX418);

            // SqlParser.g:342:43: ( IF NOT EXISTS )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==IF) ) {
                int LA154_1 = input.LA(2);

                if ( (LA154_1==NOT) ) {
                    alt154=1;
                }
            }
            switch (alt154) {
                case 1 :
                    // SqlParser.g:342:44: IF NOT EXISTS
                    {
                    IF419=(Token)match(input,IF,FOLLOW_IF_in_create_index_stmt3107);  
                    stream_IF.add(IF419);

                    NOT420=(Token)match(input,NOT,FOLLOW_NOT_in_create_index_stmt3109);  
                    stream_NOT.add(NOT420);

                    EXISTS421=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_index_stmt3111);  
                    stream_EXISTS.add(EXISTS421);


                    }
                    break;

            }

            // SqlParser.g:342:60: (database_name= id DOT )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==ID) ) {
                int LA155_1 = input.LA(2);

                if ( (LA155_1==DOT) ) {
                    alt155=1;
                }
            }
            else if ( ((LA155_0>=ABORT && LA155_0<=WHERE)) ) {
                int LA155_2 = input.LA(2);

                if ( (LA155_2==DOT) ) {
                    alt155=1;
                }
            }
            switch (alt155) {
                case 1 :
                    // SqlParser.g:342:61: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_index_stmt3118);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT422=(Token)match(input,DOT,FOLLOW_DOT_in_create_index_stmt3120);  
                    stream_DOT.add(DOT422);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_index_stmt3126);
            index_name=id();

            state._fsp--;

            stream_id.add(index_name.getTree());
            ON423=(Token)match(input,ON,FOLLOW_ON_in_create_index_stmt3130);  
            stream_ON.add(ON423);

            pushFollow(FOLLOW_id_in_create_index_stmt3134);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());
            LPAREN424=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_index_stmt3136);  
            stream_LPAREN.add(LPAREN424);

            pushFollow(FOLLOW_indexed_column_in_create_index_stmt3140);
            columns=indexed_column();

            state._fsp--;

            stream_indexed_column.add(columns.getTree());
            if (list_columns==null) list_columns=new ArrayList();
            list_columns.add(columns.getTree());

            // SqlParser.g:343:51: ( COMMA columns+= indexed_column )*
            loop156:
            do {
                int alt156=2;
                int LA156_0 = input.LA(1);

                if ( (LA156_0==COMMA) ) {
                    alt156=1;
                }


                switch (alt156) {
            	case 1 :
            	    // SqlParser.g:343:52: COMMA columns+= indexed_column
            	    {
            	    COMMA425=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_index_stmt3143);  
            	    stream_COMMA.add(COMMA425);

            	    pushFollow(FOLLOW_indexed_column_in_create_index_stmt3147);
            	    columns=indexed_column();

            	    state._fsp--;

            	    stream_indexed_column.add(columns.getTree());
            	    if (list_columns==null) list_columns=new ArrayList();
            	    list_columns.add(columns.getTree());


            	    }
            	    break;

            	default :
            	    break loop156;
                }
            } while (true);

            RPAREN426=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_index_stmt3151);  
            stream_RPAREN.add(RPAREN426);



            // AST REWRITE
            // elements: table_name, index_name, EXISTS, database_name, columns, UNIQUE
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
            // 344:1: -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? )
            {
                // SqlParser.g:344:4: ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CREATE_INDEX, "CREATE_INDEX"), root_1);

                // SqlParser.g:344:19: ^( OPTIONS ( UNIQUE )? ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:344:29: ( UNIQUE )?
                if ( stream_UNIQUE.hasNext() ) {
                    adaptor.addChild(root_2, stream_UNIQUE.nextNode());

                }
                stream_UNIQUE.reset();
                // SqlParser.g:344:37: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:344:46: ^( $index_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_index_name.nextNode(), root_2);

                // SqlParser.g:344:60: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_table_name.nextTree());
                // SqlParser.g:344:89: ( ^( COLUMNS ( $columns)+ ) )?
                if ( stream_columns.hasNext() ) {
                    // SqlParser.g:344:89: ^( COLUMNS ( $columns)+ )
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
    // SqlParser.g:346:1: indexed_column : column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )? -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? ) ;
    public final SqlParser.indexed_column_return indexed_column() throws RecognitionException {
        SqlParser.indexed_column_return retval = new SqlParser.indexed_column_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLLATE427=null;
        Token ASC428=null;
        Token DESC429=null;
        SqlParser.id_return column_name = null;

        SqlParser.id_return collation_name = null;


        Object COLLATE427_tree=null;
        Object ASC428_tree=null;
        Object DESC429_tree=null;
        RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");
        RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
        RewriteRuleTokenStream stream_COLLATE=new RewriteRuleTokenStream(adaptor,"token COLLATE");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // SqlParser.g:346:15: (column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )? -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? ) )
            // SqlParser.g:346:17: column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )?
            {
            pushFollow(FOLLOW_id_in_indexed_column3197);
            column_name=id();

            state._fsp--;

            stream_id.add(column_name.getTree());
            // SqlParser.g:346:32: ( COLLATE collation_name= id )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==COLLATE) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // SqlParser.g:346:33: COLLATE collation_name= id
                    {
                    COLLATE427=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_indexed_column3200);  
                    stream_COLLATE.add(COLLATE427);

                    pushFollow(FOLLOW_id_in_indexed_column3204);
                    collation_name=id();

                    state._fsp--;

                    stream_id.add(collation_name.getTree());

                    }
                    break;

            }

            // SqlParser.g:346:61: ( ASC | DESC )?
            int alt158=3;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==ASC) ) {
                alt158=1;
            }
            else if ( (LA158_0==DESC) ) {
                alt158=2;
            }
            switch (alt158) {
                case 1 :
                    // SqlParser.g:346:62: ASC
                    {
                    ASC428=(Token)match(input,ASC,FOLLOW_ASC_in_indexed_column3209);  
                    stream_ASC.add(ASC428);


                    }
                    break;
                case 2 :
                    // SqlParser.g:346:68: DESC
                    {
                    DESC429=(Token)match(input,DESC,FOLLOW_DESC_in_indexed_column3213);  
                    stream_DESC.add(DESC429);


                    }
                    break;

            }



            // AST REWRITE
            // elements: ASC, collation_name, column_name, DESC, COLLATE
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
            // 347:1: -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? )
            {
                // SqlParser.g:347:4: ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_column_name.nextNode(), root_1);

                // SqlParser.g:347:19: ( ^( COLLATE $collation_name) )?
                if ( stream_collation_name.hasNext()||stream_COLLATE.hasNext() ) {
                    // SqlParser.g:347:19: ^( COLLATE $collation_name)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_COLLATE.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_collation_name.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_collation_name.reset();
                stream_COLLATE.reset();
                // SqlParser.g:347:47: ( ASC )?
                if ( stream_ASC.hasNext() ) {
                    adaptor.addChild(root_1, stream_ASC.nextNode());

                }
                stream_ASC.reset();
                // SqlParser.g:347:52: ( DESC )?
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
    // SqlParser.g:350:1: drop_index_stmt : DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) ) ;
    public final SqlParser.drop_index_stmt_return drop_index_stmt() throws RecognitionException {
        SqlParser.drop_index_stmt_return retval = new SqlParser.drop_index_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP430=null;
        Token INDEX431=null;
        Token IF432=null;
        Token EXISTS433=null;
        Token DOT434=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return index_name = null;


        Object DROP430_tree=null;
        Object INDEX431_tree=null;
        Object IF432_tree=null;
        Object EXISTS433_tree=null;
        Object DOT434_tree=null;
        RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // SqlParser.g:350:16: ( DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) ) )
            // SqlParser.g:350:18: DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id
            {
            DROP430=(Token)match(input,DROP,FOLLOW_DROP_in_drop_index_stmt3244);  
            stream_DROP.add(DROP430);

            INDEX431=(Token)match(input,INDEX,FOLLOW_INDEX_in_drop_index_stmt3246);  
            stream_INDEX.add(INDEX431);

            // SqlParser.g:350:29: ( IF EXISTS )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==IF) ) {
                int LA159_1 = input.LA(2);

                if ( (LA159_1==EXISTS) ) {
                    alt159=1;
                }
            }
            switch (alt159) {
                case 1 :
                    // SqlParser.g:350:30: IF EXISTS
                    {
                    IF432=(Token)match(input,IF,FOLLOW_IF_in_drop_index_stmt3249);  
                    stream_IF.add(IF432);

                    EXISTS433=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_index_stmt3251);  
                    stream_EXISTS.add(EXISTS433);


                    }
                    break;

            }

            // SqlParser.g:350:42: (database_name= id DOT )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==ID) ) {
                int LA160_1 = input.LA(2);

                if ( (LA160_1==DOT) ) {
                    alt160=1;
                }
            }
            else if ( ((LA160_0>=ABORT && LA160_0<=WHERE)) ) {
                int LA160_2 = input.LA(2);

                if ( (LA160_2==DOT) ) {
                    alt160=1;
                }
            }
            switch (alt160) {
                case 1 :
                    // SqlParser.g:350:43: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_index_stmt3258);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT434=(Token)match(input,DOT,FOLLOW_DOT_in_drop_index_stmt3260);  
                    stream_DOT.add(DOT434);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_index_stmt3266);
            index_name=id();

            state._fsp--;

            stream_id.add(index_name.getTree());


            // AST REWRITE
            // elements: EXISTS, index_name, database_name
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
            // 351:1: -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) )
            {
                // SqlParser.g:351:4: ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DROP_INDEX, "DROP_INDEX"), root_1);

                // SqlParser.g:351:17: ^( OPTIONS ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:351:27: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:351:36: ^( $index_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_index_name.nextNode(), root_2);

                // SqlParser.g:351:50: ( $database_name)?
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
    // SqlParser.g:354:1: create_trigger_stmt : CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END ;
    public final SqlParser.create_trigger_stmt_return create_trigger_stmt() throws RecognitionException {
        SqlParser.create_trigger_stmt_return retval = new SqlParser.create_trigger_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE435=null;
        Token TEMPORARY436=null;
        Token TRIGGER437=null;
        Token IF438=null;
        Token NOT439=null;
        Token EXISTS440=null;
        Token DOT441=null;
        Token BEFORE442=null;
        Token AFTER443=null;
        Token INSTEAD444=null;
        Token OF445=null;
        Token DELETE446=null;
        Token INSERT447=null;
        Token UPDATE448=null;
        Token OF449=null;
        Token COMMA450=null;
        Token ON451=null;
        Token FOR452=null;
        Token EACH453=null;
        Token ROW454=null;
        Token WHEN455=null;
        Token BEGIN457=null;
        Token SEMI462=null;
        Token END463=null;
        List list_column_names=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return trigger_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.expr_return expr456 = null;

        SqlParser.update_stmt_return update_stmt458 = null;

        SqlParser.insert_stmt_return insert_stmt459 = null;

        SqlParser.delete_stmt_return delete_stmt460 = null;

        SqlParser.select_stmt_return select_stmt461 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object CREATE435_tree=null;
        Object TEMPORARY436_tree=null;
        Object TRIGGER437_tree=null;
        Object IF438_tree=null;
        Object NOT439_tree=null;
        Object EXISTS440_tree=null;
        Object DOT441_tree=null;
        Object BEFORE442_tree=null;
        Object AFTER443_tree=null;
        Object INSTEAD444_tree=null;
        Object OF445_tree=null;
        Object DELETE446_tree=null;
        Object INSERT447_tree=null;
        Object UPDATE448_tree=null;
        Object OF449_tree=null;
        Object COMMA450_tree=null;
        Object ON451_tree=null;
        Object FOR452_tree=null;
        Object EACH453_tree=null;
        Object ROW454_tree=null;
        Object WHEN455_tree=null;
        Object BEGIN457_tree=null;
        Object SEMI462_tree=null;
        Object END463_tree=null;

        try {
            // SqlParser.g:354:20: ( CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END )
            // SqlParser.g:354:22: CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END
            {
            root_0 = (Object)adaptor.nil();

            CREATE435=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_trigger_stmt3296); 
            CREATE435_tree = (Object)adaptor.create(CREATE435);
            adaptor.addChild(root_0, CREATE435_tree);

            // SqlParser.g:354:29: ( TEMPORARY )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==TEMPORARY) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // SqlParser.g:354:29: TEMPORARY
                    {
                    TEMPORARY436=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_trigger_stmt3298); 
                    TEMPORARY436_tree = (Object)adaptor.create(TEMPORARY436);
                    adaptor.addChild(root_0, TEMPORARY436_tree);


                    }
                    break;

            }

            TRIGGER437=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_create_trigger_stmt3301); 
            TRIGGER437_tree = (Object)adaptor.create(TRIGGER437);
            adaptor.addChild(root_0, TRIGGER437_tree);

            // SqlParser.g:354:48: ( IF NOT EXISTS )?
            int alt162=2;
            alt162 = dfa162.predict(input);
            switch (alt162) {
                case 1 :
                    // SqlParser.g:354:49: IF NOT EXISTS
                    {
                    IF438=(Token)match(input,IF,FOLLOW_IF_in_create_trigger_stmt3304); 
                    IF438_tree = (Object)adaptor.create(IF438);
                    adaptor.addChild(root_0, IF438_tree);

                    NOT439=(Token)match(input,NOT,FOLLOW_NOT_in_create_trigger_stmt3306); 
                    NOT439_tree = (Object)adaptor.create(NOT439);
                    adaptor.addChild(root_0, NOT439_tree);

                    EXISTS440=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_trigger_stmt3308); 
                    EXISTS440_tree = (Object)adaptor.create(EXISTS440);
                    adaptor.addChild(root_0, EXISTS440_tree);


                    }
                    break;

            }

            // SqlParser.g:354:65: (database_name= id DOT )?
            int alt163=2;
            alt163 = dfa163.predict(input);
            switch (alt163) {
                case 1 :
                    // SqlParser.g:354:66: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_trigger_stmt3315);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT441=(Token)match(input,DOT,FOLLOW_DOT_in_create_trigger_stmt3317); 
                    DOT441_tree = (Object)adaptor.create(DOT441);
                    adaptor.addChild(root_0, DOT441_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_trigger_stmt3323);
            trigger_name=id();

            state._fsp--;

            adaptor.addChild(root_0, trigger_name.getTree());
            // SqlParser.g:355:3: ( BEFORE | AFTER | INSTEAD OF )?
            int alt164=4;
            switch ( input.LA(1) ) {
                case BEFORE:
                    {
                    alt164=1;
                    }
                    break;
                case AFTER:
                    {
                    alt164=2;
                    }
                    break;
                case INSTEAD:
                    {
                    alt164=3;
                    }
                    break;
            }

            switch (alt164) {
                case 1 :
                    // SqlParser.g:355:4: BEFORE
                    {
                    BEFORE442=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_create_trigger_stmt3328); 
                    BEFORE442_tree = (Object)adaptor.create(BEFORE442);
                    adaptor.addChild(root_0, BEFORE442_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:355:13: AFTER
                    {
                    AFTER443=(Token)match(input,AFTER,FOLLOW_AFTER_in_create_trigger_stmt3332); 
                    AFTER443_tree = (Object)adaptor.create(AFTER443);
                    adaptor.addChild(root_0, AFTER443_tree);


                    }
                    break;
                case 3 :
                    // SqlParser.g:355:21: INSTEAD OF
                    {
                    INSTEAD444=(Token)match(input,INSTEAD,FOLLOW_INSTEAD_in_create_trigger_stmt3336); 
                    INSTEAD444_tree = (Object)adaptor.create(INSTEAD444);
                    adaptor.addChild(root_0, INSTEAD444_tree);

                    OF445=(Token)match(input,OF,FOLLOW_OF_in_create_trigger_stmt3338); 
                    OF445_tree = (Object)adaptor.create(OF445);
                    adaptor.addChild(root_0, OF445_tree);


                    }
                    break;

            }

            // SqlParser.g:355:34: ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? )
            int alt167=3;
            switch ( input.LA(1) ) {
            case DELETE:
                {
                alt167=1;
                }
                break;
            case INSERT:
                {
                alt167=2;
                }
                break;
            case UPDATE:
                {
                alt167=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 167, 0, input);

                throw nvae;
            }

            switch (alt167) {
                case 1 :
                    // SqlParser.g:355:35: DELETE
                    {
                    DELETE446=(Token)match(input,DELETE,FOLLOW_DELETE_in_create_trigger_stmt3343); 
                    DELETE446_tree = (Object)adaptor.create(DELETE446);
                    adaptor.addChild(root_0, DELETE446_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:355:44: INSERT
                    {
                    INSERT447=(Token)match(input,INSERT,FOLLOW_INSERT_in_create_trigger_stmt3347); 
                    INSERT447_tree = (Object)adaptor.create(INSERT447);
                    adaptor.addChild(root_0, INSERT447_tree);


                    }
                    break;
                case 3 :
                    // SqlParser.g:355:53: UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )?
                    {
                    UPDATE448=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_create_trigger_stmt3351); 
                    UPDATE448_tree = (Object)adaptor.create(UPDATE448);
                    adaptor.addChild(root_0, UPDATE448_tree);

                    // SqlParser.g:355:60: ( OF column_names+= id ( COMMA column_names+= id )* )?
                    int alt166=2;
                    int LA166_0 = input.LA(1);

                    if ( (LA166_0==OF) ) {
                        alt166=1;
                    }
                    switch (alt166) {
                        case 1 :
                            // SqlParser.g:355:61: OF column_names+= id ( COMMA column_names+= id )*
                            {
                            OF449=(Token)match(input,OF,FOLLOW_OF_in_create_trigger_stmt3354); 
                            OF449_tree = (Object)adaptor.create(OF449);
                            adaptor.addChild(root_0, OF449_tree);

                            pushFollow(FOLLOW_id_in_create_trigger_stmt3358);
                            column_names=id();

                            state._fsp--;

                            adaptor.addChild(root_0, column_names.getTree());
                            if (list_column_names==null) list_column_names=new ArrayList();
                            list_column_names.add(column_names.getTree());

                            // SqlParser.g:355:81: ( COMMA column_names+= id )*
                            loop165:
                            do {
                                int alt165=2;
                                int LA165_0 = input.LA(1);

                                if ( (LA165_0==COMMA) ) {
                                    alt165=1;
                                }


                                switch (alt165) {
                            	case 1 :
                            	    // SqlParser.g:355:82: COMMA column_names+= id
                            	    {
                            	    COMMA450=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_trigger_stmt3361); 
                            	    COMMA450_tree = (Object)adaptor.create(COMMA450);
                            	    adaptor.addChild(root_0, COMMA450_tree);

                            	    pushFollow(FOLLOW_id_in_create_trigger_stmt3365);
                            	    column_names=id();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, column_names.getTree());
                            	    if (list_column_names==null) list_column_names=new ArrayList();
                            	    list_column_names.add(column_names.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop165;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            ON451=(Token)match(input,ON,FOLLOW_ON_in_create_trigger_stmt3374); 
            ON451_tree = (Object)adaptor.create(ON451);
            adaptor.addChild(root_0, ON451_tree);

            pushFollow(FOLLOW_id_in_create_trigger_stmt3378);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:356:20: ( FOR EACH ROW )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==FOR) ) {
                alt168=1;
            }
            switch (alt168) {
                case 1 :
                    // SqlParser.g:356:21: FOR EACH ROW
                    {
                    FOR452=(Token)match(input,FOR,FOLLOW_FOR_in_create_trigger_stmt3381); 
                    FOR452_tree = (Object)adaptor.create(FOR452);
                    adaptor.addChild(root_0, FOR452_tree);

                    EACH453=(Token)match(input,EACH,FOLLOW_EACH_in_create_trigger_stmt3383); 
                    EACH453_tree = (Object)adaptor.create(EACH453);
                    adaptor.addChild(root_0, EACH453_tree);

                    ROW454=(Token)match(input,ROW,FOLLOW_ROW_in_create_trigger_stmt3385); 
                    ROW454_tree = (Object)adaptor.create(ROW454);
                    adaptor.addChild(root_0, ROW454_tree);


                    }
                    break;

            }

            // SqlParser.g:356:36: ( WHEN expr )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==WHEN) ) {
                alt169=1;
            }
            switch (alt169) {
                case 1 :
                    // SqlParser.g:356:37: WHEN expr
                    {
                    WHEN455=(Token)match(input,WHEN,FOLLOW_WHEN_in_create_trigger_stmt3390); 
                    WHEN455_tree = (Object)adaptor.create(WHEN455);
                    adaptor.addChild(root_0, WHEN455_tree);

                    pushFollow(FOLLOW_expr_in_create_trigger_stmt3392);
                    expr456=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr456.getTree());

                    }
                    break;

            }

            BEGIN457=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_create_trigger_stmt3398); 
            BEGIN457_tree = (Object)adaptor.create(BEGIN457);
            adaptor.addChild(root_0, BEGIN457_tree);

            // SqlParser.g:357:9: ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+
            int cnt171=0;
            loop171:
            do {
                int alt171=2;
                int LA171_0 = input.LA(1);

                if ( (LA171_0==DELETE||LA171_0==INSERT||LA171_0==REPLACE||LA171_0==SELECT||LA171_0==UPDATE) ) {
                    alt171=1;
                }


                switch (alt171) {
            	case 1 :
            	    // SqlParser.g:357:10: ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI
            	    {
            	    // SqlParser.g:357:10: ( update_stmt | insert_stmt | delete_stmt | select_stmt )
            	    int alt170=4;
            	    switch ( input.LA(1) ) {
            	    case UPDATE:
            	        {
            	        alt170=1;
            	        }
            	        break;
            	    case INSERT:
            	    case REPLACE:
            	        {
            	        alt170=2;
            	        }
            	        break;
            	    case DELETE:
            	        {
            	        alt170=3;
            	        }
            	        break;
            	    case SELECT:
            	        {
            	        alt170=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 170, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt170) {
            	        case 1 :
            	            // SqlParser.g:357:11: update_stmt
            	            {
            	            pushFollow(FOLLOW_update_stmt_in_create_trigger_stmt3402);
            	            update_stmt458=update_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, update_stmt458.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // SqlParser.g:357:25: insert_stmt
            	            {
            	            pushFollow(FOLLOW_insert_stmt_in_create_trigger_stmt3406);
            	            insert_stmt459=insert_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, insert_stmt459.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // SqlParser.g:357:39: delete_stmt
            	            {
            	            pushFollow(FOLLOW_delete_stmt_in_create_trigger_stmt3410);
            	            delete_stmt460=delete_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, delete_stmt460.getTree());

            	            }
            	            break;
            	        case 4 :
            	            // SqlParser.g:357:53: select_stmt
            	            {
            	            pushFollow(FOLLOW_select_stmt_in_create_trigger_stmt3414);
            	            select_stmt461=select_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, select_stmt461.getTree());

            	            }
            	            break;

            	    }

            	    SEMI462=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_trigger_stmt3417); 
            	    SEMI462_tree = (Object)adaptor.create(SEMI462);
            	    adaptor.addChild(root_0, SEMI462_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt171 >= 1 ) break loop171;
                        EarlyExitException eee =
                            new EarlyExitException(171, input);
                        throw eee;
                }
                cnt171++;
            } while (true);

            END463=(Token)match(input,END,FOLLOW_END_in_create_trigger_stmt3421); 
            END463_tree = (Object)adaptor.create(END463);
            adaptor.addChild(root_0, END463_tree);


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
    // SqlParser.g:360:1: drop_trigger_stmt : DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id ;
    public final SqlParser.drop_trigger_stmt_return drop_trigger_stmt() throws RecognitionException {
        SqlParser.drop_trigger_stmt_return retval = new SqlParser.drop_trigger_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP464=null;
        Token TRIGGER465=null;
        Token IF466=null;
        Token EXISTS467=null;
        Token DOT468=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return trigger_name = null;


        Object DROP464_tree=null;
        Object TRIGGER465_tree=null;
        Object IF466_tree=null;
        Object EXISTS467_tree=null;
        Object DOT468_tree=null;

        try {
            // SqlParser.g:360:18: ( DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id )
            // SqlParser.g:360:20: DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id
            {
            root_0 = (Object)adaptor.nil();

            DROP464=(Token)match(input,DROP,FOLLOW_DROP_in_drop_trigger_stmt3429); 
            DROP464_tree = (Object)adaptor.create(DROP464);
            adaptor.addChild(root_0, DROP464_tree);

            TRIGGER465=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_drop_trigger_stmt3431); 
            TRIGGER465_tree = (Object)adaptor.create(TRIGGER465);
            adaptor.addChild(root_0, TRIGGER465_tree);

            // SqlParser.g:360:33: ( IF EXISTS )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==IF) ) {
                int LA172_1 = input.LA(2);

                if ( (LA172_1==EXISTS) ) {
                    alt172=1;
                }
            }
            switch (alt172) {
                case 1 :
                    // SqlParser.g:360:34: IF EXISTS
                    {
                    IF466=(Token)match(input,IF,FOLLOW_IF_in_drop_trigger_stmt3434); 
                    IF466_tree = (Object)adaptor.create(IF466);
                    adaptor.addChild(root_0, IF466_tree);

                    EXISTS467=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_trigger_stmt3436); 
                    EXISTS467_tree = (Object)adaptor.create(EXISTS467);
                    adaptor.addChild(root_0, EXISTS467_tree);


                    }
                    break;

            }

            // SqlParser.g:360:46: (database_name= id DOT )?
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==ID) ) {
                int LA173_1 = input.LA(2);

                if ( (LA173_1==DOT) ) {
                    alt173=1;
                }
            }
            else if ( ((LA173_0>=ABORT && LA173_0<=WHERE)) ) {
                int LA173_2 = input.LA(2);

                if ( (LA173_2==DOT) ) {
                    alt173=1;
                }
            }
            switch (alt173) {
                case 1 :
                    // SqlParser.g:360:47: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_trigger_stmt3443);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT468=(Token)match(input,DOT,FOLLOW_DOT_in_drop_trigger_stmt3445); 
                    DOT468_tree = (Object)adaptor.create(DOT468);
                    adaptor.addChild(root_0, DOT468_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_trigger_stmt3451);
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
    // SqlParser.g:365:1: id : ( ID | keyword );
    public final SqlParser.id_return id() throws RecognitionException {
        SqlParser.id_return retval = new SqlParser.id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID469=null;
        SqlParser.keyword_return keyword470 = null;


        Object ID469_tree=null;

        try {
            // SqlParser.g:365:3: ( ID | keyword )
            int alt174=2;
            int LA174_0 = input.LA(1);

            if ( (LA174_0==ID) ) {
                alt174=1;
            }
            else if ( ((LA174_0>=ABORT && LA174_0<=WHERE)) ) {
                alt174=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 174, 0, input);

                throw nvae;
            }
            switch (alt174) {
                case 1 :
                    // SqlParser.g:365:5: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID469=(Token)match(input,ID,FOLLOW_ID_in_id3461); 
                    ID469_tree = (Object)adaptor.create(ID469);
                    adaptor.addChild(root_0, ID469_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:365:10: keyword
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_id3465);
                    keyword470=keyword();

                    state._fsp--;

                    adaptor.addChild(root_0, keyword470.getTree());

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
    // SqlParser.g:367:1: keyword : ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) ;
    public final SqlParser.keyword_return keyword() throws RecognitionException {
        SqlParser.keyword_return retval = new SqlParser.keyword_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set471=null;

        Object set471_tree=null;

        try {
            // SqlParser.g:367:8: ( ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) )
            // SqlParser.g:367:10: ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE )
            {
            root_0 = (Object)adaptor.nil();

            set471=(Token)input.LT(1);
            if ( (input.LA(1)>=ABORT && input.LA(1)<=WHERE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set471));
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
    // SqlParser.g:486:1: id_column_def : ( ID | keyword_column_def );
    public final SqlParser.id_column_def_return id_column_def() throws RecognitionException {
        SqlParser.id_column_def_return retval = new SqlParser.id_column_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID472=null;
        SqlParser.keyword_column_def_return keyword_column_def473 = null;


        Object ID472_tree=null;

        try {
            // SqlParser.g:486:14: ( ID | keyword_column_def )
            int alt175=2;
            int LA175_0 = input.LA(1);

            if ( (LA175_0==ID) ) {
                alt175=1;
            }
            else if ( ((LA175_0>=ABORT && LA175_0<=COLLATE)||(LA175_0>=COMMIT && LA175_0<=CONFLICT)||(LA175_0>=CREATE && LA175_0<=WHERE)) ) {
                alt175=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 175, 0, input);

                throw nvae;
            }
            switch (alt175) {
                case 1 :
                    // SqlParser.g:486:16: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID472=(Token)match(input,ID,FOLLOW_ID_in_id_column_def4179); 
                    ID472_tree = (Object)adaptor.create(ID472);
                    adaptor.addChild(root_0, ID472_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:486:21: keyword_column_def
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_keyword_column_def_in_id_column_def4183);
                    keyword_column_def473=keyword_column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, keyword_column_def473.getTree());

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
    // SqlParser.g:488:1: keyword_column_def : ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) ;
    public final SqlParser.keyword_column_def_return keyword_column_def() throws RecognitionException {
        SqlParser.keyword_column_def_return retval = new SqlParser.keyword_column_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set474=null;

        Object set474_tree=null;

        try {
            // SqlParser.g:488:19: ( ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) )
            // SqlParser.g:488:21: ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE )
            {
            root_0 = (Object)adaptor.nil();

            set474=(Token)input.LT(1);
            if ( (input.LA(1)>=ABORT && input.LA(1)<=COLLATE)||(input.LA(1)>=COMMIT && input.LA(1)<=CONFLICT)||(input.LA(1)>=CREATE && input.LA(1)<=WHERE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set474));
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
    protected DFA137 dfa137 = new DFA137(this);
    protected DFA138 dfa138 = new DFA138(this);
    protected DFA142 dfa142 = new DFA142(this);
    protected DFA162 dfa162 = new DFA162(this);
    protected DFA163 dfa163 = new DFA163(this);
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
            return "()+ loopback of 49:16: ( sql_stmt )+";
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
            return "51:11: ( EXPLAIN ( QUERY PLAN )? )?";
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
            return "51:20: ( QUERY PLAN )?";
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
        "\1\14\1\15\1\16\1\17\2\uffff\1\23\1\20\1\uffff\1\30\1\26\1\uffff"+
        "\1\21\1\24\1\22\1\25\1\27\1\31\3\uffff";
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
            "\1\27\52\uffff\1\31\1\25\3\uffff\1\26\1\uffff\1\27\4\uffff"+
            "\1\32\1\24",
            "\1\35\52\uffff\1\33\4\uffff\1\36\6\uffff\1\34",
            "",
            "",
            "\1\31\4\uffff\1\26\6\uffff\1\32",
            "",
            "",
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
            return "53:1: sql_stmt_core : ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt );";
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
        "\3\uffff\1\2\6\uffff\1\1\10\uffff";
    static final String DFA5_specialS =
        "\23\uffff}>";
    static final String[] DFA5_transitionS = {
            "\164\2\1\uffff\1\1",
            "\1\3\1\12\133\uffff\1\3\14\uffff\1\3\2\uffff\1\3\6\uffff\1"+
            "\3\21\uffff\1\3\17\uffff\1\3",
            "\1\3\1\12\133\uffff\1\3\14\uffff\1\3\2\uffff\1\3\6\uffff\1"+
            "\3\21\uffff\1\3\17\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "82:23: (database_name= id DOT )?";
        }
    }
    static final String DFA7_eotS =
        "\143\uffff";
    static final String DFA7_eofS =
        "\143\uffff";
    static final String DFA7_minS =
        "\1\27\33\uffff\1\21\24\uffff\1\30\1\uffff\1\21\6\30\51\uffff";
    static final String DFA7_maxS =
        "\1\u00af\33\uffff\1\u00b5\24\uffff\1\u00af\1\uffff\1\u00b5\1\110"+
        "\3\u009c\1\110\1\u00b1\51\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\2\34\uffff\1\1\104\uffff";
    static final String DFA7_specialS =
        "\143\uffff}>";
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
            "\3\36\3\uffff\1\1\1\uffff\1\1\1\36\1\1\3\36\33\uffff\52\36"+
            "\1\67\6\36\1\61\1\36\1\64\13\36\1\66\7\36\1\71\11\36\1\70\30"+
            "\36\1\65\10\36\1\63\1\uffff\3\36\1\uffff\1\36\1\uffff\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36\1\uffff\1\1\37\uffff\164\1\1\uffff\1\1",
            "",
            "\3\1\4\uffff\1\36\1\uffff\1\1\1\uffff\3\1\33\uffff\164\1\1"+
            "\uffff\3\1\1\uffff\1\1\1\uffff\1\1",
            "\1\36\57\uffff\1\1",
            "\1\36\44\uffff\1\1\136\uffff\1\1",
            "\1\36\u0083\uffff\1\1",
            "\1\36\u0083\uffff\1\1",
            "\1\36\57\uffff\1\1",
            "\1\36\u0098\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 84:18: ( OR or_subexpr )*";
        }
    }
    static final String DFA8_eotS =
        "\144\uffff";
    static final String DFA8_eofS =
        "\144\uffff";
    static final String DFA8_minS =
        "\1\27\34\uffff\1\21\2\uffff\1\30\1\21\6\30\74\uffff";
    static final String DFA8_maxS =
        "\1\u00af\34\uffff\1\u00b5\2\uffff\1\u00af\1\u00b5\1\110\3\u009c"+
        "\1\110\1\u00b1\74\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\2\50\uffff\1\1\71\uffff";
    static final String DFA8_specialS =
        "\144\uffff}>";
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
            "\3\52\3\uffff\1\1\1\uffff\1\1\1\52\1\1\3\52\33\uffff\52\52"+
            "\1\45\6\52\1\40\1\52\1\42\13\52\1\44\7\52\1\47\11\52\1\46\30"+
            "\52\1\43\10\52\1\41\1\uffff\3\52\1\uffff\1\52\1\uffff\1\52",
            "",
            "",
            "\1\52\1\uffff\1\1\37\uffff\164\1\1\uffff\1\1",
            "\3\1\4\uffff\1\52\1\uffff\1\1\1\uffff\3\1\33\uffff\164\1\1"+
            "\uffff\3\1\1\uffff\1\1\1\uffff\1\1",
            "\1\52\57\uffff\1\1",
            "\1\52\44\uffff\1\1\136\uffff\1\1",
            "\1\52\u0083\uffff\1\1",
            "\1\52\u0083\uffff\1\1",
            "\1\52\57\uffff\1\1",
            "\1\52\u0098\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 86:25: ( AND and_subexpr )*";
        }
    }
    static final String DFA19_eotS =
        "\u00aa\uffff";
    static final String DFA19_eofS =
        "\u00aa\uffff";
    static final String DFA19_minS =
        "\1\21\1\30\14\uffff\1\21\1\30\2\27\1\30\1\21\1\uffff\1\30\13\uffff"+
        "\2\21\u0087\uffff";
    static final String DFA19_maxS =
        "\2\u00b5\14\uffff\1\u00b5\3\u00af\1\u0086\1\u00b5\1\uffff\1\u00af"+
        "\13\uffff\2\u00b5\u0087\uffff";
    static final String DFA19_acceptS =
        "\2\uffff\1\1\43\uffff\1\2\16\uffff\1\3\2\uffff\1\4\100\uffff\1\5"+
        "\60\uffff";
    static final String DFA19_specialS =
        "\u00aa\uffff}>";
    static final String[] DFA19_transitionS = {
            "\3\2\6\uffff\1\2\1\uffff\3\2\33\uffff\15\2\1\23\44\2\1\16\5"+
            "\2\1\17\10\2\1\22\1\20\3\2\1\16\1\2\1\16\1\2\1\1\1\21\15\2\1"+
            "\16\32\2\1\uffff\3\2\1\uffff\1\2\1\uffff\1\2",
            "\1\2\1\uffff\1\2\1\uffff\3\2\33\uffff\15\2\1\42\44\2\1\41\5"+
            "\2\1\25\15\2\1\41\1\2\1\41\20\2\1\41\32\2\1\uffff\3\2\1\uffff"+
            "\1\2\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\46\4\uffff\1\2\1\uffff\1\46\1\uffff\3\46\33\uffff\164\46"+
            "\1\uffff\3\46\1\uffff\1\46\1\uffff\1\46",
            "\1\2\1\uffff\1\65\37\uffff\164\65\1\uffff\1\65",
            "\1\70\1\2\1\70\1\uffff\1\70\36\uffff\164\70\1\uffff\1\70",
            "\1\70\1\2\1\70\1\uffff\1\70\36\uffff\164\70\1\uffff\1\70",
            "\1\2\153\uffff\1\70\1\uffff\1\70",
            "\3\171\4\uffff\1\2\1\uffff\1\171\1\uffff\3\171\33\uffff\164"+
            "\171\1\uffff\3\171\1\uffff\1\171\1\uffff\1\171",
            "",
            "\1\2\1\uffff\1\65\37\uffff\164\65\1\uffff\1\65",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\46\4\uffff\1\2\1\uffff\1\46\1\uffff\3\46\33\uffff\164\46"+
            "\1\uffff\3\46\1\uffff\1\46\1\uffff\1\46",
            "\3\171\4\uffff\1\2\1\uffff\1\171\1\uffff\3\171\33\uffff\164"+
            "\171\1\uffff\3\171\1\uffff\1\171\1\uffff\1\171",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "88:1: and_subexpr : ( eq_subexpr ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )* | ( NOT )? ( LIKE | GLOB | REGEXP | MATCH ) eq_subexpr ( ESCAPE eq_subexpr )? | ( NOT )? IN ( LPAREN ( select_stmt | expr ( COMMA expr )* )? RPAREN | (database_name= id DOT )? table_name= id ) | ( ISNULL | NOTNULL | IS NULL | IS NOT NULL ) | ( NOT )? BETWEEN eq_subexpr AND eq_subexpr );";
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
            return "()* loopback of 89:3: ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )*";
        }
    }
    static final String DFA11_eotS =
        "\137\uffff";
    static final String DFA11_eofS =
        "\137\uffff";
    static final String DFA11_minS =
        "\1\27\1\21\37\uffff\1\30\1\21\6\30\66\uffff";
    static final String DFA11_maxS =
        "\1\u00af\1\u00b5\37\uffff\1\u00af\1\u00b5\1\110\3\u009c\1\110\1"+
        "\u00b1\66\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\50\uffff\1\1\63\uffff";
    static final String DFA11_specialS =
        "\137\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\1\uffff\1\2\1\uffff\1\2\36\uffff\51\2\1\1\112\2\1\uffff"+
            "\1\2",
            "\3\53\3\uffff\1\2\1\uffff\1\2\1\53\1\2\3\53\33\uffff\52\53"+
            "\1\46\6\53\1\41\1\53\1\43\13\53\1\45\7\53\1\50\11\53\1\47\30"+
            "\53\1\44\10\53\1\42\1\uffff\3\53\1\uffff\1\53\1\uffff\1\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            "\3\2\4\uffff\1\53\1\uffff\1\2\1\uffff\3\2\33\uffff\164\2\1"+
            "\uffff\3\2\1\uffff\1\2\1\uffff\1\2",
            "\1\53\57\uffff\1\2",
            "\1\53\44\uffff\1\2\136\uffff\1\2",
            "\1\53\u0083\uffff\1\2",
            "\1\53\u0083\uffff\1\2",
            "\1\53\57\uffff\1\2",
            "\1\53\u0098\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "90:54: ( ESCAPE eq_subexpr )?";
        }
    }
    static final String DFA14_eotS =
        "\57\uffff";
    static final String DFA14_eofS =
        "\57\uffff";
    static final String DFA14_minS =
        "\2\21\55\uffff";
    static final String DFA14_maxS =
        "\2\u00b5\55\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\23\uffff\1\3\1\uffff\1\1\26\uffff";
    static final String DFA14_specialS =
        "\57\uffff}>";
    static final String[] DFA14_transitionS = {
            "\3\2\6\uffff\1\2\1\26\3\2\33\uffff\142\2\1\1\21\2\1\uffff\3"+
            "\2\1\uffff\1\2\1\uffff\1\2",
            "\4\30\3\uffff\1\2\1\uffff\1\30\1\uffff\3\30\33\uffff\164\30"+
            "\1\uffff\3\30\1\uffff\1\30\1\uffff\1\30",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "91:23: ( select_stmt | expr ( COMMA expr )* )?";
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
        "\3\uffff\1\1\1\2\74\uffff";
    static final String DFA15_specialS =
        "\101\uffff}>";
    static final String[] DFA15_transitionS = {
            "\164\2\1\uffff\1\1",
            "\1\4\1\3\1\4\1\uffff\1\4\36\uffff\164\4\1\uffff\1\4",
            "\1\4\1\3\1\4\1\uffff\1\4\36\uffff\164\4\1\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "91:68: (database_name= id DOT )?";
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
            return "()* loopback of 95:25: ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )*";
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
            return "()* loopback of 97:26: ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )*";
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
            return "()* loopback of 99:26: ( ( PLUS | MINUS ) add_subexpr )*";
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
            return "()* loopback of 101:26: ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )*";
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
            return "()* loopback of 103:26: ( DOUBLE_PIPE con_subexpr )*";
        }
    }
    static final String DFA25_eotS =
        "\34\uffff";
    static final String DFA25_eofS =
        "\34\uffff";
    static final String DFA25_minS =
        "\1\21\1\30\32\uffff";
    static final String DFA25_maxS =
        "\2\u00b5\32\uffff";
    static final String DFA25_acceptS =
        "\2\uffff\1\2\4\uffff\1\1\24\uffff";
    static final String DFA25_specialS =
        "\34\uffff}>";
    static final String[] DFA25_transitionS = {
            "\3\7\6\uffff\1\2\1\uffff\3\2\33\uffff\112\2\1\1\51\2\1\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2",
            "\1\2\1\uffff\1\7\1\uffff\3\7\33\uffff\164\7\1\uffff\3\7\1\uffff"+
            "\1\7\1\uffff\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "105:14: ( PLUS | MINUS | TILDA | NOT )?";
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
            return "107:26: ( COLLATE collation_name= ID )?";
        }
    }
    static final String DFA36_eotS =
        "\u00a5\uffff";
    static final String DFA36_eofS =
        "\u00a5\uffff";
    static final String DFA36_minS =
        "\1\32\1\4\3\uffff\1\4\1\uffff\1\30\1\21\1\30\1\21\1\30\122\uffff"+
        "\1\21\106\uffff";
    static final String DFA36_maxS =
        "\1\u00b5\1\u00af\3\uffff\1\u00af\1\uffff\1\32\1\u00b5\1\32\1\u00b5"+
        "\1\32\122\uffff\1\u00b5\106\uffff";
    static final String DFA36_acceptS =
        "\2\uffff\1\2\3\uffff\1\1\5\uffff\1\3\47\uffff\1\4\47\uffff\1\6\2"+
        "\uffff\1\5\24\uffff\1\7\1\uffff\1\10\24\uffff\1\11\31\uffff";
    static final String DFA36_specialS =
        "\u00a5\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\10\1\uffff\3\2\33\uffff\20\14\1\12\1\7\10\14\3\1\17\14\1"+
            "\11\37\14\1\1\12\14\1\13\34\14\1\uffff\1\5\2\6\1\uffff\1\6\1"+
            "\uffff\1\6",
            "\17\6\1\uffff\4\6\1\14\1\6\1\uffff\1\6\36\uffff\164\6\1\uffff"+
            "\1\6",
            "",
            "",
            "",
            "\17\14\1\uffff\6\14\1\64\1\14\36\uffff\164\14\1\uffff\1\14",
            "",
            "\1\14\1\uffff\1\134",
            "\3\137\6\uffff\1\137\1\uffff\3\137\33\uffff\142\137\1\136\21"+
            "\137\1\uffff\3\137\1\uffff\1\137\1\uffff\1\137",
            "\1\14\1\uffff\1\164",
            "\3\166\4\uffff\1\14\1\uffff\1\166\1\uffff\3\166\33\uffff\164"+
            "\166\1\uffff\3\166\1\uffff\1\166\1\uffff\1\166",
            "\1\14\1\uffff\1\u008b",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\4\164\3\uffff\1\137\1\uffff\1\164\1\uffff\3\164\33\uffff\164"+
            "\164\1\uffff\3\164\1\uffff\1\164\1\uffff\1\164",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "109:1: atom_expr : ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID | function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN | LPAREN expr RPAREN -> expr | CAST LPAREN expr AS type_name RPAREN | ( EXISTS )? LPAREN select_stmt RPAREN | CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END | raise_function );";
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
            return "112:5: ( (database_name= id DOT )? table_name= id DOT )?";
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
            return "112:6: (database_name= id DOT )?";
        }
    }
    static final String DFA31_eotS =
        "\30\uffff";
    static final String DFA31_eofS =
        "\30\uffff";
    static final String DFA31_minS =
        "\1\21\27\uffff";
    static final String DFA31_maxS =
        "\1\u00b5\27\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\24\uffff\1\2\1\3";
    static final String DFA31_specialS =
        "\30\uffff}>";
    static final String[] DFA31_transitionS = {
            "\3\1\1\26\5\uffff\1\1\1\27\3\1\33\uffff\164\1\1\uffff\3\1\1"+
            "\uffff\1\1\1\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "113:29: ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )?";
        }
    }
    static final String DFA29_eotS =
        "\53\uffff";
    static final String DFA29_eofS =
        "\53\uffff";
    static final String DFA29_minS =
        "\2\21\51\uffff";
    static final String DFA29_maxS =
        "\2\u00b5\51\uffff";
    static final String DFA29_acceptS =
        "\2\uffff\1\2\24\uffff\1\1\23\uffff";
    static final String DFA29_specialS =
        "\53\uffff}>";
    static final String[] DFA29_transitionS = {
            "\3\2\6\uffff\1\2\1\uffff\3\2\33\uffff\44\2\1\1\117\2\1\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2",
            "\3\27\4\uffff\1\2\1\uffff\1\27\1\uffff\3\27\33\uffff\164\27"+
            "\1\uffff\3\27\1\uffff\1\27\1\uffff\1\27",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "113:30: ( DISTINCT )?";
        }
    }
    static final String DFA33_eotS =
        "\53\uffff";
    static final String DFA33_eofS =
        "\53\uffff";
    static final String DFA33_minS =
        "\1\21\23\uffff\1\21\26\uffff";
    static final String DFA33_maxS =
        "\1\u00b5\23\uffff\1\u00b5\26\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\24\uffff\1\2\24\uffff";
    static final String DFA33_specialS =
        "\53\uffff}>";
    static final String[] DFA33_transitionS = {
            "\3\1\6\uffff\1\1\1\uffff\3\1\33\uffff\162\1\1\24\1\1\1\uffff"+
            "\3\1\1\uffff\1\1\1\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\26\4\uffff\1\1\1\uffff\1\26\1\uffff\3\26\33\uffff\164\26"+
            "\1\uffff\3\26\1\uffff\1\26\1\uffff\1\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "117:10: ( expr )?";
        }
    }
    static final String DFA37_eotS =
        "\53\uffff";
    static final String DFA37_eofS =
        "\53\uffff";
    static final String DFA37_minS =
        "\1\34\1\4\51\uffff";
    static final String DFA37_maxS =
        "\1\36\1\u00b1\51\uffff";
    static final String DFA37_acceptS =
        "\2\uffff\1\3\1\4\1\2\1\1\45\uffff";
    static final String DFA37_specialS =
        "\53\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\1\1\2\1\3",
            "\17\5\1\uffff\4\5\1\uffff\1\5\1\uffff\1\5\36\uffff\164\5\1"+
            "\uffff\1\5\1\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "124:1: bind_parameter : ( QUESTION | QUESTION number= INTEGER | COLON id | AT id );";
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
            return "()+ loopback of 131:17: (names+= ID )+";
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
            return "131:23: ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )?";
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
            return "137:21: (database_name= id DOT )?";
        }
    }
    static final String DFA45_eotS =
        "\17\uffff";
    static final String DFA45_eofS =
        "\17\uffff";
    static final String DFA45_minS =
        "\2\72\5\uffff\1\72\2\uffff\1\27\4\uffff";
    static final String DFA45_maxS =
        "\2\u00b0\5\uffff\1\u00af\2\uffff\1\u00af\4\uffff";
    static final String DFA45_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\11\uffff";
    static final String DFA45_specialS =
        "\17\uffff}>";
    static final String[] DFA45_transitionS = {
            "\35\2\1\1\126\2\1\uffff\2\2",
            "\7\5\1\7\154\5\1\uffff\2\5",
            "",
            "",
            "",
            "",
            "",
            "\7\2\1\12\154\2\1\uffff\1\2",
            "",
            "",
            "\1\2\42\uffff\164\5\1\uffff\1\5",
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
            return "142:21: ( DATABASE )?";
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
            return "162:82: ( ASC | DESC )?";
        }
    }
    static final String DFA62_eotS =
        "\104\uffff";
    static final String DFA62_eofS =
        "\104\uffff";
    static final String DFA62_minS =
        "\3\21\101\uffff";
    static final String DFA62_maxS =
        "\3\u00b5\101\uffff";
    static final String DFA62_acceptS =
        "\3\uffff\1\3\25\uffff\1\1\25\uffff\1\2\24\uffff";
    static final String DFA62_specialS =
        "\104\uffff}>";
    static final String[] DFA62_transitionS = {
            "\4\3\5\uffff\1\3\1\uffff\3\3\33\uffff\3\3\1\1\40\3\1\2\117\3"+
            "\1\uffff\3\3\1\uffff\1\3\1\uffff\1\3",
            "\4\31\3\uffff\1\3\1\uffff\1\31\1\uffff\3\31\33\uffff\164\31"+
            "\1\uffff\3\31\1\uffff\1\31\1\uffff\1\31",
            "\4\57\3\uffff\1\3\1\uffff\1\57\1\uffff\3\57\33\uffff\164\57"+
            "\1\uffff\3\57\1\uffff\1\57\1\uffff\1\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "183:10: ( ALL | DISTINCT )?";
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
            return "()* loopback of 183:42: ( COMMA result_column )*";
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
            return "183:65: ( FROM join_source )?";
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
            return "183:85: ( WHERE where_expr= expr )?";
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
            return "()* loopback of 184:28: ( COMMA ordering_term )*";
        }
    }
    static final String DFA71_eotS =
        "\u00e5\uffff";
    static final String DFA71_eofS =
        "\u00e5\uffff";
    static final String DFA71_minS =
        "\1\21\1\uffff\1\4\1\30\1\4\1\uffff\1\30\5\uffff\1\30\1\21\1\30\1"+
        "\21\1\30\2\27\1\30\1\21\1\30\30\uffff\1\24\16\uffff\1\24\1\uffff"+
        "\1\24\30\uffff\2\24\1\uffff\1\24\26\uffff\1\24\16\uffff\2\24\23"+
        "\uffff\1\24\20\uffff\1\24\2\uffff\2\24\16\uffff\1\24\52\uffff";
    static final String DFA71_maxS =
        "\1\u00b5\1\uffff\1\u00af\1\u00b5\1\u00af\1\uffff\1\32\5\uffff\1"+
        "\32\1\u00b5\1\32\1\u00b5\3\u00af\1\u0086\1\u00b5\1\30\30\uffff\1"+
        "\u00af\16\uffff\1\u00af\1\uffff\1\u00af\30\uffff\2\u00af\1\uffff"+
        "\1\u00af\26\uffff\1\u00af\16\uffff\2\u00af\23\uffff\1\u00af\20\uffff"+
        "\1\u00af\2\uffff\2\u00af\16\uffff\1\u00af\52\uffff";
    static final String DFA71_acceptS =
        "\1\uffff\1\1\3\uffff\1\3\u00b5\uffff\1\2\51\uffff";
    static final String DFA71_specialS =
        "\u00e5\uffff}>";
    static final String[] DFA71_transitionS = {
            "\3\5\1\1\5\uffff\1\5\1\uffff\3\5\33\uffff\15\25\1\24\2\25\1"+
            "\15\1\6\10\25\3\4\17\25\1\14\5\25\1\17\5\25\1\20\10\25\1\23"+
            "\1\21\3\25\1\17\1\25\1\17\1\25\1\3\1\22\1\4\12\25\1\16\1\25"+
            "\1\17\32\25\1\uffff\1\2\2\5\1\uffff\1\5\1\uffff\1\5",
            "",
            "\17\5\1\uffff\4\5\1\56\3\5\36\uffff\164\5\1\uffff\1\5",
            "\1\75\1\uffff\1\5\1\uffff\3\5\33\uffff\164\5\1\uffff\3\5\1"+
            "\uffff\1\5\1\uffff\1\5",
            "\17\5\1\uffff\4\5\1\77\1\5\1\uffff\1\5\36\uffff\164\5\1\uffff"+
            "\1\5",
            "",
            "\1\130\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "\1\131\1\uffff\1\5",
            "\3\5\4\uffff\1\133\1\uffff\1\5\1\uffff\3\5\33\uffff\164\5\1"+
            "\uffff\3\5\1\uffff\1\5\1\uffff\1\5",
            "\1\162\1\uffff\1\5",
            "\3\5\4\uffff\1\u0081\1\uffff\1\5\1\uffff\3\5\33\uffff\164\5"+
            "\1\uffff\3\5\1\uffff\1\5\1\uffff\1\5",
            "\1\u0082\1\uffff\1\5\37\uffff\164\5\1\uffff\1\5",
            "\1\5\1\u0096\1\5\1\uffff\1\5\36\uffff\164\5\1\uffff\1\5",
            "\1\5\1\u00a7\1\5\1\uffff\1\5\36\uffff\164\5\1\uffff\1\5",
            "\1\u00aa\153\uffff\1\5\1\uffff\1\5",
            "\3\5\4\uffff\1\u00ab\1\uffff\1\5\1\uffff\3\5\33\uffff\164\5"+
            "\1\uffff\3\5\1\uffff\1\5\1\uffff\1\5",
            "\1\u00ba",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bb\45\uffff\164\5\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bb\45\uffff\164\5\1\uffff\1\5",
            "",
            "\1\u00bb\45\uffff\164\5\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bb\45\uffff\164\5\1\uffff\1\5",
            "\1\u00bb\45\uffff\164\5\1\uffff\1\5",
            "",
            "\1\u00bb\45\uffff\164\5\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bb\45\uffff\164\5\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bb\45\uffff\164\5\1\uffff\1\5",
            "\1\u00bb\45\uffff\164\5\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bb\45\uffff\164\5\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bb\45\uffff\164\5\1\uffff\1\5",
            "",
            "",
            "\1\u00bb\45\uffff\164\5\1\uffff\1\5",
            "\1\u00bb\45\uffff\164\5\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bb\45\uffff\164\5\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "190:1: result_column : ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) );";
        }
    }
    static final String DFA70_eotS =
        "\u00d1\uffff";
    static final String DFA70_eofS =
        "\u00d1\uffff";
    static final String DFA70_minS =
        "\1\27\2\uffff\1\27\1\uffff\1\21\6\27\4\uffff\1\30\2\uffff\1\21\6"+
        "\30\4\uffff\1\30\1\21\6\30\u00ab\uffff";
    static final String DFA70_maxS =
        "\1\u00af\2\uffff\1\u00af\1\uffff\1\u00b5\5\u00ad\1\u00b1\4\uffff"+
        "\1\u00af\2\uffff\1\u00b5\1\110\3\u009c\1\110\1\u00b1\4\uffff\1\u00af"+
        "\1\u00b5\1\110\3\u009c\1\110\1\u00b1\u00ab\uffff";
    static final String DFA70_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\u00cc\uffff";
    static final String DFA70_specialS =
        "\u00d1\uffff}>";
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
            "\3\4\3\uffff\1\1\1\uffff\1\1\1\4\1\1\3\4\33\uffff\52\4\1\43"+
            "\6\4\1\36\1\4\1\40\13\4\1\42\7\4\1\45\11\4\1\44\30\4\1\41\10"+
            "\4\1\37\1\uffff\3\4\1\uffff\1\4\1\uffff\1\4",
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
            "\1\1\3\uffff\1\4",
            "",
            "",
            "",
            "",
            "\1\4\1\uffff\1\1\37\uffff\164\1\1\uffff\1\1",
            "",
            "",
            "\3\1\4\uffff\1\4\1\uffff\1\1\1\uffff\3\1\33\uffff\164\1\1\uffff"+
            "\3\1\1\uffff\1\1\1\uffff\1\1",
            "\1\4\57\uffff\1\1",
            "\1\4\44\uffff\1\1\136\uffff\1\1",
            "\1\4\u0083\uffff\1\1",
            "\1\4\u0083\uffff\1\1",
            "\1\4\57\uffff\1\1",
            "\1\4\u0098\uffff\1\1",
            "",
            "",
            "",
            "",
            "\1\4\1\uffff\1\1\37\uffff\164\1\1\uffff\1\1",
            "\3\1\4\uffff\1\4\1\uffff\1\1\1\uffff\3\1\33\uffff\164\1\1\uffff"+
            "\3\1\1\uffff\1\1\1\uffff\1\1",
            "\1\4\57\uffff\1\1",
            "\1\4\44\uffff\1\1\136\uffff\1\1",
            "\1\4\u0083\uffff\1\1",
            "\1\4\u0083\uffff\1\1",
            "\1\4\57\uffff\1\1",
            "\1\4\u0098\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "193:10: ( ( AS )? column_alias= id )?";
        }
    }
    static final String DFA69_eotS =
        "\u00d3\uffff";
    static final String DFA69_eofS =
        "\u00d3\uffff";
    static final String DFA69_minS =
        "\1\72\1\27\3\uffff\1\27\1\21\6\27\5\uffff\1\30\1\21\6\30\6\uffff"+
        "\1\30\1\21\6\30\u00ab\uffff";
    static final String DFA69_maxS =
        "\2\u00af\3\uffff\1\u00af\1\u00b5\5\u00ad\1\u00b1\5\uffff\1\u00af"+
        "\1\u00b5\1\110\3\u009c\1\110\1\u00b1\6\uffff\1\u00af\1\u00b5\1\110"+
        "\3\u009c\1\110\1\u00b1\u00ab\uffff";
    static final String DFA69_acceptS =
        "\2\uffff\1\2\14\uffff\1\1\u00c3\uffff";
    static final String DFA69_specialS =
        "\u00d3\uffff}>";
    static final String[] DFA69_transitionS = {
            "\7\2\1\1\154\2\1\uffff\1\2",
            "\1\2\1\uffff\1\2\1\uffff\1\2\36\uffff\52\17\1\12\6\17\1\5\1"+
            "\17\1\7\13\17\1\11\7\17\1\14\11\17\1\13\30\17\1\10\10\17\1\6"+
            "\1\uffff\1\17",
            "",
            "",
            "",
            "\1\17\1\uffff\1\17\1\2\1\17\36\uffff\52\2\1\27\6\2\1\22\1\2"+
            "\1\24\13\2\1\26\7\2\1\31\11\2\1\30\30\2\1\25\10\2\1\23\1\uffff"+
            "\1\2",
            "\3\2\3\uffff\1\17\1\uffff\1\17\1\2\1\17\3\2\33\uffff\52\2\1"+
            "\45\6\2\1\40\1\2\1\42\13\2\1\44\7\2\1\47\11\2\1\46\30\2\1\43"+
            "\10\2\1\41\1\uffff\3\2\1\uffff\1\2\1\uffff\1\2",
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
            "\1\17\10\uffff\1\17\3\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "\1\2\1\uffff\1\17\37\uffff\164\17\1\uffff\1\17",
            "\3\17\4\uffff\1\2\1\uffff\1\17\1\uffff\3\17\33\uffff\164\17"+
            "\1\uffff\3\17\1\uffff\1\17\1\uffff\1\17",
            "\1\2\57\uffff\1\17",
            "\1\2\44\uffff\1\17\136\uffff\1\17",
            "\1\2\u0083\uffff\1\17",
            "\1\2\u0083\uffff\1\17",
            "\1\2\57\uffff\1\17",
            "\1\2\u0098\uffff\1\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\2\1\uffff\1\17\37\uffff\164\17\1\uffff\1\17",
            "\3\17\4\uffff\1\2\1\uffff\1\17\1\uffff\3\17\33\uffff\164\17"+
            "\1\uffff\3\17\1\uffff\1\17\1\uffff\1\17",
            "\1\2\57\uffff\1\17",
            "\1\2\44\uffff\1\17\136\uffff\1\17",
            "\1\2\u0083\uffff\1\17",
            "\1\2\u0083\uffff\1\17",
            "\1\2\57\uffff\1\17",
            "\1\2\u0098\uffff\1\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "193:11: ( AS )?";
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
            return "()* loopback of 195:28: ( join_op single_source ( join_constraint )? )*";
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
            return "195:52: ( join_constraint )?";
        }
    }
    static final String DFA80_eotS =
        "\40\uffff";
    static final String DFA80_eofS =
        "\40\uffff";
    static final String DFA80_minS =
        "\1\32\2\uffff\1\32\1\uffff\1\21\32\uffff";
    static final String DFA80_maxS =
        "\1\u00af\2\uffff\1\u00af\1\uffff\1\u00b5\32\uffff";
    static final String DFA80_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\3\uffff\1\2\27\uffff";
    static final String DFA80_specialS =
        "\40\uffff}>";
    static final String[] DFA80_transitionS = {
            "\1\3\37\uffff\164\1\1\uffff\1\1",
            "",
            "",
            "\1\4\37\uffff\142\4\1\5\21\4\1\uffff\1\4",
            "",
            "\4\10\3\uffff\1\4\1\uffff\1\10\1\uffff\3\10\33\uffff\164\10"+
            "\1\uffff\3\10\1\uffff\1\10\1\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "197:1: single_source : ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN );";
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
            return "198:5: (database_name= id DOT )?";
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
            return "198:43: ( ( AS )? table_alias= ID )?";
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
            return "198:67: ( INDEXED BY index_name= id | NOT INDEXED )?";
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
            return "200:31: ( ( AS )? table_alias= ID )?";
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
        "\3\uffff\1\1\1\2\10\uffff";
    static final String DFA90_specialS =
        "\15\uffff}>";
    static final String[] DFA90_transitionS = {
            "\164\2\1\uffff\1\1",
            "\1\3\1\uffff\1\4\75\uffff\1\4\103\uffff\1\4\14\uffff\1\4",
            "\1\3\1\uffff\1\4\75\uffff\1\4\103\uffff\1\4\14\uffff\1\4",
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
            return "213:67: (database_name= id DOT )?";
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
            return "()* loopback of 256:23: ( COMMA column_def )*";
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
            return "261:32: ( type_name )?";
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
            return "()* loopback of 261:43: ( column_constraint )*";
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
            return "282:37: ( ASC | DESC )?";
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
            return "282:51: ( table_conflict_clause )?";
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
            return "282:74: ( AUTOINCREMENT )?";
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
            return "284:38: ( table_conflict_clause )?";
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
            return "286:35: ( table_conflict_clause )?";
        }
    }
    static final String DFA137_eotS =
        "\17\uffff";
    static final String DFA137_eofS =
        "\17\uffff";
    static final String DFA137_minS =
        "\1\27\16\uffff";
    static final String DFA137_maxS =
        "\1\u00a5\16\uffff";
    static final String DFA137_acceptS =
        "\1\uffff\1\2\13\uffff\1\1\1\uffff";
    static final String DFA137_specialS =
        "\17\uffff}>";
    static final String[] DFA137_transitionS = {
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
            return "()+ loopback of 320:3: ( fk_clause_action )+";
        }
    }
    static final String DFA138_eotS =
        "\17\uffff";
    static final String DFA138_eofS =
        "\17\uffff";
    static final String DFA138_minS =
        "\1\27\1\131\15\uffff";
    static final String DFA138_maxS =
        "\1\u00a5\1\u0086\15\uffff";
    static final String DFA138_acceptS =
        "\2\uffff\1\1\1\2\13\uffff";
    static final String DFA138_specialS =
        "\17\uffff}>";
    static final String[] DFA138_transitionS = {
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

    static final short[] DFA138_eot = DFA.unpackEncodedString(DFA138_eotS);
    static final short[] DFA138_eof = DFA.unpackEncodedString(DFA138_eofS);
    static final char[] DFA138_min = DFA.unpackEncodedStringToUnsignedChars(DFA138_minS);
    static final char[] DFA138_max = DFA.unpackEncodedStringToUnsignedChars(DFA138_maxS);
    static final short[] DFA138_accept = DFA.unpackEncodedString(DFA138_acceptS);
    static final short[] DFA138_special = DFA.unpackEncodedString(DFA138_specialS);
    static final short[][] DFA138_transition;

    static {
        int numStates = DFA138_transitionS.length;
        DFA138_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA138_transition[i] = DFA.unpackEncodedString(DFA138_transitionS[i]);
        }
    }

    class DFA138 extends DFA {

        public DFA138(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 138;
            this.eot = DFA138_eot;
            this.eof = DFA138_eof;
            this.min = DFA138_min;
            this.max = DFA138_max;
            this.accept = DFA138_accept;
            this.special = DFA138_special;
            this.transition = DFA138_transition;
        }
        public String getDescription() {
            return "320:21: ( fk_clause_deferrable )?";
        }
    }
    static final String DFA142_eotS =
        "\17\uffff";
    static final String DFA142_eofS =
        "\17\uffff";
    static final String DFA142_minS =
        "\1\27\1\132\15\uffff";
    static final String DFA142_maxS =
        "\1\u00a5\1\161\15\uffff";
    static final String DFA142_acceptS =
        "\2\uffff\1\3\12\uffff\1\1\1\2";
    static final String DFA142_specialS =
        "\17\uffff}>";
    static final String[] DFA142_transitionS = {
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

    static final short[] DFA142_eot = DFA.unpackEncodedString(DFA142_eotS);
    static final short[] DFA142_eof = DFA.unpackEncodedString(DFA142_eofS);
    static final char[] DFA142_min = DFA.unpackEncodedStringToUnsignedChars(DFA142_minS);
    static final char[] DFA142_max = DFA.unpackEncodedStringToUnsignedChars(DFA142_maxS);
    static final short[] DFA142_accept = DFA.unpackEncodedString(DFA142_acceptS);
    static final short[] DFA142_special = DFA.unpackEncodedString(DFA142_specialS);
    static final short[][] DFA142_transition;

    static {
        int numStates = DFA142_transitionS.length;
        DFA142_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA142_transition[i] = DFA.unpackEncodedString(DFA142_transitionS[i]);
        }
    }

    class DFA142 extends DFA {

        public DFA142(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 142;
            this.eot = DFA142_eot;
            this.eof = DFA142_eof;
            this.min = DFA142_min;
            this.max = DFA142_max;
            this.accept = DFA142_accept;
            this.special = DFA142_special;
            this.transition = DFA142_transition;
        }
        public String getDescription() {
            return "326:41: ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?";
        }
    }
    static final String DFA162_eotS =
        "\14\uffff";
    static final String DFA162_eofS =
        "\14\uffff";
    static final String DFA162_minS =
        "\1\72\1\30\12\uffff";
    static final String DFA162_maxS =
        "\1\u00af\1\u00a6\12\uffff";
    static final String DFA162_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\7\uffff";
    static final String DFA162_specialS =
        "\14\uffff}>";
    static final String[] DFA162_transitionS = {
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
            return "354:48: ( IF NOT EXISTS )?";
        }
    }
    static final String DFA163_eotS =
        "\21\uffff";
    static final String DFA163_eofS =
        "\21\uffff";
    static final String DFA163_minS =
        "\1\72\2\30\16\uffff";
    static final String DFA163_maxS =
        "\1\u00af\2\u00a6\16\uffff";
    static final String DFA163_acceptS =
        "\3\uffff\1\2\5\uffff\1\1\7\uffff";
    static final String DFA163_specialS =
        "\21\uffff}>";
    static final String[] DFA163_transitionS = {
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

    static final short[] DFA163_eot = DFA.unpackEncodedString(DFA163_eotS);
    static final short[] DFA163_eof = DFA.unpackEncodedString(DFA163_eofS);
    static final char[] DFA163_min = DFA.unpackEncodedStringToUnsignedChars(DFA163_minS);
    static final char[] DFA163_max = DFA.unpackEncodedStringToUnsignedChars(DFA163_maxS);
    static final short[] DFA163_accept = DFA.unpackEncodedString(DFA163_acceptS);
    static final short[] DFA163_special = DFA.unpackEncodedString(DFA163_specialS);
    static final short[][] DFA163_transition;

    static {
        int numStates = DFA163_transitionS.length;
        DFA163_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA163_transition[i] = DFA.unpackEncodedString(DFA163_transitionS[i]);
        }
    }

    class DFA163 extends DFA {

        public DFA163(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 163;
            this.eot = DFA163_eot;
            this.eof = DFA163_eof;
            this.min = DFA163_min;
            this.max = DFA163_max;
            this.accept = DFA163_accept;
            this.special = DFA163_special;
            this.transition = DFA163_transition;
        }
        public String getDescription() {
            return "354:65: (database_name= id DOT )?";
        }
    }
 

    public static final BitSet FOLLOW_sql_stmt_in_sql_stmt_list132 = new BitSet(new long[]{0xC000000000000002L,0x00800084A8048048L,0x000001401AB04000L});
    public static final BitSet FOLLOW_EXPLAIN_in_sql_stmt142 = new BitSet(new long[]{0xC000000000800000L,0x00800084A8048048L,0x000001401AB14000L});
    public static final BitSet FOLLOW_QUERY_in_sql_stmt145 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_PLAN_in_sql_stmt147 = new BitSet(new long[]{0xC000000000800000L,0x00800084A8048048L,0x000001401AB04000L});
    public static final BitSet FOLLOW_sql_stmt_core_in_sql_stmt153 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMI_in_sql_stmt155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_stmt_in_sql_stmt_core166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attach_stmt_in_sql_stmt_core172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_detach_stmt_in_sql_stmt_core178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_analyze_stmt_in_sql_stmt_core184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reindex_stmt_in_sql_stmt_core190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vacuum_stmt_in_sql_stmt_core196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_sql_stmt_core205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_stmt_in_sql_stmt_core211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_stmt_in_sql_stmt_core217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_stmt_in_sql_stmt_core223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_stmt_in_sql_stmt_core229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commit_stmt_in_sql_stmt_core235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rollback_stmt_in_sql_stmt_core241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_savepoint_stmt_in_sql_stmt_core247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_release_stmt_in_sql_stmt_core253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_virtual_table_stmt_in_sql_stmt_core262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_table_stmt_in_sql_stmt_core268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_table_stmt_in_sql_stmt_core274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alter_table_stmt_in_sql_stmt_core280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_view_stmt_in_sql_stmt_core286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_view_stmt_in_sql_stmt_core292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_index_stmt_in_sql_stmt_core298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_index_stmt_in_sql_stmt_core304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_trigger_stmt_in_sql_stmt_core310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_trigger_stmt_in_sql_stmt_core316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_qualified_table_name326 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_qualified_table_name328 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_qualified_table_name334 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INDEXED_in_qualified_table_name337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_qualified_table_name339 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_qualified_table_name343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_qualified_table_name347 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_INDEXED_in_qualified_table_name349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_subexpr_in_expr358 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OR_in_expr361 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_or_subexpr_in_expr364 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_and_subexpr_in_or_subexpr373 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_AND_in_or_subexpr376 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_and_subexpr_in_or_subexpr379 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr388 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_set_in_and_subexpr394 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr410 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_NOT_in_and_subexpr419 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000000000080005L});
    public static final BitSet FOLLOW_set_in_and_subexpr423 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr439 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_ESCAPE_in_and_subexpr442 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_and_subexpr453 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_IN_in_and_subexpr457 = new BitSet(new long[]{0xFC00000004000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_LPAREN_in_and_subexpr460 = new BitSet(new long[]{0xFC0000007C0E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_select_stmt_in_and_subexpr463 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_expr_in_and_subexpr467 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_and_subexpr470 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_and_subexpr472 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_and_subexpr478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_and_subexpr485 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_and_subexpr487 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_and_subexpr493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISNULL_in_and_subexpr501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTNULL_in_and_subexpr505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_and_subexpr509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_and_subexpr511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_and_subexpr516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_and_subexpr518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_and_subexpr520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_and_subexpr528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_BETWEEN_in_and_subexpr532 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_AND_in_and_subexpr536 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_neq_subexpr_in_eq_subexpr545 = new BitSet(new long[]{0x0000000000000F02L});
    public static final BitSet FOLLOW_set_in_eq_subexpr548 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_neq_subexpr_in_eq_subexpr565 = new BitSet(new long[]{0x0000000000000F02L});
    public static final BitSet FOLLOW_bit_subexpr_in_neq_subexpr574 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_set_in_neq_subexpr577 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_bit_subexpr_in_neq_subexpr594 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_add_subexpr_in_bit_subexpr603 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_set_in_bit_subexpr606 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_add_subexpr_in_bit_subexpr615 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_mul_subexpr_in_add_subexpr624 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_set_in_add_subexpr627 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_mul_subexpr_in_add_subexpr640 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_con_subexpr_in_mul_subexpr649 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_DOUBLE_PIPE_in_mul_subexpr652 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_con_subexpr_in_mul_subexpr655 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_set_in_con_subexpr664 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_unary_subexpr_in_con_subexpr681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_expr_in_unary_subexpr688 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_COLLATE_in_unary_subexpr691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_unary_subexpr696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_value_in_atom_expr708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bind_parameter_in_atom_expr714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_atom_expr724 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_atom_expr726 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_atom_expr732 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_atom_expr734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_atom_expr740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom_expr748 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr750 = new BitSet(new long[]{0xFC0000007C1E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_DISTINCT_in_atom_expr754 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr760 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_atom_expr763 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr767 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_ASTERISK_in_atom_expr773 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr783 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr785 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_atom_expr797 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr799 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_atom_expr803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_type_name_in_atom_expr805 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXISTS_in_atom_expr816 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_atom_expr822 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_atom_expr830 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_WHEN_in_atom_expr838 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_THEN_in_atom_expr842 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr844 = new BitSet(new long[]{0x0000000000000000L,0x0000000600000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_ELSE_in_atom_expr849 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr851 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_END_in_atom_expr855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raise_function_in_atom_expr861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal_value0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_signed_number0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bind_parameter921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bind_parameter927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_bind_parameter931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_bind_parameter937 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_bind_parameter939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_bind_parameter945 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_bind_parameter947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_name957 = new BitSet(new long[]{0x0000000004000002L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_LPAREN_in_type_name961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x001A000000000000L});
    public static final BitSet FOLLOW_signed_number_in_type_name965 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_type_name968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x001A000000000000L});
    public static final BitSet FOLLOW_signed_number_in_type_name972 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_type_name976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAISE_in_raise_function1007 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_raise_function1009 = new BitSet(new long[]{0x0400000000000000L,0x0001010000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_IGNORE_in_raise_function1012 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_set_in_raise_function1016 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COMMA_in_raise_function1028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_STRING_in_raise_function1032 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_raise_function1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_in_pragma_stmt1043 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_pragma_stmt1048 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_pragma_stmt1050 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_pragma_stmt1056 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_EQUALS_in_pragma_stmt1059 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_pragma_value_in_pragma_stmt1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_pragma_stmt1065 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_pragma_value_in_pragma_stmt1067 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_pragma_stmt1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signed_number_in_pragma_value1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_pragma_value1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_pragma_value1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTACH_in_attach_stmt1096 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0001BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_DATABASE_in_attach_stmt1099 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0001BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_STRING_in_attach_stmt1106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_attach_stmt1110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_attach_stmt1113 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_attach_stmt1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DETACH_in_detach_stmt1125 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_DATABASE_in_detach_stmt1128 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_detach_stmt1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANALYZE_in_analyze_stmt1142 = new BitSet(new long[]{0xFC00000000000002L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_analyze_stmt1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_analyze_stmt1153 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_analyze_stmt1155 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_analyze_stmt1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REINDEX_in_reindex_stmt1169 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_reindex_stmt1174 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_reindex_stmt1176 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_reindex_stmt1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VACUUM_in_vacuum_stmt1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_operation_conflict_clause1201 = new BitSet(new long[]{0x0400000000000000L,0x0001010000000000L,0x0000000002800000L});
    public static final BitSet FOLLOW_set_in_operation_conflict_clause1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_ordering_term1228 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000004L});
    public static final BitSet FOLLOW_ASC_in_ordering_term1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_ordering_term1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_operation_limited_clause1267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_operation_limited_clause1269 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_operation_limited_clause1271 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_operation_limited_clause1274 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_operation_limited_clause1276 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_operation_limited_clause1284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_operation_limited_clause1288 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_set_in_operation_limited_clause1291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_operation_limited_clause1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_list_in_select_stmt1311 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_ORDER_in_select_stmt1316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_select_stmt1318 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt1320 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt1323 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt1325 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_select_stmt1334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt1338 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_OFFSET_in_select_stmt1342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt1346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_core_in_select_list1396 = new BitSet(new long[]{0x0000000000000002L,0x0200001000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_select_op_in_select_list1399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_core_in_select_list1402 = new BitSet(new long[]{0x0000000000000002L,0x0200001000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_UNION_in_select_op1411 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ALL_in_select_op1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERSECT_in_select_op1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCEPT_in_select_op1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_core1434 = new BitSet(new long[]{0xFC000000741E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ALL_in_select_core1437 = new BitSet(new long[]{0xFC000000741E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_DISTINCT_in_select_core1441 = new BitSet(new long[]{0xFC000000741E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_result_column_in_select_core1445 = new BitSet(new long[]{0x0000000002000002L,0x0000280000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_core1448 = new BitSet(new long[]{0xFC000000741E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_result_column_in_select_core1450 = new BitSet(new long[]{0x0000000002000002L,0x0000280000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_FROM_in_select_core1455 = new BitSet(new long[]{0xFC00000004000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_join_source_in_select_core1457 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_WHERE_in_select_core1462 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_select_core1466 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_GROUP_in_select_core1474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_select_core1476 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_select_core1478 = new BitSet(new long[]{0x0000000002000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_core1481 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_select_core1483 = new BitSet(new long[]{0x0000000002000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_HAVING_in_select_core1488 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_select_core1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_result_column1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_result_column1570 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_result_column1572 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ASTERISK_in_result_column1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_result_column1589 = new BitSet(new long[]{0xFC00000000000002L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_AS_in_result_column1593 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_result_column1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_source_in_join_source1620 = new BitSet(new long[]{0x0000000002000002L,0xA040000000080000L,0x0000000000001008L});
    public static final BitSet FOLLOW_join_op_in_join_source1623 = new BitSet(new long[]{0xFC00000004000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_single_source_in_join_source1626 = new BitSet(new long[]{0x0000000002000002L,0xA040000000080000L,0x0000008000001208L});
    public static final BitSet FOLLOW_join_constraint_in_join_source1629 = new BitSet(new long[]{0x0000000002000002L,0xA040000000080000L,0x0000000000001008L});
    public static final BitSet FOLLOW_id_in_single_source1646 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_single_source1648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_single_source1654 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000002L,0x0000800000000010L});
    public static final BitSet FOLLOW_AS_in_single_source1658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_single_source1664 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INDEXED_in_single_source1669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_single_source1671 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_single_source1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_single_source1679 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_INDEXED_in_single_source1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_single_source1722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_single_source1724 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_single_source1726 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_AS_in_single_source1730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_single_source1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_single_source1758 = new BitSet(new long[]{0xFC00000004000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_join_source_in_single_source1761 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_single_source1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_join_op1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATURAL_in_join_op1781 = new BitSet(new long[]{0x0000000000000000L,0xA040000000080000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LEFT_in_join_op1787 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_OUTER_in_join_op1792 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_INNER_in_join_op1798 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_CROSS_in_join_op1802 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_JOIN_in_join_op1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_join_constraint1816 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_join_constraint1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_join_constraint1825 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_join_constraint1827 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_join_constraint1831 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_join_constraint1834 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_join_constraint1838 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_join_constraint1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_stmt1861 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_operation_conflict_clause_in_insert_stmt1864 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_REPLACE_in_insert_stmt1870 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_INTO_in_insert_stmt1873 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_insert_stmt1878 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_insert_stmt1880 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_insert_stmt1886 = new BitSet(new long[]{0x0000000004000000L,0x0000000001000000L,0x0000020010000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt1893 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_insert_stmt1897 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt1900 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_insert_stmt1904 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt1908 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020010000000L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt1917 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt1919 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_insert_stmt1923 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt1926 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_insert_stmt1930 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_insert_stmt1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_insert_stmt1945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update_stmt1957 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_operation_conflict_clause_in_update_stmt1960 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_qualified_table_name_in_update_stmt1964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_SET_in_update_stmt1968 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_update_set_in_update_stmt1972 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000200000000802L});
    public static final BitSet FOLLOW_COMMA_in_update_stmt1975 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_update_set_in_update_stmt1979 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000200000000802L});
    public static final BitSet FOLLOW_WHERE_in_update_stmt1984 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_update_stmt1986 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_operation_limited_clause_in_update_stmt1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_update_set2002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQUALS_in_update_set2004 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_update_set2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_stmt2014 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_FROM_in_delete_stmt2016 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_qualified_table_name_in_delete_stmt2018 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000802L});
    public static final BitSet FOLLOW_WHERE_in_delete_stmt2021 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_delete_stmt2023 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_operation_limited_clause_in_delete_stmt2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_begin_stmt2038 = new BitSet(new long[]{0x0000000000000002L,0x0002002004000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_set_in_begin_stmt2040 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_begin_stmt2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_commit_stmt2064 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_commit_stmt2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROLLBACK_in_rollback_stmt2083 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_rollback_stmt2086 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_TO_in_rollback_stmt2091 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_SAVEPOINT_in_rollback_stmt2094 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_rollback_stmt2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVEPOINT_in_savepoint_stmt2110 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_savepoint_stmt2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELEASE_in_release_stmt2122 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_SAVEPOINT_in_release_stmt2125 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_release_stmt2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_table_conflict_clause2143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_CONFLICT_in_table_conflict_clause2146 = new BitSet(new long[]{0x0400000000000000L,0x0001010000000000L,0x0000000002800000L});
    public static final BitSet FOLLOW_set_in_table_conflict_clause2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_virtual_table_stmt2176 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_VIRTUAL_in_create_virtual_table_stmt2178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_create_virtual_table_stmt2180 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2185 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_virtual_table_stmt2187 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_USING_in_create_virtual_table_stmt2197 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2201 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_LPAREN_in_create_virtual_table_stmt2204 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_virtual_table_stmt2206 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_virtual_table_stmt2209 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_virtual_table_stmt2211 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_virtual_table_stmt2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_table_stmt2225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_table_stmt2227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_create_table_stmt2230 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_create_table_stmt2233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_table_stmt2235 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_table_stmt2237 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_table_stmt2244 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_table_stmt2246 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_table_stmt2252 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_create_table_stmt2258 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_table_stmt2260 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_table_stmt2263 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_table_stmt2265 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_table_stmt2270 = new BitSet(new long[]{0x0000000000000000L,0x0000040000021000L,0x0000002000008000L});
    public static final BitSet FOLLOW_table_constraint_in_create_table_stmt2272 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_table_stmt2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_create_table_stmt2282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_create_table_stmt2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_column_def_in_column_def2340 = new BitSet(new long[]{0x0000000000000002L,0x0000000001023000L,0x0000802000048010L});
    public static final BitSet FOLLOW_type_name_in_column_def2342 = new BitSet(new long[]{0x0000000000000002L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_column_constraint_in_column_def2345 = new BitSet(new long[]{0x0000000000000002L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_CONSTRAINT_in_column_constraint2371 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_column_constraint2375 = new BitSet(new long[]{0x0000000000000000L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_column_constraint_pk_in_column_constraint2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_not_null_in_column_constraint2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_unique_in_column_constraint2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_check_in_column_constraint2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_default_in_column_constraint2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_collate_in_column_constraint2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fk_clause_in_column_constraint2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_in_column_constraint_pk2474 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_KEY_in_column_constraint_pk2477 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000014L,0x0000000000000200L});
    public static final BitSet FOLLOW_set_in_column_constraint_pk2480 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_pk2489 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_AUTOINCREMENT_in_column_constraint_pk2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_column_constraint_not_null2502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_column_constraint_not_null2504 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_not_null2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_column_constraint_unique2523 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_unique2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECK_in_column_constraint_check2534 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_column_constraint_check2537 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_column_constraint_check2540 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_column_constraint_check2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_column_constraint_default2550 = new BitSet(new long[]{0x0000000004000000L,0x0000000000700000L,0x003B000000000040L});
    public static final BitSet FOLLOW_SIGNED_NUMBER_in_column_constraint_default2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_value_in_column_constraint_default2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_column_constraint_default2562 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_column_constraint_default2565 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_column_constraint_default2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLATE_in_column_constraint_collate2576 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_column_constraint_collate2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRAINT_in_table_constraint2590 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint2594 = new BitSet(new long[]{0x0000000000000000L,0x0000040000021000L,0x0000002000008000L});
    public static final BitSet FOLLOW_table_constraint_pk_in_table_constraint2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_unique_in_table_constraint2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_check_in_table_constraint2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_fk_in_table_constraint2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_in_table_constraint_pk2660 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_KEY_in_table_constraint_pk2662 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_pk2666 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_pk2670 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_pk2673 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_pk2677 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_pk2681 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_table_constraint_pk2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_table_constraint_unique2708 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_unique2712 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_unique2716 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_unique2719 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_unique2723 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_unique2727 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_table_constraint_unique2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECK_in_table_constraint_check2754 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_check2757 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_table_constraint_check2760 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_check2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREIGN_in_table_constraint_fk2770 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_KEY_in_table_constraint_fk2772 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_fk2774 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_fk2778 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_fk2781 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_fk2785 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_fk2789 = new BitSet(new long[]{0x0000000000000000L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_fk_clause_in_table_constraint_fk2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCES_in_fk_clause2814 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_fk_clause2819 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000204L});
    public static final BitSet FOLLOW_LPAREN_in_fk_clause2822 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_fk_clause2826 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_fk_clause2829 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_fk_clause2833 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_fk_clause2837 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000204L});
    public static final BitSet FOLLOW_fk_clause_action_in_fk_clause2843 = new BitSet(new long[]{0x0000000004000002L,0x0000000002000000L,0x0000000000000214L});
    public static final BitSet FOLLOW_fk_clause_deferrable_in_fk_clause2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_fk_clause_action2857 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_set_in_fk_clause_action2859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L,0x0000000021000000L});
    public static final BitSet FOLLOW_SET_in_fk_clause_action2872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_fk_clause_action2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_fk_clause_action2878 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_DEFAULT_in_fk_clause_action2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASCADE_in_fk_clause_action2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESTRICT_in_fk_clause_action2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCH_in_fk_clause_action2895 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_fk_clause_action2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_fk_clause_deferrable2907 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_DEFERRABLE_in_fk_clause_deferrable2911 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_INITIALLY_in_fk_clause_deferrable2914 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_DEFERRED_in_fk_clause_deferrable2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITIALLY_in_fk_clause_deferrable2920 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IMMEDIATE_in_fk_clause_deferrable2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_table_stmt2932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_drop_table_stmt2934 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_drop_table_stmt2937 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_table_stmt2939 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_table_stmt2946 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_table_stmt2948 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_table_stmt2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALTER_in_alter_table_stmt2984 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_alter_table_stmt2986 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt2991 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_alter_table_stmt2993 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt2999 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RENAME_in_alter_table_stmt3002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_TO_in_alter_table_stmt3004 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_alter_table_stmt3012 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_COLUMN_in_alter_table_stmt3015 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_alter_table_stmt3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_view_stmt3028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040080000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_view_stmt3030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_VIEW_in_create_view_stmt3033 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_create_view_stmt3036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_view_stmt3038 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_view_stmt3040 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_view_stmt3047 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_view_stmt3049 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_view_stmt3055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_create_view_stmt3057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_create_view_stmt3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_view_stmt3067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_VIEW_in_drop_view_stmt3069 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_drop_view_stmt3072 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_view_stmt3074 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_view_stmt3081 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_view_stmt3083 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_view_stmt3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_index_stmt3097 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_UNIQUE_in_create_index_stmt3100 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_INDEX_in_create_index_stmt3104 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_create_index_stmt3107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_index_stmt3109 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_index_stmt3111 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3118 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_index_stmt3120 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ON_in_create_index_stmt3130 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3134 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_create_index_stmt3136 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_indexed_column_in_create_index_stmt3140 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_index_stmt3143 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_indexed_column_in_create_index_stmt3147 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_index_stmt3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_indexed_column3197 = new BitSet(new long[]{0x0000000000000002L,0x0000000010002004L});
    public static final BitSet FOLLOW_COLLATE_in_indexed_column3200 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_indexed_column3204 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000004L});
    public static final BitSet FOLLOW_ASC_in_indexed_column3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_indexed_column3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_index_stmt3244 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_INDEX_in_drop_index_stmt3246 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_drop_index_stmt3249 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_index_stmt3251 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_index_stmt3258 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_index_stmt3260 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_index_stmt3266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_trigger_stmt3296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000880000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_trigger_stmt3298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_TRIGGER_in_create_trigger_stmt3301 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_create_trigger_stmt3304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_trigger_stmt3306 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_trigger_stmt3308 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3315 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_trigger_stmt3317 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3323 = new BitSet(new long[]{0x1000000000000000L,0x0180000008000020L,0x0000004000000000L});
    public static final BitSet FOLLOW_BEFORE_in_create_trigger_stmt3328 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_AFTER_in_create_trigger_stmt3332 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_INSTEAD_in_create_trigger_stmt3336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_OF_in_create_trigger_stmt3338 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_DELETE_in_create_trigger_stmt3343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INSERT_in_create_trigger_stmt3347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_UPDATE_in_create_trigger_stmt3351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_OF_in_create_trigger_stmt3354 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3358 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_create_trigger_stmt3361 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3365 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ON_in_create_trigger_stmt3374 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3378 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000040L,0x0000100000000000L});
    public static final BitSet FOLLOW_FOR_in_create_trigger_stmt3381 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_EACH_in_create_trigger_stmt3383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ROW_in_create_trigger_stmt3385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000100000000000L});
    public static final BitSet FOLLOW_WHEN_in_create_trigger_stmt3390 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_create_trigger_stmt3392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_BEGIN_in_create_trigger_stmt3398 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004010800000L});
    public static final BitSet FOLLOW_update_stmt_in_create_trigger_stmt3402 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_insert_stmt_in_create_trigger_stmt3406 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_delete_stmt_in_create_trigger_stmt3410 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_select_stmt_in_create_trigger_stmt3414 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMI_in_create_trigger_stmt3417 = new BitSet(new long[]{0x0000000000000000L,0x0080000408000000L,0x0000004010800000L});
    public static final BitSet FOLLOW_END_in_create_trigger_stmt3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_trigger_stmt3429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_TRIGGER_in_drop_trigger_stmt3431 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_drop_trigger_stmt3434 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_trigger_stmt3436 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_trigger_stmt3443 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_trigger_stmt3445 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_trigger_stmt3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_id3465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_column_def4179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_column_def_in_id_column_def4183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword_column_def4190 = new BitSet(new long[]{0x0000000000000002L});

}