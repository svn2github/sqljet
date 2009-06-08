// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 SqlParser.g 2009-06-08 22:13:10

  package org.tmatesoft.sqljet.core.internal.lang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class SqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "EQUALS", "EQUALS2", "NOT_EQUALS", "NOT_EQUALS2", "LESS", "LESS_OR_EQ", "GREATER", "GREATER_OR_EQ", "SHIFT_LEFT", "SHIFT_RIGHT", "AMPERSAND", "PIPE", "DOUBLE_PIPE", "PLUS", "MINUS", "TILDA", "ASTERISK", "SLASH", "PERCENT", "SEMI", "DOT", "COMMA", "LPAREN", "RPAREN", "QUESTION", "COLON", "AT", "DOLLAR", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "ABORT", "ADD", "AFTER", "ALL", "ALTER", "ANALYZE", "AND", "AS", "ASC", "ATTACH", "AUTOINCREMENT", "BEFORE", "BEGIN", "BETWEEN", "BY", "CASCADE", "CASE", "CAST", "CHECK", "COLLATE", "COLUMN", "COMMIT", "CONFLICT", "CONSTRAINT", "CREATE", "CROSS", "CURRENT_TIME", "CURRENT_DATE", "CURRENT_TIMESTAMP", "DATABASE", "DEFAULT", "DEFERRABLE", "DEFERRED", "DELETE", "DESC", "DETACH", "DISTINCT", "DROP", "EACH", "ELSE", "END", "ESCAPE", "EXCEPT", "EXCLUSIVE", "EXISTS", "EXPLAIN", "FAIL", "FOR", "FOREIGN", "FROM", "GLOB", "GROUP", "HAVING", "IF", "IGNORE", "IMMEDIATE", "IN", "INDEX", "INDEXED", "INITIALLY", "INNER", "INSERT", "INSTEAD", "INTERSECT", "INTO", "IS", "ISNULL", "JOIN", "KEY", "LEFT", "LIKE", "LIMIT", "MATCH", "NATURAL", "NOT", "NOTNULL", "NULL", "OF", "OFFSET", "ON", "OR", "ORDER", "OUTER", "PLAN", "PRAGMA", "PRIMARY", "QUERY", "RAISE", "REFERENCES", "REGEXP", "REINDEX", "RELEASE", "RENAME", "REPLACE", "RESTRICT", "ROLLBACK", "ROW", "SAVEPOINT", "SELECT", "SET", "TABLE", "TEMPORARY", "THEN", "TO", "TRANSACTION", "TRIGGER", "UNION", "UNIQUE", "UPDATE", "USING", "VACUUM", "VALUES", "VIEW", "VIRTUAL", "WHEN", "WHERE", "ID_START", "ID", "STRING", "INTEGER", "FLOAT_EXP", "FLOAT", "SIGNED_NUMBER", "BLOB", "COMMENT", "LINE_COMMENT", "WS", "ALIAS", "BIND", "BIND_NAME", "BLOB_LITERAL", "COLUMN_CONSTRAINT", "COLUMN_EXPRESSION", "COLUMNS", "CONSTRAINTS", "CREATE_INDEX", "CREATE_TABLE", "DROP_INDEX", "DROP_TABLE", "FLOAT_LITERAL", "FUNCTION_LITERAL", "INTEGER_LITERAL", "OPTIONS", "ORDERING", "SELECT_CORE", "STRING_LITERAL", "TABLE_CONSTRAINT", "TYPE", "TYPE_PARAMS"
    };
    public static final int ROW=154;
    public static final int BLOB_LITERAL=188;
    public static final int TYPE_PARAMS=206;
    public static final int NOT=132;
    public static final int EXCEPT=100;
    public static final int FOREIGN=106;
    public static final int EOF=-1;
    public static final int SIGNED_NUMBER=180;
    public static final int TYPE=205;
    public static final int RPAREN=27;
    public static final int CREATE=82;
    public static final int STRING_LITERAL=203;
    public static final int USING=167;
    public static final int BIND=186;
    public static final int BEGIN=70;
    public static final int REGEXP=147;
    public static final int ANALYZE=63;
    public static final int FUNCTION_LITERAL=198;
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
    public static final int BIND_NAME=187;
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
    public static final int DROP_INDEX=195;
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
    public static final int COLUMN_CONSTRAINT=189;
    public static final int COLON=29;
    public static final int COLUMNS=191;
    public static final int FLOAT_EXP=178;
    public static final int COMMIT=79;
    public static final int DATABASE=87;
    public static final int VACUUM=168;
    public static final int DROP=95;
    public static final int DETACH=93;
    public static final int WHEN=172;
    public static final int NATURAL=131;
    public static final int BETWEEN=71;
    public static final int OPTIONS=200;
    public static final int STRING=176;
    public static final int CAST=75;
    public static final int TABLE_CONSTRAINT=204;
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
    public static final int INTEGER_LITERAL=199;
    public static final int OR=138;
    public static final int QUERY=144;
    public static final int CHECK=76;
    public static final int FROM=107;
    public static final int TEMPORARY=159;
    public static final int DISTINCT=94;
    public static final int CURRENT_DATE=85;
    public static final int DOLLAR=31;
    public static final int CONSTRAINTS=192;
    public static final int WHERE=173;
    public static final int COLUMN_EXPRESSION=190;
    public static final int INNER=118;
    public static final int ORDER=139;
    public static final int LIMIT=129;
    public static final int PRAGMA=142;
    public static final int UPDATE=166;
    public static final int FOR=105;
    public static final int DEFERRED=90;
    public static final int SELECT_CORE=202;
    public static final int EXCLUSIVE=101;
    public static final int ID=175;
    public static final int AND=64;
    public static final int CROSS=83;
    public static final int IF=111;
    public static final int INDEX=115;
    public static final int TILDA=19;
    public static final int IN=114;
    public static final int CREATE_TABLE=194;
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
    public static final int FLOAT_LITERAL=197;
    public static final int INDEXED=116;
    public static final int CREATE_INDEX=193;
    public static final int QUESTION=28;
    public static final int ORDERING=201;
    public static final int IMMEDIATE=113;
    public static final int DESC=92;
    public static final int DROP_TABLE=196;
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
    // SqlParser.g:56:1: sql_stmt_list : ( sql_stmt )+ ;
    public final SqlParser.sql_stmt_list_return sql_stmt_list() throws RecognitionException {
        SqlParser.sql_stmt_list_return retval = new SqlParser.sql_stmt_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.sql_stmt_return sql_stmt1 = null;



        try {
            // SqlParser.g:56:14: ( ( sql_stmt )+ )
            // SqlParser.g:56:16: ( sql_stmt )+
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:56:16: ( sql_stmt )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // SqlParser.g:56:17: sql_stmt
            	    {
            	    pushFollow(FOLLOW_sql_stmt_in_sql_stmt_list161);
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
    // SqlParser.g:58:1: sql_stmt : ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI ;
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
            // SqlParser.g:58:9: ( ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI )
            // SqlParser.g:58:11: ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:58:11: ( EXPLAIN ( QUERY PLAN )? )?
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // SqlParser.g:58:12: EXPLAIN ( QUERY PLAN )?
                    {
                    EXPLAIN2=(Token)match(input,EXPLAIN,FOLLOW_EXPLAIN_in_sql_stmt171); 
                    EXPLAIN2_tree = (Object)adaptor.create(EXPLAIN2);
                    adaptor.addChild(root_0, EXPLAIN2_tree);

                    // SqlParser.g:58:20: ( QUERY PLAN )?
                    int alt2=2;
                    alt2 = dfa2.predict(input);
                    switch (alt2) {
                        case 1 :
                            // SqlParser.g:58:21: QUERY PLAN
                            {
                            QUERY3=(Token)match(input,QUERY,FOLLOW_QUERY_in_sql_stmt174); 
                            QUERY3_tree = (Object)adaptor.create(QUERY3);
                            adaptor.addChild(root_0, QUERY3_tree);

                            PLAN4=(Token)match(input,PLAN,FOLLOW_PLAN_in_sql_stmt176); 
                            PLAN4_tree = (Object)adaptor.create(PLAN4);
                            adaptor.addChild(root_0, PLAN4_tree);


                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_sql_stmt_core_in_sql_stmt182);
            sql_stmt_core5=sql_stmt_core();

            state._fsp--;

            adaptor.addChild(root_0, sql_stmt_core5.getTree());
            SEMI6=(Token)match(input,SEMI,FOLLOW_SEMI_in_sql_stmt184); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // SqlParser.g:60:1: sql_stmt_core : ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt );
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
            // SqlParser.g:61:3: ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt )
            int alt4=25;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // SqlParser.g:61:5: pragma_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pragma_stmt_in_sql_stmt_core195);
                    pragma_stmt7=pragma_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_stmt7.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:62:5: attach_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_attach_stmt_in_sql_stmt_core201);
                    attach_stmt8=attach_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, attach_stmt8.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:63:5: detach_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_detach_stmt_in_sql_stmt_core207);
                    detach_stmt9=detach_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, detach_stmt9.getTree());

                    }
                    break;
                case 4 :
                    // SqlParser.g:64:5: analyze_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_analyze_stmt_in_sql_stmt_core213);
                    analyze_stmt10=analyze_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, analyze_stmt10.getTree());

                    }
                    break;
                case 5 :
                    // SqlParser.g:65:5: reindex_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_reindex_stmt_in_sql_stmt_core219);
                    reindex_stmt11=reindex_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, reindex_stmt11.getTree());

                    }
                    break;
                case 6 :
                    // SqlParser.g:66:5: vacuum_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_vacuum_stmt_in_sql_stmt_core225);
                    vacuum_stmt12=vacuum_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, vacuum_stmt12.getTree());

                    }
                    break;
                case 7 :
                    // SqlParser.g:68:5: select_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_select_stmt_in_sql_stmt_core234);
                    select_stmt13=select_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, select_stmt13.getTree());

                    }
                    break;
                case 8 :
                    // SqlParser.g:69:5: insert_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_insert_stmt_in_sql_stmt_core240);
                    insert_stmt14=insert_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, insert_stmt14.getTree());

                    }
                    break;
                case 9 :
                    // SqlParser.g:70:5: update_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_update_stmt_in_sql_stmt_core246);
                    update_stmt15=update_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, update_stmt15.getTree());

                    }
                    break;
                case 10 :
                    // SqlParser.g:71:5: delete_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_delete_stmt_in_sql_stmt_core252);
                    delete_stmt16=delete_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_stmt16.getTree());

                    }
                    break;
                case 11 :
                    // SqlParser.g:72:5: begin_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_begin_stmt_in_sql_stmt_core258);
                    begin_stmt17=begin_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, begin_stmt17.getTree());

                    }
                    break;
                case 12 :
                    // SqlParser.g:73:5: commit_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_commit_stmt_in_sql_stmt_core264);
                    commit_stmt18=commit_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, commit_stmt18.getTree());

                    }
                    break;
                case 13 :
                    // SqlParser.g:74:5: rollback_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_rollback_stmt_in_sql_stmt_core270);
                    rollback_stmt19=rollback_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, rollback_stmt19.getTree());

                    }
                    break;
                case 14 :
                    // SqlParser.g:75:5: savepoint_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_savepoint_stmt_in_sql_stmt_core276);
                    savepoint_stmt20=savepoint_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, savepoint_stmt20.getTree());

                    }
                    break;
                case 15 :
                    // SqlParser.g:76:5: release_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_release_stmt_in_sql_stmt_core282);
                    release_stmt21=release_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, release_stmt21.getTree());

                    }
                    break;
                case 16 :
                    // SqlParser.g:78:5: create_virtual_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_virtual_table_stmt_in_sql_stmt_core291);
                    create_virtual_table_stmt22=create_virtual_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_virtual_table_stmt22.getTree());

                    }
                    break;
                case 17 :
                    // SqlParser.g:79:5: create_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_table_stmt_in_sql_stmt_core297);
                    create_table_stmt23=create_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_table_stmt23.getTree());

                    }
                    break;
                case 18 :
                    // SqlParser.g:80:5: drop_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_table_stmt_in_sql_stmt_core303);
                    drop_table_stmt24=drop_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_table_stmt24.getTree());

                    }
                    break;
                case 19 :
                    // SqlParser.g:81:5: alter_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_alter_table_stmt_in_sql_stmt_core309);
                    alter_table_stmt25=alter_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, alter_table_stmt25.getTree());

                    }
                    break;
                case 20 :
                    // SqlParser.g:82:5: create_view_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_view_stmt_in_sql_stmt_core315);
                    create_view_stmt26=create_view_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_view_stmt26.getTree());

                    }
                    break;
                case 21 :
                    // SqlParser.g:83:5: drop_view_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_view_stmt_in_sql_stmt_core321);
                    drop_view_stmt27=drop_view_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_view_stmt27.getTree());

                    }
                    break;
                case 22 :
                    // SqlParser.g:84:5: create_index_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_index_stmt_in_sql_stmt_core327);
                    create_index_stmt28=create_index_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_index_stmt28.getTree());

                    }
                    break;
                case 23 :
                    // SqlParser.g:85:5: drop_index_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_index_stmt_in_sql_stmt_core333);
                    drop_index_stmt29=drop_index_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_index_stmt29.getTree());

                    }
                    break;
                case 24 :
                    // SqlParser.g:86:5: create_trigger_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_trigger_stmt_in_sql_stmt_core339);
                    create_trigger_stmt30=create_trigger_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_trigger_stmt30.getTree());

                    }
                    break;
                case 25 :
                    // SqlParser.g:87:5: drop_trigger_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_trigger_stmt_in_sql_stmt_core345);
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
    // SqlParser.g:90:1: qualified_table_name : (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )? ;
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
            // SqlParser.g:90:21: ( (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )? )
            // SqlParser.g:90:23: (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )?
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:90:23: (database_name= id DOT )?
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // SqlParser.g:90:24: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_qualified_table_name358);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT32=(Token)match(input,DOT,FOLLOW_DOT_in_qualified_table_name360); 
                    DOT32_tree = (Object)adaptor.create(DOT32);
                    adaptor.addChild(root_0, DOT32_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_qualified_table_name366);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:90:61: ( INDEXED BY index_name= id | NOT INDEXED )?
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
                    // SqlParser.g:90:62: INDEXED BY index_name= id
                    {
                    INDEXED33=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_qualified_table_name369); 
                    INDEXED33_tree = (Object)adaptor.create(INDEXED33);
                    adaptor.addChild(root_0, INDEXED33_tree);

                    BY34=(Token)match(input,BY,FOLLOW_BY_in_qualified_table_name371); 
                    BY34_tree = (Object)adaptor.create(BY34);
                    adaptor.addChild(root_0, BY34_tree);

                    pushFollow(FOLLOW_id_in_qualified_table_name375);
                    index_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, index_name.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:90:89: NOT INDEXED
                    {
                    NOT35=(Token)match(input,NOT,FOLLOW_NOT_in_qualified_table_name379); 
                    NOT35_tree = (Object)adaptor.create(NOT35);
                    adaptor.addChild(root_0, NOT35_tree);

                    INDEXED36=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_qualified_table_name381); 
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
    // SqlParser.g:92:1: expr : or_subexpr ( OR or_subexpr )* ;
    public final SqlParser.expr_return expr() throws RecognitionException {
        SqlParser.expr_return retval = new SqlParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR38=null;
        SqlParser.or_subexpr_return or_subexpr37 = null;

        SqlParser.or_subexpr_return or_subexpr39 = null;


        Object OR38_tree=null;

        try {
            // SqlParser.g:92:5: ( or_subexpr ( OR or_subexpr )* )
            // SqlParser.g:92:7: or_subexpr ( OR or_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_or_subexpr_in_expr390);
            or_subexpr37=or_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, or_subexpr37.getTree());
            // SqlParser.g:92:18: ( OR or_subexpr )*
            loop7:
            do {
                int alt7=2;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // SqlParser.g:92:19: OR or_subexpr
            	    {
            	    OR38=(Token)match(input,OR,FOLLOW_OR_in_expr393); 
            	    OR38_tree = (Object)adaptor.create(OR38);
            	    root_0 = (Object)adaptor.becomeRoot(OR38_tree, root_0);

            	    pushFollow(FOLLOW_or_subexpr_in_expr396);
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
    // SqlParser.g:94:1: or_subexpr : and_subexpr ( AND and_subexpr )* ;
    public final SqlParser.or_subexpr_return or_subexpr() throws RecognitionException {
        SqlParser.or_subexpr_return retval = new SqlParser.or_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND41=null;
        SqlParser.and_subexpr_return and_subexpr40 = null;

        SqlParser.and_subexpr_return and_subexpr42 = null;


        Object AND41_tree=null;

        try {
            // SqlParser.g:94:11: ( and_subexpr ( AND and_subexpr )* )
            // SqlParser.g:94:13: and_subexpr ( AND and_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_and_subexpr_in_or_subexpr405);
            and_subexpr40=and_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, and_subexpr40.getTree());
            // SqlParser.g:94:25: ( AND and_subexpr )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // SqlParser.g:94:26: AND and_subexpr
            	    {
            	    AND41=(Token)match(input,AND,FOLLOW_AND_in_or_subexpr408); 
            	    AND41_tree = (Object)adaptor.create(AND41);
            	    root_0 = (Object)adaptor.becomeRoot(AND41_tree, root_0);

            	    pushFollow(FOLLOW_and_subexpr_in_or_subexpr411);
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

    public static class in_source_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "in_source"
    // SqlParser.g:96:1: in_source : ( LPAREN ( select_stmt | expr ( COMMA expr )* )? RPAREN | (database_name= id DOT )? table_name= id );
    public final SqlParser.in_source_return in_source() throws RecognitionException {
        SqlParser.in_source_return retval = new SqlParser.in_source_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN43=null;
        Token COMMA46=null;
        Token RPAREN48=null;
        Token DOT49=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.select_stmt_return select_stmt44 = null;

        SqlParser.expr_return expr45 = null;

        SqlParser.expr_return expr47 = null;


        Object LPAREN43_tree=null;
        Object COMMA46_tree=null;
        Object RPAREN48_tree=null;
        Object DOT49_tree=null;

        try {
            // SqlParser.g:97:3: ( LPAREN ( select_stmt | expr ( COMMA expr )* )? RPAREN | (database_name= id DOT )? table_name= id )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==LPAREN) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=ABORT && LA12_0<=WHERE)||LA12_0==ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // SqlParser.g:97:5: LPAREN ( select_stmt | expr ( COMMA expr )* )? RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN43=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_in_source423); 
                    LPAREN43_tree = (Object)adaptor.create(LPAREN43);
                    adaptor.addChild(root_0, LPAREN43_tree);

                    // SqlParser.g:97:12: ( select_stmt | expr ( COMMA expr )* )?
                    int alt10=3;
                    alt10 = dfa10.predict(input);
                    switch (alt10) {
                        case 1 :
                            // SqlParser.g:97:13: select_stmt
                            {
                            pushFollow(FOLLOW_select_stmt_in_in_source426);
                            select_stmt44=select_stmt();

                            state._fsp--;

                            adaptor.addChild(root_0, select_stmt44.getTree());

                            }
                            break;
                        case 2 :
                            // SqlParser.g:97:27: expr ( COMMA expr )*
                            {
                            pushFollow(FOLLOW_expr_in_in_source430);
                            expr45=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr45.getTree());
                            // SqlParser.g:97:32: ( COMMA expr )*
                            loop9:
                            do {
                                int alt9=2;
                                int LA9_0 = input.LA(1);

                                if ( (LA9_0==COMMA) ) {
                                    alt9=1;
                                }


                                switch (alt9) {
                            	case 1 :
                            	    // SqlParser.g:97:33: COMMA expr
                            	    {
                            	    COMMA46=(Token)match(input,COMMA,FOLLOW_COMMA_in_in_source433); 
                            	    COMMA46_tree = (Object)adaptor.create(COMMA46);
                            	    adaptor.addChild(root_0, COMMA46_tree);

                            	    pushFollow(FOLLOW_expr_in_in_source435);
                            	    expr47=expr();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, expr47.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop9;
                                }
                            } while (true);


                            }
                            break;

                    }

                    RPAREN48=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_in_source441); 
                    RPAREN48_tree = (Object)adaptor.create(RPAREN48);
                    adaptor.addChild(root_0, RPAREN48_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:98:5: (database_name= id DOT )? table_name= id
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:98:5: (database_name= id DOT )?
                    int alt11=2;
                    alt11 = dfa11.predict(input);
                    switch (alt11) {
                        case 1 :
                            // SqlParser.g:98:6: database_name= id DOT
                            {
                            pushFollow(FOLLOW_id_in_in_source450);
                            database_name=id();

                            state._fsp--;

                            adaptor.addChild(root_0, database_name.getTree());
                            DOT49=(Token)match(input,DOT,FOLLOW_DOT_in_in_source452); 
                            DOT49_tree = (Object)adaptor.create(DOT49);
                            adaptor.addChild(root_0, DOT49_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_id_in_in_source458);
                    table_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, table_name.getTree());

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
    // $ANTLR end "in_source"

    public static class and_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "and_subexpr"
    // SqlParser.g:101:1: and_subexpr : ( eq_subexpr ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )* | ( NOT )? op= ( LIKE | GLOB | REGEXP | MATCH ) eq_subexpr ( ESCAPE escape_subexpr= eq_subexpr )? -> ^( $op eq_subexpr ( NOT )? ( ^( ESCAPE $escape_subexpr) )? ) | ( NOT )? IN in_source | ( ISNULL | NOTNULL | IS NULL -> ISNULL | IS NOT NULL -> NOTNULL ) | ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr -> ^( BETWEEN $e1 $e2 ( NOT )? ) );
    public final SqlParser.and_subexpr_return and_subexpr() throws RecognitionException {
        SqlParser.and_subexpr_return retval = new SqlParser.and_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        Token set51=null;
        Token NOT53=null;
        Token LIKE54=null;
        Token GLOB55=null;
        Token REGEXP56=null;
        Token MATCH57=null;
        Token ESCAPE59=null;
        Token NOT60=null;
        Token IN61=null;
        Token ISNULL63=null;
        Token NOTNULL64=null;
        Token IS65=null;
        Token NULL66=null;
        Token IS67=null;
        Token NOT68=null;
        Token NULL69=null;
        Token NOT70=null;
        Token BETWEEN71=null;
        Token AND72=null;
        SqlParser.eq_subexpr_return escape_subexpr = null;

        SqlParser.eq_subexpr_return e1 = null;

        SqlParser.eq_subexpr_return e2 = null;

        SqlParser.eq_subexpr_return eq_subexpr50 = null;

        SqlParser.eq_subexpr_return eq_subexpr52 = null;

        SqlParser.eq_subexpr_return eq_subexpr58 = null;

        SqlParser.in_source_return in_source62 = null;


        Object op_tree=null;
        Object set51_tree=null;
        Object NOT53_tree=null;
        Object LIKE54_tree=null;
        Object GLOB55_tree=null;
        Object REGEXP56_tree=null;
        Object MATCH57_tree=null;
        Object ESCAPE59_tree=null;
        Object NOT60_tree=null;
        Object IN61_tree=null;
        Object ISNULL63_tree=null;
        Object NOTNULL64_tree=null;
        Object IS65_tree=null;
        Object NULL66_tree=null;
        Object IS67_tree=null;
        Object NOT68_tree=null;
        Object NULL69_tree=null;
        Object NOT70_tree=null;
        Object BETWEEN71_tree=null;
        Object AND72_tree=null;
        RewriteRuleTokenStream stream_REGEXP=new RewriteRuleTokenStream(adaptor,"token REGEXP");
        RewriteRuleTokenStream stream_MATCH=new RewriteRuleTokenStream(adaptor,"token MATCH");
        RewriteRuleTokenStream stream_GLOB=new RewriteRuleTokenStream(adaptor,"token GLOB");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_ESCAPE=new RewriteRuleTokenStream(adaptor,"token ESCAPE");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_NOTNULL=new RewriteRuleTokenStream(adaptor,"token NOTNULL");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_BETWEEN=new RewriteRuleTokenStream(adaptor,"token BETWEEN");
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleTokenStream stream_LIKE=new RewriteRuleTokenStream(adaptor,"token LIKE");
        RewriteRuleTokenStream stream_ISNULL=new RewriteRuleTokenStream(adaptor,"token ISNULL");
        RewriteRuleSubtreeStream stream_eq_subexpr=new RewriteRuleSubtreeStream(adaptor,"rule eq_subexpr");
        try {
            // SqlParser.g:102:3: ( eq_subexpr ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )* | ( NOT )? op= ( LIKE | GLOB | REGEXP | MATCH ) eq_subexpr ( ESCAPE escape_subexpr= eq_subexpr )? -> ^( $op eq_subexpr ( NOT )? ( ^( ESCAPE $escape_subexpr) )? ) | ( NOT )? IN in_source | ( ISNULL | NOTNULL | IS NULL -> ISNULL | IS NOT NULL -> NOTNULL ) | ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr -> ^( BETWEEN $e1 $e2 ( NOT )? ) )
            int alt20=5;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // SqlParser.g:102:5: eq_subexpr ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr471);
                    eq_subexpr50=eq_subexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, eq_subexpr50.getTree());
                    // SqlParser.g:102:16: ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )*
                    loop13:
                    do {
                        int alt13=2;
                        alt13 = dfa13.predict(input);
                        switch (alt13) {
                    	case 1 :
                    	    // SqlParser.g:102:17: ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr
                    	    {
                    	    set51=(Token)input.LT(1);
                    	    set51=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=EQUALS && input.LA(1)<=NOT_EQUALS2) ) {
                    	        input.consume();
                    	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set51), root_0);
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr491);
                    	    eq_subexpr52=eq_subexpr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, eq_subexpr52.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // SqlParser.g:103:5: ( NOT )? op= ( LIKE | GLOB | REGEXP | MATCH ) eq_subexpr ( ESCAPE escape_subexpr= eq_subexpr )?
                    {
                    // SqlParser.g:103:5: ( NOT )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==NOT) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // SqlParser.g:103:5: NOT
                            {
                            NOT53=(Token)match(input,NOT,FOLLOW_NOT_in_and_subexpr499);  
                            stream_NOT.add(NOT53);


                            }
                            break;

                    }

                    // SqlParser.g:103:13: ( LIKE | GLOB | REGEXP | MATCH )
                    int alt15=4;
                    switch ( input.LA(1) ) {
                    case LIKE:
                        {
                        alt15=1;
                        }
                        break;
                    case GLOB:
                        {
                        alt15=2;
                        }
                        break;
                    case REGEXP:
                        {
                        alt15=3;
                        }
                        break;
                    case MATCH:
                        {
                        alt15=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }

                    switch (alt15) {
                        case 1 :
                            // SqlParser.g:103:14: LIKE
                            {
                            LIKE54=(Token)match(input,LIKE,FOLLOW_LIKE_in_and_subexpr505);  
                            stream_LIKE.add(LIKE54);


                            }
                            break;
                        case 2 :
                            // SqlParser.g:103:21: GLOB
                            {
                            GLOB55=(Token)match(input,GLOB,FOLLOW_GLOB_in_and_subexpr509);  
                            stream_GLOB.add(GLOB55);


                            }
                            break;
                        case 3 :
                            // SqlParser.g:103:28: REGEXP
                            {
                            REGEXP56=(Token)match(input,REGEXP,FOLLOW_REGEXP_in_and_subexpr513);  
                            stream_REGEXP.add(REGEXP56);


                            }
                            break;
                        case 4 :
                            // SqlParser.g:103:37: MATCH
                            {
                            MATCH57=(Token)match(input,MATCH,FOLLOW_MATCH_in_and_subexpr517);  
                            stream_MATCH.add(MATCH57);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr520);
                    eq_subexpr58=eq_subexpr();

                    state._fsp--;

                    stream_eq_subexpr.add(eq_subexpr58.getTree());
                    // SqlParser.g:103:55: ( ESCAPE escape_subexpr= eq_subexpr )?
                    int alt16=2;
                    alt16 = dfa16.predict(input);
                    switch (alt16) {
                        case 1 :
                            // SqlParser.g:103:56: ESCAPE escape_subexpr= eq_subexpr
                            {
                            ESCAPE59=(Token)match(input,ESCAPE,FOLLOW_ESCAPE_in_and_subexpr523);  
                            stream_ESCAPE.add(ESCAPE59);

                            pushFollow(FOLLOW_eq_subexpr_in_and_subexpr527);
                            escape_subexpr=eq_subexpr();

                            state._fsp--;

                            stream_eq_subexpr.add(escape_subexpr.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: NOT, op, escape_subexpr, eq_subexpr, ESCAPE
                    // token labels: op
                    // rule labels: retval, escape_subexpr
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_escape_subexpr=new RewriteRuleSubtreeStream(adaptor,"rule escape_subexpr",escape_subexpr!=null?escape_subexpr.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 103:91: -> ^( $op eq_subexpr ( NOT )? ( ^( ESCAPE $escape_subexpr) )? )
                    {
                        // SqlParser.g:103:94: ^( $op eq_subexpr ( NOT )? ( ^( ESCAPE $escape_subexpr) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_op.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_eq_subexpr.nextTree());
                        // SqlParser.g:103:111: ( NOT )?
                        if ( stream_NOT.hasNext() ) {
                            adaptor.addChild(root_1, stream_NOT.nextNode());

                        }
                        stream_NOT.reset();
                        // SqlParser.g:103:116: ( ^( ESCAPE $escape_subexpr) )?
                        if ( stream_escape_subexpr.hasNext()||stream_ESCAPE.hasNext() ) {
                            // SqlParser.g:103:116: ^( ESCAPE $escape_subexpr)
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(stream_ESCAPE.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_escape_subexpr.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_escape_subexpr.reset();
                        stream_ESCAPE.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // SqlParser.g:104:5: ( NOT )? IN in_source
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:104:5: ( NOT )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==NOT) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // SqlParser.g:104:5: NOT
                            {
                            NOT60=(Token)match(input,NOT,FOLLOW_NOT_in_and_subexpr555); 
                            NOT60_tree = (Object)adaptor.create(NOT60);
                            adaptor.addChild(root_0, NOT60_tree);


                            }
                            break;

                    }

                    IN61=(Token)match(input,IN,FOLLOW_IN_in_and_subexpr558); 
                    IN61_tree = (Object)adaptor.create(IN61);
                    root_0 = (Object)adaptor.becomeRoot(IN61_tree, root_0);

                    pushFollow(FOLLOW_in_source_in_and_subexpr561);
                    in_source62=in_source();

                    state._fsp--;

                    adaptor.addChild(root_0, in_source62.getTree());

                    }
                    break;
                case 4 :
                    // SqlParser.g:105:5: ( ISNULL | NOTNULL | IS NULL -> ISNULL | IS NOT NULL -> NOTNULL )
                    {
                    // SqlParser.g:105:5: ( ISNULL | NOTNULL | IS NULL -> ISNULL | IS NOT NULL -> NOTNULL )
                    int alt18=4;
                    switch ( input.LA(1) ) {
                    case ISNULL:
                        {
                        alt18=1;
                        }
                        break;
                    case NOTNULL:
                        {
                        alt18=2;
                        }
                        break;
                    case IS:
                        {
                        int LA18_3 = input.LA(2);

                        if ( (LA18_3==NULL) ) {
                            alt18=3;
                        }
                        else if ( (LA18_3==NOT) ) {
                            alt18=4;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }

                    switch (alt18) {
                        case 1 :
                            // SqlParser.g:105:6: ISNULL
                            {
                            ISNULL63=(Token)match(input,ISNULL,FOLLOW_ISNULL_in_and_subexpr568);  
                            stream_ISNULL.add(ISNULL63);


                            }
                            break;
                        case 2 :
                            // SqlParser.g:105:15: NOTNULL
                            {
                            NOTNULL64=(Token)match(input,NOTNULL,FOLLOW_NOTNULL_in_and_subexpr572);  
                            stream_NOTNULL.add(NOTNULL64);


                            }
                            break;
                        case 3 :
                            // SqlParser.g:105:25: IS NULL
                            {
                            IS65=(Token)match(input,IS,FOLLOW_IS_in_and_subexpr576);  
                            stream_IS.add(IS65);

                            NULL66=(Token)match(input,NULL,FOLLOW_NULL_in_and_subexpr578);  
                            stream_NULL.add(NULL66);



                            // AST REWRITE
                            // elements: ISNULL
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 105:33: -> ISNULL
                            {
                                adaptor.addChild(root_0, stream_ISNULL.nextNode());

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 4 :
                            // SqlParser.g:105:98: IS NOT NULL
                            {
                            IS67=(Token)match(input,IS,FOLLOW_IS_in_and_subexpr587);  
                            stream_IS.add(IS67);

                            NOT68=(Token)match(input,NOT,FOLLOW_NOT_in_and_subexpr589);  
                            stream_NOT.add(NOT68);

                            NULL69=(Token)match(input,NULL,FOLLOW_NULL_in_and_subexpr591);  
                            stream_NULL.add(NULL69);



                            // AST REWRITE
                            // elements: NOTNULL
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 105:110: -> NOTNULL
                            {
                                adaptor.addChild(root_0, stream_NOTNULL.nextNode());

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // SqlParser.g:106:5: ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr
                    {
                    // SqlParser.g:106:5: ( NOT )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==NOT) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // SqlParser.g:106:5: NOT
                            {
                            NOT70=(Token)match(input,NOT,FOLLOW_NOT_in_and_subexpr602);  
                            stream_NOT.add(NOT70);


                            }
                            break;

                    }

                    BETWEEN71=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_and_subexpr605);  
                    stream_BETWEEN.add(BETWEEN71);

                    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr609);
                    e1=eq_subexpr();

                    state._fsp--;

                    stream_eq_subexpr.add(e1.getTree());
                    AND72=(Token)match(input,AND,FOLLOW_AND_in_and_subexpr611);  
                    stream_AND.add(AND72);

                    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr615);
                    e2=eq_subexpr();

                    state._fsp--;

                    stream_eq_subexpr.add(e2.getTree());


                    // AST REWRITE
                    // elements: e2, e1, BETWEEN, NOT
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
                    // 106:50: -> ^( BETWEEN $e1 $e2 ( NOT )? )
                    {
                        // SqlParser.g:106:53: ^( BETWEEN $e1 $e2 ( NOT )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_BETWEEN.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_e1.nextTree());
                        adaptor.addChild(root_1, stream_e2.nextTree());
                        // SqlParser.g:106:71: ( NOT )?
                        if ( stream_NOT.hasNext() ) {
                            adaptor.addChild(root_1, stream_NOT.nextNode());

                        }
                        stream_NOT.reset();

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
    // $ANTLR end "and_subexpr"

    public static class eq_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eq_subexpr"
    // SqlParser.g:109:1: eq_subexpr : neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )* ;
    public final SqlParser.eq_subexpr_return eq_subexpr() throws RecognitionException {
        SqlParser.eq_subexpr_return retval = new SqlParser.eq_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set74=null;
        SqlParser.neq_subexpr_return neq_subexpr73 = null;

        SqlParser.neq_subexpr_return neq_subexpr75 = null;


        Object set74_tree=null;

        try {
            // SqlParser.g:109:11: ( neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )* )
            // SqlParser.g:109:13: neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_neq_subexpr_in_eq_subexpr640);
            neq_subexpr73=neq_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, neq_subexpr73.getTree());
            // SqlParser.g:109:25: ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )*
            loop21:
            do {
                int alt21=2;
                alt21 = dfa21.predict(input);
                switch (alt21) {
            	case 1 :
            	    // SqlParser.g:109:26: ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr
            	    {
            	    set74=(Token)input.LT(1);
            	    set74=(Token)input.LT(1);
            	    if ( (input.LA(1)>=LESS && input.LA(1)<=GREATER_OR_EQ) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set74), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_neq_subexpr_in_eq_subexpr660);
            	    neq_subexpr75=neq_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, neq_subexpr75.getTree());

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
    // SqlParser.g:111:1: neq_subexpr : bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )* ;
    public final SqlParser.neq_subexpr_return neq_subexpr() throws RecognitionException {
        SqlParser.neq_subexpr_return retval = new SqlParser.neq_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set77=null;
        SqlParser.bit_subexpr_return bit_subexpr76 = null;

        SqlParser.bit_subexpr_return bit_subexpr78 = null;


        Object set77_tree=null;

        try {
            // SqlParser.g:111:12: ( bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )* )
            // SqlParser.g:111:14: bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bit_subexpr_in_neq_subexpr669);
            bit_subexpr76=bit_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, bit_subexpr76.getTree());
            // SqlParser.g:111:26: ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )*
            loop22:
            do {
                int alt22=2;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // SqlParser.g:111:27: ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr
            	    {
            	    set77=(Token)input.LT(1);
            	    set77=(Token)input.LT(1);
            	    if ( (input.LA(1)>=SHIFT_LEFT && input.LA(1)<=PIPE) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set77), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_bit_subexpr_in_neq_subexpr689);
            	    bit_subexpr78=bit_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bit_subexpr78.getTree());

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
    // SqlParser.g:113:1: bit_subexpr : add_subexpr ( ( PLUS | MINUS ) add_subexpr )* ;
    public final SqlParser.bit_subexpr_return bit_subexpr() throws RecognitionException {
        SqlParser.bit_subexpr_return retval = new SqlParser.bit_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set80=null;
        SqlParser.add_subexpr_return add_subexpr79 = null;

        SqlParser.add_subexpr_return add_subexpr81 = null;


        Object set80_tree=null;

        try {
            // SqlParser.g:113:12: ( add_subexpr ( ( PLUS | MINUS ) add_subexpr )* )
            // SqlParser.g:113:14: add_subexpr ( ( PLUS | MINUS ) add_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_subexpr_in_bit_subexpr698);
            add_subexpr79=add_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, add_subexpr79.getTree());
            // SqlParser.g:113:26: ( ( PLUS | MINUS ) add_subexpr )*
            loop23:
            do {
                int alt23=2;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // SqlParser.g:113:27: ( PLUS | MINUS ) add_subexpr
            	    {
            	    set80=(Token)input.LT(1);
            	    set80=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set80), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_add_subexpr_in_bit_subexpr710);
            	    add_subexpr81=add_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, add_subexpr81.getTree());

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
    // SqlParser.g:115:1: add_subexpr : mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )* ;
    public final SqlParser.add_subexpr_return add_subexpr() throws RecognitionException {
        SqlParser.add_subexpr_return retval = new SqlParser.add_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set83=null;
        SqlParser.mul_subexpr_return mul_subexpr82 = null;

        SqlParser.mul_subexpr_return mul_subexpr84 = null;


        Object set83_tree=null;

        try {
            // SqlParser.g:115:12: ( mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )* )
            // SqlParser.g:115:14: mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mul_subexpr_in_add_subexpr719);
            mul_subexpr82=mul_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, mul_subexpr82.getTree());
            // SqlParser.g:115:26: ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )*
            loop24:
            do {
                int alt24=2;
                alt24 = dfa24.predict(input);
                switch (alt24) {
            	case 1 :
            	    // SqlParser.g:115:27: ( ASTERISK | SLASH | PERCENT ) mul_subexpr
            	    {
            	    set83=(Token)input.LT(1);
            	    set83=(Token)input.LT(1);
            	    if ( (input.LA(1)>=ASTERISK && input.LA(1)<=PERCENT) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set83), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mul_subexpr_in_add_subexpr735);
            	    mul_subexpr84=mul_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mul_subexpr84.getTree());

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
    // SqlParser.g:117:1: mul_subexpr : con_subexpr ( DOUBLE_PIPE con_subexpr )* ;
    public final SqlParser.mul_subexpr_return mul_subexpr() throws RecognitionException {
        SqlParser.mul_subexpr_return retval = new SqlParser.mul_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOUBLE_PIPE86=null;
        SqlParser.con_subexpr_return con_subexpr85 = null;

        SqlParser.con_subexpr_return con_subexpr87 = null;


        Object DOUBLE_PIPE86_tree=null;

        try {
            // SqlParser.g:117:12: ( con_subexpr ( DOUBLE_PIPE con_subexpr )* )
            // SqlParser.g:117:14: con_subexpr ( DOUBLE_PIPE con_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_con_subexpr_in_mul_subexpr744);
            con_subexpr85=con_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, con_subexpr85.getTree());
            // SqlParser.g:117:26: ( DOUBLE_PIPE con_subexpr )*
            loop25:
            do {
                int alt25=2;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // SqlParser.g:117:27: DOUBLE_PIPE con_subexpr
            	    {
            	    DOUBLE_PIPE86=(Token)match(input,DOUBLE_PIPE,FOLLOW_DOUBLE_PIPE_in_mul_subexpr747); 
            	    DOUBLE_PIPE86_tree = (Object)adaptor.create(DOUBLE_PIPE86);
            	    root_0 = (Object)adaptor.becomeRoot(DOUBLE_PIPE86_tree, root_0);

            	    pushFollow(FOLLOW_con_subexpr_in_mul_subexpr750);
            	    con_subexpr87=con_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, con_subexpr87.getTree());

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
    // SqlParser.g:119:1: con_subexpr : ( PLUS | MINUS | TILDA | NOT )? unary_subexpr ;
    public final SqlParser.con_subexpr_return con_subexpr() throws RecognitionException {
        SqlParser.con_subexpr_return retval = new SqlParser.con_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set88=null;
        SqlParser.unary_subexpr_return unary_subexpr89 = null;


        Object set88_tree=null;

        try {
            // SqlParser.g:119:12: ( ( PLUS | MINUS | TILDA | NOT )? unary_subexpr )
            // SqlParser.g:119:14: ( PLUS | MINUS | TILDA | NOT )? unary_subexpr
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:119:14: ( PLUS | MINUS | TILDA | NOT )?
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // SqlParser.g:
                    {
                    set88=(Token)input.LT(1);
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=TILDA)||input.LA(1)==NOT ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set88));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_unary_subexpr_in_con_subexpr776);
            unary_subexpr89=unary_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, unary_subexpr89.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // SqlParser.g:121:1: unary_subexpr : atom_expr ( COLLATE collation_name= ID )? ;
    public final SqlParser.unary_subexpr_return unary_subexpr() throws RecognitionException {
        SqlParser.unary_subexpr_return retval = new SqlParser.unary_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token collation_name=null;
        Token COLLATE91=null;
        SqlParser.atom_expr_return atom_expr90 = null;


        Object collation_name_tree=null;
        Object COLLATE91_tree=null;

        try {
            // SqlParser.g:121:14: ( atom_expr ( COLLATE collation_name= ID )? )
            // SqlParser.g:121:16: atom_expr ( COLLATE collation_name= ID )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atom_expr_in_unary_subexpr783);
            atom_expr90=atom_expr();

            state._fsp--;

            adaptor.addChild(root_0, atom_expr90.getTree());
            // SqlParser.g:121:26: ( COLLATE collation_name= ID )?
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // SqlParser.g:121:27: COLLATE collation_name= ID
                    {
                    COLLATE91=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_unary_subexpr786); 
                    COLLATE91_tree = (Object)adaptor.create(COLLATE91);
                    root_0 = (Object)adaptor.becomeRoot(COLLATE91_tree, root_0);

                    collation_name=(Token)match(input,ID,FOLLOW_ID_in_unary_subexpr791); 
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
    // SqlParser.g:123:1: atom_expr : ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) | function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN | LPAREN expr RPAREN | CAST LPAREN expr AS type_name RPAREN | ( EXISTS )? LPAREN select_stmt RPAREN | CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END | raise_function );
    public final SqlParser.atom_expr_return atom_expr() throws RecognitionException {
        SqlParser.atom_expr_return retval = new SqlParser.atom_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token column_name=null;
        Token function_name=null;
        Token DOT94=null;
        Token DOT95=null;
        Token LPAREN96=null;
        Token DISTINCT97=null;
        Token COMMA98=null;
        Token ASTERISK99=null;
        Token RPAREN100=null;
        Token LPAREN101=null;
        Token RPAREN103=null;
        Token CAST104=null;
        Token LPAREN105=null;
        Token AS107=null;
        Token RPAREN109=null;
        Token EXISTS110=null;
        Token LPAREN111=null;
        Token RPAREN113=null;
        Token CASE114=null;
        Token WHEN116=null;
        Token THEN118=null;
        Token ELSE120=null;
        Token END122=null;
        List list_args=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.literal_value_return literal_value92 = null;

        SqlParser.bind_parameter_return bind_parameter93 = null;

        SqlParser.expr_return expr102 = null;

        SqlParser.expr_return expr106 = null;

        SqlParser.type_name_return type_name108 = null;

        SqlParser.select_stmt_return select_stmt112 = null;

        SqlParser.expr_return expr115 = null;

        SqlParser.expr_return expr117 = null;

        SqlParser.expr_return expr119 = null;

        SqlParser.expr_return expr121 = null;

        SqlParser.raise_function_return raise_function123 = null;

        SqlParser.expr_return args = null;
         args = null;
        Object column_name_tree=null;
        Object function_name_tree=null;
        Object DOT94_tree=null;
        Object DOT95_tree=null;
        Object LPAREN96_tree=null;
        Object DISTINCT97_tree=null;
        Object COMMA98_tree=null;
        Object ASTERISK99_tree=null;
        Object RPAREN100_tree=null;
        Object LPAREN101_tree=null;
        Object RPAREN103_tree=null;
        Object CAST104_tree=null;
        Object LPAREN105_tree=null;
        Object AS107_tree=null;
        Object RPAREN109_tree=null;
        Object EXISTS110_tree=null;
        Object LPAREN111_tree=null;
        Object RPAREN113_tree=null;
        Object CASE114_tree=null;
        Object WHEN116_tree=null;
        Object THEN118_tree=null;
        Object ELSE120_tree=null;
        Object END122_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // SqlParser.g:124:3: ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) | function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN | LPAREN expr RPAREN | CAST LPAREN expr AS type_name RPAREN | ( EXISTS )? LPAREN select_stmt RPAREN | CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END | raise_function )
            int alt37=9;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // SqlParser.g:124:5: literal_value
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_value_in_atom_expr803);
                    literal_value92=literal_value();

                    state._fsp--;

                    adaptor.addChild(root_0, literal_value92.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:125:5: bind_parameter
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_bind_parameter_in_atom_expr809);
                    bind_parameter93=bind_parameter();

                    state._fsp--;

                    adaptor.addChild(root_0, bind_parameter93.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:126:5: ( (database_name= id DOT )? table_name= id DOT )? column_name= ID
                    {
                    // SqlParser.g:126:5: ( (database_name= id DOT )? table_name= id DOT )?
                    int alt29=2;
                    alt29 = dfa29.predict(input);
                    switch (alt29) {
                        case 1 :
                            // SqlParser.g:126:6: (database_name= id DOT )? table_name= id DOT
                            {
                            // SqlParser.g:126:6: (database_name= id DOT )?
                            int alt28=2;
                            alt28 = dfa28.predict(input);
                            switch (alt28) {
                                case 1 :
                                    // SqlParser.g:126:7: database_name= id DOT
                                    {
                                    pushFollow(FOLLOW_id_in_atom_expr819);
                                    database_name=id();

                                    state._fsp--;

                                    stream_id.add(database_name.getTree());
                                    DOT94=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expr821);  
                                    stream_DOT.add(DOT94);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_id_in_atom_expr827);
                            table_name=id();

                            state._fsp--;

                            stream_id.add(table_name.getTree());
                            DOT95=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expr829);  
                            stream_DOT.add(DOT95);


                            }
                            break;

                    }

                    column_name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr835);  
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
                    // 126:65: -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) )
                    {
                        // SqlParser.g:126:68: ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMN_EXPRESSION, "COLUMN_EXPRESSION"), root_1);

                        // SqlParser.g:126:88: ^( $column_name ( ^( $table_name ( $database_name)? ) )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_column_name.nextNode(), root_2);

                        // SqlParser.g:126:103: ( ^( $table_name ( $database_name)? ) )?
                        if ( stream_database_name.hasNext()||stream_table_name.hasNext() ) {
                            // SqlParser.g:126:103: ^( $table_name ( $database_name)? )
                            {
                            Object root_3 = (Object)adaptor.nil();
                            root_3 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_3);

                            // SqlParser.g:126:117: ( $database_name)?
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
                    // SqlParser.g:127:5: function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    function_name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr864); 
                    function_name_tree = (Object)adaptor.create(function_name);
                    adaptor.addChild(root_0, function_name_tree);

                    LPAREN96=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr866); 
                    LPAREN96_tree = (Object)adaptor.create(LPAREN96);
                    adaptor.addChild(root_0, LPAREN96_tree);

                    // SqlParser.g:127:29: ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )?
                    int alt32=3;
                    alt32 = dfa32.predict(input);
                    switch (alt32) {
                        case 1 :
                            // SqlParser.g:127:30: ( DISTINCT )? args+= expr ( COMMA args+= expr )*
                            {
                            // SqlParser.g:127:30: ( DISTINCT )?
                            int alt30=2;
                            alt30 = dfa30.predict(input);
                            switch (alt30) {
                                case 1 :
                                    // SqlParser.g:127:31: DISTINCT
                                    {
                                    DISTINCT97=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_atom_expr870); 
                                    DISTINCT97_tree = (Object)adaptor.create(DISTINCT97);
                                    adaptor.addChild(root_0, DISTINCT97_tree);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_expr_in_atom_expr876);
                            args=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, args.getTree());
                            if (list_args==null) list_args=new ArrayList();
                            list_args.add(args.getTree());

                            // SqlParser.g:127:53: ( COMMA args+= expr )*
                            loop31:
                            do {
                                int alt31=2;
                                int LA31_0 = input.LA(1);

                                if ( (LA31_0==COMMA) ) {
                                    alt31=1;
                                }


                                switch (alt31) {
                            	case 1 :
                            	    // SqlParser.g:127:54: COMMA args+= expr
                            	    {
                            	    COMMA98=(Token)match(input,COMMA,FOLLOW_COMMA_in_atom_expr879); 
                            	    COMMA98_tree = (Object)adaptor.create(COMMA98);
                            	    adaptor.addChild(root_0, COMMA98_tree);

                            	    pushFollow(FOLLOW_expr_in_atom_expr883);
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
                            // SqlParser.g:127:75: ASTERISK
                            {
                            ASTERISK99=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_atom_expr889); 
                            ASTERISK99_tree = (Object)adaptor.create(ASTERISK99);
                            adaptor.addChild(root_0, ASTERISK99_tree);


                            }
                            break;

                    }

                    RPAREN100=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr893); 
                    RPAREN100_tree = (Object)adaptor.create(RPAREN100);
                    adaptor.addChild(root_0, RPAREN100_tree);


                    }
                    break;
                case 5 :
                    // SqlParser.g:128:5: LPAREN expr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN101=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr899); 
                    pushFollow(FOLLOW_expr_in_atom_expr902);
                    expr102=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr102.getTree());
                    RPAREN103=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr904); 

                    }
                    break;
                case 6 :
                    // SqlParser.g:129:5: CAST LPAREN expr AS type_name RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    CAST104=(Token)match(input,CAST,FOLLOW_CAST_in_atom_expr911); 
                    CAST104_tree = (Object)adaptor.create(CAST104);
                    adaptor.addChild(root_0, CAST104_tree);

                    LPAREN105=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr913); 
                    LPAREN105_tree = (Object)adaptor.create(LPAREN105);
                    adaptor.addChild(root_0, LPAREN105_tree);

                    pushFollow(FOLLOW_expr_in_atom_expr915);
                    expr106=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr106.getTree());
                    AS107=(Token)match(input,AS,FOLLOW_AS_in_atom_expr917); 
                    AS107_tree = (Object)adaptor.create(AS107);
                    adaptor.addChild(root_0, AS107_tree);

                    pushFollow(FOLLOW_type_name_in_atom_expr919);
                    type_name108=type_name();

                    state._fsp--;

                    adaptor.addChild(root_0, type_name108.getTree());
                    RPAREN109=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr921); 
                    RPAREN109_tree = (Object)adaptor.create(RPAREN109);
                    adaptor.addChild(root_0, RPAREN109_tree);


                    }
                    break;
                case 7 :
                    // SqlParser.g:130:5: ( EXISTS )? LPAREN select_stmt RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:130:5: ( EXISTS )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==EXISTS) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // SqlParser.g:130:53: EXISTS
                            {
                            EXISTS110=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_atom_expr930); 
                            EXISTS110_tree = (Object)adaptor.create(EXISTS110);
                            adaptor.addChild(root_0, EXISTS110_tree);


                            }
                            break;

                    }

                    LPAREN111=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr934); 
                    LPAREN111_tree = (Object)adaptor.create(LPAREN111);
                    adaptor.addChild(root_0, LPAREN111_tree);

                    pushFollow(FOLLOW_select_stmt_in_atom_expr936);
                    select_stmt112=select_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, select_stmt112.getTree());
                    RPAREN113=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr938); 
                    RPAREN113_tree = (Object)adaptor.create(RPAREN113);
                    adaptor.addChild(root_0, RPAREN113_tree);


                    }
                    break;
                case 8 :
                    // SqlParser.g:131:5: CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END
                    {
                    root_0 = (Object)adaptor.nil();

                    CASE114=(Token)match(input,CASE,FOLLOW_CASE_in_atom_expr944); 
                    CASE114_tree = (Object)adaptor.create(CASE114);
                    adaptor.addChild(root_0, CASE114_tree);

                    // SqlParser.g:131:10: ( expr )?
                    int alt34=2;
                    alt34 = dfa34.predict(input);
                    switch (alt34) {
                        case 1 :
                            // SqlParser.g:131:11: expr
                            {
                            pushFollow(FOLLOW_expr_in_atom_expr947);
                            expr115=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr115.getTree());

                            }
                            break;

                    }

                    // SqlParser.g:131:18: ( WHEN expr THEN expr )+
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
                    	    // SqlParser.g:131:19: WHEN expr THEN expr
                    	    {
                    	    WHEN116=(Token)match(input,WHEN,FOLLOW_WHEN_in_atom_expr952); 
                    	    WHEN116_tree = (Object)adaptor.create(WHEN116);
                    	    adaptor.addChild(root_0, WHEN116_tree);

                    	    pushFollow(FOLLOW_expr_in_atom_expr954);
                    	    expr117=expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expr117.getTree());
                    	    THEN118=(Token)match(input,THEN,FOLLOW_THEN_in_atom_expr956); 
                    	    THEN118_tree = (Object)adaptor.create(THEN118);
                    	    adaptor.addChild(root_0, THEN118_tree);

                    	    pushFollow(FOLLOW_expr_in_atom_expr958);
                    	    expr119=expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expr119.getTree());

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

                    // SqlParser.g:131:41: ( ELSE expr )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==ELSE) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // SqlParser.g:131:42: ELSE expr
                            {
                            ELSE120=(Token)match(input,ELSE,FOLLOW_ELSE_in_atom_expr963); 
                            ELSE120_tree = (Object)adaptor.create(ELSE120);
                            adaptor.addChild(root_0, ELSE120_tree);

                            pushFollow(FOLLOW_expr_in_atom_expr965);
                            expr121=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr121.getTree());

                            }
                            break;

                    }

                    END122=(Token)match(input,END,FOLLOW_END_in_atom_expr969); 
                    END122_tree = (Object)adaptor.create(END122);
                    adaptor.addChild(root_0, END122_tree);


                    }
                    break;
                case 9 :
                    // SqlParser.g:132:5: raise_function
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_raise_function_in_atom_expr975);
                    raise_function123=raise_function();

                    state._fsp--;

                    adaptor.addChild(root_0, raise_function123.getTree());

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
    // SqlParser.g:135:1: literal_value : ( INTEGER -> ^( INTEGER_LITERAL INTEGER ) | FLOAT -> ^( FLOAT_LITERAL FLOAT ) | STRING -> ^( STRING_LITERAL STRING ) | BLOB -> ^( BLOB_LITERAL BLOB ) | NULL | CURRENT_TIME -> ^( FUNCTION_LITERAL CURRENT_TIME ) | CURRENT_DATE -> ^( FUNCTION_LITERAL CURRENT_DATE ) | CURRENT_TIMESTAMP -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP ) );
    public final SqlParser.literal_value_return literal_value() throws RecognitionException {
        SqlParser.literal_value_return retval = new SqlParser.literal_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INTEGER124=null;
        Token FLOAT125=null;
        Token STRING126=null;
        Token BLOB127=null;
        Token NULL128=null;
        Token CURRENT_TIME129=null;
        Token CURRENT_DATE130=null;
        Token CURRENT_TIMESTAMP131=null;

        Object INTEGER124_tree=null;
        Object FLOAT125_tree=null;
        Object STRING126_tree=null;
        Object BLOB127_tree=null;
        Object NULL128_tree=null;
        Object CURRENT_TIME129_tree=null;
        Object CURRENT_DATE130_tree=null;
        Object CURRENT_TIMESTAMP131_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_BLOB=new RewriteRuleTokenStream(adaptor,"token BLOB");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_CURRENT_TIMESTAMP=new RewriteRuleTokenStream(adaptor,"token CURRENT_TIMESTAMP");
        RewriteRuleTokenStream stream_CURRENT_DATE=new RewriteRuleTokenStream(adaptor,"token CURRENT_DATE");
        RewriteRuleTokenStream stream_CURRENT_TIME=new RewriteRuleTokenStream(adaptor,"token CURRENT_TIME");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // SqlParser.g:136:3: ( INTEGER -> ^( INTEGER_LITERAL INTEGER ) | FLOAT -> ^( FLOAT_LITERAL FLOAT ) | STRING -> ^( STRING_LITERAL STRING ) | BLOB -> ^( BLOB_LITERAL BLOB ) | NULL | CURRENT_TIME -> ^( FUNCTION_LITERAL CURRENT_TIME ) | CURRENT_DATE -> ^( FUNCTION_LITERAL CURRENT_DATE ) | CURRENT_TIMESTAMP -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP ) )
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
                    // SqlParser.g:136:5: INTEGER
                    {
                    INTEGER124=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_literal_value988);  
                    stream_INTEGER.add(INTEGER124);



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
                    // 136:13: -> ^( INTEGER_LITERAL INTEGER )
                    {
                        // SqlParser.g:136:16: ^( INTEGER_LITERAL INTEGER )
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
                    // SqlParser.g:137:5: FLOAT
                    {
                    FLOAT125=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_literal_value1002);  
                    stream_FLOAT.add(FLOAT125);



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
                    // 137:11: -> ^( FLOAT_LITERAL FLOAT )
                    {
                        // SqlParser.g:137:14: ^( FLOAT_LITERAL FLOAT )
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
                    // SqlParser.g:138:5: STRING
                    {
                    STRING126=(Token)match(input,STRING,FOLLOW_STRING_in_literal_value1016);  
                    stream_STRING.add(STRING126);



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
                    // 138:12: -> ^( STRING_LITERAL STRING )
                    {
                        // SqlParser.g:138:15: ^( STRING_LITERAL STRING )
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
                    // SqlParser.g:139:5: BLOB
                    {
                    BLOB127=(Token)match(input,BLOB,FOLLOW_BLOB_in_literal_value1030);  
                    stream_BLOB.add(BLOB127);



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
                    // 139:10: -> ^( BLOB_LITERAL BLOB )
                    {
                        // SqlParser.g:139:13: ^( BLOB_LITERAL BLOB )
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
                    // SqlParser.g:140:5: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL128=(Token)match(input,NULL,FOLLOW_NULL_in_literal_value1044); 
                    NULL128_tree = (Object)adaptor.create(NULL128);
                    adaptor.addChild(root_0, NULL128_tree);


                    }
                    break;
                case 6 :
                    // SqlParser.g:141:5: CURRENT_TIME
                    {
                    CURRENT_TIME129=(Token)match(input,CURRENT_TIME,FOLLOW_CURRENT_TIME_in_literal_value1050);  
                    stream_CURRENT_TIME.add(CURRENT_TIME129);



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
                    // 141:18: -> ^( FUNCTION_LITERAL CURRENT_TIME )
                    {
                        // SqlParser.g:141:21: ^( FUNCTION_LITERAL CURRENT_TIME )
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
                    // SqlParser.g:142:5: CURRENT_DATE
                    {
                    CURRENT_DATE130=(Token)match(input,CURRENT_DATE,FOLLOW_CURRENT_DATE_in_literal_value1064);  
                    stream_CURRENT_DATE.add(CURRENT_DATE130);



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
                    // 142:18: -> ^( FUNCTION_LITERAL CURRENT_DATE )
                    {
                        // SqlParser.g:142:21: ^( FUNCTION_LITERAL CURRENT_DATE )
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
                    // SqlParser.g:143:5: CURRENT_TIMESTAMP
                    {
                    CURRENT_TIMESTAMP131=(Token)match(input,CURRENT_TIMESTAMP,FOLLOW_CURRENT_TIMESTAMP_in_literal_value1078);  
                    stream_CURRENT_TIMESTAMP.add(CURRENT_TIMESTAMP131);



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
                    // 143:23: -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP )
                    {
                        // SqlParser.g:143:26: ^( FUNCTION_LITERAL CURRENT_TIMESTAMP )
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
    // SqlParser.g:146:1: bind_parameter : ( QUESTION -> BIND | QUESTION position= INTEGER -> ^( BIND $position) | COLON name= id -> ^( BIND_NAME $name) | AT name= id -> ^( BIND_NAME $name) );
    public final SqlParser.bind_parameter_return bind_parameter() throws RecognitionException {
        SqlParser.bind_parameter_return retval = new SqlParser.bind_parameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token position=null;
        Token QUESTION132=null;
        Token QUESTION133=null;
        Token COLON134=null;
        Token AT135=null;
        SqlParser.id_return name = null;


        Object position_tree=null;
        Object QUESTION132_tree=null;
        Object QUESTION133_tree=null;
        Object COLON134_tree=null;
        Object AT135_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // SqlParser.g:147:3: ( QUESTION -> BIND | QUESTION position= INTEGER -> ^( BIND $position) | COLON name= id -> ^( BIND_NAME $name) | AT name= id -> ^( BIND_NAME $name) )
            int alt39=4;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // SqlParser.g:147:5: QUESTION
                    {
                    QUESTION132=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_bind_parameter1099);  
                    stream_QUESTION.add(QUESTION132);



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
                    // 147:14: -> BIND
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(BIND, "BIND"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // SqlParser.g:148:5: QUESTION position= INTEGER
                    {
                    QUESTION133=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_bind_parameter1109);  
                    stream_QUESTION.add(QUESTION133);

                    position=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_bind_parameter1113);  
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
                    // 148:31: -> ^( BIND $position)
                    {
                        // SqlParser.g:148:34: ^( BIND $position)
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
                    // SqlParser.g:149:5: COLON name= id
                    {
                    COLON134=(Token)match(input,COLON,FOLLOW_COLON_in_bind_parameter1128);  
                    stream_COLON.add(COLON134);

                    pushFollow(FOLLOW_id_in_bind_parameter1132);
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
                    // 149:19: -> ^( BIND_NAME $name)
                    {
                        // SqlParser.g:149:22: ^( BIND_NAME $name)
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
                    // SqlParser.g:150:5: AT name= id
                    {
                    AT135=(Token)match(input,AT,FOLLOW_AT_in_bind_parameter1147);  
                    stream_AT.add(AT135);

                    pushFollow(FOLLOW_id_in_bind_parameter1151);
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
                    // 150:16: -> ^( BIND_NAME $name)
                    {
                        // SqlParser.g:150:19: ^( BIND_NAME $name)
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
    // SqlParser.g:154:1: raise_function : RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN ;
    public final SqlParser.raise_function_return raise_function() throws RecognitionException {
        SqlParser.raise_function_return retval = new SqlParser.raise_function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token error_message=null;
        Token RAISE136=null;
        Token LPAREN137=null;
        Token IGNORE138=null;
        Token set139=null;
        Token COMMA140=null;
        Token RPAREN141=null;

        Object error_message_tree=null;
        Object RAISE136_tree=null;
        Object LPAREN137_tree=null;
        Object IGNORE138_tree=null;
        Object set139_tree=null;
        Object COMMA140_tree=null;
        Object RPAREN141_tree=null;

        try {
            // SqlParser.g:154:15: ( RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN )
            // SqlParser.g:154:17: RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN
            {
            root_0 = (Object)adaptor.nil();

            RAISE136=(Token)match(input,RAISE,FOLLOW_RAISE_in_raise_function1171); 
            RAISE136_tree = (Object)adaptor.create(RAISE136);
            root_0 = (Object)adaptor.becomeRoot(RAISE136_tree, root_0);

            LPAREN137=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_raise_function1174); 
            // SqlParser.g:154:32: ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING )
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
                    // SqlParser.g:154:33: IGNORE
                    {
                    IGNORE138=(Token)match(input,IGNORE,FOLLOW_IGNORE_in_raise_function1178); 
                    IGNORE138_tree = (Object)adaptor.create(IGNORE138);
                    adaptor.addChild(root_0, IGNORE138_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:154:42: ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING
                    {
                    set139=(Token)input.LT(1);
                    if ( input.LA(1)==ABORT||input.LA(1)==FAIL||input.LA(1)==ROLLBACK ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set139));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    COMMA140=(Token)match(input,COMMA,FOLLOW_COMMA_in_raise_function1194); 
                    error_message=(Token)match(input,STRING,FOLLOW_STRING_in_raise_function1199); 
                    error_message_tree = (Object)adaptor.create(error_message);
                    adaptor.addChild(root_0, error_message_tree);


                    }
                    break;

            }

            RPAREN141=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_raise_function1202); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // SqlParser.g:156:1: type_name : (names+= ID )+ ( LPAREN size1= SIGNED_NUMBER ( COMMA size2= SIGNED_NUMBER )? RPAREN )? -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ ) ;
    public final SqlParser.type_name_return type_name() throws RecognitionException {
        SqlParser.type_name_return retval = new SqlParser.type_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token size1=null;
        Token size2=null;
        Token LPAREN142=null;
        Token COMMA143=null;
        Token RPAREN144=null;
        Token names=null;
        List list_names=null;

        Object size1_tree=null;
        Object size2_tree=null;
        Object LPAREN142_tree=null;
        Object COMMA143_tree=null;
        Object RPAREN144_tree=null;
        Object names_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_SIGNED_NUMBER=new RewriteRuleTokenStream(adaptor,"token SIGNED_NUMBER");

        try {
            // SqlParser.g:156:10: ( (names+= ID )+ ( LPAREN size1= SIGNED_NUMBER ( COMMA size2= SIGNED_NUMBER )? RPAREN )? -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ ) )
            // SqlParser.g:156:12: (names+= ID )+ ( LPAREN size1= SIGNED_NUMBER ( COMMA size2= SIGNED_NUMBER )? RPAREN )?
            {
            // SqlParser.g:156:17: (names+= ID )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                alt41 = dfa41.predict(input);
                switch (alt41) {
            	case 1 :
            	    // SqlParser.g:156:17: names+= ID
            	    {
            	    names=(Token)match(input,ID,FOLLOW_ID_in_type_name1212);  
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

            // SqlParser.g:156:23: ( LPAREN size1= SIGNED_NUMBER ( COMMA size2= SIGNED_NUMBER )? RPAREN )?
            int alt43=2;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // SqlParser.g:156:24: LPAREN size1= SIGNED_NUMBER ( COMMA size2= SIGNED_NUMBER )? RPAREN
                    {
                    LPAREN142=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_type_name1216);  
                    stream_LPAREN.add(LPAREN142);

                    size1=(Token)match(input,SIGNED_NUMBER,FOLLOW_SIGNED_NUMBER_in_type_name1220);  
                    stream_SIGNED_NUMBER.add(size1);

                    // SqlParser.g:156:51: ( COMMA size2= SIGNED_NUMBER )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==COMMA) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // SqlParser.g:156:52: COMMA size2= SIGNED_NUMBER
                            {
                            COMMA143=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_name1223);  
                            stream_COMMA.add(COMMA143);

                            size2=(Token)match(input,SIGNED_NUMBER,FOLLOW_SIGNED_NUMBER_in_type_name1227);  
                            stream_SIGNED_NUMBER.add(size2);


                            }
                            break;

                    }

                    RPAREN144=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_type_name1231);  
                    stream_RPAREN.add(RPAREN144);


                    }
                    break;

            }



            // AST REWRITE
            // elements: names, size2, size1
            // token labels: size2, size1
            // rule labels: retval
            // token list labels: names
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_size2=new RewriteRuleTokenStream(adaptor,"token size2",size2);
            RewriteRuleTokenStream stream_size1=new RewriteRuleTokenStream(adaptor,"token size1",size1);
            RewriteRuleTokenStream stream_names=new RewriteRuleTokenStream(adaptor,"token names", list_names);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 157:1: -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ )
            {
                // SqlParser.g:157:4: ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_1);

                // SqlParser.g:157:11: ^( TYPE_PARAMS ( $size1)? ( $size2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE_PARAMS, "TYPE_PARAMS"), root_2);

                // SqlParser.g:157:25: ( $size1)?
                if ( stream_size1.hasNext() ) {
                    adaptor.addChild(root_2, stream_size1.nextNode());

                }
                stream_size1.reset();
                // SqlParser.g:157:33: ( $size2)?
                if ( stream_size2.hasNext() ) {
                    adaptor.addChild(root_2, stream_size2.nextNode());

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
    // SqlParser.g:160:1: pragma_stmt : PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )? ;
    public final SqlParser.pragma_stmt_return pragma_stmt() throws RecognitionException {
        SqlParser.pragma_stmt_return retval = new SqlParser.pragma_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRAGMA145=null;
        Token DOT146=null;
        Token EQUALS147=null;
        Token LPAREN149=null;
        Token RPAREN151=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return pragma_name = null;

        SqlParser.pragma_value_return pragma_value148 = null;

        SqlParser.pragma_value_return pragma_value150 = null;


        Object PRAGMA145_tree=null;
        Object DOT146_tree=null;
        Object EQUALS147_tree=null;
        Object LPAREN149_tree=null;
        Object RPAREN151_tree=null;

        try {
            // SqlParser.g:160:12: ( PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )? )
            // SqlParser.g:160:14: PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            PRAGMA145=(Token)match(input,PRAGMA,FOLLOW_PRAGMA_in_pragma_stmt1263); 
            PRAGMA145_tree = (Object)adaptor.create(PRAGMA145);
            adaptor.addChild(root_0, PRAGMA145_tree);

            // SqlParser.g:160:21: (database_name= id DOT )?
            int alt44=2;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // SqlParser.g:160:22: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_pragma_stmt1268);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT146=(Token)match(input,DOT,FOLLOW_DOT_in_pragma_stmt1270); 
                    DOT146_tree = (Object)adaptor.create(DOT146);
                    adaptor.addChild(root_0, DOT146_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_pragma_stmt1276);
            pragma_name=id();

            state._fsp--;

            adaptor.addChild(root_0, pragma_name.getTree());
            // SqlParser.g:160:60: ( EQUALS pragma_value | LPAREN pragma_value RPAREN )?
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
                    // SqlParser.g:160:61: EQUALS pragma_value
                    {
                    EQUALS147=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_pragma_stmt1279); 
                    EQUALS147_tree = (Object)adaptor.create(EQUALS147);
                    adaptor.addChild(root_0, EQUALS147_tree);

                    pushFollow(FOLLOW_pragma_value_in_pragma_stmt1281);
                    pragma_value148=pragma_value();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_value148.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:160:83: LPAREN pragma_value RPAREN
                    {
                    LPAREN149=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_pragma_stmt1285); 
                    LPAREN149_tree = (Object)adaptor.create(LPAREN149);
                    adaptor.addChild(root_0, LPAREN149_tree);

                    pushFollow(FOLLOW_pragma_value_in_pragma_stmt1287);
                    pragma_value150=pragma_value();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_value150.getTree());
                    RPAREN151=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_pragma_stmt1289); 
                    RPAREN151_tree = (Object)adaptor.create(RPAREN151);
                    adaptor.addChild(root_0, RPAREN151_tree);


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
    // SqlParser.g:162:1: pragma_value : ( SIGNED_NUMBER | name= id | STRING );
    public final SqlParser.pragma_value_return pragma_value() throws RecognitionException {
        SqlParser.pragma_value_return retval = new SqlParser.pragma_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SIGNED_NUMBER152=null;
        Token STRING153=null;
        SqlParser.id_return name = null;


        Object SIGNED_NUMBER152_tree=null;
        Object STRING153_tree=null;

        try {
            // SqlParser.g:162:13: ( SIGNED_NUMBER | name= id | STRING )
            int alt46=3;
            switch ( input.LA(1) ) {
            case SIGNED_NUMBER:
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
                    // SqlParser.g:162:15: SIGNED_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    SIGNED_NUMBER152=(Token)match(input,SIGNED_NUMBER,FOLLOW_SIGNED_NUMBER_in_pragma_value1298); 
                    SIGNED_NUMBER152_tree = (Object)adaptor.create(SIGNED_NUMBER152);
                    adaptor.addChild(root_0, SIGNED_NUMBER152_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:162:31: name= id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_in_pragma_value1304);
                    name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, name.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:162:41: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING153=(Token)match(input,STRING,FOLLOW_STRING_in_pragma_value1308); 
                    STRING153_tree = (Object)adaptor.create(STRING153);
                    adaptor.addChild(root_0, STRING153_tree);


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
    // SqlParser.g:165:1: attach_stmt : ATTACH ( DATABASE )? filename= ( STRING | id ) AS database_name= id ;
    public final SqlParser.attach_stmt_return attach_stmt() throws RecognitionException {
        SqlParser.attach_stmt_return retval = new SqlParser.attach_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token filename=null;
        Token ATTACH154=null;
        Token DATABASE155=null;
        Token STRING156=null;
        Token AS158=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return id157 = null;


        Object filename_tree=null;
        Object ATTACH154_tree=null;
        Object DATABASE155_tree=null;
        Object STRING156_tree=null;
        Object AS158_tree=null;

        try {
            // SqlParser.g:165:12: ( ATTACH ( DATABASE )? filename= ( STRING | id ) AS database_name= id )
            // SqlParser.g:165:14: ATTACH ( DATABASE )? filename= ( STRING | id ) AS database_name= id
            {
            root_0 = (Object)adaptor.nil();

            ATTACH154=(Token)match(input,ATTACH,FOLLOW_ATTACH_in_attach_stmt1316); 
            ATTACH154_tree = (Object)adaptor.create(ATTACH154);
            adaptor.addChild(root_0, ATTACH154_tree);

            // SqlParser.g:165:21: ( DATABASE )?
            int alt47=2;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // SqlParser.g:165:22: DATABASE
                    {
                    DATABASE155=(Token)match(input,DATABASE,FOLLOW_DATABASE_in_attach_stmt1319); 
                    DATABASE155_tree = (Object)adaptor.create(DATABASE155);
                    adaptor.addChild(root_0, DATABASE155_tree);


                    }
                    break;

            }

            // SqlParser.g:165:42: ( STRING | id )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==STRING) ) {
                alt48=1;
            }
            else if ( ((LA48_0>=ABORT && LA48_0<=WHERE)||LA48_0==ID) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // SqlParser.g:165:43: STRING
                    {
                    STRING156=(Token)match(input,STRING,FOLLOW_STRING_in_attach_stmt1326); 
                    STRING156_tree = (Object)adaptor.create(STRING156);
                    adaptor.addChild(root_0, STRING156_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:165:52: id
                    {
                    pushFollow(FOLLOW_id_in_attach_stmt1330);
                    id157=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id157.getTree());

                    }
                    break;

            }

            AS158=(Token)match(input,AS,FOLLOW_AS_in_attach_stmt1333); 
            AS158_tree = (Object)adaptor.create(AS158);
            adaptor.addChild(root_0, AS158_tree);

            pushFollow(FOLLOW_id_in_attach_stmt1337);
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
    // SqlParser.g:168:1: detach_stmt : DETACH ( DATABASE )? database_name= id ;
    public final SqlParser.detach_stmt_return detach_stmt() throws RecognitionException {
        SqlParser.detach_stmt_return retval = new SqlParser.detach_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DETACH159=null;
        Token DATABASE160=null;
        SqlParser.id_return database_name = null;


        Object DETACH159_tree=null;
        Object DATABASE160_tree=null;

        try {
            // SqlParser.g:168:12: ( DETACH ( DATABASE )? database_name= id )
            // SqlParser.g:168:14: DETACH ( DATABASE )? database_name= id
            {
            root_0 = (Object)adaptor.nil();

            DETACH159=(Token)match(input,DETACH,FOLLOW_DETACH_in_detach_stmt1345); 
            DETACH159_tree = (Object)adaptor.create(DETACH159);
            adaptor.addChild(root_0, DETACH159_tree);

            // SqlParser.g:168:21: ( DATABASE )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==DATABASE) ) {
                int LA49_1 = input.LA(2);

                if ( ((LA49_1>=ABORT && LA49_1<=WHERE)||LA49_1==ID) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // SqlParser.g:168:22: DATABASE
                    {
                    DATABASE160=(Token)match(input,DATABASE,FOLLOW_DATABASE_in_detach_stmt1348); 
                    DATABASE160_tree = (Object)adaptor.create(DATABASE160);
                    adaptor.addChild(root_0, DATABASE160_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_detach_stmt1354);
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
    // SqlParser.g:171:1: analyze_stmt : ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )? ;
    public final SqlParser.analyze_stmt_return analyze_stmt() throws RecognitionException {
        SqlParser.analyze_stmt_return retval = new SqlParser.analyze_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ANALYZE161=null;
        Token DOT162=null;
        SqlParser.id_return database_or_table_name = null;

        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;


        Object ANALYZE161_tree=null;
        Object DOT162_tree=null;

        try {
            // SqlParser.g:171:13: ( ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )? )
            // SqlParser.g:171:15: ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )?
            {
            root_0 = (Object)adaptor.nil();

            ANALYZE161=(Token)match(input,ANALYZE,FOLLOW_ANALYZE_in_analyze_stmt1362); 
            ANALYZE161_tree = (Object)adaptor.create(ANALYZE161);
            adaptor.addChild(root_0, ANALYZE161_tree);

            // SqlParser.g:171:23: (database_or_table_name= id | database_name= id DOT table_name= id )?
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
            else if ( ((LA50_0>=ABORT && LA50_0<=WHERE)) ) {
                int LA50_2 = input.LA(2);

                if ( (LA50_2==DOT) ) {
                    alt50=2;
                }
                else if ( (LA50_2==SEMI) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // SqlParser.g:171:24: database_or_table_name= id
                    {
                    pushFollow(FOLLOW_id_in_analyze_stmt1367);
                    database_or_table_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_or_table_name.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:171:52: database_name= id DOT table_name= id
                    {
                    pushFollow(FOLLOW_id_in_analyze_stmt1373);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT162=(Token)match(input,DOT,FOLLOW_DOT_in_analyze_stmt1375); 
                    DOT162_tree = (Object)adaptor.create(DOT162);
                    adaptor.addChild(root_0, DOT162_tree);

                    pushFollow(FOLLOW_id_in_analyze_stmt1379);
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
    // SqlParser.g:174:1: reindex_stmt : REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id ;
    public final SqlParser.reindex_stmt_return reindex_stmt() throws RecognitionException {
        SqlParser.reindex_stmt_return retval = new SqlParser.reindex_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REINDEX163=null;
        Token DOT164=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return collation_or_table_or_index_name = null;


        Object REINDEX163_tree=null;
        Object DOT164_tree=null;

        try {
            // SqlParser.g:174:13: ( REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id )
            // SqlParser.g:174:15: REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id
            {
            root_0 = (Object)adaptor.nil();

            REINDEX163=(Token)match(input,REINDEX,FOLLOW_REINDEX_in_reindex_stmt1389); 
            REINDEX163_tree = (Object)adaptor.create(REINDEX163);
            adaptor.addChild(root_0, REINDEX163_tree);

            // SqlParser.g:174:23: (database_name= id DOT )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==ID) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==DOT) ) {
                    alt51=1;
                }
            }
            else if ( ((LA51_0>=ABORT && LA51_0<=WHERE)) ) {
                int LA51_2 = input.LA(2);

                if ( (LA51_2==DOT) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // SqlParser.g:174:24: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_reindex_stmt1394);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT164=(Token)match(input,DOT,FOLLOW_DOT_in_reindex_stmt1396); 
                    DOT164_tree = (Object)adaptor.create(DOT164);
                    adaptor.addChild(root_0, DOT164_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_reindex_stmt1402);
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
    // SqlParser.g:177:1: vacuum_stmt : VACUUM ;
    public final SqlParser.vacuum_stmt_return vacuum_stmt() throws RecognitionException {
        SqlParser.vacuum_stmt_return retval = new SqlParser.vacuum_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VACUUM165=null;

        Object VACUUM165_tree=null;

        try {
            // SqlParser.g:177:12: ( VACUUM )
            // SqlParser.g:177:14: VACUUM
            {
            root_0 = (Object)adaptor.nil();

            VACUUM165=(Token)match(input,VACUUM,FOLLOW_VACUUM_in_vacuum_stmt1410); 
            VACUUM165_tree = (Object)adaptor.create(VACUUM165);
            adaptor.addChild(root_0, VACUUM165_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // SqlParser.g:183:1: operation_conflict_clause : OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) ;
    public final SqlParser.operation_conflict_clause_return operation_conflict_clause() throws RecognitionException {
        SqlParser.operation_conflict_clause_return retval = new SqlParser.operation_conflict_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR166=null;
        Token set167=null;

        Object OR166_tree=null;
        Object set167_tree=null;

        try {
            // SqlParser.g:183:26: ( OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) )
            // SqlParser.g:183:28: OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE )
            {
            root_0 = (Object)adaptor.nil();

            OR166=(Token)match(input,OR,FOLLOW_OR_in_operation_conflict_clause1421); 
            OR166_tree = (Object)adaptor.create(OR166);
            adaptor.addChild(root_0, OR166_tree);

            set167=(Token)input.LT(1);
            if ( input.LA(1)==ABORT||input.LA(1)==FAIL||input.LA(1)==IGNORE||input.LA(1)==REPLACE||input.LA(1)==ROLLBACK ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set167));
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
    // SqlParser.g:185:1: ordering_term : expr ( ASC | DESC )? -> ^( ORDERING expr ( ASC )? ( DESC )? ) ;
    public final SqlParser.ordering_term_return ordering_term() throws RecognitionException {
        SqlParser.ordering_term_return retval = new SqlParser.ordering_term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASC169=null;
        Token DESC170=null;
        SqlParser.expr_return expr168 = null;


        Object ASC169_tree=null;
        Object DESC170_tree=null;
        RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");
        RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // SqlParser.g:185:14: ( expr ( ASC | DESC )? -> ^( ORDERING expr ( ASC )? ( DESC )? ) )
            // SqlParser.g:185:16: expr ( ASC | DESC )?
            {
            pushFollow(FOLLOW_expr_in_ordering_term1448);
            expr168=expr();

            state._fsp--;

            stream_expr.add(expr168.getTree());
            // SqlParser.g:185:82: ( ASC | DESC )?
            int alt52=3;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // SqlParser.g:185:83: ASC
                    {
                    ASC169=(Token)match(input,ASC,FOLLOW_ASC_in_ordering_term1453);  
                    stream_ASC.add(ASC169);


                    }
                    break;
                case 2 :
                    // SqlParser.g:185:89: DESC
                    {
                    DESC170=(Token)match(input,DESC,FOLLOW_DESC_in_ordering_term1457);  
                    stream_DESC.add(DESC170);


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
            // 186:1: -> ^( ORDERING expr ( ASC )? ( DESC )? )
            {
                // SqlParser.g:186:4: ^( ORDERING expr ( ASC )? ( DESC )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ORDERING, "ORDERING"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                // SqlParser.g:186:20: ( ASC )?
                if ( stream_ASC.hasNext() ) {
                    adaptor.addChild(root_1, stream_ASC.nextNode());

                }
                stream_ASC.reset();
                // SqlParser.g:186:27: ( DESC )?
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
    // SqlParser.g:188:1: operation_limited_clause : ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? ;
    public final SqlParser.operation_limited_clause_return operation_limited_clause() throws RecognitionException {
        SqlParser.operation_limited_clause_return retval = new SqlParser.operation_limited_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token limit=null;
        Token offset=null;
        Token ORDER171=null;
        Token BY172=null;
        Token COMMA174=null;
        Token LIMIT176=null;
        Token set177=null;
        SqlParser.ordering_term_return ordering_term173 = null;

        SqlParser.ordering_term_return ordering_term175 = null;


        Object limit_tree=null;
        Object offset_tree=null;
        Object ORDER171_tree=null;
        Object BY172_tree=null;
        Object COMMA174_tree=null;
        Object LIMIT176_tree=null;
        Object set177_tree=null;

        try {
            // SqlParser.g:188:25: ( ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )
            // SqlParser.g:189:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )?
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:189:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==ORDER) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // SqlParser.g:189:4: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                    ORDER171=(Token)match(input,ORDER,FOLLOW_ORDER_in_operation_limited_clause1487); 
                    ORDER171_tree = (Object)adaptor.create(ORDER171);
                    adaptor.addChild(root_0, ORDER171_tree);

                    BY172=(Token)match(input,BY,FOLLOW_BY_in_operation_limited_clause1489); 
                    BY172_tree = (Object)adaptor.create(BY172);
                    adaptor.addChild(root_0, BY172_tree);

                    pushFollow(FOLLOW_ordering_term_in_operation_limited_clause1491);
                    ordering_term173=ordering_term();

                    state._fsp--;

                    adaptor.addChild(root_0, ordering_term173.getTree());
                    // SqlParser.g:189:27: ( COMMA ordering_term )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==COMMA) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // SqlParser.g:189:28: COMMA ordering_term
                    	    {
                    	    COMMA174=(Token)match(input,COMMA,FOLLOW_COMMA_in_operation_limited_clause1494); 
                    	    COMMA174_tree = (Object)adaptor.create(COMMA174);
                    	    adaptor.addChild(root_0, COMMA174_tree);

                    	    pushFollow(FOLLOW_ordering_term_in_operation_limited_clause1496);
                    	    ordering_term175=ordering_term();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, ordering_term175.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);


                    }
                    break;

            }

            LIMIT176=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_operation_limited_clause1504); 
            LIMIT176_tree = (Object)adaptor.create(LIMIT176);
            adaptor.addChild(root_0, LIMIT176_tree);

            limit=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation_limited_clause1508); 
            limit_tree = (Object)adaptor.create(limit);
            adaptor.addChild(root_0, limit_tree);

            // SqlParser.g:190:23: ( ( OFFSET | COMMA ) offset= INTEGER )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==COMMA||LA55_0==OFFSET) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // SqlParser.g:190:24: ( OFFSET | COMMA ) offset= INTEGER
                    {
                    set177=(Token)input.LT(1);
                    if ( input.LA(1)==COMMA||input.LA(1)==OFFSET ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set177));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    offset=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation_limited_clause1521); 
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
    // SqlParser.g:193:1: select_stmt : select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )? -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? ) ;
    public final SqlParser.select_stmt_return select_stmt() throws RecognitionException {
        SqlParser.select_stmt_return retval = new SqlParser.select_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token limit=null;
        Token offset=null;
        Token ORDER179=null;
        Token BY180=null;
        Token COMMA182=null;
        Token LIMIT184=null;
        Token OFFSET185=null;
        Token COMMA186=null;
        SqlParser.select_list_return select_list178 = null;

        SqlParser.ordering_term_return ordering_term181 = null;

        SqlParser.ordering_term_return ordering_term183 = null;


        Object limit_tree=null;
        Object offset_tree=null;
        Object ORDER179_tree=null;
        Object BY180_tree=null;
        Object COMMA182_tree=null;
        Object LIMIT184_tree=null;
        Object OFFSET185_tree=null;
        Object COMMA186_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_ORDER=new RewriteRuleTokenStream(adaptor,"token ORDER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
        RewriteRuleTokenStream stream_OFFSET=new RewriteRuleTokenStream(adaptor,"token OFFSET");
        RewriteRuleSubtreeStream stream_select_list=new RewriteRuleSubtreeStream(adaptor,"rule select_list");
        RewriteRuleSubtreeStream stream_ordering_term=new RewriteRuleSubtreeStream(adaptor,"rule ordering_term");
        try {
            // SqlParser.g:193:12: ( select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )? -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? ) )
            // SqlParser.g:193:14: select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )?
            {
            pushFollow(FOLLOW_select_list_in_select_stmt1531);
            select_list178=select_list();

            state._fsp--;

            stream_select_list.add(select_list178.getTree());
            // SqlParser.g:194:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==ORDER) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // SqlParser.g:194:4: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                    ORDER179=(Token)match(input,ORDER,FOLLOW_ORDER_in_select_stmt1536);  
                    stream_ORDER.add(ORDER179);

                    BY180=(Token)match(input,BY,FOLLOW_BY_in_select_stmt1538);  
                    stream_BY.add(BY180);

                    pushFollow(FOLLOW_ordering_term_in_select_stmt1540);
                    ordering_term181=ordering_term();

                    state._fsp--;

                    stream_ordering_term.add(ordering_term181.getTree());
                    // SqlParser.g:194:27: ( COMMA ordering_term )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==COMMA) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // SqlParser.g:194:28: COMMA ordering_term
                    	    {
                    	    COMMA182=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_stmt1543);  
                    	    stream_COMMA.add(COMMA182);

                    	    pushFollow(FOLLOW_ordering_term_in_select_stmt1545);
                    	    ordering_term183=ordering_term();

                    	    state._fsp--;

                    	    stream_ordering_term.add(ordering_term183.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);


                    }
                    break;

            }

            // SqlParser.g:195:3: ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==LIMIT) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // SqlParser.g:195:4: LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )?
                    {
                    LIMIT184=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_select_stmt1554);  
                    stream_LIMIT.add(LIMIT184);

                    limit=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt1558);  
                    stream_INTEGER.add(limit);

                    // SqlParser.g:195:24: ( ( OFFSET | COMMA ) offset= INTEGER )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==COMMA||LA59_0==OFFSET) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // SqlParser.g:195:25: ( OFFSET | COMMA ) offset= INTEGER
                            {
                            // SqlParser.g:195:25: ( OFFSET | COMMA )
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
                                    // SqlParser.g:195:26: OFFSET
                                    {
                                    OFFSET185=(Token)match(input,OFFSET,FOLLOW_OFFSET_in_select_stmt1562);  
                                    stream_OFFSET.add(OFFSET185);


                                    }
                                    break;
                                case 2 :
                                    // SqlParser.g:195:35: COMMA
                                    {
                                    COMMA186=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_stmt1566);  
                                    stream_COMMA.add(COMMA186);


                                    }
                                    break;

                            }

                            offset=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt1571);  
                            stream_INTEGER.add(offset);


                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: limit, LIMIT, ORDER, select_list, offset, ordering_term
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
            // 196:1: -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? )
            {
                // SqlParser.g:196:4: ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECT, "SELECT"), root_1);

                adaptor.addChild(root_1, stream_select_list.nextTree());
                // SqlParser.g:197:22: ( ^( ORDER ( ordering_term )+ ) )?
                if ( stream_ORDER.hasNext()||stream_ordering_term.hasNext() ) {
                    // SqlParser.g:197:22: ^( ORDER ( ordering_term )+ )
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
                // SqlParser.g:197:47: ( ^( LIMIT $limit ( $offset)? ) )?
                if ( stream_limit.hasNext()||stream_LIMIT.hasNext()||stream_offset.hasNext() ) {
                    // SqlParser.g:197:47: ^( LIMIT $limit ( $offset)? )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_LIMIT.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_limit.nextNode());
                    // SqlParser.g:197:62: ( $offset)?
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
    // SqlParser.g:200:1: select_list : select_core ( select_op select_core )* ;
    public final SqlParser.select_list_return select_list() throws RecognitionException {
        SqlParser.select_list_return retval = new SqlParser.select_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.select_core_return select_core187 = null;

        SqlParser.select_op_return select_op188 = null;

        SqlParser.select_core_return select_core189 = null;



        try {
            // SqlParser.g:200:12: ( select_core ( select_op select_core )* )
            // SqlParser.g:201:3: select_core ( select_op select_core )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_select_core_in_select_list1616);
            select_core187=select_core();

            state._fsp--;

            adaptor.addChild(root_0, select_core187.getTree());
            // SqlParser.g:201:15: ( select_op select_core )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==EXCEPT||LA61_0==INTERSECT||LA61_0==UNION) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // SqlParser.g:201:16: select_op select_core
            	    {
            	    pushFollow(FOLLOW_select_op_in_select_list1619);
            	    select_op188=select_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(select_op188.getTree(), root_0);
            	    pushFollow(FOLLOW_select_core_in_select_list1622);
            	    select_core189=select_core();

            	    state._fsp--;

            	    adaptor.addChild(root_0, select_core189.getTree());

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
    // SqlParser.g:203:1: select_op : ( UNION ( ALL )? | INTERSECT | EXCEPT );
    public final SqlParser.select_op_return select_op() throws RecognitionException {
        SqlParser.select_op_return retval = new SqlParser.select_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNION190=null;
        Token ALL191=null;
        Token INTERSECT192=null;
        Token EXCEPT193=null;

        Object UNION190_tree=null;
        Object ALL191_tree=null;
        Object INTERSECT192_tree=null;
        Object EXCEPT193_tree=null;

        try {
            // SqlParser.g:203:10: ( UNION ( ALL )? | INTERSECT | EXCEPT )
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
                    // SqlParser.g:203:12: UNION ( ALL )?
                    {
                    root_0 = (Object)adaptor.nil();

                    UNION190=(Token)match(input,UNION,FOLLOW_UNION_in_select_op1631); 
                    UNION190_tree = (Object)adaptor.create(UNION190);
                    root_0 = (Object)adaptor.becomeRoot(UNION190_tree, root_0);

                    // SqlParser.g:203:19: ( ALL )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==ALL) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // SqlParser.g:203:20: ALL
                            {
                            ALL191=(Token)match(input,ALL,FOLLOW_ALL_in_select_op1635); 
                            ALL191_tree = (Object)adaptor.create(ALL191);
                            adaptor.addChild(root_0, ALL191_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:203:28: INTERSECT
                    {
                    root_0 = (Object)adaptor.nil();

                    INTERSECT192=(Token)match(input,INTERSECT,FOLLOW_INTERSECT_in_select_op1641); 
                    INTERSECT192_tree = (Object)adaptor.create(INTERSECT192);
                    adaptor.addChild(root_0, INTERSECT192_tree);


                    }
                    break;
                case 3 :
                    // SqlParser.g:203:40: EXCEPT
                    {
                    root_0 = (Object)adaptor.nil();

                    EXCEPT193=(Token)match(input,EXCEPT,FOLLOW_EXCEPT_in_select_op1645); 
                    EXCEPT193_tree = (Object)adaptor.create(EXCEPT193);
                    adaptor.addChild(root_0, EXCEPT193_tree);


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
    // SqlParser.g:205:1: select_core : SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )? -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? ) ;
    public final SqlParser.select_core_return select_core() throws RecognitionException {
        SqlParser.select_core_return retval = new SqlParser.select_core_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SELECT194=null;
        Token ALL195=null;
        Token DISTINCT196=null;
        Token COMMA198=null;
        Token FROM200=null;
        Token WHERE202=null;
        Token GROUP203=null;
        Token BY204=null;
        Token COMMA206=null;
        Token HAVING208=null;
        SqlParser.expr_return where_expr = null;

        SqlParser.expr_return having_expr = null;

        SqlParser.result_column_return result_column197 = null;

        SqlParser.result_column_return result_column199 = null;

        SqlParser.join_source_return join_source201 = null;

        SqlParser.ordering_term_return ordering_term205 = null;

        SqlParser.ordering_term_return ordering_term207 = null;


        Object SELECT194_tree=null;
        Object ALL195_tree=null;
        Object DISTINCT196_tree=null;
        Object COMMA198_tree=null;
        Object FROM200_tree=null;
        Object WHERE202_tree=null;
        Object GROUP203_tree=null;
        Object BY204_tree=null;
        Object COMMA206_tree=null;
        Object HAVING208_tree=null;
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
            // SqlParser.g:205:12: ( SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )? -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? ) )
            // SqlParser.g:206:3: SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )?
            {
            SELECT194=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_core1654);  
            stream_SELECT.add(SELECT194);

            // SqlParser.g:206:10: ( ALL | DISTINCT )?
            int alt64=3;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // SqlParser.g:206:11: ALL
                    {
                    ALL195=(Token)match(input,ALL,FOLLOW_ALL_in_select_core1657);  
                    stream_ALL.add(ALL195);


                    }
                    break;
                case 2 :
                    // SqlParser.g:206:17: DISTINCT
                    {
                    DISTINCT196=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_select_core1661);  
                    stream_DISTINCT.add(DISTINCT196);


                    }
                    break;

            }

            pushFollow(FOLLOW_result_column_in_select_core1665);
            result_column197=result_column();

            state._fsp--;

            stream_result_column.add(result_column197.getTree());
            // SqlParser.g:206:42: ( COMMA result_column )*
            loop65:
            do {
                int alt65=2;
                alt65 = dfa65.predict(input);
                switch (alt65) {
            	case 1 :
            	    // SqlParser.g:206:43: COMMA result_column
            	    {
            	    COMMA198=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_core1668);  
            	    stream_COMMA.add(COMMA198);

            	    pushFollow(FOLLOW_result_column_in_select_core1670);
            	    result_column199=result_column();

            	    state._fsp--;

            	    stream_result_column.add(result_column199.getTree());

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            // SqlParser.g:206:65: ( FROM join_source )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // SqlParser.g:206:66: FROM join_source
                    {
                    FROM200=(Token)match(input,FROM,FOLLOW_FROM_in_select_core1675);  
                    stream_FROM.add(FROM200);

                    pushFollow(FOLLOW_join_source_in_select_core1677);
                    join_source201=join_source();

                    state._fsp--;

                    stream_join_source.add(join_source201.getTree());

                    }
                    break;

            }

            // SqlParser.g:206:85: ( WHERE where_expr= expr )?
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // SqlParser.g:206:86: WHERE where_expr= expr
                    {
                    WHERE202=(Token)match(input,WHERE,FOLLOW_WHERE_in_select_core1682);  
                    stream_WHERE.add(WHERE202);

                    pushFollow(FOLLOW_expr_in_select_core1686);
                    where_expr=expr();

                    state._fsp--;

                    stream_expr.add(where_expr.getTree());

                    }
                    break;

            }

            // SqlParser.g:207:3: ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==GROUP) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // SqlParser.g:207:5: GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )?
                    {
                    GROUP203=(Token)match(input,GROUP,FOLLOW_GROUP_in_select_core1694);  
                    stream_GROUP.add(GROUP203);

                    BY204=(Token)match(input,BY,FOLLOW_BY_in_select_core1696);  
                    stream_BY.add(BY204);

                    pushFollow(FOLLOW_ordering_term_in_select_core1698);
                    ordering_term205=ordering_term();

                    state._fsp--;

                    stream_ordering_term.add(ordering_term205.getTree());
                    // SqlParser.g:207:28: ( COMMA ordering_term )*
                    loop68:
                    do {
                        int alt68=2;
                        alt68 = dfa68.predict(input);
                        switch (alt68) {
                    	case 1 :
                    	    // SqlParser.g:207:29: COMMA ordering_term
                    	    {
                    	    COMMA206=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_core1701);  
                    	    stream_COMMA.add(COMMA206);

                    	    pushFollow(FOLLOW_ordering_term_in_select_core1703);
                    	    ordering_term207=ordering_term();

                    	    state._fsp--;

                    	    stream_ordering_term.add(ordering_term207.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);

                    // SqlParser.g:207:51: ( HAVING having_expr= expr )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==HAVING) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // SqlParser.g:207:52: HAVING having_expr= expr
                            {
                            HAVING208=(Token)match(input,HAVING,FOLLOW_HAVING_in_select_core1708);  
                            stream_HAVING.add(HAVING208);

                            pushFollow(FOLLOW_expr_in_select_core1712);
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
            // elements: WHERE, having_expr, ordering_term, result_column, DISTINCT, FROM, join_source, HAVING, GROUP, where_expr
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
            // 208:1: -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? )
            {
                // SqlParser.g:208:4: ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECT_CORE, "SELECT_CORE"), root_1);

                // SqlParser.g:209:15: ( DISTINCT )?
                if ( stream_DISTINCT.hasNext() ) {
                    adaptor.addChild(root_1, stream_DISTINCT.nextNode());

                }
                stream_DISTINCT.reset();
                // SqlParser.g:209:27: ^( COLUMNS ( result_column )+ )
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
                // SqlParser.g:209:53: ( ^( FROM join_source ) )?
                if ( stream_FROM.hasNext()||stream_join_source.hasNext() ) {
                    // SqlParser.g:209:53: ^( FROM join_source )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_FROM.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_join_source.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_FROM.reset();
                stream_join_source.reset();
                // SqlParser.g:209:74: ( ^( WHERE $where_expr) )?
                if ( stream_WHERE.hasNext()||stream_where_expr.hasNext() ) {
                    // SqlParser.g:209:74: ^( WHERE $where_expr)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_WHERE.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_where_expr.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_WHERE.reset();
                stream_where_expr.reset();
                // SqlParser.g:210:3: ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )?
                if ( stream_having_expr.hasNext()||stream_ordering_term.hasNext()||stream_HAVING.hasNext()||stream_GROUP.hasNext() ) {
                    // SqlParser.g:210:3: ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? )
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
                    // SqlParser.g:210:26: ( ^( HAVING $having_expr) )?
                    if ( stream_having_expr.hasNext()||stream_HAVING.hasNext() ) {
                        // SqlParser.g:210:26: ^( HAVING $having_expr)
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
                stream_HAVING.reset();
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
    // SqlParser.g:213:1: result_column : ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) );
    public final SqlParser.result_column_return result_column() throws RecognitionException {
        SqlParser.result_column_return retval = new SqlParser.result_column_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASTERISK209=null;
        Token DOT210=null;
        Token ASTERISK211=null;
        Token AS213=null;
        SqlParser.id_return table_name = null;

        SqlParser.id_return column_alias = null;

        SqlParser.expr_return expr212 = null;


        Object ASTERISK209_tree=null;
        Object DOT210_tree=null;
        Object ASTERISK211_tree=null;
        Object AS213_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // SqlParser.g:214:3: ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) )
            int alt73=3;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // SqlParser.g:214:5: ASTERISK
                    {
                    root_0 = (Object)adaptor.nil();

                    ASTERISK209=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_result_column1782); 
                    ASTERISK209_tree = (Object)adaptor.create(ASTERISK209);
                    adaptor.addChild(root_0, ASTERISK209_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:215:5: table_name= id DOT ASTERISK
                    {
                    pushFollow(FOLLOW_id_in_result_column1790);
                    table_name=id();

                    state._fsp--;

                    stream_id.add(table_name.getTree());
                    DOT210=(Token)match(input,DOT,FOLLOW_DOT_in_result_column1792);  
                    stream_DOT.add(DOT210);

                    ASTERISK211=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_result_column1794);  
                    stream_ASTERISK.add(ASTERISK211);



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
                    // 215:32: -> ^( ASTERISK $table_name)
                    {
                        // SqlParser.g:215:35: ^( ASTERISK $table_name)
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
                    // SqlParser.g:216:5: expr ( ( AS )? column_alias= id )?
                    {
                    pushFollow(FOLLOW_expr_in_result_column1809);
                    expr212=expr();

                    state._fsp--;

                    stream_expr.add(expr212.getTree());
                    // SqlParser.g:216:10: ( ( AS )? column_alias= id )?
                    int alt72=2;
                    alt72 = dfa72.predict(input);
                    switch (alt72) {
                        case 1 :
                            // SqlParser.g:216:11: ( AS )? column_alias= id
                            {
                            // SqlParser.g:216:11: ( AS )?
                            int alt71=2;
                            alt71 = dfa71.predict(input);
                            switch (alt71) {
                                case 1 :
                                    // SqlParser.g:216:12: AS
                                    {
                                    AS213=(Token)match(input,AS,FOLLOW_AS_in_result_column1813);  
                                    stream_AS.add(AS213);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_id_in_result_column1819);
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
                    // 216:35: -> ^( ALIAS expr ( $column_alias)? )
                    {
                        // SqlParser.g:216:38: ^( ALIAS expr ( $column_alias)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // SqlParser.g:216:51: ( $column_alias)?
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
    // SqlParser.g:218:1: join_source : single_source ( join_op single_source ( join_constraint )? )* ;
    public final SqlParser.join_source_return join_source() throws RecognitionException {
        SqlParser.join_source_return retval = new SqlParser.join_source_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.single_source_return single_source214 = null;

        SqlParser.join_op_return join_op215 = null;

        SqlParser.single_source_return single_source216 = null;

        SqlParser.join_constraint_return join_constraint217 = null;



        try {
            // SqlParser.g:218:12: ( single_source ( join_op single_source ( join_constraint )? )* )
            // SqlParser.g:218:14: single_source ( join_op single_source ( join_constraint )? )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_single_source_in_join_source1840);
            single_source214=single_source();

            state._fsp--;

            adaptor.addChild(root_0, single_source214.getTree());
            // SqlParser.g:218:28: ( join_op single_source ( join_constraint )? )*
            loop75:
            do {
                int alt75=2;
                alt75 = dfa75.predict(input);
                switch (alt75) {
            	case 1 :
            	    // SqlParser.g:218:29: join_op single_source ( join_constraint )?
            	    {
            	    pushFollow(FOLLOW_join_op_in_join_source1843);
            	    join_op215=join_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(join_op215.getTree(), root_0);
            	    pushFollow(FOLLOW_single_source_in_join_source1846);
            	    single_source216=single_source();

            	    state._fsp--;

            	    adaptor.addChild(root_0, single_source216.getTree());
            	    // SqlParser.g:218:52: ( join_constraint )?
            	    int alt74=2;
            	    alt74 = dfa74.predict(input);
            	    switch (alt74) {
            	        case 1 :
            	            // SqlParser.g:218:53: join_constraint
            	            {
            	            pushFollow(FOLLOW_join_constraint_in_join_source1849);
            	            join_constraint217=join_constraint();

            	            state._fsp--;

            	            adaptor.addChild(root_0, join_constraint217.getTree());

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
    // SqlParser.g:220:1: single_source : ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN );
    public final SqlParser.single_source_return single_source() throws RecognitionException {
        SqlParser.single_source_return retval = new SqlParser.single_source_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token table_name=null;
        Token table_alias=null;
        Token DOT218=null;
        Token AS219=null;
        Token INDEXED220=null;
        Token BY221=null;
        Token NOT222=null;
        Token INDEXED223=null;
        Token LPAREN224=null;
        Token RPAREN226=null;
        Token AS227=null;
        Token LPAREN228=null;
        Token RPAREN230=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return index_name = null;

        SqlParser.select_stmt_return select_stmt225 = null;

        SqlParser.join_source_return join_source229 = null;


        Object table_name_tree=null;
        Object table_alias_tree=null;
        Object DOT218_tree=null;
        Object AS219_tree=null;
        Object INDEXED220_tree=null;
        Object BY221_tree=null;
        Object NOT222_tree=null;
        Object INDEXED223_tree=null;
        Object LPAREN224_tree=null;
        Object RPAREN226_tree=null;
        Object AS227_tree=null;
        Object LPAREN228_tree=null;
        Object RPAREN230_tree=null;
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
            // SqlParser.g:221:3: ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN )
            int alt82=3;
            alt82 = dfa82.predict(input);
            switch (alt82) {
                case 1 :
                    // SqlParser.g:221:5: (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )?
                    {
                    // SqlParser.g:221:5: (database_name= id DOT )?
                    int alt76=2;
                    alt76 = dfa76.predict(input);
                    switch (alt76) {
                        case 1 :
                            // SqlParser.g:221:6: database_name= id DOT
                            {
                            pushFollow(FOLLOW_id_in_single_source1866);
                            database_name=id();

                            state._fsp--;

                            stream_id.add(database_name.getTree());
                            DOT218=(Token)match(input,DOT,FOLLOW_DOT_in_single_source1868);  
                            stream_DOT.add(DOT218);


                            }
                            break;

                    }

                    table_name=(Token)match(input,ID,FOLLOW_ID_in_single_source1874);  
                    stream_ID.add(table_name);

                    // SqlParser.g:221:43: ( ( AS )? table_alias= ID )?
                    int alt78=2;
                    alt78 = dfa78.predict(input);
                    switch (alt78) {
                        case 1 :
                            // SqlParser.g:221:44: ( AS )? table_alias= ID
                            {
                            // SqlParser.g:221:44: ( AS )?
                            int alt77=2;
                            int LA77_0 = input.LA(1);

                            if ( (LA77_0==AS) ) {
                                alt77=1;
                            }
                            switch (alt77) {
                                case 1 :
                                    // SqlParser.g:221:45: AS
                                    {
                                    AS219=(Token)match(input,AS,FOLLOW_AS_in_single_source1878);  
                                    stream_AS.add(AS219);


                                    }
                                    break;

                            }

                            table_alias=(Token)match(input,ID,FOLLOW_ID_in_single_source1884);  
                            stream_ID.add(table_alias);


                            }
                            break;

                    }

                    // SqlParser.g:221:67: ( INDEXED BY index_name= id | NOT INDEXED )?
                    int alt79=3;
                    alt79 = dfa79.predict(input);
                    switch (alt79) {
                        case 1 :
                            // SqlParser.g:221:68: INDEXED BY index_name= id
                            {
                            INDEXED220=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_single_source1889);  
                            stream_INDEXED.add(INDEXED220);

                            BY221=(Token)match(input,BY,FOLLOW_BY_in_single_source1891);  
                            stream_BY.add(BY221);

                            pushFollow(FOLLOW_id_in_single_source1895);
                            index_name=id();

                            state._fsp--;

                            stream_id.add(index_name.getTree());

                            }
                            break;
                        case 2 :
                            // SqlParser.g:221:95: NOT INDEXED
                            {
                            NOT222=(Token)match(input,NOT,FOLLOW_NOT_in_single_source1899);  
                            stream_NOT.add(NOT222);

                            INDEXED223=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_single_source1901);  
                            stream_INDEXED.add(INDEXED223);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: index_name, INDEXED, table_name, table_alias, NOT, database_name
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
                    // 222:3: -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? )
                    {
                        // SqlParser.g:222:6: ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        // SqlParser.g:222:14: ^( $table_name ( $database_name)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                        // SqlParser.g:222:28: ( $database_name)?
                        if ( stream_database_name.hasNext() ) {
                            adaptor.addChild(root_2, stream_database_name.nextTree());

                        }
                        stream_database_name.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // SqlParser.g:222:45: ( $table_alias)?
                        if ( stream_table_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_table_alias.nextNode());

                        }
                        stream_table_alias.reset();
                        // SqlParser.g:222:59: ( ^( INDEXED ( NOT )? ( $index_name)? ) )?
                        if ( stream_index_name.hasNext()||stream_INDEXED.hasNext()||stream_NOT.hasNext() ) {
                            // SqlParser.g:222:59: ^( INDEXED ( NOT )? ( $index_name)? )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(stream_INDEXED.nextNode(), root_2);

                            // SqlParser.g:222:69: ( NOT )?
                            if ( stream_NOT.hasNext() ) {
                                adaptor.addChild(root_2, stream_NOT.nextNode());

                            }
                            stream_NOT.reset();
                            // SqlParser.g:222:74: ( $index_name)?
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
                    // SqlParser.g:223:5: LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )?
                    {
                    LPAREN224=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_single_source1942);  
                    stream_LPAREN.add(LPAREN224);

                    pushFollow(FOLLOW_select_stmt_in_single_source1944);
                    select_stmt225=select_stmt();

                    state._fsp--;

                    stream_select_stmt.add(select_stmt225.getTree());
                    RPAREN226=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_single_source1946);  
                    stream_RPAREN.add(RPAREN226);

                    // SqlParser.g:223:31: ( ( AS )? table_alias= ID )?
                    int alt81=2;
                    alt81 = dfa81.predict(input);
                    switch (alt81) {
                        case 1 :
                            // SqlParser.g:223:32: ( AS )? table_alias= ID
                            {
                            // SqlParser.g:223:32: ( AS )?
                            int alt80=2;
                            int LA80_0 = input.LA(1);

                            if ( (LA80_0==AS) ) {
                                alt80=1;
                            }
                            switch (alt80) {
                                case 1 :
                                    // SqlParser.g:223:33: AS
                                    {
                                    AS227=(Token)match(input,AS,FOLLOW_AS_in_single_source1950);  
                                    stream_AS.add(AS227);


                                    }
                                    break;

                            }

                            table_alias=(Token)match(input,ID,FOLLOW_ID_in_single_source1956);  
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
                    // 224:3: -> ^( ALIAS select_stmt ( $table_alias)? )
                    {
                        // SqlParser.g:224:6: ^( ALIAS select_stmt ( $table_alias)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        adaptor.addChild(root_1, stream_select_stmt.nextTree());
                        // SqlParser.g:224:26: ( $table_alias)?
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
                    // SqlParser.g:225:5: LPAREN join_source RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN228=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_single_source1978); 
                    pushFollow(FOLLOW_join_source_in_single_source1981);
                    join_source229=join_source();

                    state._fsp--;

                    adaptor.addChild(root_0, join_source229.getTree());
                    RPAREN230=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_single_source1983); 

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
    // SqlParser.g:227:1: join_op : ( COMMA | ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN );
    public final SqlParser.join_op_return join_op() throws RecognitionException {
        SqlParser.join_op_return retval = new SqlParser.join_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA231=null;
        Token NATURAL232=null;
        Token LEFT233=null;
        Token OUTER234=null;
        Token INNER235=null;
        Token CROSS236=null;
        Token JOIN237=null;

        Object COMMA231_tree=null;
        Object NATURAL232_tree=null;
        Object LEFT233_tree=null;
        Object OUTER234_tree=null;
        Object INNER235_tree=null;
        Object CROSS236_tree=null;
        Object JOIN237_tree=null;

        try {
            // SqlParser.g:228:3: ( COMMA | ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN )
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
                    // SqlParser.g:228:5: COMMA
                    {
                    root_0 = (Object)adaptor.nil();

                    COMMA231=(Token)match(input,COMMA,FOLLOW_COMMA_in_join_op1994); 
                    COMMA231_tree = (Object)adaptor.create(COMMA231);
                    adaptor.addChild(root_0, COMMA231_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:229:5: ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:229:5: ( NATURAL )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==NATURAL) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // SqlParser.g:229:6: NATURAL
                            {
                            NATURAL232=(Token)match(input,NATURAL,FOLLOW_NATURAL_in_join_op2001); 
                            NATURAL232_tree = (Object)adaptor.create(NATURAL232);
                            adaptor.addChild(root_0, NATURAL232_tree);


                            }
                            break;

                    }

                    // SqlParser.g:229:16: ( ( LEFT )? ( OUTER )? | INNER | CROSS )
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
                            // SqlParser.g:229:17: ( LEFT )? ( OUTER )?
                            {
                            // SqlParser.g:229:17: ( LEFT )?
                            int alt84=2;
                            int LA84_0 = input.LA(1);

                            if ( (LA84_0==LEFT) ) {
                                alt84=1;
                            }
                            switch (alt84) {
                                case 1 :
                                    // SqlParser.g:229:18: LEFT
                                    {
                                    LEFT233=(Token)match(input,LEFT,FOLLOW_LEFT_in_join_op2007); 
                                    LEFT233_tree = (Object)adaptor.create(LEFT233);
                                    adaptor.addChild(root_0, LEFT233_tree);


                                    }
                                    break;

                            }

                            // SqlParser.g:229:25: ( OUTER )?
                            int alt85=2;
                            int LA85_0 = input.LA(1);

                            if ( (LA85_0==OUTER) ) {
                                alt85=1;
                            }
                            switch (alt85) {
                                case 1 :
                                    // SqlParser.g:229:26: OUTER
                                    {
                                    OUTER234=(Token)match(input,OUTER,FOLLOW_OUTER_in_join_op2012); 
                                    OUTER234_tree = (Object)adaptor.create(OUTER234);
                                    adaptor.addChild(root_0, OUTER234_tree);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // SqlParser.g:229:36: INNER
                            {
                            INNER235=(Token)match(input,INNER,FOLLOW_INNER_in_join_op2018); 
                            INNER235_tree = (Object)adaptor.create(INNER235);
                            adaptor.addChild(root_0, INNER235_tree);


                            }
                            break;
                        case 3 :
                            // SqlParser.g:229:44: CROSS
                            {
                            CROSS236=(Token)match(input,CROSS,FOLLOW_CROSS_in_join_op2022); 
                            CROSS236_tree = (Object)adaptor.create(CROSS236);
                            adaptor.addChild(root_0, CROSS236_tree);


                            }
                            break;

                    }

                    JOIN237=(Token)match(input,JOIN,FOLLOW_JOIN_in_join_op2025); 
                    JOIN237_tree = (Object)adaptor.create(JOIN237);
                    root_0 = (Object)adaptor.becomeRoot(JOIN237_tree, root_0);


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
    // SqlParser.g:231:1: join_constraint : ( ON expr | USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN -> ^( USING ( $column_names)+ ) );
    public final SqlParser.join_constraint_return join_constraint() throws RecognitionException {
        SqlParser.join_constraint_return retval = new SqlParser.join_constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ON238=null;
        Token USING240=null;
        Token LPAREN241=null;
        Token COMMA242=null;
        Token RPAREN243=null;
        List list_column_names=null;
        SqlParser.expr_return expr239 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object ON238_tree=null;
        Object USING240_tree=null;
        Object LPAREN241_tree=null;
        Object COMMA242_tree=null;
        Object RPAREN243_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // SqlParser.g:232:3: ( ON expr | USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN -> ^( USING ( $column_names)+ ) )
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
                    // SqlParser.g:232:5: ON expr
                    {
                    root_0 = (Object)adaptor.nil();

                    ON238=(Token)match(input,ON,FOLLOW_ON_in_join_constraint2036); 
                    ON238_tree = (Object)adaptor.create(ON238);
                    root_0 = (Object)adaptor.becomeRoot(ON238_tree, root_0);

                    pushFollow(FOLLOW_expr_in_join_constraint2039);
                    expr239=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr239.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:233:5: USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                    {
                    USING240=(Token)match(input,USING,FOLLOW_USING_in_join_constraint2045);  
                    stream_USING.add(USING240);

                    LPAREN241=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_join_constraint2047);  
                    stream_LPAREN.add(LPAREN241);

                    pushFollow(FOLLOW_id_in_join_constraint2051);
                    column_names=id();

                    state._fsp--;

                    stream_id.add(column_names.getTree());
                    if (list_column_names==null) list_column_names=new ArrayList();
                    list_column_names.add(column_names.getTree());

                    // SqlParser.g:233:35: ( COMMA column_names+= id )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==COMMA) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // SqlParser.g:233:36: COMMA column_names+= id
                    	    {
                    	    COMMA242=(Token)match(input,COMMA,FOLLOW_COMMA_in_join_constraint2054);  
                    	    stream_COMMA.add(COMMA242);

                    	    pushFollow(FOLLOW_id_in_join_constraint2058);
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

                    RPAREN243=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_join_constraint2062);  
                    stream_RPAREN.add(RPAREN243);



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
                    // 233:68: -> ^( USING ( $column_names)+ )
                    {
                        // SqlParser.g:233:71: ^( USING ( $column_names)+ )
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
    // SqlParser.g:236:1: insert_stmt : ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES ) ;
    public final SqlParser.insert_stmt_return insert_stmt() throws RecognitionException {
        SqlParser.insert_stmt_return retval = new SqlParser.insert_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSERT244=null;
        Token REPLACE246=null;
        Token INTO247=null;
        Token DOT248=null;
        Token LPAREN249=null;
        Token COMMA250=null;
        Token RPAREN251=null;
        Token VALUES252=null;
        Token LPAREN253=null;
        Token COMMA254=null;
        Token RPAREN255=null;
        Token DEFAULT257=null;
        Token VALUES258=null;
        List list_column_names=null;
        List list_values=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.operation_conflict_clause_return operation_conflict_clause245 = null;

        SqlParser.select_stmt_return select_stmt256 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        SqlParser.expr_return values = null;
         values = null;
        Object INSERT244_tree=null;
        Object REPLACE246_tree=null;
        Object INTO247_tree=null;
        Object DOT248_tree=null;
        Object LPAREN249_tree=null;
        Object COMMA250_tree=null;
        Object RPAREN251_tree=null;
        Object VALUES252_tree=null;
        Object LPAREN253_tree=null;
        Object COMMA254_tree=null;
        Object RPAREN255_tree=null;
        Object DEFAULT257_tree=null;
        Object VALUES258_tree=null;

        try {
            // SqlParser.g:236:12: ( ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES ) )
            // SqlParser.g:236:14: ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES )
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:236:14: ( INSERT ( operation_conflict_clause )? | REPLACE )
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
                    // SqlParser.g:236:15: INSERT ( operation_conflict_clause )?
                    {
                    INSERT244=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_stmt2081); 
                    INSERT244_tree = (Object)adaptor.create(INSERT244);
                    adaptor.addChild(root_0, INSERT244_tree);

                    // SqlParser.g:236:22: ( operation_conflict_clause )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==OR) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // SqlParser.g:236:23: operation_conflict_clause
                            {
                            pushFollow(FOLLOW_operation_conflict_clause_in_insert_stmt2084);
                            operation_conflict_clause245=operation_conflict_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, operation_conflict_clause245.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:236:53: REPLACE
                    {
                    REPLACE246=(Token)match(input,REPLACE,FOLLOW_REPLACE_in_insert_stmt2090); 
                    REPLACE246_tree = (Object)adaptor.create(REPLACE246);
                    adaptor.addChild(root_0, REPLACE246_tree);


                    }
                    break;

            }

            INTO247=(Token)match(input,INTO,FOLLOW_INTO_in_insert_stmt2093); 
            INTO247_tree = (Object)adaptor.create(INTO247);
            adaptor.addChild(root_0, INTO247_tree);

            // SqlParser.g:236:67: (database_name= id DOT )?
            int alt92=2;
            alt92 = dfa92.predict(input);
            switch (alt92) {
                case 1 :
                    // SqlParser.g:236:68: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_insert_stmt2098);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT248=(Token)match(input,DOT,FOLLOW_DOT_in_insert_stmt2100); 
                    DOT248_tree = (Object)adaptor.create(DOT248);
                    adaptor.addChild(root_0, DOT248_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_insert_stmt2106);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:237:3: ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES )
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
                    // SqlParser.g:237:5: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt )
                    {
                    // SqlParser.g:237:5: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==LPAREN) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // SqlParser.g:237:6: LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                            {
                            LPAREN249=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt2113); 
                            LPAREN249_tree = (Object)adaptor.create(LPAREN249);
                            adaptor.addChild(root_0, LPAREN249_tree);

                            pushFollow(FOLLOW_id_in_insert_stmt2117);
                            column_names=id();

                            state._fsp--;

                            adaptor.addChild(root_0, column_names.getTree());
                            if (list_column_names==null) list_column_names=new ArrayList();
                            list_column_names.add(column_names.getTree());

                            // SqlParser.g:237:30: ( COMMA column_names+= id )*
                            loop93:
                            do {
                                int alt93=2;
                                int LA93_0 = input.LA(1);

                                if ( (LA93_0==COMMA) ) {
                                    alt93=1;
                                }


                                switch (alt93) {
                            	case 1 :
                            	    // SqlParser.g:237:31: COMMA column_names+= id
                            	    {
                            	    COMMA250=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt2120); 
                            	    COMMA250_tree = (Object)adaptor.create(COMMA250);
                            	    adaptor.addChild(root_0, COMMA250_tree);

                            	    pushFollow(FOLLOW_id_in_insert_stmt2124);
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

                            RPAREN251=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt2128); 
                            RPAREN251_tree = (Object)adaptor.create(RPAREN251);
                            adaptor.addChild(root_0, RPAREN251_tree);


                            }
                            break;

                    }

                    // SqlParser.g:238:5: ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt )
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
                            // SqlParser.g:238:6: VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN
                            {
                            VALUES252=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt2137); 
                            VALUES252_tree = (Object)adaptor.create(VALUES252);
                            adaptor.addChild(root_0, VALUES252_tree);

                            LPAREN253=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt2139); 
                            LPAREN253_tree = (Object)adaptor.create(LPAREN253);
                            adaptor.addChild(root_0, LPAREN253_tree);

                            pushFollow(FOLLOW_expr_in_insert_stmt2143);
                            values=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, values.getTree());
                            if (list_values==null) list_values=new ArrayList();
                            list_values.add(values.getTree());

                            // SqlParser.g:238:33: ( COMMA values+= expr )*
                            loop95:
                            do {
                                int alt95=2;
                                int LA95_0 = input.LA(1);

                                if ( (LA95_0==COMMA) ) {
                                    alt95=1;
                                }


                                switch (alt95) {
                            	case 1 :
                            	    // SqlParser.g:238:34: COMMA values+= expr
                            	    {
                            	    COMMA254=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt2146); 
                            	    COMMA254_tree = (Object)adaptor.create(COMMA254);
                            	    adaptor.addChild(root_0, COMMA254_tree);

                            	    pushFollow(FOLLOW_expr_in_insert_stmt2150);
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

                            RPAREN255=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt2154); 
                            RPAREN255_tree = (Object)adaptor.create(RPAREN255);
                            adaptor.addChild(root_0, RPAREN255_tree);


                            }
                            break;
                        case 2 :
                            // SqlParser.g:238:64: select_stmt
                            {
                            pushFollow(FOLLOW_select_stmt_in_insert_stmt2158);
                            select_stmt256=select_stmt();

                            state._fsp--;

                            adaptor.addChild(root_0, select_stmt256.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:239:5: DEFAULT VALUES
                    {
                    DEFAULT257=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_insert_stmt2165); 
                    DEFAULT257_tree = (Object)adaptor.create(DEFAULT257);
                    adaptor.addChild(root_0, DEFAULT257_tree);

                    VALUES258=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt2167); 
                    VALUES258_tree = (Object)adaptor.create(VALUES258);
                    adaptor.addChild(root_0, VALUES258_tree);


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
    // SqlParser.g:242:1: update_stmt : UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )? ;
    public final SqlParser.update_stmt_return update_stmt() throws RecognitionException {
        SqlParser.update_stmt_return retval = new SqlParser.update_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UPDATE259=null;
        Token SET262=null;
        Token COMMA263=null;
        Token WHERE264=null;
        List list_values=null;
        SqlParser.operation_conflict_clause_return operation_conflict_clause260 = null;

        SqlParser.qualified_table_name_return qualified_table_name261 = null;

        SqlParser.expr_return expr265 = null;

        SqlParser.operation_limited_clause_return operation_limited_clause266 = null;

        SqlParser.update_set_return values = null;
         values = null;
        Object UPDATE259_tree=null;
        Object SET262_tree=null;
        Object COMMA263_tree=null;
        Object WHERE264_tree=null;

        try {
            // SqlParser.g:242:12: ( UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )? )
            // SqlParser.g:242:14: UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )?
            {
            root_0 = (Object)adaptor.nil();

            UPDATE259=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_update_stmt2177); 
            UPDATE259_tree = (Object)adaptor.create(UPDATE259);
            adaptor.addChild(root_0, UPDATE259_tree);

            // SqlParser.g:242:21: ( operation_conflict_clause )?
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
                    // SqlParser.g:242:22: operation_conflict_clause
                    {
                    pushFollow(FOLLOW_operation_conflict_clause_in_update_stmt2180);
                    operation_conflict_clause260=operation_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_conflict_clause260.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_qualified_table_name_in_update_stmt2184);
            qualified_table_name261=qualified_table_name();

            state._fsp--;

            adaptor.addChild(root_0, qualified_table_name261.getTree());
            SET262=(Token)match(input,SET,FOLLOW_SET_in_update_stmt2188); 
            SET262_tree = (Object)adaptor.create(SET262);
            adaptor.addChild(root_0, SET262_tree);

            pushFollow(FOLLOW_update_set_in_update_stmt2192);
            values=update_set();

            state._fsp--;

            adaptor.addChild(root_0, values.getTree());
            if (list_values==null) list_values=new ArrayList();
            list_values.add(values.getTree());

            // SqlParser.g:243:26: ( COMMA values+= update_set )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==COMMA) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // SqlParser.g:243:27: COMMA values+= update_set
            	    {
            	    COMMA263=(Token)match(input,COMMA,FOLLOW_COMMA_in_update_stmt2195); 
            	    COMMA263_tree = (Object)adaptor.create(COMMA263);
            	    adaptor.addChild(root_0, COMMA263_tree);

            	    pushFollow(FOLLOW_update_set_in_update_stmt2199);
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

            // SqlParser.g:243:54: ( WHERE expr )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==WHERE) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // SqlParser.g:243:55: WHERE expr
                    {
                    WHERE264=(Token)match(input,WHERE,FOLLOW_WHERE_in_update_stmt2204); 
                    WHERE264_tree = (Object)adaptor.create(WHERE264);
                    adaptor.addChild(root_0, WHERE264_tree);

                    pushFollow(FOLLOW_expr_in_update_stmt2206);
                    expr265=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr265.getTree());

                    }
                    break;

            }

            // SqlParser.g:243:68: ( operation_limited_clause )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==LIMIT||LA101_0==ORDER) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // SqlParser.g:243:69: operation_limited_clause
                    {
                    pushFollow(FOLLOW_operation_limited_clause_in_update_stmt2211);
                    operation_limited_clause266=operation_limited_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_limited_clause266.getTree());

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
    // SqlParser.g:245:1: update_set : column_name= id EQUALS expr ;
    public final SqlParser.update_set_return update_set() throws RecognitionException {
        SqlParser.update_set_return retval = new SqlParser.update_set_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EQUALS267=null;
        SqlParser.id_return column_name = null;

        SqlParser.expr_return expr268 = null;


        Object EQUALS267_tree=null;

        try {
            // SqlParser.g:245:11: (column_name= id EQUALS expr )
            // SqlParser.g:245:13: column_name= id EQUALS expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_update_set2222);
            column_name=id();

            state._fsp--;

            adaptor.addChild(root_0, column_name.getTree());
            EQUALS267=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_update_set2224); 
            EQUALS267_tree = (Object)adaptor.create(EQUALS267);
            adaptor.addChild(root_0, EQUALS267_tree);

            pushFollow(FOLLOW_expr_in_update_set2226);
            expr268=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr268.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // SqlParser.g:248:1: delete_stmt : DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )? ;
    public final SqlParser.delete_stmt_return delete_stmt() throws RecognitionException {
        SqlParser.delete_stmt_return retval = new SqlParser.delete_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DELETE269=null;
        Token FROM270=null;
        Token WHERE272=null;
        SqlParser.qualified_table_name_return qualified_table_name271 = null;

        SqlParser.expr_return expr273 = null;

        SqlParser.operation_limited_clause_return operation_limited_clause274 = null;


        Object DELETE269_tree=null;
        Object FROM270_tree=null;
        Object WHERE272_tree=null;

        try {
            // SqlParser.g:248:12: ( DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )? )
            // SqlParser.g:248:14: DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )?
            {
            root_0 = (Object)adaptor.nil();

            DELETE269=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_stmt2234); 
            DELETE269_tree = (Object)adaptor.create(DELETE269);
            adaptor.addChild(root_0, DELETE269_tree);

            FROM270=(Token)match(input,FROM,FOLLOW_FROM_in_delete_stmt2236); 
            FROM270_tree = (Object)adaptor.create(FROM270);
            adaptor.addChild(root_0, FROM270_tree);

            pushFollow(FOLLOW_qualified_table_name_in_delete_stmt2238);
            qualified_table_name271=qualified_table_name();

            state._fsp--;

            adaptor.addChild(root_0, qualified_table_name271.getTree());
            // SqlParser.g:248:47: ( WHERE expr )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==WHERE) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // SqlParser.g:248:48: WHERE expr
                    {
                    WHERE272=(Token)match(input,WHERE,FOLLOW_WHERE_in_delete_stmt2241); 
                    WHERE272_tree = (Object)adaptor.create(WHERE272);
                    adaptor.addChild(root_0, WHERE272_tree);

                    pushFollow(FOLLOW_expr_in_delete_stmt2243);
                    expr273=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr273.getTree());

                    }
                    break;

            }

            // SqlParser.g:248:61: ( operation_limited_clause )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==LIMIT||LA103_0==ORDER) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // SqlParser.g:248:62: operation_limited_clause
                    {
                    pushFollow(FOLLOW_operation_limited_clause_in_delete_stmt2248);
                    operation_limited_clause274=operation_limited_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_limited_clause274.getTree());

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
    // SqlParser.g:251:1: begin_stmt : BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )? ;
    public final SqlParser.begin_stmt_return begin_stmt() throws RecognitionException {
        SqlParser.begin_stmt_return retval = new SqlParser.begin_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BEGIN275=null;
        Token set276=null;
        Token TRANSACTION277=null;

        Object BEGIN275_tree=null;
        Object set276_tree=null;
        Object TRANSACTION277_tree=null;

        try {
            // SqlParser.g:251:11: ( BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )? )
            // SqlParser.g:251:13: BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )?
            {
            root_0 = (Object)adaptor.nil();

            BEGIN275=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_begin_stmt2258); 
            BEGIN275_tree = (Object)adaptor.create(BEGIN275);
            adaptor.addChild(root_0, BEGIN275_tree);

            // SqlParser.g:251:19: ( DEFERRED | IMMEDIATE | EXCLUSIVE )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==DEFERRED||LA104_0==EXCLUSIVE||LA104_0==IMMEDIATE) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // SqlParser.g:
                    {
                    set276=(Token)input.LT(1);
                    if ( input.LA(1)==DEFERRED||input.LA(1)==EXCLUSIVE||input.LA(1)==IMMEDIATE ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set276));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            // SqlParser.g:251:55: ( TRANSACTION )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==TRANSACTION) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // SqlParser.g:251:56: TRANSACTION
                    {
                    TRANSACTION277=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_begin_stmt2274); 
                    TRANSACTION277_tree = (Object)adaptor.create(TRANSACTION277);
                    adaptor.addChild(root_0, TRANSACTION277_tree);


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
    // SqlParser.g:254:1: commit_stmt : ( COMMIT | END ) ( TRANSACTION )? ;
    public final SqlParser.commit_stmt_return commit_stmt() throws RecognitionException {
        SqlParser.commit_stmt_return retval = new SqlParser.commit_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set278=null;
        Token TRANSACTION279=null;

        Object set278_tree=null;
        Object TRANSACTION279_tree=null;

        try {
            // SqlParser.g:254:12: ( ( COMMIT | END ) ( TRANSACTION )? )
            // SqlParser.g:254:14: ( COMMIT | END ) ( TRANSACTION )?
            {
            root_0 = (Object)adaptor.nil();

            set278=(Token)input.LT(1);
            if ( input.LA(1)==COMMIT||input.LA(1)==END ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set278));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // SqlParser.g:254:29: ( TRANSACTION )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==TRANSACTION) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // SqlParser.g:254:30: TRANSACTION
                    {
                    TRANSACTION279=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_commit_stmt2293); 
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
    // $ANTLR end "commit_stmt"

    public static class rollback_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rollback_stmt"
    // SqlParser.g:257:1: rollback_stmt : ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )? ;
    public final SqlParser.rollback_stmt_return rollback_stmt() throws RecognitionException {
        SqlParser.rollback_stmt_return retval = new SqlParser.rollback_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ROLLBACK280=null;
        Token TRANSACTION281=null;
        Token TO282=null;
        Token SAVEPOINT283=null;
        SqlParser.id_return savepoint_name = null;


        Object ROLLBACK280_tree=null;
        Object TRANSACTION281_tree=null;
        Object TO282_tree=null;
        Object SAVEPOINT283_tree=null;

        try {
            // SqlParser.g:257:14: ( ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )? )
            // SqlParser.g:257:16: ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )?
            {
            root_0 = (Object)adaptor.nil();

            ROLLBACK280=(Token)match(input,ROLLBACK,FOLLOW_ROLLBACK_in_rollback_stmt2303); 
            ROLLBACK280_tree = (Object)adaptor.create(ROLLBACK280);
            adaptor.addChild(root_0, ROLLBACK280_tree);

            // SqlParser.g:257:25: ( TRANSACTION )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==TRANSACTION) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // SqlParser.g:257:26: TRANSACTION
                    {
                    TRANSACTION281=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_rollback_stmt2306); 
                    TRANSACTION281_tree = (Object)adaptor.create(TRANSACTION281);
                    adaptor.addChild(root_0, TRANSACTION281_tree);


                    }
                    break;

            }

            // SqlParser.g:257:40: ( TO ( SAVEPOINT )? savepoint_name= id )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==TO) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // SqlParser.g:257:41: TO ( SAVEPOINT )? savepoint_name= id
                    {
                    TO282=(Token)match(input,TO,FOLLOW_TO_in_rollback_stmt2311); 
                    TO282_tree = (Object)adaptor.create(TO282);
                    adaptor.addChild(root_0, TO282_tree);

                    // SqlParser.g:257:44: ( SAVEPOINT )?
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
                            // SqlParser.g:257:45: SAVEPOINT
                            {
                            SAVEPOINT283=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_rollback_stmt2314); 
                            SAVEPOINT283_tree = (Object)adaptor.create(SAVEPOINT283);
                            adaptor.addChild(root_0, SAVEPOINT283_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_id_in_rollback_stmt2320);
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
    // SqlParser.g:260:1: savepoint_stmt : SAVEPOINT savepoint_name= id ;
    public final SqlParser.savepoint_stmt_return savepoint_stmt() throws RecognitionException {
        SqlParser.savepoint_stmt_return retval = new SqlParser.savepoint_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SAVEPOINT284=null;
        SqlParser.id_return savepoint_name = null;


        Object SAVEPOINT284_tree=null;

        try {
            // SqlParser.g:260:15: ( SAVEPOINT savepoint_name= id )
            // SqlParser.g:260:17: SAVEPOINT savepoint_name= id
            {
            root_0 = (Object)adaptor.nil();

            SAVEPOINT284=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_savepoint_stmt2330); 
            SAVEPOINT284_tree = (Object)adaptor.create(SAVEPOINT284);
            adaptor.addChild(root_0, SAVEPOINT284_tree);

            pushFollow(FOLLOW_id_in_savepoint_stmt2334);
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
    // SqlParser.g:263:1: release_stmt : RELEASE ( SAVEPOINT )? savepoint_name= id ;
    public final SqlParser.release_stmt_return release_stmt() throws RecognitionException {
        SqlParser.release_stmt_return retval = new SqlParser.release_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RELEASE285=null;
        Token SAVEPOINT286=null;
        SqlParser.id_return savepoint_name = null;


        Object RELEASE285_tree=null;
        Object SAVEPOINT286_tree=null;

        try {
            // SqlParser.g:263:13: ( RELEASE ( SAVEPOINT )? savepoint_name= id )
            // SqlParser.g:263:15: RELEASE ( SAVEPOINT )? savepoint_name= id
            {
            root_0 = (Object)adaptor.nil();

            RELEASE285=(Token)match(input,RELEASE,FOLLOW_RELEASE_in_release_stmt2342); 
            RELEASE285_tree = (Object)adaptor.create(RELEASE285);
            adaptor.addChild(root_0, RELEASE285_tree);

            // SqlParser.g:263:23: ( SAVEPOINT )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==SAVEPOINT) ) {
                int LA110_1 = input.LA(2);

                if ( ((LA110_1>=ABORT && LA110_1<=WHERE)||LA110_1==ID) ) {
                    alt110=1;
                }
            }
            switch (alt110) {
                case 1 :
                    // SqlParser.g:263:24: SAVEPOINT
                    {
                    SAVEPOINT286=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_release_stmt2345); 
                    SAVEPOINT286_tree = (Object)adaptor.create(SAVEPOINT286);
                    adaptor.addChild(root_0, SAVEPOINT286_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_release_stmt2351);
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
    // SqlParser.g:270:1: table_conflict_clause : ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) ;
    public final SqlParser.table_conflict_clause_return table_conflict_clause() throws RecognitionException {
        SqlParser.table_conflict_clause_return retval = new SqlParser.table_conflict_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ON287=null;
        Token CONFLICT288=null;
        Token set289=null;

        Object ON287_tree=null;
        Object CONFLICT288_tree=null;
        Object set289_tree=null;

        try {
            // SqlParser.g:270:22: ( ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) )
            // SqlParser.g:270:24: ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE )
            {
            root_0 = (Object)adaptor.nil();

            ON287=(Token)match(input,ON,FOLLOW_ON_in_table_conflict_clause2363); 
            CONFLICT288=(Token)match(input,CONFLICT,FOLLOW_CONFLICT_in_table_conflict_clause2366); 
            CONFLICT288_tree = (Object)adaptor.create(CONFLICT288);
            root_0 = (Object)adaptor.becomeRoot(CONFLICT288_tree, root_0);

            set289=(Token)input.LT(1);
            if ( input.LA(1)==ABORT||input.LA(1)==FAIL||input.LA(1)==IGNORE||input.LA(1)==REPLACE||input.LA(1)==ROLLBACK ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set289));
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
    // SqlParser.g:274:1: create_virtual_table_stmt : CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )? ;
    public final SqlParser.create_virtual_table_stmt_return create_virtual_table_stmt() throws RecognitionException {
        SqlParser.create_virtual_table_stmt_return retval = new SqlParser.create_virtual_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE290=null;
        Token VIRTUAL291=null;
        Token TABLE292=null;
        Token DOT293=null;
        Token USING294=null;
        Token LPAREN295=null;
        Token COMMA297=null;
        Token RPAREN299=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.id_return module_name = null;

        SqlParser.column_def_return column_def296 = null;

        SqlParser.column_def_return column_def298 = null;


        Object CREATE290_tree=null;
        Object VIRTUAL291_tree=null;
        Object TABLE292_tree=null;
        Object DOT293_tree=null;
        Object USING294_tree=null;
        Object LPAREN295_tree=null;
        Object COMMA297_tree=null;
        Object RPAREN299_tree=null;

        try {
            // SqlParser.g:274:26: ( CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )? )
            // SqlParser.g:274:28: CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            CREATE290=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_virtual_table_stmt2396); 
            CREATE290_tree = (Object)adaptor.create(CREATE290);
            adaptor.addChild(root_0, CREATE290_tree);

            VIRTUAL291=(Token)match(input,VIRTUAL,FOLLOW_VIRTUAL_in_create_virtual_table_stmt2398); 
            VIRTUAL291_tree = (Object)adaptor.create(VIRTUAL291);
            adaptor.addChild(root_0, VIRTUAL291_tree);

            TABLE292=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_virtual_table_stmt2400); 
            TABLE292_tree = (Object)adaptor.create(TABLE292);
            adaptor.addChild(root_0, TABLE292_tree);

            // SqlParser.g:274:49: (database_name= id DOT )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==ID) ) {
                int LA111_1 = input.LA(2);

                if ( (LA111_1==DOT) ) {
                    alt111=1;
                }
            }
            else if ( ((LA111_0>=ABORT && LA111_0<=WHERE)) ) {
                int LA111_2 = input.LA(2);

                if ( (LA111_2==DOT) ) {
                    alt111=1;
                }
            }
            switch (alt111) {
                case 1 :
                    // SqlParser.g:274:50: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_virtual_table_stmt2405);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT293=(Token)match(input,DOT,FOLLOW_DOT_in_create_virtual_table_stmt2407); 
                    DOT293_tree = (Object)adaptor.create(DOT293);
                    adaptor.addChild(root_0, DOT293_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_virtual_table_stmt2413);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            USING294=(Token)match(input,USING,FOLLOW_USING_in_create_virtual_table_stmt2417); 
            USING294_tree = (Object)adaptor.create(USING294);
            adaptor.addChild(root_0, USING294_tree);

            pushFollow(FOLLOW_id_in_create_virtual_table_stmt2421);
            module_name=id();

            state._fsp--;

            adaptor.addChild(root_0, module_name.getTree());
            // SqlParser.g:275:24: ( LPAREN column_def ( COMMA column_def )* RPAREN )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==LPAREN) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // SqlParser.g:275:25: LPAREN column_def ( COMMA column_def )* RPAREN
                    {
                    LPAREN295=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_virtual_table_stmt2424); 
                    LPAREN295_tree = (Object)adaptor.create(LPAREN295);
                    adaptor.addChild(root_0, LPAREN295_tree);

                    pushFollow(FOLLOW_column_def_in_create_virtual_table_stmt2426);
                    column_def296=column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, column_def296.getTree());
                    // SqlParser.g:275:43: ( COMMA column_def )*
                    loop112:
                    do {
                        int alt112=2;
                        int LA112_0 = input.LA(1);

                        if ( (LA112_0==COMMA) ) {
                            alt112=1;
                        }


                        switch (alt112) {
                    	case 1 :
                    	    // SqlParser.g:275:44: COMMA column_def
                    	    {
                    	    COMMA297=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_virtual_table_stmt2429); 
                    	    COMMA297_tree = (Object)adaptor.create(COMMA297);
                    	    adaptor.addChild(root_0, COMMA297_tree);

                    	    pushFollow(FOLLOW_column_def_in_create_virtual_table_stmt2431);
                    	    column_def298=column_def();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, column_def298.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop112;
                        }
                    } while (true);

                    RPAREN299=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_virtual_table_stmt2435); 
                    RPAREN299_tree = (Object)adaptor.create(RPAREN299);
                    adaptor.addChild(root_0, RPAREN299_tree);


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
    // SqlParser.g:278:1: create_table_stmt : CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt ) -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? ) ;
    public final SqlParser.create_table_stmt_return create_table_stmt() throws RecognitionException {
        SqlParser.create_table_stmt_return retval = new SqlParser.create_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE300=null;
        Token TEMPORARY301=null;
        Token TABLE302=null;
        Token IF303=null;
        Token NOT304=null;
        Token EXISTS305=null;
        Token DOT306=null;
        Token LPAREN307=null;
        Token COMMA309=null;
        Token COMMA311=null;
        Token RPAREN313=null;
        Token AS314=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.column_def_return column_def308 = null;

        SqlParser.column_def_return column_def310 = null;

        SqlParser.table_constraint_return table_constraint312 = null;

        SqlParser.select_stmt_return select_stmt315 = null;


        Object CREATE300_tree=null;
        Object TEMPORARY301_tree=null;
        Object TABLE302_tree=null;
        Object IF303_tree=null;
        Object NOT304_tree=null;
        Object EXISTS305_tree=null;
        Object DOT306_tree=null;
        Object LPAREN307_tree=null;
        Object COMMA309_tree=null;
        Object COMMA311_tree=null;
        Object RPAREN313_tree=null;
        Object AS314_tree=null;
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
            // SqlParser.g:278:18: ( CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt ) -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? ) )
            // SqlParser.g:278:20: CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt )
            {
            CREATE300=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_table_stmt2445);  
            stream_CREATE.add(CREATE300);

            // SqlParser.g:278:27: ( TEMPORARY )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==TEMPORARY) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // SqlParser.g:278:27: TEMPORARY
                    {
                    TEMPORARY301=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_table_stmt2447);  
                    stream_TEMPORARY.add(TEMPORARY301);


                    }
                    break;

            }

            TABLE302=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_table_stmt2450);  
            stream_TABLE.add(TABLE302);

            // SqlParser.g:278:44: ( IF NOT EXISTS )?
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
                    // SqlParser.g:278:45: IF NOT EXISTS
                    {
                    IF303=(Token)match(input,IF,FOLLOW_IF_in_create_table_stmt2453);  
                    stream_IF.add(IF303);

                    NOT304=(Token)match(input,NOT,FOLLOW_NOT_in_create_table_stmt2455);  
                    stream_NOT.add(NOT304);

                    EXISTS305=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_table_stmt2457);  
                    stream_EXISTS.add(EXISTS305);


                    }
                    break;

            }

            // SqlParser.g:278:61: (database_name= id DOT )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==ID) ) {
                int LA116_1 = input.LA(2);

                if ( (LA116_1==DOT) ) {
                    alt116=1;
                }
            }
            else if ( ((LA116_0>=ABORT && LA116_0<=WHERE)) ) {
                int LA116_2 = input.LA(2);

                if ( (LA116_2==DOT) ) {
                    alt116=1;
                }
            }
            switch (alt116) {
                case 1 :
                    // SqlParser.g:278:62: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_table_stmt2464);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT306=(Token)match(input,DOT,FOLLOW_DOT_in_create_table_stmt2466);  
                    stream_DOT.add(DOT306);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_table_stmt2472);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());
            // SqlParser.g:279:3: ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt )
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
                    // SqlParser.g:279:5: LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN
                    {
                    LPAREN307=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_table_stmt2478);  
                    stream_LPAREN.add(LPAREN307);

                    pushFollow(FOLLOW_column_def_in_create_table_stmt2480);
                    column_def308=column_def();

                    state._fsp--;

                    stream_column_def.add(column_def308.getTree());
                    // SqlParser.g:279:23: ( COMMA column_def )*
                    loop117:
                    do {
                        int alt117=2;
                        alt117 = dfa117.predict(input);
                        switch (alt117) {
                    	case 1 :
                    	    // SqlParser.g:279:24: COMMA column_def
                    	    {
                    	    COMMA309=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_table_stmt2483);  
                    	    stream_COMMA.add(COMMA309);

                    	    pushFollow(FOLLOW_column_def_in_create_table_stmt2485);
                    	    column_def310=column_def();

                    	    state._fsp--;

                    	    stream_column_def.add(column_def310.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop117;
                        }
                    } while (true);

                    // SqlParser.g:279:43: ( COMMA table_constraint )*
                    loop118:
                    do {
                        int alt118=2;
                        int LA118_0 = input.LA(1);

                        if ( (LA118_0==COMMA) ) {
                            alt118=1;
                        }


                        switch (alt118) {
                    	case 1 :
                    	    // SqlParser.g:279:44: COMMA table_constraint
                    	    {
                    	    COMMA311=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_table_stmt2490);  
                    	    stream_COMMA.add(COMMA311);

                    	    pushFollow(FOLLOW_table_constraint_in_create_table_stmt2492);
                    	    table_constraint312=table_constraint();

                    	    state._fsp--;

                    	    stream_table_constraint.add(table_constraint312.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop118;
                        }
                    } while (true);

                    RPAREN313=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_table_stmt2496);  
                    stream_RPAREN.add(RPAREN313);


                    }
                    break;
                case 2 :
                    // SqlParser.g:280:5: AS select_stmt
                    {
                    AS314=(Token)match(input,AS,FOLLOW_AS_in_create_table_stmt2502);  
                    stream_AS.add(AS314);

                    pushFollow(FOLLOW_select_stmt_in_create_table_stmt2504);
                    select_stmt315=select_stmt();

                    state._fsp--;

                    stream_select_stmt.add(select_stmt315.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: select_stmt, EXISTS, table_name, database_name, column_def, table_constraint, TEMPORARY
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
            // 281:1: -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? )
            {
                // SqlParser.g:281:4: ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CREATE_TABLE, "CREATE_TABLE"), root_1);

                // SqlParser.g:281:19: ^( OPTIONS ( TEMPORARY )? ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:281:29: ( TEMPORARY )?
                if ( stream_TEMPORARY.hasNext() ) {
                    adaptor.addChild(root_2, stream_TEMPORARY.nextNode());

                }
                stream_TEMPORARY.reset();
                // SqlParser.g:281:40: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:281:49: ^( $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                // SqlParser.g:281:63: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:282:3: ( ^( COLUMNS ( column_def )+ ) )?
                if ( stream_column_def.hasNext() ) {
                    // SqlParser.g:282:3: ^( COLUMNS ( column_def )+ )
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
                // SqlParser.g:282:27: ( ^( CONSTRAINTS ( table_constraint )* ) )?
                if ( stream_table_constraint.hasNext() ) {
                    // SqlParser.g:282:27: ^( CONSTRAINTS ( table_constraint )* )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRAINTS, "CONSTRAINTS"), root_2);

                    // SqlParser.g:282:41: ( table_constraint )*
                    while ( stream_table_constraint.hasNext() ) {
                        adaptor.addChild(root_2, stream_table_constraint.nextTree());

                    }
                    stream_table_constraint.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_table_constraint.reset();
                // SqlParser.g:282:61: ( select_stmt )?
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
    // SqlParser.g:284:1: column_def : name= id_column_def ( type_name )? ( column_constraint )* -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? ) ;
    public final SqlParser.column_def_return column_def() throws RecognitionException {
        SqlParser.column_def_return retval = new SqlParser.column_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.id_column_def_return name = null;

        SqlParser.type_name_return type_name316 = null;

        SqlParser.column_constraint_return column_constraint317 = null;


        RewriteRuleSubtreeStream stream_column_constraint=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint");
        RewriteRuleSubtreeStream stream_id_column_def=new RewriteRuleSubtreeStream(adaptor,"rule id_column_def");
        RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");
        try {
            // SqlParser.g:284:11: (name= id_column_def ( type_name )? ( column_constraint )* -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? ) )
            // SqlParser.g:284:13: name= id_column_def ( type_name )? ( column_constraint )*
            {
            pushFollow(FOLLOW_id_column_def_in_column_def2560);
            name=id_column_def();

            state._fsp--;

            stream_id_column_def.add(name.getTree());
            // SqlParser.g:284:32: ( type_name )?
            int alt120=2;
            alt120 = dfa120.predict(input);
            switch (alt120) {
                case 1 :
                    // SqlParser.g:284:32: type_name
                    {
                    pushFollow(FOLLOW_type_name_in_column_def2562);
                    type_name316=type_name();

                    state._fsp--;

                    stream_type_name.add(type_name316.getTree());

                    }
                    break;

            }

            // SqlParser.g:284:43: ( column_constraint )*
            loop121:
            do {
                int alt121=2;
                alt121 = dfa121.predict(input);
                switch (alt121) {
            	case 1 :
            	    // SqlParser.g:284:43: column_constraint
            	    {
            	    pushFollow(FOLLOW_column_constraint_in_column_def2565);
            	    column_constraint317=column_constraint();

            	    state._fsp--;

            	    stream_column_constraint.add(column_constraint317.getTree());

            	    }
            	    break;

            	default :
            	    break loop121;
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
            // 285:1: -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? )
            {
                // SqlParser.g:285:4: ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_name.nextNode(), root_1);

                // SqlParser.g:285:12: ^( CONSTRAINTS ( column_constraint )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRAINTS, "CONSTRAINTS"), root_2);

                // SqlParser.g:285:26: ( column_constraint )*
                while ( stream_column_constraint.hasNext() ) {
                    adaptor.addChild(root_2, stream_column_constraint.nextTree());

                }
                stream_column_constraint.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:285:46: ( type_name )?
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
    // SqlParser.g:287:1: column_constraint : ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause ) -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? ) ;
    public final SqlParser.column_constraint_return column_constraint() throws RecognitionException {
        SqlParser.column_constraint_return retval = new SqlParser.column_constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONSTRAINT318=null;
        SqlParser.id_return name = null;

        SqlParser.column_constraint_pk_return column_constraint_pk319 = null;

        SqlParser.column_constraint_not_null_return column_constraint_not_null320 = null;

        SqlParser.column_constraint_unique_return column_constraint_unique321 = null;

        SqlParser.column_constraint_check_return column_constraint_check322 = null;

        SqlParser.column_constraint_default_return column_constraint_default323 = null;

        SqlParser.column_constraint_collate_return column_constraint_collate324 = null;

        SqlParser.fk_clause_return fk_clause325 = null;


        Object CONSTRAINT318_tree=null;
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
            // SqlParser.g:287:18: ( ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause ) -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? ) )
            // SqlParser.g:287:20: ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause )
            {
            // SqlParser.g:287:20: ( CONSTRAINT name= id )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==CONSTRAINT) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // SqlParser.g:287:21: CONSTRAINT name= id
                    {
                    CONSTRAINT318=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_column_constraint2591);  
                    stream_CONSTRAINT.add(CONSTRAINT318);

                    pushFollow(FOLLOW_id_in_column_constraint2595);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());

                    }
                    break;

            }

            // SqlParser.g:288:3: ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause )
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
                    // SqlParser.g:288:5: column_constraint_pk
                    {
                    pushFollow(FOLLOW_column_constraint_pk_in_column_constraint2603);
                    column_constraint_pk319=column_constraint_pk();

                    state._fsp--;

                    stream_column_constraint_pk.add(column_constraint_pk319.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:289:5: column_constraint_not_null
                    {
                    pushFollow(FOLLOW_column_constraint_not_null_in_column_constraint2609);
                    column_constraint_not_null320=column_constraint_not_null();

                    state._fsp--;

                    stream_column_constraint_not_null.add(column_constraint_not_null320.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:290:5: column_constraint_unique
                    {
                    pushFollow(FOLLOW_column_constraint_unique_in_column_constraint2615);
                    column_constraint_unique321=column_constraint_unique();

                    state._fsp--;

                    stream_column_constraint_unique.add(column_constraint_unique321.getTree());

                    }
                    break;
                case 4 :
                    // SqlParser.g:291:5: column_constraint_check
                    {
                    pushFollow(FOLLOW_column_constraint_check_in_column_constraint2621);
                    column_constraint_check322=column_constraint_check();

                    state._fsp--;

                    stream_column_constraint_check.add(column_constraint_check322.getTree());

                    }
                    break;
                case 5 :
                    // SqlParser.g:292:5: column_constraint_default
                    {
                    pushFollow(FOLLOW_column_constraint_default_in_column_constraint2627);
                    column_constraint_default323=column_constraint_default();

                    state._fsp--;

                    stream_column_constraint_default.add(column_constraint_default323.getTree());

                    }
                    break;
                case 6 :
                    // SqlParser.g:293:5: column_constraint_collate
                    {
                    pushFollow(FOLLOW_column_constraint_collate_in_column_constraint2633);
                    column_constraint_collate324=column_constraint_collate();

                    state._fsp--;

                    stream_column_constraint_collate.add(column_constraint_collate324.getTree());

                    }
                    break;
                case 7 :
                    // SqlParser.g:294:5: fk_clause
                    {
                    pushFollow(FOLLOW_fk_clause_in_column_constraint2639);
                    fk_clause325=fk_clause();

                    state._fsp--;

                    stream_fk_clause.add(fk_clause325.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: fk_clause, column_constraint_collate, column_constraint_check, column_constraint_default, column_constraint_pk, name, column_constraint_unique, column_constraint_not_null
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 295:1: -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? )
            {
                // SqlParser.g:295:4: ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMN_CONSTRAINT, "COLUMN_CONSTRAINT"), root_1);

                // SqlParser.g:296:3: ( column_constraint_pk )?
                if ( stream_column_constraint_pk.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_pk.nextTree());

                }
                stream_column_constraint_pk.reset();
                // SqlParser.g:297:3: ( column_constraint_not_null )?
                if ( stream_column_constraint_not_null.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_not_null.nextTree());

                }
                stream_column_constraint_not_null.reset();
                // SqlParser.g:298:3: ( column_constraint_unique )?
                if ( stream_column_constraint_unique.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_unique.nextTree());

                }
                stream_column_constraint_unique.reset();
                // SqlParser.g:299:3: ( column_constraint_check )?
                if ( stream_column_constraint_check.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_check.nextTree());

                }
                stream_column_constraint_check.reset();
                // SqlParser.g:300:3: ( column_constraint_default )?
                if ( stream_column_constraint_default.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_default.nextTree());

                }
                stream_column_constraint_default.reset();
                // SqlParser.g:301:3: ( column_constraint_collate )?
                if ( stream_column_constraint_collate.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_collate.nextTree());

                }
                stream_column_constraint_collate.reset();
                // SqlParser.g:302:3: ( fk_clause )?
                if ( stream_fk_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_fk_clause.nextTree());

                }
                stream_fk_clause.reset();
                // SqlParser.g:303:3: ( $name)?
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
    // SqlParser.g:305:1: column_constraint_pk : PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )? ;
    public final SqlParser.column_constraint_pk_return column_constraint_pk() throws RecognitionException {
        SqlParser.column_constraint_pk_return retval = new SqlParser.column_constraint_pk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRIMARY326=null;
        Token KEY327=null;
        Token set328=null;
        Token AUTOINCREMENT330=null;
        SqlParser.table_conflict_clause_return table_conflict_clause329 = null;


        Object PRIMARY326_tree=null;
        Object KEY327_tree=null;
        Object set328_tree=null;
        Object AUTOINCREMENT330_tree=null;

        try {
            // SqlParser.g:305:21: ( PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )? )
            // SqlParser.g:305:23: PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )?
            {
            root_0 = (Object)adaptor.nil();

            PRIMARY326=(Token)match(input,PRIMARY,FOLLOW_PRIMARY_in_column_constraint_pk2694); 
            PRIMARY326_tree = (Object)adaptor.create(PRIMARY326);
            root_0 = (Object)adaptor.becomeRoot(PRIMARY326_tree, root_0);

            KEY327=(Token)match(input,KEY,FOLLOW_KEY_in_column_constraint_pk2697); 
            // SqlParser.g:305:37: ( ASC | DESC )?
            int alt124=2;
            alt124 = dfa124.predict(input);
            switch (alt124) {
                case 1 :
                    // SqlParser.g:
                    {
                    set328=(Token)input.LT(1);
                    if ( input.LA(1)==ASC||input.LA(1)==DESC ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set328));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            // SqlParser.g:305:51: ( table_conflict_clause )?
            int alt125=2;
            alt125 = dfa125.predict(input);
            switch (alt125) {
                case 1 :
                    // SqlParser.g:305:51: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_pk2709);
                    table_conflict_clause329=table_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, table_conflict_clause329.getTree());

                    }
                    break;

            }

            // SqlParser.g:305:74: ( AUTOINCREMENT )?
            int alt126=2;
            alt126 = dfa126.predict(input);
            switch (alt126) {
                case 1 :
                    // SqlParser.g:305:75: AUTOINCREMENT
                    {
                    AUTOINCREMENT330=(Token)match(input,AUTOINCREMENT,FOLLOW_AUTOINCREMENT_in_column_constraint_pk2713); 
                    AUTOINCREMENT330_tree = (Object)adaptor.create(AUTOINCREMENT330);
                    adaptor.addChild(root_0, AUTOINCREMENT330_tree);


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
    // SqlParser.g:307:1: column_constraint_not_null : NOT NULL ( table_conflict_clause )? -> ^( NOTNULL ( table_conflict_clause )? ) ;
    public final SqlParser.column_constraint_not_null_return column_constraint_not_null() throws RecognitionException {
        SqlParser.column_constraint_not_null_return retval = new SqlParser.column_constraint_not_null_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT331=null;
        Token NULL332=null;
        SqlParser.table_conflict_clause_return table_conflict_clause333 = null;


        Object NOT331_tree=null;
        Object NULL332_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // SqlParser.g:307:27: ( NOT NULL ( table_conflict_clause )? -> ^( NOTNULL ( table_conflict_clause )? ) )
            // SqlParser.g:307:29: NOT NULL ( table_conflict_clause )?
            {
            NOT331=(Token)match(input,NOT,FOLLOW_NOT_in_column_constraint_not_null2722);  
            stream_NOT.add(NOT331);

            NULL332=(Token)match(input,NULL,FOLLOW_NULL_in_column_constraint_not_null2724);  
            stream_NULL.add(NULL332);

            // SqlParser.g:307:38: ( table_conflict_clause )?
            int alt127=2;
            alt127 = dfa127.predict(input);
            switch (alt127) {
                case 1 :
                    // SqlParser.g:307:38: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_not_null2726);
                    table_conflict_clause333=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause333.getTree());

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
            // 307:61: -> ^( NOTNULL ( table_conflict_clause )? )
            {
                // SqlParser.g:307:64: ^( NOTNULL ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOTNULL, "NOTNULL"), root_1);

                // SqlParser.g:307:74: ( table_conflict_clause )?
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
    // SqlParser.g:309:1: column_constraint_unique : UNIQUE ( table_conflict_clause )? ;
    public final SqlParser.column_constraint_unique_return column_constraint_unique() throws RecognitionException {
        SqlParser.column_constraint_unique_return retval = new SqlParser.column_constraint_unique_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNIQUE334=null;
        SqlParser.table_conflict_clause_return table_conflict_clause335 = null;


        Object UNIQUE334_tree=null;

        try {
            // SqlParser.g:309:25: ( UNIQUE ( table_conflict_clause )? )
            // SqlParser.g:309:27: UNIQUE ( table_conflict_clause )?
            {
            root_0 = (Object)adaptor.nil();

            UNIQUE334=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_column_constraint_unique2743); 
            UNIQUE334_tree = (Object)adaptor.create(UNIQUE334);
            root_0 = (Object)adaptor.becomeRoot(UNIQUE334_tree, root_0);

            // SqlParser.g:309:35: ( table_conflict_clause )?
            int alt128=2;
            alt128 = dfa128.predict(input);
            switch (alt128) {
                case 1 :
                    // SqlParser.g:309:35: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_unique2746);
                    table_conflict_clause335=table_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, table_conflict_clause335.getTree());

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
    // SqlParser.g:311:1: column_constraint_check : CHECK LPAREN expr RPAREN ;
    public final SqlParser.column_constraint_check_return column_constraint_check() throws RecognitionException {
        SqlParser.column_constraint_check_return retval = new SqlParser.column_constraint_check_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CHECK336=null;
        Token LPAREN337=null;
        Token RPAREN339=null;
        SqlParser.expr_return expr338 = null;


        Object CHECK336_tree=null;
        Object LPAREN337_tree=null;
        Object RPAREN339_tree=null;

        try {
            // SqlParser.g:311:24: ( CHECK LPAREN expr RPAREN )
            // SqlParser.g:311:26: CHECK LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            CHECK336=(Token)match(input,CHECK,FOLLOW_CHECK_in_column_constraint_check2754); 
            CHECK336_tree = (Object)adaptor.create(CHECK336);
            root_0 = (Object)adaptor.becomeRoot(CHECK336_tree, root_0);

            LPAREN337=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_column_constraint_check2757); 
            pushFollow(FOLLOW_expr_in_column_constraint_check2760);
            expr338=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr338.getTree());
            RPAREN339=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_column_constraint_check2762); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // SqlParser.g:313:1: column_constraint_default : DEFAULT ( SIGNED_NUMBER | literal_value | LPAREN expr RPAREN ) ;
    public final SqlParser.column_constraint_default_return column_constraint_default() throws RecognitionException {
        SqlParser.column_constraint_default_return retval = new SqlParser.column_constraint_default_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT340=null;
        Token SIGNED_NUMBER341=null;
        Token LPAREN343=null;
        Token RPAREN345=null;
        SqlParser.literal_value_return literal_value342 = null;

        SqlParser.expr_return expr344 = null;


        Object DEFAULT340_tree=null;
        Object SIGNED_NUMBER341_tree=null;
        Object LPAREN343_tree=null;
        Object RPAREN345_tree=null;

        try {
            // SqlParser.g:313:26: ( DEFAULT ( SIGNED_NUMBER | literal_value | LPAREN expr RPAREN ) )
            // SqlParser.g:313:28: DEFAULT ( SIGNED_NUMBER | literal_value | LPAREN expr RPAREN )
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT340=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_column_constraint_default2770); 
            DEFAULT340_tree = (Object)adaptor.create(DEFAULT340);
            root_0 = (Object)adaptor.becomeRoot(DEFAULT340_tree, root_0);

            // SqlParser.g:313:37: ( SIGNED_NUMBER | literal_value | LPAREN expr RPAREN )
            int alt129=3;
            alt129 = dfa129.predict(input);
            switch (alt129) {
                case 1 :
                    // SqlParser.g:313:38: SIGNED_NUMBER
                    {
                    SIGNED_NUMBER341=(Token)match(input,SIGNED_NUMBER,FOLLOW_SIGNED_NUMBER_in_column_constraint_default2774); 
                    SIGNED_NUMBER341_tree = (Object)adaptor.create(SIGNED_NUMBER341);
                    adaptor.addChild(root_0, SIGNED_NUMBER341_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:313:54: literal_value
                    {
                    pushFollow(FOLLOW_literal_value_in_column_constraint_default2778);
                    literal_value342=literal_value();

                    state._fsp--;

                    adaptor.addChild(root_0, literal_value342.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:313:70: LPAREN expr RPAREN
                    {
                    LPAREN343=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_column_constraint_default2782); 
                    pushFollow(FOLLOW_expr_in_column_constraint_default2785);
                    expr344=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr344.getTree());
                    RPAREN345=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_column_constraint_default2787); 

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
    // SqlParser.g:315:1: column_constraint_collate : COLLATE collation_name= id ;
    public final SqlParser.column_constraint_collate_return column_constraint_collate() throws RecognitionException {
        SqlParser.column_constraint_collate_return retval = new SqlParser.column_constraint_collate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLLATE346=null;
        SqlParser.id_return collation_name = null;


        Object COLLATE346_tree=null;

        try {
            // SqlParser.g:315:26: ( COLLATE collation_name= id )
            // SqlParser.g:315:28: COLLATE collation_name= id
            {
            root_0 = (Object)adaptor.nil();

            COLLATE346=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_column_constraint_collate2796); 
            COLLATE346_tree = (Object)adaptor.create(COLLATE346);
            root_0 = (Object)adaptor.becomeRoot(COLLATE346_tree, root_0);

            pushFollow(FOLLOW_id_in_column_constraint_collate2801);
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
    // SqlParser.g:317:1: table_constraint : ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk ) -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? ) ;
    public final SqlParser.table_constraint_return table_constraint() throws RecognitionException {
        SqlParser.table_constraint_return retval = new SqlParser.table_constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONSTRAINT347=null;
        SqlParser.id_return name = null;

        SqlParser.table_constraint_pk_return table_constraint_pk348 = null;

        SqlParser.table_constraint_unique_return table_constraint_unique349 = null;

        SqlParser.table_constraint_check_return table_constraint_check350 = null;

        SqlParser.table_constraint_fk_return table_constraint_fk351 = null;


        Object CONSTRAINT347_tree=null;
        RewriteRuleTokenStream stream_CONSTRAINT=new RewriteRuleTokenStream(adaptor,"token CONSTRAINT");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_table_constraint_pk=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_pk");
        RewriteRuleSubtreeStream stream_table_constraint_fk=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_fk");
        RewriteRuleSubtreeStream stream_table_constraint_unique=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_unique");
        RewriteRuleSubtreeStream stream_table_constraint_check=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_check");
        try {
            // SqlParser.g:317:17: ( ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk ) -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? ) )
            // SqlParser.g:317:19: ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk )
            {
            // SqlParser.g:317:19: ( CONSTRAINT name= id )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==CONSTRAINT) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // SqlParser.g:317:20: CONSTRAINT name= id
                    {
                    CONSTRAINT347=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_table_constraint2810);  
                    stream_CONSTRAINT.add(CONSTRAINT347);

                    pushFollow(FOLLOW_id_in_table_constraint2814);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());

                    }
                    break;

            }

            // SqlParser.g:318:3: ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk )
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
                    // SqlParser.g:318:5: table_constraint_pk
                    {
                    pushFollow(FOLLOW_table_constraint_pk_in_table_constraint2822);
                    table_constraint_pk348=table_constraint_pk();

                    state._fsp--;

                    stream_table_constraint_pk.add(table_constraint_pk348.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:319:5: table_constraint_unique
                    {
                    pushFollow(FOLLOW_table_constraint_unique_in_table_constraint2828);
                    table_constraint_unique349=table_constraint_unique();

                    state._fsp--;

                    stream_table_constraint_unique.add(table_constraint_unique349.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:320:5: table_constraint_check
                    {
                    pushFollow(FOLLOW_table_constraint_check_in_table_constraint2834);
                    table_constraint_check350=table_constraint_check();

                    state._fsp--;

                    stream_table_constraint_check.add(table_constraint_check350.getTree());

                    }
                    break;
                case 4 :
                    // SqlParser.g:321:5: table_constraint_fk
                    {
                    pushFollow(FOLLOW_table_constraint_fk_in_table_constraint2840);
                    table_constraint_fk351=table_constraint_fk();

                    state._fsp--;

                    stream_table_constraint_fk.add(table_constraint_fk351.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: table_constraint_pk, name, table_constraint_unique, table_constraint_fk, table_constraint_check
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 322:1: -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? )
            {
                // SqlParser.g:322:4: ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TABLE_CONSTRAINT, "TABLE_CONSTRAINT"), root_1);

                // SqlParser.g:323:3: ( table_constraint_pk )?
                if ( stream_table_constraint_pk.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_pk.nextTree());

                }
                stream_table_constraint_pk.reset();
                // SqlParser.g:324:3: ( table_constraint_unique )?
                if ( stream_table_constraint_unique.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_unique.nextTree());

                }
                stream_table_constraint_unique.reset();
                // SqlParser.g:325:3: ( table_constraint_check )?
                if ( stream_table_constraint_check.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_check.nextTree());

                }
                stream_table_constraint_check.reset();
                // SqlParser.g:326:3: ( table_constraint_fk )?
                if ( stream_table_constraint_fk.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_fk.nextTree());

                }
                stream_table_constraint_fk.reset();
                // SqlParser.g:327:3: ( $name)?
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
    // SqlParser.g:329:1: table_constraint_pk : PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) ;
    public final SqlParser.table_constraint_pk_return table_constraint_pk() throws RecognitionException {
        SqlParser.table_constraint_pk_return retval = new SqlParser.table_constraint_pk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRIMARY352=null;
        Token KEY353=null;
        Token LPAREN354=null;
        Token COMMA355=null;
        Token RPAREN356=null;
        List list_indexed_columns=null;
        SqlParser.table_conflict_clause_return table_conflict_clause357 = null;

        SqlParser.id_return indexed_columns = null;
         indexed_columns = null;
        Object PRIMARY352_tree=null;
        Object KEY353_tree=null;
        Object LPAREN354_tree=null;
        Object COMMA355_tree=null;
        Object RPAREN356_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_PRIMARY=new RewriteRuleTokenStream(adaptor,"token PRIMARY");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // SqlParser.g:329:20: ( PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) )
            // SqlParser.g:329:22: PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )?
            {
            PRIMARY352=(Token)match(input,PRIMARY,FOLLOW_PRIMARY_in_table_constraint_pk2880);  
            stream_PRIMARY.add(PRIMARY352);

            KEY353=(Token)match(input,KEY,FOLLOW_KEY_in_table_constraint_pk2882);  
            stream_KEY.add(KEY353);

            LPAREN354=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_pk2886);  
            stream_LPAREN.add(LPAREN354);

            pushFollow(FOLLOW_id_in_table_constraint_pk2890);
            indexed_columns=id();

            state._fsp--;

            stream_id.add(indexed_columns.getTree());
            if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            list_indexed_columns.add(indexed_columns.getTree());

            // SqlParser.g:330:30: ( COMMA indexed_columns+= id )*
            loop132:
            do {
                int alt132=2;
                int LA132_0 = input.LA(1);

                if ( (LA132_0==COMMA) ) {
                    alt132=1;
                }


                switch (alt132) {
            	case 1 :
            	    // SqlParser.g:330:31: COMMA indexed_columns+= id
            	    {
            	    COMMA355=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_pk2893);  
            	    stream_COMMA.add(COMMA355);

            	    pushFollow(FOLLOW_id_in_table_constraint_pk2897);
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

            RPAREN356=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_pk2901);  
            stream_RPAREN.add(RPAREN356);

            // SqlParser.g:330:66: ( table_conflict_clause )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==ON) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // SqlParser.g:330:66: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_table_constraint_pk2903);
                    table_conflict_clause357=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause357.getTree());

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
            // 331:1: -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
            {
                // SqlParser.g:331:4: ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_PRIMARY.nextNode(), root_1);

                // SqlParser.g:331:14: ^( COLUMNS ( $indexed_columns)+ )
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
                // SqlParser.g:331:43: ( table_conflict_clause )?
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
    // SqlParser.g:333:1: table_constraint_unique : UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) ;
    public final SqlParser.table_constraint_unique_return table_constraint_unique() throws RecognitionException {
        SqlParser.table_constraint_unique_return retval = new SqlParser.table_constraint_unique_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNIQUE358=null;
        Token LPAREN359=null;
        Token COMMA360=null;
        Token RPAREN361=null;
        List list_indexed_columns=null;
        SqlParser.table_conflict_clause_return table_conflict_clause362 = null;

        SqlParser.id_return indexed_columns = null;
         indexed_columns = null;
        Object UNIQUE358_tree=null;
        Object LPAREN359_tree=null;
        Object COMMA360_tree=null;
        Object RPAREN361_tree=null;
        RewriteRuleTokenStream stream_UNIQUE=new RewriteRuleTokenStream(adaptor,"token UNIQUE");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // SqlParser.g:333:24: ( UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) )
            // SqlParser.g:333:26: UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )?
            {
            UNIQUE358=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_table_constraint_unique2928);  
            stream_UNIQUE.add(UNIQUE358);

            LPAREN359=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_unique2932);  
            stream_LPAREN.add(LPAREN359);

            pushFollow(FOLLOW_id_in_table_constraint_unique2936);
            indexed_columns=id();

            state._fsp--;

            stream_id.add(indexed_columns.getTree());
            if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            list_indexed_columns.add(indexed_columns.getTree());

            // SqlParser.g:334:30: ( COMMA indexed_columns+= id )*
            loop134:
            do {
                int alt134=2;
                int LA134_0 = input.LA(1);

                if ( (LA134_0==COMMA) ) {
                    alt134=1;
                }


                switch (alt134) {
            	case 1 :
            	    // SqlParser.g:334:31: COMMA indexed_columns+= id
            	    {
            	    COMMA360=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_unique2939);  
            	    stream_COMMA.add(COMMA360);

            	    pushFollow(FOLLOW_id_in_table_constraint_unique2943);
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

            RPAREN361=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_unique2947);  
            stream_RPAREN.add(RPAREN361);

            // SqlParser.g:334:66: ( table_conflict_clause )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==ON) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // SqlParser.g:334:66: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_table_constraint_unique2949);
                    table_conflict_clause362=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause362.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: indexed_columns, UNIQUE, table_conflict_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: indexed_columns
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_indexed_columns=new RewriteRuleSubtreeStream(adaptor,"token indexed_columns",list_indexed_columns);
            root_0 = (Object)adaptor.nil();
            // 335:1: -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
            {
                // SqlParser.g:335:4: ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_UNIQUE.nextNode(), root_1);

                // SqlParser.g:335:13: ^( COLUMNS ( $indexed_columns)+ )
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
                // SqlParser.g:335:42: ( table_conflict_clause )?
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
    // SqlParser.g:337:1: table_constraint_check : CHECK LPAREN expr RPAREN ;
    public final SqlParser.table_constraint_check_return table_constraint_check() throws RecognitionException {
        SqlParser.table_constraint_check_return retval = new SqlParser.table_constraint_check_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CHECK363=null;
        Token LPAREN364=null;
        Token RPAREN366=null;
        SqlParser.expr_return expr365 = null;


        Object CHECK363_tree=null;
        Object LPAREN364_tree=null;
        Object RPAREN366_tree=null;

        try {
            // SqlParser.g:337:23: ( CHECK LPAREN expr RPAREN )
            // SqlParser.g:337:25: CHECK LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            CHECK363=(Token)match(input,CHECK,FOLLOW_CHECK_in_table_constraint_check2974); 
            CHECK363_tree = (Object)adaptor.create(CHECK363);
            root_0 = (Object)adaptor.becomeRoot(CHECK363_tree, root_0);

            LPAREN364=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_check2977); 
            pushFollow(FOLLOW_expr_in_table_constraint_check2980);
            expr365=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr365.getTree());
            RPAREN366=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_check2982); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // SqlParser.g:339:1: table_constraint_fk : FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause ) ;
    public final SqlParser.table_constraint_fk_return table_constraint_fk() throws RecognitionException {
        SqlParser.table_constraint_fk_return retval = new SqlParser.table_constraint_fk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOREIGN367=null;
        Token KEY368=null;
        Token LPAREN369=null;
        Token COMMA370=null;
        Token RPAREN371=null;
        List list_column_names=null;
        SqlParser.fk_clause_return fk_clause372 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object FOREIGN367_tree=null;
        Object KEY368_tree=null;
        Object LPAREN369_tree=null;
        Object COMMA370_tree=null;
        Object RPAREN371_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_FOREIGN=new RewriteRuleTokenStream(adaptor,"token FOREIGN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_fk_clause=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause");
        try {
            // SqlParser.g:339:20: ( FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause ) )
            // SqlParser.g:339:22: FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause
            {
            FOREIGN367=(Token)match(input,FOREIGN,FOLLOW_FOREIGN_in_table_constraint_fk2990);  
            stream_FOREIGN.add(FOREIGN367);

            KEY368=(Token)match(input,KEY,FOLLOW_KEY_in_table_constraint_fk2992);  
            stream_KEY.add(KEY368);

            LPAREN369=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_fk2994);  
            stream_LPAREN.add(LPAREN369);

            pushFollow(FOLLOW_id_in_table_constraint_fk2998);
            column_names=id();

            state._fsp--;

            stream_id.add(column_names.getTree());
            if (list_column_names==null) list_column_names=new ArrayList();
            list_column_names.add(column_names.getTree());

            // SqlParser.g:339:58: ( COMMA column_names+= id )*
            loop136:
            do {
                int alt136=2;
                int LA136_0 = input.LA(1);

                if ( (LA136_0==COMMA) ) {
                    alt136=1;
                }


                switch (alt136) {
            	case 1 :
            	    // SqlParser.g:339:59: COMMA column_names+= id
            	    {
            	    COMMA370=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_fk3001);  
            	    stream_COMMA.add(COMMA370);

            	    pushFollow(FOLLOW_id_in_table_constraint_fk3005);
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

            RPAREN371=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_fk3009);  
            stream_RPAREN.add(RPAREN371);

            pushFollow(FOLLOW_fk_clause_in_table_constraint_fk3011);
            fk_clause372=fk_clause();

            state._fsp--;

            stream_fk_clause.add(fk_clause372.getTree());


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
            // 340:1: -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause )
            {
                // SqlParser.g:340:4: ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FOREIGN.nextNode(), root_1);

                // SqlParser.g:340:14: ^( COLUMNS ( $column_names)+ )
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
    // SqlParser.g:342:1: fk_clause : REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )? -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )+ ( fk_clause_deferrable )? ) ;
    public final SqlParser.fk_clause_return fk_clause() throws RecognitionException {
        SqlParser.fk_clause_return retval = new SqlParser.fk_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REFERENCES373=null;
        Token LPAREN374=null;
        Token COMMA375=null;
        Token RPAREN376=null;
        List list_column_names=null;
        SqlParser.id_return foreign_table = null;

        SqlParser.fk_clause_action_return fk_clause_action377 = null;

        SqlParser.fk_clause_deferrable_return fk_clause_deferrable378 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object REFERENCES373_tree=null;
        Object LPAREN374_tree=null;
        Object COMMA375_tree=null;
        Object RPAREN376_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_REFERENCES=new RewriteRuleTokenStream(adaptor,"token REFERENCES");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_fk_clause_action=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause_action");
        RewriteRuleSubtreeStream stream_fk_clause_deferrable=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause_deferrable");
        try {
            // SqlParser.g:342:10: ( REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )? -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )+ ( fk_clause_deferrable )? ) )
            // SqlParser.g:342:12: REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )?
            {
            REFERENCES373=(Token)match(input,REFERENCES,FOLLOW_REFERENCES_in_fk_clause3034);  
            stream_REFERENCES.add(REFERENCES373);

            pushFollow(FOLLOW_id_in_fk_clause3038);
            foreign_table=id();

            state._fsp--;

            stream_id.add(foreign_table.getTree());
            // SqlParser.g:342:40: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==LPAREN) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // SqlParser.g:342:41: LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                    {
                    LPAREN374=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_fk_clause3041);  
                    stream_LPAREN.add(LPAREN374);

                    pushFollow(FOLLOW_id_in_fk_clause3045);
                    column_names=id();

                    state._fsp--;

                    stream_id.add(column_names.getTree());
                    if (list_column_names==null) list_column_names=new ArrayList();
                    list_column_names.add(column_names.getTree());

                    // SqlParser.g:342:65: ( COMMA column_names+= id )*
                    loop137:
                    do {
                        int alt137=2;
                        int LA137_0 = input.LA(1);

                        if ( (LA137_0==COMMA) ) {
                            alt137=1;
                        }


                        switch (alt137) {
                    	case 1 :
                    	    // SqlParser.g:342:66: COMMA column_names+= id
                    	    {
                    	    COMMA375=(Token)match(input,COMMA,FOLLOW_COMMA_in_fk_clause3048);  
                    	    stream_COMMA.add(COMMA375);

                    	    pushFollow(FOLLOW_id_in_fk_clause3052);
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

                    RPAREN376=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_fk_clause3056);  
                    stream_RPAREN.add(RPAREN376);


                    }
                    break;

            }

            // SqlParser.g:343:3: ( fk_clause_action )+
            int cnt139=0;
            loop139:
            do {
                int alt139=2;
                alt139 = dfa139.predict(input);
                switch (alt139) {
            	case 1 :
            	    // SqlParser.g:343:3: fk_clause_action
            	    {
            	    pushFollow(FOLLOW_fk_clause_action_in_fk_clause3062);
            	    fk_clause_action377=fk_clause_action();

            	    state._fsp--;

            	    stream_fk_clause_action.add(fk_clause_action377.getTree());

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

            // SqlParser.g:343:21: ( fk_clause_deferrable )?
            int alt140=2;
            alt140 = dfa140.predict(input);
            switch (alt140) {
                case 1 :
                    // SqlParser.g:343:21: fk_clause_deferrable
                    {
                    pushFollow(FOLLOW_fk_clause_deferrable_in_fk_clause3065);
                    fk_clause_deferrable378=fk_clause_deferrable();

                    state._fsp--;

                    stream_fk_clause_deferrable.add(fk_clause_deferrable378.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: foreign_table, REFERENCES, column_names, fk_clause_deferrable, fk_clause_action
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
            // 344:1: -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )+ ( fk_clause_deferrable )? )
            {
                // SqlParser.g:344:4: ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )+ ( fk_clause_deferrable )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_REFERENCES.nextNode(), root_1);

                adaptor.addChild(root_1, stream_foreign_table.nextTree());
                // SqlParser.g:344:32: ^( COLUMNS ( $column_names)+ )
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
                // SqlParser.g:344:76: ( fk_clause_deferrable )?
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
    // SqlParser.g:346:1: fk_clause_action : ( ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT ) | MATCH id );
    public final SqlParser.fk_clause_action_return fk_clause_action() throws RecognitionException {
        SqlParser.fk_clause_action_return retval = new SqlParser.fk_clause_action_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ON379=null;
        Token set380=null;
        Token SET381=null;
        Token NULL382=null;
        Token SET383=null;
        Token DEFAULT384=null;
        Token CASCADE385=null;
        Token RESTRICT386=null;
        Token MATCH387=null;
        SqlParser.id_return id388 = null;


        Object ON379_tree=null;
        Object set380_tree=null;
        Object SET381_tree=null;
        Object NULL382_tree=null;
        Object SET383_tree=null;
        Object DEFAULT384_tree=null;
        Object CASCADE385_tree=null;
        Object RESTRICT386_tree=null;
        Object MATCH387_tree=null;

        try {
            // SqlParser.g:347:3: ( ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT ) | MATCH id )
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
                    // SqlParser.g:347:5: ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT )
                    {
                    root_0 = (Object)adaptor.nil();

                    ON379=(Token)match(input,ON,FOLLOW_ON_in_fk_clause_action3099); 
                    ON379_tree = (Object)adaptor.create(ON379);
                    root_0 = (Object)adaptor.becomeRoot(ON379_tree, root_0);

                    set380=(Token)input.LT(1);
                    if ( input.LA(1)==DELETE||input.LA(1)==INSERT||input.LA(1)==UPDATE ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set380));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // SqlParser.g:347:36: ( SET NULL | SET DEFAULT | CASCADE | RESTRICT )
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
                            // SqlParser.g:347:37: SET NULL
                            {
                            SET381=(Token)match(input,SET,FOLLOW_SET_in_fk_clause_action3115); 
                            NULL382=(Token)match(input,NULL,FOLLOW_NULL_in_fk_clause_action3118); 
                            NULL382_tree = (Object)adaptor.create(NULL382);
                            adaptor.addChild(root_0, NULL382_tree);


                            }
                            break;
                        case 2 :
                            // SqlParser.g:347:49: SET DEFAULT
                            {
                            SET383=(Token)match(input,SET,FOLLOW_SET_in_fk_clause_action3122); 
                            DEFAULT384=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_fk_clause_action3125); 
                            DEFAULT384_tree = (Object)adaptor.create(DEFAULT384);
                            adaptor.addChild(root_0, DEFAULT384_tree);


                            }
                            break;
                        case 3 :
                            // SqlParser.g:347:64: CASCADE
                            {
                            CASCADE385=(Token)match(input,CASCADE,FOLLOW_CASCADE_in_fk_clause_action3129); 
                            CASCADE385_tree = (Object)adaptor.create(CASCADE385);
                            adaptor.addChild(root_0, CASCADE385_tree);


                            }
                            break;
                        case 4 :
                            // SqlParser.g:347:74: RESTRICT
                            {
                            RESTRICT386=(Token)match(input,RESTRICT,FOLLOW_RESTRICT_in_fk_clause_action3133); 
                            RESTRICT386_tree = (Object)adaptor.create(RESTRICT386);
                            adaptor.addChild(root_0, RESTRICT386_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:348:5: MATCH id
                    {
                    root_0 = (Object)adaptor.nil();

                    MATCH387=(Token)match(input,MATCH,FOLLOW_MATCH_in_fk_clause_action3140); 
                    MATCH387_tree = (Object)adaptor.create(MATCH387);
                    root_0 = (Object)adaptor.becomeRoot(MATCH387_tree, root_0);

                    pushFollow(FOLLOW_id_in_fk_clause_action3143);
                    id388=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id388.getTree());

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
    // SqlParser.g:350:1: fk_clause_deferrable : ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )? ;
    public final SqlParser.fk_clause_deferrable_return fk_clause_deferrable() throws RecognitionException {
        SqlParser.fk_clause_deferrable_return retval = new SqlParser.fk_clause_deferrable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT389=null;
        Token DEFERRABLE390=null;
        Token INITIALLY391=null;
        Token DEFERRED392=null;
        Token INITIALLY393=null;
        Token IMMEDIATE394=null;

        Object NOT389_tree=null;
        Object DEFERRABLE390_tree=null;
        Object INITIALLY391_tree=null;
        Object DEFERRED392_tree=null;
        Object INITIALLY393_tree=null;
        Object IMMEDIATE394_tree=null;

        try {
            // SqlParser.g:350:21: ( ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )? )
            // SqlParser.g:350:23: ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:350:23: ( NOT )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==NOT) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // SqlParser.g:350:24: NOT
                    {
                    NOT389=(Token)match(input,NOT,FOLLOW_NOT_in_fk_clause_deferrable3151); 
                    NOT389_tree = (Object)adaptor.create(NOT389);
                    adaptor.addChild(root_0, NOT389_tree);


                    }
                    break;

            }

            DEFERRABLE390=(Token)match(input,DEFERRABLE,FOLLOW_DEFERRABLE_in_fk_clause_deferrable3155); 
            DEFERRABLE390_tree = (Object)adaptor.create(DEFERRABLE390);
            root_0 = (Object)adaptor.becomeRoot(DEFERRABLE390_tree, root_0);

            // SqlParser.g:350:42: ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?
            int alt144=3;
            alt144 = dfa144.predict(input);
            switch (alt144) {
                case 1 :
                    // SqlParser.g:350:43: INITIALLY DEFERRED
                    {
                    INITIALLY391=(Token)match(input,INITIALLY,FOLLOW_INITIALLY_in_fk_clause_deferrable3159); 
                    DEFERRED392=(Token)match(input,DEFERRED,FOLLOW_DEFERRED_in_fk_clause_deferrable3162); 
                    DEFERRED392_tree = (Object)adaptor.create(DEFERRED392);
                    adaptor.addChild(root_0, DEFERRED392_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:350:65: INITIALLY IMMEDIATE
                    {
                    INITIALLY393=(Token)match(input,INITIALLY,FOLLOW_INITIALLY_in_fk_clause_deferrable3166); 
                    IMMEDIATE394=(Token)match(input,IMMEDIATE,FOLLOW_IMMEDIATE_in_fk_clause_deferrable3169); 
                    IMMEDIATE394_tree = (Object)adaptor.create(IMMEDIATE394);
                    adaptor.addChild(root_0, IMMEDIATE394_tree);


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
    // SqlParser.g:353:1: drop_table_stmt : DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) ) ;
    public final SqlParser.drop_table_stmt_return drop_table_stmt() throws RecognitionException {
        SqlParser.drop_table_stmt_return retval = new SqlParser.drop_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP395=null;
        Token TABLE396=null;
        Token IF397=null;
        Token EXISTS398=null;
        Token DOT399=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;


        Object DROP395_tree=null;
        Object TABLE396_tree=null;
        Object IF397_tree=null;
        Object EXISTS398_tree=null;
        Object DOT399_tree=null;
        RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // SqlParser.g:353:16: ( DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) ) )
            // SqlParser.g:353:18: DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id
            {
            DROP395=(Token)match(input,DROP,FOLLOW_DROP_in_drop_table_stmt3179);  
            stream_DROP.add(DROP395);

            TABLE396=(Token)match(input,TABLE,FOLLOW_TABLE_in_drop_table_stmt3181);  
            stream_TABLE.add(TABLE396);

            // SqlParser.g:353:29: ( IF EXISTS )?
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
                    // SqlParser.g:353:30: IF EXISTS
                    {
                    IF397=(Token)match(input,IF,FOLLOW_IF_in_drop_table_stmt3184);  
                    stream_IF.add(IF397);

                    EXISTS398=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_table_stmt3186);  
                    stream_EXISTS.add(EXISTS398);


                    }
                    break;

            }

            // SqlParser.g:353:42: (database_name= id DOT )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==ID) ) {
                int LA146_1 = input.LA(2);

                if ( (LA146_1==DOT) ) {
                    alt146=1;
                }
            }
            else if ( ((LA146_0>=ABORT && LA146_0<=WHERE)) ) {
                int LA146_2 = input.LA(2);

                if ( (LA146_2==DOT) ) {
                    alt146=1;
                }
            }
            switch (alt146) {
                case 1 :
                    // SqlParser.g:353:43: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_table_stmt3193);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT399=(Token)match(input,DOT,FOLLOW_DOT_in_drop_table_stmt3195);  
                    stream_DOT.add(DOT399);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_table_stmt3201);
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
            // 354:1: -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) )
            {
                // SqlParser.g:354:4: ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DROP_TABLE, "DROP_TABLE"), root_1);

                // SqlParser.g:354:17: ^( OPTIONS ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:354:27: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:354:36: ^( $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                // SqlParser.g:354:50: ( $database_name)?
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
    // SqlParser.g:357:1: alter_table_stmt : ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def ) ;
    public final SqlParser.alter_table_stmt_return alter_table_stmt() throws RecognitionException {
        SqlParser.alter_table_stmt_return retval = new SqlParser.alter_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ALTER400=null;
        Token TABLE401=null;
        Token DOT402=null;
        Token RENAME403=null;
        Token TO404=null;
        Token ADD405=null;
        Token COLUMN406=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.id_return new_table_name = null;

        SqlParser.column_def_return column_def407 = null;


        Object ALTER400_tree=null;
        Object TABLE401_tree=null;
        Object DOT402_tree=null;
        Object RENAME403_tree=null;
        Object TO404_tree=null;
        Object ADD405_tree=null;
        Object COLUMN406_tree=null;

        try {
            // SqlParser.g:357:17: ( ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def ) )
            // SqlParser.g:357:19: ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def )
            {
            root_0 = (Object)adaptor.nil();

            ALTER400=(Token)match(input,ALTER,FOLLOW_ALTER_in_alter_table_stmt3231); 
            ALTER400_tree = (Object)adaptor.create(ALTER400);
            adaptor.addChild(root_0, ALTER400_tree);

            TABLE401=(Token)match(input,TABLE,FOLLOW_TABLE_in_alter_table_stmt3233); 
            TABLE401_tree = (Object)adaptor.create(TABLE401);
            adaptor.addChild(root_0, TABLE401_tree);

            // SqlParser.g:357:31: (database_name= id DOT )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==ID) ) {
                int LA147_1 = input.LA(2);

                if ( (LA147_1==DOT) ) {
                    alt147=1;
                }
            }
            else if ( ((LA147_0>=ABORT && LA147_0<=WHERE)) ) {
                int LA147_2 = input.LA(2);

                if ( (LA147_2==DOT) ) {
                    alt147=1;
                }
            }
            switch (alt147) {
                case 1 :
                    // SqlParser.g:357:32: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_alter_table_stmt3238);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT402=(Token)match(input,DOT,FOLLOW_DOT_in_alter_table_stmt3240); 
                    DOT402_tree = (Object)adaptor.create(DOT402);
                    adaptor.addChild(root_0, DOT402_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_alter_table_stmt3246);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:357:69: ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def )
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
                    // SqlParser.g:357:70: RENAME TO new_table_name= id
                    {
                    RENAME403=(Token)match(input,RENAME,FOLLOW_RENAME_in_alter_table_stmt3249); 
                    RENAME403_tree = (Object)adaptor.create(RENAME403);
                    adaptor.addChild(root_0, RENAME403_tree);

                    TO404=(Token)match(input,TO,FOLLOW_TO_in_alter_table_stmt3251); 
                    TO404_tree = (Object)adaptor.create(TO404);
                    adaptor.addChild(root_0, TO404_tree);

                    pushFollow(FOLLOW_id_in_alter_table_stmt3255);
                    new_table_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, new_table_name.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:357:100: ADD ( COLUMN )? column_def
                    {
                    ADD405=(Token)match(input,ADD,FOLLOW_ADD_in_alter_table_stmt3259); 
                    ADD405_tree = (Object)adaptor.create(ADD405);
                    adaptor.addChild(root_0, ADD405_tree);

                    // SqlParser.g:357:104: ( COLUMN )?
                    int alt148=2;
                    int LA148_0 = input.LA(1);

                    if ( (LA148_0==COLUMN) ) {
                        alt148=1;
                    }
                    switch (alt148) {
                        case 1 :
                            // SqlParser.g:357:105: COLUMN
                            {
                            COLUMN406=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_alter_table_stmt3262); 
                            COLUMN406_tree = (Object)adaptor.create(COLUMN406);
                            adaptor.addChild(root_0, COLUMN406_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_column_def_in_alter_table_stmt3266);
                    column_def407=column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, column_def407.getTree());

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
    // SqlParser.g:360:1: create_view_stmt : CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS select_stmt ;
    public final SqlParser.create_view_stmt_return create_view_stmt() throws RecognitionException {
        SqlParser.create_view_stmt_return retval = new SqlParser.create_view_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE408=null;
        Token TEMPORARY409=null;
        Token VIEW410=null;
        Token IF411=null;
        Token NOT412=null;
        Token EXISTS413=null;
        Token DOT414=null;
        Token AS415=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return view_name = null;

        SqlParser.select_stmt_return select_stmt416 = null;


        Object CREATE408_tree=null;
        Object TEMPORARY409_tree=null;
        Object VIEW410_tree=null;
        Object IF411_tree=null;
        Object NOT412_tree=null;
        Object EXISTS413_tree=null;
        Object DOT414_tree=null;
        Object AS415_tree=null;

        try {
            // SqlParser.g:360:17: ( CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS select_stmt )
            // SqlParser.g:360:19: CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS select_stmt
            {
            root_0 = (Object)adaptor.nil();

            CREATE408=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_view_stmt3275); 
            CREATE408_tree = (Object)adaptor.create(CREATE408);
            adaptor.addChild(root_0, CREATE408_tree);

            // SqlParser.g:360:26: ( TEMPORARY )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==TEMPORARY) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // SqlParser.g:360:26: TEMPORARY
                    {
                    TEMPORARY409=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_view_stmt3277); 
                    TEMPORARY409_tree = (Object)adaptor.create(TEMPORARY409);
                    adaptor.addChild(root_0, TEMPORARY409_tree);


                    }
                    break;

            }

            VIEW410=(Token)match(input,VIEW,FOLLOW_VIEW_in_create_view_stmt3280); 
            VIEW410_tree = (Object)adaptor.create(VIEW410);
            adaptor.addChild(root_0, VIEW410_tree);

            // SqlParser.g:360:42: ( IF NOT EXISTS )?
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
                    // SqlParser.g:360:43: IF NOT EXISTS
                    {
                    IF411=(Token)match(input,IF,FOLLOW_IF_in_create_view_stmt3283); 
                    IF411_tree = (Object)adaptor.create(IF411);
                    adaptor.addChild(root_0, IF411_tree);

                    NOT412=(Token)match(input,NOT,FOLLOW_NOT_in_create_view_stmt3285); 
                    NOT412_tree = (Object)adaptor.create(NOT412);
                    adaptor.addChild(root_0, NOT412_tree);

                    EXISTS413=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_view_stmt3287); 
                    EXISTS413_tree = (Object)adaptor.create(EXISTS413);
                    adaptor.addChild(root_0, EXISTS413_tree);


                    }
                    break;

            }

            // SqlParser.g:360:59: (database_name= id DOT )?
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
                    // SqlParser.g:360:60: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_view_stmt3294);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT414=(Token)match(input,DOT,FOLLOW_DOT_in_create_view_stmt3296); 
                    DOT414_tree = (Object)adaptor.create(DOT414);
                    adaptor.addChild(root_0, DOT414_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_view_stmt3302);
            view_name=id();

            state._fsp--;

            adaptor.addChild(root_0, view_name.getTree());
            AS415=(Token)match(input,AS,FOLLOW_AS_in_create_view_stmt3304); 
            AS415_tree = (Object)adaptor.create(AS415);
            adaptor.addChild(root_0, AS415_tree);

            pushFollow(FOLLOW_select_stmt_in_create_view_stmt3306);
            select_stmt416=select_stmt();

            state._fsp--;

            adaptor.addChild(root_0, select_stmt416.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // SqlParser.g:363:1: drop_view_stmt : DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id ;
    public final SqlParser.drop_view_stmt_return drop_view_stmt() throws RecognitionException {
        SqlParser.drop_view_stmt_return retval = new SqlParser.drop_view_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP417=null;
        Token VIEW418=null;
        Token IF419=null;
        Token EXISTS420=null;
        Token DOT421=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return view_name = null;


        Object DROP417_tree=null;
        Object VIEW418_tree=null;
        Object IF419_tree=null;
        Object EXISTS420_tree=null;
        Object DOT421_tree=null;

        try {
            // SqlParser.g:363:15: ( DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id )
            // SqlParser.g:363:17: DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id
            {
            root_0 = (Object)adaptor.nil();

            DROP417=(Token)match(input,DROP,FOLLOW_DROP_in_drop_view_stmt3314); 
            DROP417_tree = (Object)adaptor.create(DROP417);
            adaptor.addChild(root_0, DROP417_tree);

            VIEW418=(Token)match(input,VIEW,FOLLOW_VIEW_in_drop_view_stmt3316); 
            VIEW418_tree = (Object)adaptor.create(VIEW418);
            adaptor.addChild(root_0, VIEW418_tree);

            // SqlParser.g:363:27: ( IF EXISTS )?
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
                    // SqlParser.g:363:28: IF EXISTS
                    {
                    IF419=(Token)match(input,IF,FOLLOW_IF_in_drop_view_stmt3319); 
                    IF419_tree = (Object)adaptor.create(IF419);
                    adaptor.addChild(root_0, IF419_tree);

                    EXISTS420=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_view_stmt3321); 
                    EXISTS420_tree = (Object)adaptor.create(EXISTS420);
                    adaptor.addChild(root_0, EXISTS420_tree);


                    }
                    break;

            }

            // SqlParser.g:363:40: (database_name= id DOT )?
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
                    // SqlParser.g:363:41: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_view_stmt3328);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT421=(Token)match(input,DOT,FOLLOW_DOT_in_drop_view_stmt3330); 
                    DOT421_tree = (Object)adaptor.create(DOT421);
                    adaptor.addChild(root_0, DOT421_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_view_stmt3336);
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
    // SqlParser.g:366:1: create_index_stmt : CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? ) ;
    public final SqlParser.create_index_stmt_return create_index_stmt() throws RecognitionException {
        SqlParser.create_index_stmt_return retval = new SqlParser.create_index_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE422=null;
        Token UNIQUE423=null;
        Token INDEX424=null;
        Token IF425=null;
        Token NOT426=null;
        Token EXISTS427=null;
        Token DOT428=null;
        Token ON429=null;
        Token LPAREN430=null;
        Token COMMA431=null;
        Token RPAREN432=null;
        List list_columns=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return index_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.indexed_column_return columns = null;
         columns = null;
        Object CREATE422_tree=null;
        Object UNIQUE423_tree=null;
        Object INDEX424_tree=null;
        Object IF425_tree=null;
        Object NOT426_tree=null;
        Object EXISTS427_tree=null;
        Object DOT428_tree=null;
        Object ON429_tree=null;
        Object LPAREN430_tree=null;
        Object COMMA431_tree=null;
        Object RPAREN432_tree=null;
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
            // SqlParser.g:366:18: ( CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? ) )
            // SqlParser.g:366:20: CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN
            {
            CREATE422=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_index_stmt3344);  
            stream_CREATE.add(CREATE422);

            // SqlParser.g:366:27: ( UNIQUE )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==UNIQUE) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // SqlParser.g:366:28: UNIQUE
                    {
                    UNIQUE423=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_create_index_stmt3347);  
                    stream_UNIQUE.add(UNIQUE423);


                    }
                    break;

            }

            INDEX424=(Token)match(input,INDEX,FOLLOW_INDEX_in_create_index_stmt3351);  
            stream_INDEX.add(INDEX424);

            // SqlParser.g:366:43: ( IF NOT EXISTS )?
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
                    // SqlParser.g:366:44: IF NOT EXISTS
                    {
                    IF425=(Token)match(input,IF,FOLLOW_IF_in_create_index_stmt3354);  
                    stream_IF.add(IF425);

                    NOT426=(Token)match(input,NOT,FOLLOW_NOT_in_create_index_stmt3356);  
                    stream_NOT.add(NOT426);

                    EXISTS427=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_index_stmt3358);  
                    stream_EXISTS.add(EXISTS427);


                    }
                    break;

            }

            // SqlParser.g:366:60: (database_name= id DOT )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==ID) ) {
                int LA157_1 = input.LA(2);

                if ( (LA157_1==DOT) ) {
                    alt157=1;
                }
            }
            else if ( ((LA157_0>=ABORT && LA157_0<=WHERE)) ) {
                int LA157_2 = input.LA(2);

                if ( (LA157_2==DOT) ) {
                    alt157=1;
                }
            }
            switch (alt157) {
                case 1 :
                    // SqlParser.g:366:61: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_index_stmt3365);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT428=(Token)match(input,DOT,FOLLOW_DOT_in_create_index_stmt3367);  
                    stream_DOT.add(DOT428);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_index_stmt3373);
            index_name=id();

            state._fsp--;

            stream_id.add(index_name.getTree());
            ON429=(Token)match(input,ON,FOLLOW_ON_in_create_index_stmt3377);  
            stream_ON.add(ON429);

            pushFollow(FOLLOW_id_in_create_index_stmt3381);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());
            LPAREN430=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_index_stmt3383);  
            stream_LPAREN.add(LPAREN430);

            pushFollow(FOLLOW_indexed_column_in_create_index_stmt3387);
            columns=indexed_column();

            state._fsp--;

            stream_indexed_column.add(columns.getTree());
            if (list_columns==null) list_columns=new ArrayList();
            list_columns.add(columns.getTree());

            // SqlParser.g:367:51: ( COMMA columns+= indexed_column )*
            loop158:
            do {
                int alt158=2;
                int LA158_0 = input.LA(1);

                if ( (LA158_0==COMMA) ) {
                    alt158=1;
                }


                switch (alt158) {
            	case 1 :
            	    // SqlParser.g:367:52: COMMA columns+= indexed_column
            	    {
            	    COMMA431=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_index_stmt3390);  
            	    stream_COMMA.add(COMMA431);

            	    pushFollow(FOLLOW_indexed_column_in_create_index_stmt3394);
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

            RPAREN432=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_index_stmt3398);  
            stream_RPAREN.add(RPAREN432);



            // AST REWRITE
            // elements: index_name, EXISTS, UNIQUE, columns, database_name, table_name
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
            // 368:1: -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? )
            {
                // SqlParser.g:368:4: ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CREATE_INDEX, "CREATE_INDEX"), root_1);

                // SqlParser.g:368:19: ^( OPTIONS ( UNIQUE )? ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:368:29: ( UNIQUE )?
                if ( stream_UNIQUE.hasNext() ) {
                    adaptor.addChild(root_2, stream_UNIQUE.nextNode());

                }
                stream_UNIQUE.reset();
                // SqlParser.g:368:37: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:368:46: ^( $index_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_index_name.nextNode(), root_2);

                // SqlParser.g:368:60: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_table_name.nextTree());
                // SqlParser.g:368:89: ( ^( COLUMNS ( $columns)+ ) )?
                if ( stream_columns.hasNext() ) {
                    // SqlParser.g:368:89: ^( COLUMNS ( $columns)+ )
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
    // SqlParser.g:370:1: indexed_column : column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )? -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? ) ;
    public final SqlParser.indexed_column_return indexed_column() throws RecognitionException {
        SqlParser.indexed_column_return retval = new SqlParser.indexed_column_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLLATE433=null;
        Token ASC434=null;
        Token DESC435=null;
        SqlParser.id_return column_name = null;

        SqlParser.id_return collation_name = null;


        Object COLLATE433_tree=null;
        Object ASC434_tree=null;
        Object DESC435_tree=null;
        RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");
        RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
        RewriteRuleTokenStream stream_COLLATE=new RewriteRuleTokenStream(adaptor,"token COLLATE");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // SqlParser.g:370:15: (column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )? -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? ) )
            // SqlParser.g:370:17: column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )?
            {
            pushFollow(FOLLOW_id_in_indexed_column3444);
            column_name=id();

            state._fsp--;

            stream_id.add(column_name.getTree());
            // SqlParser.g:370:32: ( COLLATE collation_name= id )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==COLLATE) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // SqlParser.g:370:33: COLLATE collation_name= id
                    {
                    COLLATE433=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_indexed_column3447);  
                    stream_COLLATE.add(COLLATE433);

                    pushFollow(FOLLOW_id_in_indexed_column3451);
                    collation_name=id();

                    state._fsp--;

                    stream_id.add(collation_name.getTree());

                    }
                    break;

            }

            // SqlParser.g:370:61: ( ASC | DESC )?
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
                    // SqlParser.g:370:62: ASC
                    {
                    ASC434=(Token)match(input,ASC,FOLLOW_ASC_in_indexed_column3456);  
                    stream_ASC.add(ASC434);


                    }
                    break;
                case 2 :
                    // SqlParser.g:370:68: DESC
                    {
                    DESC435=(Token)match(input,DESC,FOLLOW_DESC_in_indexed_column3460);  
                    stream_DESC.add(DESC435);


                    }
                    break;

            }



            // AST REWRITE
            // elements: DESC, COLLATE, column_name, ASC, collation_name
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
            // 371:1: -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? )
            {
                // SqlParser.g:371:4: ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_column_name.nextNode(), root_1);

                // SqlParser.g:371:19: ( ^( COLLATE $collation_name) )?
                if ( stream_COLLATE.hasNext()||stream_collation_name.hasNext() ) {
                    // SqlParser.g:371:19: ^( COLLATE $collation_name)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_COLLATE.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_collation_name.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_COLLATE.reset();
                stream_collation_name.reset();
                // SqlParser.g:371:47: ( ASC )?
                if ( stream_ASC.hasNext() ) {
                    adaptor.addChild(root_1, stream_ASC.nextNode());

                }
                stream_ASC.reset();
                // SqlParser.g:371:52: ( DESC )?
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
    // SqlParser.g:374:1: drop_index_stmt : DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) ) ;
    public final SqlParser.drop_index_stmt_return drop_index_stmt() throws RecognitionException {
        SqlParser.drop_index_stmt_return retval = new SqlParser.drop_index_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP436=null;
        Token INDEX437=null;
        Token IF438=null;
        Token EXISTS439=null;
        Token DOT440=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return index_name = null;


        Object DROP436_tree=null;
        Object INDEX437_tree=null;
        Object IF438_tree=null;
        Object EXISTS439_tree=null;
        Object DOT440_tree=null;
        RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // SqlParser.g:374:16: ( DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) ) )
            // SqlParser.g:374:18: DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id
            {
            DROP436=(Token)match(input,DROP,FOLLOW_DROP_in_drop_index_stmt3491);  
            stream_DROP.add(DROP436);

            INDEX437=(Token)match(input,INDEX,FOLLOW_INDEX_in_drop_index_stmt3493);  
            stream_INDEX.add(INDEX437);

            // SqlParser.g:374:29: ( IF EXISTS )?
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
                    // SqlParser.g:374:30: IF EXISTS
                    {
                    IF438=(Token)match(input,IF,FOLLOW_IF_in_drop_index_stmt3496);  
                    stream_IF.add(IF438);

                    EXISTS439=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_index_stmt3498);  
                    stream_EXISTS.add(EXISTS439);


                    }
                    break;

            }

            // SqlParser.g:374:42: (database_name= id DOT )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==ID) ) {
                int LA162_1 = input.LA(2);

                if ( (LA162_1==DOT) ) {
                    alt162=1;
                }
            }
            else if ( ((LA162_0>=ABORT && LA162_0<=WHERE)) ) {
                int LA162_2 = input.LA(2);

                if ( (LA162_2==DOT) ) {
                    alt162=1;
                }
            }
            switch (alt162) {
                case 1 :
                    // SqlParser.g:374:43: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_index_stmt3505);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT440=(Token)match(input,DOT,FOLLOW_DOT_in_drop_index_stmt3507);  
                    stream_DOT.add(DOT440);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_index_stmt3513);
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
            // 375:1: -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) )
            {
                // SqlParser.g:375:4: ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DROP_INDEX, "DROP_INDEX"), root_1);

                // SqlParser.g:375:17: ^( OPTIONS ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:375:27: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:375:36: ^( $index_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_index_name.nextNode(), root_2);

                // SqlParser.g:375:50: ( $database_name)?
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
    // SqlParser.g:378:1: create_trigger_stmt : CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END ;
    public final SqlParser.create_trigger_stmt_return create_trigger_stmt() throws RecognitionException {
        SqlParser.create_trigger_stmt_return retval = new SqlParser.create_trigger_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE441=null;
        Token TEMPORARY442=null;
        Token TRIGGER443=null;
        Token IF444=null;
        Token NOT445=null;
        Token EXISTS446=null;
        Token DOT447=null;
        Token BEFORE448=null;
        Token AFTER449=null;
        Token INSTEAD450=null;
        Token OF451=null;
        Token DELETE452=null;
        Token INSERT453=null;
        Token UPDATE454=null;
        Token OF455=null;
        Token COMMA456=null;
        Token ON457=null;
        Token FOR458=null;
        Token EACH459=null;
        Token ROW460=null;
        Token WHEN461=null;
        Token BEGIN463=null;
        Token SEMI468=null;
        Token END469=null;
        List list_column_names=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return trigger_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.expr_return expr462 = null;

        SqlParser.update_stmt_return update_stmt464 = null;

        SqlParser.insert_stmt_return insert_stmt465 = null;

        SqlParser.delete_stmt_return delete_stmt466 = null;

        SqlParser.select_stmt_return select_stmt467 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object CREATE441_tree=null;
        Object TEMPORARY442_tree=null;
        Object TRIGGER443_tree=null;
        Object IF444_tree=null;
        Object NOT445_tree=null;
        Object EXISTS446_tree=null;
        Object DOT447_tree=null;
        Object BEFORE448_tree=null;
        Object AFTER449_tree=null;
        Object INSTEAD450_tree=null;
        Object OF451_tree=null;
        Object DELETE452_tree=null;
        Object INSERT453_tree=null;
        Object UPDATE454_tree=null;
        Object OF455_tree=null;
        Object COMMA456_tree=null;
        Object ON457_tree=null;
        Object FOR458_tree=null;
        Object EACH459_tree=null;
        Object ROW460_tree=null;
        Object WHEN461_tree=null;
        Object BEGIN463_tree=null;
        Object SEMI468_tree=null;
        Object END469_tree=null;

        try {
            // SqlParser.g:378:20: ( CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END )
            // SqlParser.g:378:22: CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END
            {
            root_0 = (Object)adaptor.nil();

            CREATE441=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_trigger_stmt3543); 
            CREATE441_tree = (Object)adaptor.create(CREATE441);
            adaptor.addChild(root_0, CREATE441_tree);

            // SqlParser.g:378:29: ( TEMPORARY )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==TEMPORARY) ) {
                alt163=1;
            }
            switch (alt163) {
                case 1 :
                    // SqlParser.g:378:29: TEMPORARY
                    {
                    TEMPORARY442=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_trigger_stmt3545); 
                    TEMPORARY442_tree = (Object)adaptor.create(TEMPORARY442);
                    adaptor.addChild(root_0, TEMPORARY442_tree);


                    }
                    break;

            }

            TRIGGER443=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_create_trigger_stmt3548); 
            TRIGGER443_tree = (Object)adaptor.create(TRIGGER443);
            adaptor.addChild(root_0, TRIGGER443_tree);

            // SqlParser.g:378:48: ( IF NOT EXISTS )?
            int alt164=2;
            alt164 = dfa164.predict(input);
            switch (alt164) {
                case 1 :
                    // SqlParser.g:378:49: IF NOT EXISTS
                    {
                    IF444=(Token)match(input,IF,FOLLOW_IF_in_create_trigger_stmt3551); 
                    IF444_tree = (Object)adaptor.create(IF444);
                    adaptor.addChild(root_0, IF444_tree);

                    NOT445=(Token)match(input,NOT,FOLLOW_NOT_in_create_trigger_stmt3553); 
                    NOT445_tree = (Object)adaptor.create(NOT445);
                    adaptor.addChild(root_0, NOT445_tree);

                    EXISTS446=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_trigger_stmt3555); 
                    EXISTS446_tree = (Object)adaptor.create(EXISTS446);
                    adaptor.addChild(root_0, EXISTS446_tree);


                    }
                    break;

            }

            // SqlParser.g:378:65: (database_name= id DOT )?
            int alt165=2;
            alt165 = dfa165.predict(input);
            switch (alt165) {
                case 1 :
                    // SqlParser.g:378:66: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_trigger_stmt3562);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT447=(Token)match(input,DOT,FOLLOW_DOT_in_create_trigger_stmt3564); 
                    DOT447_tree = (Object)adaptor.create(DOT447);
                    adaptor.addChild(root_0, DOT447_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_trigger_stmt3570);
            trigger_name=id();

            state._fsp--;

            adaptor.addChild(root_0, trigger_name.getTree());
            // SqlParser.g:379:3: ( BEFORE | AFTER | INSTEAD OF )?
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
                    // SqlParser.g:379:4: BEFORE
                    {
                    BEFORE448=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_create_trigger_stmt3575); 
                    BEFORE448_tree = (Object)adaptor.create(BEFORE448);
                    adaptor.addChild(root_0, BEFORE448_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:379:13: AFTER
                    {
                    AFTER449=(Token)match(input,AFTER,FOLLOW_AFTER_in_create_trigger_stmt3579); 
                    AFTER449_tree = (Object)adaptor.create(AFTER449);
                    adaptor.addChild(root_0, AFTER449_tree);


                    }
                    break;
                case 3 :
                    // SqlParser.g:379:21: INSTEAD OF
                    {
                    INSTEAD450=(Token)match(input,INSTEAD,FOLLOW_INSTEAD_in_create_trigger_stmt3583); 
                    INSTEAD450_tree = (Object)adaptor.create(INSTEAD450);
                    adaptor.addChild(root_0, INSTEAD450_tree);

                    OF451=(Token)match(input,OF,FOLLOW_OF_in_create_trigger_stmt3585); 
                    OF451_tree = (Object)adaptor.create(OF451);
                    adaptor.addChild(root_0, OF451_tree);


                    }
                    break;

            }

            // SqlParser.g:379:34: ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? )
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
                    // SqlParser.g:379:35: DELETE
                    {
                    DELETE452=(Token)match(input,DELETE,FOLLOW_DELETE_in_create_trigger_stmt3590); 
                    DELETE452_tree = (Object)adaptor.create(DELETE452);
                    adaptor.addChild(root_0, DELETE452_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:379:44: INSERT
                    {
                    INSERT453=(Token)match(input,INSERT,FOLLOW_INSERT_in_create_trigger_stmt3594); 
                    INSERT453_tree = (Object)adaptor.create(INSERT453);
                    adaptor.addChild(root_0, INSERT453_tree);


                    }
                    break;
                case 3 :
                    // SqlParser.g:379:53: UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )?
                    {
                    UPDATE454=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_create_trigger_stmt3598); 
                    UPDATE454_tree = (Object)adaptor.create(UPDATE454);
                    adaptor.addChild(root_0, UPDATE454_tree);

                    // SqlParser.g:379:60: ( OF column_names+= id ( COMMA column_names+= id )* )?
                    int alt168=2;
                    int LA168_0 = input.LA(1);

                    if ( (LA168_0==OF) ) {
                        alt168=1;
                    }
                    switch (alt168) {
                        case 1 :
                            // SqlParser.g:379:61: OF column_names+= id ( COMMA column_names+= id )*
                            {
                            OF455=(Token)match(input,OF,FOLLOW_OF_in_create_trigger_stmt3601); 
                            OF455_tree = (Object)adaptor.create(OF455);
                            adaptor.addChild(root_0, OF455_tree);

                            pushFollow(FOLLOW_id_in_create_trigger_stmt3605);
                            column_names=id();

                            state._fsp--;

                            adaptor.addChild(root_0, column_names.getTree());
                            if (list_column_names==null) list_column_names=new ArrayList();
                            list_column_names.add(column_names.getTree());

                            // SqlParser.g:379:81: ( COMMA column_names+= id )*
                            loop167:
                            do {
                                int alt167=2;
                                int LA167_0 = input.LA(1);

                                if ( (LA167_0==COMMA) ) {
                                    alt167=1;
                                }


                                switch (alt167) {
                            	case 1 :
                            	    // SqlParser.g:379:82: COMMA column_names+= id
                            	    {
                            	    COMMA456=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_trigger_stmt3608); 
                            	    COMMA456_tree = (Object)adaptor.create(COMMA456);
                            	    adaptor.addChild(root_0, COMMA456_tree);

                            	    pushFollow(FOLLOW_id_in_create_trigger_stmt3612);
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

            ON457=(Token)match(input,ON,FOLLOW_ON_in_create_trigger_stmt3621); 
            ON457_tree = (Object)adaptor.create(ON457);
            adaptor.addChild(root_0, ON457_tree);

            pushFollow(FOLLOW_id_in_create_trigger_stmt3625);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:380:20: ( FOR EACH ROW )?
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==FOR) ) {
                alt170=1;
            }
            switch (alt170) {
                case 1 :
                    // SqlParser.g:380:21: FOR EACH ROW
                    {
                    FOR458=(Token)match(input,FOR,FOLLOW_FOR_in_create_trigger_stmt3628); 
                    FOR458_tree = (Object)adaptor.create(FOR458);
                    adaptor.addChild(root_0, FOR458_tree);

                    EACH459=(Token)match(input,EACH,FOLLOW_EACH_in_create_trigger_stmt3630); 
                    EACH459_tree = (Object)adaptor.create(EACH459);
                    adaptor.addChild(root_0, EACH459_tree);

                    ROW460=(Token)match(input,ROW,FOLLOW_ROW_in_create_trigger_stmt3632); 
                    ROW460_tree = (Object)adaptor.create(ROW460);
                    adaptor.addChild(root_0, ROW460_tree);


                    }
                    break;

            }

            // SqlParser.g:380:36: ( WHEN expr )?
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==WHEN) ) {
                alt171=1;
            }
            switch (alt171) {
                case 1 :
                    // SqlParser.g:380:37: WHEN expr
                    {
                    WHEN461=(Token)match(input,WHEN,FOLLOW_WHEN_in_create_trigger_stmt3637); 
                    WHEN461_tree = (Object)adaptor.create(WHEN461);
                    adaptor.addChild(root_0, WHEN461_tree);

                    pushFollow(FOLLOW_expr_in_create_trigger_stmt3639);
                    expr462=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr462.getTree());

                    }
                    break;

            }

            BEGIN463=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_create_trigger_stmt3645); 
            BEGIN463_tree = (Object)adaptor.create(BEGIN463);
            adaptor.addChild(root_0, BEGIN463_tree);

            // SqlParser.g:381:9: ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+
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
            	    // SqlParser.g:381:10: ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI
            	    {
            	    // SqlParser.g:381:10: ( update_stmt | insert_stmt | delete_stmt | select_stmt )
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
            	            // SqlParser.g:381:11: update_stmt
            	            {
            	            pushFollow(FOLLOW_update_stmt_in_create_trigger_stmt3649);
            	            update_stmt464=update_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, update_stmt464.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // SqlParser.g:381:25: insert_stmt
            	            {
            	            pushFollow(FOLLOW_insert_stmt_in_create_trigger_stmt3653);
            	            insert_stmt465=insert_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, insert_stmt465.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // SqlParser.g:381:39: delete_stmt
            	            {
            	            pushFollow(FOLLOW_delete_stmt_in_create_trigger_stmt3657);
            	            delete_stmt466=delete_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, delete_stmt466.getTree());

            	            }
            	            break;
            	        case 4 :
            	            // SqlParser.g:381:53: select_stmt
            	            {
            	            pushFollow(FOLLOW_select_stmt_in_create_trigger_stmt3661);
            	            select_stmt467=select_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, select_stmt467.getTree());

            	            }
            	            break;

            	    }

            	    SEMI468=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_trigger_stmt3664); 
            	    SEMI468_tree = (Object)adaptor.create(SEMI468);
            	    adaptor.addChild(root_0, SEMI468_tree);


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

            END469=(Token)match(input,END,FOLLOW_END_in_create_trigger_stmt3668); 
            END469_tree = (Object)adaptor.create(END469);
            adaptor.addChild(root_0, END469_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // SqlParser.g:384:1: drop_trigger_stmt : DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id ;
    public final SqlParser.drop_trigger_stmt_return drop_trigger_stmt() throws RecognitionException {
        SqlParser.drop_trigger_stmt_return retval = new SqlParser.drop_trigger_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP470=null;
        Token TRIGGER471=null;
        Token IF472=null;
        Token EXISTS473=null;
        Token DOT474=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return trigger_name = null;


        Object DROP470_tree=null;
        Object TRIGGER471_tree=null;
        Object IF472_tree=null;
        Object EXISTS473_tree=null;
        Object DOT474_tree=null;

        try {
            // SqlParser.g:384:18: ( DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id )
            // SqlParser.g:384:20: DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id
            {
            root_0 = (Object)adaptor.nil();

            DROP470=(Token)match(input,DROP,FOLLOW_DROP_in_drop_trigger_stmt3676); 
            DROP470_tree = (Object)adaptor.create(DROP470);
            adaptor.addChild(root_0, DROP470_tree);

            TRIGGER471=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_drop_trigger_stmt3678); 
            TRIGGER471_tree = (Object)adaptor.create(TRIGGER471);
            adaptor.addChild(root_0, TRIGGER471_tree);

            // SqlParser.g:384:33: ( IF EXISTS )?
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
                    // SqlParser.g:384:34: IF EXISTS
                    {
                    IF472=(Token)match(input,IF,FOLLOW_IF_in_drop_trigger_stmt3681); 
                    IF472_tree = (Object)adaptor.create(IF472);
                    adaptor.addChild(root_0, IF472_tree);

                    EXISTS473=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_trigger_stmt3683); 
                    EXISTS473_tree = (Object)adaptor.create(EXISTS473);
                    adaptor.addChild(root_0, EXISTS473_tree);


                    }
                    break;

            }

            // SqlParser.g:384:46: (database_name= id DOT )?
            int alt175=2;
            int LA175_0 = input.LA(1);

            if ( (LA175_0==ID) ) {
                int LA175_1 = input.LA(2);

                if ( (LA175_1==DOT) ) {
                    alt175=1;
                }
            }
            else if ( ((LA175_0>=ABORT && LA175_0<=WHERE)) ) {
                int LA175_2 = input.LA(2);

                if ( (LA175_2==DOT) ) {
                    alt175=1;
                }
            }
            switch (alt175) {
                case 1 :
                    // SqlParser.g:384:47: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_trigger_stmt3690);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT474=(Token)match(input,DOT,FOLLOW_DOT_in_drop_trigger_stmt3692); 
                    DOT474_tree = (Object)adaptor.create(DOT474);
                    adaptor.addChild(root_0, DOT474_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_trigger_stmt3698);
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
    // SqlParser.g:389:1: id : ( ID | keyword );
    public final SqlParser.id_return id() throws RecognitionException {
        SqlParser.id_return retval = new SqlParser.id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID475=null;
        SqlParser.keyword_return keyword476 = null;


        Object ID475_tree=null;

        try {
            // SqlParser.g:389:3: ( ID | keyword )
            int alt176=2;
            int LA176_0 = input.LA(1);

            if ( (LA176_0==ID) ) {
                alt176=1;
            }
            else if ( ((LA176_0>=ABORT && LA176_0<=WHERE)) ) {
                alt176=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 176, 0, input);

                throw nvae;
            }
            switch (alt176) {
                case 1 :
                    // SqlParser.g:389:5: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID475=(Token)match(input,ID,FOLLOW_ID_in_id3708); 
                    ID475_tree = (Object)adaptor.create(ID475);
                    adaptor.addChild(root_0, ID475_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:389:10: keyword
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_id3712);
                    keyword476=keyword();

                    state._fsp--;

                    adaptor.addChild(root_0, keyword476.getTree());

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
    // SqlParser.g:391:1: keyword : ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) ;
    public final SqlParser.keyword_return keyword() throws RecognitionException {
        SqlParser.keyword_return retval = new SqlParser.keyword_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set477=null;

        Object set477_tree=null;

        try {
            // SqlParser.g:391:8: ( ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) )
            // SqlParser.g:391:10: ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE )
            {
            root_0 = (Object)adaptor.nil();

            set477=(Token)input.LT(1);
            if ( (input.LA(1)>=ABORT && input.LA(1)<=WHERE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set477));
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
    // SqlParser.g:510:1: id_column_def : ( ID | keyword_column_def );
    public final SqlParser.id_column_def_return id_column_def() throws RecognitionException {
        SqlParser.id_column_def_return retval = new SqlParser.id_column_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID478=null;
        SqlParser.keyword_column_def_return keyword_column_def479 = null;


        Object ID478_tree=null;

        try {
            // SqlParser.g:510:14: ( ID | keyword_column_def )
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
                    // SqlParser.g:510:16: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID478=(Token)match(input,ID,FOLLOW_ID_in_id_column_def4426); 
                    ID478_tree = (Object)adaptor.create(ID478);
                    adaptor.addChild(root_0, ID478_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:510:21: keyword_column_def
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_keyword_column_def_in_id_column_def4430);
                    keyword_column_def479=keyword_column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, keyword_column_def479.getTree());

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
    // SqlParser.g:512:1: keyword_column_def : ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) ;
    public final SqlParser.keyword_column_def_return keyword_column_def() throws RecognitionException {
        SqlParser.keyword_column_def_return retval = new SqlParser.keyword_column_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set480=null;

        Object set480_tree=null;

        try {
            // SqlParser.g:512:19: ( ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) )
            // SqlParser.g:512:21: ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE )
            {
            root_0 = (Object)adaptor.nil();

            set480=(Token)input.LT(1);
            if ( (input.LA(1)>=ABORT && input.LA(1)<=COLLATE)||(input.LA(1)>=COMMIT && input.LA(1)<=CONFLICT)||(input.LA(1)>=CREATE && input.LA(1)<=WHERE) ) {
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
    // $ANTLR end "keyword_column_def"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA82 dfa82 = new DFA82(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA81 dfa81 = new DFA81(this);
    protected DFA92 dfa92 = new DFA92(this);
    protected DFA117 dfa117 = new DFA117(this);
    protected DFA120 dfa120 = new DFA120(this);
    protected DFA121 dfa121 = new DFA121(this);
    protected DFA124 dfa124 = new DFA124(this);
    protected DFA125 dfa125 = new DFA125(this);
    protected DFA126 dfa126 = new DFA126(this);
    protected DFA127 dfa127 = new DFA127(this);
    protected DFA128 dfa128 = new DFA128(this);
    protected DFA129 dfa129 = new DFA129(this);
    protected DFA139 dfa139 = new DFA139(this);
    protected DFA140 dfa140 = new DFA140(this);
    protected DFA144 dfa144 = new DFA144(this);
    protected DFA164 dfa164 = new DFA164(this);
    protected DFA165 dfa165 = new DFA165(this);
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
            return "()+ loopback of 56:16: ( sql_stmt )+";
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
            return "58:11: ( EXPLAIN ( QUERY PLAN )? )?";
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
            return "58:20: ( QUERY PLAN )?";
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
        "\1\14\1\15\1\16\1\17\2\uffff\1\23\1\20\1\uffff\1\21\1\26\1\uffff"+
        "\1\30\1\24\1\22\1\25\1\27\1\31\3\uffff";
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
            "\1\27\52\uffff\1\26\1\25\3\uffff\1\31\1\uffff\1\27\4\uffff"+
            "\1\32\1\24",
            "\1\35\52\uffff\1\33\4\uffff\1\36\6\uffff\1\34",
            "",
            "",
            "\1\26\4\uffff\1\31\6\uffff\1\32",
            "",
            "",
            "",
            "",
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
            return "60:1: sql_stmt_core : ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt );";
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
            return "90:23: (database_name= id DOT )?";
        }
    }
    static final String DFA7_eotS =
        "\165\uffff";
    static final String DFA7_eofS =
        "\165\uffff";
    static final String DFA7_minS =
        "\1\27\33\uffff\1\21\35\uffff\1\30\1\uffff\1\21\6\30\62\uffff";
    static final String DFA7_maxS =
        "\1\u00af\33\uffff\1\u00b5\35\uffff\1\u00af\1\uffff\1\u00b5\1\110"+
        "\3\u009c\1\110\1\u00b1\62\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\2\34\uffff\1\1\126\uffff";
    static final String DFA7_specialS =
        "\165\uffff}>";
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
            "\1\100\6\36\1\72\1\36\1\75\13\36\1\77\7\36\1\102\11\36\1\101"+
            "\30\36\1\76\10\36\1\74\1\uffff\3\36\1\uffff\1\36\1\uffff\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            "",
            "",
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
            return "()* loopback of 92:18: ( OR or_subexpr )*";
        }
    }
    static final String DFA8_eotS =
        "\166\uffff";
    static final String DFA8_eofS =
        "\166\uffff";
    static final String DFA8_minS =
        "\1\27\34\uffff\1\21\2\uffff\1\30\1\21\6\30\116\uffff";
    static final String DFA8_maxS =
        "\1\u00af\34\uffff\1\u00b5\2\uffff\1\u00af\1\u00b5\1\110\3\u009c"+
        "\1\110\1\u00b1\116\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\2\50\uffff\1\1\113\uffff";
    static final String DFA8_specialS =
        "\166\uffff}>";
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 94:25: ( AND and_subexpr )*";
        }
    }
    static final String DFA10_eotS =
        "\101\uffff";
    static final String DFA10_eofS =
        "\101\uffff";
    static final String DFA10_minS =
        "\2\21\77\uffff";
    static final String DFA10_maxS =
        "\2\u00b5\77\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\34\uffff\1\3\1\uffff\1\1\37\uffff";
    static final String DFA10_specialS =
        "\101\uffff}>";
    static final String[] DFA10_transitionS = {
            "\3\2\6\uffff\1\2\1\37\3\2\33\uffff\142\2\1\1\21\2\1\uffff\3"+
            "\2\1\uffff\1\2\1\uffff\1\2",
            "\4\41\3\uffff\1\2\1\uffff\1\41\1\uffff\3\41\33\uffff\164\41"+
            "\1\uffff\3\41\1\uffff\1\41\1\uffff\1\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "97:12: ( select_stmt | expr ( COMMA expr )* )?";
        }
    }
    static final String DFA11_eotS =
        "\101\uffff";
    static final String DFA11_eofS =
        "\101\uffff";
    static final String DFA11_minS =
        "\1\72\2\27\76\uffff";
    static final String DFA11_maxS =
        "\3\u00af\76\uffff";
    static final String DFA11_acceptS =
        "\3\uffff\1\2\35\uffff\1\1\37\uffff";
    static final String DFA11_specialS =
        "\101\uffff}>";
    static final String[] DFA11_transitionS = {
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
            return "98:5: (database_name= id DOT )?";
        }
    }
    static final String DFA20_eotS =
        "\u0152\uffff";
    static final String DFA20_eofS =
        "\u0152\uffff";
    static final String DFA20_minS =
        "\1\21\1\30\22\uffff\4\21\1\30\2\27\1\30\1\21\22\uffff\1\21\1\uffff"+
        "\4\21\1\30\u011c\uffff";
    static final String DFA20_maxS =
        "\2\u00b5\22\uffff\4\u00b5\3\u00af\1\u0086\1\u00b5\22\uffff\1\u00b5"+
        "\1\uffff\4\u00b5\1\u00af\u011c\uffff";
    static final String DFA20_acceptS =
        "\2\uffff\1\1\65\uffff\1\2\122\uffff\1\3\4\uffff\1\4\77\uffff\1\5"+
        "\u0081\uffff";
    static final String DFA20_specialS =
        "\u0152\uffff}>";
    static final String[] DFA20_transitionS = {
            "\3\2\6\uffff\1\2\1\uffff\3\2\33\uffff\15\2\1\34\44\2\1\25\5"+
            "\2\1\30\10\2\1\33\1\31\3\2\1\24\1\2\1\27\1\2\1\1\1\32\15\2\1"+
            "\26\32\2\1\uffff\3\2\1\uffff\1\2\1\uffff\1\2",
            "\1\2\1\uffff\1\2\1\uffff\3\2\33\uffff\15\2\1\64\44\2\1\61\5"+
            "\2\1\65\15\2\1\57\1\2\1\63\20\2\1\62\32\2\1\uffff\3\2\1\uffff"+
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
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\70\4\uffff\1\2\1\uffff\1\70\1\uffff\3\70\33\uffff\164\70"+
            "\1\uffff\3\70\1\uffff\1\70\1\uffff\1\70",
            "\3\70\4\uffff\1\2\1\uffff\1\70\1\uffff\3\70\33\uffff\164\70"+
            "\1\uffff\3\70\1\uffff\1\70\1\uffff\1\70",
            "\3\70\4\uffff\1\2\1\uffff\1\70\1\uffff\3\70\33\uffff\164\70"+
            "\1\uffff\3\70\1\uffff\1\70\1\uffff\1\70",
            "\3\70\4\uffff\1\2\1\uffff\1\70\1\uffff\3\70\33\uffff\164\70"+
            "\1\uffff\3\70\1\uffff\1\70\1\uffff\1\70",
            "\1\2\1\uffff\1\u008b\37\uffff\164\u008b\1\uffff\1\u008b",
            "\1\u0090\1\2\1\u0090\1\uffff\1\u0090\36\uffff\164\u0090\1\uffff"+
            "\1\u0090",
            "\1\u0090\1\2\1\u0090\1\uffff\1\u0090\36\uffff\164\u0090\1\uffff"+
            "\1\u0090",
            "\1\2\153\uffff\1\u0090\1\uffff\1\u0090",
            "\3\u00d0\4\uffff\1\2\1\uffff\1\u00d0\1\uffff\3\u00d0\33\uffff"+
            "\164\u00d0\1\uffff\3\u00d0\1\uffff\1\u00d0\1\uffff\1\u00d0",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\70\4\uffff\1\2\1\uffff\1\70\1\uffff\3\70\33\uffff\164\70"+
            "\1\uffff\3\70\1\uffff\1\70\1\uffff\1\70",
            "",
            "\3\70\4\uffff\1\2\1\uffff\1\70\1\uffff\3\70\33\uffff\164\70"+
            "\1\uffff\3\70\1\uffff\1\70\1\uffff\1\70",
            "\3\70\4\uffff\1\2\1\uffff\1\70\1\uffff\3\70\33\uffff\164\70"+
            "\1\uffff\3\70\1\uffff\1\70\1\uffff\1\70",
            "\3\70\4\uffff\1\2\1\uffff\1\70\1\uffff\3\70\33\uffff\164\70"+
            "\1\uffff\3\70\1\uffff\1\70\1\uffff\1\70",
            "\3\u00d0\4\uffff\1\2\1\uffff\1\u00d0\1\uffff\3\u00d0\33\uffff"+
            "\164\u00d0\1\uffff\3\u00d0\1\uffff\1\u00d0\1\uffff\1\u00d0",
            "\1\2\1\uffff\1\u008b\37\uffff\164\u008b\1\uffff\1\u008b",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "101:1: and_subexpr : ( eq_subexpr ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )* | ( NOT )? op= ( LIKE | GLOB | REGEXP | MATCH ) eq_subexpr ( ESCAPE escape_subexpr= eq_subexpr )? -> ^( $op eq_subexpr ( NOT )? ( ^( ESCAPE $escape_subexpr) )? ) | ( NOT )? IN in_source | ( ISNULL | NOTNULL | IS NULL -> ISNULL | IS NOT NULL -> NOTNULL ) | ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr -> ^( BETWEEN $e1 $e2 ( NOT )? ) );";
        }
    }
    static final String DFA13_eotS =
        "\40\uffff";
    static final String DFA13_eofS =
        "\40\uffff";
    static final String DFA13_minS =
        "\1\4\37\uffff";
    static final String DFA13_maxS =
        "\1\u00af\37\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\2\35\uffff\1\1";
    static final String DFA13_specialS =
        "\40\uffff}>";
    static final String[] DFA13_transitionS = {
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
            return "()* loopback of 102:16: ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )*";
        }
    }
    static final String DFA16_eotS =
        "\156\uffff";
    static final String DFA16_eofS =
        "\156\uffff";
    static final String DFA16_minS =
        "\1\27\1\21\37\uffff\1\30\1\21\6\30\105\uffff";
    static final String DFA16_maxS =
        "\1\u00af\1\u00b5\37\uffff\1\u00af\1\u00b5\1\110\3\u009c\1\110\1"+
        "\u00b1\105\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\50\uffff\1\1\102\uffff";
    static final String DFA16_specialS =
        "\156\uffff}>";
    static final String[] DFA16_transitionS = {
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "103:55: ( ESCAPE escape_subexpr= eq_subexpr )?";
        }
    }
    static final String DFA21_eotS =
        "\42\uffff";
    static final String DFA21_eofS =
        "\42\uffff";
    static final String DFA21_minS =
        "\1\4\41\uffff";
    static final String DFA21_maxS =
        "\1\u00af\41\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\2\37\uffff\1\1";
    static final String DFA21_specialS =
        "\42\uffff}>";
    static final String[] DFA21_transitionS = {
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
            return "()* loopback of 109:25: ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )*";
        }
    }
    static final String DFA22_eotS =
        "\43\uffff";
    static final String DFA22_eofS =
        "\43\uffff";
    static final String DFA22_minS =
        "\1\4\42\uffff";
    static final String DFA22_maxS =
        "\1\u00af\42\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\2\40\uffff\1\1";
    static final String DFA22_specialS =
        "\43\uffff}>";
    static final String[] DFA22_transitionS = {
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
            return "()* loopback of 111:26: ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )*";
        }
    }
    static final String DFA23_eotS =
        "\44\uffff";
    static final String DFA23_eofS =
        "\44\uffff";
    static final String DFA23_minS =
        "\1\4\43\uffff";
    static final String DFA23_maxS =
        "\1\u00af\43\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\2\41\uffff\1\1";
    static final String DFA23_specialS =
        "\44\uffff}>";
    static final String[] DFA23_transitionS = {
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
            return "()* loopback of 113:26: ( ( PLUS | MINUS ) add_subexpr )*";
        }
    }
    static final String DFA24_eotS =
        "\45\uffff";
    static final String DFA24_eofS =
        "\45\uffff";
    static final String DFA24_minS =
        "\1\4\44\uffff";
    static final String DFA24_maxS =
        "\1\u00af\44\uffff";
    static final String DFA24_acceptS =
        "\1\uffff\1\2\42\uffff\1\1";
    static final String DFA24_specialS =
        "\45\uffff}>";
    static final String[] DFA24_transitionS = {
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
            return "()* loopback of 115:26: ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )*";
        }
    }
    static final String DFA25_eotS =
        "\46\uffff";
    static final String DFA25_eofS =
        "\46\uffff";
    static final String DFA25_minS =
        "\1\4\45\uffff";
    static final String DFA25_maxS =
        "\1\u00af\45\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\2\43\uffff\1\1";
    static final String DFA25_specialS =
        "\46\uffff}>";
    static final String[] DFA25_transitionS = {
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
            return "()* loopback of 117:26: ( DOUBLE_PIPE con_subexpr )*";
        }
    }
    static final String DFA26_eotS =
        "\50\uffff";
    static final String DFA26_eofS =
        "\50\uffff";
    static final String DFA26_minS =
        "\1\21\1\30\46\uffff";
    static final String DFA26_maxS =
        "\2\u00b5\46\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\2\13\uffff\1\1\31\uffff";
    static final String DFA26_specialS =
        "\50\uffff}>";
    static final String[] DFA26_transitionS = {
            "\3\16\6\uffff\1\2\1\uffff\3\2\33\uffff\112\2\1\1\51\2\1\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2",
            "\1\2\1\uffff\1\16\1\uffff\3\16\33\uffff\164\16\1\uffff\3\16"+
            "\1\uffff\1\16\1\uffff\1\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "119:14: ( PLUS | MINUS | TILDA | NOT )?";
        }
    }
    static final String DFA27_eotS =
        "\63\uffff";
    static final String DFA27_eofS =
        "\63\uffff";
    static final String DFA27_minS =
        "\1\4\1\27\61\uffff";
    static final String DFA27_maxS =
        "\2\u00af\61\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\2\44\uffff\1\1\13\uffff";
    static final String DFA27_specialS =
        "\63\uffff}>";
    static final String[] DFA27_transitionS = {
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
            return "121:26: ( COLLATE collation_name= ID )?";
        }
    }
    static final String DFA37_eotS =
        "\u013b\uffff";
    static final String DFA37_eofS =
        "\u013b\uffff";
    static final String DFA37_minS =
        "\1\32\4\uffff\4\4\3\uffff\1\4\1\30\1\21\1\30\1\21\1\30\u00c7\uffff"+
        "\1\21\141\uffff";
    static final String DFA37_maxS =
        "\1\u00b5\4\uffff\4\u00af\3\uffff\1\u00af\1\32\1\u00b5\1\32\1\u00b5"+
        "\1\32\u00c7\uffff\1\u00b5\141\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\1\7\uffff\1\2\10\uffff\1\3\u009c\uffff\1\4\47\uffff\1"+
        "\6\2\uffff\1\5\35\uffff\1\7\1\uffff\1\10\35\uffff\1\11\42\uffff";
    static final String DFA37_specialS =
        "\u013b\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\16\1\uffff\3\11\33\uffff\20\22\1\20\1\15\10\22\1\6\1\7\1"+
            "\10\17\22\1\17\37\22\1\5\12\22\1\21\34\22\1\uffff\1\14\2\1\1"+
            "\uffff\1\1\1\uffff\1\1",
            "",
            "",
            "",
            "",
            "\17\1\1\uffff\4\1\1\22\1\1\1\uffff\1\1\36\uffff\164\1\1\uffff"+
            "\1\1",
            "\17\1\1\uffff\4\1\1\22\1\1\1\uffff\1\1\36\uffff\164\1\1\uffff"+
            "\1\1",
            "\17\1\1\uffff\4\1\1\22\1\1\1\uffff\1\1\36\uffff\164\1\1\uffff"+
            "\1\1",
            "\17\1\1\uffff\4\1\1\22\1\1\1\uffff\1\1\36\uffff\164\1\1\uffff"+
            "\1\1",
            "",
            "",
            "",
            "\17\22\1\uffff\6\22\1\u00af\1\22\36\uffff\164\22\1\uffff\1"+
            "\22",
            "\1\22\1\uffff\1\u00d7",
            "\3\u00da\6\uffff\1\u00da\1\uffff\3\u00da\33\uffff\142\u00da"+
            "\1\u00d9\21\u00da\1\uffff\3\u00da\1\uffff\1\u00da\1\uffff\1"+
            "\u00da",
            "\1\22\1\uffff\1\u00f8",
            "\3\u00fa\4\uffff\1\22\1\uffff\1\u00fa\1\uffff\3\u00fa\33\uffff"+
            "\164\u00fa\1\uffff\3\u00fa\1\uffff\1\u00fa\1\uffff\1\u00fa",
            "\1\22\1\uffff\1\u0118",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\4\u00f8\3\uffff\1\u00da\1\uffff\1\u00f8\1\uffff\3\u00f8\33"+
            "\uffff\164\u00f8\1\uffff\3\u00f8\1\uffff\1\u00f8\1\uffff\1\u00f8",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "123:1: atom_expr : ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) | function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN | LPAREN expr RPAREN | CAST LPAREN expr AS type_name RPAREN | ( EXISTS )? LPAREN select_stmt RPAREN | CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END | raise_function );";
        }
    }
    static final String DFA29_eotS =
        "\52\uffff";
    static final String DFA29_eofS =
        "\52\uffff";
    static final String DFA29_minS =
        "\1\72\1\4\50\uffff";
    static final String DFA29_maxS =
        "\2\u00af\50\uffff";
    static final String DFA29_acceptS =
        "\2\uffff\1\1\1\2\46\uffff";
    static final String DFA29_specialS =
        "\52\uffff}>";
    static final String[] DFA29_transitionS = {
            "\164\2\1\uffff\1\1",
            "\17\3\1\uffff\4\3\1\2\1\3\1\uffff\1\3\36\uffff\164\3\1\uffff"+
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
            return "126:5: ( (database_name= id DOT )? table_name= id DOT )?";
        }
    }
    static final String DFA28_eotS =
        "\127\uffff";
    static final String DFA28_eofS =
        "\127\uffff";
    static final String DFA28_minS =
        "\1\72\2\30\2\72\1\4\1\uffff\1\4\117\uffff";
    static final String DFA28_maxS =
        "\1\u00af\2\30\3\u00af\1\uffff\1\u00af\117\uffff";
    static final String DFA28_acceptS =
        "\6\uffff\1\1\2\uffff\1\2\115\uffff";
    static final String DFA28_specialS =
        "\127\uffff}>";
    static final String[] DFA28_transitionS = {
            "\164\2\1\uffff\1\1",
            "\1\3",
            "\1\4",
            "\164\6\1\uffff\1\5",
            "\164\6\1\uffff\1\7",
            "\17\11\1\uffff\4\11\1\6\1\11\1\uffff\1\11\36\uffff\164\11\1"+
            "\uffff\1\11",
            "",
            "\17\11\1\uffff\4\11\1\6\1\11\1\uffff\1\11\36\uffff\164\11\1"+
            "\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "126:6: (database_name= id DOT )?";
        }
    }
    static final String DFA32_eotS =
        "\41\uffff";
    static final String DFA32_eofS =
        "\41\uffff";
    static final String DFA32_minS =
        "\1\21\40\uffff";
    static final String DFA32_maxS =
        "\1\u00b5\40\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\1\35\uffff\1\2\1\3";
    static final String DFA32_specialS =
        "\41\uffff}>";
    static final String[] DFA32_transitionS = {
            "\3\1\1\37\5\uffff\1\1\1\40\3\1\33\uffff\164\1\1\uffff\3\1\1"+
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
            "",
            "",
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
            return "127:29: ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )?";
        }
    }
    static final String DFA30_eotS =
        "\75\uffff";
    static final String DFA30_eofS =
        "\75\uffff";
    static final String DFA30_minS =
        "\2\21\73\uffff";
    static final String DFA30_maxS =
        "\2\u00b5\73\uffff";
    static final String DFA30_acceptS =
        "\2\uffff\1\2\35\uffff\1\1\34\uffff";
    static final String DFA30_specialS =
        "\75\uffff}>";
    static final String[] DFA30_transitionS = {
            "\3\2\6\uffff\1\2\1\uffff\3\2\33\uffff\44\2\1\1\117\2\1\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\1\2",
            "\3\40\4\uffff\1\2\1\uffff\1\40\1\uffff\3\40\33\uffff\164\40"+
            "\1\uffff\3\40\1\uffff\1\40\1\uffff\1\40",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "127:30: ( DISTINCT )?";
        }
    }
    static final String DFA34_eotS =
        "\75\uffff";
    static final String DFA34_eofS =
        "\75\uffff";
    static final String DFA34_minS =
        "\1\21\34\uffff\1\21\37\uffff";
    static final String DFA34_maxS =
        "\1\u00b5\34\uffff\1\u00b5\37\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\36\uffff\1\2\34\uffff";
    static final String DFA34_specialS =
        "\75\uffff}>";
    static final String[] DFA34_transitionS = {
            "\3\1\6\uffff\1\1\1\uffff\3\1\33\uffff\162\1\1\35\1\1\1\uffff"+
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\40\4\uffff\1\1\1\uffff\1\40\1\uffff\3\40\33\uffff\164\40"+
            "\1\uffff\3\40\1\uffff\1\40\1\uffff\1\40",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "131:10: ( expr )?";
        }
    }
    static final String DFA39_eotS =
        "\53\uffff";
    static final String DFA39_eofS =
        "\53\uffff";
    static final String DFA39_minS =
        "\1\34\1\4\51\uffff";
    static final String DFA39_maxS =
        "\1\36\1\u00b1\51\uffff";
    static final String DFA39_acceptS =
        "\2\uffff\1\3\1\4\1\2\1\1\45\uffff";
    static final String DFA39_specialS =
        "\53\uffff}>";
    static final String[] DFA39_transitionS = {
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

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "146:1: bind_parameter : ( QUESTION -> BIND | QUESTION position= INTEGER -> ^( BIND $position) | COLON name= id -> ^( BIND_NAME $name) | AT name= id -> ^( BIND_NAME $name) );";
        }
    }
    static final String DFA41_eotS =
        "\16\uffff";
    static final String DFA41_eofS =
        "\16\uffff";
    static final String DFA41_minS =
        "\1\27\15\uffff";
    static final String DFA41_maxS =
        "\1\u00af\15\uffff";
    static final String DFA41_acceptS =
        "\1\uffff\1\2\13\uffff\1\1";
    static final String DFA41_specialS =
        "\16\uffff}>";
    static final String[] DFA41_transitionS = {
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

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "()+ loopback of 156:17: (names+= ID )+";
        }
    }
    static final String DFA43_eotS =
        "\15\uffff";
    static final String DFA43_eofS =
        "\15\uffff";
    static final String DFA43_minS =
        "\1\27\14\uffff";
    static final String DFA43_maxS =
        "\1\u00a5\14\uffff";
    static final String DFA43_acceptS =
        "\1\uffff\1\1\1\2\12\uffff";
    static final String DFA43_specialS =
        "\15\uffff}>";
    static final String[] DFA43_transitionS = {
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
            return "156:23: ( LPAREN size1= SIGNED_NUMBER ( COMMA size2= SIGNED_NUMBER )? RPAREN )?";
        }
    }
    static final String DFA44_eotS =
        "\13\uffff";
    static final String DFA44_eofS =
        "\13\uffff";
    static final String DFA44_minS =
        "\1\72\2\4\10\uffff";
    static final String DFA44_maxS =
        "\1\u00af\2\32\10\uffff";
    static final String DFA44_acceptS =
        "\3\uffff\1\2\2\uffff\1\1\4\uffff";
    static final String DFA44_specialS =
        "\13\uffff}>";
    static final String[] DFA44_transitionS = {
            "\164\2\1\uffff\1\1",
            "\1\3\22\uffff\1\3\1\6\1\uffff\1\3",
            "\1\3\22\uffff\1\3\1\6\1\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "160:21: (database_name= id DOT )?";
        }
    }
    static final String DFA47_eotS =
        "\17\uffff";
    static final String DFA47_eofS =
        "\17\uffff";
    static final String DFA47_minS =
        "\2\72\3\uffff\1\72\3\uffff\1\27\5\uffff";
    static final String DFA47_maxS =
        "\2\u00b0\3\uffff\1\u00af\3\uffff\1\u00af\5\uffff";
    static final String DFA47_acceptS =
        "\2\uffff\1\2\3\uffff\1\1\10\uffff";
    static final String DFA47_specialS =
        "\17\uffff}>";
    static final String[] DFA47_transitionS = {
            "\35\2\1\1\126\2\1\uffff\2\2",
            "\7\6\1\5\154\6\1\uffff\2\6",
            "",
            "",
            "",
            "\7\2\1\11\154\2\1\uffff\1\2",
            "",
            "",
            "",
            "\1\2\42\uffff\164\6\1\uffff\1\6",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "165:21: ( DATABASE )?";
        }
    }
    static final String DFA52_eotS =
        "\14\uffff";
    static final String DFA52_eofS =
        "\14\uffff";
    static final String DFA52_minS =
        "\1\27\13\uffff";
    static final String DFA52_maxS =
        "\1\u00a4\13\uffff";
    static final String DFA52_acceptS =
        "\1\uffff\1\1\1\2\1\3\10\uffff";
    static final String DFA52_specialS =
        "\14\uffff}>";
    static final String[] DFA52_transitionS = {
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

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "185:82: ( ASC | DESC )?";
        }
    }
    static final String DFA64_eotS =
        "\137\uffff";
    static final String DFA64_eofS =
        "\137\uffff";
    static final String DFA64_minS =
        "\3\21\134\uffff";
    static final String DFA64_maxS =
        "\3\u00b5\134\uffff";
    static final String DFA64_acceptS =
        "\3\uffff\1\3\36\uffff\1\1\35\uffff\1\2\36\uffff";
    static final String DFA64_specialS =
        "\137\uffff}>";
    static final String[] DFA64_transitionS = {
            "\4\3\5\uffff\1\3\1\uffff\3\3\33\uffff\3\3\1\1\40\3\1\2\117\3"+
            "\1\uffff\3\3\1\uffff\1\3\1\uffff\1\3",
            "\4\42\3\uffff\1\3\1\uffff\1\42\1\uffff\3\42\33\uffff\164\42"+
            "\1\uffff\3\42\1\uffff\1\42\1\uffff\1\42",
            "\4\100\3\uffff\1\3\1\uffff\1\100\1\uffff\3\100\33\uffff\164"+
            "\100\1\uffff\3\100\1\uffff\1\100\1\uffff\1\100",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "206:10: ( ALL | DISTINCT )?";
        }
    }
    static final String DFA65_eotS =
        "\14\uffff";
    static final String DFA65_eofS =
        "\14\uffff";
    static final String DFA65_minS =
        "\1\27\13\uffff";
    static final String DFA65_maxS =
        "\1\u00ad\13\uffff";
    static final String DFA65_acceptS =
        "\1\uffff\1\2\11\uffff\1\1";
    static final String DFA65_specialS =
        "\14\uffff}>";
    static final String[] DFA65_transitionS = {
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
            return "()* loopback of 206:42: ( COMMA result_column )*";
        }
    }
    static final String DFA66_eotS =
        "\13\uffff";
    static final String DFA66_eofS =
        "\13\uffff";
    static final String DFA66_minS =
        "\1\27\12\uffff";
    static final String DFA66_maxS =
        "\1\u00ad\12\uffff";
    static final String DFA66_acceptS =
        "\1\uffff\1\1\1\2\10\uffff";
    static final String DFA66_specialS =
        "\13\uffff}>";
    static final String[] DFA66_transitionS = {
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
            return "206:65: ( FROM join_source )?";
        }
    }
    static final String DFA67_eotS =
        "\12\uffff";
    static final String DFA67_eofS =
        "\12\uffff";
    static final String DFA67_minS =
        "\1\27\11\uffff";
    static final String DFA67_maxS =
        "\1\u00ad\11\uffff";
    static final String DFA67_acceptS =
        "\1\uffff\1\1\1\2\7\uffff";
    static final String DFA67_specialS =
        "\12\uffff}>";
    static final String[] DFA67_transitionS = {
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
            return "206:85: ( WHERE where_expr= expr )?";
        }
    }
    static final String DFA68_eotS =
        "\12\uffff";
    static final String DFA68_eofS =
        "\12\uffff";
    static final String DFA68_minS =
        "\1\27\11\uffff";
    static final String DFA68_maxS =
        "\1\u00a4\11\uffff";
    static final String DFA68_acceptS =
        "\1\uffff\1\2\7\uffff\1\1";
    static final String DFA68_specialS =
        "\12\uffff}>";
    static final String[] DFA68_transitionS = {
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

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "()* loopback of 207:28: ( COMMA ordering_term )*";
        }
    }
    static final String DFA73_eotS =
        "\u01a5\uffff";
    static final String DFA73_eofS =
        "\u01a5\uffff";
    static final String DFA73_minS =
        "\1\21\1\uffff\1\4\1\30\1\4\5\uffff\3\4\1\30\4\uffff\1\30\1\21\1"+
        "\30\4\21\1\30\2\27\1\30\1\21\1\30\1\uffff\1\24\30\uffff\1\24\56"+
        "\uffff\2\24\56\uffff\2\24\30\uffff\2\24\1\uffff\1\24\37\uffff\2"+
        "\24\24\uffff\1\24\24\uffff\1\24\50\uffff\2\24\3\uffff\1\24\40\uffff"+
        "\1\24\2\uffff\2\24\24\uffff\1\24\74\uffff";
    static final String DFA73_maxS =
        "\1\u00b5\1\uffff\1\u00af\1\u00b5\1\u00af\5\uffff\3\u00af\1\32\4"+
        "\uffff\1\32\1\u00b5\1\32\4\u00b5\3\u00af\1\u0086\1\u00b5\1\30\1"+
        "\uffff\1\u00af\30\uffff\1\u00af\56\uffff\2\u00af\56\uffff\2\u00af"+
        "\30\uffff\2\u00af\1\uffff\1\u00af\37\uffff\2\u00af\24\uffff\1\u00af"+
        "\24\uffff\1\u00af\50\uffff\2\u00af\3\uffff\1\u00af\40\uffff\1\u00af"+
        "\2\uffff\2\u00af\24\uffff\1\u00af\74\uffff";
    static final String DFA73_acceptS =
        "\1\uffff\1\1\3\uffff\1\3\u0163\uffff\1\2\73\uffff";
    static final String DFA73_specialS =
        "\u01a5\uffff}>";
    static final String[] DFA73_transitionS = {
            "\3\5\1\1\5\uffff\1\5\1\uffff\3\5\33\uffff\15\36\1\35\2\36\1"+
            "\23\1\15\10\36\1\12\1\13\1\14\17\36\1\22\5\36\1\26\5\36\1\31"+
            "\10\36\1\34\1\32\3\36\1\25\1\36\1\30\1\36\1\3\1\33\1\4\12\36"+
            "\1\24\1\36\1\27\32\36\1\uffff\1\2\2\5\1\uffff\1\5\1\uffff\1"+
            "\5",
            "",
            "\17\5\1\uffff\4\5\1\40\3\5\36\uffff\164\5\1\uffff\1\5",
            "\1\71\1\uffff\1\5\1\uffff\3\5\33\uffff\164\5\1\uffff\3\5\1"+
            "\uffff\1\5\1\uffff\1\5",
            "\17\5\1\uffff\4\5\1\150\1\5\1\uffff\1\5\36\uffff\164\5\1\uffff"+
            "\1\5",
            "",
            "",
            "",
            "",
            "",
            "\17\5\1\uffff\4\5\1\151\1\5\1\uffff\1\5\36\uffff\164\5\1\uffff"+
            "\1\5",
            "\17\5\1\uffff\4\5\1\u0098\1\5\1\uffff\1\5\36\uffff\164\5\1"+
            "\uffff\1\5",
            "\17\5\1\uffff\4\5\1\u0099\1\5\1\uffff\1\5\36\uffff\164\5\1"+
            "\uffff\1\5",
            "\1\u00b2\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "\1\u00b3\1\uffff\1\5",
            "\3\5\4\uffff\1\u00b5\1\uffff\1\5\1\uffff\3\5\33\uffff\164\5"+
            "\1\uffff\3\5\1\uffff\1\5\1\uffff\1\5",
            "\1\u00d5\1\uffff\1\5",
            "\3\5\4\uffff\1\u00d6\1\uffff\1\5\1\uffff\3\5\33\uffff\164\5"+
            "\1\uffff\3\5\1\uffff\1\5\1\uffff\1\5",
            "\3\5\4\uffff\1\u00eb\1\uffff\1\5\1\uffff\3\5\33\uffff\164\5"+
            "\1\uffff\3\5\1\uffff\1\5\1\uffff\1\5",
            "\3\5\4\uffff\1\u0100\1\uffff\1\5\1\uffff\3\5\33\uffff\164\5"+
            "\1\uffff\3\5\1\uffff\1\5\1\uffff\1\5",
            "\3\5\4\uffff\1\u0129\1\uffff\1\5\1\uffff\3\5\33\uffff\164\5"+
            "\1\uffff\3\5\1\uffff\1\5\1\uffff\1\5",
            "\1\u012a\1\uffff\1\5\37\uffff\164\5\1\uffff\1\5",
            "\1\5\1\u012e\1\5\1\uffff\1\5\36\uffff\164\5\1\uffff\1\5",
            "\1\5\1\u014f\1\5\1\uffff\1\5\36\uffff\164\5\1\uffff\1\5",
            "\1\u0152\153\uffff\1\5\1\uffff\1\5",
            "\3\5\4\uffff\1\u0153\1\uffff\1\5\1\uffff\3\5\33\uffff\164\5"+
            "\1\uffff\3\5\1\uffff\1\5\1\uffff\1\5",
            "\1\u0168",
            "",
            "\1\u0169\45\uffff\164\5\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0169\45\uffff\164\5\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0169\45\uffff\164\5\1\uffff\1\5",
            "\1\u0169\45\uffff\164\5\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0169\45\uffff\164\5\1\uffff\1\5",
            "\1\u0169\45\uffff\164\5\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0169\45\uffff\164\5\1\uffff\1\5",
            "\1\u0169\45\uffff\164\5\1\uffff\1\5",
            "",
            "\1\u0169\45\uffff\164\5\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0169\45\uffff\164\5\1\uffff\1\5",
            "\1\u0169\45\uffff\164\5\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0169\45\uffff\164\5\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0169\45\uffff\164\5\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0169\45\uffff\164\5\1\uffff\1\5",
            "\1\u0169\45\uffff\164\5\1\uffff\1\5",
            "",
            "",
            "",
            "\1\u0169\45\uffff\164\5\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0169\45\uffff\164\5\1\uffff\1\5",
            "",
            "",
            "\1\u0169\45\uffff\164\5\1\uffff\1\5",
            "\1\u0169\45\uffff\164\5\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0169\45\uffff\164\5\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "213:1: result_column : ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) );";
        }
    }
    static final String DFA72_eotS =
        "\u00ec\uffff";
    static final String DFA72_eofS =
        "\u00ec\uffff";
    static final String DFA72_minS =
        "\1\27\2\uffff\1\27\1\uffff\1\21\6\27\4\uffff\1\30\2\uffff\1\21\6"+
        "\30\37\uffff\1\30\1\uffff\1\21\6\30\u00aa\uffff";
    static final String DFA72_maxS =
        "\1\u00af\2\uffff\1\u00af\1\uffff\1\u00b5\5\u00ad\1\u00b1\4\uffff"+
        "\1\u00af\2\uffff\1\u00b5\1\110\3\u009c\1\110\1\u00b1\37\uffff\1"+
        "\u00af\1\uffff\1\u00b5\1\110\3\u009c\1\110\1\u00b1\u00aa\uffff";
    static final String DFA72_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\u00e7\uffff";
    static final String DFA72_specialS =
        "\u00ec\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\4\1\uffff\1\4\1\uffff\1\4\36\uffff\52\1\1\11\6\1\1\3\1\1"+
            "\1\6\13\1\1\10\7\1\1\13\11\1\1\12\30\1\1\7\10\1\1\5\1\uffff"+
            "\1\1",
            "",
            "",
            "\1\1\1\uffff\1\1\1\4\1\1\36\uffff\52\4\1\27\6\4\1\20\1\4\1"+
            "\24\13\4\1\26\7\4\1\31\11\4\1\30\30\4\1\25\10\4\1\23\1\uffff"+
            "\1\4",
            "",
            "\3\4\3\uffff\1\1\1\uffff\1\1\1\4\1\1\3\4\33\uffff\52\4\1\77"+
            "\6\4\1\71\1\4\1\74\13\4\1\76\7\4\1\101\11\4\1\100\30\4\1\75"+
            "\10\4\1\73\1\uffff\3\4\1\uffff\1\4\1\uffff\1\4",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "216:10: ( ( AS )? column_alias= id )?";
        }
    }
    static final String DFA71_eotS =
        "\u00ee\uffff";
    static final String DFA71_eofS =
        "\u00ee\uffff";
    static final String DFA71_minS =
        "\1\72\1\27\3\uffff\1\27\1\uffff\1\21\6\27\4\uffff\1\30\2\uffff\1"+
        "\21\6\30\37\uffff\1\30\1\uffff\1\21\6\30\u00aa\uffff";
    static final String DFA71_maxS =
        "\2\u00af\3\uffff\1\u00af\1\uffff\1\u00b5\5\u00ad\1\u00b1\4\uffff"+
        "\1\u00af\2\uffff\1\u00b5\1\110\3\u009c\1\110\1\u00b1\37\uffff\1"+
        "\u00af\1\uffff\1\u00b5\1\110\3\u009c\1\110\1\u00b1\u00aa\uffff";
    static final String DFA71_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\u00e9\uffff";
    static final String DFA71_specialS =
        "\u00ee\uffff}>";
    static final String[] DFA71_transitionS = {
            "\7\2\1\1\154\2\1\uffff\1\2",
            "\1\2\1\uffff\1\2\1\uffff\1\2\36\uffff\52\4\1\13\6\4\1\5\1\4"+
            "\1\10\13\4\1\12\7\4\1\15\11\4\1\14\30\4\1\11\10\4\1\7\1\uffff"+
            "\1\4",
            "",
            "",
            "",
            "\1\4\1\uffff\1\4\1\2\1\4\36\uffff\52\2\1\31\6\2\1\22\1\2\1"+
            "\26\13\2\1\30\7\2\1\33\11\2\1\32\30\2\1\27\10\2\1\25\1\uffff"+
            "\1\2",
            "",
            "\3\2\3\uffff\1\4\1\uffff\1\4\1\2\1\4\3\2\33\uffff\52\2\1\101"+
            "\6\2\1\73\1\2\1\76\13\2\1\100\7\2\1\103\11\2\1\102\30\2\1\77"+
            "\10\2\1\75\1\uffff\3\2\1\uffff\1\2\1\uffff\1\2",
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
            "\1\2\1\uffff\1\4\37\uffff\164\4\1\uffff\1\4",
            "",
            "",
            "\3\4\4\uffff\1\2\1\uffff\1\4\1\uffff\3\4\33\uffff\164\4\1\uffff"+
            "\3\4\1\uffff\1\4\1\uffff\1\4",
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
            "\1\2\1\uffff\1\4\37\uffff\164\4\1\uffff\1\4",
            "",
            "\3\4\4\uffff\1\2\1\uffff\1\4\1\uffff\3\4\33\uffff\164\4\1\uffff"+
            "\3\4\1\uffff\1\4\1\uffff\1\4",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "216:11: ( AS )?";
        }
    }
    static final String DFA75_eotS =
        "\21\uffff";
    static final String DFA75_eofS =
        "\21\uffff";
    static final String DFA75_minS =
        "\1\27\20\uffff";
    static final String DFA75_maxS =
        "\1\u00ad\20\uffff";
    static final String DFA75_acceptS =
        "\1\uffff\1\2\10\uffff\1\1\6\uffff";
    static final String DFA75_specialS =
        "\21\uffff}>";
    static final String[] DFA75_transitionS = {
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
            return "()* loopback of 218:28: ( join_op single_source ( join_constraint )? )*";
        }
    }
    static final String DFA74_eotS =
        "\23\uffff";
    static final String DFA74_eofS =
        "\23\uffff";
    static final String DFA74_minS =
        "\1\27\22\uffff";
    static final String DFA74_maxS =
        "\1\u00ad\22\uffff";
    static final String DFA74_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\17\uffff";
    static final String DFA74_specialS =
        "\23\uffff}>";
    static final String[] DFA74_transitionS = {
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
            return "218:52: ( join_constraint )?";
        }
    }
    static final String DFA82_eotS =
        "\51\uffff";
    static final String DFA82_eofS =
        "\51\uffff";
    static final String DFA82_minS =
        "\1\32\2\uffff\1\32\1\21\44\uffff";
    static final String DFA82_maxS =
        "\1\u00af\2\uffff\1\u00af\1\u00b5\44\uffff";
    static final String DFA82_acceptS =
        "\1\uffff\1\1\3\uffff\1\3\3\uffff\1\2\37\uffff";
    static final String DFA82_specialS =
        "\51\uffff}>";
    static final String[] DFA82_transitionS = {
            "\1\3\37\uffff\164\1\1\uffff\1\1",
            "",
            "",
            "\1\5\37\uffff\142\5\1\4\21\5\1\uffff\1\5",
            "\4\11\3\uffff\1\5\1\uffff\1\11\1\uffff\3\11\33\uffff\164\11"+
            "\1\uffff\3\11\1\uffff\1\11\1\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA82_eot = DFA.unpackEncodedString(DFA82_eotS);
    static final short[] DFA82_eof = DFA.unpackEncodedString(DFA82_eofS);
    static final char[] DFA82_min = DFA.unpackEncodedStringToUnsignedChars(DFA82_minS);
    static final char[] DFA82_max = DFA.unpackEncodedStringToUnsignedChars(DFA82_maxS);
    static final short[] DFA82_accept = DFA.unpackEncodedString(DFA82_acceptS);
    static final short[] DFA82_special = DFA.unpackEncodedString(DFA82_specialS);
    static final short[][] DFA82_transition;

    static {
        int numStates = DFA82_transitionS.length;
        DFA82_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA82_transition[i] = DFA.unpackEncodedString(DFA82_transitionS[i]);
        }
    }

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = DFA82_eot;
            this.eof = DFA82_eof;
            this.min = DFA82_min;
            this.max = DFA82_max;
            this.accept = DFA82_accept;
            this.special = DFA82_special;
            this.transition = DFA82_transition;
        }
        public String getDescription() {
            return "220:1: single_source : ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN );";
        }
    }
    static final String DFA76_eotS =
        "\32\uffff";
    static final String DFA76_eofS =
        "\32\uffff";
    static final String DFA76_minS =
        "\1\72\1\27\30\uffff";
    static final String DFA76_maxS =
        "\2\u00af\30\uffff";
    static final String DFA76_acceptS =
        "\2\uffff\1\1\1\2\26\uffff";
    static final String DFA76_specialS =
        "\32\uffff}>";
    static final String[] DFA76_transitionS = {
            "\164\2\1\uffff\1\1",
            "\1\3\1\2\1\3\1\uffff\1\3\45\uffff\1\3\21\uffff\1\3\20\uffff"+
            "\1\3\10\uffff\1\3\6\uffff\1\3\1\uffff\1\3\2\uffff\1\3\3\uffff"+
            "\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\2\3\4\uffff\1\3\1\uffff"+
            "\2\3\27\uffff\1\3\2\uffff\1\3\5\uffff\1\3\1\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "221:5: (database_name= id DOT )?";
        }
    }
    static final String DFA78_eotS =
        "\27\uffff";
    static final String DFA78_eofS =
        "\27\uffff";
    static final String DFA78_minS =
        "\1\27\26\uffff";
    static final String DFA78_maxS =
        "\1\u00af\26\uffff";
    static final String DFA78_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\23\uffff";
    static final String DFA78_specialS =
        "\27\uffff}>";
    static final String[] DFA78_transitionS = {
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
            return "221:43: ( ( AS )? table_alias= ID )?";
        }
    }
    static final String DFA79_eotS =
        "\25\uffff";
    static final String DFA79_eofS =
        "\25\uffff";
    static final String DFA79_minS =
        "\1\27\24\uffff";
    static final String DFA79_maxS =
        "\1\u00ad\24\uffff";
    static final String DFA79_acceptS =
        "\1\uffff\1\1\1\2\1\3\21\uffff";
    static final String DFA79_specialS =
        "\25\uffff}>";
    static final String[] DFA79_transitionS = {
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
            return "221:67: ( INDEXED BY index_name= id | NOT INDEXED )?";
        }
    }
    static final String DFA81_eotS =
        "\25\uffff";
    static final String DFA81_eofS =
        "\25\uffff";
    static final String DFA81_minS =
        "\1\27\24\uffff";
    static final String DFA81_maxS =
        "\1\u00af\24\uffff";
    static final String DFA81_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\21\uffff";
    static final String DFA81_specialS =
        "\25\uffff}>";
    static final String[] DFA81_transitionS = {
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
            return "223:31: ( ( AS )? table_alias= ID )?";
        }
    }
    static final String DFA92_eotS =
        "\15\uffff";
    static final String DFA92_eofS =
        "\15\uffff";
    static final String DFA92_minS =
        "\1\72\2\30\12\uffff";
    static final String DFA92_maxS =
        "\1\u00af\2\u00a9\12\uffff";
    static final String DFA92_acceptS =
        "\3\uffff\1\1\1\2\10\uffff";
    static final String DFA92_specialS =
        "\15\uffff}>";
    static final String[] DFA92_transitionS = {
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

    static final short[] DFA92_eot = DFA.unpackEncodedString(DFA92_eotS);
    static final short[] DFA92_eof = DFA.unpackEncodedString(DFA92_eofS);
    static final char[] DFA92_min = DFA.unpackEncodedStringToUnsignedChars(DFA92_minS);
    static final char[] DFA92_max = DFA.unpackEncodedStringToUnsignedChars(DFA92_maxS);
    static final short[] DFA92_accept = DFA.unpackEncodedString(DFA92_acceptS);
    static final short[] DFA92_special = DFA.unpackEncodedString(DFA92_specialS);
    static final short[][] DFA92_transition;

    static {
        int numStates = DFA92_transitionS.length;
        DFA92_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA92_transition[i] = DFA.unpackEncodedString(DFA92_transitionS[i]);
        }
    }

    class DFA92 extends DFA {

        public DFA92(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 92;
            this.eot = DFA92_eot;
            this.eof = DFA92_eof;
            this.min = DFA92_min;
            this.max = DFA92_max;
            this.accept = DFA92_accept;
            this.special = DFA92_special;
            this.transition = DFA92_transition;
        }
        public String getDescription() {
            return "236:67: (database_name= id DOT )?";
        }
    }
    static final String DFA117_eotS =
        "\72\uffff";
    static final String DFA117_eofS =
        "\72\uffff";
    static final String DFA117_minS =
        "\1\31\1\72\2\uffff\1\31\1\uffff\3\31\61\uffff";
    static final String DFA117_maxS =
        "\1\33\1\u00af\2\uffff\1\u00af\1\uffff\3\u00af\61\uffff";
    static final String DFA117_acceptS =
        "\2\uffff\1\2\1\1\66\uffff";
    static final String DFA117_specialS =
        "\72\uffff}>";
    static final String[] DFA117_transitionS = {
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
            return "()* loopback of 279:23: ( COMMA column_def )*";
        }
    }
    static final String DFA120_eotS =
        "\15\uffff";
    static final String DFA120_eofS =
        "\15\uffff";
    static final String DFA120_minS =
        "\1\27\14\uffff";
    static final String DFA120_maxS =
        "\1\u00af\14\uffff";
    static final String DFA120_acceptS =
        "\1\uffff\1\1\1\2\12\uffff";
    static final String DFA120_specialS =
        "\15\uffff}>";
    static final String[] DFA120_transitionS = {
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
            return "284:32: ( type_name )?";
        }
    }
    static final String DFA121_eotS =
        "\14\uffff";
    static final String DFA121_eofS =
        "\14\uffff";
    static final String DFA121_minS =
        "\1\27\13\uffff";
    static final String DFA121_maxS =
        "\1\u00a5\13\uffff";
    static final String DFA121_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\7\uffff";
    static final String DFA121_specialS =
        "\14\uffff}>";
    static final String[] DFA121_transitionS = {
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
            return "()* loopback of 284:43: ( column_constraint )*";
        }
    }
    static final String DFA124_eotS =
        "\17\uffff";
    static final String DFA124_eofS =
        "\17\uffff";
    static final String DFA124_minS =
        "\1\27\16\uffff";
    static final String DFA124_maxS =
        "\1\u00a5\16\uffff";
    static final String DFA124_acceptS =
        "\1\uffff\1\1\1\2\14\uffff";
    static final String DFA124_specialS =
        "\17\uffff}>";
    static final String[] DFA124_transitionS = {
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
            return "305:37: ( ASC | DESC )?";
        }
    }
    static final String DFA125_eotS =
        "\16\uffff";
    static final String DFA125_eofS =
        "\16\uffff";
    static final String DFA125_minS =
        "\1\27\15\uffff";
    static final String DFA125_maxS =
        "\1\u00a5\15\uffff";
    static final String DFA125_acceptS =
        "\1\uffff\1\1\1\2\13\uffff";
    static final String DFA125_specialS =
        "\16\uffff}>";
    static final String[] DFA125_transitionS = {
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
            return "305:51: ( table_conflict_clause )?";
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
            return "305:74: ( AUTOINCREMENT )?";
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
            return "307:38: ( table_conflict_clause )?";
        }
    }
    static final String DFA128_eotS =
        "\15\uffff";
    static final String DFA128_eofS =
        "\15\uffff";
    static final String DFA128_minS =
        "\1\27\14\uffff";
    static final String DFA128_maxS =
        "\1\u00a5\14\uffff";
    static final String DFA128_acceptS =
        "\1\uffff\1\1\1\2\12\uffff";
    static final String DFA128_specialS =
        "\15\uffff}>";
    static final String[] DFA128_transitionS = {
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
            return "309:35: ( table_conflict_clause )?";
        }
    }
    static final String DFA129_eotS =
        "\13\uffff";
    static final String DFA129_eofS =
        "\13\uffff";
    static final String DFA129_minS =
        "\1\32\12\uffff";
    static final String DFA129_maxS =
        "\1\u00b5\12\uffff";
    static final String DFA129_acceptS =
        "\1\uffff\1\1\1\2\7\uffff\1\3";
    static final String DFA129_specialS =
        "\13\uffff}>";
    static final String[] DFA129_transitionS = {
            "\1\12\71\uffff\3\2\57\uffff\1\2\51\uffff\2\2\1\uffff\1\2\1\1"+
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
            ""
    };

    static final short[] DFA129_eot = DFA.unpackEncodedString(DFA129_eotS);
    static final short[] DFA129_eof = DFA.unpackEncodedString(DFA129_eofS);
    static final char[] DFA129_min = DFA.unpackEncodedStringToUnsignedChars(DFA129_minS);
    static final char[] DFA129_max = DFA.unpackEncodedStringToUnsignedChars(DFA129_maxS);
    static final short[] DFA129_accept = DFA.unpackEncodedString(DFA129_acceptS);
    static final short[] DFA129_special = DFA.unpackEncodedString(DFA129_specialS);
    static final short[][] DFA129_transition;

    static {
        int numStates = DFA129_transitionS.length;
        DFA129_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA129_transition[i] = DFA.unpackEncodedString(DFA129_transitionS[i]);
        }
    }

    class DFA129 extends DFA {

        public DFA129(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 129;
            this.eot = DFA129_eot;
            this.eof = DFA129_eof;
            this.min = DFA129_min;
            this.max = DFA129_max;
            this.accept = DFA129_accept;
            this.special = DFA129_special;
            this.transition = DFA129_transition;
        }
        public String getDescription() {
            return "313:37: ( SIGNED_NUMBER | literal_value | LPAREN expr RPAREN )";
        }
    }
    static final String DFA139_eotS =
        "\17\uffff";
    static final String DFA139_eofS =
        "\17\uffff";
    static final String DFA139_minS =
        "\1\27\16\uffff";
    static final String DFA139_maxS =
        "\1\u00a5\16\uffff";
    static final String DFA139_acceptS =
        "\1\uffff\1\2\13\uffff\1\1\1\uffff";
    static final String DFA139_specialS =
        "\17\uffff}>";
    static final String[] DFA139_transitionS = {
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
            return "()+ loopback of 343:3: ( fk_clause_action )+";
        }
    }
    static final String DFA140_eotS =
        "\17\uffff";
    static final String DFA140_eofS =
        "\17\uffff";
    static final String DFA140_minS =
        "\1\27\1\131\15\uffff";
    static final String DFA140_maxS =
        "\1\u00a5\1\u0086\15\uffff";
    static final String DFA140_acceptS =
        "\2\uffff\1\1\1\2\13\uffff";
    static final String DFA140_specialS =
        "\17\uffff}>";
    static final String[] DFA140_transitionS = {
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
            return "343:21: ( fk_clause_deferrable )?";
        }
    }
    static final String DFA144_eotS =
        "\17\uffff";
    static final String DFA144_eofS =
        "\17\uffff";
    static final String DFA144_minS =
        "\1\27\1\132\15\uffff";
    static final String DFA144_maxS =
        "\1\u00a5\1\161\15\uffff";
    static final String DFA144_acceptS =
        "\2\uffff\1\3\12\uffff\1\1\1\2";
    static final String DFA144_specialS =
        "\17\uffff}>";
    static final String[] DFA144_transitionS = {
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

    static final short[] DFA144_eot = DFA.unpackEncodedString(DFA144_eotS);
    static final short[] DFA144_eof = DFA.unpackEncodedString(DFA144_eofS);
    static final char[] DFA144_min = DFA.unpackEncodedStringToUnsignedChars(DFA144_minS);
    static final char[] DFA144_max = DFA.unpackEncodedStringToUnsignedChars(DFA144_maxS);
    static final short[] DFA144_accept = DFA.unpackEncodedString(DFA144_acceptS);
    static final short[] DFA144_special = DFA.unpackEncodedString(DFA144_specialS);
    static final short[][] DFA144_transition;

    static {
        int numStates = DFA144_transitionS.length;
        DFA144_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA144_transition[i] = DFA.unpackEncodedString(DFA144_transitionS[i]);
        }
    }

    class DFA144 extends DFA {

        public DFA144(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 144;
            this.eot = DFA144_eot;
            this.eof = DFA144_eof;
            this.min = DFA144_min;
            this.max = DFA144_max;
            this.accept = DFA144_accept;
            this.special = DFA144_special;
            this.transition = DFA144_transition;
        }
        public String getDescription() {
            return "350:42: ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?";
        }
    }
    static final String DFA164_eotS =
        "\14\uffff";
    static final String DFA164_eofS =
        "\14\uffff";
    static final String DFA164_minS =
        "\1\72\1\30\12\uffff";
    static final String DFA164_maxS =
        "\1\u00af\1\u00a6\12\uffff";
    static final String DFA164_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\7\uffff";
    static final String DFA164_specialS =
        "\14\uffff}>";
    static final String[] DFA164_transitionS = {
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
            return "378:48: ( IF NOT EXISTS )?";
        }
    }
    static final String DFA165_eotS =
        "\21\uffff";
    static final String DFA165_eofS =
        "\21\uffff";
    static final String DFA165_minS =
        "\1\72\2\30\16\uffff";
    static final String DFA165_maxS =
        "\1\u00af\2\u00a6\16\uffff";
    static final String DFA165_acceptS =
        "\3\uffff\1\1\1\2\14\uffff";
    static final String DFA165_specialS =
        "\21\uffff}>";
    static final String[] DFA165_transitionS = {
            "\164\2\1\uffff\1\1",
            "\1\3\43\uffff\1\4\10\uffff\1\4\25\uffff\1\4\33\uffff\2\4\55"+
            "\uffff\1\4",
            "\1\3\43\uffff\1\4\10\uffff\1\4\25\uffff\1\4\33\uffff\2\4\55"+
            "\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA165_eot = DFA.unpackEncodedString(DFA165_eotS);
    static final short[] DFA165_eof = DFA.unpackEncodedString(DFA165_eofS);
    static final char[] DFA165_min = DFA.unpackEncodedStringToUnsignedChars(DFA165_minS);
    static final char[] DFA165_max = DFA.unpackEncodedStringToUnsignedChars(DFA165_maxS);
    static final short[] DFA165_accept = DFA.unpackEncodedString(DFA165_acceptS);
    static final short[] DFA165_special = DFA.unpackEncodedString(DFA165_specialS);
    static final short[][] DFA165_transition;

    static {
        int numStates = DFA165_transitionS.length;
        DFA165_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA165_transition[i] = DFA.unpackEncodedString(DFA165_transitionS[i]);
        }
    }

    class DFA165 extends DFA {

        public DFA165(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 165;
            this.eot = DFA165_eot;
            this.eof = DFA165_eof;
            this.min = DFA165_min;
            this.max = DFA165_max;
            this.accept = DFA165_accept;
            this.special = DFA165_special;
            this.transition = DFA165_transition;
        }
        public String getDescription() {
            return "378:65: (database_name= id DOT )?";
        }
    }
 

    public static final BitSet FOLLOW_sql_stmt_in_sql_stmt_list161 = new BitSet(new long[]{0xC000000000000002L,0x00800084A8048048L,0x000001401AB04000L});
    public static final BitSet FOLLOW_EXPLAIN_in_sql_stmt171 = new BitSet(new long[]{0xC000000000800000L,0x00800084A8048048L,0x000001401AB14000L});
    public static final BitSet FOLLOW_QUERY_in_sql_stmt174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_PLAN_in_sql_stmt176 = new BitSet(new long[]{0xC000000000800000L,0x00800084A8048048L,0x000001401AB04000L});
    public static final BitSet FOLLOW_sql_stmt_core_in_sql_stmt182 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMI_in_sql_stmt184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_stmt_in_sql_stmt_core195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attach_stmt_in_sql_stmt_core201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_detach_stmt_in_sql_stmt_core207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_analyze_stmt_in_sql_stmt_core213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reindex_stmt_in_sql_stmt_core219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vacuum_stmt_in_sql_stmt_core225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_sql_stmt_core234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_stmt_in_sql_stmt_core240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_stmt_in_sql_stmt_core246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_stmt_in_sql_stmt_core252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_stmt_in_sql_stmt_core258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commit_stmt_in_sql_stmt_core264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rollback_stmt_in_sql_stmt_core270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_savepoint_stmt_in_sql_stmt_core276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_release_stmt_in_sql_stmt_core282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_virtual_table_stmt_in_sql_stmt_core291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_table_stmt_in_sql_stmt_core297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_table_stmt_in_sql_stmt_core303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alter_table_stmt_in_sql_stmt_core309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_view_stmt_in_sql_stmt_core315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_view_stmt_in_sql_stmt_core321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_index_stmt_in_sql_stmt_core327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_index_stmt_in_sql_stmt_core333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_trigger_stmt_in_sql_stmt_core339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_trigger_stmt_in_sql_stmt_core345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_qualified_table_name358 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_qualified_table_name360 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_qualified_table_name366 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INDEXED_in_qualified_table_name369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_qualified_table_name371 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_qualified_table_name375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_qualified_table_name379 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_INDEXED_in_qualified_table_name381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_subexpr_in_expr390 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OR_in_expr393 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_or_subexpr_in_expr396 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_and_subexpr_in_or_subexpr405 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_AND_in_or_subexpr408 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_and_subexpr_in_or_subexpr411 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_LPAREN_in_in_source423 = new BitSet(new long[]{0xFC0000007C0E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_select_stmt_in_in_source426 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_expr_in_in_source430 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_in_source433 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_in_source435 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_in_source441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_in_source450 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_in_source452 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_in_source458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr471 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_set_in_and_subexpr474 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr491 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_NOT_in_and_subexpr499 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000000000080005L});
    public static final BitSet FOLLOW_LIKE_in_and_subexpr505 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_GLOB_in_and_subexpr509 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_REGEXP_in_and_subexpr513 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_MATCH_in_and_subexpr517 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr520 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_ESCAPE_in_and_subexpr523 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_and_subexpr555 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_IN_in_and_subexpr558 = new BitSet(new long[]{0xFC00000004000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_in_source_in_and_subexpr561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISNULL_in_and_subexpr568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTNULL_in_and_subexpr572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_and_subexpr576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_and_subexpr578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_and_subexpr587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_and_subexpr589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_and_subexpr591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_and_subexpr602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_BETWEEN_in_and_subexpr605 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_AND_in_and_subexpr611 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_neq_subexpr_in_eq_subexpr640 = new BitSet(new long[]{0x0000000000000F02L});
    public static final BitSet FOLLOW_set_in_eq_subexpr643 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_neq_subexpr_in_eq_subexpr660 = new BitSet(new long[]{0x0000000000000F02L});
    public static final BitSet FOLLOW_bit_subexpr_in_neq_subexpr669 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_set_in_neq_subexpr672 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_bit_subexpr_in_neq_subexpr689 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_add_subexpr_in_bit_subexpr698 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_set_in_bit_subexpr701 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_add_subexpr_in_bit_subexpr710 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_mul_subexpr_in_add_subexpr719 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_set_in_add_subexpr722 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_mul_subexpr_in_add_subexpr735 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_con_subexpr_in_mul_subexpr744 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_DOUBLE_PIPE_in_mul_subexpr747 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_con_subexpr_in_mul_subexpr750 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_set_in_con_subexpr759 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_unary_subexpr_in_con_subexpr776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_expr_in_unary_subexpr783 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_COLLATE_in_unary_subexpr786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_unary_subexpr791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_value_in_atom_expr803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bind_parameter_in_atom_expr809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_atom_expr819 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_atom_expr821 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_atom_expr827 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_atom_expr829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_atom_expr835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom_expr864 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr866 = new BitSet(new long[]{0xFC0000007C1E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_DISTINCT_in_atom_expr870 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr876 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_atom_expr879 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr883 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_ASTERISK_in_atom_expr889 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr899 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr902 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_atom_expr911 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr913 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_atom_expr917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_type_name_in_atom_expr919 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXISTS_in_atom_expr930 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_atom_expr936 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_atom_expr944 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_WHEN_in_atom_expr952 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_THEN_in_atom_expr956 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr958 = new BitSet(new long[]{0x0000000000000000L,0x0000000600000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_ELSE_in_atom_expr963 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr965 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_END_in_atom_expr969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raise_function_in_atom_expr975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_literal_value988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal_value1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal_value1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOB_in_literal_value1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal_value1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_TIME_in_literal_value1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_DATE_in_literal_value1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_TIMESTAMP_in_literal_value1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bind_parameter1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bind_parameter1109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_bind_parameter1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_bind_parameter1128 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_bind_parameter1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_bind_parameter1147 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_bind_parameter1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAISE_in_raise_function1171 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_raise_function1174 = new BitSet(new long[]{0x0400000000000000L,0x0001010000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_IGNORE_in_raise_function1178 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_set_in_raise_function1182 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COMMA_in_raise_function1194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_STRING_in_raise_function1199 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_raise_function1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_name1212 = new BitSet(new long[]{0x0000000004000002L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_LPAREN_in_type_name1216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_SIGNED_NUMBER_in_type_name1220 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_type_name1223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_SIGNED_NUMBER_in_type_name1227 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_type_name1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_in_pragma_stmt1263 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_pragma_stmt1268 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_pragma_stmt1270 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_pragma_stmt1276 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_EQUALS_in_pragma_stmt1279 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0011BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_pragma_value_in_pragma_stmt1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_pragma_stmt1285 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0011BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_pragma_value_in_pragma_stmt1287 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_pragma_stmt1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIGNED_NUMBER_in_pragma_value1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_pragma_value1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_pragma_value1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTACH_in_attach_stmt1316 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0001BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_DATABASE_in_attach_stmt1319 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0001BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_STRING_in_attach_stmt1326 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_attach_stmt1330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_attach_stmt1333 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_attach_stmt1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DETACH_in_detach_stmt1345 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_DATABASE_in_detach_stmt1348 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_detach_stmt1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANALYZE_in_analyze_stmt1362 = new BitSet(new long[]{0xFC00000000000002L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_analyze_stmt1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_analyze_stmt1373 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_analyze_stmt1375 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_analyze_stmt1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REINDEX_in_reindex_stmt1389 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_reindex_stmt1394 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_reindex_stmt1396 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_reindex_stmt1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VACUUM_in_vacuum_stmt1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_operation_conflict_clause1421 = new BitSet(new long[]{0x0400000000000000L,0x0001010000000000L,0x0000000002800000L});
    public static final BitSet FOLLOW_set_in_operation_conflict_clause1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_ordering_term1448 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000004L});
    public static final BitSet FOLLOW_ASC_in_ordering_term1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_ordering_term1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_operation_limited_clause1487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_operation_limited_clause1489 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_operation_limited_clause1491 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_operation_limited_clause1494 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_operation_limited_clause1496 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_operation_limited_clause1504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_operation_limited_clause1508 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_set_in_operation_limited_clause1511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_operation_limited_clause1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_list_in_select_stmt1531 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_ORDER_in_select_stmt1536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_select_stmt1538 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt1540 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt1543 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt1545 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_select_stmt1554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt1558 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_OFFSET_in_select_stmt1562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt1566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_core_in_select_list1616 = new BitSet(new long[]{0x0000000000000002L,0x0200001000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_select_op_in_select_list1619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_core_in_select_list1622 = new BitSet(new long[]{0x0000000000000002L,0x0200001000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_UNION_in_select_op1631 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ALL_in_select_op1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERSECT_in_select_op1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCEPT_in_select_op1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_core1654 = new BitSet(new long[]{0xFC000000741E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ALL_in_select_core1657 = new BitSet(new long[]{0xFC000000741E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_DISTINCT_in_select_core1661 = new BitSet(new long[]{0xFC000000741E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_result_column_in_select_core1665 = new BitSet(new long[]{0x0000000002000002L,0x0000280000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_core1668 = new BitSet(new long[]{0xFC000000741E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_result_column_in_select_core1670 = new BitSet(new long[]{0x0000000002000002L,0x0000280000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_FROM_in_select_core1675 = new BitSet(new long[]{0xFC00000004000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_join_source_in_select_core1677 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_WHERE_in_select_core1682 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_select_core1686 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_GROUP_in_select_core1694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_select_core1696 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_select_core1698 = new BitSet(new long[]{0x0000000002000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_core1701 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_select_core1703 = new BitSet(new long[]{0x0000000002000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_HAVING_in_select_core1708 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_select_core1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_result_column1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_result_column1790 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_result_column1792 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ASTERISK_in_result_column1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_result_column1809 = new BitSet(new long[]{0xFC00000000000002L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_AS_in_result_column1813 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_result_column1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_source_in_join_source1840 = new BitSet(new long[]{0x0000000002000002L,0xA040000000080000L,0x0000000000001008L});
    public static final BitSet FOLLOW_join_op_in_join_source1843 = new BitSet(new long[]{0xFC00000004000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_single_source_in_join_source1846 = new BitSet(new long[]{0x0000000002000002L,0xA040000000080000L,0x0000008000001208L});
    public static final BitSet FOLLOW_join_constraint_in_join_source1849 = new BitSet(new long[]{0x0000000002000002L,0xA040000000080000L,0x0000000000001008L});
    public static final BitSet FOLLOW_id_in_single_source1866 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_single_source1868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_single_source1874 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000002L,0x0000800000000010L});
    public static final BitSet FOLLOW_AS_in_single_source1878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_single_source1884 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INDEXED_in_single_source1889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_single_source1891 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_single_source1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_single_source1899 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_INDEXED_in_single_source1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_single_source1942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_single_source1944 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_single_source1946 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_AS_in_single_source1950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_single_source1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_single_source1978 = new BitSet(new long[]{0xFC00000004000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_join_source_in_single_source1981 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_single_source1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_join_op1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATURAL_in_join_op2001 = new BitSet(new long[]{0x0000000000000000L,0xA040000000080000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LEFT_in_join_op2007 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_OUTER_in_join_op2012 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_INNER_in_join_op2018 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_CROSS_in_join_op2022 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_JOIN_in_join_op2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_join_constraint2036 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_join_constraint2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_join_constraint2045 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_join_constraint2047 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_join_constraint2051 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_join_constraint2054 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_join_constraint2058 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_join_constraint2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_stmt2081 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_operation_conflict_clause_in_insert_stmt2084 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_REPLACE_in_insert_stmt2090 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_INTO_in_insert_stmt2093 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_insert_stmt2098 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_insert_stmt2100 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_insert_stmt2106 = new BitSet(new long[]{0x0000000004000000L,0x0000000001000000L,0x0000020010000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt2113 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_insert_stmt2117 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt2120 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_insert_stmt2124 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt2128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020010000000L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt2137 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt2139 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_insert_stmt2143 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt2146 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_insert_stmt2150 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_insert_stmt2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_insert_stmt2165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update_stmt2177 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_operation_conflict_clause_in_update_stmt2180 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_qualified_table_name_in_update_stmt2184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_SET_in_update_stmt2188 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_update_set_in_update_stmt2192 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000200000000802L});
    public static final BitSet FOLLOW_COMMA_in_update_stmt2195 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_update_set_in_update_stmt2199 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000200000000802L});
    public static final BitSet FOLLOW_WHERE_in_update_stmt2204 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_update_stmt2206 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_operation_limited_clause_in_update_stmt2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_update_set2222 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQUALS_in_update_set2224 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_update_set2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_stmt2234 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_FROM_in_delete_stmt2236 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_qualified_table_name_in_delete_stmt2238 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000802L});
    public static final BitSet FOLLOW_WHERE_in_delete_stmt2241 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_delete_stmt2243 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_operation_limited_clause_in_delete_stmt2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_begin_stmt2258 = new BitSet(new long[]{0x0000000000000002L,0x0002002004000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_set_in_begin_stmt2260 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_begin_stmt2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_commit_stmt2284 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_commit_stmt2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROLLBACK_in_rollback_stmt2303 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_rollback_stmt2306 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_TO_in_rollback_stmt2311 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_SAVEPOINT_in_rollback_stmt2314 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_rollback_stmt2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVEPOINT_in_savepoint_stmt2330 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_savepoint_stmt2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELEASE_in_release_stmt2342 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_SAVEPOINT_in_release_stmt2345 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_release_stmt2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_table_conflict_clause2363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_CONFLICT_in_table_conflict_clause2366 = new BitSet(new long[]{0x0400000000000000L,0x0001010000000000L,0x0000000002800000L});
    public static final BitSet FOLLOW_set_in_table_conflict_clause2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_virtual_table_stmt2396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_VIRTUAL_in_create_virtual_table_stmt2398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_create_virtual_table_stmt2400 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2405 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_virtual_table_stmt2407 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_USING_in_create_virtual_table_stmt2417 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2421 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_LPAREN_in_create_virtual_table_stmt2424 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_virtual_table_stmt2426 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_virtual_table_stmt2429 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_virtual_table_stmt2431 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_virtual_table_stmt2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_table_stmt2445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_table_stmt2447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_create_table_stmt2450 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_create_table_stmt2453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_table_stmt2455 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_table_stmt2457 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_table_stmt2464 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_table_stmt2466 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_table_stmt2472 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_create_table_stmt2478 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_table_stmt2480 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_table_stmt2483 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_table_stmt2485 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_table_stmt2490 = new BitSet(new long[]{0x0000000000000000L,0x0000040000021000L,0x0000002000008000L});
    public static final BitSet FOLLOW_table_constraint_in_create_table_stmt2492 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_table_stmt2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_create_table_stmt2502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_create_table_stmt2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_column_def_in_column_def2560 = new BitSet(new long[]{0x0000000000000002L,0x0000000001023000L,0x0000802000048010L});
    public static final BitSet FOLLOW_type_name_in_column_def2562 = new BitSet(new long[]{0x0000000000000002L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_column_constraint_in_column_def2565 = new BitSet(new long[]{0x0000000000000002L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_CONSTRAINT_in_column_constraint2591 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_column_constraint2595 = new BitSet(new long[]{0x0000000000000000L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_column_constraint_pk_in_column_constraint2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_not_null_in_column_constraint2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_unique_in_column_constraint2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_check_in_column_constraint2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_default_in_column_constraint2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_collate_in_column_constraint2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fk_clause_in_column_constraint2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_in_column_constraint_pk2694 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_KEY_in_column_constraint_pk2697 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000014L,0x0000000000000200L});
    public static final BitSet FOLLOW_set_in_column_constraint_pk2700 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_pk2709 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_AUTOINCREMENT_in_column_constraint_pk2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_column_constraint_not_null2722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_column_constraint_not_null2724 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_not_null2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_column_constraint_unique2743 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_unique2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECK_in_column_constraint_check2754 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_column_constraint_check2757 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_column_constraint_check2760 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_column_constraint_check2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_column_constraint_default2770 = new BitSet(new long[]{0x0000000004000000L,0x0000000000700000L,0x003B000000000040L});
    public static final BitSet FOLLOW_SIGNED_NUMBER_in_column_constraint_default2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_value_in_column_constraint_default2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_column_constraint_default2782 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_column_constraint_default2785 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_column_constraint_default2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLATE_in_column_constraint_collate2796 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_column_constraint_collate2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRAINT_in_table_constraint2810 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint2814 = new BitSet(new long[]{0x0000000000000000L,0x0000040000021000L,0x0000002000008000L});
    public static final BitSet FOLLOW_table_constraint_pk_in_table_constraint2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_unique_in_table_constraint2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_check_in_table_constraint2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_fk_in_table_constraint2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_in_table_constraint_pk2880 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_KEY_in_table_constraint_pk2882 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_pk2886 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_pk2890 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_pk2893 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_pk2897 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_pk2901 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_table_constraint_pk2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_table_constraint_unique2928 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_unique2932 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_unique2936 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_unique2939 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_unique2943 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_unique2947 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_table_constraint_unique2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECK_in_table_constraint_check2974 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_check2977 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_table_constraint_check2980 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_check2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREIGN_in_table_constraint_fk2990 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_KEY_in_table_constraint_fk2992 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_fk2994 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_fk2998 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_fk3001 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_fk3005 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_fk3009 = new BitSet(new long[]{0x0000000000000000L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_fk_clause_in_table_constraint_fk3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCES_in_fk_clause3034 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_fk_clause3038 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000204L});
    public static final BitSet FOLLOW_LPAREN_in_fk_clause3041 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_fk_clause3045 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_fk_clause3048 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_fk_clause3052 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_fk_clause3056 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000204L});
    public static final BitSet FOLLOW_fk_clause_action_in_fk_clause3062 = new BitSet(new long[]{0x0000000004000002L,0x0000000002000000L,0x0000000000000214L});
    public static final BitSet FOLLOW_fk_clause_deferrable_in_fk_clause3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_fk_clause_action3099 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_set_in_fk_clause_action3102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L,0x0000000021000000L});
    public static final BitSet FOLLOW_SET_in_fk_clause_action3115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_fk_clause_action3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_fk_clause_action3122 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_DEFAULT_in_fk_clause_action3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASCADE_in_fk_clause_action3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESTRICT_in_fk_clause_action3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCH_in_fk_clause_action3140 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_fk_clause_action3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_fk_clause_deferrable3151 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_DEFERRABLE_in_fk_clause_deferrable3155 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_INITIALLY_in_fk_clause_deferrable3159 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_DEFERRED_in_fk_clause_deferrable3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITIALLY_in_fk_clause_deferrable3166 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IMMEDIATE_in_fk_clause_deferrable3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_table_stmt3179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_drop_table_stmt3181 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_drop_table_stmt3184 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_table_stmt3186 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_table_stmt3193 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_table_stmt3195 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_table_stmt3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALTER_in_alter_table_stmt3231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_alter_table_stmt3233 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3238 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_alter_table_stmt3240 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3246 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RENAME_in_alter_table_stmt3249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_TO_in_alter_table_stmt3251 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_alter_table_stmt3259 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_COLUMN_in_alter_table_stmt3262 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_alter_table_stmt3266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_view_stmt3275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040080000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_view_stmt3277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_VIEW_in_create_view_stmt3280 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_create_view_stmt3283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_view_stmt3285 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_view_stmt3287 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_view_stmt3294 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_view_stmt3296 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_view_stmt3302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_create_view_stmt3304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_create_view_stmt3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_view_stmt3314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_VIEW_in_drop_view_stmt3316 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_drop_view_stmt3319 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_view_stmt3321 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_view_stmt3328 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_view_stmt3330 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_view_stmt3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_index_stmt3344 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_UNIQUE_in_create_index_stmt3347 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_INDEX_in_create_index_stmt3351 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_create_index_stmt3354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_index_stmt3356 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_index_stmt3358 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3365 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_index_stmt3367 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ON_in_create_index_stmt3377 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3381 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_create_index_stmt3383 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_indexed_column_in_create_index_stmt3387 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_index_stmt3390 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_indexed_column_in_create_index_stmt3394 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_index_stmt3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_indexed_column3444 = new BitSet(new long[]{0x0000000000000002L,0x0000000010002004L});
    public static final BitSet FOLLOW_COLLATE_in_indexed_column3447 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_indexed_column3451 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000004L});
    public static final BitSet FOLLOW_ASC_in_indexed_column3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_indexed_column3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_index_stmt3491 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_INDEX_in_drop_index_stmt3493 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_drop_index_stmt3496 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_index_stmt3498 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_index_stmt3505 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_index_stmt3507 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_index_stmt3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_trigger_stmt3543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000880000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_trigger_stmt3545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_TRIGGER_in_create_trigger_stmt3548 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_create_trigger_stmt3551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_trigger_stmt3553 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_trigger_stmt3555 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3562 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_trigger_stmt3564 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3570 = new BitSet(new long[]{0x1000000000000000L,0x0180000008000020L,0x0000004000000000L});
    public static final BitSet FOLLOW_BEFORE_in_create_trigger_stmt3575 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_AFTER_in_create_trigger_stmt3579 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_INSTEAD_in_create_trigger_stmt3583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_OF_in_create_trigger_stmt3585 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_DELETE_in_create_trigger_stmt3590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INSERT_in_create_trigger_stmt3594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_UPDATE_in_create_trigger_stmt3598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_OF_in_create_trigger_stmt3601 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3605 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_create_trigger_stmt3608 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3612 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ON_in_create_trigger_stmt3621 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3625 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000040L,0x0000100000000000L});
    public static final BitSet FOLLOW_FOR_in_create_trigger_stmt3628 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_EACH_in_create_trigger_stmt3630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ROW_in_create_trigger_stmt3632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000100000000000L});
    public static final BitSet FOLLOW_WHEN_in_create_trigger_stmt3637 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x002BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_create_trigger_stmt3639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_BEGIN_in_create_trigger_stmt3645 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004010800000L});
    public static final BitSet FOLLOW_update_stmt_in_create_trigger_stmt3649 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_insert_stmt_in_create_trigger_stmt3653 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_delete_stmt_in_create_trigger_stmt3657 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_select_stmt_in_create_trigger_stmt3661 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMI_in_create_trigger_stmt3664 = new BitSet(new long[]{0x0000000000000000L,0x0080000408000000L,0x0000004010800000L});
    public static final BitSet FOLLOW_END_in_create_trigger_stmt3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_trigger_stmt3676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_TRIGGER_in_drop_trigger_stmt3678 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_drop_trigger_stmt3681 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_trigger_stmt3683 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_trigger_stmt3690 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_trigger_stmt3692 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_trigger_stmt3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_id3712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_column_def4426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_column_def_in_id_column_def4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword_column_def4437 = new BitSet(new long[]{0x0000000000000002L});

}