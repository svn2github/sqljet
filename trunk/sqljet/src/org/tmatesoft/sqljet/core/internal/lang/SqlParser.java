// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 Sql.g 2009-06-18 16:23:46

  package org.tmatesoft.sqljet.core.internal.lang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class SqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALIAS", "BIND", "BIND_NAME", "BLOB_LITERAL", "COLUMN_CONSTRAINT", "COLUMN_EXPRESSION", "COLUMNS", "CONSTRAINTS", "CREATE_INDEX", "CREATE_TABLE", "DROP_INDEX", "DROP_TABLE", "FLOAT_LITERAL", "FUNCTION_LITERAL", "FUNCTION_EXPRESSION", "INTEGER_LITERAL", "IS_NULL", "IN_VALUES", "IN_TABLE", "NOT_NULL", "OPTIONS", "ORDERING", "SELECT_CORE", "STRING_LITERAL", "TABLE_CONSTRAINT", "TYPE", "TYPE_PARAMS", "EXPLAIN", "QUERY", "PLAN", "SEMI", "DOT", "INDEXED", "BY", "NOT", "PLUS", "MINUS", "INTEGER", "FLOAT", "OR", "AND", "ESCAPE", "IN", "LPAREN", "COMMA", "RPAREN", "ISNULL", "NOTNULL", "IS", "NULL", "BETWEEN", "EQUALS", "EQUALS2", "NOT_EQUALS", "NOT_EQUALS2", "LIKE", "GLOB", "REGEXP", "MATCH", "LESS", "LESS_OR_EQ", "GREATER", "GREATER_OR_EQ", "SHIFT_LEFT", "SHIFT_RIGHT", "AMPERSAND", "PIPE", "ASTERISK", "SLASH", "PERCENT", "DOUBLE_PIPE", "TILDA", "COLLATE", "ID", "DISTINCT", "CAST", "AS", "CASE", "ELSE", "END", "WHEN", "THEN", "STRING", "BLOB", "CURRENT_TIME", "CURRENT_DATE", "CURRENT_TIMESTAMP", "QUESTION", "COLON", "AT", "RAISE", "IGNORE", "ROLLBACK", "ABORT", "FAIL", "PRAGMA", "ATTACH", "DATABASE", "DETACH", "ANALYZE", "REINDEX", "VACUUM", "REPLACE", "ASC", "DESC", "ORDER", "LIMIT", "OFFSET", "UNION", "ALL", "INTERSECT", "EXCEPT", "SELECT", "FROM", "WHERE", "GROUP", "HAVING", "NATURAL", "LEFT", "OUTER", "INNER", "CROSS", "JOIN", "ON", "USING", "INSERT", "INTO", "VALUES", "DEFAULT", "UPDATE", "SET", "DELETE", "BEGIN", "DEFERRED", "IMMEDIATE", "EXCLUSIVE", "TRANSACTION", "COMMIT", "TO", "SAVEPOINT", "RELEASE", "CONFLICT", "CREATE", "VIRTUAL", "TABLE", "TEMPORARY", "IF", "EXISTS", "CONSTRAINT", "PRIMARY", "KEY", "AUTOINCREMENT", "UNIQUE", "CHECK", "FOREIGN", "REFERENCES", "CASCADE", "RESTRICT", "DEFERRABLE", "INITIALLY", "DROP", "ALTER", "RENAME", "ADD", "COLUMN", "VIEW", "INDEX", "TRIGGER", "BEFORE", "AFTER", "INSTEAD", "OF", "FOR", "EACH", "ROW", "DOLLAR", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "ID_START", "FLOAT_EXP", "COMMENT", "LINE_COMMENT", "WS"
    };
    public static final int ROW=178;
    public static final int BLOB_LITERAL=7;
    public static final int TYPE_PARAMS=30;
    public static final int NOT=38;
    public static final int EXCEPT=115;
    public static final int EOF=-1;
    public static final int FOREIGN=158;
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
    public static final int J=189;
    public static final int ELSE=82;
    public static final int K=190;
    public static final int U=200;
    public static final int T=199;
    public static final int W=202;
    public static final int IN_VALUES=21;
    public static final int V=201;
    public static final int Q=196;
    public static final int P=195;
    public static final int S=198;
    public static final int R=197;
    public static final int ROLLBACK=96;
    public static final int FAIL=98;
    public static final int Y=204;
    public static final int RESTRICT=161;
    public static final int X=203;
    public static final int Z=205;
    public static final int INTERSECT=114;
    public static final int GROUP=119;
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
    public static final int ASTERISK=71;
    public static final int LPAREN=47;
    public static final int NOT_NULL=23;
    public static final int GREATER_OR_EQ=66;
    public static final int DOUBLE_PIPE=74;
    public static final int AT=93;
    public static final int AS=80;
    public static final int SLASH=72;
    public static final int THEN=85;
    public static final int OFFSET=111;
    public static final int REPLACE=106;
    public static final int LEFT=122;
    public static final int COLUMN=168;
    public static final int PIPE=70;
    public static final int PLUS=39;
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
    public static final int FLOAT_LITERAL=16;
    public static final int INDEXED=36;
    public static final int CREATE_INDEX=12;
    public static final int QUESTION=91;
    public static final int ORDERING=25;
    public static final int IMMEDIATE=138;
    public static final int DESC=108;
    public static final int DROP_TABLE=15;
    public static final int ID_START=206;

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
    // Sql.g:64:1: sql_stmt_list : ( sql_stmt )+ ;
    public final SqlParser.sql_stmt_list_return sql_stmt_list() throws RecognitionException {
        SqlParser.sql_stmt_list_return retval = new SqlParser.sql_stmt_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.sql_stmt_return sql_stmt1 = null;



        try {
            // Sql.g:64:14: ( ( sql_stmt )+ )
            // Sql.g:64:16: ( sql_stmt )+
            {
            root_0 = (Object)adaptor.nil();

            // Sql.g:64:16: ( sql_stmt )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // Sql.g:64:17: sql_stmt
            	    {
            	    pushFollow(FOLLOW_sql_stmt_in_sql_stmt_list180);
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
    // Sql.g:66:1: sql_stmt : ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI ;
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
            // Sql.g:66:9: ( ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI )
            // Sql.g:66:11: ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI
            {
            root_0 = (Object)adaptor.nil();

            // Sql.g:66:11: ( EXPLAIN ( QUERY PLAN )? )?
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // Sql.g:66:12: EXPLAIN ( QUERY PLAN )?
                    {
                    EXPLAIN2=(Token)match(input,EXPLAIN,FOLLOW_EXPLAIN_in_sql_stmt190); 
                    EXPLAIN2_tree = (Object)adaptor.create(EXPLAIN2);
                    adaptor.addChild(root_0, EXPLAIN2_tree);

                    // Sql.g:66:20: ( QUERY PLAN )?
                    int alt2=2;
                    alt2 = dfa2.predict(input);
                    switch (alt2) {
                        case 1 :
                            // Sql.g:66:21: QUERY PLAN
                            {
                            QUERY3=(Token)match(input,QUERY,FOLLOW_QUERY_in_sql_stmt193); 
                            QUERY3_tree = (Object)adaptor.create(QUERY3);
                            adaptor.addChild(root_0, QUERY3_tree);

                            PLAN4=(Token)match(input,PLAN,FOLLOW_PLAN_in_sql_stmt195); 
                            PLAN4_tree = (Object)adaptor.create(PLAN4);
                            adaptor.addChild(root_0, PLAN4_tree);


                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_sql_stmt_core_in_sql_stmt201);
            sql_stmt_core5=sql_stmt_core();

            state._fsp--;

            adaptor.addChild(root_0, sql_stmt_core5.getTree());
            SEMI6=(Token)match(input,SEMI,FOLLOW_SEMI_in_sql_stmt203); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:68:1: sql_stmt_core : ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt );
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
            // Sql.g:69:3: ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt )
            int alt4=25;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // Sql.g:69:5: pragma_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pragma_stmt_in_sql_stmt_core214);
                    pragma_stmt7=pragma_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_stmt7.getTree());

                    }
                    break;
                case 2 :
                    // Sql.g:70:5: attach_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_attach_stmt_in_sql_stmt_core220);
                    attach_stmt8=attach_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, attach_stmt8.getTree());

                    }
                    break;
                case 3 :
                    // Sql.g:71:5: detach_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_detach_stmt_in_sql_stmt_core226);
                    detach_stmt9=detach_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, detach_stmt9.getTree());

                    }
                    break;
                case 4 :
                    // Sql.g:72:5: analyze_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_analyze_stmt_in_sql_stmt_core232);
                    analyze_stmt10=analyze_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, analyze_stmt10.getTree());

                    }
                    break;
                case 5 :
                    // Sql.g:73:5: reindex_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_reindex_stmt_in_sql_stmt_core238);
                    reindex_stmt11=reindex_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, reindex_stmt11.getTree());

                    }
                    break;
                case 6 :
                    // Sql.g:74:5: vacuum_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_vacuum_stmt_in_sql_stmt_core244);
                    vacuum_stmt12=vacuum_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, vacuum_stmt12.getTree());

                    }
                    break;
                case 7 :
                    // Sql.g:76:5: select_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_select_stmt_in_sql_stmt_core253);
                    select_stmt13=select_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, select_stmt13.getTree());

                    }
                    break;
                case 8 :
                    // Sql.g:77:5: insert_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_insert_stmt_in_sql_stmt_core259);
                    insert_stmt14=insert_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, insert_stmt14.getTree());

                    }
                    break;
                case 9 :
                    // Sql.g:78:5: update_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_update_stmt_in_sql_stmt_core265);
                    update_stmt15=update_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, update_stmt15.getTree());

                    }
                    break;
                case 10 :
                    // Sql.g:79:5: delete_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_delete_stmt_in_sql_stmt_core271);
                    delete_stmt16=delete_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_stmt16.getTree());

                    }
                    break;
                case 11 :
                    // Sql.g:80:5: begin_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_begin_stmt_in_sql_stmt_core277);
                    begin_stmt17=begin_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, begin_stmt17.getTree());

                    }
                    break;
                case 12 :
                    // Sql.g:81:5: commit_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_commit_stmt_in_sql_stmt_core283);
                    commit_stmt18=commit_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, commit_stmt18.getTree());

                    }
                    break;
                case 13 :
                    // Sql.g:82:5: rollback_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_rollback_stmt_in_sql_stmt_core289);
                    rollback_stmt19=rollback_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, rollback_stmt19.getTree());

                    }
                    break;
                case 14 :
                    // Sql.g:83:5: savepoint_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_savepoint_stmt_in_sql_stmt_core295);
                    savepoint_stmt20=savepoint_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, savepoint_stmt20.getTree());

                    }
                    break;
                case 15 :
                    // Sql.g:84:5: release_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_release_stmt_in_sql_stmt_core301);
                    release_stmt21=release_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, release_stmt21.getTree());

                    }
                    break;
                case 16 :
                    // Sql.g:86:5: create_virtual_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_virtual_table_stmt_in_sql_stmt_core310);
                    create_virtual_table_stmt22=create_virtual_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_virtual_table_stmt22.getTree());

                    }
                    break;
                case 17 :
                    // Sql.g:87:5: create_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_table_stmt_in_sql_stmt_core316);
                    create_table_stmt23=create_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_table_stmt23.getTree());

                    }
                    break;
                case 18 :
                    // Sql.g:88:5: drop_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_table_stmt_in_sql_stmt_core322);
                    drop_table_stmt24=drop_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_table_stmt24.getTree());

                    }
                    break;
                case 19 :
                    // Sql.g:89:5: alter_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_alter_table_stmt_in_sql_stmt_core328);
                    alter_table_stmt25=alter_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, alter_table_stmt25.getTree());

                    }
                    break;
                case 20 :
                    // Sql.g:90:5: create_view_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_view_stmt_in_sql_stmt_core334);
                    create_view_stmt26=create_view_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_view_stmt26.getTree());

                    }
                    break;
                case 21 :
                    // Sql.g:91:5: drop_view_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_view_stmt_in_sql_stmt_core340);
                    drop_view_stmt27=drop_view_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_view_stmt27.getTree());

                    }
                    break;
                case 22 :
                    // Sql.g:92:5: create_index_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_index_stmt_in_sql_stmt_core346);
                    create_index_stmt28=create_index_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_index_stmt28.getTree());

                    }
                    break;
                case 23 :
                    // Sql.g:93:5: drop_index_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_index_stmt_in_sql_stmt_core352);
                    drop_index_stmt29=drop_index_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_index_stmt29.getTree());

                    }
                    break;
                case 24 :
                    // Sql.g:94:5: create_trigger_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_trigger_stmt_in_sql_stmt_core358);
                    create_trigger_stmt30=create_trigger_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_trigger_stmt30.getTree());

                    }
                    break;
                case 25 :
                    // Sql.g:95:5: drop_trigger_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_trigger_stmt_in_sql_stmt_core364);
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
    // Sql.g:98:1: qualified_table_name : (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )? ;
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
            // Sql.g:98:21: ( (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )? )
            // Sql.g:98:23: (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )?
            {
            root_0 = (Object)adaptor.nil();

            // Sql.g:98:23: (database_name= id DOT )?
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // Sql.g:98:24: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_qualified_table_name377);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT32=(Token)match(input,DOT,FOLLOW_DOT_in_qualified_table_name379); 
                    DOT32_tree = (Object)adaptor.create(DOT32);
                    adaptor.addChild(root_0, DOT32_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_qualified_table_name385);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // Sql.g:98:61: ( INDEXED BY index_name= id | NOT INDEXED )?
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
                    // Sql.g:98:62: INDEXED BY index_name= id
                    {
                    INDEXED33=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_qualified_table_name388); 
                    INDEXED33_tree = (Object)adaptor.create(INDEXED33);
                    adaptor.addChild(root_0, INDEXED33_tree);

                    BY34=(Token)match(input,BY,FOLLOW_BY_in_qualified_table_name390); 
                    BY34_tree = (Object)adaptor.create(BY34);
                    adaptor.addChild(root_0, BY34_tree);

                    pushFollow(FOLLOW_id_in_qualified_table_name394);
                    index_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, index_name.getTree());

                    }
                    break;
                case 2 :
                    // Sql.g:98:89: NOT INDEXED
                    {
                    NOT35=(Token)match(input,NOT,FOLLOW_NOT_in_qualified_table_name398); 
                    NOT35_tree = (Object)adaptor.create(NOT35);
                    adaptor.addChild(root_0, NOT35_tree);

                    INDEXED36=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_qualified_table_name400); 
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
    // Sql.g:100:1: signed_number : ( PLUS | MINUS )? ( INTEGER | FLOAT ) ;
    public final SqlParser.signed_number_return signed_number() throws RecognitionException {
        SqlParser.signed_number_return retval = new SqlParser.signed_number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set37=null;
        Token set38=null;

        Object set37_tree=null;
        Object set38_tree=null;

        try {
            // Sql.g:100:14: ( ( PLUS | MINUS )? ( INTEGER | FLOAT ) )
            // Sql.g:100:16: ( PLUS | MINUS )? ( INTEGER | FLOAT )
            {
            root_0 = (Object)adaptor.nil();

            // Sql.g:100:16: ( PLUS | MINUS )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=PLUS && LA7_0<=MINUS)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Sql.g:
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
            if ( (input.LA(1)>=INTEGER && input.LA(1)<=FLOAT) ) {
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
    // Sql.g:102:1: expr : or_subexpr ( OR or_subexpr )* ;
    public final SqlParser.expr_return expr() throws RecognitionException {
        SqlParser.expr_return retval = new SqlParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR40=null;
        SqlParser.or_subexpr_return or_subexpr39 = null;

        SqlParser.or_subexpr_return or_subexpr41 = null;


        Object OR40_tree=null;

        try {
            // Sql.g:102:5: ( or_subexpr ( OR or_subexpr )* )
            // Sql.g:102:7: or_subexpr ( OR or_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_or_subexpr_in_expr431);
            or_subexpr39=or_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, or_subexpr39.getTree());
            // Sql.g:102:18: ( OR or_subexpr )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // Sql.g:102:19: OR or_subexpr
            	    {
            	    OR40=(Token)match(input,OR,FOLLOW_OR_in_expr434); 
            	    OR40_tree = (Object)adaptor.create(OR40);
            	    root_0 = (Object)adaptor.becomeRoot(OR40_tree, root_0);

            	    pushFollow(FOLLOW_or_subexpr_in_expr437);
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
    // Sql.g:104:1: or_subexpr : and_subexpr ( AND and_subexpr )* ;
    public final SqlParser.or_subexpr_return or_subexpr() throws RecognitionException {
        SqlParser.or_subexpr_return retval = new SqlParser.or_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND43=null;
        SqlParser.and_subexpr_return and_subexpr42 = null;

        SqlParser.and_subexpr_return and_subexpr44 = null;


        Object AND43_tree=null;

        try {
            // Sql.g:104:11: ( and_subexpr ( AND and_subexpr )* )
            // Sql.g:104:13: and_subexpr ( AND and_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_and_subexpr_in_or_subexpr446);
            and_subexpr42=and_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, and_subexpr42.getTree());
            // Sql.g:104:25: ( AND and_subexpr )*
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // Sql.g:104:26: AND and_subexpr
            	    {
            	    AND43=(Token)match(input,AND,FOLLOW_AND_in_or_subexpr449); 
            	    AND43_tree = (Object)adaptor.create(AND43);
            	    root_0 = (Object)adaptor.becomeRoot(AND43_tree, root_0);

            	    pushFollow(FOLLOW_and_subexpr_in_or_subexpr452);
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
    // Sql.g:106:1: and_subexpr : eq_subexpr ( cond_expr )? ;
    public final SqlParser.and_subexpr_return and_subexpr() throws RecognitionException {
        SqlParser.and_subexpr_return retval = new SqlParser.and_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.eq_subexpr_return eq_subexpr45 = null;

        SqlParser.cond_expr_return cond_expr46 = null;



        try {
            // Sql.g:106:12: ( eq_subexpr ( cond_expr )? )
            // Sql.g:106:14: eq_subexpr ( cond_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_eq_subexpr_in_and_subexpr461);
            eq_subexpr45=eq_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, eq_subexpr45.getTree());
            // Sql.g:106:34: ( cond_expr )?
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // Sql.g:106:34: cond_expr
                    {
                    pushFollow(FOLLOW_cond_expr_in_and_subexpr463);
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
    // Sql.g:108:1: cond_expr : ( ( NOT )? match_op match_expr= eq_subexpr ( ESCAPE escape_expr= eq_subexpr )? -> ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? ) | ( NOT )? IN LPAREN expr ( COMMA expr )* RPAREN -> ^( IN_VALUES ( NOT )? ^( IN ( expr )+ ) ) | ( NOT )? IN (database_name= id DOT )? table_name= id -> ^( IN_TABLE ( NOT )? ^( IN ^( $table_name ( $database_name)? ) ) ) | ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL ) | ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr -> ^( BETWEEN ( NOT )? ^( AND $e1 $e2) ) | ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )+ );
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
            // Sql.g:109:3: ( ( NOT )? match_op match_expr= eq_subexpr ( ESCAPE escape_expr= eq_subexpr )? -> ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? ) | ( NOT )? IN LPAREN expr ( COMMA expr )* RPAREN -> ^( IN_VALUES ( NOT )? ^( IN ( expr )+ ) ) | ( NOT )? IN (database_name= id DOT )? table_name= id -> ^( IN_TABLE ( NOT )? ^( IN ^( $table_name ( $database_name)? ) ) ) | ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL ) | ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr -> ^( BETWEEN ( NOT )? ^( AND $e1 $e2) ) | ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )+ )
            int alt20=6;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // Sql.g:109:5: ( NOT )? match_op match_expr= eq_subexpr ( ESCAPE escape_expr= eq_subexpr )?
                    {
                    // Sql.g:109:5: ( NOT )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==NOT) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // Sql.g:109:5: NOT
                            {
                            NOT47=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr475);  
                            stream_NOT.add(NOT47);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_match_op_in_cond_expr478);
                    match_op48=match_op();

                    state._fsp--;

                    stream_match_op.add(match_op48.getTree());
                    pushFollow(FOLLOW_eq_subexpr_in_cond_expr482);
                    match_expr=eq_subexpr();

                    state._fsp--;

                    stream_eq_subexpr.add(match_expr.getTree());
                    // Sql.g:109:41: ( ESCAPE escape_expr= eq_subexpr )?
                    int alt12=2;
                    alt12 = dfa12.predict(input);
                    switch (alt12) {
                        case 1 :
                            // Sql.g:109:42: ESCAPE escape_expr= eq_subexpr
                            {
                            ESCAPE49=(Token)match(input,ESCAPE,FOLLOW_ESCAPE_in_cond_expr485);  
                            stream_ESCAPE.add(ESCAPE49);

                            pushFollow(FOLLOW_eq_subexpr_in_cond_expr489);
                            escape_expr=eq_subexpr();

                            state._fsp--;

                            stream_eq_subexpr.add(escape_expr.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: match_expr, ESCAPE, escape_expr, match_op, NOT
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
                    // 109:74: -> ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? )
                    {
                        // Sql.g:109:77: ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_match_op.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_match_expr.nextTree());
                        // Sql.g:109:100: ( NOT )?
                        if ( stream_NOT.hasNext() ) {
                            adaptor.addChild(root_1, stream_NOT.nextNode());

                        }
                        stream_NOT.reset();
                        // Sql.g:109:105: ( ^( ESCAPE $escape_expr) )?
                        if ( stream_ESCAPE.hasNext()||stream_escape_expr.hasNext() ) {
                            // Sql.g:109:105: ^( ESCAPE $escape_expr)
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
                    // Sql.g:110:5: ( NOT )? IN LPAREN expr ( COMMA expr )* RPAREN
                    {
                    // Sql.g:110:5: ( NOT )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==NOT) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // Sql.g:110:5: NOT
                            {
                            NOT50=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr517);  
                            stream_NOT.add(NOT50);


                            }
                            break;

                    }

                    IN51=(Token)match(input,IN,FOLLOW_IN_in_cond_expr520);  
                    stream_IN.add(IN51);

                    LPAREN52=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cond_expr522);  
                    stream_LPAREN.add(LPAREN52);

                    pushFollow(FOLLOW_expr_in_cond_expr524);
                    expr53=expr();

                    state._fsp--;

                    stream_expr.add(expr53.getTree());
                    // Sql.g:110:25: ( COMMA expr )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==COMMA) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // Sql.g:110:26: COMMA expr
                    	    {
                    	    COMMA54=(Token)match(input,COMMA,FOLLOW_COMMA_in_cond_expr527);  
                    	    stream_COMMA.add(COMMA54);

                    	    pushFollow(FOLLOW_expr_in_cond_expr529);
                    	    expr55=expr();

                    	    state._fsp--;

                    	    stream_expr.add(expr55.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    RPAREN56=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cond_expr533);  
                    stream_RPAREN.add(RPAREN56);



                    // AST REWRITE
                    // elements: expr, NOT, IN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 110:46: -> ^( IN_VALUES ( NOT )? ^( IN ( expr )+ ) )
                    {
                        // Sql.g:110:49: ^( IN_VALUES ( NOT )? ^( IN ( expr )+ ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN_VALUES, "IN_VALUES"), root_1);

                        // Sql.g:110:61: ( NOT )?
                        if ( stream_NOT.hasNext() ) {
                            adaptor.addChild(root_1, stream_NOT.nextNode());

                        }
                        stream_NOT.reset();
                        // Sql.g:110:66: ^( IN ( expr )+ )
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
                    // Sql.g:111:5: ( NOT )? IN (database_name= id DOT )? table_name= id
                    {
                    // Sql.g:111:5: ( NOT )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==NOT) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // Sql.g:111:5: NOT
                            {
                            NOT57=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr555);  
                            stream_NOT.add(NOT57);


                            }
                            break;

                    }

                    IN58=(Token)match(input,IN,FOLLOW_IN_in_cond_expr558);  
                    stream_IN.add(IN58);

                    // Sql.g:111:13: (database_name= id DOT )?
                    int alt16=2;
                    alt16 = dfa16.predict(input);
                    switch (alt16) {
                        case 1 :
                            // Sql.g:111:14: database_name= id DOT
                            {
                            pushFollow(FOLLOW_id_in_cond_expr563);
                            database_name=id();

                            state._fsp--;

                            stream_id.add(database_name.getTree());
                            DOT59=(Token)match(input,DOT,FOLLOW_DOT_in_cond_expr565);  
                            stream_DOT.add(DOT59);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_id_in_cond_expr571);
                    table_name=id();

                    state._fsp--;

                    stream_id.add(table_name.getTree());


                    // AST REWRITE
                    // elements: NOT, database_name, table_name, IN
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
                    // 111:51: -> ^( IN_TABLE ( NOT )? ^( IN ^( $table_name ( $database_name)? ) ) )
                    {
                        // Sql.g:111:54: ^( IN_TABLE ( NOT )? ^( IN ^( $table_name ( $database_name)? ) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN_TABLE, "IN_TABLE"), root_1);

                        // Sql.g:111:65: ( NOT )?
                        if ( stream_NOT.hasNext() ) {
                            adaptor.addChild(root_1, stream_NOT.nextNode());

                        }
                        stream_NOT.reset();
                        // Sql.g:111:70: ^( IN ^( $table_name ( $database_name)? ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_IN.nextNode(), root_2);

                        // Sql.g:111:75: ^( $table_name ( $database_name)? )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_3);

                        // Sql.g:111:89: ( $database_name)?
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
                    // Sql.g:114:5: ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL )
                    {
                    // Sql.g:114:5: ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL )
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
                            // Sql.g:114:6: ISNULL
                            {
                            ISNULL60=(Token)match(input,ISNULL,FOLLOW_ISNULL_in_cond_expr602);  
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
                            // 114:13: -> IS_NULL
                            {
                                adaptor.addChild(root_0, (Object)adaptor.create(IS_NULL, "IS_NULL"));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 2 :
                            // Sql.g:114:26: NOTNULL
                            {
                            NOTNULL61=(Token)match(input,NOTNULL,FOLLOW_NOTNULL_in_cond_expr610);  
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
                            // 114:34: -> NOT_NULL
                            {
                                adaptor.addChild(root_0, (Object)adaptor.create(NOT_NULL, "NOT_NULL"));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 3 :
                            // Sql.g:114:48: IS NULL
                            {
                            IS62=(Token)match(input,IS,FOLLOW_IS_in_cond_expr618);  
                            stream_IS.add(IS62);

                            NULL63=(Token)match(input,NULL,FOLLOW_NULL_in_cond_expr620);  
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
                            // 114:56: -> IS_NULL
                            {
                                adaptor.addChild(root_0, (Object)adaptor.create(IS_NULL, "IS_NULL"));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 4 :
                            // Sql.g:114:69: NOT NULL
                            {
                            NOT64=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr628);  
                            stream_NOT.add(NOT64);

                            NULL65=(Token)match(input,NULL,FOLLOW_NULL_in_cond_expr630);  
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
                            // 114:78: -> NOT_NULL
                            {
                                adaptor.addChild(root_0, (Object)adaptor.create(NOT_NULL, "NOT_NULL"));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 5 :
                            // Sql.g:114:92: IS NOT NULL
                            {
                            IS66=(Token)match(input,IS,FOLLOW_IS_in_cond_expr638);  
                            stream_IS.add(IS66);

                            NOT67=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr640);  
                            stream_NOT.add(NOT67);

                            NULL68=(Token)match(input,NULL,FOLLOW_NULL_in_cond_expr642);  
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
                            // 114:104: -> NOT_NULL
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
                    // Sql.g:115:5: ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr
                    {
                    // Sql.g:115:5: ( NOT )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NOT) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // Sql.g:115:5: NOT
                            {
                            NOT69=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr653);  
                            stream_NOT.add(NOT69);


                            }
                            break;

                    }

                    BETWEEN70=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_cond_expr656);  
                    stream_BETWEEN.add(BETWEEN70);

                    pushFollow(FOLLOW_eq_subexpr_in_cond_expr660);
                    e1=eq_subexpr();

                    state._fsp--;

                    stream_eq_subexpr.add(e1.getTree());
                    AND71=(Token)match(input,AND,FOLLOW_AND_in_cond_expr662);  
                    stream_AND.add(AND71);

                    pushFollow(FOLLOW_eq_subexpr_in_cond_expr666);
                    e2=eq_subexpr();

                    state._fsp--;

                    stream_eq_subexpr.add(e2.getTree());


                    // AST REWRITE
                    // elements: e2, NOT, AND, BETWEEN, e1
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
                    // 115:50: -> ^( BETWEEN ( NOT )? ^( AND $e1 $e2) )
                    {
                        // Sql.g:115:53: ^( BETWEEN ( NOT )? ^( AND $e1 $e2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_BETWEEN.nextNode(), root_1);

                        // Sql.g:115:63: ( NOT )?
                        if ( stream_NOT.hasNext() ) {
                            adaptor.addChild(root_1, stream_NOT.nextNode());

                        }
                        stream_NOT.reset();
                        // Sql.g:115:68: ^( AND $e1 $e2)
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
                    // Sql.g:116:5: ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )+
                    {
                    root_0 = (Object)adaptor.nil();

                    // Sql.g:116:5: ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        alt19 = dfa19.predict(input);
                        switch (alt19) {
                    	case 1 :
                    	    // Sql.g:116:6: ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr
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

                    	    pushFollow(FOLLOW_eq_subexpr_in_cond_expr709);
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
    // Sql.g:119:1: match_op : ( LIKE | GLOB | REGEXP | MATCH );
    public final SqlParser.match_op_return match_op() throws RecognitionException {
        SqlParser.match_op_return retval = new SqlParser.match_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set74=null;

        Object set74_tree=null;

        try {
            // Sql.g:119:9: ( LIKE | GLOB | REGEXP | MATCH )
            // Sql.g:
            {
            root_0 = (Object)adaptor.nil();

            set74=(Token)input.LT(1);
            if ( (input.LA(1)>=LIKE && input.LA(1)<=MATCH) ) {
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
    // Sql.g:121:1: eq_subexpr : neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )* ;
    public final SqlParser.eq_subexpr_return eq_subexpr() throws RecognitionException {
        SqlParser.eq_subexpr_return retval = new SqlParser.eq_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set76=null;
        SqlParser.neq_subexpr_return neq_subexpr75 = null;

        SqlParser.neq_subexpr_return neq_subexpr77 = null;


        Object set76_tree=null;

        try {
            // Sql.g:121:11: ( neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )* )
            // Sql.g:121:13: neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_neq_subexpr_in_eq_subexpr742);
            neq_subexpr75=neq_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, neq_subexpr75.getTree());
            // Sql.g:121:25: ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )*
            loop21:
            do {
                int alt21=2;
                alt21 = dfa21.predict(input);
                switch (alt21) {
            	case 1 :
            	    // Sql.g:121:26: ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr
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

            	    pushFollow(FOLLOW_neq_subexpr_in_eq_subexpr762);
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
    // Sql.g:123:1: neq_subexpr : bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )* ;
    public final SqlParser.neq_subexpr_return neq_subexpr() throws RecognitionException {
        SqlParser.neq_subexpr_return retval = new SqlParser.neq_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set79=null;
        SqlParser.bit_subexpr_return bit_subexpr78 = null;

        SqlParser.bit_subexpr_return bit_subexpr80 = null;


        Object set79_tree=null;

        try {
            // Sql.g:123:12: ( bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )* )
            // Sql.g:123:14: bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bit_subexpr_in_neq_subexpr771);
            bit_subexpr78=bit_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, bit_subexpr78.getTree());
            // Sql.g:123:26: ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )*
            loop22:
            do {
                int alt22=2;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // Sql.g:123:27: ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr
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

            	    pushFollow(FOLLOW_bit_subexpr_in_neq_subexpr791);
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
    // Sql.g:125:1: bit_subexpr : add_subexpr ( ( PLUS | MINUS ) add_subexpr )* ;
    public final SqlParser.bit_subexpr_return bit_subexpr() throws RecognitionException {
        SqlParser.bit_subexpr_return retval = new SqlParser.bit_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set82=null;
        SqlParser.add_subexpr_return add_subexpr81 = null;

        SqlParser.add_subexpr_return add_subexpr83 = null;


        Object set82_tree=null;

        try {
            // Sql.g:125:12: ( add_subexpr ( ( PLUS | MINUS ) add_subexpr )* )
            // Sql.g:125:14: add_subexpr ( ( PLUS | MINUS ) add_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_subexpr_in_bit_subexpr800);
            add_subexpr81=add_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, add_subexpr81.getTree());
            // Sql.g:125:26: ( ( PLUS | MINUS ) add_subexpr )*
            loop23:
            do {
                int alt23=2;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // Sql.g:125:27: ( PLUS | MINUS ) add_subexpr
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

            	    pushFollow(FOLLOW_add_subexpr_in_bit_subexpr812);
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
    // Sql.g:127:1: add_subexpr : mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )* ;
    public final SqlParser.add_subexpr_return add_subexpr() throws RecognitionException {
        SqlParser.add_subexpr_return retval = new SqlParser.add_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set85=null;
        SqlParser.mul_subexpr_return mul_subexpr84 = null;

        SqlParser.mul_subexpr_return mul_subexpr86 = null;


        Object set85_tree=null;

        try {
            // Sql.g:127:12: ( mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )* )
            // Sql.g:127:14: mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mul_subexpr_in_add_subexpr821);
            mul_subexpr84=mul_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, mul_subexpr84.getTree());
            // Sql.g:127:26: ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )*
            loop24:
            do {
                int alt24=2;
                alt24 = dfa24.predict(input);
                switch (alt24) {
            	case 1 :
            	    // Sql.g:127:27: ( ASTERISK | SLASH | PERCENT ) mul_subexpr
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

            	    pushFollow(FOLLOW_mul_subexpr_in_add_subexpr837);
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
    // Sql.g:129:1: mul_subexpr : con_subexpr ( DOUBLE_PIPE con_subexpr )* ;
    public final SqlParser.mul_subexpr_return mul_subexpr() throws RecognitionException {
        SqlParser.mul_subexpr_return retval = new SqlParser.mul_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOUBLE_PIPE88=null;
        SqlParser.con_subexpr_return con_subexpr87 = null;

        SqlParser.con_subexpr_return con_subexpr89 = null;


        Object DOUBLE_PIPE88_tree=null;

        try {
            // Sql.g:129:12: ( con_subexpr ( DOUBLE_PIPE con_subexpr )* )
            // Sql.g:129:14: con_subexpr ( DOUBLE_PIPE con_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_con_subexpr_in_mul_subexpr846);
            con_subexpr87=con_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, con_subexpr87.getTree());
            // Sql.g:129:26: ( DOUBLE_PIPE con_subexpr )*
            loop25:
            do {
                int alt25=2;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // Sql.g:129:27: DOUBLE_PIPE con_subexpr
            	    {
            	    DOUBLE_PIPE88=(Token)match(input,DOUBLE_PIPE,FOLLOW_DOUBLE_PIPE_in_mul_subexpr849); 
            	    DOUBLE_PIPE88_tree = (Object)adaptor.create(DOUBLE_PIPE88);
            	    root_0 = (Object)adaptor.becomeRoot(DOUBLE_PIPE88_tree, root_0);

            	    pushFollow(FOLLOW_con_subexpr_in_mul_subexpr852);
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
    // Sql.g:131:1: con_subexpr : ( unary_subexpr | unary_op unary_subexpr -> ^( unary_op unary_subexpr ) );
    public final SqlParser.con_subexpr_return con_subexpr() throws RecognitionException {
        SqlParser.con_subexpr_return retval = new SqlParser.con_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.unary_subexpr_return unary_subexpr90 = null;

        SqlParser.unary_op_return unary_op91 = null;

        SqlParser.unary_subexpr_return unary_subexpr92 = null;


        RewriteRuleSubtreeStream stream_unary_subexpr=new RewriteRuleSubtreeStream(adaptor,"rule unary_subexpr");
        RewriteRuleSubtreeStream stream_unary_op=new RewriteRuleSubtreeStream(adaptor,"rule unary_op");
        try {
            // Sql.g:131:12: ( unary_subexpr | unary_op unary_subexpr -> ^( unary_op unary_subexpr ) )
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // Sql.g:131:14: unary_subexpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unary_subexpr_in_con_subexpr861);
                    unary_subexpr90=unary_subexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, unary_subexpr90.getTree());

                    }
                    break;
                case 2 :
                    // Sql.g:131:30: unary_op unary_subexpr
                    {
                    pushFollow(FOLLOW_unary_op_in_con_subexpr865);
                    unary_op91=unary_op();

                    state._fsp--;

                    stream_unary_op.add(unary_op91.getTree());
                    pushFollow(FOLLOW_unary_subexpr_in_con_subexpr867);
                    unary_subexpr92=unary_subexpr();

                    state._fsp--;

                    stream_unary_subexpr.add(unary_subexpr92.getTree());


                    // AST REWRITE
                    // elements: unary_op, unary_subexpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 131:53: -> ^( unary_op unary_subexpr )
                    {
                        // Sql.g:131:56: ^( unary_op unary_subexpr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_unary_op.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_unary_subexpr.nextTree());

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
    // $ANTLR end "con_subexpr"

    public static class unary_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_op"
    // Sql.g:133:1: unary_op : ( PLUS | MINUS | TILDA | NOT );
    public final SqlParser.unary_op_return unary_op() throws RecognitionException {
        SqlParser.unary_op_return retval = new SqlParser.unary_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set93=null;

        Object set93_tree=null;

        try {
            // Sql.g:133:9: ( PLUS | MINUS | TILDA | NOT )
            // Sql.g:
            {
            root_0 = (Object)adaptor.nil();

            set93=(Token)input.LT(1);
            if ( (input.LA(1)>=NOT && input.LA(1)<=MINUS)||input.LA(1)==TILDA ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set93));
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
    // $ANTLR end "unary_op"

    public static class unary_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_subexpr"
    // Sql.g:135:1: unary_subexpr : atom_expr ( COLLATE collation_name= ID )? ;
    public final SqlParser.unary_subexpr_return unary_subexpr() throws RecognitionException {
        SqlParser.unary_subexpr_return retval = new SqlParser.unary_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token collation_name=null;
        Token COLLATE95=null;
        SqlParser.atom_expr_return atom_expr94 = null;


        Object collation_name_tree=null;
        Object COLLATE95_tree=null;

        try {
            // Sql.g:135:14: ( atom_expr ( COLLATE collation_name= ID )? )
            // Sql.g:135:16: atom_expr ( COLLATE collation_name= ID )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atom_expr_in_unary_subexpr901);
            atom_expr94=atom_expr();

            state._fsp--;

            adaptor.addChild(root_0, atom_expr94.getTree());
            // Sql.g:135:26: ( COLLATE collation_name= ID )?
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // Sql.g:135:27: COLLATE collation_name= ID
                    {
                    COLLATE95=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_unary_subexpr904); 
                    COLLATE95_tree = (Object)adaptor.create(COLLATE95);
                    root_0 = (Object)adaptor.becomeRoot(COLLATE95_tree, root_0);

                    collation_name=(Token)match(input,ID,FOLLOW_ID_in_unary_subexpr909); 
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
    // Sql.g:137:1: atom_expr : ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) | name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN -> ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? ) | LPAREN expr RPAREN | CAST LPAREN expr AS type_name RPAREN | CASE (case_expr= expr )? ( when_expr )+ ( ELSE else_expr= expr )? END -> ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? ) | raise_function );
    public final SqlParser.atom_expr_return atom_expr() throws RecognitionException {
        SqlParser.atom_expr_return retval = new SqlParser.atom_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token column_name=null;
        Token name=null;
        Token DOT98=null;
        Token DOT99=null;
        Token LPAREN100=null;
        Token DISTINCT101=null;
        Token COMMA102=null;
        Token ASTERISK103=null;
        Token RPAREN104=null;
        Token LPAREN105=null;
        Token RPAREN107=null;
        Token CAST108=null;
        Token LPAREN109=null;
        Token AS111=null;
        Token RPAREN113=null;
        Token CASE114=null;
        Token ELSE116=null;
        Token END117=null;
        List list_args=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.expr_return case_expr = null;

        SqlParser.expr_return else_expr = null;

        SqlParser.literal_value_return literal_value96 = null;

        SqlParser.bind_parameter_return bind_parameter97 = null;

        SqlParser.expr_return expr106 = null;

        SqlParser.expr_return expr110 = null;

        SqlParser.type_name_return type_name112 = null;

        SqlParser.when_expr_return when_expr115 = null;

        SqlParser.raise_function_return raise_function118 = null;

        SqlParser.expr_return args = null;
         args = null;
        Object column_name_tree=null;
        Object name_tree=null;
        Object DOT98_tree=null;
        Object DOT99_tree=null;
        Object LPAREN100_tree=null;
        Object DISTINCT101_tree=null;
        Object COMMA102_tree=null;
        Object ASTERISK103_tree=null;
        Object RPAREN104_tree=null;
        Object LPAREN105_tree=null;
        Object RPAREN107_tree=null;
        Object CAST108_tree=null;
        Object LPAREN109_tree=null;
        Object AS111_tree=null;
        Object RPAREN113_tree=null;
        Object CASE114_tree=null;
        Object ELSE116_tree=null;
        Object END117_tree=null;
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
            // Sql.g:138:3: ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) | name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN -> ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? ) | LPAREN expr RPAREN | CAST LPAREN expr AS type_name RPAREN | CASE (case_expr= expr )? ( when_expr )+ ( ELSE else_expr= expr )? END -> ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? ) | raise_function )
            int alt36=8;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // Sql.g:138:5: literal_value
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_value_in_atom_expr921);
                    literal_value96=literal_value();

                    state._fsp--;

                    adaptor.addChild(root_0, literal_value96.getTree());

                    }
                    break;
                case 2 :
                    // Sql.g:139:5: bind_parameter
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_bind_parameter_in_atom_expr927);
                    bind_parameter97=bind_parameter();

                    state._fsp--;

                    adaptor.addChild(root_0, bind_parameter97.getTree());

                    }
                    break;
                case 3 :
                    // Sql.g:140:5: ( (database_name= id DOT )? table_name= id DOT )? column_name= ID
                    {
                    // Sql.g:140:5: ( (database_name= id DOT )? table_name= id DOT )?
                    int alt29=2;
                    alt29 = dfa29.predict(input);
                    switch (alt29) {
                        case 1 :
                            // Sql.g:140:6: (database_name= id DOT )? table_name= id DOT
                            {
                            // Sql.g:140:6: (database_name= id DOT )?
                            int alt28=2;
                            alt28 = dfa28.predict(input);
                            switch (alt28) {
                                case 1 :
                                    // Sql.g:140:7: database_name= id DOT
                                    {
                                    pushFollow(FOLLOW_id_in_atom_expr937);
                                    database_name=id();

                                    state._fsp--;

                                    stream_id.add(database_name.getTree());
                                    DOT98=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expr939);  
                                    stream_DOT.add(DOT98);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_id_in_atom_expr945);
                            table_name=id();

                            state._fsp--;

                            stream_id.add(table_name.getTree());
                            DOT99=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expr947);  
                            stream_DOT.add(DOT99);


                            }
                            break;

                    }

                    column_name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr953);  
                    stream_ID.add(column_name);



                    // AST REWRITE
                    // elements: column_name, database_name, table_name
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
                    // 140:65: -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) )
                    {
                        // Sql.g:140:68: ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMN_EXPRESSION, "COLUMN_EXPRESSION"), root_1);

                        // Sql.g:140:88: ^( $column_name ( ^( $table_name ( $database_name)? ) )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_column_name.nextNode(), root_2);

                        // Sql.g:140:103: ( ^( $table_name ( $database_name)? ) )?
                        if ( stream_database_name.hasNext()||stream_table_name.hasNext() ) {
                            // Sql.g:140:103: ^( $table_name ( $database_name)? )
                            {
                            Object root_3 = (Object)adaptor.nil();
                            root_3 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_3);

                            // Sql.g:140:117: ( $database_name)?
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
                    // Sql.g:141:5: name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN
                    {
                    name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr982);  
                    stream_ID.add(name);

                    LPAREN100=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr984);  
                    stream_LPAREN.add(LPAREN100);

                    // Sql.g:141:20: ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )?
                    int alt32=3;
                    alt32 = dfa32.predict(input);
                    switch (alt32) {
                        case 1 :
                            // Sql.g:141:21: ( DISTINCT )? args+= expr ( COMMA args+= expr )*
                            {
                            // Sql.g:141:21: ( DISTINCT )?
                            int alt30=2;
                            alt30 = dfa30.predict(input);
                            switch (alt30) {
                                case 1 :
                                    // Sql.g:141:21: DISTINCT
                                    {
                                    DISTINCT101=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_atom_expr987);  
                                    stream_DISTINCT.add(DISTINCT101);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_expr_in_atom_expr992);
                            args=expr();

                            state._fsp--;

                            stream_expr.add(args.getTree());
                            if (list_args==null) list_args=new ArrayList();
                            list_args.add(args.getTree());

                            // Sql.g:141:42: ( COMMA args+= expr )*
                            loop31:
                            do {
                                int alt31=2;
                                int LA31_0 = input.LA(1);

                                if ( (LA31_0==COMMA) ) {
                                    alt31=1;
                                }


                                switch (alt31) {
                            	case 1 :
                            	    // Sql.g:141:43: COMMA args+= expr
                            	    {
                            	    COMMA102=(Token)match(input,COMMA,FOLLOW_COMMA_in_atom_expr995);  
                            	    stream_COMMA.add(COMMA102);

                            	    pushFollow(FOLLOW_expr_in_atom_expr999);
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
                            // Sql.g:141:64: ASTERISK
                            {
                            ASTERISK103=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_atom_expr1005);  
                            stream_ASTERISK.add(ASTERISK103);


                            }
                            break;

                    }

                    RPAREN104=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr1009);  
                    stream_RPAREN.add(RPAREN104);



                    // AST REWRITE
                    // elements: DISTINCT, args, ASTERISK, name
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
                    // 141:82: -> ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? )
                    {
                        // Sql.g:141:85: ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION_EXPRESSION, "FUNCTION_EXPRESSION"), root_1);

                        adaptor.addChild(root_1, stream_name.nextNode());
                        // Sql.g:141:113: ( DISTINCT )?
                        if ( stream_DISTINCT.hasNext() ) {
                            adaptor.addChild(root_1, stream_DISTINCT.nextNode());

                        }
                        stream_DISTINCT.reset();
                        // Sql.g:141:123: ( $args)*
                        while ( stream_args.hasNext() ) {
                            adaptor.addChild(root_1, stream_args.nextTree());

                        }
                        stream_args.reset();
                        // Sql.g:141:130: ( ASTERISK )?
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
                    // Sql.g:142:5: LPAREN expr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN105=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr1034); 
                    pushFollow(FOLLOW_expr_in_atom_expr1037);
                    expr106=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr106.getTree());
                    RPAREN107=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr1039); 

                    }
                    break;
                case 6 :
                    // Sql.g:143:5: CAST LPAREN expr AS type_name RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    CAST108=(Token)match(input,CAST,FOLLOW_CAST_in_atom_expr1046); 
                    CAST108_tree = (Object)adaptor.create(CAST108);
                    root_0 = (Object)adaptor.becomeRoot(CAST108_tree, root_0);

                    LPAREN109=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr1049); 
                    pushFollow(FOLLOW_expr_in_atom_expr1052);
                    expr110=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr110.getTree());
                    AS111=(Token)match(input,AS,FOLLOW_AS_in_atom_expr1054); 
                    pushFollow(FOLLOW_type_name_in_atom_expr1057);
                    type_name112=type_name();

                    state._fsp--;

                    adaptor.addChild(root_0, type_name112.getTree());
                    RPAREN113=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr1059); 

                    }
                    break;
                case 7 :
                    // Sql.g:146:5: CASE (case_expr= expr )? ( when_expr )+ ( ELSE else_expr= expr )? END
                    {
                    CASE114=(Token)match(input,CASE,FOLLOW_CASE_in_atom_expr1068);  
                    stream_CASE.add(CASE114);

                    // Sql.g:146:10: (case_expr= expr )?
                    int alt33=2;
                    alt33 = dfa33.predict(input);
                    switch (alt33) {
                        case 1 :
                            // Sql.g:146:11: case_expr= expr
                            {
                            pushFollow(FOLLOW_expr_in_atom_expr1073);
                            case_expr=expr();

                            state._fsp--;

                            stream_expr.add(case_expr.getTree());

                            }
                            break;

                    }

                    // Sql.g:146:28: ( when_expr )+
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
                    	    // Sql.g:146:28: when_expr
                    	    {
                    	    pushFollow(FOLLOW_when_expr_in_atom_expr1077);
                    	    when_expr115=when_expr();

                    	    state._fsp--;

                    	    stream_when_expr.add(when_expr115.getTree());

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

                    // Sql.g:146:39: ( ELSE else_expr= expr )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==ELSE) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // Sql.g:146:40: ELSE else_expr= expr
                            {
                            ELSE116=(Token)match(input,ELSE,FOLLOW_ELSE_in_atom_expr1081);  
                            stream_ELSE.add(ELSE116);

                            pushFollow(FOLLOW_expr_in_atom_expr1085);
                            else_expr=expr();

                            state._fsp--;

                            stream_expr.add(else_expr.getTree());

                            }
                            break;

                    }

                    END117=(Token)match(input,END,FOLLOW_END_in_atom_expr1089);  
                    stream_END.add(END117);



                    // AST REWRITE
                    // elements: else_expr, case_expr, when_expr, CASE
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
                    // 146:66: -> ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? )
                    {
                        // Sql.g:146:69: ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CASE.nextNode(), root_1);

                        // Sql.g:146:76: ( $case_expr)?
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
                        // Sql.g:146:99: ( $else_expr)?
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
                    // Sql.g:147:5: raise_function
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_raise_function_in_atom_expr1112);
                    raise_function118=raise_function();

                    state._fsp--;

                    adaptor.addChild(root_0, raise_function118.getTree());

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
    // Sql.g:150:1: when_expr : WHEN e1= expr THEN e2= expr -> ^( WHEN $e1 $e2) ;
    public final SqlParser.when_expr_return when_expr() throws RecognitionException {
        SqlParser.when_expr_return retval = new SqlParser.when_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHEN119=null;
        Token THEN120=null;
        SqlParser.expr_return e1 = null;

        SqlParser.expr_return e2 = null;


        Object WHEN119_tree=null;
        Object THEN120_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_WHEN=new RewriteRuleTokenStream(adaptor,"token WHEN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Sql.g:150:10: ( WHEN e1= expr THEN e2= expr -> ^( WHEN $e1 $e2) )
            // Sql.g:150:12: WHEN e1= expr THEN e2= expr
            {
            WHEN119=(Token)match(input,WHEN,FOLLOW_WHEN_in_when_expr1122);  
            stream_WHEN.add(WHEN119);

            pushFollow(FOLLOW_expr_in_when_expr1126);
            e1=expr();

            state._fsp--;

            stream_expr.add(e1.getTree());
            THEN120=(Token)match(input,THEN,FOLLOW_THEN_in_when_expr1128);  
            stream_THEN.add(THEN120);

            pushFollow(FOLLOW_expr_in_when_expr1132);
            e2=expr();

            state._fsp--;

            stream_expr.add(e2.getTree());


            // AST REWRITE
            // elements: e1, e2, WHEN
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
            // 150:38: -> ^( WHEN $e1 $e2)
            {
                // Sql.g:150:41: ^( WHEN $e1 $e2)
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
    // Sql.g:152:1: literal_value : ( INTEGER -> ^( INTEGER_LITERAL INTEGER ) | FLOAT -> ^( FLOAT_LITERAL FLOAT ) | STRING -> ^( STRING_LITERAL STRING ) | BLOB -> ^( BLOB_LITERAL BLOB ) | NULL | CURRENT_TIME -> ^( FUNCTION_LITERAL CURRENT_TIME ) | CURRENT_DATE -> ^( FUNCTION_LITERAL CURRENT_DATE ) | CURRENT_TIMESTAMP -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP ) );
    public final SqlParser.literal_value_return literal_value() throws RecognitionException {
        SqlParser.literal_value_return retval = new SqlParser.literal_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INTEGER121=null;
        Token FLOAT122=null;
        Token STRING123=null;
        Token BLOB124=null;
        Token NULL125=null;
        Token CURRENT_TIME126=null;
        Token CURRENT_DATE127=null;
        Token CURRENT_TIMESTAMP128=null;

        Object INTEGER121_tree=null;
        Object FLOAT122_tree=null;
        Object STRING123_tree=null;
        Object BLOB124_tree=null;
        Object NULL125_tree=null;
        Object CURRENT_TIME126_tree=null;
        Object CURRENT_DATE127_tree=null;
        Object CURRENT_TIMESTAMP128_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_BLOB=new RewriteRuleTokenStream(adaptor,"token BLOB");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_CURRENT_TIMESTAMP=new RewriteRuleTokenStream(adaptor,"token CURRENT_TIMESTAMP");
        RewriteRuleTokenStream stream_CURRENT_DATE=new RewriteRuleTokenStream(adaptor,"token CURRENT_DATE");
        RewriteRuleTokenStream stream_CURRENT_TIME=new RewriteRuleTokenStream(adaptor,"token CURRENT_TIME");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // Sql.g:153:3: ( INTEGER -> ^( INTEGER_LITERAL INTEGER ) | FLOAT -> ^( FLOAT_LITERAL FLOAT ) | STRING -> ^( STRING_LITERAL STRING ) | BLOB -> ^( BLOB_LITERAL BLOB ) | NULL | CURRENT_TIME -> ^( FUNCTION_LITERAL CURRENT_TIME ) | CURRENT_DATE -> ^( FUNCTION_LITERAL CURRENT_DATE ) | CURRENT_TIMESTAMP -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP ) )
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
                    // Sql.g:153:5: INTEGER
                    {
                    INTEGER121=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_literal_value1154);  
                    stream_INTEGER.add(INTEGER121);



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
                    // 153:13: -> ^( INTEGER_LITERAL INTEGER )
                    {
                        // Sql.g:153:16: ^( INTEGER_LITERAL INTEGER )
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
                    // Sql.g:154:5: FLOAT
                    {
                    FLOAT122=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_literal_value1168);  
                    stream_FLOAT.add(FLOAT122);



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
                    // 154:11: -> ^( FLOAT_LITERAL FLOAT )
                    {
                        // Sql.g:154:14: ^( FLOAT_LITERAL FLOAT )
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
                    // Sql.g:155:5: STRING
                    {
                    STRING123=(Token)match(input,STRING,FOLLOW_STRING_in_literal_value1182);  
                    stream_STRING.add(STRING123);



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
                    // 155:12: -> ^( STRING_LITERAL STRING )
                    {
                        // Sql.g:155:15: ^( STRING_LITERAL STRING )
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
                    // Sql.g:156:5: BLOB
                    {
                    BLOB124=(Token)match(input,BLOB,FOLLOW_BLOB_in_literal_value1196);  
                    stream_BLOB.add(BLOB124);



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
                    // 156:10: -> ^( BLOB_LITERAL BLOB )
                    {
                        // Sql.g:156:13: ^( BLOB_LITERAL BLOB )
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
                    // Sql.g:157:5: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL125=(Token)match(input,NULL,FOLLOW_NULL_in_literal_value1210); 
                    NULL125_tree = (Object)adaptor.create(NULL125);
                    adaptor.addChild(root_0, NULL125_tree);


                    }
                    break;
                case 6 :
                    // Sql.g:158:5: CURRENT_TIME
                    {
                    CURRENT_TIME126=(Token)match(input,CURRENT_TIME,FOLLOW_CURRENT_TIME_in_literal_value1216);  
                    stream_CURRENT_TIME.add(CURRENT_TIME126);



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
                    // 158:18: -> ^( FUNCTION_LITERAL CURRENT_TIME )
                    {
                        // Sql.g:158:21: ^( FUNCTION_LITERAL CURRENT_TIME )
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
                    // Sql.g:159:5: CURRENT_DATE
                    {
                    CURRENT_DATE127=(Token)match(input,CURRENT_DATE,FOLLOW_CURRENT_DATE_in_literal_value1230);  
                    stream_CURRENT_DATE.add(CURRENT_DATE127);



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
                    // 159:18: -> ^( FUNCTION_LITERAL CURRENT_DATE )
                    {
                        // Sql.g:159:21: ^( FUNCTION_LITERAL CURRENT_DATE )
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
                    // Sql.g:160:5: CURRENT_TIMESTAMP
                    {
                    CURRENT_TIMESTAMP128=(Token)match(input,CURRENT_TIMESTAMP,FOLLOW_CURRENT_TIMESTAMP_in_literal_value1244);  
                    stream_CURRENT_TIMESTAMP.add(CURRENT_TIMESTAMP128);



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
                    // 160:23: -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP )
                    {
                        // Sql.g:160:26: ^( FUNCTION_LITERAL CURRENT_TIMESTAMP )
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
    // Sql.g:163:1: bind_parameter : ( QUESTION -> BIND | QUESTION position= INTEGER -> ^( BIND $position) | COLON name= id -> ^( BIND_NAME $name) | AT name= id -> ^( BIND_NAME $name) );
    public final SqlParser.bind_parameter_return bind_parameter() throws RecognitionException {
        SqlParser.bind_parameter_return retval = new SqlParser.bind_parameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token position=null;
        Token QUESTION129=null;
        Token QUESTION130=null;
        Token COLON131=null;
        Token AT132=null;
        SqlParser.id_return name = null;


        Object position_tree=null;
        Object QUESTION129_tree=null;
        Object QUESTION130_tree=null;
        Object COLON131_tree=null;
        Object AT132_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // Sql.g:164:3: ( QUESTION -> BIND | QUESTION position= INTEGER -> ^( BIND $position) | COLON name= id -> ^( BIND_NAME $name) | AT name= id -> ^( BIND_NAME $name) )
            int alt38=4;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // Sql.g:164:5: QUESTION
                    {
                    QUESTION129=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_bind_parameter1265);  
                    stream_QUESTION.add(QUESTION129);



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
                    // 164:14: -> BIND
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(BIND, "BIND"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Sql.g:165:5: QUESTION position= INTEGER
                    {
                    QUESTION130=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_bind_parameter1275);  
                    stream_QUESTION.add(QUESTION130);

                    position=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_bind_parameter1279);  
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
                    // 165:31: -> ^( BIND $position)
                    {
                        // Sql.g:165:34: ^( BIND $position)
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
                    // Sql.g:166:5: COLON name= id
                    {
                    COLON131=(Token)match(input,COLON,FOLLOW_COLON_in_bind_parameter1294);  
                    stream_COLON.add(COLON131);

                    pushFollow(FOLLOW_id_in_bind_parameter1298);
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
                    // 166:19: -> ^( BIND_NAME $name)
                    {
                        // Sql.g:166:22: ^( BIND_NAME $name)
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
                    // Sql.g:167:5: AT name= id
                    {
                    AT132=(Token)match(input,AT,FOLLOW_AT_in_bind_parameter1313);  
                    stream_AT.add(AT132);

                    pushFollow(FOLLOW_id_in_bind_parameter1317);
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
                    // 167:16: -> ^( BIND_NAME $name)
                    {
                        // Sql.g:167:19: ^( BIND_NAME $name)
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
    // Sql.g:172:1: raise_function : RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN ;
    public final SqlParser.raise_function_return raise_function() throws RecognitionException {
        SqlParser.raise_function_return retval = new SqlParser.raise_function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token error_message=null;
        Token RAISE133=null;
        Token LPAREN134=null;
        Token IGNORE135=null;
        Token set136=null;
        Token COMMA137=null;
        Token RPAREN138=null;

        Object error_message_tree=null;
        Object RAISE133_tree=null;
        Object LPAREN134_tree=null;
        Object IGNORE135_tree=null;
        Object set136_tree=null;
        Object COMMA137_tree=null;
        Object RPAREN138_tree=null;

        try {
            // Sql.g:172:15: ( RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN )
            // Sql.g:172:17: RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN
            {
            root_0 = (Object)adaptor.nil();

            RAISE133=(Token)match(input,RAISE,FOLLOW_RAISE_in_raise_function1338); 
            RAISE133_tree = (Object)adaptor.create(RAISE133);
            root_0 = (Object)adaptor.becomeRoot(RAISE133_tree, root_0);

            LPAREN134=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_raise_function1341); 
            // Sql.g:172:32: ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==IGNORE) ) {
                alt39=1;
            }
            else if ( ((LA39_0>=ROLLBACK && LA39_0<=FAIL)) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // Sql.g:172:33: IGNORE
                    {
                    IGNORE135=(Token)match(input,IGNORE,FOLLOW_IGNORE_in_raise_function1345); 
                    IGNORE135_tree = (Object)adaptor.create(IGNORE135);
                    adaptor.addChild(root_0, IGNORE135_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:172:42: ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING
                    {
                    set136=(Token)input.LT(1);
                    if ( (input.LA(1)>=ROLLBACK && input.LA(1)<=FAIL) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set136));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    COMMA137=(Token)match(input,COMMA,FOLLOW_COMMA_in_raise_function1361); 
                    error_message=(Token)match(input,STRING,FOLLOW_STRING_in_raise_function1366); 
                    error_message_tree = (Object)adaptor.create(error_message);
                    adaptor.addChild(root_0, error_message_tree);


                    }
                    break;

            }

            RPAREN138=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_raise_function1369); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:174:1: type_name : (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )? -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ ) ;
    public final SqlParser.type_name_return type_name() throws RecognitionException {
        SqlParser.type_name_return retval = new SqlParser.type_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN139=null;
        Token COMMA140=null;
        Token RPAREN141=null;
        Token names=null;
        List list_names=null;
        SqlParser.signed_number_return size1 = null;

        SqlParser.signed_number_return size2 = null;


        Object LPAREN139_tree=null;
        Object COMMA140_tree=null;
        Object RPAREN141_tree=null;
        Object names_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_signed_number=new RewriteRuleSubtreeStream(adaptor,"rule signed_number");
        try {
            // Sql.g:174:10: ( (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )? -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ ) )
            // Sql.g:174:12: (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )?
            {
            // Sql.g:174:17: (names+= ID )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                alt40 = dfa40.predict(input);
                switch (alt40) {
            	case 1 :
            	    // Sql.g:174:17: names+= ID
            	    {
            	    names=(Token)match(input,ID,FOLLOW_ID_in_type_name1379);  
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

            // Sql.g:174:23: ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )?
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // Sql.g:174:24: LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN
                    {
                    LPAREN139=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_type_name1383);  
                    stream_LPAREN.add(LPAREN139);

                    pushFollow(FOLLOW_signed_number_in_type_name1387);
                    size1=signed_number();

                    state._fsp--;

                    stream_signed_number.add(size1.getTree());
                    // Sql.g:174:51: ( COMMA size2= signed_number )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==COMMA) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // Sql.g:174:52: COMMA size2= signed_number
                            {
                            COMMA140=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_name1390);  
                            stream_COMMA.add(COMMA140);

                            pushFollow(FOLLOW_signed_number_in_type_name1394);
                            size2=signed_number();

                            state._fsp--;

                            stream_signed_number.add(size2.getTree());

                            }
                            break;

                    }

                    RPAREN141=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_type_name1398);  
                    stream_RPAREN.add(RPAREN141);


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
            // 175:1: -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ )
            {
                // Sql.g:175:4: ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_1);

                // Sql.g:175:11: ^( TYPE_PARAMS ( $size1)? ( $size2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE_PARAMS, "TYPE_PARAMS"), root_2);

                // Sql.g:175:25: ( $size1)?
                if ( stream_size1.hasNext() ) {
                    adaptor.addChild(root_2, stream_size1.nextTree());

                }
                stream_size1.reset();
                // Sql.g:175:33: ( $size2)?
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
    // Sql.g:178:1: pragma_stmt : PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )? ;
    public final SqlParser.pragma_stmt_return pragma_stmt() throws RecognitionException {
        SqlParser.pragma_stmt_return retval = new SqlParser.pragma_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRAGMA142=null;
        Token DOT143=null;
        Token EQUALS144=null;
        Token LPAREN146=null;
        Token RPAREN148=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return pragma_name = null;

        SqlParser.pragma_value_return pragma_value145 = null;

        SqlParser.pragma_value_return pragma_value147 = null;


        Object PRAGMA142_tree=null;
        Object DOT143_tree=null;
        Object EQUALS144_tree=null;
        Object LPAREN146_tree=null;
        Object RPAREN148_tree=null;

        try {
            // Sql.g:178:12: ( PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )? )
            // Sql.g:178:14: PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            PRAGMA142=(Token)match(input,PRAGMA,FOLLOW_PRAGMA_in_pragma_stmt1430); 
            PRAGMA142_tree = (Object)adaptor.create(PRAGMA142);
            adaptor.addChild(root_0, PRAGMA142_tree);

            // Sql.g:178:21: (database_name= id DOT )?
            int alt43=2;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // Sql.g:178:22: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_pragma_stmt1435);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT143=(Token)match(input,DOT,FOLLOW_DOT_in_pragma_stmt1437); 
                    DOT143_tree = (Object)adaptor.create(DOT143);
                    adaptor.addChild(root_0, DOT143_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_pragma_stmt1443);
            pragma_name=id();

            state._fsp--;

            adaptor.addChild(root_0, pragma_name.getTree());
            // Sql.g:178:60: ( EQUALS pragma_value | LPAREN pragma_value RPAREN )?
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
                    // Sql.g:178:61: EQUALS pragma_value
                    {
                    EQUALS144=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_pragma_stmt1446); 
                    EQUALS144_tree = (Object)adaptor.create(EQUALS144);
                    adaptor.addChild(root_0, EQUALS144_tree);

                    pushFollow(FOLLOW_pragma_value_in_pragma_stmt1448);
                    pragma_value145=pragma_value();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_value145.getTree());

                    }
                    break;
                case 2 :
                    // Sql.g:178:83: LPAREN pragma_value RPAREN
                    {
                    LPAREN146=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_pragma_stmt1452); 
                    LPAREN146_tree = (Object)adaptor.create(LPAREN146);
                    adaptor.addChild(root_0, LPAREN146_tree);

                    pushFollow(FOLLOW_pragma_value_in_pragma_stmt1454);
                    pragma_value147=pragma_value();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_value147.getTree());
                    RPAREN148=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_pragma_stmt1456); 
                    RPAREN148_tree = (Object)adaptor.create(RPAREN148);
                    adaptor.addChild(root_0, RPAREN148_tree);


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
    // Sql.g:180:1: pragma_value : ( signed_number | name= id | STRING );
    public final SqlParser.pragma_value_return pragma_value() throws RecognitionException {
        SqlParser.pragma_value_return retval = new SqlParser.pragma_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING150=null;
        SqlParser.id_return name = null;

        SqlParser.signed_number_return signed_number149 = null;


        Object STRING150_tree=null;

        try {
            // Sql.g:180:13: ( signed_number | name= id | STRING )
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
            case EXPLAIN:
            case QUERY:
            case PLAN:
            case INDEXED:
            case BY:
            case OR:
            case AND:
            case ESCAPE:
            case IS:
            case NULL:
            case BETWEEN:
            case COLLATE:
            case ID:
            case DISTINCT:
            case CAST:
            case AS:
            case CASE:
            case ELSE:
            case END:
            case WHEN:
            case THEN:
            case CURRENT_TIME:
            case CURRENT_DATE:
            case CURRENT_TIMESTAMP:
            case RAISE:
            case IGNORE:
            case ROLLBACK:
            case ABORT:
            case FAIL:
            case PRAGMA:
            case ATTACH:
            case DATABASE:
            case DETACH:
            case ANALYZE:
            case REINDEX:
            case VACUUM:
            case REPLACE:
            case ASC:
            case DESC:
            case ORDER:
            case LIMIT:
            case OFFSET:
            case UNION:
            case ALL:
            case INTERSECT:
            case EXCEPT:
            case SELECT:
            case FROM:
            case WHERE:
            case GROUP:
            case HAVING:
            case NATURAL:
            case LEFT:
            case OUTER:
            case INNER:
            case CROSS:
            case JOIN:
            case ON:
            case USING:
            case INSERT:
            case INTO:
            case VALUES:
            case DEFAULT:
            case UPDATE:
            case SET:
            case DELETE:
            case BEGIN:
            case DEFERRED:
            case IMMEDIATE:
            case EXCLUSIVE:
            case TRANSACTION:
            case COMMIT:
            case TO:
            case SAVEPOINT:
            case RELEASE:
            case CONFLICT:
            case CREATE:
            case VIRTUAL:
            case TABLE:
            case TEMPORARY:
            case IF:
            case EXISTS:
            case CONSTRAINT:
            case PRIMARY:
            case KEY:
            case AUTOINCREMENT:
            case UNIQUE:
            case CHECK:
            case FOREIGN:
            case REFERENCES:
            case CASCADE:
            case RESTRICT:
            case DEFERRABLE:
            case INITIALLY:
            case DROP:
            case ALTER:
            case RENAME:
            case ADD:
            case COLUMN:
            case VIEW:
            case INDEX:
            case TRIGGER:
            case BEFORE:
            case AFTER:
            case INSTEAD:
            case OF:
            case FOR:
            case EACH:
            case ROW:
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
                    // Sql.g:180:15: signed_number
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_signed_number_in_pragma_value1465);
                    signed_number149=signed_number();

                    state._fsp--;

                    adaptor.addChild(root_0, signed_number149.getTree());

                    }
                    break;
                case 2 :
                    // Sql.g:180:31: name= id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_in_pragma_value1471);
                    name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, name.getTree());

                    }
                    break;
                case 3 :
                    // Sql.g:180:41: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING150=(Token)match(input,STRING,FOLLOW_STRING_in_pragma_value1475); 
                    STRING150_tree = (Object)adaptor.create(STRING150);
                    adaptor.addChild(root_0, STRING150_tree);


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
    // Sql.g:183:1: attach_stmt : ATTACH ( DATABASE )? filename= ( STRING | id ) AS database_name= id ;
    public final SqlParser.attach_stmt_return attach_stmt() throws RecognitionException {
        SqlParser.attach_stmt_return retval = new SqlParser.attach_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token filename=null;
        Token ATTACH151=null;
        Token DATABASE152=null;
        Token STRING153=null;
        Token AS155=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return id154 = null;


        Object filename_tree=null;
        Object ATTACH151_tree=null;
        Object DATABASE152_tree=null;
        Object STRING153_tree=null;
        Object AS155_tree=null;

        try {
            // Sql.g:183:12: ( ATTACH ( DATABASE )? filename= ( STRING | id ) AS database_name= id )
            // Sql.g:183:14: ATTACH ( DATABASE )? filename= ( STRING | id ) AS database_name= id
            {
            root_0 = (Object)adaptor.nil();

            ATTACH151=(Token)match(input,ATTACH,FOLLOW_ATTACH_in_attach_stmt1483); 
            ATTACH151_tree = (Object)adaptor.create(ATTACH151);
            adaptor.addChild(root_0, ATTACH151_tree);

            // Sql.g:183:21: ( DATABASE )?
            int alt46=2;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // Sql.g:183:22: DATABASE
                    {
                    DATABASE152=(Token)match(input,DATABASE,FOLLOW_DATABASE_in_attach_stmt1486); 
                    DATABASE152_tree = (Object)adaptor.create(DATABASE152);
                    adaptor.addChild(root_0, DATABASE152_tree);


                    }
                    break;

            }

            // Sql.g:183:42: ( STRING | id )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==STRING) ) {
                alt47=1;
            }
            else if ( ((LA47_0>=EXPLAIN && LA47_0<=PLAN)||(LA47_0>=INDEXED && LA47_0<=BY)||(LA47_0>=OR && LA47_0<=ESCAPE)||(LA47_0>=IS && LA47_0<=BETWEEN)||(LA47_0>=COLLATE && LA47_0<=THEN)||(LA47_0>=CURRENT_TIME && LA47_0<=CURRENT_TIMESTAMP)||(LA47_0>=RAISE && LA47_0<=ROW)) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // Sql.g:183:43: STRING
                    {
                    STRING153=(Token)match(input,STRING,FOLLOW_STRING_in_attach_stmt1493); 
                    STRING153_tree = (Object)adaptor.create(STRING153);
                    adaptor.addChild(root_0, STRING153_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:183:52: id
                    {
                    pushFollow(FOLLOW_id_in_attach_stmt1497);
                    id154=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id154.getTree());

                    }
                    break;

            }

            AS155=(Token)match(input,AS,FOLLOW_AS_in_attach_stmt1500); 
            AS155_tree = (Object)adaptor.create(AS155);
            adaptor.addChild(root_0, AS155_tree);

            pushFollow(FOLLOW_id_in_attach_stmt1504);
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
    // Sql.g:186:1: detach_stmt : DETACH ( DATABASE )? database_name= id ;
    public final SqlParser.detach_stmt_return detach_stmt() throws RecognitionException {
        SqlParser.detach_stmt_return retval = new SqlParser.detach_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DETACH156=null;
        Token DATABASE157=null;
        SqlParser.id_return database_name = null;


        Object DETACH156_tree=null;
        Object DATABASE157_tree=null;

        try {
            // Sql.g:186:12: ( DETACH ( DATABASE )? database_name= id )
            // Sql.g:186:14: DETACH ( DATABASE )? database_name= id
            {
            root_0 = (Object)adaptor.nil();

            DETACH156=(Token)match(input,DETACH,FOLLOW_DETACH_in_detach_stmt1512); 
            DETACH156_tree = (Object)adaptor.create(DETACH156);
            adaptor.addChild(root_0, DETACH156_tree);

            // Sql.g:186:21: ( DATABASE )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==DATABASE) ) {
                int LA48_1 = input.LA(2);

                if ( ((LA48_1>=EXPLAIN && LA48_1<=PLAN)||(LA48_1>=INDEXED && LA48_1<=BY)||(LA48_1>=OR && LA48_1<=ESCAPE)||(LA48_1>=IS && LA48_1<=BETWEEN)||(LA48_1>=COLLATE && LA48_1<=THEN)||(LA48_1>=CURRENT_TIME && LA48_1<=CURRENT_TIMESTAMP)||(LA48_1>=RAISE && LA48_1<=ROW)) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // Sql.g:186:22: DATABASE
                    {
                    DATABASE157=(Token)match(input,DATABASE,FOLLOW_DATABASE_in_detach_stmt1515); 
                    DATABASE157_tree = (Object)adaptor.create(DATABASE157);
                    adaptor.addChild(root_0, DATABASE157_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_detach_stmt1521);
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
    // Sql.g:189:1: analyze_stmt : ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )? ;
    public final SqlParser.analyze_stmt_return analyze_stmt() throws RecognitionException {
        SqlParser.analyze_stmt_return retval = new SqlParser.analyze_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ANALYZE158=null;
        Token DOT159=null;
        SqlParser.id_return database_or_table_name = null;

        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;


        Object ANALYZE158_tree=null;
        Object DOT159_tree=null;

        try {
            // Sql.g:189:13: ( ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )? )
            // Sql.g:189:15: ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )?
            {
            root_0 = (Object)adaptor.nil();

            ANALYZE158=(Token)match(input,ANALYZE,FOLLOW_ANALYZE_in_analyze_stmt1529); 
            ANALYZE158_tree = (Object)adaptor.create(ANALYZE158);
            adaptor.addChild(root_0, ANALYZE158_tree);

            // Sql.g:189:23: (database_or_table_name= id | database_name= id DOT table_name= id )?
            int alt49=3;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==ID) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==SEMI) ) {
                    alt49=1;
                }
                else if ( (LA49_1==DOT) ) {
                    alt49=2;
                }
            }
            else if ( ((LA49_0>=EXPLAIN && LA49_0<=PLAN)||(LA49_0>=INDEXED && LA49_0<=BY)||(LA49_0>=OR && LA49_0<=ESCAPE)||(LA49_0>=IS && LA49_0<=BETWEEN)||LA49_0==COLLATE||(LA49_0>=DISTINCT && LA49_0<=THEN)||(LA49_0>=CURRENT_TIME && LA49_0<=CURRENT_TIMESTAMP)||(LA49_0>=RAISE && LA49_0<=ROW)) ) {
                int LA49_2 = input.LA(2);

                if ( (LA49_2==SEMI) ) {
                    alt49=1;
                }
                else if ( (LA49_2==DOT) ) {
                    alt49=2;
                }
            }
            switch (alt49) {
                case 1 :
                    // Sql.g:189:24: database_or_table_name= id
                    {
                    pushFollow(FOLLOW_id_in_analyze_stmt1534);
                    database_or_table_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_or_table_name.getTree());

                    }
                    break;
                case 2 :
                    // Sql.g:189:52: database_name= id DOT table_name= id
                    {
                    pushFollow(FOLLOW_id_in_analyze_stmt1540);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT159=(Token)match(input,DOT,FOLLOW_DOT_in_analyze_stmt1542); 
                    DOT159_tree = (Object)adaptor.create(DOT159);
                    adaptor.addChild(root_0, DOT159_tree);

                    pushFollow(FOLLOW_id_in_analyze_stmt1546);
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
    // Sql.g:192:1: reindex_stmt : REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id ;
    public final SqlParser.reindex_stmt_return reindex_stmt() throws RecognitionException {
        SqlParser.reindex_stmt_return retval = new SqlParser.reindex_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REINDEX160=null;
        Token DOT161=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return collation_or_table_or_index_name = null;


        Object REINDEX160_tree=null;
        Object DOT161_tree=null;

        try {
            // Sql.g:192:13: ( REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id )
            // Sql.g:192:15: REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id
            {
            root_0 = (Object)adaptor.nil();

            REINDEX160=(Token)match(input,REINDEX,FOLLOW_REINDEX_in_reindex_stmt1556); 
            REINDEX160_tree = (Object)adaptor.create(REINDEX160);
            adaptor.addChild(root_0, REINDEX160_tree);

            // Sql.g:192:23: (database_name= id DOT )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==ID) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==DOT) ) {
                    alt50=1;
                }
            }
            else if ( ((LA50_0>=EXPLAIN && LA50_0<=PLAN)||(LA50_0>=INDEXED && LA50_0<=BY)||(LA50_0>=OR && LA50_0<=ESCAPE)||(LA50_0>=IS && LA50_0<=BETWEEN)||LA50_0==COLLATE||(LA50_0>=DISTINCT && LA50_0<=THEN)||(LA50_0>=CURRENT_TIME && LA50_0<=CURRENT_TIMESTAMP)||(LA50_0>=RAISE && LA50_0<=ROW)) ) {
                int LA50_2 = input.LA(2);

                if ( (LA50_2==DOT) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // Sql.g:192:24: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_reindex_stmt1561);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT161=(Token)match(input,DOT,FOLLOW_DOT_in_reindex_stmt1563); 
                    DOT161_tree = (Object)adaptor.create(DOT161);
                    adaptor.addChild(root_0, DOT161_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_reindex_stmt1569);
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
    // Sql.g:195:1: vacuum_stmt : VACUUM ;
    public final SqlParser.vacuum_stmt_return vacuum_stmt() throws RecognitionException {
        SqlParser.vacuum_stmt_return retval = new SqlParser.vacuum_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VACUUM162=null;

        Object VACUUM162_tree=null;

        try {
            // Sql.g:195:12: ( VACUUM )
            // Sql.g:195:14: VACUUM
            {
            root_0 = (Object)adaptor.nil();

            VACUUM162=(Token)match(input,VACUUM,FOLLOW_VACUUM_in_vacuum_stmt1577); 
            VACUUM162_tree = (Object)adaptor.create(VACUUM162);
            adaptor.addChild(root_0, VACUUM162_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:201:1: operation_conflict_clause : OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) ;
    public final SqlParser.operation_conflict_clause_return operation_conflict_clause() throws RecognitionException {
        SqlParser.operation_conflict_clause_return retval = new SqlParser.operation_conflict_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR163=null;
        Token set164=null;

        Object OR163_tree=null;
        Object set164_tree=null;

        try {
            // Sql.g:201:26: ( OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) )
            // Sql.g:201:28: OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE )
            {
            root_0 = (Object)adaptor.nil();

            OR163=(Token)match(input,OR,FOLLOW_OR_in_operation_conflict_clause1588); 
            OR163_tree = (Object)adaptor.create(OR163);
            adaptor.addChild(root_0, OR163_tree);

            set164=(Token)input.LT(1);
            if ( (input.LA(1)>=IGNORE && input.LA(1)<=FAIL)||input.LA(1)==REPLACE ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set164));
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
    // Sql.g:203:1: ordering_term : expr ( ASC | DESC )? -> ^( ORDERING expr ( ASC )? ( DESC )? ) ;
    public final SqlParser.ordering_term_return ordering_term() throws RecognitionException {
        SqlParser.ordering_term_return retval = new SqlParser.ordering_term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASC166=null;
        Token DESC167=null;
        SqlParser.expr_return expr165 = null;


        Object ASC166_tree=null;
        Object DESC167_tree=null;
        RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");
        RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Sql.g:203:14: ( expr ( ASC | DESC )? -> ^( ORDERING expr ( ASC )? ( DESC )? ) )
            // Sql.g:203:16: expr ( ASC | DESC )?
            {
            pushFollow(FOLLOW_expr_in_ordering_term1615);
            expr165=expr();

            state._fsp--;

            stream_expr.add(expr165.getTree());
            // Sql.g:203:82: ( ASC | DESC )?
            int alt51=3;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // Sql.g:203:83: ASC
                    {
                    ASC166=(Token)match(input,ASC,FOLLOW_ASC_in_ordering_term1620);  
                    stream_ASC.add(ASC166);


                    }
                    break;
                case 2 :
                    // Sql.g:203:89: DESC
                    {
                    DESC167=(Token)match(input,DESC,FOLLOW_DESC_in_ordering_term1624);  
                    stream_DESC.add(DESC167);


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
            // 204:1: -> ^( ORDERING expr ( ASC )? ( DESC )? )
            {
                // Sql.g:204:4: ^( ORDERING expr ( ASC )? ( DESC )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ORDERING, "ORDERING"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                // Sql.g:204:20: ( ASC )?
                if ( stream_ASC.hasNext() ) {
                    adaptor.addChild(root_1, stream_ASC.nextNode());

                }
                stream_ASC.reset();
                // Sql.g:204:27: ( DESC )?
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
    // Sql.g:206:1: operation_limited_clause : ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? ;
    public final SqlParser.operation_limited_clause_return operation_limited_clause() throws RecognitionException {
        SqlParser.operation_limited_clause_return retval = new SqlParser.operation_limited_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token limit=null;
        Token offset=null;
        Token ORDER168=null;
        Token BY169=null;
        Token COMMA171=null;
        Token LIMIT173=null;
        Token set174=null;
        SqlParser.ordering_term_return ordering_term170 = null;

        SqlParser.ordering_term_return ordering_term172 = null;


        Object limit_tree=null;
        Object offset_tree=null;
        Object ORDER168_tree=null;
        Object BY169_tree=null;
        Object COMMA171_tree=null;
        Object LIMIT173_tree=null;
        Object set174_tree=null;

        try {
            // Sql.g:206:25: ( ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )
            // Sql.g:207:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )?
            {
            root_0 = (Object)adaptor.nil();

            // Sql.g:207:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==ORDER) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // Sql.g:207:4: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                    ORDER168=(Token)match(input,ORDER,FOLLOW_ORDER_in_operation_limited_clause1654); 
                    ORDER168_tree = (Object)adaptor.create(ORDER168);
                    adaptor.addChild(root_0, ORDER168_tree);

                    BY169=(Token)match(input,BY,FOLLOW_BY_in_operation_limited_clause1656); 
                    BY169_tree = (Object)adaptor.create(BY169);
                    adaptor.addChild(root_0, BY169_tree);

                    pushFollow(FOLLOW_ordering_term_in_operation_limited_clause1658);
                    ordering_term170=ordering_term();

                    state._fsp--;

                    adaptor.addChild(root_0, ordering_term170.getTree());
                    // Sql.g:207:27: ( COMMA ordering_term )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==COMMA) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // Sql.g:207:28: COMMA ordering_term
                    	    {
                    	    COMMA171=(Token)match(input,COMMA,FOLLOW_COMMA_in_operation_limited_clause1661); 
                    	    COMMA171_tree = (Object)adaptor.create(COMMA171);
                    	    adaptor.addChild(root_0, COMMA171_tree);

                    	    pushFollow(FOLLOW_ordering_term_in_operation_limited_clause1663);
                    	    ordering_term172=ordering_term();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, ordering_term172.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);


                    }
                    break;

            }

            LIMIT173=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_operation_limited_clause1671); 
            LIMIT173_tree = (Object)adaptor.create(LIMIT173);
            adaptor.addChild(root_0, LIMIT173_tree);

            limit=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation_limited_clause1675); 
            limit_tree = (Object)adaptor.create(limit);
            adaptor.addChild(root_0, limit_tree);

            // Sql.g:208:23: ( ( OFFSET | COMMA ) offset= INTEGER )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==COMMA||LA54_0==OFFSET) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // Sql.g:208:24: ( OFFSET | COMMA ) offset= INTEGER
                    {
                    set174=(Token)input.LT(1);
                    if ( input.LA(1)==COMMA||input.LA(1)==OFFSET ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set174));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    offset=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation_limited_clause1688); 
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
    // Sql.g:211:1: select_stmt : select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )? -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? ) ;
    public final SqlParser.select_stmt_return select_stmt() throws RecognitionException {
        SqlParser.select_stmt_return retval = new SqlParser.select_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token limit=null;
        Token offset=null;
        Token ORDER176=null;
        Token BY177=null;
        Token COMMA179=null;
        Token LIMIT181=null;
        Token OFFSET182=null;
        Token COMMA183=null;
        SqlParser.select_list_return select_list175 = null;

        SqlParser.ordering_term_return ordering_term178 = null;

        SqlParser.ordering_term_return ordering_term180 = null;


        Object limit_tree=null;
        Object offset_tree=null;
        Object ORDER176_tree=null;
        Object BY177_tree=null;
        Object COMMA179_tree=null;
        Object LIMIT181_tree=null;
        Object OFFSET182_tree=null;
        Object COMMA183_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_ORDER=new RewriteRuleTokenStream(adaptor,"token ORDER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
        RewriteRuleTokenStream stream_OFFSET=new RewriteRuleTokenStream(adaptor,"token OFFSET");
        RewriteRuleSubtreeStream stream_select_list=new RewriteRuleSubtreeStream(adaptor,"rule select_list");
        RewriteRuleSubtreeStream stream_ordering_term=new RewriteRuleSubtreeStream(adaptor,"rule ordering_term");
        try {
            // Sql.g:211:12: ( select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )? -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? ) )
            // Sql.g:211:14: select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )?
            {
            pushFollow(FOLLOW_select_list_in_select_stmt1698);
            select_list175=select_list();

            state._fsp--;

            stream_select_list.add(select_list175.getTree());
            // Sql.g:212:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==ORDER) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // Sql.g:212:4: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                    ORDER176=(Token)match(input,ORDER,FOLLOW_ORDER_in_select_stmt1703);  
                    stream_ORDER.add(ORDER176);

                    BY177=(Token)match(input,BY,FOLLOW_BY_in_select_stmt1705);  
                    stream_BY.add(BY177);

                    pushFollow(FOLLOW_ordering_term_in_select_stmt1707);
                    ordering_term178=ordering_term();

                    state._fsp--;

                    stream_ordering_term.add(ordering_term178.getTree());
                    // Sql.g:212:27: ( COMMA ordering_term )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==COMMA) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // Sql.g:212:28: COMMA ordering_term
                    	    {
                    	    COMMA179=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_stmt1710);  
                    	    stream_COMMA.add(COMMA179);

                    	    pushFollow(FOLLOW_ordering_term_in_select_stmt1712);
                    	    ordering_term180=ordering_term();

                    	    state._fsp--;

                    	    stream_ordering_term.add(ordering_term180.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);


                    }
                    break;

            }

            // Sql.g:213:3: ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==LIMIT) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // Sql.g:213:4: LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )?
                    {
                    LIMIT181=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_select_stmt1721);  
                    stream_LIMIT.add(LIMIT181);

                    limit=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt1725);  
                    stream_INTEGER.add(limit);

                    // Sql.g:213:24: ( ( OFFSET | COMMA ) offset= INTEGER )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==COMMA||LA58_0==OFFSET) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // Sql.g:213:25: ( OFFSET | COMMA ) offset= INTEGER
                            {
                            // Sql.g:213:25: ( OFFSET | COMMA )
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
                                    // Sql.g:213:26: OFFSET
                                    {
                                    OFFSET182=(Token)match(input,OFFSET,FOLLOW_OFFSET_in_select_stmt1729);  
                                    stream_OFFSET.add(OFFSET182);


                                    }
                                    break;
                                case 2 :
                                    // Sql.g:213:35: COMMA
                                    {
                                    COMMA183=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_stmt1733);  
                                    stream_COMMA.add(COMMA183);


                                    }
                                    break;

                            }

                            offset=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt1738);  
                            stream_INTEGER.add(offset);


                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: offset, ordering_term, limit, LIMIT, ORDER, select_list
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
            // 214:1: -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? )
            {
                // Sql.g:214:4: ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECT, "SELECT"), root_1);

                adaptor.addChild(root_1, stream_select_list.nextTree());
                // Sql.g:215:22: ( ^( ORDER ( ordering_term )+ ) )?
                if ( stream_ordering_term.hasNext()||stream_ORDER.hasNext() ) {
                    // Sql.g:215:22: ^( ORDER ( ordering_term )+ )
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
                // Sql.g:215:47: ( ^( LIMIT $limit ( $offset)? ) )?
                if ( stream_offset.hasNext()||stream_limit.hasNext()||stream_LIMIT.hasNext() ) {
                    // Sql.g:215:47: ^( LIMIT $limit ( $offset)? )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_LIMIT.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_limit.nextNode());
                    // Sql.g:215:62: ( $offset)?
                    if ( stream_offset.hasNext() ) {
                        adaptor.addChild(root_2, stream_offset.nextNode());

                    }
                    stream_offset.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_offset.reset();
                stream_limit.reset();
                stream_LIMIT.reset();

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
    // Sql.g:218:1: select_list : select_core ( select_op select_core )* ;
    public final SqlParser.select_list_return select_list() throws RecognitionException {
        SqlParser.select_list_return retval = new SqlParser.select_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.select_core_return select_core184 = null;

        SqlParser.select_op_return select_op185 = null;

        SqlParser.select_core_return select_core186 = null;



        try {
            // Sql.g:218:12: ( select_core ( select_op select_core )* )
            // Sql.g:219:3: select_core ( select_op select_core )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_select_core_in_select_list1783);
            select_core184=select_core();

            state._fsp--;

            adaptor.addChild(root_0, select_core184.getTree());
            // Sql.g:219:15: ( select_op select_core )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==UNION||(LA60_0>=INTERSECT && LA60_0<=EXCEPT)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // Sql.g:219:16: select_op select_core
            	    {
            	    pushFollow(FOLLOW_select_op_in_select_list1786);
            	    select_op185=select_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(select_op185.getTree(), root_0);
            	    pushFollow(FOLLOW_select_core_in_select_list1789);
            	    select_core186=select_core();

            	    state._fsp--;

            	    adaptor.addChild(root_0, select_core186.getTree());

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
    // Sql.g:221:1: select_op : ( UNION ( ALL )? | INTERSECT | EXCEPT );
    public final SqlParser.select_op_return select_op() throws RecognitionException {
        SqlParser.select_op_return retval = new SqlParser.select_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNION187=null;
        Token ALL188=null;
        Token INTERSECT189=null;
        Token EXCEPT190=null;

        Object UNION187_tree=null;
        Object ALL188_tree=null;
        Object INTERSECT189_tree=null;
        Object EXCEPT190_tree=null;

        try {
            // Sql.g:221:10: ( UNION ( ALL )? | INTERSECT | EXCEPT )
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
                    // Sql.g:221:12: UNION ( ALL )?
                    {
                    root_0 = (Object)adaptor.nil();

                    UNION187=(Token)match(input,UNION,FOLLOW_UNION_in_select_op1798); 
                    UNION187_tree = (Object)adaptor.create(UNION187);
                    root_0 = (Object)adaptor.becomeRoot(UNION187_tree, root_0);

                    // Sql.g:221:19: ( ALL )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==ALL) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // Sql.g:221:20: ALL
                            {
                            ALL188=(Token)match(input,ALL,FOLLOW_ALL_in_select_op1802); 
                            ALL188_tree = (Object)adaptor.create(ALL188);
                            adaptor.addChild(root_0, ALL188_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Sql.g:221:28: INTERSECT
                    {
                    root_0 = (Object)adaptor.nil();

                    INTERSECT189=(Token)match(input,INTERSECT,FOLLOW_INTERSECT_in_select_op1808); 
                    INTERSECT189_tree = (Object)adaptor.create(INTERSECT189);
                    adaptor.addChild(root_0, INTERSECT189_tree);


                    }
                    break;
                case 3 :
                    // Sql.g:221:40: EXCEPT
                    {
                    root_0 = (Object)adaptor.nil();

                    EXCEPT190=(Token)match(input,EXCEPT,FOLLOW_EXCEPT_in_select_op1812); 
                    EXCEPT190_tree = (Object)adaptor.create(EXCEPT190);
                    adaptor.addChild(root_0, EXCEPT190_tree);


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
    // Sql.g:223:1: select_core : SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )? -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? ) ;
    public final SqlParser.select_core_return select_core() throws RecognitionException {
        SqlParser.select_core_return retval = new SqlParser.select_core_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SELECT191=null;
        Token ALL192=null;
        Token DISTINCT193=null;
        Token COMMA195=null;
        Token FROM197=null;
        Token WHERE199=null;
        Token GROUP200=null;
        Token BY201=null;
        Token COMMA203=null;
        Token HAVING205=null;
        SqlParser.expr_return where_expr = null;

        SqlParser.expr_return having_expr = null;

        SqlParser.result_column_return result_column194 = null;

        SqlParser.result_column_return result_column196 = null;

        SqlParser.join_source_return join_source198 = null;

        SqlParser.ordering_term_return ordering_term202 = null;

        SqlParser.ordering_term_return ordering_term204 = null;


        Object SELECT191_tree=null;
        Object ALL192_tree=null;
        Object DISTINCT193_tree=null;
        Object COMMA195_tree=null;
        Object FROM197_tree=null;
        Object WHERE199_tree=null;
        Object GROUP200_tree=null;
        Object BY201_tree=null;
        Object COMMA203_tree=null;
        Object HAVING205_tree=null;
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
            // Sql.g:223:12: ( SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )? -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? ) )
            // Sql.g:224:3: SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )?
            {
            SELECT191=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_core1821);  
            stream_SELECT.add(SELECT191);

            // Sql.g:224:10: ( ALL | DISTINCT )?
            int alt63=3;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // Sql.g:224:11: ALL
                    {
                    ALL192=(Token)match(input,ALL,FOLLOW_ALL_in_select_core1824);  
                    stream_ALL.add(ALL192);


                    }
                    break;
                case 2 :
                    // Sql.g:224:17: DISTINCT
                    {
                    DISTINCT193=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_select_core1828);  
                    stream_DISTINCT.add(DISTINCT193);


                    }
                    break;

            }

            pushFollow(FOLLOW_result_column_in_select_core1832);
            result_column194=result_column();

            state._fsp--;

            stream_result_column.add(result_column194.getTree());
            // Sql.g:224:42: ( COMMA result_column )*
            loop64:
            do {
                int alt64=2;
                alt64 = dfa64.predict(input);
                switch (alt64) {
            	case 1 :
            	    // Sql.g:224:43: COMMA result_column
            	    {
            	    COMMA195=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_core1835);  
            	    stream_COMMA.add(COMMA195);

            	    pushFollow(FOLLOW_result_column_in_select_core1837);
            	    result_column196=result_column();

            	    state._fsp--;

            	    stream_result_column.add(result_column196.getTree());

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            // Sql.g:224:65: ( FROM join_source )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // Sql.g:224:66: FROM join_source
                    {
                    FROM197=(Token)match(input,FROM,FOLLOW_FROM_in_select_core1842);  
                    stream_FROM.add(FROM197);

                    pushFollow(FOLLOW_join_source_in_select_core1844);
                    join_source198=join_source();

                    state._fsp--;

                    stream_join_source.add(join_source198.getTree());

                    }
                    break;

            }

            // Sql.g:224:85: ( WHERE where_expr= expr )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // Sql.g:224:86: WHERE where_expr= expr
                    {
                    WHERE199=(Token)match(input,WHERE,FOLLOW_WHERE_in_select_core1849);  
                    stream_WHERE.add(WHERE199);

                    pushFollow(FOLLOW_expr_in_select_core1853);
                    where_expr=expr();

                    state._fsp--;

                    stream_expr.add(where_expr.getTree());

                    }
                    break;

            }

            // Sql.g:225:3: ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==GROUP) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // Sql.g:225:5: GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )?
                    {
                    GROUP200=(Token)match(input,GROUP,FOLLOW_GROUP_in_select_core1861);  
                    stream_GROUP.add(GROUP200);

                    BY201=(Token)match(input,BY,FOLLOW_BY_in_select_core1863);  
                    stream_BY.add(BY201);

                    pushFollow(FOLLOW_ordering_term_in_select_core1865);
                    ordering_term202=ordering_term();

                    state._fsp--;

                    stream_ordering_term.add(ordering_term202.getTree());
                    // Sql.g:225:28: ( COMMA ordering_term )*
                    loop67:
                    do {
                        int alt67=2;
                        alt67 = dfa67.predict(input);
                        switch (alt67) {
                    	case 1 :
                    	    // Sql.g:225:29: COMMA ordering_term
                    	    {
                    	    COMMA203=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_core1868);  
                    	    stream_COMMA.add(COMMA203);

                    	    pushFollow(FOLLOW_ordering_term_in_select_core1870);
                    	    ordering_term204=ordering_term();

                    	    state._fsp--;

                    	    stream_ordering_term.add(ordering_term204.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    // Sql.g:225:51: ( HAVING having_expr= expr )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==HAVING) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // Sql.g:225:52: HAVING having_expr= expr
                            {
                            HAVING205=(Token)match(input,HAVING,FOLLOW_HAVING_in_select_core1875);  
                            stream_HAVING.add(HAVING205);

                            pushFollow(FOLLOW_expr_in_select_core1879);
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
            // elements: join_source, WHERE, result_column, ordering_term, HAVING, having_expr, FROM, DISTINCT, where_expr, GROUP
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
            // 226:1: -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? )
            {
                // Sql.g:226:4: ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECT_CORE, "SELECT_CORE"), root_1);

                // Sql.g:227:15: ( DISTINCT )?
                if ( stream_DISTINCT.hasNext() ) {
                    adaptor.addChild(root_1, stream_DISTINCT.nextNode());

                }
                stream_DISTINCT.reset();
                // Sql.g:227:27: ^( COLUMNS ( result_column )+ )
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
                // Sql.g:227:53: ( ^( FROM join_source ) )?
                if ( stream_join_source.hasNext()||stream_FROM.hasNext() ) {
                    // Sql.g:227:53: ^( FROM join_source )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_FROM.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_join_source.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_join_source.reset();
                stream_FROM.reset();
                // Sql.g:227:74: ( ^( WHERE $where_expr) )?
                if ( stream_WHERE.hasNext()||stream_where_expr.hasNext() ) {
                    // Sql.g:227:74: ^( WHERE $where_expr)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_WHERE.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_where_expr.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_WHERE.reset();
                stream_where_expr.reset();
                // Sql.g:228:3: ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )?
                if ( stream_ordering_term.hasNext()||stream_HAVING.hasNext()||stream_having_expr.hasNext()||stream_GROUP.hasNext() ) {
                    // Sql.g:228:3: ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? )
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
                    // Sql.g:228:26: ( ^( HAVING $having_expr) )?
                    if ( stream_HAVING.hasNext()||stream_having_expr.hasNext() ) {
                        // Sql.g:228:26: ^( HAVING $having_expr)
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
                stream_ordering_term.reset();
                stream_HAVING.reset();
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
    // Sql.g:231:1: result_column : ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) );
    public final SqlParser.result_column_return result_column() throws RecognitionException {
        SqlParser.result_column_return retval = new SqlParser.result_column_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASTERISK206=null;
        Token DOT207=null;
        Token ASTERISK208=null;
        Token AS210=null;
        SqlParser.id_return table_name = null;

        SqlParser.id_return column_alias = null;

        SqlParser.expr_return expr209 = null;


        Object ASTERISK206_tree=null;
        Object DOT207_tree=null;
        Object ASTERISK208_tree=null;
        Object AS210_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Sql.g:232:3: ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) )
            int alt72=3;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // Sql.g:232:5: ASTERISK
                    {
                    root_0 = (Object)adaptor.nil();

                    ASTERISK206=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_result_column1949); 
                    ASTERISK206_tree = (Object)adaptor.create(ASTERISK206);
                    adaptor.addChild(root_0, ASTERISK206_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:233:5: table_name= id DOT ASTERISK
                    {
                    pushFollow(FOLLOW_id_in_result_column1957);
                    table_name=id();

                    state._fsp--;

                    stream_id.add(table_name.getTree());
                    DOT207=(Token)match(input,DOT,FOLLOW_DOT_in_result_column1959);  
                    stream_DOT.add(DOT207);

                    ASTERISK208=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_result_column1961);  
                    stream_ASTERISK.add(ASTERISK208);



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
                    // 233:32: -> ^( ASTERISK $table_name)
                    {
                        // Sql.g:233:35: ^( ASTERISK $table_name)
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
                    // Sql.g:234:5: expr ( ( AS )? column_alias= id )?
                    {
                    pushFollow(FOLLOW_expr_in_result_column1976);
                    expr209=expr();

                    state._fsp--;

                    stream_expr.add(expr209.getTree());
                    // Sql.g:234:10: ( ( AS )? column_alias= id )?
                    int alt71=2;
                    alt71 = dfa71.predict(input);
                    switch (alt71) {
                        case 1 :
                            // Sql.g:234:11: ( AS )? column_alias= id
                            {
                            // Sql.g:234:11: ( AS )?
                            int alt70=2;
                            alt70 = dfa70.predict(input);
                            switch (alt70) {
                                case 1 :
                                    // Sql.g:234:12: AS
                                    {
                                    AS210=(Token)match(input,AS,FOLLOW_AS_in_result_column1980);  
                                    stream_AS.add(AS210);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_id_in_result_column1986);
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
                    // 234:35: -> ^( ALIAS expr ( $column_alias)? )
                    {
                        // Sql.g:234:38: ^( ALIAS expr ( $column_alias)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // Sql.g:234:51: ( $column_alias)?
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
    // Sql.g:236:1: join_source : single_source ( join_op single_source ( join_constraint )? )* ;
    public final SqlParser.join_source_return join_source() throws RecognitionException {
        SqlParser.join_source_return retval = new SqlParser.join_source_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.single_source_return single_source211 = null;

        SqlParser.join_op_return join_op212 = null;

        SqlParser.single_source_return single_source213 = null;

        SqlParser.join_constraint_return join_constraint214 = null;



        try {
            // Sql.g:236:12: ( single_source ( join_op single_source ( join_constraint )? )* )
            // Sql.g:236:14: single_source ( join_op single_source ( join_constraint )? )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_single_source_in_join_source2007);
            single_source211=single_source();

            state._fsp--;

            adaptor.addChild(root_0, single_source211.getTree());
            // Sql.g:236:28: ( join_op single_source ( join_constraint )? )*
            loop74:
            do {
                int alt74=2;
                alt74 = dfa74.predict(input);
                switch (alt74) {
            	case 1 :
            	    // Sql.g:236:29: join_op single_source ( join_constraint )?
            	    {
            	    pushFollow(FOLLOW_join_op_in_join_source2010);
            	    join_op212=join_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(join_op212.getTree(), root_0);
            	    pushFollow(FOLLOW_single_source_in_join_source2013);
            	    single_source213=single_source();

            	    state._fsp--;

            	    adaptor.addChild(root_0, single_source213.getTree());
            	    // Sql.g:236:52: ( join_constraint )?
            	    int alt73=2;
            	    alt73 = dfa73.predict(input);
            	    switch (alt73) {
            	        case 1 :
            	            // Sql.g:236:53: join_constraint
            	            {
            	            pushFollow(FOLLOW_join_constraint_in_join_source2016);
            	            join_constraint214=join_constraint();

            	            state._fsp--;

            	            adaptor.addChild(root_0, join_constraint214.getTree());

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
    // Sql.g:238:1: single_source : ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN );
    public final SqlParser.single_source_return single_source() throws RecognitionException {
        SqlParser.single_source_return retval = new SqlParser.single_source_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token table_name=null;
        Token table_alias=null;
        Token DOT215=null;
        Token AS216=null;
        Token INDEXED217=null;
        Token BY218=null;
        Token NOT219=null;
        Token INDEXED220=null;
        Token LPAREN221=null;
        Token RPAREN223=null;
        Token AS224=null;
        Token LPAREN225=null;
        Token RPAREN227=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return index_name = null;

        SqlParser.select_stmt_return select_stmt222 = null;

        SqlParser.join_source_return join_source226 = null;


        Object table_name_tree=null;
        Object table_alias_tree=null;
        Object DOT215_tree=null;
        Object AS216_tree=null;
        Object INDEXED217_tree=null;
        Object BY218_tree=null;
        Object NOT219_tree=null;
        Object INDEXED220_tree=null;
        Object LPAREN221_tree=null;
        Object RPAREN223_tree=null;
        Object AS224_tree=null;
        Object LPAREN225_tree=null;
        Object RPAREN227_tree=null;
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
            // Sql.g:239:3: ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN )
            int alt81=3;
            alt81 = dfa81.predict(input);
            switch (alt81) {
                case 1 :
                    // Sql.g:239:5: (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )?
                    {
                    // Sql.g:239:5: (database_name= id DOT )?
                    int alt75=2;
                    alt75 = dfa75.predict(input);
                    switch (alt75) {
                        case 1 :
                            // Sql.g:239:6: database_name= id DOT
                            {
                            pushFollow(FOLLOW_id_in_single_source2033);
                            database_name=id();

                            state._fsp--;

                            stream_id.add(database_name.getTree());
                            DOT215=(Token)match(input,DOT,FOLLOW_DOT_in_single_source2035);  
                            stream_DOT.add(DOT215);


                            }
                            break;

                    }

                    table_name=(Token)match(input,ID,FOLLOW_ID_in_single_source2041);  
                    stream_ID.add(table_name);

                    // Sql.g:239:43: ( ( AS )? table_alias= ID )?
                    int alt77=2;
                    alt77 = dfa77.predict(input);
                    switch (alt77) {
                        case 1 :
                            // Sql.g:239:44: ( AS )? table_alias= ID
                            {
                            // Sql.g:239:44: ( AS )?
                            int alt76=2;
                            int LA76_0 = input.LA(1);

                            if ( (LA76_0==AS) ) {
                                alt76=1;
                            }
                            switch (alt76) {
                                case 1 :
                                    // Sql.g:239:45: AS
                                    {
                                    AS216=(Token)match(input,AS,FOLLOW_AS_in_single_source2045);  
                                    stream_AS.add(AS216);


                                    }
                                    break;

                            }

                            table_alias=(Token)match(input,ID,FOLLOW_ID_in_single_source2051);  
                            stream_ID.add(table_alias);


                            }
                            break;

                    }

                    // Sql.g:239:67: ( INDEXED BY index_name= id | NOT INDEXED )?
                    int alt78=3;
                    alt78 = dfa78.predict(input);
                    switch (alt78) {
                        case 1 :
                            // Sql.g:239:68: INDEXED BY index_name= id
                            {
                            INDEXED217=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_single_source2056);  
                            stream_INDEXED.add(INDEXED217);

                            BY218=(Token)match(input,BY,FOLLOW_BY_in_single_source2058);  
                            stream_BY.add(BY218);

                            pushFollow(FOLLOW_id_in_single_source2062);
                            index_name=id();

                            state._fsp--;

                            stream_id.add(index_name.getTree());

                            }
                            break;
                        case 2 :
                            // Sql.g:239:95: NOT INDEXED
                            {
                            NOT219=(Token)match(input,NOT,FOLLOW_NOT_in_single_source2066);  
                            stream_NOT.add(NOT219);

                            INDEXED220=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_single_source2068);  
                            stream_INDEXED.add(INDEXED220);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: database_name, table_alias, index_name, INDEXED, table_name, NOT
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
                    // 240:3: -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? )
                    {
                        // Sql.g:240:6: ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        // Sql.g:240:14: ^( $table_name ( $database_name)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                        // Sql.g:240:28: ( $database_name)?
                        if ( stream_database_name.hasNext() ) {
                            adaptor.addChild(root_2, stream_database_name.nextTree());

                        }
                        stream_database_name.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // Sql.g:240:45: ( $table_alias)?
                        if ( stream_table_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_table_alias.nextNode());

                        }
                        stream_table_alias.reset();
                        // Sql.g:240:59: ( ^( INDEXED ( NOT )? ( $index_name)? ) )?
                        if ( stream_index_name.hasNext()||stream_INDEXED.hasNext()||stream_NOT.hasNext() ) {
                            // Sql.g:240:59: ^( INDEXED ( NOT )? ( $index_name)? )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(stream_INDEXED.nextNode(), root_2);

                            // Sql.g:240:69: ( NOT )?
                            if ( stream_NOT.hasNext() ) {
                                adaptor.addChild(root_2, stream_NOT.nextNode());

                            }
                            stream_NOT.reset();
                            // Sql.g:240:74: ( $index_name)?
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
                    // Sql.g:241:5: LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )?
                    {
                    LPAREN221=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_single_source2109);  
                    stream_LPAREN.add(LPAREN221);

                    pushFollow(FOLLOW_select_stmt_in_single_source2111);
                    select_stmt222=select_stmt();

                    state._fsp--;

                    stream_select_stmt.add(select_stmt222.getTree());
                    RPAREN223=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_single_source2113);  
                    stream_RPAREN.add(RPAREN223);

                    // Sql.g:241:31: ( ( AS )? table_alias= ID )?
                    int alt80=2;
                    alt80 = dfa80.predict(input);
                    switch (alt80) {
                        case 1 :
                            // Sql.g:241:32: ( AS )? table_alias= ID
                            {
                            // Sql.g:241:32: ( AS )?
                            int alt79=2;
                            int LA79_0 = input.LA(1);

                            if ( (LA79_0==AS) ) {
                                alt79=1;
                            }
                            switch (alt79) {
                                case 1 :
                                    // Sql.g:241:33: AS
                                    {
                                    AS224=(Token)match(input,AS,FOLLOW_AS_in_single_source2117);  
                                    stream_AS.add(AS224);


                                    }
                                    break;

                            }

                            table_alias=(Token)match(input,ID,FOLLOW_ID_in_single_source2123);  
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
                    // 242:3: -> ^( ALIAS select_stmt ( $table_alias)? )
                    {
                        // Sql.g:242:6: ^( ALIAS select_stmt ( $table_alias)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        adaptor.addChild(root_1, stream_select_stmt.nextTree());
                        // Sql.g:242:26: ( $table_alias)?
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
                    // Sql.g:243:5: LPAREN join_source RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN225=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_single_source2145); 
                    pushFollow(FOLLOW_join_source_in_single_source2148);
                    join_source226=join_source();

                    state._fsp--;

                    adaptor.addChild(root_0, join_source226.getTree());
                    RPAREN227=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_single_source2150); 

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
    // Sql.g:245:1: join_op : ( COMMA | ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN );
    public final SqlParser.join_op_return join_op() throws RecognitionException {
        SqlParser.join_op_return retval = new SqlParser.join_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA228=null;
        Token NATURAL229=null;
        Token LEFT230=null;
        Token OUTER231=null;
        Token INNER232=null;
        Token CROSS233=null;
        Token JOIN234=null;

        Object COMMA228_tree=null;
        Object NATURAL229_tree=null;
        Object LEFT230_tree=null;
        Object OUTER231_tree=null;
        Object INNER232_tree=null;
        Object CROSS233_tree=null;
        Object JOIN234_tree=null;

        try {
            // Sql.g:246:3: ( COMMA | ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==COMMA) ) {
                alt86=1;
            }
            else if ( ((LA86_0>=NATURAL && LA86_0<=JOIN)) ) {
                alt86=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // Sql.g:246:5: COMMA
                    {
                    root_0 = (Object)adaptor.nil();

                    COMMA228=(Token)match(input,COMMA,FOLLOW_COMMA_in_join_op2161); 
                    COMMA228_tree = (Object)adaptor.create(COMMA228);
                    adaptor.addChild(root_0, COMMA228_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:247:5: ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN
                    {
                    root_0 = (Object)adaptor.nil();

                    // Sql.g:247:5: ( NATURAL )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==NATURAL) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // Sql.g:247:6: NATURAL
                            {
                            NATURAL229=(Token)match(input,NATURAL,FOLLOW_NATURAL_in_join_op2168); 
                            NATURAL229_tree = (Object)adaptor.create(NATURAL229);
                            adaptor.addChild(root_0, NATURAL229_tree);


                            }
                            break;

                    }

                    // Sql.g:247:16: ( ( LEFT )? ( OUTER )? | INNER | CROSS )
                    int alt85=3;
                    switch ( input.LA(1) ) {
                    case LEFT:
                    case OUTER:
                    case JOIN:
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
                            // Sql.g:247:17: ( LEFT )? ( OUTER )?
                            {
                            // Sql.g:247:17: ( LEFT )?
                            int alt83=2;
                            int LA83_0 = input.LA(1);

                            if ( (LA83_0==LEFT) ) {
                                alt83=1;
                            }
                            switch (alt83) {
                                case 1 :
                                    // Sql.g:247:18: LEFT
                                    {
                                    LEFT230=(Token)match(input,LEFT,FOLLOW_LEFT_in_join_op2174); 
                                    LEFT230_tree = (Object)adaptor.create(LEFT230);
                                    adaptor.addChild(root_0, LEFT230_tree);


                                    }
                                    break;

                            }

                            // Sql.g:247:25: ( OUTER )?
                            int alt84=2;
                            int LA84_0 = input.LA(1);

                            if ( (LA84_0==OUTER) ) {
                                alt84=1;
                            }
                            switch (alt84) {
                                case 1 :
                                    // Sql.g:247:26: OUTER
                                    {
                                    OUTER231=(Token)match(input,OUTER,FOLLOW_OUTER_in_join_op2179); 
                                    OUTER231_tree = (Object)adaptor.create(OUTER231);
                                    adaptor.addChild(root_0, OUTER231_tree);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // Sql.g:247:36: INNER
                            {
                            INNER232=(Token)match(input,INNER,FOLLOW_INNER_in_join_op2185); 
                            INNER232_tree = (Object)adaptor.create(INNER232);
                            adaptor.addChild(root_0, INNER232_tree);


                            }
                            break;
                        case 3 :
                            // Sql.g:247:44: CROSS
                            {
                            CROSS233=(Token)match(input,CROSS,FOLLOW_CROSS_in_join_op2189); 
                            CROSS233_tree = (Object)adaptor.create(CROSS233);
                            adaptor.addChild(root_0, CROSS233_tree);


                            }
                            break;

                    }

                    JOIN234=(Token)match(input,JOIN,FOLLOW_JOIN_in_join_op2192); 
                    JOIN234_tree = (Object)adaptor.create(JOIN234);
                    root_0 = (Object)adaptor.becomeRoot(JOIN234_tree, root_0);


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
    // Sql.g:249:1: join_constraint : ( ON expr | USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN -> ^( USING ( $column_names)+ ) );
    public final SqlParser.join_constraint_return join_constraint() throws RecognitionException {
        SqlParser.join_constraint_return retval = new SqlParser.join_constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ON235=null;
        Token USING237=null;
        Token LPAREN238=null;
        Token COMMA239=null;
        Token RPAREN240=null;
        List list_column_names=null;
        SqlParser.expr_return expr236 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object ON235_tree=null;
        Object USING237_tree=null;
        Object LPAREN238_tree=null;
        Object COMMA239_tree=null;
        Object RPAREN240_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // Sql.g:250:3: ( ON expr | USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN -> ^( USING ( $column_names)+ ) )
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
                    // Sql.g:250:5: ON expr
                    {
                    root_0 = (Object)adaptor.nil();

                    ON235=(Token)match(input,ON,FOLLOW_ON_in_join_constraint2203); 
                    ON235_tree = (Object)adaptor.create(ON235);
                    root_0 = (Object)adaptor.becomeRoot(ON235_tree, root_0);

                    pushFollow(FOLLOW_expr_in_join_constraint2206);
                    expr236=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr236.getTree());

                    }
                    break;
                case 2 :
                    // Sql.g:251:5: USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                    {
                    USING237=(Token)match(input,USING,FOLLOW_USING_in_join_constraint2212);  
                    stream_USING.add(USING237);

                    LPAREN238=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_join_constraint2214);  
                    stream_LPAREN.add(LPAREN238);

                    pushFollow(FOLLOW_id_in_join_constraint2218);
                    column_names=id();

                    state._fsp--;

                    stream_id.add(column_names.getTree());
                    if (list_column_names==null) list_column_names=new ArrayList();
                    list_column_names.add(column_names.getTree());

                    // Sql.g:251:35: ( COMMA column_names+= id )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==COMMA) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // Sql.g:251:36: COMMA column_names+= id
                    	    {
                    	    COMMA239=(Token)match(input,COMMA,FOLLOW_COMMA_in_join_constraint2221);  
                    	    stream_COMMA.add(COMMA239);

                    	    pushFollow(FOLLOW_id_in_join_constraint2225);
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

                    RPAREN240=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_join_constraint2229);  
                    stream_RPAREN.add(RPAREN240);



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
                    // 251:68: -> ^( USING ( $column_names)+ )
                    {
                        // Sql.g:251:71: ^( USING ( $column_names)+ )
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
    // Sql.g:254:1: insert_stmt : ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES ) ;
    public final SqlParser.insert_stmt_return insert_stmt() throws RecognitionException {
        SqlParser.insert_stmt_return retval = new SqlParser.insert_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSERT241=null;
        Token REPLACE243=null;
        Token INTO244=null;
        Token DOT245=null;
        Token LPAREN246=null;
        Token COMMA247=null;
        Token RPAREN248=null;
        Token VALUES249=null;
        Token LPAREN250=null;
        Token COMMA251=null;
        Token RPAREN252=null;
        Token DEFAULT254=null;
        Token VALUES255=null;
        List list_column_names=null;
        List list_values=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.operation_conflict_clause_return operation_conflict_clause242 = null;

        SqlParser.select_stmt_return select_stmt253 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        SqlParser.expr_return values = null;
         values = null;
        Object INSERT241_tree=null;
        Object REPLACE243_tree=null;
        Object INTO244_tree=null;
        Object DOT245_tree=null;
        Object LPAREN246_tree=null;
        Object COMMA247_tree=null;
        Object RPAREN248_tree=null;
        Object VALUES249_tree=null;
        Object LPAREN250_tree=null;
        Object COMMA251_tree=null;
        Object RPAREN252_tree=null;
        Object DEFAULT254_tree=null;
        Object VALUES255_tree=null;

        try {
            // Sql.g:254:12: ( ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES ) )
            // Sql.g:254:14: ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES )
            {
            root_0 = (Object)adaptor.nil();

            // Sql.g:254:14: ( INSERT ( operation_conflict_clause )? | REPLACE )
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
                    // Sql.g:254:15: INSERT ( operation_conflict_clause )?
                    {
                    INSERT241=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_stmt2248); 
                    INSERT241_tree = (Object)adaptor.create(INSERT241);
                    adaptor.addChild(root_0, INSERT241_tree);

                    // Sql.g:254:22: ( operation_conflict_clause )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==OR) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // Sql.g:254:23: operation_conflict_clause
                            {
                            pushFollow(FOLLOW_operation_conflict_clause_in_insert_stmt2251);
                            operation_conflict_clause242=operation_conflict_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, operation_conflict_clause242.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Sql.g:254:53: REPLACE
                    {
                    REPLACE243=(Token)match(input,REPLACE,FOLLOW_REPLACE_in_insert_stmt2257); 
                    REPLACE243_tree = (Object)adaptor.create(REPLACE243);
                    adaptor.addChild(root_0, REPLACE243_tree);


                    }
                    break;

            }

            INTO244=(Token)match(input,INTO,FOLLOW_INTO_in_insert_stmt2260); 
            INTO244_tree = (Object)adaptor.create(INTO244);
            adaptor.addChild(root_0, INTO244_tree);

            // Sql.g:254:67: (database_name= id DOT )?
            int alt91=2;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // Sql.g:254:68: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_insert_stmt2265);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT245=(Token)match(input,DOT,FOLLOW_DOT_in_insert_stmt2267); 
                    DOT245_tree = (Object)adaptor.create(DOT245);
                    adaptor.addChild(root_0, DOT245_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_insert_stmt2273);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // Sql.g:255:3: ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES )
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
                    // Sql.g:255:5: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt )
                    {
                    // Sql.g:255:5: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==LPAREN) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // Sql.g:255:6: LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                            {
                            LPAREN246=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt2280); 
                            LPAREN246_tree = (Object)adaptor.create(LPAREN246);
                            adaptor.addChild(root_0, LPAREN246_tree);

                            pushFollow(FOLLOW_id_in_insert_stmt2284);
                            column_names=id();

                            state._fsp--;

                            adaptor.addChild(root_0, column_names.getTree());
                            if (list_column_names==null) list_column_names=new ArrayList();
                            list_column_names.add(column_names.getTree());

                            // Sql.g:255:30: ( COMMA column_names+= id )*
                            loop92:
                            do {
                                int alt92=2;
                                int LA92_0 = input.LA(1);

                                if ( (LA92_0==COMMA) ) {
                                    alt92=1;
                                }


                                switch (alt92) {
                            	case 1 :
                            	    // Sql.g:255:31: COMMA column_names+= id
                            	    {
                            	    COMMA247=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt2287); 
                            	    COMMA247_tree = (Object)adaptor.create(COMMA247);
                            	    adaptor.addChild(root_0, COMMA247_tree);

                            	    pushFollow(FOLLOW_id_in_insert_stmt2291);
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

                            RPAREN248=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt2295); 
                            RPAREN248_tree = (Object)adaptor.create(RPAREN248);
                            adaptor.addChild(root_0, RPAREN248_tree);


                            }
                            break;

                    }

                    // Sql.g:256:5: ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt )
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
                            // Sql.g:256:6: VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN
                            {
                            VALUES249=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt2304); 
                            VALUES249_tree = (Object)adaptor.create(VALUES249);
                            adaptor.addChild(root_0, VALUES249_tree);

                            LPAREN250=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt2306); 
                            LPAREN250_tree = (Object)adaptor.create(LPAREN250);
                            adaptor.addChild(root_0, LPAREN250_tree);

                            pushFollow(FOLLOW_expr_in_insert_stmt2310);
                            values=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, values.getTree());
                            if (list_values==null) list_values=new ArrayList();
                            list_values.add(values.getTree());

                            // Sql.g:256:33: ( COMMA values+= expr )*
                            loop94:
                            do {
                                int alt94=2;
                                int LA94_0 = input.LA(1);

                                if ( (LA94_0==COMMA) ) {
                                    alt94=1;
                                }


                                switch (alt94) {
                            	case 1 :
                            	    // Sql.g:256:34: COMMA values+= expr
                            	    {
                            	    COMMA251=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt2313); 
                            	    COMMA251_tree = (Object)adaptor.create(COMMA251);
                            	    adaptor.addChild(root_0, COMMA251_tree);

                            	    pushFollow(FOLLOW_expr_in_insert_stmt2317);
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

                            RPAREN252=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt2321); 
                            RPAREN252_tree = (Object)adaptor.create(RPAREN252);
                            adaptor.addChild(root_0, RPAREN252_tree);


                            }
                            break;
                        case 2 :
                            // Sql.g:256:64: select_stmt
                            {
                            pushFollow(FOLLOW_select_stmt_in_insert_stmt2325);
                            select_stmt253=select_stmt();

                            state._fsp--;

                            adaptor.addChild(root_0, select_stmt253.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Sql.g:257:5: DEFAULT VALUES
                    {
                    DEFAULT254=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_insert_stmt2332); 
                    DEFAULT254_tree = (Object)adaptor.create(DEFAULT254);
                    adaptor.addChild(root_0, DEFAULT254_tree);

                    VALUES255=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt2334); 
                    VALUES255_tree = (Object)adaptor.create(VALUES255);
                    adaptor.addChild(root_0, VALUES255_tree);


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
    // Sql.g:260:1: update_stmt : UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )? ;
    public final SqlParser.update_stmt_return update_stmt() throws RecognitionException {
        SqlParser.update_stmt_return retval = new SqlParser.update_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UPDATE256=null;
        Token SET259=null;
        Token COMMA260=null;
        Token WHERE261=null;
        List list_values=null;
        SqlParser.operation_conflict_clause_return operation_conflict_clause257 = null;

        SqlParser.qualified_table_name_return qualified_table_name258 = null;

        SqlParser.expr_return expr262 = null;

        SqlParser.operation_limited_clause_return operation_limited_clause263 = null;

        SqlParser.update_set_return values = null;
         values = null;
        Object UPDATE256_tree=null;
        Object SET259_tree=null;
        Object COMMA260_tree=null;
        Object WHERE261_tree=null;

        try {
            // Sql.g:260:12: ( UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )? )
            // Sql.g:260:14: UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )?
            {
            root_0 = (Object)adaptor.nil();

            UPDATE256=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_update_stmt2344); 
            UPDATE256_tree = (Object)adaptor.create(UPDATE256);
            adaptor.addChild(root_0, UPDATE256_tree);

            // Sql.g:260:21: ( operation_conflict_clause )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==OR) ) {
                int LA97_1 = input.LA(2);

                if ( ((LA97_1>=IGNORE && LA97_1<=FAIL)||LA97_1==REPLACE) ) {
                    alt97=1;
                }
            }
            switch (alt97) {
                case 1 :
                    // Sql.g:260:22: operation_conflict_clause
                    {
                    pushFollow(FOLLOW_operation_conflict_clause_in_update_stmt2347);
                    operation_conflict_clause257=operation_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_conflict_clause257.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_qualified_table_name_in_update_stmt2351);
            qualified_table_name258=qualified_table_name();

            state._fsp--;

            adaptor.addChild(root_0, qualified_table_name258.getTree());
            SET259=(Token)match(input,SET,FOLLOW_SET_in_update_stmt2355); 
            SET259_tree = (Object)adaptor.create(SET259);
            adaptor.addChild(root_0, SET259_tree);

            pushFollow(FOLLOW_update_set_in_update_stmt2359);
            values=update_set();

            state._fsp--;

            adaptor.addChild(root_0, values.getTree());
            if (list_values==null) list_values=new ArrayList();
            list_values.add(values.getTree());

            // Sql.g:261:26: ( COMMA values+= update_set )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==COMMA) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // Sql.g:261:27: COMMA values+= update_set
            	    {
            	    COMMA260=(Token)match(input,COMMA,FOLLOW_COMMA_in_update_stmt2362); 
            	    COMMA260_tree = (Object)adaptor.create(COMMA260);
            	    adaptor.addChild(root_0, COMMA260_tree);

            	    pushFollow(FOLLOW_update_set_in_update_stmt2366);
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

            // Sql.g:261:54: ( WHERE expr )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==WHERE) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // Sql.g:261:55: WHERE expr
                    {
                    WHERE261=(Token)match(input,WHERE,FOLLOW_WHERE_in_update_stmt2371); 
                    WHERE261_tree = (Object)adaptor.create(WHERE261);
                    adaptor.addChild(root_0, WHERE261_tree);

                    pushFollow(FOLLOW_expr_in_update_stmt2373);
                    expr262=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr262.getTree());

                    }
                    break;

            }

            // Sql.g:261:68: ( operation_limited_clause )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( ((LA100_0>=ORDER && LA100_0<=LIMIT)) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // Sql.g:261:69: operation_limited_clause
                    {
                    pushFollow(FOLLOW_operation_limited_clause_in_update_stmt2378);
                    operation_limited_clause263=operation_limited_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_limited_clause263.getTree());

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
    // Sql.g:263:1: update_set : column_name= id EQUALS expr ;
    public final SqlParser.update_set_return update_set() throws RecognitionException {
        SqlParser.update_set_return retval = new SqlParser.update_set_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EQUALS264=null;
        SqlParser.id_return column_name = null;

        SqlParser.expr_return expr265 = null;


        Object EQUALS264_tree=null;

        try {
            // Sql.g:263:11: (column_name= id EQUALS expr )
            // Sql.g:263:13: column_name= id EQUALS expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_update_set2389);
            column_name=id();

            state._fsp--;

            adaptor.addChild(root_0, column_name.getTree());
            EQUALS264=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_update_set2391); 
            EQUALS264_tree = (Object)adaptor.create(EQUALS264);
            adaptor.addChild(root_0, EQUALS264_tree);

            pushFollow(FOLLOW_expr_in_update_set2393);
            expr265=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr265.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:266:1: delete_stmt : DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )? ;
    public final SqlParser.delete_stmt_return delete_stmt() throws RecognitionException {
        SqlParser.delete_stmt_return retval = new SqlParser.delete_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DELETE266=null;
        Token FROM267=null;
        Token WHERE269=null;
        SqlParser.qualified_table_name_return qualified_table_name268 = null;

        SqlParser.expr_return expr270 = null;

        SqlParser.operation_limited_clause_return operation_limited_clause271 = null;


        Object DELETE266_tree=null;
        Object FROM267_tree=null;
        Object WHERE269_tree=null;

        try {
            // Sql.g:266:12: ( DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )? )
            // Sql.g:266:14: DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )?
            {
            root_0 = (Object)adaptor.nil();

            DELETE266=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_stmt2401); 
            DELETE266_tree = (Object)adaptor.create(DELETE266);
            adaptor.addChild(root_0, DELETE266_tree);

            FROM267=(Token)match(input,FROM,FOLLOW_FROM_in_delete_stmt2403); 
            FROM267_tree = (Object)adaptor.create(FROM267);
            adaptor.addChild(root_0, FROM267_tree);

            pushFollow(FOLLOW_qualified_table_name_in_delete_stmt2405);
            qualified_table_name268=qualified_table_name();

            state._fsp--;

            adaptor.addChild(root_0, qualified_table_name268.getTree());
            // Sql.g:266:47: ( WHERE expr )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==WHERE) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // Sql.g:266:48: WHERE expr
                    {
                    WHERE269=(Token)match(input,WHERE,FOLLOW_WHERE_in_delete_stmt2408); 
                    WHERE269_tree = (Object)adaptor.create(WHERE269);
                    adaptor.addChild(root_0, WHERE269_tree);

                    pushFollow(FOLLOW_expr_in_delete_stmt2410);
                    expr270=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr270.getTree());

                    }
                    break;

            }

            // Sql.g:266:61: ( operation_limited_clause )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( ((LA102_0>=ORDER && LA102_0<=LIMIT)) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // Sql.g:266:62: operation_limited_clause
                    {
                    pushFollow(FOLLOW_operation_limited_clause_in_delete_stmt2415);
                    operation_limited_clause271=operation_limited_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_limited_clause271.getTree());

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
    // Sql.g:269:1: begin_stmt : BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )? ;
    public final SqlParser.begin_stmt_return begin_stmt() throws RecognitionException {
        SqlParser.begin_stmt_return retval = new SqlParser.begin_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BEGIN272=null;
        Token set273=null;
        Token TRANSACTION274=null;

        Object BEGIN272_tree=null;
        Object set273_tree=null;
        Object TRANSACTION274_tree=null;

        try {
            // Sql.g:269:11: ( BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )? )
            // Sql.g:269:13: BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )?
            {
            root_0 = (Object)adaptor.nil();

            BEGIN272=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_begin_stmt2425); 
            BEGIN272_tree = (Object)adaptor.create(BEGIN272);
            adaptor.addChild(root_0, BEGIN272_tree);

            // Sql.g:269:19: ( DEFERRED | IMMEDIATE | EXCLUSIVE )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( ((LA103_0>=DEFERRED && LA103_0<=EXCLUSIVE)) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // Sql.g:
                    {
                    set273=(Token)input.LT(1);
                    if ( (input.LA(1)>=DEFERRED && input.LA(1)<=EXCLUSIVE) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set273));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            // Sql.g:269:55: ( TRANSACTION )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==TRANSACTION) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // Sql.g:269:56: TRANSACTION
                    {
                    TRANSACTION274=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_begin_stmt2441); 
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
    // $ANTLR end "begin_stmt"

    public static class commit_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commit_stmt"
    // Sql.g:272:1: commit_stmt : ( COMMIT | END ) ( TRANSACTION )? ;
    public final SqlParser.commit_stmt_return commit_stmt() throws RecognitionException {
        SqlParser.commit_stmt_return retval = new SqlParser.commit_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set275=null;
        Token TRANSACTION276=null;

        Object set275_tree=null;
        Object TRANSACTION276_tree=null;

        try {
            // Sql.g:272:12: ( ( COMMIT | END ) ( TRANSACTION )? )
            // Sql.g:272:14: ( COMMIT | END ) ( TRANSACTION )?
            {
            root_0 = (Object)adaptor.nil();

            set275=(Token)input.LT(1);
            if ( input.LA(1)==END||input.LA(1)==COMMIT ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set275));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // Sql.g:272:29: ( TRANSACTION )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==TRANSACTION) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // Sql.g:272:30: TRANSACTION
                    {
                    TRANSACTION276=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_commit_stmt2460); 
                    TRANSACTION276_tree = (Object)adaptor.create(TRANSACTION276);
                    adaptor.addChild(root_0, TRANSACTION276_tree);


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
    // Sql.g:275:1: rollback_stmt : ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )? ;
    public final SqlParser.rollback_stmt_return rollback_stmt() throws RecognitionException {
        SqlParser.rollback_stmt_return retval = new SqlParser.rollback_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ROLLBACK277=null;
        Token TRANSACTION278=null;
        Token TO279=null;
        Token SAVEPOINT280=null;
        SqlParser.id_return savepoint_name = null;


        Object ROLLBACK277_tree=null;
        Object TRANSACTION278_tree=null;
        Object TO279_tree=null;
        Object SAVEPOINT280_tree=null;

        try {
            // Sql.g:275:14: ( ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )? )
            // Sql.g:275:16: ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )?
            {
            root_0 = (Object)adaptor.nil();

            ROLLBACK277=(Token)match(input,ROLLBACK,FOLLOW_ROLLBACK_in_rollback_stmt2470); 
            ROLLBACK277_tree = (Object)adaptor.create(ROLLBACK277);
            adaptor.addChild(root_0, ROLLBACK277_tree);

            // Sql.g:275:25: ( TRANSACTION )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==TRANSACTION) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // Sql.g:275:26: TRANSACTION
                    {
                    TRANSACTION278=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_rollback_stmt2473); 
                    TRANSACTION278_tree = (Object)adaptor.create(TRANSACTION278);
                    adaptor.addChild(root_0, TRANSACTION278_tree);


                    }
                    break;

            }

            // Sql.g:275:40: ( TO ( SAVEPOINT )? savepoint_name= id )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==TO) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // Sql.g:275:41: TO ( SAVEPOINT )? savepoint_name= id
                    {
                    TO279=(Token)match(input,TO,FOLLOW_TO_in_rollback_stmt2478); 
                    TO279_tree = (Object)adaptor.create(TO279);
                    adaptor.addChild(root_0, TO279_tree);

                    // Sql.g:275:44: ( SAVEPOINT )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==SAVEPOINT) ) {
                        int LA107_1 = input.LA(2);

                        if ( ((LA107_1>=EXPLAIN && LA107_1<=PLAN)||(LA107_1>=INDEXED && LA107_1<=BY)||(LA107_1>=OR && LA107_1<=ESCAPE)||(LA107_1>=IS && LA107_1<=BETWEEN)||(LA107_1>=COLLATE && LA107_1<=THEN)||(LA107_1>=CURRENT_TIME && LA107_1<=CURRENT_TIMESTAMP)||(LA107_1>=RAISE && LA107_1<=ROW)) ) {
                            alt107=1;
                        }
                    }
                    switch (alt107) {
                        case 1 :
                            // Sql.g:275:45: SAVEPOINT
                            {
                            SAVEPOINT280=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_rollback_stmt2481); 
                            SAVEPOINT280_tree = (Object)adaptor.create(SAVEPOINT280);
                            adaptor.addChild(root_0, SAVEPOINT280_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_id_in_rollback_stmt2487);
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
    // Sql.g:278:1: savepoint_stmt : SAVEPOINT savepoint_name= id ;
    public final SqlParser.savepoint_stmt_return savepoint_stmt() throws RecognitionException {
        SqlParser.savepoint_stmt_return retval = new SqlParser.savepoint_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SAVEPOINT281=null;
        SqlParser.id_return savepoint_name = null;


        Object SAVEPOINT281_tree=null;

        try {
            // Sql.g:278:15: ( SAVEPOINT savepoint_name= id )
            // Sql.g:278:17: SAVEPOINT savepoint_name= id
            {
            root_0 = (Object)adaptor.nil();

            SAVEPOINT281=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_savepoint_stmt2497); 
            SAVEPOINT281_tree = (Object)adaptor.create(SAVEPOINT281);
            adaptor.addChild(root_0, SAVEPOINT281_tree);

            pushFollow(FOLLOW_id_in_savepoint_stmt2501);
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
    // Sql.g:281:1: release_stmt : RELEASE ( SAVEPOINT )? savepoint_name= id ;
    public final SqlParser.release_stmt_return release_stmt() throws RecognitionException {
        SqlParser.release_stmt_return retval = new SqlParser.release_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RELEASE282=null;
        Token SAVEPOINT283=null;
        SqlParser.id_return savepoint_name = null;


        Object RELEASE282_tree=null;
        Object SAVEPOINT283_tree=null;

        try {
            // Sql.g:281:13: ( RELEASE ( SAVEPOINT )? savepoint_name= id )
            // Sql.g:281:15: RELEASE ( SAVEPOINT )? savepoint_name= id
            {
            root_0 = (Object)adaptor.nil();

            RELEASE282=(Token)match(input,RELEASE,FOLLOW_RELEASE_in_release_stmt2509); 
            RELEASE282_tree = (Object)adaptor.create(RELEASE282);
            adaptor.addChild(root_0, RELEASE282_tree);

            // Sql.g:281:23: ( SAVEPOINT )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==SAVEPOINT) ) {
                int LA109_1 = input.LA(2);

                if ( ((LA109_1>=EXPLAIN && LA109_1<=PLAN)||(LA109_1>=INDEXED && LA109_1<=BY)||(LA109_1>=OR && LA109_1<=ESCAPE)||(LA109_1>=IS && LA109_1<=BETWEEN)||(LA109_1>=COLLATE && LA109_1<=THEN)||(LA109_1>=CURRENT_TIME && LA109_1<=CURRENT_TIMESTAMP)||(LA109_1>=RAISE && LA109_1<=ROW)) ) {
                    alt109=1;
                }
            }
            switch (alt109) {
                case 1 :
                    // Sql.g:281:24: SAVEPOINT
                    {
                    SAVEPOINT283=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_release_stmt2512); 
                    SAVEPOINT283_tree = (Object)adaptor.create(SAVEPOINT283);
                    adaptor.addChild(root_0, SAVEPOINT283_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_release_stmt2518);
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
    // Sql.g:288:1: table_conflict_clause : ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) ;
    public final SqlParser.table_conflict_clause_return table_conflict_clause() throws RecognitionException {
        SqlParser.table_conflict_clause_return retval = new SqlParser.table_conflict_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ON284=null;
        Token CONFLICT285=null;
        Token set286=null;

        Object ON284_tree=null;
        Object CONFLICT285_tree=null;
        Object set286_tree=null;

        try {
            // Sql.g:288:22: ( ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) )
            // Sql.g:288:24: ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE )
            {
            root_0 = (Object)adaptor.nil();

            ON284=(Token)match(input,ON,FOLLOW_ON_in_table_conflict_clause2530); 
            CONFLICT285=(Token)match(input,CONFLICT,FOLLOW_CONFLICT_in_table_conflict_clause2533); 
            CONFLICT285_tree = (Object)adaptor.create(CONFLICT285);
            root_0 = (Object)adaptor.becomeRoot(CONFLICT285_tree, root_0);

            set286=(Token)input.LT(1);
            if ( (input.LA(1)>=IGNORE && input.LA(1)<=FAIL)||input.LA(1)==REPLACE ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set286));
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
    // Sql.g:292:1: create_virtual_table_stmt : CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )? ;
    public final SqlParser.create_virtual_table_stmt_return create_virtual_table_stmt() throws RecognitionException {
        SqlParser.create_virtual_table_stmt_return retval = new SqlParser.create_virtual_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE287=null;
        Token VIRTUAL288=null;
        Token TABLE289=null;
        Token DOT290=null;
        Token USING291=null;
        Token LPAREN292=null;
        Token COMMA294=null;
        Token RPAREN296=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.id_return module_name = null;

        SqlParser.column_def_return column_def293 = null;

        SqlParser.column_def_return column_def295 = null;


        Object CREATE287_tree=null;
        Object VIRTUAL288_tree=null;
        Object TABLE289_tree=null;
        Object DOT290_tree=null;
        Object USING291_tree=null;
        Object LPAREN292_tree=null;
        Object COMMA294_tree=null;
        Object RPAREN296_tree=null;

        try {
            // Sql.g:292:26: ( CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )? )
            // Sql.g:292:28: CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            CREATE287=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_virtual_table_stmt2563); 
            CREATE287_tree = (Object)adaptor.create(CREATE287);
            adaptor.addChild(root_0, CREATE287_tree);

            VIRTUAL288=(Token)match(input,VIRTUAL,FOLLOW_VIRTUAL_in_create_virtual_table_stmt2565); 
            VIRTUAL288_tree = (Object)adaptor.create(VIRTUAL288);
            adaptor.addChild(root_0, VIRTUAL288_tree);

            TABLE289=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_virtual_table_stmt2567); 
            TABLE289_tree = (Object)adaptor.create(TABLE289);
            adaptor.addChild(root_0, TABLE289_tree);

            // Sql.g:292:49: (database_name= id DOT )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==ID) ) {
                int LA110_1 = input.LA(2);

                if ( (LA110_1==DOT) ) {
                    alt110=1;
                }
            }
            else if ( ((LA110_0>=EXPLAIN && LA110_0<=PLAN)||(LA110_0>=INDEXED && LA110_0<=BY)||(LA110_0>=OR && LA110_0<=ESCAPE)||(LA110_0>=IS && LA110_0<=BETWEEN)||LA110_0==COLLATE||(LA110_0>=DISTINCT && LA110_0<=THEN)||(LA110_0>=CURRENT_TIME && LA110_0<=CURRENT_TIMESTAMP)||(LA110_0>=RAISE && LA110_0<=ROW)) ) {
                int LA110_2 = input.LA(2);

                if ( (LA110_2==DOT) ) {
                    alt110=1;
                }
            }
            switch (alt110) {
                case 1 :
                    // Sql.g:292:50: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_virtual_table_stmt2572);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT290=(Token)match(input,DOT,FOLLOW_DOT_in_create_virtual_table_stmt2574); 
                    DOT290_tree = (Object)adaptor.create(DOT290);
                    adaptor.addChild(root_0, DOT290_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_virtual_table_stmt2580);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            USING291=(Token)match(input,USING,FOLLOW_USING_in_create_virtual_table_stmt2584); 
            USING291_tree = (Object)adaptor.create(USING291);
            adaptor.addChild(root_0, USING291_tree);

            pushFollow(FOLLOW_id_in_create_virtual_table_stmt2588);
            module_name=id();

            state._fsp--;

            adaptor.addChild(root_0, module_name.getTree());
            // Sql.g:293:24: ( LPAREN column_def ( COMMA column_def )* RPAREN )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==LPAREN) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // Sql.g:293:25: LPAREN column_def ( COMMA column_def )* RPAREN
                    {
                    LPAREN292=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_virtual_table_stmt2591); 
                    LPAREN292_tree = (Object)adaptor.create(LPAREN292);
                    adaptor.addChild(root_0, LPAREN292_tree);

                    pushFollow(FOLLOW_column_def_in_create_virtual_table_stmt2593);
                    column_def293=column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, column_def293.getTree());
                    // Sql.g:293:43: ( COMMA column_def )*
                    loop111:
                    do {
                        int alt111=2;
                        int LA111_0 = input.LA(1);

                        if ( (LA111_0==COMMA) ) {
                            alt111=1;
                        }


                        switch (alt111) {
                    	case 1 :
                    	    // Sql.g:293:44: COMMA column_def
                    	    {
                    	    COMMA294=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_virtual_table_stmt2596); 
                    	    COMMA294_tree = (Object)adaptor.create(COMMA294);
                    	    adaptor.addChild(root_0, COMMA294_tree);

                    	    pushFollow(FOLLOW_column_def_in_create_virtual_table_stmt2598);
                    	    column_def295=column_def();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, column_def295.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop111;
                        }
                    } while (true);

                    RPAREN296=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_virtual_table_stmt2602); 
                    RPAREN296_tree = (Object)adaptor.create(RPAREN296);
                    adaptor.addChild(root_0, RPAREN296_tree);


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
    // Sql.g:296:1: create_table_stmt : CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt ) -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? ) ;
    public final SqlParser.create_table_stmt_return create_table_stmt() throws RecognitionException {
        SqlParser.create_table_stmt_return retval = new SqlParser.create_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE297=null;
        Token TEMPORARY298=null;
        Token TABLE299=null;
        Token IF300=null;
        Token NOT301=null;
        Token EXISTS302=null;
        Token DOT303=null;
        Token LPAREN304=null;
        Token COMMA306=null;
        Token COMMA308=null;
        Token RPAREN310=null;
        Token AS311=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.column_def_return column_def305 = null;

        SqlParser.column_def_return column_def307 = null;

        SqlParser.table_constraint_return table_constraint309 = null;

        SqlParser.select_stmt_return select_stmt312 = null;


        Object CREATE297_tree=null;
        Object TEMPORARY298_tree=null;
        Object TABLE299_tree=null;
        Object IF300_tree=null;
        Object NOT301_tree=null;
        Object EXISTS302_tree=null;
        Object DOT303_tree=null;
        Object LPAREN304_tree=null;
        Object COMMA306_tree=null;
        Object COMMA308_tree=null;
        Object RPAREN310_tree=null;
        Object AS311_tree=null;
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
            // Sql.g:296:18: ( CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt ) -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? ) )
            // Sql.g:296:20: CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt )
            {
            CREATE297=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_table_stmt2612);  
            stream_CREATE.add(CREATE297);

            // Sql.g:296:27: ( TEMPORARY )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==TEMPORARY) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // Sql.g:296:27: TEMPORARY
                    {
                    TEMPORARY298=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_table_stmt2614);  
                    stream_TEMPORARY.add(TEMPORARY298);


                    }
                    break;

            }

            TABLE299=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_table_stmt2617);  
            stream_TABLE.add(TABLE299);

            // Sql.g:296:44: ( IF NOT EXISTS )?
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
                    // Sql.g:296:45: IF NOT EXISTS
                    {
                    IF300=(Token)match(input,IF,FOLLOW_IF_in_create_table_stmt2620);  
                    stream_IF.add(IF300);

                    NOT301=(Token)match(input,NOT,FOLLOW_NOT_in_create_table_stmt2622);  
                    stream_NOT.add(NOT301);

                    EXISTS302=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_table_stmt2624);  
                    stream_EXISTS.add(EXISTS302);


                    }
                    break;

            }

            // Sql.g:296:61: (database_name= id DOT )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==ID) ) {
                int LA115_1 = input.LA(2);

                if ( (LA115_1==DOT) ) {
                    alt115=1;
                }
            }
            else if ( ((LA115_0>=EXPLAIN && LA115_0<=PLAN)||(LA115_0>=INDEXED && LA115_0<=BY)||(LA115_0>=OR && LA115_0<=ESCAPE)||(LA115_0>=IS && LA115_0<=BETWEEN)||LA115_0==COLLATE||(LA115_0>=DISTINCT && LA115_0<=THEN)||(LA115_0>=CURRENT_TIME && LA115_0<=CURRENT_TIMESTAMP)||(LA115_0>=RAISE && LA115_0<=ROW)) ) {
                int LA115_2 = input.LA(2);

                if ( (LA115_2==DOT) ) {
                    alt115=1;
                }
            }
            switch (alt115) {
                case 1 :
                    // Sql.g:296:62: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_table_stmt2631);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT303=(Token)match(input,DOT,FOLLOW_DOT_in_create_table_stmt2633);  
                    stream_DOT.add(DOT303);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_table_stmt2639);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());
            // Sql.g:297:3: ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt )
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
                    // Sql.g:297:5: LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN
                    {
                    LPAREN304=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_table_stmt2645);  
                    stream_LPAREN.add(LPAREN304);

                    pushFollow(FOLLOW_column_def_in_create_table_stmt2647);
                    column_def305=column_def();

                    state._fsp--;

                    stream_column_def.add(column_def305.getTree());
                    // Sql.g:297:23: ( COMMA column_def )*
                    loop116:
                    do {
                        int alt116=2;
                        alt116 = dfa116.predict(input);
                        switch (alt116) {
                    	case 1 :
                    	    // Sql.g:297:24: COMMA column_def
                    	    {
                    	    COMMA306=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_table_stmt2650);  
                    	    stream_COMMA.add(COMMA306);

                    	    pushFollow(FOLLOW_column_def_in_create_table_stmt2652);
                    	    column_def307=column_def();

                    	    state._fsp--;

                    	    stream_column_def.add(column_def307.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop116;
                        }
                    } while (true);

                    // Sql.g:297:43: ( COMMA table_constraint )*
                    loop117:
                    do {
                        int alt117=2;
                        int LA117_0 = input.LA(1);

                        if ( (LA117_0==COMMA) ) {
                            alt117=1;
                        }


                        switch (alt117) {
                    	case 1 :
                    	    // Sql.g:297:44: COMMA table_constraint
                    	    {
                    	    COMMA308=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_table_stmt2657);  
                    	    stream_COMMA.add(COMMA308);

                    	    pushFollow(FOLLOW_table_constraint_in_create_table_stmt2659);
                    	    table_constraint309=table_constraint();

                    	    state._fsp--;

                    	    stream_table_constraint.add(table_constraint309.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop117;
                        }
                    } while (true);

                    RPAREN310=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_table_stmt2663);  
                    stream_RPAREN.add(RPAREN310);


                    }
                    break;
                case 2 :
                    // Sql.g:298:5: AS select_stmt
                    {
                    AS311=(Token)match(input,AS,FOLLOW_AS_in_create_table_stmt2669);  
                    stream_AS.add(AS311);

                    pushFollow(FOLLOW_select_stmt_in_create_table_stmt2671);
                    select_stmt312=select_stmt();

                    state._fsp--;

                    stream_select_stmt.add(select_stmt312.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: database_name, TEMPORARY, column_def, EXISTS, table_constraint, table_name, select_stmt
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
            // 299:1: -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? )
            {
                // Sql.g:299:4: ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CREATE_TABLE, "CREATE_TABLE"), root_1);

                // Sql.g:299:19: ^( OPTIONS ( TEMPORARY )? ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // Sql.g:299:29: ( TEMPORARY )?
                if ( stream_TEMPORARY.hasNext() ) {
                    adaptor.addChild(root_2, stream_TEMPORARY.nextNode());

                }
                stream_TEMPORARY.reset();
                // Sql.g:299:40: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // Sql.g:299:49: ^( $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                // Sql.g:299:63: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }
                // Sql.g:300:3: ( ^( COLUMNS ( column_def )+ ) )?
                if ( stream_column_def.hasNext() ) {
                    // Sql.g:300:3: ^( COLUMNS ( column_def )+ )
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
                // Sql.g:300:27: ( ^( CONSTRAINTS ( table_constraint )* ) )?
                if ( stream_table_constraint.hasNext() ) {
                    // Sql.g:300:27: ^( CONSTRAINTS ( table_constraint )* )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRAINTS, "CONSTRAINTS"), root_2);

                    // Sql.g:300:41: ( table_constraint )*
                    while ( stream_table_constraint.hasNext() ) {
                        adaptor.addChild(root_2, stream_table_constraint.nextTree());

                    }
                    stream_table_constraint.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_table_constraint.reset();
                // Sql.g:300:61: ( select_stmt )?
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
    // Sql.g:302:1: column_def : name= id_column_def ( type_name )? ( column_constraint )* -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? ) ;
    public final SqlParser.column_def_return column_def() throws RecognitionException {
        SqlParser.column_def_return retval = new SqlParser.column_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.id_column_def_return name = null;

        SqlParser.type_name_return type_name313 = null;

        SqlParser.column_constraint_return column_constraint314 = null;


        RewriteRuleSubtreeStream stream_column_constraint=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint");
        RewriteRuleSubtreeStream stream_id_column_def=new RewriteRuleSubtreeStream(adaptor,"rule id_column_def");
        RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");
        try {
            // Sql.g:302:11: (name= id_column_def ( type_name )? ( column_constraint )* -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? ) )
            // Sql.g:302:13: name= id_column_def ( type_name )? ( column_constraint )*
            {
            pushFollow(FOLLOW_id_column_def_in_column_def2727);
            name=id_column_def();

            state._fsp--;

            stream_id_column_def.add(name.getTree());
            // Sql.g:302:32: ( type_name )?
            int alt119=2;
            alt119 = dfa119.predict(input);
            switch (alt119) {
                case 1 :
                    // Sql.g:302:32: type_name
                    {
                    pushFollow(FOLLOW_type_name_in_column_def2729);
                    type_name313=type_name();

                    state._fsp--;

                    stream_type_name.add(type_name313.getTree());

                    }
                    break;

            }

            // Sql.g:302:43: ( column_constraint )*
            loop120:
            do {
                int alt120=2;
                alt120 = dfa120.predict(input);
                switch (alt120) {
            	case 1 :
            	    // Sql.g:302:43: column_constraint
            	    {
            	    pushFollow(FOLLOW_column_constraint_in_column_def2732);
            	    column_constraint314=column_constraint();

            	    state._fsp--;

            	    stream_column_constraint.add(column_constraint314.getTree());

            	    }
            	    break;

            	default :
            	    break loop120;
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
            // 303:1: -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? )
            {
                // Sql.g:303:4: ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_name.nextNode(), root_1);

                // Sql.g:303:12: ^( CONSTRAINTS ( column_constraint )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRAINTS, "CONSTRAINTS"), root_2);

                // Sql.g:303:26: ( column_constraint )*
                while ( stream_column_constraint.hasNext() ) {
                    adaptor.addChild(root_2, stream_column_constraint.nextTree());

                }
                stream_column_constraint.reset();

                adaptor.addChild(root_1, root_2);
                }
                // Sql.g:303:46: ( type_name )?
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
    // Sql.g:305:1: column_constraint : ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause ) -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? ) ;
    public final SqlParser.column_constraint_return column_constraint() throws RecognitionException {
        SqlParser.column_constraint_return retval = new SqlParser.column_constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONSTRAINT315=null;
        SqlParser.id_return name = null;

        SqlParser.column_constraint_pk_return column_constraint_pk316 = null;

        SqlParser.column_constraint_not_null_return column_constraint_not_null317 = null;

        SqlParser.column_constraint_unique_return column_constraint_unique318 = null;

        SqlParser.column_constraint_check_return column_constraint_check319 = null;

        SqlParser.column_constraint_default_return column_constraint_default320 = null;

        SqlParser.column_constraint_collate_return column_constraint_collate321 = null;

        SqlParser.fk_clause_return fk_clause322 = null;


        Object CONSTRAINT315_tree=null;
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
            // Sql.g:305:18: ( ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause ) -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? ) )
            // Sql.g:305:20: ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause )
            {
            // Sql.g:305:20: ( CONSTRAINT name= id )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==CONSTRAINT) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // Sql.g:305:21: CONSTRAINT name= id
                    {
                    CONSTRAINT315=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_column_constraint2758);  
                    stream_CONSTRAINT.add(CONSTRAINT315);

                    pushFollow(FOLLOW_id_in_column_constraint2762);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());

                    }
                    break;

            }

            // Sql.g:306:3: ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause )
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
                    // Sql.g:306:5: column_constraint_pk
                    {
                    pushFollow(FOLLOW_column_constraint_pk_in_column_constraint2770);
                    column_constraint_pk316=column_constraint_pk();

                    state._fsp--;

                    stream_column_constraint_pk.add(column_constraint_pk316.getTree());

                    }
                    break;
                case 2 :
                    // Sql.g:307:5: column_constraint_not_null
                    {
                    pushFollow(FOLLOW_column_constraint_not_null_in_column_constraint2776);
                    column_constraint_not_null317=column_constraint_not_null();

                    state._fsp--;

                    stream_column_constraint_not_null.add(column_constraint_not_null317.getTree());

                    }
                    break;
                case 3 :
                    // Sql.g:308:5: column_constraint_unique
                    {
                    pushFollow(FOLLOW_column_constraint_unique_in_column_constraint2782);
                    column_constraint_unique318=column_constraint_unique();

                    state._fsp--;

                    stream_column_constraint_unique.add(column_constraint_unique318.getTree());

                    }
                    break;
                case 4 :
                    // Sql.g:309:5: column_constraint_check
                    {
                    pushFollow(FOLLOW_column_constraint_check_in_column_constraint2788);
                    column_constraint_check319=column_constraint_check();

                    state._fsp--;

                    stream_column_constraint_check.add(column_constraint_check319.getTree());

                    }
                    break;
                case 5 :
                    // Sql.g:310:5: column_constraint_default
                    {
                    pushFollow(FOLLOW_column_constraint_default_in_column_constraint2794);
                    column_constraint_default320=column_constraint_default();

                    state._fsp--;

                    stream_column_constraint_default.add(column_constraint_default320.getTree());

                    }
                    break;
                case 6 :
                    // Sql.g:311:5: column_constraint_collate
                    {
                    pushFollow(FOLLOW_column_constraint_collate_in_column_constraint2800);
                    column_constraint_collate321=column_constraint_collate();

                    state._fsp--;

                    stream_column_constraint_collate.add(column_constraint_collate321.getTree());

                    }
                    break;
                case 7 :
                    // Sql.g:312:5: fk_clause
                    {
                    pushFollow(FOLLOW_fk_clause_in_column_constraint2806);
                    fk_clause322=fk_clause();

                    state._fsp--;

                    stream_fk_clause.add(fk_clause322.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: column_constraint_check, column_constraint_collate, column_constraint_default, fk_clause, name, column_constraint_pk, column_constraint_unique, column_constraint_not_null
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 313:1: -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? )
            {
                // Sql.g:313:4: ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMN_CONSTRAINT, "COLUMN_CONSTRAINT"), root_1);

                // Sql.g:314:3: ( column_constraint_pk )?
                if ( stream_column_constraint_pk.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_pk.nextTree());

                }
                stream_column_constraint_pk.reset();
                // Sql.g:315:3: ( column_constraint_not_null )?
                if ( stream_column_constraint_not_null.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_not_null.nextTree());

                }
                stream_column_constraint_not_null.reset();
                // Sql.g:316:3: ( column_constraint_unique )?
                if ( stream_column_constraint_unique.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_unique.nextTree());

                }
                stream_column_constraint_unique.reset();
                // Sql.g:317:3: ( column_constraint_check )?
                if ( stream_column_constraint_check.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_check.nextTree());

                }
                stream_column_constraint_check.reset();
                // Sql.g:318:3: ( column_constraint_default )?
                if ( stream_column_constraint_default.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_default.nextTree());

                }
                stream_column_constraint_default.reset();
                // Sql.g:319:3: ( column_constraint_collate )?
                if ( stream_column_constraint_collate.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_collate.nextTree());

                }
                stream_column_constraint_collate.reset();
                // Sql.g:320:3: ( fk_clause )?
                if ( stream_fk_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_fk_clause.nextTree());

                }
                stream_fk_clause.reset();
                // Sql.g:321:3: ( $name)?
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
    // Sql.g:323:1: column_constraint_pk : PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )? ;
    public final SqlParser.column_constraint_pk_return column_constraint_pk() throws RecognitionException {
        SqlParser.column_constraint_pk_return retval = new SqlParser.column_constraint_pk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRIMARY323=null;
        Token KEY324=null;
        Token set325=null;
        Token AUTOINCREMENT327=null;
        SqlParser.table_conflict_clause_return table_conflict_clause326 = null;


        Object PRIMARY323_tree=null;
        Object KEY324_tree=null;
        Object set325_tree=null;
        Object AUTOINCREMENT327_tree=null;

        try {
            // Sql.g:323:21: ( PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )? )
            // Sql.g:323:23: PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )?
            {
            root_0 = (Object)adaptor.nil();

            PRIMARY323=(Token)match(input,PRIMARY,FOLLOW_PRIMARY_in_column_constraint_pk2861); 
            PRIMARY323_tree = (Object)adaptor.create(PRIMARY323);
            root_0 = (Object)adaptor.becomeRoot(PRIMARY323_tree, root_0);

            KEY324=(Token)match(input,KEY,FOLLOW_KEY_in_column_constraint_pk2864); 
            // Sql.g:323:37: ( ASC | DESC )?
            int alt123=2;
            alt123 = dfa123.predict(input);
            switch (alt123) {
                case 1 :
                    // Sql.g:
                    {
                    set325=(Token)input.LT(1);
                    if ( (input.LA(1)>=ASC && input.LA(1)<=DESC) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set325));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            // Sql.g:323:51: ( table_conflict_clause )?
            int alt124=2;
            alt124 = dfa124.predict(input);
            switch (alt124) {
                case 1 :
                    // Sql.g:323:51: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_pk2876);
                    table_conflict_clause326=table_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, table_conflict_clause326.getTree());

                    }
                    break;

            }

            // Sql.g:323:74: ( AUTOINCREMENT )?
            int alt125=2;
            alt125 = dfa125.predict(input);
            switch (alt125) {
                case 1 :
                    // Sql.g:323:75: AUTOINCREMENT
                    {
                    AUTOINCREMENT327=(Token)match(input,AUTOINCREMENT,FOLLOW_AUTOINCREMENT_in_column_constraint_pk2880); 
                    AUTOINCREMENT327_tree = (Object)adaptor.create(AUTOINCREMENT327);
                    adaptor.addChild(root_0, AUTOINCREMENT327_tree);


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
    // Sql.g:325:1: column_constraint_not_null : NOT NULL ( table_conflict_clause )? -> ^( NOT_NULL ( table_conflict_clause )? ) ;
    public final SqlParser.column_constraint_not_null_return column_constraint_not_null() throws RecognitionException {
        SqlParser.column_constraint_not_null_return retval = new SqlParser.column_constraint_not_null_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT328=null;
        Token NULL329=null;
        SqlParser.table_conflict_clause_return table_conflict_clause330 = null;


        Object NOT328_tree=null;
        Object NULL329_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // Sql.g:325:27: ( NOT NULL ( table_conflict_clause )? -> ^( NOT_NULL ( table_conflict_clause )? ) )
            // Sql.g:325:29: NOT NULL ( table_conflict_clause )?
            {
            NOT328=(Token)match(input,NOT,FOLLOW_NOT_in_column_constraint_not_null2889);  
            stream_NOT.add(NOT328);

            NULL329=(Token)match(input,NULL,FOLLOW_NULL_in_column_constraint_not_null2891);  
            stream_NULL.add(NULL329);

            // Sql.g:325:38: ( table_conflict_clause )?
            int alt126=2;
            alt126 = dfa126.predict(input);
            switch (alt126) {
                case 1 :
                    // Sql.g:325:38: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_not_null2893);
                    table_conflict_clause330=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause330.getTree());

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
            // 325:61: -> ^( NOT_NULL ( table_conflict_clause )? )
            {
                // Sql.g:325:64: ^( NOT_NULL ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_NULL, "NOT_NULL"), root_1);

                // Sql.g:325:75: ( table_conflict_clause )?
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
    // Sql.g:327:1: column_constraint_unique : UNIQUE ( table_conflict_clause )? ;
    public final SqlParser.column_constraint_unique_return column_constraint_unique() throws RecognitionException {
        SqlParser.column_constraint_unique_return retval = new SqlParser.column_constraint_unique_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNIQUE331=null;
        SqlParser.table_conflict_clause_return table_conflict_clause332 = null;


        Object UNIQUE331_tree=null;

        try {
            // Sql.g:327:25: ( UNIQUE ( table_conflict_clause )? )
            // Sql.g:327:27: UNIQUE ( table_conflict_clause )?
            {
            root_0 = (Object)adaptor.nil();

            UNIQUE331=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_column_constraint_unique2910); 
            UNIQUE331_tree = (Object)adaptor.create(UNIQUE331);
            root_0 = (Object)adaptor.becomeRoot(UNIQUE331_tree, root_0);

            // Sql.g:327:35: ( table_conflict_clause )?
            int alt127=2;
            alt127 = dfa127.predict(input);
            switch (alt127) {
                case 1 :
                    // Sql.g:327:35: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_unique2913);
                    table_conflict_clause332=table_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, table_conflict_clause332.getTree());

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
    // Sql.g:329:1: column_constraint_check : CHECK LPAREN expr RPAREN ;
    public final SqlParser.column_constraint_check_return column_constraint_check() throws RecognitionException {
        SqlParser.column_constraint_check_return retval = new SqlParser.column_constraint_check_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CHECK333=null;
        Token LPAREN334=null;
        Token RPAREN336=null;
        SqlParser.expr_return expr335 = null;


        Object CHECK333_tree=null;
        Object LPAREN334_tree=null;
        Object RPAREN336_tree=null;

        try {
            // Sql.g:329:24: ( CHECK LPAREN expr RPAREN )
            // Sql.g:329:26: CHECK LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            CHECK333=(Token)match(input,CHECK,FOLLOW_CHECK_in_column_constraint_check2921); 
            CHECK333_tree = (Object)adaptor.create(CHECK333);
            root_0 = (Object)adaptor.becomeRoot(CHECK333_tree, root_0);

            LPAREN334=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_column_constraint_check2924); 
            pushFollow(FOLLOW_expr_in_column_constraint_check2927);
            expr335=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr335.getTree());
            RPAREN336=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_column_constraint_check2929); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:332:1: column_constraint_default : DEFAULT ( ( PLUS | MINUS ) ( INTEGER | FLOAT ) | literal_value | LPAREN expr RPAREN ) ;
    public final SqlParser.column_constraint_default_return column_constraint_default() throws RecognitionException {
        SqlParser.column_constraint_default_return retval = new SqlParser.column_constraint_default_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT337=null;
        Token set338=null;
        Token set339=null;
        Token LPAREN341=null;
        Token RPAREN343=null;
        SqlParser.literal_value_return literal_value340 = null;

        SqlParser.expr_return expr342 = null;


        Object DEFAULT337_tree=null;
        Object set338_tree=null;
        Object set339_tree=null;
        Object LPAREN341_tree=null;
        Object RPAREN343_tree=null;

        try {
            // Sql.g:332:26: ( DEFAULT ( ( PLUS | MINUS ) ( INTEGER | FLOAT ) | literal_value | LPAREN expr RPAREN ) )
            // Sql.g:332:28: DEFAULT ( ( PLUS | MINUS ) ( INTEGER | FLOAT ) | literal_value | LPAREN expr RPAREN )
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT337=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_column_constraint_default2938); 
            DEFAULT337_tree = (Object)adaptor.create(DEFAULT337);
            root_0 = (Object)adaptor.becomeRoot(DEFAULT337_tree, root_0);

            // Sql.g:332:37: ( ( PLUS | MINUS ) ( INTEGER | FLOAT ) | literal_value | LPAREN expr RPAREN )
            int alt128=3;
            alt128 = dfa128.predict(input);
            switch (alt128) {
                case 1 :
                    // Sql.g:332:38: ( PLUS | MINUS ) ( INTEGER | FLOAT )
                    {
                    set338=(Token)input.LT(1);
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set338));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    set339=(Token)input.LT(1);
                    if ( (input.LA(1)>=INTEGER && input.LA(1)<=FLOAT) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set339));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // Sql.g:332:73: literal_value
                    {
                    pushFollow(FOLLOW_literal_value_in_column_constraint_default2960);
                    literal_value340=literal_value();

                    state._fsp--;

                    adaptor.addChild(root_0, literal_value340.getTree());

                    }
                    break;
                case 3 :
                    // Sql.g:332:89: LPAREN expr RPAREN
                    {
                    LPAREN341=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_column_constraint_default2964); 
                    pushFollow(FOLLOW_expr_in_column_constraint_default2967);
                    expr342=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr342.getTree());
                    RPAREN343=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_column_constraint_default2969); 

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
    // Sql.g:334:1: column_constraint_collate : COLLATE collation_name= id ;
    public final SqlParser.column_constraint_collate_return column_constraint_collate() throws RecognitionException {
        SqlParser.column_constraint_collate_return retval = new SqlParser.column_constraint_collate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLLATE344=null;
        SqlParser.id_return collation_name = null;


        Object COLLATE344_tree=null;

        try {
            // Sql.g:334:26: ( COLLATE collation_name= id )
            // Sql.g:334:28: COLLATE collation_name= id
            {
            root_0 = (Object)adaptor.nil();

            COLLATE344=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_column_constraint_collate2978); 
            COLLATE344_tree = (Object)adaptor.create(COLLATE344);
            root_0 = (Object)adaptor.becomeRoot(COLLATE344_tree, root_0);

            pushFollow(FOLLOW_id_in_column_constraint_collate2983);
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
    // Sql.g:336:1: table_constraint : ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk ) -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? ) ;
    public final SqlParser.table_constraint_return table_constraint() throws RecognitionException {
        SqlParser.table_constraint_return retval = new SqlParser.table_constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONSTRAINT345=null;
        SqlParser.id_return name = null;

        SqlParser.table_constraint_pk_return table_constraint_pk346 = null;

        SqlParser.table_constraint_unique_return table_constraint_unique347 = null;

        SqlParser.table_constraint_check_return table_constraint_check348 = null;

        SqlParser.table_constraint_fk_return table_constraint_fk349 = null;


        Object CONSTRAINT345_tree=null;
        RewriteRuleTokenStream stream_CONSTRAINT=new RewriteRuleTokenStream(adaptor,"token CONSTRAINT");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_table_constraint_pk=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_pk");
        RewriteRuleSubtreeStream stream_table_constraint_fk=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_fk");
        RewriteRuleSubtreeStream stream_table_constraint_unique=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_unique");
        RewriteRuleSubtreeStream stream_table_constraint_check=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_check");
        try {
            // Sql.g:336:17: ( ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk ) -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? ) )
            // Sql.g:336:19: ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk )
            {
            // Sql.g:336:19: ( CONSTRAINT name= id )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==CONSTRAINT) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // Sql.g:336:20: CONSTRAINT name= id
                    {
                    CONSTRAINT345=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_table_constraint2992);  
                    stream_CONSTRAINT.add(CONSTRAINT345);

                    pushFollow(FOLLOW_id_in_table_constraint2996);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());

                    }
                    break;

            }

            // Sql.g:337:3: ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk )
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
                    // Sql.g:337:5: table_constraint_pk
                    {
                    pushFollow(FOLLOW_table_constraint_pk_in_table_constraint3004);
                    table_constraint_pk346=table_constraint_pk();

                    state._fsp--;

                    stream_table_constraint_pk.add(table_constraint_pk346.getTree());

                    }
                    break;
                case 2 :
                    // Sql.g:338:5: table_constraint_unique
                    {
                    pushFollow(FOLLOW_table_constraint_unique_in_table_constraint3010);
                    table_constraint_unique347=table_constraint_unique();

                    state._fsp--;

                    stream_table_constraint_unique.add(table_constraint_unique347.getTree());

                    }
                    break;
                case 3 :
                    // Sql.g:339:5: table_constraint_check
                    {
                    pushFollow(FOLLOW_table_constraint_check_in_table_constraint3016);
                    table_constraint_check348=table_constraint_check();

                    state._fsp--;

                    stream_table_constraint_check.add(table_constraint_check348.getTree());

                    }
                    break;
                case 4 :
                    // Sql.g:340:5: table_constraint_fk
                    {
                    pushFollow(FOLLOW_table_constraint_fk_in_table_constraint3022);
                    table_constraint_fk349=table_constraint_fk();

                    state._fsp--;

                    stream_table_constraint_fk.add(table_constraint_fk349.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: table_constraint_fk, table_constraint_unique, table_constraint_check, name, table_constraint_pk
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 341:1: -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? )
            {
                // Sql.g:341:4: ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TABLE_CONSTRAINT, "TABLE_CONSTRAINT"), root_1);

                // Sql.g:342:3: ( table_constraint_pk )?
                if ( stream_table_constraint_pk.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_pk.nextTree());

                }
                stream_table_constraint_pk.reset();
                // Sql.g:343:3: ( table_constraint_unique )?
                if ( stream_table_constraint_unique.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_unique.nextTree());

                }
                stream_table_constraint_unique.reset();
                // Sql.g:344:3: ( table_constraint_check )?
                if ( stream_table_constraint_check.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_check.nextTree());

                }
                stream_table_constraint_check.reset();
                // Sql.g:345:3: ( table_constraint_fk )?
                if ( stream_table_constraint_fk.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_fk.nextTree());

                }
                stream_table_constraint_fk.reset();
                // Sql.g:346:3: ( $name)?
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
    // Sql.g:348:1: table_constraint_pk : PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) ;
    public final SqlParser.table_constraint_pk_return table_constraint_pk() throws RecognitionException {
        SqlParser.table_constraint_pk_return retval = new SqlParser.table_constraint_pk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRIMARY350=null;
        Token KEY351=null;
        Token LPAREN352=null;
        Token COMMA353=null;
        Token RPAREN354=null;
        List list_indexed_columns=null;
        SqlParser.table_conflict_clause_return table_conflict_clause355 = null;

        SqlParser.id_return indexed_columns = null;
         indexed_columns = null;
        Object PRIMARY350_tree=null;
        Object KEY351_tree=null;
        Object LPAREN352_tree=null;
        Object COMMA353_tree=null;
        Object RPAREN354_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_PRIMARY=new RewriteRuleTokenStream(adaptor,"token PRIMARY");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // Sql.g:348:20: ( PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) )
            // Sql.g:348:22: PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )?
            {
            PRIMARY350=(Token)match(input,PRIMARY,FOLLOW_PRIMARY_in_table_constraint_pk3062);  
            stream_PRIMARY.add(PRIMARY350);

            KEY351=(Token)match(input,KEY,FOLLOW_KEY_in_table_constraint_pk3064);  
            stream_KEY.add(KEY351);

            LPAREN352=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_pk3068);  
            stream_LPAREN.add(LPAREN352);

            pushFollow(FOLLOW_id_in_table_constraint_pk3072);
            indexed_columns=id();

            state._fsp--;

            stream_id.add(indexed_columns.getTree());
            if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            list_indexed_columns.add(indexed_columns.getTree());

            // Sql.g:349:30: ( COMMA indexed_columns+= id )*
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( (LA131_0==COMMA) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // Sql.g:349:31: COMMA indexed_columns+= id
            	    {
            	    COMMA353=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_pk3075);  
            	    stream_COMMA.add(COMMA353);

            	    pushFollow(FOLLOW_id_in_table_constraint_pk3079);
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

            RPAREN354=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_pk3083);  
            stream_RPAREN.add(RPAREN354);

            // Sql.g:349:66: ( table_conflict_clause )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==ON) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // Sql.g:349:66: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_table_constraint_pk3085);
                    table_conflict_clause355=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause355.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: indexed_columns, PRIMARY, table_conflict_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: indexed_columns
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_indexed_columns=new RewriteRuleSubtreeStream(adaptor,"token indexed_columns",list_indexed_columns);
            root_0 = (Object)adaptor.nil();
            // 350:1: -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
            {
                // Sql.g:350:4: ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_PRIMARY.nextNode(), root_1);

                // Sql.g:350:14: ^( COLUMNS ( $indexed_columns)+ )
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
                // Sql.g:350:43: ( table_conflict_clause )?
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
    // Sql.g:352:1: table_constraint_unique : UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) ;
    public final SqlParser.table_constraint_unique_return table_constraint_unique() throws RecognitionException {
        SqlParser.table_constraint_unique_return retval = new SqlParser.table_constraint_unique_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNIQUE356=null;
        Token LPAREN357=null;
        Token COMMA358=null;
        Token RPAREN359=null;
        List list_indexed_columns=null;
        SqlParser.table_conflict_clause_return table_conflict_clause360 = null;

        SqlParser.id_return indexed_columns = null;
         indexed_columns = null;
        Object UNIQUE356_tree=null;
        Object LPAREN357_tree=null;
        Object COMMA358_tree=null;
        Object RPAREN359_tree=null;
        RewriteRuleTokenStream stream_UNIQUE=new RewriteRuleTokenStream(adaptor,"token UNIQUE");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // Sql.g:352:24: ( UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) )
            // Sql.g:352:26: UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )?
            {
            UNIQUE356=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_table_constraint_unique3110);  
            stream_UNIQUE.add(UNIQUE356);

            LPAREN357=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_unique3114);  
            stream_LPAREN.add(LPAREN357);

            pushFollow(FOLLOW_id_in_table_constraint_unique3118);
            indexed_columns=id();

            state._fsp--;

            stream_id.add(indexed_columns.getTree());
            if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            list_indexed_columns.add(indexed_columns.getTree());

            // Sql.g:353:30: ( COMMA indexed_columns+= id )*
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==COMMA) ) {
                    alt133=1;
                }


                switch (alt133) {
            	case 1 :
            	    // Sql.g:353:31: COMMA indexed_columns+= id
            	    {
            	    COMMA358=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_unique3121);  
            	    stream_COMMA.add(COMMA358);

            	    pushFollow(FOLLOW_id_in_table_constraint_unique3125);
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

            RPAREN359=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_unique3129);  
            stream_RPAREN.add(RPAREN359);

            // Sql.g:353:66: ( table_conflict_clause )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==ON) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // Sql.g:353:66: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_table_constraint_unique3131);
                    table_conflict_clause360=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause360.getTree());

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
            // 354:1: -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
            {
                // Sql.g:354:4: ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_UNIQUE.nextNode(), root_1);

                // Sql.g:354:13: ^( COLUMNS ( $indexed_columns)+ )
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
                // Sql.g:354:42: ( table_conflict_clause )?
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
    // Sql.g:356:1: table_constraint_check : CHECK LPAREN expr RPAREN ;
    public final SqlParser.table_constraint_check_return table_constraint_check() throws RecognitionException {
        SqlParser.table_constraint_check_return retval = new SqlParser.table_constraint_check_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CHECK361=null;
        Token LPAREN362=null;
        Token RPAREN364=null;
        SqlParser.expr_return expr363 = null;


        Object CHECK361_tree=null;
        Object LPAREN362_tree=null;
        Object RPAREN364_tree=null;

        try {
            // Sql.g:356:23: ( CHECK LPAREN expr RPAREN )
            // Sql.g:356:25: CHECK LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            CHECK361=(Token)match(input,CHECK,FOLLOW_CHECK_in_table_constraint_check3156); 
            CHECK361_tree = (Object)adaptor.create(CHECK361);
            root_0 = (Object)adaptor.becomeRoot(CHECK361_tree, root_0);

            LPAREN362=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_check3159); 
            pushFollow(FOLLOW_expr_in_table_constraint_check3162);
            expr363=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr363.getTree());
            RPAREN364=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_check3164); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:358:1: table_constraint_fk : FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause ) ;
    public final SqlParser.table_constraint_fk_return table_constraint_fk() throws RecognitionException {
        SqlParser.table_constraint_fk_return retval = new SqlParser.table_constraint_fk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOREIGN365=null;
        Token KEY366=null;
        Token LPAREN367=null;
        Token COMMA368=null;
        Token RPAREN369=null;
        List list_column_names=null;
        SqlParser.fk_clause_return fk_clause370 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object FOREIGN365_tree=null;
        Object KEY366_tree=null;
        Object LPAREN367_tree=null;
        Object COMMA368_tree=null;
        Object RPAREN369_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_FOREIGN=new RewriteRuleTokenStream(adaptor,"token FOREIGN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_fk_clause=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause");
        try {
            // Sql.g:358:20: ( FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause ) )
            // Sql.g:358:22: FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause
            {
            FOREIGN365=(Token)match(input,FOREIGN,FOLLOW_FOREIGN_in_table_constraint_fk3172);  
            stream_FOREIGN.add(FOREIGN365);

            KEY366=(Token)match(input,KEY,FOLLOW_KEY_in_table_constraint_fk3174);  
            stream_KEY.add(KEY366);

            LPAREN367=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_fk3176);  
            stream_LPAREN.add(LPAREN367);

            pushFollow(FOLLOW_id_in_table_constraint_fk3180);
            column_names=id();

            state._fsp--;

            stream_id.add(column_names.getTree());
            if (list_column_names==null) list_column_names=new ArrayList();
            list_column_names.add(column_names.getTree());

            // Sql.g:358:58: ( COMMA column_names+= id )*
            loop135:
            do {
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( (LA135_0==COMMA) ) {
                    alt135=1;
                }


                switch (alt135) {
            	case 1 :
            	    // Sql.g:358:59: COMMA column_names+= id
            	    {
            	    COMMA368=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_fk3183);  
            	    stream_COMMA.add(COMMA368);

            	    pushFollow(FOLLOW_id_in_table_constraint_fk3187);
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

            RPAREN369=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_fk3191);  
            stream_RPAREN.add(RPAREN369);

            pushFollow(FOLLOW_fk_clause_in_table_constraint_fk3193);
            fk_clause370=fk_clause();

            state._fsp--;

            stream_fk_clause.add(fk_clause370.getTree());


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
            // 359:1: -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause )
            {
                // Sql.g:359:4: ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FOREIGN.nextNode(), root_1);

                // Sql.g:359:14: ^( COLUMNS ( $column_names)+ )
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
    // Sql.g:361:1: fk_clause : REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )? -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )+ ( fk_clause_deferrable )? ) ;
    public final SqlParser.fk_clause_return fk_clause() throws RecognitionException {
        SqlParser.fk_clause_return retval = new SqlParser.fk_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REFERENCES371=null;
        Token LPAREN372=null;
        Token COMMA373=null;
        Token RPAREN374=null;
        List list_column_names=null;
        SqlParser.id_return foreign_table = null;

        SqlParser.fk_clause_action_return fk_clause_action375 = null;

        SqlParser.fk_clause_deferrable_return fk_clause_deferrable376 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object REFERENCES371_tree=null;
        Object LPAREN372_tree=null;
        Object COMMA373_tree=null;
        Object RPAREN374_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_REFERENCES=new RewriteRuleTokenStream(adaptor,"token REFERENCES");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_fk_clause_action=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause_action");
        RewriteRuleSubtreeStream stream_fk_clause_deferrable=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause_deferrable");
        try {
            // Sql.g:361:10: ( REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )? -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )+ ( fk_clause_deferrable )? ) )
            // Sql.g:361:12: REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )?
            {
            REFERENCES371=(Token)match(input,REFERENCES,FOLLOW_REFERENCES_in_fk_clause3216);  
            stream_REFERENCES.add(REFERENCES371);

            pushFollow(FOLLOW_id_in_fk_clause3220);
            foreign_table=id();

            state._fsp--;

            stream_id.add(foreign_table.getTree());
            // Sql.g:361:40: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==LPAREN) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // Sql.g:361:41: LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                    {
                    LPAREN372=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_fk_clause3223);  
                    stream_LPAREN.add(LPAREN372);

                    pushFollow(FOLLOW_id_in_fk_clause3227);
                    column_names=id();

                    state._fsp--;

                    stream_id.add(column_names.getTree());
                    if (list_column_names==null) list_column_names=new ArrayList();
                    list_column_names.add(column_names.getTree());

                    // Sql.g:361:65: ( COMMA column_names+= id )*
                    loop136:
                    do {
                        int alt136=2;
                        int LA136_0 = input.LA(1);

                        if ( (LA136_0==COMMA) ) {
                            alt136=1;
                        }


                        switch (alt136) {
                    	case 1 :
                    	    // Sql.g:361:66: COMMA column_names+= id
                    	    {
                    	    COMMA373=(Token)match(input,COMMA,FOLLOW_COMMA_in_fk_clause3230);  
                    	    stream_COMMA.add(COMMA373);

                    	    pushFollow(FOLLOW_id_in_fk_clause3234);
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

                    RPAREN374=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_fk_clause3238);  
                    stream_RPAREN.add(RPAREN374);


                    }
                    break;

            }

            // Sql.g:362:3: ( fk_clause_action )+
            int cnt138=0;
            loop138:
            do {
                int alt138=2;
                alt138 = dfa138.predict(input);
                switch (alt138) {
            	case 1 :
            	    // Sql.g:362:3: fk_clause_action
            	    {
            	    pushFollow(FOLLOW_fk_clause_action_in_fk_clause3244);
            	    fk_clause_action375=fk_clause_action();

            	    state._fsp--;

            	    stream_fk_clause_action.add(fk_clause_action375.getTree());

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

            // Sql.g:362:21: ( fk_clause_deferrable )?
            int alt139=2;
            alt139 = dfa139.predict(input);
            switch (alt139) {
                case 1 :
                    // Sql.g:362:21: fk_clause_deferrable
                    {
                    pushFollow(FOLLOW_fk_clause_deferrable_in_fk_clause3247);
                    fk_clause_deferrable376=fk_clause_deferrable();

                    state._fsp--;

                    stream_fk_clause_deferrable.add(fk_clause_deferrable376.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: fk_clause_deferrable, REFERENCES, fk_clause_action, column_names, foreign_table
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
            // 363:1: -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )+ ( fk_clause_deferrable )? )
            {
                // Sql.g:363:4: ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )+ ( fk_clause_deferrable )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_REFERENCES.nextNode(), root_1);

                adaptor.addChild(root_1, stream_foreign_table.nextTree());
                // Sql.g:363:32: ^( COLUMNS ( $column_names)+ )
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
                // Sql.g:363:76: ( fk_clause_deferrable )?
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
    // Sql.g:365:1: fk_clause_action : ( ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT ) | MATCH id );
    public final SqlParser.fk_clause_action_return fk_clause_action() throws RecognitionException {
        SqlParser.fk_clause_action_return retval = new SqlParser.fk_clause_action_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ON377=null;
        Token set378=null;
        Token SET379=null;
        Token NULL380=null;
        Token SET381=null;
        Token DEFAULT382=null;
        Token CASCADE383=null;
        Token RESTRICT384=null;
        Token MATCH385=null;
        SqlParser.id_return id386 = null;


        Object ON377_tree=null;
        Object set378_tree=null;
        Object SET379_tree=null;
        Object NULL380_tree=null;
        Object SET381_tree=null;
        Object DEFAULT382_tree=null;
        Object CASCADE383_tree=null;
        Object RESTRICT384_tree=null;
        Object MATCH385_tree=null;

        try {
            // Sql.g:366:3: ( ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT ) | MATCH id )
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
                    // Sql.g:366:5: ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT )
                    {
                    root_0 = (Object)adaptor.nil();

                    ON377=(Token)match(input,ON,FOLLOW_ON_in_fk_clause_action3281); 
                    ON377_tree = (Object)adaptor.create(ON377);
                    root_0 = (Object)adaptor.becomeRoot(ON377_tree, root_0);

                    set378=(Token)input.LT(1);
                    if ( input.LA(1)==INSERT||input.LA(1)==UPDATE||input.LA(1)==DELETE ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set378));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // Sql.g:366:36: ( SET NULL | SET DEFAULT | CASCADE | RESTRICT )
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
                            // Sql.g:366:37: SET NULL
                            {
                            SET379=(Token)match(input,SET,FOLLOW_SET_in_fk_clause_action3297); 
                            NULL380=(Token)match(input,NULL,FOLLOW_NULL_in_fk_clause_action3300); 
                            NULL380_tree = (Object)adaptor.create(NULL380);
                            adaptor.addChild(root_0, NULL380_tree);


                            }
                            break;
                        case 2 :
                            // Sql.g:366:49: SET DEFAULT
                            {
                            SET381=(Token)match(input,SET,FOLLOW_SET_in_fk_clause_action3304); 
                            DEFAULT382=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_fk_clause_action3307); 
                            DEFAULT382_tree = (Object)adaptor.create(DEFAULT382);
                            adaptor.addChild(root_0, DEFAULT382_tree);


                            }
                            break;
                        case 3 :
                            // Sql.g:366:64: CASCADE
                            {
                            CASCADE383=(Token)match(input,CASCADE,FOLLOW_CASCADE_in_fk_clause_action3311); 
                            CASCADE383_tree = (Object)adaptor.create(CASCADE383);
                            adaptor.addChild(root_0, CASCADE383_tree);


                            }
                            break;
                        case 4 :
                            // Sql.g:366:74: RESTRICT
                            {
                            RESTRICT384=(Token)match(input,RESTRICT,FOLLOW_RESTRICT_in_fk_clause_action3315); 
                            RESTRICT384_tree = (Object)adaptor.create(RESTRICT384);
                            adaptor.addChild(root_0, RESTRICT384_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Sql.g:367:5: MATCH id
                    {
                    root_0 = (Object)adaptor.nil();

                    MATCH385=(Token)match(input,MATCH,FOLLOW_MATCH_in_fk_clause_action3322); 
                    MATCH385_tree = (Object)adaptor.create(MATCH385);
                    root_0 = (Object)adaptor.becomeRoot(MATCH385_tree, root_0);

                    pushFollow(FOLLOW_id_in_fk_clause_action3325);
                    id386=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id386.getTree());

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
    // Sql.g:369:1: fk_clause_deferrable : ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )? ;
    public final SqlParser.fk_clause_deferrable_return fk_clause_deferrable() throws RecognitionException {
        SqlParser.fk_clause_deferrable_return retval = new SqlParser.fk_clause_deferrable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT387=null;
        Token DEFERRABLE388=null;
        Token INITIALLY389=null;
        Token DEFERRED390=null;
        Token INITIALLY391=null;
        Token IMMEDIATE392=null;

        Object NOT387_tree=null;
        Object DEFERRABLE388_tree=null;
        Object INITIALLY389_tree=null;
        Object DEFERRED390_tree=null;
        Object INITIALLY391_tree=null;
        Object IMMEDIATE392_tree=null;

        try {
            // Sql.g:369:21: ( ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )? )
            // Sql.g:369:23: ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?
            {
            root_0 = (Object)adaptor.nil();

            // Sql.g:369:23: ( NOT )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==NOT) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // Sql.g:369:24: NOT
                    {
                    NOT387=(Token)match(input,NOT,FOLLOW_NOT_in_fk_clause_deferrable3333); 
                    NOT387_tree = (Object)adaptor.create(NOT387);
                    adaptor.addChild(root_0, NOT387_tree);


                    }
                    break;

            }

            DEFERRABLE388=(Token)match(input,DEFERRABLE,FOLLOW_DEFERRABLE_in_fk_clause_deferrable3337); 
            DEFERRABLE388_tree = (Object)adaptor.create(DEFERRABLE388);
            root_0 = (Object)adaptor.becomeRoot(DEFERRABLE388_tree, root_0);

            // Sql.g:369:42: ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?
            int alt143=3;
            alt143 = dfa143.predict(input);
            switch (alt143) {
                case 1 :
                    // Sql.g:369:43: INITIALLY DEFERRED
                    {
                    INITIALLY389=(Token)match(input,INITIALLY,FOLLOW_INITIALLY_in_fk_clause_deferrable3341); 
                    DEFERRED390=(Token)match(input,DEFERRED,FOLLOW_DEFERRED_in_fk_clause_deferrable3344); 
                    DEFERRED390_tree = (Object)adaptor.create(DEFERRED390);
                    adaptor.addChild(root_0, DEFERRED390_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:369:65: INITIALLY IMMEDIATE
                    {
                    INITIALLY391=(Token)match(input,INITIALLY,FOLLOW_INITIALLY_in_fk_clause_deferrable3348); 
                    IMMEDIATE392=(Token)match(input,IMMEDIATE,FOLLOW_IMMEDIATE_in_fk_clause_deferrable3351); 
                    IMMEDIATE392_tree = (Object)adaptor.create(IMMEDIATE392);
                    adaptor.addChild(root_0, IMMEDIATE392_tree);


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
    // Sql.g:372:1: drop_table_stmt : DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) ) ;
    public final SqlParser.drop_table_stmt_return drop_table_stmt() throws RecognitionException {
        SqlParser.drop_table_stmt_return retval = new SqlParser.drop_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP393=null;
        Token TABLE394=null;
        Token IF395=null;
        Token EXISTS396=null;
        Token DOT397=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;


        Object DROP393_tree=null;
        Object TABLE394_tree=null;
        Object IF395_tree=null;
        Object EXISTS396_tree=null;
        Object DOT397_tree=null;
        RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // Sql.g:372:16: ( DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) ) )
            // Sql.g:372:18: DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id
            {
            DROP393=(Token)match(input,DROP,FOLLOW_DROP_in_drop_table_stmt3361);  
            stream_DROP.add(DROP393);

            TABLE394=(Token)match(input,TABLE,FOLLOW_TABLE_in_drop_table_stmt3363);  
            stream_TABLE.add(TABLE394);

            // Sql.g:372:29: ( IF EXISTS )?
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
                    // Sql.g:372:30: IF EXISTS
                    {
                    IF395=(Token)match(input,IF,FOLLOW_IF_in_drop_table_stmt3366);  
                    stream_IF.add(IF395);

                    EXISTS396=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_table_stmt3368);  
                    stream_EXISTS.add(EXISTS396);


                    }
                    break;

            }

            // Sql.g:372:42: (database_name= id DOT )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==ID) ) {
                int LA145_1 = input.LA(2);

                if ( (LA145_1==DOT) ) {
                    alt145=1;
                }
            }
            else if ( ((LA145_0>=EXPLAIN && LA145_0<=PLAN)||(LA145_0>=INDEXED && LA145_0<=BY)||(LA145_0>=OR && LA145_0<=ESCAPE)||(LA145_0>=IS && LA145_0<=BETWEEN)||LA145_0==COLLATE||(LA145_0>=DISTINCT && LA145_0<=THEN)||(LA145_0>=CURRENT_TIME && LA145_0<=CURRENT_TIMESTAMP)||(LA145_0>=RAISE && LA145_0<=ROW)) ) {
                int LA145_2 = input.LA(2);

                if ( (LA145_2==DOT) ) {
                    alt145=1;
                }
            }
            switch (alt145) {
                case 1 :
                    // Sql.g:372:43: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_table_stmt3375);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT397=(Token)match(input,DOT,FOLLOW_DOT_in_drop_table_stmt3377);  
                    stream_DOT.add(DOT397);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_table_stmt3383);
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
            // 373:1: -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) )
            {
                // Sql.g:373:4: ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DROP_TABLE, "DROP_TABLE"), root_1);

                // Sql.g:373:17: ^( OPTIONS ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // Sql.g:373:27: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // Sql.g:373:36: ^( $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                // Sql.g:373:50: ( $database_name)?
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
    // Sql.g:376:1: alter_table_stmt : ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def ) ;
    public final SqlParser.alter_table_stmt_return alter_table_stmt() throws RecognitionException {
        SqlParser.alter_table_stmt_return retval = new SqlParser.alter_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ALTER398=null;
        Token TABLE399=null;
        Token DOT400=null;
        Token RENAME401=null;
        Token TO402=null;
        Token ADD403=null;
        Token COLUMN404=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.id_return new_table_name = null;

        SqlParser.column_def_return column_def405 = null;


        Object ALTER398_tree=null;
        Object TABLE399_tree=null;
        Object DOT400_tree=null;
        Object RENAME401_tree=null;
        Object TO402_tree=null;
        Object ADD403_tree=null;
        Object COLUMN404_tree=null;

        try {
            // Sql.g:376:17: ( ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def ) )
            // Sql.g:376:19: ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def )
            {
            root_0 = (Object)adaptor.nil();

            ALTER398=(Token)match(input,ALTER,FOLLOW_ALTER_in_alter_table_stmt3413); 
            ALTER398_tree = (Object)adaptor.create(ALTER398);
            adaptor.addChild(root_0, ALTER398_tree);

            TABLE399=(Token)match(input,TABLE,FOLLOW_TABLE_in_alter_table_stmt3415); 
            TABLE399_tree = (Object)adaptor.create(TABLE399);
            adaptor.addChild(root_0, TABLE399_tree);

            // Sql.g:376:31: (database_name= id DOT )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==ID) ) {
                int LA146_1 = input.LA(2);

                if ( (LA146_1==DOT) ) {
                    alt146=1;
                }
            }
            else if ( ((LA146_0>=EXPLAIN && LA146_0<=PLAN)||(LA146_0>=INDEXED && LA146_0<=BY)||(LA146_0>=OR && LA146_0<=ESCAPE)||(LA146_0>=IS && LA146_0<=BETWEEN)||LA146_0==COLLATE||(LA146_0>=DISTINCT && LA146_0<=THEN)||(LA146_0>=CURRENT_TIME && LA146_0<=CURRENT_TIMESTAMP)||(LA146_0>=RAISE && LA146_0<=ROW)) ) {
                int LA146_2 = input.LA(2);

                if ( (LA146_2==DOT) ) {
                    alt146=1;
                }
            }
            switch (alt146) {
                case 1 :
                    // Sql.g:376:32: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_alter_table_stmt3420);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT400=(Token)match(input,DOT,FOLLOW_DOT_in_alter_table_stmt3422); 
                    DOT400_tree = (Object)adaptor.create(DOT400);
                    adaptor.addChild(root_0, DOT400_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_alter_table_stmt3428);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // Sql.g:376:69: ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def )
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
                    // Sql.g:376:70: RENAME TO new_table_name= id
                    {
                    RENAME401=(Token)match(input,RENAME,FOLLOW_RENAME_in_alter_table_stmt3431); 
                    RENAME401_tree = (Object)adaptor.create(RENAME401);
                    adaptor.addChild(root_0, RENAME401_tree);

                    TO402=(Token)match(input,TO,FOLLOW_TO_in_alter_table_stmt3433); 
                    TO402_tree = (Object)adaptor.create(TO402);
                    adaptor.addChild(root_0, TO402_tree);

                    pushFollow(FOLLOW_id_in_alter_table_stmt3437);
                    new_table_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, new_table_name.getTree());

                    }
                    break;
                case 2 :
                    // Sql.g:376:100: ADD ( COLUMN )? column_def
                    {
                    ADD403=(Token)match(input,ADD,FOLLOW_ADD_in_alter_table_stmt3441); 
                    ADD403_tree = (Object)adaptor.create(ADD403);
                    adaptor.addChild(root_0, ADD403_tree);

                    // Sql.g:376:104: ( COLUMN )?
                    int alt147=2;
                    int LA147_0 = input.LA(1);

                    if ( (LA147_0==COLUMN) ) {
                        alt147=1;
                    }
                    switch (alt147) {
                        case 1 :
                            // Sql.g:376:105: COLUMN
                            {
                            COLUMN404=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_alter_table_stmt3444); 
                            COLUMN404_tree = (Object)adaptor.create(COLUMN404);
                            adaptor.addChild(root_0, COLUMN404_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_column_def_in_alter_table_stmt3448);
                    column_def405=column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, column_def405.getTree());

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
    // Sql.g:379:1: create_view_stmt : CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS select_stmt ;
    public final SqlParser.create_view_stmt_return create_view_stmt() throws RecognitionException {
        SqlParser.create_view_stmt_return retval = new SqlParser.create_view_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE406=null;
        Token TEMPORARY407=null;
        Token VIEW408=null;
        Token IF409=null;
        Token NOT410=null;
        Token EXISTS411=null;
        Token DOT412=null;
        Token AS413=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return view_name = null;

        SqlParser.select_stmt_return select_stmt414 = null;


        Object CREATE406_tree=null;
        Object TEMPORARY407_tree=null;
        Object VIEW408_tree=null;
        Object IF409_tree=null;
        Object NOT410_tree=null;
        Object EXISTS411_tree=null;
        Object DOT412_tree=null;
        Object AS413_tree=null;

        try {
            // Sql.g:379:17: ( CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS select_stmt )
            // Sql.g:379:19: CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS select_stmt
            {
            root_0 = (Object)adaptor.nil();

            CREATE406=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_view_stmt3457); 
            CREATE406_tree = (Object)adaptor.create(CREATE406);
            adaptor.addChild(root_0, CREATE406_tree);

            // Sql.g:379:26: ( TEMPORARY )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==TEMPORARY) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // Sql.g:379:26: TEMPORARY
                    {
                    TEMPORARY407=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_view_stmt3459); 
                    TEMPORARY407_tree = (Object)adaptor.create(TEMPORARY407);
                    adaptor.addChild(root_0, TEMPORARY407_tree);


                    }
                    break;

            }

            VIEW408=(Token)match(input,VIEW,FOLLOW_VIEW_in_create_view_stmt3462); 
            VIEW408_tree = (Object)adaptor.create(VIEW408);
            adaptor.addChild(root_0, VIEW408_tree);

            // Sql.g:379:42: ( IF NOT EXISTS )?
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
                    // Sql.g:379:43: IF NOT EXISTS
                    {
                    IF409=(Token)match(input,IF,FOLLOW_IF_in_create_view_stmt3465); 
                    IF409_tree = (Object)adaptor.create(IF409);
                    adaptor.addChild(root_0, IF409_tree);

                    NOT410=(Token)match(input,NOT,FOLLOW_NOT_in_create_view_stmt3467); 
                    NOT410_tree = (Object)adaptor.create(NOT410);
                    adaptor.addChild(root_0, NOT410_tree);

                    EXISTS411=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_view_stmt3469); 
                    EXISTS411_tree = (Object)adaptor.create(EXISTS411);
                    adaptor.addChild(root_0, EXISTS411_tree);


                    }
                    break;

            }

            // Sql.g:379:59: (database_name= id DOT )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==ID) ) {
                int LA151_1 = input.LA(2);

                if ( (LA151_1==DOT) ) {
                    alt151=1;
                }
            }
            else if ( ((LA151_0>=EXPLAIN && LA151_0<=PLAN)||(LA151_0>=INDEXED && LA151_0<=BY)||(LA151_0>=OR && LA151_0<=ESCAPE)||(LA151_0>=IS && LA151_0<=BETWEEN)||LA151_0==COLLATE||(LA151_0>=DISTINCT && LA151_0<=THEN)||(LA151_0>=CURRENT_TIME && LA151_0<=CURRENT_TIMESTAMP)||(LA151_0>=RAISE && LA151_0<=ROW)) ) {
                int LA151_2 = input.LA(2);

                if ( (LA151_2==DOT) ) {
                    alt151=1;
                }
            }
            switch (alt151) {
                case 1 :
                    // Sql.g:379:60: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_view_stmt3476);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT412=(Token)match(input,DOT,FOLLOW_DOT_in_create_view_stmt3478); 
                    DOT412_tree = (Object)adaptor.create(DOT412);
                    adaptor.addChild(root_0, DOT412_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_view_stmt3484);
            view_name=id();

            state._fsp--;

            adaptor.addChild(root_0, view_name.getTree());
            AS413=(Token)match(input,AS,FOLLOW_AS_in_create_view_stmt3486); 
            AS413_tree = (Object)adaptor.create(AS413);
            adaptor.addChild(root_0, AS413_tree);

            pushFollow(FOLLOW_select_stmt_in_create_view_stmt3488);
            select_stmt414=select_stmt();

            state._fsp--;

            adaptor.addChild(root_0, select_stmt414.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:382:1: drop_view_stmt : DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id ;
    public final SqlParser.drop_view_stmt_return drop_view_stmt() throws RecognitionException {
        SqlParser.drop_view_stmt_return retval = new SqlParser.drop_view_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP415=null;
        Token VIEW416=null;
        Token IF417=null;
        Token EXISTS418=null;
        Token DOT419=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return view_name = null;


        Object DROP415_tree=null;
        Object VIEW416_tree=null;
        Object IF417_tree=null;
        Object EXISTS418_tree=null;
        Object DOT419_tree=null;

        try {
            // Sql.g:382:15: ( DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id )
            // Sql.g:382:17: DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id
            {
            root_0 = (Object)adaptor.nil();

            DROP415=(Token)match(input,DROP,FOLLOW_DROP_in_drop_view_stmt3496); 
            DROP415_tree = (Object)adaptor.create(DROP415);
            adaptor.addChild(root_0, DROP415_tree);

            VIEW416=(Token)match(input,VIEW,FOLLOW_VIEW_in_drop_view_stmt3498); 
            VIEW416_tree = (Object)adaptor.create(VIEW416);
            adaptor.addChild(root_0, VIEW416_tree);

            // Sql.g:382:27: ( IF EXISTS )?
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
                    // Sql.g:382:28: IF EXISTS
                    {
                    IF417=(Token)match(input,IF,FOLLOW_IF_in_drop_view_stmt3501); 
                    IF417_tree = (Object)adaptor.create(IF417);
                    adaptor.addChild(root_0, IF417_tree);

                    EXISTS418=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_view_stmt3503); 
                    EXISTS418_tree = (Object)adaptor.create(EXISTS418);
                    adaptor.addChild(root_0, EXISTS418_tree);


                    }
                    break;

            }

            // Sql.g:382:40: (database_name= id DOT )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==ID) ) {
                int LA153_1 = input.LA(2);

                if ( (LA153_1==DOT) ) {
                    alt153=1;
                }
            }
            else if ( ((LA153_0>=EXPLAIN && LA153_0<=PLAN)||(LA153_0>=INDEXED && LA153_0<=BY)||(LA153_0>=OR && LA153_0<=ESCAPE)||(LA153_0>=IS && LA153_0<=BETWEEN)||LA153_0==COLLATE||(LA153_0>=DISTINCT && LA153_0<=THEN)||(LA153_0>=CURRENT_TIME && LA153_0<=CURRENT_TIMESTAMP)||(LA153_0>=RAISE && LA153_0<=ROW)) ) {
                int LA153_2 = input.LA(2);

                if ( (LA153_2==DOT) ) {
                    alt153=1;
                }
            }
            switch (alt153) {
                case 1 :
                    // Sql.g:382:41: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_view_stmt3510);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT419=(Token)match(input,DOT,FOLLOW_DOT_in_drop_view_stmt3512); 
                    DOT419_tree = (Object)adaptor.create(DOT419);
                    adaptor.addChild(root_0, DOT419_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_view_stmt3518);
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
    // Sql.g:385:1: create_index_stmt : CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? ) ;
    public final SqlParser.create_index_stmt_return create_index_stmt() throws RecognitionException {
        SqlParser.create_index_stmt_return retval = new SqlParser.create_index_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE420=null;
        Token UNIQUE421=null;
        Token INDEX422=null;
        Token IF423=null;
        Token NOT424=null;
        Token EXISTS425=null;
        Token DOT426=null;
        Token ON427=null;
        Token LPAREN428=null;
        Token COMMA429=null;
        Token RPAREN430=null;
        List list_columns=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return index_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.indexed_column_return columns = null;
         columns = null;
        Object CREATE420_tree=null;
        Object UNIQUE421_tree=null;
        Object INDEX422_tree=null;
        Object IF423_tree=null;
        Object NOT424_tree=null;
        Object EXISTS425_tree=null;
        Object DOT426_tree=null;
        Object ON427_tree=null;
        Object LPAREN428_tree=null;
        Object COMMA429_tree=null;
        Object RPAREN430_tree=null;
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
            // Sql.g:385:18: ( CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? ) )
            // Sql.g:385:20: CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN
            {
            CREATE420=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_index_stmt3526);  
            stream_CREATE.add(CREATE420);

            // Sql.g:385:27: ( UNIQUE )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==UNIQUE) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // Sql.g:385:28: UNIQUE
                    {
                    UNIQUE421=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_create_index_stmt3529);  
                    stream_UNIQUE.add(UNIQUE421);


                    }
                    break;

            }

            INDEX422=(Token)match(input,INDEX,FOLLOW_INDEX_in_create_index_stmt3533);  
            stream_INDEX.add(INDEX422);

            // Sql.g:385:43: ( IF NOT EXISTS )?
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
                    // Sql.g:385:44: IF NOT EXISTS
                    {
                    IF423=(Token)match(input,IF,FOLLOW_IF_in_create_index_stmt3536);  
                    stream_IF.add(IF423);

                    NOT424=(Token)match(input,NOT,FOLLOW_NOT_in_create_index_stmt3538);  
                    stream_NOT.add(NOT424);

                    EXISTS425=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_index_stmt3540);  
                    stream_EXISTS.add(EXISTS425);


                    }
                    break;

            }

            // Sql.g:385:60: (database_name= id DOT )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==ID) ) {
                int LA156_1 = input.LA(2);

                if ( (LA156_1==DOT) ) {
                    alt156=1;
                }
            }
            else if ( ((LA156_0>=EXPLAIN && LA156_0<=PLAN)||(LA156_0>=INDEXED && LA156_0<=BY)||(LA156_0>=OR && LA156_0<=ESCAPE)||(LA156_0>=IS && LA156_0<=BETWEEN)||LA156_0==COLLATE||(LA156_0>=DISTINCT && LA156_0<=THEN)||(LA156_0>=CURRENT_TIME && LA156_0<=CURRENT_TIMESTAMP)||(LA156_0>=RAISE && LA156_0<=ROW)) ) {
                int LA156_2 = input.LA(2);

                if ( (LA156_2==DOT) ) {
                    alt156=1;
                }
            }
            switch (alt156) {
                case 1 :
                    // Sql.g:385:61: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_index_stmt3547);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT426=(Token)match(input,DOT,FOLLOW_DOT_in_create_index_stmt3549);  
                    stream_DOT.add(DOT426);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_index_stmt3555);
            index_name=id();

            state._fsp--;

            stream_id.add(index_name.getTree());
            ON427=(Token)match(input,ON,FOLLOW_ON_in_create_index_stmt3559);  
            stream_ON.add(ON427);

            pushFollow(FOLLOW_id_in_create_index_stmt3563);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());
            LPAREN428=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_index_stmt3565);  
            stream_LPAREN.add(LPAREN428);

            pushFollow(FOLLOW_indexed_column_in_create_index_stmt3569);
            columns=indexed_column();

            state._fsp--;

            stream_indexed_column.add(columns.getTree());
            if (list_columns==null) list_columns=new ArrayList();
            list_columns.add(columns.getTree());

            // Sql.g:386:51: ( COMMA columns+= indexed_column )*
            loop157:
            do {
                int alt157=2;
                int LA157_0 = input.LA(1);

                if ( (LA157_0==COMMA) ) {
                    alt157=1;
                }


                switch (alt157) {
            	case 1 :
            	    // Sql.g:386:52: COMMA columns+= indexed_column
            	    {
            	    COMMA429=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_index_stmt3572);  
            	    stream_COMMA.add(COMMA429);

            	    pushFollow(FOLLOW_indexed_column_in_create_index_stmt3576);
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

            RPAREN430=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_index_stmt3580);  
            stream_RPAREN.add(RPAREN430);



            // AST REWRITE
            // elements: table_name, index_name, UNIQUE, EXISTS, database_name, columns
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
            // 387:1: -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? )
            {
                // Sql.g:387:4: ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CREATE_INDEX, "CREATE_INDEX"), root_1);

                // Sql.g:387:19: ^( OPTIONS ( UNIQUE )? ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // Sql.g:387:29: ( UNIQUE )?
                if ( stream_UNIQUE.hasNext() ) {
                    adaptor.addChild(root_2, stream_UNIQUE.nextNode());

                }
                stream_UNIQUE.reset();
                // Sql.g:387:37: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // Sql.g:387:46: ^( $index_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_index_name.nextNode(), root_2);

                // Sql.g:387:60: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_table_name.nextTree());
                // Sql.g:387:89: ( ^( COLUMNS ( $columns)+ ) )?
                if ( stream_columns.hasNext() ) {
                    // Sql.g:387:89: ^( COLUMNS ( $columns)+ )
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
    // Sql.g:389:1: indexed_column : column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )? -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? ) ;
    public final SqlParser.indexed_column_return indexed_column() throws RecognitionException {
        SqlParser.indexed_column_return retval = new SqlParser.indexed_column_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLLATE431=null;
        Token ASC432=null;
        Token DESC433=null;
        SqlParser.id_return column_name = null;

        SqlParser.id_return collation_name = null;


        Object COLLATE431_tree=null;
        Object ASC432_tree=null;
        Object DESC433_tree=null;
        RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");
        RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
        RewriteRuleTokenStream stream_COLLATE=new RewriteRuleTokenStream(adaptor,"token COLLATE");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // Sql.g:389:15: (column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )? -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? ) )
            // Sql.g:389:17: column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )?
            {
            pushFollow(FOLLOW_id_in_indexed_column3626);
            column_name=id();

            state._fsp--;

            stream_id.add(column_name.getTree());
            // Sql.g:389:32: ( COLLATE collation_name= id )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==COLLATE) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // Sql.g:389:33: COLLATE collation_name= id
                    {
                    COLLATE431=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_indexed_column3629);  
                    stream_COLLATE.add(COLLATE431);

                    pushFollow(FOLLOW_id_in_indexed_column3633);
                    collation_name=id();

                    state._fsp--;

                    stream_id.add(collation_name.getTree());

                    }
                    break;

            }

            // Sql.g:389:61: ( ASC | DESC )?
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
                    // Sql.g:389:62: ASC
                    {
                    ASC432=(Token)match(input,ASC,FOLLOW_ASC_in_indexed_column3638);  
                    stream_ASC.add(ASC432);


                    }
                    break;
                case 2 :
                    // Sql.g:389:68: DESC
                    {
                    DESC433=(Token)match(input,DESC,FOLLOW_DESC_in_indexed_column3642);  
                    stream_DESC.add(DESC433);


                    }
                    break;

            }



            // AST REWRITE
            // elements: collation_name, COLLATE, DESC, ASC, column_name
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
            // 390:1: -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? )
            {
                // Sql.g:390:4: ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_column_name.nextNode(), root_1);

                // Sql.g:390:19: ( ^( COLLATE $collation_name) )?
                if ( stream_collation_name.hasNext()||stream_COLLATE.hasNext() ) {
                    // Sql.g:390:19: ^( COLLATE $collation_name)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_COLLATE.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_collation_name.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_collation_name.reset();
                stream_COLLATE.reset();
                // Sql.g:390:47: ( ASC )?
                if ( stream_ASC.hasNext() ) {
                    adaptor.addChild(root_1, stream_ASC.nextNode());

                }
                stream_ASC.reset();
                // Sql.g:390:52: ( DESC )?
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
    // Sql.g:393:1: drop_index_stmt : DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) ) ;
    public final SqlParser.drop_index_stmt_return drop_index_stmt() throws RecognitionException {
        SqlParser.drop_index_stmt_return retval = new SqlParser.drop_index_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP434=null;
        Token INDEX435=null;
        Token IF436=null;
        Token EXISTS437=null;
        Token DOT438=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return index_name = null;


        Object DROP434_tree=null;
        Object INDEX435_tree=null;
        Object IF436_tree=null;
        Object EXISTS437_tree=null;
        Object DOT438_tree=null;
        RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // Sql.g:393:16: ( DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) ) )
            // Sql.g:393:18: DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id
            {
            DROP434=(Token)match(input,DROP,FOLLOW_DROP_in_drop_index_stmt3673);  
            stream_DROP.add(DROP434);

            INDEX435=(Token)match(input,INDEX,FOLLOW_INDEX_in_drop_index_stmt3675);  
            stream_INDEX.add(INDEX435);

            // Sql.g:393:29: ( IF EXISTS )?
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
                    // Sql.g:393:30: IF EXISTS
                    {
                    IF436=(Token)match(input,IF,FOLLOW_IF_in_drop_index_stmt3678);  
                    stream_IF.add(IF436);

                    EXISTS437=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_index_stmt3680);  
                    stream_EXISTS.add(EXISTS437);


                    }
                    break;

            }

            // Sql.g:393:42: (database_name= id DOT )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==ID) ) {
                int LA161_1 = input.LA(2);

                if ( (LA161_1==DOT) ) {
                    alt161=1;
                }
            }
            else if ( ((LA161_0>=EXPLAIN && LA161_0<=PLAN)||(LA161_0>=INDEXED && LA161_0<=BY)||(LA161_0>=OR && LA161_0<=ESCAPE)||(LA161_0>=IS && LA161_0<=BETWEEN)||LA161_0==COLLATE||(LA161_0>=DISTINCT && LA161_0<=THEN)||(LA161_0>=CURRENT_TIME && LA161_0<=CURRENT_TIMESTAMP)||(LA161_0>=RAISE && LA161_0<=ROW)) ) {
                int LA161_2 = input.LA(2);

                if ( (LA161_2==DOT) ) {
                    alt161=1;
                }
            }
            switch (alt161) {
                case 1 :
                    // Sql.g:393:43: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_index_stmt3687);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT438=(Token)match(input,DOT,FOLLOW_DOT_in_drop_index_stmt3689);  
                    stream_DOT.add(DOT438);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_index_stmt3695);
            index_name=id();

            state._fsp--;

            stream_id.add(index_name.getTree());


            // AST REWRITE
            // elements: database_name, index_name, EXISTS
            // token labels: 
            // rule labels: index_name, database_name, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_index_name=new RewriteRuleSubtreeStream(adaptor,"rule index_name",index_name!=null?index_name.tree:null);
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 394:1: -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) )
            {
                // Sql.g:394:4: ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DROP_INDEX, "DROP_INDEX"), root_1);

                // Sql.g:394:17: ^( OPTIONS ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // Sql.g:394:27: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // Sql.g:394:36: ^( $index_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_index_name.nextNode(), root_2);

                // Sql.g:394:50: ( $database_name)?
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
    // Sql.g:397:1: create_trigger_stmt : CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END ;
    public final SqlParser.create_trigger_stmt_return create_trigger_stmt() throws RecognitionException {
        SqlParser.create_trigger_stmt_return retval = new SqlParser.create_trigger_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE439=null;
        Token TEMPORARY440=null;
        Token TRIGGER441=null;
        Token IF442=null;
        Token NOT443=null;
        Token EXISTS444=null;
        Token DOT445=null;
        Token BEFORE446=null;
        Token AFTER447=null;
        Token INSTEAD448=null;
        Token OF449=null;
        Token DELETE450=null;
        Token INSERT451=null;
        Token UPDATE452=null;
        Token OF453=null;
        Token COMMA454=null;
        Token ON455=null;
        Token FOR456=null;
        Token EACH457=null;
        Token ROW458=null;
        Token WHEN459=null;
        Token BEGIN461=null;
        Token SEMI466=null;
        Token END467=null;
        List list_column_names=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return trigger_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.expr_return expr460 = null;

        SqlParser.update_stmt_return update_stmt462 = null;

        SqlParser.insert_stmt_return insert_stmt463 = null;

        SqlParser.delete_stmt_return delete_stmt464 = null;

        SqlParser.select_stmt_return select_stmt465 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object CREATE439_tree=null;
        Object TEMPORARY440_tree=null;
        Object TRIGGER441_tree=null;
        Object IF442_tree=null;
        Object NOT443_tree=null;
        Object EXISTS444_tree=null;
        Object DOT445_tree=null;
        Object BEFORE446_tree=null;
        Object AFTER447_tree=null;
        Object INSTEAD448_tree=null;
        Object OF449_tree=null;
        Object DELETE450_tree=null;
        Object INSERT451_tree=null;
        Object UPDATE452_tree=null;
        Object OF453_tree=null;
        Object COMMA454_tree=null;
        Object ON455_tree=null;
        Object FOR456_tree=null;
        Object EACH457_tree=null;
        Object ROW458_tree=null;
        Object WHEN459_tree=null;
        Object BEGIN461_tree=null;
        Object SEMI466_tree=null;
        Object END467_tree=null;

        try {
            // Sql.g:397:20: ( CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END )
            // Sql.g:397:22: CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END
            {
            root_0 = (Object)adaptor.nil();

            CREATE439=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_trigger_stmt3725); 
            CREATE439_tree = (Object)adaptor.create(CREATE439);
            adaptor.addChild(root_0, CREATE439_tree);

            // Sql.g:397:29: ( TEMPORARY )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==TEMPORARY) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // Sql.g:397:29: TEMPORARY
                    {
                    TEMPORARY440=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_trigger_stmt3727); 
                    TEMPORARY440_tree = (Object)adaptor.create(TEMPORARY440);
                    adaptor.addChild(root_0, TEMPORARY440_tree);


                    }
                    break;

            }

            TRIGGER441=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_create_trigger_stmt3730); 
            TRIGGER441_tree = (Object)adaptor.create(TRIGGER441);
            adaptor.addChild(root_0, TRIGGER441_tree);

            // Sql.g:397:48: ( IF NOT EXISTS )?
            int alt163=2;
            alt163 = dfa163.predict(input);
            switch (alt163) {
                case 1 :
                    // Sql.g:397:49: IF NOT EXISTS
                    {
                    IF442=(Token)match(input,IF,FOLLOW_IF_in_create_trigger_stmt3733); 
                    IF442_tree = (Object)adaptor.create(IF442);
                    adaptor.addChild(root_0, IF442_tree);

                    NOT443=(Token)match(input,NOT,FOLLOW_NOT_in_create_trigger_stmt3735); 
                    NOT443_tree = (Object)adaptor.create(NOT443);
                    adaptor.addChild(root_0, NOT443_tree);

                    EXISTS444=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_trigger_stmt3737); 
                    EXISTS444_tree = (Object)adaptor.create(EXISTS444);
                    adaptor.addChild(root_0, EXISTS444_tree);


                    }
                    break;

            }

            // Sql.g:397:65: (database_name= id DOT )?
            int alt164=2;
            alt164 = dfa164.predict(input);
            switch (alt164) {
                case 1 :
                    // Sql.g:397:66: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_trigger_stmt3744);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT445=(Token)match(input,DOT,FOLLOW_DOT_in_create_trigger_stmt3746); 
                    DOT445_tree = (Object)adaptor.create(DOT445);
                    adaptor.addChild(root_0, DOT445_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_trigger_stmt3752);
            trigger_name=id();

            state._fsp--;

            adaptor.addChild(root_0, trigger_name.getTree());
            // Sql.g:398:3: ( BEFORE | AFTER | INSTEAD OF )?
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
                    // Sql.g:398:4: BEFORE
                    {
                    BEFORE446=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_create_trigger_stmt3757); 
                    BEFORE446_tree = (Object)adaptor.create(BEFORE446);
                    adaptor.addChild(root_0, BEFORE446_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:398:13: AFTER
                    {
                    AFTER447=(Token)match(input,AFTER,FOLLOW_AFTER_in_create_trigger_stmt3761); 
                    AFTER447_tree = (Object)adaptor.create(AFTER447);
                    adaptor.addChild(root_0, AFTER447_tree);


                    }
                    break;
                case 3 :
                    // Sql.g:398:21: INSTEAD OF
                    {
                    INSTEAD448=(Token)match(input,INSTEAD,FOLLOW_INSTEAD_in_create_trigger_stmt3765); 
                    INSTEAD448_tree = (Object)adaptor.create(INSTEAD448);
                    adaptor.addChild(root_0, INSTEAD448_tree);

                    OF449=(Token)match(input,OF,FOLLOW_OF_in_create_trigger_stmt3767); 
                    OF449_tree = (Object)adaptor.create(OF449);
                    adaptor.addChild(root_0, OF449_tree);


                    }
                    break;

            }

            // Sql.g:398:34: ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? )
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
                    // Sql.g:398:35: DELETE
                    {
                    DELETE450=(Token)match(input,DELETE,FOLLOW_DELETE_in_create_trigger_stmt3772); 
                    DELETE450_tree = (Object)adaptor.create(DELETE450);
                    adaptor.addChild(root_0, DELETE450_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:398:44: INSERT
                    {
                    INSERT451=(Token)match(input,INSERT,FOLLOW_INSERT_in_create_trigger_stmt3776); 
                    INSERT451_tree = (Object)adaptor.create(INSERT451);
                    adaptor.addChild(root_0, INSERT451_tree);


                    }
                    break;
                case 3 :
                    // Sql.g:398:53: UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )?
                    {
                    UPDATE452=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_create_trigger_stmt3780); 
                    UPDATE452_tree = (Object)adaptor.create(UPDATE452);
                    adaptor.addChild(root_0, UPDATE452_tree);

                    // Sql.g:398:60: ( OF column_names+= id ( COMMA column_names+= id )* )?
                    int alt167=2;
                    int LA167_0 = input.LA(1);

                    if ( (LA167_0==OF) ) {
                        alt167=1;
                    }
                    switch (alt167) {
                        case 1 :
                            // Sql.g:398:61: OF column_names+= id ( COMMA column_names+= id )*
                            {
                            OF453=(Token)match(input,OF,FOLLOW_OF_in_create_trigger_stmt3783); 
                            OF453_tree = (Object)adaptor.create(OF453);
                            adaptor.addChild(root_0, OF453_tree);

                            pushFollow(FOLLOW_id_in_create_trigger_stmt3787);
                            column_names=id();

                            state._fsp--;

                            adaptor.addChild(root_0, column_names.getTree());
                            if (list_column_names==null) list_column_names=new ArrayList();
                            list_column_names.add(column_names.getTree());

                            // Sql.g:398:81: ( COMMA column_names+= id )*
                            loop166:
                            do {
                                int alt166=2;
                                int LA166_0 = input.LA(1);

                                if ( (LA166_0==COMMA) ) {
                                    alt166=1;
                                }


                                switch (alt166) {
                            	case 1 :
                            	    // Sql.g:398:82: COMMA column_names+= id
                            	    {
                            	    COMMA454=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_trigger_stmt3790); 
                            	    COMMA454_tree = (Object)adaptor.create(COMMA454);
                            	    adaptor.addChild(root_0, COMMA454_tree);

                            	    pushFollow(FOLLOW_id_in_create_trigger_stmt3794);
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

            ON455=(Token)match(input,ON,FOLLOW_ON_in_create_trigger_stmt3803); 
            ON455_tree = (Object)adaptor.create(ON455);
            adaptor.addChild(root_0, ON455_tree);

            pushFollow(FOLLOW_id_in_create_trigger_stmt3807);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // Sql.g:399:20: ( FOR EACH ROW )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==FOR) ) {
                alt169=1;
            }
            switch (alt169) {
                case 1 :
                    // Sql.g:399:21: FOR EACH ROW
                    {
                    FOR456=(Token)match(input,FOR,FOLLOW_FOR_in_create_trigger_stmt3810); 
                    FOR456_tree = (Object)adaptor.create(FOR456);
                    adaptor.addChild(root_0, FOR456_tree);

                    EACH457=(Token)match(input,EACH,FOLLOW_EACH_in_create_trigger_stmt3812); 
                    EACH457_tree = (Object)adaptor.create(EACH457);
                    adaptor.addChild(root_0, EACH457_tree);

                    ROW458=(Token)match(input,ROW,FOLLOW_ROW_in_create_trigger_stmt3814); 
                    ROW458_tree = (Object)adaptor.create(ROW458);
                    adaptor.addChild(root_0, ROW458_tree);


                    }
                    break;

            }

            // Sql.g:399:36: ( WHEN expr )?
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==WHEN) ) {
                alt170=1;
            }
            switch (alt170) {
                case 1 :
                    // Sql.g:399:37: WHEN expr
                    {
                    WHEN459=(Token)match(input,WHEN,FOLLOW_WHEN_in_create_trigger_stmt3819); 
                    WHEN459_tree = (Object)adaptor.create(WHEN459);
                    adaptor.addChild(root_0, WHEN459_tree);

                    pushFollow(FOLLOW_expr_in_create_trigger_stmt3821);
                    expr460=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr460.getTree());

                    }
                    break;

            }

            BEGIN461=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_create_trigger_stmt3827); 
            BEGIN461_tree = (Object)adaptor.create(BEGIN461);
            adaptor.addChild(root_0, BEGIN461_tree);

            // Sql.g:400:9: ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+
            int cnt172=0;
            loop172:
            do {
                int alt172=2;
                int LA172_0 = input.LA(1);

                if ( (LA172_0==REPLACE||LA172_0==SELECT||LA172_0==INSERT||LA172_0==UPDATE||LA172_0==DELETE) ) {
                    alt172=1;
                }


                switch (alt172) {
            	case 1 :
            	    // Sql.g:400:10: ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI
            	    {
            	    // Sql.g:400:10: ( update_stmt | insert_stmt | delete_stmt | select_stmt )
            	    int alt171=4;
            	    switch ( input.LA(1) ) {
            	    case UPDATE:
            	        {
            	        alt171=1;
            	        }
            	        break;
            	    case REPLACE:
            	    case INSERT:
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
            	            // Sql.g:400:11: update_stmt
            	            {
            	            pushFollow(FOLLOW_update_stmt_in_create_trigger_stmt3831);
            	            update_stmt462=update_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, update_stmt462.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // Sql.g:400:25: insert_stmt
            	            {
            	            pushFollow(FOLLOW_insert_stmt_in_create_trigger_stmt3835);
            	            insert_stmt463=insert_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, insert_stmt463.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // Sql.g:400:39: delete_stmt
            	            {
            	            pushFollow(FOLLOW_delete_stmt_in_create_trigger_stmt3839);
            	            delete_stmt464=delete_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, delete_stmt464.getTree());

            	            }
            	            break;
            	        case 4 :
            	            // Sql.g:400:53: select_stmt
            	            {
            	            pushFollow(FOLLOW_select_stmt_in_create_trigger_stmt3843);
            	            select_stmt465=select_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, select_stmt465.getTree());

            	            }
            	            break;

            	    }

            	    SEMI466=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_trigger_stmt3846); 
            	    SEMI466_tree = (Object)adaptor.create(SEMI466);
            	    adaptor.addChild(root_0, SEMI466_tree);


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

            END467=(Token)match(input,END,FOLLOW_END_in_create_trigger_stmt3850); 
            END467_tree = (Object)adaptor.create(END467);
            adaptor.addChild(root_0, END467_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // Sql.g:403:1: drop_trigger_stmt : DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id ;
    public final SqlParser.drop_trigger_stmt_return drop_trigger_stmt() throws RecognitionException {
        SqlParser.drop_trigger_stmt_return retval = new SqlParser.drop_trigger_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP468=null;
        Token TRIGGER469=null;
        Token IF470=null;
        Token EXISTS471=null;
        Token DOT472=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return trigger_name = null;


        Object DROP468_tree=null;
        Object TRIGGER469_tree=null;
        Object IF470_tree=null;
        Object EXISTS471_tree=null;
        Object DOT472_tree=null;

        try {
            // Sql.g:403:18: ( DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id )
            // Sql.g:403:20: DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id
            {
            root_0 = (Object)adaptor.nil();

            DROP468=(Token)match(input,DROP,FOLLOW_DROP_in_drop_trigger_stmt3858); 
            DROP468_tree = (Object)adaptor.create(DROP468);
            adaptor.addChild(root_0, DROP468_tree);

            TRIGGER469=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_drop_trigger_stmt3860); 
            TRIGGER469_tree = (Object)adaptor.create(TRIGGER469);
            adaptor.addChild(root_0, TRIGGER469_tree);

            // Sql.g:403:33: ( IF EXISTS )?
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
                    // Sql.g:403:34: IF EXISTS
                    {
                    IF470=(Token)match(input,IF,FOLLOW_IF_in_drop_trigger_stmt3863); 
                    IF470_tree = (Object)adaptor.create(IF470);
                    adaptor.addChild(root_0, IF470_tree);

                    EXISTS471=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_trigger_stmt3865); 
                    EXISTS471_tree = (Object)adaptor.create(EXISTS471);
                    adaptor.addChild(root_0, EXISTS471_tree);


                    }
                    break;

            }

            // Sql.g:403:46: (database_name= id DOT )?
            int alt174=2;
            int LA174_0 = input.LA(1);

            if ( (LA174_0==ID) ) {
                int LA174_1 = input.LA(2);

                if ( (LA174_1==DOT) ) {
                    alt174=1;
                }
            }
            else if ( ((LA174_0>=EXPLAIN && LA174_0<=PLAN)||(LA174_0>=INDEXED && LA174_0<=BY)||(LA174_0>=OR && LA174_0<=ESCAPE)||(LA174_0>=IS && LA174_0<=BETWEEN)||LA174_0==COLLATE||(LA174_0>=DISTINCT && LA174_0<=THEN)||(LA174_0>=CURRENT_TIME && LA174_0<=CURRENT_TIMESTAMP)||(LA174_0>=RAISE && LA174_0<=ROW)) ) {
                int LA174_2 = input.LA(2);

                if ( (LA174_2==DOT) ) {
                    alt174=1;
                }
            }
            switch (alt174) {
                case 1 :
                    // Sql.g:403:47: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_trigger_stmt3872);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT472=(Token)match(input,DOT,FOLLOW_DOT_in_drop_trigger_stmt3874); 
                    DOT472_tree = (Object)adaptor.create(DOT472);
                    adaptor.addChild(root_0, DOT472_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_trigger_stmt3880);
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
    // Sql.g:408:1: id : ( ID | keyword );
    public final SqlParser.id_return id() throws RecognitionException {
        SqlParser.id_return retval = new SqlParser.id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID473=null;
        SqlParser.keyword_return keyword474 = null;


        Object ID473_tree=null;

        try {
            // Sql.g:408:3: ( ID | keyword )
            int alt175=2;
            int LA175_0 = input.LA(1);

            if ( (LA175_0==ID) ) {
                alt175=1;
            }
            else if ( ((LA175_0>=EXPLAIN && LA175_0<=PLAN)||(LA175_0>=INDEXED && LA175_0<=BY)||(LA175_0>=OR && LA175_0<=ESCAPE)||(LA175_0>=IS && LA175_0<=BETWEEN)||LA175_0==COLLATE||(LA175_0>=DISTINCT && LA175_0<=THEN)||(LA175_0>=CURRENT_TIME && LA175_0<=CURRENT_TIMESTAMP)||(LA175_0>=RAISE && LA175_0<=ROW)) ) {
                alt175=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 175, 0, input);

                throw nvae;
            }
            switch (alt175) {
                case 1 :
                    // Sql.g:408:5: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID473=(Token)match(input,ID,FOLLOW_ID_in_id3890); 
                    ID473_tree = (Object)adaptor.create(ID473);
                    adaptor.addChild(root_0, ID473_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:408:10: keyword
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_id3894);
                    keyword474=keyword();

                    state._fsp--;

                    adaptor.addChild(root_0, keyword474.getTree());

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
    // Sql.g:410:1: keyword : ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GROUP | HAVING | IF | IGNORE | IMMEDIATE | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | JOIN | KEY | LEFT | LIMIT | NATURAL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) ;
    public final SqlParser.keyword_return keyword() throws RecognitionException {
        SqlParser.keyword_return retval = new SqlParser.keyword_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set475=null;

        Object set475_tree=null;

        try {
            // Sql.g:410:8: ( ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GROUP | HAVING | IF | IGNORE | IMMEDIATE | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | JOIN | KEY | LEFT | LIMIT | NATURAL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) )
            // Sql.g:410:10: ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GROUP | HAVING | IF | IGNORE | IMMEDIATE | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | JOIN | KEY | LEFT | LIMIT | NATURAL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE )
            {
            root_0 = (Object)adaptor.nil();

            set475=(Token)input.LT(1);
            if ( (input.LA(1)>=EXPLAIN && input.LA(1)<=PLAN)||(input.LA(1)>=INDEXED && input.LA(1)<=BY)||(input.LA(1)>=OR && input.LA(1)<=ESCAPE)||(input.LA(1)>=IS && input.LA(1)<=BETWEEN)||input.LA(1)==COLLATE||(input.LA(1)>=DISTINCT && input.LA(1)<=THEN)||(input.LA(1)>=CURRENT_TIME && input.LA(1)<=CURRENT_TIMESTAMP)||(input.LA(1)>=RAISE && input.LA(1)<=ROW) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set475));
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
    // Sql.g:529:1: id_column_def : ( ID | keyword_column_def );
    public final SqlParser.id_column_def_return id_column_def() throws RecognitionException {
        SqlParser.id_column_def_return retval = new SqlParser.id_column_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID476=null;
        SqlParser.keyword_column_def_return keyword_column_def477 = null;


        Object ID476_tree=null;

        try {
            // Sql.g:529:14: ( ID | keyword_column_def )
            int alt176=2;
            int LA176_0 = input.LA(1);

            if ( (LA176_0==ID) ) {
                alt176=1;
            }
            else if ( ((LA176_0>=EXPLAIN && LA176_0<=PLAN)||(LA176_0>=INDEXED && LA176_0<=NOT)||(LA176_0>=OR && LA176_0<=IN)||(LA176_0>=ISNULL && LA176_0<=BETWEEN)||(LA176_0>=LIKE && LA176_0<=MATCH)||LA176_0==COLLATE||(LA176_0>=DISTINCT && LA176_0<=THEN)||(LA176_0>=CURRENT_TIME && LA176_0<=CURRENT_TIMESTAMP)||(LA176_0>=RAISE && LA176_0<=EXISTS)||(LA176_0>=PRIMARY && LA176_0<=ADD)||(LA176_0>=VIEW && LA176_0<=ROW)) ) {
                alt176=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 176, 0, input);

                throw nvae;
            }
            switch (alt176) {
                case 1 :
                    // Sql.g:529:16: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID476=(Token)match(input,ID,FOLLOW_ID_in_id_column_def4568); 
                    ID476_tree = (Object)adaptor.create(ID476);
                    adaptor.addChild(root_0, ID476_tree);


                    }
                    break;
                case 2 :
                    // Sql.g:529:21: keyword_column_def
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_keyword_column_def_in_id_column_def4572);
                    keyword_column_def477=keyword_column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, keyword_column_def477.getTree());

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
    // Sql.g:531:1: keyword_column_def : ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) ;
    public final SqlParser.keyword_column_def_return keyword_column_def() throws RecognitionException {
        SqlParser.keyword_column_def_return retval = new SqlParser.keyword_column_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set478=null;

        Object set478_tree=null;

        try {
            // Sql.g:531:19: ( ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) )
            // Sql.g:531:21: ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE )
            {
            root_0 = (Object)adaptor.nil();

            set478=(Token)input.LT(1);
            if ( (input.LA(1)>=EXPLAIN && input.LA(1)<=PLAN)||(input.LA(1)>=INDEXED && input.LA(1)<=NOT)||(input.LA(1)>=OR && input.LA(1)<=IN)||(input.LA(1)>=ISNULL && input.LA(1)<=BETWEEN)||(input.LA(1)>=LIKE && input.LA(1)<=MATCH)||input.LA(1)==COLLATE||(input.LA(1)>=DISTINCT && input.LA(1)<=THEN)||(input.LA(1)>=CURRENT_TIME && input.LA(1)<=CURRENT_TIMESTAMP)||(input.LA(1)>=RAISE && input.LA(1)<=EXISTS)||(input.LA(1)>=PRIMARY && input.LA(1)<=ADD)||(input.LA(1)>=VIEW && input.LA(1)<=ROW) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set478));
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
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA81 dfa81 = new DFA81(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA91 dfa91 = new DFA91(this);
    protected DFA116 dfa116 = new DFA116(this);
    protected DFA119 dfa119 = new DFA119(this);
    protected DFA120 dfa120 = new DFA120(this);
    protected DFA123 dfa123 = new DFA123(this);
    protected DFA124 dfa124 = new DFA124(this);
    protected DFA125 dfa125 = new DFA125(this);
    protected DFA126 dfa126 = new DFA126(this);
    protected DFA127 dfa127 = new DFA127(this);
    protected DFA128 dfa128 = new DFA128(this);
    protected DFA138 dfa138 = new DFA138(this);
    protected DFA139 dfa139 = new DFA139(this);
    protected DFA143 dfa143 = new DFA143(this);
    protected DFA163 dfa163 = new DFA163(this);
    protected DFA164 dfa164 = new DFA164(this);
    static final String DFA1_eotS =
        "\26\uffff";
    static final String DFA1_eofS =
        "\1\1\25\uffff";
    static final String DFA1_minS =
        "\1\37\25\uffff";
    static final String DFA1_maxS =
        "\1\u00a5\25\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\2\1\1\23\uffff";
    static final String DFA1_specialS =
        "\26\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\63\uffff\1\2\14\uffff\1\2\2\uffff\2\2\1\uffff\5\2\11\uffff"+
            "\1\2\14\uffff\1\2\3\uffff\1\2\1\uffff\2\2\4\uffff\1\2\1\uffff"+
            "\2\2\1\uffff\1\2\21\uffff\2\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()+ loopback of 64:16: ( sql_stmt )+";
        }
    }
    static final String DFA3_eotS =
        "\25\uffff";
    static final String DFA3_eofS =
        "\25\uffff";
    static final String DFA3_minS =
        "\1\37\24\uffff";
    static final String DFA3_maxS =
        "\1\u00a5\24\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\22\uffff";
    static final String DFA3_specialS =
        "\25\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\63\uffff\1\2\14\uffff\1\2\2\uffff\2\2\1\uffff\5\2\11\uffff"+
            "\1\2\14\uffff\1\2\3\uffff\1\2\1\uffff\2\2\4\uffff\1\2\1\uffff"+
            "\2\2\1\uffff\1\2\21\uffff\2\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "66:11: ( EXPLAIN ( QUERY PLAN )? )?";
        }
    }
    static final String DFA2_eotS =
        "\25\uffff";
    static final String DFA2_eofS =
        "\25\uffff";
    static final String DFA2_minS =
        "\1\40\24\uffff";
    static final String DFA2_maxS =
        "\1\u00a5\24\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\22\uffff";
    static final String DFA2_specialS =
        "\25\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\62\uffff\1\2\14\uffff\1\2\2\uffff\2\2\1\uffff\5\2\11\uffff"+
            "\1\2\14\uffff\1\2\3\uffff\1\2\1\uffff\2\2\4\uffff\1\2\1\uffff"+
            "\2\2\1\uffff\1\2\21\uffff\2\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "66:20: ( QUERY PLAN )?";
        }
    }
    static final String DFA4_eotS =
        "\42\uffff";
    static final String DFA4_eofS =
        "\42\uffff";
    static final String DFA4_minS =
        "\1\123\20\uffff\1\u0093\1\u0094\2\uffff\1\u0094\14\uffff";
    static final String DFA4_maxS =
        "\1\u00a5\20\uffff\2\u00ab\2\uffff\1\u00ab\14\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\11\1\12\1\13"+
        "\1\14\1\15\1\16\1\17\2\uffff\1\23\1\20\1\uffff\1\30\1\26\1\uffff"+
        "\1\21\1\24\1\22\1\25\1\27\1\31\3\uffff";
    static final String DFA4_specialS =
        "\42\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\15\14\uffff\1\16\2\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6"+
            "\1\10\11\uffff\1\7\14\uffff\1\10\3\uffff\1\12\1\uffff\1\13\1"+
            "\14\4\uffff\1\15\1\uffff\1\17\1\20\1\uffff\1\21\21\uffff\1\22"+
            "\1\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\24\1\31\1\25\6\uffff\1\27\14\uffff\1\32\1\27\1\26",
            "\1\33\24\uffff\1\34\1\35\1\36",
            "",
            "",
            "\1\31\24\uffff\1\32\1\uffff\1\26",
            "",
            "",
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
            return "68:1: sql_stmt_core : ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt );";
        }
    }
    static final String DFA5_eotS =
        "\23\uffff";
    static final String DFA5_eofS =
        "\23\uffff";
    static final String DFA5_minS =
        "\1\37\2\42\20\uffff";
    static final String DFA5_maxS =
        "\1\u00b2\2\u0086\20\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\2\6\uffff\1\1\10\uffff";
    static final String DFA5_specialS =
        "\23\uffff}>";
    static final String[] DFA5_transitionS = {
            "\3\2\2\uffff\2\2\5\uffff\3\2\6\uffff\3\2\25\uffff\1\2\1\1\10"+
            "\2\2\uffff\3\2\3\uffff\125\2",
            "\1\3\1\12\1\3\1\uffff\1\3\106\uffff\2\3\7\uffff\1\3\17\uffff"+
            "\1\3",
            "\1\3\1\12\1\3\1\uffff\1\3\106\uffff\2\3\7\uffff\1\3\17\uffff"+
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
            return "98:23: (database_name= id DOT )?";
        }
    }
    static final String DFA8_eotS =
        "\137\uffff";
    static final String DFA8_eofS =
        "\137\uffff";
    static final String DFA8_minS =
        "\1\37\33\uffff\1\37\21\uffff\1\37\2\uffff\1\37\6\43\47\uffff";
    static final String DFA8_maxS =
        "\1\u00b2\33\uffff\1\u00b2\21\uffff\1\u00b2\2\uffff\1\u00b2\1\45"+
        "\3\164\1\45\1\51\47\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\2\34\uffff\1\1\100\uffff";
    static final String DFA8_specialS =
        "\137\uffff}>";
    static final String[] DFA8_transitionS = {
            "\4\1\1\uffff\2\1\5\uffff\1\34\2\1\2\uffff\2\1\2\uffff\3\1\25"+
            "\uffff\12\1\2\uffff\3\1\3\uffff\125\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\36\1\1\1\uffff\12\36\1\uffff\1\36\2\1\2\uffff\3\36\24\uffff"+
            "\42\36\1\66\1\67\1\36\1\63\1\36\1\64\1\65\1\36\1\56\1\61\1\62"+
            "\73\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\1\1\uffff\1\36\2\1\5\uffff\3\1\1\uffff\1\1\4\uffff\3\1\25"+
            "\uffff\12\1\2\uffff\3\1\3\uffff\125\1",
            "",
            "",
            "\3\1\1\uffff\1\36\12\1\1\uffff\1\1\4\uffff\3\1\24\uffff\150"+
            "\1",
            "\1\36\1\uffff\1\1",
            "\1\36\115\uffff\1\1\2\uffff\1\1",
            "\1\36\120\uffff\1\1",
            "\1\36\120\uffff\1\1",
            "\1\36\1\uffff\1\1",
            "\1\36\5\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 102:18: ( OR or_subexpr )*";
        }
    }
    static final String DFA9_eotS =
        "\140\uffff";
    static final String DFA9_eofS =
        "\140\uffff";
    static final String DFA9_minS =
        "\1\37\34\uffff\1\37\2\uffff\2\37\6\43\70\uffff";
    static final String DFA9_maxS =
        "\1\u00b2\34\uffff\1\u00b2\2\uffff\2\u00b2\1\45\3\164\1\45\1\51\70"+
        "\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\2\50\uffff\1\1\65\uffff";
    static final String DFA9_specialS =
        "\140\uffff}>";
    static final String[] DFA9_transitionS = {
            "\4\1\1\uffff\2\1\5\uffff\1\1\1\35\1\1\2\uffff\2\1\2\uffff\3"+
            "\1\25\uffff\12\1\2\uffff\3\1\3\uffff\125\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\52\1\1\1\uffff\12\52\1\uffff\1\52\2\1\2\uffff\3\52\24\uffff"+
            "\42\52\1\46\1\47\1\52\1\43\1\52\1\44\1\45\1\52\1\40\1\41\1\42"+
            "\73\52",
            "",
            "",
            "\3\1\1\uffff\1\52\2\1\5\uffff\3\1\1\uffff\1\1\4\uffff\3\1\25"+
            "\uffff\12\1\2\uffff\3\1\3\uffff\125\1",
            "\3\1\1\uffff\1\52\12\1\1\uffff\1\1\4\uffff\3\1\24\uffff\150"+
            "\1",
            "\1\52\1\uffff\1\1",
            "\1\52\115\uffff\1\1\2\uffff\1\1",
            "\1\52\120\uffff\1\1",
            "\1\52\120\uffff\1\1",
            "\1\52\1\uffff\1\1",
            "\1\52\5\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 104:25: ( AND and_subexpr )*";
        }
    }
    static final String DFA10_eotS =
        "\165\uffff";
    static final String DFA10_eofS =
        "\165\uffff";
    static final String DFA10_minS =
        "\1\37\5\uffff\1\42\1\37\74\uffff\1\37\2\uffff\1\37\6\43\47\uffff";
    static final String DFA10_maxS =
        "\1\u00b2\5\uffff\1\167\1\u00b2\74\uffff\1\u00b2\2\uffff\1\u00b2"+
        "\1\45\3\164\1\45\1\51\47\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\7\uffff\1\2\153\uffff";
    static final String DFA10_specialS =
        "\165\uffff}>";
    static final String[] DFA10_transitionS = {
            "\4\11\1\uffff\2\11\1\1\4\uffff\3\11\1\1\1\uffff\2\11\2\1\1\6"+
            "\1\11\1\7\10\1\15\uffff\12\11\2\uffff\3\11\3\uffff\125\11",
            "",
            "",
            "",
            "",
            "",
            "\1\11\3\uffff\1\1\11\uffff\2\11\3\uffff\1\1\67\uffff\2\11\1"+
            "\uffff\1\11\1\uffff\2\11\1\uffff\3\11",
            "\3\1\1\11\1\uffff\12\1\1\uffff\1\1\2\11\2\uffff\3\1\24\uffff"+
            "\42\1\1\114\1\115\1\1\1\111\1\1\1\112\1\113\1\1\1\104\1\107"+
            "\1\110\73\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\11\1\uffff\1\1\2\11\5\uffff\3\11\1\uffff\1\11\4\uffff\3"+
            "\11\25\uffff\12\11\2\uffff\3\11\3\uffff\125\11",
            "",
            "",
            "\3\11\1\uffff\1\1\12\11\1\uffff\1\11\4\uffff\3\11\24\uffff"+
            "\150\11",
            "\1\1\1\uffff\1\11",
            "\1\1\115\uffff\1\11\2\uffff\1\11",
            "\1\1\120\uffff\1\11",
            "\1\1\120\uffff\1\11",
            "\1\1\1\uffff\1\11",
            "\1\1\5\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "106:34: ( cond_expr )?";
        }
    }
    static final String DFA20_eotS =
        "\23\uffff";
    static final String DFA20_eofS =
        "\23\uffff";
    static final String DFA20_minS =
        "\1\46\1\56\1\uffff\1\37\6\uffff\1\37\10\uffff";
    static final String DFA20_maxS =
        "\2\76\1\uffff\1\u00b2\6\uffff\1\u00b2\10\uffff";
    static final String DFA20_acceptS =
        "\2\uffff\1\1\1\uffff\1\4\2\uffff\1\5\1\6\4\uffff\1\2\1\3\4\uffff";
    static final String DFA20_specialS =
        "\23\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1\7\uffff\1\3\3\uffff\3\4\1\uffff\1\7\4\10\4\2",
            "\1\12\6\uffff\1\4\1\7\4\uffff\4\2",
            "",
            "\3\16\2\uffff\2\16\5\uffff\3\16\1\uffff\1\15\4\uffff\3\16\25"+
            "\uffff\12\16\2\uffff\3\16\3\uffff\125\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\16\2\uffff\2\16\5\uffff\3\16\1\uffff\1\15\4\uffff\3\16\25"+
            "\uffff\12\16\2\uffff\3\16\3\uffff\125\16",
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
            return "108:1: cond_expr : ( ( NOT )? match_op match_expr= eq_subexpr ( ESCAPE escape_expr= eq_subexpr )? -> ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? ) | ( NOT )? IN LPAREN expr ( COMMA expr )* RPAREN -> ^( IN_VALUES ( NOT )? ^( IN ( expr )+ ) ) | ( NOT )? IN (database_name= id DOT )? table_name= id -> ^( IN_TABLE ( NOT )? ^( IN ^( $table_name ( $database_name)? ) ) ) | ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL ) | ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr -> ^( BETWEEN ( NOT )? ^( AND $e1 $e2) ) | ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )+ );";
        }
    }
    static final String DFA12_eotS =
        "\141\uffff";
    static final String DFA12_eofS =
        "\141\uffff";
    static final String DFA12_minS =
        "\2\37\37\uffff\2\37\6\43\70\uffff";
    static final String DFA12_maxS =
        "\2\u00b2\37\uffff\2\u00b2\1\45\3\164\1\45\1\51\70\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\50\uffff\1\1\65\uffff";
    static final String DFA12_specialS =
        "\141\uffff}>";
    static final String[] DFA12_transitionS = {
            "\4\2\1\uffff\2\2\5\uffff\2\2\1\1\2\uffff\2\2\2\uffff\3\2\25"+
            "\uffff\12\2\2\uffff\3\2\3\uffff\125\2",
            "\3\53\1\2\1\uffff\12\53\1\uffff\1\53\2\2\2\uffff\3\53\24\uffff"+
            "\42\53\1\47\1\50\1\53\1\44\1\53\1\45\1\46\1\53\1\41\1\42\1\43"+
            "\73\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\2\1\uffff\1\53\2\2\5\uffff\3\2\1\uffff\1\2\4\uffff\3\2\25"+
            "\uffff\12\2\2\uffff\3\2\3\uffff\125\2",
            "\3\2\1\uffff\1\53\12\2\1\uffff\1\2\4\uffff\3\2\24\uffff\150"+
            "\2",
            "\1\53\1\uffff\1\2",
            "\1\53\115\uffff\1\2\2\uffff\1\2",
            "\1\53\120\uffff\1\2",
            "\1\53\120\uffff\1\2",
            "\1\53\1\uffff\1\2",
            "\1\53\5\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "109:41: ( ESCAPE escape_expr= eq_subexpr )?";
        }
    }
    static final String DFA16_eotS =
        "\101\uffff";
    static final String DFA16_eofS =
        "\101\uffff";
    static final String DFA16_minS =
        "\3\37\76\uffff";
    static final String DFA16_maxS =
        "\3\u00b2\76\uffff";
    static final String DFA16_acceptS =
        "\3\uffff\1\2\35\uffff\1\1\37\uffff";
    static final String DFA16_specialS =
        "\101\uffff}>";
    static final String[] DFA16_transitionS = {
            "\3\2\2\uffff\2\2\5\uffff\3\2\6\uffff\3\2\25\uffff\1\2\1\1\10"+
            "\2\2\uffff\3\2\3\uffff\125\2",
            "\4\3\1\41\2\3\5\uffff\3\3\2\uffff\2\3\2\uffff\3\3\25\uffff"+
            "\12\3\2\uffff\3\3\3\uffff\125\3",
            "\4\3\1\41\2\3\5\uffff\3\3\2\uffff\2\3\2\uffff\3\3\25\uffff"+
            "\12\3\2\uffff\3\3\3\uffff\125\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "111:13: (database_name= id DOT )?";
        }
    }
    static final String DFA19_eotS =
        "\40\uffff";
    static final String DFA19_eofS =
        "\40\uffff";
    static final String DFA19_minS =
        "\1\37\37\uffff";
    static final String DFA19_maxS =
        "\1\u00b2\37\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\2\35\uffff\1\1";
    static final String DFA19_specialS =
        "\40\uffff}>";
    static final String[] DFA19_transitionS = {
            "\4\1\1\uffff\2\1\5\uffff\3\1\2\uffff\2\1\2\uffff\3\1\4\37\21"+
            "\uffff\12\1\2\uffff\3\1\3\uffff\125\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()+ loopback of 116:5: ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )+";
        }
    }
    static final String DFA21_eotS =
        "\51\uffff";
    static final String DFA21_eofS =
        "\51\uffff";
    static final String DFA21_minS =
        "\1\37\50\uffff";
    static final String DFA21_maxS =
        "\1\u00b2\50\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\2\46\uffff\1\1";
    static final String DFA21_specialS =
        "\51\uffff}>";
    static final String[] DFA21_transitionS = {
            "\4\1\1\uffff\3\1\4\uffff\4\1\1\uffff\17\1\4\50\11\uffff\12\1"+
            "\2\uffff\3\1\3\uffff\125\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 121:25: ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )*";
        }
    }
    static final String DFA22_eotS =
        "\52\uffff";
    static final String DFA22_eofS =
        "\52\uffff";
    static final String DFA22_minS =
        "\1\37\51\uffff";
    static final String DFA22_maxS =
        "\1\u00b2\51\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\2\47\uffff\1\1";
    static final String DFA22_specialS =
        "\52\uffff}>";
    static final String[] DFA22_transitionS = {
            "\4\1\1\uffff\3\1\4\uffff\4\1\1\uffff\23\1\4\51\5\uffff\12\1"+
            "\2\uffff\3\1\3\uffff\125\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 123:26: ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )*";
        }
    }
    static final String DFA23_eotS =
        "\53\uffff";
    static final String DFA23_eofS =
        "\53\uffff";
    static final String DFA23_minS =
        "\1\37\52\uffff";
    static final String DFA23_maxS =
        "\1\u00b2\52\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\2\50\uffff\1\1";
    static final String DFA23_specialS =
        "\53\uffff}>";
    static final String[] DFA23_transitionS = {
            "\4\1\1\uffff\3\1\2\52\2\uffff\4\1\1\uffff\27\1\5\uffff\12\1"+
            "\2\uffff\3\1\3\uffff\125\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 125:26: ( ( PLUS | MINUS ) add_subexpr )*";
        }
    }
    static final String DFA24_eotS =
        "\54\uffff";
    static final String DFA24_eofS =
        "\54\uffff";
    static final String DFA24_minS =
        "\1\37\53\uffff";
    static final String DFA24_maxS =
        "\1\u00b2\53\uffff";
    static final String DFA24_acceptS =
        "\1\uffff\1\2\51\uffff\1\1";
    static final String DFA24_specialS =
        "\54\uffff}>";
    static final String[] DFA24_transitionS = {
            "\4\1\1\uffff\5\1\2\uffff\4\1\1\uffff\27\1\3\53\2\uffff\12\1"+
            "\2\uffff\3\1\3\uffff\125\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 127:26: ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )*";
        }
    }
    static final String DFA25_eotS =
        "\55\uffff";
    static final String DFA25_eofS =
        "\55\uffff";
    static final String DFA25_minS =
        "\1\37\54\uffff";
    static final String DFA25_maxS =
        "\1\u00b2\54\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\2\52\uffff\1\1";
    static final String DFA25_specialS =
        "\55\uffff}>";
    static final String[] DFA25_transitionS = {
            "\4\1\1\uffff\5\1\2\uffff\4\1\1\uffff\32\1\1\54\1\uffff\12\1"+
            "\2\uffff\3\1\3\uffff\125\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 129:26: ( DOUBLE_PIPE con_subexpr )*";
        }
    }
    static final String DFA26_eotS =
        "\23\uffff";
    static final String DFA26_eofS =
        "\23\uffff";
    static final String DFA26_minS =
        "\1\37\22\uffff";
    static final String DFA26_maxS =
        "\1\u00b2\22\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\1\20\uffff\1\2";
    static final String DFA26_specialS =
        "\23\uffff}>";
    static final String[] DFA26_transitionS = {
            "\3\1\2\uffff\2\1\3\22\5\1\1\uffff\1\1\4\uffff\3\1\24\uffff\1"+
            "\22\147\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "131:1: con_subexpr : ( unary_subexpr | unary_op unary_subexpr -> ^( unary_op unary_subexpr ) );";
        }
    }
    static final String DFA27_eotS =
        "\72\uffff";
    static final String DFA27_eofS =
        "\72\uffff";
    static final String DFA27_minS =
        "\1\37\1\42\70\uffff";
    static final String DFA27_maxS =
        "\1\u00b2\1\167\70\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\2\53\uffff\1\1\13\uffff";
    static final String DFA27_specialS =
        "\72\uffff}>";
    static final String[] DFA27_transitionS = {
            "\4\2\1\uffff\5\2\2\uffff\4\2\1\uffff\33\2\1\uffff\1\1\11\2\2"+
            "\uffff\3\2\3\uffff\125\2",
            "\1\2\15\uffff\2\2\33\uffff\1\56\37\uffff\2\2\1\uffff\1\2\1"+
            "\uffff\2\2\1\uffff\3\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "135:26: ( COLLATE collation_name= ID )?";
        }
    }
    static final String DFA36_eotS =
        "\u0111\uffff";
    static final String DFA36_eofS =
        "\u0111\uffff";
    static final String DFA36_minS =
        "\1\37\4\uffff\4\37\3\uffff\1\37\1\43\1\uffff\1\37\1\43\u0100\uffff";
    static final String DFA36_maxS =
        "\1\u00b2\4\uffff\4\u00b2\3\uffff\1\u00b2\1\57\1\uffff\1\u00b2\1"+
        "\57\u0100\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\1\1\7\uffff\1\2\4\uffff\1\5\2\uffff\1\3\u00b8\uffff\1\4"+
        "\56\uffff\1\6\1\uffff\1\7\23\uffff\1\10\1\uffff";
    static final String DFA36_specialS =
        "\u0111\uffff}>";
    static final String[] DFA36_transitionS = {
            "\3\21\2\uffff\2\21\3\uffff\2\1\3\21\1\uffff\1\16\4\uffff\1\21"+
            "\1\5\1\21\25\uffff\1\21\1\14\1\21\1\15\1\21\1\17\4\21\2\1\1"+
            "\6\1\7\1\10\3\11\1\20\124\21",
            "",
            "",
            "",
            "",
            "\4\1\1\21\5\1\2\uffff\4\1\1\uffff\33\1\1\uffff\12\1\2\uffff"+
            "\3\1\3\uffff\125\1",
            "\4\1\1\21\5\1\2\uffff\4\1\1\uffff\33\1\1\uffff\12\1\2\uffff"+
            "\3\1\3\uffff\125\1",
            "\4\1\1\21\5\1\2\uffff\4\1\1\uffff\33\1\1\uffff\12\1\2\uffff"+
            "\3\1\3\uffff\125\1",
            "\4\1\1\21\5\1\2\uffff\4\1\1\uffff\33\1\1\uffff\12\1\2\uffff"+
            "\3\1\3\uffff\125\1",
            "",
            "",
            "",
            "\12\21\2\uffff\4\21\1\u00ca\33\21\1\uffff\12\21\2\uffff\3\21"+
            "\3\uffff\125\21",
            "\1\21\13\uffff\1\u00f9",
            "",
            "\3\u00fb\1\uffff\1\21\12\u00fb\1\uffff\1\u00fb\4\uffff\3\u00fb"+
            "\24\uffff\150\u00fb",
            "\1\21\13\uffff\1\u010f",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "137:1: atom_expr : ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) | name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN -> ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? ) | LPAREN expr RPAREN | CAST LPAREN expr AS type_name RPAREN | CASE (case_expr= expr )? ( when_expr )+ ( ELSE else_expr= expr )? END -> ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? ) | raise_function );";
        }
    }
    static final String DFA29_eotS =
        "\61\uffff";
    static final String DFA29_eofS =
        "\61\uffff";
    static final String DFA29_minS =
        "\2\37\57\uffff";
    static final String DFA29_maxS =
        "\2\u00b2\57\uffff";
    static final String DFA29_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\54\uffff";
    static final String DFA29_specialS =
        "\61\uffff}>";
    static final String[] DFA29_transitionS = {
            "\3\2\2\uffff\2\2\5\uffff\3\2\6\uffff\3\2\25\uffff\1\2\1\1\10"+
            "\2\2\uffff\3\2\3\uffff\125\2",
            "\4\4\1\2\5\4\2\uffff\4\4\1\uffff\33\4\1\uffff\12\4\2\uffff"+
            "\3\4\3\uffff\125\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "140:5: ( (database_name= id DOT )? table_name= id DOT )?";
        }
    }
    static final String DFA28_eotS =
        "\145\uffff";
    static final String DFA28_eofS =
        "\145\uffff";
    static final String DFA28_minS =
        "\1\37\2\43\3\37\1\uffff\1\37\135\uffff";
    static final String DFA28_maxS =
        "\1\u00b2\2\43\3\u00b2\1\uffff\1\u00b2\135\uffff";
    static final String DFA28_acceptS =
        "\6\uffff\1\1\3\uffff\1\2\132\uffff";
    static final String DFA28_specialS =
        "\145\uffff}>";
    static final String[] DFA28_transitionS = {
            "\3\2\2\uffff\2\2\5\uffff\3\2\6\uffff\3\2\25\uffff\1\2\1\1\10"+
            "\2\2\uffff\3\2\3\uffff\125\2",
            "\1\3",
            "\1\4",
            "\3\6\2\uffff\2\6\5\uffff\3\6\6\uffff\3\6\25\uffff\1\6\1\5\10"+
            "\6\2\uffff\3\6\3\uffff\125\6",
            "\3\6\2\uffff\2\6\5\uffff\3\6\6\uffff\3\6\25\uffff\1\6\1\7\10"+
            "\6\2\uffff\3\6\3\uffff\125\6",
            "\4\12\1\6\5\12\2\uffff\4\12\1\uffff\33\12\1\uffff\12\12\2\uffff"+
            "\3\12\3\uffff\125\12",
            "",
            "\4\12\1\6\5\12\2\uffff\4\12\1\uffff\33\12\1\uffff\12\12\2\uffff"+
            "\3\12\3\uffff\125\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "140:6: (database_name= id DOT )?";
        }
    }
    static final String DFA32_eotS =
        "\26\uffff";
    static final String DFA32_eofS =
        "\26\uffff";
    static final String DFA32_minS =
        "\1\37\25\uffff";
    static final String DFA32_maxS =
        "\1\u00b2\25\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\1\22\uffff\1\2\1\3";
    static final String DFA32_specialS =
        "\26\uffff}>";
    static final String[] DFA32_transitionS = {
            "\3\1\2\uffff\12\1\1\uffff\1\1\1\uffff\1\25\2\uffff\3\1\20\uffff"+
            "\1\24\3\uffff\150\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "141:20: ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )?";
        }
    }
    static final String DFA30_eotS =
        "\47\uffff";
    static final String DFA30_eofS =
        "\47\uffff";
    static final String DFA30_minS =
        "\2\37\45\uffff";
    static final String DFA30_maxS =
        "\2\u00b2\45\uffff";
    static final String DFA30_acceptS =
        "\2\uffff\1\2\22\uffff\1\1\21\uffff";
    static final String DFA30_specialS =
        "\47\uffff}>";
    static final String[] DFA30_transitionS = {
            "\3\2\2\uffff\12\2\1\uffff\1\2\4\uffff\3\2\24\uffff\3\2\1\1\144"+
            "\2",
            "\3\25\1\uffff\1\2\12\25\1\uffff\1\25\4\uffff\3\25\24\uffff"+
            "\150\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "141:21: ( DISTINCT )?";
        }
    }
    static final String DFA33_eotS =
        "\47\uffff";
    static final String DFA33_eofS =
        "\47\uffff";
    static final String DFA33_minS =
        "\1\37\20\uffff\1\37\25\uffff";
    static final String DFA33_maxS =
        "\1\u00b2\20\uffff\1\u00b2\25\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\23\uffff\1\2\21\uffff";
    static final String DFA33_specialS =
        "\47\uffff}>";
    static final String[] DFA33_transitionS = {
            "\3\1\2\uffff\12\1\1\uffff\1\1\4\uffff\3\1\24\uffff\11\1\1\21"+
            "\136\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\25\1\uffff\1\1\12\25\1\uffff\1\25\4\uffff\3\25\24\uffff"+
            "\150\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "146:10: (case_expr= expr )?";
        }
    }
    static final String DFA38_eotS =
        "\62\uffff";
    static final String DFA38_eofS =
        "\62\uffff";
    static final String DFA38_minS =
        "\1\133\1\37\60\uffff";
    static final String DFA38_maxS =
        "\1\135\1\u00b2\60\uffff";
    static final String DFA38_acceptS =
        "\2\uffff\1\3\1\4\1\2\1\1\54\uffff";
    static final String DFA38_specialS =
        "\62\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\1\1\2\1\3",
            "\4\5\1\uffff\5\5\1\4\1\uffff\4\5\1\uffff\33\5\1\uffff\12\5"+
            "\2\uffff\3\5\3\uffff\125\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "163:1: bind_parameter : ( QUESTION -> BIND | QUESTION position= INTEGER -> ^( BIND $position) | COLON name= id -> ^( BIND_NAME $name) | AT name= id -> ^( BIND_NAME $name) );";
        }
    }
    static final String DFA40_eotS =
        "\16\uffff";
    static final String DFA40_eofS =
        "\16\uffff";
    static final String DFA40_minS =
        "\1\42\15\uffff";
    static final String DFA40_maxS =
        "\1\u009f\15\uffff";
    static final String DFA40_acceptS =
        "\1\uffff\1\2\13\uffff\1\1";
    static final String DFA40_specialS =
        "\16\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\1\3\uffff\1\1\10\uffff\3\1\32\uffff\1\1\1\15\66\uffff\1\1"+
            "\23\uffff\2\1\2\uffff\2\1\1\uffff\1\1",
            "",
            "",
            "",
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
            return "()+ loopback of 174:17: (names+= ID )+";
        }
    }
    static final String DFA42_eotS =
        "\15\uffff";
    static final String DFA42_eofS =
        "\15\uffff";
    static final String DFA42_minS =
        "\1\42\14\uffff";
    static final String DFA42_maxS =
        "\1\u009f\14\uffff";
    static final String DFA42_acceptS =
        "\1\uffff\1\1\1\2\12\uffff";
    static final String DFA42_specialS =
        "\15\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\2\3\uffff\1\2\10\uffff\1\1\2\2\32\uffff\1\2\67\uffff\1\2"+
            "\23\uffff\2\2\2\uffff\2\2\1\uffff\1\2",
            "",
            "",
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
            return "174:23: ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )?";
        }
    }
    static final String DFA43_eotS =
        "\13\uffff";
    static final String DFA43_eofS =
        "\13\uffff";
    static final String DFA43_minS =
        "\1\37\2\42\10\uffff";
    static final String DFA43_maxS =
        "\1\u00b2\2\67\10\uffff";
    static final String DFA43_acceptS =
        "\3\uffff\1\1\1\2\6\uffff";
    static final String DFA43_specialS =
        "\13\uffff}>";
    static final String[] DFA43_transitionS = {
            "\3\2\2\uffff\2\2\5\uffff\3\2\6\uffff\3\2\25\uffff\1\2\1\1\10"+
            "\2\2\uffff\3\2\3\uffff\125\2",
            "\1\4\1\3\13\uffff\1\4\7\uffff\1\4",
            "\1\4\1\3\13\uffff\1\4\7\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "178:21: (database_name= id DOT )?";
        }
    }
    static final String DFA46_eotS =
        "\17\uffff";
    static final String DFA46_eofS =
        "\17\uffff";
    static final String DFA46_minS =
        "\2\37\3\uffff\1\37\3\uffff\1\37\5\uffff";
    static final String DFA46_maxS =
        "\2\u00b2\3\uffff\1\u00b2\3\uffff\1\u00b2\5\uffff";
    static final String DFA46_acceptS =
        "\2\uffff\1\2\3\uffff\1\1\10\uffff";
    static final String DFA46_specialS =
        "\17\uffff}>";
    static final String[] DFA46_transitionS = {
            "\3\2\2\uffff\2\2\5\uffff\3\2\6\uffff\3\2\25\uffff\13\2\1\uffff"+
            "\3\2\3\uffff\7\2\1\1\115\2",
            "\3\6\2\uffff\2\6\5\uffff\3\6\6\uffff\3\6\25\uffff\4\6\1\5\6"+
            "\6\1\uffff\3\6\3\uffff\125\6",
            "",
            "",
            "",
            "\3\2\2\uffff\2\2\5\uffff\3\2\6\uffff\3\2\25\uffff\4\2\1\11"+
            "\5\2\2\uffff\3\2\3\uffff\125\2",
            "",
            "",
            "",
            "\3\6\1\2\1\uffff\2\6\5\uffff\3\6\6\uffff\3\6\25\uffff\12\6"+
            "\2\uffff\3\6\3\uffff\125\6",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "183:21: ( DATABASE )?";
        }
    }
    static final String DFA51_eotS =
        "\14\uffff";
    static final String DFA51_eofS =
        "\14\uffff";
    static final String DFA51_minS =
        "\1\42\13\uffff";
    static final String DFA51_maxS =
        "\1\170\13\uffff";
    static final String DFA51_acceptS =
        "\1\uffff\1\1\1\2\1\3\10\uffff";
    static final String DFA51_specialS =
        "\14\uffff}>";
    static final String[] DFA51_transitionS = {
            "\1\3\15\uffff\2\3\71\uffff\1\1\1\2\2\3\1\uffff\1\3\1\uffff\2"+
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

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "203:82: ( ASC | DESC )?";
        }
    }
    static final String DFA63_eotS =
        "\76\uffff";
    static final String DFA63_eofS =
        "\76\uffff";
    static final String DFA63_minS =
        "\3\37\73\uffff";
    static final String DFA63_maxS =
        "\3\u00b2\73\uffff";
    static final String DFA63_acceptS =
        "\3\uffff\1\3\23\uffff\1\1\23\uffff\1\2\22\uffff";
    static final String DFA63_specialS =
        "\76\uffff}>";
    static final String[] DFA63_transitionS = {
            "\3\3\2\uffff\12\3\1\uffff\1\3\4\uffff\3\3\20\uffff\1\3\3\uffff"+
            "\3\3\1\2\42\3\1\1\101\3",
            "\3\27\1\uffff\1\3\12\27\1\uffff\1\27\4\uffff\3\27\20\uffff"+
            "\1\27\3\uffff\150\27",
            "\3\53\1\uffff\1\3\12\53\1\uffff\1\53\4\uffff\3\53\20\uffff"+
            "\1\53\3\uffff\150\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "224:10: ( ALL | DISTINCT )?";
        }
    }
    static final String DFA64_eotS =
        "\14\uffff";
    static final String DFA64_eofS =
        "\14\uffff";
    static final String DFA64_minS =
        "\1\42\13\uffff";
    static final String DFA64_maxS =
        "\1\167\13\uffff";
    static final String DFA64_acceptS =
        "\1\uffff\1\2\11\uffff\1\1";
    static final String DFA64_specialS =
        "\14\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\1\15\uffff\1\13\1\1\73\uffff\2\1\1\uffff\1\1\1\uffff\2\1"+
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
            return "()* loopback of 224:42: ( COMMA result_column )*";
        }
    }
    static final String DFA65_eotS =
        "\13\uffff";
    static final String DFA65_eofS =
        "\13\uffff";
    static final String DFA65_minS =
        "\1\42\12\uffff";
    static final String DFA65_maxS =
        "\1\167\12\uffff";
    static final String DFA65_acceptS =
        "\1\uffff\1\1\1\2\10\uffff";
    static final String DFA65_specialS =
        "\13\uffff}>";
    static final String[] DFA65_transitionS = {
            "\1\2\16\uffff\1\2\73\uffff\2\2\1\uffff\1\2\1\uffff\2\2\1\uffff"+
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
            return "224:65: ( FROM join_source )?";
        }
    }
    static final String DFA66_eotS =
        "\12\uffff";
    static final String DFA66_eofS =
        "\12\uffff";
    static final String DFA66_minS =
        "\1\42\11\uffff";
    static final String DFA66_maxS =
        "\1\167\11\uffff";
    static final String DFA66_acceptS =
        "\1\uffff\1\1\1\2\7\uffff";
    static final String DFA66_specialS =
        "\12\uffff}>";
    static final String[] DFA66_transitionS = {
            "\1\2\16\uffff\1\2\73\uffff\2\2\1\uffff\1\2\1\uffff\2\2\2\uffff"+
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
            return "224:85: ( WHERE where_expr= expr )?";
        }
    }
    static final String DFA67_eotS =
        "\12\uffff";
    static final String DFA67_eofS =
        "\12\uffff";
    static final String DFA67_minS =
        "\1\42\11\uffff";
    static final String DFA67_maxS =
        "\1\170\11\uffff";
    static final String DFA67_acceptS =
        "\1\uffff\1\2\7\uffff\1\1";
    static final String DFA67_specialS =
        "\12\uffff}>";
    static final String[] DFA67_transitionS = {
            "\1\1\15\uffff\1\11\1\1\73\uffff\2\1\1\uffff\1\1\1\uffff\2\1"+
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

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "()* loopback of 225:28: ( COMMA ordering_term )*";
        }
    }
    static final String DFA72_eotS =
        "\u00e4\uffff";
    static final String DFA72_eofS =
        "\u00e4\uffff";
    static final String DFA72_minS =
        "\1\37\1\uffff\2\37\4\uffff\3\37\1\43\4\uffff\1\37\2\43\2\uffff\1"+
        "\37\36\uffff\1\37\36\uffff\1\37\36\uffff\1\37\74\uffff\1\37\1\uffff"+
        "\2\37\24\uffff\2\37\33\uffff";
    static final String DFA72_maxS =
        "\1\u00b2\1\uffff\2\u00b2\4\uffff\3\u00b2\1\57\4\uffff\1\u00b2\1"+
        "\57\1\43\2\uffff\1\u00b2\36\uffff\1\u00b2\36\uffff\1\u00b2\36\uffff"+
        "\1\u00b2\74\uffff\1\u00b2\1\uffff\2\u00b2\24\uffff\2\u00b2\33\uffff";
    static final String DFA72_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\u00c4\uffff\1\2\32\uffff";
    static final String DFA72_specialS =
        "\u00e4\uffff}>";
    static final String[] DFA72_transitionS = {
            "\3\22\2\uffff\2\22\5\4\3\22\1\uffff\1\4\4\uffff\1\22\1\3\1\22"+
            "\20\uffff\1\1\3\uffff\1\4\1\22\1\2\1\22\1\13\1\22\1\20\4\22"+
            "\2\4\1\10\1\11\1\12\3\4\1\21\124\22",
            "",
            "\4\4\1\25\5\4\2\uffff\40\4\1\uffff\12\4\2\uffff\3\4\3\uffff"+
            "\125\4",
            "\4\4\1\64\5\4\2\uffff\4\4\1\uffff\33\4\1\uffff\12\4\2\uffff"+
            "\3\4\3\uffff\125\4",
            "",
            "",
            "",
            "",
            "\4\4\1\123\5\4\2\uffff\4\4\1\uffff\33\4\1\uffff\12\4\2\uffff"+
            "\3\4\3\uffff\125\4",
            "\4\4\1\162\5\4\2\uffff\4\4\1\uffff\33\4\1\uffff\12\4\2\uffff"+
            "\3\4\3\uffff\125\4",
            "\4\4\1\u00af\5\4\2\uffff\4\4\1\uffff\33\4\1\uffff\12\4\2\uffff"+
            "\3\4\3\uffff\125\4",
            "\1\u00b1\13\uffff\1\4",
            "",
            "",
            "",
            "",
            "\3\4\1\uffff\1\u00b2\12\4\1\uffff\1\4\4\uffff\3\4\24\uffff"+
            "\150\4",
            "\1\u00c7\13\uffff\1\4",
            "\1\u00c8",
            "",
            "",
            "\3\4\2\uffff\2\4\5\uffff\3\4\6\uffff\3\4\20\uffff\1\u00c9\4"+
            "\uffff\12\4\2\uffff\3\4\3\uffff\125\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\4\2\uffff\2\4\5\uffff\3\4\6\uffff\3\4\20\uffff\1\u00c9\4"+
            "\uffff\12\4\2\uffff\3\4\3\uffff\125\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\4\2\uffff\2\4\5\uffff\3\4\6\uffff\3\4\20\uffff\1\u00c9\4"+
            "\uffff\12\4\2\uffff\3\4\3\uffff\125\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\4\2\uffff\2\4\5\uffff\3\4\6\uffff\3\4\20\uffff\1\u00c9\4"+
            "\uffff\12\4\2\uffff\3\4\3\uffff\125\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\4\2\uffff\2\4\5\uffff\3\4\6\uffff\3\4\20\uffff\1\u00c9\4"+
            "\uffff\12\4\2\uffff\3\4\3\uffff\125\4",
            "",
            "\3\4\2\uffff\2\4\5\uffff\3\4\6\uffff\3\4\20\uffff\1\u00c9\4"+
            "\uffff\12\4\2\uffff\3\4\3\uffff\125\4",
            "\3\4\2\uffff\2\4\5\uffff\3\4\6\uffff\3\4\20\uffff\1\u00c9\4"+
            "\uffff\12\4\2\uffff\3\4\3\uffff\125\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\4\2\uffff\2\4\5\uffff\3\4\6\uffff\3\4\20\uffff\1\u00c9\4"+
            "\uffff\12\4\2\uffff\3\4\3\uffff\125\4",
            "\3\4\2\uffff\2\4\5\uffff\3\4\6\uffff\3\4\20\uffff\1\u00c9\4"+
            "\uffff\12\4\2\uffff\3\4\3\uffff\125\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "231:1: result_column : ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) );";
        }
    }
    static final String DFA71_eotS =
        "\u00cb\uffff";
    static final String DFA71_eofS =
        "\u00cb\uffff";
    static final String DFA71_minS =
        "\1\37\2\uffff\1\37\1\uffff\1\37\6\42\4\uffff\2\37\6\43\25\uffff"+
        "\1\37\2\uffff\1\37\6\43\u0094\uffff";
    static final String DFA71_maxS =
        "\1\u00b2\2\uffff\1\u00b2\1\uffff\1\u00b2\6\167\4\uffff\2\u00b2\1"+
        "\45\3\164\1\45\1\51\25\uffff\1\u00b2\2\uffff\1\u00b2\1\45\3\164"+
        "\1\45\1\51\u0094\uffff";
    static final String DFA71_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\u00c6\uffff";
    static final String DFA71_specialS =
        "\u00cb\uffff}>";
    static final String[] DFA71_transitionS = {
            "\3\1\1\4\1\uffff\2\1\5\uffff\3\1\2\uffff\2\4\2\uffff\3\1\25"+
            "\uffff\12\1\2\uffff\3\1\3\uffff\17\1\1\12\1\13\1\1\1\7\1\1\1"+
            "\10\1\11\1\1\1\3\1\5\1\6\73\1",
            "",
            "",
            "\3\4\1\1\1\uffff\2\4\5\uffff\3\4\1\uffff\1\4\2\1\2\uffff\3"+
            "\4\25\uffff\12\4\2\uffff\3\4\3\uffff\17\4\1\26\1\27\1\4\1\23"+
            "\1\4\1\24\1\25\1\4\1\20\1\21\1\22\73\4",
            "",
            "\3\4\1\1\1\uffff\12\4\1\uffff\1\4\2\1\2\uffff\3\4\24\uffff"+
            "\42\4\1\65\1\66\1\4\1\62\1\4\1\63\1\64\1\4\1\55\1\60\1\61\73"+
            "\4",
            "\1\1\2\uffff\1\4\12\uffff\2\1\73\uffff\2\1\1\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\3\1",
            "\1\1\15\uffff\2\1\73\uffff\2\1\1\uffff\1\1\1\4\2\1\1\4\3\1",
            "\1\1\15\uffff\2\1\73\uffff\2\1\1\uffff\1\1\1\uffff\2\1\1\4"+
            "\3\1",
            "\1\1\15\uffff\2\1\73\uffff\2\1\1\uffff\1\1\1\uffff\2\1\1\4"+
            "\3\1",
            "\1\1\2\uffff\1\4\12\uffff\2\1\73\uffff\2\1\1\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\3\1",
            "\1\1\6\uffff\1\4\6\uffff\2\1\73\uffff\2\1\1\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\3\1",
            "",
            "",
            "",
            "",
            "\3\1\1\uffff\1\4\2\1\5\uffff\3\1\1\uffff\1\1\4\uffff\3\1\25"+
            "\uffff\12\1\2\uffff\3\1\3\uffff\125\1",
            "\3\1\1\uffff\1\4\12\1\1\uffff\1\1\4\uffff\3\1\24\uffff\150"+
            "\1",
            "\1\4\1\uffff\1\1",
            "\1\4\115\uffff\1\1\2\uffff\1\1",
            "\1\4\120\uffff\1\1",
            "\1\4\120\uffff\1\1",
            "\1\4\1\uffff\1\1",
            "\1\4\5\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\1\1\uffff\1\4\2\1\5\uffff\3\1\1\uffff\1\1\4\uffff\3\1\25"+
            "\uffff\12\1\2\uffff\3\1\3\uffff\125\1",
            "",
            "",
            "\3\1\1\uffff\1\4\12\1\1\uffff\1\1\4\uffff\3\1\24\uffff\150"+
            "\1",
            "\1\4\1\uffff\1\1",
            "\1\4\115\uffff\1\1\2\uffff\1\1",
            "\1\4\120\uffff\1\1",
            "\1\4\120\uffff\1\1",
            "\1\4\1\uffff\1\1",
            "\1\4\5\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "234:10: ( ( AS )? column_alias= id )?";
        }
    }
    static final String DFA70_eotS =
        "\u00cd\uffff";
    static final String DFA70_eofS =
        "\u00cd\uffff";
    static final String DFA70_minS =
        "\2\37\3\uffff\1\37\1\uffff\1\37\6\42\4\uffff\2\37\6\43\25\uffff"+
        "\1\37\2\uffff\1\37\6\43\u0094\uffff";
    static final String DFA70_maxS =
        "\2\u00b2\3\uffff\1\u00b2\1\uffff\1\u00b2\6\167\4\uffff\2\u00b2\1"+
        "\45\3\164\1\45\1\51\25\uffff\1\u00b2\2\uffff\1\u00b2\1\45\3\164"+
        "\1\45\1\51\u0094\uffff";
    static final String DFA70_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\u00c8\uffff";
    static final String DFA70_specialS =
        "\u00cd\uffff}>";
    static final String[] DFA70_transitionS = {
            "\3\2\2\uffff\2\2\5\uffff\3\2\6\uffff\3\2\25\uffff\4\2\1\1\5"+
            "\2\2\uffff\3\2\3\uffff\125\2",
            "\3\4\1\2\1\uffff\2\4\5\uffff\3\4\2\uffff\2\2\2\uffff\3\4\25"+
            "\uffff\12\4\2\uffff\3\4\3\uffff\17\4\1\14\1\15\1\4\1\11\1\4"+
            "\1\12\1\13\1\4\1\5\1\7\1\10\73\4",
            "",
            "",
            "",
            "\3\2\1\4\1\uffff\2\2\5\uffff\3\2\1\uffff\1\2\2\4\2\uffff\3"+
            "\2\25\uffff\12\2\2\uffff\3\2\3\uffff\17\2\1\30\1\31\1\2\1\25"+
            "\1\2\1\26\1\27\1\2\1\22\1\23\1\24\73\2",
            "",
            "\3\2\1\4\1\uffff\12\2\1\uffff\1\2\2\4\2\uffff\3\2\24\uffff"+
            "\42\2\1\67\1\70\1\2\1\64\1\2\1\65\1\66\1\2\1\57\1\62\1\63\73"+
            "\2",
            "\1\4\2\uffff\1\2\12\uffff\2\4\73\uffff\2\4\1\uffff\1\4\1\uffff"+
            "\2\4\1\uffff\3\4",
            "\1\4\15\uffff\2\4\73\uffff\2\4\1\uffff\1\4\1\2\2\4\1\2\3\4",
            "\1\4\15\uffff\2\4\73\uffff\2\4\1\uffff\1\4\1\uffff\2\4\1\2"+
            "\3\4",
            "\1\4\15\uffff\2\4\73\uffff\2\4\1\uffff\1\4\1\uffff\2\4\1\2"+
            "\3\4",
            "\1\4\2\uffff\1\2\12\uffff\2\4\73\uffff\2\4\1\uffff\1\4\1\uffff"+
            "\2\4\1\uffff\3\4",
            "\1\4\6\uffff\1\2\6\uffff\2\4\73\uffff\2\4\1\uffff\1\4\1\uffff"+
            "\2\4\1\uffff\3\4",
            "",
            "",
            "",
            "",
            "\3\4\1\uffff\1\2\2\4\5\uffff\3\4\1\uffff\1\4\4\uffff\3\4\25"+
            "\uffff\12\4\2\uffff\3\4\3\uffff\125\4",
            "\3\4\1\uffff\1\2\12\4\1\uffff\1\4\4\uffff\3\4\24\uffff\150"+
            "\4",
            "\1\2\1\uffff\1\4",
            "\1\2\115\uffff\1\4\2\uffff\1\4",
            "\1\2\120\uffff\1\4",
            "\1\2\120\uffff\1\4",
            "\1\2\1\uffff\1\4",
            "\1\2\5\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\4\1\uffff\1\2\2\4\5\uffff\3\4\1\uffff\1\4\4\uffff\3\4\25"+
            "\uffff\12\4\2\uffff\3\4\3\uffff\125\4",
            "",
            "",
            "\3\4\1\uffff\1\2\12\4\1\uffff\1\4\4\uffff\3\4\24\uffff\150"+
            "\4",
            "\1\2\1\uffff\1\4",
            "\1\2\115\uffff\1\4\2\uffff\1\4",
            "\1\2\120\uffff\1\4",
            "\1\2\120\uffff\1\4",
            "\1\2\1\uffff\1\4",
            "\1\2\5\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "234:11: ( AS )?";
        }
    }
    static final String DFA74_eotS =
        "\21\uffff";
    static final String DFA74_eofS =
        "\21\uffff";
    static final String DFA74_minS =
        "\1\42\20\uffff";
    static final String DFA74_maxS =
        "\1\176\20\uffff";
    static final String DFA74_acceptS =
        "\1\uffff\1\2\10\uffff\1\1\6\uffff";
    static final String DFA74_specialS =
        "\21\uffff}>";
    static final String[] DFA74_transitionS = {
            "\1\1\15\uffff\1\12\1\1\73\uffff\2\1\1\uffff\1\1\1\uffff\2\1"+
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
            return "()* loopback of 236:28: ( join_op single_source ( join_constraint )? )*";
        }
    }
    static final String DFA73_eotS =
        "\23\uffff";
    static final String DFA73_eofS =
        "\23\uffff";
    static final String DFA73_minS =
        "\1\42\22\uffff";
    static final String DFA73_maxS =
        "\1\u0080\22\uffff";
    static final String DFA73_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\17\uffff";
    static final String DFA73_specialS =
        "\23\uffff}>";
    static final String[] DFA73_transitionS = {
            "\1\3\15\uffff\2\3\73\uffff\2\3\1\uffff\1\3\1\uffff\2\3\2\uffff"+
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
            return "236:52: ( join_constraint )?";
        }
    }
    static final String DFA81_eotS =
        "\36\uffff";
    static final String DFA81_eofS =
        "\36\uffff";
    static final String DFA81_minS =
        "\1\37\2\uffff\1\37\1\uffff\1\37\30\uffff";
    static final String DFA81_maxS =
        "\1\u00b2\2\uffff\1\u00b2\1\uffff\1\u00b2\30\uffff";
    static final String DFA81_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\3\uffff\1\2\25\uffff";
    static final String DFA81_specialS =
        "\36\uffff}>";
    static final String[] DFA81_transitionS = {
            "\3\1\2\uffff\2\1\5\uffff\3\1\1\uffff\1\3\4\uffff\3\1\25\uffff"+
            "\12\1\2\uffff\3\1\3\uffff\125\1",
            "",
            "",
            "\3\4\2\uffff\2\4\5\uffff\3\4\1\uffff\1\4\4\uffff\3\4\25\uffff"+
            "\12\4\2\uffff\3\4\3\uffff\26\4\1\5\76\4",
            "",
            "\3\10\1\uffff\1\4\12\10\1\uffff\1\10\4\uffff\3\10\20\uffff"+
            "\1\10\3\uffff\150\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA81_eot = DFA.unpackEncodedString(DFA81_eotS);
    static final short[] DFA81_eof = DFA.unpackEncodedString(DFA81_eofS);
    static final char[] DFA81_min = DFA.unpackEncodedStringToUnsignedChars(DFA81_minS);
    static final char[] DFA81_max = DFA.unpackEncodedStringToUnsignedChars(DFA81_maxS);
    static final short[] DFA81_accept = DFA.unpackEncodedString(DFA81_acceptS);
    static final short[] DFA81_special = DFA.unpackEncodedString(DFA81_specialS);
    static final short[][] DFA81_transition;

    static {
        int numStates = DFA81_transitionS.length;
        DFA81_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA81_transition[i] = DFA.unpackEncodedString(DFA81_transitionS[i]);
        }
    }

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = DFA81_eot;
            this.eof = DFA81_eof;
            this.min = DFA81_min;
            this.max = DFA81_max;
            this.accept = DFA81_accept;
            this.special = DFA81_special;
            this.transition = DFA81_transition;
        }
        public String getDescription() {
            return "238:1: single_source : ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN );";
        }
    }
    static final String DFA75_eotS =
        "\32\uffff";
    static final String DFA75_eofS =
        "\32\uffff";
    static final String DFA75_minS =
        "\1\37\1\42\30\uffff";
    static final String DFA75_maxS =
        "\1\u00b2\1\u0080\30\uffff";
    static final String DFA75_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\25\uffff";
    static final String DFA75_specialS =
        "\32\uffff}>";
    static final String[] DFA75_transitionS = {
            "\3\2\2\uffff\2\2\5\uffff\3\2\6\uffff\3\2\25\uffff\1\2\1\1\10"+
            "\2\2\uffff\3\2\3\uffff\125\2",
            "\1\4\1\2\1\4\1\uffff\1\4\11\uffff\2\4\33\uffff\1\4\2\uffff"+
            "\1\4\34\uffff\2\4\1\uffff\1\4\1\uffff\2\4\2\uffff\2\4\1\uffff"+
            "\10\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "239:5: (database_name= id DOT )?";
        }
    }
    static final String DFA77_eotS =
        "\27\uffff";
    static final String DFA77_eofS =
        "\27\uffff";
    static final String DFA77_minS =
        "\1\42\26\uffff";
    static final String DFA77_maxS =
        "\1\u0080\26\uffff";
    static final String DFA77_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\23\uffff";
    static final String DFA77_specialS =
        "\27\uffff}>";
    static final String[] DFA77_transitionS = {
            "\1\3\1\uffff\1\3\1\uffff\1\3\11\uffff\2\3\33\uffff\1\1\2\uffff"+
            "\1\1\34\uffff\2\3\1\uffff\1\3\1\uffff\2\3\2\uffff\2\3\1\uffff"+
            "\10\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "239:43: ( ( AS )? table_alias= ID )?";
        }
    }
    static final String DFA78_eotS =
        "\25\uffff";
    static final String DFA78_eofS =
        "\25\uffff";
    static final String DFA78_minS =
        "\1\42\24\uffff";
    static final String DFA78_maxS =
        "\1\u0080\24\uffff";
    static final String DFA78_acceptS =
        "\1\uffff\1\1\1\2\1\3\21\uffff";
    static final String DFA78_specialS =
        "\25\uffff}>";
    static final String[] DFA78_transitionS = {
            "\1\3\1\uffff\1\1\1\uffff\1\2\11\uffff\2\3\73\uffff\2\3\1\uffff"+
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
            return "239:67: ( INDEXED BY index_name= id | NOT INDEXED )?";
        }
    }
    static final String DFA80_eotS =
        "\25\uffff";
    static final String DFA80_eofS =
        "\25\uffff";
    static final String DFA80_minS =
        "\1\42\24\uffff";
    static final String DFA80_maxS =
        "\1\u0080\24\uffff";
    static final String DFA80_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\21\uffff";
    static final String DFA80_specialS =
        "\25\uffff}>";
    static final String[] DFA80_transitionS = {
            "\1\3\15\uffff\2\3\33\uffff\1\1\2\uffff\1\1\34\uffff\2\3\1\uffff"+
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
            return "241:31: ( ( AS )? table_alias= ID )?";
        }
    }
    static final String DFA91_eotS =
        "\15\uffff";
    static final String DFA91_eofS =
        "\15\uffff";
    static final String DFA91_minS =
        "\1\37\2\43\12\uffff";
    static final String DFA91_maxS =
        "\1\u00b2\2\u0084\12\uffff";
    static final String DFA91_acceptS =
        "\3\uffff\1\2\3\uffff\1\1\5\uffff";
    static final String DFA91_specialS =
        "\15\uffff}>";
    static final String[] DFA91_transitionS = {
            "\3\2\2\uffff\2\2\5\uffff\3\2\6\uffff\3\2\25\uffff\1\2\1\1\10"+
            "\2\2\uffff\3\2\3\uffff\125\2",
            "\1\7\13\uffff\1\3\104\uffff\1\3\16\uffff\2\3",
            "\1\7\13\uffff\1\3\104\uffff\1\3\16\uffff\2\3",
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

    static final short[] DFA91_eot = DFA.unpackEncodedString(DFA91_eotS);
    static final short[] DFA91_eof = DFA.unpackEncodedString(DFA91_eofS);
    static final char[] DFA91_min = DFA.unpackEncodedStringToUnsignedChars(DFA91_minS);
    static final char[] DFA91_max = DFA.unpackEncodedStringToUnsignedChars(DFA91_maxS);
    static final short[] DFA91_accept = DFA.unpackEncodedString(DFA91_acceptS);
    static final short[] DFA91_special = DFA.unpackEncodedString(DFA91_specialS);
    static final short[][] DFA91_transition;

    static {
        int numStates = DFA91_transitionS.length;
        DFA91_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA91_transition[i] = DFA.unpackEncodedString(DFA91_transitionS[i]);
        }
    }

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = DFA91_eot;
            this.eof = DFA91_eof;
            this.min = DFA91_min;
            this.max = DFA91_max;
            this.accept = DFA91_accept;
            this.special = DFA91_special;
            this.transition = DFA91_transition;
        }
        public String getDescription() {
            return "254:67: (database_name= id DOT )?";
        }
    }
    static final String DFA116_eotS =
        "\72\uffff";
    static final String DFA116_eofS =
        "\72\uffff";
    static final String DFA116_minS =
        "\1\60\1\37\2\uffff\1\46\1\uffff\3\46\61\uffff";
    static final String DFA116_maxS =
        "\1\61\1\u00b2\2\uffff\1\u009f\1\uffff\3\u009f\61\uffff";
    static final String DFA116_acceptS =
        "\2\uffff\1\2\1\1\66\uffff";
    static final String DFA116_specialS =
        "\72\uffff}>";
    static final String[] DFA116_transitionS = {
            "\1\1\1\2",
            "\3\3\2\uffff\3\3\4\uffff\4\3\3\uffff\5\3\4\uffff\4\3\15\uffff"+
            "\12\3\2\uffff\3\3\3\uffff\72\3\1\2\1\4\2\3\1\6\1\7\1\10\11\3"+
            "\1\uffff\12\3",
            "",
            "",
            "\1\3\11\uffff\2\3\32\uffff\2\3\66\uffff\1\3\23\uffff\2\3\1"+
            "\2\1\uffff\2\3\1\uffff\1\3",
            "",
            "\1\3\10\uffff\1\2\2\3\32\uffff\2\3\66\uffff\1\3\23\uffff\2"+
            "\3\2\uffff\2\3\1\uffff\1\3",
            "\1\3\10\uffff\1\2\2\3\32\uffff\2\3\66\uffff\1\3\23\uffff\2"+
            "\3\2\uffff\2\3\1\uffff\1\3",
            "\1\3\11\uffff\2\3\32\uffff\2\3\66\uffff\1\3\23\uffff\2\3\1"+
            "\2\1\uffff\2\3\1\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA116_eot = DFA.unpackEncodedString(DFA116_eotS);
    static final short[] DFA116_eof = DFA.unpackEncodedString(DFA116_eofS);
    static final char[] DFA116_min = DFA.unpackEncodedStringToUnsignedChars(DFA116_minS);
    static final char[] DFA116_max = DFA.unpackEncodedStringToUnsignedChars(DFA116_maxS);
    static final short[] DFA116_accept = DFA.unpackEncodedString(DFA116_acceptS);
    static final short[] DFA116_special = DFA.unpackEncodedString(DFA116_specialS);
    static final short[][] DFA116_transition;

    static {
        int numStates = DFA116_transitionS.length;
        DFA116_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA116_transition[i] = DFA.unpackEncodedString(DFA116_transitionS[i]);
        }
    }

    class DFA116 extends DFA {

        public DFA116(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 116;
            this.eot = DFA116_eot;
            this.eof = DFA116_eof;
            this.min = DFA116_min;
            this.max = DFA116_max;
            this.accept = DFA116_accept;
            this.special = DFA116_special;
            this.transition = DFA116_transition;
        }
        public String getDescription() {
            return "()* loopback of 297:23: ( COMMA column_def )*";
        }
    }
    static final String DFA119_eotS =
        "\15\uffff";
    static final String DFA119_eofS =
        "\15\uffff";
    static final String DFA119_minS =
        "\1\42\14\uffff";
    static final String DFA119_maxS =
        "\1\u009f\14\uffff";
    static final String DFA119_acceptS =
        "\1\uffff\1\1\1\2\12\uffff";
    static final String DFA119_specialS =
        "\15\uffff}>";
    static final String[] DFA119_transitionS = {
            "\1\2\3\uffff\1\2\11\uffff\2\2\32\uffff\1\2\1\1\66\uffff\1\2"+
            "\23\uffff\2\2\2\uffff\2\2\1\uffff\1\2",
            "",
            "",
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
            return "302:32: ( type_name )?";
        }
    }
    static final String DFA120_eotS =
        "\14\uffff";
    static final String DFA120_eofS =
        "\14\uffff";
    static final String DFA120_minS =
        "\1\42\13\uffff";
    static final String DFA120_maxS =
        "\1\u009f\13\uffff";
    static final String DFA120_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\7\uffff";
    static final String DFA120_specialS =
        "\14\uffff}>";
    static final String[] DFA120_transitionS = {
            "\1\1\3\uffff\1\4\11\uffff\2\1\32\uffff\1\4\67\uffff\1\4\23\uffff"+
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

    static final short[] DFA120_eot = DFA.unpackEncodedString(DFA120_eotS);
    static final short[] DFA120_eof = DFA.unpackEncodedString(DFA120_eofS);
    static final char[] DFA120_min = DFA.unpackEncodedStringToUnsignedChars(DFA120_minS);
    static final char[] DFA120_max = DFA.unpackEncodedStringToUnsignedChars(DFA120_maxS);
    static final short[] DFA120_accept = DFA.unpackEncodedString(DFA120_acceptS);
    static final short[] DFA120_special = DFA.unpackEncodedString(DFA120_specialS);
    static final short[][] DFA120_transition;

    static {
        int numStates = DFA120_transitionS.length;
        DFA120_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA120_transition[i] = DFA.unpackEncodedString(DFA120_transitionS[i]);
        }
    }

    class DFA120 extends DFA {

        public DFA120(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 120;
            this.eot = DFA120_eot;
            this.eof = DFA120_eof;
            this.min = DFA120_min;
            this.max = DFA120_max;
            this.accept = DFA120_accept;
            this.special = DFA120_special;
            this.transition = DFA120_transition;
        }
        public String getDescription() {
            return "()* loopback of 302:43: ( column_constraint )*";
        }
    }
    static final String DFA123_eotS =
        "\17\uffff";
    static final String DFA123_eofS =
        "\17\uffff";
    static final String DFA123_minS =
        "\1\42\16\uffff";
    static final String DFA123_maxS =
        "\1\u009f\16\uffff";
    static final String DFA123_acceptS =
        "\1\uffff\1\1\1\2\14\uffff";
    static final String DFA123_specialS =
        "\17\uffff}>";
    static final String[] DFA123_transitionS = {
            "\1\2\3\uffff\1\2\11\uffff\2\2\32\uffff\1\2\36\uffff\2\1\22\uffff"+
            "\1\2\4\uffff\1\2\23\uffff\2\2\1\uffff\3\2\1\uffff\1\2",
            "",
            "",
            "",
            "",
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
            return "323:37: ( ASC | DESC )?";
        }
    }
    static final String DFA124_eotS =
        "\16\uffff";
    static final String DFA124_eofS =
        "\16\uffff";
    static final String DFA124_minS =
        "\1\42\15\uffff";
    static final String DFA124_maxS =
        "\1\u009f\15\uffff";
    static final String DFA124_acceptS =
        "\1\uffff\1\1\1\2\13\uffff";
    static final String DFA124_specialS =
        "\16\uffff}>";
    static final String[] DFA124_transitionS = {
            "\1\2\3\uffff\1\2\11\uffff\2\2\32\uffff\1\2\62\uffff\1\1\4\uffff"+
            "\1\2\23\uffff\2\2\1\uffff\3\2\1\uffff\1\2",
            "",
            "",
            "",
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
            return "323:51: ( table_conflict_clause )?";
        }
    }
    static final String DFA125_eotS =
        "\15\uffff";
    static final String DFA125_eofS =
        "\15\uffff";
    static final String DFA125_minS =
        "\1\42\14\uffff";
    static final String DFA125_maxS =
        "\1\u009f\14\uffff";
    static final String DFA125_acceptS =
        "\1\uffff\1\1\1\2\12\uffff";
    static final String DFA125_specialS =
        "\15\uffff}>";
    static final String[] DFA125_transitionS = {
            "\1\2\3\uffff\1\2\11\uffff\2\2\32\uffff\1\2\67\uffff\1\2\23\uffff"+
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
            return "323:74: ( AUTOINCREMENT )?";
        }
    }
    static final String DFA126_eotS =
        "\15\uffff";
    static final String DFA126_eofS =
        "\15\uffff";
    static final String DFA126_minS =
        "\1\42\14\uffff";
    static final String DFA126_maxS =
        "\1\u009f\14\uffff";
    static final String DFA126_acceptS =
        "\1\uffff\1\1\1\2\12\uffff";
    static final String DFA126_specialS =
        "\15\uffff}>";
    static final String[] DFA126_transitionS = {
            "\1\2\3\uffff\1\2\11\uffff\2\2\32\uffff\1\2\62\uffff\1\1\4\uffff"+
            "\1\2\23\uffff\2\2\2\uffff\2\2\1\uffff\1\2",
            "",
            "",
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
            return "325:38: ( table_conflict_clause )?";
        }
    }
    static final String DFA127_eotS =
        "\15\uffff";
    static final String DFA127_eofS =
        "\15\uffff";
    static final String DFA127_minS =
        "\1\42\14\uffff";
    static final String DFA127_maxS =
        "\1\u009f\14\uffff";
    static final String DFA127_acceptS =
        "\1\uffff\1\1\1\2\12\uffff";
    static final String DFA127_specialS =
        "\15\uffff}>";
    static final String[] DFA127_transitionS = {
            "\1\2\3\uffff\1\2\11\uffff\2\2\32\uffff\1\2\62\uffff\1\1\4\uffff"+
            "\1\2\23\uffff\2\2\2\uffff\2\2\1\uffff\1\2",
            "",
            "",
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

    static final short[] DFA127_eot = DFA.unpackEncodedString(DFA127_eotS);
    static final short[] DFA127_eof = DFA.unpackEncodedString(DFA127_eofS);
    static final char[] DFA127_min = DFA.unpackEncodedStringToUnsignedChars(DFA127_minS);
    static final char[] DFA127_max = DFA.unpackEncodedStringToUnsignedChars(DFA127_maxS);
    static final short[] DFA127_accept = DFA.unpackEncodedString(DFA127_acceptS);
    static final short[] DFA127_special = DFA.unpackEncodedString(DFA127_specialS);
    static final short[][] DFA127_transition;

    static {
        int numStates = DFA127_transitionS.length;
        DFA127_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA127_transition[i] = DFA.unpackEncodedString(DFA127_transitionS[i]);
        }
    }

    class DFA127 extends DFA {

        public DFA127(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 127;
            this.eot = DFA127_eot;
            this.eof = DFA127_eof;
            this.min = DFA127_min;
            this.max = DFA127_max;
            this.accept = DFA127_accept;
            this.special = DFA127_special;
            this.transition = DFA127_transition;
        }
        public String getDescription() {
            return "327:35: ( table_conflict_clause )?";
        }
    }
    static final String DFA128_eotS =
        "\13\uffff";
    static final String DFA128_eofS =
        "\13\uffff";
    static final String DFA128_minS =
        "\1\47\12\uffff";
    static final String DFA128_maxS =
        "\1\132\12\uffff";
    static final String DFA128_acceptS =
        "\1\uffff\1\1\1\2\7\uffff\1\3";
    static final String DFA128_specialS =
        "\13\uffff}>";
    static final String[] DFA128_transitionS = {
            "\2\1\2\2\4\uffff\1\12\5\uffff\1\2\40\uffff\5\2",
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

    static final short[] DFA128_eot = DFA.unpackEncodedString(DFA128_eotS);
    static final short[] DFA128_eof = DFA.unpackEncodedString(DFA128_eofS);
    static final char[] DFA128_min = DFA.unpackEncodedStringToUnsignedChars(DFA128_minS);
    static final char[] DFA128_max = DFA.unpackEncodedStringToUnsignedChars(DFA128_maxS);
    static final short[] DFA128_accept = DFA.unpackEncodedString(DFA128_acceptS);
    static final short[] DFA128_special = DFA.unpackEncodedString(DFA128_specialS);
    static final short[][] DFA128_transition;

    static {
        int numStates = DFA128_transitionS.length;
        DFA128_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA128_transition[i] = DFA.unpackEncodedString(DFA128_transitionS[i]);
        }
    }

    class DFA128 extends DFA {

        public DFA128(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 128;
            this.eot = DFA128_eot;
            this.eof = DFA128_eof;
            this.min = DFA128_min;
            this.max = DFA128_max;
            this.accept = DFA128_accept;
            this.special = DFA128_special;
            this.transition = DFA128_transition;
        }
        public String getDescription() {
            return "332:37: ( ( PLUS | MINUS ) ( INTEGER | FLOAT ) | literal_value | LPAREN expr RPAREN )";
        }
    }
    static final String DFA138_eotS =
        "\17\uffff";
    static final String DFA138_eofS =
        "\17\uffff";
    static final String DFA138_minS =
        "\1\42\16\uffff";
    static final String DFA138_maxS =
        "\1\u00a2\16\uffff";
    static final String DFA138_acceptS =
        "\1\uffff\1\2\13\uffff\1\1\1\uffff";
    static final String DFA138_specialS =
        "\17\uffff}>";
    static final String[] DFA138_transitionS = {
            "\1\1\3\uffff\1\1\11\uffff\2\1\14\uffff\1\15\15\uffff\1\1\62"+
            "\uffff\1\15\4\uffff\1\1\23\uffff\2\1\2\uffff\2\1\1\uffff\1\1"+
            "\2\uffff\1\1",
            "",
            "",
            "",
            "",
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
            return "()+ loopback of 362:3: ( fk_clause_action )+";
        }
    }
    static final String DFA139_eotS =
        "\17\uffff";
    static final String DFA139_eofS =
        "\17\uffff";
    static final String DFA139_minS =
        "\1\42\1\65\15\uffff";
    static final String DFA139_maxS =
        "\2\u00a2\15\uffff";
    static final String DFA139_acceptS =
        "\2\uffff\1\1\1\2\13\uffff";
    static final String DFA139_specialS =
        "\17\uffff}>";
    static final String[] DFA139_transitionS = {
            "\1\3\3\uffff\1\1\11\uffff\2\3\32\uffff\1\3\67\uffff\1\3\23\uffff"+
            "\2\3\2\uffff\2\3\1\uffff\1\3\2\uffff\1\2",
            "\1\3\154\uffff\1\2",
            "",
            "",
            "",
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

    static final short[] DFA139_eot = DFA.unpackEncodedString(DFA139_eotS);
    static final short[] DFA139_eof = DFA.unpackEncodedString(DFA139_eofS);
    static final char[] DFA139_min = DFA.unpackEncodedStringToUnsignedChars(DFA139_minS);
    static final char[] DFA139_max = DFA.unpackEncodedStringToUnsignedChars(DFA139_maxS);
    static final short[] DFA139_accept = DFA.unpackEncodedString(DFA139_acceptS);
    static final short[] DFA139_special = DFA.unpackEncodedString(DFA139_specialS);
    static final short[][] DFA139_transition;

    static {
        int numStates = DFA139_transitionS.length;
        DFA139_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA139_transition[i] = DFA.unpackEncodedString(DFA139_transitionS[i]);
        }
    }

    class DFA139 extends DFA {

        public DFA139(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 139;
            this.eot = DFA139_eot;
            this.eof = DFA139_eof;
            this.min = DFA139_min;
            this.max = DFA139_max;
            this.accept = DFA139_accept;
            this.special = DFA139_special;
            this.transition = DFA139_transition;
        }
        public String getDescription() {
            return "362:21: ( fk_clause_deferrable )?";
        }
    }
    static final String DFA143_eotS =
        "\17\uffff";
    static final String DFA143_eofS =
        "\17\uffff";
    static final String DFA143_minS =
        "\1\42\1\u0089\15\uffff";
    static final String DFA143_maxS =
        "\1\u00a3\1\u008a\15\uffff";
    static final String DFA143_acceptS =
        "\2\uffff\1\3\12\uffff\1\1\1\2";
    static final String DFA143_specialS =
        "\17\uffff}>";
    static final String[] DFA143_transitionS = {
            "\1\2\3\uffff\1\2\11\uffff\2\2\32\uffff\1\2\67\uffff\1\2\23\uffff"+
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

    static final short[] DFA143_eot = DFA.unpackEncodedString(DFA143_eotS);
    static final short[] DFA143_eof = DFA.unpackEncodedString(DFA143_eofS);
    static final char[] DFA143_min = DFA.unpackEncodedStringToUnsignedChars(DFA143_minS);
    static final char[] DFA143_max = DFA.unpackEncodedStringToUnsignedChars(DFA143_maxS);
    static final short[] DFA143_accept = DFA.unpackEncodedString(DFA143_acceptS);
    static final short[] DFA143_special = DFA.unpackEncodedString(DFA143_specialS);
    static final short[][] DFA143_transition;

    static {
        int numStates = DFA143_transitionS.length;
        DFA143_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA143_transition[i] = DFA.unpackEncodedString(DFA143_transitionS[i]);
        }
    }

    class DFA143 extends DFA {

        public DFA143(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 143;
            this.eot = DFA143_eot;
            this.eof = DFA143_eof;
            this.min = DFA143_min;
            this.max = DFA143_max;
            this.accept = DFA143_accept;
            this.special = DFA143_special;
            this.transition = DFA143_transition;
        }
        public String getDescription() {
            return "369:42: ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?";
        }
    }
    static final String DFA163_eotS =
        "\14\uffff";
    static final String DFA163_eofS =
        "\14\uffff";
    static final String DFA163_minS =
        "\1\37\1\43\12\uffff";
    static final String DFA163_maxS =
        "\1\u00b2\1\u00ae\12\uffff";
    static final String DFA163_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\7\uffff";
    static final String DFA163_specialS =
        "\14\uffff}>";
    static final String[] DFA163_transitionS = {
            "\3\2\2\uffff\2\2\5\uffff\3\2\6\uffff\3\2\25\uffff\12\2\2\uffff"+
            "\3\2\3\uffff\70\2\1\1\34\2",
            "\1\2\2\uffff\1\4\132\uffff\1\2\3\uffff\1\2\1\uffff\1\2\44\uffff"+
            "\3\2",
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
            return "397:48: ( IF NOT EXISTS )?";
        }
    }
    static final String DFA164_eotS =
        "\21\uffff";
    static final String DFA164_eofS =
        "\21\uffff";
    static final String DFA164_minS =
        "\1\37\2\43\16\uffff";
    static final String DFA164_maxS =
        "\1\u00b2\2\u00ae\16\uffff";
    static final String DFA164_acceptS =
        "\3\uffff\1\2\5\uffff\1\1\7\uffff";
    static final String DFA164_specialS =
        "\21\uffff}>";
    static final String[] DFA164_transitionS = {
            "\3\2\2\uffff\2\2\5\uffff\3\2\6\uffff\3\2\25\uffff\1\2\1\1\10"+
            "\2\2\uffff\3\2\3\uffff\125\2",
            "\1\11\135\uffff\1\3\3\uffff\1\3\1\uffff\1\3\44\uffff\3\3",
            "\1\11\135\uffff\1\3\3\uffff\1\3\1\uffff\1\3\44\uffff\3\3",
            "",
            "",
            "",
            "",
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

    static final short[] DFA164_eot = DFA.unpackEncodedString(DFA164_eotS);
    static final short[] DFA164_eof = DFA.unpackEncodedString(DFA164_eofS);
    static final char[] DFA164_min = DFA.unpackEncodedStringToUnsignedChars(DFA164_minS);
    static final char[] DFA164_max = DFA.unpackEncodedStringToUnsignedChars(DFA164_maxS);
    static final short[] DFA164_accept = DFA.unpackEncodedString(DFA164_acceptS);
    static final short[] DFA164_special = DFA.unpackEncodedString(DFA164_specialS);
    static final short[][] DFA164_transition;

    static {
        int numStates = DFA164_transitionS.length;
        DFA164_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA164_transition[i] = DFA.unpackEncodedString(DFA164_transitionS[i]);
        }
    }

    class DFA164 extends DFA {

        public DFA164(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 164;
            this.eot = DFA164_eot;
            this.eof = DFA164_eof;
            this.min = DFA164_min;
            this.max = DFA164_max;
            this.accept = DFA164_accept;
            this.special = DFA164_special;
            this.transition = DFA164_transition;
        }
        public String getDescription() {
            return "397:65: (database_name= id DOT )?";
        }
    }
 

    public static final BitSet FOLLOW_sql_stmt_in_sql_stmt_list180 = new BitSet(new long[]{0x0000000080000002L,0x001007D900080000L,0x000000300005A1A2L});
    public static final BitSet FOLLOW_EXPLAIN_in_sql_stmt190 = new BitSet(new long[]{0x0000000580000000L,0x001007D900080000L,0x000000300005A1A2L});
    public static final BitSet FOLLOW_QUERY_in_sql_stmt193 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_PLAN_in_sql_stmt195 = new BitSet(new long[]{0x0000000480000000L,0x001007D900080000L,0x000000300005A1A2L});
    public static final BitSet FOLLOW_sql_stmt_core_in_sql_stmt201 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_SEMI_in_sql_stmt203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_stmt_in_sql_stmt_core214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attach_stmt_in_sql_stmt_core220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_detach_stmt_in_sql_stmt_core226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_analyze_stmt_in_sql_stmt_core232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reindex_stmt_in_sql_stmt_core238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vacuum_stmt_in_sql_stmt_core244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_sql_stmt_core253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_stmt_in_sql_stmt_core259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_stmt_in_sql_stmt_core265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_stmt_in_sql_stmt_core271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_stmt_in_sql_stmt_core277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commit_stmt_in_sql_stmt_core283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rollback_stmt_in_sql_stmt_core289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_savepoint_stmt_in_sql_stmt_core295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_release_stmt_in_sql_stmt_core301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_virtual_table_stmt_in_sql_stmt_core310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_table_stmt_in_sql_stmt_core316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_table_stmt_in_sql_stmt_core322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alter_table_stmt_in_sql_stmt_core328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_view_stmt_in_sql_stmt_core334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_view_stmt_in_sql_stmt_core340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_index_stmt_in_sql_stmt_core346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_index_stmt_in_sql_stmt_core352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_trigger_stmt_in_sql_stmt_core358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_trigger_stmt_in_sql_stmt_core364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_qualified_table_name377 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_qualified_table_name379 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_qualified_table_name385 = new BitSet(new long[]{0x0000005000000002L});
    public static final BitSet FOLLOW_INDEXED_in_qualified_table_name388 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_BY_in_qualified_table_name390 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_qualified_table_name394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_qualified_table_name398 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INDEXED_in_qualified_table_name400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_signed_number409 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_set_in_signed_number418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_subexpr_in_expr431 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_OR_in_expr434 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_or_subexpr_in_expr437 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_and_subexpr_in_or_subexpr446 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_AND_in_or_subexpr449 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_and_subexpr_in_or_subexpr452 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr461 = new BitSet(new long[]{0x7FDC404000000002L});
    public static final BitSet FOLLOW_cond_expr_in_and_subexpr463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr475 = new BitSet(new long[]{0x7800004000000000L});
    public static final BitSet FOLLOW_match_op_in_cond_expr478 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr482 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ESCAPE_in_cond_expr485 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr517 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IN_in_cond_expr520 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LPAREN_in_cond_expr522 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_cond_expr524 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_COMMA_in_cond_expr527 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_cond_expr529 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_cond_expr533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr555 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IN_in_cond_expr558 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_cond_expr563 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_cond_expr565 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_cond_expr571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISNULL_in_cond_expr602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTNULL_in_cond_expr610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_cond_expr618 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_NULL_in_cond_expr620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr628 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_NULL_in_cond_expr630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_cond_expr638 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NOT_in_cond_expr640 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_NULL_in_cond_expr642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr653 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_BETWEEN_in_cond_expr656 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr660 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_AND_in_cond_expr662 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_cond_expr692 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr709 = new BitSet(new long[]{0x0780000000000002L});
    public static final BitSet FOLLOW_set_in_match_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_neq_subexpr_in_eq_subexpr742 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000007L});
    public static final BitSet FOLLOW_set_in_eq_subexpr745 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_neq_subexpr_in_eq_subexpr762 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000007L});
    public static final BitSet FOLLOW_bit_subexpr_in_neq_subexpr771 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000078L});
    public static final BitSet FOLLOW_set_in_neq_subexpr774 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_bit_subexpr_in_neq_subexpr791 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000078L});
    public static final BitSet FOLLOW_add_subexpr_in_bit_subexpr800 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_set_in_bit_subexpr803 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_add_subexpr_in_bit_subexpr812 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_mul_subexpr_in_add_subexpr821 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000380L});
    public static final BitSet FOLLOW_set_in_add_subexpr824 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_mul_subexpr_in_add_subexpr837 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000380L});
    public static final BitSet FOLLOW_con_subexpr_in_mul_subexpr846 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_DOUBLE_PIPE_in_mul_subexpr849 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_con_subexpr_in_mul_subexpr852 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_unary_subexpr_in_con_subexpr861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_op_in_con_subexpr865 = new BitSet(new long[]{0x0070BE3380000000L,0xFFFFFFFFFFFFF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_unary_subexpr_in_con_subexpr867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unary_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_expr_in_unary_subexpr901 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_COLLATE_in_unary_subexpr904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_unary_subexpr909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_value_in_atom_expr921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bind_parameter_in_atom_expr927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_atom_expr937 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_atom_expr939 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_atom_expr945 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_atom_expr947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_atom_expr953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom_expr982 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr984 = new BitSet(new long[]{0x0072BFF380000000L,0xFFFFFFFFFFFFF880L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_DISTINCT_in_atom_expr987 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr992 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_COMMA_in_atom_expr995 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr999 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_ASTERISK_in_atom_expr1005 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr1034 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr1037 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_atom_expr1046 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr1049 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr1052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_AS_in_atom_expr1054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_type_name_in_atom_expr1057 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_atom_expr1068 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr1073 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_when_expr_in_atom_expr1077 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ELSE_in_atom_expr1081 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr1085 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_END_in_atom_expr1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raise_function_in_atom_expr1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHEN_in_when_expr1122 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_when_expr1126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_THEN_in_when_expr1128 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_when_expr1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_literal_value1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal_value1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal_value1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOB_in_literal_value1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal_value1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_TIME_in_literal_value1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_DATE_in_literal_value1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_TIMESTAMP_in_literal_value1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bind_parameter1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bind_parameter1275 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_INTEGER_in_bind_parameter1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_bind_parameter1294 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_bind_parameter1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_bind_parameter1313 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_bind_parameter1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAISE_in_raise_function1338 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LPAREN_in_raise_function1341 = new BitSet(new long[]{0x0000000000000000L,0x0000000780000000L});
    public static final BitSet FOLLOW_IGNORE_in_raise_function1345 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_set_in_raise_function1349 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_COMMA_in_raise_function1361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_STRING_in_raise_function1366 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_raise_function1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_name1379 = new BitSet(new long[]{0x0000800000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_LPAREN_in_type_name1383 = new BitSet(new long[]{0x0000078000000000L});
    public static final BitSet FOLLOW_signed_number_in_type_name1387 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_COMMA_in_type_name1390 = new BitSet(new long[]{0x0000078000000000L});
    public static final BitSet FOLLOW_signed_number_in_type_name1394 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_type_name1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_in_pragma_stmt1430 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_pragma_stmt1435 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_pragma_stmt1437 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_pragma_stmt1443 = new BitSet(new long[]{0x0080800000000002L});
    public static final BitSet FOLLOW_EQUALS_in_pragma_stmt1446 = new BitSet(new long[]{0x00703FB380000000L,0xFFFFFFFFC77FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_pragma_value_in_pragma_stmt1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_pragma_stmt1452 = new BitSet(new long[]{0x00703FB380000000L,0xFFFFFFFFC77FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_pragma_value_in_pragma_stmt1454 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_pragma_stmt1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signed_number_in_pragma_value1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_pragma_value1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_pragma_value1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTACH_in_attach_stmt1483 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC77FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_DATABASE_in_attach_stmt1486 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC77FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_STRING_in_attach_stmt1493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_id_in_attach_stmt1497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_AS_in_attach_stmt1500 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_attach_stmt1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DETACH_in_detach_stmt1512 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_DATABASE_in_detach_stmt1515 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_detach_stmt1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANALYZE_in_analyze_stmt1529 = new BitSet(new long[]{0x0070383380000002L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_analyze_stmt1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_analyze_stmt1540 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_analyze_stmt1542 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_analyze_stmt1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REINDEX_in_reindex_stmt1556 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_reindex_stmt1561 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_reindex_stmt1563 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_reindex_stmt1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VACUUM_in_vacuum_stmt1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_operation_conflict_clause1588 = new BitSet(new long[]{0x0000000000000000L,0x0000040780000000L});
    public static final BitSet FOLLOW_set_in_operation_conflict_clause1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_ordering_term1615 = new BitSet(new long[]{0x0000000000000002L,0x0000180000000000L});
    public static final BitSet FOLLOW_ASC_in_ordering_term1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_ordering_term1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_operation_limited_clause1654 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_BY_in_operation_limited_clause1656 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_operation_limited_clause1658 = new BitSet(new long[]{0x0001000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_COMMA_in_operation_limited_clause1661 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_operation_limited_clause1663 = new BitSet(new long[]{0x0001000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LIMIT_in_operation_limited_clause1671 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_INTEGER_in_operation_limited_clause1675 = new BitSet(new long[]{0x0001000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_set_in_operation_limited_clause1678 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_INTEGER_in_operation_limited_clause1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_list_in_select_stmt1698 = new BitSet(new long[]{0x0000000000000002L,0x0000600000000000L});
    public static final BitSet FOLLOW_ORDER_in_select_stmt1703 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_BY_in_select_stmt1705 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt1707 = new BitSet(new long[]{0x0001000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt1710 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt1712 = new BitSet(new long[]{0x0001000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_LIMIT_in_select_stmt1721 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt1725 = new BitSet(new long[]{0x0001000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_OFFSET_in_select_stmt1729 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt1733 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_core_in_select_list1783 = new BitSet(new long[]{0x0000000000000002L,0x000D000000000000L});
    public static final BitSet FOLLOW_select_op_in_select_list1786 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_select_core_in_select_list1789 = new BitSet(new long[]{0x0000000000000002L,0x000D000000000000L});
    public static final BitSet FOLLOW_UNION_in_select_op1798 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_ALL_in_select_op1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERSECT_in_select_op1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCEPT_in_select_op1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_core1821 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF880L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ALL_in_select_core1824 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF880L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_DISTINCT_in_select_core1828 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF880L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_result_column_in_select_core1832 = new BitSet(new long[]{0x0001000000000002L,0x00E0000000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_core1835 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF880L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_result_column_in_select_core1837 = new BitSet(new long[]{0x0001000000000002L,0x00E0000000000000L});
    public static final BitSet FOLLOW_FROM_in_select_core1842 = new BitSet(new long[]{0x0070B83380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_join_source_in_select_core1844 = new BitSet(new long[]{0x0000000000000002L,0x00C0000000000000L});
    public static final BitSet FOLLOW_WHERE_in_select_core1849 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_select_core1853 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_GROUP_in_select_core1861 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_BY_in_select_core1863 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_select_core1865 = new BitSet(new long[]{0x0001000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_core1868 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_select_core1870 = new BitSet(new long[]{0x0001000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_HAVING_in_select_core1875 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_select_core1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_result_column1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_result_column1957 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_result_column1959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ASTERISK_in_result_column1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_result_column1976 = new BitSet(new long[]{0x0070383380000002L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_AS_in_result_column1980 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_result_column1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_source_in_join_source2007 = new BitSet(new long[]{0x0001000000000002L,0x7E00000000000000L});
    public static final BitSet FOLLOW_join_op_in_join_source2010 = new BitSet(new long[]{0x0070B83380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_single_source_in_join_source2013 = new BitSet(new long[]{0x0001000000000002L,0xFE00000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_join_constraint_in_join_source2016 = new BitSet(new long[]{0x0001000000000002L,0x7E00000000000000L});
    public static final BitSet FOLLOW_id_in_single_source2033 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_single_source2035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_single_source2041 = new BitSet(new long[]{0x0000005000000002L,0x0000000000012000L});
    public static final BitSet FOLLOW_AS_in_single_source2045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_single_source2051 = new BitSet(new long[]{0x0000005000000002L});
    public static final BitSet FOLLOW_INDEXED_in_single_source2056 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_BY_in_single_source2058 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_single_source2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_single_source2066 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INDEXED_in_single_source2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_single_source2109 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_select_stmt_in_single_source2111 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_single_source2113 = new BitSet(new long[]{0x0000000000000002L,0x0000000000012000L});
    public static final BitSet FOLLOW_AS_in_single_source2117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_single_source2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_single_source2145 = new BitSet(new long[]{0x0070B83380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_join_source_in_single_source2148 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_single_source2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_join_op2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATURAL_in_join_op2168 = new BitSet(new long[]{0x0000000000000000L,0x7C00000000000000L});
    public static final BitSet FOLLOW_LEFT_in_join_op2174 = new BitSet(new long[]{0x0000000000000000L,0x4800000000000000L});
    public static final BitSet FOLLOW_OUTER_in_join_op2179 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_INNER_in_join_op2185 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_CROSS_in_join_op2189 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_JOIN_in_join_op2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_join_constraint2203 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_join_constraint2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_join_constraint2212 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LPAREN_in_join_constraint2214 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_join_constraint2218 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_COMMA_in_join_constraint2221 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_join_constraint2225 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_join_constraint2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_stmt2248 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_operation_conflict_clause_in_insert_stmt2251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_REPLACE_in_insert_stmt2257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_INTO_in_insert_stmt2260 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_insert_stmt2265 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_insert_stmt2267 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_insert_stmt2273 = new BitSet(new long[]{0x0000800000000000L,0x0010000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt2280 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_insert_stmt2284 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt2287 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_insert_stmt2291 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt2295 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt2304 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt2306 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_insert_stmt2310 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt2313 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_insert_stmt2317 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_insert_stmt2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_insert_stmt2332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update_stmt2344 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_operation_conflict_clause_in_update_stmt2347 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_qualified_table_name_in_update_stmt2351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SET_in_update_stmt2355 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_update_set_in_update_stmt2359 = new BitSet(new long[]{0x0001000000000002L,0x0040600000000000L});
    public static final BitSet FOLLOW_COMMA_in_update_stmt2362 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_update_set_in_update_stmt2366 = new BitSet(new long[]{0x0001000000000002L,0x0040600000000000L});
    public static final BitSet FOLLOW_WHERE_in_update_stmt2371 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_update_stmt2373 = new BitSet(new long[]{0x0000000000000002L,0x0000600000000000L});
    public static final BitSet FOLLOW_operation_limited_clause_in_update_stmt2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_update_set2389 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_EQUALS_in_update_set2391 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_update_set2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_stmt2401 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_FROM_in_delete_stmt2403 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_qualified_table_name_in_delete_stmt2405 = new BitSet(new long[]{0x0000000000000002L,0x0040600000000000L});
    public static final BitSet FOLLOW_WHERE_in_delete_stmt2408 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_delete_stmt2410 = new BitSet(new long[]{0x0000000000000002L,0x0000600000000000L});
    public static final BitSet FOLLOW_operation_limited_clause_in_delete_stmt2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_begin_stmt2425 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001E00L});
    public static final BitSet FOLLOW_set_in_begin_stmt2427 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TRANSACTION_in_begin_stmt2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_commit_stmt2451 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TRANSACTION_in_commit_stmt2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROLLBACK_in_rollback_stmt2470 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_TRANSACTION_in_rollback_stmt2473 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_TO_in_rollback_stmt2478 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_SAVEPOINT_in_rollback_stmt2481 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_rollback_stmt2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVEPOINT_in_savepoint_stmt2497 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_savepoint_stmt2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELEASE_in_release_stmt2509 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_SAVEPOINT_in_release_stmt2512 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_release_stmt2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_table_conflict_clause2530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_CONFLICT_in_table_conflict_clause2533 = new BitSet(new long[]{0x0000000000000000L,0x0000040780000000L});
    public static final BitSet FOLLOW_set_in_table_conflict_clause2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_virtual_table_stmt2563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_VIRTUAL_in_create_virtual_table_stmt2565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_TABLE_in_create_virtual_table_stmt2567 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2572 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_create_virtual_table_stmt2574 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_USING_in_create_virtual_table_stmt2584 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2588 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_LPAREN_in_create_virtual_table_stmt2591 = new BitSet(new long[]{0x787C787380000000L,0xFFFFFFFFC73FF000L,0x0007FEFFFEFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_virtual_table_stmt2593 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_COMMA_in_create_virtual_table_stmt2596 = new BitSet(new long[]{0x787C787380000000L,0xFFFFFFFFC73FF000L,0x0007FEFFFEFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_virtual_table_stmt2598 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_virtual_table_stmt2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_table_stmt2612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_table_stmt2614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_TABLE_in_create_table_stmt2617 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_create_table_stmt2620 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NOT_in_create_table_stmt2622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_EXISTS_in_create_table_stmt2624 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_table_stmt2631 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_create_table_stmt2633 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_table_stmt2639 = new BitSet(new long[]{0x0000800000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_LPAREN_in_create_table_stmt2645 = new BitSet(new long[]{0x787C787380000000L,0xFFFFFFFFC73FF000L,0x0007FEFFFEFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_table_stmt2647 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_COMMA_in_create_table_stmt2650 = new BitSet(new long[]{0x787C787380000000L,0xFFFFFFFFC73FF000L,0x0007FEFFFEFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_table_stmt2652 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_COMMA_in_create_table_stmt2657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000073000000L});
    public static final BitSet FOLLOW_table_constraint_in_create_table_stmt2659 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_table_stmt2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_create_table_stmt2669 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_select_stmt_in_create_table_stmt2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_column_def_in_column_def2727 = new BitSet(new long[]{0x0000004000000002L,0x0000000000003000L,0x00000000B3000010L});
    public static final BitSet FOLLOW_type_name_in_column_def2729 = new BitSet(new long[]{0x0000004000000002L,0x0000000000001000L,0x00000000B3000010L});
    public static final BitSet FOLLOW_column_constraint_in_column_def2732 = new BitSet(new long[]{0x0000004000000002L,0x0000000000001000L,0x00000000B3000010L});
    public static final BitSet FOLLOW_CONSTRAINT_in_column_constraint2758 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_column_constraint2762 = new BitSet(new long[]{0x0000004000000000L,0x0000000000001000L,0x00000000B3000010L});
    public static final BitSet FOLLOW_column_constraint_pk_in_column_constraint2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_not_null_in_column_constraint2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_unique_in_column_constraint2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_check_in_column_constraint2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_default_in_column_constraint2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_collate_in_column_constraint2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fk_clause_in_column_constraint2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_in_column_constraint_pk2861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_KEY_in_column_constraint_pk2864 = new BitSet(new long[]{0x0000000000000002L,0x8000180000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_set_in_column_constraint_pk2867 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_pk2876 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_AUTOINCREMENT_in_column_constraint_pk2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_column_constraint_not_null2889 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_NULL_in_column_constraint_not_null2891 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_not_null2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_column_constraint_unique2910 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_unique2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECK_in_column_constraint_check2921 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LPAREN_in_column_constraint_check2924 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_column_constraint_check2927 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_column_constraint_check2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_column_constraint_default2938 = new BitSet(new long[]{0x0020878000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_set_in_column_constraint_default2942 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_set_in_column_constraint_default2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_value_in_column_constraint_default2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_column_constraint_default2964 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_column_constraint_default2967 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_column_constraint_default2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLATE_in_column_constraint_collate2978 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_column_constraint_collate2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRAINT_in_table_constraint2992 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint2996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000073000000L});
    public static final BitSet FOLLOW_table_constraint_pk_in_table_constraint3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_unique_in_table_constraint3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_check_in_table_constraint3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_fk_in_table_constraint3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_in_table_constraint_pk3062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_KEY_in_table_constraint_pk3064 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_pk3068 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_pk3072 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_pk3075 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_pk3079 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_pk3083 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_table_conflict_clause_in_table_constraint_pk3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_table_constraint_unique3110 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_unique3114 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_unique3118 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_unique3121 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_unique3125 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_unique3129 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_table_conflict_clause_in_table_constraint_unique3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECK_in_table_constraint_check3156 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_check3159 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_table_constraint_check3162 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_check3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREIGN_in_table_constraint_fk3172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_KEY_in_table_constraint_fk3174 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_fk3176 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_fk3180 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_fk3183 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_fk3187 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_fk3191 = new BitSet(new long[]{0x0000004000000000L,0x0000000000001000L,0x00000000B3000010L});
    public static final BitSet FOLLOW_fk_clause_in_table_constraint_fk3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCES_in_fk_clause3216 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_fk_clause3220 = new BitSet(new long[]{0x4000800000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_fk_clause3223 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_fk_clause3227 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_COMMA_in_fk_clause3230 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_fk_clause3234 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_fk_clause3238 = new BitSet(new long[]{0x4000800000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_fk_clause_action_in_fk_clause3244 = new BitSet(new long[]{0x4000804000000002L,0x8000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_fk_clause_deferrable_in_fk_clause3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_fk_clause_action3281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000A2L});
    public static final BitSet FOLLOW_set_in_fk_clause_action3284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000300000040L});
    public static final BitSet FOLLOW_SET_in_fk_clause_action3297 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_NULL_in_fk_clause_action3300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_fk_clause_action3304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_DEFAULT_in_fk_clause_action3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASCADE_in_fk_clause_action3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESTRICT_in_fk_clause_action3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCH_in_fk_clause_action3322 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_fk_clause_action3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_fk_clause_deferrable3333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_DEFERRABLE_in_fk_clause_deferrable3337 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_INITIALLY_in_fk_clause_deferrable3341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_DEFERRED_in_fk_clause_deferrable3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITIALLY_in_fk_clause_deferrable3348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_IMMEDIATE_in_fk_clause_deferrable3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_table_stmt3361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_TABLE_in_drop_table_stmt3363 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_drop_table_stmt3366 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_table_stmt3368 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_table_stmt3375 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_drop_table_stmt3377 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_table_stmt3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALTER_in_alter_table_stmt3413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_TABLE_in_alter_table_stmt3415 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3420 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_alter_table_stmt3422 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000C000000000L});
    public static final BitSet FOLLOW_RENAME_in_alter_table_stmt3431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_TO_in_alter_table_stmt3433 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_alter_table_stmt3441 = new BitSet(new long[]{0x787C787380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFEFFFFFFL});
    public static final BitSet FOLLOW_COLUMN_in_alter_table_stmt3444 = new BitSet(new long[]{0x787C787380000000L,0xFFFFFFFFC73FF000L,0x0007FEFFFEFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_alter_table_stmt3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_view_stmt3457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000200000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_view_stmt3459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_VIEW_in_create_view_stmt3462 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_create_view_stmt3465 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NOT_in_create_view_stmt3467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_EXISTS_in_create_view_stmt3469 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_view_stmt3476 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_create_view_stmt3478 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_view_stmt3484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_AS_in_create_view_stmt3486 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_select_stmt_in_create_view_stmt3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_view_stmt3496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_VIEW_in_drop_view_stmt3498 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_drop_view_stmt3501 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_view_stmt3503 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_view_stmt3510 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_drop_view_stmt3512 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_view_stmt3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_index_stmt3526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040010000000L});
    public static final BitSet FOLLOW_UNIQUE_in_create_index_stmt3529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_INDEX_in_create_index_stmt3533 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_create_index_stmt3536 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NOT_in_create_index_stmt3538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_EXISTS_in_create_index_stmt3540 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3547 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_create_index_stmt3549 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3555 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_ON_in_create_index_stmt3559 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3563 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LPAREN_in_create_index_stmt3565 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_indexed_column_in_create_index_stmt3569 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_COMMA_in_create_index_stmt3572 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_indexed_column_in_create_index_stmt3576 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_index_stmt3580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_indexed_column3626 = new BitSet(new long[]{0x0000000000000002L,0x0000180000001000L});
    public static final BitSet FOLLOW_COLLATE_in_indexed_column3629 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_indexed_column3633 = new BitSet(new long[]{0x0000000000000002L,0x0000180000000000L});
    public static final BitSet FOLLOW_ASC_in_indexed_column3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_indexed_column3642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_index_stmt3673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_INDEX_in_drop_index_stmt3675 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_drop_index_stmt3678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_index_stmt3680 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_index_stmt3687 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_drop_index_stmt3689 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_index_stmt3695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_trigger_stmt3725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000200000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_trigger_stmt3727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_TRIGGER_in_create_trigger_stmt3730 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_create_trigger_stmt3733 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NOT_in_create_trigger_stmt3735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_EXISTS_in_create_trigger_stmt3737 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3744 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_create_trigger_stmt3746 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00007000000000A2L});
    public static final BitSet FOLLOW_BEFORE_in_create_trigger_stmt3757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000A2L});
    public static final BitSet FOLLOW_AFTER_in_create_trigger_stmt3761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000A2L});
    public static final BitSet FOLLOW_INSTEAD_in_create_trigger_stmt3765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_OF_in_create_trigger_stmt3767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000A2L});
    public static final BitSet FOLLOW_DELETE_in_create_trigger_stmt3772 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_INSERT_in_create_trigger_stmt3776 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_UPDATE_in_create_trigger_stmt3780 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_OF_in_create_trigger_stmt3783 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3787 = new BitSet(new long[]{0x0001000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_create_trigger_stmt3790 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3794 = new BitSet(new long[]{0x0001000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_ON_in_create_trigger_stmt3803 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L,0x0001000000000100L});
    public static final BitSet FOLLOW_FOR_in_create_trigger_stmt3810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_EACH_in_create_trigger_stmt3812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_ROW_in_create_trigger_stmt3814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L,0x0000000000000100L});
    public static final BitSet FOLLOW_WHEN_in_create_trigger_stmt3819 = new BitSet(new long[]{0x0070BFF380000000L,0xFFFFFFFFFFFFF800L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_create_trigger_stmt3821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BEGIN_in_create_trigger_stmt3827 = new BitSet(new long[]{0x0000000000000000L,0x0010040000000000L,0x00000000000000A2L});
    public static final BitSet FOLLOW_update_stmt_in_create_trigger_stmt3831 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_insert_stmt_in_create_trigger_stmt3835 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_delete_stmt_in_create_trigger_stmt3839 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_select_stmt_in_create_trigger_stmt3843 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_SEMI_in_create_trigger_stmt3846 = new BitSet(new long[]{0x0000000000000000L,0x0010040000080000L,0x00000000000000A2L});
    public static final BitSet FOLLOW_END_in_create_trigger_stmt3850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_trigger_stmt3858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_TRIGGER_in_drop_trigger_stmt3860 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_drop_trigger_stmt3863 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_trigger_stmt3865 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_trigger_stmt3872 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_drop_trigger_stmt3874 = new BitSet(new long[]{0x0070383380000000L,0xFFFFFFFFC73FF000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_trigger_stmt3880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_id3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword3901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_column_def4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_column_def_in_id_column_def4572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword_column_def4579 = new BitSet(new long[]{0x0000000000000002L});

}