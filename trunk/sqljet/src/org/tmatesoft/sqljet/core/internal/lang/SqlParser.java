// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 SqlParser.g 2009-06-18 15:48:09

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
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // SqlParser.g:61:17: sql_stmt
            	    {
            	    pushFollow(FOLLOW_sql_stmt_in_sql_stmt_list181);
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
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // SqlParser.g:63:12: EXPLAIN ( QUERY PLAN )?
                    {
                    EXPLAIN2=(Token)match(input,EXPLAIN,FOLLOW_EXPLAIN_in_sql_stmt191); 
                    EXPLAIN2_tree = (Object)adaptor.create(EXPLAIN2);
                    adaptor.addChild(root_0, EXPLAIN2_tree);

                    // SqlParser.g:63:20: ( QUERY PLAN )?
                    int alt2=2;
                    alt2 = dfa2.predict(input);
                    switch (alt2) {
                        case 1 :
                            // SqlParser.g:63:21: QUERY PLAN
                            {
                            QUERY3=(Token)match(input,QUERY,FOLLOW_QUERY_in_sql_stmt194); 
                            QUERY3_tree = (Object)adaptor.create(QUERY3);
                            adaptor.addChild(root_0, QUERY3_tree);

                            PLAN4=(Token)match(input,PLAN,FOLLOW_PLAN_in_sql_stmt196); 
                            PLAN4_tree = (Object)adaptor.create(PLAN4);
                            adaptor.addChild(root_0, PLAN4_tree);


                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_sql_stmt_core_in_sql_stmt202);
            sql_stmt_core5=sql_stmt_core();

            state._fsp--;

            adaptor.addChild(root_0, sql_stmt_core5.getTree());
            SEMI6=(Token)match(input,SEMI,FOLLOW_SEMI_in_sql_stmt204); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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

                    pushFollow(FOLLOW_pragma_stmt_in_sql_stmt_core215);
                    pragma_stmt7=pragma_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_stmt7.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:67:5: attach_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_attach_stmt_in_sql_stmt_core221);
                    attach_stmt8=attach_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, attach_stmt8.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:68:5: detach_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_detach_stmt_in_sql_stmt_core227);
                    detach_stmt9=detach_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, detach_stmt9.getTree());

                    }
                    break;
                case 4 :
                    // SqlParser.g:69:5: analyze_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_analyze_stmt_in_sql_stmt_core233);
                    analyze_stmt10=analyze_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, analyze_stmt10.getTree());

                    }
                    break;
                case 5 :
                    // SqlParser.g:70:5: reindex_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_reindex_stmt_in_sql_stmt_core239);
                    reindex_stmt11=reindex_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, reindex_stmt11.getTree());

                    }
                    break;
                case 6 :
                    // SqlParser.g:71:5: vacuum_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_vacuum_stmt_in_sql_stmt_core245);
                    vacuum_stmt12=vacuum_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, vacuum_stmt12.getTree());

                    }
                    break;
                case 7 :
                    // SqlParser.g:73:5: select_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_select_stmt_in_sql_stmt_core254);
                    select_stmt13=select_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, select_stmt13.getTree());

                    }
                    break;
                case 8 :
                    // SqlParser.g:74:5: insert_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_insert_stmt_in_sql_stmt_core260);
                    insert_stmt14=insert_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, insert_stmt14.getTree());

                    }
                    break;
                case 9 :
                    // SqlParser.g:75:5: update_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_update_stmt_in_sql_stmt_core266);
                    update_stmt15=update_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, update_stmt15.getTree());

                    }
                    break;
                case 10 :
                    // SqlParser.g:76:5: delete_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_delete_stmt_in_sql_stmt_core272);
                    delete_stmt16=delete_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_stmt16.getTree());

                    }
                    break;
                case 11 :
                    // SqlParser.g:77:5: begin_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_begin_stmt_in_sql_stmt_core278);
                    begin_stmt17=begin_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, begin_stmt17.getTree());

                    }
                    break;
                case 12 :
                    // SqlParser.g:78:5: commit_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_commit_stmt_in_sql_stmt_core284);
                    commit_stmt18=commit_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, commit_stmt18.getTree());

                    }
                    break;
                case 13 :
                    // SqlParser.g:79:5: rollback_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_rollback_stmt_in_sql_stmt_core290);
                    rollback_stmt19=rollback_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, rollback_stmt19.getTree());

                    }
                    break;
                case 14 :
                    // SqlParser.g:80:5: savepoint_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_savepoint_stmt_in_sql_stmt_core296);
                    savepoint_stmt20=savepoint_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, savepoint_stmt20.getTree());

                    }
                    break;
                case 15 :
                    // SqlParser.g:81:5: release_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_release_stmt_in_sql_stmt_core302);
                    release_stmt21=release_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, release_stmt21.getTree());

                    }
                    break;
                case 16 :
                    // SqlParser.g:83:5: create_virtual_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_virtual_table_stmt_in_sql_stmt_core311);
                    create_virtual_table_stmt22=create_virtual_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_virtual_table_stmt22.getTree());

                    }
                    break;
                case 17 :
                    // SqlParser.g:84:5: create_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_table_stmt_in_sql_stmt_core317);
                    create_table_stmt23=create_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_table_stmt23.getTree());

                    }
                    break;
                case 18 :
                    // SqlParser.g:85:5: drop_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_table_stmt_in_sql_stmt_core323);
                    drop_table_stmt24=drop_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_table_stmt24.getTree());

                    }
                    break;
                case 19 :
                    // SqlParser.g:86:5: alter_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_alter_table_stmt_in_sql_stmt_core329);
                    alter_table_stmt25=alter_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, alter_table_stmt25.getTree());

                    }
                    break;
                case 20 :
                    // SqlParser.g:87:5: create_view_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_view_stmt_in_sql_stmt_core335);
                    create_view_stmt26=create_view_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_view_stmt26.getTree());

                    }
                    break;
                case 21 :
                    // SqlParser.g:88:5: drop_view_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_view_stmt_in_sql_stmt_core341);
                    drop_view_stmt27=drop_view_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_view_stmt27.getTree());

                    }
                    break;
                case 22 :
                    // SqlParser.g:89:5: create_index_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_index_stmt_in_sql_stmt_core347);
                    create_index_stmt28=create_index_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_index_stmt28.getTree());

                    }
                    break;
                case 23 :
                    // SqlParser.g:90:5: drop_index_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_index_stmt_in_sql_stmt_core353);
                    drop_index_stmt29=drop_index_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_index_stmt29.getTree());

                    }
                    break;
                case 24 :
                    // SqlParser.g:91:5: create_trigger_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_trigger_stmt_in_sql_stmt_core359);
                    create_trigger_stmt30=create_trigger_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_trigger_stmt30.getTree());

                    }
                    break;
                case 25 :
                    // SqlParser.g:92:5: drop_trigger_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_trigger_stmt_in_sql_stmt_core365);
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
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // SqlParser.g:95:24: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_qualified_table_name378);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT32=(Token)match(input,DOT,FOLLOW_DOT_in_qualified_table_name380); 
                    DOT32_tree = (Object)adaptor.create(DOT32);
                    adaptor.addChild(root_0, DOT32_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_qualified_table_name386);
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
                    INDEXED33=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_qualified_table_name389); 
                    INDEXED33_tree = (Object)adaptor.create(INDEXED33);
                    adaptor.addChild(root_0, INDEXED33_tree);

                    BY34=(Token)match(input,BY,FOLLOW_BY_in_qualified_table_name391); 
                    BY34_tree = (Object)adaptor.create(BY34);
                    adaptor.addChild(root_0, BY34_tree);

                    pushFollow(FOLLOW_id_in_qualified_table_name395);
                    index_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, index_name.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:95:89: NOT INDEXED
                    {
                    NOT35=(Token)match(input,NOT,FOLLOW_NOT_in_qualified_table_name399); 
                    NOT35_tree = (Object)adaptor.create(NOT35);
                    adaptor.addChild(root_0, NOT35_tree);

                    INDEXED36=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_qualified_table_name401); 
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

            pushFollow(FOLLOW_or_subexpr_in_expr432);
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
            	    OR40=(Token)match(input,OR,FOLLOW_OR_in_expr435); 
            	    OR40_tree = (Object)adaptor.create(OR40);
            	    root_0 = (Object)adaptor.becomeRoot(OR40_tree, root_0);

            	    pushFollow(FOLLOW_or_subexpr_in_expr438);
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

            pushFollow(FOLLOW_and_subexpr_in_or_subexpr447);
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
            	    AND43=(Token)match(input,AND,FOLLOW_AND_in_or_subexpr450); 
            	    AND43_tree = (Object)adaptor.create(AND43);
            	    root_0 = (Object)adaptor.becomeRoot(AND43_tree, root_0);

            	    pushFollow(FOLLOW_and_subexpr_in_or_subexpr453);
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

            pushFollow(FOLLOW_eq_subexpr_in_and_subexpr462);
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
                    pushFollow(FOLLOW_cond_expr_in_and_subexpr464);
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
            alt20 = dfa20.predict(input);
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
                            NOT47=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr476);  
                            stream_NOT.add(NOT47);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_match_op_in_cond_expr479);
                    match_op48=match_op();

                    state._fsp--;

                    stream_match_op.add(match_op48.getTree());
                    pushFollow(FOLLOW_eq_subexpr_in_cond_expr483);
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
                            ESCAPE49=(Token)match(input,ESCAPE,FOLLOW_ESCAPE_in_cond_expr486);  
                            stream_ESCAPE.add(ESCAPE49);

                            pushFollow(FOLLOW_eq_subexpr_in_cond_expr490);
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
                        if ( stream_escape_expr.hasNext()||stream_ESCAPE.hasNext() ) {
                            // SqlParser.g:106:105: ^( ESCAPE $escape_expr)
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
                            NOT50=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr518);  
                            stream_NOT.add(NOT50);


                            }
                            break;

                    }

                    IN51=(Token)match(input,IN,FOLLOW_IN_in_cond_expr521);  
                    stream_IN.add(IN51);

                    LPAREN52=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cond_expr523);  
                    stream_LPAREN.add(LPAREN52);

                    pushFollow(FOLLOW_expr_in_cond_expr525);
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
                    	    COMMA54=(Token)match(input,COMMA,FOLLOW_COMMA_in_cond_expr528);  
                    	    stream_COMMA.add(COMMA54);

                    	    pushFollow(FOLLOW_expr_in_cond_expr530);
                    	    expr55=expr();

                    	    state._fsp--;

                    	    stream_expr.add(expr55.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    RPAREN56=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cond_expr534);  
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
                            NOT57=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr556);  
                            stream_NOT.add(NOT57);


                            }
                            break;

                    }

                    IN58=(Token)match(input,IN,FOLLOW_IN_in_cond_expr559);  
                    stream_IN.add(IN58);

                    // SqlParser.g:108:13: (database_name= id DOT )?
                    int alt16=2;
                    alt16 = dfa16.predict(input);
                    switch (alt16) {
                        case 1 :
                            // SqlParser.g:108:14: database_name= id DOT
                            {
                            pushFollow(FOLLOW_id_in_cond_expr564);
                            database_name=id();

                            state._fsp--;

                            stream_id.add(database_name.getTree());
                            DOT59=(Token)match(input,DOT,FOLLOW_DOT_in_cond_expr566);  
                            stream_DOT.add(DOT59);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_id_in_cond_expr572);
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
                            ISNULL60=(Token)match(input,ISNULL,FOLLOW_ISNULL_in_cond_expr603);  
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
                            NOTNULL61=(Token)match(input,NOTNULL,FOLLOW_NOTNULL_in_cond_expr611);  
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
                            IS62=(Token)match(input,IS,FOLLOW_IS_in_cond_expr619);  
                            stream_IS.add(IS62);

                            NULL63=(Token)match(input,NULL,FOLLOW_NULL_in_cond_expr621);  
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
                            NOT64=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr629);  
                            stream_NOT.add(NOT64);

                            NULL65=(Token)match(input,NULL,FOLLOW_NULL_in_cond_expr631);  
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
                            IS66=(Token)match(input,IS,FOLLOW_IS_in_cond_expr639);  
                            stream_IS.add(IS66);

                            NOT67=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr641);  
                            stream_NOT.add(NOT67);

                            NULL68=(Token)match(input,NULL,FOLLOW_NULL_in_cond_expr643);  
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
                            NOT69=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr654);  
                            stream_NOT.add(NOT69);


                            }
                            break;

                    }

                    BETWEEN70=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_cond_expr657);  
                    stream_BETWEEN.add(BETWEEN70);

                    pushFollow(FOLLOW_eq_subexpr_in_cond_expr661);
                    e1=eq_subexpr();

                    state._fsp--;

                    stream_eq_subexpr.add(e1.getTree());
                    AND71=(Token)match(input,AND,FOLLOW_AND_in_cond_expr663);  
                    stream_AND.add(AND71);

                    pushFollow(FOLLOW_eq_subexpr_in_cond_expr667);
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
                        alt19 = dfa19.predict(input);
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

                    	    pushFollow(FOLLOW_eq_subexpr_in_cond_expr710);
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

            pushFollow(FOLLOW_neq_subexpr_in_eq_subexpr743);
            neq_subexpr75=neq_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, neq_subexpr75.getTree());
            // SqlParser.g:118:25: ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )*
            loop21:
            do {
                int alt21=2;
                alt21 = dfa21.predict(input);
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

            	    pushFollow(FOLLOW_neq_subexpr_in_eq_subexpr763);
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

            pushFollow(FOLLOW_bit_subexpr_in_neq_subexpr772);
            bit_subexpr78=bit_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, bit_subexpr78.getTree());
            // SqlParser.g:120:26: ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )*
            loop22:
            do {
                int alt22=2;
                alt22 = dfa22.predict(input);
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

            	    pushFollow(FOLLOW_bit_subexpr_in_neq_subexpr792);
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

            pushFollow(FOLLOW_add_subexpr_in_bit_subexpr801);
            add_subexpr81=add_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, add_subexpr81.getTree());
            // SqlParser.g:122:26: ( ( PLUS | MINUS ) add_subexpr )*
            loop23:
            do {
                int alt23=2;
                alt23 = dfa23.predict(input);
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

            	    pushFollow(FOLLOW_add_subexpr_in_bit_subexpr813);
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

            pushFollow(FOLLOW_mul_subexpr_in_add_subexpr822);
            mul_subexpr84=mul_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, mul_subexpr84.getTree());
            // SqlParser.g:124:26: ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )*
            loop24:
            do {
                int alt24=2;
                alt24 = dfa24.predict(input);
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

            	    pushFollow(FOLLOW_mul_subexpr_in_add_subexpr838);
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

            pushFollow(FOLLOW_con_subexpr_in_mul_subexpr847);
            con_subexpr87=con_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, con_subexpr87.getTree());
            // SqlParser.g:126:26: ( DOUBLE_PIPE con_subexpr )*
            loop25:
            do {
                int alt25=2;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // SqlParser.g:126:27: DOUBLE_PIPE con_subexpr
            	    {
            	    DOUBLE_PIPE88=(Token)match(input,DOUBLE_PIPE,FOLLOW_DOUBLE_PIPE_in_mul_subexpr850); 
            	    DOUBLE_PIPE88_tree = (Object)adaptor.create(DOUBLE_PIPE88);
            	    root_0 = (Object)adaptor.becomeRoot(DOUBLE_PIPE88_tree, root_0);

            	    pushFollow(FOLLOW_con_subexpr_in_mul_subexpr853);
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
    // SqlParser.g:128:1: con_subexpr : ( unary_subexpr | unary_op unary_subexpr -> ^( unary_op unary_subexpr ) );
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
            // SqlParser.g:128:12: ( unary_subexpr | unary_op unary_subexpr -> ^( unary_op unary_subexpr ) )
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // SqlParser.g:128:14: unary_subexpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unary_subexpr_in_con_subexpr862);
                    unary_subexpr90=unary_subexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, unary_subexpr90.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:128:30: unary_op unary_subexpr
                    {
                    pushFollow(FOLLOW_unary_op_in_con_subexpr866);
                    unary_op91=unary_op();

                    state._fsp--;

                    stream_unary_op.add(unary_op91.getTree());
                    pushFollow(FOLLOW_unary_subexpr_in_con_subexpr868);
                    unary_subexpr92=unary_subexpr();

                    state._fsp--;

                    stream_unary_subexpr.add(unary_subexpr92.getTree());


                    // AST REWRITE
                    // elements: unary_subexpr, unary_op
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 128:53: -> ^( unary_op unary_subexpr )
                    {
                        // SqlParser.g:128:56: ^( unary_op unary_subexpr )
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
    // SqlParser.g:130:1: unary_op : ( PLUS | MINUS | TILDA | NOT );
    public final SqlParser.unary_op_return unary_op() throws RecognitionException {
        SqlParser.unary_op_return retval = new SqlParser.unary_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set93=null;

        Object set93_tree=null;

        try {
            // SqlParser.g:130:9: ( PLUS | MINUS | TILDA | NOT )
            // SqlParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set93=(Token)input.LT(1);
            if ( (input.LA(1)>=PLUS && input.LA(1)<=TILDA)||input.LA(1)==NOT ) {
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
    // SqlParser.g:132:1: unary_subexpr : atom_expr ( COLLATE collation_name= ID )? ;
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
            // SqlParser.g:132:14: ( atom_expr ( COLLATE collation_name= ID )? )
            // SqlParser.g:132:16: atom_expr ( COLLATE collation_name= ID )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atom_expr_in_unary_subexpr902);
            atom_expr94=atom_expr();

            state._fsp--;

            adaptor.addChild(root_0, atom_expr94.getTree());
            // SqlParser.g:132:26: ( COLLATE collation_name= ID )?
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // SqlParser.g:132:27: COLLATE collation_name= ID
                    {
                    COLLATE95=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_unary_subexpr905); 
                    COLLATE95_tree = (Object)adaptor.create(COLLATE95);
                    root_0 = (Object)adaptor.becomeRoot(COLLATE95_tree, root_0);

                    collation_name=(Token)match(input,ID,FOLLOW_ID_in_unary_subexpr910); 
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
    // SqlParser.g:134:1: atom_expr : ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) | name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN -> ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? ) | LPAREN expr RPAREN | CAST LPAREN expr AS type_name RPAREN | CASE (case_expr= expr )? ( when_expr )+ ( ELSE else_expr= expr )? END -> ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? ) | raise_function );
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
            // SqlParser.g:135:3: ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) | name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN -> ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? ) | LPAREN expr RPAREN | CAST LPAREN expr AS type_name RPAREN | CASE (case_expr= expr )? ( when_expr )+ ( ELSE else_expr= expr )? END -> ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? ) | raise_function )
            int alt36=8;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // SqlParser.g:135:5: literal_value
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_value_in_atom_expr922);
                    literal_value96=literal_value();

                    state._fsp--;

                    adaptor.addChild(root_0, literal_value96.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:136:5: bind_parameter
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_bind_parameter_in_atom_expr928);
                    bind_parameter97=bind_parameter();

                    state._fsp--;

                    adaptor.addChild(root_0, bind_parameter97.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:137:5: ( (database_name= id DOT )? table_name= id DOT )? column_name= ID
                    {
                    // SqlParser.g:137:5: ( (database_name= id DOT )? table_name= id DOT )?
                    int alt29=2;
                    alt29 = dfa29.predict(input);
                    switch (alt29) {
                        case 1 :
                            // SqlParser.g:137:6: (database_name= id DOT )? table_name= id DOT
                            {
                            // SqlParser.g:137:6: (database_name= id DOT )?
                            int alt28=2;
                            alt28 = dfa28.predict(input);
                            switch (alt28) {
                                case 1 :
                                    // SqlParser.g:137:7: database_name= id DOT
                                    {
                                    pushFollow(FOLLOW_id_in_atom_expr938);
                                    database_name=id();

                                    state._fsp--;

                                    stream_id.add(database_name.getTree());
                                    DOT98=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expr940);  
                                    stream_DOT.add(DOT98);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_id_in_atom_expr946);
                            table_name=id();

                            state._fsp--;

                            stream_id.add(table_name.getTree());
                            DOT99=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expr948);  
                            stream_DOT.add(DOT99);


                            }
                            break;

                    }

                    column_name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr954);  
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
                    // 137:65: -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) )
                    {
                        // SqlParser.g:137:68: ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMN_EXPRESSION, "COLUMN_EXPRESSION"), root_1);

                        // SqlParser.g:137:88: ^( $column_name ( ^( $table_name ( $database_name)? ) )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_column_name.nextNode(), root_2);

                        // SqlParser.g:137:103: ( ^( $table_name ( $database_name)? ) )?
                        if ( stream_database_name.hasNext()||stream_table_name.hasNext() ) {
                            // SqlParser.g:137:103: ^( $table_name ( $database_name)? )
                            {
                            Object root_3 = (Object)adaptor.nil();
                            root_3 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_3);

                            // SqlParser.g:137:117: ( $database_name)?
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
                    // SqlParser.g:138:5: name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN
                    {
                    name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr983);  
                    stream_ID.add(name);

                    LPAREN100=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr985);  
                    stream_LPAREN.add(LPAREN100);

                    // SqlParser.g:138:20: ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )?
                    int alt32=3;
                    alt32 = dfa32.predict(input);
                    switch (alt32) {
                        case 1 :
                            // SqlParser.g:138:21: ( DISTINCT )? args+= expr ( COMMA args+= expr )*
                            {
                            // SqlParser.g:138:21: ( DISTINCT )?
                            int alt30=2;
                            alt30 = dfa30.predict(input);
                            switch (alt30) {
                                case 1 :
                                    // SqlParser.g:138:21: DISTINCT
                                    {
                                    DISTINCT101=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_atom_expr988);  
                                    stream_DISTINCT.add(DISTINCT101);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_expr_in_atom_expr993);
                            args=expr();

                            state._fsp--;

                            stream_expr.add(args.getTree());
                            if (list_args==null) list_args=new ArrayList();
                            list_args.add(args.getTree());

                            // SqlParser.g:138:42: ( COMMA args+= expr )*
                            loop31:
                            do {
                                int alt31=2;
                                int LA31_0 = input.LA(1);

                                if ( (LA31_0==COMMA) ) {
                                    alt31=1;
                                }


                                switch (alt31) {
                            	case 1 :
                            	    // SqlParser.g:138:43: COMMA args+= expr
                            	    {
                            	    COMMA102=(Token)match(input,COMMA,FOLLOW_COMMA_in_atom_expr996);  
                            	    stream_COMMA.add(COMMA102);

                            	    pushFollow(FOLLOW_expr_in_atom_expr1000);
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
                            // SqlParser.g:138:64: ASTERISK
                            {
                            ASTERISK103=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_atom_expr1006);  
                            stream_ASTERISK.add(ASTERISK103);


                            }
                            break;

                    }

                    RPAREN104=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr1010);  
                    stream_RPAREN.add(RPAREN104);



                    // AST REWRITE
                    // elements: args, DISTINCT, name, ASTERISK
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
                    // 138:82: -> ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? )
                    {
                        // SqlParser.g:138:85: ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION_EXPRESSION, "FUNCTION_EXPRESSION"), root_1);

                        adaptor.addChild(root_1, stream_name.nextNode());
                        // SqlParser.g:138:113: ( DISTINCT )?
                        if ( stream_DISTINCT.hasNext() ) {
                            adaptor.addChild(root_1, stream_DISTINCT.nextNode());

                        }
                        stream_DISTINCT.reset();
                        // SqlParser.g:138:123: ( $args)*
                        while ( stream_args.hasNext() ) {
                            adaptor.addChild(root_1, stream_args.nextTree());

                        }
                        stream_args.reset();
                        // SqlParser.g:138:130: ( ASTERISK )?
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
                    // SqlParser.g:139:5: LPAREN expr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN105=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr1035); 
                    pushFollow(FOLLOW_expr_in_atom_expr1038);
                    expr106=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr106.getTree());
                    RPAREN107=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr1040); 

                    }
                    break;
                case 6 :
                    // SqlParser.g:140:5: CAST LPAREN expr AS type_name RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    CAST108=(Token)match(input,CAST,FOLLOW_CAST_in_atom_expr1047); 
                    CAST108_tree = (Object)adaptor.create(CAST108);
                    root_0 = (Object)adaptor.becomeRoot(CAST108_tree, root_0);

                    LPAREN109=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr1050); 
                    pushFollow(FOLLOW_expr_in_atom_expr1053);
                    expr110=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr110.getTree());
                    AS111=(Token)match(input,AS,FOLLOW_AS_in_atom_expr1055); 
                    pushFollow(FOLLOW_type_name_in_atom_expr1058);
                    type_name112=type_name();

                    state._fsp--;

                    adaptor.addChild(root_0, type_name112.getTree());
                    RPAREN113=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr1060); 

                    }
                    break;
                case 7 :
                    // SqlParser.g:143:5: CASE (case_expr= expr )? ( when_expr )+ ( ELSE else_expr= expr )? END
                    {
                    CASE114=(Token)match(input,CASE,FOLLOW_CASE_in_atom_expr1069);  
                    stream_CASE.add(CASE114);

                    // SqlParser.g:143:10: (case_expr= expr )?
                    int alt33=2;
                    alt33 = dfa33.predict(input);
                    switch (alt33) {
                        case 1 :
                            // SqlParser.g:143:11: case_expr= expr
                            {
                            pushFollow(FOLLOW_expr_in_atom_expr1074);
                            case_expr=expr();

                            state._fsp--;

                            stream_expr.add(case_expr.getTree());

                            }
                            break;

                    }

                    // SqlParser.g:143:28: ( when_expr )+
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
                    	    // SqlParser.g:143:28: when_expr
                    	    {
                    	    pushFollow(FOLLOW_when_expr_in_atom_expr1078);
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

                    // SqlParser.g:143:39: ( ELSE else_expr= expr )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==ELSE) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // SqlParser.g:143:40: ELSE else_expr= expr
                            {
                            ELSE116=(Token)match(input,ELSE,FOLLOW_ELSE_in_atom_expr1082);  
                            stream_ELSE.add(ELSE116);

                            pushFollow(FOLLOW_expr_in_atom_expr1086);
                            else_expr=expr();

                            state._fsp--;

                            stream_expr.add(else_expr.getTree());

                            }
                            break;

                    }

                    END117=(Token)match(input,END,FOLLOW_END_in_atom_expr1090);  
                    stream_END.add(END117);



                    // AST REWRITE
                    // elements: when_expr, else_expr, case_expr, CASE
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
                    // 143:66: -> ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? )
                    {
                        // SqlParser.g:143:69: ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CASE.nextNode(), root_1);

                        // SqlParser.g:143:76: ( $case_expr)?
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
                        // SqlParser.g:143:99: ( $else_expr)?
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
                    // SqlParser.g:144:5: raise_function
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_raise_function_in_atom_expr1113);
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
    // SqlParser.g:147:1: when_expr : WHEN e1= expr THEN e2= expr -> ^( WHEN $e1 $e2) ;
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
            // SqlParser.g:147:10: ( WHEN e1= expr THEN e2= expr -> ^( WHEN $e1 $e2) )
            // SqlParser.g:147:12: WHEN e1= expr THEN e2= expr
            {
            WHEN119=(Token)match(input,WHEN,FOLLOW_WHEN_in_when_expr1123);  
            stream_WHEN.add(WHEN119);

            pushFollow(FOLLOW_expr_in_when_expr1127);
            e1=expr();

            state._fsp--;

            stream_expr.add(e1.getTree());
            THEN120=(Token)match(input,THEN,FOLLOW_THEN_in_when_expr1129);  
            stream_THEN.add(THEN120);

            pushFollow(FOLLOW_expr_in_when_expr1133);
            e2=expr();

            state._fsp--;

            stream_expr.add(e2.getTree());


            // AST REWRITE
            // elements: WHEN, e2, e1
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
            // 147:38: -> ^( WHEN $e1 $e2)
            {
                // SqlParser.g:147:41: ^( WHEN $e1 $e2)
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
    // SqlParser.g:149:1: literal_value : ( INTEGER -> ^( INTEGER_LITERAL INTEGER ) | FLOAT -> ^( FLOAT_LITERAL FLOAT ) | STRING -> ^( STRING_LITERAL STRING ) | BLOB -> ^( BLOB_LITERAL BLOB ) | NULL | CURRENT_TIME -> ^( FUNCTION_LITERAL CURRENT_TIME ) | CURRENT_DATE -> ^( FUNCTION_LITERAL CURRENT_DATE ) | CURRENT_TIMESTAMP -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP ) );
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
            // SqlParser.g:150:3: ( INTEGER -> ^( INTEGER_LITERAL INTEGER ) | FLOAT -> ^( FLOAT_LITERAL FLOAT ) | STRING -> ^( STRING_LITERAL STRING ) | BLOB -> ^( BLOB_LITERAL BLOB ) | NULL | CURRENT_TIME -> ^( FUNCTION_LITERAL CURRENT_TIME ) | CURRENT_DATE -> ^( FUNCTION_LITERAL CURRENT_DATE ) | CURRENT_TIMESTAMP -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP ) )
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
                    // SqlParser.g:150:5: INTEGER
                    {
                    INTEGER121=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_literal_value1155);  
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
                    // 150:13: -> ^( INTEGER_LITERAL INTEGER )
                    {
                        // SqlParser.g:150:16: ^( INTEGER_LITERAL INTEGER )
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
                    // SqlParser.g:151:5: FLOAT
                    {
                    FLOAT122=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_literal_value1169);  
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
                    // 151:11: -> ^( FLOAT_LITERAL FLOAT )
                    {
                        // SqlParser.g:151:14: ^( FLOAT_LITERAL FLOAT )
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
                    // SqlParser.g:152:5: STRING
                    {
                    STRING123=(Token)match(input,STRING,FOLLOW_STRING_in_literal_value1183);  
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
                    // 152:12: -> ^( STRING_LITERAL STRING )
                    {
                        // SqlParser.g:152:15: ^( STRING_LITERAL STRING )
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
                    // SqlParser.g:153:5: BLOB
                    {
                    BLOB124=(Token)match(input,BLOB,FOLLOW_BLOB_in_literal_value1197);  
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
                    // 153:10: -> ^( BLOB_LITERAL BLOB )
                    {
                        // SqlParser.g:153:13: ^( BLOB_LITERAL BLOB )
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
                    // SqlParser.g:154:5: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL125=(Token)match(input,NULL,FOLLOW_NULL_in_literal_value1211); 
                    NULL125_tree = (Object)adaptor.create(NULL125);
                    adaptor.addChild(root_0, NULL125_tree);


                    }
                    break;
                case 6 :
                    // SqlParser.g:155:5: CURRENT_TIME
                    {
                    CURRENT_TIME126=(Token)match(input,CURRENT_TIME,FOLLOW_CURRENT_TIME_in_literal_value1217);  
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
                    // 155:18: -> ^( FUNCTION_LITERAL CURRENT_TIME )
                    {
                        // SqlParser.g:155:21: ^( FUNCTION_LITERAL CURRENT_TIME )
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
                    // SqlParser.g:156:5: CURRENT_DATE
                    {
                    CURRENT_DATE127=(Token)match(input,CURRENT_DATE,FOLLOW_CURRENT_DATE_in_literal_value1231);  
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
                    // 156:18: -> ^( FUNCTION_LITERAL CURRENT_DATE )
                    {
                        // SqlParser.g:156:21: ^( FUNCTION_LITERAL CURRENT_DATE )
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
                    // SqlParser.g:157:5: CURRENT_TIMESTAMP
                    {
                    CURRENT_TIMESTAMP128=(Token)match(input,CURRENT_TIMESTAMP,FOLLOW_CURRENT_TIMESTAMP_in_literal_value1245);  
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
                    // 157:23: -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP )
                    {
                        // SqlParser.g:157:26: ^( FUNCTION_LITERAL CURRENT_TIMESTAMP )
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
    // SqlParser.g:160:1: bind_parameter : ( QUESTION -> BIND | QUESTION position= INTEGER -> ^( BIND $position) | COLON name= id -> ^( BIND_NAME $name) | AT name= id -> ^( BIND_NAME $name) );
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
            // SqlParser.g:161:3: ( QUESTION -> BIND | QUESTION position= INTEGER -> ^( BIND $position) | COLON name= id -> ^( BIND_NAME $name) | AT name= id -> ^( BIND_NAME $name) )
            int alt38=4;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // SqlParser.g:161:5: QUESTION
                    {
                    QUESTION129=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_bind_parameter1266);  
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
                    // 161:14: -> BIND
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(BIND, "BIND"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // SqlParser.g:162:5: QUESTION position= INTEGER
                    {
                    QUESTION130=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_bind_parameter1276);  
                    stream_QUESTION.add(QUESTION130);

                    position=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_bind_parameter1280);  
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
                    // 162:31: -> ^( BIND $position)
                    {
                        // SqlParser.g:162:34: ^( BIND $position)
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
                    // SqlParser.g:163:5: COLON name= id
                    {
                    COLON131=(Token)match(input,COLON,FOLLOW_COLON_in_bind_parameter1295);  
                    stream_COLON.add(COLON131);

                    pushFollow(FOLLOW_id_in_bind_parameter1299);
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
                    // 163:19: -> ^( BIND_NAME $name)
                    {
                        // SqlParser.g:163:22: ^( BIND_NAME $name)
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
                    // SqlParser.g:164:5: AT name= id
                    {
                    AT132=(Token)match(input,AT,FOLLOW_AT_in_bind_parameter1314);  
                    stream_AT.add(AT132);

                    pushFollow(FOLLOW_id_in_bind_parameter1318);
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
                    // 164:16: -> ^( BIND_NAME $name)
                    {
                        // SqlParser.g:164:19: ^( BIND_NAME $name)
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
    // SqlParser.g:169:1: raise_function : RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN ;
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
            // SqlParser.g:169:15: ( RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN )
            // SqlParser.g:169:17: RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN
            {
            root_0 = (Object)adaptor.nil();

            RAISE133=(Token)match(input,RAISE,FOLLOW_RAISE_in_raise_function1339); 
            RAISE133_tree = (Object)adaptor.create(RAISE133);
            root_0 = (Object)adaptor.becomeRoot(RAISE133_tree, root_0);

            LPAREN134=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_raise_function1342); 
            // SqlParser.g:169:32: ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING )
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
                    // SqlParser.g:169:33: IGNORE
                    {
                    IGNORE135=(Token)match(input,IGNORE,FOLLOW_IGNORE_in_raise_function1346); 
                    IGNORE135_tree = (Object)adaptor.create(IGNORE135);
                    adaptor.addChild(root_0, IGNORE135_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:169:42: ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING
                    {
                    set136=(Token)input.LT(1);
                    if ( input.LA(1)==ABORT||input.LA(1)==FAIL||input.LA(1)==ROLLBACK ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set136));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    COMMA137=(Token)match(input,COMMA,FOLLOW_COMMA_in_raise_function1362); 
                    error_message=(Token)match(input,STRING,FOLLOW_STRING_in_raise_function1367); 
                    error_message_tree = (Object)adaptor.create(error_message);
                    adaptor.addChild(root_0, error_message_tree);


                    }
                    break;

            }

            RPAREN138=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_raise_function1370); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // SqlParser.g:171:1: type_name : (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )? -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ ) ;
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
            // SqlParser.g:171:10: ( (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )? -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ ) )
            // SqlParser.g:171:12: (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )?
            {
            // SqlParser.g:171:17: (names+= ID )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                alt40 = dfa40.predict(input);
                switch (alt40) {
            	case 1 :
            	    // SqlParser.g:171:17: names+= ID
            	    {
            	    names=(Token)match(input,ID,FOLLOW_ID_in_type_name1380);  
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

            // SqlParser.g:171:23: ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )?
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // SqlParser.g:171:24: LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN
                    {
                    LPAREN139=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_type_name1384);  
                    stream_LPAREN.add(LPAREN139);

                    pushFollow(FOLLOW_signed_number_in_type_name1388);
                    size1=signed_number();

                    state._fsp--;

                    stream_signed_number.add(size1.getTree());
                    // SqlParser.g:171:51: ( COMMA size2= signed_number )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==COMMA) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // SqlParser.g:171:52: COMMA size2= signed_number
                            {
                            COMMA140=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_name1391);  
                            stream_COMMA.add(COMMA140);

                            pushFollow(FOLLOW_signed_number_in_type_name1395);
                            size2=signed_number();

                            state._fsp--;

                            stream_signed_number.add(size2.getTree());

                            }
                            break;

                    }

                    RPAREN141=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_type_name1399);  
                    stream_RPAREN.add(RPAREN141);


                    }
                    break;

            }



            // AST REWRITE
            // elements: names, size1, size2
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
            // 172:1: -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ )
            {
                // SqlParser.g:172:4: ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_1);

                // SqlParser.g:172:11: ^( TYPE_PARAMS ( $size1)? ( $size2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE_PARAMS, "TYPE_PARAMS"), root_2);

                // SqlParser.g:172:25: ( $size1)?
                if ( stream_size1.hasNext() ) {
                    adaptor.addChild(root_2, stream_size1.nextTree());

                }
                stream_size1.reset();
                // SqlParser.g:172:33: ( $size2)?
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
    // SqlParser.g:175:1: pragma_stmt : PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )? ;
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
            // SqlParser.g:175:12: ( PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )? )
            // SqlParser.g:175:14: PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            PRAGMA142=(Token)match(input,PRAGMA,FOLLOW_PRAGMA_in_pragma_stmt1431); 
            PRAGMA142_tree = (Object)adaptor.create(PRAGMA142);
            adaptor.addChild(root_0, PRAGMA142_tree);

            // SqlParser.g:175:21: (database_name= id DOT )?
            int alt43=2;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // SqlParser.g:175:22: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_pragma_stmt1436);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT143=(Token)match(input,DOT,FOLLOW_DOT_in_pragma_stmt1438); 
                    DOT143_tree = (Object)adaptor.create(DOT143);
                    adaptor.addChild(root_0, DOT143_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_pragma_stmt1444);
            pragma_name=id();

            state._fsp--;

            adaptor.addChild(root_0, pragma_name.getTree());
            // SqlParser.g:175:60: ( EQUALS pragma_value | LPAREN pragma_value RPAREN )?
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
                    // SqlParser.g:175:61: EQUALS pragma_value
                    {
                    EQUALS144=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_pragma_stmt1447); 
                    EQUALS144_tree = (Object)adaptor.create(EQUALS144);
                    adaptor.addChild(root_0, EQUALS144_tree);

                    pushFollow(FOLLOW_pragma_value_in_pragma_stmt1449);
                    pragma_value145=pragma_value();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_value145.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:175:83: LPAREN pragma_value RPAREN
                    {
                    LPAREN146=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_pragma_stmt1453); 
                    LPAREN146_tree = (Object)adaptor.create(LPAREN146);
                    adaptor.addChild(root_0, LPAREN146_tree);

                    pushFollow(FOLLOW_pragma_value_in_pragma_stmt1455);
                    pragma_value147=pragma_value();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_value147.getTree());
                    RPAREN148=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_pragma_stmt1457); 
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
    // SqlParser.g:177:1: pragma_value : ( signed_number | name= id | STRING );
    public final SqlParser.pragma_value_return pragma_value() throws RecognitionException {
        SqlParser.pragma_value_return retval = new SqlParser.pragma_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING150=null;
        SqlParser.id_return name = null;

        SqlParser.signed_number_return signed_number149 = null;


        Object STRING150_tree=null;

        try {
            // SqlParser.g:177:13: ( signed_number | name= id | STRING )
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
                    // SqlParser.g:177:15: signed_number
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_signed_number_in_pragma_value1466);
                    signed_number149=signed_number();

                    state._fsp--;

                    adaptor.addChild(root_0, signed_number149.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:177:31: name= id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_in_pragma_value1472);
                    name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, name.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:177:41: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING150=(Token)match(input,STRING,FOLLOW_STRING_in_pragma_value1476); 
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
    // SqlParser.g:180:1: attach_stmt : ATTACH ( DATABASE )? filename= ( STRING | id ) AS database_name= id ;
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
            // SqlParser.g:180:12: ( ATTACH ( DATABASE )? filename= ( STRING | id ) AS database_name= id )
            // SqlParser.g:180:14: ATTACH ( DATABASE )? filename= ( STRING | id ) AS database_name= id
            {
            root_0 = (Object)adaptor.nil();

            ATTACH151=(Token)match(input,ATTACH,FOLLOW_ATTACH_in_attach_stmt1484); 
            ATTACH151_tree = (Object)adaptor.create(ATTACH151);
            adaptor.addChild(root_0, ATTACH151_tree);

            // SqlParser.g:180:21: ( DATABASE )?
            int alt46=2;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // SqlParser.g:180:22: DATABASE
                    {
                    DATABASE152=(Token)match(input,DATABASE,FOLLOW_DATABASE_in_attach_stmt1487); 
                    DATABASE152_tree = (Object)adaptor.create(DATABASE152);
                    adaptor.addChild(root_0, DATABASE152_tree);


                    }
                    break;

            }

            // SqlParser.g:180:42: ( STRING | id )
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
                    // SqlParser.g:180:43: STRING
                    {
                    STRING153=(Token)match(input,STRING,FOLLOW_STRING_in_attach_stmt1494); 
                    STRING153_tree = (Object)adaptor.create(STRING153);
                    adaptor.addChild(root_0, STRING153_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:180:52: id
                    {
                    pushFollow(FOLLOW_id_in_attach_stmt1498);
                    id154=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id154.getTree());

                    }
                    break;

            }

            AS155=(Token)match(input,AS,FOLLOW_AS_in_attach_stmt1501); 
            AS155_tree = (Object)adaptor.create(AS155);
            adaptor.addChild(root_0, AS155_tree);

            pushFollow(FOLLOW_id_in_attach_stmt1505);
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
    // SqlParser.g:183:1: detach_stmt : DETACH ( DATABASE )? database_name= id ;
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
            // SqlParser.g:183:12: ( DETACH ( DATABASE )? database_name= id )
            // SqlParser.g:183:14: DETACH ( DATABASE )? database_name= id
            {
            root_0 = (Object)adaptor.nil();

            DETACH156=(Token)match(input,DETACH,FOLLOW_DETACH_in_detach_stmt1513); 
            DETACH156_tree = (Object)adaptor.create(DETACH156);
            adaptor.addChild(root_0, DETACH156_tree);

            // SqlParser.g:183:21: ( DATABASE )?
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
                    // SqlParser.g:183:22: DATABASE
                    {
                    DATABASE157=(Token)match(input,DATABASE,FOLLOW_DATABASE_in_detach_stmt1516); 
                    DATABASE157_tree = (Object)adaptor.create(DATABASE157);
                    adaptor.addChild(root_0, DATABASE157_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_detach_stmt1522);
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
    // SqlParser.g:186:1: analyze_stmt : ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )? ;
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
            // SqlParser.g:186:13: ( ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )? )
            // SqlParser.g:186:15: ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )?
            {
            root_0 = (Object)adaptor.nil();

            ANALYZE158=(Token)match(input,ANALYZE,FOLLOW_ANALYZE_in_analyze_stmt1530); 
            ANALYZE158_tree = (Object)adaptor.create(ANALYZE158);
            adaptor.addChild(root_0, ANALYZE158_tree);

            // SqlParser.g:186:23: (database_or_table_name= id | database_name= id DOT table_name= id )?
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
            else if ( ((LA49_0>=ABORT && LA49_0<=FROM)||(LA49_0>=GROUP && LA49_0<=IMMEDIATE)||(LA49_0>=INDEX && LA49_0<=IS)||(LA49_0>=JOIN && LA49_0<=LEFT)||LA49_0==LIMIT||LA49_0==NATURAL||(LA49_0>=NULL && LA49_0<=REFERENCES)||(LA49_0>=REINDEX && LA49_0<=WHERE)) ) {
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
                    // SqlParser.g:186:24: database_or_table_name= id
                    {
                    pushFollow(FOLLOW_id_in_analyze_stmt1535);
                    database_or_table_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_or_table_name.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:186:52: database_name= id DOT table_name= id
                    {
                    pushFollow(FOLLOW_id_in_analyze_stmt1541);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT159=(Token)match(input,DOT,FOLLOW_DOT_in_analyze_stmt1543); 
                    DOT159_tree = (Object)adaptor.create(DOT159);
                    adaptor.addChild(root_0, DOT159_tree);

                    pushFollow(FOLLOW_id_in_analyze_stmt1547);
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
    // SqlParser.g:189:1: reindex_stmt : REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id ;
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
            // SqlParser.g:189:13: ( REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id )
            // SqlParser.g:189:15: REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id
            {
            root_0 = (Object)adaptor.nil();

            REINDEX160=(Token)match(input,REINDEX,FOLLOW_REINDEX_in_reindex_stmt1557); 
            REINDEX160_tree = (Object)adaptor.create(REINDEX160);
            adaptor.addChild(root_0, REINDEX160_tree);

            // SqlParser.g:189:23: (database_name= id DOT )?
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
                    // SqlParser.g:189:24: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_reindex_stmt1562);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT161=(Token)match(input,DOT,FOLLOW_DOT_in_reindex_stmt1564); 
                    DOT161_tree = (Object)adaptor.create(DOT161);
                    adaptor.addChild(root_0, DOT161_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_reindex_stmt1570);
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
    // SqlParser.g:192:1: vacuum_stmt : VACUUM ;
    public final SqlParser.vacuum_stmt_return vacuum_stmt() throws RecognitionException {
        SqlParser.vacuum_stmt_return retval = new SqlParser.vacuum_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VACUUM162=null;

        Object VACUUM162_tree=null;

        try {
            // SqlParser.g:192:12: ( VACUUM )
            // SqlParser.g:192:14: VACUUM
            {
            root_0 = (Object)adaptor.nil();

            VACUUM162=(Token)match(input,VACUUM,FOLLOW_VACUUM_in_vacuum_stmt1578); 
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
    // SqlParser.g:198:1: operation_conflict_clause : OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) ;
    public final SqlParser.operation_conflict_clause_return operation_conflict_clause() throws RecognitionException {
        SqlParser.operation_conflict_clause_return retval = new SqlParser.operation_conflict_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR163=null;
        Token set164=null;

        Object OR163_tree=null;
        Object set164_tree=null;

        try {
            // SqlParser.g:198:26: ( OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) )
            // SqlParser.g:198:28: OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE )
            {
            root_0 = (Object)adaptor.nil();

            OR163=(Token)match(input,OR,FOLLOW_OR_in_operation_conflict_clause1589); 
            OR163_tree = (Object)adaptor.create(OR163);
            adaptor.addChild(root_0, OR163_tree);

            set164=(Token)input.LT(1);
            if ( input.LA(1)==ABORT||input.LA(1)==FAIL||input.LA(1)==IGNORE||input.LA(1)==REPLACE||input.LA(1)==ROLLBACK ) {
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
    // SqlParser.g:200:1: ordering_term : expr ( ASC | DESC )? -> ^( ORDERING expr ( ASC )? ( DESC )? ) ;
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
            // SqlParser.g:200:14: ( expr ( ASC | DESC )? -> ^( ORDERING expr ( ASC )? ( DESC )? ) )
            // SqlParser.g:200:16: expr ( ASC | DESC )?
            {
            pushFollow(FOLLOW_expr_in_ordering_term1616);
            expr165=expr();

            state._fsp--;

            stream_expr.add(expr165.getTree());
            // SqlParser.g:200:82: ( ASC | DESC )?
            int alt51=3;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // SqlParser.g:200:83: ASC
                    {
                    ASC166=(Token)match(input,ASC,FOLLOW_ASC_in_ordering_term1621);  
                    stream_ASC.add(ASC166);


                    }
                    break;
                case 2 :
                    // SqlParser.g:200:89: DESC
                    {
                    DESC167=(Token)match(input,DESC,FOLLOW_DESC_in_ordering_term1625);  
                    stream_DESC.add(DESC167);


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
            // 201:1: -> ^( ORDERING expr ( ASC )? ( DESC )? )
            {
                // SqlParser.g:201:4: ^( ORDERING expr ( ASC )? ( DESC )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ORDERING, "ORDERING"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                // SqlParser.g:201:20: ( ASC )?
                if ( stream_ASC.hasNext() ) {
                    adaptor.addChild(root_1, stream_ASC.nextNode());

                }
                stream_ASC.reset();
                // SqlParser.g:201:27: ( DESC )?
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
    // SqlParser.g:203:1: operation_limited_clause : ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? ;
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
            // SqlParser.g:203:25: ( ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )
            // SqlParser.g:204:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )?
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:204:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==ORDER) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // SqlParser.g:204:4: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                    ORDER168=(Token)match(input,ORDER,FOLLOW_ORDER_in_operation_limited_clause1655); 
                    ORDER168_tree = (Object)adaptor.create(ORDER168);
                    adaptor.addChild(root_0, ORDER168_tree);

                    BY169=(Token)match(input,BY,FOLLOW_BY_in_operation_limited_clause1657); 
                    BY169_tree = (Object)adaptor.create(BY169);
                    adaptor.addChild(root_0, BY169_tree);

                    pushFollow(FOLLOW_ordering_term_in_operation_limited_clause1659);
                    ordering_term170=ordering_term();

                    state._fsp--;

                    adaptor.addChild(root_0, ordering_term170.getTree());
                    // SqlParser.g:204:27: ( COMMA ordering_term )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==COMMA) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // SqlParser.g:204:28: COMMA ordering_term
                    	    {
                    	    COMMA171=(Token)match(input,COMMA,FOLLOW_COMMA_in_operation_limited_clause1662); 
                    	    COMMA171_tree = (Object)adaptor.create(COMMA171);
                    	    adaptor.addChild(root_0, COMMA171_tree);

                    	    pushFollow(FOLLOW_ordering_term_in_operation_limited_clause1664);
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

            LIMIT173=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_operation_limited_clause1672); 
            LIMIT173_tree = (Object)adaptor.create(LIMIT173);
            adaptor.addChild(root_0, LIMIT173_tree);

            limit=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation_limited_clause1676); 
            limit_tree = (Object)adaptor.create(limit);
            adaptor.addChild(root_0, limit_tree);

            // SqlParser.g:205:23: ( ( OFFSET | COMMA ) offset= INTEGER )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==COMMA||LA54_0==OFFSET) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // SqlParser.g:205:24: ( OFFSET | COMMA ) offset= INTEGER
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

                    offset=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation_limited_clause1689); 
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
    // SqlParser.g:208:1: select_stmt : select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )? -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? ) ;
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
            // SqlParser.g:208:12: ( select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )? -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? ) )
            // SqlParser.g:208:14: select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )?
            {
            pushFollow(FOLLOW_select_list_in_select_stmt1699);
            select_list175=select_list();

            state._fsp--;

            stream_select_list.add(select_list175.getTree());
            // SqlParser.g:209:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==ORDER) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // SqlParser.g:209:4: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                    ORDER176=(Token)match(input,ORDER,FOLLOW_ORDER_in_select_stmt1704);  
                    stream_ORDER.add(ORDER176);

                    BY177=(Token)match(input,BY,FOLLOW_BY_in_select_stmt1706);  
                    stream_BY.add(BY177);

                    pushFollow(FOLLOW_ordering_term_in_select_stmt1708);
                    ordering_term178=ordering_term();

                    state._fsp--;

                    stream_ordering_term.add(ordering_term178.getTree());
                    // SqlParser.g:209:27: ( COMMA ordering_term )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==COMMA) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // SqlParser.g:209:28: COMMA ordering_term
                    	    {
                    	    COMMA179=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_stmt1711);  
                    	    stream_COMMA.add(COMMA179);

                    	    pushFollow(FOLLOW_ordering_term_in_select_stmt1713);
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

            // SqlParser.g:210:3: ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==LIMIT) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // SqlParser.g:210:4: LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )?
                    {
                    LIMIT181=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_select_stmt1722);  
                    stream_LIMIT.add(LIMIT181);

                    limit=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt1726);  
                    stream_INTEGER.add(limit);

                    // SqlParser.g:210:24: ( ( OFFSET | COMMA ) offset= INTEGER )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==COMMA||LA58_0==OFFSET) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // SqlParser.g:210:25: ( OFFSET | COMMA ) offset= INTEGER
                            {
                            // SqlParser.g:210:25: ( OFFSET | COMMA )
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
                                    // SqlParser.g:210:26: OFFSET
                                    {
                                    OFFSET182=(Token)match(input,OFFSET,FOLLOW_OFFSET_in_select_stmt1730);  
                                    stream_OFFSET.add(OFFSET182);


                                    }
                                    break;
                                case 2 :
                                    // SqlParser.g:210:35: COMMA
                                    {
                                    COMMA183=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_stmt1734);  
                                    stream_COMMA.add(COMMA183);


                                    }
                                    break;

                            }

                            offset=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt1739);  
                            stream_INTEGER.add(offset);


                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: select_list, ORDER, ordering_term, LIMIT, offset, limit
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
            // 211:1: -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? )
            {
                // SqlParser.g:211:4: ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECT, "SELECT"), root_1);

                adaptor.addChild(root_1, stream_select_list.nextTree());
                // SqlParser.g:212:22: ( ^( ORDER ( ordering_term )+ ) )?
                if ( stream_ORDER.hasNext()||stream_ordering_term.hasNext() ) {
                    // SqlParser.g:212:22: ^( ORDER ( ordering_term )+ )
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
                // SqlParser.g:212:47: ( ^( LIMIT $limit ( $offset)? ) )?
                if ( stream_LIMIT.hasNext()||stream_offset.hasNext()||stream_limit.hasNext() ) {
                    // SqlParser.g:212:47: ^( LIMIT $limit ( $offset)? )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_LIMIT.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_limit.nextNode());
                    // SqlParser.g:212:62: ( $offset)?
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
    // SqlParser.g:215:1: select_list : select_core ( select_op select_core )* ;
    public final SqlParser.select_list_return select_list() throws RecognitionException {
        SqlParser.select_list_return retval = new SqlParser.select_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.select_core_return select_core184 = null;

        SqlParser.select_op_return select_op185 = null;

        SqlParser.select_core_return select_core186 = null;



        try {
            // SqlParser.g:215:12: ( select_core ( select_op select_core )* )
            // SqlParser.g:216:3: select_core ( select_op select_core )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_select_core_in_select_list1784);
            select_core184=select_core();

            state._fsp--;

            adaptor.addChild(root_0, select_core184.getTree());
            // SqlParser.g:216:15: ( select_op select_core )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==EXCEPT||LA60_0==INTERSECT||LA60_0==UNION) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // SqlParser.g:216:16: select_op select_core
            	    {
            	    pushFollow(FOLLOW_select_op_in_select_list1787);
            	    select_op185=select_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(select_op185.getTree(), root_0);
            	    pushFollow(FOLLOW_select_core_in_select_list1790);
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
    // SqlParser.g:218:1: select_op : ( UNION ( ALL )? | INTERSECT | EXCEPT );
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
            // SqlParser.g:218:10: ( UNION ( ALL )? | INTERSECT | EXCEPT )
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
                    // SqlParser.g:218:12: UNION ( ALL )?
                    {
                    root_0 = (Object)adaptor.nil();

                    UNION187=(Token)match(input,UNION,FOLLOW_UNION_in_select_op1799); 
                    UNION187_tree = (Object)adaptor.create(UNION187);
                    root_0 = (Object)adaptor.becomeRoot(UNION187_tree, root_0);

                    // SqlParser.g:218:19: ( ALL )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==ALL) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // SqlParser.g:218:20: ALL
                            {
                            ALL188=(Token)match(input,ALL,FOLLOW_ALL_in_select_op1803); 
                            ALL188_tree = (Object)adaptor.create(ALL188);
                            adaptor.addChild(root_0, ALL188_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:218:28: INTERSECT
                    {
                    root_0 = (Object)adaptor.nil();

                    INTERSECT189=(Token)match(input,INTERSECT,FOLLOW_INTERSECT_in_select_op1809); 
                    INTERSECT189_tree = (Object)adaptor.create(INTERSECT189);
                    adaptor.addChild(root_0, INTERSECT189_tree);


                    }
                    break;
                case 3 :
                    // SqlParser.g:218:40: EXCEPT
                    {
                    root_0 = (Object)adaptor.nil();

                    EXCEPT190=(Token)match(input,EXCEPT,FOLLOW_EXCEPT_in_select_op1813); 
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
    // SqlParser.g:220:1: select_core : SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )? -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? ) ;
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
            // SqlParser.g:220:12: ( SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )? -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? ) )
            // SqlParser.g:221:3: SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )?
            {
            SELECT191=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_core1822);  
            stream_SELECT.add(SELECT191);

            // SqlParser.g:221:10: ( ALL | DISTINCT )?
            int alt63=3;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // SqlParser.g:221:11: ALL
                    {
                    ALL192=(Token)match(input,ALL,FOLLOW_ALL_in_select_core1825);  
                    stream_ALL.add(ALL192);


                    }
                    break;
                case 2 :
                    // SqlParser.g:221:17: DISTINCT
                    {
                    DISTINCT193=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_select_core1829);  
                    stream_DISTINCT.add(DISTINCT193);


                    }
                    break;

            }

            pushFollow(FOLLOW_result_column_in_select_core1833);
            result_column194=result_column();

            state._fsp--;

            stream_result_column.add(result_column194.getTree());
            // SqlParser.g:221:42: ( COMMA result_column )*
            loop64:
            do {
                int alt64=2;
                alt64 = dfa64.predict(input);
                switch (alt64) {
            	case 1 :
            	    // SqlParser.g:221:43: COMMA result_column
            	    {
            	    COMMA195=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_core1836);  
            	    stream_COMMA.add(COMMA195);

            	    pushFollow(FOLLOW_result_column_in_select_core1838);
            	    result_column196=result_column();

            	    state._fsp--;

            	    stream_result_column.add(result_column196.getTree());

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            // SqlParser.g:221:65: ( FROM join_source )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // SqlParser.g:221:66: FROM join_source
                    {
                    FROM197=(Token)match(input,FROM,FOLLOW_FROM_in_select_core1843);  
                    stream_FROM.add(FROM197);

                    pushFollow(FOLLOW_join_source_in_select_core1845);
                    join_source198=join_source();

                    state._fsp--;

                    stream_join_source.add(join_source198.getTree());

                    }
                    break;

            }

            // SqlParser.g:221:85: ( WHERE where_expr= expr )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // SqlParser.g:221:86: WHERE where_expr= expr
                    {
                    WHERE199=(Token)match(input,WHERE,FOLLOW_WHERE_in_select_core1850);  
                    stream_WHERE.add(WHERE199);

                    pushFollow(FOLLOW_expr_in_select_core1854);
                    where_expr=expr();

                    state._fsp--;

                    stream_expr.add(where_expr.getTree());

                    }
                    break;

            }

            // SqlParser.g:222:3: ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==GROUP) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // SqlParser.g:222:5: GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )?
                    {
                    GROUP200=(Token)match(input,GROUP,FOLLOW_GROUP_in_select_core1862);  
                    stream_GROUP.add(GROUP200);

                    BY201=(Token)match(input,BY,FOLLOW_BY_in_select_core1864);  
                    stream_BY.add(BY201);

                    pushFollow(FOLLOW_ordering_term_in_select_core1866);
                    ordering_term202=ordering_term();

                    state._fsp--;

                    stream_ordering_term.add(ordering_term202.getTree());
                    // SqlParser.g:222:28: ( COMMA ordering_term )*
                    loop67:
                    do {
                        int alt67=2;
                        alt67 = dfa67.predict(input);
                        switch (alt67) {
                    	case 1 :
                    	    // SqlParser.g:222:29: COMMA ordering_term
                    	    {
                    	    COMMA203=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_core1869);  
                    	    stream_COMMA.add(COMMA203);

                    	    pushFollow(FOLLOW_ordering_term_in_select_core1871);
                    	    ordering_term204=ordering_term();

                    	    state._fsp--;

                    	    stream_ordering_term.add(ordering_term204.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    // SqlParser.g:222:51: ( HAVING having_expr= expr )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==HAVING) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // SqlParser.g:222:52: HAVING having_expr= expr
                            {
                            HAVING205=(Token)match(input,HAVING,FOLLOW_HAVING_in_select_core1876);  
                            stream_HAVING.add(HAVING205);

                            pushFollow(FOLLOW_expr_in_select_core1880);
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
            // elements: DISTINCT, WHERE, having_expr, ordering_term, GROUP, where_expr, join_source, HAVING, result_column, FROM
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
            // 223:1: -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? )
            {
                // SqlParser.g:223:4: ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECT_CORE, "SELECT_CORE"), root_1);

                // SqlParser.g:224:15: ( DISTINCT )?
                if ( stream_DISTINCT.hasNext() ) {
                    adaptor.addChild(root_1, stream_DISTINCT.nextNode());

                }
                stream_DISTINCT.reset();
                // SqlParser.g:224:27: ^( COLUMNS ( result_column )+ )
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
                // SqlParser.g:224:53: ( ^( FROM join_source ) )?
                if ( stream_join_source.hasNext()||stream_FROM.hasNext() ) {
                    // SqlParser.g:224:53: ^( FROM join_source )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_FROM.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_join_source.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_join_source.reset();
                stream_FROM.reset();
                // SqlParser.g:224:74: ( ^( WHERE $where_expr) )?
                if ( stream_WHERE.hasNext()||stream_where_expr.hasNext() ) {
                    // SqlParser.g:224:74: ^( WHERE $where_expr)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_WHERE.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_where_expr.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_WHERE.reset();
                stream_where_expr.reset();
                // SqlParser.g:225:3: ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )?
                if ( stream_having_expr.hasNext()||stream_ordering_term.hasNext()||stream_GROUP.hasNext()||stream_HAVING.hasNext() ) {
                    // SqlParser.g:225:3: ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? )
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
                    // SqlParser.g:225:26: ( ^( HAVING $having_expr) )?
                    if ( stream_having_expr.hasNext()||stream_HAVING.hasNext() ) {
                        // SqlParser.g:225:26: ^( HAVING $having_expr)
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
                stream_having_expr.reset();
                stream_ordering_term.reset();
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
    // SqlParser.g:228:1: result_column : ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) );
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
            // SqlParser.g:229:3: ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) )
            int alt72=3;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // SqlParser.g:229:5: ASTERISK
                    {
                    root_0 = (Object)adaptor.nil();

                    ASTERISK206=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_result_column1950); 
                    ASTERISK206_tree = (Object)adaptor.create(ASTERISK206);
                    adaptor.addChild(root_0, ASTERISK206_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:230:5: table_name= id DOT ASTERISK
                    {
                    pushFollow(FOLLOW_id_in_result_column1958);
                    table_name=id();

                    state._fsp--;

                    stream_id.add(table_name.getTree());
                    DOT207=(Token)match(input,DOT,FOLLOW_DOT_in_result_column1960);  
                    stream_DOT.add(DOT207);

                    ASTERISK208=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_result_column1962);  
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
                    // 230:32: -> ^( ASTERISK $table_name)
                    {
                        // SqlParser.g:230:35: ^( ASTERISK $table_name)
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
                    // SqlParser.g:231:5: expr ( ( AS )? column_alias= id )?
                    {
                    pushFollow(FOLLOW_expr_in_result_column1977);
                    expr209=expr();

                    state._fsp--;

                    stream_expr.add(expr209.getTree());
                    // SqlParser.g:231:10: ( ( AS )? column_alias= id )?
                    int alt71=2;
                    alt71 = dfa71.predict(input);
                    switch (alt71) {
                        case 1 :
                            // SqlParser.g:231:11: ( AS )? column_alias= id
                            {
                            // SqlParser.g:231:11: ( AS )?
                            int alt70=2;
                            alt70 = dfa70.predict(input);
                            switch (alt70) {
                                case 1 :
                                    // SqlParser.g:231:12: AS
                                    {
                                    AS210=(Token)match(input,AS,FOLLOW_AS_in_result_column1981);  
                                    stream_AS.add(AS210);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_id_in_result_column1987);
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
                    // 231:35: -> ^( ALIAS expr ( $column_alias)? )
                    {
                        // SqlParser.g:231:38: ^( ALIAS expr ( $column_alias)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // SqlParser.g:231:51: ( $column_alias)?
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
    // SqlParser.g:233:1: join_source : single_source ( join_op single_source ( join_constraint )? )* ;
    public final SqlParser.join_source_return join_source() throws RecognitionException {
        SqlParser.join_source_return retval = new SqlParser.join_source_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.single_source_return single_source211 = null;

        SqlParser.join_op_return join_op212 = null;

        SqlParser.single_source_return single_source213 = null;

        SqlParser.join_constraint_return join_constraint214 = null;



        try {
            // SqlParser.g:233:12: ( single_source ( join_op single_source ( join_constraint )? )* )
            // SqlParser.g:233:14: single_source ( join_op single_source ( join_constraint )? )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_single_source_in_join_source2008);
            single_source211=single_source();

            state._fsp--;

            adaptor.addChild(root_0, single_source211.getTree());
            // SqlParser.g:233:28: ( join_op single_source ( join_constraint )? )*
            loop74:
            do {
                int alt74=2;
                alt74 = dfa74.predict(input);
                switch (alt74) {
            	case 1 :
            	    // SqlParser.g:233:29: join_op single_source ( join_constraint )?
            	    {
            	    pushFollow(FOLLOW_join_op_in_join_source2011);
            	    join_op212=join_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(join_op212.getTree(), root_0);
            	    pushFollow(FOLLOW_single_source_in_join_source2014);
            	    single_source213=single_source();

            	    state._fsp--;

            	    adaptor.addChild(root_0, single_source213.getTree());
            	    // SqlParser.g:233:52: ( join_constraint )?
            	    int alt73=2;
            	    alt73 = dfa73.predict(input);
            	    switch (alt73) {
            	        case 1 :
            	            // SqlParser.g:233:53: join_constraint
            	            {
            	            pushFollow(FOLLOW_join_constraint_in_join_source2017);
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
    // SqlParser.g:235:1: single_source : ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN );
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
            // SqlParser.g:236:3: ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN )
            int alt81=3;
            alt81 = dfa81.predict(input);
            switch (alt81) {
                case 1 :
                    // SqlParser.g:236:5: (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )?
                    {
                    // SqlParser.g:236:5: (database_name= id DOT )?
                    int alt75=2;
                    alt75 = dfa75.predict(input);
                    switch (alt75) {
                        case 1 :
                            // SqlParser.g:236:6: database_name= id DOT
                            {
                            pushFollow(FOLLOW_id_in_single_source2034);
                            database_name=id();

                            state._fsp--;

                            stream_id.add(database_name.getTree());
                            DOT215=(Token)match(input,DOT,FOLLOW_DOT_in_single_source2036);  
                            stream_DOT.add(DOT215);


                            }
                            break;

                    }

                    table_name=(Token)match(input,ID,FOLLOW_ID_in_single_source2042);  
                    stream_ID.add(table_name);

                    // SqlParser.g:236:43: ( ( AS )? table_alias= ID )?
                    int alt77=2;
                    alt77 = dfa77.predict(input);
                    switch (alt77) {
                        case 1 :
                            // SqlParser.g:236:44: ( AS )? table_alias= ID
                            {
                            // SqlParser.g:236:44: ( AS )?
                            int alt76=2;
                            int LA76_0 = input.LA(1);

                            if ( (LA76_0==AS) ) {
                                alt76=1;
                            }
                            switch (alt76) {
                                case 1 :
                                    // SqlParser.g:236:45: AS
                                    {
                                    AS216=(Token)match(input,AS,FOLLOW_AS_in_single_source2046);  
                                    stream_AS.add(AS216);


                                    }
                                    break;

                            }

                            table_alias=(Token)match(input,ID,FOLLOW_ID_in_single_source2052);  
                            stream_ID.add(table_alias);


                            }
                            break;

                    }

                    // SqlParser.g:236:67: ( INDEXED BY index_name= id | NOT INDEXED )?
                    int alt78=3;
                    alt78 = dfa78.predict(input);
                    switch (alt78) {
                        case 1 :
                            // SqlParser.g:236:68: INDEXED BY index_name= id
                            {
                            INDEXED217=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_single_source2057);  
                            stream_INDEXED.add(INDEXED217);

                            BY218=(Token)match(input,BY,FOLLOW_BY_in_single_source2059);  
                            stream_BY.add(BY218);

                            pushFollow(FOLLOW_id_in_single_source2063);
                            index_name=id();

                            state._fsp--;

                            stream_id.add(index_name.getTree());

                            }
                            break;
                        case 2 :
                            // SqlParser.g:236:95: NOT INDEXED
                            {
                            NOT219=(Token)match(input,NOT,FOLLOW_NOT_in_single_source2067);  
                            stream_NOT.add(NOT219);

                            INDEXED220=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_single_source2069);  
                            stream_INDEXED.add(INDEXED220);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: table_alias, database_name, INDEXED, table_name, index_name, NOT
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
                    // 237:3: -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? )
                    {
                        // SqlParser.g:237:6: ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        // SqlParser.g:237:14: ^( $table_name ( $database_name)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                        // SqlParser.g:237:28: ( $database_name)?
                        if ( stream_database_name.hasNext() ) {
                            adaptor.addChild(root_2, stream_database_name.nextTree());

                        }
                        stream_database_name.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // SqlParser.g:237:45: ( $table_alias)?
                        if ( stream_table_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_table_alias.nextNode());

                        }
                        stream_table_alias.reset();
                        // SqlParser.g:237:59: ( ^( INDEXED ( NOT )? ( $index_name)? ) )?
                        if ( stream_INDEXED.hasNext()||stream_index_name.hasNext()||stream_NOT.hasNext() ) {
                            // SqlParser.g:237:59: ^( INDEXED ( NOT )? ( $index_name)? )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(stream_INDEXED.nextNode(), root_2);

                            // SqlParser.g:237:69: ( NOT )?
                            if ( stream_NOT.hasNext() ) {
                                adaptor.addChild(root_2, stream_NOT.nextNode());

                            }
                            stream_NOT.reset();
                            // SqlParser.g:237:74: ( $index_name)?
                            if ( stream_index_name.hasNext() ) {
                                adaptor.addChild(root_2, stream_index_name.nextTree());

                            }
                            stream_index_name.reset();

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_INDEXED.reset();
                        stream_index_name.reset();
                        stream_NOT.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // SqlParser.g:238:5: LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )?
                    {
                    LPAREN221=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_single_source2110);  
                    stream_LPAREN.add(LPAREN221);

                    pushFollow(FOLLOW_select_stmt_in_single_source2112);
                    select_stmt222=select_stmt();

                    state._fsp--;

                    stream_select_stmt.add(select_stmt222.getTree());
                    RPAREN223=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_single_source2114);  
                    stream_RPAREN.add(RPAREN223);

                    // SqlParser.g:238:31: ( ( AS )? table_alias= ID )?
                    int alt80=2;
                    alt80 = dfa80.predict(input);
                    switch (alt80) {
                        case 1 :
                            // SqlParser.g:238:32: ( AS )? table_alias= ID
                            {
                            // SqlParser.g:238:32: ( AS )?
                            int alt79=2;
                            int LA79_0 = input.LA(1);

                            if ( (LA79_0==AS) ) {
                                alt79=1;
                            }
                            switch (alt79) {
                                case 1 :
                                    // SqlParser.g:238:33: AS
                                    {
                                    AS224=(Token)match(input,AS,FOLLOW_AS_in_single_source2118);  
                                    stream_AS.add(AS224);


                                    }
                                    break;

                            }

                            table_alias=(Token)match(input,ID,FOLLOW_ID_in_single_source2124);  
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
                    // 239:3: -> ^( ALIAS select_stmt ( $table_alias)? )
                    {
                        // SqlParser.g:239:6: ^( ALIAS select_stmt ( $table_alias)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        adaptor.addChild(root_1, stream_select_stmt.nextTree());
                        // SqlParser.g:239:26: ( $table_alias)?
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
                    // SqlParser.g:240:5: LPAREN join_source RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN225=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_single_source2146); 
                    pushFollow(FOLLOW_join_source_in_single_source2149);
                    join_source226=join_source();

                    state._fsp--;

                    adaptor.addChild(root_0, join_source226.getTree());
                    RPAREN227=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_single_source2151); 

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
    // SqlParser.g:242:1: join_op : ( COMMA | ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN );
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
            // SqlParser.g:243:3: ( COMMA | ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN )
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
                    // SqlParser.g:243:5: COMMA
                    {
                    root_0 = (Object)adaptor.nil();

                    COMMA228=(Token)match(input,COMMA,FOLLOW_COMMA_in_join_op2162); 
                    COMMA228_tree = (Object)adaptor.create(COMMA228);
                    adaptor.addChild(root_0, COMMA228_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:244:5: ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:244:5: ( NATURAL )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==NATURAL) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // SqlParser.g:244:6: NATURAL
                            {
                            NATURAL229=(Token)match(input,NATURAL,FOLLOW_NATURAL_in_join_op2169); 
                            NATURAL229_tree = (Object)adaptor.create(NATURAL229);
                            adaptor.addChild(root_0, NATURAL229_tree);


                            }
                            break;

                    }

                    // SqlParser.g:244:16: ( ( LEFT )? ( OUTER )? | INNER | CROSS )
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
                            // SqlParser.g:244:17: ( LEFT )? ( OUTER )?
                            {
                            // SqlParser.g:244:17: ( LEFT )?
                            int alt83=2;
                            int LA83_0 = input.LA(1);

                            if ( (LA83_0==LEFT) ) {
                                alt83=1;
                            }
                            switch (alt83) {
                                case 1 :
                                    // SqlParser.g:244:18: LEFT
                                    {
                                    LEFT230=(Token)match(input,LEFT,FOLLOW_LEFT_in_join_op2175); 
                                    LEFT230_tree = (Object)adaptor.create(LEFT230);
                                    adaptor.addChild(root_0, LEFT230_tree);


                                    }
                                    break;

                            }

                            // SqlParser.g:244:25: ( OUTER )?
                            int alt84=2;
                            int LA84_0 = input.LA(1);

                            if ( (LA84_0==OUTER) ) {
                                alt84=1;
                            }
                            switch (alt84) {
                                case 1 :
                                    // SqlParser.g:244:26: OUTER
                                    {
                                    OUTER231=(Token)match(input,OUTER,FOLLOW_OUTER_in_join_op2180); 
                                    OUTER231_tree = (Object)adaptor.create(OUTER231);
                                    adaptor.addChild(root_0, OUTER231_tree);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // SqlParser.g:244:36: INNER
                            {
                            INNER232=(Token)match(input,INNER,FOLLOW_INNER_in_join_op2186); 
                            INNER232_tree = (Object)adaptor.create(INNER232);
                            adaptor.addChild(root_0, INNER232_tree);


                            }
                            break;
                        case 3 :
                            // SqlParser.g:244:44: CROSS
                            {
                            CROSS233=(Token)match(input,CROSS,FOLLOW_CROSS_in_join_op2190); 
                            CROSS233_tree = (Object)adaptor.create(CROSS233);
                            adaptor.addChild(root_0, CROSS233_tree);


                            }
                            break;

                    }

                    JOIN234=(Token)match(input,JOIN,FOLLOW_JOIN_in_join_op2193); 
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
    // SqlParser.g:246:1: join_constraint : ( ON expr | USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN -> ^( USING ( $column_names)+ ) );
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
            // SqlParser.g:247:3: ( ON expr | USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN -> ^( USING ( $column_names)+ ) )
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
                    // SqlParser.g:247:5: ON expr
                    {
                    root_0 = (Object)adaptor.nil();

                    ON235=(Token)match(input,ON,FOLLOW_ON_in_join_constraint2204); 
                    ON235_tree = (Object)adaptor.create(ON235);
                    root_0 = (Object)adaptor.becomeRoot(ON235_tree, root_0);

                    pushFollow(FOLLOW_expr_in_join_constraint2207);
                    expr236=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr236.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:248:5: USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                    {
                    USING237=(Token)match(input,USING,FOLLOW_USING_in_join_constraint2213);  
                    stream_USING.add(USING237);

                    LPAREN238=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_join_constraint2215);  
                    stream_LPAREN.add(LPAREN238);

                    pushFollow(FOLLOW_id_in_join_constraint2219);
                    column_names=id();

                    state._fsp--;

                    stream_id.add(column_names.getTree());
                    if (list_column_names==null) list_column_names=new ArrayList();
                    list_column_names.add(column_names.getTree());

                    // SqlParser.g:248:35: ( COMMA column_names+= id )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==COMMA) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // SqlParser.g:248:36: COMMA column_names+= id
                    	    {
                    	    COMMA239=(Token)match(input,COMMA,FOLLOW_COMMA_in_join_constraint2222);  
                    	    stream_COMMA.add(COMMA239);

                    	    pushFollow(FOLLOW_id_in_join_constraint2226);
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

                    RPAREN240=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_join_constraint2230);  
                    stream_RPAREN.add(RPAREN240);



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
                    // 248:68: -> ^( USING ( $column_names)+ )
                    {
                        // SqlParser.g:248:71: ^( USING ( $column_names)+ )
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
    // SqlParser.g:251:1: insert_stmt : ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES ) ;
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
            // SqlParser.g:251:12: ( ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES ) )
            // SqlParser.g:251:14: ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES )
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:251:14: ( INSERT ( operation_conflict_clause )? | REPLACE )
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
                    // SqlParser.g:251:15: INSERT ( operation_conflict_clause )?
                    {
                    INSERT241=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_stmt2249); 
                    INSERT241_tree = (Object)adaptor.create(INSERT241);
                    adaptor.addChild(root_0, INSERT241_tree);

                    // SqlParser.g:251:22: ( operation_conflict_clause )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==OR) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // SqlParser.g:251:23: operation_conflict_clause
                            {
                            pushFollow(FOLLOW_operation_conflict_clause_in_insert_stmt2252);
                            operation_conflict_clause242=operation_conflict_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, operation_conflict_clause242.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:251:53: REPLACE
                    {
                    REPLACE243=(Token)match(input,REPLACE,FOLLOW_REPLACE_in_insert_stmt2258); 
                    REPLACE243_tree = (Object)adaptor.create(REPLACE243);
                    adaptor.addChild(root_0, REPLACE243_tree);


                    }
                    break;

            }

            INTO244=(Token)match(input,INTO,FOLLOW_INTO_in_insert_stmt2261); 
            INTO244_tree = (Object)adaptor.create(INTO244);
            adaptor.addChild(root_0, INTO244_tree);

            // SqlParser.g:251:67: (database_name= id DOT )?
            int alt91=2;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // SqlParser.g:251:68: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_insert_stmt2266);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT245=(Token)match(input,DOT,FOLLOW_DOT_in_insert_stmt2268); 
                    DOT245_tree = (Object)adaptor.create(DOT245);
                    adaptor.addChild(root_0, DOT245_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_insert_stmt2274);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:252:3: ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES )
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
                    // SqlParser.g:252:5: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt )
                    {
                    // SqlParser.g:252:5: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==LPAREN) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // SqlParser.g:252:6: LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                            {
                            LPAREN246=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt2281); 
                            LPAREN246_tree = (Object)adaptor.create(LPAREN246);
                            adaptor.addChild(root_0, LPAREN246_tree);

                            pushFollow(FOLLOW_id_in_insert_stmt2285);
                            column_names=id();

                            state._fsp--;

                            adaptor.addChild(root_0, column_names.getTree());
                            if (list_column_names==null) list_column_names=new ArrayList();
                            list_column_names.add(column_names.getTree());

                            // SqlParser.g:252:30: ( COMMA column_names+= id )*
                            loop92:
                            do {
                                int alt92=2;
                                int LA92_0 = input.LA(1);

                                if ( (LA92_0==COMMA) ) {
                                    alt92=1;
                                }


                                switch (alt92) {
                            	case 1 :
                            	    // SqlParser.g:252:31: COMMA column_names+= id
                            	    {
                            	    COMMA247=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt2288); 
                            	    COMMA247_tree = (Object)adaptor.create(COMMA247);
                            	    adaptor.addChild(root_0, COMMA247_tree);

                            	    pushFollow(FOLLOW_id_in_insert_stmt2292);
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

                            RPAREN248=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt2296); 
                            RPAREN248_tree = (Object)adaptor.create(RPAREN248);
                            adaptor.addChild(root_0, RPAREN248_tree);


                            }
                            break;

                    }

                    // SqlParser.g:253:5: ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt )
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
                            // SqlParser.g:253:6: VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN
                            {
                            VALUES249=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt2305); 
                            VALUES249_tree = (Object)adaptor.create(VALUES249);
                            adaptor.addChild(root_0, VALUES249_tree);

                            LPAREN250=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt2307); 
                            LPAREN250_tree = (Object)adaptor.create(LPAREN250);
                            adaptor.addChild(root_0, LPAREN250_tree);

                            pushFollow(FOLLOW_expr_in_insert_stmt2311);
                            values=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, values.getTree());
                            if (list_values==null) list_values=new ArrayList();
                            list_values.add(values.getTree());

                            // SqlParser.g:253:33: ( COMMA values+= expr )*
                            loop94:
                            do {
                                int alt94=2;
                                int LA94_0 = input.LA(1);

                                if ( (LA94_0==COMMA) ) {
                                    alt94=1;
                                }


                                switch (alt94) {
                            	case 1 :
                            	    // SqlParser.g:253:34: COMMA values+= expr
                            	    {
                            	    COMMA251=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt2314); 
                            	    COMMA251_tree = (Object)adaptor.create(COMMA251);
                            	    adaptor.addChild(root_0, COMMA251_tree);

                            	    pushFollow(FOLLOW_expr_in_insert_stmt2318);
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

                            RPAREN252=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt2322); 
                            RPAREN252_tree = (Object)adaptor.create(RPAREN252);
                            adaptor.addChild(root_0, RPAREN252_tree);


                            }
                            break;
                        case 2 :
                            // SqlParser.g:253:64: select_stmt
                            {
                            pushFollow(FOLLOW_select_stmt_in_insert_stmt2326);
                            select_stmt253=select_stmt();

                            state._fsp--;

                            adaptor.addChild(root_0, select_stmt253.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:254:5: DEFAULT VALUES
                    {
                    DEFAULT254=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_insert_stmt2333); 
                    DEFAULT254_tree = (Object)adaptor.create(DEFAULT254);
                    adaptor.addChild(root_0, DEFAULT254_tree);

                    VALUES255=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt2335); 
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
    // SqlParser.g:257:1: update_stmt : UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )? ;
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
            // SqlParser.g:257:12: ( UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )? )
            // SqlParser.g:257:14: UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )?
            {
            root_0 = (Object)adaptor.nil();

            UPDATE256=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_update_stmt2345); 
            UPDATE256_tree = (Object)adaptor.create(UPDATE256);
            adaptor.addChild(root_0, UPDATE256_tree);

            // SqlParser.g:257:21: ( operation_conflict_clause )?
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
                    // SqlParser.g:257:22: operation_conflict_clause
                    {
                    pushFollow(FOLLOW_operation_conflict_clause_in_update_stmt2348);
                    operation_conflict_clause257=operation_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_conflict_clause257.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_qualified_table_name_in_update_stmt2352);
            qualified_table_name258=qualified_table_name();

            state._fsp--;

            adaptor.addChild(root_0, qualified_table_name258.getTree());
            SET259=(Token)match(input,SET,FOLLOW_SET_in_update_stmt2356); 
            SET259_tree = (Object)adaptor.create(SET259);
            adaptor.addChild(root_0, SET259_tree);

            pushFollow(FOLLOW_update_set_in_update_stmt2360);
            values=update_set();

            state._fsp--;

            adaptor.addChild(root_0, values.getTree());
            if (list_values==null) list_values=new ArrayList();
            list_values.add(values.getTree());

            // SqlParser.g:258:26: ( COMMA values+= update_set )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==COMMA) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // SqlParser.g:258:27: COMMA values+= update_set
            	    {
            	    COMMA260=(Token)match(input,COMMA,FOLLOW_COMMA_in_update_stmt2363); 
            	    COMMA260_tree = (Object)adaptor.create(COMMA260);
            	    adaptor.addChild(root_0, COMMA260_tree);

            	    pushFollow(FOLLOW_update_set_in_update_stmt2367);
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

            // SqlParser.g:258:54: ( WHERE expr )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==WHERE) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // SqlParser.g:258:55: WHERE expr
                    {
                    WHERE261=(Token)match(input,WHERE,FOLLOW_WHERE_in_update_stmt2372); 
                    WHERE261_tree = (Object)adaptor.create(WHERE261);
                    adaptor.addChild(root_0, WHERE261_tree);

                    pushFollow(FOLLOW_expr_in_update_stmt2374);
                    expr262=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr262.getTree());

                    }
                    break;

            }

            // SqlParser.g:258:68: ( operation_limited_clause )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==LIMIT||LA100_0==ORDER) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // SqlParser.g:258:69: operation_limited_clause
                    {
                    pushFollow(FOLLOW_operation_limited_clause_in_update_stmt2379);
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
    // SqlParser.g:260:1: update_set : column_name= id EQUALS expr ;
    public final SqlParser.update_set_return update_set() throws RecognitionException {
        SqlParser.update_set_return retval = new SqlParser.update_set_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EQUALS264=null;
        SqlParser.id_return column_name = null;

        SqlParser.expr_return expr265 = null;


        Object EQUALS264_tree=null;

        try {
            // SqlParser.g:260:11: (column_name= id EQUALS expr )
            // SqlParser.g:260:13: column_name= id EQUALS expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_update_set2390);
            column_name=id();

            state._fsp--;

            adaptor.addChild(root_0, column_name.getTree());
            EQUALS264=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_update_set2392); 
            EQUALS264_tree = (Object)adaptor.create(EQUALS264);
            adaptor.addChild(root_0, EQUALS264_tree);

            pushFollow(FOLLOW_expr_in_update_set2394);
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
    // SqlParser.g:263:1: delete_stmt : DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )? ;
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
            // SqlParser.g:263:12: ( DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )? )
            // SqlParser.g:263:14: DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )?
            {
            root_0 = (Object)adaptor.nil();

            DELETE266=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_stmt2402); 
            DELETE266_tree = (Object)adaptor.create(DELETE266);
            adaptor.addChild(root_0, DELETE266_tree);

            FROM267=(Token)match(input,FROM,FOLLOW_FROM_in_delete_stmt2404); 
            FROM267_tree = (Object)adaptor.create(FROM267);
            adaptor.addChild(root_0, FROM267_tree);

            pushFollow(FOLLOW_qualified_table_name_in_delete_stmt2406);
            qualified_table_name268=qualified_table_name();

            state._fsp--;

            adaptor.addChild(root_0, qualified_table_name268.getTree());
            // SqlParser.g:263:47: ( WHERE expr )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==WHERE) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // SqlParser.g:263:48: WHERE expr
                    {
                    WHERE269=(Token)match(input,WHERE,FOLLOW_WHERE_in_delete_stmt2409); 
                    WHERE269_tree = (Object)adaptor.create(WHERE269);
                    adaptor.addChild(root_0, WHERE269_tree);

                    pushFollow(FOLLOW_expr_in_delete_stmt2411);
                    expr270=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr270.getTree());

                    }
                    break;

            }

            // SqlParser.g:263:61: ( operation_limited_clause )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==LIMIT||LA102_0==ORDER) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // SqlParser.g:263:62: operation_limited_clause
                    {
                    pushFollow(FOLLOW_operation_limited_clause_in_delete_stmt2416);
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
    // SqlParser.g:266:1: begin_stmt : BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )? ;
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
            // SqlParser.g:266:11: ( BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )? )
            // SqlParser.g:266:13: BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )?
            {
            root_0 = (Object)adaptor.nil();

            BEGIN272=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_begin_stmt2426); 
            BEGIN272_tree = (Object)adaptor.create(BEGIN272);
            adaptor.addChild(root_0, BEGIN272_tree);

            // SqlParser.g:266:19: ( DEFERRED | IMMEDIATE | EXCLUSIVE )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==DEFERRED||LA103_0==EXCLUSIVE||LA103_0==IMMEDIATE) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // SqlParser.g:
                    {
                    set273=(Token)input.LT(1);
                    if ( input.LA(1)==DEFERRED||input.LA(1)==EXCLUSIVE||input.LA(1)==IMMEDIATE ) {
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

            // SqlParser.g:266:55: ( TRANSACTION )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==TRANSACTION) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // SqlParser.g:266:56: TRANSACTION
                    {
                    TRANSACTION274=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_begin_stmt2442); 
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
    // SqlParser.g:269:1: commit_stmt : ( COMMIT | END ) ( TRANSACTION )? ;
    public final SqlParser.commit_stmt_return commit_stmt() throws RecognitionException {
        SqlParser.commit_stmt_return retval = new SqlParser.commit_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set275=null;
        Token TRANSACTION276=null;

        Object set275_tree=null;
        Object TRANSACTION276_tree=null;

        try {
            // SqlParser.g:269:12: ( ( COMMIT | END ) ( TRANSACTION )? )
            // SqlParser.g:269:14: ( COMMIT | END ) ( TRANSACTION )?
            {
            root_0 = (Object)adaptor.nil();

            set275=(Token)input.LT(1);
            if ( input.LA(1)==COMMIT||input.LA(1)==END ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set275));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // SqlParser.g:269:29: ( TRANSACTION )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==TRANSACTION) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // SqlParser.g:269:30: TRANSACTION
                    {
                    TRANSACTION276=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_commit_stmt2461); 
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
    // SqlParser.g:272:1: rollback_stmt : ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )? ;
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
            // SqlParser.g:272:14: ( ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )? )
            // SqlParser.g:272:16: ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )?
            {
            root_0 = (Object)adaptor.nil();

            ROLLBACK277=(Token)match(input,ROLLBACK,FOLLOW_ROLLBACK_in_rollback_stmt2471); 
            ROLLBACK277_tree = (Object)adaptor.create(ROLLBACK277);
            adaptor.addChild(root_0, ROLLBACK277_tree);

            // SqlParser.g:272:25: ( TRANSACTION )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==TRANSACTION) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // SqlParser.g:272:26: TRANSACTION
                    {
                    TRANSACTION278=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_rollback_stmt2474); 
                    TRANSACTION278_tree = (Object)adaptor.create(TRANSACTION278);
                    adaptor.addChild(root_0, TRANSACTION278_tree);


                    }
                    break;

            }

            // SqlParser.g:272:40: ( TO ( SAVEPOINT )? savepoint_name= id )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==TO) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // SqlParser.g:272:41: TO ( SAVEPOINT )? savepoint_name= id
                    {
                    TO279=(Token)match(input,TO,FOLLOW_TO_in_rollback_stmt2479); 
                    TO279_tree = (Object)adaptor.create(TO279);
                    adaptor.addChild(root_0, TO279_tree);

                    // SqlParser.g:272:44: ( SAVEPOINT )?
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
                            // SqlParser.g:272:45: SAVEPOINT
                            {
                            SAVEPOINT280=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_rollback_stmt2482); 
                            SAVEPOINT280_tree = (Object)adaptor.create(SAVEPOINT280);
                            adaptor.addChild(root_0, SAVEPOINT280_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_id_in_rollback_stmt2488);
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
    // SqlParser.g:275:1: savepoint_stmt : SAVEPOINT savepoint_name= id ;
    public final SqlParser.savepoint_stmt_return savepoint_stmt() throws RecognitionException {
        SqlParser.savepoint_stmt_return retval = new SqlParser.savepoint_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SAVEPOINT281=null;
        SqlParser.id_return savepoint_name = null;


        Object SAVEPOINT281_tree=null;

        try {
            // SqlParser.g:275:15: ( SAVEPOINT savepoint_name= id )
            // SqlParser.g:275:17: SAVEPOINT savepoint_name= id
            {
            root_0 = (Object)adaptor.nil();

            SAVEPOINT281=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_savepoint_stmt2498); 
            SAVEPOINT281_tree = (Object)adaptor.create(SAVEPOINT281);
            adaptor.addChild(root_0, SAVEPOINT281_tree);

            pushFollow(FOLLOW_id_in_savepoint_stmt2502);
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
    // SqlParser.g:278:1: release_stmt : RELEASE ( SAVEPOINT )? savepoint_name= id ;
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
            // SqlParser.g:278:13: ( RELEASE ( SAVEPOINT )? savepoint_name= id )
            // SqlParser.g:278:15: RELEASE ( SAVEPOINT )? savepoint_name= id
            {
            root_0 = (Object)adaptor.nil();

            RELEASE282=(Token)match(input,RELEASE,FOLLOW_RELEASE_in_release_stmt2510); 
            RELEASE282_tree = (Object)adaptor.create(RELEASE282);
            adaptor.addChild(root_0, RELEASE282_tree);

            // SqlParser.g:278:23: ( SAVEPOINT )?
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
                    // SqlParser.g:278:24: SAVEPOINT
                    {
                    SAVEPOINT283=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_release_stmt2513); 
                    SAVEPOINT283_tree = (Object)adaptor.create(SAVEPOINT283);
                    adaptor.addChild(root_0, SAVEPOINT283_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_release_stmt2519);
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
    // SqlParser.g:285:1: table_conflict_clause : ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) ;
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
            // SqlParser.g:285:22: ( ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) )
            // SqlParser.g:285:24: ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE )
            {
            root_0 = (Object)adaptor.nil();

            ON284=(Token)match(input,ON,FOLLOW_ON_in_table_conflict_clause2531); 
            CONFLICT285=(Token)match(input,CONFLICT,FOLLOW_CONFLICT_in_table_conflict_clause2534); 
            CONFLICT285_tree = (Object)adaptor.create(CONFLICT285);
            root_0 = (Object)adaptor.becomeRoot(CONFLICT285_tree, root_0);

            set286=(Token)input.LT(1);
            if ( input.LA(1)==ABORT||input.LA(1)==FAIL||input.LA(1)==IGNORE||input.LA(1)==REPLACE||input.LA(1)==ROLLBACK ) {
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
    // SqlParser.g:289:1: create_virtual_table_stmt : CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )? ;
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
            // SqlParser.g:289:26: ( CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )? )
            // SqlParser.g:289:28: CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            CREATE287=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_virtual_table_stmt2564); 
            CREATE287_tree = (Object)adaptor.create(CREATE287);
            adaptor.addChild(root_0, CREATE287_tree);

            VIRTUAL288=(Token)match(input,VIRTUAL,FOLLOW_VIRTUAL_in_create_virtual_table_stmt2566); 
            VIRTUAL288_tree = (Object)adaptor.create(VIRTUAL288);
            adaptor.addChild(root_0, VIRTUAL288_tree);

            TABLE289=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_virtual_table_stmt2568); 
            TABLE289_tree = (Object)adaptor.create(TABLE289);
            adaptor.addChild(root_0, TABLE289_tree);

            // SqlParser.g:289:49: (database_name= id DOT )?
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
                    // SqlParser.g:289:50: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_virtual_table_stmt2573);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT290=(Token)match(input,DOT,FOLLOW_DOT_in_create_virtual_table_stmt2575); 
                    DOT290_tree = (Object)adaptor.create(DOT290);
                    adaptor.addChild(root_0, DOT290_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_virtual_table_stmt2581);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            USING291=(Token)match(input,USING,FOLLOW_USING_in_create_virtual_table_stmt2585); 
            USING291_tree = (Object)adaptor.create(USING291);
            adaptor.addChild(root_0, USING291_tree);

            pushFollow(FOLLOW_id_in_create_virtual_table_stmt2589);
            module_name=id();

            state._fsp--;

            adaptor.addChild(root_0, module_name.getTree());
            // SqlParser.g:290:24: ( LPAREN column_def ( COMMA column_def )* RPAREN )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==LPAREN) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // SqlParser.g:290:25: LPAREN column_def ( COMMA column_def )* RPAREN
                    {
                    LPAREN292=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_virtual_table_stmt2592); 
                    LPAREN292_tree = (Object)adaptor.create(LPAREN292);
                    adaptor.addChild(root_0, LPAREN292_tree);

                    pushFollow(FOLLOW_column_def_in_create_virtual_table_stmt2594);
                    column_def293=column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, column_def293.getTree());
                    // SqlParser.g:290:43: ( COMMA column_def )*
                    loop111:
                    do {
                        int alt111=2;
                        int LA111_0 = input.LA(1);

                        if ( (LA111_0==COMMA) ) {
                            alt111=1;
                        }


                        switch (alt111) {
                    	case 1 :
                    	    // SqlParser.g:290:44: COMMA column_def
                    	    {
                    	    COMMA294=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_virtual_table_stmt2597); 
                    	    COMMA294_tree = (Object)adaptor.create(COMMA294);
                    	    adaptor.addChild(root_0, COMMA294_tree);

                    	    pushFollow(FOLLOW_column_def_in_create_virtual_table_stmt2599);
                    	    column_def295=column_def();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, column_def295.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop111;
                        }
                    } while (true);

                    RPAREN296=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_virtual_table_stmt2603); 
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
    // SqlParser.g:293:1: create_table_stmt : CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt ) -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? ) ;
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
            // SqlParser.g:293:18: ( CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt ) -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? ) )
            // SqlParser.g:293:20: CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt )
            {
            CREATE297=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_table_stmt2613);  
            stream_CREATE.add(CREATE297);

            // SqlParser.g:293:27: ( TEMPORARY )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==TEMPORARY) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // SqlParser.g:293:27: TEMPORARY
                    {
                    TEMPORARY298=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_table_stmt2615);  
                    stream_TEMPORARY.add(TEMPORARY298);


                    }
                    break;

            }

            TABLE299=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_table_stmt2618);  
            stream_TABLE.add(TABLE299);

            // SqlParser.g:293:44: ( IF NOT EXISTS )?
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
                    // SqlParser.g:293:45: IF NOT EXISTS
                    {
                    IF300=(Token)match(input,IF,FOLLOW_IF_in_create_table_stmt2621);  
                    stream_IF.add(IF300);

                    NOT301=(Token)match(input,NOT,FOLLOW_NOT_in_create_table_stmt2623);  
                    stream_NOT.add(NOT301);

                    EXISTS302=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_table_stmt2625);  
                    stream_EXISTS.add(EXISTS302);


                    }
                    break;

            }

            // SqlParser.g:293:61: (database_name= id DOT )?
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
                    // SqlParser.g:293:62: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_table_stmt2632);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT303=(Token)match(input,DOT,FOLLOW_DOT_in_create_table_stmt2634);  
                    stream_DOT.add(DOT303);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_table_stmt2640);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());
            // SqlParser.g:294:3: ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt )
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
                    // SqlParser.g:294:5: LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN
                    {
                    LPAREN304=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_table_stmt2646);  
                    stream_LPAREN.add(LPAREN304);

                    pushFollow(FOLLOW_column_def_in_create_table_stmt2648);
                    column_def305=column_def();

                    state._fsp--;

                    stream_column_def.add(column_def305.getTree());
                    // SqlParser.g:294:23: ( COMMA column_def )*
                    loop116:
                    do {
                        int alt116=2;
                        alt116 = dfa116.predict(input);
                        switch (alt116) {
                    	case 1 :
                    	    // SqlParser.g:294:24: COMMA column_def
                    	    {
                    	    COMMA306=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_table_stmt2651);  
                    	    stream_COMMA.add(COMMA306);

                    	    pushFollow(FOLLOW_column_def_in_create_table_stmt2653);
                    	    column_def307=column_def();

                    	    state._fsp--;

                    	    stream_column_def.add(column_def307.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop116;
                        }
                    } while (true);

                    // SqlParser.g:294:43: ( COMMA table_constraint )*
                    loop117:
                    do {
                        int alt117=2;
                        int LA117_0 = input.LA(1);

                        if ( (LA117_0==COMMA) ) {
                            alt117=1;
                        }


                        switch (alt117) {
                    	case 1 :
                    	    // SqlParser.g:294:44: COMMA table_constraint
                    	    {
                    	    COMMA308=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_table_stmt2658);  
                    	    stream_COMMA.add(COMMA308);

                    	    pushFollow(FOLLOW_table_constraint_in_create_table_stmt2660);
                    	    table_constraint309=table_constraint();

                    	    state._fsp--;

                    	    stream_table_constraint.add(table_constraint309.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop117;
                        }
                    } while (true);

                    RPAREN310=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_table_stmt2664);  
                    stream_RPAREN.add(RPAREN310);


                    }
                    break;
                case 2 :
                    // SqlParser.g:295:5: AS select_stmt
                    {
                    AS311=(Token)match(input,AS,FOLLOW_AS_in_create_table_stmt2670);  
                    stream_AS.add(AS311);

                    pushFollow(FOLLOW_select_stmt_in_create_table_stmt2672);
                    select_stmt312=select_stmt();

                    state._fsp--;

                    stream_select_stmt.add(select_stmt312.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: EXISTS, table_constraint, database_name, TEMPORARY, column_def, select_stmt, table_name
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
            // 296:1: -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? )
            {
                // SqlParser.g:296:4: ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CREATE_TABLE, "CREATE_TABLE"), root_1);

                // SqlParser.g:296:19: ^( OPTIONS ( TEMPORARY )? ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:296:29: ( TEMPORARY )?
                if ( stream_TEMPORARY.hasNext() ) {
                    adaptor.addChild(root_2, stream_TEMPORARY.nextNode());

                }
                stream_TEMPORARY.reset();
                // SqlParser.g:296:40: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:296:49: ^( $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                // SqlParser.g:296:63: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:297:3: ( ^( COLUMNS ( column_def )+ ) )?
                if ( stream_column_def.hasNext() ) {
                    // SqlParser.g:297:3: ^( COLUMNS ( column_def )+ )
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
                // SqlParser.g:297:27: ( ^( CONSTRAINTS ( table_constraint )* ) )?
                if ( stream_table_constraint.hasNext() ) {
                    // SqlParser.g:297:27: ^( CONSTRAINTS ( table_constraint )* )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRAINTS, "CONSTRAINTS"), root_2);

                    // SqlParser.g:297:41: ( table_constraint )*
                    while ( stream_table_constraint.hasNext() ) {
                        adaptor.addChild(root_2, stream_table_constraint.nextTree());

                    }
                    stream_table_constraint.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_table_constraint.reset();
                // SqlParser.g:297:61: ( select_stmt )?
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
    // SqlParser.g:299:1: column_def : name= id_column_def ( type_name )? ( column_constraint )* -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? ) ;
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
            // SqlParser.g:299:11: (name= id_column_def ( type_name )? ( column_constraint )* -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? ) )
            // SqlParser.g:299:13: name= id_column_def ( type_name )? ( column_constraint )*
            {
            pushFollow(FOLLOW_id_column_def_in_column_def2728);
            name=id_column_def();

            state._fsp--;

            stream_id_column_def.add(name.getTree());
            // SqlParser.g:299:32: ( type_name )?
            int alt119=2;
            alt119 = dfa119.predict(input);
            switch (alt119) {
                case 1 :
                    // SqlParser.g:299:32: type_name
                    {
                    pushFollow(FOLLOW_type_name_in_column_def2730);
                    type_name313=type_name();

                    state._fsp--;

                    stream_type_name.add(type_name313.getTree());

                    }
                    break;

            }

            // SqlParser.g:299:43: ( column_constraint )*
            loop120:
            do {
                int alt120=2;
                alt120 = dfa120.predict(input);
                switch (alt120) {
            	case 1 :
            	    // SqlParser.g:299:43: column_constraint
            	    {
            	    pushFollow(FOLLOW_column_constraint_in_column_def2733);
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
            // elements: type_name, name, column_constraint
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 300:1: -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? )
            {
                // SqlParser.g:300:4: ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_name.nextNode(), root_1);

                // SqlParser.g:300:12: ^( CONSTRAINTS ( column_constraint )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRAINTS, "CONSTRAINTS"), root_2);

                // SqlParser.g:300:26: ( column_constraint )*
                while ( stream_column_constraint.hasNext() ) {
                    adaptor.addChild(root_2, stream_column_constraint.nextTree());

                }
                stream_column_constraint.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:300:46: ( type_name )?
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
    // SqlParser.g:302:1: column_constraint : ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause ) -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? ) ;
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
            // SqlParser.g:302:18: ( ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause ) -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? ) )
            // SqlParser.g:302:20: ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause )
            {
            // SqlParser.g:302:20: ( CONSTRAINT name= id )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==CONSTRAINT) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // SqlParser.g:302:21: CONSTRAINT name= id
                    {
                    CONSTRAINT315=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_column_constraint2759);  
                    stream_CONSTRAINT.add(CONSTRAINT315);

                    pushFollow(FOLLOW_id_in_column_constraint2763);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());

                    }
                    break;

            }

            // SqlParser.g:303:3: ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause )
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
                    // SqlParser.g:303:5: column_constraint_pk
                    {
                    pushFollow(FOLLOW_column_constraint_pk_in_column_constraint2771);
                    column_constraint_pk316=column_constraint_pk();

                    state._fsp--;

                    stream_column_constraint_pk.add(column_constraint_pk316.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:304:5: column_constraint_not_null
                    {
                    pushFollow(FOLLOW_column_constraint_not_null_in_column_constraint2777);
                    column_constraint_not_null317=column_constraint_not_null();

                    state._fsp--;

                    stream_column_constraint_not_null.add(column_constraint_not_null317.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:305:5: column_constraint_unique
                    {
                    pushFollow(FOLLOW_column_constraint_unique_in_column_constraint2783);
                    column_constraint_unique318=column_constraint_unique();

                    state._fsp--;

                    stream_column_constraint_unique.add(column_constraint_unique318.getTree());

                    }
                    break;
                case 4 :
                    // SqlParser.g:306:5: column_constraint_check
                    {
                    pushFollow(FOLLOW_column_constraint_check_in_column_constraint2789);
                    column_constraint_check319=column_constraint_check();

                    state._fsp--;

                    stream_column_constraint_check.add(column_constraint_check319.getTree());

                    }
                    break;
                case 5 :
                    // SqlParser.g:307:5: column_constraint_default
                    {
                    pushFollow(FOLLOW_column_constraint_default_in_column_constraint2795);
                    column_constraint_default320=column_constraint_default();

                    state._fsp--;

                    stream_column_constraint_default.add(column_constraint_default320.getTree());

                    }
                    break;
                case 6 :
                    // SqlParser.g:308:5: column_constraint_collate
                    {
                    pushFollow(FOLLOW_column_constraint_collate_in_column_constraint2801);
                    column_constraint_collate321=column_constraint_collate();

                    state._fsp--;

                    stream_column_constraint_collate.add(column_constraint_collate321.getTree());

                    }
                    break;
                case 7 :
                    // SqlParser.g:309:5: fk_clause
                    {
                    pushFollow(FOLLOW_fk_clause_in_column_constraint2807);
                    fk_clause322=fk_clause();

                    state._fsp--;

                    stream_fk_clause.add(fk_clause322.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: column_constraint_default, fk_clause, column_constraint_not_null, column_constraint_pk, column_constraint_unique, column_constraint_check, name, column_constraint_collate
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 310:1: -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? )
            {
                // SqlParser.g:310:4: ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMN_CONSTRAINT, "COLUMN_CONSTRAINT"), root_1);

                // SqlParser.g:311:3: ( column_constraint_pk )?
                if ( stream_column_constraint_pk.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_pk.nextTree());

                }
                stream_column_constraint_pk.reset();
                // SqlParser.g:312:3: ( column_constraint_not_null )?
                if ( stream_column_constraint_not_null.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_not_null.nextTree());

                }
                stream_column_constraint_not_null.reset();
                // SqlParser.g:313:3: ( column_constraint_unique )?
                if ( stream_column_constraint_unique.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_unique.nextTree());

                }
                stream_column_constraint_unique.reset();
                // SqlParser.g:314:3: ( column_constraint_check )?
                if ( stream_column_constraint_check.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_check.nextTree());

                }
                stream_column_constraint_check.reset();
                // SqlParser.g:315:3: ( column_constraint_default )?
                if ( stream_column_constraint_default.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_default.nextTree());

                }
                stream_column_constraint_default.reset();
                // SqlParser.g:316:3: ( column_constraint_collate )?
                if ( stream_column_constraint_collate.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_collate.nextTree());

                }
                stream_column_constraint_collate.reset();
                // SqlParser.g:317:3: ( fk_clause )?
                if ( stream_fk_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_fk_clause.nextTree());

                }
                stream_fk_clause.reset();
                // SqlParser.g:318:3: ( $name)?
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
    // SqlParser.g:320:1: column_constraint_pk : PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )? ;
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
            // SqlParser.g:320:21: ( PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )? )
            // SqlParser.g:320:23: PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )?
            {
            root_0 = (Object)adaptor.nil();

            PRIMARY323=(Token)match(input,PRIMARY,FOLLOW_PRIMARY_in_column_constraint_pk2862); 
            PRIMARY323_tree = (Object)adaptor.create(PRIMARY323);
            root_0 = (Object)adaptor.becomeRoot(PRIMARY323_tree, root_0);

            KEY324=(Token)match(input,KEY,FOLLOW_KEY_in_column_constraint_pk2865); 
            // SqlParser.g:320:37: ( ASC | DESC )?
            int alt123=2;
            alt123 = dfa123.predict(input);
            switch (alt123) {
                case 1 :
                    // SqlParser.g:
                    {
                    set325=(Token)input.LT(1);
                    if ( input.LA(1)==ASC||input.LA(1)==DESC ) {
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

            // SqlParser.g:320:51: ( table_conflict_clause )?
            int alt124=2;
            alt124 = dfa124.predict(input);
            switch (alt124) {
                case 1 :
                    // SqlParser.g:320:51: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_pk2877);
                    table_conflict_clause326=table_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, table_conflict_clause326.getTree());

                    }
                    break;

            }

            // SqlParser.g:320:74: ( AUTOINCREMENT )?
            int alt125=2;
            alt125 = dfa125.predict(input);
            switch (alt125) {
                case 1 :
                    // SqlParser.g:320:75: AUTOINCREMENT
                    {
                    AUTOINCREMENT327=(Token)match(input,AUTOINCREMENT,FOLLOW_AUTOINCREMENT_in_column_constraint_pk2881); 
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
    // SqlParser.g:322:1: column_constraint_not_null : NOT NULL ( table_conflict_clause )? -> ^( NOT_NULL ( table_conflict_clause )? ) ;
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
            // SqlParser.g:322:27: ( NOT NULL ( table_conflict_clause )? -> ^( NOT_NULL ( table_conflict_clause )? ) )
            // SqlParser.g:322:29: NOT NULL ( table_conflict_clause )?
            {
            NOT328=(Token)match(input,NOT,FOLLOW_NOT_in_column_constraint_not_null2890);  
            stream_NOT.add(NOT328);

            NULL329=(Token)match(input,NULL,FOLLOW_NULL_in_column_constraint_not_null2892);  
            stream_NULL.add(NULL329);

            // SqlParser.g:322:38: ( table_conflict_clause )?
            int alt126=2;
            alt126 = dfa126.predict(input);
            switch (alt126) {
                case 1 :
                    // SqlParser.g:322:38: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_not_null2894);
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
            // 322:61: -> ^( NOT_NULL ( table_conflict_clause )? )
            {
                // SqlParser.g:322:64: ^( NOT_NULL ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_NULL, "NOT_NULL"), root_1);

                // SqlParser.g:322:75: ( table_conflict_clause )?
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
    // SqlParser.g:324:1: column_constraint_unique : UNIQUE ( table_conflict_clause )? ;
    public final SqlParser.column_constraint_unique_return column_constraint_unique() throws RecognitionException {
        SqlParser.column_constraint_unique_return retval = new SqlParser.column_constraint_unique_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNIQUE331=null;
        SqlParser.table_conflict_clause_return table_conflict_clause332 = null;


        Object UNIQUE331_tree=null;

        try {
            // SqlParser.g:324:25: ( UNIQUE ( table_conflict_clause )? )
            // SqlParser.g:324:27: UNIQUE ( table_conflict_clause )?
            {
            root_0 = (Object)adaptor.nil();

            UNIQUE331=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_column_constraint_unique2911); 
            UNIQUE331_tree = (Object)adaptor.create(UNIQUE331);
            root_0 = (Object)adaptor.becomeRoot(UNIQUE331_tree, root_0);

            // SqlParser.g:324:35: ( table_conflict_clause )?
            int alt127=2;
            alt127 = dfa127.predict(input);
            switch (alt127) {
                case 1 :
                    // SqlParser.g:324:35: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_unique2914);
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
    // SqlParser.g:326:1: column_constraint_check : CHECK LPAREN expr RPAREN ;
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
            // SqlParser.g:326:24: ( CHECK LPAREN expr RPAREN )
            // SqlParser.g:326:26: CHECK LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            CHECK333=(Token)match(input,CHECK,FOLLOW_CHECK_in_column_constraint_check2922); 
            CHECK333_tree = (Object)adaptor.create(CHECK333);
            root_0 = (Object)adaptor.becomeRoot(CHECK333_tree, root_0);

            LPAREN334=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_column_constraint_check2925); 
            pushFollow(FOLLOW_expr_in_column_constraint_check2928);
            expr335=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr335.getTree());
            RPAREN336=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_column_constraint_check2930); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // SqlParser.g:329:1: column_constraint_default : DEFAULT ( ( PLUS | MINUS ) ( INTEGER | FLOAT ) | literal_value | LPAREN expr RPAREN ) ;
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
            // SqlParser.g:329:26: ( DEFAULT ( ( PLUS | MINUS ) ( INTEGER | FLOAT ) | literal_value | LPAREN expr RPAREN ) )
            // SqlParser.g:329:28: DEFAULT ( ( PLUS | MINUS ) ( INTEGER | FLOAT ) | literal_value | LPAREN expr RPAREN )
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT337=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_column_constraint_default2939); 
            DEFAULT337_tree = (Object)adaptor.create(DEFAULT337);
            root_0 = (Object)adaptor.becomeRoot(DEFAULT337_tree, root_0);

            // SqlParser.g:329:37: ( ( PLUS | MINUS ) ( INTEGER | FLOAT ) | literal_value | LPAREN expr RPAREN )
            int alt128=3;
            alt128 = dfa128.predict(input);
            switch (alt128) {
                case 1 :
                    // SqlParser.g:329:38: ( PLUS | MINUS ) ( INTEGER | FLOAT )
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
                    if ( input.LA(1)==INTEGER||input.LA(1)==FLOAT ) {
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
                    // SqlParser.g:329:73: literal_value
                    {
                    pushFollow(FOLLOW_literal_value_in_column_constraint_default2961);
                    literal_value340=literal_value();

                    state._fsp--;

                    adaptor.addChild(root_0, literal_value340.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:329:89: LPAREN expr RPAREN
                    {
                    LPAREN341=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_column_constraint_default2965); 
                    pushFollow(FOLLOW_expr_in_column_constraint_default2968);
                    expr342=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr342.getTree());
                    RPAREN343=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_column_constraint_default2970); 

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
    // SqlParser.g:331:1: column_constraint_collate : COLLATE collation_name= id ;
    public final SqlParser.column_constraint_collate_return column_constraint_collate() throws RecognitionException {
        SqlParser.column_constraint_collate_return retval = new SqlParser.column_constraint_collate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLLATE344=null;
        SqlParser.id_return collation_name = null;


        Object COLLATE344_tree=null;

        try {
            // SqlParser.g:331:26: ( COLLATE collation_name= id )
            // SqlParser.g:331:28: COLLATE collation_name= id
            {
            root_0 = (Object)adaptor.nil();

            COLLATE344=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_column_constraint_collate2979); 
            COLLATE344_tree = (Object)adaptor.create(COLLATE344);
            root_0 = (Object)adaptor.becomeRoot(COLLATE344_tree, root_0);

            pushFollow(FOLLOW_id_in_column_constraint_collate2984);
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
    // SqlParser.g:333:1: table_constraint : ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk ) -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? ) ;
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
            // SqlParser.g:333:17: ( ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk ) -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? ) )
            // SqlParser.g:333:19: ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk )
            {
            // SqlParser.g:333:19: ( CONSTRAINT name= id )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==CONSTRAINT) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // SqlParser.g:333:20: CONSTRAINT name= id
                    {
                    CONSTRAINT345=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_table_constraint2993);  
                    stream_CONSTRAINT.add(CONSTRAINT345);

                    pushFollow(FOLLOW_id_in_table_constraint2997);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());

                    }
                    break;

            }

            // SqlParser.g:334:3: ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk )
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
                    // SqlParser.g:334:5: table_constraint_pk
                    {
                    pushFollow(FOLLOW_table_constraint_pk_in_table_constraint3005);
                    table_constraint_pk346=table_constraint_pk();

                    state._fsp--;

                    stream_table_constraint_pk.add(table_constraint_pk346.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:335:5: table_constraint_unique
                    {
                    pushFollow(FOLLOW_table_constraint_unique_in_table_constraint3011);
                    table_constraint_unique347=table_constraint_unique();

                    state._fsp--;

                    stream_table_constraint_unique.add(table_constraint_unique347.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:336:5: table_constraint_check
                    {
                    pushFollow(FOLLOW_table_constraint_check_in_table_constraint3017);
                    table_constraint_check348=table_constraint_check();

                    state._fsp--;

                    stream_table_constraint_check.add(table_constraint_check348.getTree());

                    }
                    break;
                case 4 :
                    // SqlParser.g:337:5: table_constraint_fk
                    {
                    pushFollow(FOLLOW_table_constraint_fk_in_table_constraint3023);
                    table_constraint_fk349=table_constraint_fk();

                    state._fsp--;

                    stream_table_constraint_fk.add(table_constraint_fk349.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: table_constraint_check, table_constraint_pk, name, table_constraint_fk, table_constraint_unique
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 338:1: -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? )
            {
                // SqlParser.g:338:4: ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TABLE_CONSTRAINT, "TABLE_CONSTRAINT"), root_1);

                // SqlParser.g:339:3: ( table_constraint_pk )?
                if ( stream_table_constraint_pk.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_pk.nextTree());

                }
                stream_table_constraint_pk.reset();
                // SqlParser.g:340:3: ( table_constraint_unique )?
                if ( stream_table_constraint_unique.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_unique.nextTree());

                }
                stream_table_constraint_unique.reset();
                // SqlParser.g:341:3: ( table_constraint_check )?
                if ( stream_table_constraint_check.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_check.nextTree());

                }
                stream_table_constraint_check.reset();
                // SqlParser.g:342:3: ( table_constraint_fk )?
                if ( stream_table_constraint_fk.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_fk.nextTree());

                }
                stream_table_constraint_fk.reset();
                // SqlParser.g:343:3: ( $name)?
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
    // SqlParser.g:345:1: table_constraint_pk : PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) ;
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
            // SqlParser.g:345:20: ( PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) )
            // SqlParser.g:345:22: PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )?
            {
            PRIMARY350=(Token)match(input,PRIMARY,FOLLOW_PRIMARY_in_table_constraint_pk3063);  
            stream_PRIMARY.add(PRIMARY350);

            KEY351=(Token)match(input,KEY,FOLLOW_KEY_in_table_constraint_pk3065);  
            stream_KEY.add(KEY351);

            LPAREN352=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_pk3069);  
            stream_LPAREN.add(LPAREN352);

            pushFollow(FOLLOW_id_in_table_constraint_pk3073);
            indexed_columns=id();

            state._fsp--;

            stream_id.add(indexed_columns.getTree());
            if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            list_indexed_columns.add(indexed_columns.getTree());

            // SqlParser.g:346:30: ( COMMA indexed_columns+= id )*
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( (LA131_0==COMMA) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // SqlParser.g:346:31: COMMA indexed_columns+= id
            	    {
            	    COMMA353=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_pk3076);  
            	    stream_COMMA.add(COMMA353);

            	    pushFollow(FOLLOW_id_in_table_constraint_pk3080);
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

            RPAREN354=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_pk3084);  
            stream_RPAREN.add(RPAREN354);

            // SqlParser.g:346:66: ( table_conflict_clause )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==ON) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // SqlParser.g:346:66: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_table_constraint_pk3086);
                    table_conflict_clause355=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause355.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: table_conflict_clause, PRIMARY, indexed_columns
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: indexed_columns
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_indexed_columns=new RewriteRuleSubtreeStream(adaptor,"token indexed_columns",list_indexed_columns);
            root_0 = (Object)adaptor.nil();
            // 347:1: -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
            {
                // SqlParser.g:347:4: ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_PRIMARY.nextNode(), root_1);

                // SqlParser.g:347:14: ^( COLUMNS ( $indexed_columns)+ )
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
                // SqlParser.g:347:43: ( table_conflict_clause )?
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
    // SqlParser.g:349:1: table_constraint_unique : UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) ;
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
            // SqlParser.g:349:24: ( UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) )
            // SqlParser.g:349:26: UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )?
            {
            UNIQUE356=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_table_constraint_unique3111);  
            stream_UNIQUE.add(UNIQUE356);

            LPAREN357=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_unique3115);  
            stream_LPAREN.add(LPAREN357);

            pushFollow(FOLLOW_id_in_table_constraint_unique3119);
            indexed_columns=id();

            state._fsp--;

            stream_id.add(indexed_columns.getTree());
            if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            list_indexed_columns.add(indexed_columns.getTree());

            // SqlParser.g:350:30: ( COMMA indexed_columns+= id )*
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==COMMA) ) {
                    alt133=1;
                }


                switch (alt133) {
            	case 1 :
            	    // SqlParser.g:350:31: COMMA indexed_columns+= id
            	    {
            	    COMMA358=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_unique3122);  
            	    stream_COMMA.add(COMMA358);

            	    pushFollow(FOLLOW_id_in_table_constraint_unique3126);
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

            RPAREN359=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_unique3130);  
            stream_RPAREN.add(RPAREN359);

            // SqlParser.g:350:66: ( table_conflict_clause )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==ON) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // SqlParser.g:350:66: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_table_constraint_unique3132);
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
            // 351:1: -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
            {
                // SqlParser.g:351:4: ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_UNIQUE.nextNode(), root_1);

                // SqlParser.g:351:13: ^( COLUMNS ( $indexed_columns)+ )
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
                // SqlParser.g:351:42: ( table_conflict_clause )?
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
    // SqlParser.g:353:1: table_constraint_check : CHECK LPAREN expr RPAREN ;
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
            // SqlParser.g:353:23: ( CHECK LPAREN expr RPAREN )
            // SqlParser.g:353:25: CHECK LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            CHECK361=(Token)match(input,CHECK,FOLLOW_CHECK_in_table_constraint_check3157); 
            CHECK361_tree = (Object)adaptor.create(CHECK361);
            root_0 = (Object)adaptor.becomeRoot(CHECK361_tree, root_0);

            LPAREN362=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_check3160); 
            pushFollow(FOLLOW_expr_in_table_constraint_check3163);
            expr363=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr363.getTree());
            RPAREN364=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_check3165); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // SqlParser.g:355:1: table_constraint_fk : FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause ) ;
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
            // SqlParser.g:355:20: ( FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause ) )
            // SqlParser.g:355:22: FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause
            {
            FOREIGN365=(Token)match(input,FOREIGN,FOLLOW_FOREIGN_in_table_constraint_fk3173);  
            stream_FOREIGN.add(FOREIGN365);

            KEY366=(Token)match(input,KEY,FOLLOW_KEY_in_table_constraint_fk3175);  
            stream_KEY.add(KEY366);

            LPAREN367=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_fk3177);  
            stream_LPAREN.add(LPAREN367);

            pushFollow(FOLLOW_id_in_table_constraint_fk3181);
            column_names=id();

            state._fsp--;

            stream_id.add(column_names.getTree());
            if (list_column_names==null) list_column_names=new ArrayList();
            list_column_names.add(column_names.getTree());

            // SqlParser.g:355:58: ( COMMA column_names+= id )*
            loop135:
            do {
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( (LA135_0==COMMA) ) {
                    alt135=1;
                }


                switch (alt135) {
            	case 1 :
            	    // SqlParser.g:355:59: COMMA column_names+= id
            	    {
            	    COMMA368=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_fk3184);  
            	    stream_COMMA.add(COMMA368);

            	    pushFollow(FOLLOW_id_in_table_constraint_fk3188);
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

            RPAREN369=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_fk3192);  
            stream_RPAREN.add(RPAREN369);

            pushFollow(FOLLOW_fk_clause_in_table_constraint_fk3194);
            fk_clause370=fk_clause();

            state._fsp--;

            stream_fk_clause.add(fk_clause370.getTree());


            // AST REWRITE
            // elements: column_names, fk_clause, FOREIGN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: column_names
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_column_names=new RewriteRuleSubtreeStream(adaptor,"token column_names",list_column_names);
            root_0 = (Object)adaptor.nil();
            // 356:1: -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause )
            {
                // SqlParser.g:356:4: ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FOREIGN.nextNode(), root_1);

                // SqlParser.g:356:14: ^( COLUMNS ( $column_names)+ )
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
    // SqlParser.g:358:1: fk_clause : REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )? -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )+ ( fk_clause_deferrable )? ) ;
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
            // SqlParser.g:358:10: ( REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )? -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )+ ( fk_clause_deferrable )? ) )
            // SqlParser.g:358:12: REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )?
            {
            REFERENCES371=(Token)match(input,REFERENCES,FOLLOW_REFERENCES_in_fk_clause3217);  
            stream_REFERENCES.add(REFERENCES371);

            pushFollow(FOLLOW_id_in_fk_clause3221);
            foreign_table=id();

            state._fsp--;

            stream_id.add(foreign_table.getTree());
            // SqlParser.g:358:40: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==LPAREN) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // SqlParser.g:358:41: LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                    {
                    LPAREN372=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_fk_clause3224);  
                    stream_LPAREN.add(LPAREN372);

                    pushFollow(FOLLOW_id_in_fk_clause3228);
                    column_names=id();

                    state._fsp--;

                    stream_id.add(column_names.getTree());
                    if (list_column_names==null) list_column_names=new ArrayList();
                    list_column_names.add(column_names.getTree());

                    // SqlParser.g:358:65: ( COMMA column_names+= id )*
                    loop136:
                    do {
                        int alt136=2;
                        int LA136_0 = input.LA(1);

                        if ( (LA136_0==COMMA) ) {
                            alt136=1;
                        }


                        switch (alt136) {
                    	case 1 :
                    	    // SqlParser.g:358:66: COMMA column_names+= id
                    	    {
                    	    COMMA373=(Token)match(input,COMMA,FOLLOW_COMMA_in_fk_clause3231);  
                    	    stream_COMMA.add(COMMA373);

                    	    pushFollow(FOLLOW_id_in_fk_clause3235);
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

                    RPAREN374=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_fk_clause3239);  
                    stream_RPAREN.add(RPAREN374);


                    }
                    break;

            }

            // SqlParser.g:359:3: ( fk_clause_action )+
            int cnt138=0;
            loop138:
            do {
                int alt138=2;
                alt138 = dfa138.predict(input);
                switch (alt138) {
            	case 1 :
            	    // SqlParser.g:359:3: fk_clause_action
            	    {
            	    pushFollow(FOLLOW_fk_clause_action_in_fk_clause3245);
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

            // SqlParser.g:359:21: ( fk_clause_deferrable )?
            int alt139=2;
            alt139 = dfa139.predict(input);
            switch (alt139) {
                case 1 :
                    // SqlParser.g:359:21: fk_clause_deferrable
                    {
                    pushFollow(FOLLOW_fk_clause_deferrable_in_fk_clause3248);
                    fk_clause_deferrable376=fk_clause_deferrable();

                    state._fsp--;

                    stream_fk_clause_deferrable.add(fk_clause_deferrable376.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: column_names, fk_clause_deferrable, foreign_table, REFERENCES, fk_clause_action
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
            // 360:1: -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )+ ( fk_clause_deferrable )? )
            {
                // SqlParser.g:360:4: ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )+ ( fk_clause_deferrable )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_REFERENCES.nextNode(), root_1);

                adaptor.addChild(root_1, stream_foreign_table.nextTree());
                // SqlParser.g:360:32: ^( COLUMNS ( $column_names)+ )
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
                // SqlParser.g:360:76: ( fk_clause_deferrable )?
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
    // SqlParser.g:362:1: fk_clause_action : ( ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT ) | MATCH id );
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
            // SqlParser.g:363:3: ( ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT ) | MATCH id )
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
                    // SqlParser.g:363:5: ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT )
                    {
                    root_0 = (Object)adaptor.nil();

                    ON377=(Token)match(input,ON,FOLLOW_ON_in_fk_clause_action3282); 
                    ON377_tree = (Object)adaptor.create(ON377);
                    root_0 = (Object)adaptor.becomeRoot(ON377_tree, root_0);

                    set378=(Token)input.LT(1);
                    if ( input.LA(1)==DELETE||input.LA(1)==INSERT||input.LA(1)==UPDATE ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set378));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // SqlParser.g:363:36: ( SET NULL | SET DEFAULT | CASCADE | RESTRICT )
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
                            // SqlParser.g:363:37: SET NULL
                            {
                            SET379=(Token)match(input,SET,FOLLOW_SET_in_fk_clause_action3298); 
                            NULL380=(Token)match(input,NULL,FOLLOW_NULL_in_fk_clause_action3301); 
                            NULL380_tree = (Object)adaptor.create(NULL380);
                            adaptor.addChild(root_0, NULL380_tree);


                            }
                            break;
                        case 2 :
                            // SqlParser.g:363:49: SET DEFAULT
                            {
                            SET381=(Token)match(input,SET,FOLLOW_SET_in_fk_clause_action3305); 
                            DEFAULT382=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_fk_clause_action3308); 
                            DEFAULT382_tree = (Object)adaptor.create(DEFAULT382);
                            adaptor.addChild(root_0, DEFAULT382_tree);


                            }
                            break;
                        case 3 :
                            // SqlParser.g:363:64: CASCADE
                            {
                            CASCADE383=(Token)match(input,CASCADE,FOLLOW_CASCADE_in_fk_clause_action3312); 
                            CASCADE383_tree = (Object)adaptor.create(CASCADE383);
                            adaptor.addChild(root_0, CASCADE383_tree);


                            }
                            break;
                        case 4 :
                            // SqlParser.g:363:74: RESTRICT
                            {
                            RESTRICT384=(Token)match(input,RESTRICT,FOLLOW_RESTRICT_in_fk_clause_action3316); 
                            RESTRICT384_tree = (Object)adaptor.create(RESTRICT384);
                            adaptor.addChild(root_0, RESTRICT384_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:364:5: MATCH id
                    {
                    root_0 = (Object)adaptor.nil();

                    MATCH385=(Token)match(input,MATCH,FOLLOW_MATCH_in_fk_clause_action3323); 
                    MATCH385_tree = (Object)adaptor.create(MATCH385);
                    root_0 = (Object)adaptor.becomeRoot(MATCH385_tree, root_0);

                    pushFollow(FOLLOW_id_in_fk_clause_action3326);
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
    // SqlParser.g:366:1: fk_clause_deferrable : ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )? ;
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
            // SqlParser.g:366:21: ( ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )? )
            // SqlParser.g:366:23: ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:366:23: ( NOT )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==NOT) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // SqlParser.g:366:24: NOT
                    {
                    NOT387=(Token)match(input,NOT,FOLLOW_NOT_in_fk_clause_deferrable3334); 
                    NOT387_tree = (Object)adaptor.create(NOT387);
                    adaptor.addChild(root_0, NOT387_tree);


                    }
                    break;

            }

            DEFERRABLE388=(Token)match(input,DEFERRABLE,FOLLOW_DEFERRABLE_in_fk_clause_deferrable3338); 
            DEFERRABLE388_tree = (Object)adaptor.create(DEFERRABLE388);
            root_0 = (Object)adaptor.becomeRoot(DEFERRABLE388_tree, root_0);

            // SqlParser.g:366:42: ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?
            int alt143=3;
            alt143 = dfa143.predict(input);
            switch (alt143) {
                case 1 :
                    // SqlParser.g:366:43: INITIALLY DEFERRED
                    {
                    INITIALLY389=(Token)match(input,INITIALLY,FOLLOW_INITIALLY_in_fk_clause_deferrable3342); 
                    DEFERRED390=(Token)match(input,DEFERRED,FOLLOW_DEFERRED_in_fk_clause_deferrable3345); 
                    DEFERRED390_tree = (Object)adaptor.create(DEFERRED390);
                    adaptor.addChild(root_0, DEFERRED390_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:366:65: INITIALLY IMMEDIATE
                    {
                    INITIALLY391=(Token)match(input,INITIALLY,FOLLOW_INITIALLY_in_fk_clause_deferrable3349); 
                    IMMEDIATE392=(Token)match(input,IMMEDIATE,FOLLOW_IMMEDIATE_in_fk_clause_deferrable3352); 
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
    // SqlParser.g:369:1: drop_table_stmt : DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) ) ;
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
            // SqlParser.g:369:16: ( DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) ) )
            // SqlParser.g:369:18: DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id
            {
            DROP393=(Token)match(input,DROP,FOLLOW_DROP_in_drop_table_stmt3362);  
            stream_DROP.add(DROP393);

            TABLE394=(Token)match(input,TABLE,FOLLOW_TABLE_in_drop_table_stmt3364);  
            stream_TABLE.add(TABLE394);

            // SqlParser.g:369:29: ( IF EXISTS )?
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
                    // SqlParser.g:369:30: IF EXISTS
                    {
                    IF395=(Token)match(input,IF,FOLLOW_IF_in_drop_table_stmt3367);  
                    stream_IF.add(IF395);

                    EXISTS396=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_table_stmt3369);  
                    stream_EXISTS.add(EXISTS396);


                    }
                    break;

            }

            // SqlParser.g:369:42: (database_name= id DOT )?
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
                    // SqlParser.g:369:43: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_table_stmt3376);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT397=(Token)match(input,DOT,FOLLOW_DOT_in_drop_table_stmt3378);  
                    stream_DOT.add(DOT397);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_table_stmt3384);
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
            // 370:1: -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) )
            {
                // SqlParser.g:370:4: ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DROP_TABLE, "DROP_TABLE"), root_1);

                // SqlParser.g:370:17: ^( OPTIONS ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:370:27: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:370:36: ^( $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                // SqlParser.g:370:50: ( $database_name)?
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
    // SqlParser.g:373:1: alter_table_stmt : ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def ) ;
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
            // SqlParser.g:373:17: ( ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def ) )
            // SqlParser.g:373:19: ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def )
            {
            root_0 = (Object)adaptor.nil();

            ALTER398=(Token)match(input,ALTER,FOLLOW_ALTER_in_alter_table_stmt3414); 
            ALTER398_tree = (Object)adaptor.create(ALTER398);
            adaptor.addChild(root_0, ALTER398_tree);

            TABLE399=(Token)match(input,TABLE,FOLLOW_TABLE_in_alter_table_stmt3416); 
            TABLE399_tree = (Object)adaptor.create(TABLE399);
            adaptor.addChild(root_0, TABLE399_tree);

            // SqlParser.g:373:31: (database_name= id DOT )?
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
                    // SqlParser.g:373:32: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_alter_table_stmt3421);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT400=(Token)match(input,DOT,FOLLOW_DOT_in_alter_table_stmt3423); 
                    DOT400_tree = (Object)adaptor.create(DOT400);
                    adaptor.addChild(root_0, DOT400_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_alter_table_stmt3429);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:373:69: ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def )
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
                    // SqlParser.g:373:70: RENAME TO new_table_name= id
                    {
                    RENAME401=(Token)match(input,RENAME,FOLLOW_RENAME_in_alter_table_stmt3432); 
                    RENAME401_tree = (Object)adaptor.create(RENAME401);
                    adaptor.addChild(root_0, RENAME401_tree);

                    TO402=(Token)match(input,TO,FOLLOW_TO_in_alter_table_stmt3434); 
                    TO402_tree = (Object)adaptor.create(TO402);
                    adaptor.addChild(root_0, TO402_tree);

                    pushFollow(FOLLOW_id_in_alter_table_stmt3438);
                    new_table_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, new_table_name.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:373:100: ADD ( COLUMN )? column_def
                    {
                    ADD403=(Token)match(input,ADD,FOLLOW_ADD_in_alter_table_stmt3442); 
                    ADD403_tree = (Object)adaptor.create(ADD403);
                    adaptor.addChild(root_0, ADD403_tree);

                    // SqlParser.g:373:104: ( COLUMN )?
                    int alt147=2;
                    int LA147_0 = input.LA(1);

                    if ( (LA147_0==COLUMN) ) {
                        alt147=1;
                    }
                    switch (alt147) {
                        case 1 :
                            // SqlParser.g:373:105: COLUMN
                            {
                            COLUMN404=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_alter_table_stmt3445); 
                            COLUMN404_tree = (Object)adaptor.create(COLUMN404);
                            adaptor.addChild(root_0, COLUMN404_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_column_def_in_alter_table_stmt3449);
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
    // SqlParser.g:376:1: create_view_stmt : CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS select_stmt ;
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
            // SqlParser.g:376:17: ( CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS select_stmt )
            // SqlParser.g:376:19: CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS select_stmt
            {
            root_0 = (Object)adaptor.nil();

            CREATE406=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_view_stmt3458); 
            CREATE406_tree = (Object)adaptor.create(CREATE406);
            adaptor.addChild(root_0, CREATE406_tree);

            // SqlParser.g:376:26: ( TEMPORARY )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==TEMPORARY) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // SqlParser.g:376:26: TEMPORARY
                    {
                    TEMPORARY407=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_view_stmt3460); 
                    TEMPORARY407_tree = (Object)adaptor.create(TEMPORARY407);
                    adaptor.addChild(root_0, TEMPORARY407_tree);


                    }
                    break;

            }

            VIEW408=(Token)match(input,VIEW,FOLLOW_VIEW_in_create_view_stmt3463); 
            VIEW408_tree = (Object)adaptor.create(VIEW408);
            adaptor.addChild(root_0, VIEW408_tree);

            // SqlParser.g:376:42: ( IF NOT EXISTS )?
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
                    // SqlParser.g:376:43: IF NOT EXISTS
                    {
                    IF409=(Token)match(input,IF,FOLLOW_IF_in_create_view_stmt3466); 
                    IF409_tree = (Object)adaptor.create(IF409);
                    adaptor.addChild(root_0, IF409_tree);

                    NOT410=(Token)match(input,NOT,FOLLOW_NOT_in_create_view_stmt3468); 
                    NOT410_tree = (Object)adaptor.create(NOT410);
                    adaptor.addChild(root_0, NOT410_tree);

                    EXISTS411=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_view_stmt3470); 
                    EXISTS411_tree = (Object)adaptor.create(EXISTS411);
                    adaptor.addChild(root_0, EXISTS411_tree);


                    }
                    break;

            }

            // SqlParser.g:376:59: (database_name= id DOT )?
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
                    // SqlParser.g:376:60: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_view_stmt3477);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT412=(Token)match(input,DOT,FOLLOW_DOT_in_create_view_stmt3479); 
                    DOT412_tree = (Object)adaptor.create(DOT412);
                    adaptor.addChild(root_0, DOT412_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_view_stmt3485);
            view_name=id();

            state._fsp--;

            adaptor.addChild(root_0, view_name.getTree());
            AS413=(Token)match(input,AS,FOLLOW_AS_in_create_view_stmt3487); 
            AS413_tree = (Object)adaptor.create(AS413);
            adaptor.addChild(root_0, AS413_tree);

            pushFollow(FOLLOW_select_stmt_in_create_view_stmt3489);
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
    // SqlParser.g:379:1: drop_view_stmt : DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id ;
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
            // SqlParser.g:379:15: ( DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id )
            // SqlParser.g:379:17: DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id
            {
            root_0 = (Object)adaptor.nil();

            DROP415=(Token)match(input,DROP,FOLLOW_DROP_in_drop_view_stmt3497); 
            DROP415_tree = (Object)adaptor.create(DROP415);
            adaptor.addChild(root_0, DROP415_tree);

            VIEW416=(Token)match(input,VIEW,FOLLOW_VIEW_in_drop_view_stmt3499); 
            VIEW416_tree = (Object)adaptor.create(VIEW416);
            adaptor.addChild(root_0, VIEW416_tree);

            // SqlParser.g:379:27: ( IF EXISTS )?
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
                    // SqlParser.g:379:28: IF EXISTS
                    {
                    IF417=(Token)match(input,IF,FOLLOW_IF_in_drop_view_stmt3502); 
                    IF417_tree = (Object)adaptor.create(IF417);
                    adaptor.addChild(root_0, IF417_tree);

                    EXISTS418=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_view_stmt3504); 
                    EXISTS418_tree = (Object)adaptor.create(EXISTS418);
                    adaptor.addChild(root_0, EXISTS418_tree);


                    }
                    break;

            }

            // SqlParser.g:379:40: (database_name= id DOT )?
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
                    // SqlParser.g:379:41: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_view_stmt3511);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT419=(Token)match(input,DOT,FOLLOW_DOT_in_drop_view_stmt3513); 
                    DOT419_tree = (Object)adaptor.create(DOT419);
                    adaptor.addChild(root_0, DOT419_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_view_stmt3519);
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
    // SqlParser.g:382:1: create_index_stmt : CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? ) ;
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
            // SqlParser.g:382:18: ( CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? ) )
            // SqlParser.g:382:20: CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN
            {
            CREATE420=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_index_stmt3527);  
            stream_CREATE.add(CREATE420);

            // SqlParser.g:382:27: ( UNIQUE )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==UNIQUE) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // SqlParser.g:382:28: UNIQUE
                    {
                    UNIQUE421=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_create_index_stmt3530);  
                    stream_UNIQUE.add(UNIQUE421);


                    }
                    break;

            }

            INDEX422=(Token)match(input,INDEX,FOLLOW_INDEX_in_create_index_stmt3534);  
            stream_INDEX.add(INDEX422);

            // SqlParser.g:382:43: ( IF NOT EXISTS )?
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
                    // SqlParser.g:382:44: IF NOT EXISTS
                    {
                    IF423=(Token)match(input,IF,FOLLOW_IF_in_create_index_stmt3537);  
                    stream_IF.add(IF423);

                    NOT424=(Token)match(input,NOT,FOLLOW_NOT_in_create_index_stmt3539);  
                    stream_NOT.add(NOT424);

                    EXISTS425=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_index_stmt3541);  
                    stream_EXISTS.add(EXISTS425);


                    }
                    break;

            }

            // SqlParser.g:382:60: (database_name= id DOT )?
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
                    // SqlParser.g:382:61: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_index_stmt3548);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT426=(Token)match(input,DOT,FOLLOW_DOT_in_create_index_stmt3550);  
                    stream_DOT.add(DOT426);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_index_stmt3556);
            index_name=id();

            state._fsp--;

            stream_id.add(index_name.getTree());
            ON427=(Token)match(input,ON,FOLLOW_ON_in_create_index_stmt3560);  
            stream_ON.add(ON427);

            pushFollow(FOLLOW_id_in_create_index_stmt3564);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());
            LPAREN428=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_index_stmt3566);  
            stream_LPAREN.add(LPAREN428);

            pushFollow(FOLLOW_indexed_column_in_create_index_stmt3570);
            columns=indexed_column();

            state._fsp--;

            stream_indexed_column.add(columns.getTree());
            if (list_columns==null) list_columns=new ArrayList();
            list_columns.add(columns.getTree());

            // SqlParser.g:383:51: ( COMMA columns+= indexed_column )*
            loop157:
            do {
                int alt157=2;
                int LA157_0 = input.LA(1);

                if ( (LA157_0==COMMA) ) {
                    alt157=1;
                }


                switch (alt157) {
            	case 1 :
            	    // SqlParser.g:383:52: COMMA columns+= indexed_column
            	    {
            	    COMMA429=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_index_stmt3573);  
            	    stream_COMMA.add(COMMA429);

            	    pushFollow(FOLLOW_indexed_column_in_create_index_stmt3577);
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

            RPAREN430=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_index_stmt3581);  
            stream_RPAREN.add(RPAREN430);



            // AST REWRITE
            // elements: UNIQUE, EXISTS, database_name, table_name, index_name, columns
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
            // 384:1: -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? )
            {
                // SqlParser.g:384:4: ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CREATE_INDEX, "CREATE_INDEX"), root_1);

                // SqlParser.g:384:19: ^( OPTIONS ( UNIQUE )? ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:384:29: ( UNIQUE )?
                if ( stream_UNIQUE.hasNext() ) {
                    adaptor.addChild(root_2, stream_UNIQUE.nextNode());

                }
                stream_UNIQUE.reset();
                // SqlParser.g:384:37: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:384:46: ^( $index_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_index_name.nextNode(), root_2);

                // SqlParser.g:384:60: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_table_name.nextTree());
                // SqlParser.g:384:89: ( ^( COLUMNS ( $columns)+ ) )?
                if ( stream_columns.hasNext() ) {
                    // SqlParser.g:384:89: ^( COLUMNS ( $columns)+ )
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
    // SqlParser.g:386:1: indexed_column : column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )? -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? ) ;
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
            // SqlParser.g:386:15: (column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )? -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? ) )
            // SqlParser.g:386:17: column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )?
            {
            pushFollow(FOLLOW_id_in_indexed_column3627);
            column_name=id();

            state._fsp--;

            stream_id.add(column_name.getTree());
            // SqlParser.g:386:32: ( COLLATE collation_name= id )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==COLLATE) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // SqlParser.g:386:33: COLLATE collation_name= id
                    {
                    COLLATE431=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_indexed_column3630);  
                    stream_COLLATE.add(COLLATE431);

                    pushFollow(FOLLOW_id_in_indexed_column3634);
                    collation_name=id();

                    state._fsp--;

                    stream_id.add(collation_name.getTree());

                    }
                    break;

            }

            // SqlParser.g:386:61: ( ASC | DESC )?
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
                    // SqlParser.g:386:62: ASC
                    {
                    ASC432=(Token)match(input,ASC,FOLLOW_ASC_in_indexed_column3639);  
                    stream_ASC.add(ASC432);


                    }
                    break;
                case 2 :
                    // SqlParser.g:386:68: DESC
                    {
                    DESC433=(Token)match(input,DESC,FOLLOW_DESC_in_indexed_column3643);  
                    stream_DESC.add(DESC433);


                    }
                    break;

            }



            // AST REWRITE
            // elements: ASC, collation_name, COLLATE, column_name, DESC
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
            // 387:1: -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? )
            {
                // SqlParser.g:387:4: ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_column_name.nextNode(), root_1);

                // SqlParser.g:387:19: ( ^( COLLATE $collation_name) )?
                if ( stream_collation_name.hasNext()||stream_COLLATE.hasNext() ) {
                    // SqlParser.g:387:19: ^( COLLATE $collation_name)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_COLLATE.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_collation_name.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_collation_name.reset();
                stream_COLLATE.reset();
                // SqlParser.g:387:47: ( ASC )?
                if ( stream_ASC.hasNext() ) {
                    adaptor.addChild(root_1, stream_ASC.nextNode());

                }
                stream_ASC.reset();
                // SqlParser.g:387:52: ( DESC )?
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
    // SqlParser.g:390:1: drop_index_stmt : DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) ) ;
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
            // SqlParser.g:390:16: ( DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) ) )
            // SqlParser.g:390:18: DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id
            {
            DROP434=(Token)match(input,DROP,FOLLOW_DROP_in_drop_index_stmt3674);  
            stream_DROP.add(DROP434);

            INDEX435=(Token)match(input,INDEX,FOLLOW_INDEX_in_drop_index_stmt3676);  
            stream_INDEX.add(INDEX435);

            // SqlParser.g:390:29: ( IF EXISTS )?
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
                    // SqlParser.g:390:30: IF EXISTS
                    {
                    IF436=(Token)match(input,IF,FOLLOW_IF_in_drop_index_stmt3679);  
                    stream_IF.add(IF436);

                    EXISTS437=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_index_stmt3681);  
                    stream_EXISTS.add(EXISTS437);


                    }
                    break;

            }

            // SqlParser.g:390:42: (database_name= id DOT )?
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
                    // SqlParser.g:390:43: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_index_stmt3688);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT438=(Token)match(input,DOT,FOLLOW_DOT_in_drop_index_stmt3690);  
                    stream_DOT.add(DOT438);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_index_stmt3696);
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
            // 391:1: -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) )
            {
                // SqlParser.g:391:4: ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DROP_INDEX, "DROP_INDEX"), root_1);

                // SqlParser.g:391:17: ^( OPTIONS ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:391:27: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:391:36: ^( $index_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_index_name.nextNode(), root_2);

                // SqlParser.g:391:50: ( $database_name)?
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
    // SqlParser.g:394:1: create_trigger_stmt : CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END ;
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
            // SqlParser.g:394:20: ( CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END )
            // SqlParser.g:394:22: CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END
            {
            root_0 = (Object)adaptor.nil();

            CREATE439=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_trigger_stmt3726); 
            CREATE439_tree = (Object)adaptor.create(CREATE439);
            adaptor.addChild(root_0, CREATE439_tree);

            // SqlParser.g:394:29: ( TEMPORARY )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==TEMPORARY) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // SqlParser.g:394:29: TEMPORARY
                    {
                    TEMPORARY440=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_trigger_stmt3728); 
                    TEMPORARY440_tree = (Object)adaptor.create(TEMPORARY440);
                    adaptor.addChild(root_0, TEMPORARY440_tree);


                    }
                    break;

            }

            TRIGGER441=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_create_trigger_stmt3731); 
            TRIGGER441_tree = (Object)adaptor.create(TRIGGER441);
            adaptor.addChild(root_0, TRIGGER441_tree);

            // SqlParser.g:394:48: ( IF NOT EXISTS )?
            int alt163=2;
            alt163 = dfa163.predict(input);
            switch (alt163) {
                case 1 :
                    // SqlParser.g:394:49: IF NOT EXISTS
                    {
                    IF442=(Token)match(input,IF,FOLLOW_IF_in_create_trigger_stmt3734); 
                    IF442_tree = (Object)adaptor.create(IF442);
                    adaptor.addChild(root_0, IF442_tree);

                    NOT443=(Token)match(input,NOT,FOLLOW_NOT_in_create_trigger_stmt3736); 
                    NOT443_tree = (Object)adaptor.create(NOT443);
                    adaptor.addChild(root_0, NOT443_tree);

                    EXISTS444=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_trigger_stmt3738); 
                    EXISTS444_tree = (Object)adaptor.create(EXISTS444);
                    adaptor.addChild(root_0, EXISTS444_tree);


                    }
                    break;

            }

            // SqlParser.g:394:65: (database_name= id DOT )?
            int alt164=2;
            alt164 = dfa164.predict(input);
            switch (alt164) {
                case 1 :
                    // SqlParser.g:394:66: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_trigger_stmt3745);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT445=(Token)match(input,DOT,FOLLOW_DOT_in_create_trigger_stmt3747); 
                    DOT445_tree = (Object)adaptor.create(DOT445);
                    adaptor.addChild(root_0, DOT445_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_trigger_stmt3753);
            trigger_name=id();

            state._fsp--;

            adaptor.addChild(root_0, trigger_name.getTree());
            // SqlParser.g:395:3: ( BEFORE | AFTER | INSTEAD OF )?
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
                    // SqlParser.g:395:4: BEFORE
                    {
                    BEFORE446=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_create_trigger_stmt3758); 
                    BEFORE446_tree = (Object)adaptor.create(BEFORE446);
                    adaptor.addChild(root_0, BEFORE446_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:395:13: AFTER
                    {
                    AFTER447=(Token)match(input,AFTER,FOLLOW_AFTER_in_create_trigger_stmt3762); 
                    AFTER447_tree = (Object)adaptor.create(AFTER447);
                    adaptor.addChild(root_0, AFTER447_tree);


                    }
                    break;
                case 3 :
                    // SqlParser.g:395:21: INSTEAD OF
                    {
                    INSTEAD448=(Token)match(input,INSTEAD,FOLLOW_INSTEAD_in_create_trigger_stmt3766); 
                    INSTEAD448_tree = (Object)adaptor.create(INSTEAD448);
                    adaptor.addChild(root_0, INSTEAD448_tree);

                    OF449=(Token)match(input,OF,FOLLOW_OF_in_create_trigger_stmt3768); 
                    OF449_tree = (Object)adaptor.create(OF449);
                    adaptor.addChild(root_0, OF449_tree);


                    }
                    break;

            }

            // SqlParser.g:395:34: ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? )
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
                    // SqlParser.g:395:35: DELETE
                    {
                    DELETE450=(Token)match(input,DELETE,FOLLOW_DELETE_in_create_trigger_stmt3773); 
                    DELETE450_tree = (Object)adaptor.create(DELETE450);
                    adaptor.addChild(root_0, DELETE450_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:395:44: INSERT
                    {
                    INSERT451=(Token)match(input,INSERT,FOLLOW_INSERT_in_create_trigger_stmt3777); 
                    INSERT451_tree = (Object)adaptor.create(INSERT451);
                    adaptor.addChild(root_0, INSERT451_tree);


                    }
                    break;
                case 3 :
                    // SqlParser.g:395:53: UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )?
                    {
                    UPDATE452=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_create_trigger_stmt3781); 
                    UPDATE452_tree = (Object)adaptor.create(UPDATE452);
                    adaptor.addChild(root_0, UPDATE452_tree);

                    // SqlParser.g:395:60: ( OF column_names+= id ( COMMA column_names+= id )* )?
                    int alt167=2;
                    int LA167_0 = input.LA(1);

                    if ( (LA167_0==OF) ) {
                        alt167=1;
                    }
                    switch (alt167) {
                        case 1 :
                            // SqlParser.g:395:61: OF column_names+= id ( COMMA column_names+= id )*
                            {
                            OF453=(Token)match(input,OF,FOLLOW_OF_in_create_trigger_stmt3784); 
                            OF453_tree = (Object)adaptor.create(OF453);
                            adaptor.addChild(root_0, OF453_tree);

                            pushFollow(FOLLOW_id_in_create_trigger_stmt3788);
                            column_names=id();

                            state._fsp--;

                            adaptor.addChild(root_0, column_names.getTree());
                            if (list_column_names==null) list_column_names=new ArrayList();
                            list_column_names.add(column_names.getTree());

                            // SqlParser.g:395:81: ( COMMA column_names+= id )*
                            loop166:
                            do {
                                int alt166=2;
                                int LA166_0 = input.LA(1);

                                if ( (LA166_0==COMMA) ) {
                                    alt166=1;
                                }


                                switch (alt166) {
                            	case 1 :
                            	    // SqlParser.g:395:82: COMMA column_names+= id
                            	    {
                            	    COMMA454=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_trigger_stmt3791); 
                            	    COMMA454_tree = (Object)adaptor.create(COMMA454);
                            	    adaptor.addChild(root_0, COMMA454_tree);

                            	    pushFollow(FOLLOW_id_in_create_trigger_stmt3795);
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

            ON455=(Token)match(input,ON,FOLLOW_ON_in_create_trigger_stmt3804); 
            ON455_tree = (Object)adaptor.create(ON455);
            adaptor.addChild(root_0, ON455_tree);

            pushFollow(FOLLOW_id_in_create_trigger_stmt3808);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:396:20: ( FOR EACH ROW )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==FOR) ) {
                alt169=1;
            }
            switch (alt169) {
                case 1 :
                    // SqlParser.g:396:21: FOR EACH ROW
                    {
                    FOR456=(Token)match(input,FOR,FOLLOW_FOR_in_create_trigger_stmt3811); 
                    FOR456_tree = (Object)adaptor.create(FOR456);
                    adaptor.addChild(root_0, FOR456_tree);

                    EACH457=(Token)match(input,EACH,FOLLOW_EACH_in_create_trigger_stmt3813); 
                    EACH457_tree = (Object)adaptor.create(EACH457);
                    adaptor.addChild(root_0, EACH457_tree);

                    ROW458=(Token)match(input,ROW,FOLLOW_ROW_in_create_trigger_stmt3815); 
                    ROW458_tree = (Object)adaptor.create(ROW458);
                    adaptor.addChild(root_0, ROW458_tree);


                    }
                    break;

            }

            // SqlParser.g:396:36: ( WHEN expr )?
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==WHEN) ) {
                alt170=1;
            }
            switch (alt170) {
                case 1 :
                    // SqlParser.g:396:37: WHEN expr
                    {
                    WHEN459=(Token)match(input,WHEN,FOLLOW_WHEN_in_create_trigger_stmt3820); 
                    WHEN459_tree = (Object)adaptor.create(WHEN459);
                    adaptor.addChild(root_0, WHEN459_tree);

                    pushFollow(FOLLOW_expr_in_create_trigger_stmt3822);
                    expr460=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr460.getTree());

                    }
                    break;

            }

            BEGIN461=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_create_trigger_stmt3828); 
            BEGIN461_tree = (Object)adaptor.create(BEGIN461);
            adaptor.addChild(root_0, BEGIN461_tree);

            // SqlParser.g:397:9: ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+
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
            	    // SqlParser.g:397:10: ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI
            	    {
            	    // SqlParser.g:397:10: ( update_stmt | insert_stmt | delete_stmt | select_stmt )
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
            	            // SqlParser.g:397:11: update_stmt
            	            {
            	            pushFollow(FOLLOW_update_stmt_in_create_trigger_stmt3832);
            	            update_stmt462=update_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, update_stmt462.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // SqlParser.g:397:25: insert_stmt
            	            {
            	            pushFollow(FOLLOW_insert_stmt_in_create_trigger_stmt3836);
            	            insert_stmt463=insert_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, insert_stmt463.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // SqlParser.g:397:39: delete_stmt
            	            {
            	            pushFollow(FOLLOW_delete_stmt_in_create_trigger_stmt3840);
            	            delete_stmt464=delete_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, delete_stmt464.getTree());

            	            }
            	            break;
            	        case 4 :
            	            // SqlParser.g:397:53: select_stmt
            	            {
            	            pushFollow(FOLLOW_select_stmt_in_create_trigger_stmt3844);
            	            select_stmt465=select_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, select_stmt465.getTree());

            	            }
            	            break;

            	    }

            	    SEMI466=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_trigger_stmt3847); 
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

            END467=(Token)match(input,END,FOLLOW_END_in_create_trigger_stmt3851); 
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
    // SqlParser.g:400:1: drop_trigger_stmt : DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id ;
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
            // SqlParser.g:400:18: ( DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id )
            // SqlParser.g:400:20: DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id
            {
            root_0 = (Object)adaptor.nil();

            DROP468=(Token)match(input,DROP,FOLLOW_DROP_in_drop_trigger_stmt3859); 
            DROP468_tree = (Object)adaptor.create(DROP468);
            adaptor.addChild(root_0, DROP468_tree);

            TRIGGER469=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_drop_trigger_stmt3861); 
            TRIGGER469_tree = (Object)adaptor.create(TRIGGER469);
            adaptor.addChild(root_0, TRIGGER469_tree);

            // SqlParser.g:400:33: ( IF EXISTS )?
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
                    // SqlParser.g:400:34: IF EXISTS
                    {
                    IF470=(Token)match(input,IF,FOLLOW_IF_in_drop_trigger_stmt3864); 
                    IF470_tree = (Object)adaptor.create(IF470);
                    adaptor.addChild(root_0, IF470_tree);

                    EXISTS471=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_trigger_stmt3866); 
                    EXISTS471_tree = (Object)adaptor.create(EXISTS471);
                    adaptor.addChild(root_0, EXISTS471_tree);


                    }
                    break;

            }

            // SqlParser.g:400:46: (database_name= id DOT )?
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
                    // SqlParser.g:400:47: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_trigger_stmt3873);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT472=(Token)match(input,DOT,FOLLOW_DOT_in_drop_trigger_stmt3875); 
                    DOT472_tree = (Object)adaptor.create(DOT472);
                    adaptor.addChild(root_0, DOT472_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_trigger_stmt3881);
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
    // SqlParser.g:405:1: id : ( ID | keyword );
    public final SqlParser.id_return id() throws RecognitionException {
        SqlParser.id_return retval = new SqlParser.id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID473=null;
        SqlParser.keyword_return keyword474 = null;


        Object ID473_tree=null;

        try {
            // SqlParser.g:405:3: ( ID | keyword )
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
                    // SqlParser.g:405:5: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID473=(Token)match(input,ID,FOLLOW_ID_in_id3891); 
                    ID473_tree = (Object)adaptor.create(ID473);
                    adaptor.addChild(root_0, ID473_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:405:10: keyword
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_id3895);
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
    // SqlParser.g:407:1: keyword : ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GROUP | HAVING | IF | IGNORE | IMMEDIATE | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | JOIN | KEY | LEFT | LIMIT | NATURAL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) ;
    public final SqlParser.keyword_return keyword() throws RecognitionException {
        SqlParser.keyword_return retval = new SqlParser.keyword_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set475=null;

        Object set475_tree=null;

        try {
            // SqlParser.g:407:8: ( ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GROUP | HAVING | IF | IGNORE | IMMEDIATE | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | JOIN | KEY | LEFT | LIMIT | NATURAL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) )
            // SqlParser.g:407:10: ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GROUP | HAVING | IF | IGNORE | IMMEDIATE | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | JOIN | KEY | LEFT | LIMIT | NATURAL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE )
            {
            root_0 = (Object)adaptor.nil();

            set475=(Token)input.LT(1);
            if ( (input.LA(1)>=ABORT && input.LA(1)<=FROM)||(input.LA(1)>=GROUP && input.LA(1)<=IMMEDIATE)||(input.LA(1)>=INDEX && input.LA(1)<=IS)||(input.LA(1)>=JOIN && input.LA(1)<=LEFT)||input.LA(1)==LIMIT||input.LA(1)==NATURAL||(input.LA(1)>=NULL && input.LA(1)<=REFERENCES)||(input.LA(1)>=REINDEX && input.LA(1)<=WHERE) ) {
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
    // SqlParser.g:526:1: id_column_def : ( ID | keyword_column_def );
    public final SqlParser.id_column_def_return id_column_def() throws RecognitionException {
        SqlParser.id_column_def_return retval = new SqlParser.id_column_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID476=null;
        SqlParser.keyword_column_def_return keyword_column_def477 = null;


        Object ID476_tree=null;

        try {
            // SqlParser.g:526:14: ( ID | keyword_column_def )
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
                    // SqlParser.g:526:16: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID476=(Token)match(input,ID,FOLLOW_ID_in_id_column_def4569); 
                    ID476_tree = (Object)adaptor.create(ID476);
                    adaptor.addChild(root_0, ID476_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:526:21: keyword_column_def
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_keyword_column_def_in_id_column_def4573);
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
    // SqlParser.g:528:1: keyword_column_def : ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) ;
    public final SqlParser.keyword_column_def_return keyword_column_def() throws RecognitionException {
        SqlParser.keyword_column_def_return retval = new SqlParser.keyword_column_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set478=null;

        Object set478_tree=null;

        try {
            // SqlParser.g:528:19: ( ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) )
            // SqlParser.g:528:21: ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE )
            {
            root_0 = (Object)adaptor.nil();

            set478=(Token)input.LT(1);
            if ( (input.LA(1)>=ABORT && input.LA(1)<=COLLATE)||(input.LA(1)>=COMMIT && input.LA(1)<=CONFLICT)||(input.LA(1)>=CREATE && input.LA(1)<=WHERE) ) {
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
            return "()+ loopback of 61:16: ( sql_stmt )+";
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
            return "63:11: ( EXPLAIN ( QUERY PLAN )? )?";
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
            return "63:20: ( QUERY PLAN )?";
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
            return "65:1: sql_stmt_core : ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt );";
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
            "\62\2\1\uffff\5\2\1\uffff\11\2\1\uffff\3\2\1\uffff\1\2\1\uffff"+
            "\1\2\2\uffff\15\2\1\uffff\32\2\1\uffff\1\1",
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
            return "95:23: (database_name= id DOT )?";
        }
    }
    static final String DFA8_eotS =
        "\137\uffff";
    static final String DFA8_eofS =
        "\137\uffff";
    static final String DFA8_minS =
        "\1\27\33\uffff\1\21\21\uffff\1\30\2\uffff\1\21\6\30\47\uffff";
    static final String DFA8_maxS =
        "\1\u00af\33\uffff\1\u00b4\21\uffff\1\u00af\2\uffff\1\u00b4\1\110"+
        "\3\u009c\1\110\1\u00b1\47\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\2\34\uffff\1\1\100\uffff";
    static final String DFA8_specialS =
        "\137\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\1\uffff\1\1\1\uffff\1\1\36\uffff\62\1\1\uffff\5\1\1\uffff"+
            "\11\1\1\uffff\3\1\1\uffff\1\1\1\uffff\1\1\2\uffff\4\1\1\34\10"+
            "\1\1\uffff\32\1\1\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            "\1\65\6\36\1\56\1\uffff\1\62\4\36\1\uffff\6\36\1\64\2\36\1\uffff"+
            "\3\36\1\uffff\1\67\1\uffff\2\36\1\uffff\5\36\1\66\7\36\1\uffff"+
            "\20\36\1\63\10\36\1\61\1\uffff\3\36\1\uffff\2\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36\1\uffff\1\1\37\uffff\62\1\1\uffff\5\1\1\uffff\11\1\1"+
            "\uffff\3\1\1\uffff\1\1\1\uffff\1\1\2\uffff\15\1\1\uffff\32\1"+
            "\1\uffff\1\1",
            "",
            "",
            "\3\1\4\uffff\1\36\1\uffff\1\1\1\uffff\3\1\33\uffff\62\1\1\uffff"+
            "\5\1\1\uffff\11\1\1\uffff\3\1\1\uffff\1\1\1\uffff\2\1\1\uffff"+
            "\15\1\1\uffff\32\1\1\uffff\3\1\1\uffff\2\1",
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
        "\140\uffff";
    static final String DFA9_eofS =
        "\140\uffff";
    static final String DFA9_minS =
        "\1\27\34\uffff\1\21\2\uffff\1\30\1\21\6\30\70\uffff";
    static final String DFA9_maxS =
        "\1\u00af\34\uffff\1\u00b4\2\uffff\1\u00af\1\u00b4\1\110\3\u009c"+
        "\1\110\1\u00b1\70\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\2\50\uffff\1\1\65\uffff";
    static final String DFA9_specialS =
        "\140\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\1\uffff\1\1\1\uffff\1\1\36\uffff\6\1\1\35\53\1\1\uffff"+
            "\5\1\1\uffff\11\1\1\uffff\3\1\1\uffff\1\1\1\uffff\1\1\2\uffff"+
            "\15\1\1\uffff\32\1\1\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            "\1\45\6\52\1\40\1\uffff\1\42\4\52\1\uffff\6\52\1\44\2\52\1\uffff"+
            "\3\52\1\uffff\1\47\1\uffff\2\52\1\uffff\5\52\1\46\7\52\1\uffff"+
            "\20\52\1\43\10\52\1\41\1\uffff\3\52\1\uffff\2\52",
            "",
            "",
            "\1\52\1\uffff\1\1\37\uffff\62\1\1\uffff\5\1\1\uffff\11\1\1"+
            "\uffff\3\1\1\uffff\1\1\1\uffff\1\1\2\uffff\15\1\1\uffff\32\1"+
            "\1\uffff\1\1",
            "\3\1\4\uffff\1\52\1\uffff\1\1\1\uffff\3\1\33\uffff\62\1\1\uffff"+
            "\5\1\1\uffff\11\1\1\uffff\3\1\1\uffff\1\1\1\uffff\2\1\1\uffff"+
            "\15\1\1\uffff\32\1\1\uffff\3\1\1\uffff\2\1",
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
            return "()* loopback of 101:25: ( AND and_subexpr )*";
        }
    }
    static final String DFA10_eotS =
        "\165\uffff";
    static final String DFA10_eofS =
        "\165\uffff";
    static final String DFA10_minS =
        "\1\4\5\uffff\1\27\1\21\74\uffff\1\30\2\uffff\1\21\6\30\47\uffff";
    static final String DFA10_maxS =
        "\1\u00af\5\uffff\1\u00ad\1\u00b4\74\uffff\1\u00af\2\uffff\1\u00b4"+
        "\1\110\3\u009c\1\110\1\u00b1\47\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\7\uffff\1\2\153\uffff";
    static final String DFA10_specialS =
        "\165\uffff}>";
    static final String[] DFA10_transitionS = {
            "\4\1\17\uffff\1\11\1\uffff\1\11\1\uffff\1\11\36\uffff\15\11"+
            "\1\7\44\11\1\1\5\11\1\1\10\11\1\6\1\1\3\11\1\1\1\11\1\1\1\11"+
            "\2\1\15\11\1\1\32\11\1\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "\1\11\1\uffff\1\11\1\uffff\1\11\110\uffff\1\11\6\uffff\1\11"+
            "\1\uffff\1\11\13\uffff\1\11\7\uffff\1\11\2\uffff\1\1\1\uffff"+
            "\1\1\4\uffff\1\11\30\uffff\1\11\10\uffff\1\11",
            "\3\1\3\uffff\1\11\1\uffff\1\11\1\1\1\11\3\1\33\uffff\52\1\1"+
            "\113\6\1\1\104\1\uffff\1\110\4\1\1\uffff\6\1\1\112\2\1\1\uffff"+
            "\3\1\1\uffff\1\115\1\uffff\2\1\1\uffff\5\1\1\114\7\1\1\uffff"+
            "\20\1\1\111\10\1\1\107\1\uffff\3\1\1\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\1\1\uffff\1\11\37\uffff\62\11\1\uffff\5\11\1\uffff\11\11"+
            "\1\uffff\3\11\1\uffff\1\11\1\uffff\1\11\2\uffff\15\11\1\uffff"+
            "\32\11\1\uffff\1\11",
            "",
            "",
            "\3\11\4\uffff\1\1\1\uffff\1\11\1\uffff\3\11\33\uffff\62\11"+
            "\1\uffff\5\11\1\uffff\11\11\1\uffff\3\11\1\uffff\1\11\1\uffff"+
            "\2\11\1\uffff\15\11\1\uffff\32\11\1\uffff\3\11\1\uffff\2\11",
            "\1\1\57\uffff\1\11",
            "\1\1\44\uffff\1\11\136\uffff\1\11",
            "\1\1\u0083\uffff\1\11",
            "\1\1\u0083\uffff\1\11",
            "\1\1\57\uffff\1\11",
            "\1\1\u0098\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "103:34: ( cond_expr )?";
        }
    }
    static final String DFA20_eotS =
        "\23\uffff";
    static final String DFA20_eofS =
        "\23\uffff";
    static final String DFA20_minS =
        "\1\4\1\107\1\uffff\1\32\6\uffff\1\32\10\uffff";
    static final String DFA20_maxS =
        "\2\u0093\1\uffff\1\u00af\6\uffff\1\u00af\10\uffff";
    static final String DFA20_acceptS =
        "\2\uffff\1\1\1\uffff\1\4\2\uffff\1\5\1\6\4\uffff\1\2\1\3\4\uffff";
    static final String DFA20_specialS =
        "\23\uffff}>";
    static final String[] DFA20_transitionS = {
            "\4\10\77\uffff\1\7\44\uffff\1\2\5\uffff\1\3\10\uffff\2\4\3\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\1\1\4\15\uffff\1\2",
            "\1\7\44\uffff\1\2\5\uffff\1\12\15\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\1\4\14\uffff\1\2",
            "",
            "\1\15\37\uffff\62\16\1\uffff\5\16\1\uffff\11\16\1\uffff\3\16"+
            "\1\uffff\1\16\1\uffff\1\16\2\uffff\15\16\1\uffff\32\16\1\uffff"+
            "\1\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15\37\uffff\62\16\1\uffff\5\16\1\uffff\11\16\1\uffff\3\16"+
            "\1\uffff\1\16\1\uffff\1\16\2\uffff\15\16\1\uffff\32\16\1\uffff"+
            "\1\16",
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
            return "105:1: cond_expr : ( ( NOT )? match_op match_expr= eq_subexpr ( ESCAPE escape_expr= eq_subexpr )? -> ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? ) | ( NOT )? IN LPAREN expr ( COMMA expr )* RPAREN -> ^( IN_VALUES ( NOT )? ^( IN ( expr )+ ) ) | ( NOT )? IN (database_name= id DOT )? table_name= id -> ^( IN_TABLE ( NOT )? ^( IN ^( $table_name ( $database_name)? ) ) ) | ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL ) | ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr -> ^( BETWEEN ( NOT )? ^( AND $e1 $e2) ) | ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )+ );";
        }
    }
    static final String DFA12_eotS =
        "\141\uffff";
    static final String DFA12_eofS =
        "\141\uffff";
    static final String DFA12_minS =
        "\1\27\1\21\37\uffff\1\30\1\21\6\30\70\uffff";
    static final String DFA12_maxS =
        "\1\u00af\1\u00b4\37\uffff\1\u00af\1\u00b4\1\110\3\u009c\1\110\1"+
        "\u00b1\70\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\50\uffff\1\1\65\uffff";
    static final String DFA12_specialS =
        "\141\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\2\1\uffff\1\2\1\uffff\1\2\36\uffff\51\2\1\1\10\2\1\uffff"+
            "\5\2\1\uffff\11\2\1\uffff\3\2\1\uffff\1\2\1\uffff\1\2\2\uffff"+
            "\15\2\1\uffff\32\2\1\uffff\1\2",
            "\3\53\3\uffff\1\2\1\uffff\1\2\1\53\1\2\3\53\33\uffff\52\53"+
            "\1\46\6\53\1\41\1\uffff\1\43\4\53\1\uffff\6\53\1\45\2\53\1\uffff"+
            "\3\53\1\uffff\1\50\1\uffff\2\53\1\uffff\5\53\1\47\7\53\1\uffff"+
            "\20\53\1\44\10\53\1\42\1\uffff\3\53\1\uffff\2\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\53\1\uffff\1\2\37\uffff\62\2\1\uffff\5\2\1\uffff\11\2\1"+
            "\uffff\3\2\1\uffff\1\2\1\uffff\1\2\2\uffff\15\2\1\uffff\32\2"+
            "\1\uffff\1\2",
            "\3\2\4\uffff\1\53\1\uffff\1\2\1\uffff\3\2\33\uffff\62\2\1\uffff"+
            "\5\2\1\uffff\11\2\1\uffff\3\2\1\uffff\1\2\1\uffff\2\2\1\uffff"+
            "\15\2\1\uffff\32\2\1\uffff\3\2\1\uffff\2\2",
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
            return "106:41: ( ESCAPE escape_expr= eq_subexpr )?";
        }
    }
    static final String DFA16_eotS =
        "\101\uffff";
    static final String DFA16_eofS =
        "\101\uffff";
    static final String DFA16_minS =
        "\1\72\2\27\76\uffff";
    static final String DFA16_maxS =
        "\3\u00af\76\uffff";
    static final String DFA16_acceptS =
        "\3\uffff\1\2\35\uffff\1\1\37\uffff";
    static final String DFA16_specialS =
        "\101\uffff}>";
    static final String[] DFA16_transitionS = {
            "\62\2\1\uffff\5\2\1\uffff\11\2\1\uffff\3\2\1\uffff\1\2\1\uffff"+
            "\1\2\2\uffff\15\2\1\uffff\32\2\1\uffff\1\1",
            "\1\3\1\41\1\3\1\uffff\1\3\36\uffff\62\3\1\uffff\5\3\1\uffff"+
            "\11\3\1\uffff\3\3\1\uffff\1\3\1\uffff\1\3\2\uffff\15\3\1\uffff"+
            "\32\3\1\uffff\1\3",
            "\1\3\1\41\1\3\1\uffff\1\3\36\uffff\62\3\1\uffff\5\3\1\uffff"+
            "\11\3\1\uffff\3\3\1\uffff\1\3\1\uffff\1\3\2\uffff\15\3\1\uffff"+
            "\32\3\1\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "108:13: (database_name= id DOT )?";
        }
    }
    static final String DFA19_eotS =
        "\40\uffff";
    static final String DFA19_eofS =
        "\40\uffff";
    static final String DFA19_minS =
        "\1\4\37\uffff";
    static final String DFA19_maxS =
        "\1\u00af\37\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\2\35\uffff\1\1";
    static final String DFA19_specialS =
        "\40\uffff}>";
    static final String[] DFA19_transitionS = {
            "\4\37\17\uffff\1\1\1\uffff\1\1\1\uffff\1\1\36\uffff\62\1\1\uffff"+
            "\5\1\1\uffff\11\1\1\uffff\3\1\1\uffff\1\1\1\uffff\1\1\2\uffff"+
            "\15\1\1\uffff\32\1\1\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()+ loopback of 113:5: ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )+";
        }
    }
    static final String DFA21_eotS =
        "\51\uffff";
    static final String DFA21_eofS =
        "\51\uffff";
    static final String DFA21_minS =
        "\1\4\50\uffff";
    static final String DFA21_maxS =
        "\1\u00af\50\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\2\46\uffff\1\1";
    static final String DFA21_specialS =
        "\51\uffff}>";
    static final String[] DFA21_transitionS = {
            "\4\1\4\50\13\uffff\1\1\1\uffff\1\1\1\uffff\1\1\36\uffff\164"+
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
            return "()* loopback of 118:25: ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )*";
        }
    }
    static final String DFA22_eotS =
        "\52\uffff";
    static final String DFA22_eofS =
        "\52\uffff";
    static final String DFA22_minS =
        "\1\4\51\uffff";
    static final String DFA22_maxS =
        "\1\u00af\51\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\2\47\uffff\1\1";
    static final String DFA22_specialS =
        "\52\uffff}>";
    static final String[] DFA22_transitionS = {
            "\10\1\4\51\7\uffff\1\1\1\uffff\1\1\1\uffff\1\1\36\uffff\164"+
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
            return "()* loopback of 120:26: ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )*";
        }
    }
    static final String DFA23_eotS =
        "\53\uffff";
    static final String DFA23_eofS =
        "\53\uffff";
    static final String DFA23_minS =
        "\1\4\52\uffff";
    static final String DFA23_maxS =
        "\1\u00af\52\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\2\50\uffff\1\1";
    static final String DFA23_specialS =
        "\53\uffff}>";
    static final String[] DFA23_transitionS = {
            "\14\1\1\uffff\2\52\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\36\uffff"+
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
            return "()* loopback of 122:26: ( ( PLUS | MINUS ) add_subexpr )*";
        }
    }
    static final String DFA24_eotS =
        "\54\uffff";
    static final String DFA24_eofS =
        "\54\uffff";
    static final String DFA24_minS =
        "\1\4\53\uffff";
    static final String DFA24_maxS =
        "\1\u00af\53\uffff";
    static final String DFA24_acceptS =
        "\1\uffff\1\2\51\uffff\1\1";
    static final String DFA24_specialS =
        "\54\uffff}>";
    static final String[] DFA24_transitionS = {
            "\14\1\1\uffff\2\1\1\uffff\3\53\1\1\1\uffff\1\1\1\uffff\1\1\36"+
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
            return "()* loopback of 124:26: ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )*";
        }
    }
    static final String DFA25_eotS =
        "\55\uffff";
    static final String DFA25_eofS =
        "\55\uffff";
    static final String DFA25_minS =
        "\1\4\54\uffff";
    static final String DFA25_maxS =
        "\1\u00af\54\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\2\52\uffff\1\1";
    static final String DFA25_specialS =
        "\55\uffff}>";
    static final String[] DFA25_transitionS = {
            "\14\1\1\54\2\1\1\uffff\4\1\1\uffff\1\1\1\uffff\1\1\36\uffff"+
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
            return "()* loopback of 126:26: ( DOUBLE_PIPE con_subexpr )*";
        }
    }
    static final String DFA26_eotS =
        "\23\uffff";
    static final String DFA26_eofS =
        "\23\uffff";
    static final String DFA26_minS =
        "\1\21\22\uffff";
    static final String DFA26_maxS =
        "\1\u00b4\22\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\1\20\uffff\1\2";
    static final String DFA26_specialS =
        "\23\uffff}>";
    static final String[] DFA26_transitionS = {
            "\3\22\6\uffff\1\1\1\uffff\3\1\33\uffff\62\1\1\uffff\5\1\1\uffff"+
            "\11\1\1\uffff\3\1\1\uffff\1\1\1\uffff\1\1\1\22\1\uffff\15\1"+
            "\1\uffff\32\1\1\uffff\3\1\1\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "128:1: con_subexpr : ( unary_subexpr | unary_op unary_subexpr -> ^( unary_op unary_subexpr ) );";
        }
    }
    static final String DFA27_eotS =
        "\72\uffff";
    static final String DFA27_eofS =
        "\72\uffff";
    static final String DFA27_minS =
        "\1\4\1\27\70\uffff";
    static final String DFA27_maxS =
        "\2\u00af\70\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\2\53\uffff\1\1\13\uffff";
    static final String DFA27_specialS =
        "\72\uffff}>";
    static final String[] DFA27_transitionS = {
            "\17\2\1\uffff\4\2\1\uffff\1\2\1\uffff\1\2\36\uffff\23\2\1\1"+
            "\140\2\1\uffff\1\2",
            "\1\2\1\uffff\1\2\1\uffff\1\2\110\uffff\1\2\6\uffff\1\2\1\uffff"+
            "\1\2\13\uffff\1\2\7\uffff\1\2\11\uffff\1\2\30\uffff\1\2\10\uffff"+
            "\1\2\1\uffff\1\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "132:26: ( COLLATE collation_name= ID )?";
        }
    }
    static final String DFA36_eotS =
        "\u0111\uffff";
    static final String DFA36_eofS =
        "\u0111\uffff";
    static final String DFA36_minS =
        "\1\32\4\uffff\4\4\3\uffff\1\4\1\30\1\uffff\1\21\1\30\u0100\uffff";
    static final String DFA36_maxS =
        "\1\u00b4\4\uffff\4\u00af\3\uffff\1\u00af\1\32\1\uffff\1\u00b4\1"+
        "\32\u0100\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\1\1\7\uffff\1\2\4\uffff\1\5\2\uffff\1\3\u00b8\uffff\1\4"+
        "\56\uffff\1\6\1\uffff\1\7\23\uffff\1\10\1\uffff";
    static final String DFA36_specialS =
        "\u0111\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\16\1\uffff\3\11\33\uffff\20\21\1\17\1\15\10\21\1\6\1\7\1"+
            "\10\25\21\1\uffff\5\21\1\uffff\11\21\1\uffff\3\21\1\uffff\1"+
            "\21\1\uffff\1\21\2\uffff\1\5\12\21\1\20\1\21\1\uffff\32\21\1"+
            "\uffff\1\14\2\1\1\uffff\2\1",
            "",
            "",
            "",
            "",
            "\17\1\1\uffff\4\1\1\21\1\1\1\uffff\1\1\36\uffff\164\1\1\uffff"+
            "\1\1",
            "\17\1\1\uffff\4\1\1\21\1\1\1\uffff\1\1\36\uffff\164\1\1\uffff"+
            "\1\1",
            "\17\1\1\uffff\4\1\1\21\1\1\1\uffff\1\1\36\uffff\164\1\1\uffff"+
            "\1\1",
            "\17\1\1\uffff\4\1\1\21\1\1\1\uffff\1\1\36\uffff\164\1\1\uffff"+
            "\1\1",
            "",
            "",
            "",
            "\17\21\1\uffff\6\21\1\u00ca\1\21\36\uffff\164\21\1\uffff\1"+
            "\21",
            "\1\21\1\uffff\1\u00f9",
            "",
            "\3\u00fb\4\uffff\1\21\1\uffff\1\u00fb\1\uffff\3\u00fb\33\uffff"+
            "\62\u00fb\1\uffff\5\u00fb\1\uffff\11\u00fb\1\uffff\3\u00fb\1"+
            "\uffff\1\u00fb\1\uffff\2\u00fb\1\uffff\15\u00fb\1\uffff\32\u00fb"+
            "\1\uffff\3\u00fb\1\uffff\2\u00fb",
            "\1\21\1\uffff\1\u010f",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "134:1: atom_expr : ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) | name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN -> ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? ) | LPAREN expr RPAREN | CAST LPAREN expr AS type_name RPAREN | CASE (case_expr= expr )? ( when_expr )+ ( ELSE else_expr= expr )? END -> ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? ) | raise_function );";
        }
    }
    static final String DFA29_eotS =
        "\61\uffff";
    static final String DFA29_eofS =
        "\61\uffff";
    static final String DFA29_minS =
        "\1\72\1\4\57\uffff";
    static final String DFA29_maxS =
        "\2\u00af\57\uffff";
    static final String DFA29_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\54\uffff";
    static final String DFA29_specialS =
        "\61\uffff}>";
    static final String[] DFA29_transitionS = {
            "\62\2\1\uffff\5\2\1\uffff\11\2\1\uffff\3\2\1\uffff\1\2\1\uffff"+
            "\1\2\2\uffff\15\2\1\uffff\32\2\1\uffff\1\1",
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
            return "137:5: ( (database_name= id DOT )? table_name= id DOT )?";
        }
    }
    static final String DFA28_eotS =
        "\145\uffff";
    static final String DFA28_eofS =
        "\145\uffff";
    static final String DFA28_minS =
        "\1\72\2\30\2\72\1\4\1\uffff\1\4\135\uffff";
    static final String DFA28_maxS =
        "\1\u00af\2\30\3\u00af\1\uffff\1\u00af\135\uffff";
    static final String DFA28_acceptS =
        "\6\uffff\1\1\3\uffff\1\2\132\uffff";
    static final String DFA28_specialS =
        "\145\uffff}>";
    static final String[] DFA28_transitionS = {
            "\62\2\1\uffff\5\2\1\uffff\11\2\1\uffff\3\2\1\uffff\1\2\1\uffff"+
            "\1\2\2\uffff\15\2\1\uffff\32\2\1\uffff\1\1",
            "\1\3",
            "\1\4",
            "\62\6\1\uffff\5\6\1\uffff\11\6\1\uffff\3\6\1\uffff\1\6\1\uffff"+
            "\1\6\2\uffff\15\6\1\uffff\32\6\1\uffff\1\5",
            "\62\6\1\uffff\5\6\1\uffff\11\6\1\uffff\3\6\1\uffff\1\6\1\uffff"+
            "\1\6\2\uffff\15\6\1\uffff\32\6\1\uffff\1\7",
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
            "",
            "",
            "",
            "",
            "",
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
            return "137:6: (database_name= id DOT )?";
        }
    }
    static final String DFA32_eotS =
        "\26\uffff";
    static final String DFA32_eofS =
        "\26\uffff";
    static final String DFA32_minS =
        "\1\21\25\uffff";
    static final String DFA32_maxS =
        "\1\u00b4\25\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\1\22\uffff\1\2\1\3";
    static final String DFA32_specialS =
        "\26\uffff}>";
    static final String[] DFA32_transitionS = {
            "\3\1\1\24\5\uffff\1\1\1\25\3\1\33\uffff\62\1\1\uffff\5\1\1\uffff"+
            "\11\1\1\uffff\3\1\1\uffff\1\1\1\uffff\2\1\1\uffff\15\1\1\uffff"+
            "\32\1\1\uffff\3\1\1\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "138:20: ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )?";
        }
    }
    static final String DFA30_eotS =
        "\47\uffff";
    static final String DFA30_eofS =
        "\47\uffff";
    static final String DFA30_minS =
        "\2\21\45\uffff";
    static final String DFA30_maxS =
        "\2\u00b4\45\uffff";
    static final String DFA30_acceptS =
        "\2\uffff\1\2\22\uffff\1\1\21\uffff";
    static final String DFA30_specialS =
        "\47\uffff}>";
    static final String[] DFA30_transitionS = {
            "\3\2\6\uffff\1\2\1\uffff\3\2\33\uffff\44\2\1\1\15\2\1\uffff"+
            "\5\2\1\uffff\11\2\1\uffff\3\2\1\uffff\1\2\1\uffff\2\2\1\uffff"+
            "\15\2\1\uffff\32\2\1\uffff\3\2\1\uffff\2\2",
            "\3\25\4\uffff\1\2\1\uffff\1\25\1\uffff\3\25\33\uffff\62\25"+
            "\1\uffff\5\25\1\uffff\11\25\1\uffff\3\25\1\uffff\1\25\1\uffff"+
            "\2\25\1\uffff\15\25\1\uffff\32\25\1\uffff\3\25\1\uffff\2\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "138:21: ( DISTINCT )?";
        }
    }
    static final String DFA33_eotS =
        "\47\uffff";
    static final String DFA33_eofS =
        "\47\uffff";
    static final String DFA33_minS =
        "\1\21\20\uffff\1\21\25\uffff";
    static final String DFA33_maxS =
        "\1\u00b4\20\uffff\1\u00b4\25\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\23\uffff\1\2\21\uffff";
    static final String DFA33_specialS =
        "\47\uffff}>";
    static final String[] DFA33_transitionS = {
            "\3\1\6\uffff\1\1\1\uffff\3\1\33\uffff\62\1\1\uffff\5\1\1\uffff"+
            "\11\1\1\uffff\3\1\1\uffff\1\1\1\uffff\2\1\1\uffff\15\1\1\uffff"+
            "\30\1\1\21\1\1\1\uffff\3\1\1\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\25\4\uffff\1\1\1\uffff\1\25\1\uffff\3\25\33\uffff\62\25"+
            "\1\uffff\5\25\1\uffff\11\25\1\uffff\3\25\1\uffff\1\25\1\uffff"+
            "\2\25\1\uffff\15\25\1\uffff\32\25\1\uffff\3\25\1\uffff\2\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "143:10: (case_expr= expr )?";
        }
    }
    static final String DFA38_eotS =
        "\62\uffff";
    static final String DFA38_eofS =
        "\62\uffff";
    static final String DFA38_minS =
        "\1\34\1\4\60\uffff";
    static final String DFA38_maxS =
        "\1\36\1\u00b1\60\uffff";
    static final String DFA38_acceptS =
        "\2\uffff\1\3\1\4\1\2\1\1\54\uffff";
    static final String DFA38_specialS =
        "\62\uffff}>";
    static final String[] DFA38_transitionS = {
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
            return "160:1: bind_parameter : ( QUESTION -> BIND | QUESTION position= INTEGER -> ^( BIND $position) | COLON name= id -> ^( BIND_NAME $name) | AT name= id -> ^( BIND_NAME $name) );";
        }
    }
    static final String DFA40_eotS =
        "\16\uffff";
    static final String DFA40_eofS =
        "\16\uffff";
    static final String DFA40_minS =
        "\1\27\15\uffff";
    static final String DFA40_maxS =
        "\1\u00af\15\uffff";
    static final String DFA40_acceptS =
        "\1\uffff\1\2\13\uffff\1\1";
    static final String DFA40_specialS =
        "\16\uffff}>";
    static final String[] DFA40_transitionS = {
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
            return "()+ loopback of 171:17: (names+= ID )+";
        }
    }
    static final String DFA42_eotS =
        "\15\uffff";
    static final String DFA42_eofS =
        "\15\uffff";
    static final String DFA42_minS =
        "\1\27\14\uffff";
    static final String DFA42_maxS =
        "\1\u00a5\14\uffff";
    static final String DFA42_acceptS =
        "\1\uffff\1\1\1\2\12\uffff";
    static final String DFA42_specialS =
        "\15\uffff}>";
    static final String[] DFA42_transitionS = {
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
            return "171:23: ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )?";
        }
    }
    static final String DFA43_eotS =
        "\13\uffff";
    static final String DFA43_eofS =
        "\13\uffff";
    static final String DFA43_minS =
        "\1\72\2\4\10\uffff";
    static final String DFA43_maxS =
        "\1\u00af\2\32\10\uffff";
    static final String DFA43_acceptS =
        "\3\uffff\1\1\1\2\6\uffff";
    static final String DFA43_specialS =
        "\13\uffff}>";
    static final String[] DFA43_transitionS = {
            "\62\2\1\uffff\5\2\1\uffff\11\2\1\uffff\3\2\1\uffff\1\2\1\uffff"+
            "\1\2\2\uffff\15\2\1\uffff\32\2\1\uffff\1\1",
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
            return "175:21: (database_name= id DOT )?";
        }
    }
    static final String DFA46_eotS =
        "\17\uffff";
    static final String DFA46_eofS =
        "\17\uffff";
    static final String DFA46_minS =
        "\2\72\3\uffff\1\72\3\uffff\1\27\5\uffff";
    static final String DFA46_maxS =
        "\2\u00b0\3\uffff\1\u00af\3\uffff\1\u00af\5\uffff";
    static final String DFA46_acceptS =
        "\2\uffff\1\2\3\uffff\1\1\10\uffff";
    static final String DFA46_specialS =
        "\17\uffff}>";
    static final String[] DFA46_transitionS = {
            "\35\2\1\1\24\2\1\uffff\5\2\1\uffff\11\2\1\uffff\3\2\1\uffff"+
            "\1\2\1\uffff\1\2\2\uffff\15\2\1\uffff\32\2\1\uffff\2\2",
            "\7\6\1\5\52\6\1\uffff\5\6\1\uffff\11\6\1\uffff\3\6\1\uffff"+
            "\1\6\1\uffff\1\6\2\uffff\15\6\1\uffff\32\6\1\uffff\2\6",
            "",
            "",
            "",
            "\7\2\1\11\52\2\1\uffff\5\2\1\uffff\11\2\1\uffff\3\2\1\uffff"+
            "\1\2\1\uffff\1\2\2\uffff\15\2\1\uffff\32\2\1\uffff\1\2",
            "",
            "",
            "",
            "\1\2\42\uffff\62\6\1\uffff\5\6\1\uffff\11\6\1\uffff\3\6\1\uffff"+
            "\1\6\1\uffff\1\6\2\uffff\15\6\1\uffff\32\6\1\uffff\1\6",
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
            return "180:21: ( DATABASE )?";
        }
    }
    static final String DFA51_eotS =
        "\14\uffff";
    static final String DFA51_eofS =
        "\14\uffff";
    static final String DFA51_minS =
        "\1\27\13\uffff";
    static final String DFA51_maxS =
        "\1\u00a4\13\uffff";
    static final String DFA51_acceptS =
        "\1\uffff\1\1\1\2\1\3\10\uffff";
    static final String DFA51_specialS =
        "\14\uffff}>";
    static final String[] DFA51_transitionS = {
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
            return "200:82: ( ASC | DESC )?";
        }
    }
    static final String DFA63_eotS =
        "\76\uffff";
    static final String DFA63_eofS =
        "\76\uffff";
    static final String DFA63_minS =
        "\3\21\73\uffff";
    static final String DFA63_maxS =
        "\3\u00b4\73\uffff";
    static final String DFA63_acceptS =
        "\3\uffff\1\3\23\uffff\1\1\23\uffff\1\2\22\uffff";
    static final String DFA63_specialS =
        "\76\uffff}>";
    static final String[] DFA63_transitionS = {
            "\4\3\5\uffff\1\3\1\uffff\3\3\33\uffff\3\3\1\1\40\3\1\2\15\3"+
            "\1\uffff\5\3\1\uffff\11\3\1\uffff\3\3\1\uffff\1\3\1\uffff\2"+
            "\3\1\uffff\15\3\1\uffff\32\3\1\uffff\3\3\1\uffff\2\3",
            "\4\27\3\uffff\1\3\1\uffff\1\27\1\uffff\3\27\33\uffff\62\27"+
            "\1\uffff\5\27\1\uffff\11\27\1\uffff\3\27\1\uffff\1\27\1\uffff"+
            "\2\27\1\uffff\15\27\1\uffff\32\27\1\uffff\3\27\1\uffff\2\27",
            "\4\53\3\uffff\1\3\1\uffff\1\53\1\uffff\3\53\33\uffff\62\53"+
            "\1\uffff\5\53\1\uffff\11\53\1\uffff\3\53\1\uffff\1\53\1\uffff"+
            "\2\53\1\uffff\15\53\1\uffff\32\53\1\uffff\3\53\1\uffff\2\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "221:10: ( ALL | DISTINCT )?";
        }
    }
    static final String DFA64_eotS =
        "\14\uffff";
    static final String DFA64_eofS =
        "\14\uffff";
    static final String DFA64_minS =
        "\1\27\13\uffff";
    static final String DFA64_maxS =
        "\1\u00ad\13\uffff";
    static final String DFA64_acceptS =
        "\1\uffff\1\2\11\uffff\1\1";
    static final String DFA64_specialS =
        "\14\uffff}>";
    static final String[] DFA64_transitionS = {
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
            return "()* loopback of 221:42: ( COMMA result_column )*";
        }
    }
    static final String DFA65_eotS =
        "\13\uffff";
    static final String DFA65_eofS =
        "\13\uffff";
    static final String DFA65_minS =
        "\1\27\12\uffff";
    static final String DFA65_maxS =
        "\1\u00ad\12\uffff";
    static final String DFA65_acceptS =
        "\1\uffff\1\1\1\2\10\uffff";
    static final String DFA65_specialS =
        "\13\uffff}>";
    static final String[] DFA65_transitionS = {
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
            return "221:65: ( FROM join_source )?";
        }
    }
    static final String DFA66_eotS =
        "\12\uffff";
    static final String DFA66_eofS =
        "\12\uffff";
    static final String DFA66_minS =
        "\1\27\11\uffff";
    static final String DFA66_maxS =
        "\1\u00ad\11\uffff";
    static final String DFA66_acceptS =
        "\1\uffff\1\1\1\2\7\uffff";
    static final String DFA66_specialS =
        "\12\uffff}>";
    static final String[] DFA66_transitionS = {
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
            return "221:85: ( WHERE where_expr= expr )?";
        }
    }
    static final String DFA67_eotS =
        "\12\uffff";
    static final String DFA67_eofS =
        "\12\uffff";
    static final String DFA67_minS =
        "\1\27\11\uffff";
    static final String DFA67_maxS =
        "\1\u00a4\11\uffff";
    static final String DFA67_acceptS =
        "\1\uffff\1\2\7\uffff\1\1";
    static final String DFA67_specialS =
        "\12\uffff}>";
    static final String[] DFA67_transitionS = {
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
            return "()* loopback of 222:28: ( COMMA ordering_term )*";
        }
    }
    static final String DFA72_eotS =
        "\u00e4\uffff";
    static final String DFA72_eofS =
        "\u00e4\uffff";
    static final String DFA72_minS =
        "\1\21\1\uffff\2\4\4\uffff\3\4\1\30\4\uffff\1\21\2\30\2\uffff\1\24"+
        "\36\uffff\1\24\36\uffff\1\24\36\uffff\1\24\74\uffff\1\24\1\uffff"+
        "\2\24\24\uffff\2\24\33\uffff";
    static final String DFA72_maxS =
        "\1\u00b4\1\uffff\2\u00af\4\uffff\3\u00af\1\32\4\uffff\1\u00b4\1"+
        "\32\1\30\2\uffff\1\u00af\36\uffff\1\u00af\36\uffff\1\u00af\36\uffff"+
        "\1\u00af\74\uffff\1\u00af\1\uffff\2\u00af\24\uffff\2\u00af\33\uffff";
    static final String DFA72_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\u00c4\uffff\1\2\32\uffff";
    static final String DFA72_specialS =
        "\u00e4\uffff}>";
    static final String[] DFA72_transitionS = {
            "\3\4\1\1\5\uffff\1\4\1\uffff\3\4\33\uffff\20\22\1\20\1\13\10"+
            "\22\1\10\1\11\1\12\25\22\1\uffff\5\22\1\uffff\11\22\1\uffff"+
            "\3\22\1\uffff\1\22\1\uffff\1\22\1\4\1\uffff\1\3\12\22\1\21\1"+
            "\22\1\uffff\32\22\1\uffff\1\2\2\4\1\uffff\2\4",
            "",
            "\17\4\1\uffff\4\4\1\25\3\4\36\uffff\164\4\1\uffff\1\4",
            "\17\4\1\uffff\4\4\1\64\1\4\1\uffff\1\4\36\uffff\164\4\1\uffff"+
            "\1\4",
            "",
            "",
            "",
            "",
            "\17\4\1\uffff\4\4\1\123\1\4\1\uffff\1\4\36\uffff\164\4\1\uffff"+
            "\1\4",
            "\17\4\1\uffff\4\4\1\162\1\4\1\uffff\1\4\36\uffff\164\4\1\uffff"+
            "\1\4",
            "\17\4\1\uffff\4\4\1\u00af\1\4\1\uffff\1\4\36\uffff\164\4\1"+
            "\uffff\1\4",
            "\1\u00b1\1\uffff\1\4",
            "",
            "",
            "",
            "",
            "\3\4\4\uffff\1\u00b2\1\uffff\1\4\1\uffff\3\4\33\uffff\62\4"+
            "\1\uffff\5\4\1\uffff\11\4\1\uffff\3\4\1\uffff\1\4\1\uffff\2"+
            "\4\1\uffff\15\4\1\uffff\32\4\1\uffff\3\4\1\uffff\2\4",
            "\1\u00c7\1\uffff\1\4",
            "\1\u00c8",
            "",
            "",
            "\1\u00c9\45\uffff\62\4\1\uffff\5\4\1\uffff\11\4\1\uffff\3\4"+
            "\1\uffff\1\4\1\uffff\1\4\2\uffff\15\4\1\uffff\32\4\1\uffff\1"+
            "\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c9\45\uffff\62\4\1\uffff\5\4\1\uffff\11\4\1\uffff\3\4"+
            "\1\uffff\1\4\1\uffff\1\4\2\uffff\15\4\1\uffff\32\4\1\uffff\1"+
            "\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c9\45\uffff\62\4\1\uffff\5\4\1\uffff\11\4\1\uffff\3\4"+
            "\1\uffff\1\4\1\uffff\1\4\2\uffff\15\4\1\uffff\32\4\1\uffff\1"+
            "\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c9\45\uffff\62\4\1\uffff\5\4\1\uffff\11\4\1\uffff\3\4"+
            "\1\uffff\1\4\1\uffff\1\4\2\uffff\15\4\1\uffff\32\4\1\uffff\1"+
            "\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c9\45\uffff\62\4\1\uffff\5\4\1\uffff\11\4\1\uffff\3\4"+
            "\1\uffff\1\4\1\uffff\1\4\2\uffff\15\4\1\uffff\32\4\1\uffff\1"+
            "\4",
            "",
            "\1\u00c9\45\uffff\62\4\1\uffff\5\4\1\uffff\11\4\1\uffff\3\4"+
            "\1\uffff\1\4\1\uffff\1\4\2\uffff\15\4\1\uffff\32\4\1\uffff\1"+
            "\4",
            "\1\u00c9\45\uffff\62\4\1\uffff\5\4\1\uffff\11\4\1\uffff\3\4"+
            "\1\uffff\1\4\1\uffff\1\4\2\uffff\15\4\1\uffff\32\4\1\uffff\1"+
            "\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c9\45\uffff\62\4\1\uffff\5\4\1\uffff\11\4\1\uffff\3\4"+
            "\1\uffff\1\4\1\uffff\1\4\2\uffff\15\4\1\uffff\32\4\1\uffff\1"+
            "\4",
            "\1\u00c9\45\uffff\62\4\1\uffff\5\4\1\uffff\11\4\1\uffff\3\4"+
            "\1\uffff\1\4\1\uffff\1\4\2\uffff\15\4\1\uffff\32\4\1\uffff\1"+
            "\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "228:1: result_column : ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) );";
        }
    }
    static final String DFA71_eotS =
        "\u00cb\uffff";
    static final String DFA71_eofS =
        "\u00cb\uffff";
    static final String DFA71_minS =
        "\1\27\2\uffff\1\27\1\uffff\1\21\6\27\4\uffff\1\30\1\21\6\30\25\uffff"+
        "\1\30\2\uffff\1\21\6\30\u0094\uffff";
    static final String DFA71_maxS =
        "\1\u00af\2\uffff\1\u00af\1\uffff\1\u00b4\5\u00ad\1\u00b1\4\uffff"+
        "\1\u00af\1\u00b4\1\110\3\u009c\1\110\1\u00b1\25\uffff\1\u00af\2"+
        "\uffff\1\u00b4\1\110\3\u009c\1\110\1\u00b1\u0094\uffff";
    static final String DFA71_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\u00c6\uffff";
    static final String DFA71_specialS =
        "\u00cb\uffff}>";
    static final String[] DFA71_transitionS = {
            "\1\4\1\uffff\1\4\1\uffff\1\4\36\uffff\52\1\1\11\6\1\1\3\1\uffff"+
            "\1\6\4\1\1\uffff\6\1\1\10\2\1\1\uffff\3\1\1\uffff\1\13\1\uffff"+
            "\1\1\2\uffff\5\1\1\12\7\1\1\uffff\20\1\1\7\10\1\1\5\1\uffff"+
            "\1\1",
            "",
            "",
            "\1\1\1\uffff\1\1\1\4\1\1\36\uffff\52\4\1\25\6\4\1\20\1\uffff"+
            "\1\22\4\4\1\uffff\6\4\1\24\2\4\1\uffff\3\4\1\uffff\1\27\1\uffff"+
            "\1\4\2\uffff\5\4\1\26\7\4\1\uffff\20\4\1\23\10\4\1\21\1\uffff"+
            "\1\4",
            "",
            "\3\4\3\uffff\1\1\1\uffff\1\1\1\4\1\1\3\4\33\uffff\52\4\1\64"+
            "\6\4\1\55\1\uffff\1\61\4\4\1\uffff\6\4\1\63\2\4\1\uffff\3\4"+
            "\1\uffff\1\66\1\uffff\2\4\1\uffff\5\4\1\65\7\4\1\uffff\20\4"+
            "\1\62\10\4\1\60\1\uffff\3\4\1\uffff\2\4",
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
            "\1\4\1\uffff\1\1\37\uffff\62\1\1\uffff\5\1\1\uffff\11\1\1\uffff"+
            "\3\1\1\uffff\1\1\1\uffff\1\1\2\uffff\15\1\1\uffff\32\1\1\uffff"+
            "\1\1",
            "\3\1\4\uffff\1\4\1\uffff\1\1\1\uffff\3\1\33\uffff\62\1\1\uffff"+
            "\5\1\1\uffff\11\1\1\uffff\3\1\1\uffff\1\1\1\uffff\2\1\1\uffff"+
            "\15\1\1\uffff\32\1\1\uffff\3\1\1\uffff\2\1",
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
            "\1\4\1\uffff\1\1\37\uffff\62\1\1\uffff\5\1\1\uffff\11\1\1\uffff"+
            "\3\1\1\uffff\1\1\1\uffff\1\1\2\uffff\15\1\1\uffff\32\1\1\uffff"+
            "\1\1",
            "",
            "",
            "\3\1\4\uffff\1\4\1\uffff\1\1\1\uffff\3\1\33\uffff\62\1\1\uffff"+
            "\5\1\1\uffff\11\1\1\uffff\3\1\1\uffff\1\1\1\uffff\2\1\1\uffff"+
            "\15\1\1\uffff\32\1\1\uffff\3\1\1\uffff\2\1",
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
            return "231:10: ( ( AS )? column_alias= id )?";
        }
    }
    static final String DFA70_eotS =
        "\u00cd\uffff";
    static final String DFA70_eofS =
        "\u00cd\uffff";
    static final String DFA70_minS =
        "\1\72\1\27\3\uffff\1\27\1\uffff\1\21\6\27\4\uffff\1\30\1\21\6\30"+
        "\25\uffff\1\30\2\uffff\1\21\6\30\u0094\uffff";
    static final String DFA70_maxS =
        "\2\u00af\3\uffff\1\u00af\1\uffff\1\u00b4\5\u00ad\1\u00b1\4\uffff"+
        "\1\u00af\1\u00b4\1\110\3\u009c\1\110\1\u00b1\25\uffff\1\u00af\2"+
        "\uffff\1\u00b4\1\110\3\u009c\1\110\1\u00b1\u0094\uffff";
    static final String DFA70_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\u00c8\uffff";
    static final String DFA70_specialS =
        "\u00cd\uffff}>";
    static final String[] DFA70_transitionS = {
            "\7\2\1\1\52\2\1\uffff\5\2\1\uffff\11\2\1\uffff\3\2\1\uffff\1"+
            "\2\1\uffff\1\2\2\uffff\15\2\1\uffff\32\2\1\uffff\1\2",
            "\1\2\1\uffff\1\2\1\uffff\1\2\36\uffff\52\4\1\13\6\4\1\5\1\uffff"+
            "\1\10\4\4\1\uffff\6\4\1\12\2\4\1\uffff\3\4\1\uffff\1\15\1\uffff"+
            "\1\4\2\uffff\5\4\1\14\7\4\1\uffff\20\4\1\11\10\4\1\7\1\uffff"+
            "\1\4",
            "",
            "",
            "",
            "\1\4\1\uffff\1\4\1\2\1\4\36\uffff\52\2\1\27\6\2\1\22\1\uffff"+
            "\1\24\4\2\1\uffff\6\2\1\26\2\2\1\uffff\3\2\1\uffff\1\31\1\uffff"+
            "\1\2\2\uffff\5\2\1\30\7\2\1\uffff\20\2\1\25\10\2\1\23\1\uffff"+
            "\1\2",
            "",
            "\3\2\3\uffff\1\4\1\uffff\1\4\1\2\1\4\3\2\33\uffff\52\2\1\66"+
            "\6\2\1\57\1\uffff\1\63\4\2\1\uffff\6\2\1\65\2\2\1\uffff\3\2"+
            "\1\uffff\1\70\1\uffff\2\2\1\uffff\5\2\1\67\7\2\1\uffff\20\2"+
            "\1\64\10\2\1\62\1\uffff\3\2\1\uffff\2\2",
            "\1\4\1\uffff\1\4\1\uffff\1\4\54\uffff\1\2\33\uffff\1\4\6\uffff"+
            "\1\4\1\uffff\1\4\13\uffff\1\4\7\uffff\1\4\11\uffff\1\4\30\uffff"+
            "\1\4\10\uffff\1\4",
            "\1\4\1\uffff\1\4\1\uffff\1\4\41\uffff\1\2\46\uffff\1\4\6\uffff"+
            "\1\4\1\uffff\1\4\13\uffff\1\4\7\uffff\1\4\11\uffff\1\4\20\uffff"+
            "\1\2\7\uffff\1\4\10\uffff\1\4",
            "\1\4\1\uffff\1\4\1\uffff\1\4\110\uffff\1\4\6\uffff\1\4\1\uffff"+
            "\1\4\13\uffff\1\4\7\uffff\1\4\11\uffff\1\4\20\uffff\1\2\7\uffff"+
            "\1\4\10\uffff\1\4",
            "\1\4\1\uffff\1\4\1\uffff\1\4\110\uffff\1\4\6\uffff\1\4\1\uffff"+
            "\1\4\13\uffff\1\4\7\uffff\1\4\11\uffff\1\4\20\uffff\1\2\7\uffff"+
            "\1\4\10\uffff\1\4",
            "\1\4\1\uffff\1\4\1\uffff\1\4\54\uffff\1\2\33\uffff\1\4\6\uffff"+
            "\1\4\1\uffff\1\4\13\uffff\1\4\7\uffff\1\4\11\uffff\1\4\30\uffff"+
            "\1\4\10\uffff\1\4",
            "\1\4\1\uffff\1\4\1\uffff\1\4\110\uffff\1\4\6\uffff\1\4\1\uffff"+
            "\1\4\13\uffff\1\4\7\uffff\1\4\11\uffff\1\4\30\uffff\1\4\10\uffff"+
            "\1\4\3\uffff\1\2",
            "",
            "",
            "",
            "",
            "\1\2\1\uffff\1\4\37\uffff\62\4\1\uffff\5\4\1\uffff\11\4\1\uffff"+
            "\3\4\1\uffff\1\4\1\uffff\1\4\2\uffff\15\4\1\uffff\32\4\1\uffff"+
            "\1\4",
            "\3\4\4\uffff\1\2\1\uffff\1\4\1\uffff\3\4\33\uffff\62\4\1\uffff"+
            "\5\4\1\uffff\11\4\1\uffff\3\4\1\uffff\1\4\1\uffff\2\4\1\uffff"+
            "\15\4\1\uffff\32\4\1\uffff\3\4\1\uffff\2\4",
            "\1\2\57\uffff\1\4",
            "\1\2\44\uffff\1\4\136\uffff\1\4",
            "\1\2\u0083\uffff\1\4",
            "\1\2\u0083\uffff\1\4",
            "\1\2\57\uffff\1\4",
            "\1\2\u0098\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\2\1\uffff\1\4\37\uffff\62\4\1\uffff\5\4\1\uffff\11\4\1\uffff"+
            "\3\4\1\uffff\1\4\1\uffff\1\4\2\uffff\15\4\1\uffff\32\4\1\uffff"+
            "\1\4",
            "",
            "",
            "\3\4\4\uffff\1\2\1\uffff\1\4\1\uffff\3\4\33\uffff\62\4\1\uffff"+
            "\5\4\1\uffff\11\4\1\uffff\3\4\1\uffff\1\4\1\uffff\2\4\1\uffff"+
            "\15\4\1\uffff\32\4\1\uffff\3\4\1\uffff\2\4",
            "\1\2\57\uffff\1\4",
            "\1\2\44\uffff\1\4\136\uffff\1\4",
            "\1\2\u0083\uffff\1\4",
            "\1\2\u0083\uffff\1\4",
            "\1\2\57\uffff\1\4",
            "\1\2\u0098\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "231:11: ( AS )?";
        }
    }
    static final String DFA74_eotS =
        "\21\uffff";
    static final String DFA74_eofS =
        "\21\uffff";
    static final String DFA74_minS =
        "\1\27\20\uffff";
    static final String DFA74_maxS =
        "\1\u00ad\20\uffff";
    static final String DFA74_acceptS =
        "\1\uffff\1\2\10\uffff\1\1\6\uffff";
    static final String DFA74_specialS =
        "\21\uffff}>";
    static final String[] DFA74_transitionS = {
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
            return "()* loopback of 233:28: ( join_op single_source ( join_constraint )? )*";
        }
    }
    static final String DFA73_eotS =
        "\23\uffff";
    static final String DFA73_eofS =
        "\23\uffff";
    static final String DFA73_minS =
        "\1\27\22\uffff";
    static final String DFA73_maxS =
        "\1\u00ad\22\uffff";
    static final String DFA73_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\17\uffff";
    static final String DFA73_specialS =
        "\23\uffff}>";
    static final String[] DFA73_transitionS = {
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
            return "233:52: ( join_constraint )?";
        }
    }
    static final String DFA81_eotS =
        "\36\uffff";
    static final String DFA81_eofS =
        "\36\uffff";
    static final String DFA81_minS =
        "\1\32\2\uffff\1\32\1\uffff\1\21\30\uffff";
    static final String DFA81_maxS =
        "\1\u00af\2\uffff\1\u00af\1\uffff\1\u00b4\30\uffff";
    static final String DFA81_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\3\uffff\1\2\25\uffff";
    static final String DFA81_specialS =
        "\36\uffff}>";
    static final String[] DFA81_transitionS = {
            "\1\3\37\uffff\62\1\1\uffff\5\1\1\uffff\11\1\1\uffff\3\1\1\uffff"+
            "\1\1\1\uffff\1\1\2\uffff\15\1\1\uffff\32\1\1\uffff\1\1",
            "",
            "",
            "\1\4\37\uffff\62\4\1\uffff\5\4\1\uffff\11\4\1\uffff\3\4\1\uffff"+
            "\1\4\1\uffff\1\4\2\uffff\15\4\1\uffff\10\4\1\5\21\4\1\uffff"+
            "\1\4",
            "",
            "\4\10\3\uffff\1\4\1\uffff\1\10\1\uffff\3\10\33\uffff\62\10"+
            "\1\uffff\5\10\1\uffff\11\10\1\uffff\3\10\1\uffff\1\10\1\uffff"+
            "\2\10\1\uffff\15\10\1\uffff\32\10\1\uffff\3\10\1\uffff\2\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "235:1: single_source : ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN );";
        }
    }
    static final String DFA75_eotS =
        "\32\uffff";
    static final String DFA75_eofS =
        "\32\uffff";
    static final String DFA75_minS =
        "\1\72\1\27\30\uffff";
    static final String DFA75_maxS =
        "\2\u00af\30\uffff";
    static final String DFA75_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\25\uffff";
    static final String DFA75_specialS =
        "\32\uffff}>";
    static final String[] DFA75_transitionS = {
            "\62\2\1\uffff\5\2\1\uffff\11\2\1\uffff\3\2\1\uffff\1\2\1\uffff"+
            "\1\2\2\uffff\15\2\1\uffff\32\2\1\uffff\1\1",
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
            return "236:5: (database_name= id DOT )?";
        }
    }
    static final String DFA77_eotS =
        "\27\uffff";
    static final String DFA77_eofS =
        "\27\uffff";
    static final String DFA77_minS =
        "\1\27\26\uffff";
    static final String DFA77_maxS =
        "\1\u00af\26\uffff";
    static final String DFA77_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\23\uffff";
    static final String DFA77_specialS =
        "\27\uffff}>";
    static final String[] DFA77_transitionS = {
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
            return "236:43: ( ( AS )? table_alias= ID )?";
        }
    }
    static final String DFA78_eotS =
        "\25\uffff";
    static final String DFA78_eofS =
        "\25\uffff";
    static final String DFA78_minS =
        "\1\27\24\uffff";
    static final String DFA78_maxS =
        "\1\u00ad\24\uffff";
    static final String DFA78_acceptS =
        "\1\uffff\1\1\1\2\1\3\21\uffff";
    static final String DFA78_specialS =
        "\25\uffff}>";
    static final String[] DFA78_transitionS = {
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
            return "236:67: ( INDEXED BY index_name= id | NOT INDEXED )?";
        }
    }
    static final String DFA80_eotS =
        "\25\uffff";
    static final String DFA80_eofS =
        "\25\uffff";
    static final String DFA80_minS =
        "\1\27\24\uffff";
    static final String DFA80_maxS =
        "\1\u00af\24\uffff";
    static final String DFA80_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\21\uffff";
    static final String DFA80_specialS =
        "\25\uffff}>";
    static final String[] DFA80_transitionS = {
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
            return "238:31: ( ( AS )? table_alias= ID )?";
        }
    }
    static final String DFA91_eotS =
        "\15\uffff";
    static final String DFA91_eofS =
        "\15\uffff";
    static final String DFA91_minS =
        "\1\72\2\30\12\uffff";
    static final String DFA91_maxS =
        "\1\u00af\2\u00a9\12\uffff";
    static final String DFA91_acceptS =
        "\3\uffff\1\2\3\uffff\1\1\5\uffff";
    static final String DFA91_specialS =
        "\15\uffff}>";
    static final String[] DFA91_transitionS = {
            "\62\2\1\uffff\5\2\1\uffff\11\2\1\uffff\3\2\1\uffff\1\2\1\uffff"+
            "\1\2\2\uffff\15\2\1\uffff\32\2\1\uffff\1\1",
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
            return "251:67: (database_name= id DOT )?";
        }
    }
    static final String DFA116_eotS =
        "\72\uffff";
    static final String DFA116_eofS =
        "\72\uffff";
    static final String DFA116_minS =
        "\1\31\1\72\2\uffff\1\31\1\uffff\3\31\61\uffff";
    static final String DFA116_maxS =
        "\1\33\1\u00af\2\uffff\1\u00af\1\uffff\3\u00af\61\uffff";
    static final String DFA116_acceptS =
        "\2\uffff\1\2\1\1\66\uffff";
    static final String DFA116_specialS =
        "\72\uffff}>";
    static final String[] DFA116_transitionS = {
            "\1\1\1\uffff\1\2",
            "\22\3\1\7\1\3\1\uffff\2\3\1\2\30\3\1\10\44\3\1\4\25\3\1\6\10"+
            "\3\1\uffff\1\3",
            "",
            "",
            "\1\3\1\uffff\1\3\60\uffff\2\3\3\uffff\1\3\6\uffff\1\3\45\uffff"+
            "\1\2\5\uffff\1\3\12\uffff\1\3\2\uffff\1\3\22\uffff\1\3\11\uffff"+
            "\1\3",
            "",
            "\1\3\1\2\1\3\60\uffff\2\3\3\uffff\1\3\6\uffff\1\3\53\uffff"+
            "\1\3\12\uffff\1\3\2\uffff\1\3\22\uffff\1\3\11\uffff\1\3",
            "\1\3\1\2\1\3\60\uffff\2\3\3\uffff\1\3\6\uffff\1\3\53\uffff"+
            "\1\3\12\uffff\1\3\2\uffff\1\3\22\uffff\1\3\11\uffff\1\3",
            "\1\3\1\uffff\1\3\60\uffff\2\3\3\uffff\1\3\6\uffff\1\3\45\uffff"+
            "\1\2\5\uffff\1\3\12\uffff\1\3\2\uffff\1\3\22\uffff\1\3\11\uffff"+
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 294:23: ( COMMA column_def )*";
        }
    }
    static final String DFA119_eotS =
        "\15\uffff";
    static final String DFA119_eofS =
        "\15\uffff";
    static final String DFA119_minS =
        "\1\27\14\uffff";
    static final String DFA119_maxS =
        "\1\u00af\14\uffff";
    static final String DFA119_acceptS =
        "\1\uffff\1\1\1\2\12\uffff";
    static final String DFA119_specialS =
        "\15\uffff}>";
    static final String[] DFA119_transitionS = {
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
            return "299:32: ( type_name )?";
        }
    }
    static final String DFA120_eotS =
        "\14\uffff";
    static final String DFA120_eofS =
        "\14\uffff";
    static final String DFA120_minS =
        "\1\27\13\uffff";
    static final String DFA120_maxS =
        "\1\u00a5\13\uffff";
    static final String DFA120_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\7\uffff";
    static final String DFA120_specialS =
        "\14\uffff}>";
    static final String[] DFA120_transitionS = {
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
            return "()* loopback of 299:43: ( column_constraint )*";
        }
    }
    static final String DFA123_eotS =
        "\17\uffff";
    static final String DFA123_eofS =
        "\17\uffff";
    static final String DFA123_minS =
        "\1\27\16\uffff";
    static final String DFA123_maxS =
        "\1\u00a5\16\uffff";
    static final String DFA123_acceptS =
        "\1\uffff\1\1\1\2\14\uffff";
    static final String DFA123_specialS =
        "\17\uffff}>";
    static final String[] DFA123_transitionS = {
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
            return "320:37: ( ASC | DESC )?";
        }
    }
    static final String DFA124_eotS =
        "\16\uffff";
    static final String DFA124_eofS =
        "\16\uffff";
    static final String DFA124_minS =
        "\1\27\15\uffff";
    static final String DFA124_maxS =
        "\1\u00a5\15\uffff";
    static final String DFA124_acceptS =
        "\1\uffff\1\1\1\2\13\uffff";
    static final String DFA124_specialS =
        "\16\uffff}>";
    static final String[] DFA124_transitionS = {
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
            return "320:51: ( table_conflict_clause )?";
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
            return "320:74: ( AUTOINCREMENT )?";
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
            return "322:38: ( table_conflict_clause )?";
        }
    }
    static final String DFA127_eotS =
        "\15\uffff";
    static final String DFA127_eofS =
        "\15\uffff";
    static final String DFA127_minS =
        "\1\27\14\uffff";
    static final String DFA127_maxS =
        "\1\u00a5\14\uffff";
    static final String DFA127_acceptS =
        "\1\uffff\1\1\1\2\12\uffff";
    static final String DFA127_specialS =
        "\15\uffff}>";
    static final String[] DFA127_transitionS = {
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
            return "324:35: ( table_conflict_clause )?";
        }
    }
    static final String DFA128_eotS =
        "\13\uffff";
    static final String DFA128_eofS =
        "\13\uffff";
    static final String DFA128_minS =
        "\1\21\12\uffff";
    static final String DFA128_maxS =
        "\1\u00b4\12\uffff";
    static final String DFA128_acceptS =
        "\1\uffff\1\1\1\2\7\uffff\1\3";
    static final String DFA128_specialS =
        "\13\uffff}>";
    static final String[] DFA128_transitionS = {
            "\2\1\7\uffff\1\12\71\uffff\3\2\57\uffff\1\2\51\uffff\2\2\1\uffff"+
            "\2\2",
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
            return "329:37: ( ( PLUS | MINUS ) ( INTEGER | FLOAT ) | literal_value | LPAREN expr RPAREN )";
        }
    }
    static final String DFA138_eotS =
        "\17\uffff";
    static final String DFA138_eofS =
        "\17\uffff";
    static final String DFA138_minS =
        "\1\27\16\uffff";
    static final String DFA138_maxS =
        "\1\u00a5\16\uffff";
    static final String DFA138_acceptS =
        "\1\uffff\1\2\13\uffff\1\1\1\uffff";
    static final String DFA138_specialS =
        "\17\uffff}>";
    static final String[] DFA138_transitionS = {
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
            return "()+ loopback of 359:3: ( fk_clause_action )+";
        }
    }
    static final String DFA139_eotS =
        "\17\uffff";
    static final String DFA139_eofS =
        "\17\uffff";
    static final String DFA139_minS =
        "\1\27\1\131\15\uffff";
    static final String DFA139_maxS =
        "\1\u00a5\1\u0086\15\uffff";
    static final String DFA139_acceptS =
        "\2\uffff\1\1\1\2\13\uffff";
    static final String DFA139_specialS =
        "\17\uffff}>";
    static final String[] DFA139_transitionS = {
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
            return "359:21: ( fk_clause_deferrable )?";
        }
    }
    static final String DFA143_eotS =
        "\17\uffff";
    static final String DFA143_eofS =
        "\17\uffff";
    static final String DFA143_minS =
        "\1\27\1\132\15\uffff";
    static final String DFA143_maxS =
        "\1\u00a5\1\161\15\uffff";
    static final String DFA143_acceptS =
        "\2\uffff\1\3\12\uffff\1\1\1\2";
    static final String DFA143_specialS =
        "\17\uffff}>";
    static final String[] DFA143_transitionS = {
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
            return "366:42: ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?";
        }
    }
    static final String DFA163_eotS =
        "\14\uffff";
    static final String DFA163_eofS =
        "\14\uffff";
    static final String DFA163_minS =
        "\1\72\1\30\12\uffff";
    static final String DFA163_maxS =
        "\1\u00af\1\u00a6\12\uffff";
    static final String DFA163_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\7\uffff";
    static final String DFA163_specialS =
        "\14\uffff}>";
    static final String[] DFA163_transitionS = {
            "\62\2\1\uffff\2\2\1\1\2\2\1\uffff\11\2\1\uffff\3\2\1\uffff\1"+
            "\2\1\uffff\1\2\2\uffff\15\2\1\uffff\32\2\1\uffff\1\2",
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
            return "394:48: ( IF NOT EXISTS )?";
        }
    }
    static final String DFA164_eotS =
        "\21\uffff";
    static final String DFA164_eofS =
        "\21\uffff";
    static final String DFA164_minS =
        "\1\72\2\30\16\uffff";
    static final String DFA164_maxS =
        "\1\u00af\2\u00a6\16\uffff";
    static final String DFA164_acceptS =
        "\3\uffff\1\2\5\uffff\1\1\7\uffff";
    static final String DFA164_specialS =
        "\21\uffff}>";
    static final String[] DFA164_transitionS = {
            "\62\2\1\uffff\5\2\1\uffff\11\2\1\uffff\3\2\1\uffff\1\2\1\uffff"+
            "\1\2\2\uffff\15\2\1\uffff\32\2\1\uffff\1\1",
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
            return "394:65: (database_name= id DOT )?";
        }
    }
 

    public static final BitSet FOLLOW_sql_stmt_in_sql_stmt_list181 = new BitSet(new long[]{0xC000000000000002L,0x00800084A8048048L,0x000001401AB04000L});
    public static final BitSet FOLLOW_EXPLAIN_in_sql_stmt191 = new BitSet(new long[]{0xC000000000800000L,0x00800084A8048048L,0x000001401AB14000L});
    public static final BitSet FOLLOW_QUERY_in_sql_stmt194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_PLAN_in_sql_stmt196 = new BitSet(new long[]{0xC000000000800000L,0x00800084A8048048L,0x000001401AB04000L});
    public static final BitSet FOLLOW_sql_stmt_core_in_sql_stmt202 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMI_in_sql_stmt204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_stmt_in_sql_stmt_core215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attach_stmt_in_sql_stmt_core221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_detach_stmt_in_sql_stmt_core227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_analyze_stmt_in_sql_stmt_core233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reindex_stmt_in_sql_stmt_core239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vacuum_stmt_in_sql_stmt_core245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_sql_stmt_core254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_stmt_in_sql_stmt_core260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_stmt_in_sql_stmt_core266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_stmt_in_sql_stmt_core272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_stmt_in_sql_stmt_core278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commit_stmt_in_sql_stmt_core284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rollback_stmt_in_sql_stmt_core290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_savepoint_stmt_in_sql_stmt_core296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_release_stmt_in_sql_stmt_core302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_virtual_table_stmt_in_sql_stmt_core311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_table_stmt_in_sql_stmt_core317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_table_stmt_in_sql_stmt_core323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alter_table_stmt_in_sql_stmt_core329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_view_stmt_in_sql_stmt_core335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_view_stmt_in_sql_stmt_core341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_index_stmt_in_sql_stmt_core347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_index_stmt_in_sql_stmt_core353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_trigger_stmt_in_sql_stmt_core359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_trigger_stmt_in_sql_stmt_core365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_qualified_table_name378 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_qualified_table_name380 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_qualified_table_name386 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INDEXED_in_qualified_table_name389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_qualified_table_name391 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_qualified_table_name395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_qualified_table_name399 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_INDEXED_in_qualified_table_name401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_signed_number410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000A000000000000L});
    public static final BitSet FOLLOW_set_in_signed_number419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_subexpr_in_expr432 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OR_in_expr435 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_or_subexpr_in_expr438 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_and_subexpr_in_or_subexpr447 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_AND_in_or_subexpr450 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_and_subexpr_in_or_subexpr453 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr462 = new BitSet(new long[]{0x00000000000000F2L,0x1804100000000080L,0x0000000000080035L});
    public static final BitSet FOLLOW_cond_expr_in_and_subexpr464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr476 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000000000080015L});
    public static final BitSet FOLLOW_match_op_in_cond_expr479 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr483 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_ESCAPE_in_cond_expr486 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr518 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_IN_in_cond_expr521 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_cond_expr523 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_cond_expr525 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_cond_expr528 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_cond_expr530 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_cond_expr534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr556 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_IN_in_cond_expr559 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_cond_expr564 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_cond_expr566 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_cond_expr572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISNULL_in_cond_expr603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTNULL_in_cond_expr611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_cond_expr619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_cond_expr621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr629 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_cond_expr631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_cond_expr639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_cond_expr641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_cond_expr643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_BETWEEN_in_cond_expr657 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_AND_in_cond_expr663 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_cond_expr693 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr710 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_set_in_match_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_neq_subexpr_in_eq_subexpr743 = new BitSet(new long[]{0x0000000000000F02L});
    public static final BitSet FOLLOW_set_in_eq_subexpr746 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_neq_subexpr_in_eq_subexpr763 = new BitSet(new long[]{0x0000000000000F02L});
    public static final BitSet FOLLOW_bit_subexpr_in_neq_subexpr772 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_set_in_neq_subexpr775 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_bit_subexpr_in_neq_subexpr792 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_add_subexpr_in_bit_subexpr801 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_set_in_bit_subexpr804 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_add_subexpr_in_bit_subexpr813 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_mul_subexpr_in_add_subexpr822 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_set_in_add_subexpr825 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_mul_subexpr_in_add_subexpr838 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_con_subexpr_in_mul_subexpr847 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_DOUBLE_PIPE_in_mul_subexpr850 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_con_subexpr_in_mul_subexpr853 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_unary_subexpr_in_con_subexpr862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_op_in_con_subexpr866 = new BitSet(new long[]{0xFC00000074000000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFCAL});
    public static final BitSet FOLLOW_unary_subexpr_in_con_subexpr868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unary_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_expr_in_unary_subexpr902 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_COLLATE_in_unary_subexpr905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_unary_subexpr910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_value_in_atom_expr922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bind_parameter_in_atom_expr928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_atom_expr938 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_atom_expr940 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_atom_expr946 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_atom_expr948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_atom_expr954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom_expr983 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr985 = new BitSet(new long[]{0xFC0000007C1E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_DISTINCT_in_atom_expr988 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_atom_expr993 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_atom_expr996 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_atom_expr1000 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_ASTERISK_in_atom_expr1006 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr1035 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_atom_expr1038 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_atom_expr1047 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr1050 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_atom_expr1053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_atom_expr1055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_type_name_in_atom_expr1058 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_atom_expr1069 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_atom_expr1074 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_when_expr_in_atom_expr1078 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ELSE_in_atom_expr1082 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_atom_expr1086 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_END_in_atom_expr1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raise_function_in_atom_expr1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHEN_in_when_expr1123 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_when_expr1127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_THEN_in_when_expr1129 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_when_expr1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_literal_value1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal_value1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal_value1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOB_in_literal_value1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal_value1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_TIME_in_literal_value1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_DATE_in_literal_value1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_TIMESTAMP_in_literal_value1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bind_parameter1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bind_parameter1276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_bind_parameter1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_bind_parameter1295 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_bind_parameter1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_bind_parameter1314 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_bind_parameter1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAISE_in_raise_function1339 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_raise_function1342 = new BitSet(new long[]{0x0400000000000000L,0x0001010000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_IGNORE_in_raise_function1346 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_set_in_raise_function1350 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COMMA_in_raise_function1362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_STRING_in_raise_function1367 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_raise_function1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_name1380 = new BitSet(new long[]{0x0000000004000002L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_LPAREN_in_type_name1384 = new BitSet(new long[]{0x0000000000060000L,0x0000000000000000L,0x000A000000000000L});
    public static final BitSet FOLLOW_signed_number_in_type_name1388 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_type_name1391 = new BitSet(new long[]{0x0000000000060000L,0x0000000000000000L,0x000A000000000000L});
    public static final BitSet FOLLOW_signed_number_in_type_name1395 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_type_name1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_in_pragma_stmt1431 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_pragma_stmt1436 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_pragma_stmt1438 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_pragma_stmt1444 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_EQUALS_in_pragma_stmt1447 = new BitSet(new long[]{0xFC00000000060000L,0xEFFBEFFFFFFFFFFFL,0x000BBFFFFFF7FFCAL});
    public static final BitSet FOLLOW_pragma_value_in_pragma_stmt1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_pragma_stmt1453 = new BitSet(new long[]{0xFC00000000060000L,0xEFFBEFFFFFFFFFFFL,0x000BBFFFFFF7FFCAL});
    public static final BitSet FOLLOW_pragma_value_in_pragma_stmt1455 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_pragma_stmt1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signed_number_in_pragma_value1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_pragma_value1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_pragma_value1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTACH_in_attach_stmt1484 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0001BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_DATABASE_in_attach_stmt1487 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0001BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_STRING_in_attach_stmt1494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_attach_stmt1498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_attach_stmt1501 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_attach_stmt1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DETACH_in_detach_stmt1513 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_DATABASE_in_detach_stmt1516 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_detach_stmt1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANALYZE_in_analyze_stmt1530 = new BitSet(new long[]{0xFC00000000000002L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_analyze_stmt1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_analyze_stmt1541 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_analyze_stmt1543 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_analyze_stmt1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REINDEX_in_reindex_stmt1557 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_reindex_stmt1562 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_reindex_stmt1564 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_reindex_stmt1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VACUUM_in_vacuum_stmt1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_operation_conflict_clause1589 = new BitSet(new long[]{0x0400000000000000L,0x0001010000000000L,0x0000000002800000L});
    public static final BitSet FOLLOW_set_in_operation_conflict_clause1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_ordering_term1616 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000004L});
    public static final BitSet FOLLOW_ASC_in_ordering_term1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_ordering_term1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_operation_limited_clause1655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_operation_limited_clause1657 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ordering_term_in_operation_limited_clause1659 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_operation_limited_clause1662 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ordering_term_in_operation_limited_clause1664 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_operation_limited_clause1672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_operation_limited_clause1676 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_set_in_operation_limited_clause1679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_operation_limited_clause1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_list_in_select_stmt1699 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_ORDER_in_select_stmt1704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_select_stmt1706 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt1708 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt1711 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt1713 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_select_stmt1722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt1726 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_OFFSET_in_select_stmt1730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt1734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_core_in_select_list1784 = new BitSet(new long[]{0x0000000000000002L,0x0200001000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_select_op_in_select_list1787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_core_in_select_list1790 = new BitSet(new long[]{0x0000000000000002L,0x0200001000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_UNION_in_select_op1799 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ALL_in_select_op1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERSECT_in_select_op1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCEPT_in_select_op1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_core1822 = new BitSet(new long[]{0xFC000000741E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ALL_in_select_core1825 = new BitSet(new long[]{0xFC000000741E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_DISTINCT_in_select_core1829 = new BitSet(new long[]{0xFC000000741E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_result_column_in_select_core1833 = new BitSet(new long[]{0x0000000002000002L,0x0000280000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_core1836 = new BitSet(new long[]{0xFC000000741E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_result_column_in_select_core1838 = new BitSet(new long[]{0x0000000002000002L,0x0000280000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_FROM_in_select_core1843 = new BitSet(new long[]{0xFC00000004000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_join_source_in_select_core1845 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_WHERE_in_select_core1850 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_select_core1854 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_GROUP_in_select_core1862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_select_core1864 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ordering_term_in_select_core1866 = new BitSet(new long[]{0x0000000002000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_core1869 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ordering_term_in_select_core1871 = new BitSet(new long[]{0x0000000002000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_HAVING_in_select_core1876 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_select_core1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_result_column1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_result_column1958 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_result_column1960 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ASTERISK_in_result_column1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_result_column1977 = new BitSet(new long[]{0xFC00000000000002L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_AS_in_result_column1981 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_result_column1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_source_in_join_source2008 = new BitSet(new long[]{0x0000000002000002L,0xA040000000080000L,0x0000000000001008L});
    public static final BitSet FOLLOW_join_op_in_join_source2011 = new BitSet(new long[]{0xFC00000004000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_single_source_in_join_source2014 = new BitSet(new long[]{0x0000000002000002L,0xA040000000080000L,0x0000008000001208L});
    public static final BitSet FOLLOW_join_constraint_in_join_source2017 = new BitSet(new long[]{0x0000000002000002L,0xA040000000080000L,0x0000000000001008L});
    public static final BitSet FOLLOW_id_in_single_source2034 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_single_source2036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_single_source2042 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000002L,0x0000800000000010L});
    public static final BitSet FOLLOW_AS_in_single_source2046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_single_source2052 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INDEXED_in_single_source2057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_single_source2059 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_single_source2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_single_source2067 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_INDEXED_in_single_source2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_single_source2110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_single_source2112 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_single_source2114 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_AS_in_single_source2118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_single_source2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_single_source2146 = new BitSet(new long[]{0xFC00000004000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_join_source_in_single_source2149 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_single_source2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_join_op2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATURAL_in_join_op2169 = new BitSet(new long[]{0x0000000000000000L,0xA040000000080000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LEFT_in_join_op2175 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_OUTER_in_join_op2180 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_INNER_in_join_op2186 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_CROSS_in_join_op2190 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_JOIN_in_join_op2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_join_constraint2204 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_join_constraint2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_join_constraint2213 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_join_constraint2215 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_join_constraint2219 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_join_constraint2222 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_join_constraint2226 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_join_constraint2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_stmt2249 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_operation_conflict_clause_in_insert_stmt2252 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_REPLACE_in_insert_stmt2258 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_INTO_in_insert_stmt2261 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_insert_stmt2266 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_insert_stmt2268 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_insert_stmt2274 = new BitSet(new long[]{0x0000000004000000L,0x0000000001000000L,0x0000020010000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt2281 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_insert_stmt2285 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt2288 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_insert_stmt2292 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt2296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020010000000L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt2305 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt2307 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_insert_stmt2311 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt2314 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_insert_stmt2318 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_insert_stmt2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_insert_stmt2333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update_stmt2345 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_operation_conflict_clause_in_update_stmt2348 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_qualified_table_name_in_update_stmt2352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_SET_in_update_stmt2356 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_update_set_in_update_stmt2360 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000200000000802L});
    public static final BitSet FOLLOW_COMMA_in_update_stmt2363 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_update_set_in_update_stmt2367 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000200000000802L});
    public static final BitSet FOLLOW_WHERE_in_update_stmt2372 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_update_stmt2374 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_operation_limited_clause_in_update_stmt2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_update_set2390 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQUALS_in_update_set2392 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_update_set2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_stmt2402 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_FROM_in_delete_stmt2404 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_qualified_table_name_in_delete_stmt2406 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000802L});
    public static final BitSet FOLLOW_WHERE_in_delete_stmt2409 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_delete_stmt2411 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_operation_limited_clause_in_delete_stmt2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_begin_stmt2426 = new BitSet(new long[]{0x0000000000000002L,0x0002002004000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_set_in_begin_stmt2428 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_begin_stmt2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_commit_stmt2452 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_commit_stmt2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROLLBACK_in_rollback_stmt2471 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_rollback_stmt2474 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_TO_in_rollback_stmt2479 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_SAVEPOINT_in_rollback_stmt2482 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_rollback_stmt2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVEPOINT_in_savepoint_stmt2498 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_savepoint_stmt2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELEASE_in_release_stmt2510 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_SAVEPOINT_in_release_stmt2513 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_release_stmt2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_table_conflict_clause2531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_CONFLICT_in_table_conflict_clause2534 = new BitSet(new long[]{0x0400000000000000L,0x0001010000000000L,0x0000000002800000L});
    public static final BitSet FOLLOW_set_in_table_conflict_clause2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_virtual_table_stmt2564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_VIRTUAL_in_create_virtual_table_stmt2566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_create_virtual_table_stmt2568 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2573 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_virtual_table_stmt2575 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_USING_in_create_virtual_table_stmt2585 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2589 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_LPAREN_in_create_virtual_table_stmt2592 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_virtual_table_stmt2594 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_virtual_table_stmt2597 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_virtual_table_stmt2599 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_virtual_table_stmt2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_table_stmt2613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_table_stmt2615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_create_table_stmt2618 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_create_table_stmt2621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_table_stmt2623 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_table_stmt2625 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_table_stmt2632 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_table_stmt2634 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_table_stmt2640 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_create_table_stmt2646 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_table_stmt2648 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_table_stmt2651 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_table_stmt2653 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_table_stmt2658 = new BitSet(new long[]{0x0000000000000000L,0x0000040000021000L,0x0000002000008000L});
    public static final BitSet FOLLOW_table_constraint_in_create_table_stmt2660 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_table_stmt2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_create_table_stmt2670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_create_table_stmt2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_column_def_in_column_def2728 = new BitSet(new long[]{0x0000000000000002L,0x0000000001023000L,0x0000802000048010L});
    public static final BitSet FOLLOW_type_name_in_column_def2730 = new BitSet(new long[]{0x0000000000000002L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_column_constraint_in_column_def2733 = new BitSet(new long[]{0x0000000000000002L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_CONSTRAINT_in_column_constraint2759 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_column_constraint2763 = new BitSet(new long[]{0x0000000000000000L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_column_constraint_pk_in_column_constraint2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_not_null_in_column_constraint2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_unique_in_column_constraint2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_check_in_column_constraint2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_default_in_column_constraint2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_collate_in_column_constraint2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fk_clause_in_column_constraint2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_in_column_constraint_pk2862 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_KEY_in_column_constraint_pk2865 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000014L,0x0000000000000200L});
    public static final BitSet FOLLOW_set_in_column_constraint_pk2868 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_pk2877 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_AUTOINCREMENT_in_column_constraint_pk2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_column_constraint_not_null2890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_column_constraint_not_null2892 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_not_null2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_column_constraint_unique2911 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_unique2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECK_in_column_constraint_check2922 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_column_constraint_check2925 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_column_constraint_check2928 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_column_constraint_check2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_column_constraint_default2939 = new BitSet(new long[]{0x0000000004060000L,0x0000000000700000L,0x001B000000000040L});
    public static final BitSet FOLLOW_set_in_column_constraint_default2943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000A000000000000L});
    public static final BitSet FOLLOW_set_in_column_constraint_default2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_value_in_column_constraint_default2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_column_constraint_default2965 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_column_constraint_default2968 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_column_constraint_default2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLATE_in_column_constraint_collate2979 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_column_constraint_collate2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRAINT_in_table_constraint2993 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_table_constraint2997 = new BitSet(new long[]{0x0000000000000000L,0x0000040000021000L,0x0000002000008000L});
    public static final BitSet FOLLOW_table_constraint_pk_in_table_constraint3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_unique_in_table_constraint3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_check_in_table_constraint3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_fk_in_table_constraint3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_in_table_constraint_pk3063 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_KEY_in_table_constraint_pk3065 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_pk3069 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_table_constraint_pk3073 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_pk3076 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_table_constraint_pk3080 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_pk3084 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_table_constraint_pk3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_table_constraint_unique3111 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_unique3115 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_table_constraint_unique3119 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_unique3122 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_table_constraint_unique3126 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_unique3130 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_table_constraint_unique3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECK_in_table_constraint_check3157 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_check3160 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_table_constraint_check3163 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_check3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREIGN_in_table_constraint_fk3173 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_KEY_in_table_constraint_fk3175 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_fk3177 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_table_constraint_fk3181 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_fk3184 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_table_constraint_fk3188 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_fk3192 = new BitSet(new long[]{0x0000000000000000L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_fk_clause_in_table_constraint_fk3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCES_in_fk_clause3217 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_fk_clause3221 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000204L});
    public static final BitSet FOLLOW_LPAREN_in_fk_clause3224 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_fk_clause3228 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_fk_clause3231 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_fk_clause3235 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_fk_clause3239 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000204L});
    public static final BitSet FOLLOW_fk_clause_action_in_fk_clause3245 = new BitSet(new long[]{0x0000000004000002L,0x0000000002000000L,0x0000000000000214L});
    public static final BitSet FOLLOW_fk_clause_deferrable_in_fk_clause3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_fk_clause_action3282 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_set_in_fk_clause_action3285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L,0x0000000021000000L});
    public static final BitSet FOLLOW_SET_in_fk_clause_action3298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_fk_clause_action3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_fk_clause_action3305 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_DEFAULT_in_fk_clause_action3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASCADE_in_fk_clause_action3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESTRICT_in_fk_clause_action3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCH_in_fk_clause_action3323 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_fk_clause_action3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_fk_clause_deferrable3334 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_DEFERRABLE_in_fk_clause_deferrable3338 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_INITIALLY_in_fk_clause_deferrable3342 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_DEFERRED_in_fk_clause_deferrable3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITIALLY_in_fk_clause_deferrable3349 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IMMEDIATE_in_fk_clause_deferrable3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_table_stmt3362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_drop_table_stmt3364 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_drop_table_stmt3367 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_table_stmt3369 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_table_stmt3376 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_table_stmt3378 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_table_stmt3384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALTER_in_alter_table_stmt3414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_alter_table_stmt3416 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3421 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_alter_table_stmt3423 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3429 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RENAME_in_alter_table_stmt3432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_TO_in_alter_table_stmt3434 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_alter_table_stmt3442 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_COLUMN_in_alter_table_stmt3445 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_alter_table_stmt3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_view_stmt3458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040080000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_view_stmt3460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_VIEW_in_create_view_stmt3463 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_create_view_stmt3466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_view_stmt3468 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_view_stmt3470 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_view_stmt3477 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_view_stmt3479 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_view_stmt3485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_create_view_stmt3487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_create_view_stmt3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_view_stmt3497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_VIEW_in_drop_view_stmt3499 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_drop_view_stmt3502 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_view_stmt3504 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_view_stmt3511 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_view_stmt3513 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_view_stmt3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_index_stmt3527 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_UNIQUE_in_create_index_stmt3530 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_INDEX_in_create_index_stmt3534 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_create_index_stmt3537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_index_stmt3539 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_index_stmt3541 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3548 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_index_stmt3550 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ON_in_create_index_stmt3560 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3564 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_create_index_stmt3566 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_indexed_column_in_create_index_stmt3570 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_index_stmt3573 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_indexed_column_in_create_index_stmt3577 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_index_stmt3581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_indexed_column3627 = new BitSet(new long[]{0x0000000000000002L,0x0000000010002004L});
    public static final BitSet FOLLOW_COLLATE_in_indexed_column3630 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_indexed_column3634 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000004L});
    public static final BitSet FOLLOW_ASC_in_indexed_column3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_indexed_column3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_index_stmt3674 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_INDEX_in_drop_index_stmt3676 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_drop_index_stmt3679 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_index_stmt3681 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_index_stmt3688 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_index_stmt3690 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_index_stmt3696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_trigger_stmt3726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000880000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_trigger_stmt3728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_TRIGGER_in_create_trigger_stmt3731 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_create_trigger_stmt3734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_trigger_stmt3736 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_trigger_stmt3738 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3745 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_trigger_stmt3747 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3753 = new BitSet(new long[]{0x1000000000000000L,0x0180000008000020L,0x0000004000000000L});
    public static final BitSet FOLLOW_BEFORE_in_create_trigger_stmt3758 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_AFTER_in_create_trigger_stmt3762 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_INSTEAD_in_create_trigger_stmt3766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_OF_in_create_trigger_stmt3768 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_DELETE_in_create_trigger_stmt3773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INSERT_in_create_trigger_stmt3777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_UPDATE_in_create_trigger_stmt3781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_OF_in_create_trigger_stmt3784 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3788 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_create_trigger_stmt3791 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3795 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ON_in_create_trigger_stmt3804 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3808 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000040L,0x0000100000000000L});
    public static final BitSet FOLLOW_FOR_in_create_trigger_stmt3811 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_EACH_in_create_trigger_stmt3813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ROW_in_create_trigger_stmt3815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000100000000000L});
    public static final BitSet FOLLOW_WHEN_in_create_trigger_stmt3820 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_create_trigger_stmt3822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_BEGIN_in_create_trigger_stmt3828 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004010800000L});
    public static final BitSet FOLLOW_update_stmt_in_create_trigger_stmt3832 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_insert_stmt_in_create_trigger_stmt3836 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_delete_stmt_in_create_trigger_stmt3840 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_select_stmt_in_create_trigger_stmt3844 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMI_in_create_trigger_stmt3847 = new BitSet(new long[]{0x0000000000000000L,0x0080000408000000L,0x0000004010800000L});
    public static final BitSet FOLLOW_END_in_create_trigger_stmt3851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_trigger_stmt3859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_TRIGGER_in_drop_trigger_stmt3861 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_drop_trigger_stmt3864 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_trigger_stmt3866 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_trigger_stmt3873 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_trigger_stmt3875 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_trigger_stmt3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_id3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_column_def4569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_column_def_in_id_column_def4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword_column_def4580 = new BitSet(new long[]{0x0000000000000002L});

}