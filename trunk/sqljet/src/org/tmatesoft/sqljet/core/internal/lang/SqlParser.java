// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 Sql.g 2009-05-04 13:19:52

  package org.tmatesoft.sqljet.core.internal.lang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class SqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALIAS", "COLUMN_DEFS", "COLUMN_CONSTRAINT", "NOT_NULL", "ORDERING", "RESULT_COLUMNS", "SELECT_CORE", "TABLE_CONSTRAINTS", "TABLE_CONSTRAINT", "TYPE", "TYPE_PARAMS", "EXPLAIN", "QUERY", "PLAN", "SEMI", "ID", "DOT", "INDEXED", "BY", "NOT", "OR", "AND", "LIKE", "GLOB", "REGEXP", "MATCH", "ESCAPE", "IN", "LPAREN", "COMMA", "RPAREN", "ISNULL", "NOTNULL", "IS", "NULL", "BETWEEN", "COLLATE", "DISTINCT", "ASTERISK", "CAST", "AS", "EXISTS", "CASE", "WHEN", "THEN", "ELSE", "END", "INTEGER", "FLOAT", "STRING", "BLOB", "CURRENT_TIME", "CURRENT_DATE", "CURRENT_TIMESTAMP", "SIGNED_NUMBER", "TCL_ID", "RAISE", "IGNORE", "ROLLBACK", "ABORT", "FAIL", "PRAGMA", "EQUALS", "ATTACH", "DATABASE", "DETACH", "ANALYZE", "REINDEX", "VACUUM", "REPLACE", "ASC", "DESC", "ORDER", "LIMIT", "OFFSET", "UNION", "ALL", "INTERSECT", "EXCEPT", "SELECT", "FROM", "WHERE", "GROUP", "HAVING", "NATURAL", "LEFT", "OUTER", "INNER", "CROSS", "JOIN", "ON", "USING", "INSERT", "INTO", "VALUES", "DEFAULT", "UPDATE", "SET", "DELETE", "BEGIN", "DEFERRED", "IMMEDIATE", "EXCLUSIVE", "TRANSACTION", "COMMIT", "TO", "SAVEPOINT", "RELEASE", "CONFLICT", "CREATE", "VIRTUAL", "TABLE", "TEMPORARY", "IF", "CONSTRAINT", "PRIMARY", "KEY", "AUTOINCREMENT", "UNIQUE", "CHECK", "FOREIGN", "REFERENCES", "CASCADE", "RESTRICT", "DEFERRABLE", "INITIALLY", "DROP", "ALTER", "RENAME", "ADD", "COLUMN", "VIEW", "INDEX", "TRIGGER", "BEFORE", "AFTER", "INSTEAD", "OF", "FOR", "EACH", "ROW", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "ALPHA", "FLOAT_EXP", "COMMENT", "LINE_COMMENT", "WS", "'=='", "'!='", "'<>'", "'<'", "'<='", "'>'", "'>='", "'<<'", "'>>'", "'&'", "'|'", "'+'", "'-'", "'/'", "'%'", "'||'", "'~'", "'?'", "':'", "'@'", "'$'"
    };
    public static final int ROW=144;
    public static final int NOT=23;
    public static final int TYPE_PARAMS=14;
    public static final int EXCEPT=82;
    public static final int EOF=-1;
    public static final int FOREIGN=124;
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
    public static final int D=148;
    public static final int E=149;
    public static final int F=150;
    public static final int G=151;
    public static final int BLOB=54;
    public static final int A=145;
    public static final int B=146;
    public static final int ASC=74;
    public static final int C=147;
    public static final int L=156;
    public static final int M=157;
    public static final int N=158;
    public static final int TRANSACTION=107;
    public static final int KEY=120;
    public static final int O=159;
    public static final int H=152;
    public static final int I=153;
    public static final int ELSE=49;
    public static final int J=154;
    public static final int K=155;
    public static final int U=165;
    public static final int T=164;
    public static final int W=167;
    public static final int V=166;
    public static final int Q=161;
    public static final int P=160;
    public static final int S=163;
    public static final int R=162;
    public static final int ROLLBACK=62;
    public static final int FAIL=64;
    public static final int Y=169;
    public static final int RESTRICT=127;
    public static final int X=168;
    public static final int Z=170;
    public static final int INTERSECT=81;
    public static final int GROUP=86;
    public static final int WS=175;
    public static final int PLAN=17;
    public static final int ALIAS=4;
    public static final int END=50;
    public static final int CONSTRAINT=118;
    public static final int RENAME=132;
    public static final int ALTER=131;
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
    public static final int COLUMN=134;
    public static final int EXISTS=45;
    public static final int LIKE=26;
    public static final int COLLATE=40;
    public static final int ADD=133;
    public static final int INTEGER=51;
    public static final int OUTER=90;
    public static final int BY=22;
    public static final int DEFERRABLE=128;
    public static final int TO=109;
    public static final int SET=101;
    public static final int HAVING=87;
    public static final int IGNORE=61;
    public static final int SEMI=18;
    public static final int UNION=79;
    public static final int COLUMN_CONSTRAINT=6;
    public static final int FLOAT_EXP=172;
    public static final int COMMIT=108;
    public static final int DATABASE=68;
    public static final int VACUUM=72;
    public static final int DROP=130;
    public static final int DETACH=69;
    public static final int WHEN=47;
    public static final int NATURAL=88;
    public static final int BETWEEN=39;
    public static final int STRING=53;
    public static final int CAST=43;
    public static final int TABLE_CONSTRAINT=12;
    public static final int CURRENT_TIME=55;
    public static final int TRIGGER=137;
    public static final int CASE=46;
    public static final int EQUALS=66;
    public static final int CASCADE=126;
    public static final int RELEASE=111;
    public static final int EXPLAIN=15;
    public static final int ESCAPE=30;
    public static final int RESULT_COLUMNS=9;
    public static final int INSERT=96;
    public static final int SAVEPOINT=110;
    public static final int RAISE=60;
    public static final int EACH=143;
    public static final int COMMENT=173;
    public static final int ABORT=63;
    public static final int SELECT=83;
    public static final int INTO=97;
    public static final int UNIQUE=122;
    public static final int GLOB=27;
    public static final int VIEW=135;
    public static final int LINE_COMMENT=174;
    public static final int NULL=38;
    public static final int ON=94;
    public static final int MATCH=29;
    public static final int PRIMARY=119;
    public static final int DELETE=102;
    public static final int OF=141;
    public static final int ALPHA=171;
    public static final int OR=24;
    public static final int TABLE_CONSTRAINTS=11;
    public static final int QUERY=16;
    public static final int COLUMN_DEFS=5;
    public static final int CHECK=123;
    public static final int FROM=84;
    public static final int DISTINCT=41;
    public static final int TEMPORARY=116;
    public static final int CURRENT_DATE=56;
    public static final int WHERE=85;
    public static final int INNER=91;
    public static final int ORDER=76;
    public static final int LIMIT=77;
    public static final int PRAGMA=65;
    public static final int UPDATE=100;
    public static final int DEFERRED=104;
    public static final int FOR=142;
    public static final int SELECT_CORE=10;
    public static final int EXCLUSIVE=106;
    public static final int AND=25;
    public static final int ID=19;
    public static final int CROSS=92;
    public static final int IF=117;
    public static final int INDEX=136;
    public static final int IN=31;
    public static final int T__196=196;
    public static final int T__195=195;
    public static final int T__194=194;
    public static final int T__193=193;
    public static final int COMMA=33;
    public static final int T__192=192;
    public static final int REFERENCES=125;
    public static final int IS=37;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int ALL=80;
    public static final int TCL_ID=59;
    public static final int DOT=20;
    public static final int CURRENT_TIMESTAMP=57;
    public static final int INITIALLY=129;
    public static final int T__184=184;
    public static final int REINDEX=71;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__185=185;
    public static final int T__188=188;
    public static final int T__187=187;
    public static final int T__189=189;
    public static final int AUTOINCREMENT=121;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int DEFAULT=99;
    public static final int T__181=181;
    public static final int VALUES=98;
    public static final int BEFORE=138;
    public static final int AFTER=139;
    public static final int INSTEAD=140;
    public static final int JOIN=93;
    public static final int INDEXED=21;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int T__177=177;
    public static final int T__176=176;
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
    // Sql.g:48:1: sql_stmt_list : ( sql_stmt )+ ;
    public final SqlParser.sql_stmt_list_return sql_stmt_list() throws RecognitionException {
        SqlParser.sql_stmt_list_return retval = new SqlParser.sql_stmt_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.sql_stmt_return sql_stmt1 = null;



        try {
            // Sql.g:48:14: ( ( sql_stmt )+ )
            // Sql.g:48:16: ( sql_stmt )+
            {
            root_0 = (Object)adaptor.nil();

            // Sql.g:48:16: ( sql_stmt )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // Sql.g:48:17: sql_stmt
            	    {
            	    pushFollow(FOLLOW_sql_stmt_in_sql_stmt_list117);
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
    // Sql.g:50:1: sql_stmt : ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI ;
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
            // Sql.g:50:9: ( ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI )
            // Sql.g:50:11: ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI
            {
            root_0 = (Object)adaptor.nil();

            // Sql.g:50:11: ( EXPLAIN ( QUERY PLAN )? )?
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // Sql.g:50:12: EXPLAIN ( QUERY PLAN )?
                    {
                    EXPLAIN2=(Token)match(input,EXPLAIN,FOLLOW_EXPLAIN_in_sql_stmt127); 
                    EXPLAIN2_tree = (Object)adaptor.create(EXPLAIN2);
                    adaptor.addChild(root_0, EXPLAIN2_tree);

                    // Sql.g:50:20: ( QUERY PLAN )?
                    int alt2=2;
                    alt2 = dfa2.predict(input);
                    switch (alt2) {
                        case 1 :
                            // Sql.g:50:21: QUERY PLAN
                            {
                            QUERY3=(Token)match(input,QUERY,FOLLOW_QUERY_in_sql_stmt130); 
                            QUERY3_tree = (Object)adaptor.create(QUERY3);
                            adaptor.addChild(root_0, QUERY3_tree);

                            PLAN4=(Token)match(input,PLAN,FOLLOW_PLAN_in_sql_stmt132); 
                            PLAN4_tree = (Object)adaptor.create(PLAN4);
                            adaptor.addChild(root_0, PLAN4_tree);


                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_sql_stmt_core_in_sql_stmt138);
            sql_stmt_core5=sql_stmt_core();

            state._fsp--;

            adaptor.addChild(root_0, sql_stmt_core5.getTree());
            SEMI6=(Token)match(input,SEMI,FOLLOW_SEMI_in_sql_stmt140); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:52:1: sql_stmt_core : ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt );
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
            // Sql.g:53:3: ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt )
            int alt4=25;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // Sql.g:53:5: pragma_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pragma_stmt_in_sql_stmt_core151);
                    pragma_stmt7=pragma_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_stmt7.getTree());

                    }
                    break;
                case 2 :
                    // Sql.g:54:5: attach_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_attach_stmt_in_sql_stmt_core157);
                    attach_stmt8=attach_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, attach_stmt8.getTree());

                    }
                    break;
                case 3 :
                    // Sql.g:55:5: detach_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_detach_stmt_in_sql_stmt_core163);
                    detach_stmt9=detach_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, detach_stmt9.getTree());

                    }
                    break;
                case 4 :
                    // Sql.g:56:5: analyze_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_analyze_stmt_in_sql_stmt_core169);
                    analyze_stmt10=analyze_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, analyze_stmt10.getTree());

                    }
                    break;
                case 5 :
                    // Sql.g:57:5: reindex_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_reindex_stmt_in_sql_stmt_core175);
                    reindex_stmt11=reindex_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, reindex_stmt11.getTree());

                    }
                    break;
                case 6 :
                    // Sql.g:58:5: vacuum_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_vacuum_stmt_in_sql_stmt_core181);
                    vacuum_stmt12=vacuum_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, vacuum_stmt12.getTree());

                    }
                    break;
                case 7 :
                    // Sql.g:60:5: select_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_select_stmt_in_sql_stmt_core190);
                    select_stmt13=select_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, select_stmt13.getTree());

                    }
                    break;
                case 8 :
                    // Sql.g:61:5: insert_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_insert_stmt_in_sql_stmt_core196);
                    insert_stmt14=insert_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, insert_stmt14.getTree());

                    }
                    break;
                case 9 :
                    // Sql.g:62:5: update_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_update_stmt_in_sql_stmt_core202);
                    update_stmt15=update_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, update_stmt15.getTree());

                    }
                    break;
                case 10 :
                    // Sql.g:63:5: delete_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_delete_stmt_in_sql_stmt_core208);
                    delete_stmt16=delete_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_stmt16.getTree());

                    }
                    break;
                case 11 :
                    // Sql.g:64:5: begin_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_begin_stmt_in_sql_stmt_core214);
                    begin_stmt17=begin_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, begin_stmt17.getTree());

                    }
                    break;
                case 12 :
                    // Sql.g:65:5: commit_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_commit_stmt_in_sql_stmt_core220);
                    commit_stmt18=commit_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, commit_stmt18.getTree());

                    }
                    break;
                case 13 :
                    // Sql.g:66:5: rollback_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_rollback_stmt_in_sql_stmt_core226);
                    rollback_stmt19=rollback_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, rollback_stmt19.getTree());

                    }
                    break;
                case 14 :
                    // Sql.g:67:5: savepoint_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_savepoint_stmt_in_sql_stmt_core232);
                    savepoint_stmt20=savepoint_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, savepoint_stmt20.getTree());

                    }
                    break;
                case 15 :
                    // Sql.g:68:5: release_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_release_stmt_in_sql_stmt_core238);
                    release_stmt21=release_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, release_stmt21.getTree());

                    }
                    break;
                case 16 :
                    // Sql.g:70:5: create_virtual_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_virtual_table_stmt_in_sql_stmt_core247);
                    create_virtual_table_stmt22=create_virtual_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_virtual_table_stmt22.getTree());

                    }
                    break;
                case 17 :
                    // Sql.g:71:5: create_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_table_stmt_in_sql_stmt_core253);
                    create_table_stmt23=create_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_table_stmt23.getTree());

                    }
                    break;
                case 18 :
                    // Sql.g:72:5: drop_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_table_stmt_in_sql_stmt_core259);
                    drop_table_stmt24=drop_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_table_stmt24.getTree());

                    }
                    break;
                case 19 :
                    // Sql.g:73:5: alter_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_alter_table_stmt_in_sql_stmt_core265);
                    alter_table_stmt25=alter_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, alter_table_stmt25.getTree());

                    }
                    break;
                case 20 :
                    // Sql.g:74:5: create_view_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_view_stmt_in_sql_stmt_core271);
                    create_view_stmt26=create_view_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_view_stmt26.getTree());

                    }
                    break;
                case 21 :
                    // Sql.g:75:5: drop_view_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_view_stmt_in_sql_stmt_core277);
                    drop_view_stmt27=drop_view_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_view_stmt27.getTree());

                    }
                    break;
                case 22 :
                    // Sql.g:76:5: create_index_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_index_stmt_in_sql_stmt_core283);
                    create_index_stmt28=create_index_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_index_stmt28.getTree());

                    }
                    break;
                case 23 :
                    // Sql.g:77:5: drop_index_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_index_stmt_in_sql_stmt_core289);
                    drop_index_stmt29=drop_index_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_index_stmt29.getTree());

                    }
                    break;
                case 24 :
                    // Sql.g:78:5: create_trigger_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_trigger_stmt_in_sql_stmt_core295);
                    create_trigger_stmt30=create_trigger_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_trigger_stmt30.getTree());

                    }
                    break;
                case 25 :
                    // Sql.g:79:5: drop_trigger_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_trigger_stmt_in_sql_stmt_core301);
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
    // Sql.g:81:1: qualified_table_name : (database_name= ID DOT )? table_name= ID ( INDEXED BY index_name= ID | NOT INDEXED )? ;
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
            // Sql.g:81:21: ( (database_name= ID DOT )? table_name= ID ( INDEXED BY index_name= ID | NOT INDEXED )? )
            // Sql.g:81:23: (database_name= ID DOT )? table_name= ID ( INDEXED BY index_name= ID | NOT INDEXED )?
            {
            root_0 = (Object)adaptor.nil();

            // Sql.g:81:23: (database_name= ID DOT )?
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // Sql.g:81:24: database_name= ID DOT
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_qualified_table_name311); 
                    database_name_tree = (Object)adaptor.create(database_name);
                    adaptor.addChild(root_0, database_name_tree);

                    DOT32=(Token)match(input,DOT,FOLLOW_DOT_in_qualified_table_name313); 
                    DOT32_tree = (Object)adaptor.create(DOT32);
                    adaptor.addChild(root_0, DOT32_tree);


                    }
                    break;

            }

            table_name=(Token)match(input,ID,FOLLOW_ID_in_qualified_table_name319); 
            table_name_tree = (Object)adaptor.create(table_name);
            adaptor.addChild(root_0, table_name_tree);

            // Sql.g:81:61: ( INDEXED BY index_name= ID | NOT INDEXED )?
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
                    // Sql.g:81:62: INDEXED BY index_name= ID
                    {
                    INDEXED33=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_qualified_table_name322); 
                    INDEXED33_tree = (Object)adaptor.create(INDEXED33);
                    adaptor.addChild(root_0, INDEXED33_tree);

                    BY34=(Token)match(input,BY,FOLLOW_BY_in_qualified_table_name324); 
                    BY34_tree = (Object)adaptor.create(BY34);
                    adaptor.addChild(root_0, BY34_tree);

                    index_name=(Token)match(input,ID,FOLLOW_ID_in_qualified_table_name328); 
                    index_name_tree = (Object)adaptor.create(index_name);
                    adaptor.addChild(root_0, index_name_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:81:89: NOT INDEXED
                    {
                    NOT35=(Token)match(input,NOT,FOLLOW_NOT_in_qualified_table_name332); 
                    NOT35_tree = (Object)adaptor.create(NOT35);
                    adaptor.addChild(root_0, NOT35_tree);

                    INDEXED36=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_qualified_table_name334); 
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
    // Sql.g:83:1: expr : or_subexpr ( OR or_subexpr )* ;
    public final SqlParser.expr_return expr() throws RecognitionException {
        SqlParser.expr_return retval = new SqlParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR38=null;
        SqlParser.or_subexpr_return or_subexpr37 = null;

        SqlParser.or_subexpr_return or_subexpr39 = null;


        Object OR38_tree=null;

        try {
            // Sql.g:83:5: ( or_subexpr ( OR or_subexpr )* )
            // Sql.g:83:7: or_subexpr ( OR or_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_or_subexpr_in_expr343);
            or_subexpr37=or_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, or_subexpr37.getTree());
            // Sql.g:83:18: ( OR or_subexpr )*
            loop7:
            do {
                int alt7=2;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // Sql.g:83:19: OR or_subexpr
            	    {
            	    OR38=(Token)match(input,OR,FOLLOW_OR_in_expr346); 
            	    OR38_tree = (Object)adaptor.create(OR38);
            	    root_0 = (Object)adaptor.becomeRoot(OR38_tree, root_0);

            	    pushFollow(FOLLOW_or_subexpr_in_expr349);
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
    // Sql.g:85:1: or_subexpr : and_subexpr ( AND and_subexpr )* ;
    public final SqlParser.or_subexpr_return or_subexpr() throws RecognitionException {
        SqlParser.or_subexpr_return retval = new SqlParser.or_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND41=null;
        SqlParser.and_subexpr_return and_subexpr40 = null;

        SqlParser.and_subexpr_return and_subexpr42 = null;


        Object AND41_tree=null;

        try {
            // Sql.g:85:11: ( and_subexpr ( AND and_subexpr )* )
            // Sql.g:85:13: and_subexpr ( AND and_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_and_subexpr_in_or_subexpr358);
            and_subexpr40=and_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, and_subexpr40.getTree());
            // Sql.g:85:25: ( AND and_subexpr )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // Sql.g:85:26: AND and_subexpr
            	    {
            	    AND41=(Token)match(input,AND,FOLLOW_AND_in_or_subexpr361); 
            	    AND41_tree = (Object)adaptor.create(AND41);
            	    root_0 = (Object)adaptor.becomeRoot(AND41_tree, root_0);

            	    pushFollow(FOLLOW_and_subexpr_in_or_subexpr364);
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
    // Sql.g:87:1: and_subexpr : ( eq_subexpr ( ( '=' | '==' | '!=' | '<>' ) eq_subexpr )* | ( NOT )? ( LIKE | GLOB | REGEXP | MATCH ) eq_subexpr ( ESCAPE eq_subexpr )? | ( NOT )? IN ( LPAREN ( select_stmt | expr ( COMMA expr )* )? RPAREN | (db_name= ID DOT )? table_name= ID ) | ( ISNULL | NOTNULL | IS NULL | IS NOT NULL ) | ( NOT )? BETWEEN eq_subexpr AND eq_subexpr );
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
            // Sql.g:87:12: ( eq_subexpr ( ( '=' | '==' | '!=' | '<>' ) eq_subexpr )* | ( NOT )? ( LIKE | GLOB | REGEXP | MATCH ) eq_subexpr ( ESCAPE eq_subexpr )? | ( NOT )? IN ( LPAREN ( select_stmt | expr ( COMMA expr )* )? RPAREN | (db_name= ID DOT )? table_name= ID ) | ( ISNULL | NOTNULL | IS NULL | IS NOT NULL ) | ( NOT )? BETWEEN eq_subexpr AND eq_subexpr )
            int alt19=5;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // Sql.g:87:14: eq_subexpr ( ( '=' | '==' | '!=' | '<>' ) eq_subexpr )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr373);
                    eq_subexpr43=eq_subexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, eq_subexpr43.getTree());
                    // Sql.g:88:3: ( ( '=' | '==' | '!=' | '<>' ) eq_subexpr )*
                    loop9:
                    do {
                        int alt9=2;
                        alt9 = dfa9.predict(input);
                        switch (alt9) {
                    	case 1 :
                    	    // Sql.g:88:5: ( '=' | '==' | '!=' | '<>' ) eq_subexpr
                    	    {
                    	    set44=(Token)input.LT(1);
                    	    if ( input.LA(1)==EQUALS||(input.LA(1)>=176 && input.LA(1)<=178) ) {
                    	        input.consume();
                    	        adaptor.addChild(root_0, (Object)adaptor.create(set44));
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr395);
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
                    // Sql.g:89:5: ( NOT )? ( LIKE | GLOB | REGEXP | MATCH ) eq_subexpr ( ESCAPE eq_subexpr )?
                    {
                    root_0 = (Object)adaptor.nil();

                    // Sql.g:89:5: ( NOT )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==NOT) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // Sql.g:89:6: NOT
                            {
                            NOT46=(Token)match(input,NOT,FOLLOW_NOT_in_and_subexpr404); 
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

                    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr424);
                    eq_subexpr48=eq_subexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, eq_subexpr48.getTree());
                    // Sql.g:89:54: ( ESCAPE eq_subexpr )?
                    int alt11=2;
                    alt11 = dfa11.predict(input);
                    switch (alt11) {
                        case 1 :
                            // Sql.g:89:55: ESCAPE eq_subexpr
                            {
                            ESCAPE49=(Token)match(input,ESCAPE,FOLLOW_ESCAPE_in_and_subexpr427); 
                            ESCAPE49_tree = (Object)adaptor.create(ESCAPE49);
                            adaptor.addChild(root_0, ESCAPE49_tree);

                            pushFollow(FOLLOW_eq_subexpr_in_and_subexpr429);
                            eq_subexpr50=eq_subexpr();

                            state._fsp--;

                            adaptor.addChild(root_0, eq_subexpr50.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // Sql.g:90:5: ( NOT )? IN ( LPAREN ( select_stmt | expr ( COMMA expr )* )? RPAREN | (db_name= ID DOT )? table_name= ID )
                    {
                    root_0 = (Object)adaptor.nil();

                    // Sql.g:90:5: ( NOT )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==NOT) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // Sql.g:90:6: NOT
                            {
                            NOT51=(Token)match(input,NOT,FOLLOW_NOT_in_and_subexpr438); 
                            NOT51_tree = (Object)adaptor.create(NOT51);
                            adaptor.addChild(root_0, NOT51_tree);


                            }
                            break;

                    }

                    IN52=(Token)match(input,IN,FOLLOW_IN_in_and_subexpr442); 
                    IN52_tree = (Object)adaptor.create(IN52);
                    adaptor.addChild(root_0, IN52_tree);

                    // Sql.g:90:15: ( LPAREN ( select_stmt | expr ( COMMA expr )* )? RPAREN | (db_name= ID DOT )? table_name= ID )
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
                            // Sql.g:90:16: LPAREN ( select_stmt | expr ( COMMA expr )* )? RPAREN
                            {
                            LPAREN53=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_and_subexpr445); 
                            LPAREN53_tree = (Object)adaptor.create(LPAREN53);
                            adaptor.addChild(root_0, LPAREN53_tree);

                            // Sql.g:90:23: ( select_stmt | expr ( COMMA expr )* )?
                            int alt14=3;
                            alt14 = dfa14.predict(input);
                            switch (alt14) {
                                case 1 :
                                    // Sql.g:90:24: select_stmt
                                    {
                                    pushFollow(FOLLOW_select_stmt_in_and_subexpr448);
                                    select_stmt54=select_stmt();

                                    state._fsp--;

                                    adaptor.addChild(root_0, select_stmt54.getTree());

                                    }
                                    break;
                                case 2 :
                                    // Sql.g:90:38: expr ( COMMA expr )*
                                    {
                                    pushFollow(FOLLOW_expr_in_and_subexpr452);
                                    expr55=expr();

                                    state._fsp--;

                                    adaptor.addChild(root_0, expr55.getTree());
                                    // Sql.g:90:43: ( COMMA expr )*
                                    loop13:
                                    do {
                                        int alt13=2;
                                        int LA13_0 = input.LA(1);

                                        if ( (LA13_0==COMMA) ) {
                                            alt13=1;
                                        }


                                        switch (alt13) {
                                    	case 1 :
                                    	    // Sql.g:90:44: COMMA expr
                                    	    {
                                    	    COMMA56=(Token)match(input,COMMA,FOLLOW_COMMA_in_and_subexpr455); 
                                    	    COMMA56_tree = (Object)adaptor.create(COMMA56);
                                    	    adaptor.addChild(root_0, COMMA56_tree);

                                    	    pushFollow(FOLLOW_expr_in_and_subexpr457);
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

                            RPAREN58=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_and_subexpr463); 
                            RPAREN58_tree = (Object)adaptor.create(RPAREN58);
                            adaptor.addChild(root_0, RPAREN58_tree);


                            }
                            break;
                        case 2 :
                            // Sql.g:90:68: (db_name= ID DOT )? table_name= ID
                            {
                            // Sql.g:90:68: (db_name= ID DOT )?
                            int alt15=2;
                            alt15 = dfa15.predict(input);
                            switch (alt15) {
                                case 1 :
                                    // Sql.g:90:69: db_name= ID DOT
                                    {
                                    db_name=(Token)match(input,ID,FOLLOW_ID_in_and_subexpr470); 
                                    db_name_tree = (Object)adaptor.create(db_name);
                                    adaptor.addChild(root_0, db_name_tree);

                                    DOT59=(Token)match(input,DOT,FOLLOW_DOT_in_and_subexpr472); 
                                    DOT59_tree = (Object)adaptor.create(DOT59);
                                    adaptor.addChild(root_0, DOT59_tree);


                                    }
                                    break;

                            }

                            table_name=(Token)match(input,ID,FOLLOW_ID_in_and_subexpr478); 
                            table_name_tree = (Object)adaptor.create(table_name);
                            adaptor.addChild(root_0, table_name_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // Sql.g:91:5: ( ISNULL | NOTNULL | IS NULL | IS NOT NULL )
                    {
                    root_0 = (Object)adaptor.nil();

                    // Sql.g:91:5: ( ISNULL | NOTNULL | IS NULL | IS NOT NULL )
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
                            // Sql.g:91:6: ISNULL
                            {
                            ISNULL60=(Token)match(input,ISNULL,FOLLOW_ISNULL_in_and_subexpr486); 
                            ISNULL60_tree = (Object)adaptor.create(ISNULL60);
                            adaptor.addChild(root_0, ISNULL60_tree);


                            }
                            break;
                        case 2 :
                            // Sql.g:91:15: NOTNULL
                            {
                            NOTNULL61=(Token)match(input,NOTNULL,FOLLOW_NOTNULL_in_and_subexpr490); 
                            NOTNULL61_tree = (Object)adaptor.create(NOTNULL61);
                            adaptor.addChild(root_0, NOTNULL61_tree);


                            }
                            break;
                        case 3 :
                            // Sql.g:91:25: IS NULL
                            {
                            IS62=(Token)match(input,IS,FOLLOW_IS_in_and_subexpr494); 
                            IS62_tree = (Object)adaptor.create(IS62);
                            adaptor.addChild(root_0, IS62_tree);

                            NULL63=(Token)match(input,NULL,FOLLOW_NULL_in_and_subexpr496); 
                            NULL63_tree = (Object)adaptor.create(NULL63);
                            adaptor.addChild(root_0, NULL63_tree);


                            }
                            break;
                        case 4 :
                            // Sql.g:91:88: IS NOT NULL
                            {
                            IS64=(Token)match(input,IS,FOLLOW_IS_in_and_subexpr501); 
                            IS64_tree = (Object)adaptor.create(IS64);
                            adaptor.addChild(root_0, IS64_tree);

                            NOT65=(Token)match(input,NOT,FOLLOW_NOT_in_and_subexpr503); 
                            NOT65_tree = (Object)adaptor.create(NOT65);
                            adaptor.addChild(root_0, NOT65_tree);

                            NULL66=(Token)match(input,NULL,FOLLOW_NULL_in_and_subexpr505); 
                            NULL66_tree = (Object)adaptor.create(NULL66);
                            adaptor.addChild(root_0, NULL66_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // Sql.g:92:5: ( NOT )? BETWEEN eq_subexpr AND eq_subexpr
                    {
                    root_0 = (Object)adaptor.nil();

                    // Sql.g:92:5: ( NOT )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NOT) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // Sql.g:92:6: NOT
                            {
                            NOT67=(Token)match(input,NOT,FOLLOW_NOT_in_and_subexpr513); 
                            NOT67_tree = (Object)adaptor.create(NOT67);
                            adaptor.addChild(root_0, NOT67_tree);


                            }
                            break;

                    }

                    BETWEEN68=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_and_subexpr517); 
                    BETWEEN68_tree = (Object)adaptor.create(BETWEEN68);
                    adaptor.addChild(root_0, BETWEEN68_tree);

                    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr519);
                    eq_subexpr69=eq_subexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, eq_subexpr69.getTree());
                    AND70=(Token)match(input,AND,FOLLOW_AND_in_and_subexpr521); 
                    AND70_tree = (Object)adaptor.create(AND70);
                    adaptor.addChild(root_0, AND70_tree);

                    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr523);
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
    // Sql.g:94:1: eq_subexpr : neq_subexpr ( ( '<' | '<=' | '>' | '>=' ) neq_subexpr )* ;
    public final SqlParser.eq_subexpr_return eq_subexpr() throws RecognitionException {
        SqlParser.eq_subexpr_return retval = new SqlParser.eq_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set73=null;
        SqlParser.neq_subexpr_return neq_subexpr72 = null;

        SqlParser.neq_subexpr_return neq_subexpr74 = null;


        Object set73_tree=null;

        try {
            // Sql.g:94:11: ( neq_subexpr ( ( '<' | '<=' | '>' | '>=' ) neq_subexpr )* )
            // Sql.g:94:13: neq_subexpr ( ( '<' | '<=' | '>' | '>=' ) neq_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_neq_subexpr_in_eq_subexpr530);
            neq_subexpr72=neq_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, neq_subexpr72.getTree());
            // Sql.g:94:25: ( ( '<' | '<=' | '>' | '>=' ) neq_subexpr )*
            loop20:
            do {
                int alt20=2;
                alt20 = dfa20.predict(input);
                switch (alt20) {
            	case 1 :
            	    // Sql.g:94:26: ( '<' | '<=' | '>' | '>=' ) neq_subexpr
            	    {
            	    set73=(Token)input.LT(1);
            	    set73=(Token)input.LT(1);
            	    if ( (input.LA(1)>=179 && input.LA(1)<=182) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set73), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_neq_subexpr_in_eq_subexpr550);
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
    // Sql.g:96:1: neq_subexpr : bit_subexpr ( ( '<<' | '>>' | '&' | '|' ) bit_subexpr )* ;
    public final SqlParser.neq_subexpr_return neq_subexpr() throws RecognitionException {
        SqlParser.neq_subexpr_return retval = new SqlParser.neq_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set76=null;
        SqlParser.bit_subexpr_return bit_subexpr75 = null;

        SqlParser.bit_subexpr_return bit_subexpr77 = null;


        Object set76_tree=null;

        try {
            // Sql.g:96:12: ( bit_subexpr ( ( '<<' | '>>' | '&' | '|' ) bit_subexpr )* )
            // Sql.g:96:14: bit_subexpr ( ( '<<' | '>>' | '&' | '|' ) bit_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bit_subexpr_in_neq_subexpr559);
            bit_subexpr75=bit_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, bit_subexpr75.getTree());
            // Sql.g:96:26: ( ( '<<' | '>>' | '&' | '|' ) bit_subexpr )*
            loop21:
            do {
                int alt21=2;
                alt21 = dfa21.predict(input);
                switch (alt21) {
            	case 1 :
            	    // Sql.g:96:27: ( '<<' | '>>' | '&' | '|' ) bit_subexpr
            	    {
            	    set76=(Token)input.LT(1);
            	    set76=(Token)input.LT(1);
            	    if ( (input.LA(1)>=183 && input.LA(1)<=186) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set76), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_bit_subexpr_in_neq_subexpr579);
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
    // Sql.g:98:1: bit_subexpr : add_subexpr ( ( '+' | '-' ) add_subexpr )* ;
    public final SqlParser.bit_subexpr_return bit_subexpr() throws RecognitionException {
        SqlParser.bit_subexpr_return retval = new SqlParser.bit_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set79=null;
        SqlParser.add_subexpr_return add_subexpr78 = null;

        SqlParser.add_subexpr_return add_subexpr80 = null;


        Object set79_tree=null;

        try {
            // Sql.g:98:12: ( add_subexpr ( ( '+' | '-' ) add_subexpr )* )
            // Sql.g:98:14: add_subexpr ( ( '+' | '-' ) add_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_subexpr_in_bit_subexpr588);
            add_subexpr78=add_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, add_subexpr78.getTree());
            // Sql.g:98:26: ( ( '+' | '-' ) add_subexpr )*
            loop22:
            do {
                int alt22=2;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // Sql.g:98:27: ( '+' | '-' ) add_subexpr
            	    {
            	    set79=(Token)input.LT(1);
            	    set79=(Token)input.LT(1);
            	    if ( (input.LA(1)>=187 && input.LA(1)<=188) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set79), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_add_subexpr_in_bit_subexpr600);
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
    // Sql.g:100:1: add_subexpr : mul_subexpr ( ( '*' | '/' | '%' ) mul_subexpr )* ;
    public final SqlParser.add_subexpr_return add_subexpr() throws RecognitionException {
        SqlParser.add_subexpr_return retval = new SqlParser.add_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set82=null;
        SqlParser.mul_subexpr_return mul_subexpr81 = null;

        SqlParser.mul_subexpr_return mul_subexpr83 = null;


        Object set82_tree=null;

        try {
            // Sql.g:100:12: ( mul_subexpr ( ( '*' | '/' | '%' ) mul_subexpr )* )
            // Sql.g:100:14: mul_subexpr ( ( '*' | '/' | '%' ) mul_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mul_subexpr_in_add_subexpr609);
            mul_subexpr81=mul_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, mul_subexpr81.getTree());
            // Sql.g:100:26: ( ( '*' | '/' | '%' ) mul_subexpr )*
            loop23:
            do {
                int alt23=2;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // Sql.g:100:27: ( '*' | '/' | '%' ) mul_subexpr
            	    {
            	    set82=(Token)input.LT(1);
            	    set82=(Token)input.LT(1);
            	    if ( input.LA(1)==ASTERISK||(input.LA(1)>=189 && input.LA(1)<=190) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set82), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mul_subexpr_in_add_subexpr625);
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
    // Sql.g:102:1: mul_subexpr : con_subexpr ( '||' con_subexpr )* ;
    public final SqlParser.mul_subexpr_return mul_subexpr() throws RecognitionException {
        SqlParser.mul_subexpr_return retval = new SqlParser.mul_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal85=null;
        SqlParser.con_subexpr_return con_subexpr84 = null;

        SqlParser.con_subexpr_return con_subexpr86 = null;


        Object string_literal85_tree=null;

        try {
            // Sql.g:102:12: ( con_subexpr ( '||' con_subexpr )* )
            // Sql.g:102:14: con_subexpr ( '||' con_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_con_subexpr_in_mul_subexpr634);
            con_subexpr84=con_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, con_subexpr84.getTree());
            // Sql.g:102:26: ( '||' con_subexpr )*
            loop24:
            do {
                int alt24=2;
                alt24 = dfa24.predict(input);
                switch (alt24) {
            	case 1 :
            	    // Sql.g:102:27: '||' con_subexpr
            	    {
            	    string_literal85=(Token)match(input,191,FOLLOW_191_in_mul_subexpr637); 
            	    string_literal85_tree = (Object)adaptor.create(string_literal85);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal85_tree, root_0);

            	    pushFollow(FOLLOW_con_subexpr_in_mul_subexpr640);
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
    // Sql.g:104:1: con_subexpr : ( '-' | '+' | '~' | NOT )? unary_subexpr ;
    public final SqlParser.con_subexpr_return con_subexpr() throws RecognitionException {
        SqlParser.con_subexpr_return retval = new SqlParser.con_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set87=null;
        SqlParser.unary_subexpr_return unary_subexpr88 = null;


        Object set87_tree=null;

        try {
            // Sql.g:104:12: ( ( '-' | '+' | '~' | NOT )? unary_subexpr )
            // Sql.g:104:14: ( '-' | '+' | '~' | NOT )? unary_subexpr
            {
            root_0 = (Object)adaptor.nil();

            // Sql.g:104:14: ( '-' | '+' | '~' | NOT )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // Sql.g:
                    {
                    set87=(Token)input.LT(1);
                    if ( input.LA(1)==NOT||(input.LA(1)>=187 && input.LA(1)<=188)||input.LA(1)==192 ) {
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

            pushFollow(FOLLOW_unary_subexpr_in_con_subexpr666);
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
    // Sql.g:106:1: unary_subexpr : atom_expr ( COLLATE collation_name= ID )? ;
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
            // Sql.g:106:14: ( atom_expr ( COLLATE collation_name= ID )? )
            // Sql.g:106:16: atom_expr ( COLLATE collation_name= ID )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atom_expr_in_unary_subexpr673);
            atom_expr89=atom_expr();

            state._fsp--;

            adaptor.addChild(root_0, atom_expr89.getTree());
            // Sql.g:106:26: ( COLLATE collation_name= ID )?
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // Sql.g:106:27: COLLATE collation_name= ID
                    {
                    COLLATE90=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_unary_subexpr676); 
                    COLLATE90_tree = (Object)adaptor.create(COLLATE90);
                    root_0 = (Object)adaptor.becomeRoot(COLLATE90_tree, root_0);

                    collation_name=(Token)match(input,ID,FOLLOW_ID_in_unary_subexpr681); 
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
    // Sql.g:108:1: atom_expr : ( literal_value | bind_parameter | ( (database_name= ID DOT )? table_name= ID DOT )? column_name= ID | function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN | LPAREN expr RPAREN -> expr | CAST LPAREN expr AS type_name RPAREN | ( EXISTS )? LPAREN select_stmt RPAREN | CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END | raise_function );
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
            // Sql.g:109:3: ( literal_value | bind_parameter | ( (database_name= ID DOT )? table_name= ID DOT )? column_name= ID | function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN | LPAREN expr RPAREN -> expr | CAST LPAREN expr AS type_name RPAREN | ( EXISTS )? LPAREN select_stmt RPAREN | CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END | raise_function )
            int alt36=9;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // Sql.g:109:5: literal_value
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_value_in_atom_expr693);
                    literal_value91=literal_value();

                    state._fsp--;

                    adaptor.addChild(root_0, literal_value91.getTree());

                    }
                    break;
                case 2 :
                    // Sql.g:110:5: bind_parameter
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_bind_parameter_in_atom_expr699);
                    bind_parameter92=bind_parameter();

                    state._fsp--;

                    adaptor.addChild(root_0, bind_parameter92.getTree());

                    }
                    break;
                case 3 :
                    // Sql.g:111:5: ( (database_name= ID DOT )? table_name= ID DOT )? column_name= ID
                    {
                    root_0 = (Object)adaptor.nil();

                    // Sql.g:111:5: ( (database_name= ID DOT )? table_name= ID DOT )?
                    int alt28=2;
                    alt28 = dfa28.predict(input);
                    switch (alt28) {
                        case 1 :
                            // Sql.g:111:6: (database_name= ID DOT )? table_name= ID DOT
                            {
                            // Sql.g:111:6: (database_name= ID DOT )?
                            int alt27=2;
                            alt27 = dfa27.predict(input);
                            switch (alt27) {
                                case 1 :
                                    // Sql.g:111:7: database_name= ID DOT
                                    {
                                    database_name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr709); 
                                    database_name_tree = (Object)adaptor.create(database_name);
                                    adaptor.addChild(root_0, database_name_tree);

                                    DOT93=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expr711); 
                                    DOT93_tree = (Object)adaptor.create(DOT93);
                                    adaptor.addChild(root_0, DOT93_tree);


                                    }
                                    break;

                            }

                            table_name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr717); 
                            table_name_tree = (Object)adaptor.create(table_name);
                            adaptor.addChild(root_0, table_name_tree);

                            DOT94=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expr719); 
                            DOT94_tree = (Object)adaptor.create(DOT94);
                            adaptor.addChild(root_0, DOT94_tree);


                            }
                            break;

                    }

                    column_name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr725); 
                    column_name_tree = (Object)adaptor.create(column_name);
                    adaptor.addChild(root_0, column_name_tree);


                    }
                    break;
                case 4 :
                    // Sql.g:112:5: function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    function_name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr733); 
                    function_name_tree = (Object)adaptor.create(function_name);
                    adaptor.addChild(root_0, function_name_tree);

                    LPAREN95=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr735); 
                    LPAREN95_tree = (Object)adaptor.create(LPAREN95);
                    adaptor.addChild(root_0, LPAREN95_tree);

                    // Sql.g:112:29: ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )?
                    int alt31=3;
                    alt31 = dfa31.predict(input);
                    switch (alt31) {
                        case 1 :
                            // Sql.g:112:30: ( DISTINCT )? args+= expr ( COMMA args+= expr )*
                            {
                            // Sql.g:112:30: ( DISTINCT )?
                            int alt29=2;
                            alt29 = dfa29.predict(input);
                            switch (alt29) {
                                case 1 :
                                    // Sql.g:112:31: DISTINCT
                                    {
                                    DISTINCT96=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_atom_expr739); 
                                    DISTINCT96_tree = (Object)adaptor.create(DISTINCT96);
                                    adaptor.addChild(root_0, DISTINCT96_tree);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_expr_in_atom_expr745);
                            args=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, args.getTree());
                            if (list_args==null) list_args=new ArrayList();
                            list_args.add(args.getTree());

                            // Sql.g:112:53: ( COMMA args+= expr )*
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( (LA30_0==COMMA) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // Sql.g:112:54: COMMA args+= expr
                            	    {
                            	    COMMA97=(Token)match(input,COMMA,FOLLOW_COMMA_in_atom_expr748); 
                            	    COMMA97_tree = (Object)adaptor.create(COMMA97);
                            	    adaptor.addChild(root_0, COMMA97_tree);

                            	    pushFollow(FOLLOW_expr_in_atom_expr752);
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
                            // Sql.g:112:75: ASTERISK
                            {
                            ASTERISK98=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_atom_expr758); 
                            ASTERISK98_tree = (Object)adaptor.create(ASTERISK98);
                            adaptor.addChild(root_0, ASTERISK98_tree);


                            }
                            break;

                    }

                    RPAREN99=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr762); 
                    RPAREN99_tree = (Object)adaptor.create(RPAREN99);
                    adaptor.addChild(root_0, RPAREN99_tree);


                    }
                    break;
                case 5 :
                    // Sql.g:113:5: LPAREN expr RPAREN
                    {
                    LPAREN100=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr768);  
                    stream_LPAREN.add(LPAREN100);

                    pushFollow(FOLLOW_expr_in_atom_expr770);
                    expr101=expr();

                    state._fsp--;

                    stream_expr.add(expr101.getTree());
                    RPAREN102=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr772);  
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
                    // Sql.g:114:5: CAST LPAREN expr AS type_name RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    CAST103=(Token)match(input,CAST,FOLLOW_CAST_in_atom_expr782); 
                    CAST103_tree = (Object)adaptor.create(CAST103);
                    adaptor.addChild(root_0, CAST103_tree);

                    LPAREN104=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr784); 
                    LPAREN104_tree = (Object)adaptor.create(LPAREN104);
                    adaptor.addChild(root_0, LPAREN104_tree);

                    pushFollow(FOLLOW_expr_in_atom_expr786);
                    expr105=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr105.getTree());
                    AS106=(Token)match(input,AS,FOLLOW_AS_in_atom_expr788); 
                    AS106_tree = (Object)adaptor.create(AS106);
                    adaptor.addChild(root_0, AS106_tree);

                    pushFollow(FOLLOW_type_name_in_atom_expr790);
                    type_name107=type_name();

                    state._fsp--;

                    adaptor.addChild(root_0, type_name107.getTree());
                    RPAREN108=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr792); 
                    RPAREN108_tree = (Object)adaptor.create(RPAREN108);
                    adaptor.addChild(root_0, RPAREN108_tree);


                    }
                    break;
                case 7 :
                    // Sql.g:115:5: ( EXISTS )? LPAREN select_stmt RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    // Sql.g:115:5: ( EXISTS )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==EXISTS) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // Sql.g:115:53: EXISTS
                            {
                            EXISTS109=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_atom_expr801); 
                            EXISTS109_tree = (Object)adaptor.create(EXISTS109);
                            adaptor.addChild(root_0, EXISTS109_tree);


                            }
                            break;

                    }

                    LPAREN110=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr805); 
                    LPAREN110_tree = (Object)adaptor.create(LPAREN110);
                    adaptor.addChild(root_0, LPAREN110_tree);

                    pushFollow(FOLLOW_select_stmt_in_atom_expr807);
                    select_stmt111=select_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, select_stmt111.getTree());
                    RPAREN112=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr809); 
                    RPAREN112_tree = (Object)adaptor.create(RPAREN112);
                    adaptor.addChild(root_0, RPAREN112_tree);


                    }
                    break;
                case 8 :
                    // Sql.g:116:5: CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END
                    {
                    root_0 = (Object)adaptor.nil();

                    CASE113=(Token)match(input,CASE,FOLLOW_CASE_in_atom_expr815); 
                    CASE113_tree = (Object)adaptor.create(CASE113);
                    adaptor.addChild(root_0, CASE113_tree);

                    // Sql.g:116:10: ( expr )?
                    int alt33=2;
                    alt33 = dfa33.predict(input);
                    switch (alt33) {
                        case 1 :
                            // Sql.g:116:11: expr
                            {
                            pushFollow(FOLLOW_expr_in_atom_expr818);
                            expr114=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr114.getTree());

                            }
                            break;

                    }

                    // Sql.g:116:18: ( WHEN expr THEN expr )+
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
                    	    // Sql.g:116:19: WHEN expr THEN expr
                    	    {
                    	    WHEN115=(Token)match(input,WHEN,FOLLOW_WHEN_in_atom_expr823); 
                    	    WHEN115_tree = (Object)adaptor.create(WHEN115);
                    	    adaptor.addChild(root_0, WHEN115_tree);

                    	    pushFollow(FOLLOW_expr_in_atom_expr825);
                    	    expr116=expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expr116.getTree());
                    	    THEN117=(Token)match(input,THEN,FOLLOW_THEN_in_atom_expr827); 
                    	    THEN117_tree = (Object)adaptor.create(THEN117);
                    	    adaptor.addChild(root_0, THEN117_tree);

                    	    pushFollow(FOLLOW_expr_in_atom_expr829);
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

                    // Sql.g:116:41: ( ELSE expr )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==ELSE) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // Sql.g:116:42: ELSE expr
                            {
                            ELSE119=(Token)match(input,ELSE,FOLLOW_ELSE_in_atom_expr834); 
                            ELSE119_tree = (Object)adaptor.create(ELSE119);
                            adaptor.addChild(root_0, ELSE119_tree);

                            pushFollow(FOLLOW_expr_in_atom_expr836);
                            expr120=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr120.getTree());

                            }
                            break;

                    }

                    END121=(Token)match(input,END,FOLLOW_END_in_atom_expr840); 
                    END121_tree = (Object)adaptor.create(END121);
                    adaptor.addChild(root_0, END121_tree);


                    }
                    break;
                case 9 :
                    // Sql.g:117:5: raise_function
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_raise_function_in_atom_expr846);
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
    // Sql.g:119:1: literal_value : ( INTEGER | FLOAT | STRING | BLOB | NULL | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP );
    public final SqlParser.literal_value_return literal_value() throws RecognitionException {
        SqlParser.literal_value_return retval = new SqlParser.literal_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set123=null;

        Object set123_tree=null;

        try {
            // Sql.g:119:14: ( INTEGER | FLOAT | STRING | BLOB | NULL | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP )
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
    // Sql.g:121:1: signed_number : ( INTEGER | FLOAT | SIGNED_NUMBER );
    public final SqlParser.signed_number_return signed_number() throws RecognitionException {
        SqlParser.signed_number_return retval = new SqlParser.signed_number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set124=null;

        Object set124_tree=null;

        try {
            // Sql.g:121:14: ( INTEGER | FLOAT | SIGNED_NUMBER )
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
    // Sql.g:123:1: bind_parameter : ( '?' | '?' number= INTEGER | ':' name= ID | '@' name= ID | '$' name= TCL_ID );
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
            // Sql.g:124:3: ( '?' | '?' number= INTEGER | ':' name= ID | '@' name= ID | '$' name= TCL_ID )
            int alt37=5;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // Sql.g:124:5: '?'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal125=(Token)match(input,193,FOLLOW_193_in_bind_parameter906); 
                    char_literal125_tree = (Object)adaptor.create(char_literal125);
                    adaptor.addChild(root_0, char_literal125_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:125:5: '?' number= INTEGER
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal126=(Token)match(input,193,FOLLOW_193_in_bind_parameter912); 
                    char_literal126_tree = (Object)adaptor.create(char_literal126);
                    adaptor.addChild(root_0, char_literal126_tree);

                    number=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_bind_parameter916); 
                    number_tree = (Object)adaptor.create(number);
                    adaptor.addChild(root_0, number_tree);


                    }
                    break;
                case 3 :
                    // Sql.g:126:5: ':' name= ID
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal127=(Token)match(input,194,FOLLOW_194_in_bind_parameter922); 
                    char_literal127_tree = (Object)adaptor.create(char_literal127);
                    adaptor.addChild(root_0, char_literal127_tree);

                    name=(Token)match(input,ID,FOLLOW_ID_in_bind_parameter926); 
                    name_tree = (Object)adaptor.create(name);
                    adaptor.addChild(root_0, name_tree);


                    }
                    break;
                case 4 :
                    // Sql.g:127:5: '@' name= ID
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal128=(Token)match(input,195,FOLLOW_195_in_bind_parameter932); 
                    char_literal128_tree = (Object)adaptor.create(char_literal128);
                    adaptor.addChild(root_0, char_literal128_tree);

                    name=(Token)match(input,ID,FOLLOW_ID_in_bind_parameter936); 
                    name_tree = (Object)adaptor.create(name);
                    adaptor.addChild(root_0, name_tree);


                    }
                    break;
                case 5 :
                    // Sql.g:128:5: '$' name= TCL_ID
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal129=(Token)match(input,196,FOLLOW_196_in_bind_parameter942); 
                    char_literal129_tree = (Object)adaptor.create(char_literal129);
                    adaptor.addChild(root_0, char_literal129_tree);

                    name=(Token)match(input,TCL_ID,FOLLOW_TCL_ID_in_bind_parameter946); 
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
    // Sql.g:130:1: type_name : ( ID )+ ( LPAREN n1= signed_number ( COMMA n2= signed_number )? RPAREN )? -> ^( TYPE ( ID )+ ^( TYPE_PARAMS ( $n1)? ( $n2)? ) ) ;
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
            // Sql.g:130:10: ( ( ID )+ ( LPAREN n1= signed_number ( COMMA n2= signed_number )? RPAREN )? -> ^( TYPE ( ID )+ ^( TYPE_PARAMS ( $n1)? ( $n2)? ) ) )
            // Sql.g:130:12: ( ID )+ ( LPAREN n1= signed_number ( COMMA n2= signed_number )? RPAREN )?
            {
            // Sql.g:130:12: ( ID )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                alt38 = dfa38.predict(input);
                switch (alt38) {
            	case 1 :
            	    // Sql.g:130:12: ID
            	    {
            	    ID130=(Token)match(input,ID,FOLLOW_ID_in_type_name953);  
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

            // Sql.g:130:16: ( LPAREN n1= signed_number ( COMMA n2= signed_number )? RPAREN )?
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // Sql.g:130:17: LPAREN n1= signed_number ( COMMA n2= signed_number )? RPAREN
                    {
                    LPAREN131=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_type_name957);  
                    stream_LPAREN.add(LPAREN131);

                    pushFollow(FOLLOW_signed_number_in_type_name961);
                    n1=signed_number();

                    state._fsp--;

                    stream_signed_number.add(n1.getTree());
                    // Sql.g:130:41: ( COMMA n2= signed_number )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==COMMA) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // Sql.g:130:42: COMMA n2= signed_number
                            {
                            COMMA132=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_name964);  
                            stream_COMMA.add(COMMA132);

                            pushFollow(FOLLOW_signed_number_in_type_name968);
                            n2=signed_number();

                            state._fsp--;

                            stream_signed_number.add(n2.getTree());

                            }
                            break;

                    }

                    RPAREN133=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_type_name972);  
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
            // 130:76: -> ^( TYPE ( ID )+ ^( TYPE_PARAMS ( $n1)? ( $n2)? ) )
            {
                // Sql.g:130:79: ^( TYPE ( ID )+ ^( TYPE_PARAMS ( $n1)? ( $n2)? ) )
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
                // Sql.g:130:90: ^( TYPE_PARAMS ( $n1)? ( $n2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE_PARAMS, "TYPE_PARAMS"), root_2);

                // Sql.g:130:104: ( $n1)?
                if ( stream_n1.hasNext() ) {
                    adaptor.addChild(root_2, stream_n1.nextTree());

                }
                stream_n1.reset();
                // Sql.g:130:109: ( $n2)?
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
    // Sql.g:132:1: raise_function : RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN ;
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
            // Sql.g:132:15: ( RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN )
            // Sql.g:132:17: RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN
            {
            root_0 = (Object)adaptor.nil();

            RAISE134=(Token)match(input,RAISE,FOLLOW_RAISE_in_raise_function1002); 
            RAISE134_tree = (Object)adaptor.create(RAISE134);
            adaptor.addChild(root_0, RAISE134_tree);

            LPAREN135=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_raise_function1004); 
            LPAREN135_tree = (Object)adaptor.create(LPAREN135);
            adaptor.addChild(root_0, LPAREN135_tree);

            // Sql.g:132:30: ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING )
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
                    // Sql.g:132:31: IGNORE
                    {
                    IGNORE136=(Token)match(input,IGNORE,FOLLOW_IGNORE_in_raise_function1007); 
                    IGNORE136_tree = (Object)adaptor.create(IGNORE136);
                    adaptor.addChild(root_0, IGNORE136_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:132:40: ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING
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

                    COMMA138=(Token)match(input,COMMA,FOLLOW_COMMA_in_raise_function1023); 
                    COMMA138_tree = (Object)adaptor.create(COMMA138);
                    adaptor.addChild(root_0, COMMA138_tree);

                    error_message=(Token)match(input,STRING,FOLLOW_STRING_in_raise_function1027); 
                    error_message_tree = (Object)adaptor.create(error_message);
                    adaptor.addChild(root_0, error_message_tree);


                    }
                    break;

            }

            RPAREN139=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_raise_function1030); 
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
    // Sql.g:135:1: pragma_stmt : PRAGMA (database_name= ID DOT )? pragma_name= ID ( EQUALS pragma_value | LPAREN pragma_value RPAREN )? ;
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
            // Sql.g:135:12: ( PRAGMA (database_name= ID DOT )? pragma_name= ID ( EQUALS pragma_value | LPAREN pragma_value RPAREN )? )
            // Sql.g:135:14: PRAGMA (database_name= ID DOT )? pragma_name= ID ( EQUALS pragma_value | LPAREN pragma_value RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            PRAGMA140=(Token)match(input,PRAGMA,FOLLOW_PRAGMA_in_pragma_stmt1038); 
            PRAGMA140_tree = (Object)adaptor.create(PRAGMA140);
            adaptor.addChild(root_0, PRAGMA140_tree);

            // Sql.g:135:21: (database_name= ID DOT )?
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
                    // Sql.g:135:22: database_name= ID DOT
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_pragma_stmt1043); 
                    database_name_tree = (Object)adaptor.create(database_name);
                    adaptor.addChild(root_0, database_name_tree);

                    DOT141=(Token)match(input,DOT,FOLLOW_DOT_in_pragma_stmt1045); 
                    DOT141_tree = (Object)adaptor.create(DOT141);
                    adaptor.addChild(root_0, DOT141_tree);


                    }
                    break;

            }

            pragma_name=(Token)match(input,ID,FOLLOW_ID_in_pragma_stmt1051); 
            pragma_name_tree = (Object)adaptor.create(pragma_name);
            adaptor.addChild(root_0, pragma_name_tree);

            // Sql.g:135:60: ( EQUALS pragma_value | LPAREN pragma_value RPAREN )?
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
                    // Sql.g:135:61: EQUALS pragma_value
                    {
                    EQUALS142=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_pragma_stmt1054); 
                    EQUALS142_tree = (Object)adaptor.create(EQUALS142);
                    adaptor.addChild(root_0, EQUALS142_tree);

                    pushFollow(FOLLOW_pragma_value_in_pragma_stmt1056);
                    pragma_value143=pragma_value();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_value143.getTree());

                    }
                    break;
                case 2 :
                    // Sql.g:135:83: LPAREN pragma_value RPAREN
                    {
                    LPAREN144=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_pragma_stmt1060); 
                    LPAREN144_tree = (Object)adaptor.create(LPAREN144);
                    adaptor.addChild(root_0, LPAREN144_tree);

                    pushFollow(FOLLOW_pragma_value_in_pragma_stmt1062);
                    pragma_value145=pragma_value();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_value145.getTree());
                    RPAREN146=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_pragma_stmt1064); 
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
    // Sql.g:137:1: pragma_value : ( signed_number | name= ID | STRING );
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
            // Sql.g:137:13: ( signed_number | name= ID | STRING )
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
                    // Sql.g:137:15: signed_number
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_signed_number_in_pragma_value1073);
                    signed_number147=signed_number();

                    state._fsp--;

                    adaptor.addChild(root_0, signed_number147.getTree());

                    }
                    break;
                case 2 :
                    // Sql.g:137:31: name= ID
                    {
                    root_0 = (Object)adaptor.nil();

                    name=(Token)match(input,ID,FOLLOW_ID_in_pragma_value1079); 
                    name_tree = (Object)adaptor.create(name);
                    adaptor.addChild(root_0, name_tree);


                    }
                    break;
                case 3 :
                    // Sql.g:137:41: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING148=(Token)match(input,STRING,FOLLOW_STRING_in_pragma_value1083); 
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
    // Sql.g:140:1: attach_stmt : ATTACH ( DATABASE )? filename= ( STRING | ID ) AS database_name= ID ;
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
            // Sql.g:140:12: ( ATTACH ( DATABASE )? filename= ( STRING | ID ) AS database_name= ID )
            // Sql.g:140:14: ATTACH ( DATABASE )? filename= ( STRING | ID ) AS database_name= ID
            {
            root_0 = (Object)adaptor.nil();

            ATTACH149=(Token)match(input,ATTACH,FOLLOW_ATTACH_in_attach_stmt1091); 
            ATTACH149_tree = (Object)adaptor.create(ATTACH149);
            adaptor.addChild(root_0, ATTACH149_tree);

            // Sql.g:140:21: ( DATABASE )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==DATABASE) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // Sql.g:140:22: DATABASE
                    {
                    DATABASE150=(Token)match(input,DATABASE,FOLLOW_DATABASE_in_attach_stmt1094); 
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

            AS151=(Token)match(input,AS,FOLLOW_AS_in_attach_stmt1108); 
            AS151_tree = (Object)adaptor.create(AS151);
            adaptor.addChild(root_0, AS151_tree);

            database_name=(Token)match(input,ID,FOLLOW_ID_in_attach_stmt1112); 
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
    // Sql.g:143:1: detach_stmt : DETACH ( DATABASE )? database_name= ID ;
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
            // Sql.g:143:12: ( DETACH ( DATABASE )? database_name= ID )
            // Sql.g:143:14: DETACH ( DATABASE )? database_name= ID
            {
            root_0 = (Object)adaptor.nil();

            DETACH152=(Token)match(input,DETACH,FOLLOW_DETACH_in_detach_stmt1120); 
            DETACH152_tree = (Object)adaptor.create(DETACH152);
            adaptor.addChild(root_0, DETACH152_tree);

            // Sql.g:143:21: ( DATABASE )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==DATABASE) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // Sql.g:143:22: DATABASE
                    {
                    DATABASE153=(Token)match(input,DATABASE,FOLLOW_DATABASE_in_detach_stmt1123); 
                    DATABASE153_tree = (Object)adaptor.create(DATABASE153);
                    adaptor.addChild(root_0, DATABASE153_tree);


                    }
                    break;

            }

            database_name=(Token)match(input,ID,FOLLOW_ID_in_detach_stmt1129); 
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
    // Sql.g:146:1: analyze_stmt : ANALYZE (database_or_table_name= ID | database_name= ID DOT table_name= ID )? ;
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
            // Sql.g:146:13: ( ANALYZE (database_or_table_name= ID | database_name= ID DOT table_name= ID )? )
            // Sql.g:146:15: ANALYZE (database_or_table_name= ID | database_name= ID DOT table_name= ID )?
            {
            root_0 = (Object)adaptor.nil();

            ANALYZE154=(Token)match(input,ANALYZE,FOLLOW_ANALYZE_in_analyze_stmt1137); 
            ANALYZE154_tree = (Object)adaptor.create(ANALYZE154);
            adaptor.addChild(root_0, ANALYZE154_tree);

            // Sql.g:146:23: (database_or_table_name= ID | database_name= ID DOT table_name= ID )?
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
                    // Sql.g:146:24: database_or_table_name= ID
                    {
                    database_or_table_name=(Token)match(input,ID,FOLLOW_ID_in_analyze_stmt1142); 
                    database_or_table_name_tree = (Object)adaptor.create(database_or_table_name);
                    adaptor.addChild(root_0, database_or_table_name_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:146:52: database_name= ID DOT table_name= ID
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_analyze_stmt1148); 
                    database_name_tree = (Object)adaptor.create(database_name);
                    adaptor.addChild(root_0, database_name_tree);

                    DOT155=(Token)match(input,DOT,FOLLOW_DOT_in_analyze_stmt1150); 
                    DOT155_tree = (Object)adaptor.create(DOT155);
                    adaptor.addChild(root_0, DOT155_tree);

                    table_name=(Token)match(input,ID,FOLLOW_ID_in_analyze_stmt1154); 
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
    // Sql.g:149:1: reindex_stmt : REINDEX (database_name= ID DOT )? collation_or_table_or_index_name= ID ;
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
            // Sql.g:149:13: ( REINDEX (database_name= ID DOT )? collation_or_table_or_index_name= ID )
            // Sql.g:149:15: REINDEX (database_name= ID DOT )? collation_or_table_or_index_name= ID
            {
            root_0 = (Object)adaptor.nil();

            REINDEX156=(Token)match(input,REINDEX,FOLLOW_REINDEX_in_reindex_stmt1164); 
            REINDEX156_tree = (Object)adaptor.create(REINDEX156);
            adaptor.addChild(root_0, REINDEX156_tree);

            // Sql.g:149:23: (database_name= ID DOT )?
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
                    // Sql.g:149:24: database_name= ID DOT
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_reindex_stmt1169); 
                    database_name_tree = (Object)adaptor.create(database_name);
                    adaptor.addChild(root_0, database_name_tree);

                    DOT157=(Token)match(input,DOT,FOLLOW_DOT_in_reindex_stmt1171); 
                    DOT157_tree = (Object)adaptor.create(DOT157);
                    adaptor.addChild(root_0, DOT157_tree);


                    }
                    break;

            }

            collation_or_table_or_index_name=(Token)match(input,ID,FOLLOW_ID_in_reindex_stmt1177); 
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
    // Sql.g:152:1: vacuum_stmt : VACUUM ;
    public final SqlParser.vacuum_stmt_return vacuum_stmt() throws RecognitionException {
        SqlParser.vacuum_stmt_return retval = new SqlParser.vacuum_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VACUUM158=null;

        Object VACUUM158_tree=null;

        try {
            // Sql.g:152:12: ( VACUUM )
            // Sql.g:152:14: VACUUM
            {
            root_0 = (Object)adaptor.nil();

            VACUUM158=(Token)match(input,VACUUM,FOLLOW_VACUUM_in_vacuum_stmt1185); 
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
    // Sql.g:158:1: operation_conflict_clause : OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) ;
    public final SqlParser.operation_conflict_clause_return operation_conflict_clause() throws RecognitionException {
        SqlParser.operation_conflict_clause_return retval = new SqlParser.operation_conflict_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR159=null;
        Token set160=null;

        Object OR159_tree=null;
        Object set160_tree=null;

        try {
            // Sql.g:158:26: ( OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) )
            // Sql.g:158:28: OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE )
            {
            root_0 = (Object)adaptor.nil();

            OR159=(Token)match(input,OR,FOLLOW_OR_in_operation_conflict_clause1196); 
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
    // Sql.g:160:1: ordering_term : expr ( ASC | DESC )? -> ^( ORDERING expr ( ASC )? ( DESC )? ) ;
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
            // Sql.g:160:14: ( expr ( ASC | DESC )? -> ^( ORDERING expr ( ASC )? ( DESC )? ) )
            // Sql.g:160:16: expr ( ASC | DESC )?
            {
            pushFollow(FOLLOW_expr_in_ordering_term1223);
            expr161=expr();

            state._fsp--;

            stream_expr.add(expr161.getTree());
            // Sql.g:160:82: ( ASC | DESC )?
            int alt49=3;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // Sql.g:160:83: ASC
                    {
                    ASC162=(Token)match(input,ASC,FOLLOW_ASC_in_ordering_term1228);  
                    stream_ASC.add(ASC162);


                    }
                    break;
                case 2 :
                    // Sql.g:160:89: DESC
                    {
                    DESC163=(Token)match(input,DESC,FOLLOW_DESC_in_ordering_term1232);  
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
            // 161:1: -> ^( ORDERING expr ( ASC )? ( DESC )? )
            {
                // Sql.g:161:4: ^( ORDERING expr ( ASC )? ( DESC )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ORDERING, "ORDERING"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                // Sql.g:161:20: ( ASC )?
                if ( stream_ASC.hasNext() ) {
                    adaptor.addChild(root_1, stream_ASC.nextNode());

                }
                stream_ASC.reset();
                // Sql.g:161:27: ( DESC )?
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
    // Sql.g:163:1: operation_limited_clause : ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? ;
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
            // Sql.g:163:25: ( ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )
            // Sql.g:164:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )?
            {
            root_0 = (Object)adaptor.nil();

            // Sql.g:164:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==ORDER) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // Sql.g:164:4: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                    ORDER164=(Token)match(input,ORDER,FOLLOW_ORDER_in_operation_limited_clause1262); 
                    ORDER164_tree = (Object)adaptor.create(ORDER164);
                    adaptor.addChild(root_0, ORDER164_tree);

                    BY165=(Token)match(input,BY,FOLLOW_BY_in_operation_limited_clause1264); 
                    BY165_tree = (Object)adaptor.create(BY165);
                    adaptor.addChild(root_0, BY165_tree);

                    pushFollow(FOLLOW_ordering_term_in_operation_limited_clause1266);
                    ordering_term166=ordering_term();

                    state._fsp--;

                    adaptor.addChild(root_0, ordering_term166.getTree());
                    // Sql.g:164:27: ( COMMA ordering_term )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==COMMA) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // Sql.g:164:28: COMMA ordering_term
                    	    {
                    	    COMMA167=(Token)match(input,COMMA,FOLLOW_COMMA_in_operation_limited_clause1269); 
                    	    COMMA167_tree = (Object)adaptor.create(COMMA167);
                    	    adaptor.addChild(root_0, COMMA167_tree);

                    	    pushFollow(FOLLOW_ordering_term_in_operation_limited_clause1271);
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

            LIMIT169=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_operation_limited_clause1279); 
            LIMIT169_tree = (Object)adaptor.create(LIMIT169);
            adaptor.addChild(root_0, LIMIT169_tree);

            limit=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation_limited_clause1283); 
            limit_tree = (Object)adaptor.create(limit);
            adaptor.addChild(root_0, limit_tree);

            // Sql.g:165:23: ( ( OFFSET | COMMA ) offset= INTEGER )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==COMMA||LA52_0==OFFSET) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // Sql.g:165:24: ( OFFSET | COMMA ) offset= INTEGER
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

                    offset=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation_limited_clause1296); 
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
    // Sql.g:168:1: select_stmt : select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )? -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? ) ;
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
            // Sql.g:168:12: ( select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )? -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? ) )
            // Sql.g:168:14: select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )?
            {
            pushFollow(FOLLOW_select_list_in_select_stmt1306);
            select_list171=select_list();

            state._fsp--;

            stream_select_list.add(select_list171.getTree());
            // Sql.g:169:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==ORDER) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // Sql.g:169:4: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                    ORDER172=(Token)match(input,ORDER,FOLLOW_ORDER_in_select_stmt1311);  
                    stream_ORDER.add(ORDER172);

                    BY173=(Token)match(input,BY,FOLLOW_BY_in_select_stmt1313);  
                    stream_BY.add(BY173);

                    pushFollow(FOLLOW_ordering_term_in_select_stmt1315);
                    ordering_term174=ordering_term();

                    state._fsp--;

                    stream_ordering_term.add(ordering_term174.getTree());
                    // Sql.g:169:27: ( COMMA ordering_term )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==COMMA) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // Sql.g:169:28: COMMA ordering_term
                    	    {
                    	    COMMA175=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_stmt1318);  
                    	    stream_COMMA.add(COMMA175);

                    	    pushFollow(FOLLOW_ordering_term_in_select_stmt1320);
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

            // Sql.g:170:3: ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==LIMIT) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // Sql.g:170:4: LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )?
                    {
                    LIMIT177=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_select_stmt1329);  
                    stream_LIMIT.add(LIMIT177);

                    limit=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt1333);  
                    stream_INTEGER.add(limit);

                    // Sql.g:170:24: ( ( OFFSET | COMMA ) offset= INTEGER )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==COMMA||LA56_0==OFFSET) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // Sql.g:170:25: ( OFFSET | COMMA ) offset= INTEGER
                            {
                            // Sql.g:170:25: ( OFFSET | COMMA )
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
                                    // Sql.g:170:26: OFFSET
                                    {
                                    OFFSET178=(Token)match(input,OFFSET,FOLLOW_OFFSET_in_select_stmt1337);  
                                    stream_OFFSET.add(OFFSET178);


                                    }
                                    break;
                                case 2 :
                                    // Sql.g:170:35: COMMA
                                    {
                                    COMMA179=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_stmt1341);  
                                    stream_COMMA.add(COMMA179);


                                    }
                                    break;

                            }

                            offset=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt1346);  
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
            // 171:1: -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? )
            {
                // Sql.g:171:4: ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECT, "SELECT"), root_1);

                adaptor.addChild(root_1, stream_select_list.nextTree());
                // Sql.g:172:22: ( ^( ORDER ( ordering_term )+ ) )?
                if ( stream_ordering_term.hasNext()||stream_ORDER.hasNext() ) {
                    // Sql.g:172:22: ^( ORDER ( ordering_term )+ )
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
                // Sql.g:172:47: ( ^( LIMIT $limit ( $offset)? ) )?
                if ( stream_offset.hasNext()||stream_LIMIT.hasNext()||stream_limit.hasNext() ) {
                    // Sql.g:172:47: ^( LIMIT $limit ( $offset)? )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_LIMIT.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_limit.nextNode());
                    // Sql.g:172:62: ( $offset)?
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
    // Sql.g:175:1: select_list : select_core ( select_op select_core )* ;
    public final SqlParser.select_list_return select_list() throws RecognitionException {
        SqlParser.select_list_return retval = new SqlParser.select_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.select_core_return select_core180 = null;

        SqlParser.select_op_return select_op181 = null;

        SqlParser.select_core_return select_core182 = null;



        try {
            // Sql.g:175:12: ( select_core ( select_op select_core )* )
            // Sql.g:176:3: select_core ( select_op select_core )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_select_core_in_select_list1391);
            select_core180=select_core();

            state._fsp--;

            adaptor.addChild(root_0, select_core180.getTree());
            // Sql.g:176:15: ( select_op select_core )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==UNION||(LA58_0>=INTERSECT && LA58_0<=EXCEPT)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // Sql.g:176:16: select_op select_core
            	    {
            	    pushFollow(FOLLOW_select_op_in_select_list1394);
            	    select_op181=select_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(select_op181.getTree(), root_0);
            	    pushFollow(FOLLOW_select_core_in_select_list1397);
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
    // Sql.g:178:1: select_op : ( UNION ( ALL )? | INTERSECT | EXCEPT );
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
            // Sql.g:178:10: ( UNION ( ALL )? | INTERSECT | EXCEPT )
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
                    // Sql.g:178:12: UNION ( ALL )?
                    {
                    root_0 = (Object)adaptor.nil();

                    UNION183=(Token)match(input,UNION,FOLLOW_UNION_in_select_op1406); 
                    UNION183_tree = (Object)adaptor.create(UNION183);
                    root_0 = (Object)adaptor.becomeRoot(UNION183_tree, root_0);

                    // Sql.g:178:19: ( ALL )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==ALL) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // Sql.g:178:20: ALL
                            {
                            ALL184=(Token)match(input,ALL,FOLLOW_ALL_in_select_op1410); 
                            ALL184_tree = (Object)adaptor.create(ALL184);
                            adaptor.addChild(root_0, ALL184_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Sql.g:178:28: INTERSECT
                    {
                    root_0 = (Object)adaptor.nil();

                    INTERSECT185=(Token)match(input,INTERSECT,FOLLOW_INTERSECT_in_select_op1416); 
                    INTERSECT185_tree = (Object)adaptor.create(INTERSECT185);
                    adaptor.addChild(root_0, INTERSECT185_tree);


                    }
                    break;
                case 3 :
                    // Sql.g:178:40: EXCEPT
                    {
                    root_0 = (Object)adaptor.nil();

                    EXCEPT186=(Token)match(input,EXCEPT,FOLLOW_EXCEPT_in_select_op1420); 
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
    // Sql.g:180:1: select_core : SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )? -> ^( SELECT_CORE ( DISTINCT )? ^( RESULT_COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? ) ;
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
            // Sql.g:180:12: ( SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )? -> ^( SELECT_CORE ( DISTINCT )? ^( RESULT_COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? ) )
            // Sql.g:181:3: SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )?
            {
            SELECT187=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_core1429);  
            stream_SELECT.add(SELECT187);

            // Sql.g:181:10: ( ALL | DISTINCT )?
            int alt61=3;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // Sql.g:181:11: ALL
                    {
                    ALL188=(Token)match(input,ALL,FOLLOW_ALL_in_select_core1432);  
                    stream_ALL.add(ALL188);


                    }
                    break;
                case 2 :
                    // Sql.g:181:17: DISTINCT
                    {
                    DISTINCT189=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_select_core1436);  
                    stream_DISTINCT.add(DISTINCT189);


                    }
                    break;

            }

            pushFollow(FOLLOW_result_column_in_select_core1440);
            result_column190=result_column();

            state._fsp--;

            stream_result_column.add(result_column190.getTree());
            // Sql.g:181:42: ( COMMA result_column )*
            loop62:
            do {
                int alt62=2;
                alt62 = dfa62.predict(input);
                switch (alt62) {
            	case 1 :
            	    // Sql.g:181:43: COMMA result_column
            	    {
            	    COMMA191=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_core1443);  
            	    stream_COMMA.add(COMMA191);

            	    pushFollow(FOLLOW_result_column_in_select_core1445);
            	    result_column192=result_column();

            	    state._fsp--;

            	    stream_result_column.add(result_column192.getTree());

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            // Sql.g:181:65: ( FROM join_source )?
            int alt63=2;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // Sql.g:181:66: FROM join_source
                    {
                    FROM193=(Token)match(input,FROM,FOLLOW_FROM_in_select_core1450);  
                    stream_FROM.add(FROM193);

                    pushFollow(FOLLOW_join_source_in_select_core1452);
                    join_source194=join_source();

                    state._fsp--;

                    stream_join_source.add(join_source194.getTree());

                    }
                    break;

            }

            // Sql.g:181:85: ( WHERE where_expr= expr )?
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // Sql.g:181:86: WHERE where_expr= expr
                    {
                    WHERE195=(Token)match(input,WHERE,FOLLOW_WHERE_in_select_core1457);  
                    stream_WHERE.add(WHERE195);

                    pushFollow(FOLLOW_expr_in_select_core1461);
                    where_expr=expr();

                    state._fsp--;

                    stream_expr.add(where_expr.getTree());

                    }
                    break;

            }

            // Sql.g:182:3: ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==GROUP) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // Sql.g:182:5: GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )?
                    {
                    GROUP196=(Token)match(input,GROUP,FOLLOW_GROUP_in_select_core1469);  
                    stream_GROUP.add(GROUP196);

                    BY197=(Token)match(input,BY,FOLLOW_BY_in_select_core1471);  
                    stream_BY.add(BY197);

                    pushFollow(FOLLOW_ordering_term_in_select_core1473);
                    ordering_term198=ordering_term();

                    state._fsp--;

                    stream_ordering_term.add(ordering_term198.getTree());
                    // Sql.g:182:28: ( COMMA ordering_term )*
                    loop65:
                    do {
                        int alt65=2;
                        alt65 = dfa65.predict(input);
                        switch (alt65) {
                    	case 1 :
                    	    // Sql.g:182:29: COMMA ordering_term
                    	    {
                    	    COMMA199=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_core1476);  
                    	    stream_COMMA.add(COMMA199);

                    	    pushFollow(FOLLOW_ordering_term_in_select_core1478);
                    	    ordering_term200=ordering_term();

                    	    state._fsp--;

                    	    stream_ordering_term.add(ordering_term200.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    // Sql.g:182:51: ( HAVING having_expr= expr )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==HAVING) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // Sql.g:182:52: HAVING having_expr= expr
                            {
                            HAVING201=(Token)match(input,HAVING,FOLLOW_HAVING_in_select_core1483);  
                            stream_HAVING.add(HAVING201);

                            pushFollow(FOLLOW_expr_in_select_core1487);
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
            // 183:1: -> ^( SELECT_CORE ( DISTINCT )? ^( RESULT_COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? )
            {
                // Sql.g:183:4: ^( SELECT_CORE ( DISTINCT )? ^( RESULT_COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECT_CORE, "SELECT_CORE"), root_1);

                // Sql.g:184:15: ( DISTINCT )?
                if ( stream_DISTINCT.hasNext() ) {
                    adaptor.addChild(root_1, stream_DISTINCT.nextNode());

                }
                stream_DISTINCT.reset();
                // Sql.g:184:27: ^( RESULT_COLUMNS ( result_column )+ )
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
                // Sql.g:184:60: ( ^( FROM join_source ) )?
                if ( stream_join_source.hasNext()||stream_FROM.hasNext() ) {
                    // Sql.g:184:60: ^( FROM join_source )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_FROM.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_join_source.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_join_source.reset();
                stream_FROM.reset();
                // Sql.g:184:81: ( ^( WHERE $where_expr) )?
                if ( stream_where_expr.hasNext()||stream_WHERE.hasNext() ) {
                    // Sql.g:184:81: ^( WHERE $where_expr)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_WHERE.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_where_expr.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_where_expr.reset();
                stream_WHERE.reset();
                // Sql.g:185:3: ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )?
                if ( stream_HAVING.hasNext()||stream_GROUP.hasNext()||stream_having_expr.hasNext()||stream_ordering_term.hasNext() ) {
                    // Sql.g:185:3: ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? )
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
                    // Sql.g:185:26: ( ^( HAVING $having_expr) )?
                    if ( stream_HAVING.hasNext()||stream_having_expr.hasNext() ) {
                        // Sql.g:185:26: ^( HAVING $having_expr)
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
    // Sql.g:188:1: result_column : ( ASTERISK | table_name= ID DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= ID )? -> ^( ALIAS expr ( $column_alias)? ) );
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
            // Sql.g:189:3: ( ASTERISK | table_name= ID DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= ID )? -> ^( ALIAS expr ( $column_alias)? ) )
            int alt70=3;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // Sql.g:189:5: ASTERISK
                    {
                    root_0 = (Object)adaptor.nil();

                    ASTERISK202=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_result_column1557); 
                    ASTERISK202_tree = (Object)adaptor.create(ASTERISK202);
                    adaptor.addChild(root_0, ASTERISK202_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:190:5: table_name= ID DOT ASTERISK
                    {
                    table_name=(Token)match(input,ID,FOLLOW_ID_in_result_column1565);  
                    stream_ID.add(table_name);

                    DOT203=(Token)match(input,DOT,FOLLOW_DOT_in_result_column1567);  
                    stream_DOT.add(DOT203);

                    ASTERISK204=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_result_column1569);  
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
                    // 190:32: -> ^( ASTERISK $table_name)
                    {
                        // Sql.g:190:35: ^( ASTERISK $table_name)
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
                    // Sql.g:191:5: expr ( ( AS )? column_alias= ID )?
                    {
                    pushFollow(FOLLOW_expr_in_result_column1584);
                    expr205=expr();

                    state._fsp--;

                    stream_expr.add(expr205.getTree());
                    // Sql.g:191:10: ( ( AS )? column_alias= ID )?
                    int alt69=2;
                    alt69 = dfa69.predict(input);
                    switch (alt69) {
                        case 1 :
                            // Sql.g:191:11: ( AS )? column_alias= ID
                            {
                            // Sql.g:191:11: ( AS )?
                            int alt68=2;
                            int LA68_0 = input.LA(1);

                            if ( (LA68_0==AS) ) {
                                alt68=1;
                            }
                            switch (alt68) {
                                case 1 :
                                    // Sql.g:191:12: AS
                                    {
                                    AS206=(Token)match(input,AS,FOLLOW_AS_in_result_column1588);  
                                    stream_AS.add(AS206);


                                    }
                                    break;

                            }

                            column_alias=(Token)match(input,ID,FOLLOW_ID_in_result_column1594);  
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
                    // 191:35: -> ^( ALIAS expr ( $column_alias)? )
                    {
                        // Sql.g:191:38: ^( ALIAS expr ( $column_alias)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // Sql.g:191:51: ( $column_alias)?
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
    // Sql.g:193:1: join_source : single_source ( join_op single_source ( join_constraint )? )* ;
    public final SqlParser.join_source_return join_source() throws RecognitionException {
        SqlParser.join_source_return retval = new SqlParser.join_source_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.single_source_return single_source207 = null;

        SqlParser.join_op_return join_op208 = null;

        SqlParser.single_source_return single_source209 = null;

        SqlParser.join_constraint_return join_constraint210 = null;



        try {
            // Sql.g:193:12: ( single_source ( join_op single_source ( join_constraint )? )* )
            // Sql.g:193:14: single_source ( join_op single_source ( join_constraint )? )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_single_source_in_join_source1615);
            single_source207=single_source();

            state._fsp--;

            adaptor.addChild(root_0, single_source207.getTree());
            // Sql.g:193:28: ( join_op single_source ( join_constraint )? )*
            loop72:
            do {
                int alt72=2;
                alt72 = dfa72.predict(input);
                switch (alt72) {
            	case 1 :
            	    // Sql.g:193:29: join_op single_source ( join_constraint )?
            	    {
            	    pushFollow(FOLLOW_join_op_in_join_source1618);
            	    join_op208=join_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(join_op208.getTree(), root_0);
            	    pushFollow(FOLLOW_single_source_in_join_source1621);
            	    single_source209=single_source();

            	    state._fsp--;

            	    adaptor.addChild(root_0, single_source209.getTree());
            	    // Sql.g:193:52: ( join_constraint )?
            	    int alt71=2;
            	    alt71 = dfa71.predict(input);
            	    switch (alt71) {
            	        case 1 :
            	            // Sql.g:193:53: join_constraint
            	            {
            	            pushFollow(FOLLOW_join_constraint_in_join_source1624);
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
    // Sql.g:195:1: single_source : ( (database_name= ID DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= ID | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN );
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
            // Sql.g:196:3: ( (database_name= ID DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= ID | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN )
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
                    // Sql.g:196:5: (database_name= ID DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= ID | NOT INDEXED )?
                    {
                    // Sql.g:196:5: (database_name= ID DOT )?
                    int alt73=2;
                    alt73 = dfa73.predict(input);
                    switch (alt73) {
                        case 1 :
                            // Sql.g:196:6: database_name= ID DOT
                            {
                            database_name=(Token)match(input,ID,FOLLOW_ID_in_single_source1641);  
                            stream_ID.add(database_name);

                            DOT211=(Token)match(input,DOT,FOLLOW_DOT_in_single_source1643);  
                            stream_DOT.add(DOT211);


                            }
                            break;

                    }

                    table_name=(Token)match(input,ID,FOLLOW_ID_in_single_source1649);  
                    stream_ID.add(table_name);

                    // Sql.g:196:43: ( ( AS )? table_alias= ID )?
                    int alt75=2;
                    alt75 = dfa75.predict(input);
                    switch (alt75) {
                        case 1 :
                            // Sql.g:196:44: ( AS )? table_alias= ID
                            {
                            // Sql.g:196:44: ( AS )?
                            int alt74=2;
                            int LA74_0 = input.LA(1);

                            if ( (LA74_0==AS) ) {
                                alt74=1;
                            }
                            switch (alt74) {
                                case 1 :
                                    // Sql.g:196:45: AS
                                    {
                                    AS212=(Token)match(input,AS,FOLLOW_AS_in_single_source1653);  
                                    stream_AS.add(AS212);


                                    }
                                    break;

                            }

                            table_alias=(Token)match(input,ID,FOLLOW_ID_in_single_source1659);  
                            stream_ID.add(table_alias);


                            }
                            break;

                    }

                    // Sql.g:196:67: ( INDEXED BY index_name= ID | NOT INDEXED )?
                    int alt76=3;
                    alt76 = dfa76.predict(input);
                    switch (alt76) {
                        case 1 :
                            // Sql.g:196:68: INDEXED BY index_name= ID
                            {
                            INDEXED213=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_single_source1664);  
                            stream_INDEXED.add(INDEXED213);

                            BY214=(Token)match(input,BY,FOLLOW_BY_in_single_source1666);  
                            stream_BY.add(BY214);

                            index_name=(Token)match(input,ID,FOLLOW_ID_in_single_source1670);  
                            stream_ID.add(index_name);


                            }
                            break;
                        case 2 :
                            // Sql.g:196:95: NOT INDEXED
                            {
                            NOT215=(Token)match(input,NOT,FOLLOW_NOT_in_single_source1674);  
                            stream_NOT.add(NOT215);

                            INDEXED216=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_single_source1676);  
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
                    // 197:3: -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? )
                    {
                        // Sql.g:197:6: ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        // Sql.g:197:14: ^( $table_name ( $database_name)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                        // Sql.g:197:28: ( $database_name)?
                        if ( stream_database_name.hasNext() ) {
                            adaptor.addChild(root_2, stream_database_name.nextNode());

                        }
                        stream_database_name.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // Sql.g:197:45: ( $table_alias)?
                        if ( stream_table_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_table_alias.nextNode());

                        }
                        stream_table_alias.reset();
                        // Sql.g:197:59: ( ^( INDEXED ( NOT )? ( $index_name)? ) )?
                        if ( stream_index_name.hasNext()||stream_NOT.hasNext()||stream_INDEXED.hasNext() ) {
                            // Sql.g:197:59: ^( INDEXED ( NOT )? ( $index_name)? )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(stream_INDEXED.nextNode(), root_2);

                            // Sql.g:197:69: ( NOT )?
                            if ( stream_NOT.hasNext() ) {
                                adaptor.addChild(root_2, stream_NOT.nextNode());

                            }
                            stream_NOT.reset();
                            // Sql.g:197:74: ( $index_name)?
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
                    // Sql.g:198:5: LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )?
                    {
                    LPAREN217=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_single_source1717);  
                    stream_LPAREN.add(LPAREN217);

                    pushFollow(FOLLOW_select_stmt_in_single_source1719);
                    select_stmt218=select_stmt();

                    state._fsp--;

                    stream_select_stmt.add(select_stmt218.getTree());
                    RPAREN219=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_single_source1721);  
                    stream_RPAREN.add(RPAREN219);

                    // Sql.g:198:31: ( ( AS )? table_alias= ID )?
                    int alt78=2;
                    alt78 = dfa78.predict(input);
                    switch (alt78) {
                        case 1 :
                            // Sql.g:198:32: ( AS )? table_alias= ID
                            {
                            // Sql.g:198:32: ( AS )?
                            int alt77=2;
                            int LA77_0 = input.LA(1);

                            if ( (LA77_0==AS) ) {
                                alt77=1;
                            }
                            switch (alt77) {
                                case 1 :
                                    // Sql.g:198:33: AS
                                    {
                                    AS220=(Token)match(input,AS,FOLLOW_AS_in_single_source1725);  
                                    stream_AS.add(AS220);


                                    }
                                    break;

                            }

                            table_alias=(Token)match(input,ID,FOLLOW_ID_in_single_source1731);  
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
                    // 199:3: -> ^( ALIAS select_stmt ( $table_alias)? )
                    {
                        // Sql.g:199:6: ^( ALIAS select_stmt ( $table_alias)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        adaptor.addChild(root_1, stream_select_stmt.nextTree());
                        // Sql.g:199:26: ( $table_alias)?
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
                    // Sql.g:200:5: LPAREN join_source RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN221=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_single_source1753); 
                    pushFollow(FOLLOW_join_source_in_single_source1756);
                    join_source222=join_source();

                    state._fsp--;

                    adaptor.addChild(root_0, join_source222.getTree());
                    RPAREN223=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_single_source1758); 

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
    // Sql.g:202:1: join_op : ( COMMA | ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN );
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
            // Sql.g:203:3: ( COMMA | ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN )
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
                    // Sql.g:203:5: COMMA
                    {
                    root_0 = (Object)adaptor.nil();

                    COMMA224=(Token)match(input,COMMA,FOLLOW_COMMA_in_join_op1769); 
                    COMMA224_tree = (Object)adaptor.create(COMMA224);
                    adaptor.addChild(root_0, COMMA224_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:204:5: ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN
                    {
                    root_0 = (Object)adaptor.nil();

                    // Sql.g:204:5: ( NATURAL )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==NATURAL) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // Sql.g:204:6: NATURAL
                            {
                            NATURAL225=(Token)match(input,NATURAL,FOLLOW_NATURAL_in_join_op1776); 
                            NATURAL225_tree = (Object)adaptor.create(NATURAL225);
                            adaptor.addChild(root_0, NATURAL225_tree);


                            }
                            break;

                    }

                    // Sql.g:204:16: ( ( LEFT )? ( OUTER )? | INNER | CROSS )
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
                            // Sql.g:204:17: ( LEFT )? ( OUTER )?
                            {
                            // Sql.g:204:17: ( LEFT )?
                            int alt81=2;
                            int LA81_0 = input.LA(1);

                            if ( (LA81_0==LEFT) ) {
                                alt81=1;
                            }
                            switch (alt81) {
                                case 1 :
                                    // Sql.g:204:18: LEFT
                                    {
                                    LEFT226=(Token)match(input,LEFT,FOLLOW_LEFT_in_join_op1782); 
                                    LEFT226_tree = (Object)adaptor.create(LEFT226);
                                    adaptor.addChild(root_0, LEFT226_tree);


                                    }
                                    break;

                            }

                            // Sql.g:204:25: ( OUTER )?
                            int alt82=2;
                            int LA82_0 = input.LA(1);

                            if ( (LA82_0==OUTER) ) {
                                alt82=1;
                            }
                            switch (alt82) {
                                case 1 :
                                    // Sql.g:204:26: OUTER
                                    {
                                    OUTER227=(Token)match(input,OUTER,FOLLOW_OUTER_in_join_op1787); 
                                    OUTER227_tree = (Object)adaptor.create(OUTER227);
                                    adaptor.addChild(root_0, OUTER227_tree);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // Sql.g:204:36: INNER
                            {
                            INNER228=(Token)match(input,INNER,FOLLOW_INNER_in_join_op1793); 
                            INNER228_tree = (Object)adaptor.create(INNER228);
                            adaptor.addChild(root_0, INNER228_tree);


                            }
                            break;
                        case 3 :
                            // Sql.g:204:44: CROSS
                            {
                            CROSS229=(Token)match(input,CROSS,FOLLOW_CROSS_in_join_op1797); 
                            CROSS229_tree = (Object)adaptor.create(CROSS229);
                            adaptor.addChild(root_0, CROSS229_tree);


                            }
                            break;

                    }

                    JOIN230=(Token)match(input,JOIN,FOLLOW_JOIN_in_join_op1800); 
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
    // Sql.g:206:1: join_constraint : ( ON expr | USING LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN -> ^( USING ( $column_names)+ ) );
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
            // Sql.g:207:3: ( ON expr | USING LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN -> ^( USING ( $column_names)+ ) )
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
                    // Sql.g:207:5: ON expr
                    {
                    root_0 = (Object)adaptor.nil();

                    ON231=(Token)match(input,ON,FOLLOW_ON_in_join_constraint1811); 
                    ON231_tree = (Object)adaptor.create(ON231);
                    root_0 = (Object)adaptor.becomeRoot(ON231_tree, root_0);

                    pushFollow(FOLLOW_expr_in_join_constraint1814);
                    expr232=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr232.getTree());

                    }
                    break;
                case 2 :
                    // Sql.g:208:5: USING LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN
                    {
                    USING233=(Token)match(input,USING,FOLLOW_USING_in_join_constraint1820);  
                    stream_USING.add(USING233);

                    LPAREN234=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_join_constraint1822);  
                    stream_LPAREN.add(LPAREN234);

                    column_names=(Token)match(input,ID,FOLLOW_ID_in_join_constraint1826);  
                    stream_ID.add(column_names);

                    if (list_column_names==null) list_column_names=new ArrayList();
                    list_column_names.add(column_names);

                    // Sql.g:208:35: ( COMMA column_names+= ID )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==COMMA) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // Sql.g:208:36: COMMA column_names+= ID
                    	    {
                    	    COMMA235=(Token)match(input,COMMA,FOLLOW_COMMA_in_join_constraint1829);  
                    	    stream_COMMA.add(COMMA235);

                    	    column_names=(Token)match(input,ID,FOLLOW_ID_in_join_constraint1833);  
                    	    stream_ID.add(column_names);

                    	    if (list_column_names==null) list_column_names=new ArrayList();
                    	    list_column_names.add(column_names);


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);

                    RPAREN236=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_join_constraint1837);  
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
                    // 208:68: -> ^( USING ( $column_names)+ )
                    {
                        // Sql.g:208:71: ^( USING ( $column_names)+ )
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
    // Sql.g:211:1: insert_stmt : ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= ID DOT )? table_name= ID ( ( LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES ) ;
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
            // Sql.g:211:12: ( ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= ID DOT )? table_name= ID ( ( LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES ) )
            // Sql.g:211:14: ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= ID DOT )? table_name= ID ( ( LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES )
            {
            root_0 = (Object)adaptor.nil();

            // Sql.g:211:14: ( INSERT ( operation_conflict_clause )? | REPLACE )
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
                    // Sql.g:211:15: INSERT ( operation_conflict_clause )?
                    {
                    INSERT237=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_stmt1856); 
                    INSERT237_tree = (Object)adaptor.create(INSERT237);
                    adaptor.addChild(root_0, INSERT237_tree);

                    // Sql.g:211:22: ( operation_conflict_clause )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==OR) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // Sql.g:211:23: operation_conflict_clause
                            {
                            pushFollow(FOLLOW_operation_conflict_clause_in_insert_stmt1859);
                            operation_conflict_clause238=operation_conflict_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, operation_conflict_clause238.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Sql.g:211:53: REPLACE
                    {
                    REPLACE239=(Token)match(input,REPLACE,FOLLOW_REPLACE_in_insert_stmt1865); 
                    REPLACE239_tree = (Object)adaptor.create(REPLACE239);
                    adaptor.addChild(root_0, REPLACE239_tree);


                    }
                    break;

            }

            INTO240=(Token)match(input,INTO,FOLLOW_INTO_in_insert_stmt1868); 
            INTO240_tree = (Object)adaptor.create(INTO240);
            adaptor.addChild(root_0, INTO240_tree);

            // Sql.g:211:67: (database_name= ID DOT )?
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
                    // Sql.g:211:68: database_name= ID DOT
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_insert_stmt1873); 
                    database_name_tree = (Object)adaptor.create(database_name);
                    adaptor.addChild(root_0, database_name_tree);

                    DOT241=(Token)match(input,DOT,FOLLOW_DOT_in_insert_stmt1875); 
                    DOT241_tree = (Object)adaptor.create(DOT241);
                    adaptor.addChild(root_0, DOT241_tree);


                    }
                    break;

            }

            table_name=(Token)match(input,ID,FOLLOW_ID_in_insert_stmt1881); 
            table_name_tree = (Object)adaptor.create(table_name);
            adaptor.addChild(root_0, table_name_tree);

            // Sql.g:212:3: ( ( LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES )
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
                    // Sql.g:212:5: ( LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt )
                    {
                    // Sql.g:212:5: ( LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==LPAREN) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // Sql.g:212:6: LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN
                            {
                            LPAREN242=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt1888); 
                            LPAREN242_tree = (Object)adaptor.create(LPAREN242);
                            adaptor.addChild(root_0, LPAREN242_tree);

                            column_names=(Token)match(input,ID,FOLLOW_ID_in_insert_stmt1892); 
                            column_names_tree = (Object)adaptor.create(column_names);
                            adaptor.addChild(root_0, column_names_tree);

                            if (list_column_names==null) list_column_names=new ArrayList();
                            list_column_names.add(column_names);

                            // Sql.g:212:30: ( COMMA column_names+= ID )*
                            loop90:
                            do {
                                int alt90=2;
                                int LA90_0 = input.LA(1);

                                if ( (LA90_0==COMMA) ) {
                                    alt90=1;
                                }


                                switch (alt90) {
                            	case 1 :
                            	    // Sql.g:212:31: COMMA column_names+= ID
                            	    {
                            	    COMMA243=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt1895); 
                            	    COMMA243_tree = (Object)adaptor.create(COMMA243);
                            	    adaptor.addChild(root_0, COMMA243_tree);

                            	    column_names=(Token)match(input,ID,FOLLOW_ID_in_insert_stmt1899); 
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

                            RPAREN244=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt1903); 
                            RPAREN244_tree = (Object)adaptor.create(RPAREN244);
                            adaptor.addChild(root_0, RPAREN244_tree);


                            }
                            break;

                    }

                    // Sql.g:213:5: ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt )
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
                            // Sql.g:213:6: VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN
                            {
                            VALUES245=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt1912); 
                            VALUES245_tree = (Object)adaptor.create(VALUES245);
                            adaptor.addChild(root_0, VALUES245_tree);

                            LPAREN246=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt1914); 
                            LPAREN246_tree = (Object)adaptor.create(LPAREN246);
                            adaptor.addChild(root_0, LPAREN246_tree);

                            pushFollow(FOLLOW_expr_in_insert_stmt1918);
                            values=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, values.getTree());
                            if (list_values==null) list_values=new ArrayList();
                            list_values.add(values.getTree());

                            // Sql.g:213:33: ( COMMA values+= expr )*
                            loop92:
                            do {
                                int alt92=2;
                                int LA92_0 = input.LA(1);

                                if ( (LA92_0==COMMA) ) {
                                    alt92=1;
                                }


                                switch (alt92) {
                            	case 1 :
                            	    // Sql.g:213:34: COMMA values+= expr
                            	    {
                            	    COMMA247=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt1921); 
                            	    COMMA247_tree = (Object)adaptor.create(COMMA247);
                            	    adaptor.addChild(root_0, COMMA247_tree);

                            	    pushFollow(FOLLOW_expr_in_insert_stmt1925);
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

                            RPAREN248=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt1929); 
                            RPAREN248_tree = (Object)adaptor.create(RPAREN248);
                            adaptor.addChild(root_0, RPAREN248_tree);


                            }
                            break;
                        case 2 :
                            // Sql.g:213:64: select_stmt
                            {
                            pushFollow(FOLLOW_select_stmt_in_insert_stmt1933);
                            select_stmt249=select_stmt();

                            state._fsp--;

                            adaptor.addChild(root_0, select_stmt249.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Sql.g:214:5: DEFAULT VALUES
                    {
                    DEFAULT250=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_insert_stmt1940); 
                    DEFAULT250_tree = (Object)adaptor.create(DEFAULT250);
                    adaptor.addChild(root_0, DEFAULT250_tree);

                    VALUES251=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt1942); 
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
    // Sql.g:217:1: update_stmt : UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )? ;
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
            // Sql.g:217:12: ( UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )? )
            // Sql.g:217:14: UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )?
            {
            root_0 = (Object)adaptor.nil();

            UPDATE252=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_update_stmt1952); 
            UPDATE252_tree = (Object)adaptor.create(UPDATE252);
            adaptor.addChild(root_0, UPDATE252_tree);

            // Sql.g:217:21: ( operation_conflict_clause )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==OR) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // Sql.g:217:22: operation_conflict_clause
                    {
                    pushFollow(FOLLOW_operation_conflict_clause_in_update_stmt1955);
                    operation_conflict_clause253=operation_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_conflict_clause253.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_qualified_table_name_in_update_stmt1959);
            qualified_table_name254=qualified_table_name();

            state._fsp--;

            adaptor.addChild(root_0, qualified_table_name254.getTree());
            SET255=(Token)match(input,SET,FOLLOW_SET_in_update_stmt1963); 
            SET255_tree = (Object)adaptor.create(SET255);
            adaptor.addChild(root_0, SET255_tree);

            pushFollow(FOLLOW_update_set_in_update_stmt1967);
            values=update_set();

            state._fsp--;

            adaptor.addChild(root_0, values.getTree());
            if (list_values==null) list_values=new ArrayList();
            list_values.add(values.getTree());

            // Sql.g:218:26: ( COMMA values+= update_set )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==COMMA) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // Sql.g:218:27: COMMA values+= update_set
            	    {
            	    COMMA256=(Token)match(input,COMMA,FOLLOW_COMMA_in_update_stmt1970); 
            	    COMMA256_tree = (Object)adaptor.create(COMMA256);
            	    adaptor.addChild(root_0, COMMA256_tree);

            	    pushFollow(FOLLOW_update_set_in_update_stmt1974);
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

            // Sql.g:218:54: ( WHERE expr )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==WHERE) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // Sql.g:218:55: WHERE expr
                    {
                    WHERE257=(Token)match(input,WHERE,FOLLOW_WHERE_in_update_stmt1979); 
                    WHERE257_tree = (Object)adaptor.create(WHERE257);
                    adaptor.addChild(root_0, WHERE257_tree);

                    pushFollow(FOLLOW_expr_in_update_stmt1981);
                    expr258=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr258.getTree());

                    }
                    break;

            }

            // Sql.g:218:68: ( operation_limited_clause )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( ((LA98_0>=ORDER && LA98_0<=LIMIT)) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // Sql.g:218:69: operation_limited_clause
                    {
                    pushFollow(FOLLOW_operation_limited_clause_in_update_stmt1986);
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
    // Sql.g:220:1: update_set : column_name= ID EQUALS expr ;
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
            // Sql.g:220:11: (column_name= ID EQUALS expr )
            // Sql.g:220:13: column_name= ID EQUALS expr
            {
            root_0 = (Object)adaptor.nil();

            column_name=(Token)match(input,ID,FOLLOW_ID_in_update_set1997); 
            column_name_tree = (Object)adaptor.create(column_name);
            adaptor.addChild(root_0, column_name_tree);

            EQUALS260=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_update_set1999); 
            EQUALS260_tree = (Object)adaptor.create(EQUALS260);
            adaptor.addChild(root_0, EQUALS260_tree);

            pushFollow(FOLLOW_expr_in_update_set2001);
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
    // Sql.g:223:1: delete_stmt : DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )? ;
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
            // Sql.g:223:12: ( DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )? )
            // Sql.g:223:14: DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )?
            {
            root_0 = (Object)adaptor.nil();

            DELETE262=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_stmt2009); 
            DELETE262_tree = (Object)adaptor.create(DELETE262);
            adaptor.addChild(root_0, DELETE262_tree);

            FROM263=(Token)match(input,FROM,FOLLOW_FROM_in_delete_stmt2011); 
            FROM263_tree = (Object)adaptor.create(FROM263);
            adaptor.addChild(root_0, FROM263_tree);

            pushFollow(FOLLOW_qualified_table_name_in_delete_stmt2013);
            qualified_table_name264=qualified_table_name();

            state._fsp--;

            adaptor.addChild(root_0, qualified_table_name264.getTree());
            // Sql.g:223:47: ( WHERE expr )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==WHERE) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // Sql.g:223:48: WHERE expr
                    {
                    WHERE265=(Token)match(input,WHERE,FOLLOW_WHERE_in_delete_stmt2016); 
                    WHERE265_tree = (Object)adaptor.create(WHERE265);
                    adaptor.addChild(root_0, WHERE265_tree);

                    pushFollow(FOLLOW_expr_in_delete_stmt2018);
                    expr266=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr266.getTree());

                    }
                    break;

            }

            // Sql.g:223:61: ( operation_limited_clause )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( ((LA100_0>=ORDER && LA100_0<=LIMIT)) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // Sql.g:223:62: operation_limited_clause
                    {
                    pushFollow(FOLLOW_operation_limited_clause_in_delete_stmt2023);
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
    // Sql.g:226:1: begin_stmt : BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )? ;
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
            // Sql.g:226:11: ( BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )? )
            // Sql.g:226:13: BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )?
            {
            root_0 = (Object)adaptor.nil();

            BEGIN268=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_begin_stmt2033); 
            BEGIN268_tree = (Object)adaptor.create(BEGIN268);
            adaptor.addChild(root_0, BEGIN268_tree);

            // Sql.g:226:19: ( DEFERRED | IMMEDIATE | EXCLUSIVE )?
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

            // Sql.g:226:55: ( TRANSACTION )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==TRANSACTION) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // Sql.g:226:56: TRANSACTION
                    {
                    TRANSACTION270=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_begin_stmt2049); 
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
    // Sql.g:229:1: commit_stmt : ( COMMIT | END ) ( TRANSACTION )? ;
    public final SqlParser.commit_stmt_return commit_stmt() throws RecognitionException {
        SqlParser.commit_stmt_return retval = new SqlParser.commit_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set271=null;
        Token TRANSACTION272=null;

        Object set271_tree=null;
        Object TRANSACTION272_tree=null;

        try {
            // Sql.g:229:12: ( ( COMMIT | END ) ( TRANSACTION )? )
            // Sql.g:229:14: ( COMMIT | END ) ( TRANSACTION )?
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

            // Sql.g:229:29: ( TRANSACTION )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==TRANSACTION) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // Sql.g:229:30: TRANSACTION
                    {
                    TRANSACTION272=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_commit_stmt2068); 
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
    // Sql.g:232:1: rollback_stmt : ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= ID )? ;
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
            // Sql.g:232:14: ( ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= ID )? )
            // Sql.g:232:16: ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= ID )?
            {
            root_0 = (Object)adaptor.nil();

            ROLLBACK273=(Token)match(input,ROLLBACK,FOLLOW_ROLLBACK_in_rollback_stmt2078); 
            ROLLBACK273_tree = (Object)adaptor.create(ROLLBACK273);
            adaptor.addChild(root_0, ROLLBACK273_tree);

            // Sql.g:232:25: ( TRANSACTION )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==TRANSACTION) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // Sql.g:232:26: TRANSACTION
                    {
                    TRANSACTION274=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_rollback_stmt2081); 
                    TRANSACTION274_tree = (Object)adaptor.create(TRANSACTION274);
                    adaptor.addChild(root_0, TRANSACTION274_tree);


                    }
                    break;

            }

            // Sql.g:232:40: ( TO ( SAVEPOINT )? savepoint_name= ID )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==TO) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // Sql.g:232:41: TO ( SAVEPOINT )? savepoint_name= ID
                    {
                    TO275=(Token)match(input,TO,FOLLOW_TO_in_rollback_stmt2086); 
                    TO275_tree = (Object)adaptor.create(TO275);
                    adaptor.addChild(root_0, TO275_tree);

                    // Sql.g:232:44: ( SAVEPOINT )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==SAVEPOINT) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // Sql.g:232:45: SAVEPOINT
                            {
                            SAVEPOINT276=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_rollback_stmt2089); 
                            SAVEPOINT276_tree = (Object)adaptor.create(SAVEPOINT276);
                            adaptor.addChild(root_0, SAVEPOINT276_tree);


                            }
                            break;

                    }

                    savepoint_name=(Token)match(input,ID,FOLLOW_ID_in_rollback_stmt2095); 
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
    // Sql.g:235:1: savepoint_stmt : SAVEPOINT savepoint_name= ID ;
    public final SqlParser.savepoint_stmt_return savepoint_stmt() throws RecognitionException {
        SqlParser.savepoint_stmt_return retval = new SqlParser.savepoint_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token savepoint_name=null;
        Token SAVEPOINT277=null;

        Object savepoint_name_tree=null;
        Object SAVEPOINT277_tree=null;

        try {
            // Sql.g:235:15: ( SAVEPOINT savepoint_name= ID )
            // Sql.g:235:17: SAVEPOINT savepoint_name= ID
            {
            root_0 = (Object)adaptor.nil();

            SAVEPOINT277=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_savepoint_stmt2105); 
            SAVEPOINT277_tree = (Object)adaptor.create(SAVEPOINT277);
            adaptor.addChild(root_0, SAVEPOINT277_tree);

            savepoint_name=(Token)match(input,ID,FOLLOW_ID_in_savepoint_stmt2109); 
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
    // Sql.g:238:1: release_stmt : RELEASE ( SAVEPOINT )? savepoint_name= ID ;
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
            // Sql.g:238:13: ( RELEASE ( SAVEPOINT )? savepoint_name= ID )
            // Sql.g:238:15: RELEASE ( SAVEPOINT )? savepoint_name= ID
            {
            root_0 = (Object)adaptor.nil();

            RELEASE278=(Token)match(input,RELEASE,FOLLOW_RELEASE_in_release_stmt2117); 
            RELEASE278_tree = (Object)adaptor.create(RELEASE278);
            adaptor.addChild(root_0, RELEASE278_tree);

            // Sql.g:238:23: ( SAVEPOINT )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==SAVEPOINT) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // Sql.g:238:24: SAVEPOINT
                    {
                    SAVEPOINT279=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_release_stmt2120); 
                    SAVEPOINT279_tree = (Object)adaptor.create(SAVEPOINT279);
                    adaptor.addChild(root_0, SAVEPOINT279_tree);


                    }
                    break;

            }

            savepoint_name=(Token)match(input,ID,FOLLOW_ID_in_release_stmt2126); 
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
    // Sql.g:245:1: table_conflict_clause : ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) ;
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
            // Sql.g:245:22: ( ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) )
            // Sql.g:245:24: ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE )
            {
            root_0 = (Object)adaptor.nil();

            ON280=(Token)match(input,ON,FOLLOW_ON_in_table_conflict_clause2138); 
            CONFLICT281=(Token)match(input,CONFLICT,FOLLOW_CONFLICT_in_table_conflict_clause2141); 
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
    // Sql.g:249:1: create_virtual_table_stmt : CREATE VIRTUAL TABLE (database_name= ID DOT )? table_name= ID USING module_name= ID ( LPAREN column_def ( COMMA column_def )* RPAREN )? ;
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
            // Sql.g:249:26: ( CREATE VIRTUAL TABLE (database_name= ID DOT )? table_name= ID USING module_name= ID ( LPAREN column_def ( COMMA column_def )* RPAREN )? )
            // Sql.g:249:28: CREATE VIRTUAL TABLE (database_name= ID DOT )? table_name= ID USING module_name= ID ( LPAREN column_def ( COMMA column_def )* RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            CREATE283=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_virtual_table_stmt2171); 
            CREATE283_tree = (Object)adaptor.create(CREATE283);
            adaptor.addChild(root_0, CREATE283_tree);

            VIRTUAL284=(Token)match(input,VIRTUAL,FOLLOW_VIRTUAL_in_create_virtual_table_stmt2173); 
            VIRTUAL284_tree = (Object)adaptor.create(VIRTUAL284);
            adaptor.addChild(root_0, VIRTUAL284_tree);

            TABLE285=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_virtual_table_stmt2175); 
            TABLE285_tree = (Object)adaptor.create(TABLE285);
            adaptor.addChild(root_0, TABLE285_tree);

            // Sql.g:249:49: (database_name= ID DOT )?
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
                    // Sql.g:249:50: database_name= ID DOT
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_create_virtual_table_stmt2180); 
                    database_name_tree = (Object)adaptor.create(database_name);
                    adaptor.addChild(root_0, database_name_tree);

                    DOT286=(Token)match(input,DOT,FOLLOW_DOT_in_create_virtual_table_stmt2182); 
                    DOT286_tree = (Object)adaptor.create(DOT286);
                    adaptor.addChild(root_0, DOT286_tree);


                    }
                    break;

            }

            table_name=(Token)match(input,ID,FOLLOW_ID_in_create_virtual_table_stmt2188); 
            table_name_tree = (Object)adaptor.create(table_name);
            adaptor.addChild(root_0, table_name_tree);

            USING287=(Token)match(input,USING,FOLLOW_USING_in_create_virtual_table_stmt2192); 
            USING287_tree = (Object)adaptor.create(USING287);
            adaptor.addChild(root_0, USING287_tree);

            module_name=(Token)match(input,ID,FOLLOW_ID_in_create_virtual_table_stmt2196); 
            module_name_tree = (Object)adaptor.create(module_name);
            adaptor.addChild(root_0, module_name_tree);

            // Sql.g:250:24: ( LPAREN column_def ( COMMA column_def )* RPAREN )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==LPAREN) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // Sql.g:250:25: LPAREN column_def ( COMMA column_def )* RPAREN
                    {
                    LPAREN288=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_virtual_table_stmt2199); 
                    LPAREN288_tree = (Object)adaptor.create(LPAREN288);
                    adaptor.addChild(root_0, LPAREN288_tree);

                    pushFollow(FOLLOW_column_def_in_create_virtual_table_stmt2201);
                    column_def289=column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, column_def289.getTree());
                    // Sql.g:250:43: ( COMMA column_def )*
                    loop109:
                    do {
                        int alt109=2;
                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==COMMA) ) {
                            alt109=1;
                        }


                        switch (alt109) {
                    	case 1 :
                    	    // Sql.g:250:44: COMMA column_def
                    	    {
                    	    COMMA290=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_virtual_table_stmt2204); 
                    	    COMMA290_tree = (Object)adaptor.create(COMMA290);
                    	    adaptor.addChild(root_0, COMMA290_tree);

                    	    pushFollow(FOLLOW_column_def_in_create_virtual_table_stmt2206);
                    	    column_def291=column_def();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, column_def291.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop109;
                        }
                    } while (true);

                    RPAREN292=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_virtual_table_stmt2210); 
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
    // Sql.g:253:1: create_table_stmt : CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= ID DOT )? table_name= ID ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt ) -> ^( TABLE ( TEMPORARY )? ^( $table_name ( $database_name)? ) ( ^( COLUMN_DEFS ( column_def )+ ) )? ( ^( TABLE_CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? ) ;
    public final SqlParser.create_table_stmt_return create_table_stmt() throws RecognitionException {
        SqlParser.create_table_stmt_return retval = new SqlParser.create_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token database_name=null;
        Token table_name=null;
        Token CREATE293=null;
        Token TEMPORARY294=null;
        Token TABLE295=null;
        Token IF296=null;
        Token NOT297=null;
        Token EXISTS298=null;
        Token DOT299=null;
        Token LPAREN300=null;
        Token COMMA302=null;
        Token COMMA304=null;
        Token RPAREN306=null;
        Token AS307=null;
        SqlParser.column_def_return column_def301 = null;

        SqlParser.column_def_return column_def303 = null;

        SqlParser.table_constraint_return table_constraint305 = null;

        SqlParser.select_stmt_return select_stmt308 = null;


        Object database_name_tree=null;
        Object table_name_tree=null;
        Object CREATE293_tree=null;
        Object TEMPORARY294_tree=null;
        Object TABLE295_tree=null;
        Object IF296_tree=null;
        Object NOT297_tree=null;
        Object EXISTS298_tree=null;
        Object DOT299_tree=null;
        Object LPAREN300_tree=null;
        Object COMMA302_tree=null;
        Object COMMA304_tree=null;
        Object RPAREN306_tree=null;
        Object AS307_tree=null;
        RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_TEMPORARY=new RewriteRuleTokenStream(adaptor,"token TEMPORARY");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_select_stmt=new RewriteRuleSubtreeStream(adaptor,"rule select_stmt");
        RewriteRuleSubtreeStream stream_column_def=new RewriteRuleSubtreeStream(adaptor,"rule column_def");
        RewriteRuleSubtreeStream stream_table_constraint=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint");
        try {
            // Sql.g:253:18: ( CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= ID DOT )? table_name= ID ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt ) -> ^( TABLE ( TEMPORARY )? ^( $table_name ( $database_name)? ) ( ^( COLUMN_DEFS ( column_def )+ ) )? ( ^( TABLE_CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? ) )
            // Sql.g:253:20: CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= ID DOT )? table_name= ID ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt )
            {
            CREATE293=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_table_stmt2220);  
            stream_CREATE.add(CREATE293);

            // Sql.g:253:27: ( TEMPORARY )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==TEMPORARY) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // Sql.g:253:27: TEMPORARY
                    {
                    TEMPORARY294=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_table_stmt2222);  
                    stream_TEMPORARY.add(TEMPORARY294);


                    }
                    break;

            }

            TABLE295=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_table_stmt2225);  
            stream_TABLE.add(TABLE295);

            // Sql.g:253:44: ( IF NOT EXISTS )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==IF) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // Sql.g:253:45: IF NOT EXISTS
                    {
                    IF296=(Token)match(input,IF,FOLLOW_IF_in_create_table_stmt2228);  
                    stream_IF.add(IF296);

                    NOT297=(Token)match(input,NOT,FOLLOW_NOT_in_create_table_stmt2230);  
                    stream_NOT.add(NOT297);

                    EXISTS298=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_table_stmt2232);  
                    stream_EXISTS.add(EXISTS298);


                    }
                    break;

            }

            // Sql.g:253:61: (database_name= ID DOT )?
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
                    // Sql.g:253:62: database_name= ID DOT
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_create_table_stmt2239);  
                    stream_ID.add(database_name);

                    DOT299=(Token)match(input,DOT,FOLLOW_DOT_in_create_table_stmt2241);  
                    stream_DOT.add(DOT299);


                    }
                    break;

            }

            table_name=(Token)match(input,ID,FOLLOW_ID_in_create_table_stmt2247);  
            stream_ID.add(table_name);

            // Sql.g:254:3: ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt )
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
                    // Sql.g:254:5: LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN
                    {
                    LPAREN300=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_table_stmt2253);  
                    stream_LPAREN.add(LPAREN300);

                    pushFollow(FOLLOW_column_def_in_create_table_stmt2255);
                    column_def301=column_def();

                    state._fsp--;

                    stream_column_def.add(column_def301.getTree());
                    // Sql.g:254:23: ( COMMA column_def )*
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
                    	    // Sql.g:254:24: COMMA column_def
                    	    {
                    	    COMMA302=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_table_stmt2258);  
                    	    stream_COMMA.add(COMMA302);

                    	    pushFollow(FOLLOW_column_def_in_create_table_stmt2260);
                    	    column_def303=column_def();

                    	    state._fsp--;

                    	    stream_column_def.add(column_def303.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop114;
                        }
                    } while (true);

                    // Sql.g:254:43: ( COMMA table_constraint )*
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==COMMA) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // Sql.g:254:44: COMMA table_constraint
                    	    {
                    	    COMMA304=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_table_stmt2265);  
                    	    stream_COMMA.add(COMMA304);

                    	    pushFollow(FOLLOW_table_constraint_in_create_table_stmt2267);
                    	    table_constraint305=table_constraint();

                    	    state._fsp--;

                    	    stream_table_constraint.add(table_constraint305.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop115;
                        }
                    } while (true);

                    RPAREN306=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_table_stmt2271);  
                    stream_RPAREN.add(RPAREN306);


                    }
                    break;
                case 2 :
                    // Sql.g:255:5: AS select_stmt
                    {
                    AS307=(Token)match(input,AS,FOLLOW_AS_in_create_table_stmt2277);  
                    stream_AS.add(AS307);

                    pushFollow(FOLLOW_select_stmt_in_create_table_stmt2279);
                    select_stmt308=select_stmt();

                    state._fsp--;

                    stream_select_stmt.add(select_stmt308.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: select_stmt, TEMPORARY, TABLE, column_def, table_constraint, table_name, database_name
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
            // 256:1: -> ^( TABLE ( TEMPORARY )? ^( $table_name ( $database_name)? ) ( ^( COLUMN_DEFS ( column_def )+ ) )? ( ^( TABLE_CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? )
            {
                // Sql.g:256:4: ^( TABLE ( TEMPORARY )? ^( $table_name ( $database_name)? ) ( ^( COLUMN_DEFS ( column_def )+ ) )? ( ^( TABLE_CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_TABLE.nextNode(), root_1);

                // Sql.g:256:12: ( TEMPORARY )?
                if ( stream_TEMPORARY.hasNext() ) {
                    adaptor.addChild(root_1, stream_TEMPORARY.nextNode());

                }
                stream_TEMPORARY.reset();
                // Sql.g:256:23: ^( $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                // Sql.g:256:37: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextNode());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }
                // Sql.g:256:54: ( ^( COLUMN_DEFS ( column_def )+ ) )?
                if ( stream_column_def.hasNext() ) {
                    // Sql.g:256:54: ^( COLUMN_DEFS ( column_def )+ )
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
                // Sql.g:256:82: ( ^( TABLE_CONSTRAINTS ( table_constraint )* ) )?
                if ( stream_table_constraint.hasNext() ) {
                    // Sql.g:256:82: ^( TABLE_CONSTRAINTS ( table_constraint )* )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TABLE_CONSTRAINTS, "TABLE_CONSTRAINTS"), root_2);

                    // Sql.g:256:102: ( table_constraint )*
                    while ( stream_table_constraint.hasNext() ) {
                        adaptor.addChild(root_2, stream_table_constraint.nextTree());

                    }
                    stream_table_constraint.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_table_constraint.reset();
                // Sql.g:256:122: ( select_stmt )?
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
    // Sql.g:258:1: column_def : ID ( type_name )? ( column_constraint )* ;
    public final SqlParser.column_def_return column_def() throws RecognitionException {
        SqlParser.column_def_return retval = new SqlParser.column_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID309=null;
        SqlParser.type_name_return type_name310 = null;

        SqlParser.column_constraint_return column_constraint311 = null;


        Object ID309_tree=null;

        try {
            // Sql.g:258:11: ( ID ( type_name )? ( column_constraint )* )
            // Sql.g:258:13: ID ( type_name )? ( column_constraint )*
            {
            root_0 = (Object)adaptor.nil();

            ID309=(Token)match(input,ID,FOLLOW_ID_in_column_def2324); 
            ID309_tree = (Object)adaptor.create(ID309);
            root_0 = (Object)adaptor.becomeRoot(ID309_tree, root_0);

            // Sql.g:258:17: ( type_name )?
            int alt117=2;
            alt117 = dfa117.predict(input);
            switch (alt117) {
                case 1 :
                    // Sql.g:258:17: type_name
                    {
                    pushFollow(FOLLOW_type_name_in_column_def2327);
                    type_name310=type_name();

                    state._fsp--;

                    adaptor.addChild(root_0, type_name310.getTree());

                    }
                    break;

            }

            // Sql.g:258:28: ( column_constraint )*
            loop118:
            do {
                int alt118=2;
                alt118 = dfa118.predict(input);
                switch (alt118) {
            	case 1 :
            	    // Sql.g:258:29: column_constraint
            	    {
            	    pushFollow(FOLLOW_column_constraint_in_column_def2331);
            	    column_constraint311=column_constraint();

            	    state._fsp--;

            	    adaptor.addChild(root_0, column_constraint311.getTree());

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
    // Sql.g:260:1: column_constraint : ( CONSTRAINT name= ID )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause ) -> ^( COLUMN_CONSTRAINT ( ID )? ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ) ;
    public final SqlParser.column_constraint_return column_constraint() throws RecognitionException {
        SqlParser.column_constraint_return retval = new SqlParser.column_constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token CONSTRAINT312=null;
        SqlParser.column_constraint_pk_return column_constraint_pk313 = null;

        SqlParser.column_constraint_not_null_return column_constraint_not_null314 = null;

        SqlParser.column_constraint_unique_return column_constraint_unique315 = null;

        SqlParser.column_constraint_check_return column_constraint_check316 = null;

        SqlParser.column_constraint_default_return column_constraint_default317 = null;

        SqlParser.column_constraint_collate_return column_constraint_collate318 = null;

        SqlParser.fk_clause_return fk_clause319 = null;


        Object name_tree=null;
        Object CONSTRAINT312_tree=null;
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
            // Sql.g:260:18: ( ( CONSTRAINT name= ID )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause ) -> ^( COLUMN_CONSTRAINT ( ID )? ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ) )
            // Sql.g:260:20: ( CONSTRAINT name= ID )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause )
            {
            // Sql.g:260:20: ( CONSTRAINT name= ID )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==CONSTRAINT) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // Sql.g:260:21: CONSTRAINT name= ID
                    {
                    CONSTRAINT312=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_column_constraint2341);  
                    stream_CONSTRAINT.add(CONSTRAINT312);

                    name=(Token)match(input,ID,FOLLOW_ID_in_column_constraint2345);  
                    stream_ID.add(name);


                    }
                    break;

            }

            // Sql.g:261:3: ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause )
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
                    // Sql.g:261:5: column_constraint_pk
                    {
                    pushFollow(FOLLOW_column_constraint_pk_in_column_constraint2353);
                    column_constraint_pk313=column_constraint_pk();

                    state._fsp--;

                    stream_column_constraint_pk.add(column_constraint_pk313.getTree());

                    }
                    break;
                case 2 :
                    // Sql.g:262:5: column_constraint_not_null
                    {
                    pushFollow(FOLLOW_column_constraint_not_null_in_column_constraint2359);
                    column_constraint_not_null314=column_constraint_not_null();

                    state._fsp--;

                    stream_column_constraint_not_null.add(column_constraint_not_null314.getTree());

                    }
                    break;
                case 3 :
                    // Sql.g:263:5: column_constraint_unique
                    {
                    pushFollow(FOLLOW_column_constraint_unique_in_column_constraint2365);
                    column_constraint_unique315=column_constraint_unique();

                    state._fsp--;

                    stream_column_constraint_unique.add(column_constraint_unique315.getTree());

                    }
                    break;
                case 4 :
                    // Sql.g:264:5: column_constraint_check
                    {
                    pushFollow(FOLLOW_column_constraint_check_in_column_constraint2371);
                    column_constraint_check316=column_constraint_check();

                    state._fsp--;

                    stream_column_constraint_check.add(column_constraint_check316.getTree());

                    }
                    break;
                case 5 :
                    // Sql.g:265:5: column_constraint_default
                    {
                    pushFollow(FOLLOW_column_constraint_default_in_column_constraint2377);
                    column_constraint_default317=column_constraint_default();

                    state._fsp--;

                    stream_column_constraint_default.add(column_constraint_default317.getTree());

                    }
                    break;
                case 6 :
                    // Sql.g:266:5: column_constraint_collate
                    {
                    pushFollow(FOLLOW_column_constraint_collate_in_column_constraint2383);
                    column_constraint_collate318=column_constraint_collate();

                    state._fsp--;

                    stream_column_constraint_collate.add(column_constraint_collate318.getTree());

                    }
                    break;
                case 7 :
                    // Sql.g:267:5: fk_clause
                    {
                    pushFollow(FOLLOW_fk_clause_in_column_constraint2389);
                    fk_clause319=fk_clause();

                    state._fsp--;

                    stream_fk_clause.add(fk_clause319.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: column_constraint_default, column_constraint_pk, column_constraint_not_null, column_constraint_collate, column_constraint_check, ID, column_constraint_unique, fk_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 268:1: -> ^( COLUMN_CONSTRAINT ( ID )? ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? )
            {
                // Sql.g:268:4: ^( COLUMN_CONSTRAINT ( ID )? ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMN_CONSTRAINT, "COLUMN_CONSTRAINT"), root_1);

                // Sql.g:268:24: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();
                // Sql.g:269:3: ( column_constraint_pk )?
                if ( stream_column_constraint_pk.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_pk.nextTree());

                }
                stream_column_constraint_pk.reset();
                // Sql.g:270:3: ( column_constraint_not_null )?
                if ( stream_column_constraint_not_null.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_not_null.nextTree());

                }
                stream_column_constraint_not_null.reset();
                // Sql.g:271:3: ( column_constraint_unique )?
                if ( stream_column_constraint_unique.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_unique.nextTree());

                }
                stream_column_constraint_unique.reset();
                // Sql.g:272:3: ( column_constraint_check )?
                if ( stream_column_constraint_check.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_check.nextTree());

                }
                stream_column_constraint_check.reset();
                // Sql.g:273:3: ( column_constraint_default )?
                if ( stream_column_constraint_default.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_default.nextTree());

                }
                stream_column_constraint_default.reset();
                // Sql.g:274:3: ( column_constraint_collate )?
                if ( stream_column_constraint_collate.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_collate.nextTree());

                }
                stream_column_constraint_collate.reset();
                // Sql.g:275:3: ( fk_clause )?
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
    // Sql.g:277:1: column_constraint_pk : PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )? ;
    public final SqlParser.column_constraint_pk_return column_constraint_pk() throws RecognitionException {
        SqlParser.column_constraint_pk_return retval = new SqlParser.column_constraint_pk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRIMARY320=null;
        Token KEY321=null;
        Token set322=null;
        Token AUTOINCREMENT324=null;
        SqlParser.table_conflict_clause_return table_conflict_clause323 = null;


        Object PRIMARY320_tree=null;
        Object KEY321_tree=null;
        Object set322_tree=null;
        Object AUTOINCREMENT324_tree=null;

        try {
            // Sql.g:277:21: ( PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )? )
            // Sql.g:277:23: PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )?
            {
            root_0 = (Object)adaptor.nil();

            PRIMARY320=(Token)match(input,PRIMARY,FOLLOW_PRIMARY_in_column_constraint_pk2442); 
            PRIMARY320_tree = (Object)adaptor.create(PRIMARY320);
            root_0 = (Object)adaptor.becomeRoot(PRIMARY320_tree, root_0);

            KEY321=(Token)match(input,KEY,FOLLOW_KEY_in_column_constraint_pk2445); 
            // Sql.g:277:37: ( ASC | DESC )?
            int alt121=2;
            alt121 = dfa121.predict(input);
            switch (alt121) {
                case 1 :
                    // Sql.g:
                    {
                    set322=(Token)input.LT(1);
                    if ( (input.LA(1)>=ASC && input.LA(1)<=DESC) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set322));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            // Sql.g:277:51: ( table_conflict_clause )?
            int alt122=2;
            alt122 = dfa122.predict(input);
            switch (alt122) {
                case 1 :
                    // Sql.g:277:51: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_pk2457);
                    table_conflict_clause323=table_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, table_conflict_clause323.getTree());

                    }
                    break;

            }

            // Sql.g:277:74: ( AUTOINCREMENT )?
            int alt123=2;
            alt123 = dfa123.predict(input);
            switch (alt123) {
                case 1 :
                    // Sql.g:277:75: AUTOINCREMENT
                    {
                    AUTOINCREMENT324=(Token)match(input,AUTOINCREMENT,FOLLOW_AUTOINCREMENT_in_column_constraint_pk2461); 
                    AUTOINCREMENT324_tree = (Object)adaptor.create(AUTOINCREMENT324);
                    adaptor.addChild(root_0, AUTOINCREMENT324_tree);


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
    // Sql.g:279:1: column_constraint_not_null : NOT NULL ( table_conflict_clause )? -> ^( NOT_NULL ( table_conflict_clause )? ) ;
    public final SqlParser.column_constraint_not_null_return column_constraint_not_null() throws RecognitionException {
        SqlParser.column_constraint_not_null_return retval = new SqlParser.column_constraint_not_null_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT325=null;
        Token NULL326=null;
        SqlParser.table_conflict_clause_return table_conflict_clause327 = null;


        Object NOT325_tree=null;
        Object NULL326_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // Sql.g:279:27: ( NOT NULL ( table_conflict_clause )? -> ^( NOT_NULL ( table_conflict_clause )? ) )
            // Sql.g:279:29: NOT NULL ( table_conflict_clause )?
            {
            NOT325=(Token)match(input,NOT,FOLLOW_NOT_in_column_constraint_not_null2470);  
            stream_NOT.add(NOT325);

            NULL326=(Token)match(input,NULL,FOLLOW_NULL_in_column_constraint_not_null2472);  
            stream_NULL.add(NULL326);

            // Sql.g:279:38: ( table_conflict_clause )?
            int alt124=2;
            alt124 = dfa124.predict(input);
            switch (alt124) {
                case 1 :
                    // Sql.g:279:38: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_not_null2474);
                    table_conflict_clause327=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause327.getTree());

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
            // 279:61: -> ^( NOT_NULL ( table_conflict_clause )? )
            {
                // Sql.g:279:64: ^( NOT_NULL ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_NULL, "NOT_NULL"), root_1);

                // Sql.g:279:75: ( table_conflict_clause )?
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
    // Sql.g:281:1: column_constraint_unique : UNIQUE ( table_conflict_clause )? ;
    public final SqlParser.column_constraint_unique_return column_constraint_unique() throws RecognitionException {
        SqlParser.column_constraint_unique_return retval = new SqlParser.column_constraint_unique_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNIQUE328=null;
        SqlParser.table_conflict_clause_return table_conflict_clause329 = null;


        Object UNIQUE328_tree=null;

        try {
            // Sql.g:281:25: ( UNIQUE ( table_conflict_clause )? )
            // Sql.g:281:27: UNIQUE ( table_conflict_clause )?
            {
            root_0 = (Object)adaptor.nil();

            UNIQUE328=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_column_constraint_unique2491); 
            UNIQUE328_tree = (Object)adaptor.create(UNIQUE328);
            root_0 = (Object)adaptor.becomeRoot(UNIQUE328_tree, root_0);

            // Sql.g:281:35: ( table_conflict_clause )?
            int alt125=2;
            alt125 = dfa125.predict(input);
            switch (alt125) {
                case 1 :
                    // Sql.g:281:35: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_unique2494);
                    table_conflict_clause329=table_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, table_conflict_clause329.getTree());

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
    // Sql.g:283:1: column_constraint_check : CHECK LPAREN expr RPAREN ;
    public final SqlParser.column_constraint_check_return column_constraint_check() throws RecognitionException {
        SqlParser.column_constraint_check_return retval = new SqlParser.column_constraint_check_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CHECK330=null;
        Token LPAREN331=null;
        Token RPAREN333=null;
        SqlParser.expr_return expr332 = null;


        Object CHECK330_tree=null;
        Object LPAREN331_tree=null;
        Object RPAREN333_tree=null;

        try {
            // Sql.g:283:24: ( CHECK LPAREN expr RPAREN )
            // Sql.g:283:26: CHECK LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            CHECK330=(Token)match(input,CHECK,FOLLOW_CHECK_in_column_constraint_check2502); 
            CHECK330_tree = (Object)adaptor.create(CHECK330);
            root_0 = (Object)adaptor.becomeRoot(CHECK330_tree, root_0);

            LPAREN331=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_column_constraint_check2505); 
            pushFollow(FOLLOW_expr_in_column_constraint_check2508);
            expr332=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr332.getTree());
            RPAREN333=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_column_constraint_check2510); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:285:1: column_constraint_default : DEFAULT ( SIGNED_NUMBER | literal_value | LPAREN expr RPAREN ) ;
    public final SqlParser.column_constraint_default_return column_constraint_default() throws RecognitionException {
        SqlParser.column_constraint_default_return retval = new SqlParser.column_constraint_default_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT334=null;
        Token SIGNED_NUMBER335=null;
        Token LPAREN337=null;
        Token RPAREN339=null;
        SqlParser.literal_value_return literal_value336 = null;

        SqlParser.expr_return expr338 = null;


        Object DEFAULT334_tree=null;
        Object SIGNED_NUMBER335_tree=null;
        Object LPAREN337_tree=null;
        Object RPAREN339_tree=null;

        try {
            // Sql.g:285:26: ( DEFAULT ( SIGNED_NUMBER | literal_value | LPAREN expr RPAREN ) )
            // Sql.g:285:28: DEFAULT ( SIGNED_NUMBER | literal_value | LPAREN expr RPAREN )
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT334=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_column_constraint_default2518); 
            DEFAULT334_tree = (Object)adaptor.create(DEFAULT334);
            root_0 = (Object)adaptor.becomeRoot(DEFAULT334_tree, root_0);

            // Sql.g:285:37: ( SIGNED_NUMBER | literal_value | LPAREN expr RPAREN )
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
                    // Sql.g:285:38: SIGNED_NUMBER
                    {
                    SIGNED_NUMBER335=(Token)match(input,SIGNED_NUMBER,FOLLOW_SIGNED_NUMBER_in_column_constraint_default2522); 
                    SIGNED_NUMBER335_tree = (Object)adaptor.create(SIGNED_NUMBER335);
                    adaptor.addChild(root_0, SIGNED_NUMBER335_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:285:54: literal_value
                    {
                    pushFollow(FOLLOW_literal_value_in_column_constraint_default2526);
                    literal_value336=literal_value();

                    state._fsp--;

                    adaptor.addChild(root_0, literal_value336.getTree());

                    }
                    break;
                case 3 :
                    // Sql.g:285:70: LPAREN expr RPAREN
                    {
                    LPAREN337=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_column_constraint_default2530); 
                    pushFollow(FOLLOW_expr_in_column_constraint_default2533);
                    expr338=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr338.getTree());
                    RPAREN339=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_column_constraint_default2535); 

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
    // Sql.g:287:1: column_constraint_collate : COLLATE collation_name= ID ;
    public final SqlParser.column_constraint_collate_return column_constraint_collate() throws RecognitionException {
        SqlParser.column_constraint_collate_return retval = new SqlParser.column_constraint_collate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token collation_name=null;
        Token COLLATE340=null;

        Object collation_name_tree=null;
        Object COLLATE340_tree=null;

        try {
            // Sql.g:287:26: ( COLLATE collation_name= ID )
            // Sql.g:287:28: COLLATE collation_name= ID
            {
            root_0 = (Object)adaptor.nil();

            COLLATE340=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_column_constraint_collate2544); 
            COLLATE340_tree = (Object)adaptor.create(COLLATE340);
            root_0 = (Object)adaptor.becomeRoot(COLLATE340_tree, root_0);

            collation_name=(Token)match(input,ID,FOLLOW_ID_in_column_constraint_collate2549); 
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
    // Sql.g:289:1: table_constraint : ( CONSTRAINT name= ID )? ( table_constraint_pk | table_constraint_check | table_constraint_fk ) ;
    public final SqlParser.table_constraint_return table_constraint() throws RecognitionException {
        SqlParser.table_constraint_return retval = new SqlParser.table_constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token CONSTRAINT341=null;
        SqlParser.table_constraint_pk_return table_constraint_pk342 = null;

        SqlParser.table_constraint_check_return table_constraint_check343 = null;

        SqlParser.table_constraint_fk_return table_constraint_fk344 = null;


        Object name_tree=null;
        Object CONSTRAINT341_tree=null;

        try {
            // Sql.g:289:17: ( ( CONSTRAINT name= ID )? ( table_constraint_pk | table_constraint_check | table_constraint_fk ) )
            // Sql.g:289:19: ( CONSTRAINT name= ID )? ( table_constraint_pk | table_constraint_check | table_constraint_fk )
            {
            root_0 = (Object)adaptor.nil();

            // Sql.g:289:19: ( CONSTRAINT name= ID )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==CONSTRAINT) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // Sql.g:289:20: CONSTRAINT name= ID
                    {
                    CONSTRAINT341=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_table_constraint2558); 
                    CONSTRAINT341_tree = (Object)adaptor.create(CONSTRAINT341);
                    adaptor.addChild(root_0, CONSTRAINT341_tree);

                    name=(Token)match(input,ID,FOLLOW_ID_in_table_constraint2562); 
                    name_tree = (Object)adaptor.create(name);
                    adaptor.addChild(root_0, name_tree);


                    }
                    break;

            }

            // Sql.g:290:3: ( table_constraint_pk | table_constraint_check | table_constraint_fk )
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
                    // Sql.g:290:5: table_constraint_pk
                    {
                    pushFollow(FOLLOW_table_constraint_pk_in_table_constraint2570);
                    table_constraint_pk342=table_constraint_pk();

                    state._fsp--;

                    adaptor.addChild(root_0, table_constraint_pk342.getTree());

                    }
                    break;
                case 2 :
                    // Sql.g:291:5: table_constraint_check
                    {
                    pushFollow(FOLLOW_table_constraint_check_in_table_constraint2576);
                    table_constraint_check343=table_constraint_check();

                    state._fsp--;

                    adaptor.addChild(root_0, table_constraint_check343.getTree());

                    }
                    break;
                case 3 :
                    // Sql.g:292:5: table_constraint_fk
                    {
                    pushFollow(FOLLOW_table_constraint_fk_in_table_constraint2582);
                    table_constraint_fk344=table_constraint_fk();

                    state._fsp--;

                    adaptor.addChild(root_0, table_constraint_fk344.getTree());

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
    // Sql.g:294:1: table_constraint_pk : ( PRIMARY KEY | UNIQUE ) LPAREN indexed_columns+= ID ( COMMA indexed_columns+= ID )* RPAREN ( table_conflict_clause )? ;
    public final SqlParser.table_constraint_pk_return table_constraint_pk() throws RecognitionException {
        SqlParser.table_constraint_pk_return retval = new SqlParser.table_constraint_pk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRIMARY345=null;
        Token KEY346=null;
        Token UNIQUE347=null;
        Token LPAREN348=null;
        Token COMMA349=null;
        Token RPAREN350=null;
        Token indexed_columns=null;
        List list_indexed_columns=null;
        SqlParser.table_conflict_clause_return table_conflict_clause351 = null;


        Object PRIMARY345_tree=null;
        Object KEY346_tree=null;
        Object UNIQUE347_tree=null;
        Object LPAREN348_tree=null;
        Object COMMA349_tree=null;
        Object RPAREN350_tree=null;
        Object indexed_columns_tree=null;

        try {
            // Sql.g:294:20: ( ( PRIMARY KEY | UNIQUE ) LPAREN indexed_columns+= ID ( COMMA indexed_columns+= ID )* RPAREN ( table_conflict_clause )? )
            // Sql.g:294:22: ( PRIMARY KEY | UNIQUE ) LPAREN indexed_columns+= ID ( COMMA indexed_columns+= ID )* RPAREN ( table_conflict_clause )?
            {
            root_0 = (Object)adaptor.nil();

            // Sql.g:294:22: ( PRIMARY KEY | UNIQUE )
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
                    // Sql.g:294:23: PRIMARY KEY
                    {
                    PRIMARY345=(Token)match(input,PRIMARY,FOLLOW_PRIMARY_in_table_constraint_pk2591); 
                    PRIMARY345_tree = (Object)adaptor.create(PRIMARY345);
                    adaptor.addChild(root_0, PRIMARY345_tree);

                    KEY346=(Token)match(input,KEY,FOLLOW_KEY_in_table_constraint_pk2593); 
                    KEY346_tree = (Object)adaptor.create(KEY346);
                    adaptor.addChild(root_0, KEY346_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:294:37: UNIQUE
                    {
                    UNIQUE347=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_table_constraint_pk2597); 
                    UNIQUE347_tree = (Object)adaptor.create(UNIQUE347);
                    adaptor.addChild(root_0, UNIQUE347_tree);


                    }
                    break;

            }

            LPAREN348=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_pk2600); 
            LPAREN348_tree = (Object)adaptor.create(LPAREN348);
            adaptor.addChild(root_0, LPAREN348_tree);

            indexed_columns=(Token)match(input,ID,FOLLOW_ID_in_table_constraint_pk2604); 
            indexed_columns_tree = (Object)adaptor.create(indexed_columns);
            adaptor.addChild(root_0, indexed_columns_tree);

            if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            list_indexed_columns.add(indexed_columns);

            // Sql.g:294:72: ( COMMA indexed_columns+= ID )*
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( (LA130_0==COMMA) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // Sql.g:294:73: COMMA indexed_columns+= ID
            	    {
            	    COMMA349=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_pk2607); 
            	    COMMA349_tree = (Object)adaptor.create(COMMA349);
            	    adaptor.addChild(root_0, COMMA349_tree);

            	    indexed_columns=(Token)match(input,ID,FOLLOW_ID_in_table_constraint_pk2611); 
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

            RPAREN350=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_pk2615); 
            RPAREN350_tree = (Object)adaptor.create(RPAREN350);
            adaptor.addChild(root_0, RPAREN350_tree);

            // Sql.g:295:3: ( table_conflict_clause )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==ON) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // Sql.g:295:3: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_table_constraint_pk2619);
                    table_conflict_clause351=table_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, table_conflict_clause351.getTree());

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
    // Sql.g:297:1: table_constraint_check : CHECK LPAREN expr RPAREN ;
    public final SqlParser.table_constraint_check_return table_constraint_check() throws RecognitionException {
        SqlParser.table_constraint_check_return retval = new SqlParser.table_constraint_check_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CHECK352=null;
        Token LPAREN353=null;
        Token RPAREN355=null;
        SqlParser.expr_return expr354 = null;


        Object CHECK352_tree=null;
        Object LPAREN353_tree=null;
        Object RPAREN355_tree=null;

        try {
            // Sql.g:297:23: ( CHECK LPAREN expr RPAREN )
            // Sql.g:297:25: CHECK LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            CHECK352=(Token)match(input,CHECK,FOLLOW_CHECK_in_table_constraint_check2627); 
            CHECK352_tree = (Object)adaptor.create(CHECK352);
            adaptor.addChild(root_0, CHECK352_tree);

            LPAREN353=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_check2629); 
            LPAREN353_tree = (Object)adaptor.create(LPAREN353);
            adaptor.addChild(root_0, LPAREN353_tree);

            pushFollow(FOLLOW_expr_in_table_constraint_check2631);
            expr354=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr354.getTree());
            RPAREN355=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_check2633); 
            RPAREN355_tree = (Object)adaptor.create(RPAREN355);
            adaptor.addChild(root_0, RPAREN355_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:299:1: table_constraint_fk : FOREIGN KEY LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN fk_clause ;
    public final SqlParser.table_constraint_fk_return table_constraint_fk() throws RecognitionException {
        SqlParser.table_constraint_fk_return retval = new SqlParser.table_constraint_fk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOREIGN356=null;
        Token KEY357=null;
        Token LPAREN358=null;
        Token COMMA359=null;
        Token RPAREN360=null;
        Token column_names=null;
        List list_column_names=null;
        SqlParser.fk_clause_return fk_clause361 = null;


        Object FOREIGN356_tree=null;
        Object KEY357_tree=null;
        Object LPAREN358_tree=null;
        Object COMMA359_tree=null;
        Object RPAREN360_tree=null;
        Object column_names_tree=null;

        try {
            // Sql.g:299:20: ( FOREIGN KEY LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN fk_clause )
            // Sql.g:299:22: FOREIGN KEY LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN fk_clause
            {
            root_0 = (Object)adaptor.nil();

            FOREIGN356=(Token)match(input,FOREIGN,FOLLOW_FOREIGN_in_table_constraint_fk2640); 
            FOREIGN356_tree = (Object)adaptor.create(FOREIGN356);
            adaptor.addChild(root_0, FOREIGN356_tree);

            KEY357=(Token)match(input,KEY,FOLLOW_KEY_in_table_constraint_fk2642); 
            KEY357_tree = (Object)adaptor.create(KEY357);
            adaptor.addChild(root_0, KEY357_tree);

            LPAREN358=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_fk2644); 
            LPAREN358_tree = (Object)adaptor.create(LPAREN358);
            adaptor.addChild(root_0, LPAREN358_tree);

            column_names=(Token)match(input,ID,FOLLOW_ID_in_table_constraint_fk2648); 
            column_names_tree = (Object)adaptor.create(column_names);
            adaptor.addChild(root_0, column_names_tree);

            if (list_column_names==null) list_column_names=new ArrayList();
            list_column_names.add(column_names);

            // Sql.g:299:58: ( COMMA column_names+= ID )*
            loop132:
            do {
                int alt132=2;
                int LA132_0 = input.LA(1);

                if ( (LA132_0==COMMA) ) {
                    alt132=1;
                }


                switch (alt132) {
            	case 1 :
            	    // Sql.g:299:59: COMMA column_names+= ID
            	    {
            	    COMMA359=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_fk2651); 
            	    COMMA359_tree = (Object)adaptor.create(COMMA359);
            	    adaptor.addChild(root_0, COMMA359_tree);

            	    column_names=(Token)match(input,ID,FOLLOW_ID_in_table_constraint_fk2655); 
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

            RPAREN360=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_fk2659); 
            RPAREN360_tree = (Object)adaptor.create(RPAREN360);
            adaptor.addChild(root_0, RPAREN360_tree);

            pushFollow(FOLLOW_fk_clause_in_table_constraint_fk2661);
            fk_clause361=fk_clause();

            state._fsp--;

            adaptor.addChild(root_0, fk_clause361.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:301:1: fk_clause : REFERENCES foreign_table= ID ( LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )? ;
    public final SqlParser.fk_clause_return fk_clause() throws RecognitionException {
        SqlParser.fk_clause_return retval = new SqlParser.fk_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token foreign_table=null;
        Token REFERENCES362=null;
        Token LPAREN363=null;
        Token COMMA364=null;
        Token RPAREN365=null;
        Token column_names=null;
        List list_column_names=null;
        SqlParser.fk_clause_action_return fk_clause_action366 = null;

        SqlParser.fk_clause_deferrable_return fk_clause_deferrable367 = null;


        Object foreign_table_tree=null;
        Object REFERENCES362_tree=null;
        Object LPAREN363_tree=null;
        Object COMMA364_tree=null;
        Object RPAREN365_tree=null;
        Object column_names_tree=null;

        try {
            // Sql.g:301:10: ( REFERENCES foreign_table= ID ( LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )? )
            // Sql.g:301:12: REFERENCES foreign_table= ID ( LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )?
            {
            root_0 = (Object)adaptor.nil();

            REFERENCES362=(Token)match(input,REFERENCES,FOLLOW_REFERENCES_in_fk_clause2668); 
            REFERENCES362_tree = (Object)adaptor.create(REFERENCES362);
            root_0 = (Object)adaptor.becomeRoot(REFERENCES362_tree, root_0);

            foreign_table=(Token)match(input,ID,FOLLOW_ID_in_fk_clause2673); 
            foreign_table_tree = (Object)adaptor.create(foreign_table);
            adaptor.addChild(root_0, foreign_table_tree);

            // Sql.g:301:41: ( LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==LPAREN) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // Sql.g:301:42: LPAREN column_names+= ID ( COMMA column_names+= ID )* RPAREN
                    {
                    LPAREN363=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_fk_clause2676); 
                    LPAREN363_tree = (Object)adaptor.create(LPAREN363);
                    adaptor.addChild(root_0, LPAREN363_tree);

                    column_names=(Token)match(input,ID,FOLLOW_ID_in_fk_clause2680); 
                    column_names_tree = (Object)adaptor.create(column_names);
                    adaptor.addChild(root_0, column_names_tree);

                    if (list_column_names==null) list_column_names=new ArrayList();
                    list_column_names.add(column_names);

                    // Sql.g:301:66: ( COMMA column_names+= ID )*
                    loop133:
                    do {
                        int alt133=2;
                        int LA133_0 = input.LA(1);

                        if ( (LA133_0==COMMA) ) {
                            alt133=1;
                        }


                        switch (alt133) {
                    	case 1 :
                    	    // Sql.g:301:67: COMMA column_names+= ID
                    	    {
                    	    COMMA364=(Token)match(input,COMMA,FOLLOW_COMMA_in_fk_clause2683); 
                    	    COMMA364_tree = (Object)adaptor.create(COMMA364);
                    	    adaptor.addChild(root_0, COMMA364_tree);

                    	    column_names=(Token)match(input,ID,FOLLOW_ID_in_fk_clause2687); 
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

                    RPAREN365=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_fk_clause2691); 
                    RPAREN365_tree = (Object)adaptor.create(RPAREN365);
                    adaptor.addChild(root_0, RPAREN365_tree);


                    }
                    break;

            }

            // Sql.g:302:3: ( fk_clause_action )+
            int cnt135=0;
            loop135:
            do {
                int alt135=2;
                alt135 = dfa135.predict(input);
                switch (alt135) {
            	case 1 :
            	    // Sql.g:302:3: fk_clause_action
            	    {
            	    pushFollow(FOLLOW_fk_clause_action_in_fk_clause2697);
            	    fk_clause_action366=fk_clause_action();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fk_clause_action366.getTree());

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

            // Sql.g:302:21: ( fk_clause_deferrable )?
            int alt136=2;
            alt136 = dfa136.predict(input);
            switch (alt136) {
                case 1 :
                    // Sql.g:302:21: fk_clause_deferrable
                    {
                    pushFollow(FOLLOW_fk_clause_deferrable_in_fk_clause2700);
                    fk_clause_deferrable367=fk_clause_deferrable();

                    state._fsp--;

                    adaptor.addChild(root_0, fk_clause_deferrable367.getTree());

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
    // Sql.g:304:1: fk_clause_action : ( ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT ) | MATCH name= ID );
    public final SqlParser.fk_clause_action_return fk_clause_action() throws RecognitionException {
        SqlParser.fk_clause_action_return retval = new SqlParser.fk_clause_action_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token ON368=null;
        Token set369=null;
        Token SET370=null;
        Token NULL371=null;
        Token SET372=null;
        Token DEFAULT373=null;
        Token CASCADE374=null;
        Token RESTRICT375=null;
        Token MATCH376=null;

        Object name_tree=null;
        Object ON368_tree=null;
        Object set369_tree=null;
        Object SET370_tree=null;
        Object NULL371_tree=null;
        Object SET372_tree=null;
        Object DEFAULT373_tree=null;
        Object CASCADE374_tree=null;
        Object RESTRICT375_tree=null;
        Object MATCH376_tree=null;

        try {
            // Sql.g:305:3: ( ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT ) | MATCH name= ID )
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
                    // Sql.g:305:5: ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT )
                    {
                    root_0 = (Object)adaptor.nil();

                    ON368=(Token)match(input,ON,FOLLOW_ON_in_fk_clause_action2711); 
                    ON368_tree = (Object)adaptor.create(ON368);
                    adaptor.addChild(root_0, ON368_tree);

                    set369=(Token)input.LT(1);
                    if ( input.LA(1)==INSERT||input.LA(1)==UPDATE||input.LA(1)==DELETE ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set369));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // Sql.g:305:35: ( SET NULL | SET DEFAULT | CASCADE | RESTRICT )
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
                            // Sql.g:305:36: SET NULL
                            {
                            SET370=(Token)match(input,SET,FOLLOW_SET_in_fk_clause_action2726); 
                            SET370_tree = (Object)adaptor.create(SET370);
                            adaptor.addChild(root_0, SET370_tree);

                            NULL371=(Token)match(input,NULL,FOLLOW_NULL_in_fk_clause_action2728); 
                            NULL371_tree = (Object)adaptor.create(NULL371);
                            adaptor.addChild(root_0, NULL371_tree);


                            }
                            break;
                        case 2 :
                            // Sql.g:305:47: SET DEFAULT
                            {
                            SET372=(Token)match(input,SET,FOLLOW_SET_in_fk_clause_action2732); 
                            SET372_tree = (Object)adaptor.create(SET372);
                            adaptor.addChild(root_0, SET372_tree);

                            DEFAULT373=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_fk_clause_action2734); 
                            DEFAULT373_tree = (Object)adaptor.create(DEFAULT373);
                            adaptor.addChild(root_0, DEFAULT373_tree);


                            }
                            break;
                        case 3 :
                            // Sql.g:305:61: CASCADE
                            {
                            CASCADE374=(Token)match(input,CASCADE,FOLLOW_CASCADE_in_fk_clause_action2738); 
                            CASCADE374_tree = (Object)adaptor.create(CASCADE374);
                            adaptor.addChild(root_0, CASCADE374_tree);


                            }
                            break;
                        case 4 :
                            // Sql.g:305:71: RESTRICT
                            {
                            RESTRICT375=(Token)match(input,RESTRICT,FOLLOW_RESTRICT_in_fk_clause_action2742); 
                            RESTRICT375_tree = (Object)adaptor.create(RESTRICT375);
                            adaptor.addChild(root_0, RESTRICT375_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Sql.g:306:5: MATCH name= ID
                    {
                    root_0 = (Object)adaptor.nil();

                    MATCH376=(Token)match(input,MATCH,FOLLOW_MATCH_in_fk_clause_action2749); 
                    MATCH376_tree = (Object)adaptor.create(MATCH376);
                    adaptor.addChild(root_0, MATCH376_tree);

                    name=(Token)match(input,ID,FOLLOW_ID_in_fk_clause_action2753); 
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
    // Sql.g:308:1: fk_clause_deferrable : ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )? ;
    public final SqlParser.fk_clause_deferrable_return fk_clause_deferrable() throws RecognitionException {
        SqlParser.fk_clause_deferrable_return retval = new SqlParser.fk_clause_deferrable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT377=null;
        Token DEFERRABLE378=null;
        Token INITIALLY379=null;
        Token DEFERRED380=null;
        Token INITIALLY381=null;
        Token IMMEDIATE382=null;

        Object NOT377_tree=null;
        Object DEFERRABLE378_tree=null;
        Object INITIALLY379_tree=null;
        Object DEFERRED380_tree=null;
        Object INITIALLY381_tree=null;
        Object IMMEDIATE382_tree=null;

        try {
            // Sql.g:308:21: ( ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )? )
            // Sql.g:308:23: ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?
            {
            root_0 = (Object)adaptor.nil();

            // Sql.g:308:23: ( NOT )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==NOT) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // Sql.g:308:24: NOT
                    {
                    NOT377=(Token)match(input,NOT,FOLLOW_NOT_in_fk_clause_deferrable2761); 
                    NOT377_tree = (Object)adaptor.create(NOT377);
                    adaptor.addChild(root_0, NOT377_tree);


                    }
                    break;

            }

            DEFERRABLE378=(Token)match(input,DEFERRABLE,FOLLOW_DEFERRABLE_in_fk_clause_deferrable2765); 
            DEFERRABLE378_tree = (Object)adaptor.create(DEFERRABLE378);
            adaptor.addChild(root_0, DEFERRABLE378_tree);

            // Sql.g:308:41: ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?
            int alt140=3;
            alt140 = dfa140.predict(input);
            switch (alt140) {
                case 1 :
                    // Sql.g:308:42: INITIALLY DEFERRED
                    {
                    INITIALLY379=(Token)match(input,INITIALLY,FOLLOW_INITIALLY_in_fk_clause_deferrable2768); 
                    INITIALLY379_tree = (Object)adaptor.create(INITIALLY379);
                    adaptor.addChild(root_0, INITIALLY379_tree);

                    DEFERRED380=(Token)match(input,DEFERRED,FOLLOW_DEFERRED_in_fk_clause_deferrable2770); 
                    DEFERRED380_tree = (Object)adaptor.create(DEFERRED380);
                    adaptor.addChild(root_0, DEFERRED380_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:308:63: INITIALLY IMMEDIATE
                    {
                    INITIALLY381=(Token)match(input,INITIALLY,FOLLOW_INITIALLY_in_fk_clause_deferrable2774); 
                    INITIALLY381_tree = (Object)adaptor.create(INITIALLY381);
                    adaptor.addChild(root_0, INITIALLY381_tree);

                    IMMEDIATE382=(Token)match(input,IMMEDIATE,FOLLOW_IMMEDIATE_in_fk_clause_deferrable2776); 
                    IMMEDIATE382_tree = (Object)adaptor.create(IMMEDIATE382);
                    adaptor.addChild(root_0, IMMEDIATE382_tree);


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
    // Sql.g:311:1: drop_table_stmt : DROP TABLE ( IF EXISTS )? (database_name= ID DOT )? table_name= ID ;
    public final SqlParser.drop_table_stmt_return drop_table_stmt() throws RecognitionException {
        SqlParser.drop_table_stmt_return retval = new SqlParser.drop_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token database_name=null;
        Token table_name=null;
        Token DROP383=null;
        Token TABLE384=null;
        Token IF385=null;
        Token EXISTS386=null;
        Token DOT387=null;

        Object database_name_tree=null;
        Object table_name_tree=null;
        Object DROP383_tree=null;
        Object TABLE384_tree=null;
        Object IF385_tree=null;
        Object EXISTS386_tree=null;
        Object DOT387_tree=null;

        try {
            // Sql.g:311:16: ( DROP TABLE ( IF EXISTS )? (database_name= ID DOT )? table_name= ID )
            // Sql.g:311:18: DROP TABLE ( IF EXISTS )? (database_name= ID DOT )? table_name= ID
            {
            root_0 = (Object)adaptor.nil();

            DROP383=(Token)match(input,DROP,FOLLOW_DROP_in_drop_table_stmt2786); 
            DROP383_tree = (Object)adaptor.create(DROP383);
            adaptor.addChild(root_0, DROP383_tree);

            TABLE384=(Token)match(input,TABLE,FOLLOW_TABLE_in_drop_table_stmt2788); 
            TABLE384_tree = (Object)adaptor.create(TABLE384);
            adaptor.addChild(root_0, TABLE384_tree);

            // Sql.g:311:29: ( IF EXISTS )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==IF) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // Sql.g:311:30: IF EXISTS
                    {
                    IF385=(Token)match(input,IF,FOLLOW_IF_in_drop_table_stmt2791); 
                    IF385_tree = (Object)adaptor.create(IF385);
                    adaptor.addChild(root_0, IF385_tree);

                    EXISTS386=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_table_stmt2793); 
                    EXISTS386_tree = (Object)adaptor.create(EXISTS386);
                    adaptor.addChild(root_0, EXISTS386_tree);


                    }
                    break;

            }

            // Sql.g:311:42: (database_name= ID DOT )?
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
                    // Sql.g:311:43: database_name= ID DOT
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_drop_table_stmt2800); 
                    database_name_tree = (Object)adaptor.create(database_name);
                    adaptor.addChild(root_0, database_name_tree);

                    DOT387=(Token)match(input,DOT,FOLLOW_DOT_in_drop_table_stmt2802); 
                    DOT387_tree = (Object)adaptor.create(DOT387);
                    adaptor.addChild(root_0, DOT387_tree);


                    }
                    break;

            }

            table_name=(Token)match(input,ID,FOLLOW_ID_in_drop_table_stmt2808); 
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
    // Sql.g:314:1: alter_table_stmt : ALTER TABLE (database_name= ID DOT )? table_name= ID ( RENAME TO new_table_name= ID | ADD ( COLUMN )? column_def ) ;
    public final SqlParser.alter_table_stmt_return alter_table_stmt() throws RecognitionException {
        SqlParser.alter_table_stmt_return retval = new SqlParser.alter_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token database_name=null;
        Token table_name=null;
        Token new_table_name=null;
        Token ALTER388=null;
        Token TABLE389=null;
        Token DOT390=null;
        Token RENAME391=null;
        Token TO392=null;
        Token ADD393=null;
        Token COLUMN394=null;
        SqlParser.column_def_return column_def395 = null;


        Object database_name_tree=null;
        Object table_name_tree=null;
        Object new_table_name_tree=null;
        Object ALTER388_tree=null;
        Object TABLE389_tree=null;
        Object DOT390_tree=null;
        Object RENAME391_tree=null;
        Object TO392_tree=null;
        Object ADD393_tree=null;
        Object COLUMN394_tree=null;

        try {
            // Sql.g:314:17: ( ALTER TABLE (database_name= ID DOT )? table_name= ID ( RENAME TO new_table_name= ID | ADD ( COLUMN )? column_def ) )
            // Sql.g:314:19: ALTER TABLE (database_name= ID DOT )? table_name= ID ( RENAME TO new_table_name= ID | ADD ( COLUMN )? column_def )
            {
            root_0 = (Object)adaptor.nil();

            ALTER388=(Token)match(input,ALTER,FOLLOW_ALTER_in_alter_table_stmt2816); 
            ALTER388_tree = (Object)adaptor.create(ALTER388);
            adaptor.addChild(root_0, ALTER388_tree);

            TABLE389=(Token)match(input,TABLE,FOLLOW_TABLE_in_alter_table_stmt2818); 
            TABLE389_tree = (Object)adaptor.create(TABLE389);
            adaptor.addChild(root_0, TABLE389_tree);

            // Sql.g:314:31: (database_name= ID DOT )?
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
                    // Sql.g:314:32: database_name= ID DOT
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_alter_table_stmt2823); 
                    database_name_tree = (Object)adaptor.create(database_name);
                    adaptor.addChild(root_0, database_name_tree);

                    DOT390=(Token)match(input,DOT,FOLLOW_DOT_in_alter_table_stmt2825); 
                    DOT390_tree = (Object)adaptor.create(DOT390);
                    adaptor.addChild(root_0, DOT390_tree);


                    }
                    break;

            }

            table_name=(Token)match(input,ID,FOLLOW_ID_in_alter_table_stmt2831); 
            table_name_tree = (Object)adaptor.create(table_name);
            adaptor.addChild(root_0, table_name_tree);

            // Sql.g:314:69: ( RENAME TO new_table_name= ID | ADD ( COLUMN )? column_def )
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
                    // Sql.g:314:70: RENAME TO new_table_name= ID
                    {
                    RENAME391=(Token)match(input,RENAME,FOLLOW_RENAME_in_alter_table_stmt2834); 
                    RENAME391_tree = (Object)adaptor.create(RENAME391);
                    adaptor.addChild(root_0, RENAME391_tree);

                    TO392=(Token)match(input,TO,FOLLOW_TO_in_alter_table_stmt2836); 
                    TO392_tree = (Object)adaptor.create(TO392);
                    adaptor.addChild(root_0, TO392_tree);

                    new_table_name=(Token)match(input,ID,FOLLOW_ID_in_alter_table_stmt2840); 
                    new_table_name_tree = (Object)adaptor.create(new_table_name);
                    adaptor.addChild(root_0, new_table_name_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:314:100: ADD ( COLUMN )? column_def
                    {
                    ADD393=(Token)match(input,ADD,FOLLOW_ADD_in_alter_table_stmt2844); 
                    ADD393_tree = (Object)adaptor.create(ADD393);
                    adaptor.addChild(root_0, ADD393_tree);

                    // Sql.g:314:104: ( COLUMN )?
                    int alt144=2;
                    int LA144_0 = input.LA(1);

                    if ( (LA144_0==COLUMN) ) {
                        alt144=1;
                    }
                    switch (alt144) {
                        case 1 :
                            // Sql.g:314:105: COLUMN
                            {
                            COLUMN394=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_alter_table_stmt2847); 
                            COLUMN394_tree = (Object)adaptor.create(COLUMN394);
                            adaptor.addChild(root_0, COLUMN394_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_column_def_in_alter_table_stmt2851);
                    column_def395=column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, column_def395.getTree());

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
    // Sql.g:317:1: create_view_stmt : CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= ID DOT )? view_name= ID AS select_stmt ;
    public final SqlParser.create_view_stmt_return create_view_stmt() throws RecognitionException {
        SqlParser.create_view_stmt_return retval = new SqlParser.create_view_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token database_name=null;
        Token view_name=null;
        Token CREATE396=null;
        Token TEMPORARY397=null;
        Token VIEW398=null;
        Token IF399=null;
        Token NOT400=null;
        Token EXISTS401=null;
        Token DOT402=null;
        Token AS403=null;
        SqlParser.select_stmt_return select_stmt404 = null;


        Object database_name_tree=null;
        Object view_name_tree=null;
        Object CREATE396_tree=null;
        Object TEMPORARY397_tree=null;
        Object VIEW398_tree=null;
        Object IF399_tree=null;
        Object NOT400_tree=null;
        Object EXISTS401_tree=null;
        Object DOT402_tree=null;
        Object AS403_tree=null;

        try {
            // Sql.g:317:17: ( CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= ID DOT )? view_name= ID AS select_stmt )
            // Sql.g:317:19: CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= ID DOT )? view_name= ID AS select_stmt
            {
            root_0 = (Object)adaptor.nil();

            CREATE396=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_view_stmt2860); 
            CREATE396_tree = (Object)adaptor.create(CREATE396);
            adaptor.addChild(root_0, CREATE396_tree);

            // Sql.g:317:26: ( TEMPORARY )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==TEMPORARY) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // Sql.g:317:26: TEMPORARY
                    {
                    TEMPORARY397=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_view_stmt2862); 
                    TEMPORARY397_tree = (Object)adaptor.create(TEMPORARY397);
                    adaptor.addChild(root_0, TEMPORARY397_tree);


                    }
                    break;

            }

            VIEW398=(Token)match(input,VIEW,FOLLOW_VIEW_in_create_view_stmt2865); 
            VIEW398_tree = (Object)adaptor.create(VIEW398);
            adaptor.addChild(root_0, VIEW398_tree);

            // Sql.g:317:42: ( IF NOT EXISTS )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==IF) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // Sql.g:317:43: IF NOT EXISTS
                    {
                    IF399=(Token)match(input,IF,FOLLOW_IF_in_create_view_stmt2868); 
                    IF399_tree = (Object)adaptor.create(IF399);
                    adaptor.addChild(root_0, IF399_tree);

                    NOT400=(Token)match(input,NOT,FOLLOW_NOT_in_create_view_stmt2870); 
                    NOT400_tree = (Object)adaptor.create(NOT400);
                    adaptor.addChild(root_0, NOT400_tree);

                    EXISTS401=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_view_stmt2872); 
                    EXISTS401_tree = (Object)adaptor.create(EXISTS401);
                    adaptor.addChild(root_0, EXISTS401_tree);


                    }
                    break;

            }

            // Sql.g:317:59: (database_name= ID DOT )?
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
                    // Sql.g:317:60: database_name= ID DOT
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_create_view_stmt2879); 
                    database_name_tree = (Object)adaptor.create(database_name);
                    adaptor.addChild(root_0, database_name_tree);

                    DOT402=(Token)match(input,DOT,FOLLOW_DOT_in_create_view_stmt2881); 
                    DOT402_tree = (Object)adaptor.create(DOT402);
                    adaptor.addChild(root_0, DOT402_tree);


                    }
                    break;

            }

            view_name=(Token)match(input,ID,FOLLOW_ID_in_create_view_stmt2887); 
            view_name_tree = (Object)adaptor.create(view_name);
            adaptor.addChild(root_0, view_name_tree);

            AS403=(Token)match(input,AS,FOLLOW_AS_in_create_view_stmt2889); 
            AS403_tree = (Object)adaptor.create(AS403);
            adaptor.addChild(root_0, AS403_tree);

            pushFollow(FOLLOW_select_stmt_in_create_view_stmt2891);
            select_stmt404=select_stmt();

            state._fsp--;

            adaptor.addChild(root_0, select_stmt404.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:320:1: drop_view_stmt : DROP VIEW ( IF EXISTS )? (database_name= ID DOT )? view_name= ID ;
    public final SqlParser.drop_view_stmt_return drop_view_stmt() throws RecognitionException {
        SqlParser.drop_view_stmt_return retval = new SqlParser.drop_view_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token database_name=null;
        Token view_name=null;
        Token DROP405=null;
        Token VIEW406=null;
        Token IF407=null;
        Token EXISTS408=null;
        Token DOT409=null;

        Object database_name_tree=null;
        Object view_name_tree=null;
        Object DROP405_tree=null;
        Object VIEW406_tree=null;
        Object IF407_tree=null;
        Object EXISTS408_tree=null;
        Object DOT409_tree=null;

        try {
            // Sql.g:320:15: ( DROP VIEW ( IF EXISTS )? (database_name= ID DOT )? view_name= ID )
            // Sql.g:320:17: DROP VIEW ( IF EXISTS )? (database_name= ID DOT )? view_name= ID
            {
            root_0 = (Object)adaptor.nil();

            DROP405=(Token)match(input,DROP,FOLLOW_DROP_in_drop_view_stmt2899); 
            DROP405_tree = (Object)adaptor.create(DROP405);
            adaptor.addChild(root_0, DROP405_tree);

            VIEW406=(Token)match(input,VIEW,FOLLOW_VIEW_in_drop_view_stmt2901); 
            VIEW406_tree = (Object)adaptor.create(VIEW406);
            adaptor.addChild(root_0, VIEW406_tree);

            // Sql.g:320:27: ( IF EXISTS )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==IF) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // Sql.g:320:28: IF EXISTS
                    {
                    IF407=(Token)match(input,IF,FOLLOW_IF_in_drop_view_stmt2904); 
                    IF407_tree = (Object)adaptor.create(IF407);
                    adaptor.addChild(root_0, IF407_tree);

                    EXISTS408=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_view_stmt2906); 
                    EXISTS408_tree = (Object)adaptor.create(EXISTS408);
                    adaptor.addChild(root_0, EXISTS408_tree);


                    }
                    break;

            }

            // Sql.g:320:40: (database_name= ID DOT )?
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
                    // Sql.g:320:41: database_name= ID DOT
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_drop_view_stmt2913); 
                    database_name_tree = (Object)adaptor.create(database_name);
                    adaptor.addChild(root_0, database_name_tree);

                    DOT409=(Token)match(input,DOT,FOLLOW_DOT_in_drop_view_stmt2915); 
                    DOT409_tree = (Object)adaptor.create(DOT409);
                    adaptor.addChild(root_0, DOT409_tree);


                    }
                    break;

            }

            view_name=(Token)match(input,ID,FOLLOW_ID_in_drop_view_stmt2921); 
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
    // Sql.g:323:1: create_index_stmt : CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= ID DOT )? index_name= ID ON table_name= ID LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN ;
    public final SqlParser.create_index_stmt_return create_index_stmt() throws RecognitionException {
        SqlParser.create_index_stmt_return retval = new SqlParser.create_index_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token database_name=null;
        Token index_name=null;
        Token table_name=null;
        Token CREATE410=null;
        Token UNIQUE411=null;
        Token INDEX412=null;
        Token IF413=null;
        Token NOT414=null;
        Token EXISTS415=null;
        Token DOT416=null;
        Token ON417=null;
        Token LPAREN418=null;
        Token COMMA419=null;
        Token RPAREN420=null;
        List list_columns=null;
        SqlParser.indexed_column_return columns = null;
         columns = null;
        Object database_name_tree=null;
        Object index_name_tree=null;
        Object table_name_tree=null;
        Object CREATE410_tree=null;
        Object UNIQUE411_tree=null;
        Object INDEX412_tree=null;
        Object IF413_tree=null;
        Object NOT414_tree=null;
        Object EXISTS415_tree=null;
        Object DOT416_tree=null;
        Object ON417_tree=null;
        Object LPAREN418_tree=null;
        Object COMMA419_tree=null;
        Object RPAREN420_tree=null;

        try {
            // Sql.g:323:18: ( CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= ID DOT )? index_name= ID ON table_name= ID LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN )
            // Sql.g:323:20: CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= ID DOT )? index_name= ID ON table_name= ID LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN
            {
            root_0 = (Object)adaptor.nil();

            CREATE410=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_index_stmt2929); 
            CREATE410_tree = (Object)adaptor.create(CREATE410);
            adaptor.addChild(root_0, CREATE410_tree);

            // Sql.g:323:27: ( UNIQUE )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==UNIQUE) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // Sql.g:323:28: UNIQUE
                    {
                    UNIQUE411=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_create_index_stmt2932); 
                    UNIQUE411_tree = (Object)adaptor.create(UNIQUE411);
                    adaptor.addChild(root_0, UNIQUE411_tree);


                    }
                    break;

            }

            INDEX412=(Token)match(input,INDEX,FOLLOW_INDEX_in_create_index_stmt2936); 
            INDEX412_tree = (Object)adaptor.create(INDEX412);
            adaptor.addChild(root_0, INDEX412_tree);

            // Sql.g:323:43: ( IF NOT EXISTS )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==IF) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // Sql.g:323:44: IF NOT EXISTS
                    {
                    IF413=(Token)match(input,IF,FOLLOW_IF_in_create_index_stmt2939); 
                    IF413_tree = (Object)adaptor.create(IF413);
                    adaptor.addChild(root_0, IF413_tree);

                    NOT414=(Token)match(input,NOT,FOLLOW_NOT_in_create_index_stmt2941); 
                    NOT414_tree = (Object)adaptor.create(NOT414);
                    adaptor.addChild(root_0, NOT414_tree);

                    EXISTS415=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_index_stmt2943); 
                    EXISTS415_tree = (Object)adaptor.create(EXISTS415);
                    adaptor.addChild(root_0, EXISTS415_tree);


                    }
                    break;

            }

            // Sql.g:323:60: (database_name= ID DOT )?
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
                    // Sql.g:323:61: database_name= ID DOT
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_create_index_stmt2950); 
                    database_name_tree = (Object)adaptor.create(database_name);
                    adaptor.addChild(root_0, database_name_tree);

                    DOT416=(Token)match(input,DOT,FOLLOW_DOT_in_create_index_stmt2952); 
                    DOT416_tree = (Object)adaptor.create(DOT416);
                    adaptor.addChild(root_0, DOT416_tree);


                    }
                    break;

            }

            index_name=(Token)match(input,ID,FOLLOW_ID_in_create_index_stmt2958); 
            index_name_tree = (Object)adaptor.create(index_name);
            adaptor.addChild(root_0, index_name_tree);

            ON417=(Token)match(input,ON,FOLLOW_ON_in_create_index_stmt2962); 
            ON417_tree = (Object)adaptor.create(ON417);
            adaptor.addChild(root_0, ON417_tree);

            table_name=(Token)match(input,ID,FOLLOW_ID_in_create_index_stmt2966); 
            table_name_tree = (Object)adaptor.create(table_name);
            adaptor.addChild(root_0, table_name_tree);

            LPAREN418=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_index_stmt2968); 
            LPAREN418_tree = (Object)adaptor.create(LPAREN418);
            adaptor.addChild(root_0, LPAREN418_tree);

            pushFollow(FOLLOW_indexed_column_in_create_index_stmt2972);
            columns=indexed_column();

            state._fsp--;

            adaptor.addChild(root_0, columns.getTree());
            if (list_columns==null) list_columns=new ArrayList();
            list_columns.add(columns.getTree());

            // Sql.g:324:51: ( COMMA columns+= indexed_column )*
            loop154:
            do {
                int alt154=2;
                int LA154_0 = input.LA(1);

                if ( (LA154_0==COMMA) ) {
                    alt154=1;
                }


                switch (alt154) {
            	case 1 :
            	    // Sql.g:324:52: COMMA columns+= indexed_column
            	    {
            	    COMMA419=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_index_stmt2975); 
            	    COMMA419_tree = (Object)adaptor.create(COMMA419);
            	    adaptor.addChild(root_0, COMMA419_tree);

            	    pushFollow(FOLLOW_indexed_column_in_create_index_stmt2979);
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

            RPAREN420=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_index_stmt2983); 
            RPAREN420_tree = (Object)adaptor.create(RPAREN420);
            adaptor.addChild(root_0, RPAREN420_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:326:1: indexed_column : column_name= ID ( COLLATE collation_name= ID )? ( ASC | DESC )? ;
    public final SqlParser.indexed_column_return indexed_column() throws RecognitionException {
        SqlParser.indexed_column_return retval = new SqlParser.indexed_column_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token column_name=null;
        Token collation_name=null;
        Token COLLATE421=null;
        Token set422=null;

        Object column_name_tree=null;
        Object collation_name_tree=null;
        Object COLLATE421_tree=null;
        Object set422_tree=null;

        try {
            // Sql.g:326:15: (column_name= ID ( COLLATE collation_name= ID )? ( ASC | DESC )? )
            // Sql.g:326:17: column_name= ID ( COLLATE collation_name= ID )? ( ASC | DESC )?
            {
            root_0 = (Object)adaptor.nil();

            column_name=(Token)match(input,ID,FOLLOW_ID_in_indexed_column2992); 
            column_name_tree = (Object)adaptor.create(column_name);
            adaptor.addChild(root_0, column_name_tree);

            // Sql.g:326:32: ( COLLATE collation_name= ID )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==COLLATE) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // Sql.g:326:33: COLLATE collation_name= ID
                    {
                    COLLATE421=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_indexed_column2995); 
                    COLLATE421_tree = (Object)adaptor.create(COLLATE421);
                    adaptor.addChild(root_0, COLLATE421_tree);

                    collation_name=(Token)match(input,ID,FOLLOW_ID_in_indexed_column2999); 
                    collation_name_tree = (Object)adaptor.create(collation_name);
                    adaptor.addChild(root_0, collation_name_tree);


                    }
                    break;

            }

            // Sql.g:326:61: ( ASC | DESC )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( ((LA156_0>=ASC && LA156_0<=DESC)) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // Sql.g:
                    {
                    set422=(Token)input.LT(1);
                    if ( (input.LA(1)>=ASC && input.LA(1)<=DESC) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set422));
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
    // Sql.g:329:1: drop_index_stmt : DROP INDEX ( IF EXISTS )? (database_name= ID DOT )? index_name= ID ;
    public final SqlParser.drop_index_stmt_return drop_index_stmt() throws RecognitionException {
        SqlParser.drop_index_stmt_return retval = new SqlParser.drop_index_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token database_name=null;
        Token index_name=null;
        Token DROP423=null;
        Token INDEX424=null;
        Token IF425=null;
        Token EXISTS426=null;
        Token DOT427=null;

        Object database_name_tree=null;
        Object index_name_tree=null;
        Object DROP423_tree=null;
        Object INDEX424_tree=null;
        Object IF425_tree=null;
        Object EXISTS426_tree=null;
        Object DOT427_tree=null;

        try {
            // Sql.g:329:16: ( DROP INDEX ( IF EXISTS )? (database_name= ID DOT )? index_name= ID )
            // Sql.g:329:18: DROP INDEX ( IF EXISTS )? (database_name= ID DOT )? index_name= ID
            {
            root_0 = (Object)adaptor.nil();

            DROP423=(Token)match(input,DROP,FOLLOW_DROP_in_drop_index_stmt3018); 
            DROP423_tree = (Object)adaptor.create(DROP423);
            adaptor.addChild(root_0, DROP423_tree);

            INDEX424=(Token)match(input,INDEX,FOLLOW_INDEX_in_drop_index_stmt3020); 
            INDEX424_tree = (Object)adaptor.create(INDEX424);
            adaptor.addChild(root_0, INDEX424_tree);

            // Sql.g:329:29: ( IF EXISTS )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==IF) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // Sql.g:329:30: IF EXISTS
                    {
                    IF425=(Token)match(input,IF,FOLLOW_IF_in_drop_index_stmt3023); 
                    IF425_tree = (Object)adaptor.create(IF425);
                    adaptor.addChild(root_0, IF425_tree);

                    EXISTS426=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_index_stmt3025); 
                    EXISTS426_tree = (Object)adaptor.create(EXISTS426);
                    adaptor.addChild(root_0, EXISTS426_tree);


                    }
                    break;

            }

            // Sql.g:329:42: (database_name= ID DOT )?
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
                    // Sql.g:329:43: database_name= ID DOT
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_drop_index_stmt3032); 
                    database_name_tree = (Object)adaptor.create(database_name);
                    adaptor.addChild(root_0, database_name_tree);

                    DOT427=(Token)match(input,DOT,FOLLOW_DOT_in_drop_index_stmt3034); 
                    DOT427_tree = (Object)adaptor.create(DOT427);
                    adaptor.addChild(root_0, DOT427_tree);


                    }
                    break;

            }

            index_name=(Token)match(input,ID,FOLLOW_ID_in_drop_index_stmt3040); 
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
    // Sql.g:332:1: create_trigger_stmt : CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= ID DOT )? trigger_name= ID ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= ID ( COMMA column_names+= ID )* )? ) ON table_name= ID ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END ;
    public final SqlParser.create_trigger_stmt_return create_trigger_stmt() throws RecognitionException {
        SqlParser.create_trigger_stmt_return retval = new SqlParser.create_trigger_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token database_name=null;
        Token trigger_name=null;
        Token table_name=null;
        Token CREATE428=null;
        Token TEMPORARY429=null;
        Token TRIGGER430=null;
        Token IF431=null;
        Token NOT432=null;
        Token EXISTS433=null;
        Token DOT434=null;
        Token BEFORE435=null;
        Token AFTER436=null;
        Token INSTEAD437=null;
        Token OF438=null;
        Token DELETE439=null;
        Token INSERT440=null;
        Token UPDATE441=null;
        Token OF442=null;
        Token COMMA443=null;
        Token ON444=null;
        Token FOR445=null;
        Token EACH446=null;
        Token ROW447=null;
        Token WHEN448=null;
        Token BEGIN450=null;
        Token SEMI455=null;
        Token END456=null;
        Token column_names=null;
        List list_column_names=null;
        SqlParser.expr_return expr449 = null;

        SqlParser.update_stmt_return update_stmt451 = null;

        SqlParser.insert_stmt_return insert_stmt452 = null;

        SqlParser.delete_stmt_return delete_stmt453 = null;

        SqlParser.select_stmt_return select_stmt454 = null;


        Object database_name_tree=null;
        Object trigger_name_tree=null;
        Object table_name_tree=null;
        Object CREATE428_tree=null;
        Object TEMPORARY429_tree=null;
        Object TRIGGER430_tree=null;
        Object IF431_tree=null;
        Object NOT432_tree=null;
        Object EXISTS433_tree=null;
        Object DOT434_tree=null;
        Object BEFORE435_tree=null;
        Object AFTER436_tree=null;
        Object INSTEAD437_tree=null;
        Object OF438_tree=null;
        Object DELETE439_tree=null;
        Object INSERT440_tree=null;
        Object UPDATE441_tree=null;
        Object OF442_tree=null;
        Object COMMA443_tree=null;
        Object ON444_tree=null;
        Object FOR445_tree=null;
        Object EACH446_tree=null;
        Object ROW447_tree=null;
        Object WHEN448_tree=null;
        Object BEGIN450_tree=null;
        Object SEMI455_tree=null;
        Object END456_tree=null;
        Object column_names_tree=null;

        try {
            // Sql.g:332:20: ( CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= ID DOT )? trigger_name= ID ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= ID ( COMMA column_names+= ID )* )? ) ON table_name= ID ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END )
            // Sql.g:332:22: CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= ID DOT )? trigger_name= ID ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= ID ( COMMA column_names+= ID )* )? ) ON table_name= ID ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END
            {
            root_0 = (Object)adaptor.nil();

            CREATE428=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_trigger_stmt3048); 
            CREATE428_tree = (Object)adaptor.create(CREATE428);
            adaptor.addChild(root_0, CREATE428_tree);

            // Sql.g:332:29: ( TEMPORARY )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==TEMPORARY) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // Sql.g:332:29: TEMPORARY
                    {
                    TEMPORARY429=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_trigger_stmt3050); 
                    TEMPORARY429_tree = (Object)adaptor.create(TEMPORARY429);
                    adaptor.addChild(root_0, TEMPORARY429_tree);


                    }
                    break;

            }

            TRIGGER430=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_create_trigger_stmt3053); 
            TRIGGER430_tree = (Object)adaptor.create(TRIGGER430);
            adaptor.addChild(root_0, TRIGGER430_tree);

            // Sql.g:332:48: ( IF NOT EXISTS )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==IF) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // Sql.g:332:49: IF NOT EXISTS
                    {
                    IF431=(Token)match(input,IF,FOLLOW_IF_in_create_trigger_stmt3056); 
                    IF431_tree = (Object)adaptor.create(IF431);
                    adaptor.addChild(root_0, IF431_tree);

                    NOT432=(Token)match(input,NOT,FOLLOW_NOT_in_create_trigger_stmt3058); 
                    NOT432_tree = (Object)adaptor.create(NOT432);
                    adaptor.addChild(root_0, NOT432_tree);

                    EXISTS433=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_trigger_stmt3060); 
                    EXISTS433_tree = (Object)adaptor.create(EXISTS433);
                    adaptor.addChild(root_0, EXISTS433_tree);


                    }
                    break;

            }

            // Sql.g:332:65: (database_name= ID DOT )?
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
                    // Sql.g:332:66: database_name= ID DOT
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_create_trigger_stmt3067); 
                    database_name_tree = (Object)adaptor.create(database_name);
                    adaptor.addChild(root_0, database_name_tree);

                    DOT434=(Token)match(input,DOT,FOLLOW_DOT_in_create_trigger_stmt3069); 
                    DOT434_tree = (Object)adaptor.create(DOT434);
                    adaptor.addChild(root_0, DOT434_tree);


                    }
                    break;

            }

            trigger_name=(Token)match(input,ID,FOLLOW_ID_in_create_trigger_stmt3075); 
            trigger_name_tree = (Object)adaptor.create(trigger_name);
            adaptor.addChild(root_0, trigger_name_tree);

            // Sql.g:333:3: ( BEFORE | AFTER | INSTEAD OF )?
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
                    // Sql.g:333:4: BEFORE
                    {
                    BEFORE435=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_create_trigger_stmt3080); 
                    BEFORE435_tree = (Object)adaptor.create(BEFORE435);
                    adaptor.addChild(root_0, BEFORE435_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:333:13: AFTER
                    {
                    AFTER436=(Token)match(input,AFTER,FOLLOW_AFTER_in_create_trigger_stmt3084); 
                    AFTER436_tree = (Object)adaptor.create(AFTER436);
                    adaptor.addChild(root_0, AFTER436_tree);


                    }
                    break;
                case 3 :
                    // Sql.g:333:21: INSTEAD OF
                    {
                    INSTEAD437=(Token)match(input,INSTEAD,FOLLOW_INSTEAD_in_create_trigger_stmt3088); 
                    INSTEAD437_tree = (Object)adaptor.create(INSTEAD437);
                    adaptor.addChild(root_0, INSTEAD437_tree);

                    OF438=(Token)match(input,OF,FOLLOW_OF_in_create_trigger_stmt3090); 
                    OF438_tree = (Object)adaptor.create(OF438);
                    adaptor.addChild(root_0, OF438_tree);


                    }
                    break;

            }

            // Sql.g:333:34: ( DELETE | INSERT | UPDATE ( OF column_names+= ID ( COMMA column_names+= ID )* )? )
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
                    // Sql.g:333:35: DELETE
                    {
                    DELETE439=(Token)match(input,DELETE,FOLLOW_DELETE_in_create_trigger_stmt3095); 
                    DELETE439_tree = (Object)adaptor.create(DELETE439);
                    adaptor.addChild(root_0, DELETE439_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:333:44: INSERT
                    {
                    INSERT440=(Token)match(input,INSERT,FOLLOW_INSERT_in_create_trigger_stmt3099); 
                    INSERT440_tree = (Object)adaptor.create(INSERT440);
                    adaptor.addChild(root_0, INSERT440_tree);


                    }
                    break;
                case 3 :
                    // Sql.g:333:53: UPDATE ( OF column_names+= ID ( COMMA column_names+= ID )* )?
                    {
                    UPDATE441=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_create_trigger_stmt3103); 
                    UPDATE441_tree = (Object)adaptor.create(UPDATE441);
                    adaptor.addChild(root_0, UPDATE441_tree);

                    // Sql.g:333:60: ( OF column_names+= ID ( COMMA column_names+= ID )* )?
                    int alt164=2;
                    int LA164_0 = input.LA(1);

                    if ( (LA164_0==OF) ) {
                        alt164=1;
                    }
                    switch (alt164) {
                        case 1 :
                            // Sql.g:333:61: OF column_names+= ID ( COMMA column_names+= ID )*
                            {
                            OF442=(Token)match(input,OF,FOLLOW_OF_in_create_trigger_stmt3106); 
                            OF442_tree = (Object)adaptor.create(OF442);
                            adaptor.addChild(root_0, OF442_tree);

                            column_names=(Token)match(input,ID,FOLLOW_ID_in_create_trigger_stmt3110); 
                            column_names_tree = (Object)adaptor.create(column_names);
                            adaptor.addChild(root_0, column_names_tree);

                            if (list_column_names==null) list_column_names=new ArrayList();
                            list_column_names.add(column_names);

                            // Sql.g:333:81: ( COMMA column_names+= ID )*
                            loop163:
                            do {
                                int alt163=2;
                                int LA163_0 = input.LA(1);

                                if ( (LA163_0==COMMA) ) {
                                    alt163=1;
                                }


                                switch (alt163) {
                            	case 1 :
                            	    // Sql.g:333:82: COMMA column_names+= ID
                            	    {
                            	    COMMA443=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_trigger_stmt3113); 
                            	    COMMA443_tree = (Object)adaptor.create(COMMA443);
                            	    adaptor.addChild(root_0, COMMA443_tree);

                            	    column_names=(Token)match(input,ID,FOLLOW_ID_in_create_trigger_stmt3117); 
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

            ON444=(Token)match(input,ON,FOLLOW_ON_in_create_trigger_stmt3126); 
            ON444_tree = (Object)adaptor.create(ON444);
            adaptor.addChild(root_0, ON444_tree);

            table_name=(Token)match(input,ID,FOLLOW_ID_in_create_trigger_stmt3130); 
            table_name_tree = (Object)adaptor.create(table_name);
            adaptor.addChild(root_0, table_name_tree);

            // Sql.g:334:20: ( FOR EACH ROW )?
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==FOR) ) {
                alt166=1;
            }
            switch (alt166) {
                case 1 :
                    // Sql.g:334:21: FOR EACH ROW
                    {
                    FOR445=(Token)match(input,FOR,FOLLOW_FOR_in_create_trigger_stmt3133); 
                    FOR445_tree = (Object)adaptor.create(FOR445);
                    adaptor.addChild(root_0, FOR445_tree);

                    EACH446=(Token)match(input,EACH,FOLLOW_EACH_in_create_trigger_stmt3135); 
                    EACH446_tree = (Object)adaptor.create(EACH446);
                    adaptor.addChild(root_0, EACH446_tree);

                    ROW447=(Token)match(input,ROW,FOLLOW_ROW_in_create_trigger_stmt3137); 
                    ROW447_tree = (Object)adaptor.create(ROW447);
                    adaptor.addChild(root_0, ROW447_tree);


                    }
                    break;

            }

            // Sql.g:334:36: ( WHEN expr )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==WHEN) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // Sql.g:334:37: WHEN expr
                    {
                    WHEN448=(Token)match(input,WHEN,FOLLOW_WHEN_in_create_trigger_stmt3142); 
                    WHEN448_tree = (Object)adaptor.create(WHEN448);
                    adaptor.addChild(root_0, WHEN448_tree);

                    pushFollow(FOLLOW_expr_in_create_trigger_stmt3144);
                    expr449=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr449.getTree());

                    }
                    break;

            }

            BEGIN450=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_create_trigger_stmt3150); 
            BEGIN450_tree = (Object)adaptor.create(BEGIN450);
            adaptor.addChild(root_0, BEGIN450_tree);

            // Sql.g:335:9: ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+
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
            	    // Sql.g:335:10: ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI
            	    {
            	    // Sql.g:335:10: ( update_stmt | insert_stmt | delete_stmt | select_stmt )
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
            	            // Sql.g:335:11: update_stmt
            	            {
            	            pushFollow(FOLLOW_update_stmt_in_create_trigger_stmt3154);
            	            update_stmt451=update_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, update_stmt451.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // Sql.g:335:25: insert_stmt
            	            {
            	            pushFollow(FOLLOW_insert_stmt_in_create_trigger_stmt3158);
            	            insert_stmt452=insert_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, insert_stmt452.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // Sql.g:335:39: delete_stmt
            	            {
            	            pushFollow(FOLLOW_delete_stmt_in_create_trigger_stmt3162);
            	            delete_stmt453=delete_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, delete_stmt453.getTree());

            	            }
            	            break;
            	        case 4 :
            	            // Sql.g:335:53: select_stmt
            	            {
            	            pushFollow(FOLLOW_select_stmt_in_create_trigger_stmt3166);
            	            select_stmt454=select_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, select_stmt454.getTree());

            	            }
            	            break;

            	    }

            	    SEMI455=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_trigger_stmt3169); 
            	    SEMI455_tree = (Object)adaptor.create(SEMI455);
            	    adaptor.addChild(root_0, SEMI455_tree);


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

            END456=(Token)match(input,END,FOLLOW_END_in_create_trigger_stmt3173); 
            END456_tree = (Object)adaptor.create(END456);
            adaptor.addChild(root_0, END456_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:338:1: drop_trigger_stmt : DROP TRIGGER ( IF EXISTS )? (database_name= ID DOT )? trigger_name= ID ;
    public final SqlParser.drop_trigger_stmt_return drop_trigger_stmt() throws RecognitionException {
        SqlParser.drop_trigger_stmt_return retval = new SqlParser.drop_trigger_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token database_name=null;
        Token trigger_name=null;
        Token DROP457=null;
        Token TRIGGER458=null;
        Token IF459=null;
        Token EXISTS460=null;
        Token DOT461=null;

        Object database_name_tree=null;
        Object trigger_name_tree=null;
        Object DROP457_tree=null;
        Object TRIGGER458_tree=null;
        Object IF459_tree=null;
        Object EXISTS460_tree=null;
        Object DOT461_tree=null;

        try {
            // Sql.g:338:18: ( DROP TRIGGER ( IF EXISTS )? (database_name= ID DOT )? trigger_name= ID )
            // Sql.g:338:20: DROP TRIGGER ( IF EXISTS )? (database_name= ID DOT )? trigger_name= ID
            {
            root_0 = (Object)adaptor.nil();

            DROP457=(Token)match(input,DROP,FOLLOW_DROP_in_drop_trigger_stmt3181); 
            DROP457_tree = (Object)adaptor.create(DROP457);
            adaptor.addChild(root_0, DROP457_tree);

            TRIGGER458=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_drop_trigger_stmt3183); 
            TRIGGER458_tree = (Object)adaptor.create(TRIGGER458);
            adaptor.addChild(root_0, TRIGGER458_tree);

            // Sql.g:338:33: ( IF EXISTS )?
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==IF) ) {
                alt170=1;
            }
            switch (alt170) {
                case 1 :
                    // Sql.g:338:34: IF EXISTS
                    {
                    IF459=(Token)match(input,IF,FOLLOW_IF_in_drop_trigger_stmt3186); 
                    IF459_tree = (Object)adaptor.create(IF459);
                    adaptor.addChild(root_0, IF459_tree);

                    EXISTS460=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_trigger_stmt3188); 
                    EXISTS460_tree = (Object)adaptor.create(EXISTS460);
                    adaptor.addChild(root_0, EXISTS460_tree);


                    }
                    break;

            }

            // Sql.g:338:46: (database_name= ID DOT )?
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
                    // Sql.g:338:47: database_name= ID DOT
                    {
                    database_name=(Token)match(input,ID,FOLLOW_ID_in_drop_trigger_stmt3195); 
                    database_name_tree = (Object)adaptor.create(database_name);
                    adaptor.addChild(root_0, database_name_tree);

                    DOT461=(Token)match(input,DOT,FOLLOW_DOT_in_drop_trigger_stmt3197); 
                    DOT461_tree = (Object)adaptor.create(DOT461);
                    adaptor.addChild(root_0, DOT461_tree);


                    }
                    break;

            }

            trigger_name=(Token)match(input,ID,FOLLOW_ID_in_drop_trigger_stmt3203); 
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
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA117 dfa117 = new DFA117(this);
    protected DFA118 dfa118 = new DFA118(this);
    protected DFA121 dfa121 = new DFA121(this);
    protected DFA122 dfa122 = new DFA122(this);
    protected DFA123 dfa123 = new DFA123(this);
    protected DFA124 dfa124 = new DFA124(this);
    protected DFA125 dfa125 = new DFA125(this);
    protected DFA135 dfa135 = new DFA135(this);
    protected DFA136 dfa136 = new DFA136(this);
    protected DFA140 dfa140 = new DFA140(this);
    static final String DFA1_eotS =
        "\26\uffff";
    static final String DFA1_eofS =
        "\1\1\25\uffff";
    static final String DFA1_minS =
        "\1\17\25\uffff";
    static final String DFA1_maxS =
        "\1\u0083\25\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\2\1\1\23\uffff";
    static final String DFA1_specialS =
        "\26\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\42\uffff\1\2\13\uffff\1\2\2\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\5\2\11\uffff\1\2\14\uffff\1\2\3\uffff\1\2\1\uffff\2\2\4\uffff"+
            "\1\2\1\uffff\2\2\1\uffff\1\2\20\uffff\2\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
        "\1\17\24\uffff";
    static final String DFA3_maxS =
        "\1\u0083\24\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\22\uffff";
    static final String DFA3_specialS =
        "\25\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\42\uffff\1\2\13\uffff\1\2\2\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\5\2\11\uffff\1\2\14\uffff\1\2\3\uffff\1\2\1\uffff\2\2\4\uffff"+
            "\1\2\1\uffff\2\2\1\uffff\1\2\20\uffff\2\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
        "\1\20\24\uffff";
    static final String DFA2_maxS =
        "\1\u0083\24\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\22\uffff";
    static final String DFA2_specialS =
        "\25\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\41\uffff\1\2\13\uffff\1\2\2\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\5\2\11\uffff\1\2\14\uffff\1\2\3\uffff\1\2\1\uffff\2\2\4\uffff"+
            "\1\2\1\uffff\2\2\1\uffff\1\2\20\uffff\2\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
        "\1\62\20\uffff\1\162\1\163\4\uffff\1\163\12\uffff";
    static final String DFA4_maxS =
        "\1\u0083\20\uffff\2\u0089\4\uffff\1\u0089\12\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\11\1\12\1\13"+
        "\1\14\1\15\1\16\1\17\2\uffff\1\23\1\20\1\26\2\uffff\1\24\1\21\1"+
        "\30\1\22\1\25\1\27\1\31\3\uffff";
    static final String DFA4_specialS =
        "\42\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\15\13\uffff\1\16\2\uffff\1\1\1\uffff\1\2\1\uffff\1\3\1\4"+
            "\1\5\1\6\1\10\11\uffff\1\7\14\uffff\1\10\3\uffff\1\12\1\uffff"+
            "\1\13\1\14\4\uffff\1\15\1\uffff\1\17\1\20\1\uffff\1\21\20\uffff"+
            "\1\22\1\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\24\1\31\1\27\5\uffff\1\25\14\uffff\1\30\1\25\1\32",
            "\1\33\23\uffff\1\34\1\35\1\36",
            "",
            "",
            "",
            "",
            "\1\31\23\uffff\1\30\1\uffff\1\32",
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
        "\12\uffff";
    static final String DFA5_eofS =
        "\12\uffff";
    static final String DFA5_minS =
        "\1\23\1\22\10\uffff";
    static final String DFA5_maxS =
        "\1\23\1\145\10\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\1\1\2\6\uffff";
    static final String DFA5_specialS =
        "\12\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\3\1\uffff\1\2\1\3\1\uffff\1\3\64\uffff\2\3\7\uffff\1\3\17"+
            "\uffff\1\3",
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
            return "81:23: (database_name= ID DOT )?";
        }
    }
    static final String DFA7_eotS =
        "\35\uffff";
    static final String DFA7_eofS =
        "\35\uffff";
    static final String DFA7_minS =
        "\1\22\34\uffff";
    static final String DFA7_maxS =
        "\1\147\34\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\2\32\uffff\1\1";
    static final String DFA7_specialS =
        "\35\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\1\4\uffff\1\34\10\uffff\2\1\11\uffff\1\1\2\uffff\4\1\27\uffff"+
            "\4\1\1\uffff\1\1\1\uffff\2\1\1\uffff\12\1\11\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
        "\36\uffff";
    static final String DFA8_eofS =
        "\36\uffff";
    static final String DFA8_minS =
        "\1\22\35\uffff";
    static final String DFA8_maxS =
        "\1\147\35\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\2\33\uffff\1\1";
    static final String DFA8_specialS =
        "\36\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\1\4\uffff\1\1\1\35\7\uffff\2\1\11\uffff\1\1\2\uffff\4\1\27"+
            "\uffff\4\1\1\uffff\1\1\1\uffff\2\1\1\uffff\12\1\11\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
        "\42\uffff";
    static final String DFA19_eofS =
        "\42\uffff";
    static final String DFA19_minS =
        "\2\23\40\uffff";
    static final String DFA19_maxS =
        "\2\u00c4\40\uffff";
    static final String DFA19_acceptS =
        "\2\uffff\1\1\13\uffff\1\2\1\3\1\4\2\uffff\1\5\16\uffff";
    static final String DFA19_specialS =
        "\42\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\2\3\uffff\1\1\2\uffff\4\16\1\uffff\1\17\1\2\2\uffff\3\20"+
            "\1\2\1\23\3\uffff\1\2\1\uffff\2\2\4\uffff\7\2\2\uffff\1\2\176"+
            "\uffff\2\2\3\uffff\5\2",
            "\1\2\6\uffff\4\16\1\uffff\1\17\1\2\5\uffff\1\2\1\23\3\uffff"+
            "\1\2\1\uffff\2\2\4\uffff\7\2\2\uffff\1\2\u0084\uffff\4\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "87:1: and_subexpr : ( eq_subexpr ( ( '=' | '==' | '!=' | '<>' ) eq_subexpr )* | ( NOT )? ( LIKE | GLOB | REGEXP | MATCH ) eq_subexpr ( ESCAPE eq_subexpr )? | ( NOT )? IN ( LPAREN ( select_stmt | expr ( COMMA expr )* )? RPAREN | (db_name= ID DOT )? table_name= ID ) | ( ISNULL | NOTNULL | IS NULL | IS NOT NULL ) | ( NOT )? BETWEEN eq_subexpr AND eq_subexpr );";
        }
    }
    static final String DFA9_eotS =
        "\37\uffff";
    static final String DFA9_eofS =
        "\37\uffff";
    static final String DFA9_minS =
        "\1\22\36\uffff";
    static final String DFA9_maxS =
        "\1\u00b2\36\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\2\34\uffff\1\1";
    static final String DFA9_specialS =
        "\37\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\1\4\uffff\2\1\7\uffff\2\1\11\uffff\1\1\2\uffff\4\1\17\uffff"+
            "\1\36\7\uffff\4\1\1\uffff\1\1\1\uffff\2\1\1\uffff\12\1\11\uffff"+
            "\1\1\110\uffff\3\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 88:3: ( ( '=' | '==' | '!=' | '<>' ) eq_subexpr )*";
        }
    }
    static final String DFA11_eotS =
        "\37\uffff";
    static final String DFA11_eofS =
        "\37\uffff";
    static final String DFA11_minS =
        "\1\22\36\uffff";
    static final String DFA11_maxS =
        "\1\147\36\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\34\uffff";
    static final String DFA11_specialS =
        "\37\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\2\4\uffff\2\2\4\uffff\1\1\2\uffff\2\2\11\uffff\1\2\2\uffff"+
            "\4\2\27\uffff\4\2\1\uffff\1\2\1\uffff\2\2\1\uffff\12\2\11\uffff"+
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
        "\26\uffff";
    static final String DFA14_eofS =
        "\26\uffff";
    static final String DFA14_minS =
        "\1\23\25\uffff";
    static final String DFA14_maxS =
        "\1\u00c4\25\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\22\uffff\1\3";
    static final String DFA14_specialS =
        "\26\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\2\3\uffff\1\2\2\uffff\4\2\1\uffff\2\2\1\uffff\1\25\5\2\3"+
            "\uffff\1\2\1\uffff\2\2\4\uffff\7\2\2\uffff\1\2\26\uffff\1\1"+
            "\147\uffff\2\2\3\uffff\5\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
        "\40\uffff";
    static final String DFA15_eofS =
        "\40\uffff";
    static final String DFA15_minS =
        "\1\23\1\22\36\uffff";
    static final String DFA15_maxS =
        "\1\23\1\147\36\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\1\1\2\34\uffff";
    static final String DFA15_specialS =
        "\40\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1",
            "\2\3\1\2\3\uffff\2\3\7\uffff\2\3\11\uffff\1\3\2\uffff\4\3\27"+
            "\uffff\4\3\1\uffff\1\3\1\uffff\2\3\1\uffff\12\3\11\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "90:68: (db_name= ID DOT )?";
        }
    }
    static final String DFA20_eotS =
        "\41\uffff";
    static final String DFA20_eofS =
        "\41\uffff";
    static final String DFA20_minS =
        "\1\22\40\uffff";
    static final String DFA20_maxS =
        "\1\u00b6\40\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\2\36\uffff\1\1";
    static final String DFA20_specialS =
        "\41\uffff}>";
    static final String[] DFA20_transitionS = {
            "\2\1\4\uffff\2\1\4\uffff\1\1\2\uffff\2\1\11\uffff\1\1\2\uffff"+
            "\4\1\17\uffff\1\1\7\uffff\4\1\1\uffff\1\1\1\uffff\2\1\1\uffff"+
            "\12\1\11\uffff\1\1\110\uffff\3\1\4\40",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 94:25: ( ( '<' | '<=' | '>' | '>=' ) neq_subexpr )*";
        }
    }
    static final String DFA21_eotS =
        "\42\uffff";
    static final String DFA21_eofS =
        "\42\uffff";
    static final String DFA21_minS =
        "\1\22\41\uffff";
    static final String DFA21_maxS =
        "\1\u00ba\41\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\2\37\uffff\1\1";
    static final String DFA21_specialS =
        "\42\uffff}>";
    static final String[] DFA21_transitionS = {
            "\2\1\4\uffff\2\1\4\uffff\1\1\2\uffff\2\1\11\uffff\1\1\2\uffff"+
            "\4\1\17\uffff\1\1\7\uffff\4\1\1\uffff\1\1\1\uffff\2\1\1\uffff"+
            "\12\1\11\uffff\1\1\110\uffff\7\1\4\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 96:26: ( ( '<<' | '>>' | '&' | '|' ) bit_subexpr )*";
        }
    }
    static final String DFA22_eotS =
        "\43\uffff";
    static final String DFA22_eofS =
        "\43\uffff";
    static final String DFA22_minS =
        "\1\22\42\uffff";
    static final String DFA22_maxS =
        "\1\u00bc\42\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\2\40\uffff\1\1";
    static final String DFA22_specialS =
        "\43\uffff}>";
    static final String[] DFA22_transitionS = {
            "\2\1\4\uffff\2\1\4\uffff\1\1\2\uffff\2\1\11\uffff\1\1\2\uffff"+
            "\4\1\17\uffff\1\1\7\uffff\4\1\1\uffff\1\1\1\uffff\2\1\1\uffff"+
            "\12\1\11\uffff\1\1\110\uffff\13\1\2\42",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 98:26: ( ( '+' | '-' ) add_subexpr )*";
        }
    }
    static final String DFA23_eotS =
        "\44\uffff";
    static final String DFA23_eofS =
        "\44\uffff";
    static final String DFA23_minS =
        "\1\22\43\uffff";
    static final String DFA23_maxS =
        "\1\u00be\43\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\2\41\uffff\1\1";
    static final String DFA23_specialS =
        "\44\uffff}>";
    static final String[] DFA23_transitionS = {
            "\2\1\4\uffff\2\1\4\uffff\1\1\2\uffff\2\1\7\uffff\1\43\1\uffff"+
            "\1\1\2\uffff\4\1\17\uffff\1\1\7\uffff\4\1\1\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\12\1\11\uffff\1\1\110\uffff\15\1\2\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 100:26: ( ( '*' | '/' | '%' ) mul_subexpr )*";
        }
    }
    static final String DFA24_eotS =
        "\45\uffff";
    static final String DFA24_eofS =
        "\45\uffff";
    static final String DFA24_minS =
        "\1\22\44\uffff";
    static final String DFA24_maxS =
        "\1\u00bf\44\uffff";
    static final String DFA24_acceptS =
        "\1\uffff\1\2\42\uffff\1\1";
    static final String DFA24_specialS =
        "\45\uffff}>";
    static final String[] DFA24_transitionS = {
            "\2\1\4\uffff\2\1\4\uffff\1\1\2\uffff\2\1\7\uffff\1\1\1\uffff"+
            "\1\1\2\uffff\4\1\17\uffff\1\1\7\uffff\4\1\1\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\12\1\11\uffff\1\1\110\uffff\17\1\1\44",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 102:26: ( '||' con_subexpr )*";
        }
    }
    static final String DFA25_eotS =
        "\15\uffff";
    static final String DFA25_eofS =
        "\15\uffff";
    static final String DFA25_minS =
        "\1\23\14\uffff";
    static final String DFA25_maxS =
        "\1\u00c4\14\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\1\1\2\12\uffff";
    static final String DFA25_specialS =
        "\15\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\2\3\uffff\1\1\10\uffff\1\2\5\uffff\1\2\4\uffff\1\2\1\uffff"+
            "\2\2\4\uffff\7\2\2\uffff\1\2\176\uffff\2\1\3\uffff\1\1\4\2",
            "",
            "",
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
            return "104:14: ( '-' | '+' | '~' | NOT )?";
        }
    }
    static final String DFA26_eotS =
        "\46\uffff";
    static final String DFA26_eofS =
        "\46\uffff";
    static final String DFA26_minS =
        "\1\22\45\uffff";
    static final String DFA26_maxS =
        "\1\u00bf\45\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\1\1\2\43\uffff";
    static final String DFA26_specialS =
        "\46\uffff}>";
    static final String[] DFA26_transitionS = {
            "\2\2\4\uffff\2\2\4\uffff\1\2\2\uffff\2\2\5\uffff\1\1\1\uffff"+
            "\1\2\1\uffff\1\2\2\uffff\4\2\17\uffff\1\2\7\uffff\4\2\1\uffff"+
            "\1\2\1\uffff\2\2\1\uffff\12\2\11\uffff\1\2\110\uffff\20\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
        "\107\uffff";
    static final String DFA36_eofS =
        "\107\uffff";
    static final String DFA36_minS =
        "\1\23\5\uffff\1\22\1\23\77\uffff";
    static final String DFA36_maxS =
        "\1\u00c4\5\uffff\1\u00bf\1\u00c4\77\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\1\1\1\2\5\uffff\1\6\1\7\1\10\1\11\1\3\1\4\46\uffff\1\5"+
        "\22\uffff";
    static final String DFA36_specialS =
        "\107\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\6\14\uffff\1\7\5\uffff\1\1\4\uffff\1\10\1\uffff\1\11\1\12"+
            "\4\uffff\7\1\2\uffff\1\13\u0084\uffff\4\2",
            "",
            "",
            "",
            "",
            "",
            "\3\14\3\uffff\2\14\4\uffff\1\14\1\uffff\1\15\2\14\5\uffff\1"+
            "\14\1\uffff\1\14\1\uffff\1\14\2\uffff\4\14\17\uffff\1\14\7\uffff"+
            "\4\14\1\uffff\1\14\1\uffff\2\14\1\uffff\12\14\11\uffff\1\14"+
            "\110\uffff\20\14",
            "\1\64\3\uffff\1\64\2\uffff\4\64\1\uffff\2\64\2\uffff\5\64\3"+
            "\uffff\1\64\1\uffff\2\64\4\uffff\7\64\2\uffff\1\64\26\uffff"+
            "\1\11\147\uffff\2\64\3\uffff\5\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "108:1: atom_expr : ( literal_value | bind_parameter | ( (database_name= ID DOT )? table_name= ID DOT )? column_name= ID | function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN | LPAREN expr RPAREN -> expr | CAST LPAREN expr AS type_name RPAREN | ( EXISTS )? LPAREN select_stmt RPAREN | CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END | raise_function );";
        }
    }
    static final String DFA28_eotS =
        "\50\uffff";
    static final String DFA28_eofS =
        "\50\uffff";
    static final String DFA28_minS =
        "\1\23\1\22\46\uffff";
    static final String DFA28_maxS =
        "\1\23\1\u00bf\46\uffff";
    static final String DFA28_acceptS =
        "\2\uffff\1\1\1\2\44\uffff";
    static final String DFA28_specialS =
        "\50\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\1",
            "\2\3\1\2\3\uffff\2\3\4\uffff\1\3\2\uffff\2\3\5\uffff\1\3\1"+
            "\uffff\1\3\1\uffff\1\3\2\uffff\4\3\17\uffff\1\3\7\uffff\4\3"+
            "\1\uffff\1\3\1\uffff\2\3\1\uffff\12\3\11\uffff\1\3\110\uffff"+
            "\20\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "111:5: ( (database_name= ID DOT )? table_name= ID DOT )?";
        }
    }
    static final String DFA27_eotS =
        "\52\uffff";
    static final String DFA27_eofS =
        "\52\uffff";
    static final String DFA27_minS =
        "\1\23\1\24\1\23\1\22\46\uffff";
    static final String DFA27_maxS =
        "\1\23\1\24\1\23\1\u00bf\46\uffff";
    static final String DFA27_acceptS =
        "\4\uffff\1\1\1\2\44\uffff";
    static final String DFA27_specialS =
        "\52\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\2\5\1\4\3\uffff\2\5\4\uffff\1\5\2\uffff\2\5\5\uffff\1\5\1"+
            "\uffff\1\5\1\uffff\1\5\2\uffff\4\5\17\uffff\1\5\7\uffff\4\5"+
            "\1\uffff\1\5\1\uffff\2\5\1\uffff\12\5\11\uffff\1\5\110\uffff"+
            "\20\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "111:6: (database_name= ID DOT )?";
        }
    }
    static final String DFA31_eotS =
        "\27\uffff";
    static final String DFA31_eofS =
        "\27\uffff";
    static final String DFA31_minS =
        "\1\23\26\uffff";
    static final String DFA31_maxS =
        "\1\u00c4\26\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\23\uffff\1\2\1\3";
    static final String DFA31_specialS =
        "\27\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1\3\uffff\1\1\2\uffff\4\1\1\uffff\2\1\1\uffff\1\26\5\1\1"+
            "\uffff\1\1\1\25\1\1\1\uffff\2\1\4\uffff\7\1\2\uffff\1\1\176"+
            "\uffff\2\1\3\uffff\5\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
        "\25\uffff";
    static final String DFA29_eofS =
        "\25\uffff";
    static final String DFA29_minS =
        "\1\23\24\uffff";
    static final String DFA29_maxS =
        "\1\u00c4\24\uffff";
    static final String DFA29_acceptS =
        "\1\uffff\1\1\1\2\22\uffff";
    static final String DFA29_specialS =
        "\25\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\2\3\uffff\1\2\2\uffff\4\2\1\uffff\2\2\2\uffff\5\2\1\uffff"+
            "\1\1\1\uffff\1\2\1\uffff\2\2\4\uffff\7\2\2\uffff\1\2\176\uffff"+
            "\2\2\3\uffff\5\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
        "\25\uffff";
    static final String DFA33_eofS =
        "\25\uffff";
    static final String DFA33_minS =
        "\1\23\24\uffff";
    static final String DFA33_maxS =
        "\1\u00c4\24\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\22\uffff\1\2";
    static final String DFA33_specialS =
        "\25\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\1\3\uffff\1\1\2\uffff\4\1\1\uffff\2\1\2\uffff\5\1\3\uffff"+
            "\1\1\1\uffff\2\1\1\24\3\uffff\7\1\2\uffff\1\1\176\uffff\2\1"+
            "\3\uffff\5\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
        "\53\uffff";
    static final String DFA37_eofS =
        "\53\uffff";
    static final String DFA37_minS =
        "\1\u00c1\1\22\51\uffff";
    static final String DFA37_maxS =
        "\1\u00c4\1\u00bf\51\uffff";
    static final String DFA37_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\2\1\1\44\uffff";
    static final String DFA37_specialS =
        "\53\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\1\1\2\1\3\1\4",
            "\2\6\4\uffff\2\6\4\uffff\1\6\2\uffff\2\6\5\uffff\1\6\1\uffff"+
            "\1\6\1\uffff\1\6\2\uffff\4\6\1\5\16\uffff\1\6\7\uffff\4\6\1"+
            "\uffff\1\6\1\uffff\2\6\1\uffff\12\6\11\uffff\1\6\110\uffff\20"+
            "\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "123:1: bind_parameter : ( '?' | '?' number= INTEGER | ':' name= ID | '@' name= ID | '$' name= TCL_ID );";
        }
    }
    static final String DFA38_eotS =
        "\16\uffff";
    static final String DFA38_eofS =
        "\16\uffff";
    static final String DFA38_minS =
        "\1\22\15\uffff";
    static final String DFA38_maxS =
        "\1\175\15\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\2\13\uffff\1\1";
    static final String DFA38_specialS =
        "\16\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\1\1\15\3\uffff\1\1\10\uffff\3\1\5\uffff\1\1\72\uffff\1\1"+
            "\22\uffff\2\1\2\uffff\2\1\1\uffff\1\1",
            "",
            "",
            "",
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
            return "()+ loopback of 130:12: ( ID )+";
        }
    }
    static final String DFA40_eotS =
        "\15\uffff";
    static final String DFA40_eofS =
        "\15\uffff";
    static final String DFA40_minS =
        "\1\22\14\uffff";
    static final String DFA40_maxS =
        "\1\175\14\uffff";
    static final String DFA40_acceptS =
        "\1\uffff\1\1\1\2\12\uffff";
    static final String DFA40_specialS =
        "\15\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\2\4\uffff\1\2\10\uffff\1\1\2\2\5\uffff\1\2\72\uffff\1\2\22"+
            "\uffff\2\2\2\uffff\2\2\1\uffff\1\2",
            "",
            "",
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
            return "130:16: ( LPAREN n1= signed_number ( COMMA n2= signed_number )? RPAREN )?";
        }
    }
    static final String DFA49_eotS =
        "\14\uffff";
    static final String DFA49_eofS =
        "\14\uffff";
    static final String DFA49_minS =
        "\1\22\13\uffff";
    static final String DFA49_maxS =
        "\1\127\13\uffff";
    static final String DFA49_acceptS =
        "\1\uffff\1\1\1\2\1\3\10\uffff";
    static final String DFA49_specialS =
        "\14\uffff}>";
    static final String[] DFA49_transitionS = {
            "\1\3\16\uffff\2\3\47\uffff\1\1\1\2\2\3\1\uffff\1\3\1\uffff\2"+
            "\3\4\uffff\1\3",
            "",
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

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "160:82: ( ASC | DESC )?";
        }
    }
    static final String DFA61_eotS =
        "\27\uffff";
    static final String DFA61_eofS =
        "\27\uffff";
    static final String DFA61_minS =
        "\1\23\26\uffff";
    static final String DFA61_maxS =
        "\1\u00c4\26\uffff";
    static final String DFA61_acceptS =
        "\1\uffff\1\1\1\2\1\3\23\uffff";
    static final String DFA61_specialS =
        "\27\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\3\3\uffff\1\3\2\uffff\4\3\1\uffff\2\3\2\uffff\5\3\1\uffff"+
            "\1\2\2\3\1\uffff\2\3\4\uffff\7\3\2\uffff\1\3\23\uffff\1\1\152"+
            "\uffff\2\3\3\uffff\5\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "181:10: ( ALL | DISTINCT )?";
        }
    }
    static final String DFA62_eotS =
        "\14\uffff";
    static final String DFA62_eofS =
        "\14\uffff";
    static final String DFA62_minS =
        "\1\22\13\uffff";
    static final String DFA62_maxS =
        "\1\126\13\uffff";
    static final String DFA62_acceptS =
        "\1\uffff\1\2\11\uffff\1\1";
    static final String DFA62_specialS =
        "\14\uffff}>";
    static final String[] DFA62_transitionS = {
            "\1\1\16\uffff\1\13\1\1\51\uffff\2\1\1\uffff\1\1\1\uffff\2\1"+
            "\1\uffff\3\1",
            "",
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
            return "()* loopback of 181:42: ( COMMA result_column )*";
        }
    }
    static final String DFA63_eotS =
        "\13\uffff";
    static final String DFA63_eofS =
        "\13\uffff";
    static final String DFA63_minS =
        "\1\22\12\uffff";
    static final String DFA63_maxS =
        "\1\126\12\uffff";
    static final String DFA63_acceptS =
        "\1\uffff\1\1\1\2\10\uffff";
    static final String DFA63_specialS =
        "\13\uffff}>";
    static final String[] DFA63_transitionS = {
            "\1\2\17\uffff\1\2\51\uffff\2\2\1\uffff\1\2\1\uffff\2\2\1\uffff"+
            "\1\1\2\2",
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
            return "181:65: ( FROM join_source )?";
        }
    }
    static final String DFA64_eotS =
        "\12\uffff";
    static final String DFA64_eofS =
        "\12\uffff";
    static final String DFA64_minS =
        "\1\22\11\uffff";
    static final String DFA64_maxS =
        "\1\126\11\uffff";
    static final String DFA64_acceptS =
        "\1\uffff\1\1\1\2\7\uffff";
    static final String DFA64_specialS =
        "\12\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\2\17\uffff\1\2\51\uffff\2\2\1\uffff\1\2\1\uffff\2\2\2\uffff"+
            "\1\1\1\2",
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
            return "181:85: ( WHERE where_expr= expr )?";
        }
    }
    static final String DFA65_eotS =
        "\12\uffff";
    static final String DFA65_eofS =
        "\12\uffff";
    static final String DFA65_minS =
        "\1\22\11\uffff";
    static final String DFA65_maxS =
        "\1\127\11\uffff";
    static final String DFA65_acceptS =
        "\1\uffff\1\2\7\uffff\1\1";
    static final String DFA65_specialS =
        "\12\uffff}>";
    static final String[] DFA65_transitionS = {
            "\1\1\16\uffff\1\11\1\1\51\uffff\2\1\1\uffff\1\1\1\uffff\2\1"+
            "\4\uffff\1\1",
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
            return "()* loopback of 182:28: ( COMMA ordering_term )*";
        }
    }
    static final String DFA70_eotS =
        "\57\uffff";
    static final String DFA70_eofS =
        "\57\uffff";
    static final String DFA70_minS =
        "\1\23\1\uffff\1\22\22\uffff\1\23\31\uffff";
    static final String DFA70_maxS =
        "\1\u00c4\1\uffff\1\u00bf\22\uffff\1\52\31\uffff";
    static final String DFA70_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\51\uffff\1\2\1\uffff";
    static final String DFA70_specialS =
        "\57\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\2\3\uffff\1\3\2\uffff\4\3\1\uffff\2\3\2\uffff\5\3\2\uffff"+
            "\1\1\1\3\1\uffff\2\3\4\uffff\7\3\2\uffff\1\3\176\uffff\2\3\3"+
            "\uffff\5\3",
            "",
            "\2\3\1\25\3\uffff\2\3\6\uffff\3\3\5\uffff\1\3\1\uffff\1\3\1"+
            "\uffff\1\3\25\uffff\1\3\11\uffff\2\3\1\uffff\1\3\1\uffff\2\3"+
            "\1\uffff\3\3\131\uffff\20\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\3\26\uffff\1\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "188:1: result_column : ( ASTERISK | table_name= ID DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= ID )? -> ^( ALIAS expr ( $column_alias)? ) );";
        }
    }
    static final String DFA69_eotS =
        "\16\uffff";
    static final String DFA69_eofS =
        "\16\uffff";
    static final String DFA69_minS =
        "\1\22\15\uffff";
    static final String DFA69_maxS =
        "\1\126\15\uffff";
    static final String DFA69_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\12\uffff";
    static final String DFA69_specialS =
        "\16\uffff}>";
    static final String[] DFA69_transitionS = {
            "\1\3\1\1\15\uffff\2\3\11\uffff\1\1\37\uffff\2\3\1\uffff\1\3"+
            "\1\uffff\2\3\1\uffff\3\3",
            "",
            "",
            "",
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
            return "191:10: ( ( AS )? column_alias= ID )?";
        }
    }
    static final String DFA72_eotS =
        "\21\uffff";
    static final String DFA72_eofS =
        "\21\uffff";
    static final String DFA72_minS =
        "\1\22\20\uffff";
    static final String DFA72_maxS =
        "\1\135\20\uffff";
    static final String DFA72_acceptS =
        "\1\uffff\1\2\10\uffff\1\1\6\uffff";
    static final String DFA72_specialS =
        "\21\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\1\16\uffff\1\12\1\1\51\uffff\2\1\1\uffff\1\1\1\uffff\2\1"+
            "\2\uffff\2\1\1\uffff\6\12",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 193:28: ( join_op single_source ( join_constraint )? )*";
        }
    }
    static final String DFA71_eotS =
        "\23\uffff";
    static final String DFA71_eofS =
        "\23\uffff";
    static final String DFA71_minS =
        "\1\22\22\uffff";
    static final String DFA71_maxS =
        "\1\137\22\uffff";
    static final String DFA71_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\17\uffff";
    static final String DFA71_specialS =
        "\23\uffff}>";
    static final String[] DFA71_transitionS = {
            "\1\3\16\uffff\2\3\51\uffff\2\3\1\uffff\1\3\1\uffff\2\3\2\uffff"+
            "\2\3\1\uffff\6\3\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "193:52: ( join_constraint )?";
        }
    }
    static final String DFA73_eotS =
        "\31\uffff";
    static final String DFA73_eofS =
        "\31\uffff";
    static final String DFA73_minS =
        "\1\23\1\22\27\uffff";
    static final String DFA73_maxS =
        "\1\23\1\137\27\uffff";
    static final String DFA73_acceptS =
        "\2\uffff\1\1\1\2\25\uffff";
    static final String DFA73_specialS =
        "\31\uffff}>";
    static final String[] DFA73_transitionS = {
            "\1\1",
            "\2\3\1\2\1\3\1\uffff\1\3\11\uffff\2\3\11\uffff\1\3\37\uffff"+
            "\2\3\1\uffff\1\3\1\uffff\2\3\2\uffff\2\3\1\uffff\10\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "196:5: (database_name= ID DOT )?";
        }
    }
    static final String DFA75_eotS =
        "\27\uffff";
    static final String DFA75_eofS =
        "\27\uffff";
    static final String DFA75_minS =
        "\1\22\26\uffff";
    static final String DFA75_maxS =
        "\1\137\26\uffff";
    static final String DFA75_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\23\uffff";
    static final String DFA75_specialS =
        "\27\uffff}>";
    static final String[] DFA75_transitionS = {
            "\1\3\1\1\1\uffff\1\3\1\uffff\1\3\11\uffff\2\3\11\uffff\1\1\37"+
            "\uffff\2\3\1\uffff\1\3\1\uffff\2\3\2\uffff\2\3\1\uffff\10\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA75_eot = DFA.unpackEncodedString(DFA75_eotS);
    static final short[] DFA75_eof = DFA.unpackEncodedString(DFA75_eofS);
    static final char[] DFA75_min = DFA.unpackEncodedStringToUnsignedChars(DFA75_minS);
    static final char[] DFA75_max = DFA.unpackEncodedStringToUnsignedChars(DFA75_maxS);
    static final short[] DFA75_accept = DFA.unpackEncodedString(DFA75_acceptS);
    static final short[] DFA75_special = DFA.unpackEncodedString(DFA75_specialS);
    static final short[][] DFA75_transition;

    static {
        int numStates = DFA75_transitionS.length;
        DFA75_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA75_transition[i] = DFA.unpackEncodedString(DFA75_transitionS[i]);
        }
    }

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = DFA75_eot;
            this.eof = DFA75_eof;
            this.min = DFA75_min;
            this.max = DFA75_max;
            this.accept = DFA75_accept;
            this.special = DFA75_special;
            this.transition = DFA75_transition;
        }
        public String getDescription() {
            return "196:43: ( ( AS )? table_alias= ID )?";
        }
    }
    static final String DFA76_eotS =
        "\25\uffff";
    static final String DFA76_eofS =
        "\25\uffff";
    static final String DFA76_minS =
        "\1\22\24\uffff";
    static final String DFA76_maxS =
        "\1\137\24\uffff";
    static final String DFA76_acceptS =
        "\1\uffff\1\1\1\2\1\3\21\uffff";
    static final String DFA76_specialS =
        "\25\uffff}>";
    static final String[] DFA76_transitionS = {
            "\1\3\2\uffff\1\1\1\uffff\1\2\11\uffff\2\3\51\uffff\2\3\1\uffff"+
            "\1\3\1\uffff\2\3\2\uffff\2\3\1\uffff\10\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "196:67: ( INDEXED BY index_name= ID | NOT INDEXED )?";
        }
    }
    static final String DFA78_eotS =
        "\25\uffff";
    static final String DFA78_eofS =
        "\25\uffff";
    static final String DFA78_minS =
        "\1\22\24\uffff";
    static final String DFA78_maxS =
        "\1\137\24\uffff";
    static final String DFA78_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\21\uffff";
    static final String DFA78_specialS =
        "\25\uffff}>";
    static final String[] DFA78_transitionS = {
            "\1\3\1\1\15\uffff\2\3\11\uffff\1\1\37\uffff\2\3\1\uffff\1\3"+
            "\1\uffff\2\3\2\uffff\2\3\1\uffff\10\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
    static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
    static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
    static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
    static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
    static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
    static final short[][] DFA78_transition;

    static {
        int numStates = DFA78_transitionS.length;
        DFA78_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = DFA78_eot;
            this.eof = DFA78_eof;
            this.min = DFA78_min;
            this.max = DFA78_max;
            this.accept = DFA78_accept;
            this.special = DFA78_special;
            this.transition = DFA78_transition;
        }
        public String getDescription() {
            return "198:31: ( ( AS )? table_alias= ID )?";
        }
    }
    static final String DFA117_eotS =
        "\15\uffff";
    static final String DFA117_eofS =
        "\15\uffff";
    static final String DFA117_minS =
        "\1\22\14\uffff";
    static final String DFA117_maxS =
        "\1\175\14\uffff";
    static final String DFA117_acceptS =
        "\1\uffff\1\1\1\2\12\uffff";
    static final String DFA117_specialS =
        "\15\uffff}>";
    static final String[] DFA117_transitionS = {
            "\1\2\1\1\3\uffff\1\2\11\uffff\2\2\5\uffff\1\2\72\uffff\1\2\22"+
            "\uffff\2\2\2\uffff\2\2\1\uffff\1\2",
            "",
            "",
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

    static final short[] DFA117_eot = DFA.unpackEncodedString(DFA117_eotS);
    static final short[] DFA117_eof = DFA.unpackEncodedString(DFA117_eofS);
    static final char[] DFA117_min = DFA.unpackEncodedStringToUnsignedChars(DFA117_minS);
    static final char[] DFA117_max = DFA.unpackEncodedStringToUnsignedChars(DFA117_maxS);
    static final short[] DFA117_accept = DFA.unpackEncodedString(DFA117_acceptS);
    static final short[] DFA117_special = DFA.unpackEncodedString(DFA117_specialS);
    static final short[][] DFA117_transition;

    static {
        int numStates = DFA117_transitionS.length;
        DFA117_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA117_transition[i] = DFA.unpackEncodedString(DFA117_transitionS[i]);
        }
    }

    class DFA117 extends DFA {

        public DFA117(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 117;
            this.eot = DFA117_eot;
            this.eof = DFA117_eof;
            this.min = DFA117_min;
            this.max = DFA117_max;
            this.accept = DFA117_accept;
            this.special = DFA117_special;
            this.transition = DFA117_transition;
        }
        public String getDescription() {
            return "258:17: ( type_name )?";
        }
    }
    static final String DFA118_eotS =
        "\14\uffff";
    static final String DFA118_eofS =
        "\14\uffff";
    static final String DFA118_minS =
        "\1\22\13\uffff";
    static final String DFA118_maxS =
        "\1\175\13\uffff";
    static final String DFA118_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\7\uffff";
    static final String DFA118_specialS =
        "\14\uffff}>";
    static final String[] DFA118_transitionS = {
            "\1\1\4\uffff\1\4\11\uffff\2\1\5\uffff\1\4\72\uffff\1\4\22\uffff"+
            "\2\4\2\uffff\2\4\1\uffff\1\4",
            "",
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
            return "()* loopback of 258:28: ( column_constraint )*";
        }
    }
    static final String DFA121_eotS =
        "\17\uffff";
    static final String DFA121_eofS =
        "\17\uffff";
    static final String DFA121_minS =
        "\1\22\16\uffff";
    static final String DFA121_maxS =
        "\1\175\16\uffff";
    static final String DFA121_acceptS =
        "\1\uffff\1\1\1\2\14\uffff";
    static final String DFA121_specialS =
        "\17\uffff}>";
    static final String[] DFA121_transitionS = {
            "\1\2\4\uffff\1\2\11\uffff\2\2\5\uffff\1\2\41\uffff\2\1\22\uffff"+
            "\1\2\4\uffff\1\2\22\uffff\2\2\1\uffff\3\2\1\uffff\1\2",
            "",
            "",
            "",
            "",
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

    static final short[] DFA121_eot = DFA.unpackEncodedString(DFA121_eotS);
    static final short[] DFA121_eof = DFA.unpackEncodedString(DFA121_eofS);
    static final char[] DFA121_min = DFA.unpackEncodedStringToUnsignedChars(DFA121_minS);
    static final char[] DFA121_max = DFA.unpackEncodedStringToUnsignedChars(DFA121_maxS);
    static final short[] DFA121_accept = DFA.unpackEncodedString(DFA121_acceptS);
    static final short[] DFA121_special = DFA.unpackEncodedString(DFA121_specialS);
    static final short[][] DFA121_transition;

    static {
        int numStates = DFA121_transitionS.length;
        DFA121_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA121_transition[i] = DFA.unpackEncodedString(DFA121_transitionS[i]);
        }
    }

    class DFA121 extends DFA {

        public DFA121(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 121;
            this.eot = DFA121_eot;
            this.eof = DFA121_eof;
            this.min = DFA121_min;
            this.max = DFA121_max;
            this.accept = DFA121_accept;
            this.special = DFA121_special;
            this.transition = DFA121_transition;
        }
        public String getDescription() {
            return "277:37: ( ASC | DESC )?";
        }
    }
    static final String DFA122_eotS =
        "\16\uffff";
    static final String DFA122_eofS =
        "\16\uffff";
    static final String DFA122_minS =
        "\1\22\15\uffff";
    static final String DFA122_maxS =
        "\1\175\15\uffff";
    static final String DFA122_acceptS =
        "\1\uffff\1\1\1\2\13\uffff";
    static final String DFA122_specialS =
        "\16\uffff}>";
    static final String[] DFA122_transitionS = {
            "\1\2\4\uffff\1\2\11\uffff\2\2\5\uffff\1\2\65\uffff\1\1\4\uffff"+
            "\1\2\22\uffff\2\2\1\uffff\3\2\1\uffff\1\2",
            "",
            "",
            "",
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
            return "277:51: ( table_conflict_clause )?";
        }
    }
    static final String DFA123_eotS =
        "\15\uffff";
    static final String DFA123_eofS =
        "\15\uffff";
    static final String DFA123_minS =
        "\1\22\14\uffff";
    static final String DFA123_maxS =
        "\1\175\14\uffff";
    static final String DFA123_acceptS =
        "\1\uffff\1\1\1\2\12\uffff";
    static final String DFA123_specialS =
        "\15\uffff}>";
    static final String[] DFA123_transitionS = {
            "\1\2\4\uffff\1\2\11\uffff\2\2\5\uffff\1\2\72\uffff\1\2\22\uffff"+
            "\2\2\1\uffff\1\1\2\2\1\uffff\1\2",
            "",
            "",
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
            return "277:74: ( AUTOINCREMENT )?";
        }
    }
    static final String DFA124_eotS =
        "\15\uffff";
    static final String DFA124_eofS =
        "\15\uffff";
    static final String DFA124_minS =
        "\1\22\14\uffff";
    static final String DFA124_maxS =
        "\1\175\14\uffff";
    static final String DFA124_acceptS =
        "\1\uffff\1\1\1\2\12\uffff";
    static final String DFA124_specialS =
        "\15\uffff}>";
    static final String[] DFA124_transitionS = {
            "\1\2\4\uffff\1\2\11\uffff\2\2\5\uffff\1\2\65\uffff\1\1\4\uffff"+
            "\1\2\22\uffff\2\2\2\uffff\2\2\1\uffff\1\2",
            "",
            "",
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
            return "279:38: ( table_conflict_clause )?";
        }
    }
    static final String DFA125_eotS =
        "\15\uffff";
    static final String DFA125_eofS =
        "\15\uffff";
    static final String DFA125_minS =
        "\1\22\14\uffff";
    static final String DFA125_maxS =
        "\1\175\14\uffff";
    static final String DFA125_acceptS =
        "\1\uffff\1\1\1\2\12\uffff";
    static final String DFA125_specialS =
        "\15\uffff}>";
    static final String[] DFA125_transitionS = {
            "\1\2\4\uffff\1\2\11\uffff\2\2\5\uffff\1\2\65\uffff\1\1\4\uffff"+
            "\1\2\22\uffff\2\2\2\uffff\2\2\1\uffff\1\2",
            "",
            "",
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
            return "281:35: ( table_conflict_clause )?";
        }
    }
    static final String DFA135_eotS =
        "\17\uffff";
    static final String DFA135_eofS =
        "\17\uffff";
    static final String DFA135_minS =
        "\1\22\16\uffff";
    static final String DFA135_maxS =
        "\1\u0080\16\uffff";
    static final String DFA135_acceptS =
        "\1\uffff\1\2\13\uffff\1\1\1\uffff";
    static final String DFA135_specialS =
        "\17\uffff}>";
    static final String[] DFA135_transitionS = {
            "\1\1\4\uffff\1\1\5\uffff\1\15\3\uffff\2\1\5\uffff\1\1\65\uffff"+
            "\1\15\4\uffff\1\1\22\uffff\2\1\2\uffff\2\1\1\uffff\1\1\2\uffff"+
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
            ""
    };

    static final short[] DFA135_eot = DFA.unpackEncodedString(DFA135_eotS);
    static final short[] DFA135_eof = DFA.unpackEncodedString(DFA135_eofS);
    static final char[] DFA135_min = DFA.unpackEncodedStringToUnsignedChars(DFA135_minS);
    static final char[] DFA135_max = DFA.unpackEncodedStringToUnsignedChars(DFA135_maxS);
    static final short[] DFA135_accept = DFA.unpackEncodedString(DFA135_acceptS);
    static final short[] DFA135_special = DFA.unpackEncodedString(DFA135_specialS);
    static final short[][] DFA135_transition;

    static {
        int numStates = DFA135_transitionS.length;
        DFA135_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA135_transition[i] = DFA.unpackEncodedString(DFA135_transitionS[i]);
        }
    }

    class DFA135 extends DFA {

        public DFA135(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 135;
            this.eot = DFA135_eot;
            this.eof = DFA135_eof;
            this.min = DFA135_min;
            this.max = DFA135_max;
            this.accept = DFA135_accept;
            this.special = DFA135_special;
            this.transition = DFA135_transition;
        }
        public String getDescription() {
            return "()+ loopback of 302:3: ( fk_clause_action )+";
        }
    }
    static final String DFA136_eotS =
        "\17\uffff";
    static final String DFA136_eofS =
        "\17\uffff";
    static final String DFA136_minS =
        "\1\22\1\46\15\uffff";
    static final String DFA136_maxS =
        "\2\u0080\15\uffff";
    static final String DFA136_acceptS =
        "\2\uffff\1\1\1\2\13\uffff";
    static final String DFA136_specialS =
        "\17\uffff}>";
    static final String[] DFA136_transitionS = {
            "\1\3\4\uffff\1\1\11\uffff\2\3\5\uffff\1\3\72\uffff\1\3\22\uffff"+
            "\2\3\2\uffff\2\3\1\uffff\1\3\2\uffff\1\2",
            "\1\3\131\uffff\1\2",
            "",
            "",
            "",
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
            return "302:21: ( fk_clause_deferrable )?";
        }
    }
    static final String DFA140_eotS =
        "\17\uffff";
    static final String DFA140_eofS =
        "\17\uffff";
    static final String DFA140_minS =
        "\1\22\1\150\15\uffff";
    static final String DFA140_maxS =
        "\1\u0081\1\151\15\uffff";
    static final String DFA140_acceptS =
        "\2\uffff\1\3\12\uffff\1\1\1\2";
    static final String DFA140_specialS =
        "\17\uffff}>";
    static final String[] DFA140_transitionS = {
            "\1\2\4\uffff\1\2\11\uffff\2\2\5\uffff\1\2\72\uffff\1\2\22\uffff"+
            "\2\2\2\uffff\2\2\1\uffff\1\2\3\uffff\1\1",
            "\1\15\1\16",
            "",
            "",
            "",
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

    static final short[] DFA140_eot = DFA.unpackEncodedString(DFA140_eotS);
    static final short[] DFA140_eof = DFA.unpackEncodedString(DFA140_eofS);
    static final char[] DFA140_min = DFA.unpackEncodedStringToUnsignedChars(DFA140_minS);
    static final char[] DFA140_max = DFA.unpackEncodedStringToUnsignedChars(DFA140_maxS);
    static final short[] DFA140_accept = DFA.unpackEncodedString(DFA140_acceptS);
    static final short[] DFA140_special = DFA.unpackEncodedString(DFA140_specialS);
    static final short[][] DFA140_transition;

    static {
        int numStates = DFA140_transitionS.length;
        DFA140_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA140_transition[i] = DFA.unpackEncodedString(DFA140_transitionS[i]);
        }
    }

    class DFA140 extends DFA {

        public DFA140(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 140;
            this.eot = DFA140_eot;
            this.eof = DFA140_eof;
            this.min = DFA140_min;
            this.max = DFA140_max;
            this.accept = DFA140_accept;
            this.special = DFA140_special;
            this.transition = DFA140_transition;
        }
        public String getDescription() {
            return "308:41: ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?";
        }
    }
 

    public static final BitSet FOLLOW_sql_stmt_in_sql_stmt_list117 = new BitSet(new long[]{0x4004000000008002L,0x0002D0D1000803EAL,0x000000000000000CL});
    public static final BitSet FOLLOW_EXPLAIN_in_sql_stmt127 = new BitSet(new long[]{0x4004000000058000L,0x0002D0D1000803EAL,0x000000000000000CL});
    public static final BitSet FOLLOW_QUERY_in_sql_stmt130 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_PLAN_in_sql_stmt132 = new BitSet(new long[]{0x4004000000048000L,0x0002D0D1000803EAL,0x000000000000000CL});
    public static final BitSet FOLLOW_sql_stmt_core_in_sql_stmt138 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_sql_stmt140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_stmt_in_sql_stmt_core151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attach_stmt_in_sql_stmt_core157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_detach_stmt_in_sql_stmt_core163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_analyze_stmt_in_sql_stmt_core169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reindex_stmt_in_sql_stmt_core175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vacuum_stmt_in_sql_stmt_core181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_sql_stmt_core190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_stmt_in_sql_stmt_core196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_stmt_in_sql_stmt_core202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_stmt_in_sql_stmt_core208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_stmt_in_sql_stmt_core214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commit_stmt_in_sql_stmt_core220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rollback_stmt_in_sql_stmt_core226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_savepoint_stmt_in_sql_stmt_core232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_release_stmt_in_sql_stmt_core238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_virtual_table_stmt_in_sql_stmt_core247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_table_stmt_in_sql_stmt_core253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_table_stmt_in_sql_stmt_core259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alter_table_stmt_in_sql_stmt_core265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_view_stmt_in_sql_stmt_core271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_view_stmt_in_sql_stmt_core277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_index_stmt_in_sql_stmt_core283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_index_stmt_in_sql_stmt_core289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_trigger_stmt_in_sql_stmt_core295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_trigger_stmt_in_sql_stmt_core301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_qualified_table_name311 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_qualified_table_name313 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_qualified_table_name319 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_INDEXED_in_qualified_table_name322 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_BY_in_qualified_table_name324 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_qualified_table_name328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_qualified_table_name332 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_INDEXED_in_qualified_table_name334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_subexpr_in_expr343 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_OR_in_expr346 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_or_subexpr_in_expr349 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_and_subexpr_in_or_subexpr358 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_AND_in_or_subexpr361 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_and_subexpr_in_or_subexpr364 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr373 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L,0x0007000000000000L});
    public static final BitSet FOLLOW_set_in_and_subexpr379 = new BitSet(new long[]{0x13F8684100880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr395 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L,0x0007000000000000L});
    public static final BitSet FOLLOW_NOT_in_and_subexpr404 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_set_in_and_subexpr408 = new BitSet(new long[]{0x13F8684100880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr424 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ESCAPE_in_and_subexpr427 = new BitSet(new long[]{0x13F8684100880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_and_subexpr438 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_IN_in_and_subexpr442 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_LPAREN_in_and_subexpr445 = new BitSet(new long[]{0x13F868FDBC880000L,0x0000000000080000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_select_stmt_in_and_subexpr448 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_expr_in_and_subexpr452 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_COMMA_in_and_subexpr455 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_expr_in_and_subexpr457 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_RPAREN_in_and_subexpr463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_and_subexpr470 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_and_subexpr472 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_and_subexpr478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISNULL_in_and_subexpr486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTNULL_in_and_subexpr490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_and_subexpr494 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NULL_in_and_subexpr496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_and_subexpr501 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NOT_in_and_subexpr503 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NULL_in_and_subexpr505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_and_subexpr513 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_BETWEEN_in_and_subexpr517 = new BitSet(new long[]{0x13F8684100880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr519 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_AND_in_and_subexpr521 = new BitSet(new long[]{0x13F8684100880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_neq_subexpr_in_eq_subexpr530 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0078000000000000L});
    public static final BitSet FOLLOW_set_in_eq_subexpr533 = new BitSet(new long[]{0x13F8684100880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_neq_subexpr_in_eq_subexpr550 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0078000000000000L});
    public static final BitSet FOLLOW_bit_subexpr_in_neq_subexpr559 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0780000000000000L});
    public static final BitSet FOLLOW_set_in_neq_subexpr562 = new BitSet(new long[]{0x13F8684100880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_bit_subexpr_in_neq_subexpr579 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0780000000000000L});
    public static final BitSet FOLLOW_add_subexpr_in_bit_subexpr588 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x1800000000000000L});
    public static final BitSet FOLLOW_set_in_bit_subexpr591 = new BitSet(new long[]{0x13F8684100880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_add_subexpr_in_bit_subexpr600 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x1800000000000000L});
    public static final BitSet FOLLOW_mul_subexpr_in_add_subexpr609 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000000L,0x6000000000000000L});
    public static final BitSet FOLLOW_set_in_add_subexpr612 = new BitSet(new long[]{0x13F8684100880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_mul_subexpr_in_add_subexpr625 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000000L,0x6000000000000000L});
    public static final BitSet FOLLOW_con_subexpr_in_mul_subexpr634 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_191_in_mul_subexpr637 = new BitSet(new long[]{0x13F8684100880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_con_subexpr_in_mul_subexpr640 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_set_in_con_subexpr649 = new BitSet(new long[]{0x13F8684100880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_unary_subexpr_in_con_subexpr666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_expr_in_unary_subexpr673 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_COLLATE_in_unary_subexpr676 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_unary_subexpr681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_value_in_atom_expr693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bind_parameter_in_atom_expr699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom_expr709 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_atom_expr711 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_atom_expr717 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_atom_expr719 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_atom_expr725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom_expr733 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr735 = new BitSet(new long[]{0x13F86EFDBC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_DISTINCT_in_atom_expr739 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_expr_in_atom_expr745 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_COMMA_in_atom_expr748 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_expr_in_atom_expr752 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_ASTERISK_in_atom_expr758 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr768 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_expr_in_atom_expr770 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_atom_expr782 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr784 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_expr_in_atom_expr786 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_AS_in_atom_expr788 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_type_name_in_atom_expr790 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXISTS_in_atom_expr801 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_select_stmt_in_atom_expr807 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_atom_expr815 = new BitSet(new long[]{0x13F8E8F9BC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_expr_in_atom_expr818 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_WHEN_in_atom_expr823 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_expr_in_atom_expr825 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_THEN_in_atom_expr827 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_expr_in_atom_expr829 = new BitSet(new long[]{0x0006800000000000L});
    public static final BitSet FOLLOW_ELSE_in_atom_expr834 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_expr_in_atom_expr836 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_END_in_atom_expr840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raise_function_in_atom_expr846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal_value0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_signed_number0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_bind_parameter906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_bind_parameter912 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_bind_parameter916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_bind_parameter922 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_bind_parameter926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_195_in_bind_parameter932 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_bind_parameter936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_196_in_bind_parameter942 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TCL_ID_in_bind_parameter946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_name953 = new BitSet(new long[]{0x0000000100080002L});
    public static final BitSet FOLLOW_LPAREN_in_type_name957 = new BitSet(new long[]{0x0418000000000000L});
    public static final BitSet FOLLOW_signed_number_in_type_name961 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_COMMA_in_type_name964 = new BitSet(new long[]{0x0418000000000000L});
    public static final BitSet FOLLOW_signed_number_in_type_name968 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_type_name972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAISE_in_raise_function1002 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_raise_function1004 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IGNORE_in_raise_function1007 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_set_in_raise_function1011 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_COMMA_in_raise_function1023 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_STRING_in_raise_function1027 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_raise_function1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_in_pragma_stmt1038 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_pragma_stmt1043 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_pragma_stmt1045 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_pragma_stmt1051 = new BitSet(new long[]{0x0000000100000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_EQUALS_in_pragma_stmt1054 = new BitSet(new long[]{0x0438000000080000L});
    public static final BitSet FOLLOW_pragma_value_in_pragma_stmt1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_pragma_stmt1060 = new BitSet(new long[]{0x0438000000080000L});
    public static final BitSet FOLLOW_pragma_value_in_pragma_stmt1062 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_pragma_stmt1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signed_number_in_pragma_value1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_pragma_value1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_pragma_value1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTACH_in_attach_stmt1091 = new BitSet(new long[]{0x0020000000080000L,0x0000000000000010L});
    public static final BitSet FOLLOW_DATABASE_in_attach_stmt1094 = new BitSet(new long[]{0x0020000000080000L});
    public static final BitSet FOLLOW_set_in_attach_stmt1100 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_AS_in_attach_stmt1108 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_attach_stmt1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DETACH_in_detach_stmt1120 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000010L});
    public static final BitSet FOLLOW_DATABASE_in_detach_stmt1123 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_detach_stmt1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANALYZE_in_analyze_stmt1137 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ID_in_analyze_stmt1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_analyze_stmt1148 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_analyze_stmt1150 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_analyze_stmt1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REINDEX_in_reindex_stmt1164 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_reindex_stmt1169 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_reindex_stmt1171 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_reindex_stmt1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VACUUM_in_vacuum_stmt1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_operation_conflict_clause1196 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000201L});
    public static final BitSet FOLLOW_set_in_operation_conflict_clause1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_ordering_term1223 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ASC_in_ordering_term1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_ordering_term1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_operation_limited_clause1262 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_BY_in_operation_limited_clause1264 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_ordering_term_in_operation_limited_clause1266 = new BitSet(new long[]{0x0000000200000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_operation_limited_clause1269 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_ordering_term_in_operation_limited_clause1271 = new BitSet(new long[]{0x0000000200000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_LIMIT_in_operation_limited_clause1279 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_operation_limited_clause1283 = new BitSet(new long[]{0x0000000200000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_set_in_operation_limited_clause1286 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_operation_limited_clause1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_list_in_select_stmt1306 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_ORDER_in_select_stmt1311 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_BY_in_select_stmt1313 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt1315 = new BitSet(new long[]{0x0000000200000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt1318 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt1320 = new BitSet(new long[]{0x0000000200000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_LIMIT_in_select_stmt1329 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt1333 = new BitSet(new long[]{0x0000000200000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_OFFSET_in_select_stmt1337 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt1341 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_core_in_select_list1391 = new BitSet(new long[]{0x0000000000000002L,0x0000000000068000L});
    public static final BitSet FOLLOW_select_op_in_select_list1394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_select_core_in_select_list1397 = new BitSet(new long[]{0x0000000000000002L,0x0000000000068000L});
    public static final BitSet FOLLOW_UNION_in_select_op1406 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ALL_in_select_op1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERSECT_in_select_op1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCEPT_in_select_op1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_core1429 = new BitSet(new long[]{0x13F86EF9BC880000L,0x0000000000010000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_ALL_in_select_core1432 = new BitSet(new long[]{0x13F86EF9BC880000L,0x0000000000010000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_DISTINCT_in_select_core1436 = new BitSet(new long[]{0x13F86EF9BC880000L,0x0000000000010000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_result_column_in_select_core1440 = new BitSet(new long[]{0x0000000200000002L,0x0000000000700000L});
    public static final BitSet FOLLOW_COMMA_in_select_core1443 = new BitSet(new long[]{0x13F86EF9BC880000L,0x0000000000010000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_result_column_in_select_core1445 = new BitSet(new long[]{0x0000000200000002L,0x0000000000700000L});
    public static final BitSet FOLLOW_FROM_in_select_core1450 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_join_source_in_select_core1452 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_WHERE_in_select_core1457 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_expr_in_select_core1461 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_GROUP_in_select_core1469 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_BY_in_select_core1471 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_ordering_term_in_select_core1473 = new BitSet(new long[]{0x0000000200000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_COMMA_in_select_core1476 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_ordering_term_in_select_core1478 = new BitSet(new long[]{0x0000000200000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_HAVING_in_select_core1483 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_expr_in_select_core1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_result_column1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_result_column1565 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_result_column1567 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ASTERISK_in_result_column1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_result_column1584 = new BitSet(new long[]{0x0000100000080002L});
    public static final BitSet FOLLOW_AS_in_result_column1588 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_result_column1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_source_in_join_source1615 = new BitSet(new long[]{0x0000000200000002L,0x000000003F000000L});
    public static final BitSet FOLLOW_join_op_in_join_source1618 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_single_source_in_join_source1621 = new BitSet(new long[]{0x0000000200000002L,0x00000000FF000000L});
    public static final BitSet FOLLOW_join_constraint_in_join_source1624 = new BitSet(new long[]{0x0000000200000002L,0x000000003F000000L});
    public static final BitSet FOLLOW_ID_in_single_source1641 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_single_source1643 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_single_source1649 = new BitSet(new long[]{0x0000100000A80002L});
    public static final BitSet FOLLOW_AS_in_single_source1653 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_single_source1659 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_INDEXED_in_single_source1664 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_BY_in_single_source1666 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_single_source1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_single_source1674 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_INDEXED_in_single_source1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_single_source1717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_select_stmt_in_single_source1719 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_single_source1721 = new BitSet(new long[]{0x0000100000080002L});
    public static final BitSet FOLLOW_AS_in_single_source1725 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_single_source1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_single_source1753 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_join_source_in_single_source1756 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_single_source1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_join_op1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATURAL_in_join_op1776 = new BitSet(new long[]{0x0000000000000000L,0x000000003E000000L});
    public static final BitSet FOLLOW_LEFT_in_join_op1782 = new BitSet(new long[]{0x0000000000000000L,0x0000000024000000L});
    public static final BitSet FOLLOW_OUTER_in_join_op1787 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_INNER_in_join_op1793 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_CROSS_in_join_op1797 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_JOIN_in_join_op1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_join_constraint1811 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_expr_in_join_constraint1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_join_constraint1820 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_join_constraint1822 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_join_constraint1826 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_COMMA_in_join_constraint1829 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_join_constraint1833 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_RPAREN_in_join_constraint1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_stmt1856 = new BitSet(new long[]{0x0000000001000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_operation_conflict_clause_in_insert_stmt1859 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_REPLACE_in_insert_stmt1865 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_INTO_in_insert_stmt1868 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_insert_stmt1873 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_insert_stmt1875 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_insert_stmt1881 = new BitSet(new long[]{0x0000000100000000L,0x0000000C00080000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt1888 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_insert_stmt1892 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt1895 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_insert_stmt1899 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt1903 = new BitSet(new long[]{0x0000000000000000L,0x0000000400080000L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt1912 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt1914 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_expr_in_insert_stmt1918 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt1921 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_expr_in_insert_stmt1925 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_insert_stmt1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_insert_stmt1940 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update_stmt1952 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_operation_conflict_clause_in_update_stmt1955 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_qualified_table_name_in_update_stmt1959 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_SET_in_update_stmt1963 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_update_set_in_update_stmt1967 = new BitSet(new long[]{0x0000000200000002L,0x0000000000203000L});
    public static final BitSet FOLLOW_COMMA_in_update_stmt1970 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_update_set_in_update_stmt1974 = new BitSet(new long[]{0x0000000200000002L,0x0000000000203000L});
    public static final BitSet FOLLOW_WHERE_in_update_stmt1979 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_expr_in_update_stmt1981 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_operation_limited_clause_in_update_stmt1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_update_set1997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_EQUALS_in_update_set1999 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_expr_in_update_set2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_stmt2009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_FROM_in_delete_stmt2011 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_qualified_table_name_in_delete_stmt2013 = new BitSet(new long[]{0x0000000000000002L,0x0000000000203000L});
    public static final BitSet FOLLOW_WHERE_in_delete_stmt2016 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_expr_in_delete_stmt2018 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_operation_limited_clause_in_delete_stmt2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_begin_stmt2033 = new BitSet(new long[]{0x0000000000000002L,0x00000F0000000000L});
    public static final BitSet FOLLOW_set_in_begin_stmt2035 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_begin_stmt2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_commit_stmt2059 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_commit_stmt2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROLLBACK_in_rollback_stmt2078 = new BitSet(new long[]{0x0000000000000002L,0x0000280000000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_rollback_stmt2081 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_TO_in_rollback_stmt2086 = new BitSet(new long[]{0x0000000000080000L,0x0000400000000000L});
    public static final BitSet FOLLOW_SAVEPOINT_in_rollback_stmt2089 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_rollback_stmt2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVEPOINT_in_savepoint_stmt2105 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_savepoint_stmt2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELEASE_in_release_stmt2117 = new BitSet(new long[]{0x0000000000080000L,0x0000400000000000L});
    public static final BitSet FOLLOW_SAVEPOINT_in_release_stmt2120 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_release_stmt2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_table_conflict_clause2138 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_CONFLICT_in_table_conflict_clause2141 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000201L});
    public static final BitSet FOLLOW_set_in_table_conflict_clause2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_virtual_table_stmt2171 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_VIRTUAL_in_create_virtual_table_stmt2173 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_TABLE_in_create_virtual_table_stmt2175 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_virtual_table_stmt2180 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_create_virtual_table_stmt2182 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_virtual_table_stmt2188 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_USING_in_create_virtual_table_stmt2192 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_virtual_table_stmt2196 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_LPAREN_in_create_virtual_table_stmt2199 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_column_def_in_create_virtual_table_stmt2201 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_COMMA_in_create_virtual_table_stmt2204 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_column_def_in_create_virtual_table_stmt2206 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_virtual_table_stmt2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_table_stmt2220 = new BitSet(new long[]{0x0000000000000000L,0x0018000000000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_table_stmt2222 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_TABLE_in_create_table_stmt2225 = new BitSet(new long[]{0x0000000000080000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IF_in_create_table_stmt2228 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NOT_in_create_table_stmt2230 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_table_stmt2232 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_table_stmt2239 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_create_table_stmt2241 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_table_stmt2247 = new BitSet(new long[]{0x0000100100000000L});
    public static final BitSet FOLLOW_LPAREN_in_create_table_stmt2253 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_column_def_in_create_table_stmt2255 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_COMMA_in_create_table_stmt2258 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_column_def_in_create_table_stmt2260 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_COMMA_in_create_table_stmt2265 = new BitSet(new long[]{0x0000000000000000L,0x1CC0000000000000L});
    public static final BitSet FOLLOW_table_constraint_in_create_table_stmt2267 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_table_stmt2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_create_table_stmt2277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_select_stmt_in_create_table_stmt2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_column_def2324 = new BitSet(new long[]{0x0000010000880002L,0x2CC0000800000000L});
    public static final BitSet FOLLOW_type_name_in_column_def2327 = new BitSet(new long[]{0x0000010000800002L,0x2CC0000800000000L});
    public static final BitSet FOLLOW_column_constraint_in_column_def2331 = new BitSet(new long[]{0x0000010000800002L,0x2CC0000800000000L});
    public static final BitSet FOLLOW_CONSTRAINT_in_column_constraint2341 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_column_constraint2345 = new BitSet(new long[]{0x0000010000800000L,0x2CC0000800000000L});
    public static final BitSet FOLLOW_column_constraint_pk_in_column_constraint2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_not_null_in_column_constraint2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_unique_in_column_constraint2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_check_in_column_constraint2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_default_in_column_constraint2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_collate_in_column_constraint2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fk_clause_in_column_constraint2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_in_column_constraint_pk2442 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEY_in_column_constraint_pk2445 = new BitSet(new long[]{0x0000000000000002L,0x0200000040000C00L});
    public static final BitSet FOLLOW_set_in_column_constraint_pk2448 = new BitSet(new long[]{0x0000000000000002L,0x0200000040000000L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_pk2457 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_AUTOINCREMENT_in_column_constraint_pk2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_column_constraint_not_null2470 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NULL_in_column_constraint_not_null2472 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_not_null2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_column_constraint_unique2491 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_unique2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECK_in_column_constraint_check2502 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_column_constraint_check2505 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_expr_in_column_constraint_check2508 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_column_constraint_check2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_column_constraint_default2518 = new BitSet(new long[]{0x07F8004100000000L});
    public static final BitSet FOLLOW_SIGNED_NUMBER_in_column_constraint_default2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_value_in_column_constraint_default2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_column_constraint_default2530 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_expr_in_column_constraint_default2533 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_column_constraint_default2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLATE_in_column_constraint_collate2544 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_column_constraint_collate2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRAINT_in_table_constraint2558 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_table_constraint2562 = new BitSet(new long[]{0x0000000000000000L,0x1CC0000000000000L});
    public static final BitSet FOLLOW_table_constraint_pk_in_table_constraint2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_check_in_table_constraint2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_fk_in_table_constraint2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_in_table_constraint_pk2591 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEY_in_table_constraint_pk2593 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_UNIQUE_in_table_constraint_pk2597 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_pk2600 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_table_constraint_pk2604 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_pk2607 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_table_constraint_pk2611 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_pk2615 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_table_conflict_clause_in_table_constraint_pk2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECK_in_table_constraint_check2627 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_check2629 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_expr_in_table_constraint_check2631 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_check2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREIGN_in_table_constraint_fk2640 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEY_in_table_constraint_fk2642 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_fk2644 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_table_constraint_fk2648 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_fk2651 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_table_constraint_fk2655 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_fk2659 = new BitSet(new long[]{0x0000010000800000L,0x2CC0000800000000L});
    public static final BitSet FOLLOW_fk_clause_in_table_constraint_fk2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCES_in_fk_clause2668 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_fk_clause2673 = new BitSet(new long[]{0x0000000120000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_fk_clause2676 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_fk_clause2680 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_COMMA_in_fk_clause2683 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_fk_clause2687 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_RPAREN_in_fk_clause2691 = new BitSet(new long[]{0x0000000120000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_fk_clause_action_in_fk_clause2697 = new BitSet(new long[]{0x0000000120800002L,0x0000000040000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fk_clause_deferrable_in_fk_clause2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_fk_clause_action2711 = new BitSet(new long[]{0x0000000000000000L,0x0000005100000000L});
    public static final BitSet FOLLOW_set_in_fk_clause_action2713 = new BitSet(new long[]{0x0000000000000000L,0xC000002000000000L});
    public static final BitSet FOLLOW_SET_in_fk_clause_action2726 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NULL_in_fk_clause_action2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_fk_clause_action2732 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_DEFAULT_in_fk_clause_action2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASCADE_in_fk_clause_action2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESTRICT_in_fk_clause_action2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCH_in_fk_clause_action2749 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_fk_clause_action2753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_fk_clause_deferrable2761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_DEFERRABLE_in_fk_clause_deferrable2765 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_INITIALLY_in_fk_clause_deferrable2768 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_DEFERRED_in_fk_clause_deferrable2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITIALLY_in_fk_clause_deferrable2774 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_IMMEDIATE_in_fk_clause_deferrable2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_table_stmt2786 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_TABLE_in_drop_table_stmt2788 = new BitSet(new long[]{0x0000000000080000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IF_in_drop_table_stmt2791 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_table_stmt2793 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_drop_table_stmt2800 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_drop_table_stmt2802 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_drop_table_stmt2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALTER_in_alter_table_stmt2816 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_TABLE_in_alter_table_stmt2818 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_alter_table_stmt2823 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_alter_table_stmt2825 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_alter_table_stmt2831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_RENAME_in_alter_table_stmt2834 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_TO_in_alter_table_stmt2836 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_alter_table_stmt2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_alter_table_stmt2844 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_COLUMN_in_alter_table_stmt2847 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_column_def_in_alter_table_stmt2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_view_stmt2860 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_view_stmt2862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_VIEW_in_create_view_stmt2865 = new BitSet(new long[]{0x0000000000080000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IF_in_create_view_stmt2868 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NOT_in_create_view_stmt2870 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_view_stmt2872 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_view_stmt2879 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_create_view_stmt2881 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_view_stmt2887 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_AS_in_create_view_stmt2889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_select_stmt_in_create_view_stmt2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_view_stmt2899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_VIEW_in_drop_view_stmt2901 = new BitSet(new long[]{0x0000000000080000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IF_in_drop_view_stmt2904 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_view_stmt2906 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_drop_view_stmt2913 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_drop_view_stmt2915 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_drop_view_stmt2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_index_stmt2929 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_UNIQUE_in_create_index_stmt2932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_INDEX_in_create_index_stmt2936 = new BitSet(new long[]{0x0000000000080000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IF_in_create_index_stmt2939 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NOT_in_create_index_stmt2941 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_index_stmt2943 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_index_stmt2950 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_create_index_stmt2952 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_index_stmt2958 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_ON_in_create_index_stmt2962 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_index_stmt2966 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_create_index_stmt2968 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_indexed_column_in_create_index_stmt2972 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_COMMA_in_create_index_stmt2975 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_indexed_column_in_create_index_stmt2979 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_index_stmt2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_indexed_column2992 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_COLLATE_in_indexed_column2995 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_indexed_column2999 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_set_in_indexed_column3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_index_stmt3018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_INDEX_in_drop_index_stmt3020 = new BitSet(new long[]{0x0000000000080000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IF_in_drop_index_stmt3023 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_index_stmt3025 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_drop_index_stmt3032 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_drop_index_stmt3034 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_drop_index_stmt3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_trigger_stmt3048 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_trigger_stmt3050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TRIGGER_in_create_trigger_stmt3053 = new BitSet(new long[]{0x0000000000080000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IF_in_create_trigger_stmt3056 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NOT_in_create_trigger_stmt3058 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_trigger_stmt3060 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_trigger_stmt3067 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_create_trigger_stmt3069 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_trigger_stmt3075 = new BitSet(new long[]{0x0000000000000000L,0x0000005100000000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_BEFORE_in_create_trigger_stmt3080 = new BitSet(new long[]{0x0000000000000000L,0x0000005100000000L});
    public static final BitSet FOLLOW_AFTER_in_create_trigger_stmt3084 = new BitSet(new long[]{0x0000000000000000L,0x0000005100000000L});
    public static final BitSet FOLLOW_INSTEAD_in_create_trigger_stmt3088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_OF_in_create_trigger_stmt3090 = new BitSet(new long[]{0x0000000000000000L,0x0000005100000000L});
    public static final BitSet FOLLOW_DELETE_in_create_trigger_stmt3095 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_INSERT_in_create_trigger_stmt3099 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_UPDATE_in_create_trigger_stmt3103 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_OF_in_create_trigger_stmt3106 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_trigger_stmt3110 = new BitSet(new long[]{0x0000000200000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_COMMA_in_create_trigger_stmt3113 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_trigger_stmt3117 = new BitSet(new long[]{0x0000000200000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_ON_in_create_trigger_stmt3126 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_create_trigger_stmt3130 = new BitSet(new long[]{0x0000800000000000L,0x0000008000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_FOR_in_create_trigger_stmt3133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_EACH_in_create_trigger_stmt3135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ROW_in_create_trigger_stmt3137 = new BitSet(new long[]{0x0000800000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_WHEN_in_create_trigger_stmt3142 = new BitSet(new long[]{0x13F868F9BC880000L,0x0000000000000000L,0x1800000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_expr_in_create_trigger_stmt3144 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_BEGIN_in_create_trigger_stmt3150 = new BitSet(new long[]{0x0000000000000000L,0x0000005100080200L});
    public static final BitSet FOLLOW_update_stmt_in_create_trigger_stmt3154 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_insert_stmt_in_create_trigger_stmt3158 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_delete_stmt_in_create_trigger_stmt3162 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_select_stmt_in_create_trigger_stmt3166 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_create_trigger_stmt3169 = new BitSet(new long[]{0x0004000000000000L,0x0000005100080200L});
    public static final BitSet FOLLOW_END_in_create_trigger_stmt3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_trigger_stmt3181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_TRIGGER_in_drop_trigger_stmt3183 = new BitSet(new long[]{0x0000000000080000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IF_in_drop_trigger_stmt3186 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_trigger_stmt3188 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_drop_trigger_stmt3195 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_drop_trigger_stmt3197 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_drop_trigger_stmt3203 = new BitSet(new long[]{0x0000000000000002L});

}