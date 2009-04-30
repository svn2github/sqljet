// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 Sql.g 2009-04-30 15:51:19

  package org.tmatesoft.sqljet.core.internal.lang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class SqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALIAS", "COLUMN_DEFS", "COLUMN_CONSTRAINT", "NOT_NULL", "ORDERING", "RESULT_COLUMNS", "SELECT_CORE", "TABLE_CONSTRAINTS", "TABLE_CONSTRAINT", "TYPE", "TYPE_PARAMS", "EXPLAIN", "QUERY", "PLAN", "SEMI", "ID", "DOT", "INDEXED", "BY", "NOT", "OR", "AND", "LIKE", "GLOB", "REGEXP", "MATCH", "ESCAPE", "IN", "LPAREN", "COMMA", "RPAREN", "ISNULL", "NOTNULL", "IS", "NULL", "BETWEEN", "COLLATE", "DISTINCT", "ASTERISK", "CAST", "AS", "EXISTS", "CASE", "WHEN", "THEN", "ELSE", "END", "INTEGER", "FLOAT", "STRING", "BLOB", "CURRENT_TIME", "CURRENT_DATE", "CURRENT_TIMESTAMP", "SIGNED_NUMBER", "TCL_ID", "RAISE", "IGNORE", "ROLLBACK", "ABORT", "FAIL", "PRAGMA", "EQUALS", "ATTACH", "DATABASE", "DETACH", "ANALYZE", "REINDEX", "VACUUM", "REPLACE", "ASC", "DESC", "ORDER", "LIMIT", "OFFSET", "UNION", "ALL", "INTERSECT", "EXCEPT", "SELECT", "FROM", "WHERE", "GROUP", "HAVING", "NATURAL", "LEFT", "OUTER", "INNER", "CROSS", "JOIN", "ON", "USING", "INSERT", "INTO", "VALUES", "DEFAULT", "UPDATE", "SET", "DELETE", "BEGIN", "DEFERRED", "IMMEDIATE", "EXCLUSIVE", "TRANSACTION", "COMMIT", "TO", "SAVEPOINT", "RELEASE", "CONFLICT", "CREATE", "VIRTUAL", "TABLE", "TEMP", "TEMPORARY", "IF", "CONSTRAINT", "PRIMARY", "KEY", "AUTOINCREMENT", "UNIQUE", "CHECK", "FOREIGN", "REFERENCES", "CASCADE", "RESTRICT", "DEFERRABLE", "INITIALLY", "DROP", "ALTER", "RENAME", "ADD", "COLUMN", "VIEW", "INDEX", "TRIGGER", "BEFORE", "AFTER", "INSTEAD", "OF", "FOR", "EACH", "ROW", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "ALPHA", "FLOAT_EXP", "COMMENT", "LINE_COMMENT", "WS", "'=='", "'!='", "'<>'", "'<'", "'<='", "'>'", "'>='", "'<<'", "'>>'", "'&'", "'|'", "'+'", "'-'", "'/'", "'%'", "'||'", "'~'", "'?'", "':'", "'@'", "'$'"
    };
    public static final int ROW=145;
    public static final int NOT=23;
    public static final int TYPE_PARAMS=14;
    public static final int EXCEPT=82;
    public static final int EOF=-1;
    public static final int FOREIGN=125;
    public static final int SIGNED_NUMBER=58;
    public static final int TYPE=13;
    public static final int RPAREN=34;
    public static final int CREATE=113;
    public static final int USING=95;
    public static final int BEGIN=103;
    public static final int REGEXP=28;
    public static final int ANALYZE=70;
    public static final int CONFLICT=112;
    public static final int ATTACH=67;
    public static final int VIRTUAL=114;
    public static final int D=149;
    public static final int E=150;
    public static final int F=151;
    public static final int G=152;
    public static final int BLOB=54;
    public static final int A=146;
    public static final int B=147;
    public static final int ASC=74;
    public static final int C=148;
    public static final int L=157;
    public static final int M=158;
    public static final int N=159;
    public static final int TRANSACTION=107;
    public static final int KEY=121;
    public static final int O=160;
    public static final int TEMP=116;
    public static final int H=153;
    public static final int I=154;
    public static final int ELSE=49;
    public static final int J=155;
    public static final int K=156;
    public static final int U=166;
    public static final int T=165;
    public static final int W=168;
    public static final int V=167;
    public static final int Q=162;
    public static final int P=161;
    public static final int S=164;
    public static final int R=163;
    public static final int ROLLBACK=62;
    public static final int FAIL=64;
    public static final int Y=170;
    public static final int RESTRICT=128;
    public static final int X=169;
    public static final int Z=171;
    public static final int INTERSECT=81;
    public static final int GROUP=86;
    public static final int WS=176;
    public static final int PLAN=17;
    public static final int ALIAS=4;
    public static final int END=50;
    public static final int CONSTRAINT=119;
    public static final int RENAME=133;
    public static final int ALTER=132;
    public static final int ISNULL=35;
    public static final int TABLE=115;
    public static final int FLOAT=52;
    public static final int NOTNULL=36;
    public static final int ASTERISK=42;
    public static final int LPAREN=32;
    public static final int NOT_NULL=7;
    public static final int AS=44;
    public static final int THEN=48;
    public static final int OFFSET=78;
    public static final int REPLACE=73;
    public static final int LEFT=89;
    public static final int COLUMN=135;
    public static final int EXISTS=45;
    public static final int LIKE=26;
    public static final int COLLATE=40;
    public static final int ADD=134;
    public static final int INTEGER=51;
    public static final int OUTER=90;
    public static final int BY=22;
    public static final int DEFERRABLE=129;
    public static final int TO=109;
    public static final int SET=101;
    public static final int HAVING=87;
    public static final int IGNORE=61;
    public static final int SEMI=18;
    public static final int UNION=79;
    public static final int COLUMN_CONSTRAINT=6;
    public static final int FLOAT_EXP=173;
    public static final int COMMIT=108;
    public static final int DATABASE=68;
    public static final int VACUUM=72;
    public static final int DROP=131;
    public static final int DETACH=69;
    public static final int WHEN=47;
    public static final int NATURAL=88;
    public static final int BETWEEN=39;
    public static final int STRING=53;
    public static final int CAST=43;
    public static final int TABLE_CONSTRAINT=12;
    public static final int CURRENT_TIME=55;
    public static final int TRIGGER=138;
    public static final int CASE=46;
    public static final int EQUALS=66;
    public static final int CASCADE=127;
    public static final int RELEASE=111;
    public static final int EXPLAIN=15;
    public static final int ESCAPE=30;
    public static final int RESULT_COLUMNS=9;
    public static final int INSERT=96;
    public static final int SAVEPOINT=110;
    public static final int RAISE=60;
    public static final int EACH=144;
    public static final int COMMENT=174;
    public static final int ABORT=63;
    public static final int SELECT=83;
    public static final int INTO=97;
    public static final int UNIQUE=123;
    public static final int GLOB=27;
    public static final int VIEW=136;
    public static final int LINE_COMMENT=175;
    public static final int NULL=38;
    public static final int ON=94;
    public static final int MATCH=29;
    public static final int PRIMARY=120;
    public static final int DELETE=102;
    public static final int OF=142;
    public static final int ALPHA=172;
    public static final int OR=24;
    public static final int TABLE_CONSTRAINTS=11;
    public static final int QUERY=16;
    public static final int COLUMN_DEFS=5;
    public static final int CHECK=124;
    public static final int FROM=84;
    public static final int DISTINCT=41;
    public static final int TEMPORARY=117;
    public static final int CURRENT_DATE=56;
    public static final int WHERE=85;
    public static final int INNER=91;
    public static final int ORDER=76;
    public static final int LIMIT=77;
    public static final int PRAGMA=65;
    public static final int UPDATE=100;
    public static final int DEFERRED=104;
    public static final int FOR=143;
    public static final int SELECT_CORE=10;
    public static final int EXCLUSIVE=106;
    public static final int AND=25;
    public static final int ID=19;
    public static final int CROSS=92;
    public static final int IF=118;
    public static final int INDEX=137;
    public static final int T__197=197;
    public static final int IN=31;
    public static final int T__196=196;
    public static final int T__195=195;
    public static final int T__194=194;
    public static final int T__193=193;
    public static final int COMMA=33;
    public static final int T__192=192;
    public static final int REFERENCES=126;
    public static final int IS=37;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int ALL=80;
    public static final int TCL_ID=59;
    public static final int DOT=20;
    public static final int CURRENT_TIMESTAMP=57;
    public static final int INITIALLY=130;
    public static final int T__184=184;
    public static final int REINDEX=71;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__185=185;
    public static final int T__188=188;
    public static final int T__187=187;
    public static final int T__189=189;
    public static final int AUTOINCREMENT=122;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int DEFAULT=99;
    public static final int T__181=181;
    public static final int VALUES=98;
    public static final int BEFORE=139;
    public static final int AFTER=140;
    public static final int INSTEAD=141;
    public static final int JOIN=93;
    public static final int INDEXED=21;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int T__177=177;
    public static final int ORDERING=8;
    public static final int IMMEDIATE=105;
    public static final int DESC=75;

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
    public String getGrammarFileName() { return "Sql.g"; }


    public static class sql_stmt_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sql_stmt_list"
    // Sql.g:47:1: sql_stmt_list : ( sql_stmt )+ ;
    public final SqlParser.sql_stmt_list_return sql_stmt_list() throws RecognitionException {
        SqlParser.sql_stmt_list_return retval = new SqlParser.sql_stmt_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.sql_stmt_return sql_stmt1 = null;



        try {
            // Sql.g:47:14: ( ( sql_stmt )+ )
            // Sql.g:47:16: ( sql_stmt )+
            {
            root_0 = (Object)adaptor.nil();

            // Sql.g:47:16: ( sql_stmt )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==EXPLAIN||LA1_0==END||LA1_0==ROLLBACK||LA1_0==PRAGMA||LA1_0==ATTACH||(LA1_0>=DETACH && LA1_0<=REPLACE)||LA1_0==SELECT||LA1_0==INSERT||LA1_0==UPDATE||(LA1_0>=DELETE && LA1_0<=BEGIN)||LA1_0==COMMIT||(LA1_0>=SAVEPOINT && LA1_0<=RELEASE)||LA1_0==CREATE||(LA1_0>=DROP && LA1_0<=ALTER)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Sql.g:47:17: sql_stmt
            	    {
            	    pushFollow(FOLLOW_sql_stmt_in_sql_stmt_list109);
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
    // Sql.g:49:1: sql_stmt : ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI ;
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
            // Sql.g:49:9: ( ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI )
            // Sql.g:49:11: ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI
            {
            root_0 = (Object)adaptor.nil();

            // Sql.g:49:11: ( EXPLAIN ( QUERY PLAN )? )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EXPLAIN) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // Sql.g:49:12: EXPLAIN ( QUERY PLAN )?
                    {
                    EXPLAIN2=(Token)match(input,EXPLAIN,FOLLOW_EXPLAIN_in_sql_stmt119); 
                    EXPLAIN2_tree = (Object)adaptor.create(EXPLAIN2);
                    adaptor.addChild(root_0, EXPLAIN2_tree);

                    // Sql.g:49:20: ( QUERY PLAN )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==QUERY) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // Sql.g:49:21: QUERY PLAN
                            {
                            QUERY3=(Token)match(input,QUERY,FOLLOW_QUERY_in_sql_stmt122); 
                            QUERY3_tree = (Object)adaptor.create(QUERY3);
                            adaptor.addChild(root_0, QUERY3_tree);

                            PLAN4=(Token)match(input,PLAN,FOLLOW_PLAN_in_sql_stmt124); 
                            PLAN4_tree = (Object)adaptor.create(PLAN4);
                            adaptor.addChild(root_0, PLAN4_tree);


                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_sql_stmt_core_in_sql_stmt130);
            sql_stmt_core5=sql_stmt_core();

            state._fsp--;

            adaptor.addChild(root_0, sql_stmt_core5.getTree());
            SEMI6=(Token)match(input,SEMI,FOLLOW_SEMI_in_sql_stmt132); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:51:1: sql_stmt_core : ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt );
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
            // Sql.g:52:3: ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt )
            int alt4=25;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // Sql.g:52:5: pragma_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pragma_stmt_in_sql_stmt_core143);
                    pragma_stmt7=pragma_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_stmt7.getTree());

                    }
                    break;
                case 2 :
                    // Sql.g:53:5: attach_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_attach_stmt_in_sql_stmt_core149);
                    attach_stmt8=attach_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, attach_stmt8.getTree());

                    }
                    break;
                case 3 :
                    // Sql.g:54:5: detach_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_detach_stmt_in_sql_stmt_core155);
                    detach_stmt9=detach_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, detach_stmt9.getTree());

                    }
                    break;
                case 4 :
                    // Sql.g:55:5: analyze_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_analyze_stmt_in_sql_stmt_core161);
                    analyze_stmt10=analyze_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, analyze_stmt10.getTree());

                    }
                    break;
                case 5 :
                    // Sql.g:56:5: reindex_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_reindex_stmt_in_sql_stmt_core167);
                    reindex_stmt11=reindex_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, reindex_stmt11.getTree());

                    }
                    break;
                case 6 :
                    // Sql.g:57:5: vacuum_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_vacuum_stmt_in_sql_stmt_core173);
                    vacuum_stmt12=vacuum_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, vacuum_stmt12.getTree());

                    }
                    break;
                case 7 :
                    // Sql.g:59:5: select_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_select_stmt_in_sql_stmt_core182);
                    select_stmt13=select_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, select_stmt13.getTree());

                    }
                    break;
                case 8 :
                    // Sql.g:60:5: insert_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_insert_stmt_in_sql_stmt_core188);
                    insert_stmt14=insert_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, insert_stmt14.getTree());

                    }
                    break;
                case 9 :
                    // Sql.g:61:5: update_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_update_stmt_in_sql_stmt_core194);
                    update_stmt15=update_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, update_stmt15.getTree());

                    }
                    break;
                case 10 :
                    // Sql.g:62:5: delete_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_delete_stmt_in_sql_stmt_core200);
                    delete_stmt16=delete_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_stmt16.getTree());

                    }
                    break;
                case 11 :
                    // Sql.g:63:5: begin_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_begin_stmt_in_sql_stmt_core206);
                    begin_stmt17=begin_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, begin_stmt17.getTree());

                    }
                    break;
                case 12 :
                    // Sql.g:64:5: commit_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_commit_stmt_in_sql_stmt_core212);
                    commit_stmt18=commit_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, commit_stmt18.getTree());

                    }
                    break;
                case 13 :
                    // Sql.g:65:5: rollback_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_rollback_stmt_in_sql_stmt_core218);
                    rollback_stmt19=rollback_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, rollback_stmt19.getTree());

                    }
                    break;
                case 14 :
                    // Sql.g:66:5: savepoint_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_savepoint_stmt_in_sql_stmt_core224);
                    savepoint_stmt20=savepoint_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, savepoint_stmt20.getTree());

                    }
                    break;
                case 15 :
                    // Sql.g:67:5: release_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_release_stmt_in_sql_stmt_core230);
                    release_stmt21=release_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, release_stmt21.getTree());

                    }
                    break;
                case 16 :
                    // Sql.g:69:5: create_virtual_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_virtual_table_stmt_in_sql_stmt_core239);
                    create_virtual_table_stmt22=create_virtual_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_virtual_table_stmt22.getTree());

                    }
                    break;
                case 17 :
                    // Sql.g:70:5: create_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_table_stmt_in_sql_stmt_core245);
                    create_table_stmt23=create_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_table_stmt23.getTree());

                    }
                    break;
                case 18 :
                    // Sql.g:71:5: drop_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_table_stmt_in_sql_stmt_core251);
                    drop_table_stmt24=drop_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_table_stmt24.getTree());

                    }
                    break;
                case 19 :
                    // Sql.g:72:5: alter_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_alter_table_stmt_in_sql_stmt_core257);
                    alter_table_stmt25=alter_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, alter_table_stmt25.getTree());

                    }
                    break;
                case 20 :
                    // Sql.g:73:5: create_view_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_view_stmt_in_sql_stmt_core263);
                    create_view_stmt26=create_view_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_view_stmt26.getTree());

                    }
                    break;
                case 21 :
                    // Sql.g:74:5: drop_view_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_view_stmt_in_sql_stmt_core269);
                    drop_view_stmt27=drop_view_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_view_stmt27.getTree());

                    }
                    break;
                case 22 :
                    // Sql.g:75:5: create_index_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_index_stmt_in_sql_stmt_core275);
                    create_index_stmt28=create_index_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_index_stmt28.getTree());

                    }
                    break;
                case 23 :
                    // Sql.g:76:5: drop_index_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_index_stmt_in_sql_stmt_core281);
                    drop_index_stmt29=drop_index_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_index_stmt29.getTree());

                    }
                    break;
                case 24 :
                    // Sql.g:77:5: create_trigger_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_trigger_stmt_in_sql_stmt_core287);
                    create_trigger_stmt30=create_trigger_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_trigger_stmt30.getTree());

                    }
                    break;
                case 25 :
                    // Sql.g:78:5: drop_trigger_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_trigger_stmt_in_sql_stmt_core293);
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
    // Sql.g:80:1: qualified_table_name : (database_name= ID DOT )? table_name= ID ( INDEXED BY index_name= ID | NOT INDEXED )? ;
    public final SqlParser.qualified_table_name_return qualified_table_name() throws RecognitionException {
        SqlParser.qualified_table_name_return retval = new SqlParser.qualified_table_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token database_name=null;
        Token table_name=null;
        Token index_name=null;
        Token DOT32=null;
        Token INDEXED33=null;
        Token BY34=null;
        Token NOT35=null;
        Token INDEXED36=null;

        Object database_name_tree=null;
        Object table_name_tree=null;
        Object index_name_tree=null;
        Object DOT32_tree=null;
        Object INDEXED33_tree=null;
        Object BY34_tree=null;
        Object NOT35_tree=null;
        Object INDEXED36_tree=null;

        try {
            // Sql.g:80:21: ( (database_name= ID DOT )? table_name= ID ( INDEXED BY index_name= ID | NOT INDEXED )? )
            // Sql.g:80:23: (database_name= ID DOT )? table_name= ID ( INDEXED BY index_name= ID | NOT INDEXED )?
            {
            root_0 = (Object)adaptor.nil();

            // Sql.g:80:23: (database_name= ID DOT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==DOT) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // Sql.g:80:24: database_name= ID DOT
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_qualified_table_name303); 
                    database_name_tree = (Object)adaptor.create(database_name);
                    adaptor.addChild(root_0, database_name_tree);

                    DOT32=(Token)match(input,DOT,FOLLOW_DOT_in_qualified_table_name305); 
                    DOT32_tree = (Object)adaptor.create(DOT32);
                    adaptor.addChild(root_0, DOT32_tree);


                    }
                    break;

            }

            table_name=(Token)match(input,ID,FOLLOW_ID_in_qualified_table_name311); 
            table_name_tree = (Object)adaptor.create(table_name);
            adaptor.addChild(root_0, table_name_tree);

            // Sql.g:80:61: ( INDEXED BY index_name= ID | NOT INDEXED )?
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
                    // Sql.g:80:62: INDEXED BY index_name= ID
                    {
                    INDEXED33=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_qualified_table_name314); 
                    INDEXED33_tree = (Object)adaptor.create(INDEXED33);
                    adaptor.addChild(root_0, INDEXED33_tree);

                    BY34=(Token)match(input,BY,FOLLOW_BY_in_qualified_table_name316); 
                    BY34_tree = (Object)adaptor.create(BY34);
                    adaptor.addChild(root_0, BY34_tree);

                    index_name=(Token)match(input,ID,FOLLOW_ID_in_qualified_table_name320); 
                    index_name_tree = (Object)adaptor.create(index_name);
                    adaptor.addChild(root_0, index_name_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:80:89: NOT INDEXED
                    {
                    NOT35=(Token)match(input,NOT,FOLLOW_NOT_in_qualified_table_name324); 
                    NOT35_tree = (Object)adaptor.create(NOT35);
                    adaptor.addChild(root_0, NOT35_tree);

                    INDEXED36=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_qualified_table_name326); 
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
    // Sql.g:82:1: expr : or_subexpr ( OR or_subexpr )* ;
    public final SqlParser.expr_return expr() throws RecognitionException {
        SqlParser.expr_return retval = new SqlParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR38=null;
        SqlParser.or_subexpr_return or_subexpr37 = null;

        SqlParser.or_subexpr_return or_subexpr39 = null;


        Object OR38_tree=null;

        try {
            // Sql.g:82:5: ( or_subexpr ( OR or_subexpr )* )
            // Sql.g:82:7: or_subexpr ( OR or_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_or_subexpr_in_expr335);
            or_subexpr37=or_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, or_subexpr37.getTree());
            // Sql.g:82:18: ( OR or_subexpr )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==OR) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Sql.g:82:19: OR or_subexpr
            	    {
            	    OR38=(Token)match(input,OR,FOLLOW_OR_in_expr338); 
            	    OR38_tree = (Object)adaptor.create(OR38);
            	    root_0 = (Object)adaptor.becomeRoot(OR38_tree, root_0);

            	    pushFollow(FOLLOW_or_subexpr_in_expr341);
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
    // Sql.g:84:1: or_subexpr : and_subexpr ( AND and_subexpr )* ;
    public final SqlParser.or_subexpr_return or_subexpr() throws RecognitionException {
        SqlParser.or_subexpr_return retval = new SqlParser.or_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND41=null;
        SqlParser.and_subexpr_return and_subexpr40 = null;

        SqlParser.and_subexpr_return and_subexpr42 = null;


        Object AND41_tree=null;

        try {
            // Sql.g:84:11: ( and_subexpr ( AND and_subexpr )* )
            // Sql.g:84:13: and_subexpr ( AND and_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_and_subexpr_in_or_subexpr350);
            and_subexpr40=and_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, and_subexpr40.getTree());
            // Sql.g:84:25: ( AND and_subexpr )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==AND) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Sql.g:84:26: AND and_subexpr
            	    {
            	    AND41=(Token)match(input,AND,FOLLOW_AND_in_or_subexpr353); 
            	    AND41_tree = (Object)adaptor.create(AND41);
            	    root_0 = (Object)adaptor.becomeRoot(AND41_tree, root_0);

            	    pushFollow(FOLLOW_and_subexpr_in_or_subexpr356);
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
    // Sql.g:86:1: and_subexpr : ( eq_subexpr ( ( '=' | '==' | '!=' | '<>' ) eq_subexpr )* | ( NOT )? ( LIKE | GLOB | REGEXP | MATCH ) eq_subexpr ( ESCAPE eq_subexpr )? | ( NOT )? IN ( LPAREN ( select_stmt | expr ( COMMA expr )* )? RPAREN | (db_name= ID DOT )? table_name= ID ) | ( ISNULL | NOTNULL | IS NULL | IS NOT NULL ) | ( NOT )? BETWEEN eq_subexpr AND eq_subexpr );
    public final SqlParser.and_subexpr_return and_subexpr() throws RecognitionException {
        SqlParser.and_subexpr_return retval = new SqlParser.and_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token db_name=null;
        Token table_name=null;
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
        SqlParser.eq_subexpr_return eq_subexpr43 = null;

        SqlParser.eq_subexpr_return eq_subexpr45 = null;

        SqlParser.eq_subexpr_return eq_subexpr48 = null;

        SqlParser.eq_subexpr_return eq_subexpr50 = null;

        SqlParser.select_stmt_return select_stmt54 = null;

        SqlParser.expr_return expr55 = null;

        SqlParser.expr_return expr57 = null;

        SqlParser.eq_subexpr_return eq_subexpr69 = null;

        SqlParser.eq_subexpr_return eq_subexpr71 = null;


        Object db_name_tree=null;
        Object table_name_tree=null;
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
            // Sql.g:86:12: ( eq_subexpr ( ( '=' | '==' | '!=' | '<>' ) eq_subexpr )* | ( NOT )? ( LIKE | GLOB | REGEXP | MATCH ) eq_subexpr ( ESCAPE eq_subexpr )? | ( NOT )? IN ( LPAREN ( select_stmt | expr ( COMMA expr )* )? RPAREN | (db_name= ID DOT )? table_name= ID ) | ( ISNULL | NOTNULL | IS NULL | IS NOT NULL ) | ( NOT )? BETWEEN eq_subexpr AND eq_subexpr )
            int alt19=5;
            switch ( input.LA(1) ) {
            case NOT:
                {
                switch ( input.LA(2) ) {
                case BETWEEN:
                    {
                    alt19=5;
                    }
                    break;
                case LIKE:
                case GLOB:
                case REGEXP:
                case MATCH:
                    {
                    alt19=2;
                    }
                    break;
                case ID:
                case LPAREN:
                case NULL:
                case CAST:
                case EXISTS:
                case CASE:
                case INTEGER:
                case FLOAT:
                case STRING:
                case BLOB:
                case CURRENT_TIME:
                case CURRENT_DATE:
                case CURRENT_TIMESTAMP:
                case RAISE:
                case 194:
                case 195:
                case 196:
                case 197:
                    {
                    alt19=1;
                    }
                    break;
                case IN:
                    {
                    alt19=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }

                }
                break;
            case ID:
            case LPAREN:
            case NULL:
            case CAST:
            case EXISTS:
            case CASE:
            case INTEGER:
            case FLOAT:
            case STRING:
            case BLOB:
            case CURRENT_TIME:
            case CURRENT_DATE:
            case CURRENT_TIMESTAMP:
            case RAISE:
            case 188:
            case 189:
            case 193:
            case 194:
            case 195:
            case 196:
            case 197:
                {
                alt19=1;
                }
                break;
            case LIKE:
            case GLOB:
            case REGEXP:
            case MATCH:
                {
                alt19=2;
                }
                break;
            case IN:
                {
                alt19=3;
                }
                break;
            case ISNULL:
            case NOTNULL:
            case IS:
                {
                alt19=4;
                }
                break;
            case BETWEEN:
                {
                alt19=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // Sql.g:86:14: eq_subexpr ( ( '=' | '==' | '!=' | '<>' ) eq_subexpr )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr365);
                    eq_subexpr43=eq_subexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, eq_subexpr43.getTree());
                    // Sql.g:87:3: ( ( '=' | '==' | '!=' | '<>' ) eq_subexpr )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==EQUALS||(LA9_0>=177 && LA9_0<=179)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // Sql.g:87:5: ( '=' | '==' | '!=' | '<>' ) eq_subexpr
                    	    {
                    	    set44=(Token)input.LT(1);
                    	    if ( input.LA(1)==EQUALS||(input.LA(1)>=177 && input.LA(1)<=179) ) {
                    	        input.consume();
                    	        adaptor.addChild(root_0, (Object)adaptor.create(set44));
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr387);
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
                    // Sql.g:88:5: ( NOT )? ( LIKE | GLOB | REGEXP | MATCH ) eq_subexpr ( ESCAPE eq_subexpr )?
                    {
                    root_0 = (Object)adaptor.nil();

                    // Sql.g:88:5: ( NOT )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==NOT) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // Sql.g:88:6: NOT
                            {
                            NOT46=(Token)match(input,NOT,FOLLOW_NOT_in_and_subexpr396); 
                            NOT46_tree = (Object)adaptor.create(NOT46);
                            adaptor.addChild(root_0, NOT46_tree);


                            }
                            break;

                    }

                    set47=(Token)input.LT(1);
                    if ( (input.LA(1)>=LIKE && input.LA(1)<=MATCH) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set47));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr416);
                    eq_subexpr48=eq_subexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, eq_subexpr48.getTree());
                    // Sql.g:88:54: ( ESCAPE eq_subexpr )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==ESCAPE) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // Sql.g:88:55: ESCAPE eq_subexpr
                            {
                            ESCAPE49=(Token)match(input,ESCAPE,FOLLOW_ESCAPE_in_and_subexpr419); 
                            ESCAPE49_tree = (Object)adaptor.create(ESCAPE49);
                            adaptor.addChild(root_0, ESCAPE49_tree);

                            pushFollow(FOLLOW_eq_subexpr_in_and_subexpr421);
                            eq_subexpr50=eq_subexpr();

                            state._fsp--;

                            adaptor.addChild(root_0, eq_subexpr50.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // Sql.g:89:5: ( NOT )? IN ( LPAREN ( select_stmt | expr ( COMMA expr )* )? RPAREN | (db_name= ID DOT )? table_name= ID )
                    {
                    root_0 = (Object)adaptor.nil();

                    // Sql.g:89:5: ( NOT )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==NOT) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // Sql.g:89:6: NOT
                            {
                            NOT51=(Token)match(input,NOT,FOLLOW_NOT_in_and_subexpr430); 
                            NOT51_tree = (Object)adaptor.create(NOT51);
                            adaptor.addChild(root_0, NOT51_tree);


                            }
                            break;

                    }

                    IN52=(Token)match(input,IN,FOLLOW_IN_in_and_subexpr434); 
                    IN52_tree = (Object)adaptor.create(IN52);
                    adaptor.addChild(root_0, IN52_tree);

                    // Sql.g:89:15: ( LPAREN ( select_stmt | expr ( COMMA expr )* )? RPAREN | (db_name= ID DOT )? table_name= ID )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==LPAREN) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==ID) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // Sql.g:89:16: LPAREN ( select_stmt | expr ( COMMA expr )* )? RPAREN
                            {
                            LPAREN53=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_and_subexpr437); 
                            LPAREN53_tree = (Object)adaptor.create(LPAREN53);
                            adaptor.addChild(root_0, LPAREN53_tree);

                            // Sql.g:89:23: ( select_stmt | expr ( COMMA expr )* )?
                            int alt14=3;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0==SELECT) ) {
                                alt14=1;
                            }
                            else if ( (LA14_0==ID||LA14_0==NOT||(LA14_0>=LIKE && LA14_0<=MATCH)||(LA14_0>=IN && LA14_0<=LPAREN)||(LA14_0>=ISNULL && LA14_0<=BETWEEN)||LA14_0==CAST||(LA14_0>=EXISTS && LA14_0<=CASE)||(LA14_0>=INTEGER && LA14_0<=CURRENT_TIMESTAMP)||LA14_0==RAISE||(LA14_0>=188 && LA14_0<=189)||(LA14_0>=193 && LA14_0<=197)) ) {
                                alt14=2;
                            }
                            switch (alt14) {
                                case 1 :
                                    // Sql.g:89:24: select_stmt
                                    {
                                    pushFollow(FOLLOW_select_stmt_in_and_subexpr440);
                                    select_stmt54=select_stmt();

                                    state._fsp--;

                                    adaptor.addChild(root_0, select_stmt54.getTree());

                                    }
                                    break;
                                case 2 :
                                    // Sql.g:89:38: expr ( COMMA expr )*
                                    {
                                    pushFollow(FOLLOW_expr_in_and_subexpr444);
                                    expr55=expr();

                                    state._fsp--;

                                    adaptor.addChild(root_0, expr55.getTree());
                                    // Sql.g:89:43: ( COMMA expr )*
                                    loop13:
                                    do {
                                        int alt13=2;
                                        int LA13_0 = input.LA(1);

                                        if ( (LA13_0==COMMA) ) {
                                            alt13=1;
                                        }


                                        switch (alt13) {
                                    	case 1 :
                                    	    // Sql.g:89:44: COMMA expr
                                    	    {
                                    	    COMMA56=(Token)match(input,COMMA,FOLLOW_COMMA_in_and_subexpr447); 
                                    	    COMMA56_tree = (Object)adaptor.create(COMMA56);
                                    	    adaptor.addChild(root_0, COMMA56_tree);

                                    	    pushFollow(FOLLOW_expr_in_and_subexpr449);
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

                            RPAREN58=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_and_subexpr455); 
                            RPAREN58_tree = (Object)adaptor.create(RPAREN58);
                            adaptor.addChild(root_0, RPAREN58_tree);


                            }
                            break;
                        case 2 :
                            // Sql.g:89:68: (db_name= ID DOT )? table_name= ID
                            {
                            // Sql.g:89:68: (db_name= ID DOT )?
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0==ID) ) {
                                int LA15_1 = input.LA(2);

                                if ( (LA15_1==DOT) ) {
                                    alt15=1;
                                }
                            }
                            switch (alt15) {
                                case 1 :
                                    // Sql.g:89:69: db_name= ID DOT
                                    {
                                    db_name=(Token)match(input,ID,FOLLOW_ID_in_and_subexpr462); 
                                    db_name_tree = (Object)adaptor.create(db_name);
                                    adaptor.addChild(root_0, db_name_tree);

                                    DOT59=(Token)match(input,DOT,FOLLOW_DOT_in_and_subexpr464); 
                                    DOT59_tree = (Object)adaptor.create(DOT59);
                                    adaptor.addChild(root_0, DOT59_tree);


                                    }
                                    break;

                            }

                            table_name=(Token)match(input,ID,FOLLOW_ID_in_and_subexpr470); 
                            table_name_tree = (Object)adaptor.create(table_name);
                            adaptor.addChild(root_0, table_name_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // Sql.g:90:5: ( ISNULL | NOTNULL | IS NULL | IS NOT NULL )
                    {
                    root_0 = (Object)adaptor.nil();

                    // Sql.g:90:5: ( ISNULL | NOTNULL | IS NULL | IS NOT NULL )
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
                            // Sql.g:90:6: ISNULL
                            {
                            ISNULL60=(Token)match(input,ISNULL,FOLLOW_ISNULL_in_and_subexpr478); 
                            ISNULL60_tree = (Object)adaptor.create(ISNULL60);
                            adaptor.addChild(root_0, ISNULL60_tree);


                            }
                            break;
                        case 2 :
                            // Sql.g:90:15: NOTNULL
                            {
                            NOTNULL61=(Token)match(input,NOTNULL,FOLLOW_NOTNULL_in_and_subexpr482); 
                            NOTNULL61_tree = (Object)adaptor.create(NOTNULL61);
                            adaptor.addChild(root_0, NOTNULL61_tree);


                            }
                            break;
                        case 3 :
                            // Sql.g:90:25: IS NULL
                            {
                            IS62=(Token)match(input,IS,FOLLOW_IS_in_and_subexpr486); 
                            IS62_tree = (Object)adaptor.create(IS62);
                            adaptor.addChild(root_0, IS62_tree);

                            NULL63=(Token)match(input,NULL,FOLLOW_NULL_in_and_subexpr488); 
                            NULL63_tree = (Object)adaptor.create(NULL63);
                            adaptor.addChild(root_0, NULL63_tree);


                            }
                            break;
                        case 4 :
                            // Sql.g:90:88: IS NOT NULL
                            {
                            IS64=(Token)match(input,IS,FOLLOW_IS_in_and_subexpr493); 
                            IS64_tree = (Object)adaptor.create(IS64);
                            adaptor.addChild(root_0, IS64_tree);

                            NOT65=(Token)match(input,NOT,FOLLOW_NOT_in_and_subexpr495); 
                            NOT65_tree = (Object)adaptor.create(NOT65);
                            adaptor.addChild(root_0, NOT65_tree);

                            NULL66=(Token)match(input,NULL,FOLLOW_NULL_in_and_subexpr497); 
                            NULL66_tree = (Object)adaptor.create(NULL66);
                            adaptor.addChild(root_0, NULL66_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // Sql.g:91:5: ( NOT )? BETWEEN eq_subexpr AND eq_subexpr
                    {
                    root_0 = (Object)adaptor.nil();

                    // Sql.g:91:5: ( NOT )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NOT) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // Sql.g:91:6: NOT
                            {
                            NOT67=(Token)match(input,NOT,FOLLOW_NOT_in_and_subexpr505); 
                            NOT67_tree = (Object)adaptor.create(NOT67);
                            adaptor.addChild(root_0, NOT67_tree);


                            }
                            break;

                    }

                    BETWEEN68=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_and_subexpr509); 
                    BETWEEN68_tree = (Object)adaptor.create(BETWEEN68);
                    adaptor.addChild(root_0, BETWEEN68_tree);

                    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr511);
                    eq_subexpr69=eq_subexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, eq_subexpr69.getTree());
                    AND70=(Token)match(input,AND,FOLLOW_AND_in_and_subexpr513); 
                    AND70_tree = (Object)adaptor.create(AND70);
                    adaptor.addChild(root_0, AND70_tree);

                    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr515);
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
    // Sql.g:93:1: eq_subexpr : neq_subexpr ( ( '<' | '<=' | '>' | '>=' ) neq_subexpr )* ;
    public final SqlParser.eq_subexpr_return eq_subexpr() throws RecognitionException {
        SqlParser.eq_subexpr_return retval = new SqlParser.eq_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set73=null;
        SqlParser.neq_subexpr_return neq_subexpr72 = null;

        SqlParser.neq_subexpr_return neq_subexpr74 = null;


        Object set73_tree=null;

        try {
            // Sql.g:93:11: ( neq_subexpr ( ( '<' | '<=' | '>' | '>=' ) neq_subexpr )* )
            // Sql.g:93:13: neq_subexpr ( ( '<' | '<=' | '>' | '>=' ) neq_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_neq_subexpr_in_eq_subexpr522);
            neq_subexpr72=neq_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, neq_subexpr72.getTree());
            // Sql.g:93:25: ( ( '<' | '<=' | '>' | '>=' ) neq_subexpr )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=180 && LA20_0<=183)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Sql.g:93:26: ( '<' | '<=' | '>' | '>=' ) neq_subexpr
            	    {
            	    set73=(Token)input.LT(1);
            	    set73=(Token)input.LT(1);
            	    if ( (input.LA(1)>=180 && input.LA(1)<=183) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set73), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_neq_subexpr_in_eq_subexpr542);
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
    // Sql.g:95:1: neq_subexpr : bit_subexpr ( ( '<<' | '>>' | '&' | '|' ) bit_subexpr )* ;
    public final SqlParser.neq_subexpr_return neq_subexpr() throws RecognitionException {
        SqlParser.neq_subexpr_return retval = new SqlParser.neq_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set76=null;
        SqlParser.bit_subexpr_return bit_subexpr75 = null;

        SqlParser.bit_subexpr_return bit_subexpr77 = null;


        Object set76_tree=null;

        try {
            // Sql.g:95:12: ( bit_subexpr ( ( '<<' | '>>' | '&' | '|' ) bit_subexpr )* )
            // Sql.g:95:14: bit_subexpr ( ( '<<' | '>>' | '&' | '|' ) bit_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bit_subexpr_in_neq_subexpr551);
            bit_subexpr75=bit_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, bit_subexpr75.getTree());
            // Sql.g:95:26: ( ( '<<' | '>>' | '&' | '|' ) bit_subexpr )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=184 && LA21_0<=187)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Sql.g:95:27: ( '<<' | '>>' | '&' | '|' ) bit_subexpr
            	    {
            	    set76=(Token)input.LT(1);
            	    set76=(Token)input.LT(1);
            	    if ( (input.LA(1)>=184 && input.LA(1)<=187) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set76), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_bit_subexpr_in_neq_subexpr571);
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
    // Sql.g:97:1: bit_subexpr : add_subexpr ( ( '+' | '-' ) add_subexpr )* ;
    public final SqlParser.bit_subexpr_return bit_subexpr() throws RecognitionException {
        SqlParser.bit_subexpr_return retval = new SqlParser.bit_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set79=null;
        SqlParser.add_subexpr_return add_subexpr78 = null;

        SqlParser.add_subexpr_return add_subexpr80 = null;


        Object set79_tree=null;

        try {
            // Sql.g:97:12: ( add_subexpr ( ( '+' | '-' ) add_subexpr )* )
            // Sql.g:97:14: add_subexpr ( ( '+' | '-' ) add_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_subexpr_in_bit_subexpr580);
            add_subexpr78=add_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, add_subexpr78.getTree());
            // Sql.g:97:26: ( ( '+' | '-' ) add_subexpr )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=188 && LA22_0<=189)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // Sql.g:97:27: ( '+' | '-' ) add_subexpr
            	    {
            	    set79=(Token)input.LT(1);
            	    set79=(Token)input.LT(1);
            	    if ( (input.LA(1)>=188 && input.LA(1)<=189) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set79), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_add_subexpr_in_bit_subexpr592);
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
    // Sql.g:99:1: add_subexpr : mul_subexpr ( ( '*' | '/' | '%' ) mul_subexpr )* ;
    public final SqlParser.add_subexpr_return add_subexpr() throws RecognitionException {
        SqlParser.add_subexpr_return retval = new SqlParser.add_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set82=null;
        SqlParser.mul_subexpr_return mul_subexpr81 = null;

        SqlParser.mul_subexpr_return mul_subexpr83 = null;


        Object set82_tree=null;

        try {
            // Sql.g:99:12: ( mul_subexpr ( ( '*' | '/' | '%' ) mul_subexpr )* )
            // Sql.g:99:14: mul_subexpr ( ( '*' | '/' | '%' ) mul_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mul_subexpr_in_add_subexpr601);
            mul_subexpr81=mul_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, mul_subexpr81.getTree());
            // Sql.g:99:26: ( ( '*' | '/' | '%' ) mul_subexpr )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==ASTERISK||(LA23_0>=190 && LA23_0<=191)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Sql.g:99:27: ( '*' | '/' | '%' ) mul_subexpr
            	    {
            	    set82=(Token)input.LT(1);
            	    set82=(Token)input.LT(1);
            	    if ( input.LA(1)==ASTERISK||(input.LA(1)>=190 && input.LA(1)<=191) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set82), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mul_subexpr_in_add_subexpr617);
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
    // Sql.g:101:1: mul_subexpr : con_subexpr ( '||' con_subexpr )* ;
    public final SqlParser.mul_subexpr_return mul_subexpr() throws RecognitionException {
        SqlParser.mul_subexpr_return retval = new SqlParser.mul_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal85=null;
        SqlParser.con_subexpr_return con_subexpr84 = null;

        SqlParser.con_subexpr_return con_subexpr86 = null;


        Object string_literal85_tree=null;

        try {
            // Sql.g:101:12: ( con_subexpr ( '||' con_subexpr )* )
            // Sql.g:101:14: con_subexpr ( '||' con_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_con_subexpr_in_mul_subexpr626);
            con_subexpr84=con_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, con_subexpr84.getTree());
            // Sql.g:101:26: ( '||' con_subexpr )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==192) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // Sql.g:101:27: '||' con_subexpr
            	    {
            	    string_literal85=(Token)match(input,192,FOLLOW_192_in_mul_subexpr629); 
            	    string_literal85_tree = (Object)adaptor.create(string_literal85);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal85_tree, root_0);

            	    pushFollow(FOLLOW_con_subexpr_in_mul_subexpr632);
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
    // Sql.g:103:1: con_subexpr : ( '-' | '+' | '~' | NOT )? unary_subexpr ;
    public final SqlParser.con_subexpr_return con_subexpr() throws RecognitionException {
        SqlParser.con_subexpr_return retval = new SqlParser.con_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set87=null;
        SqlParser.unary_subexpr_return unary_subexpr88 = null;


        Object set87_tree=null;

        try {
            // Sql.g:103:12: ( ( '-' | '+' | '~' | NOT )? unary_subexpr )
            // Sql.g:103:14: ( '-' | '+' | '~' | NOT )? unary_subexpr
            {
            root_0 = (Object)adaptor.nil();

            // Sql.g:103:14: ( '-' | '+' | '~' | NOT )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==NOT||(LA25_0>=188 && LA25_0<=189)||LA25_0==193) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // Sql.g:
                    {
                    set87=(Token)input.LT(1);
                    if ( input.LA(1)==NOT||(input.LA(1)>=188 && input.LA(1)<=189)||input.LA(1)==193 ) {
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

            pushFollow(FOLLOW_unary_subexpr_in_con_subexpr658);
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
    // Sql.g:105:1: unary_subexpr : atom_expr ( COLLATE collation_name= ID )? ;
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
            // Sql.g:105:14: ( atom_expr ( COLLATE collation_name= ID )? )
            // Sql.g:105:16: atom_expr ( COLLATE collation_name= ID )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atom_expr_in_unary_subexpr665);
            atom_expr89=atom_expr();

            state._fsp--;

            adaptor.addChild(root_0, atom_expr89.getTree());
            // Sql.g:105:26: ( COLLATE collation_name= ID )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==COLLATE) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // Sql.g:105:27: COLLATE collation_name= ID
                    {
                    COLLATE90=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_unary_subexpr668); 
                    COLLATE90_tree = (Object)adaptor.create(COLLATE90);
                    root_0 = (Object)adaptor.becomeRoot(COLLATE90_tree, root_0);

                    collation_name=(Token)match(input,ID,FOLLOW_ID_in_unary_subexpr673); 
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
    // Sql.g:107:1: atom_expr : ( literal_value | bind_parameter | ( (database_name= ID DOT )? table_name= ID DOT )? column_name= ID | function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN | LPAREN expr RPAREN -> expr | CAST LPAREN expr AS type_name RPAREN | ( EXISTS )? LPAREN select_stmt RPAREN | CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END | raise_function );
    public final SqlParser.atom_expr_return atom_expr() throws RecognitionException {
        SqlParser.atom_expr_return retval = new SqlParser.atom_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token database_name=null;
        Token table_name=null;
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
        Object database_name_tree=null;
        Object table_name_tree=null;
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
            // Sql.g:108:3: ( literal_value | bind_parameter | ( (database_name= ID DOT )? table_name= ID DOT )? column_name= ID | function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN | LPAREN expr RPAREN -> expr | CAST LPAREN expr AS type_name RPAREN | ( EXISTS )? LPAREN select_stmt RPAREN | CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END | raise_function )
            int alt36=9;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // Sql.g:108:5: literal_value
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_value_in_atom_expr685);
                    literal_value91=literal_value();

                    state._fsp--;

                    adaptor.addChild(root_0, literal_value91.getTree());

                    }
                    break;
                case 2 :
                    // Sql.g:109:5: bind_parameter
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_bind_parameter_in_atom_expr691);
                    bind_parameter92=bind_parameter();

                    state._fsp--;

                    adaptor.addChild(root_0, bind_parameter92.getTree());

                    }
                    break;
                case 3 :
                    // Sql.g:110:5: ( (database_name= ID DOT )? table_name= ID DOT )? column_name= ID
                    {
                    root_0 = (Object)adaptor.nil();

                    // Sql.g:110:5: ( (database_name= ID DOT )? table_name= ID DOT )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==ID) ) {
                        int LA28_1 = input.LA(2);

                        if ( (LA28_1==DOT) ) {
                            alt28=1;
                        }
                    }
                    switch (alt28) {
                        case 1 :
                            // Sql.g:110:6: (database_name= ID DOT )? table_name= ID DOT
                            {
                            // Sql.g:110:6: (database_name= ID DOT )?
                            int alt27=2;
                            int LA27_0 = input.LA(1);

                            if ( (LA27_0==ID) ) {
                                int LA27_1 = input.LA(2);

                                if ( (LA27_1==DOT) ) {
                                    int LA27_2 = input.LA(3);

                                    if ( (LA27_2==ID) ) {
                                        int LA27_3 = input.LA(4);

                                        if ( (LA27_3==DOT) ) {
                                            alt27=1;
                                        }
                                    }
                                }
                            }
                            switch (alt27) {
                                case 1 :
                                    // Sql.g:110:7: database_name= ID DOT
                                    {
                                    database_name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr701); 
                                    database_name_tree = (Object)adaptor.create(database_name);
                                    adaptor.addChild(root_0, database_name_tree);

                                    DOT93=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expr703); 
                                    DOT93_tree = (Object)adaptor.create(DOT93);
                                    adaptor.addChild(root_0, DOT93_tree);


                                    }
                                    break;

                            }

                            table_name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr709); 
                            table_name_tree = (Object)adaptor.create(table_name);
                            adaptor.addChild(root_0, table_name_tree);

                            DOT94=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expr711); 
                            DOT94_tree = (Object)adaptor.create(DOT94);
                            adaptor.addChild(root_0, DOT94_tree);


                            }
                            break;

                    }

                    column_name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr717); 
                    column_name_tree = (Object)adaptor.create(column_name);
                    adaptor.addChild(root_0, column_name_tree);


                    }
                    break;
                case 4 :
                    // Sql.g:111:5: function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    function_name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr725); 
                    function_name_tree = (Object)adaptor.create(function_name);
                    adaptor.addChild(root_0, function_name_tree);

                    LPAREN95=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr727); 
                    LPAREN95_tree = (Object)adaptor.create(LPAREN95);
                    adaptor.addChild(root_0, LPAREN95_tree);

                    // Sql.g:111:29: ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )?
                    int alt31=3;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==ID||LA31_0==NOT||(LA31_0>=LIKE && LA31_0<=MATCH)||(LA31_0>=IN && LA31_0<=LPAREN)||(LA31_0>=ISNULL && LA31_0<=BETWEEN)||LA31_0==DISTINCT||LA31_0==CAST||(LA31_0>=EXISTS && LA31_0<=CASE)||(LA31_0>=INTEGER && LA31_0<=CURRENT_TIMESTAMP)||LA31_0==RAISE||(LA31_0>=188 && LA31_0<=189)||(LA31_0>=193 && LA31_0<=197)) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==ASTERISK) ) {
                        alt31=2;
                    }
                    switch (alt31) {
                        case 1 :
                            // Sql.g:111:30: ( DISTINCT )? args+= expr ( COMMA args+= expr )*
                            {
                            // Sql.g:111:30: ( DISTINCT )?
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0==DISTINCT) ) {
                                alt29=1;
                            }
                            switch (alt29) {
                                case 1 :
                                    // Sql.g:111:31: DISTINCT
                                    {
                                    DISTINCT96=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_atom_expr731); 
                                    DISTINCT96_tree = (Object)adaptor.create(DISTINCT96);
                                    adaptor.addChild(root_0, DISTINCT96_tree);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_expr_in_atom_expr737);
                            args=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, args.getTree());
                            if (list_args==null) list_args=new ArrayList();
                            list_args.add(args.getTree());

                            // Sql.g:111:53: ( COMMA args+= expr )*
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( (LA30_0==COMMA) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // Sql.g:111:54: COMMA args+= expr
                            	    {
                            	    COMMA97=(Token)match(input,COMMA,FOLLOW_COMMA_in_atom_expr740); 
                            	    COMMA97_tree = (Object)adaptor.create(COMMA97);
                            	    adaptor.addChild(root_0, COMMA97_tree);

                            	    pushFollow(FOLLOW_expr_in_atom_expr744);
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
                            // Sql.g:111:75: ASTERISK
                            {
                            ASTERISK98=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_atom_expr750); 
                            ASTERISK98_tree = (Object)adaptor.create(ASTERISK98);
                            adaptor.addChild(root_0, ASTERISK98_tree);


                            }
                            break;

                    }

                    RPAREN99=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr754); 
                    RPAREN99_tree = (Object)adaptor.create(RPAREN99);
                    adaptor.addChild(root_0, RPAREN99_tree);


                    }
                    break;
                case 5 :
                    // Sql.g:112:5: LPAREN expr RPAREN
                    {
                    LPAREN100=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr760);  
                    stream_LPAREN.add(LPAREN100);

                    pushFollow(FOLLOW_expr_in_atom_expr762);
                    expr101=expr();

                    state._fsp--;

                    stream_expr.add(expr101.getTree());
                    RPAREN102=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr764);  
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
                    // 112:24: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // Sql.g:113:5: CAST LPAREN expr AS type_name RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    CAST103=(Token)match(input,CAST,FOLLOW_CAST_in_atom_expr774); 
                    CAST103_tree = (Object)adaptor.create(CAST103);
                    adaptor.addChild(root_0, CAST103_tree);

                    LPAREN104=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr776); 
                    LPAREN104_tree = (Object)adaptor.create(LPAREN104);
                    adaptor.addChild(root_0, LPAREN104_tree);

                    pushFollow(FOLLOW_expr_in_atom_expr778);
                    expr105=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr105.getTree());
                    AS106=(Token)match(input,AS,FOLLOW_AS_in_atom_expr780); 
                    AS106_tree = (Object)adaptor.create(AS106);
                    adaptor.addChild(root_0, AS106_tree);

                    pushFollow(FOLLOW_type_name_in_atom_expr782);
                    type_name107=type_name();

                    state._fsp--;

                    adaptor.addChild(root_0, type_name107.getTree());
                    RPAREN108=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr784); 
                    RPAREN108_tree = (Object)adaptor.create(RPAREN108);
                    adaptor.addChild(root_0, RPAREN108_tree);


                    }
                    break;
                case 7 :
                    // Sql.g:114:5: ( EXISTS )? LPAREN select_stmt RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    // Sql.g:114:5: ( EXISTS )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==EXISTS) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // Sql.g:114:53: EXISTS
                            {
                            EXISTS109=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_atom_expr793); 
                            EXISTS109_tree = (Object)adaptor.create(EXISTS109);
                            adaptor.addChild(root_0, EXISTS109_tree);


                            }
                            break;

                    }

                    LPAREN110=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr797); 
                    LPAREN110_tree = (Object)adaptor.create(LPAREN110);
                    adaptor.addChild(root_0, LPAREN110_tree);

                    pushFollow(FOLLOW_select_stmt_in_atom_expr799);
                    select_stmt111=select_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, select_stmt111.getTree());
                    RPAREN112=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr801); 
                    RPAREN112_tree = (Object)adaptor.create(RPAREN112);
                    adaptor.addChild(root_0, RPAREN112_tree);


                    }
                    break;
                case 8 :
                    // Sql.g:115:5: CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END
                    {
                    root_0 = (Object)adaptor.nil();

                    CASE113=(Token)match(input,CASE,FOLLOW_CASE_in_atom_expr807); 
                    CASE113_tree = (Object)adaptor.create(CASE113);
                    adaptor.addChild(root_0, CASE113_tree);

                    // Sql.g:115:10: ( expr )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==ID||LA33_0==NOT||(LA33_0>=LIKE && LA33_0<=MATCH)||(LA33_0>=IN && LA33_0<=LPAREN)||(LA33_0>=ISNULL && LA33_0<=BETWEEN)||LA33_0==CAST||(LA33_0>=EXISTS && LA33_0<=CASE)||(LA33_0>=INTEGER && LA33_0<=CURRENT_TIMESTAMP)||LA33_0==RAISE||(LA33_0>=188 && LA33_0<=189)||(LA33_0>=193 && LA33_0<=197)) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // Sql.g:115:11: expr
                            {
                            pushFollow(FOLLOW_expr_in_atom_expr810);
                            expr114=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr114.getTree());

                            }
                            break;

                    }

                    // Sql.g:115:18: ( WHEN expr THEN expr )+
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
                    	    // Sql.g:115:19: WHEN expr THEN expr
                    	    {
                    	    WHEN115=(Token)match(input,WHEN,FOLLOW_WHEN_in_atom_expr815); 
                    	    WHEN115_tree = (Object)adaptor.create(WHEN115);
                    	    adaptor.addChild(root_0, WHEN115_tree);

                    	    pushFollow(FOLLOW_expr_in_atom_expr817);
                    	    expr116=expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expr116.getTree());
                    	    THEN117=(Token)match(input,THEN,FOLLOW_THEN_in_atom_expr819); 
                    	    THEN117_tree = (Object)adaptor.create(THEN117);
                    	    adaptor.addChild(root_0, THEN117_tree);

                    	    pushFollow(FOLLOW_expr_in_atom_expr821);
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

                    // Sql.g:115:41: ( ELSE expr )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==ELSE) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // Sql.g:115:42: ELSE expr
                            {
                            ELSE119=(Token)match(input,ELSE,FOLLOW_ELSE_in_atom_expr826); 
                            ELSE119_tree = (Object)adaptor.create(ELSE119);
                            adaptor.addChild(root_0, ELSE119_tree);

                            pushFollow(FOLLOW_expr_in_atom_expr828);
                            expr120=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr120.getTree());

                            }
                            break;

                    }

                    END121=(Token)match(input,END,FOLLOW_END_in_atom_expr832); 
                    END121_tree = (Object)adaptor.create(END121);
                    adaptor.addChild(root_0, END121_tree);


                    }
                    break;
                case 9 :
                    // Sql.g:116:5: raise_function
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_raise_function_in_atom_expr838);
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
    // Sql.g:118:1: literal_value : ( INTEGER | FLOAT | STRING | BLOB | NULL | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP );
    public final SqlParser.literal_value_return literal_value() throws RecognitionException {
        SqlParser.literal_value_return retval = new SqlParser.literal_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set123=null;

        Object set123_tree=null;

        try {
            // Sql.g:118:14: ( INTEGER | FLOAT | STRING | BLOB | NULL | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP )
            // Sql.g:
            {
            root_0 = (Object)adaptor.nil();

            set123=(Token)input.LT(1);
            if ( input.LA(1)==NULL||(input.LA(1)>=INTEGER && input.LA(1)<=CURRENT_TIMESTAMP) ) {
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
    // Sql.g:120:1: signed_number : ( INTEGER | FLOAT | SIGNED_NUMBER );
    public final SqlParser.signed_number_return signed_number() throws RecognitionException {
        SqlParser.signed_number_return retval = new SqlParser.signed_number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set124=null;

        Object set124_tree=null;

        try {
            // Sql.g:120:14: ( INTEGER | FLOAT | SIGNED_NUMBER )
            // Sql.g:
            {
            root_0 = (Object)adaptor.nil();

            set124=(Token)input.LT(1);
            if ( (input.LA(1)>=INTEGER && input.LA(1)<=FLOAT)||input.LA(1)==SIGNED_NUMBER ) {
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
    // Sql.g:122:1: bind_parameter : ( '?' | '?' number= INTEGER | ':' name= ID | '@' name= ID | '$' name= TCL_ID );
    public final SqlParser.bind_parameter_return bind_parameter() throws RecognitionException {
        SqlParser.bind_parameter_return retval = new SqlParser.bind_parameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token number=null;
        Token name=null;
        Token char_literal125=null;
        Token char_literal126=null;
        Token char_literal127=null;
        Token char_literal128=null;
        Token char_literal129=null;

        Object number_tree=null;
        Object name_tree=null;
        Object char_literal125_tree=null;
        Object char_literal126_tree=null;
        Object char_literal127_tree=null;
        Object char_literal128_tree=null;
        Object char_literal129_tree=null;

        try {
            // Sql.g:123:3: ( '?' | '?' number= INTEGER | ':' name= ID | '@' name= ID | '$' name= TCL_ID )
            int alt37=5;
            switch ( input.LA(1) ) {
            case 194:
                {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==INTEGER) ) {
                    alt37=2;
                }
                else if ( ((LA37_1>=SEMI && LA37_1<=ID)||(LA37_1>=OR && LA37_1<=AND)||LA37_1==ESCAPE||(LA37_1>=COMMA && LA37_1<=RPAREN)||LA37_1==COLLATE||LA37_1==ASTERISK||LA37_1==AS||(LA37_1>=WHEN && LA37_1<=END)||LA37_1==EQUALS||(LA37_1>=ASC && LA37_1<=LIMIT)||LA37_1==UNION||(LA37_1>=INTERSECT && LA37_1<=EXCEPT)||(LA37_1>=FROM && LA37_1<=JOIN)||LA37_1==BEGIN||(LA37_1>=177 && LA37_1<=192)) ) {
                    alt37=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
                }
                break;
            case 195:
                {
                alt37=3;
                }
                break;
            case 196:
                {
                alt37=4;
                }
                break;
            case 197:
                {
                alt37=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // Sql.g:123:5: '?'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal125=(Token)match(input,194,FOLLOW_194_in_bind_parameter898); 
                    char_literal125_tree = (Object)adaptor.create(char_literal125);
                    adaptor.addChild(root_0, char_literal125_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:124:5: '?' number= INTEGER
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal126=(Token)match(input,194,FOLLOW_194_in_bind_parameter904); 
                    char_literal126_tree = (Object)adaptor.create(char_literal126);
                    adaptor.addChild(root_0, char_literal126_tree);

                    number=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_bind_parameter908); 
                    number_tree = (Object)adaptor.create(number);
                    adaptor.addChild(root_0, number_tree);


                    }
                    break;
                case 3 :
                    // Sql.g:125:5: ':' name= ID
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal127=(Token)match(input,195,FOLLOW_195_in_bind_parameter914); 
                    char_literal127_tree = (Object)adaptor.create(char_literal127);
                    adaptor.addChild(root_0, char_literal127_tree);

                    name=(Token)match(input,ID,FOLLOW_ID_in_bind_parameter918); 
                    name_tree = (Object)adaptor.create(name);
                    adaptor.addChild(root_0, name_tree);


                    }
                    break;
                case 4 :
                    // Sql.g:126:5: '@' name= ID
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal128=(Token)match(input,196,FOLLOW_196_in_bind_parameter924); 
                    char_literal128_tree = (Object)adaptor.create(char_literal128);
                    adaptor.addChild(root_0, char_literal128_tree);

                    name=(Token)match(input,ID,FOLLOW_ID_in_bind_parameter928); 
                    name_tree = (Object)adaptor.create(name);
                    adaptor.addChild(root_0, name_tree);


                    }
                    break;
                case 5 :
                    // Sql.g:127:5: '$' name= TCL_ID
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal129=(Token)match(input,197,FOLLOW_197_in_bind_parameter934); 
                    char_literal129_tree = (Object)adaptor.create(char_literal129);
                    adaptor.addChild(root_0, char_literal129_tree);

                    name=(Token)match(input,TCL_ID,FOLLOW_TCL_ID_in_bind_parameter938); 
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
    // Sql.g:129:1: type_name : ( ID )+ ( LPAREN n1= signed_number ( COMMA n2= signed_number )? RPAREN )? -> ^( TYPE ( ID )+ ^( TYPE_PARAMS ( $n1)? ( $n2)? ) ) ;
    public final SqlParser.type_name_return type_name() throws RecognitionException {
        SqlParser.type_name_return retval = new SqlParser.type_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID130=null;
        Token LPAREN131=null;
        Token COMMA132=null;
        Token RPAREN133=null;
        SqlParser.signed_number_return n1 = null;

        SqlParser.signed_number_return n2 = null;


        Object ID130_tree=null;
        Object LPAREN131_tree=null;
        Object COMMA132_tree=null;
        Object RPAREN133_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_signed_number=new RewriteRuleSubtreeStream(adaptor,"rule signed_number");
        try {
            // Sql.g:129:10: ( ( ID )+ ( LPAREN n1= signed_number ( COMMA n2= signed_number )? RPAREN )? -> ^( TYPE ( ID )+ ^( TYPE_PARAMS ( $n1)? ( $n2)? ) ) )
            // Sql.g:129:12: ( ID )+ ( LPAREN n1= signed_number ( COMMA n2= signed_number )? RPAREN )?
            {
            // Sql.g:129:12: ( ID )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==ID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // Sql.g:129:12: ID
            	    {
            	    ID130=(Token)match(input,ID,FOLLOW_ID_in_type_name945);  
            	    stream_ID.add(ID130);


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

            // Sql.g:129:16: ( LPAREN n1= signed_number ( COMMA n2= signed_number )? RPAREN )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==LPAREN) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // Sql.g:129:17: LPAREN n1= signed_number ( COMMA n2= signed_number )? RPAREN
                    {
                    LPAREN131=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_type_name949);  
                    stream_LPAREN.add(LPAREN131);

                    pushFollow(FOLLOW_signed_number_in_type_name953);
                    n1=signed_number();

                    state._fsp--;

                    stream_signed_number.add(n1.getTree());
                    // Sql.g:129:41: ( COMMA n2= signed_number )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==COMMA) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // Sql.g:129:42: COMMA n2= signed_number
                            {
                            COMMA132=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_name956);  
                            stream_COMMA.add(COMMA132);

                            pushFollow(FOLLOW_signed_number_in_type_name960);
                            n2=signed_number();

                            state._fsp--;

                            stream_signed_number.add(n2.getTree());

                            }
                            break;

                    }

                    RPAREN133=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_type_name964);  
                    stream_RPAREN.add(RPAREN133);


                    }
                    break;

            }



            // AST REWRITE
            // elements: n1, n2, ID
            // token labels: 
            // rule labels: n1, retval, n2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_n1=new RewriteRuleSubtreeStream(adaptor,"rule n1",n1!=null?n1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_n2=new RewriteRuleSubtreeStream(adaptor,"rule n2",n2!=null?n2.tree:null);

            root_0 = (Object)adaptor.nil();
            // 129:76: -> ^( TYPE ( ID )+ ^( TYPE_PARAMS ( $n1)? ( $n2)? ) )
            {
                // Sql.g:129:79: ^( TYPE ( ID )+ ^( TYPE_PARAMS ( $n1)? ( $n2)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_1);

                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();
                // Sql.g:129:90: ^( TYPE_PARAMS ( $n1)? ( $n2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE_PARAMS, "TYPE_PARAMS"), root_2);

                // Sql.g:129:104: ( $n1)?
                if ( stream_n1.hasNext() ) {
                    adaptor.addChild(root_2, stream_n1.nextTree());

                }
                stream_n1.reset();
                // Sql.g:129:109: ( $n2)?
                if ( stream_n2.hasNext() ) {
                    adaptor.addChild(root_2, stream_n2.nextTree());

                }
                stream_n2.reset();

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
    // $ANTLR end "type_name"

    public static class raise_function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "raise_function"
    // Sql.g:131:1: raise_function : RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN ;
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
            // Sql.g:131:15: ( RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN )
            // Sql.g:131:17: RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN
            {
            root_0 = (Object)adaptor.nil();

            RAISE134=(Token)match(input,RAISE,FOLLOW_RAISE_in_raise_function994); 
            RAISE134_tree = (Object)adaptor.create(RAISE134);
            adaptor.addChild(root_0, RAISE134_tree);

            LPAREN135=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_raise_function996); 
            LPAREN135_tree = (Object)adaptor.create(LPAREN135);
            adaptor.addChild(root_0, LPAREN135_tree);

            // Sql.g:131:30: ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==IGNORE) ) {
                alt41=1;
            }
            else if ( ((LA41_0>=ROLLBACK && LA41_0<=FAIL)) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // Sql.g:131:31: IGNORE
                    {
                    IGNORE136=(Token)match(input,IGNORE,FOLLOW_IGNORE_in_raise_function999); 
                    IGNORE136_tree = (Object)adaptor.create(IGNORE136);
                    adaptor.addChild(root_0, IGNORE136_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:131:40: ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING
                    {
                    set137=(Token)input.LT(1);
                    if ( (input.LA(1)>=ROLLBACK && input.LA(1)<=FAIL) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set137));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    COMMA138=(Token)match(input,COMMA,FOLLOW_COMMA_in_raise_function1015); 
                    COMMA138_tree = (Object)adaptor.create(COMMA138);
                    adaptor.addChild(root_0, COMMA138_tree);

                    error_message=(Token)match(input,STRING,FOLLOW_STRING_in_raise_function1019); 
                    error_message_tree = (Object)adaptor.create(error_message);
                    adaptor.addChild(root_0, error_message_tree);


                    }
                    break;

            }

            RPAREN139=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_raise_function1022); 
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
    // Sql.g:134:1: pragma_stmt : PRAGMA (database_name= ID DOT )? pragma_name= ID ( EQUALS pragma_value | LPAREN pragma_value RPAREN )? ;
    public final SqlParser.pragma_stmt_return pragma_stmt() throws RecognitionException {
        SqlParser.pragma_stmt_return retval = new SqlParser.pragma_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token database_name=null;
        Token pragma_name=null;
        Token PRAGMA140=null;
        Token DOT141=null;
        Token EQUALS142=null;
        Token LPAREN144=null;
        Token RPAREN146=null;
        SqlParser.pragma_value_return pragma_value143 = null;

        SqlParser.pragma_value_return pragma_value145 = null;


        Object database_name_tree=null;
        Object pragma_name_tree=null;
        Object PRAGMA140_tree=null;
        Object DOT141_tree=null;
        Object EQUALS142_tree=null;
        Object LPAREN144_tree=null;
        Object RPAREN146_tree=null;

        try {
            // Sql.g:134:12: ( PRAGMA (database_name= ID DOT )? pragma_name= ID ( EQUALS pragma_value | LPAREN pragma_value RPAREN )? )
            // Sql.g:134:14: PRAGMA (database_name= ID DOT )? pragma_name= ID ( EQUALS pragma_value | LPAREN pragma_value RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            PRAGMA140=(Token)match(input,PRAGMA,FOLLOW_PRAGMA_in_pragma_stmt1030); 
            PRAGMA140_tree = (Object)adaptor.create(PRAGMA140);
            adaptor.addChild(root_0, PRAGMA140_tree);

            // Sql.g:134:21: (database_name= ID DOT )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==ID) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==DOT) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // Sql.g:134:22: database_name= ID DOT
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_pragma_stmt1035); 
                    database_name_tree = (Object)adaptor.create(database_name);
                    adaptor.addChild(root_0, database_name_tree);

                    DOT141=(Token)match(input,DOT,FOLLOW_DOT_in_pragma_stmt1037); 
                    DOT141_tree = (Object)adaptor.create(DOT141);
                    adaptor.addChild(root_0, DOT141_tree);


                    }
                    break;

            }

            pragma_name=(Token)match(input,ID,FOLLOW_ID_in_pragma_stmt1043); 
            pragma_name_tree = (Object)adaptor.create(pragma_name);
            adaptor.addChild(root_0, pragma_name_tree);

            // Sql.g:134:60: ( EQUALS pragma_value | LPAREN pragma_value RPAREN )?
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
                    // Sql.g:134:61: EQUALS pragma_value
                    {
                    EQUALS142=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_pragma_stmt1046); 
                    EQUALS142_tree = (Object)adaptor.create(EQUALS142);
                    adaptor.addChild(root_0, EQUALS142_tree);

                    pushFollow(FOLLOW_pragma_value_in_pragma_stmt1048);
                    pragma_value143=pragma_value();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_value143.getTree());

                    }
                    break;
                case 2 :
                    // Sql.g:134:83: LPAREN pragma_value RPAREN
                    {
                    LPAREN144=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_pragma_stmt1052); 
                    LPAREN144_tree = (Object)adaptor.create(LPAREN144);
                    adaptor.addChild(root_0, LPAREN144_tree);

                    pushFollow(FOLLOW_pragma_value_in_pragma_stmt1054);
                    pragma_value145=pragma_value();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_value145.getTree());
                    RPAREN146=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_pragma_stmt1056); 
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
    // Sql.g:136:1: pragma_value : ( signed_number | name= ID | STRING );
    public final SqlParser.pragma_value_return pragma_value() throws RecognitionException {
        SqlParser.pragma_value_return retval = new SqlParser.pragma_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token STRING148=null;
        SqlParser.signed_number_return signed_number147 = null;


        Object name_tree=null;
        Object STRING148_tree=null;

        try {
            // Sql.g:136:13: ( signed_number | name= ID | STRING )
            int alt44=3;
            switch ( input.LA(1) ) {
            case INTEGER:
            case FLOAT:
            case SIGNED_NUMBER:
                {
                alt44=1;
                }
                break;
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
                    // Sql.g:136:15: signed_number
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_signed_number_in_pragma_value1065);
                    signed_number147=signed_number();

                    state._fsp--;

                    adaptor.addChild(root_0, signed_number147.getTree());

                    }
                    break;
                case 2 :
                    // Sql.g:136:31: name= ID
                    {
                    root_0 = (Object)adaptor.nil();

                    name=(Token)match(input,ID,FOLLOW_ID_in_pragma_value1071); 
                    name_tree = (Object)adaptor.create(name);
                    adaptor.addChild(root_0, name_tree);


                    }
                    break;
                case 3 :
                    // Sql.g:136:41: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING148=(Token)match(input,STRING,FOLLOW_STRING_in_pragma_value1075); 
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
    // Sql.g:139:1: attach_stmt : ATTACH ( DATABASE )? filename= ( STRING | ID ) AS database_name= ID ;
    public final SqlParser.attach_stmt_return attach_stmt() throws RecognitionException {
        SqlParser.attach_stmt_return retval = new SqlParser.attach_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token filename=null;
        Token database_name=null;
        Token ATTACH149=null;
        Token DATABASE150=null;
        Token AS151=null;

        Object filename_tree=null;
        Object database_name_tree=null;
        Object ATTACH149_tree=null;
        Object DATABASE150_tree=null;
        Object AS151_tree=null;

        try {
            // Sql.g:139:12: ( ATTACH ( DATABASE )? filename= ( STRING | ID ) AS database_name= ID )
            // Sql.g:139:14: ATTACH ( DATABASE )? filename= ( STRING | ID ) AS database_name= ID
            {
            root_0 = (Object)adaptor.nil();

            ATTACH149=(Token)match(input,ATTACH,FOLLOW_ATTACH_in_attach_stmt1083); 
            ATTACH149_tree = (Object)adaptor.create(ATTACH149);
            adaptor.addChild(root_0, ATTACH149_tree);

            // Sql.g:139:21: ( DATABASE )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==DATABASE) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // Sql.g:139:22: DATABASE
                    {
                    DATABASE150=(Token)match(input,DATABASE,FOLLOW_DATABASE_in_attach_stmt1086); 
                    DATABASE150_tree = (Object)adaptor.create(DATABASE150);
                    adaptor.addChild(root_0, DATABASE150_tree);


                    }
                    break;

            }

            filename=(Token)input.LT(1);
            if ( input.LA(1)==ID||input.LA(1)==STRING ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(filename));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            AS151=(Token)match(input,AS,FOLLOW_AS_in_attach_stmt1100); 
            AS151_tree = (Object)adaptor.create(AS151);
            adaptor.addChild(root_0, AS151_tree);

            database_name=(Token)match(input,ID,FOLLOW_ID_in_attach_stmt1104); 
            database_name_tree = (Object)adaptor.create(database_name);
            adaptor.addChild(root_0, database_name_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:142:1: detach_stmt : DETACH ( DATABASE )? database_name= ID ;
    public final SqlParser.detach_stmt_return detach_stmt() throws RecognitionException {
        SqlParser.detach_stmt_return retval = new SqlParser.detach_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token database_name=null;
        Token DETACH152=null;
        Token DATABASE153=null;

        Object database_name_tree=null;
        Object DETACH152_tree=null;
        Object DATABASE153_tree=null;

        try {
            // Sql.g:142:12: ( DETACH ( DATABASE )? database_name= ID )
            // Sql.g:142:14: DETACH ( DATABASE )? database_name= ID
            {
            root_0 = (Object)adaptor.nil();

            DETACH152=(Token)match(input,DETACH,FOLLOW_DETACH_in_detach_stmt1112); 
            DETACH152_tree = (Object)adaptor.create(DETACH152);
            adaptor.addChild(root_0, DETACH152_tree);

            // Sql.g:142:21: ( DATABASE )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==DATABASE) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // Sql.g:142:22: DATABASE
                    {
                    DATABASE153=(Token)match(input,DATABASE,FOLLOW_DATABASE_in_detach_stmt1115); 
                    DATABASE153_tree = (Object)adaptor.create(DATABASE153);
                    adaptor.addChild(root_0, DATABASE153_tree);


                    }
                    break;

            }

            database_name=(Token)match(input,ID,FOLLOW_ID_in_detach_stmt1121); 
            database_name_tree = (Object)adaptor.create(database_name);
            adaptor.addChild(root_0, database_name_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:145:1: analyze_stmt : ANALYZE (database_or_table_name= ID | database_name= ID DOT table_name= ID )? ;
    public final SqlParser.analyze_stmt_return analyze_stmt() throws RecognitionException {
        SqlParser.analyze_stmt_return retval = new SqlParser.analyze_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token database_or_table_name=null;
        Token database_name=null;
        Token table_name=null;
        Token ANALYZE154=null;
        Token DOT155=null;

        Object database_or_table_name_tree=null;
        Object database_name_tree=null;
        Object table_name_tree=null;
        Object ANALYZE154_tree=null;
        Object DOT155_tree=null;

        try {
            // Sql.g:145:13: ( ANALYZE (database_or_table_name= ID | database_name= ID DOT table_name= ID )? )
            // Sql.g:145:15: ANALYZE (database_or_table_name= ID | database_name= ID DOT table_name= ID )?
            {
            root_0 = (Object)adaptor.nil();

            ANALYZE154=(Token)match(input,ANALYZE,FOLLOW_ANALYZE_in_analyze_stmt1129); 
            ANALYZE154_tree = (Object)adaptor.create(ANALYZE154);
            adaptor.addChild(root_0, ANALYZE154_tree);

            // Sql.g:145:23: (database_or_table_name= ID | database_name= ID DOT table_name= ID )?
            int alt47=3;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==ID) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==DOT) ) {
                    alt47=2;
                }
                else if ( (LA47_1==SEMI) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // Sql.g:145:24: database_or_table_name= ID
                    {
                    database_or_table_name=(Token)match(input,ID,FOLLOW_ID_in_analyze_stmt1134); 
                    database_or_table_name_tree = (Object)adaptor.create(database_or_table_name);
                    adaptor.addChild(root_0, database_or_table_name_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:145:52: database_name= ID DOT table_name= ID
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_analyze_stmt1140); 
                    database_name_tree = (Object)adaptor.create(database_name);
                    adaptor.addChild(root_0, database_name_tree);

                    DOT155=(Token)match(input,DOT,FOLLOW_DOT_in_analyze_stmt1142); 
                    DOT155_tree = (Object)adaptor.create(DOT155);
                    adaptor.addChild(root_0, DOT155_tree);

                    table_name=(Token)match(input,ID,FOLLOW_ID_in_analyze_stmt1146); 
                    table_name_tree = (Object)adaptor.create(table_name);
                    adaptor.addChild(root_0, table_name_tree);


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
    // Sql.g:148:1: reindex_stmt : REINDEX (database_name= ID DOT )? collation_or_table_or_index_name= ID ;
    public final SqlParser.reindex_stmt_return reindex_stmt() throws RecognitionException {
        SqlParser.reindex_stmt_return retval = new SqlParser.reindex_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token database_name=null;
        Token collation_or_table_or_index_name=null;
        Token REINDEX156=null;
        Token DOT157=null;

        Object database_name_tree=null;
        Object collation_or_table_or_index_name_tree=null;
        Object REINDEX156_tree=null;
        Object DOT157_tree=null;

        try {
            // Sql.g:148:13: ( REINDEX (database_name= ID DOT )? collation_or_table_or_index_name= ID )
            // Sql.g:148:15: REINDEX (database_name= ID DOT )? collation_or_table_or_index_name= ID
            {
            root_0 = (Object)adaptor.nil();

            REINDEX156=(Token)match(input,REINDEX,FOLLOW_REINDEX_in_reindex_stmt1156); 
            REINDEX156_tree = (Object)adaptor.create(REINDEX156);
            adaptor.addChild(root_0, REINDEX156_tree);

            // Sql.g:148:23: (database_name= ID DOT )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==ID) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==DOT) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // Sql.g:148:24: database_name= ID DOT
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_reindex_stmt1161); 
                    database_name_tree = (Object)adaptor.create(database_name);
                    adaptor.addChild(root_0, database_name_tree);

                    DOT157=(Token)match(input,DOT,FOLLOW_DOT_in_reindex_stmt1163); 
                    DOT157_tree = (Object)adaptor.create(DOT157);
                    adaptor.addChild(root_0, DOT157_tree);


                    }
                    break;

            }

            collation_or_table_or_index_name=(Token)match(input,ID,FOLLOW_ID_in_reindex_stmt1169); 
            collation_or_table_or_index_name_tree = (Object)adaptor.create(collation_or_table_or_index_name);
            adaptor.addChild(root_0, collation_or_table_or_index_name_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:151:1: vacuum_stmt : VACUUM ;
    public final SqlParser.vacuum_stmt_return vacuum_stmt() throws RecognitionException {
        SqlParser.vacuum_stmt_return retval = new SqlParser.vacuum_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VACUUM158=null;

        Object VACUUM158_tree=null;

        try {
            // Sql.g:151:12: ( VACUUM )
            // Sql.g:151:14: VACUUM
            {
            root_0 = (Object)adaptor.nil();

            VACUUM158=(Token)match(input,VACUUM,FOLLOW_VACUUM_in_vacuum_stmt1177); 
            VACUUM158_tree = (Object)adaptor.create(VACUUM158);
            adaptor.addChild(root_0, VACUUM158_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:157:1: operation_conflict_clause : OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) ;
    public final SqlParser.operation_conflict_clause_return operation_conflict_clause() throws RecognitionException {
        SqlParser.operation_conflict_clause_return retval = new SqlParser.operation_conflict_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR159=null;
        Token set160=null;

        Object OR159_tree=null;
        Object set160_tree=null;

        try {
            // Sql.g:157:26: ( OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) )
            // Sql.g:157:28: OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE )
            {
            root_0 = (Object)adaptor.nil();

            OR159=(Token)match(input,OR,FOLLOW_OR_in_operation_conflict_clause1188); 
            OR159_tree = (Object)adaptor.create(OR159);
            adaptor.addChild(root_0, OR159_tree);

            set160=(Token)input.LT(1);
            if ( (input.LA(1)>=IGNORE && input.LA(1)<=FAIL)||input.LA(1)==REPLACE ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set160));
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
    // Sql.g:159:1: ordering_term : expr ( ASC | DESC )? -> ^( ORDERING expr ( ASC )? ( DESC )? ) ;
    public final SqlParser.ordering_term_return ordering_term() throws RecognitionException {
        SqlParser.ordering_term_return retval = new SqlParser.ordering_term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASC162=null;
        Token DESC163=null;
        SqlParser.expr_return expr161 = null;


        Object ASC162_tree=null;
        Object DESC163_tree=null;
        RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");
        RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Sql.g:159:14: ( expr ( ASC | DESC )? -> ^( ORDERING expr ( ASC )? ( DESC )? ) )
            // Sql.g:159:16: expr ( ASC | DESC )?
            {
            pushFollow(FOLLOW_expr_in_ordering_term1215);
            expr161=expr();

            state._fsp--;

            stream_expr.add(expr161.getTree());
            // Sql.g:159:82: ( ASC | DESC )?
            int alt49=3;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==ASC) ) {
                alt49=1;
            }
            else if ( (LA49_0==DESC) ) {
                alt49=2;
            }
            switch (alt49) {
                case 1 :
                    // Sql.g:159:83: ASC
                    {
                    ASC162=(Token)match(input,ASC,FOLLOW_ASC_in_ordering_term1220);  
                    stream_ASC.add(ASC162);


                    }
                    break;
                case 2 :
                    // Sql.g:159:89: DESC
                    {
                    DESC163=(Token)match(input,DESC,FOLLOW_DESC_in_ordering_term1224);  
                    stream_DESC.add(DESC163);


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
            // 160:1: -> ^( ORDERING expr ( ASC )? ( DESC )? )
            {
                // Sql.g:160:4: ^( ORDERING expr ( ASC )? ( DESC )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ORDERING, "ORDERING"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                // Sql.g:160:20: ( ASC )?
                if ( stream_ASC.hasNext() ) {
                    adaptor.addChild(root_1, stream_ASC.nextNode());

                }
                stream_ASC.reset();
                // Sql.g:160:27: ( DESC )?
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
    // Sql.g:162:1: operation_limited_clause : ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? ;
    public final SqlParser.operation_limited_clause_return operation_limited_clause() throws RecognitionException {
        SqlParser.operation_limited_clause_return retval = new SqlParser.operation_limited_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token limit=null;
        Token offset=null;
        Token ORDER164=null;
        Token BY165=null;
        Token COMMA167=null;
        Token LIMIT169=null;
        Token set170=null;
        SqlParser.ordering_term_return ordering_term166 = null;

        SqlParser.ordering_term_return ordering_term168 = null;


        Object limit_tree=null;
        Object offset_tree=null;
        Object ORDER164_tree=null;
        Object BY165_tree=null;
        Object COMMA167_tree=null;
        Object LIMIT169_tree=null;
        Object set170_tree=null;

        try {
            // Sql.g:162:25: ( ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )
            // Sql.g:163:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )?
            {
            root_0 = (Object)adaptor.nil();

            // Sql.g:163:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==ORDER) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // Sql.g:163:4: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                    ORDER164=(Token)match(input,ORDER,FOLLOW_ORDER_in_operation_limited_clause1254); 
                    ORDER164_tree = (Object)adaptor.create(ORDER164);
                    adaptor.addChild(root_0, ORDER164_tree);

                    BY165=(Token)match(input,BY,FOLLOW_BY_in_operation_limited_clause1256); 
                    BY165_tree = (Object)adaptor.create(BY165);
                    adaptor.addChild(root_0, BY165_tree);

                    pushFollow(FOLLOW_ordering_term_in_operation_limited_clause1258);
                    ordering_term166=ordering_term();

                    state._fsp--;

                    adaptor.addChild(root_0, ordering_term166.getTree());
                    // Sql.g:163:27: ( COMMA ordering_term )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==COMMA) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // Sql.g:163:28: COMMA ordering_term
                    	    {
                    	    COMMA167=(Token)match(input,COMMA,FOLLOW_COMMA_in_operation_limited_clause1261); 
                    	    COMMA167_tree = (Object)adaptor.create(COMMA167);
                    	    adaptor.addChild(root_0, COMMA167_tree);

                    	    pushFollow(FOLLOW_ordering_term_in_operation_limited_clause1263);
                    	    ordering_term168=ordering_term();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, ordering_term168.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }

            LIMIT169=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_operation_limited_clause1271); 
            LIMIT169_tree = (Object)adaptor.create(LIMIT169);
            adaptor.addChild(root_0, LIMIT169_tree);

            limit=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation_limited_clause1275); 
            limit_tree = (Object)adaptor.create(limit);
            adaptor.addChild(root_0, limit_tree);

            // Sql.g:164:23: ( ( OFFSET | COMMA ) offset= INTEGER )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==COMMA||LA52_0==OFFSET) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // Sql.g:164:24: ( OFFSET | COMMA ) offset= INTEGER
                    {
                    set170=(Token)input.LT(1);
                    if ( input.LA(1)==COMMA||input.LA(1)==OFFSET ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set170));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    offset=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation_limited_clause1288); 
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
    // Sql.g:167:1: select_stmt : select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )? -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? ) ;
    public final SqlParser.select_stmt_return select_stmt() throws RecognitionException {
        SqlParser.select_stmt_return retval = new SqlParser.select_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token limit=null;
        Token offset=null;
        Token ORDER172=null;
        Token BY173=null;
        Token COMMA175=null;
        Token LIMIT177=null;
        Token OFFSET178=null;
        Token COMMA179=null;
        SqlParser.select_list_return select_list171 = null;

        SqlParser.ordering_term_return ordering_term174 = null;

        SqlParser.ordering_term_return ordering_term176 = null;


        Object limit_tree=null;
        Object offset_tree=null;
        Object ORDER172_tree=null;
        Object BY173_tree=null;
        Object COMMA175_tree=null;
        Object LIMIT177_tree=null;
        Object OFFSET178_tree=null;
        Object COMMA179_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_ORDER=new RewriteRuleTokenStream(adaptor,"token ORDER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
        RewriteRuleTokenStream stream_OFFSET=new RewriteRuleTokenStream(adaptor,"token OFFSET");
        RewriteRuleSubtreeStream stream_select_list=new RewriteRuleSubtreeStream(adaptor,"rule select_list");
        RewriteRuleSubtreeStream stream_ordering_term=new RewriteRuleSubtreeStream(adaptor,"rule ordering_term");
        try {
            // Sql.g:167:12: ( select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )? -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? ) )
            // Sql.g:167:14: select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )?
            {
            pushFollow(FOLLOW_select_list_in_select_stmt1298);
            select_list171=select_list();

            state._fsp--;

            stream_select_list.add(select_list171.getTree());
            // Sql.g:168:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==ORDER) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // Sql.g:168:4: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                    ORDER172=(Token)match(input,ORDER,FOLLOW_ORDER_in_select_stmt1303);  
                    stream_ORDER.add(ORDER172);

                    BY173=(Token)match(input,BY,FOLLOW_BY_in_select_stmt1305);  
                    stream_BY.add(BY173);

                    pushFollow(FOLLOW_ordering_term_in_select_stmt1307);
                    ordering_term174=ordering_term();

                    state._fsp--;

                    stream_ordering_term.add(ordering_term174.getTree());
                    // Sql.g:168:27: ( COMMA ordering_term )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==COMMA) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // Sql.g:168:28: COMMA ordering_term
                    	    {
                    	    COMMA175=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_stmt1310);  
                    	    stream_COMMA.add(COMMA175);

                    	    pushFollow(FOLLOW_ordering_term_in_select_stmt1312);
                    	    ordering_term176=ordering_term();

                    	    state._fsp--;

                    	    stream_ordering_term.add(ordering_term176.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);


                    }
                    break;

            }

            // Sql.g:169:3: ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==LIMIT) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // Sql.g:169:4: LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )?
                    {
                    LIMIT177=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_select_stmt1321);  
                    stream_LIMIT.add(LIMIT177);

                    limit=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt1325);  
                    stream_INTEGER.add(limit);

                    // Sql.g:169:24: ( ( OFFSET | COMMA ) offset= INTEGER )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==COMMA||LA56_0==OFFSET) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // Sql.g:169:25: ( OFFSET | COMMA ) offset= INTEGER
                            {
                            // Sql.g:169:25: ( OFFSET | COMMA )
                            int alt55=2;
                            int LA55_0 = input.LA(1);

                            if ( (LA55_0==OFFSET) ) {
                                alt55=1;
                            }
                            else if ( (LA55_0==COMMA) ) {
                                alt55=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 55, 0, input);

                                throw nvae;
                            }
                            switch (alt55) {
                                case 1 :
                                    // Sql.g:169:26: OFFSET
                                    {
                                    OFFSET178=(Token)match(input,OFFSET,FOLLOW_OFFSET_in_select_stmt1329);  
                                    stream_OFFSET.add(OFFSET178);


                                    }
                                    break;
                                case 2 :
                                    // Sql.g:169:35: COMMA
                                    {
                                    COMMA179=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_stmt1333);  
                                    stream_COMMA.add(COMMA179);


                                    }
                                    break;

                            }

                            offset=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt1338);  
                            stream_INTEGER.add(offset);


                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: select_list, offset, LIMIT, ordering_term, ORDER, limit
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
            // 170:1: -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? )
            {
                // Sql.g:170:4: ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECT, "SELECT"), root_1);

                adaptor.addChild(root_1, stream_select_list.nextTree());
                // Sql.g:171:22: ( ^( ORDER ( ordering_term )+ ) )?
                if ( stream_ordering_term.hasNext()||stream_ORDER.hasNext() ) {
                    // Sql.g:171:22: ^( ORDER ( ordering_term )+ )
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
                // Sql.g:171:47: ( ^( LIMIT $limit ( $offset)? ) )?
                if ( stream_offset.hasNext()||stream_LIMIT.hasNext()||stream_limit.hasNext() ) {
                    // Sql.g:171:47: ^( LIMIT $limit ( $offset)? )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_LIMIT.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_limit.nextNode());
                    // Sql.g:171:62: ( $offset)?
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
    // Sql.g:174:1: select_list : select_core ( select_op select_core )* ;
    public final SqlParser.select_list_return select_list() throws RecognitionException {
        SqlParser.select_list_return retval = new SqlParser.select_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.select_core_return select_core180 = null;

        SqlParser.select_op_return select_op181 = null;

        SqlParser.select_core_return select_core182 = null;



        try {
            // Sql.g:174:12: ( select_core ( select_op select_core )* )
            // Sql.g:175:3: select_core ( select_op select_core )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_select_core_in_select_list1383);
            select_core180=select_core();

            state._fsp--;

            adaptor.addChild(root_0, select_core180.getTree());
            // Sql.g:175:15: ( select_op select_core )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==UNION||(LA58_0>=INTERSECT && LA58_0<=EXCEPT)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // Sql.g:175:16: select_op select_core
            	    {
            	    pushFollow(FOLLOW_select_op_in_select_list1386);
            	    select_op181=select_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(select_op181.getTree(), root_0);
            	    pushFollow(FOLLOW_select_core_in_select_list1389);
            	    select_core182=select_core();

            	    state._fsp--;

            	    adaptor.addChild(root_0, select_core182.getTree());

            	    }
            	    break;

            	default :
            	    break loop58;
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
    // Sql.g:177:1: select_op : ( UNION ( ALL )? | INTERSECT | EXCEPT );
    public final SqlParser.select_op_return select_op() throws RecognitionException {
        SqlParser.select_op_return retval = new SqlParser.select_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNION183=null;
        Token ALL184=null;
        Token INTERSECT185=null;
        Token EXCEPT186=null;

        Object UNION183_tree=null;
        Object ALL184_tree=null;
        Object INTERSECT185_tree=null;
        Object EXCEPT186_tree=null;

        try {
            // Sql.g:177:10: ( UNION ( ALL )? | INTERSECT | EXCEPT )
            int alt60=3;
            switch ( input.LA(1) ) {
            case UNION:
                {
                alt60=1;
                }
                break;
            case INTERSECT:
                {
                alt60=2;
                }
                break;
            case EXCEPT:
                {
                alt60=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // Sql.g:177:12: UNION ( ALL )?
                    {
                    root_0 = (Object)adaptor.nil();

                    UNION183=(Token)match(input,UNION,FOLLOW_UNION_in_select_op1398); 
                    UNION183_tree = (Object)adaptor.create(UNION183);
                    root_0 = (Object)adaptor.becomeRoot(UNION183_tree, root_0);

                    // Sql.g:177:19: ( ALL )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==ALL) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // Sql.g:177:20: ALL
                            {
                            ALL184=(Token)match(input,ALL,FOLLOW_ALL_in_select_op1402); 
                            ALL184_tree = (Object)adaptor.create(ALL184);
                            adaptor.addChild(root_0, ALL184_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Sql.g:177:28: INTERSECT
                    {
                    root_0 = (Object)adaptor.nil();

                    INTERSECT185=(Token)match(input,INTERSECT,FOLLOW_INTERSECT_in_select_op1408); 
                    INTERSECT185_tree = (Object)adaptor.create(INTERSECT185);
                    adaptor.addChild(root_0, INTERSECT185_tree);


                    }
                    break;
                case 3 :
                    // Sql.g:177:40: EXCEPT
                    {
                    root_0 = (Object)adaptor.nil();

                    EXCEPT186=(Token)match(input,EXCEPT,FOLLOW_EXCEPT_in_select_op1412); 
                    EXCEPT186_tree = (Object)adaptor.create(EXCEPT186);
                    adaptor.addChild(root_0, EXCEPT186_tree);


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
    // Sql.g:179:1: select_core : SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )? -> ^( SELECT_CORE ( DISTINCT )? ^( RESULT_COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? ) ;
    public final SqlParser.select_core_return select_core() throws RecognitionException {
        SqlParser.select_core_return retval = new SqlParser.select_core_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SELECT187=null;
        Token ALL188=null;
        Token DISTINCT189=null;
        Token COMMA191=null;
        Token FROM193=null;
        Token WHERE195=null;
        Token GROUP196=null;
        Token BY197=null;
        Token COMMA199=null;
        Token HAVING201=null;
        SqlParser.expr_return where_expr = null;

        SqlParser.expr_return having_expr = null;

        SqlParser.result_column_return result_column190 = null;

        SqlParser.result_column_return result_column192 = null;

        SqlParser.join_source_return join_source194 = null;

        SqlParser.ordering_term_return ordering_term198 = null;

        SqlParser.ordering_term_return ordering_term200 = null;


        Object SELECT187_tree=null;
        Object ALL188_tree=null;
        Object DISTINCT189_tree=null;
        Object COMMA191_tree=null;
        Object FROM193_tree=null;
        Object WHERE195_tree=null;
        Object GROUP196_tree=null;
        Object BY197_tree=null;
        Object COMMA199_tree=null;
        Object HAVING201_tree=null;
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
            // Sql.g:179:12: ( SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )? -> ^( SELECT_CORE ( DISTINCT )? ^( RESULT_COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? ) )
            // Sql.g:180:3: SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )?
            {
            SELECT187=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_core1421);  
            stream_SELECT.add(SELECT187);

            // Sql.g:180:10: ( ALL | DISTINCT )?
            int alt61=3;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==ALL) ) {
                alt61=1;
            }
            else if ( (LA61_0==DISTINCT) ) {
                alt61=2;
            }
            switch (alt61) {
                case 1 :
                    // Sql.g:180:11: ALL
                    {
                    ALL188=(Token)match(input,ALL,FOLLOW_ALL_in_select_core1424);  
                    stream_ALL.add(ALL188);


                    }
                    break;
                case 2 :
                    // Sql.g:180:17: DISTINCT
                    {
                    DISTINCT189=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_select_core1428);  
                    stream_DISTINCT.add(DISTINCT189);


                    }
                    break;

            }

            pushFollow(FOLLOW_result_column_in_select_core1432);
            result_column190=result_column();

            state._fsp--;

            stream_result_column.add(result_column190.getTree());
            // Sql.g:180:42: ( COMMA result_column )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==COMMA) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // Sql.g:180:43: COMMA result_column
            	    {
            	    COMMA191=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_core1435);  
            	    stream_COMMA.add(COMMA191);

            	    pushFollow(FOLLOW_result_column_in_select_core1437);
            	    result_column192=result_column();

            	    state._fsp--;

            	    stream_result_column.add(result_column192.getTree());

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            // Sql.g:180:65: ( FROM join_source )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==FROM) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // Sql.g:180:66: FROM join_source
                    {
                    FROM193=(Token)match(input,FROM,FOLLOW_FROM_in_select_core1442);  
                    stream_FROM.add(FROM193);

                    pushFollow(FOLLOW_join_source_in_select_core1444);
                    join_source194=join_source();

                    state._fsp--;

                    stream_join_source.add(join_source194.getTree());

                    }
                    break;

            }

            // Sql.g:180:85: ( WHERE where_expr= expr )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==WHERE) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // Sql.g:180:86: WHERE where_expr= expr
                    {
                    WHERE195=(Token)match(input,WHERE,FOLLOW_WHERE_in_select_core1449);  
                    stream_WHERE.add(WHERE195);

                    pushFollow(FOLLOW_expr_in_select_core1453);
                    where_expr=expr();

                    state._fsp--;

                    stream_expr.add(where_expr.getTree());

                    }
                    break;

            }

            // Sql.g:181:3: ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==GROUP) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // Sql.g:181:5: GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )?
                    {
                    GROUP196=(Token)match(input,GROUP,FOLLOW_GROUP_in_select_core1461);  
                    stream_GROUP.add(GROUP196);

                    BY197=(Token)match(input,BY,FOLLOW_BY_in_select_core1463);  
                    stream_BY.add(BY197);

                    pushFollow(FOLLOW_ordering_term_in_select_core1465);
                    ordering_term198=ordering_term();

                    state._fsp--;

                    stream_ordering_term.add(ordering_term198.getTree());
                    // Sql.g:181:28: ( COMMA ordering_term )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==COMMA) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // Sql.g:181:29: COMMA ordering_term
                    	    {
                    	    COMMA199=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_core1468);  
                    	    stream_COMMA.add(COMMA199);

                    	    pushFollow(FOLLOW_ordering_term_in_select_core1470);
                    	    ordering_term200=ordering_term();

                    	    state._fsp--;

                    	    stream_ordering_term.add(ordering_term200.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    // Sql.g:181:51: ( HAVING having_expr= expr )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==HAVING) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // Sql.g:181:52: HAVING having_expr= expr
                            {
                            HAVING201=(Token)match(input,HAVING,FOLLOW_HAVING_in_select_core1475);  
                            stream_HAVING.add(HAVING201);

                            pushFollow(FOLLOW_expr_in_select_core1479);
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
            // elements: HAVING, join_source, result_column, GROUP, where_expr, FROM, having_expr, ordering_term, DISTINCT, WHERE
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
            // 182:1: -> ^( SELECT_CORE ( DISTINCT )? ^( RESULT_COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? )
            {
                // Sql.g:182:4: ^( SELECT_CORE ( DISTINCT )? ^( RESULT_COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECT_CORE, "SELECT_CORE"), root_1);

                // Sql.g:183:15: ( DISTINCT )?
                if ( stream_DISTINCT.hasNext() ) {
                    adaptor.addChild(root_1, stream_DISTINCT.nextNode());

                }
                stream_DISTINCT.reset();
                // Sql.g:183:27: ^( RESULT_COLUMNS ( result_column )+ )
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
                // Sql.g:183:60: ( ^( FROM join_source ) )?
                if ( stream_join_source.hasNext()||stream_FROM.hasNext() ) {
                    // Sql.g:183:60: ^( FROM join_source )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_FROM.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_join_source.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_join_source.reset();
                stream_FROM.reset();
                // Sql.g:183:81: ( ^( WHERE $where_expr) )?
                if ( stream_where_expr.hasNext()||stream_WHERE.hasNext() ) {
                    // Sql.g:183:81: ^( WHERE $where_expr)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_WHERE.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_where_expr.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_where_expr.reset();
                stream_WHERE.reset();
                // Sql.g:184:3: ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )?
                if ( stream_HAVING.hasNext()||stream_GROUP.hasNext()||stream_having_expr.hasNext()||stream_ordering_term.hasNext() ) {
                    // Sql.g:184:3: ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? )
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
                    // Sql.g:184:26: ( ^( HAVING $having_expr) )?
                    if ( stream_HAVING.hasNext()||stream_having_expr.hasNext() ) {
                        // Sql.g:184:26: ^( HAVING $having_expr)
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
                stream_having_expr.reset();
                stream_ordering_term.reset();

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
    // Sql.g:187:1: result_column : ( ASTERISK | table_name= ID DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= ID )? -> ^( ALIAS expr ( $column_alias)? ) );
    public final SqlParser.result_column_return result_column() throws RecognitionException {
        SqlParser.result_column_return retval = new SqlParser.result_column_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token table_name=null;
        Token column_alias=null;
        Token ASTERISK202=null;
        Token DOT203=null;
        Token ASTERISK204=null;
        Token AS206=null;
        SqlParser.expr_return expr205 = null;


        Object table_name_tree=null;
        Object column_alias_tree=null;
        Object ASTERISK202_tree=null;
        Object DOT203_tree=null;
        Object ASTERISK204_tree=null;
        Object AS206_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Sql.g:188:3: ( ASTERISK | table_name= ID DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= ID )? -> ^( ALIAS expr ( $column_alias)? ) )
            int alt70=3;
            switch ( input.LA(1) ) {
            case ASTERISK:
                {
                alt70=1;
                }
                break;
            case ID:
                {
                int LA70_2 = input.LA(2);

                if ( (LA70_2==DOT) ) {
                    int LA70_4 = input.LA(3);

                    if ( (LA70_4==ASTERISK) ) {
                        alt70=2;
                    }
                    else if ( (LA70_4==ID) ) {
                        alt70=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 70, 4, input);

                        throw nvae;
                    }
                }
                else if ( ((LA70_2>=SEMI && LA70_2<=ID)||(LA70_2>=OR && LA70_2<=AND)||(LA70_2>=LPAREN && LA70_2<=RPAREN)||LA70_2==COLLATE||LA70_2==ASTERISK||LA70_2==AS||LA70_2==EQUALS||(LA70_2>=ORDER && LA70_2<=LIMIT)||LA70_2==UNION||(LA70_2>=INTERSECT && LA70_2<=EXCEPT)||(LA70_2>=FROM && LA70_2<=GROUP)||(LA70_2>=177 && LA70_2<=192)) ) {
                    alt70=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 2, input);

                    throw nvae;
                }
                }
                break;
            case NOT:
            case LIKE:
            case GLOB:
            case REGEXP:
            case MATCH:
            case IN:
            case LPAREN:
            case ISNULL:
            case NOTNULL:
            case IS:
            case NULL:
            case BETWEEN:
            case CAST:
            case EXISTS:
            case CASE:
            case INTEGER:
            case FLOAT:
            case STRING:
            case BLOB:
            case CURRENT_TIME:
            case CURRENT_DATE:
            case CURRENT_TIMESTAMP:
            case RAISE:
            case 188:
            case 189:
            case 193:
            case 194:
            case 195:
            case 196:
            case 197:
                {
                alt70=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // Sql.g:188:5: ASTERISK
                    {
                    root_0 = (Object)adaptor.nil();

                    ASTERISK202=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_result_column1549); 
                    ASTERISK202_tree = (Object)adaptor.create(ASTERISK202);
                    adaptor.addChild(root_0, ASTERISK202_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:189:5: table_name= ID DOT ASTERISK
                    {
                    table_name=(Token)match(input,ID,FOLLOW_ID_in_result_column1557);  
                    stream_ID.add(table_name);

                    DOT203=(Token)match(input,DOT,FOLLOW_DOT_in_result_column1559);  
                    stream_DOT.add(DOT203);

                    ASTERISK204=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_result_column1561);  
                    stream_ASTERISK.add(ASTERISK204);



                    // AST REWRITE
                    // elements: table_name, ASTERISK
                    // token labels: table_name
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_table_name=new RewriteRuleTokenStream(adaptor,"token table_name",table_name);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 189:32: -> ^( ASTERISK $table_name)
                    {
                        // Sql.g:189:35: ^( ASTERISK $table_name)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_ASTERISK.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_table_name.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // Sql.g:190:5: expr ( ( AS )? column_alias= ID )?
                    {
                    pushFollow(FOLLOW_expr_in_result_column1576);
                    expr205=expr();

                    state._fsp--;

                    stream_expr.add(expr205.getTree());
                    // Sql.g:190:10: ( ( AS )? column_alias= ID )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==ID||LA69_0==AS) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // Sql.g:190:11: ( AS )? column_alias= ID
                            {
                            // Sql.g:190:11: ( AS )?
                            int alt68=2;
                            int LA68_0 = input.LA(1);

                            if ( (LA68_0==AS) ) {
                                alt68=1;
                            }
                            switch (alt68) {
                                case 1 :
                                    // Sql.g:190:12: AS
                                    {
                                    AS206=(Token)match(input,AS,FOLLOW_AS_in_result_column1580);  
                                    stream_AS.add(AS206);


                                    }
                                    break;

                            }

                            column_alias=(Token)match(input,ID,FOLLOW_ID_in_result_column1586);  
                            stream_ID.add(column_alias);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: expr, column_alias
                    // token labels: column_alias
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_column_alias=new RewriteRuleTokenStream(adaptor,"token column_alias",column_alias);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 190:35: -> ^( ALIAS expr ( $column_alias)? )
                    {
                        // Sql.g:190:38: ^( ALIAS expr ( $column_alias)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // Sql.g:190:51: ( $column_alias)?
                        if ( stream_column_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_column_alias.nextNode());

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
    // Sql.g:192:1: join_source : single_source ( join_op single_source ( join_constraint )? )* ;
    public final SqlParser.join_source_return join_source() throws RecognitionException {
        SqlParser.join_source_return retval = new SqlParser.join_source_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.single_source_return single_source207 = null;

        SqlParser.join_op_return join_op208 = null;

        SqlParser.single_source_return single_source209 = null;

        SqlParser.join_constraint_return join_constraint210 = null;



        try {
            // Sql.g:192:12: ( single_source ( join_op single_source ( join_constraint )? )* )
            // Sql.g:192:14: single_source ( join_op single_source ( join_constraint )? )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_single_source_in_join_source1607);
            single_source207=single_source();

            state._fsp--;

            adaptor.addChild(root_0, single_source207.getTree());
            // Sql.g:192:28: ( join_op single_source ( join_constraint )? )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==COMMA||(LA72_0>=NATURAL && LA72_0<=JOIN)) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // Sql.g:192:29: join_op single_source ( join_constraint )?
            	    {
            	    pushFollow(FOLLOW_join_op_in_join_source1610);
            	    join_op208=join_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(join_op208.getTree(), root_0);
            	    pushFollow(FOLLOW_single_source_in_join_source1613);
            	    single_source209=single_source();

            	    state._fsp--;

            	    adaptor.addChild(root_0, single_source209.getTree());
            	    // Sql.g:192:52: ( join_constraint )?
            	    int alt71=2;
            	    int LA71_0 = input.LA(1);

            	    if ( ((LA71_0>=ON && LA71_0<=USING)) ) {
            	        alt71=1;
            	    }
            	    switch (alt71) {
            	        case 1 :
            	            // Sql.g:192:53: join_constraint
            	            {
            	            pushFollow(FOLLOW_join_constraint_in_join_source1616);
            	            join_constraint210=join_constraint();

            	            state._fsp--;

            	            adaptor.addChild(root_0, join_constraint210.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
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
    // Sql.g:194:1: single_source : ( (database_name= ID DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= ID | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN );
    public final SqlParser.single_source_return single_source() throws RecognitionException {
        SqlParser.single_source_return retval = new SqlParser.single_source_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token database_name=null;
        Token table_name=null;
        Token table_alias=null;
        Token index_name=null;
        Token DOT211=null;
        Token AS212=null;
        Token INDEXED213=null;
        Token BY214=null;
        Token NOT215=null;
        Token INDEXED216=null;
        Token LPAREN217=null;
        Token RPAREN219=null;
        Token AS220=null;
        Token LPAREN221=null;
        Token RPAREN223=null;
        SqlParser.select_stmt_return select_stmt218 = null;

        SqlParser.join_source_return join_source222 = null;


        Object database_name_tree=null;
        Object table_name_tree=null;
        Object table_alias_tree=null;
        Object index_name_tree=null;
        Object DOT211_tree=null;
        Object AS212_tree=null;
        Object INDEXED213_tree=null;
        Object BY214_tree=null;
        Object NOT215_tree=null;
        Object INDEXED216_tree=null;
        Object LPAREN217_tree=null;
        Object RPAREN219_tree=null;
        Object AS220_tree=null;
        Object LPAREN221_tree=null;
        Object RPAREN223_tree=null;
        RewriteRuleTokenStream stream_INDEXED=new RewriteRuleTokenStream(adaptor,"token INDEXED");
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_select_stmt=new RewriteRuleSubtreeStream(adaptor,"rule select_stmt");
        try {
            // Sql.g:195:3: ( (database_name= ID DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= ID | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN )
            int alt79=3;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==ID) ) {
                alt79=1;
            }
            else if ( (LA79_0==LPAREN) ) {
                int LA79_2 = input.LA(2);

                if ( (LA79_2==ID||LA79_2==LPAREN) ) {
                    alt79=3;
                }
                else if ( (LA79_2==SELECT) ) {
                    alt79=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 79, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // Sql.g:195:5: (database_name= ID DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= ID | NOT INDEXED )?
                    {
                    // Sql.g:195:5: (database_name= ID DOT )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==ID) ) {
                        int LA73_1 = input.LA(2);

                        if ( (LA73_1==DOT) ) {
                            alt73=1;
                        }
                    }
                    switch (alt73) {
                        case 1 :
                            // Sql.g:195:6: database_name= ID DOT
                            {
                            database_name=(Token)match(input,ID,FOLLOW_ID_in_single_source1633);  
                            stream_ID.add(database_name);

                            DOT211=(Token)match(input,DOT,FOLLOW_DOT_in_single_source1635);  
                            stream_DOT.add(DOT211);


                            }
                            break;

                    }

                    table_name=(Token)match(input,ID,FOLLOW_ID_in_single_source1641);  
                    stream_ID.add(table_name);

                    // Sql.g:195:43: ( ( AS )? table_alias= ID )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==ID||LA75_0==AS) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // Sql.g:195:44: ( AS )? table_alias= ID
                            {
                            // Sql.g:195:44: ( AS )?
                            int alt74=2;
                            int LA74_0 = input.LA(1);

                            if ( (LA74_0==AS) ) {
                                alt74=1;
                            }
                            switch (alt74) {
                                case 1 :
                                    // Sql.g:195:45: AS
                                    {
                                    AS212=(Token)match(input,AS,FOLLOW_AS_in_single_source1645);  
                                    stream_AS.add(AS212);


                                    }
                                    break;

                            }

                            table_alias=(Token)match(input,ID,FOLLOW_ID_in_single_source1651);  
                            stream_ID.add(table_alias);


                            }
                            break;

                    }

                    // Sql.g:195:67: ( INDEXED BY index_name= ID | NOT INDEXED )?
                    int alt76=3;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==INDEXED) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==NOT) ) {
                        alt76=2;
                    }
                    switch (alt76) {
                        case 1 :
                            // Sql.g:195:68: INDEXED BY index_name= ID
                            {
                            INDEXED213=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_single_source1656);  
                            stream_INDEXED.add(INDEXED213);

                            BY214=(Token)match(input,BY,FOLLOW_BY_in_single_source1658);  
                            stream_BY.add(BY214);

                            index_name=(Token)match(input,ID,FOLLOW_ID_in_single_source1662);  
                            stream_ID.add(index_name);


                            }
                            break;
                        case 2 :
                            // Sql.g:195:95: NOT INDEXED
                            {
                            NOT215=(Token)match(input,NOT,FOLLOW_NOT_in_single_source1666);  
                            stream_NOT.add(NOT215);

                            INDEXED216=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_single_source1668);  
                            stream_INDEXED.add(INDEXED216);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: database_name, index_name, NOT, INDEXED, table_alias, table_name
                    // token labels: index_name, database_name, table_name, table_alias
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_index_name=new RewriteRuleTokenStream(adaptor,"token index_name",index_name);
                    RewriteRuleTokenStream stream_database_name=new RewriteRuleTokenStream(adaptor,"token database_name",database_name);
                    RewriteRuleTokenStream stream_table_name=new RewriteRuleTokenStream(adaptor,"token table_name",table_name);
                    RewriteRuleTokenStream stream_table_alias=new RewriteRuleTokenStream(adaptor,"token table_alias",table_alias);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 196:3: -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? )
                    {
                        // Sql.g:196:6: ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        // Sql.g:196:14: ^( $table_name ( $database_name)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                        // Sql.g:196:28: ( $database_name)?
                        if ( stream_database_name.hasNext() ) {
                            adaptor.addChild(root_2, stream_database_name.nextNode());

                        }
                        stream_database_name.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // Sql.g:196:45: ( $table_alias)?
                        if ( stream_table_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_table_alias.nextNode());

                        }
                        stream_table_alias.reset();
                        // Sql.g:196:59: ( ^( INDEXED ( NOT )? ( $index_name)? ) )?
                        if ( stream_index_name.hasNext()||stream_NOT.hasNext()||stream_INDEXED.hasNext() ) {
                            // Sql.g:196:59: ^( INDEXED ( NOT )? ( $index_name)? )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(stream_INDEXED.nextNode(), root_2);

                            // Sql.g:196:69: ( NOT )?
                            if ( stream_NOT.hasNext() ) {
                                adaptor.addChild(root_2, stream_NOT.nextNode());

                            }
                            stream_NOT.reset();
                            // Sql.g:196:74: ( $index_name)?
                            if ( stream_index_name.hasNext() ) {
                                adaptor.addChild(root_2, stream_index_name.nextNode());

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
                    // Sql.g:197:5: LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )?
                    {
                    LPAREN217=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_single_source1709);  
                    stream_LPAREN.add(LPAREN217);

                    pushFollow(FOLLOW_select_stmt_in_single_source1711);
                    select_stmt218=select_stmt();

                    state._fsp--;

                    stream_select_stmt.add(select_stmt218.getTree());
                    RPAREN219=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_single_source1713);  
                    stream_RPAREN.add(RPAREN219);

                    // Sql.g:197:31: ( ( AS )? table_alias= ID )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==ID||LA78_0==AS) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // Sql.g:197:32: ( AS )? table_alias= ID
                            {
                            // Sql.g:197:32: ( AS )?
                            int alt77=2;
                            int LA77_0 = input.LA(1);

                            if ( (LA77_0==AS) ) {
                                alt77=1;
                            }
                            switch (alt77) {
                                case 1 :
                                    // Sql.g:197:33: AS
                                    {
                                    AS220=(Token)match(input,AS,FOLLOW_AS_in_single_source1717);  
                                    stream_AS.add(AS220);


                                    }
                                    break;

                            }

                            table_alias=(Token)match(input,ID,FOLLOW_ID_in_single_source1723);  
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
                    // 198:3: -> ^( ALIAS select_stmt ( $table_alias)? )
                    {
                        // Sql.g:198:6: ^( ALIAS select_stmt ( $table_alias)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        adaptor.addChild(root_1, stream_select_stmt.nextTree());
                        // Sql.g:198:26: ( $table_alias)?
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
                    // Sql.g:199:5: LPAREN join_source RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN221=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_single_source1745); 
                    pushFollow(FOLLOW_join_source_in_single_source1748);
                    join_source222=join_source();

                    state._fsp--;

                    adaptor.addChild(root_0, join_source222.getTree());
                    RPAREN223=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_single_source1750); 

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
    // Sql.g:201:1: join_op : ( COMMA | ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN );
    public final SqlParser.join_op_return join_op() throws RecognitionException {
        SqlParser.join_op_return retval = new SqlParser.join_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA224=null;
        Token NATURAL225=null;
        Token LEFT226=null;
        Token OUTER227=null;
        Token INNER228=null;
        Token CROSS229=null;
        Token JOIN230=null;

        Object COMMA224_tree=null;
        Object NATURAL225_tree=null;
        Object LEFT226_tree=null;
        Object OUTER227_tree=null;
        Object INNER228_tree=null;
        Object CROSS229_tree=null;
        Object JOIN230_tree=null;

        try {
            // Sql.g:202:3: ( COMMA | ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==COMMA) ) {
                alt84=1;
            }
            else if ( ((LA84_0>=NATURAL && LA84_0<=JOIN)) ) {
                alt84=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // Sql.g:202:5: COMMA
                    {
                    root_0 = (Object)adaptor.nil();

                    COMMA224=(Token)match(input,COMMA,FOLLOW_COMMA_in_join_op1761); 
                    COMMA224_tree = (Object)adaptor.create(COMMA224);
                    adaptor.addChild(root_0, COMMA224_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:203:5: ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN
                    {
                    root_0 = (Object)adaptor.nil();

                    // Sql.g:203:5: ( NATURAL )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==NATURAL) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // Sql.g:203:6: NATURAL
                            {
                            NATURAL225=(Token)match(input,NATURAL,FOLLOW_NATURAL_in_join_op1768); 
                            NATURAL225_tree = (Object)adaptor.create(NATURAL225);
                            adaptor.addChild(root_0, NATURAL225_tree);


                            }
                            break;

                    }

                    // Sql.g:203:16: ( ( LEFT )? ( OUTER )? | INNER | CROSS )
                    int alt83=3;
                    switch ( input.LA(1) ) {
                    case LEFT:
                    case OUTER:
                    case JOIN:
                        {
                        alt83=1;
                        }
                        break;
                    case INNER:
                        {
                        alt83=2;
                        }
                        break;
                    case CROSS:
                        {
                        alt83=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 83, 0, input);

                        throw nvae;
                    }

                    switch (alt83) {
                        case 1 :
                            // Sql.g:203:17: ( LEFT )? ( OUTER )?
                            {
                            // Sql.g:203:17: ( LEFT )?
                            int alt81=2;
                            int LA81_0 = input.LA(1);

                            if ( (LA81_0==LEFT) ) {
                                alt81=1;
                            }
                            switch (alt81) {
                                case 1 :
                                    // Sql.g:203:18: LEFT
                                    {
                                    LEFT226=(Token)match(input,LEFT,FOLLOW_LEFT_in_join_op1774); 
                                    LEFT226_tree = (Object)adaptor.create(LEFT226);
                                    adaptor.addChild(root_0, LEFT226_tree);


                                    }
                                    break;

                            }

                            // Sql.g:203:25: ( OUTER )?
                            int alt82=2;
                            int LA82_0 = input.LA(1);

                            if ( (LA82_0==OUTER) ) {
                                alt82=1;
                            }
                            switch (alt82) {
                                case 1 :
                                    // Sql.g:203:26: OUTER
                                    {
                                    OUTER227=(Token)match(input,OUTER,FOLLOW_OUTER_in_join_op1779); 
                                    OUTER227_tree = (Object)adaptor.create(OUTER227);
                                    adaptor.addChild(root_0, OUTER227_tree);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // Sql.g:203:36: INNER
                            {
                            INNER228=(Token)match(input,INNER,FOLLOW_INNER_in_join_op1785); 
                            INNER228_tree = (Object)adaptor.create(INNER228);
                            adaptor.addChild(root_0, INNER228_tree);


                            }
                            break;
                        case 3 :
                            // Sql.g:203:44: CROSS
                            {
                            CROSS229=(Token)match(input,CROSS,FOLLOW_CROSS_in_join_op1789); 
                            CROSS229_tree = (Object)adaptor.create(CROSS229);
                            adaptor.addChild(root_0, CROSS229_tree);


                            }
                            break;

                    }

                    JOIN230=(Token)match(input,JOIN,FOLLOW_JOIN_in_join_op1792); 
                    JOIN230_tree = (Object)adaptor.create(JOIN230);
                    root_0 = (Object)adaptor.becomeRoot(JOIN230_tree, root_0);


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
    // Sql.g:205:1: join_constraint : ( ON expr | USING LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN -> ^( USING ( $column_names)+ ) );
    public final SqlParser.join_constraint_return join_constraint() throws RecognitionException {
        SqlParser.join_constraint_return retval = new SqlParser.join_constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ON231=null;
        Token USING233=null;
        Token LPAREN234=null;
        Token COMMA235=null;
        Token RPAREN236=null;
        Token column_names=null;
        List list_column_names=null;
        SqlParser.expr_return expr232 = null;


        Object ON231_tree=null;
        Object USING233_tree=null;
        Object LPAREN234_tree=null;
        Object COMMA235_tree=null;
        Object RPAREN236_tree=null;
        Object column_names_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");

        try {
            // Sql.g:206:3: ( ON expr | USING LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN -> ^( USING ( $column_names)+ ) )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==ON) ) {
                alt86=1;
            }
            else if ( (LA86_0==USING) ) {
                alt86=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // Sql.g:206:5: ON expr
                    {
                    root_0 = (Object)adaptor.nil();

                    ON231=(Token)match(input,ON,FOLLOW_ON_in_join_constraint1803); 
                    ON231_tree = (Object)adaptor.create(ON231);
                    root_0 = (Object)adaptor.becomeRoot(ON231_tree, root_0);

                    pushFollow(FOLLOW_expr_in_join_constraint1806);
                    expr232=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr232.getTree());

                    }
                    break;
                case 2 :
                    // Sql.g:207:5: USING LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN
                    {
                    USING233=(Token)match(input,USING,FOLLOW_USING_in_join_constraint1812);  
                    stream_USING.add(USING233);

                    LPAREN234=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_join_constraint1814);  
                    stream_LPAREN.add(LPAREN234);

                    column_names=(Token)match(input,ID,FOLLOW_ID_in_join_constraint1818);  
                    stream_ID.add(column_names);

                    if (list_column_names==null) list_column_names=new ArrayList();
                    list_column_names.add(column_names);

                    // Sql.g:207:35: ( COMMA column_names+= ID )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==COMMA) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // Sql.g:207:36: COMMA column_names+= ID
                    	    {
                    	    COMMA235=(Token)match(input,COMMA,FOLLOW_COMMA_in_join_constraint1821);  
                    	    stream_COMMA.add(COMMA235);

                    	    column_names=(Token)match(input,ID,FOLLOW_ID_in_join_constraint1825);  
                    	    stream_ID.add(column_names);

                    	    if (list_column_names==null) list_column_names=new ArrayList();
                    	    list_column_names.add(column_names);


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);

                    RPAREN236=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_join_constraint1829);  
                    stream_RPAREN.add(RPAREN236);



                    // AST REWRITE
                    // elements: USING, column_names
                    // token labels: 
                    // rule labels: retval
                    // token list labels: column_names
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_column_names=new RewriteRuleTokenStream(adaptor,"token column_names", list_column_names);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 207:68: -> ^( USING ( $column_names)+ )
                    {
                        // Sql.g:207:71: ^( USING ( $column_names)+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_USING.nextNode(), root_1);

                        if ( !(stream_column_names.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_column_names.hasNext() ) {
                            adaptor.addChild(root_1, stream_column_names.nextNode());

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
    // Sql.g:210:1: insert_stmt : ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= ID DOT )? table_name= ID ( ( LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES ) ;
    public final SqlParser.insert_stmt_return insert_stmt() throws RecognitionException {
        SqlParser.insert_stmt_return retval = new SqlParser.insert_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token database_name=null;
        Token table_name=null;
        Token INSERT237=null;
        Token REPLACE239=null;
        Token INTO240=null;
        Token DOT241=null;
        Token LPAREN242=null;
        Token COMMA243=null;
        Token RPAREN244=null;
        Token VALUES245=null;
        Token LPAREN246=null;
        Token COMMA247=null;
        Token RPAREN248=null;
        Token DEFAULT250=null;
        Token VALUES251=null;
        Token column_names=null;
        List list_column_names=null;
        List list_values=null;
        SqlParser.operation_conflict_clause_return operation_conflict_clause238 = null;

        SqlParser.select_stmt_return select_stmt249 = null;

        SqlParser.expr_return values = null;
         values = null;
        Object database_name_tree=null;
        Object table_name_tree=null;
        Object INSERT237_tree=null;
        Object REPLACE239_tree=null;
        Object INTO240_tree=null;
        Object DOT241_tree=null;
        Object LPAREN242_tree=null;
        Object COMMA243_tree=null;
        Object RPAREN244_tree=null;
        Object VALUES245_tree=null;
        Object LPAREN246_tree=null;
        Object COMMA247_tree=null;
        Object RPAREN248_tree=null;
        Object DEFAULT250_tree=null;
        Object VALUES251_tree=null;
        Object column_names_tree=null;

        try {
            // Sql.g:210:12: ( ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= ID DOT )? table_name= ID ( ( LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES ) )
            // Sql.g:210:14: ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= ID DOT )? table_name= ID ( ( LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES )
            {
            root_0 = (Object)adaptor.nil();

            // Sql.g:210:14: ( INSERT ( operation_conflict_clause )? | REPLACE )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==INSERT) ) {
                alt88=1;
            }
            else if ( (LA88_0==REPLACE) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // Sql.g:210:15: INSERT ( operation_conflict_clause )?
                    {
                    INSERT237=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_stmt1848); 
                    INSERT237_tree = (Object)adaptor.create(INSERT237);
                    adaptor.addChild(root_0, INSERT237_tree);

                    // Sql.g:210:22: ( operation_conflict_clause )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==OR) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // Sql.g:210:23: operation_conflict_clause
                            {
                            pushFollow(FOLLOW_operation_conflict_clause_in_insert_stmt1851);
                            operation_conflict_clause238=operation_conflict_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, operation_conflict_clause238.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Sql.g:210:53: REPLACE
                    {
                    REPLACE239=(Token)match(input,REPLACE,FOLLOW_REPLACE_in_insert_stmt1857); 
                    REPLACE239_tree = (Object)adaptor.create(REPLACE239);
                    adaptor.addChild(root_0, REPLACE239_tree);


                    }
                    break;

            }

            INTO240=(Token)match(input,INTO,FOLLOW_INTO_in_insert_stmt1860); 
            INTO240_tree = (Object)adaptor.create(INTO240);
            adaptor.addChild(root_0, INTO240_tree);

            // Sql.g:210:67: (database_name= ID DOT )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==ID) ) {
                int LA89_1 = input.LA(2);

                if ( (LA89_1==DOT) ) {
                    alt89=1;
                }
            }
            switch (alt89) {
                case 1 :
                    // Sql.g:210:68: database_name= ID DOT
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_insert_stmt1865); 
                    database_name_tree = (Object)adaptor.create(database_name);
                    adaptor.addChild(root_0, database_name_tree);

                    DOT241=(Token)match(input,DOT,FOLLOW_DOT_in_insert_stmt1867); 
                    DOT241_tree = (Object)adaptor.create(DOT241);
                    adaptor.addChild(root_0, DOT241_tree);


                    }
                    break;

            }

            table_name=(Token)match(input,ID,FOLLOW_ID_in_insert_stmt1873); 
            table_name_tree = (Object)adaptor.create(table_name);
            adaptor.addChild(root_0, table_name_tree);

            // Sql.g:211:3: ( ( LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==LPAREN||LA94_0==SELECT||LA94_0==VALUES) ) {
                alt94=1;
            }
            else if ( (LA94_0==DEFAULT) ) {
                alt94=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // Sql.g:211:5: ( LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt )
                    {
                    // Sql.g:211:5: ( LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==LPAREN) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // Sql.g:211:6: LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN
                            {
                            LPAREN242=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt1880); 
                            LPAREN242_tree = (Object)adaptor.create(LPAREN242);
                            adaptor.addChild(root_0, LPAREN242_tree);

                            column_names=(Token)match(input,ID,FOLLOW_ID_in_insert_stmt1884); 
                            column_names_tree = (Object)adaptor.create(column_names);
                            adaptor.addChild(root_0, column_names_tree);

                            if (list_column_names==null) list_column_names=new ArrayList();
                            list_column_names.add(column_names);

                            // Sql.g:211:30: ( COMMA column_names+= ID )*
                            loop90:
                            do {
                                int alt90=2;
                                int LA90_0 = input.LA(1);

                                if ( (LA90_0==COMMA) ) {
                                    alt90=1;
                                }


                                switch (alt90) {
                            	case 1 :
                            	    // Sql.g:211:31: COMMA column_names+= ID
                            	    {
                            	    COMMA243=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt1887); 
                            	    COMMA243_tree = (Object)adaptor.create(COMMA243);
                            	    adaptor.addChild(root_0, COMMA243_tree);

                            	    column_names=(Token)match(input,ID,FOLLOW_ID_in_insert_stmt1891); 
                            	    column_names_tree = (Object)adaptor.create(column_names);
                            	    adaptor.addChild(root_0, column_names_tree);

                            	    if (list_column_names==null) list_column_names=new ArrayList();
                            	    list_column_names.add(column_names);


                            	    }
                            	    break;

                            	default :
                            	    break loop90;
                                }
                            } while (true);

                            RPAREN244=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt1895); 
                            RPAREN244_tree = (Object)adaptor.create(RPAREN244);
                            adaptor.addChild(root_0, RPAREN244_tree);


                            }
                            break;

                    }

                    // Sql.g:212:5: ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt )
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==VALUES) ) {
                        alt93=1;
                    }
                    else if ( (LA93_0==SELECT) ) {
                        alt93=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 93, 0, input);

                        throw nvae;
                    }
                    switch (alt93) {
                        case 1 :
                            // Sql.g:212:6: VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN
                            {
                            VALUES245=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt1904); 
                            VALUES245_tree = (Object)adaptor.create(VALUES245);
                            adaptor.addChild(root_0, VALUES245_tree);

                            LPAREN246=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt1906); 
                            LPAREN246_tree = (Object)adaptor.create(LPAREN246);
                            adaptor.addChild(root_0, LPAREN246_tree);

                            pushFollow(FOLLOW_expr_in_insert_stmt1910);
                            values=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, values.getTree());
                            if (list_values==null) list_values=new ArrayList();
                            list_values.add(values.getTree());

                            // Sql.g:212:33: ( COMMA values+= expr )*
                            loop92:
                            do {
                                int alt92=2;
                                int LA92_0 = input.LA(1);

                                if ( (LA92_0==COMMA) ) {
                                    alt92=1;
                                }


                                switch (alt92) {
                            	case 1 :
                            	    // Sql.g:212:34: COMMA values+= expr
                            	    {
                            	    COMMA247=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt1913); 
                            	    COMMA247_tree = (Object)adaptor.create(COMMA247);
                            	    adaptor.addChild(root_0, COMMA247_tree);

                            	    pushFollow(FOLLOW_expr_in_insert_stmt1917);
                            	    values=expr();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, values.getTree());
                            	    if (list_values==null) list_values=new ArrayList();
                            	    list_values.add(values.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop92;
                                }
                            } while (true);

                            RPAREN248=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt1921); 
                            RPAREN248_tree = (Object)adaptor.create(RPAREN248);
                            adaptor.addChild(root_0, RPAREN248_tree);


                            }
                            break;
                        case 2 :
                            // Sql.g:212:64: select_stmt
                            {
                            pushFollow(FOLLOW_select_stmt_in_insert_stmt1925);
                            select_stmt249=select_stmt();

                            state._fsp--;

                            adaptor.addChild(root_0, select_stmt249.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Sql.g:213:5: DEFAULT VALUES
                    {
                    DEFAULT250=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_insert_stmt1932); 
                    DEFAULT250_tree = (Object)adaptor.create(DEFAULT250);
                    adaptor.addChild(root_0, DEFAULT250_tree);

                    VALUES251=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt1934); 
                    VALUES251_tree = (Object)adaptor.create(VALUES251);
                    adaptor.addChild(root_0, VALUES251_tree);


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
    // Sql.g:216:1: update_stmt : UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )? ;
    public final SqlParser.update_stmt_return update_stmt() throws RecognitionException {
        SqlParser.update_stmt_return retval = new SqlParser.update_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UPDATE252=null;
        Token SET255=null;
        Token COMMA256=null;
        Token WHERE257=null;
        List list_values=null;
        SqlParser.operation_conflict_clause_return operation_conflict_clause253 = null;

        SqlParser.qualified_table_name_return qualified_table_name254 = null;

        SqlParser.expr_return expr258 = null;

        SqlParser.operation_limited_clause_return operation_limited_clause259 = null;

        SqlParser.update_set_return values = null;
         values = null;
        Object UPDATE252_tree=null;
        Object SET255_tree=null;
        Object COMMA256_tree=null;
        Object WHERE257_tree=null;

        try {
            // Sql.g:216:12: ( UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )? )
            // Sql.g:216:14: UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )?
            {
            root_0 = (Object)adaptor.nil();

            UPDATE252=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_update_stmt1944); 
            UPDATE252_tree = (Object)adaptor.create(UPDATE252);
            adaptor.addChild(root_0, UPDATE252_tree);

            // Sql.g:216:21: ( operation_conflict_clause )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==OR) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // Sql.g:216:22: operation_conflict_clause
                    {
                    pushFollow(FOLLOW_operation_conflict_clause_in_update_stmt1947);
                    operation_conflict_clause253=operation_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_conflict_clause253.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_qualified_table_name_in_update_stmt1951);
            qualified_table_name254=qualified_table_name();

            state._fsp--;

            adaptor.addChild(root_0, qualified_table_name254.getTree());
            SET255=(Token)match(input,SET,FOLLOW_SET_in_update_stmt1955); 
            SET255_tree = (Object)adaptor.create(SET255);
            adaptor.addChild(root_0, SET255_tree);

            pushFollow(FOLLOW_update_set_in_update_stmt1959);
            values=update_set();

            state._fsp--;

            adaptor.addChild(root_0, values.getTree());
            if (list_values==null) list_values=new ArrayList();
            list_values.add(values.getTree());

            // Sql.g:217:26: ( COMMA values+= update_set )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==COMMA) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // Sql.g:217:27: COMMA values+= update_set
            	    {
            	    COMMA256=(Token)match(input,COMMA,FOLLOW_COMMA_in_update_stmt1962); 
            	    COMMA256_tree = (Object)adaptor.create(COMMA256);
            	    adaptor.addChild(root_0, COMMA256_tree);

            	    pushFollow(FOLLOW_update_set_in_update_stmt1966);
            	    values=update_set();

            	    state._fsp--;

            	    adaptor.addChild(root_0, values.getTree());
            	    if (list_values==null) list_values=new ArrayList();
            	    list_values.add(values.getTree());


            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);

            // Sql.g:217:54: ( WHERE expr )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==WHERE) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // Sql.g:217:55: WHERE expr
                    {
                    WHERE257=(Token)match(input,WHERE,FOLLOW_WHERE_in_update_stmt1971); 
                    WHERE257_tree = (Object)adaptor.create(WHERE257);
                    adaptor.addChild(root_0, WHERE257_tree);

                    pushFollow(FOLLOW_expr_in_update_stmt1973);
                    expr258=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr258.getTree());

                    }
                    break;

            }

            // Sql.g:217:68: ( operation_limited_clause )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( ((LA98_0>=ORDER && LA98_0<=LIMIT)) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // Sql.g:217:69: operation_limited_clause
                    {
                    pushFollow(FOLLOW_operation_limited_clause_in_update_stmt1978);
                    operation_limited_clause259=operation_limited_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_limited_clause259.getTree());

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
    // Sql.g:219:1: update_set : column_name= ID EQUALS expr ;
    public final SqlParser.update_set_return update_set() throws RecognitionException {
        SqlParser.update_set_return retval = new SqlParser.update_set_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token column_name=null;
        Token EQUALS260=null;
        SqlParser.expr_return expr261 = null;


        Object column_name_tree=null;
        Object EQUALS260_tree=null;

        try {
            // Sql.g:219:11: (column_name= ID EQUALS expr )
            // Sql.g:219:13: column_name= ID EQUALS expr
            {
            root_0 = (Object)adaptor.nil();

            column_name=(Token)match(input,ID,FOLLOW_ID_in_update_set1989); 
            column_name_tree = (Object)adaptor.create(column_name);
            adaptor.addChild(root_0, column_name_tree);

            EQUALS260=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_update_set1991); 
            EQUALS260_tree = (Object)adaptor.create(EQUALS260);
            adaptor.addChild(root_0, EQUALS260_tree);

            pushFollow(FOLLOW_expr_in_update_set1993);
            expr261=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr261.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:222:1: delete_stmt : DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )? ;
    public final SqlParser.delete_stmt_return delete_stmt() throws RecognitionException {
        SqlParser.delete_stmt_return retval = new SqlParser.delete_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DELETE262=null;
        Token FROM263=null;
        Token WHERE265=null;
        SqlParser.qualified_table_name_return qualified_table_name264 = null;

        SqlParser.expr_return expr266 = null;

        SqlParser.operation_limited_clause_return operation_limited_clause267 = null;


        Object DELETE262_tree=null;
        Object FROM263_tree=null;
        Object WHERE265_tree=null;

        try {
            // Sql.g:222:12: ( DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )? )
            // Sql.g:222:14: DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )?
            {
            root_0 = (Object)adaptor.nil();

            DELETE262=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_stmt2001); 
            DELETE262_tree = (Object)adaptor.create(DELETE262);
            adaptor.addChild(root_0, DELETE262_tree);

            FROM263=(Token)match(input,FROM,FOLLOW_FROM_in_delete_stmt2003); 
            FROM263_tree = (Object)adaptor.create(FROM263);
            adaptor.addChild(root_0, FROM263_tree);

            pushFollow(FOLLOW_qualified_table_name_in_delete_stmt2005);
            qualified_table_name264=qualified_table_name();

            state._fsp--;

            adaptor.addChild(root_0, qualified_table_name264.getTree());
            // Sql.g:222:47: ( WHERE expr )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==WHERE) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // Sql.g:222:48: WHERE expr
                    {
                    WHERE265=(Token)match(input,WHERE,FOLLOW_WHERE_in_delete_stmt2008); 
                    WHERE265_tree = (Object)adaptor.create(WHERE265);
                    adaptor.addChild(root_0, WHERE265_tree);

                    pushFollow(FOLLOW_expr_in_delete_stmt2010);
                    expr266=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr266.getTree());

                    }
                    break;

            }

            // Sql.g:222:61: ( operation_limited_clause )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( ((LA100_0>=ORDER && LA100_0<=LIMIT)) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // Sql.g:222:62: operation_limited_clause
                    {
                    pushFollow(FOLLOW_operation_limited_clause_in_delete_stmt2015);
                    operation_limited_clause267=operation_limited_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_limited_clause267.getTree());

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
    // Sql.g:225:1: begin_stmt : BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )? ;
    public final SqlParser.begin_stmt_return begin_stmt() throws RecognitionException {
        SqlParser.begin_stmt_return retval = new SqlParser.begin_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BEGIN268=null;
        Token set269=null;
        Token TRANSACTION270=null;

        Object BEGIN268_tree=null;
        Object set269_tree=null;
        Object TRANSACTION270_tree=null;

        try {
            // Sql.g:225:11: ( BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )? )
            // Sql.g:225:13: BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )?
            {
            root_0 = (Object)adaptor.nil();

            BEGIN268=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_begin_stmt2025); 
            BEGIN268_tree = (Object)adaptor.create(BEGIN268);
            adaptor.addChild(root_0, BEGIN268_tree);

            // Sql.g:225:19: ( DEFERRED | IMMEDIATE | EXCLUSIVE )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( ((LA101_0>=DEFERRED && LA101_0<=EXCLUSIVE)) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // Sql.g:
                    {
                    set269=(Token)input.LT(1);
                    if ( (input.LA(1)>=DEFERRED && input.LA(1)<=EXCLUSIVE) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set269));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            // Sql.g:225:55: ( TRANSACTION )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==TRANSACTION) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // Sql.g:225:56: TRANSACTION
                    {
                    TRANSACTION270=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_begin_stmt2041); 
                    TRANSACTION270_tree = (Object)adaptor.create(TRANSACTION270);
                    adaptor.addChild(root_0, TRANSACTION270_tree);


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
    // Sql.g:228:1: commit_stmt : ( COMMIT | END ) ( TRANSACTION )? ;
    public final SqlParser.commit_stmt_return commit_stmt() throws RecognitionException {
        SqlParser.commit_stmt_return retval = new SqlParser.commit_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set271=null;
        Token TRANSACTION272=null;

        Object set271_tree=null;
        Object TRANSACTION272_tree=null;

        try {
            // Sql.g:228:12: ( ( COMMIT | END ) ( TRANSACTION )? )
            // Sql.g:228:14: ( COMMIT | END ) ( TRANSACTION )?
            {
            root_0 = (Object)adaptor.nil();

            set271=(Token)input.LT(1);
            if ( input.LA(1)==END||input.LA(1)==COMMIT ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set271));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // Sql.g:228:29: ( TRANSACTION )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==TRANSACTION) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // Sql.g:228:30: TRANSACTION
                    {
                    TRANSACTION272=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_commit_stmt2060); 
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
    // $ANTLR end "commit_stmt"

    public static class rollback_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rollback_stmt"
    // Sql.g:231:1: rollback_stmt : ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= ID )? ;
    public final SqlParser.rollback_stmt_return rollback_stmt() throws RecognitionException {
        SqlParser.rollback_stmt_return retval = new SqlParser.rollback_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token savepoint_name=null;
        Token ROLLBACK273=null;
        Token TRANSACTION274=null;
        Token TO275=null;
        Token SAVEPOINT276=null;

        Object savepoint_name_tree=null;
        Object ROLLBACK273_tree=null;
        Object TRANSACTION274_tree=null;
        Object TO275_tree=null;
        Object SAVEPOINT276_tree=null;

        try {
            // Sql.g:231:14: ( ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= ID )? )
            // Sql.g:231:16: ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= ID )?
            {
            root_0 = (Object)adaptor.nil();

            ROLLBACK273=(Token)match(input,ROLLBACK,FOLLOW_ROLLBACK_in_rollback_stmt2070); 
            ROLLBACK273_tree = (Object)adaptor.create(ROLLBACK273);
            adaptor.addChild(root_0, ROLLBACK273_tree);

            // Sql.g:231:25: ( TRANSACTION )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==TRANSACTION) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // Sql.g:231:26: TRANSACTION
                    {
                    TRANSACTION274=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_rollback_stmt2073); 
                    TRANSACTION274_tree = (Object)adaptor.create(TRANSACTION274);
                    adaptor.addChild(root_0, TRANSACTION274_tree);


                    }
                    break;

            }

            // Sql.g:231:40: ( TO ( SAVEPOINT )? savepoint_name= ID )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==TO) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // Sql.g:231:41: TO ( SAVEPOINT )? savepoint_name= ID
                    {
                    TO275=(Token)match(input,TO,FOLLOW_TO_in_rollback_stmt2078); 
                    TO275_tree = (Object)adaptor.create(TO275);
                    adaptor.addChild(root_0, TO275_tree);

                    // Sql.g:231:44: ( SAVEPOINT )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==SAVEPOINT) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // Sql.g:231:45: SAVEPOINT
                            {
                            SAVEPOINT276=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_rollback_stmt2081); 
                            SAVEPOINT276_tree = (Object)adaptor.create(SAVEPOINT276);
                            adaptor.addChild(root_0, SAVEPOINT276_tree);


                            }
                            break;

                    }

                    savepoint_name=(Token)match(input,ID,FOLLOW_ID_in_rollback_stmt2087); 
                    savepoint_name_tree = (Object)adaptor.create(savepoint_name);
                    adaptor.addChild(root_0, savepoint_name_tree);


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
    // Sql.g:234:1: savepoint_stmt : SAVEPOINT savepoint_name= ID ;
    public final SqlParser.savepoint_stmt_return savepoint_stmt() throws RecognitionException {
        SqlParser.savepoint_stmt_return retval = new SqlParser.savepoint_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token savepoint_name=null;
        Token SAVEPOINT277=null;

        Object savepoint_name_tree=null;
        Object SAVEPOINT277_tree=null;

        try {
            // Sql.g:234:15: ( SAVEPOINT savepoint_name= ID )
            // Sql.g:234:17: SAVEPOINT savepoint_name= ID
            {
            root_0 = (Object)adaptor.nil();

            SAVEPOINT277=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_savepoint_stmt2097); 
            SAVEPOINT277_tree = (Object)adaptor.create(SAVEPOINT277);
            adaptor.addChild(root_0, SAVEPOINT277_tree);

            savepoint_name=(Token)match(input,ID,FOLLOW_ID_in_savepoint_stmt2101); 
            savepoint_name_tree = (Object)adaptor.create(savepoint_name);
            adaptor.addChild(root_0, savepoint_name_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:237:1: release_stmt : RELEASE ( SAVEPOINT )? savepoint_name= ID ;
    public final SqlParser.release_stmt_return release_stmt() throws RecognitionException {
        SqlParser.release_stmt_return retval = new SqlParser.release_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token savepoint_name=null;
        Token RELEASE278=null;
        Token SAVEPOINT279=null;

        Object savepoint_name_tree=null;
        Object RELEASE278_tree=null;
        Object SAVEPOINT279_tree=null;

        try {
            // Sql.g:237:13: ( RELEASE ( SAVEPOINT )? savepoint_name= ID )
            // Sql.g:237:15: RELEASE ( SAVEPOINT )? savepoint_name= ID
            {
            root_0 = (Object)adaptor.nil();

            RELEASE278=(Token)match(input,RELEASE,FOLLOW_RELEASE_in_release_stmt2109); 
            RELEASE278_tree = (Object)adaptor.create(RELEASE278);
            adaptor.addChild(root_0, RELEASE278_tree);

            // Sql.g:237:23: ( SAVEPOINT )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==SAVEPOINT) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // Sql.g:237:24: SAVEPOINT
                    {
                    SAVEPOINT279=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_release_stmt2112); 
                    SAVEPOINT279_tree = (Object)adaptor.create(SAVEPOINT279);
                    adaptor.addChild(root_0, SAVEPOINT279_tree);


                    }
                    break;

            }

            savepoint_name=(Token)match(input,ID,FOLLOW_ID_in_release_stmt2118); 
            savepoint_name_tree = (Object)adaptor.create(savepoint_name);
            adaptor.addChild(root_0, savepoint_name_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:244:1: table_conflict_clause : ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) ;
    public final SqlParser.table_conflict_clause_return table_conflict_clause() throws RecognitionException {
        SqlParser.table_conflict_clause_return retval = new SqlParser.table_conflict_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ON280=null;
        Token CONFLICT281=null;
        Token set282=null;

        Object ON280_tree=null;
        Object CONFLICT281_tree=null;
        Object set282_tree=null;

        try {
            // Sql.g:244:22: ( ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) )
            // Sql.g:244:24: ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE )
            {
            root_0 = (Object)adaptor.nil();

            ON280=(Token)match(input,ON,FOLLOW_ON_in_table_conflict_clause2130); 
            CONFLICT281=(Token)match(input,CONFLICT,FOLLOW_CONFLICT_in_table_conflict_clause2133); 
            CONFLICT281_tree = (Object)adaptor.create(CONFLICT281);
            root_0 = (Object)adaptor.becomeRoot(CONFLICT281_tree, root_0);

            set282=(Token)input.LT(1);
            if ( (input.LA(1)>=IGNORE && input.LA(1)<=FAIL)||input.LA(1)==REPLACE ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set282));
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
    // Sql.g:248:1: create_virtual_table_stmt : CREATE VIRTUAL TABLE (database_name= ID DOT )? table_name= ID USING module_name= ID ( LPAREN column_def ( COMMA column_def )* RPAREN )? ;
    public final SqlParser.create_virtual_table_stmt_return create_virtual_table_stmt() throws RecognitionException {
        SqlParser.create_virtual_table_stmt_return retval = new SqlParser.create_virtual_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token database_name=null;
        Token table_name=null;
        Token module_name=null;
        Token CREATE283=null;
        Token VIRTUAL284=null;
        Token TABLE285=null;
        Token DOT286=null;
        Token USING287=null;
        Token LPAREN288=null;
        Token COMMA290=null;
        Token RPAREN292=null;
        SqlParser.column_def_return column_def289 = null;

        SqlParser.column_def_return column_def291 = null;


        Object database_name_tree=null;
        Object table_name_tree=null;
        Object module_name_tree=null;
        Object CREATE283_tree=null;
        Object VIRTUAL284_tree=null;
        Object TABLE285_tree=null;
        Object DOT286_tree=null;
        Object USING287_tree=null;
        Object LPAREN288_tree=null;
        Object COMMA290_tree=null;
        Object RPAREN292_tree=null;

        try {
            // Sql.g:248:26: ( CREATE VIRTUAL TABLE (database_name= ID DOT )? table_name= ID USING module_name= ID ( LPAREN column_def ( COMMA column_def )* RPAREN )? )
            // Sql.g:248:28: CREATE VIRTUAL TABLE (database_name= ID DOT )? table_name= ID USING module_name= ID ( LPAREN column_def ( COMMA column_def )* RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            CREATE283=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_virtual_table_stmt2163); 
            CREATE283_tree = (Object)adaptor.create(CREATE283);
            adaptor.addChild(root_0, CREATE283_tree);

            VIRTUAL284=(Token)match(input,VIRTUAL,FOLLOW_VIRTUAL_in_create_virtual_table_stmt2165); 
            VIRTUAL284_tree = (Object)adaptor.create(VIRTUAL284);
            adaptor.addChild(root_0, VIRTUAL284_tree);

            TABLE285=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_virtual_table_stmt2167); 
            TABLE285_tree = (Object)adaptor.create(TABLE285);
            adaptor.addChild(root_0, TABLE285_tree);

            // Sql.g:248:49: (database_name= ID DOT )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==ID) ) {
                int LA108_1 = input.LA(2);

                if ( (LA108_1==DOT) ) {
                    alt108=1;
                }
            }
            switch (alt108) {
                case 1 :
                    // Sql.g:248:50: database_name= ID DOT
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_create_virtual_table_stmt2172); 
                    database_name_tree = (Object)adaptor.create(database_name);
                    adaptor.addChild(root_0, database_name_tree);

                    DOT286=(Token)match(input,DOT,FOLLOW_DOT_in_create_virtual_table_stmt2174); 
                    DOT286_tree = (Object)adaptor.create(DOT286);
                    adaptor.addChild(root_0, DOT286_tree);


                    }
                    break;

            }

            table_name=(Token)match(input,ID,FOLLOW_ID_in_create_virtual_table_stmt2180); 
            table_name_tree = (Object)adaptor.create(table_name);
            adaptor.addChild(root_0, table_name_tree);

            USING287=(Token)match(input,USING,FOLLOW_USING_in_create_virtual_table_stmt2184); 
            USING287_tree = (Object)adaptor.create(USING287);
            adaptor.addChild(root_0, USING287_tree);

            module_name=(Token)match(input,ID,FOLLOW_ID_in_create_virtual_table_stmt2188); 
            module_name_tree = (Object)adaptor.create(module_name);
            adaptor.addChild(root_0, module_name_tree);

            // Sql.g:249:24: ( LPAREN column_def ( COMMA column_def )* RPAREN )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==LPAREN) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // Sql.g:249:25: LPAREN column_def ( COMMA column_def )* RPAREN
                    {
                    LPAREN288=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_virtual_table_stmt2191); 
                    LPAREN288_tree = (Object)adaptor.create(LPAREN288);
                    adaptor.addChild(root_0, LPAREN288_tree);

                    pushFollow(FOLLOW_column_def_in_create_virtual_table_stmt2193);
                    column_def289=column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, column_def289.getTree());
                    // Sql.g:249:43: ( COMMA column_def )*
                    loop109:
                    do {
                        int alt109=2;
                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==COMMA) ) {
                            alt109=1;
                        }


                        switch (alt109) {
                    	case 1 :
                    	    // Sql.g:249:44: COMMA column_def
                    	    {
                    	    COMMA290=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_virtual_table_stmt2196); 
                    	    COMMA290_tree = (Object)adaptor.create(COMMA290);
                    	    adaptor.addChild(root_0, COMMA290_tree);

                    	    pushFollow(FOLLOW_column_def_in_create_virtual_table_stmt2198);
                    	    column_def291=column_def();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, column_def291.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop109;
                        }
                    } while (true);

                    RPAREN292=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_virtual_table_stmt2202); 
                    RPAREN292_tree = (Object)adaptor.create(RPAREN292);
                    adaptor.addChild(root_0, RPAREN292_tree);


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
    // Sql.g:252:1: create_table_stmt : CREATE ( TEMP | TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= ID DOT )? table_name= ID ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt ) -> ^( TABLE ( TEMP )? ( TEMPORARY )? ^( $table_name ( $database_name)? ) ( ^( COLUMN_DEFS ( column_def )+ ) )? ( ^( TABLE_CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? ) ;
    public final SqlParser.create_table_stmt_return create_table_stmt() throws RecognitionException {
        SqlParser.create_table_stmt_return retval = new SqlParser.create_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token database_name=null;
        Token table_name=null;
        Token CREATE293=null;
        Token TEMP294=null;
        Token TEMPORARY295=null;
        Token TABLE296=null;
        Token IF297=null;
        Token NOT298=null;
        Token EXISTS299=null;
        Token DOT300=null;
        Token LPAREN301=null;
        Token COMMA303=null;
        Token COMMA305=null;
        Token RPAREN307=null;
        Token AS308=null;
        SqlParser.column_def_return column_def302 = null;

        SqlParser.column_def_return column_def304 = null;

        SqlParser.table_constraint_return table_constraint306 = null;

        SqlParser.select_stmt_return select_stmt309 = null;


        Object database_name_tree=null;
        Object table_name_tree=null;
        Object CREATE293_tree=null;
        Object TEMP294_tree=null;
        Object TEMPORARY295_tree=null;
        Object TABLE296_tree=null;
        Object IF297_tree=null;
        Object NOT298_tree=null;
        Object EXISTS299_tree=null;
        Object DOT300_tree=null;
        Object LPAREN301_tree=null;
        Object COMMA303_tree=null;
        Object COMMA305_tree=null;
        Object RPAREN307_tree=null;
        Object AS308_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_TEMP=new RewriteRuleTokenStream(adaptor,"token TEMP");
        RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_TEMPORARY=new RewriteRuleTokenStream(adaptor,"token TEMPORARY");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_select_stmt=new RewriteRuleSubtreeStream(adaptor,"rule select_stmt");
        RewriteRuleSubtreeStream stream_column_def=new RewriteRuleSubtreeStream(adaptor,"rule column_def");
        RewriteRuleSubtreeStream stream_table_constraint=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint");
        try {
            // Sql.g:252:18: ( CREATE ( TEMP | TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= ID DOT )? table_name= ID ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt ) -> ^( TABLE ( TEMP )? ( TEMPORARY )? ^( $table_name ( $database_name)? ) ( ^( COLUMN_DEFS ( column_def )+ ) )? ( ^( TABLE_CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? ) )
            // Sql.g:252:20: CREATE ( TEMP | TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= ID DOT )? table_name= ID ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt )
            {
            CREATE293=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_table_stmt2212);  
            stream_CREATE.add(CREATE293);

            // Sql.g:252:27: ( TEMP | TEMPORARY )?
            int alt111=3;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==TEMP) ) {
                alt111=1;
            }
            else if ( (LA111_0==TEMPORARY) ) {
                alt111=2;
            }
            switch (alt111) {
                case 1 :
                    // Sql.g:252:28: TEMP
                    {
                    TEMP294=(Token)match(input,TEMP,FOLLOW_TEMP_in_create_table_stmt2215);  
                    stream_TEMP.add(TEMP294);


                    }
                    break;
                case 2 :
                    // Sql.g:252:35: TEMPORARY
                    {
                    TEMPORARY295=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_table_stmt2219);  
                    stream_TEMPORARY.add(TEMPORARY295);


                    }
                    break;

            }

            TABLE296=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_table_stmt2223);  
            stream_TABLE.add(TABLE296);

            // Sql.g:252:53: ( IF NOT EXISTS )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==IF) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // Sql.g:252:54: IF NOT EXISTS
                    {
                    IF297=(Token)match(input,IF,FOLLOW_IF_in_create_table_stmt2226);  
                    stream_IF.add(IF297);

                    NOT298=(Token)match(input,NOT,FOLLOW_NOT_in_create_table_stmt2228);  
                    stream_NOT.add(NOT298);

                    EXISTS299=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_table_stmt2230);  
                    stream_EXISTS.add(EXISTS299);


                    }
                    break;

            }

            // Sql.g:252:70: (database_name= ID DOT )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==ID) ) {
                int LA113_1 = input.LA(2);

                if ( (LA113_1==DOT) ) {
                    alt113=1;
                }
            }
            switch (alt113) {
                case 1 :
                    // Sql.g:252:71: database_name= ID DOT
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_create_table_stmt2237);  
                    stream_ID.add(database_name);

                    DOT300=(Token)match(input,DOT,FOLLOW_DOT_in_create_table_stmt2239);  
                    stream_DOT.add(DOT300);


                    }
                    break;

            }

            table_name=(Token)match(input,ID,FOLLOW_ID_in_create_table_stmt2245);  
            stream_ID.add(table_name);

            // Sql.g:253:3: ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt )
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==LPAREN) ) {
                alt116=1;
            }
            else if ( (LA116_0==AS) ) {
                alt116=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }
            switch (alt116) {
                case 1 :
                    // Sql.g:253:5: LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN
                    {
                    LPAREN301=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_table_stmt2251);  
                    stream_LPAREN.add(LPAREN301);

                    pushFollow(FOLLOW_column_def_in_create_table_stmt2253);
                    column_def302=column_def();

                    state._fsp--;

                    stream_column_def.add(column_def302.getTree());
                    // Sql.g:253:23: ( COMMA column_def )*
                    loop114:
                    do {
                        int alt114=2;
                        int LA114_0 = input.LA(1);

                        if ( (LA114_0==COMMA) ) {
                            int LA114_1 = input.LA(2);

                            if ( (LA114_1==ID) ) {
                                alt114=1;
                            }


                        }


                        switch (alt114) {
                    	case 1 :
                    	    // Sql.g:253:24: COMMA column_def
                    	    {
                    	    COMMA303=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_table_stmt2256);  
                    	    stream_COMMA.add(COMMA303);

                    	    pushFollow(FOLLOW_column_def_in_create_table_stmt2258);
                    	    column_def304=column_def();

                    	    state._fsp--;

                    	    stream_column_def.add(column_def304.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop114;
                        }
                    } while (true);

                    // Sql.g:253:43: ( COMMA table_constraint )*
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==COMMA) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // Sql.g:253:44: COMMA table_constraint
                    	    {
                    	    COMMA305=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_table_stmt2263);  
                    	    stream_COMMA.add(COMMA305);

                    	    pushFollow(FOLLOW_table_constraint_in_create_table_stmt2265);
                    	    table_constraint306=table_constraint();

                    	    state._fsp--;

                    	    stream_table_constraint.add(table_constraint306.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop115;
                        }
                    } while (true);

                    RPAREN307=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_table_stmt2269);  
                    stream_RPAREN.add(RPAREN307);


                    }
                    break;
                case 2 :
                    // Sql.g:254:5: AS select_stmt
                    {
                    AS308=(Token)match(input,AS,FOLLOW_AS_in_create_table_stmt2275);  
                    stream_AS.add(AS308);

                    pushFollow(FOLLOW_select_stmt_in_create_table_stmt2277);
                    select_stmt309=select_stmt();

                    state._fsp--;

                    stream_select_stmt.add(select_stmt309.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: column_def, select_stmt, table_constraint, database_name, TEMP, table_name, TABLE, TEMPORARY
            // token labels: database_name, table_name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_database_name=new RewriteRuleTokenStream(adaptor,"token database_name",database_name);
            RewriteRuleTokenStream stream_table_name=new RewriteRuleTokenStream(adaptor,"token table_name",table_name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 255:1: -> ^( TABLE ( TEMP )? ( TEMPORARY )? ^( $table_name ( $database_name)? ) ( ^( COLUMN_DEFS ( column_def )+ ) )? ( ^( TABLE_CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? )
            {
                // Sql.g:255:4: ^( TABLE ( TEMP )? ( TEMPORARY )? ^( $table_name ( $database_name)? ) ( ^( COLUMN_DEFS ( column_def )+ ) )? ( ^( TABLE_CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_TABLE.nextNode(), root_1);

                // Sql.g:255:12: ( TEMP )?
                if ( stream_TEMP.hasNext() ) {
                    adaptor.addChild(root_1, stream_TEMP.nextNode());

                }
                stream_TEMP.reset();
                // Sql.g:255:18: ( TEMPORARY )?
                if ( stream_TEMPORARY.hasNext() ) {
                    adaptor.addChild(root_1, stream_TEMPORARY.nextNode());

                }
                stream_TEMPORARY.reset();
                // Sql.g:255:29: ^( $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                // Sql.g:255:43: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextNode());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }
                // Sql.g:255:60: ( ^( COLUMN_DEFS ( column_def )+ ) )?
                if ( stream_column_def.hasNext() ) {
                    // Sql.g:255:60: ^( COLUMN_DEFS ( column_def )+ )
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
                // Sql.g:255:88: ( ^( TABLE_CONSTRAINTS ( table_constraint )* ) )?
                if ( stream_table_constraint.hasNext() ) {
                    // Sql.g:255:88: ^( TABLE_CONSTRAINTS ( table_constraint )* )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TABLE_CONSTRAINTS, "TABLE_CONSTRAINTS"), root_2);

                    // Sql.g:255:108: ( table_constraint )*
                    while ( stream_table_constraint.hasNext() ) {
                        adaptor.addChild(root_2, stream_table_constraint.nextTree());

                    }
                    stream_table_constraint.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_table_constraint.reset();
                // Sql.g:255:128: ( select_stmt )?
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
    // Sql.g:257:1: column_def : ID ( type_name )? ( column_constraint )* ;
    public final SqlParser.column_def_return column_def() throws RecognitionException {
        SqlParser.column_def_return retval = new SqlParser.column_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID310=null;
        SqlParser.type_name_return type_name311 = null;

        SqlParser.column_constraint_return column_constraint312 = null;


        Object ID310_tree=null;

        try {
            // Sql.g:257:11: ( ID ( type_name )? ( column_constraint )* )
            // Sql.g:257:13: ID ( type_name )? ( column_constraint )*
            {
            root_0 = (Object)adaptor.nil();

            ID310=(Token)match(input,ID,FOLLOW_ID_in_column_def2325); 
            ID310_tree = (Object)adaptor.create(ID310);
            root_0 = (Object)adaptor.becomeRoot(ID310_tree, root_0);

            // Sql.g:257:17: ( type_name )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==ID) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // Sql.g:257:17: type_name
                    {
                    pushFollow(FOLLOW_type_name_in_column_def2328);
                    type_name311=type_name();

                    state._fsp--;

                    adaptor.addChild(root_0, type_name311.getTree());

                    }
                    break;

            }

            // Sql.g:257:28: ( column_constraint )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==NOT||LA118_0==COLLATE||LA118_0==DEFAULT||(LA118_0>=CONSTRAINT && LA118_0<=PRIMARY)||(LA118_0>=UNIQUE && LA118_0<=CHECK)||LA118_0==REFERENCES) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // Sql.g:257:29: column_constraint
            	    {
            	    pushFollow(FOLLOW_column_constraint_in_column_def2332);
            	    column_constraint312=column_constraint();

            	    state._fsp--;

            	    adaptor.addChild(root_0, column_constraint312.getTree());

            	    }
            	    break;

            	default :
            	    break loop118;
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
    // $ANTLR end "column_def"

    public static class column_constraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "column_constraint"
    // Sql.g:259:1: column_constraint : ( CONSTRAINT name= ID )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause ) -> ^( COLUMN_CONSTRAINT ( ID )? ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ) ;
    public final SqlParser.column_constraint_return column_constraint() throws RecognitionException {
        SqlParser.column_constraint_return retval = new SqlParser.column_constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token CONSTRAINT313=null;
        SqlParser.column_constraint_pk_return column_constraint_pk314 = null;

        SqlParser.column_constraint_not_null_return column_constraint_not_null315 = null;

        SqlParser.column_constraint_unique_return column_constraint_unique316 = null;

        SqlParser.column_constraint_check_return column_constraint_check317 = null;

        SqlParser.column_constraint_default_return column_constraint_default318 = null;

        SqlParser.column_constraint_collate_return column_constraint_collate319 = null;

        SqlParser.fk_clause_return fk_clause320 = null;


        Object name_tree=null;
        Object CONSTRAINT313_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_CONSTRAINT=new RewriteRuleTokenStream(adaptor,"token CONSTRAINT");
        RewriteRuleSubtreeStream stream_column_constraint_default=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_default");
        RewriteRuleSubtreeStream stream_column_constraint_check=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_check");
        RewriteRuleSubtreeStream stream_column_constraint_pk=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_pk");
        RewriteRuleSubtreeStream stream_column_constraint_collate=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_collate");
        RewriteRuleSubtreeStream stream_column_constraint_unique=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_unique");
        RewriteRuleSubtreeStream stream_fk_clause=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause");
        RewriteRuleSubtreeStream stream_column_constraint_not_null=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_not_null");
        try {
            // Sql.g:259:18: ( ( CONSTRAINT name= ID )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause ) -> ^( COLUMN_CONSTRAINT ( ID )? ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ) )
            // Sql.g:259:20: ( CONSTRAINT name= ID )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause )
            {
            // Sql.g:259:20: ( CONSTRAINT name= ID )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==CONSTRAINT) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // Sql.g:259:21: CONSTRAINT name= ID
                    {
                    CONSTRAINT313=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_column_constraint2342);  
                    stream_CONSTRAINT.add(CONSTRAINT313);

                    name=(Token)match(input,ID,FOLLOW_ID_in_column_constraint2346);  
                    stream_ID.add(name);


                    }
                    break;

            }

            // Sql.g:260:3: ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause )
            int alt120=7;
            switch ( input.LA(1) ) {
            case PRIMARY:
                {
                alt120=1;
                }
                break;
            case NOT:
                {
                alt120=2;
                }
                break;
            case UNIQUE:
                {
                alt120=3;
                }
                break;
            case CHECK:
                {
                alt120=4;
                }
                break;
            case DEFAULT:
                {
                alt120=5;
                }
                break;
            case COLLATE:
                {
                alt120=6;
                }
                break;
            case REFERENCES:
                {
                alt120=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // Sql.g:260:5: column_constraint_pk
                    {
                    pushFollow(FOLLOW_column_constraint_pk_in_column_constraint2354);
                    column_constraint_pk314=column_constraint_pk();

                    state._fsp--;

                    stream_column_constraint_pk.add(column_constraint_pk314.getTree());

                    }
                    break;
                case 2 :
                    // Sql.g:261:5: column_constraint_not_null
                    {
                    pushFollow(FOLLOW_column_constraint_not_null_in_column_constraint2360);
                    column_constraint_not_null315=column_constraint_not_null();

                    state._fsp--;

                    stream_column_constraint_not_null.add(column_constraint_not_null315.getTree());

                    }
                    break;
                case 3 :
                    // Sql.g:262:5: column_constraint_unique
                    {
                    pushFollow(FOLLOW_column_constraint_unique_in_column_constraint2366);
                    column_constraint_unique316=column_constraint_unique();

                    state._fsp--;

                    stream_column_constraint_unique.add(column_constraint_unique316.getTree());

                    }
                    break;
                case 4 :
                    // Sql.g:263:5: column_constraint_check
                    {
                    pushFollow(FOLLOW_column_constraint_check_in_column_constraint2372);
                    column_constraint_check317=column_constraint_check();

                    state._fsp--;

                    stream_column_constraint_check.add(column_constraint_check317.getTree());

                    }
                    break;
                case 5 :
                    // Sql.g:264:5: column_constraint_default
                    {
                    pushFollow(FOLLOW_column_constraint_default_in_column_constraint2378);
                    column_constraint_default318=column_constraint_default();

                    state._fsp--;

                    stream_column_constraint_default.add(column_constraint_default318.getTree());

                    }
                    break;
                case 6 :
                    // Sql.g:265:5: column_constraint_collate
                    {
                    pushFollow(FOLLOW_column_constraint_collate_in_column_constraint2384);
                    column_constraint_collate319=column_constraint_collate();

                    state._fsp--;

                    stream_column_constraint_collate.add(column_constraint_collate319.getTree());

                    }
                    break;
                case 7 :
                    // Sql.g:266:5: fk_clause
                    {
                    pushFollow(FOLLOW_fk_clause_in_column_constraint2390);
                    fk_clause320=fk_clause();

                    state._fsp--;

                    stream_fk_clause.add(fk_clause320.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: fk_clause, column_constraint_unique, column_constraint_pk, ID, column_constraint_default, column_constraint_not_null, column_constraint_collate, column_constraint_check
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 267:1: -> ^( COLUMN_CONSTRAINT ( ID )? ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? )
            {
                // Sql.g:267:4: ^( COLUMN_CONSTRAINT ( ID )? ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMN_CONSTRAINT, "COLUMN_CONSTRAINT"), root_1);

                // Sql.g:267:24: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();
                // Sql.g:268:3: ( column_constraint_pk )?
                if ( stream_column_constraint_pk.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_pk.nextTree());

                }
                stream_column_constraint_pk.reset();
                // Sql.g:269:3: ( column_constraint_not_null )?
                if ( stream_column_constraint_not_null.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_not_null.nextTree());

                }
                stream_column_constraint_not_null.reset();
                // Sql.g:270:3: ( column_constraint_unique )?
                if ( stream_column_constraint_unique.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_unique.nextTree());

                }
                stream_column_constraint_unique.reset();
                // Sql.g:271:3: ( column_constraint_check )?
                if ( stream_column_constraint_check.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_check.nextTree());

                }
                stream_column_constraint_check.reset();
                // Sql.g:272:3: ( column_constraint_default )?
                if ( stream_column_constraint_default.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_default.nextTree());

                }
                stream_column_constraint_default.reset();
                // Sql.g:273:3: ( column_constraint_collate )?
                if ( stream_column_constraint_collate.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_collate.nextTree());

                }
                stream_column_constraint_collate.reset();
                // Sql.g:274:3: ( fk_clause )?
                if ( stream_fk_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_fk_clause.nextTree());

                }
                stream_fk_clause.reset();

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
    // Sql.g:276:1: column_constraint_pk : PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )? ;
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
            // Sql.g:276:21: ( PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )? )
            // Sql.g:276:23: PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )?
            {
            root_0 = (Object)adaptor.nil();

            PRIMARY321=(Token)match(input,PRIMARY,FOLLOW_PRIMARY_in_column_constraint_pk2443); 
            PRIMARY321_tree = (Object)adaptor.create(PRIMARY321);
            root_0 = (Object)adaptor.becomeRoot(PRIMARY321_tree, root_0);

            KEY322=(Token)match(input,KEY,FOLLOW_KEY_in_column_constraint_pk2446); 
            // Sql.g:276:37: ( ASC | DESC )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( ((LA121_0>=ASC && LA121_0<=DESC)) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // Sql.g:
                    {
                    set323=(Token)input.LT(1);
                    if ( (input.LA(1)>=ASC && input.LA(1)<=DESC) ) {
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

            // Sql.g:276:51: ( table_conflict_clause )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==ON) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // Sql.g:276:51: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_pk2458);
                    table_conflict_clause324=table_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, table_conflict_clause324.getTree());

                    }
                    break;

            }

            // Sql.g:276:74: ( AUTOINCREMENT )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==AUTOINCREMENT) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // Sql.g:276:75: AUTOINCREMENT
                    {
                    AUTOINCREMENT325=(Token)match(input,AUTOINCREMENT,FOLLOW_AUTOINCREMENT_in_column_constraint_pk2462); 
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
    // Sql.g:278:1: column_constraint_not_null : NOT NULL ( table_conflict_clause )? -> ^( NOT_NULL ( table_conflict_clause )? ) ;
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
            // Sql.g:278:27: ( NOT NULL ( table_conflict_clause )? -> ^( NOT_NULL ( table_conflict_clause )? ) )
            // Sql.g:278:29: NOT NULL ( table_conflict_clause )?
            {
            NOT326=(Token)match(input,NOT,FOLLOW_NOT_in_column_constraint_not_null2471);  
            stream_NOT.add(NOT326);

            NULL327=(Token)match(input,NULL,FOLLOW_NULL_in_column_constraint_not_null2473);  
            stream_NULL.add(NULL327);

            // Sql.g:278:38: ( table_conflict_clause )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==ON) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // Sql.g:278:38: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_not_null2475);
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
            // 278:61: -> ^( NOT_NULL ( table_conflict_clause )? )
            {
                // Sql.g:278:64: ^( NOT_NULL ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_NULL, "NOT_NULL"), root_1);

                // Sql.g:278:75: ( table_conflict_clause )?
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
    // Sql.g:280:1: column_constraint_unique : UNIQUE ( table_conflict_clause )? ;
    public final SqlParser.column_constraint_unique_return column_constraint_unique() throws RecognitionException {
        SqlParser.column_constraint_unique_return retval = new SqlParser.column_constraint_unique_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNIQUE329=null;
        SqlParser.table_conflict_clause_return table_conflict_clause330 = null;


        Object UNIQUE329_tree=null;

        try {
            // Sql.g:280:25: ( UNIQUE ( table_conflict_clause )? )
            // Sql.g:280:27: UNIQUE ( table_conflict_clause )?
            {
            root_0 = (Object)adaptor.nil();

            UNIQUE329=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_column_constraint_unique2492); 
            UNIQUE329_tree = (Object)adaptor.create(UNIQUE329);
            root_0 = (Object)adaptor.becomeRoot(UNIQUE329_tree, root_0);

            // Sql.g:280:35: ( table_conflict_clause )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==ON) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // Sql.g:280:35: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_unique2495);
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
    // Sql.g:282:1: column_constraint_check : CHECK LPAREN expr RPAREN ;
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
            // Sql.g:282:24: ( CHECK LPAREN expr RPAREN )
            // Sql.g:282:26: CHECK LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            CHECK331=(Token)match(input,CHECK,FOLLOW_CHECK_in_column_constraint_check2503); 
            CHECK331_tree = (Object)adaptor.create(CHECK331);
            root_0 = (Object)adaptor.becomeRoot(CHECK331_tree, root_0);

            LPAREN332=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_column_constraint_check2506); 
            pushFollow(FOLLOW_expr_in_column_constraint_check2509);
            expr333=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr333.getTree());
            RPAREN334=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_column_constraint_check2511); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:284:1: column_constraint_default : DEFAULT ( SIGNED_NUMBER | literal_value | LPAREN expr RPAREN ) ;
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
            // Sql.g:284:26: ( DEFAULT ( SIGNED_NUMBER | literal_value | LPAREN expr RPAREN ) )
            // Sql.g:284:28: DEFAULT ( SIGNED_NUMBER | literal_value | LPAREN expr RPAREN )
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT335=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_column_constraint_default2519); 
            DEFAULT335_tree = (Object)adaptor.create(DEFAULT335);
            root_0 = (Object)adaptor.becomeRoot(DEFAULT335_tree, root_0);

            // Sql.g:284:37: ( SIGNED_NUMBER | literal_value | LPAREN expr RPAREN )
            int alt126=3;
            switch ( input.LA(1) ) {
            case SIGNED_NUMBER:
                {
                alt126=1;
                }
                break;
            case NULL:
            case INTEGER:
            case FLOAT:
            case STRING:
            case BLOB:
            case CURRENT_TIME:
            case CURRENT_DATE:
            case CURRENT_TIMESTAMP:
                {
                alt126=2;
                }
                break;
            case LPAREN:
                {
                alt126=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }

            switch (alt126) {
                case 1 :
                    // Sql.g:284:38: SIGNED_NUMBER
                    {
                    SIGNED_NUMBER336=(Token)match(input,SIGNED_NUMBER,FOLLOW_SIGNED_NUMBER_in_column_constraint_default2523); 
                    SIGNED_NUMBER336_tree = (Object)adaptor.create(SIGNED_NUMBER336);
                    adaptor.addChild(root_0, SIGNED_NUMBER336_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:284:54: literal_value
                    {
                    pushFollow(FOLLOW_literal_value_in_column_constraint_default2527);
                    literal_value337=literal_value();

                    state._fsp--;

                    adaptor.addChild(root_0, literal_value337.getTree());

                    }
                    break;
                case 3 :
                    // Sql.g:284:70: LPAREN expr RPAREN
                    {
                    LPAREN338=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_column_constraint_default2531); 
                    pushFollow(FOLLOW_expr_in_column_constraint_default2534);
                    expr339=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr339.getTree());
                    RPAREN340=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_column_constraint_default2536); 

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
    // Sql.g:286:1: column_constraint_collate : COLLATE collation_name= ID ;
    public final SqlParser.column_constraint_collate_return column_constraint_collate() throws RecognitionException {
        SqlParser.column_constraint_collate_return retval = new SqlParser.column_constraint_collate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token collation_name=null;
        Token COLLATE341=null;

        Object collation_name_tree=null;
        Object COLLATE341_tree=null;

        try {
            // Sql.g:286:26: ( COLLATE collation_name= ID )
            // Sql.g:286:28: COLLATE collation_name= ID
            {
            root_0 = (Object)adaptor.nil();

            COLLATE341=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_column_constraint_collate2545); 
            COLLATE341_tree = (Object)adaptor.create(COLLATE341);
            root_0 = (Object)adaptor.becomeRoot(COLLATE341_tree, root_0);

            collation_name=(Token)match(input,ID,FOLLOW_ID_in_column_constraint_collate2550); 
            collation_name_tree = (Object)adaptor.create(collation_name);
            adaptor.addChild(root_0, collation_name_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:288:1: table_constraint : ( CONSTRAINT name= ID )? ( table_constraint_pk | table_constraint_check | table_constraint_fk ) ;
    public final SqlParser.table_constraint_return table_constraint() throws RecognitionException {
        SqlParser.table_constraint_return retval = new SqlParser.table_constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token CONSTRAINT342=null;
        SqlParser.table_constraint_pk_return table_constraint_pk343 = null;

        SqlParser.table_constraint_check_return table_constraint_check344 = null;

        SqlParser.table_constraint_fk_return table_constraint_fk345 = null;


        Object name_tree=null;
        Object CONSTRAINT342_tree=null;

        try {
            // Sql.g:288:17: ( ( CONSTRAINT name= ID )? ( table_constraint_pk | table_constraint_check | table_constraint_fk ) )
            // Sql.g:288:19: ( CONSTRAINT name= ID )? ( table_constraint_pk | table_constraint_check | table_constraint_fk )
            {
            root_0 = (Object)adaptor.nil();

            // Sql.g:288:19: ( CONSTRAINT name= ID )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==CONSTRAINT) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // Sql.g:288:20: CONSTRAINT name= ID
                    {
                    CONSTRAINT342=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_table_constraint2559); 
                    CONSTRAINT342_tree = (Object)adaptor.create(CONSTRAINT342);
                    adaptor.addChild(root_0, CONSTRAINT342_tree);

                    name=(Token)match(input,ID,FOLLOW_ID_in_table_constraint2563); 
                    name_tree = (Object)adaptor.create(name);
                    adaptor.addChild(root_0, name_tree);


                    }
                    break;

            }

            // Sql.g:289:3: ( table_constraint_pk | table_constraint_check | table_constraint_fk )
            int alt128=3;
            switch ( input.LA(1) ) {
            case PRIMARY:
            case UNIQUE:
                {
                alt128=1;
                }
                break;
            case CHECK:
                {
                alt128=2;
                }
                break;
            case FOREIGN:
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
                    // Sql.g:289:5: table_constraint_pk
                    {
                    pushFollow(FOLLOW_table_constraint_pk_in_table_constraint2571);
                    table_constraint_pk343=table_constraint_pk();

                    state._fsp--;

                    adaptor.addChild(root_0, table_constraint_pk343.getTree());

                    }
                    break;
                case 2 :
                    // Sql.g:290:5: table_constraint_check
                    {
                    pushFollow(FOLLOW_table_constraint_check_in_table_constraint2577);
                    table_constraint_check344=table_constraint_check();

                    state._fsp--;

                    adaptor.addChild(root_0, table_constraint_check344.getTree());

                    }
                    break;
                case 3 :
                    // Sql.g:291:5: table_constraint_fk
                    {
                    pushFollow(FOLLOW_table_constraint_fk_in_table_constraint2583);
                    table_constraint_fk345=table_constraint_fk();

                    state._fsp--;

                    adaptor.addChild(root_0, table_constraint_fk345.getTree());

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
    // Sql.g:293:1: table_constraint_pk : ( PRIMARY KEY | UNIQUE ) LPAREN indexed_columns+= ID ( COMMA indexed_columns+= ID )* RPAREN ( table_conflict_clause )? ;
    public final SqlParser.table_constraint_pk_return table_constraint_pk() throws RecognitionException {
        SqlParser.table_constraint_pk_return retval = new SqlParser.table_constraint_pk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRIMARY346=null;
        Token KEY347=null;
        Token UNIQUE348=null;
        Token LPAREN349=null;
        Token COMMA350=null;
        Token RPAREN351=null;
        Token indexed_columns=null;
        List list_indexed_columns=null;
        SqlParser.table_conflict_clause_return table_conflict_clause352 = null;


        Object PRIMARY346_tree=null;
        Object KEY347_tree=null;
        Object UNIQUE348_tree=null;
        Object LPAREN349_tree=null;
        Object COMMA350_tree=null;
        Object RPAREN351_tree=null;
        Object indexed_columns_tree=null;

        try {
            // Sql.g:293:20: ( ( PRIMARY KEY | UNIQUE ) LPAREN indexed_columns+= ID ( COMMA indexed_columns+= ID )* RPAREN ( table_conflict_clause )? )
            // Sql.g:293:22: ( PRIMARY KEY | UNIQUE ) LPAREN indexed_columns+= ID ( COMMA indexed_columns+= ID )* RPAREN ( table_conflict_clause )?
            {
            root_0 = (Object)adaptor.nil();

            // Sql.g:293:22: ( PRIMARY KEY | UNIQUE )
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==PRIMARY) ) {
                alt129=1;
            }
            else if ( (LA129_0==UNIQUE) ) {
                alt129=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }
            switch (alt129) {
                case 1 :
                    // Sql.g:293:23: PRIMARY KEY
                    {
                    PRIMARY346=(Token)match(input,PRIMARY,FOLLOW_PRIMARY_in_table_constraint_pk2592); 
                    PRIMARY346_tree = (Object)adaptor.create(PRIMARY346);
                    adaptor.addChild(root_0, PRIMARY346_tree);

                    KEY347=(Token)match(input,KEY,FOLLOW_KEY_in_table_constraint_pk2594); 
                    KEY347_tree = (Object)adaptor.create(KEY347);
                    adaptor.addChild(root_0, KEY347_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:293:37: UNIQUE
                    {
                    UNIQUE348=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_table_constraint_pk2598); 
                    UNIQUE348_tree = (Object)adaptor.create(UNIQUE348);
                    adaptor.addChild(root_0, UNIQUE348_tree);


                    }
                    break;

            }

            LPAREN349=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_pk2601); 
            LPAREN349_tree = (Object)adaptor.create(LPAREN349);
            adaptor.addChild(root_0, LPAREN349_tree);

            indexed_columns=(Token)match(input,ID,FOLLOW_ID_in_table_constraint_pk2605); 
            indexed_columns_tree = (Object)adaptor.create(indexed_columns);
            adaptor.addChild(root_0, indexed_columns_tree);

            if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            list_indexed_columns.add(indexed_columns);

            // Sql.g:293:72: ( COMMA indexed_columns+= ID )*
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( (LA130_0==COMMA) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // Sql.g:293:73: COMMA indexed_columns+= ID
            	    {
            	    COMMA350=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_pk2608); 
            	    COMMA350_tree = (Object)adaptor.create(COMMA350);
            	    adaptor.addChild(root_0, COMMA350_tree);

            	    indexed_columns=(Token)match(input,ID,FOLLOW_ID_in_table_constraint_pk2612); 
            	    indexed_columns_tree = (Object)adaptor.create(indexed_columns);
            	    adaptor.addChild(root_0, indexed_columns_tree);

            	    if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            	    list_indexed_columns.add(indexed_columns);


            	    }
            	    break;

            	default :
            	    break loop130;
                }
            } while (true);

            RPAREN351=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_pk2616); 
            RPAREN351_tree = (Object)adaptor.create(RPAREN351);
            adaptor.addChild(root_0, RPAREN351_tree);

            // Sql.g:294:3: ( table_conflict_clause )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==ON) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // Sql.g:294:3: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_table_constraint_pk2620);
                    table_conflict_clause352=table_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, table_conflict_clause352.getTree());

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
    // Sql.g:296:1: table_constraint_check : CHECK LPAREN expr RPAREN ;
    public final SqlParser.table_constraint_check_return table_constraint_check() throws RecognitionException {
        SqlParser.table_constraint_check_return retval = new SqlParser.table_constraint_check_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CHECK353=null;
        Token LPAREN354=null;
        Token RPAREN356=null;
        SqlParser.expr_return expr355 = null;


        Object CHECK353_tree=null;
        Object LPAREN354_tree=null;
        Object RPAREN356_tree=null;

        try {
            // Sql.g:296:23: ( CHECK LPAREN expr RPAREN )
            // Sql.g:296:25: CHECK LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            CHECK353=(Token)match(input,CHECK,FOLLOW_CHECK_in_table_constraint_check2628); 
            CHECK353_tree = (Object)adaptor.create(CHECK353);
            adaptor.addChild(root_0, CHECK353_tree);

            LPAREN354=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_check2630); 
            LPAREN354_tree = (Object)adaptor.create(LPAREN354);
            adaptor.addChild(root_0, LPAREN354_tree);

            pushFollow(FOLLOW_expr_in_table_constraint_check2632);
            expr355=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr355.getTree());
            RPAREN356=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_check2634); 
            RPAREN356_tree = (Object)adaptor.create(RPAREN356);
            adaptor.addChild(root_0, RPAREN356_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:298:1: table_constraint_fk : FOREIGN KEY LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN fk_clause ;
    public final SqlParser.table_constraint_fk_return table_constraint_fk() throws RecognitionException {
        SqlParser.table_constraint_fk_return retval = new SqlParser.table_constraint_fk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOREIGN357=null;
        Token KEY358=null;
        Token LPAREN359=null;
        Token COMMA360=null;
        Token RPAREN361=null;
        Token column_names=null;
        List list_column_names=null;
        SqlParser.fk_clause_return fk_clause362 = null;


        Object FOREIGN357_tree=null;
        Object KEY358_tree=null;
        Object LPAREN359_tree=null;
        Object COMMA360_tree=null;
        Object RPAREN361_tree=null;
        Object column_names_tree=null;

        try {
            // Sql.g:298:20: ( FOREIGN KEY LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN fk_clause )
            // Sql.g:298:22: FOREIGN KEY LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN fk_clause
            {
            root_0 = (Object)adaptor.nil();

            FOREIGN357=(Token)match(input,FOREIGN,FOLLOW_FOREIGN_in_table_constraint_fk2641); 
            FOREIGN357_tree = (Object)adaptor.create(FOREIGN357);
            adaptor.addChild(root_0, FOREIGN357_tree);

            KEY358=(Token)match(input,KEY,FOLLOW_KEY_in_table_constraint_fk2643); 
            KEY358_tree = (Object)adaptor.create(KEY358);
            adaptor.addChild(root_0, KEY358_tree);

            LPAREN359=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_fk2645); 
            LPAREN359_tree = (Object)adaptor.create(LPAREN359);
            adaptor.addChild(root_0, LPAREN359_tree);

            column_names=(Token)match(input,ID,FOLLOW_ID_in_table_constraint_fk2649); 
            column_names_tree = (Object)adaptor.create(column_names);
            adaptor.addChild(root_0, column_names_tree);

            if (list_column_names==null) list_column_names=new ArrayList();
            list_column_names.add(column_names);

            // Sql.g:298:58: ( COMMA column_names+= ID )*
            loop132:
            do {
                int alt132=2;
                int LA132_0 = input.LA(1);

                if ( (LA132_0==COMMA) ) {
                    alt132=1;
                }


                switch (alt132) {
            	case 1 :
            	    // Sql.g:298:59: COMMA column_names+= ID
            	    {
            	    COMMA360=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_fk2652); 
            	    COMMA360_tree = (Object)adaptor.create(COMMA360);
            	    adaptor.addChild(root_0, COMMA360_tree);

            	    column_names=(Token)match(input,ID,FOLLOW_ID_in_table_constraint_fk2656); 
            	    column_names_tree = (Object)adaptor.create(column_names);
            	    adaptor.addChild(root_0, column_names_tree);

            	    if (list_column_names==null) list_column_names=new ArrayList();
            	    list_column_names.add(column_names);


            	    }
            	    break;

            	default :
            	    break loop132;
                }
            } while (true);

            RPAREN361=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_fk2660); 
            RPAREN361_tree = (Object)adaptor.create(RPAREN361);
            adaptor.addChild(root_0, RPAREN361_tree);

            pushFollow(FOLLOW_fk_clause_in_table_constraint_fk2662);
            fk_clause362=fk_clause();

            state._fsp--;

            adaptor.addChild(root_0, fk_clause362.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:300:1: fk_clause : REFERENCES foreign_table= ID ( LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )? ;
    public final SqlParser.fk_clause_return fk_clause() throws RecognitionException {
        SqlParser.fk_clause_return retval = new SqlParser.fk_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token foreign_table=null;
        Token REFERENCES363=null;
        Token LPAREN364=null;
        Token COMMA365=null;
        Token RPAREN366=null;
        Token column_names=null;
        List list_column_names=null;
        SqlParser.fk_clause_action_return fk_clause_action367 = null;

        SqlParser.fk_clause_deferrable_return fk_clause_deferrable368 = null;


        Object foreign_table_tree=null;
        Object REFERENCES363_tree=null;
        Object LPAREN364_tree=null;
        Object COMMA365_tree=null;
        Object RPAREN366_tree=null;
        Object column_names_tree=null;

        try {
            // Sql.g:300:10: ( REFERENCES foreign_table= ID ( LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )? )
            // Sql.g:300:12: REFERENCES foreign_table= ID ( LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )?
            {
            root_0 = (Object)adaptor.nil();

            REFERENCES363=(Token)match(input,REFERENCES,FOLLOW_REFERENCES_in_fk_clause2669); 
            REFERENCES363_tree = (Object)adaptor.create(REFERENCES363);
            root_0 = (Object)adaptor.becomeRoot(REFERENCES363_tree, root_0);

            foreign_table=(Token)match(input,ID,FOLLOW_ID_in_fk_clause2674); 
            foreign_table_tree = (Object)adaptor.create(foreign_table);
            adaptor.addChild(root_0, foreign_table_tree);

            // Sql.g:300:41: ( LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==LPAREN) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // Sql.g:300:42: LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN
                    {
                    LPAREN364=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_fk_clause2677); 
                    LPAREN364_tree = (Object)adaptor.create(LPAREN364);
                    adaptor.addChild(root_0, LPAREN364_tree);

                    column_names=(Token)match(input,ID,FOLLOW_ID_in_fk_clause2681); 
                    column_names_tree = (Object)adaptor.create(column_names);
                    adaptor.addChild(root_0, column_names_tree);

                    if (list_column_names==null) list_column_names=new ArrayList();
                    list_column_names.add(column_names);

                    // Sql.g:300:66: ( COMMA column_names+= ID )*
                    loop133:
                    do {
                        int alt133=2;
                        int LA133_0 = input.LA(1);

                        if ( (LA133_0==COMMA) ) {
                            alt133=1;
                        }


                        switch (alt133) {
                    	case 1 :
                    	    // Sql.g:300:67: COMMA column_names+= ID
                    	    {
                    	    COMMA365=(Token)match(input,COMMA,FOLLOW_COMMA_in_fk_clause2684); 
                    	    COMMA365_tree = (Object)adaptor.create(COMMA365);
                    	    adaptor.addChild(root_0, COMMA365_tree);

                    	    column_names=(Token)match(input,ID,FOLLOW_ID_in_fk_clause2688); 
                    	    column_names_tree = (Object)adaptor.create(column_names);
                    	    adaptor.addChild(root_0, column_names_tree);

                    	    if (list_column_names==null) list_column_names=new ArrayList();
                    	    list_column_names.add(column_names);


                    	    }
                    	    break;

                    	default :
                    	    break loop133;
                        }
                    } while (true);

                    RPAREN366=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_fk_clause2692); 
                    RPAREN366_tree = (Object)adaptor.create(RPAREN366);
                    adaptor.addChild(root_0, RPAREN366_tree);


                    }
                    break;

            }

            // Sql.g:301:3: ( fk_clause_action )+
            int cnt135=0;
            loop135:
            do {
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( (LA135_0==MATCH||LA135_0==ON) ) {
                    alt135=1;
                }


                switch (alt135) {
            	case 1 :
            	    // Sql.g:301:3: fk_clause_action
            	    {
            	    pushFollow(FOLLOW_fk_clause_action_in_fk_clause2698);
            	    fk_clause_action367=fk_clause_action();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fk_clause_action367.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt135 >= 1 ) break loop135;
                        EarlyExitException eee =
                            new EarlyExitException(135, input);
                        throw eee;
                }
                cnt135++;
            } while (true);

            // Sql.g:301:21: ( fk_clause_deferrable )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==NOT) ) {
                int LA136_1 = input.LA(2);

                if ( (LA136_1==DEFERRABLE) ) {
                    alt136=1;
                }
            }
            else if ( (LA136_0==DEFERRABLE) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // Sql.g:301:21: fk_clause_deferrable
                    {
                    pushFollow(FOLLOW_fk_clause_deferrable_in_fk_clause2701);
                    fk_clause_deferrable368=fk_clause_deferrable();

                    state._fsp--;

                    adaptor.addChild(root_0, fk_clause_deferrable368.getTree());

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
    // Sql.g:303:1: fk_clause_action : ( ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT ) | MATCH name= ID );
    public final SqlParser.fk_clause_action_return fk_clause_action() throws RecognitionException {
        SqlParser.fk_clause_action_return retval = new SqlParser.fk_clause_action_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token ON369=null;
        Token set370=null;
        Token SET371=null;
        Token NULL372=null;
        Token SET373=null;
        Token DEFAULT374=null;
        Token CASCADE375=null;
        Token RESTRICT376=null;
        Token MATCH377=null;

        Object name_tree=null;
        Object ON369_tree=null;
        Object set370_tree=null;
        Object SET371_tree=null;
        Object NULL372_tree=null;
        Object SET373_tree=null;
        Object DEFAULT374_tree=null;
        Object CASCADE375_tree=null;
        Object RESTRICT376_tree=null;
        Object MATCH377_tree=null;

        try {
            // Sql.g:304:3: ( ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT ) | MATCH name= ID )
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==ON) ) {
                alt138=1;
            }
            else if ( (LA138_0==MATCH) ) {
                alt138=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 138, 0, input);

                throw nvae;
            }
            switch (alt138) {
                case 1 :
                    // Sql.g:304:5: ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT )
                    {
                    root_0 = (Object)adaptor.nil();

                    ON369=(Token)match(input,ON,FOLLOW_ON_in_fk_clause_action2712); 
                    ON369_tree = (Object)adaptor.create(ON369);
                    adaptor.addChild(root_0, ON369_tree);

                    set370=(Token)input.LT(1);
                    if ( input.LA(1)==INSERT||input.LA(1)==UPDATE||input.LA(1)==DELETE ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set370));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // Sql.g:304:35: ( SET NULL | SET DEFAULT | CASCADE | RESTRICT )
                    int alt137=4;
                    switch ( input.LA(1) ) {
                    case SET:
                        {
                        int LA137_1 = input.LA(2);

                        if ( (LA137_1==NULL) ) {
                            alt137=1;
                        }
                        else if ( (LA137_1==DEFAULT) ) {
                            alt137=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 137, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case CASCADE:
                        {
                        alt137=3;
                        }
                        break;
                    case RESTRICT:
                        {
                        alt137=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 137, 0, input);

                        throw nvae;
                    }

                    switch (alt137) {
                        case 1 :
                            // Sql.g:304:36: SET NULL
                            {
                            SET371=(Token)match(input,SET,FOLLOW_SET_in_fk_clause_action2727); 
                            SET371_tree = (Object)adaptor.create(SET371);
                            adaptor.addChild(root_0, SET371_tree);

                            NULL372=(Token)match(input,NULL,FOLLOW_NULL_in_fk_clause_action2729); 
                            NULL372_tree = (Object)adaptor.create(NULL372);
                            adaptor.addChild(root_0, NULL372_tree);


                            }
                            break;
                        case 2 :
                            // Sql.g:304:47: SET DEFAULT
                            {
                            SET373=(Token)match(input,SET,FOLLOW_SET_in_fk_clause_action2733); 
                            SET373_tree = (Object)adaptor.create(SET373);
                            adaptor.addChild(root_0, SET373_tree);

                            DEFAULT374=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_fk_clause_action2735); 
                            DEFAULT374_tree = (Object)adaptor.create(DEFAULT374);
                            adaptor.addChild(root_0, DEFAULT374_tree);


                            }
                            break;
                        case 3 :
                            // Sql.g:304:61: CASCADE
                            {
                            CASCADE375=(Token)match(input,CASCADE,FOLLOW_CASCADE_in_fk_clause_action2739); 
                            CASCADE375_tree = (Object)adaptor.create(CASCADE375);
                            adaptor.addChild(root_0, CASCADE375_tree);


                            }
                            break;
                        case 4 :
                            // Sql.g:304:71: RESTRICT
                            {
                            RESTRICT376=(Token)match(input,RESTRICT,FOLLOW_RESTRICT_in_fk_clause_action2743); 
                            RESTRICT376_tree = (Object)adaptor.create(RESTRICT376);
                            adaptor.addChild(root_0, RESTRICT376_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Sql.g:305:5: MATCH name= ID
                    {
                    root_0 = (Object)adaptor.nil();

                    MATCH377=(Token)match(input,MATCH,FOLLOW_MATCH_in_fk_clause_action2750); 
                    MATCH377_tree = (Object)adaptor.create(MATCH377);
                    adaptor.addChild(root_0, MATCH377_tree);

                    name=(Token)match(input,ID,FOLLOW_ID_in_fk_clause_action2754); 
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
    // $ANTLR end "fk_clause_action"

    public static class fk_clause_deferrable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fk_clause_deferrable"
    // Sql.g:307:1: fk_clause_deferrable : ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )? ;
    public final SqlParser.fk_clause_deferrable_return fk_clause_deferrable() throws RecognitionException {
        SqlParser.fk_clause_deferrable_return retval = new SqlParser.fk_clause_deferrable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT378=null;
        Token DEFERRABLE379=null;
        Token INITIALLY380=null;
        Token DEFERRED381=null;
        Token INITIALLY382=null;
        Token IMMEDIATE383=null;

        Object NOT378_tree=null;
        Object DEFERRABLE379_tree=null;
        Object INITIALLY380_tree=null;
        Object DEFERRED381_tree=null;
        Object INITIALLY382_tree=null;
        Object IMMEDIATE383_tree=null;

        try {
            // Sql.g:307:21: ( ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )? )
            // Sql.g:307:23: ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?
            {
            root_0 = (Object)adaptor.nil();

            // Sql.g:307:23: ( NOT )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==NOT) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // Sql.g:307:24: NOT
                    {
                    NOT378=(Token)match(input,NOT,FOLLOW_NOT_in_fk_clause_deferrable2762); 
                    NOT378_tree = (Object)adaptor.create(NOT378);
                    adaptor.addChild(root_0, NOT378_tree);


                    }
                    break;

            }

            DEFERRABLE379=(Token)match(input,DEFERRABLE,FOLLOW_DEFERRABLE_in_fk_clause_deferrable2766); 
            DEFERRABLE379_tree = (Object)adaptor.create(DEFERRABLE379);
            adaptor.addChild(root_0, DEFERRABLE379_tree);

            // Sql.g:307:41: ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?
            int alt140=3;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==INITIALLY) ) {
                int LA140_1 = input.LA(2);

                if ( (LA140_1==DEFERRED) ) {
                    alt140=1;
                }
                else if ( (LA140_1==IMMEDIATE) ) {
                    alt140=2;
                }
            }
            switch (alt140) {
                case 1 :
                    // Sql.g:307:42: INITIALLY DEFERRED
                    {
                    INITIALLY380=(Token)match(input,INITIALLY,FOLLOW_INITIALLY_in_fk_clause_deferrable2769); 
                    INITIALLY380_tree = (Object)adaptor.create(INITIALLY380);
                    adaptor.addChild(root_0, INITIALLY380_tree);

                    DEFERRED381=(Token)match(input,DEFERRED,FOLLOW_DEFERRED_in_fk_clause_deferrable2771); 
                    DEFERRED381_tree = (Object)adaptor.create(DEFERRED381);
                    adaptor.addChild(root_0, DEFERRED381_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:307:63: INITIALLY IMMEDIATE
                    {
                    INITIALLY382=(Token)match(input,INITIALLY,FOLLOW_INITIALLY_in_fk_clause_deferrable2775); 
                    INITIALLY382_tree = (Object)adaptor.create(INITIALLY382);
                    adaptor.addChild(root_0, INITIALLY382_tree);

                    IMMEDIATE383=(Token)match(input,IMMEDIATE,FOLLOW_IMMEDIATE_in_fk_clause_deferrable2777); 
                    IMMEDIATE383_tree = (Object)adaptor.create(IMMEDIATE383);
                    adaptor.addChild(root_0, IMMEDIATE383_tree);


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
    // Sql.g:310:1: drop_table_stmt : DROP TABLE ( IF EXISTS )? (database_name= ID DOT )? table_name= ID ;
    public final SqlParser.drop_table_stmt_return drop_table_stmt() throws RecognitionException {
        SqlParser.drop_table_stmt_return retval = new SqlParser.drop_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token database_name=null;
        Token table_name=null;
        Token DROP384=null;
        Token TABLE385=null;
        Token IF386=null;
        Token EXISTS387=null;
        Token DOT388=null;

        Object database_name_tree=null;
        Object table_name_tree=null;
        Object DROP384_tree=null;
        Object TABLE385_tree=null;
        Object IF386_tree=null;
        Object EXISTS387_tree=null;
        Object DOT388_tree=null;

        try {
            // Sql.g:310:16: ( DROP TABLE ( IF EXISTS )? (database_name= ID DOT )? table_name= ID )
            // Sql.g:310:18: DROP TABLE ( IF EXISTS )? (database_name= ID DOT )? table_name= ID
            {
            root_0 = (Object)adaptor.nil();

            DROP384=(Token)match(input,DROP,FOLLOW_DROP_in_drop_table_stmt2787); 
            DROP384_tree = (Object)adaptor.create(DROP384);
            adaptor.addChild(root_0, DROP384_tree);

            TABLE385=(Token)match(input,TABLE,FOLLOW_TABLE_in_drop_table_stmt2789); 
            TABLE385_tree = (Object)adaptor.create(TABLE385);
            adaptor.addChild(root_0, TABLE385_tree);

            // Sql.g:310:29: ( IF EXISTS )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==IF) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // Sql.g:310:30: IF EXISTS
                    {
                    IF386=(Token)match(input,IF,FOLLOW_IF_in_drop_table_stmt2792); 
                    IF386_tree = (Object)adaptor.create(IF386);
                    adaptor.addChild(root_0, IF386_tree);

                    EXISTS387=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_table_stmt2794); 
                    EXISTS387_tree = (Object)adaptor.create(EXISTS387);
                    adaptor.addChild(root_0, EXISTS387_tree);


                    }
                    break;

            }

            // Sql.g:310:42: (database_name= ID DOT )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==ID) ) {
                int LA142_1 = input.LA(2);

                if ( (LA142_1==DOT) ) {
                    alt142=1;
                }
            }
            switch (alt142) {
                case 1 :
                    // Sql.g:310:43: database_name= ID DOT
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_drop_table_stmt2801); 
                    database_name_tree = (Object)adaptor.create(database_name);
                    adaptor.addChild(root_0, database_name_tree);

                    DOT388=(Token)match(input,DOT,FOLLOW_DOT_in_drop_table_stmt2803); 
                    DOT388_tree = (Object)adaptor.create(DOT388);
                    adaptor.addChild(root_0, DOT388_tree);


                    }
                    break;

            }

            table_name=(Token)match(input,ID,FOLLOW_ID_in_drop_table_stmt2809); 
            table_name_tree = (Object)adaptor.create(table_name);
            adaptor.addChild(root_0, table_name_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:313:1: alter_table_stmt : ALTER TABLE (database_name= ID DOT )? table_name= ID ( RENAME TO new_table_name= ID | ADD ( COLUMN )? column_def ) ;
    public final SqlParser.alter_table_stmt_return alter_table_stmt() throws RecognitionException {
        SqlParser.alter_table_stmt_return retval = new SqlParser.alter_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token database_name=null;
        Token table_name=null;
        Token new_table_name=null;
        Token ALTER389=null;
        Token TABLE390=null;
        Token DOT391=null;
        Token RENAME392=null;
        Token TO393=null;
        Token ADD394=null;
        Token COLUMN395=null;
        SqlParser.column_def_return column_def396 = null;


        Object database_name_tree=null;
        Object table_name_tree=null;
        Object new_table_name_tree=null;
        Object ALTER389_tree=null;
        Object TABLE390_tree=null;
        Object DOT391_tree=null;
        Object RENAME392_tree=null;
        Object TO393_tree=null;
        Object ADD394_tree=null;
        Object COLUMN395_tree=null;

        try {
            // Sql.g:313:17: ( ALTER TABLE (database_name= ID DOT )? table_name= ID ( RENAME TO new_table_name= ID | ADD ( COLUMN )? column_def ) )
            // Sql.g:313:19: ALTER TABLE (database_name= ID DOT )? table_name= ID ( RENAME TO new_table_name= ID | ADD ( COLUMN )? column_def )
            {
            root_0 = (Object)adaptor.nil();

            ALTER389=(Token)match(input,ALTER,FOLLOW_ALTER_in_alter_table_stmt2817); 
            ALTER389_tree = (Object)adaptor.create(ALTER389);
            adaptor.addChild(root_0, ALTER389_tree);

            TABLE390=(Token)match(input,TABLE,FOLLOW_TABLE_in_alter_table_stmt2819); 
            TABLE390_tree = (Object)adaptor.create(TABLE390);
            adaptor.addChild(root_0, TABLE390_tree);

            // Sql.g:313:31: (database_name= ID DOT )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==ID) ) {
                int LA143_1 = input.LA(2);

                if ( (LA143_1==DOT) ) {
                    alt143=1;
                }
            }
            switch (alt143) {
                case 1 :
                    // Sql.g:313:32: database_name= ID DOT
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_alter_table_stmt2824); 
                    database_name_tree = (Object)adaptor.create(database_name);
                    adaptor.addChild(root_0, database_name_tree);

                    DOT391=(Token)match(input,DOT,FOLLOW_DOT_in_alter_table_stmt2826); 
                    DOT391_tree = (Object)adaptor.create(DOT391);
                    adaptor.addChild(root_0, DOT391_tree);


                    }
                    break;

            }

            table_name=(Token)match(input,ID,FOLLOW_ID_in_alter_table_stmt2832); 
            table_name_tree = (Object)adaptor.create(table_name);
            adaptor.addChild(root_0, table_name_tree);

            // Sql.g:313:69: ( RENAME TO new_table_name= ID | ADD ( COLUMN )? column_def )
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==RENAME) ) {
                alt145=1;
            }
            else if ( (LA145_0==ADD) ) {
                alt145=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 145, 0, input);

                throw nvae;
            }
            switch (alt145) {
                case 1 :
                    // Sql.g:313:70: RENAME TO new_table_name= ID
                    {
                    RENAME392=(Token)match(input,RENAME,FOLLOW_RENAME_in_alter_table_stmt2835); 
                    RENAME392_tree = (Object)adaptor.create(RENAME392);
                    adaptor.addChild(root_0, RENAME392_tree);

                    TO393=(Token)match(input,TO,FOLLOW_TO_in_alter_table_stmt2837); 
                    TO393_tree = (Object)adaptor.create(TO393);
                    adaptor.addChild(root_0, TO393_tree);

                    new_table_name=(Token)match(input,ID,FOLLOW_ID_in_alter_table_stmt2841); 
                    new_table_name_tree = (Object)adaptor.create(new_table_name);
                    adaptor.addChild(root_0, new_table_name_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:313:100: ADD ( COLUMN )? column_def
                    {
                    ADD394=(Token)match(input,ADD,FOLLOW_ADD_in_alter_table_stmt2845); 
                    ADD394_tree = (Object)adaptor.create(ADD394);
                    adaptor.addChild(root_0, ADD394_tree);

                    // Sql.g:313:104: ( COLUMN )?
                    int alt144=2;
                    int LA144_0 = input.LA(1);

                    if ( (LA144_0==COLUMN) ) {
                        alt144=1;
                    }
                    switch (alt144) {
                        case 1 :
                            // Sql.g:313:105: COLUMN
                            {
                            COLUMN395=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_alter_table_stmt2848); 
                            COLUMN395_tree = (Object)adaptor.create(COLUMN395);
                            adaptor.addChild(root_0, COLUMN395_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_column_def_in_alter_table_stmt2852);
                    column_def396=column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, column_def396.getTree());

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
    // Sql.g:316:1: create_view_stmt : CREATE ( TEMP | TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= ID DOT )? view_name= ID AS select_stmt ;
    public final SqlParser.create_view_stmt_return create_view_stmt() throws RecognitionException {
        SqlParser.create_view_stmt_return retval = new SqlParser.create_view_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token database_name=null;
        Token view_name=null;
        Token CREATE397=null;
        Token set398=null;
        Token VIEW399=null;
        Token IF400=null;
        Token NOT401=null;
        Token EXISTS402=null;
        Token DOT403=null;
        Token AS404=null;
        SqlParser.select_stmt_return select_stmt405 = null;


        Object database_name_tree=null;
        Object view_name_tree=null;
        Object CREATE397_tree=null;
        Object set398_tree=null;
        Object VIEW399_tree=null;
        Object IF400_tree=null;
        Object NOT401_tree=null;
        Object EXISTS402_tree=null;
        Object DOT403_tree=null;
        Object AS404_tree=null;

        try {
            // Sql.g:316:17: ( CREATE ( TEMP | TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= ID DOT )? view_name= ID AS select_stmt )
            // Sql.g:316:19: CREATE ( TEMP | TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= ID DOT )? view_name= ID AS select_stmt
            {
            root_0 = (Object)adaptor.nil();

            CREATE397=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_view_stmt2861); 
            CREATE397_tree = (Object)adaptor.create(CREATE397);
            adaptor.addChild(root_0, CREATE397_tree);

            // Sql.g:316:26: ( TEMP | TEMPORARY )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( ((LA146_0>=TEMP && LA146_0<=TEMPORARY)) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // Sql.g:
                    {
                    set398=(Token)input.LT(1);
                    if ( (input.LA(1)>=TEMP && input.LA(1)<=TEMPORARY) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set398));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            VIEW399=(Token)match(input,VIEW,FOLLOW_VIEW_in_create_view_stmt2872); 
            VIEW399_tree = (Object)adaptor.create(VIEW399);
            adaptor.addChild(root_0, VIEW399_tree);

            // Sql.g:316:51: ( IF NOT EXISTS )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==IF) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // Sql.g:316:52: IF NOT EXISTS
                    {
                    IF400=(Token)match(input,IF,FOLLOW_IF_in_create_view_stmt2875); 
                    IF400_tree = (Object)adaptor.create(IF400);
                    adaptor.addChild(root_0, IF400_tree);

                    NOT401=(Token)match(input,NOT,FOLLOW_NOT_in_create_view_stmt2877); 
                    NOT401_tree = (Object)adaptor.create(NOT401);
                    adaptor.addChild(root_0, NOT401_tree);

                    EXISTS402=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_view_stmt2879); 
                    EXISTS402_tree = (Object)adaptor.create(EXISTS402);
                    adaptor.addChild(root_0, EXISTS402_tree);


                    }
                    break;

            }

            // Sql.g:316:68: (database_name= ID DOT )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==ID) ) {
                int LA148_1 = input.LA(2);

                if ( (LA148_1==DOT) ) {
                    alt148=1;
                }
            }
            switch (alt148) {
                case 1 :
                    // Sql.g:316:69: database_name= ID DOT
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_create_view_stmt2886); 
                    database_name_tree = (Object)adaptor.create(database_name);
                    adaptor.addChild(root_0, database_name_tree);

                    DOT403=(Token)match(input,DOT,FOLLOW_DOT_in_create_view_stmt2888); 
                    DOT403_tree = (Object)adaptor.create(DOT403);
                    adaptor.addChild(root_0, DOT403_tree);


                    }
                    break;

            }

            view_name=(Token)match(input,ID,FOLLOW_ID_in_create_view_stmt2894); 
            view_name_tree = (Object)adaptor.create(view_name);
            adaptor.addChild(root_0, view_name_tree);

            AS404=(Token)match(input,AS,FOLLOW_AS_in_create_view_stmt2896); 
            AS404_tree = (Object)adaptor.create(AS404);
            adaptor.addChild(root_0, AS404_tree);

            pushFollow(FOLLOW_select_stmt_in_create_view_stmt2898);
            select_stmt405=select_stmt();

            state._fsp--;

            adaptor.addChild(root_0, select_stmt405.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:319:1: drop_view_stmt : DROP VIEW ( IF EXISTS )? (database_name= ID DOT )? view_name= ID ;
    public final SqlParser.drop_view_stmt_return drop_view_stmt() throws RecognitionException {
        SqlParser.drop_view_stmt_return retval = new SqlParser.drop_view_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token database_name=null;
        Token view_name=null;
        Token DROP406=null;
        Token VIEW407=null;
        Token IF408=null;
        Token EXISTS409=null;
        Token DOT410=null;

        Object database_name_tree=null;
        Object view_name_tree=null;
        Object DROP406_tree=null;
        Object VIEW407_tree=null;
        Object IF408_tree=null;
        Object EXISTS409_tree=null;
        Object DOT410_tree=null;

        try {
            // Sql.g:319:15: ( DROP VIEW ( IF EXISTS )? (database_name= ID DOT )? view_name= ID )
            // Sql.g:319:17: DROP VIEW ( IF EXISTS )? (database_name= ID DOT )? view_name= ID
            {
            root_0 = (Object)adaptor.nil();

            DROP406=(Token)match(input,DROP,FOLLOW_DROP_in_drop_view_stmt2906); 
            DROP406_tree = (Object)adaptor.create(DROP406);
            adaptor.addChild(root_0, DROP406_tree);

            VIEW407=(Token)match(input,VIEW,FOLLOW_VIEW_in_drop_view_stmt2908); 
            VIEW407_tree = (Object)adaptor.create(VIEW407);
            adaptor.addChild(root_0, VIEW407_tree);

            // Sql.g:319:27: ( IF EXISTS )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==IF) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // Sql.g:319:28: IF EXISTS
                    {
                    IF408=(Token)match(input,IF,FOLLOW_IF_in_drop_view_stmt2911); 
                    IF408_tree = (Object)adaptor.create(IF408);
                    adaptor.addChild(root_0, IF408_tree);

                    EXISTS409=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_view_stmt2913); 
                    EXISTS409_tree = (Object)adaptor.create(EXISTS409);
                    adaptor.addChild(root_0, EXISTS409_tree);


                    }
                    break;

            }

            // Sql.g:319:40: (database_name= ID DOT )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==ID) ) {
                int LA150_1 = input.LA(2);

                if ( (LA150_1==DOT) ) {
                    alt150=1;
                }
            }
            switch (alt150) {
                case 1 :
                    // Sql.g:319:41: database_name= ID DOT
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_drop_view_stmt2920); 
                    database_name_tree = (Object)adaptor.create(database_name);
                    adaptor.addChild(root_0, database_name_tree);

                    DOT410=(Token)match(input,DOT,FOLLOW_DOT_in_drop_view_stmt2922); 
                    DOT410_tree = (Object)adaptor.create(DOT410);
                    adaptor.addChild(root_0, DOT410_tree);


                    }
                    break;

            }

            view_name=(Token)match(input,ID,FOLLOW_ID_in_drop_view_stmt2928); 
            view_name_tree = (Object)adaptor.create(view_name);
            adaptor.addChild(root_0, view_name_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:322:1: create_index_stmt : CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= ID DOT )? index_name= ID ON table_name= ID LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN ;
    public final SqlParser.create_index_stmt_return create_index_stmt() throws RecognitionException {
        SqlParser.create_index_stmt_return retval = new SqlParser.create_index_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token database_name=null;
        Token index_name=null;
        Token table_name=null;
        Token CREATE411=null;
        Token UNIQUE412=null;
        Token INDEX413=null;
        Token IF414=null;
        Token NOT415=null;
        Token EXISTS416=null;
        Token DOT417=null;
        Token ON418=null;
        Token LPAREN419=null;
        Token COMMA420=null;
        Token RPAREN421=null;
        List list_columns=null;
        SqlParser.indexed_column_return columns = null;
         columns = null;
        Object database_name_tree=null;
        Object index_name_tree=null;
        Object table_name_tree=null;
        Object CREATE411_tree=null;
        Object UNIQUE412_tree=null;
        Object INDEX413_tree=null;
        Object IF414_tree=null;
        Object NOT415_tree=null;
        Object EXISTS416_tree=null;
        Object DOT417_tree=null;
        Object ON418_tree=null;
        Object LPAREN419_tree=null;
        Object COMMA420_tree=null;
        Object RPAREN421_tree=null;

        try {
            // Sql.g:322:18: ( CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= ID DOT )? index_name= ID ON table_name= ID LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN )
            // Sql.g:322:20: CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= ID DOT )? index_name= ID ON table_name= ID LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN
            {
            root_0 = (Object)adaptor.nil();

            CREATE411=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_index_stmt2936); 
            CREATE411_tree = (Object)adaptor.create(CREATE411);
            adaptor.addChild(root_0, CREATE411_tree);

            // Sql.g:322:27: ( UNIQUE )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==UNIQUE) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // Sql.g:322:28: UNIQUE
                    {
                    UNIQUE412=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_create_index_stmt2939); 
                    UNIQUE412_tree = (Object)adaptor.create(UNIQUE412);
                    adaptor.addChild(root_0, UNIQUE412_tree);


                    }
                    break;

            }

            INDEX413=(Token)match(input,INDEX,FOLLOW_INDEX_in_create_index_stmt2943); 
            INDEX413_tree = (Object)adaptor.create(INDEX413);
            adaptor.addChild(root_0, INDEX413_tree);

            // Sql.g:322:43: ( IF NOT EXISTS )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==IF) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // Sql.g:322:44: IF NOT EXISTS
                    {
                    IF414=(Token)match(input,IF,FOLLOW_IF_in_create_index_stmt2946); 
                    IF414_tree = (Object)adaptor.create(IF414);
                    adaptor.addChild(root_0, IF414_tree);

                    NOT415=(Token)match(input,NOT,FOLLOW_NOT_in_create_index_stmt2948); 
                    NOT415_tree = (Object)adaptor.create(NOT415);
                    adaptor.addChild(root_0, NOT415_tree);

                    EXISTS416=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_index_stmt2950); 
                    EXISTS416_tree = (Object)adaptor.create(EXISTS416);
                    adaptor.addChild(root_0, EXISTS416_tree);


                    }
                    break;

            }

            // Sql.g:322:60: (database_name= ID DOT )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==ID) ) {
                int LA153_1 = input.LA(2);

                if ( (LA153_1==DOT) ) {
                    alt153=1;
                }
            }
            switch (alt153) {
                case 1 :
                    // Sql.g:322:61: database_name= ID DOT
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_create_index_stmt2957); 
                    database_name_tree = (Object)adaptor.create(database_name);
                    adaptor.addChild(root_0, database_name_tree);

                    DOT417=(Token)match(input,DOT,FOLLOW_DOT_in_create_index_stmt2959); 
                    DOT417_tree = (Object)adaptor.create(DOT417);
                    adaptor.addChild(root_0, DOT417_tree);


                    }
                    break;

            }

            index_name=(Token)match(input,ID,FOLLOW_ID_in_create_index_stmt2965); 
            index_name_tree = (Object)adaptor.create(index_name);
            adaptor.addChild(root_0, index_name_tree);

            ON418=(Token)match(input,ON,FOLLOW_ON_in_create_index_stmt2969); 
            ON418_tree = (Object)adaptor.create(ON418);
            adaptor.addChild(root_0, ON418_tree);

            table_name=(Token)match(input,ID,FOLLOW_ID_in_create_index_stmt2973); 
            table_name_tree = (Object)adaptor.create(table_name);
            adaptor.addChild(root_0, table_name_tree);

            LPAREN419=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_index_stmt2975); 
            LPAREN419_tree = (Object)adaptor.create(LPAREN419);
            adaptor.addChild(root_0, LPAREN419_tree);

            pushFollow(FOLLOW_indexed_column_in_create_index_stmt2979);
            columns=indexed_column();

            state._fsp--;

            adaptor.addChild(root_0, columns.getTree());
            if (list_columns==null) list_columns=new ArrayList();
            list_columns.add(columns.getTree());

            // Sql.g:323:51: ( COMMA columns+= indexed_column )*
            loop154:
            do {
                int alt154=2;
                int LA154_0 = input.LA(1);

                if ( (LA154_0==COMMA) ) {
                    alt154=1;
                }


                switch (alt154) {
            	case 1 :
            	    // Sql.g:323:52: COMMA columns+= indexed_column
            	    {
            	    COMMA420=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_index_stmt2982); 
            	    COMMA420_tree = (Object)adaptor.create(COMMA420);
            	    adaptor.addChild(root_0, COMMA420_tree);

            	    pushFollow(FOLLOW_indexed_column_in_create_index_stmt2986);
            	    columns=indexed_column();

            	    state._fsp--;

            	    adaptor.addChild(root_0, columns.getTree());
            	    if (list_columns==null) list_columns=new ArrayList();
            	    list_columns.add(columns.getTree());


            	    }
            	    break;

            	default :
            	    break loop154;
                }
            } while (true);

            RPAREN421=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_index_stmt2990); 
            RPAREN421_tree = (Object)adaptor.create(RPAREN421);
            adaptor.addChild(root_0, RPAREN421_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:325:1: indexed_column : column_name= ID ( COLLATE collation_name= ID )? ( ASC | DESC )? ;
    public final SqlParser.indexed_column_return indexed_column() throws RecognitionException {
        SqlParser.indexed_column_return retval = new SqlParser.indexed_column_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token column_name=null;
        Token collation_name=null;
        Token COLLATE422=null;
        Token set423=null;

        Object column_name_tree=null;
        Object collation_name_tree=null;
        Object COLLATE422_tree=null;
        Object set423_tree=null;

        try {
            // Sql.g:325:15: (column_name= ID ( COLLATE collation_name= ID )? ( ASC | DESC )? )
            // Sql.g:325:17: column_name= ID ( COLLATE collation_name= ID )? ( ASC | DESC )?
            {
            root_0 = (Object)adaptor.nil();

            column_name=(Token)match(input,ID,FOLLOW_ID_in_indexed_column2999); 
            column_name_tree = (Object)adaptor.create(column_name);
            adaptor.addChild(root_0, column_name_tree);

            // Sql.g:325:32: ( COLLATE collation_name= ID )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==COLLATE) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // Sql.g:325:33: COLLATE collation_name= ID
                    {
                    COLLATE422=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_indexed_column3002); 
                    COLLATE422_tree = (Object)adaptor.create(COLLATE422);
                    adaptor.addChild(root_0, COLLATE422_tree);

                    collation_name=(Token)match(input,ID,FOLLOW_ID_in_indexed_column3006); 
                    collation_name_tree = (Object)adaptor.create(collation_name);
                    adaptor.addChild(root_0, collation_name_tree);


                    }
                    break;

            }

            // Sql.g:325:61: ( ASC | DESC )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( ((LA156_0>=ASC && LA156_0<=DESC)) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // Sql.g:
                    {
                    set423=(Token)input.LT(1);
                    if ( (input.LA(1)>=ASC && input.LA(1)<=DESC) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set423));
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
    // Sql.g:328:1: drop_index_stmt : DROP INDEX ( IF EXISTS )? (database_name= ID DOT )? index_name= ID ;
    public final SqlParser.drop_index_stmt_return drop_index_stmt() throws RecognitionException {
        SqlParser.drop_index_stmt_return retval = new SqlParser.drop_index_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token database_name=null;
        Token index_name=null;
        Token DROP424=null;
        Token INDEX425=null;
        Token IF426=null;
        Token EXISTS427=null;
        Token DOT428=null;

        Object database_name_tree=null;
        Object index_name_tree=null;
        Object DROP424_tree=null;
        Object INDEX425_tree=null;
        Object IF426_tree=null;
        Object EXISTS427_tree=null;
        Object DOT428_tree=null;

        try {
            // Sql.g:328:16: ( DROP INDEX ( IF EXISTS )? (database_name= ID DOT )? index_name= ID )
            // Sql.g:328:18: DROP INDEX ( IF EXISTS )? (database_name= ID DOT )? index_name= ID
            {
            root_0 = (Object)adaptor.nil();

            DROP424=(Token)match(input,DROP,FOLLOW_DROP_in_drop_index_stmt3025); 
            DROP424_tree = (Object)adaptor.create(DROP424);
            adaptor.addChild(root_0, DROP424_tree);

            INDEX425=(Token)match(input,INDEX,FOLLOW_INDEX_in_drop_index_stmt3027); 
            INDEX425_tree = (Object)adaptor.create(INDEX425);
            adaptor.addChild(root_0, INDEX425_tree);

            // Sql.g:328:29: ( IF EXISTS )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==IF) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // Sql.g:328:30: IF EXISTS
                    {
                    IF426=(Token)match(input,IF,FOLLOW_IF_in_drop_index_stmt3030); 
                    IF426_tree = (Object)adaptor.create(IF426);
                    adaptor.addChild(root_0, IF426_tree);

                    EXISTS427=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_index_stmt3032); 
                    EXISTS427_tree = (Object)adaptor.create(EXISTS427);
                    adaptor.addChild(root_0, EXISTS427_tree);


                    }
                    break;

            }

            // Sql.g:328:42: (database_name= ID DOT )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==ID) ) {
                int LA158_1 = input.LA(2);

                if ( (LA158_1==DOT) ) {
                    alt158=1;
                }
            }
            switch (alt158) {
                case 1 :
                    // Sql.g:328:43: database_name= ID DOT
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_drop_index_stmt3039); 
                    database_name_tree = (Object)adaptor.create(database_name);
                    adaptor.addChild(root_0, database_name_tree);

                    DOT428=(Token)match(input,DOT,FOLLOW_DOT_in_drop_index_stmt3041); 
                    DOT428_tree = (Object)adaptor.create(DOT428);
                    adaptor.addChild(root_0, DOT428_tree);


                    }
                    break;

            }

            index_name=(Token)match(input,ID,FOLLOW_ID_in_drop_index_stmt3047); 
            index_name_tree = (Object)adaptor.create(index_name);
            adaptor.addChild(root_0, index_name_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:331:1: create_trigger_stmt : CREATE ( TEMP | TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= ID DOT )? trigger_name= ID ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= ID ( COMMA column_names+= ID )* )? ) ON table_name= ID ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END ;
    public final SqlParser.create_trigger_stmt_return create_trigger_stmt() throws RecognitionException {
        SqlParser.create_trigger_stmt_return retval = new SqlParser.create_trigger_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token database_name=null;
        Token trigger_name=null;
        Token table_name=null;
        Token CREATE429=null;
        Token set430=null;
        Token TRIGGER431=null;
        Token IF432=null;
        Token NOT433=null;
        Token EXISTS434=null;
        Token DOT435=null;
        Token BEFORE436=null;
        Token AFTER437=null;
        Token INSTEAD438=null;
        Token OF439=null;
        Token DELETE440=null;
        Token INSERT441=null;
        Token UPDATE442=null;
        Token OF443=null;
        Token COMMA444=null;
        Token ON445=null;
        Token FOR446=null;
        Token EACH447=null;
        Token ROW448=null;
        Token WHEN449=null;
        Token BEGIN451=null;
        Token SEMI456=null;
        Token END457=null;
        Token column_names=null;
        List list_column_names=null;
        SqlParser.expr_return expr450 = null;

        SqlParser.update_stmt_return update_stmt452 = null;

        SqlParser.insert_stmt_return insert_stmt453 = null;

        SqlParser.delete_stmt_return delete_stmt454 = null;

        SqlParser.select_stmt_return select_stmt455 = null;


        Object database_name_tree=null;
        Object trigger_name_tree=null;
        Object table_name_tree=null;
        Object CREATE429_tree=null;
        Object set430_tree=null;
        Object TRIGGER431_tree=null;
        Object IF432_tree=null;
        Object NOT433_tree=null;
        Object EXISTS434_tree=null;
        Object DOT435_tree=null;
        Object BEFORE436_tree=null;
        Object AFTER437_tree=null;
        Object INSTEAD438_tree=null;
        Object OF439_tree=null;
        Object DELETE440_tree=null;
        Object INSERT441_tree=null;
        Object UPDATE442_tree=null;
        Object OF443_tree=null;
        Object COMMA444_tree=null;
        Object ON445_tree=null;
        Object FOR446_tree=null;
        Object EACH447_tree=null;
        Object ROW448_tree=null;
        Object WHEN449_tree=null;
        Object BEGIN451_tree=null;
        Object SEMI456_tree=null;
        Object END457_tree=null;
        Object column_names_tree=null;

        try {
            // Sql.g:331:20: ( CREATE ( TEMP | TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= ID DOT )? trigger_name= ID ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= ID ( COMMA column_names+= ID )* )? ) ON table_name= ID ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END )
            // Sql.g:331:22: CREATE ( TEMP | TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= ID DOT )? trigger_name= ID ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= ID ( COMMA column_names+= ID )* )? ) ON table_name= ID ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END
            {
            root_0 = (Object)adaptor.nil();

            CREATE429=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_trigger_stmt3055); 
            CREATE429_tree = (Object)adaptor.create(CREATE429);
            adaptor.addChild(root_0, CREATE429_tree);

            // Sql.g:331:29: ( TEMP | TEMPORARY )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( ((LA159_0>=TEMP && LA159_0<=TEMPORARY)) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // Sql.g:
                    {
                    set430=(Token)input.LT(1);
                    if ( (input.LA(1)>=TEMP && input.LA(1)<=TEMPORARY) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set430));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            TRIGGER431=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_create_trigger_stmt3066); 
            TRIGGER431_tree = (Object)adaptor.create(TRIGGER431);
            adaptor.addChild(root_0, TRIGGER431_tree);

            // Sql.g:331:57: ( IF NOT EXISTS )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==IF) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // Sql.g:331:58: IF NOT EXISTS
                    {
                    IF432=(Token)match(input,IF,FOLLOW_IF_in_create_trigger_stmt3069); 
                    IF432_tree = (Object)adaptor.create(IF432);
                    adaptor.addChild(root_0, IF432_tree);

                    NOT433=(Token)match(input,NOT,FOLLOW_NOT_in_create_trigger_stmt3071); 
                    NOT433_tree = (Object)adaptor.create(NOT433);
                    adaptor.addChild(root_0, NOT433_tree);

                    EXISTS434=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_trigger_stmt3073); 
                    EXISTS434_tree = (Object)adaptor.create(EXISTS434);
                    adaptor.addChild(root_0, EXISTS434_tree);


                    }
                    break;

            }

            // Sql.g:331:74: (database_name= ID DOT )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==ID) ) {
                int LA161_1 = input.LA(2);

                if ( (LA161_1==DOT) ) {
                    alt161=1;
                }
            }
            switch (alt161) {
                case 1 :
                    // Sql.g:331:75: database_name= ID DOT
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_create_trigger_stmt3080); 
                    database_name_tree = (Object)adaptor.create(database_name);
                    adaptor.addChild(root_0, database_name_tree);

                    DOT435=(Token)match(input,DOT,FOLLOW_DOT_in_create_trigger_stmt3082); 
                    DOT435_tree = (Object)adaptor.create(DOT435);
                    adaptor.addChild(root_0, DOT435_tree);


                    }
                    break;

            }

            trigger_name=(Token)match(input,ID,FOLLOW_ID_in_create_trigger_stmt3088); 
            trigger_name_tree = (Object)adaptor.create(trigger_name);
            adaptor.addChild(root_0, trigger_name_tree);

            // Sql.g:332:3: ( BEFORE | AFTER | INSTEAD OF )?
            int alt162=4;
            switch ( input.LA(1) ) {
                case BEFORE:
                    {
                    alt162=1;
                    }
                    break;
                case AFTER:
                    {
                    alt162=2;
                    }
                    break;
                case INSTEAD:
                    {
                    alt162=3;
                    }
                    break;
            }

            switch (alt162) {
                case 1 :
                    // Sql.g:332:4: BEFORE
                    {
                    BEFORE436=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_create_trigger_stmt3093); 
                    BEFORE436_tree = (Object)adaptor.create(BEFORE436);
                    adaptor.addChild(root_0, BEFORE436_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:332:13: AFTER
                    {
                    AFTER437=(Token)match(input,AFTER,FOLLOW_AFTER_in_create_trigger_stmt3097); 
                    AFTER437_tree = (Object)adaptor.create(AFTER437);
                    adaptor.addChild(root_0, AFTER437_tree);


                    }
                    break;
                case 3 :
                    // Sql.g:332:21: INSTEAD OF
                    {
                    INSTEAD438=(Token)match(input,INSTEAD,FOLLOW_INSTEAD_in_create_trigger_stmt3101); 
                    INSTEAD438_tree = (Object)adaptor.create(INSTEAD438);
                    adaptor.addChild(root_0, INSTEAD438_tree);

                    OF439=(Token)match(input,OF,FOLLOW_OF_in_create_trigger_stmt3103); 
                    OF439_tree = (Object)adaptor.create(OF439);
                    adaptor.addChild(root_0, OF439_tree);


                    }
                    break;

            }

            // Sql.g:332:34: ( DELETE | INSERT | UPDATE ( OF column_names+= ID ( COMMA column_names+= ID )* )? )
            int alt165=3;
            switch ( input.LA(1) ) {
            case DELETE:
                {
                alt165=1;
                }
                break;
            case INSERT:
                {
                alt165=2;
                }
                break;
            case UPDATE:
                {
                alt165=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 165, 0, input);

                throw nvae;
            }

            switch (alt165) {
                case 1 :
                    // Sql.g:332:35: DELETE
                    {
                    DELETE440=(Token)match(input,DELETE,FOLLOW_DELETE_in_create_trigger_stmt3108); 
                    DELETE440_tree = (Object)adaptor.create(DELETE440);
                    adaptor.addChild(root_0, DELETE440_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:332:44: INSERT
                    {
                    INSERT441=(Token)match(input,INSERT,FOLLOW_INSERT_in_create_trigger_stmt3112); 
                    INSERT441_tree = (Object)adaptor.create(INSERT441);
                    adaptor.addChild(root_0, INSERT441_tree);


                    }
                    break;
                case 3 :
                    // Sql.g:332:53: UPDATE ( OF column_names+= ID ( COMMA column_names+= ID )* )?
                    {
                    UPDATE442=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_create_trigger_stmt3116); 
                    UPDATE442_tree = (Object)adaptor.create(UPDATE442);
                    adaptor.addChild(root_0, UPDATE442_tree);

                    // Sql.g:332:60: ( OF column_names+= ID ( COMMA column_names+= ID )* )?
                    int alt164=2;
                    int LA164_0 = input.LA(1);

                    if ( (LA164_0==OF) ) {
                        alt164=1;
                    }
                    switch (alt164) {
                        case 1 :
                            // Sql.g:332:61: OF column_names+= ID ( COMMA column_names+= ID )*
                            {
                            OF443=(Token)match(input,OF,FOLLOW_OF_in_create_trigger_stmt3119); 
                            OF443_tree = (Object)adaptor.create(OF443);
                            adaptor.addChild(root_0, OF443_tree);

                            column_names=(Token)match(input,ID,FOLLOW_ID_in_create_trigger_stmt3123); 
                            column_names_tree = (Object)adaptor.create(column_names);
                            adaptor.addChild(root_0, column_names_tree);

                            if (list_column_names==null) list_column_names=new ArrayList();
                            list_column_names.add(column_names);

                            // Sql.g:332:81: ( COMMA column_names+= ID )*
                            loop163:
                            do {
                                int alt163=2;
                                int LA163_0 = input.LA(1);

                                if ( (LA163_0==COMMA) ) {
                                    alt163=1;
                                }


                                switch (alt163) {
                            	case 1 :
                            	    // Sql.g:332:82: COMMA column_names+= ID
                            	    {
                            	    COMMA444=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_trigger_stmt3126); 
                            	    COMMA444_tree = (Object)adaptor.create(COMMA444);
                            	    adaptor.addChild(root_0, COMMA444_tree);

                            	    column_names=(Token)match(input,ID,FOLLOW_ID_in_create_trigger_stmt3130); 
                            	    column_names_tree = (Object)adaptor.create(column_names);
                            	    adaptor.addChild(root_0, column_names_tree);

                            	    if (list_column_names==null) list_column_names=new ArrayList();
                            	    list_column_names.add(column_names);


                            	    }
                            	    break;

                            	default :
                            	    break loop163;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            ON445=(Token)match(input,ON,FOLLOW_ON_in_create_trigger_stmt3139); 
            ON445_tree = (Object)adaptor.create(ON445);
            adaptor.addChild(root_0, ON445_tree);

            table_name=(Token)match(input,ID,FOLLOW_ID_in_create_trigger_stmt3143); 
            table_name_tree = (Object)adaptor.create(table_name);
            adaptor.addChild(root_0, table_name_tree);

            // Sql.g:333:20: ( FOR EACH ROW )?
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==FOR) ) {
                alt166=1;
            }
            switch (alt166) {
                case 1 :
                    // Sql.g:333:21: FOR EACH ROW
                    {
                    FOR446=(Token)match(input,FOR,FOLLOW_FOR_in_create_trigger_stmt3146); 
                    FOR446_tree = (Object)adaptor.create(FOR446);
                    adaptor.addChild(root_0, FOR446_tree);

                    EACH447=(Token)match(input,EACH,FOLLOW_EACH_in_create_trigger_stmt3148); 
                    EACH447_tree = (Object)adaptor.create(EACH447);
                    adaptor.addChild(root_0, EACH447_tree);

                    ROW448=(Token)match(input,ROW,FOLLOW_ROW_in_create_trigger_stmt3150); 
                    ROW448_tree = (Object)adaptor.create(ROW448);
                    adaptor.addChild(root_0, ROW448_tree);


                    }
                    break;

            }

            // Sql.g:333:36: ( WHEN expr )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==WHEN) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // Sql.g:333:37: WHEN expr
                    {
                    WHEN449=(Token)match(input,WHEN,FOLLOW_WHEN_in_create_trigger_stmt3155); 
                    WHEN449_tree = (Object)adaptor.create(WHEN449);
                    adaptor.addChild(root_0, WHEN449_tree);

                    pushFollow(FOLLOW_expr_in_create_trigger_stmt3157);
                    expr450=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr450.getTree());

                    }
                    break;

            }

            BEGIN451=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_create_trigger_stmt3163); 
            BEGIN451_tree = (Object)adaptor.create(BEGIN451);
            adaptor.addChild(root_0, BEGIN451_tree);

            // Sql.g:334:9: ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+
            int cnt169=0;
            loop169:
            do {
                int alt169=2;
                int LA169_0 = input.LA(1);

                if ( (LA169_0==REPLACE||LA169_0==SELECT||LA169_0==INSERT||LA169_0==UPDATE||LA169_0==DELETE) ) {
                    alt169=1;
                }


                switch (alt169) {
            	case 1 :
            	    // Sql.g:334:10: ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI
            	    {
            	    // Sql.g:334:10: ( update_stmt | insert_stmt | delete_stmt | select_stmt )
            	    int alt168=4;
            	    switch ( input.LA(1) ) {
            	    case UPDATE:
            	        {
            	        alt168=1;
            	        }
            	        break;
            	    case REPLACE:
            	    case INSERT:
            	        {
            	        alt168=2;
            	        }
            	        break;
            	    case DELETE:
            	        {
            	        alt168=3;
            	        }
            	        break;
            	    case SELECT:
            	        {
            	        alt168=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 168, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt168) {
            	        case 1 :
            	            // Sql.g:334:11: update_stmt
            	            {
            	            pushFollow(FOLLOW_update_stmt_in_create_trigger_stmt3167);
            	            update_stmt452=update_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, update_stmt452.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // Sql.g:334:25: insert_stmt
            	            {
            	            pushFollow(FOLLOW_insert_stmt_in_create_trigger_stmt3171);
            	            insert_stmt453=insert_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, insert_stmt453.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // Sql.g:334:39: delete_stmt
            	            {
            	            pushFollow(FOLLOW_delete_stmt_in_create_trigger_stmt3175);
            	            delete_stmt454=delete_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, delete_stmt454.getTree());

            	            }
            	            break;
            	        case 4 :
            	            // Sql.g:334:53: select_stmt
            	            {
            	            pushFollow(FOLLOW_select_stmt_in_create_trigger_stmt3179);
            	            select_stmt455=select_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, select_stmt455.getTree());

            	            }
            	            break;

            	    }

            	    SEMI456=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_trigger_stmt3182); 
            	    SEMI456_tree = (Object)adaptor.create(SEMI456);
            	    adaptor.addChild(root_0, SEMI456_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt169 >= 1 ) break loop169;
                        EarlyExitException eee =
                            new EarlyExitException(169, input);
                        throw eee;
                }
                cnt169++;
            } while (true);

            END457=(Token)match(input,END,FOLLOW_END_in_create_trigger_stmt3186); 
            END457_tree = (Object)adaptor.create(END457);
            adaptor.addChild(root_0, END457_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:337:1: drop_trigger_stmt : DROP TRIGGER ( IF EXISTS )? (database_name= ID DOT )? trigger_name= ID ;
    public final SqlParser.drop_trigger_stmt_return drop_trigger_stmt() throws RecognitionException {
        SqlParser.drop_trigger_stmt_return retval = new SqlParser.drop_trigger_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token database_name=null;
        Token trigger_name=null;
        Token DROP458=null;
        Token TRIGGER459=null;
        Token IF460=null;
        Token EXISTS461=null;
        Token DOT462=null;

        Object database_name_tree=null;
        Object trigger_name_tree=null;
        Object DROP458_tree=null;
        Object TRIGGER459_tree=null;
        Object IF460_tree=null;
        Object EXISTS461_tree=null;
        Object DOT462_tree=null;

        try {
            // Sql.g:337:18: ( DROP TRIGGER ( IF EXISTS )? (database_name= ID DOT )? trigger_name= ID )
            // Sql.g:337:20: DROP TRIGGER ( IF EXISTS )? (database_name= ID DOT )? trigger_name= ID
            {
            root_0 = (Object)adaptor.nil();

            DROP458=(Token)match(input,DROP,FOLLOW_DROP_in_drop_trigger_stmt3194); 
            DROP458_tree = (Object)adaptor.create(DROP458);
            adaptor.addChild(root_0, DROP458_tree);

            TRIGGER459=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_drop_trigger_stmt3196); 
            TRIGGER459_tree = (Object)adaptor.create(TRIGGER459);
            adaptor.addChild(root_0, TRIGGER459_tree);

            // Sql.g:337:33: ( IF EXISTS )?
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==IF) ) {
                alt170=1;
            }
            switch (alt170) {
                case 1 :
                    // Sql.g:337:34: IF EXISTS
                    {
                    IF460=(Token)match(input,IF,FOLLOW_IF_in_drop_trigger_stmt3199); 
                    IF460_tree = (Object)adaptor.create(IF460);
                    adaptor.addChild(root_0, IF460_tree);

                    EXISTS461=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_trigger_stmt3201); 
                    EXISTS461_tree = (Object)adaptor.create(EXISTS461);
                    adaptor.addChild(root_0, EXISTS461_tree);


                    }
                    break;

            }

            // Sql.g:337:46: (database_name= ID DOT )?
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==ID) ) {
                int LA171_1 = input.LA(2);

                if ( (LA171_1==DOT) ) {
                    alt171=1;
                }
            }
            switch (alt171) {
                case 1 :
                    // Sql.g:337:47: database_name= ID DOT
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_drop_trigger_stmt3208); 
                    database_name_tree = (Object)adaptor.create(database_name);
                    adaptor.addChild(root_0, database_name_tree);

                    DOT462=(Token)match(input,DOT,FOLLOW_DOT_in_drop_trigger_stmt3210); 
                    DOT462_tree = (Object)adaptor.create(DOT462);
                    adaptor.addChild(root_0, DOT462_tree);


                    }
                    break;

            }

            trigger_name=(Token)match(input,ID,FOLLOW_ID_in_drop_trigger_stmt3216); 
            trigger_name_tree = (Object)adaptor.create(trigger_name);
            adaptor.addChild(root_0, trigger_name_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA36 dfa36 = new DFA36(this);
    static final String DFA4_eotS =
        "\36\uffff";
    static final String DFA4_eofS =
        "\36\uffff";
    static final String DFA4_minS =
        "\1\62\17\uffff\1\162\1\163\3\uffff\1\163\1\uffff\1\163\6\uffff";
    static final String DFA4_maxS =
        "\1\u0084\17\uffff\2\u008a\3\uffff\1\u008a\1\uffff\1\u008a\6\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\2\uffff\1\23\1\20\1\26\1\uffff\1\30\1\uffff\1\21\1"+
        "\24\1\22\1\25\1\27\1\31";
    static final String DFA4_specialS =
        "\36\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\14\13\uffff\1\15\2\uffff\1\1\1\uffff\1\2\1\uffff\1\3\1\4"+
            "\1\5\1\6\1\10\11\uffff\1\7\14\uffff\1\10\3\uffff\1\11\1\uffff"+
            "\1\12\1\13\4\uffff\1\14\1\uffff\1\16\1\17\1\uffff\1\20\21\uffff"+
            "\1\21\1\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\23\1\30\1\25\1\27\5\uffff\1\24\14\uffff\1\31\1\24\1\26",
            "\1\32\24\uffff\1\33\1\34\1\35",
            "",
            "",
            "",
            "\1\30\24\uffff\1\31\1\uffff\1\26",
            "",
            "\1\30\24\uffff\1\31\1\uffff\1\26",
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
            return "51:1: sql_stmt_core : ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt );";
        }
    }
    static final String DFA36_eotS =
        "\14\uffff";
    static final String DFA36_eofS =
        "\14\uffff";
    static final String DFA36_minS =
        "\1\23\2\uffff\1\22\1\23\7\uffff";
    static final String DFA36_maxS =
        "\1\u00c5\2\uffff\1\u00c0\1\u00c5\7\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\6\1\7\1\10\1\11\1\3\1\4\1\5";
    static final String DFA36_specialS =
        "\14\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\3\14\uffff\1\4\5\uffff\1\1\4\uffff\1\5\1\uffff\1\6\1\7\4"+
            "\uffff\7\1\2\uffff\1\10\u0085\uffff\4\2",
            "",
            "",
            "\3\11\3\uffff\2\11\4\uffff\1\11\1\uffff\1\12\2\11\5\uffff\1"+
            "\11\1\uffff\1\11\1\uffff\1\11\2\uffff\4\11\17\uffff\1\11\7\uffff"+
            "\4\11\1\uffff\1\11\1\uffff\2\11\1\uffff\12\11\11\uffff\1\11"+
            "\111\uffff\20\11",
            "\1\13\3\uffff\1\13\2\uffff\4\13\1\uffff\2\13\2\uffff\5\13\3"+
            "\uffff\1\13\1\uffff\2\13\4\uffff\7\13\2\uffff\1\13\26\uffff"+
            "\1\6\150\uffff\2\13\3\uffff\5\13",
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
            return "107:1: atom_expr : ( literal_value | bind_parameter | ( (database_name= ID DOT )? table_name= ID DOT )? column_name= ID | function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN | LPAREN expr RPAREN -> expr | CAST LPAREN expr AS type_name RPAREN | ( EXISTS )? LPAREN select_stmt RPAREN | CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END | raise_function );";
        }
    }
 

    public static final BitSet FOLLOW_sql_stmt_in_sql_stmt_list109 = new BitSet(new long[]{0x4004000000008002L,0x0002D0D1000803EAL,0x0000000000000018L});
    public static final BitSet FOLLOW_EXPLAIN_in_sql_stmt119 = new BitSet(new long[]{0x4004000000058000L,0x0002D0D1000803EAL,0x0000000000000018L});
    public static final BitSet FOLLOW_QUERY_in_sql_stmt122 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_PLAN_in_sql_stmt124 = new BitSet(new long[]{0x4004000000048000L,0x0002D0D1000803EAL,0x0000000000000018L});
    public static final BitSet FOLLOW_sql_stmt_core_in_sql_stmt130 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_sql_stmt132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_stmt_in_sql_stmt_core143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attach_stmt_in_sql_stmt_core149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_detach_stmt_in_sql_stmt_core155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_analyze_stmt_in_sql_stmt_core161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reindex_stmt_in_sql_stmt_core167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vacuum_stmt_in_sql_stmt_core173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_sql_stmt_core182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_stmt_in_sql_stmt_core188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_stmt_in_sql_stmt_core194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_stmt_in_sql_stmt_core200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_stmt_in_sql_stmt_core206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commit_stmt_in_sql_stmt_core212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rollback_stmt_in_sql_stmt_core218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_savepoint_stmt_in_sql_stmt_core224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_release_stmt_in_sql_stmt_core230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_virtual_table_stmt_in_sql_stmt_core239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_table_stmt_in_sql_stmt_core245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_table_stmt_in_sql_stmt_core251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alter_table_stmt_in_sql_stmt_core257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_view_stmt_in_sql_stmt_core263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_view_stmt_in_sql_stmt_core269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_index_stmt_in_sql_stmt_core275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_index_stmt_in_sql_stmt_core281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_trigger_stmt_in_sql_stmt_core287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_trigger_stmt_in_sql_stmt_core293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_qualified_table_name303 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_qualified_table_name305 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_qualified_table_name311 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_INDEXED_in_qualified_table_name314 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_BY_in_qualified_table_name316 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_qualified_table_name320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_qualified_table_name324 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_INDEXED_in_qualified_table_name326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_subexpr_in_expr335 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_OR_in_expr338 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_or_subexpr_in_expr341 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_and_subexpr_in_or_subexpr350 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_AND_in_or_subexpr353 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_and_subexpr_in_or_subexpr356 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr365 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L,0x000E000000000000L});
    public static final BitSet FOLLOW_set_in_and_subexpr371 = new BitSet(new long[]{0x13F8684100880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr387 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L,0x000E000000000000L});
    public static final BitSet FOLLOW_NOT_in_and_subexpr396 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_set_in_and_subexpr400 = new BitSet(new long[]{0x13F8684100880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr416 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ESCAPE_in_and_subexpr419 = new BitSet(new long[]{0x13F8684100880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_and_subexpr430 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_IN_in_and_subexpr434 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_LPAREN_in_and_subexpr437 = new BitSet(new long[]{0x13F868FDBC880000L,0x0000000000080000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_select_stmt_in_and_subexpr440 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_expr_in_and_subexpr444 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_COMMA_in_and_subexpr447 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_expr_in_and_subexpr449 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_RPAREN_in_and_subexpr455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_and_subexpr462 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_and_subexpr464 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_and_subexpr470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISNULL_in_and_subexpr478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTNULL_in_and_subexpr482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_and_subexpr486 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NULL_in_and_subexpr488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_and_subexpr493 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NOT_in_and_subexpr495 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NULL_in_and_subexpr497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_and_subexpr505 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_BETWEEN_in_and_subexpr509 = new BitSet(new long[]{0x13F8684100880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr511 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_AND_in_and_subexpr513 = new BitSet(new long[]{0x13F8684100880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_neq_subexpr_in_eq_subexpr522 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00F0000000000000L});
    public static final BitSet FOLLOW_set_in_eq_subexpr525 = new BitSet(new long[]{0x13F8684100880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_neq_subexpr_in_eq_subexpr542 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00F0000000000000L});
    public static final BitSet FOLLOW_bit_subexpr_in_neq_subexpr551 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0F00000000000000L});
    public static final BitSet FOLLOW_set_in_neq_subexpr554 = new BitSet(new long[]{0x13F8684100880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_bit_subexpr_in_neq_subexpr571 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0F00000000000000L});
    public static final BitSet FOLLOW_add_subexpr_in_bit_subexpr580 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x3000000000000000L});
    public static final BitSet FOLLOW_set_in_bit_subexpr583 = new BitSet(new long[]{0x13F8684100880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_add_subexpr_in_bit_subexpr592 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x3000000000000000L});
    public static final BitSet FOLLOW_mul_subexpr_in_add_subexpr601 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_set_in_add_subexpr604 = new BitSet(new long[]{0x13F8684100880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_mul_subexpr_in_add_subexpr617 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_con_subexpr_in_mul_subexpr626 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_192_in_mul_subexpr629 = new BitSet(new long[]{0x13F8684100880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_con_subexpr_in_mul_subexpr632 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_set_in_con_subexpr641 = new BitSet(new long[]{0x13F8684100880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_unary_subexpr_in_con_subexpr658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_expr_in_unary_subexpr665 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_COLLATE_in_unary_subexpr668 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_unary_subexpr673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_value_in_atom_expr685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bind_parameter_in_atom_expr691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom_expr701 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_atom_expr703 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_atom_expr709 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_atom_expr711 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_atom_expr717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom_expr725 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr727 = new BitSet(new long[]{0x13F86EFDBC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_DISTINCT_in_atom_expr731 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_expr_in_atom_expr737 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_COMMA_in_atom_expr740 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_expr_in_atom_expr744 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_ASTERISK_in_atom_expr750 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr760 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_expr_in_atom_expr762 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_atom_expr774 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr776 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_expr_in_atom_expr778 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_AS_in_atom_expr780 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_type_name_in_atom_expr782 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXISTS_in_atom_expr793 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_select_stmt_in_atom_expr799 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_atom_expr807 = new BitSet(new long[]{0x13F8E8F9BC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_expr_in_atom_expr810 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_WHEN_in_atom_expr815 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_expr_in_atom_expr817 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_THEN_in_atom_expr819 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_expr_in_atom_expr821 = new BitSet(new long[]{0x0006800000000000L});
    public static final BitSet FOLLOW_ELSE_in_atom_expr826 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_expr_in_atom_expr828 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_END_in_atom_expr832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raise_function_in_atom_expr838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal_value0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_signed_number0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_bind_parameter898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_bind_parameter904 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_bind_parameter908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_195_in_bind_parameter914 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_bind_parameter918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_196_in_bind_parameter924 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_bind_parameter928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_197_in_bind_parameter934 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TCL_ID_in_bind_parameter938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_name945 = new BitSet(new long[]{0x0000000100080002L});
    public static final BitSet FOLLOW_LPAREN_in_type_name949 = new BitSet(new long[]{0x0418000000000000L});
    public static final BitSet FOLLOW_signed_number_in_type_name953 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_COMMA_in_type_name956 = new BitSet(new long[]{0x0418000000000000L});
    public static final BitSet FOLLOW_signed_number_in_type_name960 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_type_name964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAISE_in_raise_function994 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_raise_function996 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IGNORE_in_raise_function999 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_set_in_raise_function1003 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_COMMA_in_raise_function1015 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_STRING_in_raise_function1019 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_raise_function1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_in_pragma_stmt1030 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_pragma_stmt1035 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_pragma_stmt1037 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_pragma_stmt1043 = new BitSet(new long[]{0x0000000100000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_EQUALS_in_pragma_stmt1046 = new BitSet(new long[]{0x0438000000080000L});
    public static final BitSet FOLLOW_pragma_value_in_pragma_stmt1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_pragma_stmt1052 = new BitSet(new long[]{0x0438000000080000L});
    public static final BitSet FOLLOW_pragma_value_in_pragma_stmt1054 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_pragma_stmt1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signed_number_in_pragma_value1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_pragma_value1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_pragma_value1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTACH_in_attach_stmt1083 = new BitSet(new long[]{0x0020000000080000L,0x0000000000000010L});
    public static final BitSet FOLLOW_DATABASE_in_attach_stmt1086 = new BitSet(new long[]{0x0020000000080000L});
    public static final BitSet FOLLOW_set_in_attach_stmt1092 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_AS_in_attach_stmt1100 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_attach_stmt1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DETACH_in_detach_stmt1112 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000010L});
    public static final BitSet FOLLOW_DATABASE_in_detach_stmt1115 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_detach_stmt1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANALYZE_in_analyze_stmt1129 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ID_in_analyze_stmt1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_analyze_stmt1140 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_analyze_stmt1142 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_analyze_stmt1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REINDEX_in_reindex_stmt1156 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_reindex_stmt1161 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_reindex_stmt1163 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_reindex_stmt1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VACUUM_in_vacuum_stmt1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_operation_conflict_clause1188 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000201L});
    public static final BitSet FOLLOW_set_in_operation_conflict_clause1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_ordering_term1215 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ASC_in_ordering_term1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_ordering_term1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_operation_limited_clause1254 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_BY_in_operation_limited_clause1256 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_ordering_term_in_operation_limited_clause1258 = new BitSet(new long[]{0x0000000200000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_operation_limited_clause1261 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_ordering_term_in_operation_limited_clause1263 = new BitSet(new long[]{0x0000000200000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_LIMIT_in_operation_limited_clause1271 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_operation_limited_clause1275 = new BitSet(new long[]{0x0000000200000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_set_in_operation_limited_clause1278 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_operation_limited_clause1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_list_in_select_stmt1298 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_ORDER_in_select_stmt1303 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_BY_in_select_stmt1305 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt1307 = new BitSet(new long[]{0x0000000200000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt1310 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt1312 = new BitSet(new long[]{0x0000000200000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_LIMIT_in_select_stmt1321 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt1325 = new BitSet(new long[]{0x0000000200000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_OFFSET_in_select_stmt1329 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt1333 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_core_in_select_list1383 = new BitSet(new long[]{0x0000000000000002L,0x0000000000068000L});
    public static final BitSet FOLLOW_select_op_in_select_list1386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_select_core_in_select_list1389 = new BitSet(new long[]{0x0000000000000002L,0x0000000000068000L});
    public static final BitSet FOLLOW_UNION_in_select_op1398 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ALL_in_select_op1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERSECT_in_select_op1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCEPT_in_select_op1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_core1421 = new BitSet(new long[]{0x13F86EF9BC880000L,0x0000000000010000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_ALL_in_select_core1424 = new BitSet(new long[]{0x13F86EF9BC880000L,0x0000000000010000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_DISTINCT_in_select_core1428 = new BitSet(new long[]{0x13F86EF9BC880000L,0x0000000000010000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_result_column_in_select_core1432 = new BitSet(new long[]{0x0000000200000002L,0x0000000000700000L});
    public static final BitSet FOLLOW_COMMA_in_select_core1435 = new BitSet(new long[]{0x13F86EF9BC880000L,0x0000000000010000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_result_column_in_select_core1437 = new BitSet(new long[]{0x0000000200000002L,0x0000000000700000L});
    public static final BitSet FOLLOW_FROM_in_select_core1442 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_join_source_in_select_core1444 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_WHERE_in_select_core1449 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_expr_in_select_core1453 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_GROUP_in_select_core1461 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_BY_in_select_core1463 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_ordering_term_in_select_core1465 = new BitSet(new long[]{0x0000000200000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_COMMA_in_select_core1468 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_ordering_term_in_select_core1470 = new BitSet(new long[]{0x0000000200000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_HAVING_in_select_core1475 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_expr_in_select_core1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_result_column1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_result_column1557 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_result_column1559 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ASTERISK_in_result_column1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_result_column1576 = new BitSet(new long[]{0x0000100000080002L});
    public static final BitSet FOLLOW_AS_in_result_column1580 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_result_column1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_source_in_join_source1607 = new BitSet(new long[]{0x0000000200000002L,0x000000003F000000L});
    public static final BitSet FOLLOW_join_op_in_join_source1610 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_single_source_in_join_source1613 = new BitSet(new long[]{0x0000000200000002L,0x00000000FF000000L});
    public static final BitSet FOLLOW_join_constraint_in_join_source1616 = new BitSet(new long[]{0x0000000200000002L,0x000000003F000000L});
    public static final BitSet FOLLOW_ID_in_single_source1633 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_single_source1635 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_single_source1641 = new BitSet(new long[]{0x0000100000A80002L});
    public static final BitSet FOLLOW_AS_in_single_source1645 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_single_source1651 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_INDEXED_in_single_source1656 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_BY_in_single_source1658 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_single_source1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_single_source1666 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_INDEXED_in_single_source1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_single_source1709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_select_stmt_in_single_source1711 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_single_source1713 = new BitSet(new long[]{0x0000100000080002L});
    public static final BitSet FOLLOW_AS_in_single_source1717 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_single_source1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_single_source1745 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_join_source_in_single_source1748 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_single_source1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_join_op1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATURAL_in_join_op1768 = new BitSet(new long[]{0x0000000000000000L,0x000000003E000000L});
    public static final BitSet FOLLOW_LEFT_in_join_op1774 = new BitSet(new long[]{0x0000000000000000L,0x0000000024000000L});
    public static final BitSet FOLLOW_OUTER_in_join_op1779 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_INNER_in_join_op1785 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_CROSS_in_join_op1789 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_JOIN_in_join_op1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_join_constraint1803 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_expr_in_join_constraint1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_join_constraint1812 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_join_constraint1814 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_join_constraint1818 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_COMMA_in_join_constraint1821 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_join_constraint1825 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_RPAREN_in_join_constraint1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_stmt1848 = new BitSet(new long[]{0x0000000001000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_operation_conflict_clause_in_insert_stmt1851 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_REPLACE_in_insert_stmt1857 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_INTO_in_insert_stmt1860 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_insert_stmt1865 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_insert_stmt1867 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_insert_stmt1873 = new BitSet(new long[]{0x0000000100000000L,0x0000000C00080000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt1880 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_insert_stmt1884 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt1887 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_insert_stmt1891 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt1895 = new BitSet(new long[]{0x0000000000000000L,0x0000000400080000L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt1904 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt1906 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_expr_in_insert_stmt1910 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt1913 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_expr_in_insert_stmt1917 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_insert_stmt1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_insert_stmt1932 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update_stmt1944 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_operation_conflict_clause_in_update_stmt1947 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_qualified_table_name_in_update_stmt1951 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_SET_in_update_stmt1955 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_update_set_in_update_stmt1959 = new BitSet(new long[]{0x0000000200000002L,0x0000000000203000L});
    public static final BitSet FOLLOW_COMMA_in_update_stmt1962 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_update_set_in_update_stmt1966 = new BitSet(new long[]{0x0000000200000002L,0x0000000000203000L});
    public static final BitSet FOLLOW_WHERE_in_update_stmt1971 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_expr_in_update_stmt1973 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_operation_limited_clause_in_update_stmt1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_update_set1989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_EQUALS_in_update_set1991 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_expr_in_update_set1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_stmt2001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_FROM_in_delete_stmt2003 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_qualified_table_name_in_delete_stmt2005 = new BitSet(new long[]{0x0000000000000002L,0x0000000000203000L});
    public static final BitSet FOLLOW_WHERE_in_delete_stmt2008 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_expr_in_delete_stmt2010 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_operation_limited_clause_in_delete_stmt2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_begin_stmt2025 = new BitSet(new long[]{0x0000000000000002L,0x00000F0000000000L});
    public static final BitSet FOLLOW_set_in_begin_stmt2027 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_begin_stmt2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_commit_stmt2051 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_commit_stmt2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROLLBACK_in_rollback_stmt2070 = new BitSet(new long[]{0x0000000000000002L,0x0000280000000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_rollback_stmt2073 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_TO_in_rollback_stmt2078 = new BitSet(new long[]{0x0000000000080000L,0x0000400000000000L});
    public static final BitSet FOLLOW_SAVEPOINT_in_rollback_stmt2081 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_rollback_stmt2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVEPOINT_in_savepoint_stmt2097 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_savepoint_stmt2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELEASE_in_release_stmt2109 = new BitSet(new long[]{0x0000000000080000L,0x0000400000000000L});
    public static final BitSet FOLLOW_SAVEPOINT_in_release_stmt2112 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_release_stmt2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_table_conflict_clause2130 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_CONFLICT_in_table_conflict_clause2133 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000201L});
    public static final BitSet FOLLOW_set_in_table_conflict_clause2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_virtual_table_stmt2163 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_VIRTUAL_in_create_virtual_table_stmt2165 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_TABLE_in_create_virtual_table_stmt2167 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_virtual_table_stmt2172 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_create_virtual_table_stmt2174 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_virtual_table_stmt2180 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_USING_in_create_virtual_table_stmt2184 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_virtual_table_stmt2188 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_LPAREN_in_create_virtual_table_stmt2191 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_column_def_in_create_virtual_table_stmt2193 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_COMMA_in_create_virtual_table_stmt2196 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_column_def_in_create_virtual_table_stmt2198 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_virtual_table_stmt2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_table_stmt2212 = new BitSet(new long[]{0x0000000000000000L,0x0038000000000000L});
    public static final BitSet FOLLOW_TEMP_in_create_table_stmt2215 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_table_stmt2219 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_TABLE_in_create_table_stmt2223 = new BitSet(new long[]{0x0000000000080000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IF_in_create_table_stmt2226 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NOT_in_create_table_stmt2228 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_table_stmt2230 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_table_stmt2237 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_create_table_stmt2239 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_table_stmt2245 = new BitSet(new long[]{0x0000100100000000L});
    public static final BitSet FOLLOW_LPAREN_in_create_table_stmt2251 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_column_def_in_create_table_stmt2253 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_COMMA_in_create_table_stmt2256 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_column_def_in_create_table_stmt2258 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_COMMA_in_create_table_stmt2263 = new BitSet(new long[]{0x0000000000000000L,0x3980000000000000L});
    public static final BitSet FOLLOW_table_constraint_in_create_table_stmt2265 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_table_stmt2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_create_table_stmt2275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_select_stmt_in_create_table_stmt2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_column_def2325 = new BitSet(new long[]{0x0000010000880002L,0x5980000800000000L});
    public static final BitSet FOLLOW_type_name_in_column_def2328 = new BitSet(new long[]{0x0000010000800002L,0x5980000800000000L});
    public static final BitSet FOLLOW_column_constraint_in_column_def2332 = new BitSet(new long[]{0x0000010000800002L,0x5980000800000000L});
    public static final BitSet FOLLOW_CONSTRAINT_in_column_constraint2342 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_column_constraint2346 = new BitSet(new long[]{0x0000010000800000L,0x5980000800000000L});
    public static final BitSet FOLLOW_column_constraint_pk_in_column_constraint2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_not_null_in_column_constraint2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_unique_in_column_constraint2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_check_in_column_constraint2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_default_in_column_constraint2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_collate_in_column_constraint2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fk_clause_in_column_constraint2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_in_column_constraint_pk2443 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_KEY_in_column_constraint_pk2446 = new BitSet(new long[]{0x0000000000000002L,0x0400000040000C00L});
    public static final BitSet FOLLOW_set_in_column_constraint_pk2449 = new BitSet(new long[]{0x0000000000000002L,0x0400000040000000L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_pk2458 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_AUTOINCREMENT_in_column_constraint_pk2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_column_constraint_not_null2471 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NULL_in_column_constraint_not_null2473 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_not_null2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_column_constraint_unique2492 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_unique2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECK_in_column_constraint_check2503 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_column_constraint_check2506 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_expr_in_column_constraint_check2509 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_column_constraint_check2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_column_constraint_default2519 = new BitSet(new long[]{0x07F8004100000000L});
    public static final BitSet FOLLOW_SIGNED_NUMBER_in_column_constraint_default2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_value_in_column_constraint_default2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_column_constraint_default2531 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_expr_in_column_constraint_default2534 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_column_constraint_default2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLATE_in_column_constraint_collate2545 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_column_constraint_collate2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRAINT_in_table_constraint2559 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_table_constraint2563 = new BitSet(new long[]{0x0000000000000000L,0x3980000000000000L});
    public static final BitSet FOLLOW_table_constraint_pk_in_table_constraint2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_check_in_table_constraint2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_fk_in_table_constraint2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_in_table_constraint_pk2592 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_KEY_in_table_constraint_pk2594 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_UNIQUE_in_table_constraint_pk2598 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_pk2601 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_table_constraint_pk2605 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_pk2608 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_table_constraint_pk2612 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_pk2616 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_table_conflict_clause_in_table_constraint_pk2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECK_in_table_constraint_check2628 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_check2630 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_expr_in_table_constraint_check2632 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_check2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREIGN_in_table_constraint_fk2641 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_KEY_in_table_constraint_fk2643 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_fk2645 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_table_constraint_fk2649 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_fk2652 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_table_constraint_fk2656 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_fk2660 = new BitSet(new long[]{0x0000010000800000L,0x5980000800000000L});
    public static final BitSet FOLLOW_fk_clause_in_table_constraint_fk2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCES_in_fk_clause2669 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_fk_clause2674 = new BitSet(new long[]{0x0000000120000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_fk_clause2677 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_fk_clause2681 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_COMMA_in_fk_clause2684 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_fk_clause2688 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_RPAREN_in_fk_clause2692 = new BitSet(new long[]{0x0000000120000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_fk_clause_action_in_fk_clause2698 = new BitSet(new long[]{0x0000000120800002L,0x0000000040000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_fk_clause_deferrable_in_fk_clause2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_fk_clause_action2712 = new BitSet(new long[]{0x0000000000000000L,0x0000005100000000L});
    public static final BitSet FOLLOW_set_in_fk_clause_action2714 = new BitSet(new long[]{0x0000000000000000L,0x8000002000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SET_in_fk_clause_action2727 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NULL_in_fk_clause_action2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_fk_clause_action2733 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_DEFAULT_in_fk_clause_action2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASCADE_in_fk_clause_action2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESTRICT_in_fk_clause_action2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCH_in_fk_clause_action2750 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_fk_clause_action2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_fk_clause_deferrable2762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_DEFERRABLE_in_fk_clause_deferrable2766 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_INITIALLY_in_fk_clause_deferrable2769 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_DEFERRED_in_fk_clause_deferrable2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITIALLY_in_fk_clause_deferrable2775 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_IMMEDIATE_in_fk_clause_deferrable2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_table_stmt2787 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_TABLE_in_drop_table_stmt2789 = new BitSet(new long[]{0x0000000000080000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IF_in_drop_table_stmt2792 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_table_stmt2794 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_drop_table_stmt2801 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_drop_table_stmt2803 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_drop_table_stmt2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALTER_in_alter_table_stmt2817 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_TABLE_in_alter_table_stmt2819 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_alter_table_stmt2824 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_alter_table_stmt2826 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_alter_table_stmt2832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_RENAME_in_alter_table_stmt2835 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_TO_in_alter_table_stmt2837 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_alter_table_stmt2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_alter_table_stmt2845 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_COLUMN_in_alter_table_stmt2848 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_column_def_in_alter_table_stmt2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_view_stmt2861 = new BitSet(new long[]{0x0000000000000000L,0x0030000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_set_in_create_view_stmt2863 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_VIEW_in_create_view_stmt2872 = new BitSet(new long[]{0x0000000000080000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IF_in_create_view_stmt2875 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NOT_in_create_view_stmt2877 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_view_stmt2879 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_view_stmt2886 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_create_view_stmt2888 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_view_stmt2894 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_AS_in_create_view_stmt2896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_select_stmt_in_create_view_stmt2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_view_stmt2906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_VIEW_in_drop_view_stmt2908 = new BitSet(new long[]{0x0000000000080000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IF_in_drop_view_stmt2911 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_view_stmt2913 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_drop_view_stmt2920 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_drop_view_stmt2922 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_drop_view_stmt2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_index_stmt2936 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_UNIQUE_in_create_index_stmt2939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INDEX_in_create_index_stmt2943 = new BitSet(new long[]{0x0000000000080000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IF_in_create_index_stmt2946 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NOT_in_create_index_stmt2948 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_index_stmt2950 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_index_stmt2957 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_create_index_stmt2959 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_index_stmt2965 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_ON_in_create_index_stmt2969 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_index_stmt2973 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_create_index_stmt2975 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_indexed_column_in_create_index_stmt2979 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_COMMA_in_create_index_stmt2982 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_indexed_column_in_create_index_stmt2986 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_index_stmt2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_indexed_column2999 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_COLLATE_in_indexed_column3002 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_indexed_column3006 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_set_in_indexed_column3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_index_stmt3025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INDEX_in_drop_index_stmt3027 = new BitSet(new long[]{0x0000000000080000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IF_in_drop_index_stmt3030 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_index_stmt3032 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_drop_index_stmt3039 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_drop_index_stmt3041 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_drop_index_stmt3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_trigger_stmt3055 = new BitSet(new long[]{0x0000000000000000L,0x0030000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_set_in_create_trigger_stmt3057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_TRIGGER_in_create_trigger_stmt3066 = new BitSet(new long[]{0x0000000000080000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IF_in_create_trigger_stmt3069 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NOT_in_create_trigger_stmt3071 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_trigger_stmt3073 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_trigger_stmt3080 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_create_trigger_stmt3082 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_trigger_stmt3088 = new BitSet(new long[]{0x0000000000000000L,0x0000005100000000L,0x0000000000003800L});
    public static final BitSet FOLLOW_BEFORE_in_create_trigger_stmt3093 = new BitSet(new long[]{0x0000000000000000L,0x0000005100000000L});
    public static final BitSet FOLLOW_AFTER_in_create_trigger_stmt3097 = new BitSet(new long[]{0x0000000000000000L,0x0000005100000000L});
    public static final BitSet FOLLOW_INSTEAD_in_create_trigger_stmt3101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_OF_in_create_trigger_stmt3103 = new BitSet(new long[]{0x0000000000000000L,0x0000005100000000L});
    public static final BitSet FOLLOW_DELETE_in_create_trigger_stmt3108 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_INSERT_in_create_trigger_stmt3112 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_UPDATE_in_create_trigger_stmt3116 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_OF_in_create_trigger_stmt3119 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_trigger_stmt3123 = new BitSet(new long[]{0x0000000200000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_COMMA_in_create_trigger_stmt3126 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_trigger_stmt3130 = new BitSet(new long[]{0x0000000200000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_ON_in_create_trigger_stmt3139 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_trigger_stmt3143 = new BitSet(new long[]{0x0000800000000000L,0x0000008000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_FOR_in_create_trigger_stmt3146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_EACH_in_create_trigger_stmt3148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ROW_in_create_trigger_stmt3150 = new BitSet(new long[]{0x0000800000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_WHEN_in_create_trigger_stmt3155 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x3000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_expr_in_create_trigger_stmt3157 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_BEGIN_in_create_trigger_stmt3163 = new BitSet(new long[]{0x0000000000000000L,0x0000005100080200L});
    public static final BitSet FOLLOW_update_stmt_in_create_trigger_stmt3167 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_insert_stmt_in_create_trigger_stmt3171 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_delete_stmt_in_create_trigger_stmt3175 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_select_stmt_in_create_trigger_stmt3179 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_create_trigger_stmt3182 = new BitSet(new long[]{0x0004000000000000L,0x0000005100080200L});
    public static final BitSet FOLLOW_END_in_create_trigger_stmt3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_trigger_stmt3194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_TRIGGER_in_drop_trigger_stmt3196 = new BitSet(new long[]{0x0000000000080000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IF_in_drop_trigger_stmt3199 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_trigger_stmt3201 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_drop_trigger_stmt3208 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_drop_trigger_stmt3210 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_drop_trigger_stmt3216 = new BitSet(new long[]{0x0000000000000002L});

}